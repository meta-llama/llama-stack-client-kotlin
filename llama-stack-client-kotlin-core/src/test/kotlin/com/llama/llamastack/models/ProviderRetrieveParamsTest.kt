// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProviderRetrieveParamsTest {

    @Test
    fun create() {
        ProviderRetrieveParams.builder().providerId("provider_id").build()
    }

    @Test
    fun getPathParam() {
        val params = ProviderRetrieveParams.builder().providerId("provider_id").build()
        assertThat(params).isNotNull
        // path param "providerId"
        assertThat(params.getPathParam(0)).isEqualTo("provider_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
