// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class QueryConfigTest {

    @Test
    fun createQueryConfig() {
        val queryConfig =
            QueryConfig.builder()
                .maxChunks(0L)
                .maxTokensInContext(0L)
                .queryGeneratorConfig(
                    QueryGeneratorConfig.DefaultRagQueryGeneratorConfig.builder()
                        .separator("separator")
                        .build()
                )
                .build()
        assertThat(queryConfig).isNotNull
        assertThat(queryConfig.maxChunks()).isEqualTo(0L)
        assertThat(queryConfig.maxTokensInContext()).isEqualTo(0L)
        assertThat(queryConfig.queryGeneratorConfig())
            .isEqualTo(
                QueryGeneratorConfig.ofDefaultRag(
                    QueryGeneratorConfig.DefaultRagQueryGeneratorConfig.builder()
                        .separator("separator")
                        .build()
                )
            )
    }
}
