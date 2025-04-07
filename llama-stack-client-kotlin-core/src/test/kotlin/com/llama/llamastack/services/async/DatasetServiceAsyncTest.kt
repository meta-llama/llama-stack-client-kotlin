// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClientAsync
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.DatasetIterrowsParams
import com.llama.llamastack.models.DatasetRegisterParams
import com.llama.llamastack.models.DatasetRetrieveParams
import com.llama.llamastack.models.DatasetUnregisterParams
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

        val dataset =
            datasetServiceAsync.retrieve(
                DatasetRetrieveParams.builder().datasetId("dataset_id").build()
            )

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
    suspend fun unregister() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val datasetServiceAsync = client.datasets()

        datasetServiceAsync.unregister(
            DatasetUnregisterParams.builder().datasetId("dataset_id").build()
        )
    }
}
