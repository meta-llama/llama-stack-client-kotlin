// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EvalJobStatusParamsTest {

    @Test
    fun create() {
        EvalJobStatusParams.builder().taskId("task_id").jobId("job_id").build()
    }

    @Test
    fun getPathParam() {
        val params = EvalJobStatusParams.builder().taskId("task_id").jobId("job_id").build()
        assertThat(params).isNotNull
        // path param "taskId"
        assertThat(params.getPathParam(0)).isEqualTo("task_id")
        // path param "jobId"
        assertThat(params.getPathParam(1)).isEqualTo("job_id")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
