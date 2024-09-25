// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import com.llama_stack_client.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PostTrainingJobArtifactsTest {

    @Test
    fun createPostTrainingJobArtifacts() {
        val postTrainingJobArtifacts =
            PostTrainingJobArtifacts.builder()
                .checkpoints(listOf(JsonValue.from(mapOf<String, Any>())))
                .jobUuid("job_uuid")
                .build()
        assertThat(postTrainingJobArtifacts).isNotNull
        assertThat(postTrainingJobArtifacts.checkpoints())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(postTrainingJobArtifacts.jobUuid()).isEqualTo("job_uuid")
    }
}
