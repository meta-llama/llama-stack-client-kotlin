// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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

    fun retrieve(
        params: DatasetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetRetrieveResponse

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
     * - data: List of items for the current page
     * - has_more: Whether there are more items available after this set
     */
    fun iterrows(
        params: DatasetIterrowsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetIterrowsResponse

    /** Register a new dataset. */
    fun register(
        params: DatasetRegisterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DatasetRegisterResponse

    fun unregister(
        params: DatasetUnregisterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [DatasetService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1/datasets/{dataset_id}`, but is otherwise the
         * same as [DatasetService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: DatasetRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatasetRetrieveResponse>

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
            params: DatasetIterrowsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DatasetIterrowsResponse>

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
            params: DatasetUnregisterParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
