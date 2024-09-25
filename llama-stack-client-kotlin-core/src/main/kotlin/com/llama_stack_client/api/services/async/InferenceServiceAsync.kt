// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.llama_stack_client.api.services.async

import com.llama_stack_client.api.core.RequestOptions
import com.llama_stack_client.api.models.InferenceChatCompletionParams
import com.llama_stack_client.api.models.InferenceChatCompletionResponse
import com.llama_stack_client.api.models.InferenceCompletionParams
import com.llama_stack_client.api.models.InferenceCompletionResponse
import com.llama_stack_client.api.services.async.inference.EmbeddingServiceAsync

interface InferenceServiceAsync {

    fun embeddings(): EmbeddingServiceAsync

    suspend fun chatCompletion(
        params: InferenceChatCompletionParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InferenceChatCompletionResponse

    suspend fun completion(
        params: InferenceCompletionParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InferenceCompletionResponse
}
