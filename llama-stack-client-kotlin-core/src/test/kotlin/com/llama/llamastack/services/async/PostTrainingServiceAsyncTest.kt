// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClientAsync
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.AlgorithmConfig
import com.llama.llamastack.models.PostTrainingPreferenceOptimizeParams
import com.llama.llamastack.models.PostTrainingSupervisedFineTuneParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PostTrainingServiceAsyncTest {

    @Test
    suspend fun preferenceOptimize() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val postTrainingServiceAsync = client.postTraining()

        val postTrainingJob =
            postTrainingServiceAsync.preferenceOptimize(
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
                            .gradientAccumulationSteps(0L)
                            .maxStepsPerEpoch(0L)
                            .maxValidationSteps(0L)
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
                    .build()
            )

        postTrainingJob.validate()
    }

    @Test
    suspend fun supervisedFineTune() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val postTrainingServiceAsync = client.postTraining()

        val postTrainingJob =
            postTrainingServiceAsync.supervisedFineTune(
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
                    .build()
            )

        postTrainingJob.validate()
    }
}
