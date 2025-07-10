// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async.responses

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.ResponseInputItemListParams
import com.llama.llamastack.models.ResponseInputItemListResponse

interface InputItemServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InputItemServiceAsync

    /** List input items for a given OpenAI response. */
    suspend fun list(
        responseId: String,
        params: ResponseInputItemListParams = ResponseInputItemListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponseInputItemListResponse =
        list(params.toBuilder().responseId(responseId).build(), requestOptions)

    /** @see [list] */
    suspend fun list(
        params: ResponseInputItemListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponseInputItemListResponse

    /** @see [list] */
    suspend fun list(
        responseId: String,
        requestOptions: RequestOptions,
    ): ResponseInputItemListResponse =
        list(responseId, ResponseInputItemListParams.none(), requestOptions)

    /**
     * A view of [InputItemServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): InputItemServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/openai/v1/responses/{response_id}/input_items`,
         * but is otherwise the same as [InputItemServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            responseId: String,
            params: ResponseInputItemListParams = ResponseInputItemListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResponseInputItemListResponse> =
            list(params.toBuilder().responseId(responseId).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            params: ResponseInputItemListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResponseInputItemListResponse>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            responseId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ResponseInputItemListResponse> =
            list(responseId, ResponseInputItemListParams.none(), requestOptions)
    }
}
