// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DatasetListResponseTest {

    @Test
    fun createDatasetListResponse() {
        val datasetListResponse =
            DatasetListResponse.builder()
                .data(
                    listOf(
                        DatasetListResponse.Data.builder()
                            .datasetSchema(
                                DatasetListResponse.Data.DatasetSchema.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf("type" to "string"))
                                    )
                                    .build()
                            )
                            .identifier("identifier")
                            .metadata(
                                DatasetListResponse.Data.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from(true))
                                    .build()
                            )
                            .providerId("provider_id")
                            .providerResourceId("provider_resource_id")
                            .type(DatasetListResponse.Data.Type.DATASET)
                            .url(Url.builder().uri("uri").build())
                            .build()
                    )
                )
                .build()
        assertThat(datasetListResponse).isNotNull
        assertThat(datasetListResponse.data())
            .containsExactly(
                DatasetListResponse.Data.builder()
                    .datasetSchema(
                        DatasetListResponse.Data.DatasetSchema.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf("type" to "string")))
                            .build()
                    )
                    .identifier("identifier")
                    .metadata(
                        DatasetListResponse.Data.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .providerId("provider_id")
                    .providerResourceId("provider_resource_id")
                    .type(DatasetListResponse.Data.Type.DATASET)
                    .url(Url.builder().uri("uri").build())
                    .build()
            )
    }
}
