// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async.toolRuntime

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponse
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.QueryResult
import com.llama.llamastack.models.ToolRuntimeRagToolInsertParams
import com.llama.llamastack.models.ToolRuntimeRagToolQueryParams

interface RagToolServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): RagToolServiceAsync

    /** Index documents so they can be used by the RAG system */
    suspend fun insert(
        params: ToolRuntimeRagToolInsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Query the RAG system for context; typically invoked by the agent */
    suspend fun query(
        params: ToolRuntimeRagToolQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): QueryResult

    /**
     * A view of [RagToolServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): RagToolServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/tool-runtime/rag-tool/insert`, but is otherwise
         * the same as [RagToolServiceAsync.insert].
         */
        @MustBeClosed
        suspend fun insert(
            params: ToolRuntimeRagToolInsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /v1/tool-runtime/rag-tool/query`, but is otherwise
         * the same as [RagToolServiceAsync.query].
         */
        @MustBeClosed
        suspend fun query(
            params: ToolRuntimeRagToolQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<QueryResult>
    }
}
