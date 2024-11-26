// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking.agents

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class StepServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val stepService = client.agents().steps()
        val agentStepRetrieveResponse =
            stepService.retrieve(
                AgentStepRetrieveParams.builder()
                    .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                    .agentId("agent_id")
                    .sessionId("session_id")
                    .stepId("step_id")
                    .turnId("turn_id")
                    .build()
            )
        println(agentStepRetrieveResponse)
        agentStepRetrieveResponse.validate()
    }
}
