// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FunctionCallToolDefinitionTest {

    @Test
    fun createFunctionCallToolDefinition() {
        val functionCallToolDefinition =
            FunctionCallToolDefinition.builder()
                .description("description")
                .functionName("function_name")
                .parameters(FunctionCallToolDefinition.Parameters.builder().build())
                .type(FunctionCallToolDefinition.Type.FUNCTION_CALL)
                .inputShields(listOf("string"))
                .outputShields(listOf("string"))
                .remoteExecution(
                    RestApiExecutionConfig.builder()
                        .method(RestApiExecutionConfig.Method.GET)
                        .url("https://example.com")
                        .body(RestApiExecutionConfig.Body.builder().build())
                        .headers(RestApiExecutionConfig.Headers.builder().build())
                        .params(RestApiExecutionConfig.Params.builder().build())
                        .build()
                )
                .build()
        assertThat(functionCallToolDefinition).isNotNull
        assertThat(functionCallToolDefinition.description()).isEqualTo("description")
        assertThat(functionCallToolDefinition.functionName()).isEqualTo("function_name")
        assertThat(functionCallToolDefinition.parameters())
            .isEqualTo(FunctionCallToolDefinition.Parameters.builder().build())
        assertThat(functionCallToolDefinition.type())
            .isEqualTo(FunctionCallToolDefinition.Type.FUNCTION_CALL)
        assertThat(functionCallToolDefinition.inputShields()).containsExactly("string")
        assertThat(functionCallToolDefinition.outputShields()).containsExactly("string")
        assertThat(functionCallToolDefinition.remoteExecution())
            .isEqualTo(
                RestApiExecutionConfig.builder()
                    .method(RestApiExecutionConfig.Method.GET)
                    .url("https://example.com")
                    .body(RestApiExecutionConfig.Body.builder().build())
                    .headers(RestApiExecutionConfig.Headers.builder().build())
                    .params(RestApiExecutionConfig.Params.builder().build())
                    .build()
            )
    }
}
