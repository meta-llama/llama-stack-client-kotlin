// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import com.llama_stack_client.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ModelServingSpecTest {

    @Test
    fun createModelServingSpec() {
        val modelServingSpec =
            ModelServingSpec.builder()
                .llamaModel(JsonValue.from(mapOf<String, Any>()))
                .providerConfig(
                    ModelServingSpec.ProviderConfig.builder()
                        .config(ModelServingSpec.ProviderConfig.Config.builder().build())
                        .providerId("provider_id")
                        .build()
                )
                .build()
        assertThat(modelServingSpec).isNotNull
        assertThat(modelServingSpec._llamaModel()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(modelServingSpec.providerConfig())
            .isEqualTo(
                ModelServingSpec.ProviderConfig.builder()
                    .config(ModelServingSpec.ProviderConfig.Config.builder().build())
                    .providerId("provider_id")
                    .build()
            )
    }
}
