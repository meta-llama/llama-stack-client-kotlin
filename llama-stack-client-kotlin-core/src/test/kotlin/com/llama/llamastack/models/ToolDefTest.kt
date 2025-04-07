// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolDefTest {

    @Test
    fun create() {
        val toolDef =
            ToolDef.builder()
                .name("name")
                .description("description")
                .metadata(
                    ToolDef.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .addParameter(
                    ToolDef.Parameter.builder()
                        .description("description")
                        .name("name")
                        .parameterType("parameter_type")
                        .required(true)
                        .default(true)
                        .build()
                )
                .build()

        assertThat(toolDef.name()).isEqualTo("name")
        assertThat(toolDef.description()).isEqualTo("description")
        assertThat(toolDef.metadata())
            .isEqualTo(
                ToolDef.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(toolDef.parameters())
            .containsExactly(
                ToolDef.Parameter.builder()
                    .description("description")
                    .name("name")
                    .parameterType("parameter_type")
                    .required(true)
                    .default(true)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val toolDef =
            ToolDef.builder()
                .name("name")
                .description("description")
                .metadata(
                    ToolDef.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .addParameter(
                    ToolDef.Parameter.builder()
                        .description("description")
                        .name("name")
                        .parameterType("parameter_type")
                        .required(true)
                        .default(true)
                        .build()
                )
                .build()

        val roundtrippedToolDef =
            jsonMapper.readValue(jsonMapper.writeValueAsString(toolDef), jacksonTypeRef<ToolDef>())

        assertThat(roundtrippedToolDef).isEqualTo(toolDef)
    }
}
