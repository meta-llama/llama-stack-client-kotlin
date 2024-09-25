// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SystemMessageTest {

    @Test
    fun createSystemMessage() {
        val systemMessage =
            SystemMessage.builder()
                .content(SystemMessage.Content.ofString("string"))
                .role(SystemMessage.Role.SYSTEM)
                .build()
        assertThat(systemMessage).isNotNull
        assertThat(systemMessage.content()).isEqualTo(SystemMessage.Content.ofString("string"))
        assertThat(systemMessage.role()).isEqualTo(SystemMessage.Role.SYSTEM)
    }
}
