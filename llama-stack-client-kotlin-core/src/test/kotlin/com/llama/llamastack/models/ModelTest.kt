// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ModelTest {

    @Test
    fun create() {
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

        assertThat(model.identifier()).isEqualTo("identifier")
        assertThat(model.metadata())
            .isEqualTo(
                Model.Metadata.builder().putAdditionalProperty("foo", JsonValue.from(true)).build()
            )
        assertThat(model.modelType()).isEqualTo(Model.ModelType.LLM)
        assertThat(model.providerId()).isEqualTo("provider_id")
        assertThat(model.providerResourceId()).isEqualTo("provider_resource_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
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

        val roundtrippedModel =
            jsonMapper.readValue(jsonMapper.writeValueAsString(model), jacksonTypeRef<Model>())

        assertThat(roundtrippedModel).isEqualTo(model)
    }
}
