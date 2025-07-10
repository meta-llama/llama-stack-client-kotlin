// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class ContentDeltaTest {

    @Test
    fun ofText() {
        val text = ContentDelta.Text.builder().text("text").build()

        val contentDelta = ContentDelta.ofText(text)

        assertThat(contentDelta.text()).isEqualTo(text)
        assertThat(contentDelta.image()).isNull()
        assertThat(contentDelta.toolCall()).isNull()
    }

    @Test
    fun ofTextRoundtrip() {
        val jsonMapper = jsonMapper()
        val contentDelta = ContentDelta.ofText(ContentDelta.Text.builder().text("text").build())

        val roundtrippedContentDelta =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contentDelta),
                jacksonTypeRef<ContentDelta>(),
            )

        assertThat(roundtrippedContentDelta).isEqualTo(contentDelta)
    }

    @Test
    fun ofImage() {
        val image = ContentDelta.Image.builder().image("image").build()

        val contentDelta = ContentDelta.ofImage(image)

        assertThat(contentDelta.text()).isNull()
        assertThat(contentDelta.image()).isEqualTo(image)
        assertThat(contentDelta.toolCall()).isNull()
    }

    @Test
    fun ofImageRoundtrip() {
        val jsonMapper = jsonMapper()
        val contentDelta = ContentDelta.ofImage(ContentDelta.Image.builder().image("image").build())

        val roundtrippedContentDelta =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contentDelta),
                jacksonTypeRef<ContentDelta>(),
            )

        assertThat(roundtrippedContentDelta).isEqualTo(contentDelta)
    }

    @Test
    fun ofToolCall() {
        val toolCall =
            ContentDelta.ToolCall.builder()
                .parseStatus(ContentDelta.ToolCall.ParseStatus.STARTED)
                .toolCall("string")
                .build()

        val contentDelta = ContentDelta.ofToolCall(toolCall)

        assertThat(contentDelta.text()).isNull()
        assertThat(contentDelta.image()).isNull()
        assertThat(contentDelta.toolCall()).isEqualTo(toolCall)
    }

    @Test
    fun ofToolCallRoundtrip() {
        val jsonMapper = jsonMapper()
        val contentDelta =
            ContentDelta.ofToolCall(
                ContentDelta.ToolCall.builder()
                    .parseStatus(ContentDelta.ToolCall.ParseStatus.STARTED)
                    .toolCall("string")
                    .build()
            )

        val roundtrippedContentDelta =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contentDelta),
                jacksonTypeRef<ContentDelta>(),
            )

        assertThat(roundtrippedContentDelta).isEqualTo(contentDelta)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val contentDelta = jsonMapper().convertValue(testCase.value, jacksonTypeRef<ContentDelta>())

        val e = assertThrows<LlamaStackClientInvalidDataException> { contentDelta.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
