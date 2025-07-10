// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.models.VectorDbRegisterParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class VectorDbServiceTest {

    @Test
    fun retrieve() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val vectorDbService = client.vectorDbs()

        val vectorDb = vectorDbService.retrieve("vector_db_id")

        vectorDb.validate()
    }

    @Test
    fun list() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val vectorDbService = client.vectorDbs()

        val vectorDbs = vectorDbService.list()

        vectorDbs.forEach { it.validate() }
    }

    @Test
    fun register() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val vectorDbService = client.vectorDbs()

        val response =
            vectorDbService.register(
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
    fun unregister() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val vectorDbService = client.vectorDbs()

        vectorDbService.unregister("vector_db_id")
    }
}
