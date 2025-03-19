// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClientAsync
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.DatasetioAppendRowsParams
import com.llama.llamastack.models.DatasetioGetRowsPaginatedParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class DatasetioServiceAsyncTest {

    @Test
    suspend fun appendRows() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val datasetioServiceAsync = client.datasetio()

        datasetioServiceAsync.appendRows(
            DatasetioAppendRowsParams.builder()
                .datasetId("dataset_id")
                .addRow(
                    DatasetioAppendRowsParams.Row.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .build()
        )
    }

    @Test
    suspend fun getRowsPaginated() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val datasetioServiceAsync = client.datasetio()

        val paginatedRowsResult =
            datasetioServiceAsync.getRowsPaginated(
                DatasetioGetRowsPaginatedParams.builder()
                    .datasetId("dataset_id")
                    .rowsInPage(0L)
                    .filterCondition("filter_condition")
                    .pageToken("page_token")
                    .build()
            )

        paginatedRowsResult.validate()
    }
}
