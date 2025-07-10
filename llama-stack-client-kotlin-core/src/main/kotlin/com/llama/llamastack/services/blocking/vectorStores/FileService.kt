// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking.vectorStores

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.VectorStoreFile
import com.llama.llamastack.models.VectorStoreFileCreateParams

interface FileService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): FileService

    /** Attach a file to a vector store. */
    fun create(
        vectorStoreId: String,
        params: VectorStoreFileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VectorStoreFile =
        create(params.toBuilder().vectorStoreId(vectorStoreId).build(), requestOptions)

    /** @see [create] */
    fun create(
        params: VectorStoreFileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VectorStoreFile

    /** A view of [FileService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): FileService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /v1/openai/v1/vector_stores/{vector_store_id}/files`, but is otherwise the same as
         * [FileService.create].
         */
        @MustBeClosed
        fun create(
            vectorStoreId: String,
            params: VectorStoreFileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VectorStoreFile> =
            create(params.toBuilder().vectorStoreId(vectorStoreId).build(), requestOptions)

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: VectorStoreFileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VectorStoreFile>
    }
}
