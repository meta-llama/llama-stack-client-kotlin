// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ModelTest {

    @Test
    fun createModel() {
        val model =
            Model.builder()
                .identifier("identifier")
                .metadata(
                    Model.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .modelType(Model.ModelType.LLM)
                .providerId("provider_id")
                .providerResourceId("provider_resource_id")
                .build()
        assertThat(model).isNotNull
        assertThat(model.identifier()).isEqualTo("identifier")
        assertThat(model.metadata())
            .isEqualTo(
                Model.Metadata.builder().putAdditionalProperty("foo", JsonValue.from(true)).build()
            )
        assertThat(model.modelType()).isEqualTo(Model.ModelType.LLM)
        assertThat(model.providerId()).isEqualTo("provider_id")
        assertThat(model.providerResourceId()).isEqualTo("provider_resource_id")
    }
}
