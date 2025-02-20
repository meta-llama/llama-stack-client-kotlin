// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.ToolGroup
import com.llama.llamastack.models.ToolgroupGetParams
import com.llama.llamastack.models.ToolgroupListParams
import com.llama.llamastack.models.ToolgroupRegisterParams
import com.llama.llamastack.models.ToolgroupUnregisterParams

interface ToolgroupService {

    /** List tool groups with optional provider */
    fun list(
        params: ToolgroupListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ToolGroup>

    fun get(
        params: ToolgroupGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ToolGroup

    /** Register a tool group */
    fun register(
        params: ToolgroupRegisterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Unregister a tool group */
    fun unregister(
        params: ToolgroupUnregisterParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )
}
