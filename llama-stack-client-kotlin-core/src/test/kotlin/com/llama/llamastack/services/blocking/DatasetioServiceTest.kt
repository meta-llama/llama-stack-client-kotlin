// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.DatasetioAppendRowsParams
import com.llama.llamastack.models.DatasetioGetRowsPaginatedParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class DatasetioServiceTest {

    @Test
    fun callAppendRows() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val datasetioService = client.datasetio()
        datasetioService.appendRows(
            DatasetioAppendRowsParams.builder()
                .datasetId("dataset_id")
                .rows(
                    listOf(
                        DatasetioAppendRowsParams.Row.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                )
                .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                .build()
        )
    }

    @Test
    fun callGetRowsPaginated() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val datasetioService = client.datasetio()
        val paginatedRowsResult =
            datasetioService.getRowsPaginated(
                DatasetioGetRowsPaginatedParams.builder()
                    .datasetId("dataset_id")
                    .rowsInPage(0L)
                    .filterCondition("filter_condition")
                    .pageToken("page_token")
                    .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                    .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                    .build()
            )
        println(paginatedRowsResult)
        paginatedRowsResult.validate()
    }
}
