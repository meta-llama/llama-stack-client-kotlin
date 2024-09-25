// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.client

import com.llama_stack_client.api.core.ClientOptions
import com.llama_stack_client.api.core.http.HttpResponse.Handler
import com.llama_stack_client.api.errors.LlamaStackClientError
import com.llama_stack_client.api.models.*
import com.llama_stack_client.api.services.blocking.*
import com.llama_stack_client.api.services.errorHandler

class LlamaStackClientClientImpl
constructor(
    private val clientOptions: ClientOptions,
) : LlamaStackClientClient {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val async: LlamaStackClientClientAsync by lazy {
        LlamaStackClientClientAsyncImpl(clientOptions)
    }

    private val telemetry: TelemetryService by lazy { TelemetryServiceImpl(clientOptions) }

    private val agents: AgentService by lazy { AgentServiceImpl(clientOptions) }

    private val datasets: DatasetService by lazy { DatasetServiceImpl(clientOptions) }

    private val evaluate: EvaluateService by lazy { EvaluateServiceImpl(clientOptions) }

    private val evaluations: EvaluationService by lazy { EvaluationServiceImpl(clientOptions) }

    private val inference: InferenceService by lazy { InferenceServiceImpl(clientOptions) }

    private val safety: SafetyService by lazy { SafetyServiceImpl(clientOptions) }

    private val memory: MemoryService by lazy { MemoryServiceImpl(clientOptions) }

    private val postTraining: PostTrainingService by lazy { PostTrainingServiceImpl(clientOptions) }

    private val rewardScoring: RewardScoringService by lazy {
        RewardScoringServiceImpl(clientOptions)
    }

    private val syntheticDataGeneration: SyntheticDataGenerationService by lazy {
        SyntheticDataGenerationServiceImpl(clientOptions)
    }

    private val batchInference: BatchInferenceService by lazy {
        BatchInferenceServiceImpl(clientOptions)
    }

    private val models: ModelService by lazy { ModelServiceImpl(clientOptions) }

    private val memoryBanks: MemoryBankService by lazy { MemoryBankServiceImpl(clientOptions) }

    private val shields: ShieldService by lazy { ShieldServiceImpl(clientOptions) }

    override fun async(): LlamaStackClientClientAsync = async

    override fun telemetry(): TelemetryService = telemetry

    override fun agents(): AgentService = agents

    override fun datasets(): DatasetService = datasets

    override fun evaluate(): EvaluateService = evaluate

    override fun evaluations(): EvaluationService = evaluations

    override fun inference(): InferenceService = inference

    override fun safety(): SafetyService = safety

    override fun memory(): MemoryService = memory

    override fun postTraining(): PostTrainingService = postTraining

    override fun rewardScoring(): RewardScoringService = rewardScoring

    override fun syntheticDataGeneration(): SyntheticDataGenerationService = syntheticDataGeneration

    override fun batchInference(): BatchInferenceService = batchInference

    override fun models(): ModelService = models

    override fun memoryBanks(): MemoryBankService = memoryBanks

    override fun shields(): ShieldService = shields
}
