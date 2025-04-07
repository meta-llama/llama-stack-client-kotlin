// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PostTrainingJobArtifactsResponseTest {

    @Test
    fun create() {
        val postTrainingJobArtifactsResponse =
            PostTrainingJobArtifactsResponse.builder()
                .addCheckpoint(JsonValue.from(mapOf<String, Any>()))
                .jobUuid("job_uuid")
                .build()

        assertThat(postTrainingJobArtifactsResponse.checkpoints())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(postTrainingJobArtifactsResponse.jobUuid()).isEqualTo("job_uuid")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val postTrainingJobArtifactsResponse =
            PostTrainingJobArtifactsResponse.builder()
                .addCheckpoint(JsonValue.from(mapOf<String, Any>()))
                .jobUuid("job_uuid")
                .build()

        val roundtrippedPostTrainingJobArtifactsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(postTrainingJobArtifactsResponse),
                jacksonTypeRef<PostTrainingJobArtifactsResponse>(),
            )

        assertThat(roundtrippedPostTrainingJobArtifactsResponse)
            .isEqualTo(postTrainingJobArtifactsResponse)
    }
}
