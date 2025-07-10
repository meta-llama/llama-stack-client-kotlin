// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PostTrainingJobArtifactsResponseTest {

    @Test
    fun create() {
        val postTrainingJobArtifactsResponse =
            PostTrainingJobArtifactsResponse.builder()
                .addCheckpoint(
                    PostTrainingJobArtifactsResponse.Checkpoint.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .epoch(0L)
                        .identifier("identifier")
                        .path("path")
                        .postTrainingJobId("post_training_job_id")
                        .trainingMetrics(
                            PostTrainingJobArtifactsResponse.Checkpoint.TrainingMetrics.builder()
                                .epoch(0L)
                                .perplexity(0.0)
                                .trainLoss(0.0)
                                .validationLoss(0.0)
                                .build()
                        )
                        .build()
                )
                .jobUuid("job_uuid")
                .build()

        assertThat(postTrainingJobArtifactsResponse.checkpoints())
            .containsExactly(
                PostTrainingJobArtifactsResponse.Checkpoint.builder()
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .epoch(0L)
                    .identifier("identifier")
                    .path("path")
                    .postTrainingJobId("post_training_job_id")
                    .trainingMetrics(
                        PostTrainingJobArtifactsResponse.Checkpoint.TrainingMetrics.builder()
                            .epoch(0L)
                            .perplexity(0.0)
                            .trainLoss(0.0)
                            .validationLoss(0.0)
                            .build()
                    )
                    .build()
            )
        assertThat(postTrainingJobArtifactsResponse.jobUuid()).isEqualTo("job_uuid")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val postTrainingJobArtifactsResponse =
            PostTrainingJobArtifactsResponse.builder()
                .addCheckpoint(
                    PostTrainingJobArtifactsResponse.Checkpoint.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .epoch(0L)
                        .identifier("identifier")
                        .path("path")
                        .postTrainingJobId("post_training_job_id")
                        .trainingMetrics(
                            PostTrainingJobArtifactsResponse.Checkpoint.TrainingMetrics.builder()
                                .epoch(0L)
                                .perplexity(0.0)
                                .trainLoss(0.0)
                                .validationLoss(0.0)
                                .build()
                        )
                        .build()
                )
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
