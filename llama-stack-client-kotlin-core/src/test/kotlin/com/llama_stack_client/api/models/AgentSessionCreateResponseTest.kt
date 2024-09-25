// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AgentSessionCreateResponseTest {

    @Test
    fun createAgentSessionCreateResponse() {
        val agentSessionCreateResponse =
            AgentSessionCreateResponse.builder().sessionId("session_id").build()
        assertThat(agentSessionCreateResponse).isNotNull
        assertThat(agentSessionCreateResponse.sessionId()).isEqualTo("session_id")
    }
}
