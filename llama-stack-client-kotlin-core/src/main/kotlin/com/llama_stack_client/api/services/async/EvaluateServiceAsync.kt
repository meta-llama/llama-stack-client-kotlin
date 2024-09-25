// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.llama_stack_client.api.services.async

import com.llama_stack_client.api.services.async.evaluate.JobServiceAsync
import com.llama_stack_client.api.services.async.evaluate.QuestionAnsweringServiceAsync
import com.llama_stack_client.api.services.async.evaluate.SummarizationServiceAsync
import com.llama_stack_client.api.services.async.evaluate.TextGenerationServiceAsync

interface EvaluateServiceAsync {

    fun jobs(): JobServiceAsync

    fun questionAnswering(): QuestionAnsweringServiceAsync

    fun summarization(): SummarizationServiceAsync

    fun textGeneration(): TextGenerationServiceAsync
}
