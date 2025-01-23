// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking.toolRuntime

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.QueryResult
import com.llama.llamastack.models.ToolRuntimeRagToolInsertParams
import com.llama.llamastack.models.ToolRuntimeRagToolQueryParams

interface RagToolService {

    /** Index documents so they can be used by the RAG system */
    fun insert(
        params: ToolRuntimeRagToolInsertParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )

    /** Query the RAG system for context; typically invoked by the agent */
    fun query(
        params: ToolRuntimeRagToolQueryParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): QueryResult
}
