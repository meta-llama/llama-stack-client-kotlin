// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.llama_stack_client.api.services.blocking

import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.models.BatchChatCompletion
import com.llama_stack_client.api.models.BatchCompletion
import com.llama_stack_client.api.models.BatchInferenceChatCompletionParams
import com.llama_stack_client.api.models.BatchInferenceCompletionParams

interface BatchInferenceService {

    fun chatCompletion(
        params: BatchInferenceChatCompletionParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): BatchChatCompletion

    fun completion(
        params: BatchInferenceCompletionParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): BatchCompletion
}
