// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.llama_stack_client.api.services.blocking.evaluate

import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.models.EvaluateQuestionAnsweringCreateParams
import com.llama_stack_client.api.models.EvaluationJob

interface QuestionAnsweringService {

    fun create(
        params: EvaluateQuestionAnsweringCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): EvaluationJob
}
