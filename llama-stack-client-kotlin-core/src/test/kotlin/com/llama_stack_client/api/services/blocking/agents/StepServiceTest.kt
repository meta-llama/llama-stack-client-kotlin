// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.services.blocking.agents

import com.llama_stack_client.api.TestServerExtension
import com.llama_stack_client.api.client.okhttp.LlamaStackClientOkHttpClient
import com.llama_stack_client.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class StepServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val stepService = client.agents().steps()
        val agentsStep =
            stepService.retrieve(
                AgentStepRetrieveParams.builder()
                    .agentId("agent_id")
                    .stepId("step_id")
                    .turnId("turn_id")
                    .build()
            )
        println(agentsStep)
        agentsStep.validate()
    }
}
