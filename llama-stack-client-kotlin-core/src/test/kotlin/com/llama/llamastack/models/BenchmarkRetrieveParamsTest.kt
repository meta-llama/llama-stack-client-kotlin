// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BenchmarkRetrieveParamsTest {

    @Test
    fun create() {
        BenchmarkRetrieveParams.builder().benchmarkId("benchmark_id").build()
    }

    @Test
    fun getPathParam() {
        val params = BenchmarkRetrieveParams.builder().benchmarkId("benchmark_id").build()
        assertThat(params).isNotNull
        // path param "benchmarkId"
        assertThat(params.getPathParam(0)).isEqualTo("benchmark_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
