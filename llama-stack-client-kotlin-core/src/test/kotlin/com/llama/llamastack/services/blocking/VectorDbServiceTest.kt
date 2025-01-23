// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.models.ListVectorDbsResponse
import com.llama.llamastack.models.VectorDbListParams
import com.llama.llamastack.models.VectorDbRegisterParams
import com.llama.llamastack.models.VectorDbRetrieveParams
import com.llama.llamastack.models.VectorDbUnregisterParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class VectorDbServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val vectorDbService = client.vectorDbs()
        val vectorDbRetrieveResponse =
            vectorDbService.retrieve(
                VectorDbRetrieveParams.builder()
                    .vectorDbId("vector_db_id")
                    .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                    .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                    .build()
            )
        println(vectorDbRetrieveResponse)
        vectorDbRetrieveResponse?.validate()
    }

    @Test
    fun callList() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val vectorDbService = client.vectorDbs()
        val listVectorDbsResponse =
            vectorDbService.list(
                VectorDbListParams.builder()
                    .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                    .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                    .build()
            )
        println(listVectorDbsResponse)
        for (vectorDb: ListVectorDbsResponse.Data in listVectorDbsResponse) {
            vectorDb.validate()
        }
    }

    @Test
    fun callRegister() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val vectorDbService = client.vectorDbs()
        val vectorDbRegisterResponse =
            vectorDbService.register(
                VectorDbRegisterParams.builder()
                    .embeddingModel("embedding_model")
                    .vectorDbId("vector_db_id")
                    .embeddingDimension(0L)
                    .providerId("provider_id")
                    .providerVectorDbId("provider_vector_db_id")
                    .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                    .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                    .build()
            )
        println(vectorDbRegisterResponse)
        vectorDbRegisterResponse.validate()
    }

    @Test
    fun callUnregister() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val vectorDbService = client.vectorDbs()
        vectorDbService.unregister(
            VectorDbUnregisterParams.builder()
                .vectorDbId("vector_db_id")
                .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                .build()
        )
    }
}
