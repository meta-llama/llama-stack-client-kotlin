// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentCreateResponseTest {

    @Test
    fun create() {
        val agentCreateResponse = AgentCreateResponse.builder().agentId("agent_id").build()

        assertThat(agentCreateResponse.agentId()).isEqualTo("agent_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentCreateResponse = AgentCreateResponse.builder().agentId("agent_id").build()

        val roundtrippedAgentCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentCreateResponse),
                jacksonTypeRef<AgentCreateResponse>(),
            )

        assertThat(roundtrippedAgentCreateResponse).isEqualTo(agentCreateResponse)
    }
}
