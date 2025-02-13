// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.DatasetListParams
import com.llama.llamastack.models.DatasetRegisterParams
import com.llama.llamastack.models.DatasetRetrieveParams
import com.llama.llamastack.models.DatasetUnregisterParams
import com.llama.llamastack.models.ListDatasetsResponse
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
            datasetService.retrieve(DatasetRetrieveParams.builder().datasetId("dataset_id").build())
        println(datasetRetrieveResponse)
        datasetRetrieveResponse?.validate()
    }

    @Test
    fun callList() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val datasetService = client.datasets()
        val listDatasetsResponse = datasetService.list(DatasetListParams.builder().build())
        println(listDatasetsResponse)
        for (dataset: ListDatasetsResponse.Data in listDatasetsResponse) {
            dataset.validate()
        }
    }

    @Test
    fun callRegister() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val datasetService = client.datasets()
        datasetService.register(
            DatasetRegisterParams.builder()
                .datasetId("dataset_id")
                .datasetSchema(
                    DatasetRegisterParams.DatasetSchema.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf("type" to "string")))
                        .build()
                )
                .url(DatasetRegisterParams.Url.builder().uri("uri").build())
                .metadata(
                    DatasetRegisterParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .providerDatasetId("provider_dataset_id")
                .providerId("provider_id")
                .build()
        )
    }

    @Test
    fun callUnregister() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val datasetService = client.datasets()
        datasetService.unregister(DatasetUnregisterParams.builder().datasetId("dataset_id").build())
    }
}
