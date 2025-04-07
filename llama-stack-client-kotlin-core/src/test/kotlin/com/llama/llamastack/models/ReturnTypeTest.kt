// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReturnTypeTest {

    @Test
    fun create() {
        val returnType = ReturnType.builder().type(ReturnType.Type.STRING).build()

        assertThat(returnType.type()).isEqualTo(ReturnType.Type.STRING)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val returnType = ReturnType.builder().type(ReturnType.Type.STRING).build()

        val roundtrippedReturnType =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(returnType),
                jacksonTypeRef<ReturnType>(),
            )

        assertThat(roundtrippedReturnType).isEqualTo(returnType)
    }
}
