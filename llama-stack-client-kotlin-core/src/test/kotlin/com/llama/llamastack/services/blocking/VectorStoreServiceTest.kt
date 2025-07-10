// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.VectorStoreCreateParams
import com.llama.llamastack.models.VectorStoreListParams
import com.llama.llamastack.models.VectorStoreSearchParams
import com.llama.llamastack.models.VectorStoreUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class VectorStoreServiceTest {

    @Test
    fun create() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val vectorStoreService = client.vectorStores()

        val vectorStore =
            vectorStoreService.create(
                VectorStoreCreateParams.builder()
                    .name("name")
                    .chunkingStrategy(
                        VectorStoreCreateParams.ChunkingStrategy.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .embeddingDimension(0L)
                    .embeddingModel("embedding_model")
                    .expiresAfter(
                        VectorStoreCreateParams.ExpiresAfter.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .addFileId("string")
                    .metadata(
                        VectorStoreCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .providerId("provider_id")
                    .providerVectorDbId("provider_vector_db_id")
                    .build()
            )

        vectorStore.validate()
    }

    @Test
    fun retrieve() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val vectorStoreService = client.vectorStores()

        val vectorStore = vectorStoreService.retrieve("vector_store_id")

        vectorStore.validate()
    }

    @Test
    fun update() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val vectorStoreService = client.vectorStores()

        val vectorStore =
            vectorStoreService.update(
                VectorStoreUpdateParams.builder()
                    .vectorStoreId("vector_store_id")
                    .expiresAfter(
                        VectorStoreUpdateParams.ExpiresAfter.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .metadata(
                        VectorStoreUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .name("name")
                    .build()
            )

        vectorStore.validate()
    }

    @Test
    fun list() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val vectorStoreService = client.vectorStores()

        val listVectorStoresResponse =
            vectorStoreService.list(
                VectorStoreListParams.builder()
                    .after("after")
                    .before("before")
                    .limit(0L)
                    .order("order")
                    .build()
            )

        listVectorStoresResponse.validate()
    }

    @Test
    fun delete() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val vectorStoreService = client.vectorStores()

        val vectorStoreDeleteResponse = vectorStoreService.delete("vector_store_id")

        vectorStoreDeleteResponse.validate()
    }

    @Test
    fun search() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val vectorStoreService = client.vectorStores()

        val vectorStoreSearchResponse =
            vectorStoreService.search(
                VectorStoreSearchParams.builder()
                    .vectorStoreId("vector_store_id")
                    .query("string")
                    .filters(
                        VectorStoreSearchParams.Filters.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .maxNumResults(0L)
                    .rankingOptions(
                        VectorStoreSearchParams.RankingOptions.builder()
                            .ranker("ranker")
                            .scoreThreshold(0.0)
                            .build()
                    )
                    .rewriteQuery(true)
                    .searchMode("search_mode")
                    .build()
            )

        vectorStoreSearchResponse.validate()
    }
}
