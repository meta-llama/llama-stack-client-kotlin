// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SystemMessageTest {

    @Test
    fun createSystemMessage() {
        val systemMessage = SystemMessage.builder().content("string").build()
        assertThat(systemMessage).isNotNull
        assertThat(systemMessage.content()).isEqualTo(InterleavedContent.ofString("string"))
    }
}
