// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.services.blocking

import com.llama_stack_client.api.core.ClientOptions
import com.llama_stack_client.api.core.http.HttpResponse.Handler
import com.llama_stack_client.api.errors.LlamaStackClientError
import com.llama_stack_client.api.services.blocking.evaluate.JobService
import com.llama_stack_client.api.services.blocking.evaluate.JobServiceImpl
import com.llama_stack_client.api.services.blocking.evaluate.QuestionAnsweringService
import com.llama_stack_client.api.services.blocking.evaluate.QuestionAnsweringServiceImpl
import com.llama_stack_client.api.services.blocking.evaluate.SummarizationService
import com.llama_stack_client.api.services.blocking.evaluate.SummarizationServiceImpl
import com.llama_stack_client.api.services.blocking.evaluate.TextGenerationService
import com.llama_stack_client.api.services.blocking.evaluate.TextGenerationServiceImpl
import com.llama_stack_client.api.services.errorHandler

class EvaluateServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : EvaluateService {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val jobs: JobService by lazy { JobServiceImpl(clientOptions) }

    private val questionAnswering: QuestionAnsweringService by lazy {
        QuestionAnsweringServiceImpl(clientOptions)
    }

    private val summarization: SummarizationService by lazy {
        SummarizationServiceImpl(clientOptions)
    }

    private val textGeneration: TextGenerationService by lazy {
        TextGenerationServiceImpl(clientOptions)
    }

    override fun jobs(): JobService = jobs

    override fun questionAnswering(): QuestionAnsweringService = questionAnswering

    override fun summarization(): SummarizationService = summarization

    override fun textGeneration(): TextGenerationService = textGeneration
}
