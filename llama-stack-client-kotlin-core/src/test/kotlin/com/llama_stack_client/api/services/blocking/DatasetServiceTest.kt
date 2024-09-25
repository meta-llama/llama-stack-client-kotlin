// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.services.blocking

import com.llama_stack_client.api.TestServerExtension
import com.llama_stack_client.api.client.okhttp.LlamaStackClientOkHttpClient
import com.llama_stack_client.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class DatasetServiceTest {

    @Test
    fun callCreate() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val datasetService = client.datasets()
        datasetService.create(
            DatasetCreateParams.builder()
                .dataset(
                    TrainEvalDataset.builder()
                        .columns(TrainEvalDataset.Columns.builder().build())
                        .contentUrl("https://example.com")
                        .metadata(TrainEvalDataset.Metadata.builder().build())
                        .build()
                )
                .uuid("uuid")
                .build()
        )
    }

    @Test
    fun callDelete() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val datasetService = client.datasets()
        datasetService.delete(DatasetDeleteParams.builder().datasetUuid("dataset_uuid").build())
    }

    @Test
    fun callGet() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val datasetService = client.datasets()
        val trainEvalDataset =
            datasetService.get(DatasetGetParams.builder().datasetUuid("dataset_uuid").build())
        println(trainEvalDataset)
        trainEvalDataset.validate()
    }
}
