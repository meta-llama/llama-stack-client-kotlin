// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking.eval

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.models.EvalJobCancelParams
import com.llama.llamastack.models.EvalJobRetrieveParams
import com.llama.llamastack.models.EvalJobStatusParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class JobServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val jobService = client.eval().jobs()
        val evaluateResponse =
            jobService.retrieve(
                EvalJobRetrieveParams.builder().taskId("task_id").jobId("job_id").build()
            )
        println(evaluateResponse)
        evaluateResponse.validate()
    }

    @Test
    fun callCancel() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val jobService = client.eval().jobs()
        jobService.cancel(EvalJobCancelParams.builder().taskId("task_id").jobId("job_id").build())
    }

    @Test
    fun callStatus() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val jobService = client.eval().jobs()
        val evalJobStatusResponse =
            jobService.status(
                EvalJobStatusParams.builder().taskId("task_id").jobId("job_id").build()
            )
        println(evalJobStatusResponse)
    }
}
