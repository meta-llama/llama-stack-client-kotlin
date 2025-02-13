// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ToolRuntimeRagToolQueryParamsTest {

    @Test
    fun create() {
        ToolRuntimeRagToolQueryParams.builder()
            .content("string")
            .addVectorDbId("string")
            .queryConfig(
                QueryConfig.builder()
                    .maxChunks(0L)
                    .maxTokensInContext(0L)
                    .defaultRagQueryGeneratorConfig("separator")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            ToolRuntimeRagToolQueryParams.builder()
                .content("string")
                .addVectorDbId("string")
                .queryConfig(
                    QueryConfig.builder()
                        .maxChunks(0L)
                        .maxTokensInContext(0L)
                        .defaultRagQueryGeneratorConfig("separator")
                        .build()
                )
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.content()).isEqualTo(InterleavedContent.ofString("string"))
        assertThat(body.vectorDbIds()).isEqualTo(listOf("string"))
        assertThat(body.queryConfig())
            .isEqualTo(
                QueryConfig.builder()
                    .maxChunks(0L)
                    .maxTokensInContext(0L)
                    .defaultRagQueryGeneratorConfig("separator")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ToolRuntimeRagToolQueryParams.builder()
                .content("string")
                .addVectorDbId("string")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.content()).isEqualTo(InterleavedContent.ofString("string"))
        assertThat(body.vectorDbIds()).isEqualTo(listOf("string"))
    }
}
