// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ReturnTypeTest {

    @Test
    fun createReturnType() {
        val returnType = ReturnType.builder().type(ReturnType.Type.STRING).build()
        assertThat(returnType).isNotNull
        assertThat(returnType.type()).isEqualTo(ReturnType.Type.STRING)
    }
}
