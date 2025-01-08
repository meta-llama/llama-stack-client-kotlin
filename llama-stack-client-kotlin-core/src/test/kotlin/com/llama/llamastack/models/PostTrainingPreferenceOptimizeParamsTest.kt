// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PostTrainingPreferenceOptimizeParamsTest {

    @Test
    fun createPostTrainingPreferenceOptimizeParams() {
        PostTrainingPreferenceOptimizeParams.builder()
            .algorithmConfig(
                PostTrainingPreferenceOptimizeParams.AlgorithmConfig.builder()
                    .epsilon(0.0)
                    .gamma(0.0)
                    .rewardClip(0.0)
                    .rewardScale(0.0)
                    .build()
            )
            .finetunedModel("finetuned_model")
            .hyperparamSearchConfig(
                PostTrainingPreferenceOptimizeParams.HyperparamSearchConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
            .jobUuid("job_uuid")
            .loggerConfig(
                PostTrainingPreferenceOptimizeParams.LoggerConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
            .trainingConfig(
                PostTrainingPreferenceOptimizeParams.TrainingConfig.builder()
                    .dataConfig(
                        PostTrainingPreferenceOptimizeParams.TrainingConfig.DataConfig.builder()
                            .batchSize(0L)
                            .datasetId("dataset_id")
                            .shuffle(true)
                            .packed(true)
                            .trainOnInput(true)
                            .validationDatasetId("validation_dataset_id")
                            .build()
                    )
                    .gradientAccumulationSteps(0L)
                    .maxStepsPerEpoch(0L)
                    .nEpochs(0L)
                    .optimizerConfig(
                        PostTrainingPreferenceOptimizeParams.TrainingConfig.OptimizerConfig
                            .builder()
                            .lr(0.0)
                            .numWarmupSteps(0L)
                            .optimizerType(
                                PostTrainingPreferenceOptimizeParams.TrainingConfig.OptimizerConfig
                                    .OptimizerType
                                    .ADAM
                            )
                            .weightDecay(0.0)
                            .build()
                    )
                    .dtype("dtype")
                    .efficiencyConfig(
                        PostTrainingPreferenceOptimizeParams.TrainingConfig.EfficiencyConfig
                            .builder()
                            .enableActivationCheckpointing(true)
                            .enableActivationOffloading(true)
                            .fsdpCpuOffload(true)
                            .memoryEfficientFsdpWrap(true)
                            .build()
                    )
                    .build()
            )
            .xLlamaStackProviderData("X-LlamaStack-ProviderData")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            PostTrainingPreferenceOptimizeParams.builder()
                .algorithmConfig(
                    PostTrainingPreferenceOptimizeParams.AlgorithmConfig.builder()
                        .epsilon(0.0)
                        .gamma(0.0)
                        .rewardClip(0.0)
                        .rewardScale(0.0)
                        .build()
                )
                .finetunedModel("finetuned_model")
                .hyperparamSearchConfig(
                    PostTrainingPreferenceOptimizeParams.HyperparamSearchConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .jobUuid("job_uuid")
                .loggerConfig(
                    PostTrainingPreferenceOptimizeParams.LoggerConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .trainingConfig(
                    PostTrainingPreferenceOptimizeParams.TrainingConfig.builder()
                        .dataConfig(
                            PostTrainingPreferenceOptimizeParams.TrainingConfig.DataConfig.builder()
                                .batchSize(0L)
                                .datasetId("dataset_id")
                                .shuffle(true)
                                .packed(true)
                                .trainOnInput(true)
                                .validationDatasetId("validation_dataset_id")
                                .build()
                        )
                        .gradientAccumulationSteps(0L)
                        .maxStepsPerEpoch(0L)
                        .nEpochs(0L)
                        .optimizerConfig(
                            PostTrainingPreferenceOptimizeParams.TrainingConfig.OptimizerConfig
                                .builder()
                                .lr(0.0)
                                .numWarmupSteps(0L)
                                .optimizerType(
                                    PostTrainingPreferenceOptimizeParams.TrainingConfig
                                        .OptimizerConfig
                                        .OptimizerType
                                        .ADAM
                                )
                                .weightDecay(0.0)
                                .build()
                        )
                        .dtype("dtype")
                        .efficiencyConfig(
                            PostTrainingPreferenceOptimizeParams.TrainingConfig.EfficiencyConfig
                                .builder()
                                .enableActivationCheckpointing(true)
                                .enableActivationOffloading(true)
                                .fsdpCpuOffload(true)
                                .memoryEfficientFsdpWrap(true)
                                .build()
                        )
                        .build()
                )
                .xLlamaStackProviderData("X-LlamaStack-ProviderData")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.algorithmConfig())
            .isEqualTo(
                PostTrainingPreferenceOptimizeParams.AlgorithmConfig.builder()
                    .epsilon(0.0)
                    .gamma(0.0)
                    .rewardClip(0.0)
                    .rewardScale(0.0)
                    .build()
            )
        assertThat(body.finetunedModel()).isEqualTo("finetuned_model")
        assertThat(body.hyperparamSearchConfig())
            .isEqualTo(
                PostTrainingPreferenceOptimizeParams.HyperparamSearchConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(body.jobUuid()).isEqualTo("job_uuid")
        assertThat(body.loggerConfig())
            .isEqualTo(
                PostTrainingPreferenceOptimizeParams.LoggerConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(body.trainingConfig())
            .isEqualTo(
                PostTrainingPreferenceOptimizeParams.TrainingConfig.builder()
                    .dataConfig(
                        PostTrainingPreferenceOptimizeParams.TrainingConfig.DataConfig.builder()
                            .batchSize(0L)
                            .datasetId("dataset_id")
                            .shuffle(true)
                            .packed(true)
                            .trainOnInput(true)
                            .validationDatasetId("validation_dataset_id")
                            .build()
                    )
                    .gradientAccumulationSteps(0L)
                    .maxStepsPerEpoch(0L)
                    .nEpochs(0L)
                    .optimizerConfig(
                        PostTrainingPreferenceOptimizeParams.TrainingConfig.OptimizerConfig
                            .builder()
                            .lr(0.0)
                            .numWarmupSteps(0L)
                            .optimizerType(
                                PostTrainingPreferenceOptimizeParams.TrainingConfig.OptimizerConfig
                                    .OptimizerType
                                    .ADAM
                            )
                            .weightDecay(0.0)
                            .build()
                    )
                    .dtype("dtype")
                    .efficiencyConfig(
                        PostTrainingPreferenceOptimizeParams.TrainingConfig.EfficiencyConfig
                            .builder()
                            .enableActivationCheckpointing(true)
                            .enableActivationOffloading(true)
                            .fsdpCpuOffload(true)
                            .memoryEfficientFsdpWrap(true)
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            PostTrainingPreferenceOptimizeParams.builder()
                .algorithmConfig(
                    PostTrainingPreferenceOptimizeParams.AlgorithmConfig.builder()
                        .epsilon(0.0)
                        .gamma(0.0)
                        .rewardClip(0.0)
                        .rewardScale(0.0)
                        .build()
                )
                .finetunedModel("finetuned_model")
                .hyperparamSearchConfig(
                    PostTrainingPreferenceOptimizeParams.HyperparamSearchConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .jobUuid("job_uuid")
                .loggerConfig(
                    PostTrainingPreferenceOptimizeParams.LoggerConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .trainingConfig(
                    PostTrainingPreferenceOptimizeParams.TrainingConfig.builder()
                        .dataConfig(
                            PostTrainingPreferenceOptimizeParams.TrainingConfig.DataConfig.builder()
                                .batchSize(0L)
                                .datasetId("dataset_id")
                                .shuffle(true)
                                .build()
                        )
                        .gradientAccumulationSteps(0L)
                        .maxStepsPerEpoch(0L)
                        .nEpochs(0L)
                        .optimizerConfig(
                            PostTrainingPreferenceOptimizeParams.TrainingConfig.OptimizerConfig
                                .builder()
                                .lr(0.0)
                                .numWarmupSteps(0L)
                                .optimizerType(
                                    PostTrainingPreferenceOptimizeParams.TrainingConfig
                                        .OptimizerConfig
                                        .OptimizerType
                                        .ADAM
                                )
                                .weightDecay(0.0)
                                .build()
                        )
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.algorithmConfig())
            .isEqualTo(
                PostTrainingPreferenceOptimizeParams.AlgorithmConfig.builder()
                    .epsilon(0.0)
                    .gamma(0.0)
                    .rewardClip(0.0)
                    .rewardScale(0.0)
                    .build()
            )
        assertThat(body.finetunedModel()).isEqualTo("finetuned_model")
        assertThat(body.hyperparamSearchConfig())
            .isEqualTo(
                PostTrainingPreferenceOptimizeParams.HyperparamSearchConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(body.jobUuid()).isEqualTo("job_uuid")
        assertThat(body.loggerConfig())
            .isEqualTo(
                PostTrainingPreferenceOptimizeParams.LoggerConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(body.trainingConfig())
            .isEqualTo(
                PostTrainingPreferenceOptimizeParams.TrainingConfig.builder()
                    .dataConfig(
                        PostTrainingPreferenceOptimizeParams.TrainingConfig.DataConfig.builder()
                            .batchSize(0L)
                            .datasetId("dataset_id")
                            .shuffle(true)
                            .build()
                    )
                    .gradientAccumulationSteps(0L)
                    .maxStepsPerEpoch(0L)
                    .nEpochs(0L)
                    .optimizerConfig(
                        PostTrainingPreferenceOptimizeParams.TrainingConfig.OptimizerConfig
                            .builder()
                            .lr(0.0)
                            .numWarmupSteps(0L)
                            .optimizerType(
                                PostTrainingPreferenceOptimizeParams.TrainingConfig.OptimizerConfig
                                    .OptimizerType
                                    .ADAM
                            )
                            .weightDecay(0.0)
                            .build()
                    )
                    .build()
            )
    }
}
