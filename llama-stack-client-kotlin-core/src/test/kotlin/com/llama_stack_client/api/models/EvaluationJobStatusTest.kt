// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EvaluationJobStatusTest {

    @Test
    fun createEvaluationJobStatus() {
        val evaluationJobStatus = EvaluationJobStatus.builder().jobUuid("job_uuid").build()
        assertThat(evaluationJobStatus).isNotNull
        assertThat(evaluationJobStatus.jobUuid()).isEqualTo("job_uuid")
    }
}
