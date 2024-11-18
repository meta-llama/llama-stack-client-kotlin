// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PostTrainingJobStatusResponseTest {

    @Test
    fun createPostTrainingJobStatusResponse() {
        val postTrainingJobStatusResponse =
            PostTrainingJobStatusResponse.builder()
                .checkpoints(listOf(JsonValue.from(mapOf<String, Any>())))
                .jobUuid("job_uuid")
                .status(PostTrainingJobStatusResponse.Status.RUNNING)
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .resourcesAllocated(
                    PostTrainingJobStatusResponse.ResourcesAllocated.builder().build()
                )
                .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(postTrainingJobStatusResponse).isNotNull
        assertThat(postTrainingJobStatusResponse.checkpoints())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(postTrainingJobStatusResponse.jobUuid()).isEqualTo("job_uuid")
        assertThat(postTrainingJobStatusResponse.status())
            .isEqualTo(PostTrainingJobStatusResponse.Status.RUNNING)
        assertThat(postTrainingJobStatusResponse.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(postTrainingJobStatusResponse.resourcesAllocated())
            .isEqualTo(PostTrainingJobStatusResponse.ResourcesAllocated.builder().build())
        assertThat(postTrainingJobStatusResponse.scheduledAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(postTrainingJobStatusResponse.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}