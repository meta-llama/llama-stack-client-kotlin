// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ToolParamDefinitionTest {

    @Test
    fun createToolParamDefinition() {
        val toolParamDefinition =
            ToolParamDefinition.builder()
                .paramType("param_type")
                .description("description")
                .required(true)
                .build()
        assertThat(toolParamDefinition).isNotNull
        assertThat(toolParamDefinition.paramType()).isEqualTo("param_type")
        assertThat(toolParamDefinition.description()).isEqualTo("description")
        assertThat(toolParamDefinition.required()).isEqualTo(true)
    }
}
