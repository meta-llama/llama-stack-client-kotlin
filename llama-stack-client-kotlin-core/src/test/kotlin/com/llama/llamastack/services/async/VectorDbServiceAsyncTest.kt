// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClientAsync
import com.llama.llamastack.models.VectorDbRegisterParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class VectorDbServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val vectorDbServiceAsync = client.vectorDbs()

        val vectorDb = vectorDbServiceAsync.retrieve("vector_db_id")

        vectorDb.validate()
    }

    @Test
    suspend fun list() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val vectorDbServiceAsync = client.vectorDbs()

        val vectorDbs = vectorDbServiceAsync.list()

        vectorDbs.forEach { it.validate() }
    }

    @Test
    suspend fun register() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val vectorDbServiceAsync = client.vectorDbs()

        val response =
            vectorDbServiceAsync.register(
                VectorDbRegisterParams.builder()
                    .embeddingModel("embedding_model")
                    .vectorDbId("vector_db_id")
                    .embeddingDimension(0L)
                    .providerId("provider_id")
                    .providerVectorDbId("provider_vector_db_id")
                    .build()
            )

        response.validate()
    }

    @Test
    suspend fun unregister() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val vectorDbServiceAsync = client.vectorDbs()

        vectorDbServiceAsync.unregister("vector_db_id")
    }
}
