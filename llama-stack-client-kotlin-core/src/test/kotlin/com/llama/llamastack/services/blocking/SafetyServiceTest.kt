// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.SafetyRunShieldParams
import com.llama.llamastack.models.UserMessage
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class SafetyServiceTest {

    @Test
    fun runShield() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val safetyService = client.safety()

        val runShieldResponse =
            safetyService.runShield(
                SafetyRunShieldParams.builder()
                    .addMessage(UserMessage.builder().content("string").context("string").build())
                    .params(
                        SafetyRunShieldParams.Params.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .shieldId("shield_id")
                    .build()
            )

        runShieldResponse.validate()
    }
}
