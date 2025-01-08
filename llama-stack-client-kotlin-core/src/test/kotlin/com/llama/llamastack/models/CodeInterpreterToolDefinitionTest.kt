// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CodeInterpreterToolDefinitionTest {

    @Test
    fun createCodeInterpreterToolDefinition() {
        val codeInterpreterToolDefinition =
            CodeInterpreterToolDefinition.builder()
                .enableInlineCodeExecution(true)
                .type(CodeInterpreterToolDefinition.Type.CODE_INTERPRETER)
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
        assertThat(codeInterpreterToolDefinition).isNotNull
        assertThat(codeInterpreterToolDefinition.enableInlineCodeExecution()).isEqualTo(true)
        assertThat(codeInterpreterToolDefinition.type())
            .isEqualTo(CodeInterpreterToolDefinition.Type.CODE_INTERPRETER)
        assertThat(codeInterpreterToolDefinition.inputShields()).containsExactly("string")
        assertThat(codeInterpreterToolDefinition.outputShields()).containsExactly("string")
        assertThat(codeInterpreterToolDefinition.remoteExecution())
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
