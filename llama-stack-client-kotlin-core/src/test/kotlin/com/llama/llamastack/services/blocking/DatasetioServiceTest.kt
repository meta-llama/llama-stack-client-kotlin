// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class DatasetioServiceTest {

    @Test
    fun callGetRowsPaginated() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val datasetioService = client.datasetio()
        val paginatedRowsResult =
            datasetioService.getRowsPaginated(
                DatasetioGetRowsPaginatedParams.builder()
                    .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                    .datasetId("dataset_id")
                    .rowsInPage(123L)
                    .filterCondition("filter_condition")
                    .pageToken("page_token")
                    .build()
            )
        println(paginatedRowsResult)
        paginatedRowsResult.validate()
    }
}
