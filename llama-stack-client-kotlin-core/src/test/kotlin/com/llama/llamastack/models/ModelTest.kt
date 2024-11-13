// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ModelTest {

    @Test
    fun createModel() {
        val model =
            Model.builder()
                .identifier("identifier")
                .metadata(Model.Metadata.builder().build())
                .providerId("provider_id")
                .providerResourceId("provider_resource_id")
                .type(Model.Type.MODEL)
                .build()
        assertThat(model).isNotNull
        assertThat(model.identifier()).isEqualTo("identifier")
        assertThat(model.metadata()).isEqualTo(Model.Metadata.builder().build())
        assertThat(model.providerId()).isEqualTo("provider_id")
        assertThat(model.providerResourceId()).isEqualTo("provider_resource_id")
        assertThat(model.type()).isEqualTo(Model.Type.MODEL)
    }
}
