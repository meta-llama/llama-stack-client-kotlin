// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListToolGroupsResponseTest {

    @Test
    fun create() {
        val listToolGroupsResponse =
            ListToolGroupsResponse.builder()
                .addData(
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
                )
                .build()

        assertThat(listToolGroupsResponse.data())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val listToolGroupsResponse =
            ListToolGroupsResponse.builder()
                .addData(
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
                )
                .build()

        val roundtrippedListToolGroupsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(listToolGroupsResponse),
                jacksonTypeRef<ListToolGroupsResponse>(),
            )

        assertThat(roundtrippedListToolGroupsResponse).isEqualTo(listToolGroupsResponse)
    }
}
