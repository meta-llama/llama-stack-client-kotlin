// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking.toolRuntime

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.Document
import com.llama.llamastack.models.QueryConfig
import com.llama.llamastack.models.QueryGeneratorConfig
import com.llama.llamastack.models.ToolRuntimeRagToolInsertParams
import com.llama.llamastack.models.ToolRuntimeRagToolQueryParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class RagToolServiceTest {

    @Test
    fun callInsert() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val ragToolService = client.toolRuntime().ragTool()
        ragToolService.insert(
            ToolRuntimeRagToolInsertParams.builder()
                .chunkSizeInTokens(0L)
                .addDocument(
                    Document.builder()
                        .content("string")
                        .documentId("document_id")
                        .metadata(
                            Document.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from(true))
                                .build()
                        )
                        .mimeType("mime_type")
                        .build()
                )
                .vectorDbId("vector_db_id")
                .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                .build()
        )
    }

    @Test
    fun callQuery() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val ragToolService = client.toolRuntime().ragTool()
        val queryResult =
            ragToolService.query(
                ToolRuntimeRagToolQueryParams.builder()
                    .content("string")
                    .addVectorDbId("string")
                    .queryConfig(
                        QueryConfig.builder()
                            .maxChunks(0L)
                            .maxTokensInContext(0L)
                            .queryGeneratorConfig(
                                QueryGeneratorConfig.DefaultRagQueryGeneratorConfig.builder()
                                    .separator("separator")
                                    .build()
                            )
                            .build()
                    )
                    .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                    .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                    .build()
            )
        println(queryResult)
        queryResult.validate()
    }
}
