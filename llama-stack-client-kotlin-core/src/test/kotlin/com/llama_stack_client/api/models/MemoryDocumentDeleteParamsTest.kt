// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import com.llama_stack_client.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MemoryDocumentDeleteParamsTest {

    @Test
    fun createMemoryDocumentDeleteParams() {
        MemoryDocumentDeleteParams.builder().bankId("bank_id").documentIds(listOf("string")).build()
    }

    @Test
    fun getBody() {
        val params =
            MemoryDocumentDeleteParams.builder()
                .bankId("bank_id")
                .documentIds(listOf("string"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.bankId()).isEqualTo("bank_id")
        assertThat(body.documentIds()).isEqualTo(listOf("string"))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            MemoryDocumentDeleteParams.builder()
                .bankId("bank_id")
                .documentIds(listOf("string"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.bankId()).isEqualTo("bank_id")
        assertThat(body.documentIds()).isEqualTo(listOf("string"))
    }
}
