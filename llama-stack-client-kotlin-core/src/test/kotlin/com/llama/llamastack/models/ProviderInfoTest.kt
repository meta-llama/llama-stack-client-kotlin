// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProviderInfoTest {

    @Test
    fun create() {
        val providerInfo =
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

        assertThat(providerInfo.api()).isEqualTo("api")
        assertThat(providerInfo.config())
            .isEqualTo(
                ProviderInfo.Config.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(providerInfo.health())
            .isEqualTo(
                ProviderInfo.Health.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(providerInfo.providerId()).isEqualTo("provider_id")
        assertThat(providerInfo.providerType()).isEqualTo("provider_type")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val providerInfo =
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

        val roundtrippedProviderInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(providerInfo),
                jacksonTypeRef<ProviderInfo>(),
            )

        assertThat(roundtrippedProviderInfo).isEqualTo(providerInfo)
    }
}
