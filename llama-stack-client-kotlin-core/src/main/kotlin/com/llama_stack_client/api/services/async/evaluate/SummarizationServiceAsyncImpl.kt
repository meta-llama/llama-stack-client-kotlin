// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.services.async.evaluate

import com.llama_stack_client.api.core.ClientOptions
import com.llama_stack_client.api.core.http.HttpResponse.Handler
import com.llama_stack_client.api.errors.LlamaStackClientError
import com.llama_stack_client.api.services.errorHandler

class SummarizationServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : SummarizationServiceAsync {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)
}
