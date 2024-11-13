// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class SafetyServiceTest {

    @Test
    fun callRunShield() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val safetyService = client.safety()
        val runShieldResponse =
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
                    .shieldId("shield_id")
                    .build()
            )
        println(runShieldResponse)
        runShieldResponse.validate()
    }
}
