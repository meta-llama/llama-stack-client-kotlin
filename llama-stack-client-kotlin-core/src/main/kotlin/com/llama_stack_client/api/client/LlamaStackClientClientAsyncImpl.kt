// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.client

import com.llama_stack_client.api.core.ClientOptions
import com.llama_stack_client.api.core.http.HttpResponse.Handler
import com.llama_stack_client.api.errors.LlamaStackClientError
import com.llama_stack_client.api.models.*
import com.llama_stack_client.api.services.async.*
import com.llama_stack_client.api.services.errorHandler

class LlamaStackClientClientAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : LlamaStackClientClientAsync {

    private val errorHandler: Handler<LlamaStackClientError> =
        errorHandler(clientOptions.jsonMapper)

    private val sync: LlamaStackClientClient by lazy { LlamaStackClientClientImpl(clientOptions) }

    private val telemetry: TelemetryServiceAsync by lazy {
        TelemetryServiceAsyncImpl(clientOptions)
    }

    private val agents: AgentServiceAsync by lazy { AgentServiceAsyncImpl(clientOptions) }

    private val datasets: DatasetServiceAsync by lazy { DatasetServiceAsyncImpl(clientOptions) }

    private val evaluate: EvaluateServiceAsync by lazy { EvaluateServiceAsyncImpl(clientOptions) }

    private val evaluations: EvaluationServiceAsync by lazy {
        EvaluationServiceAsyncImpl(clientOptions)
    }

    private val inference: InferenceServiceAsync by lazy {
        InferenceServiceAsyncImpl(clientOptions)
    }

    private val safety: SafetyServiceAsync by lazy { SafetyServiceAsyncImpl(clientOptions) }

    private val memory: MemoryServiceAsync by lazy { MemoryServiceAsyncImpl(clientOptions) }

    private val postTraining: PostTrainingServiceAsync by lazy {
        PostTrainingServiceAsyncImpl(clientOptions)
    }

    private val rewardScoring: RewardScoringServiceAsync by lazy {
        RewardScoringServiceAsyncImpl(clientOptions)
    }

    private val syntheticDataGeneration: SyntheticDataGenerationServiceAsync by lazy {
        SyntheticDataGenerationServiceAsyncImpl(clientOptions)
    }

    private val batchInference: BatchInferenceServiceAsync by lazy {
        BatchInferenceServiceAsyncImpl(clientOptions)
    }

    private val models: ModelServiceAsync by lazy { ModelServiceAsyncImpl(clientOptions) }

    private val memoryBanks: MemoryBankServiceAsync by lazy {
        MemoryBankServiceAsyncImpl(clientOptions)
    }

    private val shields: ShieldServiceAsync by lazy { ShieldServiceAsyncImpl(clientOptions) }

    override fun sync(): LlamaStackClientClient = sync

    override fun telemetry(): TelemetryServiceAsync = telemetry

    override fun agents(): AgentServiceAsync = agents

    override fun datasets(): DatasetServiceAsync = datasets

    override fun evaluate(): EvaluateServiceAsync = evaluate

    override fun evaluations(): EvaluationServiceAsync = evaluations

    override fun inference(): InferenceServiceAsync = inference

    override fun safety(): SafetyServiceAsync = safety

    override fun memory(): MemoryServiceAsync = memory

    override fun postTraining(): PostTrainingServiceAsync = postTraining

    override fun rewardScoring(): RewardScoringServiceAsync = rewardScoring

    override fun syntheticDataGeneration(): SyntheticDataGenerationServiceAsync =
        syntheticDataGeneration

    override fun batchInference(): BatchInferenceServiceAsync = batchInference

    override fun models(): ModelServiceAsync = models

    override fun memoryBanks(): MemoryBankServiceAsync = memoryBanks

    override fun shields(): ShieldServiceAsync = shields
}
