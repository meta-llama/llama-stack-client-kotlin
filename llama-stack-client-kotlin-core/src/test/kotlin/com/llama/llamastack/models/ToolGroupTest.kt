// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolGroupTest {

    @Test
    fun create() {
        val toolGroup =
            ToolGroup.builder()
                .identifier("identifier")
                .providerId("provider_id")
                .args(
                    ToolGroup.Args.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .mcpEndpoint(ToolGroup.McpEndpoint.builder().uri("uri").build())
                .providerResourceId("provider_resource_id")
                .build()

        assertThat(toolGroup.identifier()).isEqualTo("identifier")
        assertThat(toolGroup.providerId()).isEqualTo("provider_id")
        assertThat(toolGroup.args())
            .isEqualTo(
                ToolGroup.Args.builder().putAdditionalProperty("foo", JsonValue.from(true)).build()
            )
        assertThat(toolGroup.mcpEndpoint())
            .isEqualTo(ToolGroup.McpEndpoint.builder().uri("uri").build())
        assertThat(toolGroup.providerResourceId()).isEqualTo("provider_resource_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val toolGroup =
            ToolGroup.builder()
                .identifier("identifier")
                .providerId("provider_id")
                .args(
                    ToolGroup.Args.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .mcpEndpoint(ToolGroup.McpEndpoint.builder().uri("uri").build())
                .providerResourceId("provider_resource_id")
                .build()

        val roundtrippedToolGroup =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(toolGroup),
                jacksonTypeRef<ToolGroup>(),
            )

        assertThat(roundtrippedToolGroup).isEqualTo(toolGroup)
    }
}
