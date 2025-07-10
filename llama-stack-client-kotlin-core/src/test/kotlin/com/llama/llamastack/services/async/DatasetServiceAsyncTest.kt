// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClientAsync
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.DatasetIterrowsParams
import com.llama.llamastack.models.DatasetRegisterParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DatasetServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val datasetServiceAsync = client.datasets()

        val dataset = datasetServiceAsync.retrieve("dataset_id")

        dataset.validate()
    }

    @Test
    suspend fun list() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val datasetServiceAsync = client.datasets()

        val datasets = datasetServiceAsync.list()

        datasets.forEach { it.validate() }
    }

    @Test
    suspend fun iterrows() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val datasetServiceAsync = client.datasets()

        val response =
            datasetServiceAsync.iterrows(
                DatasetIterrowsParams.builder()
                    .datasetId("dataset_id")
                    .limit(0L)
                    .startIndex(0L)
                    .build()
            )

        response.validate()
    }

    @Test
    suspend fun register() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val datasetServiceAsync = client.datasets()

        val response =
            datasetServiceAsync.register(
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
    suspend fun unregister() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val datasetServiceAsync = client.datasets()

        datasetServiceAsync.unregister("dataset_id")
    }
}
