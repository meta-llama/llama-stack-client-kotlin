// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PostTrainingJobLogsParamsTest {

    @Test
    fun createPostTrainingJobLogsParams() {
        PostTrainingJobLogsParams.builder()
            .xLlamaStackProviderData("X-LlamaStack-ProviderData")
            .jobUuid("job_uuid")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            PostTrainingJobLogsParams.builder()
                .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                .jobUuid("job_uuid")
                .build()
        val expected = QueryParams.builder()
        expected.put("job_uuid", "job_uuid")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = PostTrainingJobLogsParams.builder().jobUuid("job_uuid").build()
        val expected = QueryParams.builder()
        expected.put("job_uuid", "job_uuid")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
