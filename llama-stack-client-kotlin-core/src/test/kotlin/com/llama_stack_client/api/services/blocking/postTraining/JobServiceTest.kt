// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.services.blocking.postTraining

import com.llama_stack_client.api.TestServerExtension
import com.llama_stack_client.api.client.okhttp.LlamaStackClientOkHttpClient
import com.llama_stack_client.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class JobServiceTest {

    @Test
    fun callList() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val jobService = client.postTraining().jobs()
        val postTrainingJob = jobService.list(PostTrainingJobListParams.builder().build())
        println(postTrainingJob)
        postTrainingJob.validate()
    }

    @Test
    fun callArtifacts() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val jobService = client.postTraining().jobs()
        val postTrainingJobArtifacts =
            jobService.artifacts(
                PostTrainingJobArtifactsParams.builder().jobUuid("job_uuid").build()
            )
        println(postTrainingJobArtifacts)
        postTrainingJobArtifacts.validate()
    }

    @Test
    fun callCancel() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val jobService = client.postTraining().jobs()
        jobService.cancel(PostTrainingJobCancelParams.builder().jobUuid("job_uuid").build())
    }

    @Test
    fun callLogs() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val jobService = client.postTraining().jobs()
        val postTrainingJobLogStream =
            jobService.logs(PostTrainingJobLogsParams.builder().jobUuid("job_uuid").build())
        println(postTrainingJobLogStream)
        postTrainingJobLogStream.validate()
    }

    @Test
    fun callStatus() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val jobService = client.postTraining().jobs()
        val postTrainingJobStatus =
            jobService.status(PostTrainingJobStatusParams.builder().jobUuid("job_uuid").build())
        println(postTrainingJobStatus)
        postTrainingJobStatus.validate()
    }
}
