// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.client

import com.llama.llamastack.services.async.AgentServiceAsync
import com.llama.llamastack.services.async.BatchInferenceServiceAsync
import com.llama.llamastack.services.async.DatasetServiceAsync
import com.llama.llamastack.services.async.DatasetioServiceAsync
import com.llama.llamastack.services.async.EvalServiceAsync
import com.llama.llamastack.services.async.EvalTaskServiceAsync
import com.llama.llamastack.services.async.InferenceServiceAsync
import com.llama.llamastack.services.async.InspectServiceAsync
import com.llama.llamastack.services.async.MemoryBankServiceAsync
import com.llama.llamastack.services.async.MemoryServiceAsync
import com.llama.llamastack.services.async.ModelServiceAsync
import com.llama.llamastack.services.async.PostTrainingServiceAsync
import com.llama.llamastack.services.async.ProviderServiceAsync
import com.llama.llamastack.services.async.RouteServiceAsync
import com.llama.llamastack.services.async.SafetyServiceAsync
import com.llama.llamastack.services.async.ScoringFunctionServiceAsync
import com.llama.llamastack.services.async.ScoringServiceAsync
import com.llama.llamastack.services.async.ShieldServiceAsync
import com.llama.llamastack.services.async.SyntheticDataGenerationServiceAsync
import com.llama.llamastack.services.async.TelemetryServiceAsync

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
