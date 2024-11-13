// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InferenceEmbeddingsParamsTest {

    @Test
    fun createInferenceEmbeddingsParams() {
        InferenceEmbeddingsParams.builder()
            .contents(listOf(InferenceEmbeddingsParams.Content.ofString("string")))
            .model("model")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            InferenceEmbeddingsParams.builder()
                .contents(listOf(InferenceEmbeddingsParams.Content.ofString("string")))
                .model("model")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.contents())
            .isEqualTo(listOf(InferenceEmbeddingsParams.Content.ofString("string")))
        assertThat(body.model()).isEqualTo("model")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            InferenceEmbeddingsParams.builder()
                .contents(listOf(InferenceEmbeddingsParams.Content.ofString("string")))
                .model("model")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.contents())
            .isEqualTo(listOf(InferenceEmbeddingsParams.Content.ofString("string")))
        assertThat(body.model()).isEqualTo("model")
    }
}
