// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking.chat

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.core.http.StreamResponse
import com.llama.llamastack.models.ChatCompletionChunk
import com.llama.llamastack.models.ChatCompletionCreateParams
import com.llama.llamastack.models.ChatCompletionCreateResponse
import com.llama.llamastack.models.ChatCompletionListParams
import com.llama.llamastack.models.ChatCompletionListResponse
import com.llama.llamastack.models.ChatCompletionRetrieveParams
import com.llama.llamastack.models.ChatCompletionRetrieveResponse

interface CompletionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CompletionService

    /**
     * Generate an OpenAI-compatible chat completion for the given messages using the specified
     * model.
     */
    fun create(
        params: ChatCompletionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatCompletionCreateResponse

    /**
     * Generate an OpenAI-compatible chat completion for the given messages using the specified
     * model.
     */
    @MustBeClosed
    fun createStreaming(
        params: ChatCompletionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StreamResponse<ChatCompletionChunk>

    /** Describe a chat completion by its ID. */
    fun retrieve(
        completionId: String,
        params: ChatCompletionRetrieveParams = ChatCompletionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatCompletionRetrieveResponse =
        retrieve(params.toBuilder().completionId(completionId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        params: ChatCompletionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatCompletionRetrieveResponse

    /** @see [retrieve] */
    fun retrieve(
        completionId: String,
        requestOptions: RequestOptions,
    ): ChatCompletionRetrieveResponse =
        retrieve(completionId, ChatCompletionRetrieveParams.none(), requestOptions)

    /** List all chat completions. */
    fun list(
        params: ChatCompletionListParams = ChatCompletionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatCompletionListResponse

    /** @see [list] */
    fun list(requestOptions: RequestOptions): ChatCompletionListResponse =
        list(ChatCompletionListParams.none(), requestOptions)

    /** A view of [CompletionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CompletionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/openai/v1/chat/completions`, but is otherwise
         * the same as [CompletionService.create].
         */
        @MustBeClosed
        fun create(
            params: ChatCompletionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatCompletionCreateResponse>

        /**
         * Returns a raw HTTP response for `post /v1/openai/v1/chat/completions`, but is otherwise
         * the same as [CompletionService.createStreaming].
         */
        @MustBeClosed
        fun createStreaming(
            params: ChatCompletionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StreamResponse<ChatCompletionChunk>>

        /**
         * Returns a raw HTTP response for `get /v1/openai/v1/chat/completions/{completion_id}`, but
         * is otherwise the same as [CompletionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            completionId: String,
            params: ChatCompletionRetrieveParams = ChatCompletionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatCompletionRetrieveResponse> =
            retrieve(params.toBuilder().completionId(completionId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ChatCompletionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatCompletionRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            completionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChatCompletionRetrieveResponse> =
            retrieve(completionId, ChatCompletionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/openai/v1/chat/completions`, but is otherwise
         * the same as [CompletionService.list].
         */
        @MustBeClosed
        fun list(
            params: ChatCompletionListParams = ChatCompletionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatCompletionListResponse>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ChatCompletionListResponse> =
            list(ChatCompletionListParams.none(), requestOptions)
    }
}
