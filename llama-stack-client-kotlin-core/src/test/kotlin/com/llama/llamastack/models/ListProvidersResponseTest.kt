// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListProvidersResponseTest {

    @Test
    fun create() {
        val listProvidersResponse =
            ListProvidersResponse.builder()
                .addData(
                    ProviderInfo.builder()
                        .api("api")
                        .config(
                            ProviderInfo.Config.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .health(
                            ProviderInfo.Health.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .providerId("provider_id")
                        .providerType("provider_type")
                        .build()
                )
                .build()

        assertThat(listProvidersResponse.data())
            .containsExactly(
                ProviderInfo.builder()
                    .api("api")
                    .config(
                        ProviderInfo.Config.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .health(
                        ProviderInfo.Health.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .providerId("provider_id")
                    .providerType("provider_type")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val listProvidersResponse =
            ListProvidersResponse.builder()
                .addData(
                    ProviderInfo.builder()
                        .api("api")
                        .config(
                            ProviderInfo.Config.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .health(
                            ProviderInfo.Health.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .providerId("provider_id")
                        .providerType("provider_type")
                        .build()
                )
                .build()

        val roundtrippedListProvidersResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(listProvidersResponse),
                jacksonTypeRef<ListProvidersResponse>(),
            )

        assertThat(roundtrippedListProvidersResponse).isEqualTo(listProvidersResponse)
    }
}
