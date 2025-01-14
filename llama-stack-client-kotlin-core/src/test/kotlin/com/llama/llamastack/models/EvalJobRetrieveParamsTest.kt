// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EvalJobRetrieveParamsTest {

    @Test
    fun createEvalJobRetrieveParams() {
        EvalJobRetrieveParams.builder()
            .jobId("job_id")
            .taskId("task_id")
            .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
            .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            EvalJobRetrieveParams.builder()
                .jobId("job_id")
                .taskId("task_id")
                .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                .build()
        val expected = QueryParams.builder()
        expected.put("job_id", "job_id")
        expected.put("task_id", "task_id")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = EvalJobRetrieveParams.builder().jobId("job_id").taskId("task_id").build()
        val expected = QueryParams.builder()
        expected.put("job_id", "job_id")
        expected.put("task_id", "task_id")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
