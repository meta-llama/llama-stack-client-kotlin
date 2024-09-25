// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.llama_stack_client.api.client

import com.llama_stack_client.api.models.*
import com.llama_stack_client.api.services.blocking.*

interface LlamaStackClientClient {

    fun async(): LlamaStackClientClientAsync

    fun telemetry(): TelemetryService

    fun agents(): AgentService

    fun datasets(): DatasetService

    fun evaluate(): EvaluateService

    fun evaluations(): EvaluationService

    fun inference(): InferenceService

    fun safety(): SafetyService

    fun memory(): MemoryService

    fun postTraining(): PostTrainingService

    fun rewardScoring(): RewardScoringService

    fun syntheticDataGeneration(): SyntheticDataGenerationService

    fun batchInference(): BatchInferenceService

    fun models(): ModelService

    fun memoryBanks(): MemoryBankService

    fun shields(): ShieldService
}
