// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import com.llama_stack_client.api.core.JsonValue
import com.llama_stack_client.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MemoryCreateParamsTest {

    @Test
    fun createMemoryCreateParams() {
        MemoryCreateParams.builder().body(JsonValue.from(mapOf<String, Any>())).build()
    }

    @Test
    fun getBody() {
        val params = MemoryCreateParams.builder().body(JsonValue.from(mapOf<String, Any>())).build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = MemoryCreateParams.builder().body(JsonValue.from(mapOf<String, Any>())).build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }
}
