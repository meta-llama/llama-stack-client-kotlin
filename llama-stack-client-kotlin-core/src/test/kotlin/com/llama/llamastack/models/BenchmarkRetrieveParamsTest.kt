// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BenchmarkRetrieveParamsTest {

    @Test
    fun create() {
        BenchmarkRetrieveParams.builder().benchmarkId("benchmark_id").build()
    }

    @Test
    fun pathParams() {
        val params = BenchmarkRetrieveParams.builder().benchmarkId("benchmark_id").build()

        assertThat(params._pathParam(0)).isEqualTo("benchmark_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
