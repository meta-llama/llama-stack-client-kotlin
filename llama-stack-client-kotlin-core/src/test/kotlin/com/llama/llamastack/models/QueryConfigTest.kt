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
                .chunkTemplate("chunk_template")
                .maxChunks(0L)
                .maxTokensInContext(0L)
                .defaultQueryGeneratorConfig("separator")
                .mode("mode")
                .rrfRanker(0.0)
                .build()

        assertThat(queryConfig.chunkTemplate()).isEqualTo("chunk_template")
        assertThat(queryConfig.maxChunks()).isEqualTo(0L)
        assertThat(queryConfig.maxTokensInContext()).isEqualTo(0L)
        assertThat(queryConfig.queryGeneratorConfig())
            .isEqualTo(
                QueryGeneratorConfig.ofDefault(
                    QueryGeneratorConfig.Default.builder().separator("separator").build()
                )
            )
        assertThat(queryConfig.mode()).isEqualTo("mode")
        assertThat(queryConfig.ranker())
            .isEqualTo(
                QueryConfig.Ranker.ofRrf(QueryConfig.Ranker.Rrf.builder().impactFactor(0.0).build())
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val queryConfig =
            QueryConfig.builder()
                .chunkTemplate("chunk_template")
                .maxChunks(0L)
                .maxTokensInContext(0L)
                .defaultQueryGeneratorConfig("separator")
                .mode("mode")
                .rrfRanker(0.0)
                .build()

        val roundtrippedQueryConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(queryConfig),
                jacksonTypeRef<QueryConfig>(),
            )

        assertThat(roundtrippedQueryConfig).isEqualTo(queryConfig)
    }
}
