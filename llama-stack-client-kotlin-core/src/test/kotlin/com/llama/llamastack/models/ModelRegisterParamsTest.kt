// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ModelRegisterParamsTest {

    @Test
    fun createModelRegisterParams() {
        ModelRegisterParams.builder()
            .modelId("model_id")
            .metadata(ModelRegisterParams.Metadata.builder().build())
            .providerId("provider_id")
            .providerModelId("provider_model_id")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ModelRegisterParams.builder()
                .modelId("model_id")
                .metadata(ModelRegisterParams.Metadata.builder().build())
                .providerId("provider_id")
                .providerModelId("provider_model_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.modelId()).isEqualTo("model_id")
        assertThat(body.metadata()).isEqualTo(ModelRegisterParams.Metadata.builder().build())
        assertThat(body.providerId()).isEqualTo("provider_id")
        assertThat(body.providerModelId()).isEqualTo("provider_model_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = ModelRegisterParams.builder().modelId("model_id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.modelId()).isEqualTo("model_id")
    }
}
