// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ToolTest {

    @Test
    fun createTool() {
        val tool =
            Tool.builder()
                .description("description")
                .identifier("identifier")
                .parameters(
                    listOf(
                        Tool.Parameter.builder()
                            .description("description")
                            .name("name")
                            .parameterType("parameter_type")
                            .required(true)
                            .default(Tool.Parameter.Default.ofBoolean(true))
                            .build()
                    )
                )
                .providerId("provider_id")
                .providerResourceId("provider_resource_id")
                .toolHost(Tool.ToolHost.DISTRIBUTION)
                .toolgroupId("toolgroup_id")
                .type(Tool.Type.TOOL)
                .metadata(
                    Tool.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .build()
        assertThat(tool).isNotNull
        assertThat(tool.description()).isEqualTo("description")
        assertThat(tool.identifier()).isEqualTo("identifier")
        assertThat(tool.parameters())
            .containsExactly(
                Tool.Parameter.builder()
                    .description("description")
                    .name("name")
                    .parameterType("parameter_type")
                    .required(true)
                    .default(Tool.Parameter.Default.ofBoolean(true))
                    .build()
            )
        assertThat(tool.providerId()).isEqualTo("provider_id")
        assertThat(tool.providerResourceId()).isEqualTo("provider_resource_id")
        assertThat(tool.toolHost()).isEqualTo(Tool.ToolHost.DISTRIBUTION)
        assertThat(tool.toolgroupId()).isEqualTo("toolgroup_id")
        assertThat(tool.type()).isEqualTo(Tool.Type.TOOL)
        assertThat(tool.metadata())
            .isEqualTo(
                Tool.Metadata.builder().putAdditionalProperty("foo", JsonValue.from(true)).build()
            )
    }
}
