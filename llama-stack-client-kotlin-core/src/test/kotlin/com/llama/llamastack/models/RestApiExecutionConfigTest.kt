// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RestApiExecutionConfigTest {

    @Test
    fun createRestApiExecutionConfig() {
        val restApiExecutionConfig =
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
        assertThat(restApiExecutionConfig).isNotNull
        assertThat(restApiExecutionConfig.method()).isEqualTo(RestApiExecutionConfig.Method.GET)
        assertThat(restApiExecutionConfig.url()).isEqualTo(Url.builder().uri("uri").build())
        assertThat(restApiExecutionConfig.body())
            .isEqualTo(
                RestApiExecutionConfig.Body.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(restApiExecutionConfig.headers())
            .isEqualTo(
                RestApiExecutionConfig.Headers.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(restApiExecutionConfig.params())
            .isEqualTo(
                RestApiExecutionConfig.Params.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
    }
}
