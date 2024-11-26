// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EvalJobCancelParamsTest {

    @Test
    fun createEvalJobCancelParams() {
        EvalJobCancelParams.builder()
            .jobId("job_id")
            .taskId("task_id")
            .xLlamaStackProviderData("X-LlamaStack-ProviderData")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            EvalJobCancelParams.builder()
                .jobId("job_id")
                .taskId("task_id")
                .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.jobId()).isEqualTo("job_id")
        assertThat(body.taskId()).isEqualTo("task_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = EvalJobCancelParams.builder().jobId("job_id").taskId("task_id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.jobId()).isEqualTo("job_id")
        assertThat(body.taskId()).isEqualTo("task_id")
    }
}
