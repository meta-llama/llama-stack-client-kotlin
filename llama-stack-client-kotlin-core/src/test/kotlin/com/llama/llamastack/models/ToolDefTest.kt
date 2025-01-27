// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ToolDefTest {

    @Test
    fun createToolDef() {
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
                        .default(ToolDef.Parameter.Default.ofBoolean(true))
                        .build()
                )
                .build()
        assertThat(toolDef).isNotNull
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
                    .default(ToolDef.Parameter.Default.ofBoolean(true))
                    .build()
            )
    }
}
