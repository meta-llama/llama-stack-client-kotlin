// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PostTrainingSupervisedFineTuneParamsTest {

    @Test
    fun createPostTrainingSupervisedFineTuneParams() {
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
            .model("model")
            .trainingConfig(
                PostTrainingSupervisedFineTuneParams.TrainingConfig.builder()
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
                    .gradientAccumulationSteps(0L)
                    .maxStepsPerEpoch(0L)
                    .maxValidationSteps(0L)
                    .nEpochs(0L)
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
                    .build()
            )
            .algorithmConfig(
                PostTrainingSupervisedFineTuneParams.AlgorithmConfig.LoraFinetuningConfig.builder()
                    .alpha(0L)
                    .applyLoraToMlp(true)
                    .applyLoraToOutput(true)
                    .addLoraAttnModule("string")
                    .rank(0L)
                    .type(
                        PostTrainingSupervisedFineTuneParams.AlgorithmConfig.LoraFinetuningConfig
                            .Type
                            .LO_RA
                    )
                    .quantizeBase(true)
                    .useDora(true)
                    .build()
            )
            .checkpointDir("checkpoint_dir")
            .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
            .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
            .build()
    }

    @Test
    fun getBody() {
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
                .model("model")
                .trainingConfig(
                    PostTrainingSupervisedFineTuneParams.TrainingConfig.builder()
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
                        .gradientAccumulationSteps(0L)
                        .maxStepsPerEpoch(0L)
                        .maxValidationSteps(0L)
                        .nEpochs(0L)
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
                        .build()
                )
                .algorithmConfig(
                    PostTrainingSupervisedFineTuneParams.AlgorithmConfig.LoraFinetuningConfig
                        .builder()
                        .alpha(0L)
                        .applyLoraToMlp(true)
                        .applyLoraToOutput(true)
                        .addLoraAttnModule("string")
                        .rank(0L)
                        .type(
                            PostTrainingSupervisedFineTuneParams.AlgorithmConfig
                                .LoraFinetuningConfig
                                .Type
                                .LO_RA
                        )
                        .quantizeBase(true)
                        .useDora(true)
                        .build()
                )
                .checkpointDir("checkpoint_dir")
                .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
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
        assertThat(body.model()).isEqualTo("model")
        assertThat(body.trainingConfig())
            .isEqualTo(
                PostTrainingSupervisedFineTuneParams.TrainingConfig.builder()
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
                    .gradientAccumulationSteps(0L)
                    .maxStepsPerEpoch(0L)
                    .maxValidationSteps(0L)
                    .nEpochs(0L)
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
                    .build()
            )
        assertThat(body.algorithmConfig())
            .isEqualTo(
                PostTrainingSupervisedFineTuneParams.AlgorithmConfig.ofLoraFinetuningConfig(
                    PostTrainingSupervisedFineTuneParams.AlgorithmConfig.LoraFinetuningConfig
                        .builder()
                        .alpha(0L)
                        .applyLoraToMlp(true)
                        .applyLoraToOutput(true)
                        .addLoraAttnModule("string")
                        .rank(0L)
                        .type(
                            PostTrainingSupervisedFineTuneParams.AlgorithmConfig
                                .LoraFinetuningConfig
                                .Type
                                .LO_RA
                        )
                        .quantizeBase(true)
                        .useDora(true)
                        .build()
                )
            )
        assertThat(body.checkpointDir()).isEqualTo("checkpoint_dir")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
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
                .model("model")
                .trainingConfig(
                    PostTrainingSupervisedFineTuneParams.TrainingConfig.builder()
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
                                .build()
                        )
                        .gradientAccumulationSteps(0L)
                        .maxStepsPerEpoch(0L)
                        .maxValidationSteps(0L)
                        .nEpochs(0L)
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
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
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
        assertThat(body.model()).isEqualTo("model")
        assertThat(body.trainingConfig())
            .isEqualTo(
                PostTrainingSupervisedFineTuneParams.TrainingConfig.builder()
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
                            .build()
                    )
                    .gradientAccumulationSteps(0L)
                    .maxStepsPerEpoch(0L)
                    .maxValidationSteps(0L)
                    .nEpochs(0L)
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
    }
}
