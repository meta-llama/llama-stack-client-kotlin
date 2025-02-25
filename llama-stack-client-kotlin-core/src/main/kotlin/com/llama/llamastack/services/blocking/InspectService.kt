// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.HealthInfo
import com.llama.llamastack.models.InspectHealthParams
import com.llama.llamastack.models.InspectVersionParams
import com.llama.llamastack.models.VersionInfo

interface InspectService {

    fun health(
        params: InspectHealthParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HealthInfo

    fun version(
        params: InspectVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VersionInfo
}
