// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.Tool
import com.llama.llamastack.models.ToolGetParams
import com.llama.llamastack.models.ToolListParams
import com.llama.llamastack.models.ToolListResponse

interface ToolService {

    /** List tools with optional tool group */
    fun list(
        params: ToolListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ToolListResponse

    fun get(params: ToolGetParams, requestOptions: RequestOptions = RequestOptions.none()): Tool
}
