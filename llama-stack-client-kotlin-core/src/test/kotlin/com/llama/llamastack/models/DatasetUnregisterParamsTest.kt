// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DatasetUnregisterParamsTest {

    @Test
    fun createDatasetUnregisterParams() {
        DatasetUnregisterParams.builder()
            .datasetId("dataset_id")
            .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
            .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            DatasetUnregisterParams.builder()
                .datasetId("dataset_id")
                .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.datasetId()).isEqualTo("dataset_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = DatasetUnregisterParams.builder().datasetId("dataset_id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.datasetId()).isEqualTo("dataset_id")
    }
}
