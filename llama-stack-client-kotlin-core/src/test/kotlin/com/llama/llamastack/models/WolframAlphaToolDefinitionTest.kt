// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
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
