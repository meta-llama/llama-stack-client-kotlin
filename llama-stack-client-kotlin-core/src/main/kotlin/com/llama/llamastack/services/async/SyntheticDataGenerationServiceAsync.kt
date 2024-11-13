// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.SyntheticDataGenerationGenerateParams
import com.llama.llamastack.models.SyntheticDataGenerationResponse

interface SyntheticDataGenerationServiceAsync {

    suspend fun generate(
        params: SyntheticDataGenerationGenerateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): SyntheticDataGenerationResponse
}
