// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EvalJobCancelParamsTest {

    @Test
    fun create() {
        EvalJobCancelParams.builder().benchmarkId("benchmark_id").jobId("job_id").build()
    }

    @Test
    fun pathParams() {
        val params =
            EvalJobCancelParams.builder().benchmarkId("benchmark_id").jobId("job_id").build()

        assertThat(params._pathParam(0)).isEqualTo("benchmark_id")
        assertThat(params._pathParam(1)).isEqualTo("job_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
