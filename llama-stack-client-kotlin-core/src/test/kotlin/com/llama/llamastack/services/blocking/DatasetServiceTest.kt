// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.models.*
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class DatasetServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val datasetService = client.datasets()
        val datasetRetrieveResponse =
            datasetService.retrieve(
                DatasetRetrieveParams.builder()
                    .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                    .datasetId("dataset_id")
                    .build()
            )
        println(datasetRetrieveResponse)
        datasetRetrieveResponse?.validate()
    }

    @Disabled(
        "skipped: currently no good way to test endpoints with content type application/jsonl, Prism mock server will fail"
    )
    @Test
    fun callList() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val datasetService = client.datasets()
        val datasetListResponse =
            datasetService.list(
                DatasetListParams.builder()
                    .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                    .build()
            )
        println(datasetListResponse)
        datasetListResponse.validate()
    }

    @Test
    fun callRegister() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val datasetService = client.datasets()
        datasetService.register(
            DatasetRegisterParams.builder()
                .datasetId("dataset_id")
                .datasetSchema(DatasetRegisterParams.DatasetSchema.builder().build())
                .url("https://example.com")
                .metadata(DatasetRegisterParams.Metadata.builder().build())
                .providerDatasetId("provider_dataset_id")
                .providerId("provider_id")
                .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                .build()
        )
    }
}
