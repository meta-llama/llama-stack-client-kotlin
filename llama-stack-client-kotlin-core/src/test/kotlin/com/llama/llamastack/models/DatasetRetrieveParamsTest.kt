// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DatasetRetrieveParamsTest {

    @Test
    fun createDatasetRetrieveParams() {
        DatasetRetrieveParams.builder()
            .xLlamaStackProviderData("X-LlamaStack-ProviderData")
            .datasetId("dataset_id")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            DatasetRetrieveParams.builder()
                .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                .datasetId("dataset_id")
                .build()
        val expected = QueryParams.builder()
        expected.put("dataset_id", "dataset_id")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = DatasetRetrieveParams.builder().datasetId("dataset_id").build()
        val expected = QueryParams.builder()
        expected.put("dataset_id", "dataset_id")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
