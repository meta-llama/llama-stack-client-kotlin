// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.EmbeddingsResponse
import com.llama.llamastack.models.InferenceChatCompletionParams
import com.llama.llamastack.models.InferenceChatCompletionResponse
import com.llama.llamastack.models.InferenceCompletionParams
import com.llama.llamastack.models.InferenceCompletionResponse
import com.llama.llamastack.models.InferenceEmbeddingsParams

interface InferenceServiceAsync {

    suspend fun chatCompletion(
        params: InferenceChatCompletionParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InferenceChatCompletionResponse

    suspend fun completion(
        params: InferenceCompletionParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InferenceCompletionResponse

    suspend fun embeddings(
        params: InferenceEmbeddingsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): EmbeddingsResponse
}
