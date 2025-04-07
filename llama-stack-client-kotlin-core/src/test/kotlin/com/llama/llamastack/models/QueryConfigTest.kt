// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QueryConfigTest {

    @Test
    fun create() {
        val queryConfig =
            QueryConfig.builder()
                .maxChunks(0L)
                .maxTokensInContext(0L)
                .defaultRagQueryGeneratorConfig("separator")
                .build()

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

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val queryConfig =
            QueryConfig.builder()
                .maxChunks(0L)
                .maxTokensInContext(0L)
                .defaultRagQueryGeneratorConfig("separator")
                .build()

        val roundtrippedQueryConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(queryConfig),
                jacksonTypeRef<QueryConfig>(),
            )

        assertThat(roundtrippedQueryConfig).isEqualTo(queryConfig)
    }
}
