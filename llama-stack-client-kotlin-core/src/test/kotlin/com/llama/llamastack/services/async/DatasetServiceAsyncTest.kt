// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClientAsync
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.DatasetRegisterParams
import com.llama.llamastack.models.DatasetRetrieveParams
import com.llama.llamastack.models.DatasetUnregisterParams
import kotlin.test.assertNotNull
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class DatasetServiceAsyncTest {

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

        assertNotNull(dataset)
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
    suspend fun register() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val datasetServiceAsync = client.datasets()

        datasetServiceAsync.register(
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
