// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async.eval

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClientAsync
import com.llama.llamastack.models.EvalJobCancelParams
import com.llama.llamastack.models.EvalJobRetrieveParams
import com.llama.llamastack.models.EvalJobStatusParams
import kotlin.test.assertNotNull
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class JobServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val jobServiceAsync = client.eval().jobs()

        val evaluateResponse =
            jobServiceAsync.retrieve(
                EvalJobRetrieveParams.builder().benchmarkId("benchmark_id").jobId("job_id").build()
            )

        evaluateResponse.validate()
    }

    @Test
    suspend fun cancel() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val jobServiceAsync = client.eval().jobs()

        jobServiceAsync.cancel(
            EvalJobCancelParams.builder().benchmarkId("benchmark_id").jobId("job_id").build()
        )
    }

    @Test
    suspend fun status() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val jobServiceAsync = client.eval().jobs()

        val response =
            jobServiceAsync.status(
                EvalJobStatusParams.builder().benchmarkId("benchmark_id").jobId("job_id").build()
            )

        assertNotNull(response)
    }
}
