// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ModelUnregisterParamsTest {

    @Test
    fun create() {
        ModelUnregisterParams.builder().modelId("model_id").build()
    }

    @Test
    fun getPathParam() {
        val params = ModelUnregisterParams.builder().modelId("model_id").build()
        assertThat(params).isNotNull
        // path param "modelId"
        assertThat(params.getPathParam(0)).isEqualTo("model_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
