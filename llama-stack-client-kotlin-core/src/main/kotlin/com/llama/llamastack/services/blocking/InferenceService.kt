// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.core.http.StreamResponse
import com.llama.llamastack.models.ChatCompletionResponse
import com.llama.llamastack.models.ChatCompletionResponseStreamChunk
import com.llama.llamastack.models.CompletionResponse
import com.llama.llamastack.models.EmbeddingsResponse
import com.llama.llamastack.models.InferenceChatCompletionParams
import com.llama.llamastack.models.InferenceCompletionParams
import com.llama.llamastack.models.InferenceEmbeddingsParams

interface InferenceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Generate a chat completion for the given messages using the specified model. */
    fun chatCompletion(
        params: InferenceChatCompletionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatCompletionResponse

    /** Generate a chat completion for the given messages using the specified model. */
    @MustBeClosed
    fun chatCompletionStreaming(
        params: InferenceChatCompletionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StreamResponse<ChatCompletionResponseStreamChunk>

    /** Generate a completion for the given content using the specified model. */
    fun completion(
        params: InferenceCompletionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletionResponse

    /** Generate a completion for the given content using the specified model. */
    @MustBeClosed
    fun completionStreaming(
        params: InferenceCompletionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StreamResponse<CompletionResponse>

    /** Generate embeddings for content pieces using the specified model. */
    fun embeddings(
        params: InferenceEmbeddingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmbeddingsResponse

    /** A view of [InferenceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/inference/chat-completion`, but is otherwise
         * the same as [InferenceService.chatCompletion].
         */
        @MustBeClosed
        fun chatCompletion(
            params: InferenceChatCompletionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatCompletionResponse>

        /**
         * Returns a raw HTTP response for `post /v1/inference/chat-completion`, but is otherwise
         * the same as [InferenceService.chatCompletionStreaming].
         */
        @MustBeClosed
        fun chatCompletionStreaming(
            params: InferenceChatCompletionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StreamResponse<ChatCompletionResponseStreamChunk>>

        /**
         * Returns a raw HTTP response for `post /v1/inference/completion`, but is otherwise the
         * same as [InferenceService.completion].
         */
        @MustBeClosed
        fun completion(
            params: InferenceCompletionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CompletionResponse>

        /**
         * Returns a raw HTTP response for `post /v1/inference/completion`, but is otherwise the
         * same as [InferenceService.completionStreaming].
         */
        @MustBeClosed
        fun completionStreaming(
            params: InferenceCompletionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StreamResponse<CompletionResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/inference/embeddings`, but is otherwise the
         * same as [InferenceService.embeddings].
         */
        @MustBeClosed
        fun embeddings(
            params: InferenceEmbeddingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmbeddingsResponse>
    }
}
