// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RestApiExecutionConfigTest {

    @Test
    fun createRestApiExecutionConfig() {
        val restApiExecutionConfig =
            RestApiExecutionConfig.builder()
                .method(RestApiExecutionConfig.Method.GET)
                .url("https://example.com")
                .body(RestApiExecutionConfig.Body.builder().build())
                .headers(RestApiExecutionConfig.Headers.builder().build())
                .params(RestApiExecutionConfig.Params.builder().build())
                .build()
        assertThat(restApiExecutionConfig).isNotNull
        assertThat(restApiExecutionConfig.method()).isEqualTo(RestApiExecutionConfig.Method.GET)
        assertThat(restApiExecutionConfig.url()).isEqualTo("https://example.com")
        assertThat(restApiExecutionConfig.body())
            .isEqualTo(RestApiExecutionConfig.Body.builder().build())
        assertThat(restApiExecutionConfig.headers())
            .isEqualTo(RestApiExecutionConfig.Headers.builder().build())
        assertThat(restApiExecutionConfig.params())
            .isEqualTo(RestApiExecutionConfig.Params.builder().build())
    }
}
