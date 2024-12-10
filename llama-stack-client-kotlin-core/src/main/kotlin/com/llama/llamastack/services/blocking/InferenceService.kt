// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.StreamResponse
import com.llama.llamastack.models.EmbeddingsResponse
import com.llama.llamastack.models.InferenceChatCompletionParams
import com.llama.llamastack.models.InferenceChatCompletionResponse
import com.llama.llamastack.models.InferenceCompletionParams
import com.llama.llamastack.models.InferenceCompletionResponse
import com.llama.llamastack.models.InferenceEmbeddingsParams

interface InferenceService {

    fun chatCompletion(
        params: InferenceChatCompletionParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InferenceChatCompletionResponse

    @MustBeClosed
    fun chatCompletionStreaming(
        params: InferenceChatCompletionParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): StreamResponse<InferenceChatCompletionResponse>

    fun completion(
        params: InferenceCompletionParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InferenceCompletionResponse

    @MustBeClosed
    fun completionStreaming(
        params: InferenceCompletionParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): StreamResponse<InferenceCompletionResponse>

    fun embeddings(
        params: InferenceEmbeddingsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): EmbeddingsResponse
}
