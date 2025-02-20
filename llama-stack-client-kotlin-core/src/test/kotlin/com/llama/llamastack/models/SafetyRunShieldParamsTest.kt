// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SafetyRunShieldParamsTest {

    @Test
    fun create() {
        SafetyRunShieldParams.builder()
            .addMessage(UserMessage.builder().content("string").context("string").build())
            .params(
                SafetyRunShieldParams.Params.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
            .shieldId("shield_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            SafetyRunShieldParams.builder()
                .addMessage(UserMessage.builder().content("string").context("string").build())
                .params(
                    SafetyRunShieldParams.Params.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .shieldId("shield_id")
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.messages())
            .isEqualTo(
                listOf(
                    Message.ofUser(
                        UserMessage.builder().content("string").context("string").build()
                    )
                )
            )
        assertThat(body.params())
            .isEqualTo(
                SafetyRunShieldParams.Params.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(body.shieldId()).isEqualTo("shield_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SafetyRunShieldParams.builder()
                .addUserMessage("string")
                .params(
                    SafetyRunShieldParams.Params.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .shieldId("shield_id")
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.messages())
            .isEqualTo(listOf(Message.ofUser(UserMessage.builder().content("string").build())))
        assertThat(body.params())
            .isEqualTo(
                SafetyRunShieldParams.Params.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(body.shieldId()).isEqualTo("shield_id")
    }
}
