// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.CompletionCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CompletionServiceTest {

    @Test
    fun create() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val completionService = client.completions()

        val completion =
            completionService.create(
                CompletionCreateParams.builder()
                    .model("model")
                    .prompt("string")
                    .bestOf(0L)
                    .echo(true)
                    .frequencyPenalty(0.0)
                    .addGuidedChoice("string")
                    .logitBias(
                        CompletionCreateParams.LogitBias.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .logprobs(true)
                    .maxTokens(0L)
                    .n(0L)
                    .presencePenalty(0.0)
                    .promptLogprobs(0L)
                    .seed(0L)
                    .stop("string")
                    .streamOptions(
                        CompletionCreateParams.StreamOptions.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .suffix("suffix")
                    .temperature(0.0)
                    .topP(0.0)
                    .user("user")
                    .build()
            )

        completion.validate()
    }

    @Test
    fun createStreaming() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val completionService = client.completions()

        val completionStreamResponse =
            completionService.createStreaming(
                CompletionCreateParams.builder()
                    .model("model")
                    .prompt("string")
                    .bestOf(0L)
                    .echo(true)
                    .frequencyPenalty(0.0)
                    .addGuidedChoice("string")
                    .logitBias(
                        CompletionCreateParams.LogitBias.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .logprobs(true)
                    .maxTokens(0L)
                    .n(0L)
                    .presencePenalty(0.0)
                    .promptLogprobs(0L)
                    .seed(0L)
                    .stop("string")
                    .streamOptions(
                        CompletionCreateParams.StreamOptions.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .suffix("suffix")
                    .temperature(0.0)
                    .topP(0.0)
                    .user("user")
                    .build()
            )

        completionStreamResponse.use {
            completionStreamResponse.asSequence().forEach { completion -> completion.validate() }
        }
    }
}
