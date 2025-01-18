// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ListModelsResponseTest {

    @Test
    fun createListModelsResponse() {
        val listModelsResponse =
            ListModelsResponse.builder()
                .data(
                    listOf(
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
                            .type(Model.Type.MODEL)
                            .build()
                    )
                )
                .build()
        assertThat(listModelsResponse).isNotNull
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
                    .type(Model.Type.MODEL)
                    .build()
            )
    }
}
