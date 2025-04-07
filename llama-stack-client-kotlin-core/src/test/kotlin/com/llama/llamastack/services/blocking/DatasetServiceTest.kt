// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.DatasetIterrowsParams
import com.llama.llamastack.models.DatasetRegisterParams
import com.llama.llamastack.models.DatasetRetrieveParams
import com.llama.llamastack.models.DatasetUnregisterParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DatasetServiceTest {

    @Test
    fun retrieve() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val datasetService = client.datasets()

        val dataset =
            datasetService.retrieve(DatasetRetrieveParams.builder().datasetId("dataset_id").build())

        dataset.validate()
    }

    @Test
    fun list() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val datasetService = client.datasets()

        val datasets = datasetService.list()

        datasets.forEach { it.validate() }
    }

    @Test
    fun iterrows() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val datasetService = client.datasets()

        val response =
            datasetService.iterrows(
                DatasetIterrowsParams.builder()
                    .datasetId("dataset_id")
                    .limit(0L)
                    .startIndex(0L)
                    .build()
            )

        response.validate()
    }

    @Test
    fun register() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val datasetService = client.datasets()

        val response =
            datasetService.register(
                DatasetRegisterParams.builder()
                    .purpose(DatasetRegisterParams.Purpose.POST_TRAINING_MESSAGES)
                    .uriDataSource("uri")
                    .datasetId("dataset_id")
                    .metadata(
                        DatasetRegisterParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .build()
            )

        response.validate()
    }

    @Test
    fun unregister() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val datasetService = client.datasets()

        datasetService.unregister(DatasetUnregisterParams.builder().datasetId("dataset_id").build())
    }
}
