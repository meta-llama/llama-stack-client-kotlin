// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class UserMessageTest {

    @Test
    fun createUserMessage() {
        val userMessage =
            UserMessage.builder()
                .content(UserMessage.Content.ofString("string"))
                .role(UserMessage.Role.USER)
                .context(UserMessage.Context.ofString("string"))
                .build()
        assertThat(userMessage).isNotNull
        assertThat(userMessage.content()).isEqualTo(UserMessage.Content.ofString("string"))
        assertThat(userMessage.role()).isEqualTo(UserMessage.Role.USER)
        assertThat(userMessage.context()).isEqualTo(UserMessage.Context.ofString("string"))
    }
}
