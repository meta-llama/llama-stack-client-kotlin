// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ShieldRegisterParamsTest {

    @Test
    fun createShieldRegisterParams() {
        ShieldRegisterParams.builder()
            .shieldId("shield_id")
            .shieldType(ShieldRegisterParams.ShieldType.GENERIC_CONTENT_SHIELD)
            .params(ShieldRegisterParams.Params.builder().build())
            .providerId("provider_id")
            .providerShieldId("provider_shield_id")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ShieldRegisterParams.builder()
                .shieldId("shield_id")
                .shieldType(ShieldRegisterParams.ShieldType.GENERIC_CONTENT_SHIELD)
                .params(ShieldRegisterParams.Params.builder().build())
                .providerId("provider_id")
                .providerShieldId("provider_shield_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.shieldId()).isEqualTo("shield_id")
        assertThat(body.shieldType())
            .isEqualTo(ShieldRegisterParams.ShieldType.GENERIC_CONTENT_SHIELD)
        assertThat(body.params()).isEqualTo(ShieldRegisterParams.Params.builder().build())
        assertThat(body.providerId()).isEqualTo("provider_id")
        assertThat(body.providerShieldId()).isEqualTo("provider_shield_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ShieldRegisterParams.builder()
                .shieldId("shield_id")
                .shieldType(ShieldRegisterParams.ShieldType.GENERIC_CONTENT_SHIELD)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.shieldId()).isEqualTo("shield_id")
        assertThat(body.shieldType())
            .isEqualTo(ShieldRegisterParams.ShieldType.GENERIC_CONTENT_SHIELD)
    }
}
