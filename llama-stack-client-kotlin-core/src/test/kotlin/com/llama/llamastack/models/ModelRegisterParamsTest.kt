// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ModelRegisterParamsTest {

    @Test
    fun create() {
        ModelRegisterParams.builder()
            .modelId("model_id")
            .metadata(
                ModelRegisterParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
            .modelType(ModelRegisterParams.ModelType.LLM)
            .providerId("provider_id")
            .providerModelId("provider_model_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            ModelRegisterParams.builder()
                .modelId("model_id")
                .metadata(
                    ModelRegisterParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .modelType(ModelRegisterParams.ModelType.LLM)
                .providerId("provider_id")
                .providerModelId("provider_model_id")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.modelId()).isEqualTo("model_id")
        assertThat(body.metadata())
            .isEqualTo(
                ModelRegisterParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(body.modelType()).isEqualTo(ModelRegisterParams.ModelType.LLM)
        assertThat(body.providerId()).isEqualTo("provider_id")
        assertThat(body.providerModelId()).isEqualTo("provider_model_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ModelRegisterParams.builder().modelId("model_id").build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.modelId()).isEqualTo("model_id")
    }
}
