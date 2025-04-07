// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentSessionRetrieveParamsTest {

    @Test
    fun create() {
        AgentSessionRetrieveParams.builder()
            .agentId("agent_id")
            .sessionId("session_id")
            .addTurnId("string")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AgentSessionRetrieveParams.builder().agentId("agent_id").sessionId("session_id").build()

        assertThat(params._pathParam(0)).isEqualTo("agent_id")
        assertThat(params._pathParam(1)).isEqualTo("session_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            AgentSessionRetrieveParams.builder()
                .agentId("agent_id")
                .sessionId("session_id")
                .addTurnId("string")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("turn_ids", listOf("string").joinToString(",")).build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            AgentSessionRetrieveParams.builder().agentId("agent_id").sessionId("session_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
