// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PostTrainingJobCancelParamsTest {

    @Test
    fun createPostTrainingJobCancelParams() {
        PostTrainingJobCancelParams.builder()
            .jobUuid("job_uuid")
            .xLlamaStackProviderData("X-LlamaStack-ProviderData")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            PostTrainingJobCancelParams.builder()
                .jobUuid("job_uuid")
                .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.jobUuid()).isEqualTo("job_uuid")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = PostTrainingJobCancelParams.builder().jobUuid("job_uuid").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.jobUuid()).isEqualTo("job_uuid")
    }
}
