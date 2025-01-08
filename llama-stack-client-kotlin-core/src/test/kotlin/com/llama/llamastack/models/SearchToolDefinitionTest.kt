// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SearchToolDefinitionTest {

    @Test
    fun createSearchToolDefinition() {
        val searchToolDefinition =
            SearchToolDefinition.builder()
                .apiKey("api_key")
                .engine(SearchToolDefinition.Engine.BING)
                .type(SearchToolDefinition.Type.BRAVE_SEARCH)
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
        assertThat(searchToolDefinition).isNotNull
        assertThat(searchToolDefinition.apiKey()).isEqualTo("api_key")
        assertThat(searchToolDefinition.engine()).isEqualTo(SearchToolDefinition.Engine.BING)
        assertThat(searchToolDefinition.type()).isEqualTo(SearchToolDefinition.Type.BRAVE_SEARCH)
        assertThat(searchToolDefinition.inputShields()).containsExactly("string")
        assertThat(searchToolDefinition.outputShields()).containsExactly("string")
        assertThat(searchToolDefinition.remoteExecution())
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
