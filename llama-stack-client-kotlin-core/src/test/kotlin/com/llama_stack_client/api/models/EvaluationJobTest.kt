// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EvaluationJobTest {

    @Test
    fun createEvaluationJob() {
        val evaluationJob = EvaluationJob.builder().jobUuid("job_uuid").build()
        assertThat(evaluationJob).isNotNull
        assertThat(evaluationJob.jobUuid()).isEqualTo("job_uuid")
    }
}
