// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ShieldRetrieveParamsTest {

    @Test
    fun createShieldRetrieveParams() {
        ShieldRetrieveParams.builder()
            .identifier("identifier")
            .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
            .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
            .build()
    }

    @Test
    fun getPathParam() {
        val params = ShieldRetrieveParams.builder().identifier("identifier").build()
        assertThat(params).isNotNull
        // path param "identifier"
        assertThat(params.getPathParam(0)).isEqualTo("identifier")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
