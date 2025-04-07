// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async.postTraining

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClientAsync
import com.llama.llamastack.models.PostTrainingJobArtifactsParams
import com.llama.llamastack.models.PostTrainingJobCancelParams
import com.llama.llamastack.models.PostTrainingJobStatusParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class JobServiceAsyncTest {

    @Test
    suspend fun list() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val jobServiceAsync = client.postTraining().job()

        val jobs = jobServiceAsync.list()

        jobs.forEach { it.validate() }
    }

    @Test
    suspend fun artifacts() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val jobServiceAsync = client.postTraining().job()

        val response =
            jobServiceAsync.artifacts(
                PostTrainingJobArtifactsParams.builder().jobUuid("job_uuid").build()
            )

        response.validate()
    }

    @Test
    suspend fun cancel() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val jobServiceAsync = client.postTraining().job()

        jobServiceAsync.cancel(PostTrainingJobCancelParams.builder().jobUuid("job_uuid").build())
    }

    @Test
    suspend fun status() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val jobServiceAsync = client.postTraining().job()

        val response =
            jobServiceAsync.status(
                PostTrainingJobStatusParams.builder().jobUuid("job_uuid").build()
            )

        response.validate()
    }
}
