// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PostTrainingJobArtifactsParamsTest {

    @Test
    fun create() {
        PostTrainingJobArtifactsParams.builder().jobUuid("job_uuid").build()
    }

    @Test
    fun queryParams() {
        val params = PostTrainingJobArtifactsParams.builder().jobUuid("job_uuid").build()
        val expected = QueryParams.builder()
        expected.put("job_uuid", "job_uuid")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PostTrainingJobArtifactsParams.builder().jobUuid("job_uuid").build()
        val expected = QueryParams.builder()
        expected.put("job_uuid", "job_uuid")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
