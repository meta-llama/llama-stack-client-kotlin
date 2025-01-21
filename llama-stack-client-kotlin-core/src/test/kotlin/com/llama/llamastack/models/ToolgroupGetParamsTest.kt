// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ToolgroupGetParamsTest {

    @Test
    fun createToolgroupGetParams() {
        ToolgroupGetParams.builder()
            .toolgroupId("toolgroup_id")
            .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
            .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            ToolgroupGetParams.builder()
                .toolgroupId("toolgroup_id")
                .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                .build()
        val expected = QueryParams.builder()
        expected.put("toolgroup_id", "toolgroup_id")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = ToolgroupGetParams.builder().toolgroupId("toolgroup_id").build()
        val expected = QueryParams.builder()
        expected.put("toolgroup_id", "toolgroup_id")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
