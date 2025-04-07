// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JobTest {

    @Test
    fun create() {
        val job = Job.builder().jobId("job_id").status(Job.Status.COMPLETED).build()

        assertThat(job.jobId()).isEqualTo("job_id")
        assertThat(job.status()).isEqualTo(Job.Status.COMPLETED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val job = Job.builder().jobId("job_id").status(Job.Status.COMPLETED).build()

        val roundtrippedJob =
            jsonMapper.readValue(jsonMapper.writeValueAsString(job), jacksonTypeRef<Job>())

        assertThat(roundtrippedJob).isEqualTo(job)
    }
}
