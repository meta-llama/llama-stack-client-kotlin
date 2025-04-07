// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InterleavedContentTest {

    @Test
    fun ofString() {
        val string = "string"

        val interleavedContent = InterleavedContent.ofString(string)

        assertThat(interleavedContent.string()).isEqualTo(string)
        assertThat(interleavedContent.imageContentItem()).isNull()
        assertThat(interleavedContent.textContentItem()).isNull()
        assertThat(interleavedContent.items()).isNull()
    }

    @Test
    fun ofStringRoundtrip() {
        val jsonMapper = jsonMapper()
        val interleavedContent = InterleavedContent.ofString("string")

        val roundtrippedInterleavedContent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(interleavedContent),
                jacksonTypeRef<InterleavedContent>(),
            )

        assertThat(roundtrippedInterleavedContent).isEqualTo(interleavedContent)
    }

    @Test
    fun ofImageContentItem() {
        val imageContentItem =
            InterleavedContent.ImageContentItem.builder()
                .image(
                    InterleavedContent.ImageContentItem.Image.builder()
                        .data("data")
                        .url(
                            InterleavedContent.ImageContentItem.Image.Url.builder()
                                .uri("uri")
                                .build()
                        )
                        .build()
                )
                .build()

        val interleavedContent = InterleavedContent.ofImageContentItem(imageContentItem)

        assertThat(interleavedContent.string()).isNull()
        assertThat(interleavedContent.imageContentItem()).isEqualTo(imageContentItem)
        assertThat(interleavedContent.textContentItem()).isNull()
        assertThat(interleavedContent.items()).isNull()
    }

    @Test
    fun ofImageContentItemRoundtrip() {
        val jsonMapper = jsonMapper()
        val interleavedContent =
            InterleavedContent.ofImageContentItem(
                InterleavedContent.ImageContentItem.builder()
                    .image(
                        InterleavedContent.ImageContentItem.Image.builder()
                            .data("data")
                            .url(
                                InterleavedContent.ImageContentItem.Image.Url.builder()
                                    .uri("uri")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val roundtrippedInterleavedContent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(interleavedContent),
                jacksonTypeRef<InterleavedContent>(),
            )

        assertThat(roundtrippedInterleavedContent).isEqualTo(interleavedContent)
    }

    @Test
    fun ofTextContentItem() {
        val textContentItem = InterleavedContent.TextContentItem.builder().text("text").build()

        val interleavedContent = InterleavedContent.ofTextContentItem(textContentItem)

        assertThat(interleavedContent.string()).isNull()
        assertThat(interleavedContent.imageContentItem()).isNull()
        assertThat(interleavedContent.textContentItem()).isEqualTo(textContentItem)
        assertThat(interleavedContent.items()).isNull()
    }

    @Test
    fun ofTextContentItemRoundtrip() {
        val jsonMapper = jsonMapper()
        val interleavedContent =
            InterleavedContent.ofTextContentItem(
                InterleavedContent.TextContentItem.builder().text("text").build()
            )

        val roundtrippedInterleavedContent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(interleavedContent),
                jacksonTypeRef<InterleavedContent>(),
            )

        assertThat(roundtrippedInterleavedContent).isEqualTo(interleavedContent)
    }

    @Test
    fun ofItems() {
        val items =
            listOf(
                InterleavedContentItem.ofImage(
                    InterleavedContentItem.ImageContentItem.builder()
                        .image(
                            InterleavedContentItem.ImageContentItem.Image.builder()
                                .data("data")
                                .url(
                                    InterleavedContentItem.ImageContentItem.Image.Url.builder()
                                        .uri("uri")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
            )

        val interleavedContent = InterleavedContent.ofItems(items)

        assertThat(interleavedContent.string()).isNull()
        assertThat(interleavedContent.imageContentItem()).isNull()
        assertThat(interleavedContent.textContentItem()).isNull()
        assertThat(interleavedContent.items()).isEqualTo(items)
    }

    @Test
    fun ofItemsRoundtrip() {
        val jsonMapper = jsonMapper()
        val interleavedContent =
            InterleavedContent.ofItems(
                listOf(
                    InterleavedContentItem.ofImage(
                        InterleavedContentItem.ImageContentItem.builder()
                            .image(
                                InterleavedContentItem.ImageContentItem.Image.builder()
                                    .data("data")
                                    .url(
                                        InterleavedContentItem.ImageContentItem.Image.Url.builder()
                                            .uri("uri")
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                )
            )

        val roundtrippedInterleavedContent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(interleavedContent),
                jacksonTypeRef<InterleavedContent>(),
            )

        assertThat(roundtrippedInterleavedContent).isEqualTo(interleavedContent)
    }
}
