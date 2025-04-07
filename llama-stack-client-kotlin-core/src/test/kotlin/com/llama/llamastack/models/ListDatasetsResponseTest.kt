// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListDatasetsResponseTest {

    @Test
    fun create() {
        val listDatasetsResponse =
            ListDatasetsResponse.builder()
                .addData(
                    ListDatasetsResponse.Data.builder()
                        .identifier("identifier")
                        .metadata(
                            ListDatasetsResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .providerId("provider_id")
                        .providerResourceId("provider_resource_id")
                        .purpose(ListDatasetsResponse.Data.Purpose.POST_TRAINING_MESSAGES)
                        .uriDataSource("uri")
                        .build()
                )
                .build()

        assertThat(listDatasetsResponse.data())
            .containsExactly(
                ListDatasetsResponse.Data.builder()
                    .identifier("identifier")
                    .metadata(
                        ListDatasetsResponse.Data.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .providerId("provider_id")
                    .providerResourceId("provider_resource_id")
                    .purpose(ListDatasetsResponse.Data.Purpose.POST_TRAINING_MESSAGES)
                    .uriDataSource("uri")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val listDatasetsResponse =
            ListDatasetsResponse.builder()
                .addData(
                    ListDatasetsResponse.Data.builder()
                        .identifier("identifier")
                        .metadata(
                            ListDatasetsResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .providerId("provider_id")
                        .providerResourceId("provider_resource_id")
                        .purpose(ListDatasetsResponse.Data.Purpose.POST_TRAINING_MESSAGES)
                        .uriDataSource("uri")
                        .build()
                )
                .build()

        val roundtrippedListDatasetsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(listDatasetsResponse),
                jacksonTypeRef<ListDatasetsResponse>(),
            )

        assertThat(roundtrippedListDatasetsResponse).isEqualTo(listDatasetsResponse)
    }
}
