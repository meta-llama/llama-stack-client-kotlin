// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.services.blocking

import com.llama_stack_client.api.TestServerExtension
import com.llama_stack_client.api.client.okhttp.LlamaStackClientOkHttpClient
import com.llama_stack_client.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class SafetyServiceTest {

    @Test
    fun callRunShield() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val safetyService = client.safety()
        val runSheidResponse =
            safetyService.runShield(
                SafetyRunShieldParams.builder()
                    .messages(
                        listOf(
                            SafetyRunShieldParams.Message.ofUserMessage(
                                UserMessage.builder()
                                    .content(UserMessage.Content.ofString("string"))
                                    .role(UserMessage.Role.USER)
                                    .context(UserMessage.Context.ofString("string"))
                                    .build()
                            )
                        )
                    )
                    .params(SafetyRunShieldParams.Params.builder().build())
                    .shieldType("shield_type")
                    .build()
            )
        println(runSheidResponse)
        runSheidResponse.validate()
    }
}
