// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.ResponseCreateParams
import com.llama.llamastack.models.ResponseListParams
import com.llama.llamastack.models.ResponseListResponse
import com.llama.llamastack.models.ResponseObject
import com.llama.llamastack.models.ResponseRetrieveParams
import com.llama.llamastack.services.async.responses.InputItemServiceAsync

interface ResponseServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ResponseServiceAsync

    fun inputItems(): InputItemServiceAsync

    /** Create a new OpenAI response. */
    suspend fun create(
        params: ResponseCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponseObject

    /** Retrieve an OpenAI response by its ID. */
    suspend fun retrieve(
        responseId: String,
        params: ResponseRetrieveParams = ResponseRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponseObject = retrieve(params.toBuilder().responseId(responseId).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: ResponseRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponseObject

    /** @see [retrieve] */
    suspend fun retrieve(responseId: String, requestOptions: RequestOptions): ResponseObject =
        retrieve(responseId, ResponseRetrieveParams.none(), requestOptions)

    /** List all OpenAI responses. */
    suspend fun list(
        params: ResponseListParams = ResponseListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResponseListResponse

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): ResponseListResponse =
        list(ResponseListParams.none(), requestOptions)

    /**
     * A view of [ResponseServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ResponseServiceAsync.WithRawResponse

        fun inputItems(): InputItemServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/openai/v1/responses`, but is otherwise the same
         * as [ResponseServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: ResponseCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResponseObject>

        /**
         * Returns a raw HTTP response for `get /v1/openai/v1/responses/{response_id}`, but is
         * otherwise the same as [ResponseServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            responseId: String,
            params: ResponseRetrieveParams = ResponseRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResponseObject> =
            retrieve(params.toBuilder().responseId(responseId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: ResponseRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResponseObject>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            responseId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ResponseObject> =
            retrieve(responseId, ResponseRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/openai/v1/responses`, but is otherwise the same
         * as [ResponseServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: ResponseListParams = ResponseListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResponseListResponse>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<ResponseListResponse> =
            list(ResponseListParams.none(), requestOptions)
    }
}
