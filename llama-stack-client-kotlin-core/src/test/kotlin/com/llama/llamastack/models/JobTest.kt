// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class JobTest {

    @Test
    fun createJob() {
        val job = Job.builder().jobId("job_id").build()
        assertThat(job).isNotNull
        assertThat(job.jobId()).isEqualTo("job_id")
    }
}
