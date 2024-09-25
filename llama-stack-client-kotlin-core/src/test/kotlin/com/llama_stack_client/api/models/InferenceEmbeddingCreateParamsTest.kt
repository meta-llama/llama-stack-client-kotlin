// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import com.llama_stack_client.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InferenceEmbeddingCreateParamsTest {

    @Test
    fun createInferenceEmbeddingCreateParams() {
        InferenceEmbeddingCreateParams.builder()
            .contents(listOf(InferenceEmbeddingCreateParams.Content.ofString("string")))
            .model("model")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            InferenceEmbeddingCreateParams.builder()
                .contents(listOf(InferenceEmbeddingCreateParams.Content.ofString("string")))
                .model("model")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.contents())
            .isEqualTo(listOf(InferenceEmbeddingCreateParams.Content.ofString("string")))
        assertThat(body.model()).isEqualTo("model")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            InferenceEmbeddingCreateParams.builder()
                .contents(listOf(InferenceEmbeddingCreateParams.Content.ofString("string")))
                .model("model")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.contents())
            .isEqualTo(listOf(InferenceEmbeddingCreateParams.Content.ofString("string")))
        assertThat(body.model()).isEqualTo("model")
    }
}
