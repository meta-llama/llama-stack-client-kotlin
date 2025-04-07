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
internal class JobServiceTest {

    @Test
    fun retrieve() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val jobService = client.eval().jobs()

        val evaluateResponse =
            jobService.retrieve(
                EvalJobRetrieveParams.builder().benchmarkId("benchmark_id").jobId("job_id").build()
            )

        evaluateResponse.validate()
    }

    @Test
    fun cancel() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val jobService = client.eval().jobs()

        jobService.cancel(
            EvalJobCancelParams.builder().benchmarkId("benchmark_id").jobId("job_id").build()
        )
    }

    @Test
    fun status() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val jobService = client.eval().jobs()

        val job =
            jobService.status(
                EvalJobStatusParams.builder().benchmarkId("benchmark_id").jobId("job_id").build()
            )

        job.validate()
    }
}
