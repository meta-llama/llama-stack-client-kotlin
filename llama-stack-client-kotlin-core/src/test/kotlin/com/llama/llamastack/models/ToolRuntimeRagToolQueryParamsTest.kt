// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ToolRuntimeRagToolQueryParamsTest {

    @Test
    fun createToolRuntimeRagToolQueryParams() {
        ToolRuntimeRagToolQueryParams.builder()
            .content("string")
            .addVectorDbId("string")
            .queryConfig(
                QueryConfig.builder()
                    .maxChunks(0L)
                    .maxTokensInContext(0L)
                    .queryGeneratorConfig(
                        QueryConfig.QueryGeneratorConfig.DefaultRagQueryGeneratorConfig.builder()
                            .separator("separator")
                            .type(
                                QueryConfig.QueryGeneratorConfig.DefaultRagQueryGeneratorConfig.Type
                                    .DEFAULT
                            )
                            .build()
                    )
                    .build()
            )
            .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
            .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ToolRuntimeRagToolQueryParams.builder()
                .content("string")
                .addVectorDbId("string")
                .queryConfig(
                    QueryConfig.builder()
                        .maxChunks(0L)
                        .maxTokensInContext(0L)
                        .queryGeneratorConfig(
                            QueryConfig.QueryGeneratorConfig.DefaultRagQueryGeneratorConfig
                                .builder()
                                .separator("separator")
                                .type(
                                    QueryConfig.QueryGeneratorConfig.DefaultRagQueryGeneratorConfig
                                        .Type
                                        .DEFAULT
                                )
                                .build()
                        )
                        .build()
                )
                .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.content()).isEqualTo(InterleavedContent.ofString("string"))
        assertThat(body.vectorDbIds()).isEqualTo(listOf("string"))
        assertThat(body.queryConfig())
            .isEqualTo(
                QueryConfig.builder()
                    .maxChunks(0L)
                    .maxTokensInContext(0L)
                    .queryGeneratorConfig(
                        QueryConfig.QueryGeneratorConfig.DefaultRagQueryGeneratorConfig.builder()
                            .separator("separator")
                            .type(
                                QueryConfig.QueryGeneratorConfig.DefaultRagQueryGeneratorConfig.Type
                                    .DEFAULT
                            )
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ToolRuntimeRagToolQueryParams.builder()
                .content("string")
                .addVectorDbId("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.content()).isEqualTo(InterleavedContent.ofString("string"))
        assertThat(body.vectorDbIds()).isEqualTo(listOf("string"))
    }
}
