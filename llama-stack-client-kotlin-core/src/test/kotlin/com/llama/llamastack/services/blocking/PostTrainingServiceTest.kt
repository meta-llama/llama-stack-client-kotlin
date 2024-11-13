// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PostTrainingServiceTest {

    @Test
    fun callPreferenceOptimize() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val postTrainingService = client.postTraining()
        val postTrainingJob =
            postTrainingService.preferenceOptimize(
                PostTrainingPreferenceOptimizeParams.builder()
                    .algorithm(PostTrainingPreferenceOptimizeParams.Algorithm.DPO)
                    .algorithmConfig(
                        PostTrainingPreferenceOptimizeParams.AlgorithmConfig.builder()
                            .epsilon(42.23)
                            .gamma(42.23)
                            .rewardClip(42.23)
                            .rewardScale(42.23)
                            .build()
                    )
                    .datasetId("dataset_id")
                    .finetunedModel("https://example.com")
                    .hyperparamSearchConfig(
                        PostTrainingPreferenceOptimizeParams.HyperparamSearchConfig.builder()
                            .build()
                    )
                    .jobUuid("job_uuid")
                    .loggerConfig(
                        PostTrainingPreferenceOptimizeParams.LoggerConfig.builder().build()
                    )
                    .optimizerConfig(
                        PostTrainingPreferenceOptimizeParams.OptimizerConfig.builder()
                            .lr(42.23)
                            .lrMin(42.23)
                            .optimizerType(
                                PostTrainingPreferenceOptimizeParams.OptimizerConfig.OptimizerType
                                    .ADAM
                            )
                            .weightDecay(42.23)
                            .build()
                    )
                    .trainingConfig(
                        PostTrainingPreferenceOptimizeParams.TrainingConfig.builder()
                            .batchSize(123L)
                            .enableActivationCheckpointing(true)
                            .fsdpCpuOffload(true)
                            .memoryEfficientFsdpWrap(true)
                            .nEpochs(123L)
                            .nIters(123L)
                            .shuffle(true)
                            .build()
                    )
                    .validationDatasetId("validation_dataset_id")
                    .build()
            )
        println(postTrainingJob)
        postTrainingJob.validate()
    }

    @Test
    fun callSupervisedFineTune() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val postTrainingService = client.postTraining()
        val postTrainingJob =
            postTrainingService.supervisedFineTune(
                PostTrainingSupervisedFineTuneParams.builder()
                    .algorithm(PostTrainingSupervisedFineTuneParams.Algorithm.FULL)
                    .algorithmConfig(
                        PostTrainingSupervisedFineTuneParams.AlgorithmConfig.ofLoraFinetuningConfig(
                            PostTrainingSupervisedFineTuneParams.AlgorithmConfig
                                .LoraFinetuningConfig
                                .builder()
                                .alpha(123L)
                                .applyLoraToMlp(true)
                                .applyLoraToOutput(true)
                                .loraAttnModules(listOf("string"))
                                .rank(123L)
                                .build()
                        )
                    )
                    .datasetId("dataset_id")
                    .hyperparamSearchConfig(
                        PostTrainingSupervisedFineTuneParams.HyperparamSearchConfig.builder()
                            .build()
                    )
                    .jobUuid("job_uuid")
                    .loggerConfig(
                        PostTrainingSupervisedFineTuneParams.LoggerConfig.builder().build()
                    )
                    .model("model")
                    .optimizerConfig(
                        PostTrainingSupervisedFineTuneParams.OptimizerConfig.builder()
                            .lr(42.23)
                            .lrMin(42.23)
                            .optimizerType(
                                PostTrainingSupervisedFineTuneParams.OptimizerConfig.OptimizerType
                                    .ADAM
                            )
                            .weightDecay(42.23)
                            .build()
                    )
                    .trainingConfig(
                        PostTrainingSupervisedFineTuneParams.TrainingConfig.builder()
                            .batchSize(123L)
                            .enableActivationCheckpointing(true)
                            .fsdpCpuOffload(true)
                            .memoryEfficientFsdpWrap(true)
                            .nEpochs(123L)
                            .nIters(123L)
                            .shuffle(true)
                            .build()
                    )
                    .validationDatasetId("validation_dataset_id")
                    .build()
            )
        println(postTrainingJob)
        postTrainingJob.validate()
    }
}
