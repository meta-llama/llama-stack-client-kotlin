// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.ProviderInfo
import com.llama.llamastack.models.ProviderListParams

interface ProviderService {

    fun list(
        params: ProviderListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ProviderInfo>
}
