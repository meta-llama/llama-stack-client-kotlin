// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.AlgorithmConfig
import com.llama.llamastack.models.PostTrainingPreferenceOptimizeParams
import com.llama.llamastack.models.PostTrainingSupervisedFineTuneParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PostTrainingServiceTest {

    @Test
    fun preferenceOptimize() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val postTrainingService = client.postTraining()

        val postTrainingJob =
            postTrainingService.preferenceOptimize(
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
                            .gradientAccumulationSteps(0L)
                            .maxStepsPerEpoch(0L)
                            .nEpochs(0L)
                            .dataConfig(
                                PostTrainingPreferenceOptimizeParams.TrainingConfig.DataConfig
                                    .builder()
                                    .batchSize(0L)
                                    .dataFormat(
                                        PostTrainingPreferenceOptimizeParams.TrainingConfig
                                            .DataConfig
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
                                PostTrainingPreferenceOptimizeParams.TrainingConfig.EfficiencyConfig
                                    .builder()
                                    .enableActivationCheckpointing(true)
                                    .enableActivationOffloading(true)
                                    .fsdpCpuOffload(true)
                                    .memoryEfficientFsdpWrap(true)
                                    .build()
                            )
                            .maxValidationSteps(0L)
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
            )

        postTrainingJob.validate()
    }

    @Test
    fun supervisedFineTune() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val postTrainingService = client.postTraining()

        val postTrainingJob =
            postTrainingService.supervisedFineTune(
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
                                PostTrainingSupervisedFineTuneParams.TrainingConfig.DataConfig
                                    .builder()
                                    .batchSize(0L)
                                    .dataFormat(
                                        PostTrainingSupervisedFineTuneParams.TrainingConfig
                                            .DataConfig
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
            )

        postTrainingJob.validate()
    }
}
