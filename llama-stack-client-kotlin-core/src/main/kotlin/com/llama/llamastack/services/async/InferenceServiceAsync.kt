// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.ChatCompletionResponse
import com.llama.llamastack.models.CompletionResponse
import com.llama.llamastack.models.EmbeddingsResponse
import com.llama.llamastack.models.InferenceChatCompletionParams
import com.llama.llamastack.models.InferenceCompletionParams
import com.llama.llamastack.models.InferenceEmbeddingsParams

interface InferenceServiceAsync {

    /** Generate a chat completion for the given messages using the specified model. */
    suspend fun chatCompletion(
        params: InferenceChatCompletionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatCompletionResponse

    /** Generate a completion for the given content using the specified model. */
    suspend fun completion(
        params: InferenceCompletionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletionResponse

    /** Generate embeddings for content pieces using the specified model. */
    suspend fun embeddings(
        params: InferenceEmbeddingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmbeddingsResponse
}
