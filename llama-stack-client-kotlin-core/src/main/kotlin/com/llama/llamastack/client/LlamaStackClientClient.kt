// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.client

import com.llama.llamastack.models.*
import com.llama.llamastack.services.blocking.*

interface LlamaStackClientClient {

    fun async(): LlamaStackClientClientAsync

    fun agents(): AgentService

    fun batchInference(): BatchInferenceService

    fun datasets(): DatasetService

    fun eval(): EvalService

    fun inspect(): InspectService

    fun inference(): InferenceService

    fun memory(): MemoryService

    fun memoryBanks(): MemoryBankService

    fun models(): ModelService

    fun postTraining(): PostTrainingService

    fun providers(): ProviderService

    fun routes(): RouteService

    fun safety(): SafetyService

    fun shields(): ShieldService

    fun syntheticDataGeneration(): SyntheticDataGenerationService

    fun telemetry(): TelemetryService

    fun datasetio(): DatasetioService

    fun scoring(): ScoringService

    fun scoringFunctions(): ScoringFunctionService

    fun evalTasks(): EvalTaskService
}
