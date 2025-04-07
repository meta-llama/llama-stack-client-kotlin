// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolgroupGetParamsTest {

    @Test
    fun create() {
        ToolgroupGetParams.builder().toolgroupId("toolgroup_id").build()
    }

    @Test
    fun pathParams() {
        val params = ToolgroupGetParams.builder().toolgroupId("toolgroup_id").build()

        assertThat(params._pathParam(0)).isEqualTo("toolgroup_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
