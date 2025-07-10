// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListShieldsResponseTest {

    @Test
    fun create() {
        val listShieldsResponse =
            ListShieldsResponse.builder()
                .addData(
                    Shield.builder()
                        .identifier("identifier")
                        .providerId("provider_id")
                        .params(
                            Shield.Params.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .providerResourceId("provider_resource_id")
                        .build()
                )
                .build()

        assertThat(listShieldsResponse.data())
            .containsExactly(
                Shield.builder()
                    .identifier("identifier")
                    .providerId("provider_id")
                    .params(
                        Shield.Params.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .providerResourceId("provider_resource_id")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val listShieldsResponse =
            ListShieldsResponse.builder()
                .addData(
                    Shield.builder()
                        .identifier("identifier")
                        .providerId("provider_id")
                        .params(
                            Shield.Params.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .providerResourceId("provider_resource_id")
                        .build()
                )
                .build()

        val roundtrippedListShieldsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(listShieldsResponse),
                jacksonTypeRef<ListShieldsResponse>(),
            )

        assertThat(roundtrippedListShieldsResponse).isEqualTo(listShieldsResponse)
    }
}
