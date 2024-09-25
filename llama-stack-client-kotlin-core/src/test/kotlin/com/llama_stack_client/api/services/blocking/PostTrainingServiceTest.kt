// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.services.blocking

import com.llama_stack_client.api.TestServerExtension
import com.llama_stack_client.api.client.okhttp.LlamaStackClientOkHttpClient
import com.llama_stack_client.api.models.*
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
                    .dataset(
                        TrainEvalDataset.builder()
                            .columns(TrainEvalDataset.Columns.builder().build())
                            .contentUrl("https://example.com")
                            .metadata(TrainEvalDataset.Metadata.builder().build())
                            .build()
                    )
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
                    .validationDataset(
                        TrainEvalDataset.builder()
                            .columns(TrainEvalDataset.Columns.builder().build())
                            .contentUrl("https://example.com")
                            .metadata(TrainEvalDataset.Metadata.builder().build())
                            .build()
                    )
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
                    .dataset(
                        TrainEvalDataset.builder()
                            .columns(TrainEvalDataset.Columns.builder().build())
                            .contentUrl("https://example.com")
                            .metadata(TrainEvalDataset.Metadata.builder().build())
                            .build()
                    )
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
                    .validationDataset(
                        TrainEvalDataset.builder()
                            .columns(TrainEvalDataset.Columns.builder().build())
                            .contentUrl("https://example.com")
                            .metadata(TrainEvalDataset.Metadata.builder().build())
                            .build()
                    )
                    .build()
            )
        println(postTrainingJob)
        postTrainingJob.validate()
    }
}
