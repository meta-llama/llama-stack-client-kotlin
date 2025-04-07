// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking.postTraining

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.models.PostTrainingJobArtifactsParams
import com.llama.llamastack.models.PostTrainingJobCancelParams
import com.llama.llamastack.models.PostTrainingJobStatusParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class JobServiceTest {

    @Test
    fun list() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val jobService = client.postTraining().job()

        val jobs = jobService.list()

        jobs.forEach { it.validate() }
    }

    @Test
    fun artifacts() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val jobService = client.postTraining().job()

        val response =
            jobService.artifacts(
                PostTrainingJobArtifactsParams.builder().jobUuid("job_uuid").build()
            )

        response.validate()
    }

    @Test
    fun cancel() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val jobService = client.postTraining().job()

        jobService.cancel(PostTrainingJobCancelParams.builder().jobUuid("job_uuid").build())
    }

    @Test
    fun status() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val jobService = client.postTraining().job()

        val response =
            jobService.status(PostTrainingJobStatusParams.builder().jobUuid("job_uuid").build())

        response.validate()
    }
}
