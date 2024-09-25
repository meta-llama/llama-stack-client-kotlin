// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import com.llama_stack_client.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MemoryRetrieveParamsTest {

    @Test
    fun createMemoryRetrieveParams() {
        MemoryRetrieveParams.builder().bankId("bank_id").build()
    }

    @Test
    fun getQueryParams() {
        val params = MemoryRetrieveParams.builder().bankId("bank_id").build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("bank_id", listOf("bank_id"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = MemoryRetrieveParams.builder().bankId("bank_id").build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("bank_id", listOf("bank_id"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
