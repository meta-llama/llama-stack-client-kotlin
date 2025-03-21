// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking.toolRuntime

import com.google.errorprone.annotations.MustBeClosed
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.HttpResponse
import com.llama.llamastack.core.http.HttpResponseFor
import com.llama.llamastack.models.QueryResult
import com.llama.llamastack.models.ToolRuntimeRagToolInsertParams
import com.llama.llamastack.models.ToolRuntimeRagToolQueryParams

interface RagToolService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Index documents so they can be used by the RAG system */
    fun insert(
        params: ToolRuntimeRagToolInsertParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Query the RAG system for context; typically invoked by the agent */
    fun query(
        params: ToolRuntimeRagToolQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): QueryResult

    /** A view of [RagToolService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/tool-runtime/rag-tool/insert`, but is otherwise
         * the same as [RagToolService.insert].
         */
        @MustBeClosed
        fun insert(
            params: ToolRuntimeRagToolInsertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /v1/tool-runtime/rag-tool/query`, but is otherwise
         * the same as [RagToolService.query].
         */
        @MustBeClosed
        fun query(
            params: ToolRuntimeRagToolQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<QueryResult>
    }
}
