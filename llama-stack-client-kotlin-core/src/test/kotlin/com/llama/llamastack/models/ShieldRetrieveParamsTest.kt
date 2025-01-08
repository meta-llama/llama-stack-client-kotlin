// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ShieldRetrieveParamsTest {

    @Test
    fun createShieldRetrieveParams() {
        ShieldRetrieveParams.builder()
            .identifier("identifier")
            .xLlamaStackProviderData("X-LlamaStack-ProviderData")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            ShieldRetrieveParams.builder()
                .identifier("identifier")
                .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                .build()
        val expected = QueryParams.builder()
        expected.put("identifier", "identifier")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = ShieldRetrieveParams.builder().identifier("identifier").build()
        val expected = QueryParams.builder()
        expected.put("identifier", "identifier")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
