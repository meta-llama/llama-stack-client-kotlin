// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.RouteInfo
import com.llama.llamastack.models.RouteListParams

interface RouteService {

    fun list(
        params: RouteListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): List<RouteInfo>
}
