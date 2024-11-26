// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.client

import com.llama.llamastack.models.*
import com.llama.llamastack.services.async.*

interface LlamaStackClientClientAsync {

    fun sync(): LlamaStackClientClient

    fun agents(): AgentServiceAsync

    fun batchInference(): BatchInferenceServiceAsync

    fun datasets(): DatasetServiceAsync

    fun eval(): EvalServiceAsync

    fun inspect(): InspectServiceAsync

    fun inference(): InferenceServiceAsync

    fun memory(): MemoryServiceAsync

    fun memoryBanks(): MemoryBankServiceAsync

    fun models(): ModelServiceAsync

    fun postTraining(): PostTrainingServiceAsync

    fun providers(): ProviderServiceAsync

    fun routes(): RouteServiceAsync

    fun safety(): SafetyServiceAsync

    fun shields(): ShieldServiceAsync

    fun syntheticDataGeneration(): SyntheticDataGenerationServiceAsync

    fun telemetry(): TelemetryServiceAsync

    fun datasetio(): DatasetioServiceAsync

    fun scoring(): ScoringServiceAsync

    fun scoringFunctions(): ScoringFunctionServiceAsync

    fun evalTasks(): EvalTaskServiceAsync
}
