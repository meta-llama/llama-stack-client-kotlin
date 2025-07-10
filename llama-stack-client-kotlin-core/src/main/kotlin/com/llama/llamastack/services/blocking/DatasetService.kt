// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

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

interface DatasetService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DatasetService

    /** Get a dataset by its ID. */
    fun retrieve(
        datasetId: String,
        params: DatasetRetrieveParams = DatasetRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetRetrieveResponse =
        retrieve(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        params: DatasetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetRetrieveResponse

    /** @see [retrieve] */
    fun retrieve(datasetId: String, requestOptions: RequestOptions): DatasetRetrieveResponse =
        retrieve(datasetId, DatasetRetrieveParams.none(), requestOptions)

    /** List all datasets. */
    fun list(
        params: DatasetListParams = DatasetListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ListDatasetsResponse.Data>

    /** @see [list] */
    fun list(requestOptions: RequestOptions): List<ListDatasetsResponse.Data> =
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
    fun iterrows(
        datasetId: String,
        params: DatasetIterrowsParams = DatasetIterrowsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetIterrowsResponse =
        iterrows(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see [iterrows] */
    fun iterrows(
        params: DatasetIterrowsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetIterrowsResponse

    /** @see [iterrows] */
    fun iterrows(datasetId: String, requestOptions: RequestOptions): DatasetIterrowsResponse =
        iterrows(datasetId, DatasetIterrowsParams.none(), requestOptions)

    /** Register a new dataset. */
    fun register(
        params: DatasetRegisterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetRegisterResponse

    /** Unregister a dataset by its ID. */
    fun unregister(
        datasetId: String,
        params: DatasetUnregisterParams = DatasetUnregisterParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = unregister(params.toBuilder().datasetId(datasetId).build(), requestOptions)

    /** @see [unregister] */
    fun unregister(
        params: DatasetUnregisterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see [unregister] */
    fun unregister(datasetId: String, requestOptions: RequestOptions) =
        unregister(datasetId, DatasetUnregisterParams.none(), requestOptions)

    /** A view of [DatasetService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DatasetService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/datasets/{dataset_id}`, but is otherwise the
         * same as [DatasetService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            datasetId: String,
            params: DatasetRetrieveParams = DatasetRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatasetRetrieveResponse> =
            retrieve(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: DatasetRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatasetRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            datasetId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DatasetRetrieveResponse> =
            retrieve(datasetId, DatasetRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/datasets`, but is otherwise the same as
         * [DatasetService.list].
         */
        @MustBeClosed
        fun list(
            params: DatasetListParams = DatasetListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ListDatasetsResponse.Data>>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<ListDatasetsResponse.Data>> =
            list(DatasetListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/datasetio/iterrows/{dataset_id}`, but is
         * otherwise the same as [DatasetService.iterrows].
         */
        @MustBeClosed
        fun iterrows(
            datasetId: String,
            params: DatasetIterrowsParams = DatasetIterrowsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatasetIterrowsResponse> =
            iterrows(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see [iterrows] */
        @MustBeClosed
        fun iterrows(
            params: DatasetIterrowsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatasetIterrowsResponse>

        /** @see [iterrows] */
        @MustBeClosed
        fun iterrows(
            datasetId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DatasetIterrowsResponse> =
            iterrows(datasetId, DatasetIterrowsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/datasets`, but is otherwise the same as
         * [DatasetService.register].
         */
        @MustBeClosed
        fun register(
            params: DatasetRegisterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatasetRegisterResponse>

        /**
         * Returns a raw HTTP response for `delete /v1/datasets/{dataset_id}`, but is otherwise the
         * same as [DatasetService.unregister].
         */
        @MustBeClosed
        fun unregister(
            datasetId: String,
            params: DatasetUnregisterParams = DatasetUnregisterParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            unregister(params.toBuilder().datasetId(datasetId).build(), requestOptions)

        /** @see [unregister] */
        @MustBeClosed
        fun unregister(
            params: DatasetUnregisterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see [unregister] */
        @MustBeClosed
        fun unregister(datasetId: String, requestOptions: RequestOptions): HttpResponse =
            unregister(datasetId, DatasetUnregisterParams.none(), requestOptions)
    }
}
