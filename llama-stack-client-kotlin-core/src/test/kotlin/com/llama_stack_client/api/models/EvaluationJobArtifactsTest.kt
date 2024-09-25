// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EvaluationJobArtifactsTest {

    @Test
    fun createEvaluationJobArtifacts() {
        val evaluationJobArtifacts = EvaluationJobArtifacts.builder().jobUuid("job_uuid").build()
        assertThat(evaluationJobArtifacts).isNotNull
        assertThat(evaluationJobArtifacts.jobUuid()).isEqualTo("job_uuid")
    }
}
