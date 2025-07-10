// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.ListVectorStoresResponse
import com.llama.llamastack.models.VectorStore
import com.llama.llamastack.models.VectorStoreCreateParams
import com.llama.llamastack.models.VectorStoreDeleteParams
import com.llama.llamastack.models.VectorStoreDeleteResponse
import com.llama.llamastack.models.VectorStoreListParams
import com.llama.llamastack.models.VectorStoreRetrieveParams
import com.llama.llamastack.models.VectorStoreSearchParams
import com.llama.llamastack.models.VectorStoreSearchResponse
import com.llama.llamastack.models.VectorStoreUpdateParams
import com.llama.llamastack.services.blocking.vectorStores.FileService

interface VectorStoreService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): VectorStoreService

    fun files(): FileService

    /** Creates a vector store. */
    fun create(
        params: VectorStoreCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VectorStore

    /** Retrieves a vector store. */
    fun retrieve(
        vectorStoreId: String,
        params: VectorStoreRetrieveParams = VectorStoreRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VectorStore =
        retrieve(params.toBuilder().vectorStoreId(vectorStoreId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        params: VectorStoreRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VectorStore

    /** @see [retrieve] */
    fun retrieve(vectorStoreId: String, requestOptions: RequestOptions): VectorStore =
        retrieve(vectorStoreId, VectorStoreRetrieveParams.none(), requestOptions)

    /** Updates a vector store. */
    fun update(
        vectorStoreId: String,
        params: VectorStoreUpdateParams = VectorStoreUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VectorStore = update(params.toBuilder().vectorStoreId(vectorStoreId).build(), requestOptions)

    /** @see [update] */
    fun update(
        params: VectorStoreUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VectorStore

    /** @see [update] */
    fun update(vectorStoreId: String, requestOptions: RequestOptions): VectorStore =
        update(vectorStoreId, VectorStoreUpdateParams.none(), requestOptions)

    /** Returns a list of vector stores. */
    fun list(
        params: VectorStoreListParams = VectorStoreListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ListVectorStoresResponse

    /** @see [list] */
    fun list(requestOptions: RequestOptions): ListVectorStoresResponse =
        list(VectorStoreListParams.none(), requestOptions)

    /** Delete a vector store. */
    fun delete(
        vectorStoreId: String,
        params: VectorStoreDeleteParams = VectorStoreDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VectorStoreDeleteResponse =
        delete(params.toBuilder().vectorStoreId(vectorStoreId).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        params: VectorStoreDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VectorStoreDeleteResponse

    /** @see [delete] */
    fun delete(vectorStoreId: String, requestOptions: RequestOptions): VectorStoreDeleteResponse =
        delete(vectorStoreId, VectorStoreDeleteParams.none(), requestOptions)

    /**
     * Search for chunks in a vector store. Searches a vector store for relevant chunks based on a
     * query and optional file attribute filters.
     */
    fun search(
        vectorStoreId: String,
        params: VectorStoreSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VectorStoreSearchResponse =
        search(params.toBuilder().vectorStoreId(vectorStoreId).build(), requestOptions)

    /** @see [search] */
    fun search(
        params: VectorStoreSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VectorStoreSearchResponse

    /**
     * A view of [VectorStoreService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): VectorStoreService.WithRawResponse

        fun files(): FileService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/openai/v1/vector_stores`, but is otherwise the
         * same as [VectorStoreService.create].
         */
        @MustBeClosed
        fun create(
            params: VectorStoreCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VectorStore>

        /**
         * Returns a raw HTTP response for `get /v1/openai/v1/vector_stores/{vector_store_id}`, but
         * is otherwise the same as [VectorStoreService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            vectorStoreId: String,
            params: VectorStoreRetrieveParams = VectorStoreRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VectorStore> =
            retrieve(params.toBuilder().vectorStoreId(vectorStoreId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: VectorStoreRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VectorStore>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            vectorStoreId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VectorStore> =
            retrieve(vectorStoreId, VectorStoreRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/openai/v1/vector_stores/{vector_store_id}`, but
         * is otherwise the same as [VectorStoreService.update].
         */
        @MustBeClosed
        fun update(
            vectorStoreId: String,
            params: VectorStoreUpdateParams = VectorStoreUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VectorStore> =
            update(params.toBuilder().vectorStoreId(vectorStoreId).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: VectorStoreUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VectorStore>

        /** @see [update] */
        @MustBeClosed
        fun update(
            vectorStoreId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VectorStore> =
            update(vectorStoreId, VectorStoreUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/openai/v1/vector_stores`, but is otherwise the
         * same as [VectorStoreService.list].
         */
        @MustBeClosed
        fun list(
            params: VectorStoreListParams = VectorStoreListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ListVectorStoresResponse>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ListVectorStoresResponse> =
            list(VectorStoreListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/openai/v1/vector_stores/{vector_store_id}`,
         * but is otherwise the same as [VectorStoreService.delete].
         */
        @MustBeClosed
        fun delete(
            vectorStoreId: String,
            params: VectorStoreDeleteParams = VectorStoreDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VectorStoreDeleteResponse> =
            delete(params.toBuilder().vectorStoreId(vectorStoreId).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: VectorStoreDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VectorStoreDeleteResponse>

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            vectorStoreId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VectorStoreDeleteResponse> =
            delete(vectorStoreId, VectorStoreDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /v1/openai/v1/vector_stores/{vector_store_id}/search`, but is otherwise the same as
         * [VectorStoreService.search].
         */
        @MustBeClosed
        fun search(
            vectorStoreId: String,
            params: VectorStoreSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VectorStoreSearchResponse> =
            search(params.toBuilder().vectorStoreId(vectorStoreId).build(), requestOptions)

        /** @see [search] */
        @MustBeClosed
        fun search(
            params: VectorStoreSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VectorStoreSearchResponse>
    }
}
