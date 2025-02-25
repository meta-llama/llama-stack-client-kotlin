// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async.toolRuntime

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.QueryResult
import com.llama.llamastack.models.ToolRuntimeRagToolInsertParams
import com.llama.llamastack.models.ToolRuntimeRagToolQueryParams

interface RagToolServiceAsync {

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
}
