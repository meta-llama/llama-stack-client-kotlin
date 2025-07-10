// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.BatchCompletion
import com.llama.llamastack.models.ChatCompletionResponse
import com.llama.llamastack.models.CompletionResponse
import com.llama.llamastack.models.EmbeddingsResponse
import com.llama.llamastack.models.InferenceBatchChatCompletionParams
import com.llama.llamastack.models.InferenceBatchChatCompletionResponse
import com.llama.llamastack.models.InferenceBatchCompletionParams
import com.llama.llamastack.models.InferenceChatCompletionParams
import com.llama.llamastack.models.InferenceCompletionParams
import com.llama.llamastack.models.InferenceEmbeddingsParams

interface InferenceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InferenceServiceAsync

    /** Generate chat completions for a batch of messages using the specified model. */
    suspend fun batchChatCompletion(
        params: InferenceBatchChatCompletionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InferenceBatchChatCompletionResponse

    /** Generate completions for a batch of content using the specified model. */
    suspend fun batchCompletion(
        params: InferenceBatchCompletionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchCompletion

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

    /**
     * A view of [InferenceServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): InferenceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/inference/batch-chat-completion`, but is
         * otherwise the same as [InferenceServiceAsync.batchChatCompletion].
         */
        @MustBeClosed
        suspend fun batchChatCompletion(
            params: InferenceBatchChatCompletionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InferenceBatchChatCompletionResponse>

        /**
         * Returns a raw HTTP response for `post /v1/inference/batch-completion`, but is otherwise
         * the same as [InferenceServiceAsync.batchCompletion].
         */
        @MustBeClosed
        suspend fun batchCompletion(
            params: InferenceBatchCompletionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchCompletion>

        /**
         * Returns a raw HTTP response for `post /v1/inference/chat-completion`, but is otherwise
         * the same as [InferenceServiceAsync.chatCompletion].
         */
        @MustBeClosed
        suspend fun chatCompletion(
            params: InferenceChatCompletionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatCompletionResponse>

        /**
         * Returns a raw HTTP response for `post /v1/inference/completion`, but is otherwise the
         * same as [InferenceServiceAsync.completion].
         */
        @MustBeClosed
        suspend fun completion(
            params: InferenceCompletionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CompletionResponse>

        /**
         * Returns a raw HTTP response for `post /v1/inference/embeddings`, but is otherwise the
         * same as [InferenceServiceAsync.embeddings].
         */
        @MustBeClosed
        suspend fun embeddings(
            params: InferenceEmbeddingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmbeddingsResponse>
    }
}
