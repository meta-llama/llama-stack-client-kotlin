// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.llama_stack_client.api.services.blocking

import com.llama_stack_client.api.services.blocking.evaluate.JobService
import com.llama_stack_client.api.services.blocking.evaluate.QuestionAnsweringService
import com.llama_stack_client.api.services.blocking.evaluate.SummarizationService
import com.llama_stack_client.api.services.blocking.evaluate.TextGenerationService

interface EvaluateService {

    fun jobs(): JobService

    fun questionAnswering(): QuestionAnsweringService

    fun summarization(): SummarizationService

    fun textGeneration(): TextGenerationService
}
