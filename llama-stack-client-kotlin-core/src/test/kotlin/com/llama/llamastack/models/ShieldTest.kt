// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ShieldTest {

    @Test
    fun createShield() {
        val shield =
            Shield.builder()
                .identifier("identifier")
                .providerId("provider_id")
                .providerResourceId("provider_resource_id")
                .type(Shield.Type.SHIELD)
                .params(Shield.Params.builder().build())
                .build()
        assertThat(shield).isNotNull
        assertThat(shield.identifier()).isEqualTo("identifier")
        assertThat(shield.providerId()).isEqualTo("provider_id")
        assertThat(shield.providerResourceId()).isEqualTo("provider_resource_id")
        assertThat(shield.type()).isEqualTo(Shield.Type.SHIELD)
        assertThat(shield.params()).isEqualTo(Shield.Params.builder().build())
    }
}
