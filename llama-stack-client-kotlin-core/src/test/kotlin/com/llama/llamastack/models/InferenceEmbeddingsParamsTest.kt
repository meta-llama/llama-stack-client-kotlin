// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InferenceEmbeddingsParamsTest {

    @Test
    fun createInferenceEmbeddingsParams() {
        InferenceEmbeddingsParams.builder()
            .addContent("string")
            .modelId("model_id")
            .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
            .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            InferenceEmbeddingsParams.builder()
                .addContent("string")
                .modelId("model_id")
                .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.contents()).isEqualTo(listOf(InterleavedContent.ofString("string")))
        assertThat(body.modelId()).isEqualTo("model_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            InferenceEmbeddingsParams.builder().addContent("string").modelId("model_id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.contents()).isEqualTo(listOf(InterleavedContent.ofString("string")))
        assertThat(body.modelId()).isEqualTo("model_id")
    }
}
