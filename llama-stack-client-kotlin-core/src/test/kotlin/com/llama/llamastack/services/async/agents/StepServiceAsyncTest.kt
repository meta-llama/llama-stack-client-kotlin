// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async.agents

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClientAsync
import com.llama.llamastack.models.AgentStepRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class StepServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val stepServiceAsync = client.agents().steps()

        val step =
            stepServiceAsync.retrieve(
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
