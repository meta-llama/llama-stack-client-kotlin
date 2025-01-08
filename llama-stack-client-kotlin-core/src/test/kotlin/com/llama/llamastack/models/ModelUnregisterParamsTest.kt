// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ModelUnregisterParamsTest {

    @Test
    fun createModelUnregisterParams() {
        ModelUnregisterParams.builder()
            .modelId("model_id")
            .xLlamaStackProviderData("X-LlamaStack-ProviderData")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ModelUnregisterParams.builder()
                .modelId("model_id")
                .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.modelId()).isEqualTo("model_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = ModelUnregisterParams.builder().modelId("model_id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.modelId()).isEqualTo("model_id")
    }
}
