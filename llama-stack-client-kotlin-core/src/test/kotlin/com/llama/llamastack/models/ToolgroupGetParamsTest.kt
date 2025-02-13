// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ToolgroupGetParamsTest {

    @Test
    fun create() {
        ToolgroupGetParams.builder().toolgroupId("toolgroup_id").build()
    }

    @Test
    fun getPathParam() {
        val params = ToolgroupGetParams.builder().toolgroupId("toolgroup_id").build()
        assertThat(params).isNotNull
        // path param "toolgroupId"
        assertThat(params.getPathParam(0)).isEqualTo("toolgroup_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
