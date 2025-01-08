// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SafetyRunShieldParamsTest {

    @Test
    fun createSafetyRunShieldParams() {
        SafetyRunShieldParams.builder()
            .messages(
                listOf(
                    SafetyRunShieldParams.Message.ofUserMessage(
                        UserMessage.builder()
                            .content(InterleavedContent.ofString("string"))
                            .role(UserMessage.Role.USER)
                            .context(InterleavedContent.ofString("string"))
                            .build()
                    )
                )
            )
            .params(
                SafetyRunShieldParams.Params.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
            .shieldId("shield_id")
            .xLlamaStackProviderData("X-LlamaStack-ProviderData")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SafetyRunShieldParams.builder()
                .messages(
                    listOf(
                        SafetyRunShieldParams.Message.ofUserMessage(
                            UserMessage.builder()
                                .content(InterleavedContent.ofString("string"))
                                .role(UserMessage.Role.USER)
                                .context(InterleavedContent.ofString("string"))
                                .build()
                        )
                    )
                )
                .params(
                    SafetyRunShieldParams.Params.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .shieldId("shield_id")
                .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.messages())
            .isEqualTo(
                listOf(
                    SafetyRunShieldParams.Message.ofUserMessage(
                        UserMessage.builder()
                            .content(InterleavedContent.ofString("string"))
                            .role(UserMessage.Role.USER)
                            .context(InterleavedContent.ofString("string"))
                            .build()
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
    fun getBodyWithoutOptionalFields() {
        val params =
            SafetyRunShieldParams.builder()
                .messages(
                    listOf(
                        SafetyRunShieldParams.Message.ofUserMessage(
                            UserMessage.builder()
                                .content(InterleavedContent.ofString("string"))
                                .role(UserMessage.Role.USER)
                                .build()
                        )
                    )
                )
                .params(
                    SafetyRunShieldParams.Params.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .shieldId("shield_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.messages())
            .isEqualTo(
                listOf(
                    SafetyRunShieldParams.Message.ofUserMessage(
                        UserMessage.builder()
                            .content(InterleavedContent.ofString("string"))
                            .role(UserMessage.Role.USER)
                            .build()
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
}
