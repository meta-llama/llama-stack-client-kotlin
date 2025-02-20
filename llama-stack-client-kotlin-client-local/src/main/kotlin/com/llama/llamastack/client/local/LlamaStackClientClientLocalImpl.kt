// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.client.local

import com.llama.llamastack.client.LlamaStackClientClient
import com.llama.llamastack.client.LlamaStackClientClientAsync
import com.llama.llamastack.models.*
import com.llama.llamastack.services.blocking.*

class LlamaStackClientClientLocalImpl constructor(private val clientOptions: LocalClientOptions) :
    LlamaStackClientClient {

    private val inference: InferenceService by lazy { InferenceServiceLocalImpl(clientOptions) }

    override fun inference(): InferenceService = inference

    override fun vectorIo(): VectorIoService {
        TODO("Not yet implemented")
    }

    override fun vectorDbs(): VectorDbService {
        TODO("Not yet implemented")
    }

    override fun async(): LlamaStackClientClientAsync {
        TODO("Not yet implemented")
    }

    override fun toolgroups(): ToolgroupService {
        TODO("Not yet implemented")
    }

    override fun tools(): ToolService {
        TODO("Not yet implemented")
    }

    override fun toolRuntime(): ToolRuntimeService {
        TODO("Not yet implemented")
    }

    override fun telemetry(): TelemetryService {
        TODO("Not yet implemented")
    }

    override fun datasetio(): DatasetioService {
        TODO("Not yet implemented")
    }

    override fun scoring(): ScoringService {
        TODO("Not yet implemented")
    }

    override fun scoringFunctions(): ScoringFunctionService {
        TODO("Not yet implemented")
    }

    override fun evalTasks(): EvalTaskService {
        TODO("Not yet implemented")
    }

    override fun benchmarks(): BenchmarkService {
        TODO("Not yet implemented")
    }

    override fun close() {
        TODO("Not yet implemented")
    }

    override fun agents(): AgentService {
        TODO("Not yet implemented")
    }

    override fun batchInference(): BatchInferenceService {
        TODO("Not yet implemented")
    }

    override fun datasets(): DatasetService {
        TODO("Not yet implemented")
    }

    override fun eval(): EvalService {
        TODO("Not yet implemented")
    }

    override fun inspect(): InspectService {
        TODO("Not yet implemented")
    }

    override fun safety(): SafetyService {
        TODO("Not yet implemented")
    }

    override fun postTraining(): PostTrainingService {
        TODO("Not yet implemented")
    }

    override fun providers(): ProviderService {
        TODO("Not yet implemented")
    }

    override fun routes(): RouteService {
        TODO("Not yet implemented")
    }

    override fun syntheticDataGeneration(): SyntheticDataGenerationService {
        TODO("Not yet implemented")
    }

    override fun models(): ModelService {
        TODO("Not yet implemented")
    }

    override fun shields(): ShieldService {
        TODO("Not yet implemented")
    }
}
