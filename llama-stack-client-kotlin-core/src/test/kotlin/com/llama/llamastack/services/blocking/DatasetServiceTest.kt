// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.DatasetIterrowsParams
import com.llama.llamastack.models.DatasetRegisterParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DatasetServiceTest {

    @Test
    fun retrieve() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val datasetService = client.datasets()

        val dataset = datasetService.retrieve("dataset_id")

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
                    .uriSource("uri")
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

        datasetService.unregister("dataset_id")
    }
}
