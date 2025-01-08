// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking.postTraining

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.models.PostTrainingJobArtifactsParams
import com.llama.llamastack.models.PostTrainingJobCancelParams
import com.llama.llamastack.models.PostTrainingJobListParams
import com.llama.llamastack.models.PostTrainingJobStatusParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class JobServiceTest {

    @Disabled(
        "skipped: currently no good way to test endpoints with content type application/jsonl, Prism mock server will fail"
    )
    @Test
    fun callList() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val jobService = client.postTraining().job()
        val postTrainingJob =
            jobService.list(
                PostTrainingJobListParams.builder()
                    .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                    .build()
            )
        println(postTrainingJob)
        postTrainingJob.validate()
    }

    @Test
    fun callArtifacts() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val jobService = client.postTraining().job()
        val postTrainingJobArtifactsResponse =
            jobService.artifacts(
                PostTrainingJobArtifactsParams.builder()
                    .jobUuid("job_uuid")
                    .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                    .build()
            )
        println(postTrainingJobArtifactsResponse)
        postTrainingJobArtifactsResponse?.validate()
    }

    @Test
    fun callCancel() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val jobService = client.postTraining().job()
        jobService.cancel(
            PostTrainingJobCancelParams.builder()
                .jobUuid("job_uuid")
                .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                .build()
        )
    }

    @Test
    fun callStatus() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val jobService = client.postTraining().job()
        val postTrainingJobStatusResponse =
            jobService.status(
                PostTrainingJobStatusParams.builder()
                    .jobUuid("job_uuid")
                    .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                    .build()
            )
        println(postTrainingJobStatusResponse)
        postTrainingJobStatusResponse?.validate()
    }
}
