// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.RouteInfo
import com.llama.llamastack.models.RouteListParams

interface RouteServiceAsync {

    suspend fun list(
        params: RouteListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<RouteInfo>
}
