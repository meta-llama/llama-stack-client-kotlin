// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DatasetioGetRowsPaginatedParamsTest {

    @Test
    fun createDatasetioGetRowsPaginatedParams() {
        DatasetioGetRowsPaginatedParams.builder()
            .xLlamaStackProviderData("X-LlamaStack-ProviderData")
            .datasetId("dataset_id")
            .rowsInPage(123L)
            .filterCondition("filter_condition")
            .pageToken("page_token")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            DatasetioGetRowsPaginatedParams.builder()
                .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                .datasetId("dataset_id")
                .rowsInPage(123L)
                .filterCondition("filter_condition")
                .pageToken("page_token")
                .build()
        val expected = QueryParams.builder()
        expected.put("dataset_id", "dataset_id")
        expected.put("rows_in_page", "123")
        expected.put("filter_condition", "filter_condition")
        expected.put("page_token", "page_token")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            DatasetioGetRowsPaginatedParams.builder()
                .datasetId("dataset_id")
                .rowsInPage(123L)
                .build()
        val expected = QueryParams.builder()
        expected.put("dataset_id", "dataset_id")
        expected.put("rows_in_page", "123")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
