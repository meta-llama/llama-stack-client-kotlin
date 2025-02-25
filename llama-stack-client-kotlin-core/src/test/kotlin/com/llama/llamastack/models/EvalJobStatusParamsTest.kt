// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EvalJobStatusParamsTest {

    @Test
    fun create() {
        EvalJobStatusParams.builder().benchmarkId("benchmark_id").jobId("job_id").build()
    }

    @Test
    fun getPathParam() {
        val params =
            EvalJobStatusParams.builder().benchmarkId("benchmark_id").jobId("job_id").build()
        assertThat(params).isNotNull
        // path param "benchmarkId"
        assertThat(params.getPathParam(0)).isEqualTo("benchmark_id")
        // path param "jobId"
        assertThat(params.getPathParam(1)).isEqualTo("job_id")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
