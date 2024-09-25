// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import com.llama_stack_client.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MemoryDropParamsTest {

    @Test
    fun createMemoryDropParams() {
        MemoryDropParams.builder().bankId("bank_id").build()
    }

    @Test
    fun getBody() {
        val params = MemoryDropParams.builder().bankId("bank_id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.bankId()).isEqualTo("bank_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = MemoryDropParams.builder().bankId("bank_id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.bankId()).isEqualTo("bank_id")
    }
}
