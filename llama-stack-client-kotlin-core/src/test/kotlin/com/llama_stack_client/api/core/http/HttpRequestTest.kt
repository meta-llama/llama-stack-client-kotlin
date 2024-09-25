package com.llama_stack_client.api.core.http

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HttpRequestTest {

    @Test
    fun caseInsensitiveHeadersAccessors() {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .putHeader("something_lowercase", "lowercase")
                .putHeader("Something_Capitalized", "Capitalized")
                .putHeader("SOMETHING_UPPERCASE", "UPPERCASE")
                .build()
        assertThat(request.headers.get("SOMETHING_LOWERCASE").getOrNull(0)).isEqualTo("lowercase")
        assertThat(request.headers.get("something_capitalized").getOrNull(0))
            .isEqualTo("Capitalized")
        assertThat(request.headers.get("Something_Uppercase").getOrNull(0)).isEqualTo("UPPERCASE")
    }
}
