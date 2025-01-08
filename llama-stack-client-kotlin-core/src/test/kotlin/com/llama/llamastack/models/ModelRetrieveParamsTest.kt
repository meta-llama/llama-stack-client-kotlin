// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ModelRetrieveParamsTest {

    @Test
    fun createModelRetrieveParams() {
        ModelRetrieveParams.builder()
            .identifier("identifier")
            .xLlamaStackProviderData("X-LlamaStack-ProviderData")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            ModelRetrieveParams.builder()
                .identifier("identifier")
                .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                .build()
        val expected = QueryParams.builder()
        expected.put("identifier", "identifier")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = ModelRetrieveParams.builder().identifier("identifier").build()
        val expected = QueryParams.builder()
        expected.put("identifier", "identifier")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
