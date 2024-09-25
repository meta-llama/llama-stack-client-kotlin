// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import com.llama_stack_client.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DatasetDeleteParamsTest {

    @Test
    fun createDatasetDeleteParams() {
        DatasetDeleteParams.builder().datasetUuid("dataset_uuid").build()
    }

    @Test
    fun getBody() {
        val params = DatasetDeleteParams.builder().datasetUuid("dataset_uuid").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.datasetUuid()).isEqualTo("dataset_uuid")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = DatasetDeleteParams.builder().datasetUuid("dataset_uuid").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.datasetUuid()).isEqualTo("dataset_uuid")
    }
}
