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

internal class InterleavedContentItemTest {

    @Test
    fun ofImage() {
        val image =
            InterleavedContentItem.Image.builder()
                .image(
                    InterleavedContentItem.Image.InnerImage.builder()
                        .data("data")
                        .url(
                            InterleavedContentItem.Image.InnerImage.Url.builder().uri("uri").build()
                        )
                        .build()
                )
                .build()

        val interleavedContentItem = InterleavedContentItem.ofImage(image)

        assertThat(interleavedContentItem.image()).isEqualTo(image)
        assertThat(interleavedContentItem.text()).isNull()
    }

    @Test
    fun ofImageRoundtrip() {
        val jsonMapper = jsonMapper()
        val interleavedContentItem =
            InterleavedContentItem.ofImage(
                InterleavedContentItem.Image.builder()
                    .image(
                        InterleavedContentItem.Image.InnerImage.builder()
                            .data("data")
                            .url(
                                InterleavedContentItem.Image.InnerImage.Url.builder()
                                    .uri("uri")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val roundtrippedInterleavedContentItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(interleavedContentItem),
                jacksonTypeRef<InterleavedContentItem>(),
            )

        assertThat(roundtrippedInterleavedContentItem).isEqualTo(interleavedContentItem)
    }

    @Test
    fun ofText() {
        val text = InterleavedContentItem.Text.builder().text("text").build()

        val interleavedContentItem = InterleavedContentItem.ofText(text)

        assertThat(interleavedContentItem.image()).isNull()
        assertThat(interleavedContentItem.text()).isEqualTo(text)
    }

    @Test
    fun ofTextRoundtrip() {
        val jsonMapper = jsonMapper()
        val interleavedContentItem =
            InterleavedContentItem.ofText(
                InterleavedContentItem.Text.builder().text("text").build()
            )

        val roundtrippedInterleavedContentItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(interleavedContentItem),
                jacksonTypeRef<InterleavedContentItem>(),
            )

        assertThat(roundtrippedInterleavedContentItem).isEqualTo(interleavedContentItem)
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
        val interleavedContentItem =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<InterleavedContentItem>())

        val e =
            assertThrows<LlamaStackClientInvalidDataException> { interleavedContentItem.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
