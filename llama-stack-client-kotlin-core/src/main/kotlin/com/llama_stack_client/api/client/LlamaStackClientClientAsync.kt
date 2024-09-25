// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.llama_stack_client.api.client

import com.llama_stack_client.api.models.*
import com.llama_stack_client.api.services.async.*

interface LlamaStackClientClientAsync {

    fun sync(): LlamaStackClientClient

    fun telemetry(): TelemetryServiceAsync

    fun agents(): AgentServiceAsync

    fun datasets(): DatasetServiceAsync

    fun evaluate(): EvaluateServiceAsync

    fun evaluations(): EvaluationServiceAsync

    fun inference(): InferenceServiceAsync

    fun safety(): SafetyServiceAsync

    fun memory(): MemoryServiceAsync

    fun postTraining(): PostTrainingServiceAsync

    fun rewardScoring(): RewardScoringServiceAsync

    fun syntheticDataGeneration(): SyntheticDataGenerationServiceAsync

    fun batchInference(): BatchInferenceServiceAsync

    fun models(): ModelServiceAsync

    fun memoryBanks(): MemoryBankServiceAsync

    fun shields(): ShieldServiceAsync
}
