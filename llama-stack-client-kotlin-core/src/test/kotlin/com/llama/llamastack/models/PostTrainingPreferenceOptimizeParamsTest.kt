// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PostTrainingPreferenceOptimizeParamsTest {

    @Test
    fun createPostTrainingPreferenceOptimizeParams() {
        PostTrainingPreferenceOptimizeParams.builder()
            .algorithm(PostTrainingPreferenceOptimizeParams.Algorithm.DPO)
            .algorithmConfig(
                PostTrainingPreferenceOptimizeParams.AlgorithmConfig.builder()
                    .epsilon(0.0)
                    .gamma(0.0)
                    .rewardClip(0.0)
                    .rewardScale(0.0)
                    .build()
            )
            .datasetId("dataset_id")
            .finetunedModel("https://example.com")
            .hyperparamSearchConfig(
                PostTrainingPreferenceOptimizeParams.HyperparamSearchConfig.builder().build()
            )
            .jobUuid("job_uuid")
            .loggerConfig(PostTrainingPreferenceOptimizeParams.LoggerConfig.builder().build())
            .optimizerConfig(
                PostTrainingPreferenceOptimizeParams.OptimizerConfig.builder()
                    .lr(0.0)
                    .lrMin(0.0)
                    .optimizerType(
                        PostTrainingPreferenceOptimizeParams.OptimizerConfig.OptimizerType.ADAM
                    )
                    .weightDecay(0.0)
                    .build()
            )
            .trainingConfig(
                PostTrainingPreferenceOptimizeParams.TrainingConfig.builder()
                    .batchSize(0L)
                    .enableActivationCheckpointing(true)
                    .fsdpCpuOffload(true)
                    .memoryEfficientFsdpWrap(true)
                    .nEpochs(0L)
                    .nIters(0L)
                    .shuffle(true)
                    .build()
            )
            .validationDatasetId("validation_dataset_id")
            .xLlamaStackProviderData("X-LlamaStack-ProviderData")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            PostTrainingPreferenceOptimizeParams.builder()
                .algorithm(PostTrainingPreferenceOptimizeParams.Algorithm.DPO)
                .algorithmConfig(
                    PostTrainingPreferenceOptimizeParams.AlgorithmConfig.builder()
                        .epsilon(0.0)
                        .gamma(0.0)
                        .rewardClip(0.0)
                        .rewardScale(0.0)
                        .build()
                )
                .datasetId("dataset_id")
                .finetunedModel("https://example.com")
                .hyperparamSearchConfig(
                    PostTrainingPreferenceOptimizeParams.HyperparamSearchConfig.builder().build()
                )
                .jobUuid("job_uuid")
                .loggerConfig(PostTrainingPreferenceOptimizeParams.LoggerConfig.builder().build())
                .optimizerConfig(
                    PostTrainingPreferenceOptimizeParams.OptimizerConfig.builder()
                        .lr(0.0)
                        .lrMin(0.0)
                        .optimizerType(
                            PostTrainingPreferenceOptimizeParams.OptimizerConfig.OptimizerType.ADAM
                        )
                        .weightDecay(0.0)
                        .build()
                )
                .trainingConfig(
                    PostTrainingPreferenceOptimizeParams.TrainingConfig.builder()
                        .batchSize(0L)
                        .enableActivationCheckpointing(true)
                        .fsdpCpuOffload(true)
                        .memoryEfficientFsdpWrap(true)
                        .nEpochs(0L)
                        .nIters(0L)
                        .shuffle(true)
                        .build()
                )
                .validationDatasetId("validation_dataset_id")
                .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.algorithm()).isEqualTo(PostTrainingPreferenceOptimizeParams.Algorithm.DPO)
        assertThat(body.algorithmConfig())
            .isEqualTo(
                PostTrainingPreferenceOptimizeParams.AlgorithmConfig.builder()
                    .epsilon(0.0)
                    .gamma(0.0)
                    .rewardClip(0.0)
                    .rewardScale(0.0)
                    .build()
            )
        assertThat(body.datasetId()).isEqualTo("dataset_id")
        assertThat(body.finetunedModel()).isEqualTo("https://example.com")
        assertThat(body.hyperparamSearchConfig())
            .isEqualTo(
                PostTrainingPreferenceOptimizeParams.HyperparamSearchConfig.builder().build()
            )
        assertThat(body.jobUuid()).isEqualTo("job_uuid")
        assertThat(body.loggerConfig())
            .isEqualTo(PostTrainingPreferenceOptimizeParams.LoggerConfig.builder().build())
        assertThat(body.optimizerConfig())
            .isEqualTo(
                PostTrainingPreferenceOptimizeParams.OptimizerConfig.builder()
                    .lr(0.0)
                    .lrMin(0.0)
                    .optimizerType(
                        PostTrainingPreferenceOptimizeParams.OptimizerConfig.OptimizerType.ADAM
                    )
                    .weightDecay(0.0)
                    .build()
            )
        assertThat(body.trainingConfig())
            .isEqualTo(
                PostTrainingPreferenceOptimizeParams.TrainingConfig.builder()
                    .batchSize(0L)
                    .enableActivationCheckpointing(true)
                    .fsdpCpuOffload(true)
                    .memoryEfficientFsdpWrap(true)
                    .nEpochs(0L)
                    .nIters(0L)
                    .shuffle(true)
                    .build()
            )
        assertThat(body.validationDatasetId()).isEqualTo("validation_dataset_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            PostTrainingPreferenceOptimizeParams.builder()
                .algorithm(PostTrainingPreferenceOptimizeParams.Algorithm.DPO)
                .algorithmConfig(
                    PostTrainingPreferenceOptimizeParams.AlgorithmConfig.builder()
                        .epsilon(0.0)
                        .gamma(0.0)
                        .rewardClip(0.0)
                        .rewardScale(0.0)
                        .build()
                )
                .datasetId("dataset_id")
                .finetunedModel("https://example.com")
                .hyperparamSearchConfig(
                    PostTrainingPreferenceOptimizeParams.HyperparamSearchConfig.builder().build()
                )
                .jobUuid("job_uuid")
                .loggerConfig(PostTrainingPreferenceOptimizeParams.LoggerConfig.builder().build())
                .optimizerConfig(
                    PostTrainingPreferenceOptimizeParams.OptimizerConfig.builder()
                        .lr(0.0)
                        .lrMin(0.0)
                        .optimizerType(
                            PostTrainingPreferenceOptimizeParams.OptimizerConfig.OptimizerType.ADAM
                        )
                        .weightDecay(0.0)
                        .build()
                )
                .trainingConfig(
                    PostTrainingPreferenceOptimizeParams.TrainingConfig.builder()
                        .batchSize(0L)
                        .enableActivationCheckpointing(true)
                        .fsdpCpuOffload(true)
                        .memoryEfficientFsdpWrap(true)
                        .nEpochs(0L)
                        .nIters(0L)
                        .shuffle(true)
                        .build()
                )
                .validationDatasetId("validation_dataset_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.algorithm()).isEqualTo(PostTrainingPreferenceOptimizeParams.Algorithm.DPO)
        assertThat(body.algorithmConfig())
            .isEqualTo(
                PostTrainingPreferenceOptimizeParams.AlgorithmConfig.builder()
                    .epsilon(0.0)
                    .gamma(0.0)
                    .rewardClip(0.0)
                    .rewardScale(0.0)
                    .build()
            )
        assertThat(body.datasetId()).isEqualTo("dataset_id")
        assertThat(body.finetunedModel()).isEqualTo("https://example.com")
        assertThat(body.hyperparamSearchConfig())
            .isEqualTo(
                PostTrainingPreferenceOptimizeParams.HyperparamSearchConfig.builder().build()
            )
        assertThat(body.jobUuid()).isEqualTo("job_uuid")
        assertThat(body.loggerConfig())
            .isEqualTo(PostTrainingPreferenceOptimizeParams.LoggerConfig.builder().build())
        assertThat(body.optimizerConfig())
            .isEqualTo(
                PostTrainingPreferenceOptimizeParams.OptimizerConfig.builder()
                    .lr(0.0)
                    .lrMin(0.0)
                    .optimizerType(
                        PostTrainingPreferenceOptimizeParams.OptimizerConfig.OptimizerType.ADAM
                    )
                    .weightDecay(0.0)
                    .build()
            )
        assertThat(body.trainingConfig())
            .isEqualTo(
                PostTrainingPreferenceOptimizeParams.TrainingConfig.builder()
                    .batchSize(0L)
                    .enableActivationCheckpointing(true)
                    .fsdpCpuOffload(true)
                    .memoryEfficientFsdpWrap(true)
                    .nEpochs(0L)
                    .nIters(0L)
                    .shuffle(true)
                    .build()
            )
        assertThat(body.validationDatasetId()).isEqualTo("validation_dataset_id")
    }
}
