// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.services.blocking.evaluate.jobs

import com.llama_stack_client.api.TestServerExtension
import com.llama_stack_client.api.client.okhttp.LlamaStackClientOkHttpClient
import com.llama_stack_client.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class StatusServiceTest {

    @Test
    fun callList() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val statusService = client.evaluate().jobs().status()
        val evaluationJobStatus =
            statusService.list(EvaluateJobStatusListParams.builder().jobUuid("job_uuid").build())
        println(evaluationJobStatus)
        evaluationJobStatus.validate()
    }
}
