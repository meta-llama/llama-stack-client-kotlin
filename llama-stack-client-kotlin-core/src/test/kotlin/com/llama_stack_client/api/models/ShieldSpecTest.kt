// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ShieldSpecTest {

    @Test
    fun createShieldSpec() {
        val shieldSpec =
            ShieldSpec.builder()
                .providerConfig(
                    ShieldSpec.ProviderConfig.builder()
                        .config(ShieldSpec.ProviderConfig.Config.builder().build())
                        .providerId("provider_id")
                        .build()
                )
                .shieldType("shield_type")
                .build()
        assertThat(shieldSpec).isNotNull
        assertThat(shieldSpec.providerConfig())
            .isEqualTo(
                ShieldSpec.ProviderConfig.builder()
                    .config(ShieldSpec.ProviderConfig.Config.builder().build())
                    .providerId("provider_id")
                    .build()
            )
        assertThat(shieldSpec.shieldType()).isEqualTo("shield_type")
    }
}
