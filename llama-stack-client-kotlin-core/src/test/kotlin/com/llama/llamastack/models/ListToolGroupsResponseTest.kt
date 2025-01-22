// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ListToolGroupsResponseTest {

    @Test
    fun createListToolGroupsResponse() {
        val listToolGroupsResponse =
            ListToolGroupsResponse.builder()
                .addData(
                    ToolGroup.builder()
                        .identifier("identifier")
                        .providerId("provider_id")
                        .providerResourceId("provider_resource_id")
                        .type(ToolGroup.Type.TOOL_GROUP)
                        .args(
                            ToolGroup.Args.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .mcpEndpoint(Url.builder().uri("uri").build())
                        .build()
                )
                .build()
        assertThat(listToolGroupsResponse).isNotNull
        assertThat(listToolGroupsResponse.data())
            .containsExactly(
                ToolGroup.builder()
                    .identifier("identifier")
                    .providerId("provider_id")
                    .providerResourceId("provider_resource_id")
                    .type(ToolGroup.Type.TOOL_GROUP)
                    .args(
                        ToolGroup.Args.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .mcpEndpoint(Url.builder().uri("uri").build())
                    .build()
            )
    }
}
