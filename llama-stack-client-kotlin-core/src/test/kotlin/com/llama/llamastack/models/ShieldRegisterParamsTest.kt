// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ShieldRegisterParamsTest {

    @Test
    fun create() {
        ShieldRegisterParams.builder()
            .shieldId("shield_id")
            .params(
                ShieldRegisterParams.Params.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
            .providerId("provider_id")
            .providerShieldId("provider_shield_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            ShieldRegisterParams.builder()
                .shieldId("shield_id")
                .params(
                    ShieldRegisterParams.Params.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .providerId("provider_id")
                .providerShieldId("provider_shield_id")
                .build()

        val body = params._body()

        assertThat(body.shieldId()).isEqualTo("shield_id")
        assertThat(body.params())
            .isEqualTo(
                ShieldRegisterParams.Params.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(body.providerId()).isEqualTo("provider_id")
        assertThat(body.providerShieldId()).isEqualTo("provider_shield_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ShieldRegisterParams.builder().shieldId("shield_id").build()

        val body = params._body()

        assertThat(body.shieldId()).isEqualTo("shield_id")
    }
}
