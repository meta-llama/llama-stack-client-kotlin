// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PostTrainingJobArtifactsResponseTest {

    @Test
    fun createPostTrainingJobArtifactsResponse() {
        val postTrainingJobArtifactsResponse =
            PostTrainingJobArtifactsResponse.builder()
                .checkpoints(listOf(JsonValue.from(mapOf<String, Any>())))
                .jobUuid("job_uuid")
                .build()
        assertThat(postTrainingJobArtifactsResponse).isNotNull
        assertThat(postTrainingJobArtifactsResponse.checkpoints())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(postTrainingJobArtifactsResponse.jobUuid()).isEqualTo("job_uuid")
    }
}
