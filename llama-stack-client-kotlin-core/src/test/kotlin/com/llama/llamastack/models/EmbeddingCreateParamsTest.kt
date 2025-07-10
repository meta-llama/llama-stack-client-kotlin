// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmbeddingCreateParamsTest {

    @Test
    fun create() {
        EmbeddingCreateParams.builder()
            .input("string")
            .model("model")
            .dimensions(0L)
            .encodingFormat("encoding_format")
            .user("user")
            .build()
    }

    @Test
    fun body() {
        val params =
            EmbeddingCreateParams.builder()
                .input("string")
                .model("model")
                .dimensions(0L)
                .encodingFormat("encoding_format")
                .user("user")
                .build()

        val body = params._body()

        assertThat(body.input()).isEqualTo(EmbeddingCreateParams.Input.ofString("string"))
        assertThat(body.model()).isEqualTo("model")
        assertThat(body.dimensions()).isEqualTo(0L)
        assertThat(body.encodingFormat()).isEqualTo("encoding_format")
        assertThat(body.user()).isEqualTo("user")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = EmbeddingCreateParams.builder().input("string").model("model").build()

        val body = params._body()

        assertThat(body.input()).isEqualTo(EmbeddingCreateParams.Input.ofString("string"))
        assertThat(body.model()).isEqualTo("model")
    }
}
