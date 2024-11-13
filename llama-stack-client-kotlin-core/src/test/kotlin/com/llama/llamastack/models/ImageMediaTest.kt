// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ImageMediaTest {

    @Test
    fun createImageMedia() {
        val imageMedia =
            ImageMedia.builder()
                .image(
                    ImageMedia.Image.ofThisClassRepresentsAnImageObjectToCreate(
                        ImageMedia.Image.ThisClassRepresentsAnImageObjectToCreate.builder()
                            .format("format")
                            .formatDescription("format_description")
                            .build()
                    )
                )
                .build()
        assertThat(imageMedia).isNotNull
        assertThat(imageMedia.image())
            .isEqualTo(
                ImageMedia.Image.ofThisClassRepresentsAnImageObjectToCreate(
                    ImageMedia.Image.ThisClassRepresentsAnImageObjectToCreate.builder()
                        .format("format")
                        .formatDescription("format_description")
                        .build()
                )
            )
    }
}
