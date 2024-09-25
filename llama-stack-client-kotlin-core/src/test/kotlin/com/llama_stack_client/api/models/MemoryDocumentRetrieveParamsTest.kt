// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import com.llama_stack_client.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MemoryDocumentRetrieveParamsTest {

    @Test
    fun createMemoryDocumentRetrieveParams() {
        MemoryDocumentRetrieveParams.builder()
            .documentIds(listOf("string"))
            .bankId("bank_id")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            MemoryDocumentRetrieveParams.builder()
                .documentIds(listOf("string"))
                .bankId("bank_id")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("bank_id", listOf("bank_id"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            MemoryDocumentRetrieveParams.builder()
                .documentIds(listOf("string"))
                .bankId("bank_id")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("bank_id", listOf("bank_id"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getBody() {
        val params =
            MemoryDocumentRetrieveParams.builder()
                .documentIds(listOf("string"))
                .bankId("bank_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.documentIds()).isEqualTo(listOf("string"))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            MemoryDocumentRetrieveParams.builder()
                .documentIds(listOf("string"))
                .bankId("bank_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.documentIds()).isEqualTo(listOf("string"))
    }
}
