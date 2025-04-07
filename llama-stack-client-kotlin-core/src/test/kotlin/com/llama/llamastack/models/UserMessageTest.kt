// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserMessageTest {

    @Test
    fun create() {
        val userMessage = UserMessage.builder().content("string").context("string").build()

        assertThat(userMessage.content()).isEqualTo(InterleavedContent.ofString("string"))
        assertThat(userMessage.context()).isEqualTo(InterleavedContent.ofString("string"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userMessage = UserMessage.builder().content("string").context("string").build()

        val roundtrippedUserMessage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userMessage),
                jacksonTypeRef<UserMessage>(),
            )

        assertThat(roundtrippedUserMessage).isEqualTo(userMessage)
    }
}
