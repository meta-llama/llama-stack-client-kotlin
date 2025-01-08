// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class UrlTest {

    @Test
    fun createUrl() {
        val url = Url.builder().uri("uri").build()
        assertThat(url).isNotNull
        assertThat(url.uri()).isEqualTo("uri")
    }
}
