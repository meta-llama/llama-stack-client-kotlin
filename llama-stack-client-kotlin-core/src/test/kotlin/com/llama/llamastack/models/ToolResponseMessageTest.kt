// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolResponseMessageTest {

    @Test
    fun create() {
        val toolResponseMessage =
            ToolResponseMessage.builder().callId("call_id").content("string").build()

        assertThat(toolResponseMessage.callId()).isEqualTo("call_id")
        assertThat(toolResponseMessage.content()).isEqualTo(InterleavedContent.ofString("string"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val toolResponseMessage =
            ToolResponseMessage.builder().callId("call_id").content("string").build()

        val roundtrippedToolResponseMessage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(toolResponseMessage),
                jacksonTypeRef<ToolResponseMessage>(),
            )

        assertThat(roundtrippedToolResponseMessage).isEqualTo(toolResponseMessage)
    }
}
