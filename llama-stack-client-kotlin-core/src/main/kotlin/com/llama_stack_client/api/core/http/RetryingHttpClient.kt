@file:JvmSynthetic

package com.llama_stack_client.api.core.http

import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.errors.LlamaStackClientIoException
import java.io.IOException
import java.time.Clock
import java.time.Duration
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException
import java.time.temporal.ChronoUnit
import java.util.UUID
import java.util.concurrent.ThreadLocalRandom
import java.util.concurrent.TimeUnit
import kotlin.math.min
import kotlin.math.pow
import kotlin.time.toKotlinDuration
import kotlinx.coroutines.delay

class RetryingHttpClient
private constructor(
    private val httpClient: HttpClient,
    private val clock: Clock,
    private val maxRetries: Int,
    private val idempotencyHeader: String?,
) : HttpClient {

    override fun execute(
        request: HttpRequest,
        requestOptions: RequestOptions,
    ): HttpResponse {
        if (!isRetryable(request) || maxRetries <= 0) {
            return httpClient.execute(request, requestOptions)
        }

        maybeAddIdempotencyHeader(request)

        var retries = 0

        while (true) {
            val response =
                try {
                    val response = httpClient.execute(request, requestOptions)
                    if (++retries > maxRetries || !shouldRetry(response)) {
                        return response
                    }

                    response
                } catch (t: Throwable) {
                    if (++retries > maxRetries || !shouldRetry(t)) {
                        throw t
                    }

                    null
                }

            val backoffMillis = getRetryBackoffMillis(retries, response)
            Thread.sleep(backoffMillis.toMillis())
        }
    }

    override suspend fun executeAsync(
        request: HttpRequest,
        requestOptions: RequestOptions,
    ): HttpResponse {
        if (!isRetryable(request) || maxRetries <= 0) {
            return httpClient.executeAsync(request, requestOptions)
        }

        maybeAddIdempotencyHeader(request)

        var retries = 0

        while (true) {
            val response =
                try {
                    val response = httpClient.execute(request, requestOptions)
                    if (++retries > maxRetries || !shouldRetry(response)) {
                        return response
                    }

                    response
                } catch (t: Throwable) {
                    if (++retries > maxRetries || !shouldRetry(t)) {
                        throw t
                    }

                    null
                }

            val backoffMillis = getRetryBackoffMillis(retries, response)
            delay(backoffMillis.toKotlinDuration())
        }
    }

    override fun close() {
        httpClient.close()
    }

    private fun isRetryable(request: HttpRequest): Boolean {
        // Some requests, such as when a request body is being streamed, cannot be retried because
        // the body data aren't available on subsequent attempts.
        return request.body?.repeatable() ?: true
    }

    private fun idempotencyKey(): String = "stainless-java-retry-${UUID.randomUUID()}"

    private fun maybeAddIdempotencyHeader(request: HttpRequest) {
        if (idempotencyHeader != null && !request.headers.containsKey(idempotencyHeader)) {
            // Set a header to uniquely identify the request when retried
            request.headers.put(idempotencyHeader, idempotencyKey())
        }
    }

    private fun shouldRetry(response: HttpResponse): Boolean {
        // Note: this is not a standard header
        val shouldRetryHeader = response.headers().get("x-should-retry").getOrNull(0)
        val statusCode = response.statusCode()

        return when {
            // If the server explicitly says whether to retry, obey
            shouldRetryHeader == "true" -> true
            shouldRetryHeader == "false" -> false

            // Retry on request timeouts
            statusCode == 408 -> true
            // Retry on lock timeouts
            statusCode == 409 -> true
            // Retry on rate limits
            statusCode == 429 -> true
            // Retry internal errors
            statusCode >= 500 -> true
            else -> false
        }
    }

    private fun shouldRetry(throwable: Throwable): Boolean {
        // Only retry IOException and LlamaStackClientIoException, other exceptions are not intended
        // to be
        // retried.
        return throwable is IOException || throwable is LlamaStackClientIoException
    }

    private fun getRetryBackoffMillis(retries: Int, response: HttpResponse?): Duration {
        // About the Retry-After header:
        // https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Retry-After
        response
            ?.headers()
            ?.let { headers ->
                headers
                    .get("Retry-After-Ms")
                    .getOrNull(0)
                    ?.toFloatOrNull()
                    ?.times(TimeUnit.MILLISECONDS.toNanos(1))
                    ?: headers.get("Retry-After").getOrNull(0)?.let { retryAfter ->
                        retryAfter.toFloatOrNull()?.times(TimeUnit.SECONDS.toNanos(1))
                            ?: try {
                                ChronoUnit.MILLIS.between(
                                    OffsetDateTime.now(clock),
                                    OffsetDateTime.parse(
                                        retryAfter,
                                        DateTimeFormatter.RFC_1123_DATE_TIME
                                    )
                                )
                            } catch (e: DateTimeParseException) {
                                null
                            }
                    }
            }
            ?.let { retryAfterNanos ->
                // If the API asks us to wait a certain amount of time (and it's a reasonable
                // amount), just
                // do what it says.
                val retryAfter = Duration.ofNanos(retryAfterNanos.toLong())
                if (retryAfter in Duration.ofNanos(0)..Duration.ofMinutes(1)) {
                    return retryAfter
                }
            }

        // Apply exponential backoff, but not more than the max.
        val backoffSeconds = min(0.5 * 2.0.pow(retries - 1), 8.0)

        // Apply some jitter
        val jitter = 1.0 - 0.25 * ThreadLocalRandom.current().nextDouble()

        return Duration.ofNanos((TimeUnit.SECONDS.toNanos(1) * backoffSeconds * jitter).toLong())
    }

    companion object {
        fun builder() = Builder()
    }

    class Builder {

        private var httpClient: HttpClient? = null
        private var clock: Clock = Clock.systemUTC()
        private var maxRetries: Int = 2
        private var idempotencyHeader: String? = null

        fun httpClient(httpClient: HttpClient) = apply { this.httpClient = httpClient }

        fun clock(clock: Clock) = apply { this.clock = clock }

        fun maxRetries(maxRetries: Int) = apply { this.maxRetries = maxRetries }

        fun idempotencyHeader(header: String) = apply { this.idempotencyHeader = header }

        fun build(): HttpClient =
            RetryingHttpClient(
                checkNotNull(httpClient) { "`httpClient` is required but was not set" },
                clock,
                maxRetries,
                idempotencyHeader,
            )
    }
}
