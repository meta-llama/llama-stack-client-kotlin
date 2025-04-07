// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListModelsResponseTest {

    @Test
    fun create() {
        val listModelsResponse =
            ListModelsResponse.builder()
                .addData(
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
                )
                .build()

        assertThat(listModelsResponse.data())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val listModelsResponse =
            ListModelsResponse.builder()
                .addData(
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
                )
                .build()

        val roundtrippedListModelsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(listModelsResponse),
                jacksonTypeRef<ListModelsResponse>(),
            )

        assertThat(roundtrippedListModelsResponse).isEqualTo(listModelsResponse)
    }
}
