// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WolframAlphaToolDefinitionTest {

    @Test
    fun createWolframAlphaToolDefinition() {
        val wolframAlphaToolDefinition =
            WolframAlphaToolDefinition.builder()
                .apiKey("api_key")
                .type(WolframAlphaToolDefinition.Type.WOLFRAM_ALPHA)
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
        assertThat(wolframAlphaToolDefinition).isNotNull
        assertThat(wolframAlphaToolDefinition.apiKey()).isEqualTo("api_key")
        assertThat(wolframAlphaToolDefinition.type())
            .isEqualTo(WolframAlphaToolDefinition.Type.WOLFRAM_ALPHA)
        assertThat(wolframAlphaToolDefinition.inputShields()).containsExactly("string")
        assertThat(wolframAlphaToolDefinition.outputShields()).containsExactly("string")
        assertThat(wolframAlphaToolDefinition.remoteExecution())
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
