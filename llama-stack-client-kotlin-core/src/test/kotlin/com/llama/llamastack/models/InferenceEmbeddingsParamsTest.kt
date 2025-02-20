// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InferenceEmbeddingsParamsTest {

    @Test
    fun create() {
        InferenceEmbeddingsParams.builder().addContent("string").modelId("model_id").build()
    }

    @Test
    fun body() {
        val params =
            InferenceEmbeddingsParams.builder().addContent("string").modelId("model_id").build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.contents()).isEqualTo(listOf(InterleavedContent.ofString("string")))
        assertThat(body.modelId()).isEqualTo("model_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InferenceEmbeddingsParams.builder().addContent("string").modelId("model_id").build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.contents()).isEqualTo(listOf(InterleavedContent.ofString("string")))
        assertThat(body.modelId()).isEqualTo("model_id")
    }
}
