// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponse
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.DatasetListParams
import com.llama.llamastack.models.DatasetRegisterParams
import com.llama.llamastack.models.DatasetRetrieveParams
import com.llama.llamastack.models.DatasetRetrieveResponse
import com.llama.llamastack.models.DatasetUnregisterParams
import com.llama.llamastack.models.ListDatasetsResponse

interface DatasetServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    suspend fun retrieve(
        params: DatasetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetRetrieveResponse?

    suspend fun list(
        params: DatasetListParams = DatasetListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ListDatasetsResponse.Data>

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): List<ListDatasetsResponse.Data> =
        list(DatasetListParams.none(), requestOptions)

    suspend fun register(
        params: DatasetRegisterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    suspend fun unregister(
        params: DatasetUnregisterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [DatasetServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1/datasets/{dataset_id}`, but is otherwise the
         * same as [DatasetServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: DatasetRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatasetRetrieveResponse?>

        /**
         * Returns a raw HTTP response for `get /v1/datasets`, but is otherwise the same as
         * [DatasetServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: DatasetListParams = DatasetListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ListDatasetsResponse.Data>>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<ListDatasetsResponse.Data>> =
            list(DatasetListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/datasets`, but is otherwise the same as
         * [DatasetServiceAsync.register].
         */
        @MustBeClosed
        suspend fun register(
            params: DatasetRegisterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `delete /v1/datasets/{dataset_id}`, but is otherwise the
         * same as [DatasetServiceAsync.unregister].
         */
        @MustBeClosed
        suspend fun unregister(
            params: DatasetUnregisterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
