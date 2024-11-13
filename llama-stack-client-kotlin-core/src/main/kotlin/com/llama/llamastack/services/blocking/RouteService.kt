// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.RouteListParams
import com.llama.llamastack.models.RouteListResponse

interface RouteService {

    fun list(
        params: RouteListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RouteListResponse
}
