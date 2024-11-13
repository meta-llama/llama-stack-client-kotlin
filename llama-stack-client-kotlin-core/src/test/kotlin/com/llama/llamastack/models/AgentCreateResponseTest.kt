// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AgentCreateResponseTest {

    @Test
    fun createAgentCreateResponse() {
        val agentCreateResponse = AgentCreateResponse.builder().agentId("agent_id").build()
        assertThat(agentCreateResponse).isNotNull
        assertThat(agentCreateResponse.agentId()).isEqualTo("agent_id")
    }
}
