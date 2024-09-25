// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import com.llama_stack_client.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ShieldGetParamsTest {

    @Test
    fun createShieldGetParams() {
        ShieldGetParams.builder().shieldType("shield_type").build()
    }

    @Test
    fun getQueryParams() {
        val params = ShieldGetParams.builder().shieldType("shield_type").build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("shield_type", listOf("shield_type"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = ShieldGetParams.builder().shieldType("shield_type").build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("shield_type", listOf("shield_type"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
