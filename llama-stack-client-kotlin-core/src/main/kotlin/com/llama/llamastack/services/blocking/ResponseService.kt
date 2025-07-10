// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.core.http.StreamResponse
import com.llama.llamastack.models.ResponseCreateParams
import com.llama.llamastack.models.ResponseListParams
import com.llama.llamastack.models.ResponseListResponse
import com.llama.llamastack.models.ResponseObject
import com.llama.llamastack.models.ResponseObjectStream
import com.llama.llamastack.models.ResponseRetrieveParams
import com.llama.llamastack.services.blocking.responses.InputItemService

interface ResponseService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ResponseService

    fun inputItems(): InputItemService

    /** Create a new OpenAI response. */
    fun create(
        params: ResponseCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponseObject

    /** Create a new OpenAI response. */
    @MustBeClosed
    fun createStreaming(
        params: ResponseCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StreamResponse<ResponseObjectStream>

    /** Retrieve an OpenAI response by its ID. */
    fun retrieve(
        responseId: String,
        params: ResponseRetrieveParams = ResponseRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponseObject = retrieve(params.toBuilder().responseId(responseId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        params: ResponseRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponseObject

    /** @see [retrieve] */
    fun retrieve(responseId: String, requestOptions: RequestOptions): ResponseObject =
        retrieve(responseId, ResponseRetrieveParams.none(), requestOptions)

    /** List all OpenAI responses. */
    fun list(
        params: ResponseListParams = ResponseListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponseListResponse

    /** @see [list] */
    fun list(requestOptions: RequestOptions): ResponseListResponse =
        list(ResponseListParams.none(), requestOptions)

    /** A view of [ResponseService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ResponseService.WithRawResponse

        fun inputItems(): InputItemService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/openai/v1/responses`, but is otherwise the same
         * as [ResponseService.create].
         */
        @MustBeClosed
        fun create(
            params: ResponseCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResponseObject>

        /**
         * Returns a raw HTTP response for `post /v1/openai/v1/responses`, but is otherwise the same
         * as [ResponseService.createStreaming].
         */
        @MustBeClosed
        fun createStreaming(
            params: ResponseCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StreamResponse<ResponseObjectStream>>

        /**
         * Returns a raw HTTP response for `get /v1/openai/v1/responses/{response_id}`, but is
         * otherwise the same as [ResponseService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            responseId: String,
            params: ResponseRetrieveParams = ResponseRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResponseObject> =
            retrieve(params.toBuilder().responseId(responseId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ResponseRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResponseObject>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            responseId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ResponseObject> =
            retrieve(responseId, ResponseRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/openai/v1/responses`, but is otherwise the same
         * as [ResponseService.list].
         */
        @MustBeClosed
        fun list(
            params: ResponseListParams = ResponseListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResponseListResponse>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ResponseListResponse> =
            list(ResponseListParams.none(), requestOptions)
    }
}
