// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.client.local

import com.llama.llamastack.client.LlamaStackClientClient
import com.llama.llamastack.client.LlamaStackClientClientAsync
import com.llama.llamastack.client.local.services.AgentServiceLocalImpl
import com.llama.llamastack.client.local.services.InferenceServiceLocalImpl
import com.llama.llamastack.client.local.services.ToolRuntimeServiceLocalImpl
import com.llama.llamastack.client.local.services.VectorDbServiceLocalImpl
import com.llama.llamastack.services.blocking.*

class LlamaStackClientClientLocalImpl constructor(private val clientOptions: LocalClientOptions) :
    LlamaStackClientClient {

    private val inference: InferenceService by lazy { InferenceServiceLocalImpl(clientOptions) }

    override fun inference(): InferenceService = inference

    override fun vectorIo(): VectorIoService {
        TODO("Not yet implemented")
    }

    private val vectorDbs: VectorDbService by lazy { VectorDbServiceLocalImpl(clientOptions) }

    override fun vectorDbs(): VectorDbService = vectorDbs

    override fun async(): LlamaStackClientClientAsync {
        TODO("Not yet implemented")
    }

    override fun withRawResponse(): LlamaStackClientClient.WithRawResponse {
        TODO("Not yet implemented")
    }

    override fun toolgroups(): ToolgroupService {
        TODO("Not yet implemented")
    }

    override fun tools(): ToolService {
        TODO("Not yet implemented")
    }

    private val toolRuntime: ToolRuntimeService by lazy {
        ToolRuntimeServiceLocalImpl(clientOptions)
    }

    override fun toolRuntime(): ToolRuntimeService = toolRuntime

    override fun telemetry(): TelemetryService {
        TODO("Not yet implemented")
    }

    override fun scoring(): ScoringService {
        TODO("Not yet implemented")
    }

    override fun scoringFunctions(): ScoringFunctionService {
        TODO("Not yet implemented")
    }

    override fun benchmarks(): BenchmarkService {
        TODO("Not yet implemented")
    }

    override fun close() {
        TODO("Not yet implemented")
    }

    private val agents: AgentService by lazy { AgentServiceLocalImpl(clientOptions) }

    override fun agents(): AgentService = agents

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
