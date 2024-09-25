// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import com.llama_stack_client.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MemoryQueryParamsTest {

    @Test
    fun createMemoryQueryParams() {
        MemoryQueryParams.builder()
            .bankId("bank_id")
            .query(MemoryQueryParams.Query.ofString("string"))
            .params(MemoryQueryParams.Params.builder().build())
            .build()
    }

    @Test
    fun getBody() {
        val params =
            MemoryQueryParams.builder()
                .bankId("bank_id")
                .query(MemoryQueryParams.Query.ofString("string"))
                .params(MemoryQueryParams.Params.builder().build())
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.bankId()).isEqualTo("bank_id")
        assertThat(body.query()).isEqualTo(MemoryQueryParams.Query.ofString("string"))
        assertThat(body.params()).isEqualTo(MemoryQueryParams.Params.builder().build())
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            MemoryQueryParams.builder()
                .bankId("bank_id")
                .query(MemoryQueryParams.Query.ofString("string"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.bankId()).isEqualTo("bank_id")
        assertThat(body.query()).isEqualTo(MemoryQueryParams.Query.ofString("string"))
    }
}
