// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import com.llama_stack_client.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ModelGetParamsTest {

    @Test
    fun createModelGetParams() {
        ModelGetParams.builder().coreModelId("core_model_id").build()
    }

    @Test
    fun getQueryParams() {
        val params = ModelGetParams.builder().coreModelId("core_model_id").build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("core_model_id", listOf("core_model_id"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = ModelGetParams.builder().coreModelId("core_model_id").build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("core_model_id", listOf("core_model_id"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
