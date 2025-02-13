// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ToolGroupTest {

    @Test
    fun createToolGroup() {
        val toolGroup =
            ToolGroup.builder()
                .identifier("identifier")
                .providerId("provider_id")
                .providerResourceId("provider_resource_id")
                .args(
                    ToolGroup.Args.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .mcpEndpoint(ToolGroup.McpEndpoint.builder().uri("uri").build())
                .build()
        assertThat(toolGroup).isNotNull
        assertThat(toolGroup.identifier()).isEqualTo("identifier")
        assertThat(toolGroup.providerId()).isEqualTo("provider_id")
        assertThat(toolGroup.providerResourceId()).isEqualTo("provider_resource_id")
        assertThat(toolGroup.args())
            .isEqualTo(
                ToolGroup.Args.builder().putAdditionalProperty("foo", JsonValue.from(true)).build()
            )
        assertThat(toolGroup.mcpEndpoint())
            .isEqualTo(ToolGroup.McpEndpoint.builder().uri("uri").build())
    }
}
