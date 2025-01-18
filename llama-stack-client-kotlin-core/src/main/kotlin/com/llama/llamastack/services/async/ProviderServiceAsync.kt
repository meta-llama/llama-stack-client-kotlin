// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.ProviderInfo
import com.llama.llamastack.models.ProviderListParams

interface ProviderServiceAsync {

    suspend fun list(
        params: ProviderListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): List<ProviderInfo>
}
