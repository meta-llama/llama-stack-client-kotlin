// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PhotogenToolDefinitionTest {

    @Test
    fun createPhotogenToolDefinition() {
        val photogenToolDefinition =
            PhotogenToolDefinition.builder()
                .type(PhotogenToolDefinition.Type.PHOTOGEN)
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
        assertThat(photogenToolDefinition).isNotNull
        assertThat(photogenToolDefinition.type()).isEqualTo(PhotogenToolDefinition.Type.PHOTOGEN)
        assertThat(photogenToolDefinition.inputShields()).containsExactly("string")
        assertThat(photogenToolDefinition.outputShields()).containsExactly("string")
        assertThat(photogenToolDefinition.remoteExecution())
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
