// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MemoryQueryParamsTest {

    @Test
    fun createMemoryQueryParams() {
        MemoryQueryParams.builder()
            .bankId("bank_id")
            .query(InterleavedContent.ofString("string"))
            .params(
                MemoryQueryParams.Params.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
            .xLlamaStackProviderData("X-LlamaStack-ProviderData")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            MemoryQueryParams.builder()
                .bankId("bank_id")
                .query(InterleavedContent.ofString("string"))
                .params(
                    MemoryQueryParams.Params.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.bankId()).isEqualTo("bank_id")
        assertThat(body.query()).isEqualTo(InterleavedContent.ofString("string"))
        assertThat(body.params())
            .isEqualTo(
                MemoryQueryParams.Params.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            MemoryQueryParams.builder()
                .bankId("bank_id")
                .query(InterleavedContent.ofString("string"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.bankId()).isEqualTo("bank_id")
        assertThat(body.query()).isEqualTo(InterleavedContent.ofString("string"))
    }
}
