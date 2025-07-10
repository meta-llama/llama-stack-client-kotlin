// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async.chat

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.ChatCompletionCreateParams
import com.llama.llamastack.models.ChatCompletionCreateResponse
import com.llama.llamastack.models.ChatCompletionListParams
import com.llama.llamastack.models.ChatCompletionListResponse
import com.llama.llamastack.models.ChatCompletionRetrieveParams
import com.llama.llamastack.models.ChatCompletionRetrieveResponse

interface CompletionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CompletionServiceAsync

    /**
     * Generate an OpenAI-compatible chat completion for the given messages using the specified
     * model.
     */
    suspend fun create(
        params: ChatCompletionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatCompletionCreateResponse

    /** Describe a chat completion by its ID. */
    suspend fun retrieve(
        completionId: String,
        params: ChatCompletionRetrieveParams = ChatCompletionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatCompletionRetrieveResponse =
        retrieve(params.toBuilder().completionId(completionId).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: ChatCompletionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatCompletionRetrieveResponse

    /** @see [retrieve] */
    suspend fun retrieve(
        completionId: String,
        requestOptions: RequestOptions,
    ): ChatCompletionRetrieveResponse =
        retrieve(completionId, ChatCompletionRetrieveParams.none(), requestOptions)

    /** List all chat completions. */
    suspend fun list(
        params: ChatCompletionListParams = ChatCompletionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatCompletionListResponse

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): ChatCompletionListResponse =
        list(ChatCompletionListParams.none(), requestOptions)

    /**
     * A view of [CompletionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CompletionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/openai/v1/chat/completions`, but is otherwise
         * the same as [CompletionServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: ChatCompletionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatCompletionCreateResponse>

        /**
         * Returns a raw HTTP response for `get /v1/openai/v1/chat/completions/{completion_id}`, but
         * is otherwise the same as [CompletionServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            completionId: String,
            params: ChatCompletionRetrieveParams = ChatCompletionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatCompletionRetrieveResponse> =
            retrieve(params.toBuilder().completionId(completionId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: ChatCompletionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatCompletionRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            completionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChatCompletionRetrieveResponse> =
            retrieve(completionId, ChatCompletionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/openai/v1/chat/completions`, but is otherwise
         * the same as [CompletionServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: ChatCompletionListParams = ChatCompletionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatCompletionListResponse>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<ChatCompletionListResponse> =
            list(ChatCompletionListParams.none(), requestOptions)
    }
}
