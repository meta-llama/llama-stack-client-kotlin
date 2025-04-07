// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PostTrainingJobArtifactsParamsTest {

    @Test
    fun create() {
        PostTrainingJobArtifactsParams.builder().jobUuid("job_uuid").build()
    }

    @Test
    fun queryParams() {
        val params = PostTrainingJobArtifactsParams.builder().jobUuid("job_uuid").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("job_uuid", "job_uuid").build())
    }
}
