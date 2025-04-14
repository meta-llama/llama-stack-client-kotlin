// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PostTrainingSupervisedFineTuneParamsTest {

    @Test
    fun create() {
        PostTrainingSupervisedFineTuneParams.builder()
            .hyperparamSearchConfig(
                PostTrainingSupervisedFineTuneParams.HyperparamSearchConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
            .jobUuid("job_uuid")
            .loggerConfig(
                PostTrainingSupervisedFineTuneParams.LoggerConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
            .trainingConfig(
                PostTrainingSupervisedFineTuneParams.TrainingConfig.builder()
                    .gradientAccumulationSteps(0L)
                    .maxStepsPerEpoch(0L)
                    .nEpochs(0L)
                    .dataConfig(
                        PostTrainingSupervisedFineTuneParams.TrainingConfig.DataConfig.builder()
                            .batchSize(0L)
                            .dataFormat(
                                PostTrainingSupervisedFineTuneParams.TrainingConfig.DataConfig
                                    .DataFormat
                                    .INSTRUCT
                            )
                            .datasetId("dataset_id")
                            .shuffle(true)
                            .packed(true)
                            .trainOnInput(true)
                            .validationDatasetId("validation_dataset_id")
                            .build()
                    )
                    .dtype("dtype")
                    .efficiencyConfig(
                        PostTrainingSupervisedFineTuneParams.TrainingConfig.EfficiencyConfig
                            .builder()
                            .enableActivationCheckpointing(true)
                            .enableActivationOffloading(true)
                            .fsdpCpuOffload(true)
                            .memoryEfficientFsdpWrap(true)
                            .build()
                    )
                    .maxValidationSteps(0L)
                    .optimizerConfig(
                        PostTrainingSupervisedFineTuneParams.TrainingConfig.OptimizerConfig
                            .builder()
                            .lr(0.0)
                            .numWarmupSteps(0L)
                            .optimizerType(
                                PostTrainingSupervisedFineTuneParams.TrainingConfig.OptimizerConfig
                                    .OptimizerType
                                    .ADAM
                            )
                            .weightDecay(0.0)
                            .build()
                    )
                    .build()
            )
            .algorithmConfig(
                AlgorithmConfig.LoraFinetuningConfig.builder()
                    .alpha(0L)
                    .applyLoraToMlp(true)
                    .applyLoraToOutput(true)
                    .addLoraAttnModule("string")
                    .rank(0L)
                    .quantizeBase(true)
                    .useDora(true)
                    .build()
            )
            .checkpointDir("checkpoint_dir")
            .model("model")
            .build()
    }

    @Test
    fun body() {
        val params =
            PostTrainingSupervisedFineTuneParams.builder()
                .hyperparamSearchConfig(
                    PostTrainingSupervisedFineTuneParams.HyperparamSearchConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .jobUuid("job_uuid")
                .loggerConfig(
                    PostTrainingSupervisedFineTuneParams.LoggerConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .trainingConfig(
                    PostTrainingSupervisedFineTuneParams.TrainingConfig.builder()
                        .gradientAccumulationSteps(0L)
                        .maxStepsPerEpoch(0L)
                        .nEpochs(0L)
                        .dataConfig(
                            PostTrainingSupervisedFineTuneParams.TrainingConfig.DataConfig.builder()
                                .batchSize(0L)
                                .dataFormat(
                                    PostTrainingSupervisedFineTuneParams.TrainingConfig.DataConfig
                                        .DataFormat
                                        .INSTRUCT
                                )
                                .datasetId("dataset_id")
                                .shuffle(true)
                                .packed(true)
                                .trainOnInput(true)
                                .validationDatasetId("validation_dataset_id")
                                .build()
                        )
                        .dtype("dtype")
                        .efficiencyConfig(
                            PostTrainingSupervisedFineTuneParams.TrainingConfig.EfficiencyConfig
                                .builder()
                                .enableActivationCheckpointing(true)
                                .enableActivationOffloading(true)
                                .fsdpCpuOffload(true)
                                .memoryEfficientFsdpWrap(true)
                                .build()
                        )
                        .maxValidationSteps(0L)
                        .optimizerConfig(
                            PostTrainingSupervisedFineTuneParams.TrainingConfig.OptimizerConfig
                                .builder()
                                .lr(0.0)
                                .numWarmupSteps(0L)
                                .optimizerType(
                                    PostTrainingSupervisedFineTuneParams.TrainingConfig
                                        .OptimizerConfig
                                        .OptimizerType
                                        .ADAM
                                )
                                .weightDecay(0.0)
                                .build()
                        )
                        .build()
                )
                .algorithmConfig(
                    AlgorithmConfig.LoraFinetuningConfig.builder()
                        .alpha(0L)
                        .applyLoraToMlp(true)
                        .applyLoraToOutput(true)
                        .addLoraAttnModule("string")
                        .rank(0L)
                        .quantizeBase(true)
                        .useDora(true)
                        .build()
                )
                .checkpointDir("checkpoint_dir")
                .model("model")
                .build()

        val body = params._body()

        assertThat(body.hyperparamSearchConfig())
            .isEqualTo(
                PostTrainingSupervisedFineTuneParams.HyperparamSearchConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(body.jobUuid()).isEqualTo("job_uuid")
        assertThat(body.loggerConfig())
            .isEqualTo(
                PostTrainingSupervisedFineTuneParams.LoggerConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(body.trainingConfig())
            .isEqualTo(
                PostTrainingSupervisedFineTuneParams.TrainingConfig.builder()
                    .gradientAccumulationSteps(0L)
                    .maxStepsPerEpoch(0L)
                    .nEpochs(0L)
                    .dataConfig(
                        PostTrainingSupervisedFineTuneParams.TrainingConfig.DataConfig.builder()
                            .batchSize(0L)
                            .dataFormat(
                                PostTrainingSupervisedFineTuneParams.TrainingConfig.DataConfig
                                    .DataFormat
                                    .INSTRUCT
                            )
                            .datasetId("dataset_id")
                            .shuffle(true)
                            .packed(true)
                            .trainOnInput(true)
                            .validationDatasetId("validation_dataset_id")
                            .build()
                    )
                    .dtype("dtype")
                    .efficiencyConfig(
                        PostTrainingSupervisedFineTuneParams.TrainingConfig.EfficiencyConfig
                            .builder()
                            .enableActivationCheckpointing(true)
                            .enableActivationOffloading(true)
                            .fsdpCpuOffload(true)
                            .memoryEfficientFsdpWrap(true)
                            .build()
                    )
                    .maxValidationSteps(0L)
                    .optimizerConfig(
                        PostTrainingSupervisedFineTuneParams.TrainingConfig.OptimizerConfig
                            .builder()
                            .lr(0.0)
                            .numWarmupSteps(0L)
                            .optimizerType(
                                PostTrainingSupervisedFineTuneParams.TrainingConfig.OptimizerConfig
                                    .OptimizerType
                                    .ADAM
                            )
                            .weightDecay(0.0)
                            .build()
                    )
                    .build()
            )
        assertThat(body.algorithmConfig())
            .isEqualTo(
                AlgorithmConfig.ofLoraFinetuning(
                    AlgorithmConfig.LoraFinetuningConfig.builder()
                        .alpha(0L)
                        .applyLoraToMlp(true)
                        .applyLoraToOutput(true)
                        .addLoraAttnModule("string")
                        .rank(0L)
                        .quantizeBase(true)
                        .useDora(true)
                        .build()
                )
            )
        assertThat(body.checkpointDir()).isEqualTo("checkpoint_dir")
        assertThat(body.model()).isEqualTo("model")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PostTrainingSupervisedFineTuneParams.builder()
                .hyperparamSearchConfig(
                    PostTrainingSupervisedFineTuneParams.HyperparamSearchConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .jobUuid("job_uuid")
                .loggerConfig(
                    PostTrainingSupervisedFineTuneParams.LoggerConfig.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .trainingConfig(
                    PostTrainingSupervisedFineTuneParams.TrainingConfig.builder()
                        .gradientAccumulationSteps(0L)
                        .maxStepsPerEpoch(0L)
                        .nEpochs(0L)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.hyperparamSearchConfig())
            .isEqualTo(
                PostTrainingSupervisedFineTuneParams.HyperparamSearchConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(body.jobUuid()).isEqualTo("job_uuid")
        assertThat(body.loggerConfig())
            .isEqualTo(
                PostTrainingSupervisedFineTuneParams.LoggerConfig.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(body.trainingConfig())
            .isEqualTo(
                PostTrainingSupervisedFineTuneParams.TrainingConfig.builder()
                    .gradientAccumulationSteps(0L)
                    .maxStepsPerEpoch(0L)
                    .nEpochs(0L)
                    .build()
            )
    }
}
