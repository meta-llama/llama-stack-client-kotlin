// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FunctionCallToolDefinitionTest {

    @Test
    fun createFunctionCallToolDefinition() {
        val functionCallToolDefinition =
            FunctionCallToolDefinition.builder()
                .description("description")
                .functionName("function_name")
                .parameters(
                    FunctionCallToolDefinition.Parameters.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "param_type" to "param_type",
                                    "default" to true,
                                    "description" to "description",
                                    "required" to true,
                                )
                            )
                        )
                        .build()
                )
                .type(FunctionCallToolDefinition.Type.FUNCTION_CALL)
                .inputShields(listOf("string"))
                .outputShields(listOf("string"))
                .remoteExecution(
                    RestApiExecutionConfig.builder()
                        .method(RestApiExecutionConfig.Method.GET)
                        .url(Url.builder().uri("uri").build())
                        .body(
                            RestApiExecutionConfig.Body.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .headers(
                            RestApiExecutionConfig.Headers.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .params(
                            RestApiExecutionConfig.Params.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .build()
                )
                .build()
        assertThat(functionCallToolDefinition).isNotNull
        assertThat(functionCallToolDefinition.description()).isEqualTo("description")
        assertThat(functionCallToolDefinition.functionName()).isEqualTo("function_name")
        assertThat(functionCallToolDefinition.parameters())
            .isEqualTo(
                FunctionCallToolDefinition.Parameters.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "param_type" to "param_type",
                                "default" to true,
                                "description" to "description",
                                "required" to true,
                            )
                        )
                    )
                    .build()
            )
        assertThat(functionCallToolDefinition.type())
            .isEqualTo(FunctionCallToolDefinition.Type.FUNCTION_CALL)
        assertThat(functionCallToolDefinition.inputShields()).containsExactly("string")
        assertThat(functionCallToolDefinition.outputShields()).containsExactly("string")
        assertThat(functionCallToolDefinition.remoteExecution())
            .isEqualTo(
                RestApiExecutionConfig.builder()
                    .method(RestApiExecutionConfig.Method.GET)
                    .url(Url.builder().uri("uri").build())
                    .body(
                        RestApiExecutionConfig.Body.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .headers(
                        RestApiExecutionConfig.Headers.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .params(
                        RestApiExecutionConfig.Params.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .build()
            )
    }
}
