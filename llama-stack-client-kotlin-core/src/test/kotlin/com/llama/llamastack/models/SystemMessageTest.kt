// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SystemMessageTest {

    @Test
    fun create() {
        val systemMessage = SystemMessage.builder().content("string").build()

        assertThat(systemMessage.content()).isEqualTo(InterleavedContent.ofString("string"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val systemMessage = SystemMessage.builder().content("string").build()

        val roundtrippedSystemMessage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(systemMessage),
                jacksonTypeRef<SystemMessage>(),
            )

        assertThat(roundtrippedSystemMessage).isEqualTo(systemMessage)
    }
}
