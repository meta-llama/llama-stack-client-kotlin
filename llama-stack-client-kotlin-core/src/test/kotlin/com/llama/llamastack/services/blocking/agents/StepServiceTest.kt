// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking.agents

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.models.AgentStepRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class StepServiceTest {

    @Test
    fun retrieve() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val stepService = client.agents().steps()

        val step =
            stepService.retrieve(
                AgentStepRetrieveParams.builder()
                    .agentId("agent_id")
                    .sessionId("session_id")
                    .turnId("turn_id")
                    .stepId("step_id")
                    .build()
            )

        step.validate()
    }
}
