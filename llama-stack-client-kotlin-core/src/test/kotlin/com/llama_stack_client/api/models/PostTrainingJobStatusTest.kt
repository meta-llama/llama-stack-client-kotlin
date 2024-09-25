// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import com.llama_stack_client.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PostTrainingJobStatusTest {

    @Test
    fun createPostTrainingJobStatus() {
        val postTrainingJobStatus =
            PostTrainingJobStatus.builder()
                .checkpoints(listOf(JsonValue.from(mapOf<String, Any>())))
                .jobUuid("job_uuid")
                .status(PostTrainingJobStatus.Status.RUNNING)
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .resourcesAllocated(PostTrainingJobStatus.ResourcesAllocated.builder().build())
                .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(postTrainingJobStatus).isNotNull
        assertThat(postTrainingJobStatus.checkpoints())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(postTrainingJobStatus.jobUuid()).isEqualTo("job_uuid")
        assertThat(postTrainingJobStatus.status()).isEqualTo(PostTrainingJobStatus.Status.RUNNING)
        assertThat(postTrainingJobStatus.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(postTrainingJobStatus.resourcesAllocated())
            .isEqualTo(PostTrainingJobStatus.ResourcesAllocated.builder().build())
        assertThat(postTrainingJobStatus.scheduledAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(postTrainingJobStatus.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
