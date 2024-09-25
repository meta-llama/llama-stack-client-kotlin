// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import com.llama_stack_client.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DatasetGetParamsTest {

    @Test
    fun createDatasetGetParams() {
        DatasetGetParams.builder().datasetUuid("dataset_uuid").build()
    }

    @Test
    fun getQueryParams() {
        val params = DatasetGetParams.builder().datasetUuid("dataset_uuid").build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("dataset_uuid", listOf("dataset_uuid"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = DatasetGetParams.builder().datasetUuid("dataset_uuid").build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("dataset_uuid", listOf("dataset_uuid"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
