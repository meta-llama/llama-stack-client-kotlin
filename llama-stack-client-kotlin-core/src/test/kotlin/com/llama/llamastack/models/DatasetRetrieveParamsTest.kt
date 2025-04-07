// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DatasetRetrieveParamsTest {

    @Test
    fun create() {
        DatasetRetrieveParams.builder().datasetId("dataset_id").build()
    }

    @Test
    fun pathParams() {
        val params = DatasetRetrieveParams.builder().datasetId("dataset_id").build()

        assertThat(params._pathParam(0)).isEqualTo("dataset_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
