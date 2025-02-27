// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DatasetUnregisterParamsTest {

    @Test
    fun create() {
        DatasetUnregisterParams.builder().datasetId("dataset_id").build()
    }

    @Test
    fun getPathParam() {
        val params = DatasetUnregisterParams.builder().datasetId("dataset_id").build()
        assertThat(params).isNotNull
        // path param "datasetId"
        assertThat(params.getPathParam(0)).isEqualTo("dataset_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
