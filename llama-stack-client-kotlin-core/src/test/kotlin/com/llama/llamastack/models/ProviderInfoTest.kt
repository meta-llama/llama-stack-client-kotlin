// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProviderInfoTest {

    @Test
    fun createProviderInfo() {
        val providerInfo =
            ProviderInfo.builder()
                .api("api")
                .config(
                    ProviderInfo.Config.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .providerId("provider_id")
                .providerType("provider_type")
                .build()
        assertThat(providerInfo).isNotNull
        assertThat(providerInfo.api()).isEqualTo("api")
        assertThat(providerInfo.config())
            .isEqualTo(
                ProviderInfo.Config.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(providerInfo.providerId()).isEqualTo("provider_id")
        assertThat(providerInfo.providerType()).isEqualTo("provider_type")
    }
}
