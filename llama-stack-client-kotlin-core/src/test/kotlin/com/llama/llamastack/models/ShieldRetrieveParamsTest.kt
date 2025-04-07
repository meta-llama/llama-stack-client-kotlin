// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ShieldRetrieveParamsTest {

    @Test
    fun create() {
        ShieldRetrieveParams.builder().identifier("identifier").build()
    }

    @Test
    fun pathParams() {
        val params = ShieldRetrieveParams.builder().identifier("identifier").build()

        assertThat(params._pathParam(0)).isEqualTo("identifier")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
