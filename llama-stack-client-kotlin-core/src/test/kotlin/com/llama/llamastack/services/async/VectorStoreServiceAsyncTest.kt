// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClientAsync
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.VectorStoreCreateParams
import com.llama.llamastack.models.VectorStoreListParams
import com.llama.llamastack.models.VectorStoreSearchParams
import com.llama.llamastack.models.VectorStoreUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class VectorStoreServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val vectorStoreServiceAsync = client.vectorStores()

        val vectorStore =
            vectorStoreServiceAsync.create(
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
    suspend fun retrieve() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val vectorStoreServiceAsync = client.vectorStores()

        val vectorStore = vectorStoreServiceAsync.retrieve("vector_store_id")

        vectorStore.validate()
    }

    @Test
    suspend fun update() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val vectorStoreServiceAsync = client.vectorStores()

        val vectorStore =
            vectorStoreServiceAsync.update(
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
    suspend fun list() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val vectorStoreServiceAsync = client.vectorStores()

        val listVectorStoresResponse =
            vectorStoreServiceAsync.list(
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
    suspend fun delete() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val vectorStoreServiceAsync = client.vectorStores()

        val vectorStoreDeleteResponse = vectorStoreServiceAsync.delete("vector_store_id")

        vectorStoreDeleteResponse.validate()
    }

    @Test
    suspend fun search() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val vectorStoreServiceAsync = client.vectorStores()

        val vectorStoreSearchResponse =
            vectorStoreServiceAsync.search(
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
