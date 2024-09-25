// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.llama_stack_client.api.services.async

import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.models.EvaluationJob
import com.llama_stack_client.api.models.EvaluationSummarizationParams
import com.llama_stack_client.api.models.EvaluationTextGenerationParams

interface EvaluationServiceAsync {

    suspend fun summarization(
        params: EvaluationSummarizationParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): EvaluationJob

    suspend fun textGeneration(
        params: EvaluationTextGenerationParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): EvaluationJob
}
