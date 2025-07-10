// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponse
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.DatasetIterrowsParams
import com.llama.llamastack.models.DatasetIterrowsResponse
import com.llama.llamastack.models.DatasetListParams
import com.llama.llamastack.models.DatasetRegisterParams
import com.llama.llamastack.models.DatasetRegisterResponse
import com.llama.llamastack.models.DatasetRetrieveParams
import com.llama.llamastack.models.DatasetRetrieveResponse
import com.llama.llamastack.models.DatasetUnregisterParams
import com.llama.llamastack.models.ListDatasetsResponse

interface DatasetServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DatasetServiceAsync

    /** Get a dataset by its ID. */
    suspend fun retrieve(
        datasetId: String,
        params: DatasetRetrieveParams = DatasetRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetRetrieveResponse =
        retrieve(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: DatasetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetRetrieveResponse

    /** @see [retrieve] */
    suspend fun retrieve(
        datasetId: String,
        requestOptions: RequestOptions,
    ): DatasetRetrieveResponse = retrieve(datasetId, DatasetRetrieveParams.none(), requestOptions)

    /** List all datasets. */
    suspend fun list(
        params: DatasetListParams = DatasetListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ListDatasetsResponse.Data>

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): List<ListDatasetsResponse.Data> =
        list(DatasetListParams.none(), requestOptions)

    /**
     * Get a paginated list of rows from a dataset. Uses offset-based pagination where:
     * - start_index: The starting index (0-based). If None, starts from beginning.
     * - limit: Number of items to return. If None or -1, returns all items.
     *
     * The response includes:
     * - data: List of items for the current page.
     * - has_more: Whether there are more items available after this set.
     */
    suspend fun iterrows(
        datasetId: String,
        params: DatasetIterrowsParams = DatasetIterrowsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetIterrowsResponse =
        iterrows(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see [iterrows] */
    suspend fun iterrows(
        params: DatasetIterrowsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetIterrowsResponse

    /** @see [iterrows] */
    suspend fun iterrows(
        datasetId: String,
        requestOptions: RequestOptions,
    ): DatasetIterrowsResponse = iterrows(datasetId, DatasetIterrowsParams.none(), requestOptions)

    /** Register a new dataset. */
    suspend fun register(
        params: DatasetRegisterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetRegisterResponse

    /** Unregister a dataset by its ID. */
    suspend fun unregister(
        datasetId: String,
        params: DatasetUnregisterParams = DatasetUnregisterParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = unregister(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see [unregister] */
    suspend fun unregister(
        params: DatasetUnregisterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see [unregister] */
    suspend fun unregister(datasetId: String, requestOptions: RequestOptions) =
        unregister(datasetId, DatasetUnregisterParams.none(), requestOptions)

    /**
     * A view of [DatasetServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DatasetServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/datasets/{dataset_id}`, but is otherwise the
         * same as [DatasetServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            datasetId: String,
            params: DatasetRetrieveParams = DatasetRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatasetRetrieveResponse> =
            retrieve(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: DatasetRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatasetRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            datasetId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DatasetRetrieveResponse> =
            retrieve(datasetId, DatasetRetrieveParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `get /v1/datasetio/iterrows/{dataset_id}`, but is
         * otherwise the same as [DatasetServiceAsync.iterrows].
         */
        @MustBeClosed
        suspend fun iterrows(
            datasetId: String,
            params: DatasetIterrowsParams = DatasetIterrowsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatasetIterrowsResponse> =
            iterrows(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see [iterrows] */
        @MustBeClosed
        suspend fun iterrows(
            params: DatasetIterrowsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatasetIterrowsResponse>

        /** @see [iterrows] */
        @MustBeClosed
        suspend fun iterrows(
            datasetId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DatasetIterrowsResponse> =
            iterrows(datasetId, DatasetIterrowsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/datasets`, but is otherwise the same as
         * [DatasetServiceAsync.register].
         */
        @MustBeClosed
        suspend fun register(
            params: DatasetRegisterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatasetRegisterResponse>

        /**
         * Returns a raw HTTP response for `delete /v1/datasets/{dataset_id}`, but is otherwise the
         * same as [DatasetServiceAsync.unregister].
         */
        @MustBeClosed
        suspend fun unregister(
            datasetId: String,
            params: DatasetUnregisterParams = DatasetUnregisterParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            unregister(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see [unregister] */
        @MustBeClosed
        suspend fun unregister(
            params: DatasetUnregisterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see [unregister] */
        @MustBeClosed
        suspend fun unregister(datasetId: String, requestOptions: RequestOptions): HttpResponse =
            unregister(datasetId, DatasetUnregisterParams.none(), requestOptions)
    }
}
