// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ShieldTest {

    @Test
    fun create() {
        val shield =
            Shield.builder()
                .identifier("identifier")
                .providerId("provider_id")
                .providerResourceId("provider_resource_id")
                .params(
                    Shield.Params.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .build()

        assertThat(shield.identifier()).isEqualTo("identifier")
        assertThat(shield.providerId()).isEqualTo("provider_id")
        assertThat(shield.providerResourceId()).isEqualTo("provider_resource_id")
        assertThat(shield.params())
            .isEqualTo(
                Shield.Params.builder().putAdditionalProperty("foo", JsonValue.from(true)).build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val shield =
            Shield.builder()
                .identifier("identifier")
                .providerId("provider_id")
                .providerResourceId("provider_resource_id")
                .params(
                    Shield.Params.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .build()

        val roundtrippedShield =
            jsonMapper.readValue(jsonMapper.writeValueAsString(shield), jacksonTypeRef<Shield>())

        assertThat(roundtrippedShield).isEqualTo(shield)
    }
}
