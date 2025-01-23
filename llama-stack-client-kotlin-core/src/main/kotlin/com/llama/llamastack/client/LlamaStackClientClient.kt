// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.client

import com.llama.llamastack.services.blocking.AgentService
import com.llama.llamastack.services.blocking.BatchInferenceService
import com.llama.llamastack.services.blocking.DatasetService
import com.llama.llamastack.services.blocking.DatasetioService
import com.llama.llamastack.services.blocking.EvalService
import com.llama.llamastack.services.blocking.EvalTaskService
import com.llama.llamastack.services.blocking.InferenceService
import com.llama.llamastack.services.blocking.InspectService
import com.llama.llamastack.services.blocking.ModelService
import com.llama.llamastack.services.blocking.PostTrainingService
import com.llama.llamastack.services.blocking.ProviderService
import com.llama.llamastack.services.blocking.RouteService
import com.llama.llamastack.services.blocking.SafetyService
import com.llama.llamastack.services.blocking.ScoringFunctionService
import com.llama.llamastack.services.blocking.ScoringService
import com.llama.llamastack.services.blocking.ShieldService
import com.llama.llamastack.services.blocking.SyntheticDataGenerationService
import com.llama.llamastack.services.blocking.TelemetryService
import com.llama.llamastack.services.blocking.ToolRuntimeService
import com.llama.llamastack.services.blocking.ToolService
import com.llama.llamastack.services.blocking.ToolgroupService
import com.llama.llamastack.services.blocking.VectorDbService
import com.llama.llamastack.services.blocking.VectorIoService

interface LlamaStackClientClient {

    fun async(): LlamaStackClientClientAsync

    fun toolgroups(): ToolgroupService

    fun tools(): ToolService

    fun toolRuntime(): ToolRuntimeService

    fun agents(): AgentService

    fun batchInference(): BatchInferenceService

    fun datasets(): DatasetService

    fun eval(): EvalService

    fun inspect(): InspectService

    fun inference(): InferenceService

    fun vectorIo(): VectorIoService

    fun vectorDbs(): VectorDbService

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
