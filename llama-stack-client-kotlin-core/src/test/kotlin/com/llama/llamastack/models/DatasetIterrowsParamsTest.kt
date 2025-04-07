// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DatasetIterrowsParamsTest {

    @Test
    fun create() {
        DatasetIterrowsParams.builder().datasetId("dataset_id").limit(0L).startIndex(0L).build()
    }

    @Test
    fun pathParams() {
        val params = DatasetIterrowsParams.builder().datasetId("dataset_id").build()

        assertThat(params._pathParam(0)).isEqualTo("dataset_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            DatasetIterrowsParams.builder().datasetId("dataset_id").limit(0L).startIndex(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("limit", "0").put("start_index", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = DatasetIterrowsParams.builder().datasetId("dataset_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
