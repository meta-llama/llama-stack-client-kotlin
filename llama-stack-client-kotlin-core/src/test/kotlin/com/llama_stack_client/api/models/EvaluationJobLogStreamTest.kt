// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EvaluationJobLogStreamTest {

    @Test
    fun createEvaluationJobLogStream() {
        val evaluationJobLogStream = EvaluationJobLogStream.builder().jobUuid("job_uuid").build()
        assertThat(evaluationJobLogStream).isNotNull
        assertThat(evaluationJobLogStream.jobUuid()).isEqualTo("job_uuid")
    }
}
