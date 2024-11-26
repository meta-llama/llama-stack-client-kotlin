// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.client

import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.getPackageVersion
import com.llama.llamastack.models.*
import com.llama.llamastack.services.async.*

class LlamaStackClientClientAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : LlamaStackClientClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: LlamaStackClientClient by lazy { LlamaStackClientClientImpl(clientOptions) }

    private val agents: AgentServiceAsync by lazy {
        AgentServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val batchInference: BatchInferenceServiceAsync by lazy {
        BatchInferenceServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val datasets: DatasetServiceAsync by lazy {
        DatasetServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val eval: EvalServiceAsync by lazy { EvalServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val inspect: InspectServiceAsync by lazy {
        InspectServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val inference: InferenceServiceAsync by lazy {
        InferenceServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val memory: MemoryServiceAsync by lazy {
        MemoryServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val memoryBanks: MemoryBankServiceAsync by lazy {
        MemoryBankServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val models: ModelServiceAsync by lazy {
        ModelServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val postTraining: PostTrainingServiceAsync by lazy {
        PostTrainingServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val providers: ProviderServiceAsync by lazy {
        ProviderServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val routes: RouteServiceAsync by lazy {
        RouteServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val safety: SafetyServiceAsync by lazy {
        SafetyServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val shields: ShieldServiceAsync by lazy {
        ShieldServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val syntheticDataGeneration: SyntheticDataGenerationServiceAsync by lazy {
        SyntheticDataGenerationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val telemetry: TelemetryServiceAsync by lazy {
        TelemetryServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val datasetio: DatasetioServiceAsync by lazy {
        DatasetioServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val scoring: ScoringServiceAsync by lazy {
        ScoringServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val scoringFunctions: ScoringFunctionServiceAsync by lazy {
        ScoringFunctionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val evalTasks: EvalTaskServiceAsync by lazy {
        EvalTaskServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): LlamaStackClientClient = sync

    override fun agents(): AgentServiceAsync = agents

    override fun batchInference(): BatchInferenceServiceAsync = batchInference

    override fun datasets(): DatasetServiceAsync = datasets

    override fun eval(): EvalServiceAsync = eval

    override fun inspect(): InspectServiceAsync = inspect

    override fun inference(): InferenceServiceAsync = inference

    override fun memory(): MemoryServiceAsync = memory

    override fun memoryBanks(): MemoryBankServiceAsync = memoryBanks

    override fun models(): ModelServiceAsync = models

    override fun postTraining(): PostTrainingServiceAsync = postTraining

    override fun providers(): ProviderServiceAsync = providers

    override fun routes(): RouteServiceAsync = routes

    override fun safety(): SafetyServiceAsync = safety

    override fun shields(): ShieldServiceAsync = shields

    override fun syntheticDataGeneration(): SyntheticDataGenerationServiceAsync =
        syntheticDataGeneration

    override fun telemetry(): TelemetryServiceAsync = telemetry

    override fun datasetio(): DatasetioServiceAsync = datasetio

    override fun scoring(): ScoringServiceAsync = scoring

    override fun scoringFunctions(): ScoringFunctionServiceAsync = scoringFunctions

    override fun evalTasks(): EvalTaskServiceAsync = evalTasks
}
