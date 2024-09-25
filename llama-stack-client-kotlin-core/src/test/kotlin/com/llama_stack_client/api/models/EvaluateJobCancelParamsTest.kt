// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import com.llama_stack_client.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EvaluateJobCancelParamsTest {

    @Test
    fun createEvaluateJobCancelParams() {
        EvaluateJobCancelParams.builder().jobUuid("job_uuid").build()
    }

    @Test
    fun getBody() {
        val params = EvaluateJobCancelParams.builder().jobUuid("job_uuid").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.jobUuid()).isEqualTo("job_uuid")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = EvaluateJobCancelParams.builder().jobUuid("job_uuid").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.jobUuid()).isEqualTo("job_uuid")
    }
}
