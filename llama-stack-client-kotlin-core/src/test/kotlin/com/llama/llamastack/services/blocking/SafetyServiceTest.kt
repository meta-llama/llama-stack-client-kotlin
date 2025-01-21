// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.InterleavedContent
import com.llama.llamastack.models.SafetyRunShieldParams
import com.llama.llamastack.models.UserMessage
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
                    .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                    .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                    .build()
            )
        println(runShieldResponse)
        runShieldResponse.validate()
    }
}
