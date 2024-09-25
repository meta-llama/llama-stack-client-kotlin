// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.services.async

import com.llama_stack_client.api.core.ClientOptions
import com.llama_stack_client.api.core.http.HttpResponse.Handler
import com.llama_stack_client.api.errors.LlamaStackClientError
import com.llama_stack_client.api.services.async.evaluate.JobServiceAsync
import com.llama_stack_client.api.services.async.evaluate.JobServiceAsyncImpl
import com.llama_stack_client.api.services.async.evaluate.QuestionAnsweringServiceAsync
import com.llama_stack_client.api.services.async.evaluate.QuestionAnsweringServiceAsyncImpl
import com.llama_stack_client.api.services.async.evaluate.SummarizationServiceAsync
import com.llama_stack_client.api.services.async.evaluate.SummarizationServiceAsyncImpl
import com.llama_stack_client.api.services.async.evaluate.TextGenerationServiceAsync
import com.llama_stack_client.api.services.async.evaluate.TextGenerationServiceAsyncImpl
import com.llama_stack_client.api.services.errorHandler

class EvaluateServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : EvaluateServiceAsync {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val jobs: JobServiceAsync by lazy { JobServiceAsyncImpl(clientOptions) }

    private val questionAnswering: QuestionAnsweringServiceAsync by lazy {
        QuestionAnsweringServiceAsyncImpl(clientOptions)
    }

    private val summarization: SummarizationServiceAsync by lazy {
        SummarizationServiceAsyncImpl(clientOptions)
    }

    private val textGeneration: TextGenerationServiceAsync by lazy {
        TextGenerationServiceAsyncImpl(clientOptions)
    }

    override fun jobs(): JobServiceAsync = jobs

    override fun questionAnswering(): QuestionAnsweringServiceAsync = questionAnswering

    override fun summarization(): SummarizationServiceAsync = summarization

    override fun textGeneration(): TextGenerationServiceAsync = textGeneration
}
