// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ToolgroupUnregisterParamsTest {

    @Test
    fun createToolgroupUnregisterParams() {
        ToolgroupUnregisterParams.builder()
            .toolGroupId("tool_group_id")
            .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
            .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ToolgroupUnregisterParams.builder()
                .toolGroupId("tool_group_id")
                .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.toolGroupId()).isEqualTo("tool_group_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = ToolgroupUnregisterParams.builder().toolGroupId("tool_group_id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.toolGroupId()).isEqualTo("tool_group_id")
    }
}
