// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking.responses

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.ResponseInputItemListParams
import com.llama.llamastack.models.ResponseInputItemListResponse

interface InputItemService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InputItemService

    /** List input items for a given OpenAI response. */
    fun list(
        responseId: String,
        params: ResponseInputItemListParams = ResponseInputItemListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponseInputItemListResponse =
        list(params.toBuilder().responseId(responseId).build(), requestOptions)

    /** @see [list] */
    fun list(
        params: ResponseInputItemListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponseInputItemListResponse

    /** @see [list] */
    fun list(responseId: String, requestOptions: RequestOptions): ResponseInputItemListResponse =
        list(responseId, ResponseInputItemListParams.none(), requestOptions)

    /** A view of [InputItemService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InputItemService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/openai/v1/responses/{response_id}/input_items`,
         * but is otherwise the same as [InputItemService.list].
         */
        @MustBeClosed
        fun list(
            responseId: String,
            params: ResponseInputItemListParams = ResponseInputItemListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResponseInputItemListResponse> =
            list(params.toBuilder().responseId(responseId).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ResponseInputItemListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResponseInputItemListResponse>

        /** @see [list] */
        @MustBeClosed
        fun list(
            responseId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ResponseInputItemListResponse> =
            list(responseId, ResponseInputItemListParams.none(), requestOptions)
    }
}
