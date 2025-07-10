// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking.responses

import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.handlers.errorHandler
import com.llama.llamastack.core.handlers.jsonHandler
import com.llama.llamastack.core.handlers.withErrorHandler
import com.llama.llamastack.core.http.HttpMethod
import com.llama.llamastack.core.http.HttpRequest
import com.llama.llamastack.core.http.HttpResponse.Handler
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.core.http.parseable
import com.llama.llamastack.core.prepare
import com.llama.llamastack.models.ResponseInputItemListParams
import com.llama.llamastack.models.ResponseInputItemListResponse

class InputItemServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InputItemService {

    private val withRawResponse: InputItemService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InputItemService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InputItemService =
        InputItemServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun list(
        params: ResponseInputItemListParams,
        requestOptions: RequestOptions,
    ): ResponseInputItemListResponse =
        // get /v1/openai/v1/responses/{response_id}/input_items
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InputItemService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): InputItemService.WithRawResponse =
            InputItemServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val listHandler: Handler<ResponseInputItemListResponse> =
            jsonHandler<ResponseInputItemListResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: ResponseInputItemListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ResponseInputItemListResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("responseId", params.responseId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "openai",
                        "v1",
                        "responses",
                        params._pathParam(0),
                        "input_items",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
