// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VectorDbUnregisterParamsTest {

    @Test
    fun create() {
        VectorDbUnregisterParams.builder().vectorDbId("vector_db_id").build()
    }

    @Test
    fun pathParams() {
        val params = VectorDbUnregisterParams.builder().vectorDbId("vector_db_id").build()

        assertThat(params._pathParam(0)).isEqualTo("vector_db_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
