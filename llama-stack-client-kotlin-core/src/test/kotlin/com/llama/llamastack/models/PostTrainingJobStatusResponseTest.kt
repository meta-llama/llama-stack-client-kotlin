// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PostTrainingJobStatusResponseTest {

    @Test
    fun create() {
        val postTrainingJobStatusResponse =
            PostTrainingJobStatusResponse.builder()
                .addCheckpoint(
                    PostTrainingJobStatusResponse.Checkpoint.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .epoch(0L)
                        .identifier("identifier")
                        .path("path")
                        .postTrainingJobId("post_training_job_id")
                        .trainingMetrics(
                            PostTrainingJobStatusResponse.Checkpoint.TrainingMetrics.builder()
                                .epoch(0L)
                                .perplexity(0.0)
                                .trainLoss(0.0)
                                .validationLoss(0.0)
                                .build()
                        )
                        .build()
                )
                .jobUuid("job_uuid")
                .status(PostTrainingJobStatusResponse.Status.COMPLETED)
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .resourcesAllocated(
                    PostTrainingJobStatusResponse.ResourcesAllocated.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(postTrainingJobStatusResponse.checkpoints())
            .containsExactly(
                PostTrainingJobStatusResponse.Checkpoint.builder()
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .epoch(0L)
                    .identifier("identifier")
                    .path("path")
                    .postTrainingJobId("post_training_job_id")
                    .trainingMetrics(
                        PostTrainingJobStatusResponse.Checkpoint.TrainingMetrics.builder()
                            .epoch(0L)
                            .perplexity(0.0)
                            .trainLoss(0.0)
                            .validationLoss(0.0)
                            .build()
                    )
                    .build()
            )
        assertThat(postTrainingJobStatusResponse.jobUuid()).isEqualTo("job_uuid")
        assertThat(postTrainingJobStatusResponse.status())
            .isEqualTo(PostTrainingJobStatusResponse.Status.COMPLETED)
        assertThat(postTrainingJobStatusResponse.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(postTrainingJobStatusResponse.resourcesAllocated())
            .isEqualTo(
                PostTrainingJobStatusResponse.ResourcesAllocated.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(postTrainingJobStatusResponse.scheduledAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(postTrainingJobStatusResponse.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val postTrainingJobStatusResponse =
            PostTrainingJobStatusResponse.builder()
                .addCheckpoint(
                    PostTrainingJobStatusResponse.Checkpoint.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .epoch(0L)
                        .identifier("identifier")
                        .path("path")
                        .postTrainingJobId("post_training_job_id")
                        .trainingMetrics(
                            PostTrainingJobStatusResponse.Checkpoint.TrainingMetrics.builder()
                                .epoch(0L)
                                .perplexity(0.0)
                                .trainLoss(0.0)
                                .validationLoss(0.0)
                                .build()
                        )
                        .build()
                )
                .jobUuid("job_uuid")
                .status(PostTrainingJobStatusResponse.Status.COMPLETED)
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .resourcesAllocated(
                    PostTrainingJobStatusResponse.ResourcesAllocated.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .scheduledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedPostTrainingJobStatusResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(postTrainingJobStatusResponse),
                jacksonTypeRef<PostTrainingJobStatusResponse>(),
            )

        assertThat(roundtrippedPostTrainingJobStatusResponse)
            .isEqualTo(postTrainingJobStatusResponse)
    }
}
