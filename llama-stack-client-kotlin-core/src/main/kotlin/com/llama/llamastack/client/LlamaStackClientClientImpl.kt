// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.client

import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.getPackageVersion
import com.llama.llamastack.services.blocking.AgentService
import com.llama.llamastack.services.blocking.AgentServiceImpl
import com.llama.llamastack.services.blocking.BatchInferenceService
import com.llama.llamastack.services.blocking.BatchInferenceServiceImpl
import com.llama.llamastack.services.blocking.DatasetService
import com.llama.llamastack.services.blocking.DatasetServiceImpl
import com.llama.llamastack.services.blocking.DatasetioService
import com.llama.llamastack.services.blocking.DatasetioServiceImpl
import com.llama.llamastack.services.blocking.EvalService
import com.llama.llamastack.services.blocking.EvalServiceImpl
import com.llama.llamastack.services.blocking.EvalTaskService
import com.llama.llamastack.services.blocking.EvalTaskServiceImpl
import com.llama.llamastack.services.blocking.InferenceService
import com.llama.llamastack.services.blocking.InferenceServiceImpl
import com.llama.llamastack.services.blocking.InspectService
import com.llama.llamastack.services.blocking.InspectServiceImpl
import com.llama.llamastack.services.blocking.MemoryBankService
import com.llama.llamastack.services.blocking.MemoryBankServiceImpl
import com.llama.llamastack.services.blocking.MemoryService
import com.llama.llamastack.services.blocking.MemoryServiceImpl
import com.llama.llamastack.services.blocking.ModelService
import com.llama.llamastack.services.blocking.ModelServiceImpl
import com.llama.llamastack.services.blocking.PostTrainingService
import com.llama.llamastack.services.blocking.PostTrainingServiceImpl
import com.llama.llamastack.services.blocking.ProviderService
import com.llama.llamastack.services.blocking.ProviderServiceImpl
import com.llama.llamastack.services.blocking.RouteService
import com.llama.llamastack.services.blocking.RouteServiceImpl
import com.llama.llamastack.services.blocking.SafetyService
import com.llama.llamastack.services.blocking.SafetyServiceImpl
import com.llama.llamastack.services.blocking.ScoringFunctionService
import com.llama.llamastack.services.blocking.ScoringFunctionServiceImpl
import com.llama.llamastack.services.blocking.ScoringService
import com.llama.llamastack.services.blocking.ScoringServiceImpl
import com.llama.llamastack.services.blocking.ShieldService
import com.llama.llamastack.services.blocking.ShieldServiceImpl
import com.llama.llamastack.services.blocking.SyntheticDataGenerationService
import com.llama.llamastack.services.blocking.SyntheticDataGenerationServiceImpl
import com.llama.llamastack.services.blocking.TelemetryService
import com.llama.llamastack.services.blocking.TelemetryServiceImpl
import com.llama.llamastack.services.blocking.ToolRuntimeService
import com.llama.llamastack.services.blocking.ToolRuntimeServiceImpl
import com.llama.llamastack.services.blocking.ToolService
import com.llama.llamastack.services.blocking.ToolServiceImpl
import com.llama.llamastack.services.blocking.ToolgroupService
import com.llama.llamastack.services.blocking.ToolgroupServiceImpl

class LlamaStackClientClientImpl
constructor(
    private val clientOptions: ClientOptions,
) : LlamaStackClientClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: LlamaStackClientClientAsync by lazy {
        LlamaStackClientClientAsyncImpl(clientOptions)
    }

    private val toolgroups: ToolgroupService by lazy {
        ToolgroupServiceImpl(clientOptionsWithUserAgent)
    }

    private val tools: ToolService by lazy { ToolServiceImpl(clientOptionsWithUserAgent) }

    private val toolRuntime: ToolRuntimeService by lazy {
        ToolRuntimeServiceImpl(clientOptionsWithUserAgent)
    }

    private val agents: AgentService by lazy { AgentServiceImpl(clientOptionsWithUserAgent) }

    private val batchInference: BatchInferenceService by lazy {
        BatchInferenceServiceImpl(clientOptionsWithUserAgent)
    }

    private val datasets: DatasetService by lazy { DatasetServiceImpl(clientOptionsWithUserAgent) }

    private val eval: EvalService by lazy { EvalServiceImpl(clientOptionsWithUserAgent) }

    private val inspect: InspectService by lazy { InspectServiceImpl(clientOptionsWithUserAgent) }

    private val inference: InferenceService by lazy {
        InferenceServiceImpl(clientOptionsWithUserAgent)
    }

    private val memory: MemoryService by lazy { MemoryServiceImpl(clientOptionsWithUserAgent) }

    private val memoryBanks: MemoryBankService by lazy {
        MemoryBankServiceImpl(clientOptionsWithUserAgent)
    }

    private val models: ModelService by lazy { ModelServiceImpl(clientOptionsWithUserAgent) }

    private val postTraining: PostTrainingService by lazy {
        PostTrainingServiceImpl(clientOptionsWithUserAgent)
    }

    private val providers: ProviderService by lazy {
        ProviderServiceImpl(clientOptionsWithUserAgent)
    }

    private val routes: RouteService by lazy { RouteServiceImpl(clientOptionsWithUserAgent) }

    private val safety: SafetyService by lazy { SafetyServiceImpl(clientOptionsWithUserAgent) }

    private val shields: ShieldService by lazy { ShieldServiceImpl(clientOptionsWithUserAgent) }

    private val syntheticDataGeneration: SyntheticDataGenerationService by lazy {
        SyntheticDataGenerationServiceImpl(clientOptionsWithUserAgent)
    }

    private val telemetry: TelemetryService by lazy {
        TelemetryServiceImpl(clientOptionsWithUserAgent)
    }

    private val datasetio: DatasetioService by lazy {
        DatasetioServiceImpl(clientOptionsWithUserAgent)
    }

    private val scoring: ScoringService by lazy { ScoringServiceImpl(clientOptionsWithUserAgent) }

    private val scoringFunctions: ScoringFunctionService by lazy {
        ScoringFunctionServiceImpl(clientOptionsWithUserAgent)
    }

    private val evalTasks: EvalTaskService by lazy {
        EvalTaskServiceImpl(clientOptionsWithUserAgent)
    }

    override fun async(): LlamaStackClientClientAsync = async

    override fun toolgroups(): ToolgroupService = toolgroups

    override fun tools(): ToolService = tools

    override fun toolRuntime(): ToolRuntimeService = toolRuntime

    override fun agents(): AgentService = agents

    override fun batchInference(): BatchInferenceService = batchInference

    override fun datasets(): DatasetService = datasets

    override fun eval(): EvalService = eval

    override fun inspect(): InspectService = inspect

    override fun inference(): InferenceService = inference

    override fun memory(): MemoryService = memory

    override fun memoryBanks(): MemoryBankService = memoryBanks

    override fun models(): ModelService = models

    override fun postTraining(): PostTrainingService = postTraining

    override fun providers(): ProviderService = providers

    override fun routes(): RouteService = routes

    override fun safety(): SafetyService = safety

    override fun shields(): ShieldService = shields

    override fun syntheticDataGeneration(): SyntheticDataGenerationService = syntheticDataGeneration

    override fun telemetry(): TelemetryService = telemetry

    override fun datasetio(): DatasetioService = datasetio

    override fun scoring(): ScoringService = scoring

    override fun scoringFunctions(): ScoringFunctionService = scoringFunctions

    override fun evalTasks(): EvalTaskService = evalTasks
}
