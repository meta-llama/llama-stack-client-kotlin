// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PostTrainingJobStatusParamsTest {

    @Test
    fun createPostTrainingJobStatusParams() {
        PostTrainingJobStatusParams.builder()
            .jobUuid("job_uuid")
            .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
            .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            PostTrainingJobStatusParams.builder()
                .jobUuid("job_uuid")
                .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                .build()
        val expected = QueryParams.builder()
        expected.put("job_uuid", "job_uuid")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = PostTrainingJobStatusParams.builder().jobUuid("job_uuid").build()
        val expected = QueryParams.builder()
        expected.put("job_uuid", "job_uuid")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
