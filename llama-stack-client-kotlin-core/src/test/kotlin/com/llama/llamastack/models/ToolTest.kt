// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolTest {

    @Test
    fun create() {
        val tool =
            Tool.builder()
                .description("description")
                .identifier("identifier")
                .addParameter(
                    Tool.Parameter.builder()
                        .description("description")
                        .name("name")
                        .parameterType("parameter_type")
                        .required(true)
                        .default(true)
                        .build()
                )
                .providerId("provider_id")
                .providerResourceId("provider_resource_id")
                .toolHost(Tool.ToolHost.DISTRIBUTION)
                .toolgroupId("toolgroup_id")
                .metadata(
                    Tool.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .build()

        assertThat(tool.description()).isEqualTo("description")
        assertThat(tool.identifier()).isEqualTo("identifier")
        assertThat(tool.parameters())
            .containsExactly(
                Tool.Parameter.builder()
                    .description("description")
                    .name("name")
                    .parameterType("parameter_type")
                    .required(true)
                    .default(true)
                    .build()
            )
        assertThat(tool.providerId()).isEqualTo("provider_id")
        assertThat(tool.providerResourceId()).isEqualTo("provider_resource_id")
        assertThat(tool.toolHost()).isEqualTo(Tool.ToolHost.DISTRIBUTION)
        assertThat(tool.toolgroupId()).isEqualTo("toolgroup_id")
        assertThat(tool.metadata())
            .isEqualTo(
                Tool.Metadata.builder().putAdditionalProperty("foo", JsonValue.from(true)).build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tool =
            Tool.builder()
                .description("description")
                .identifier("identifier")
                .addParameter(
                    Tool.Parameter.builder()
                        .description("description")
                        .name("name")
                        .parameterType("parameter_type")
                        .required(true)
                        .default(true)
                        .build()
                )
                .providerId("provider_id")
                .providerResourceId("provider_resource_id")
                .toolHost(Tool.ToolHost.DISTRIBUTION)
                .toolgroupId("toolgroup_id")
                .metadata(
                    Tool.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .build()

        val roundtrippedTool =
            jsonMapper.readValue(jsonMapper.writeValueAsString(tool), jacksonTypeRef<Tool>())

        assertThat(roundtrippedTool).isEqualTo(tool)
    }
}
