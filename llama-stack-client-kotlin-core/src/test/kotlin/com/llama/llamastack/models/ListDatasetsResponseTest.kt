// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ListDatasetsResponseTest {

    @Test
    fun createListDatasetsResponse() {
        val listDatasetsResponse =
            ListDatasetsResponse.builder()
                .addData(
                    ListDatasetsResponse.Data.builder()
                        .datasetSchema(
                            ListDatasetsResponse.Data.DatasetSchema.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(mapOf("type" to "string"))
                                )
                                .build()
                        )
                        .identifier("identifier")
                        .metadata(
                            ListDatasetsResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .providerId("provider_id")
                        .providerResourceId("provider_resource_id")
                        .url(Url.builder().uri("uri").build())
                        .build()
                )
                .build()
        assertThat(listDatasetsResponse).isNotNull
        assertThat(listDatasetsResponse.data())
            .containsExactly(
                ListDatasetsResponse.Data.builder()
                    .datasetSchema(
                        ListDatasetsResponse.Data.DatasetSchema.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf("type" to "string")))
                            .build()
                    )
                    .identifier("identifier")
                    .metadata(
                        ListDatasetsResponse.Data.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .providerId("provider_id")
                    .providerResourceId("provider_resource_id")
                    .url(Url.builder().uri("uri").build())
                    .build()
            )
    }
}
