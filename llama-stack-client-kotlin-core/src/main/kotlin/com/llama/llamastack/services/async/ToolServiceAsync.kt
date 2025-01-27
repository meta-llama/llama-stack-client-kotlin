// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.Tool
import com.llama.llamastack.models.ToolGetParams
import com.llama.llamastack.models.ToolListParams

interface ToolServiceAsync {

    /** List tools with optional tool group */
    suspend fun list(
        params: ToolListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): List<Tool>

    suspend fun get(
        params: ToolGetParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Tool
}
