// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.client

import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.getPackageVersion
import com.llama.llamastack.services.blocking.AgentService
import com.llama.llamastack.services.blocking.AgentServiceImpl
import com.llama.llamastack.services.blocking.BatchInferenceService
import com.llama.llamastack.services.blocking.BatchInferenceServiceImpl
import com.llama.llamastack.services.blocking.BenchmarkService
import com.llama.llamastack.services.blocking.BenchmarkServiceImpl
import com.llama.llamastack.services.blocking.DatasetService
import com.llama.llamastack.services.blocking.DatasetServiceImpl
import com.llama.llamastack.services.blocking.DatasetioService
import com.llama.llamastack.services.blocking.DatasetioServiceImpl
import com.llama.llamastack.services.blocking.EvalService
import com.llama.llamastack.services.blocking.EvalServiceImpl
import com.llama.llamastack.services.blocking.InferenceService
import com.llama.llamastack.services.blocking.InferenceServiceImpl
import com.llama.llamastack.services.blocking.InspectService
import com.llama.llamastack.services.blocking.InspectServiceImpl
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
import com.llama.llamastack.services.blocking.VectorDbService
import com.llama.llamastack.services.blocking.VectorDbServiceImpl
import com.llama.llamastack.services.blocking.VectorIoService
import com.llama.llamastack.services.blocking.VectorIoServiceImpl

class LlamaStackClientClientImpl(private val clientOptions: ClientOptions) :
    LlamaStackClientClient {

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

    private val withRawResponse: LlamaStackClientClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
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

    private val vectorIo: VectorIoService by lazy {
        VectorIoServiceImpl(clientOptionsWithUserAgent)
    }

    private val vectorDbs: VectorDbService by lazy {
        VectorDbServiceImpl(clientOptionsWithUserAgent)
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

    private val benchmarks: BenchmarkService by lazy {
        BenchmarkServiceImpl(clientOptionsWithUserAgent)
    }

    override fun async(): LlamaStackClientClientAsync = async

    override fun withRawResponse(): LlamaStackClientClient.WithRawResponse = withRawResponse

    override fun toolgroups(): ToolgroupService = toolgroups

    override fun tools(): ToolService = tools

    override fun toolRuntime(): ToolRuntimeService = toolRuntime

    override fun agents(): AgentService = agents

    override fun batchInference(): BatchInferenceService = batchInference

    override fun datasets(): DatasetService = datasets

    override fun eval(): EvalService = eval

    override fun inspect(): InspectService = inspect

    override fun inference(): InferenceService = inference

    override fun vectorIo(): VectorIoService = vectorIo

    override fun vectorDbs(): VectorDbService = vectorDbs

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

    override fun benchmarks(): BenchmarkService = benchmarks

    override fun close() = clientOptions.httpClient.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LlamaStackClientClient.WithRawResponse {

        private val toolgroups: ToolgroupService.WithRawResponse by lazy {
            ToolgroupServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val tools: ToolService.WithRawResponse by lazy {
            ToolServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val toolRuntime: ToolRuntimeService.WithRawResponse by lazy {
            ToolRuntimeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val agents: AgentService.WithRawResponse by lazy {
            AgentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val batchInference: BatchInferenceService.WithRawResponse by lazy {
            BatchInferenceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val datasets: DatasetService.WithRawResponse by lazy {
            DatasetServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val eval: EvalService.WithRawResponse by lazy {
            EvalServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val inspect: InspectService.WithRawResponse by lazy {
            InspectServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val inference: InferenceService.WithRawResponse by lazy {
            InferenceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val vectorIo: VectorIoService.WithRawResponse by lazy {
            VectorIoServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val vectorDbs: VectorDbService.WithRawResponse by lazy {
            VectorDbServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val models: ModelService.WithRawResponse by lazy {
            ModelServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val postTraining: PostTrainingService.WithRawResponse by lazy {
            PostTrainingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val providers: ProviderService.WithRawResponse by lazy {
            ProviderServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val routes: RouteService.WithRawResponse by lazy {
            RouteServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val safety: SafetyService.WithRawResponse by lazy {
            SafetyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val shields: ShieldService.WithRawResponse by lazy {
            ShieldServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val syntheticDataGeneration:
            SyntheticDataGenerationService.WithRawResponse by lazy {
            SyntheticDataGenerationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val telemetry: TelemetryService.WithRawResponse by lazy {
            TelemetryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val datasetio: DatasetioService.WithRawResponse by lazy {
            DatasetioServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val scoring: ScoringService.WithRawResponse by lazy {
            ScoringServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val scoringFunctions: ScoringFunctionService.WithRawResponse by lazy {
            ScoringFunctionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val benchmarks: BenchmarkService.WithRawResponse by lazy {
            BenchmarkServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun toolgroups(): ToolgroupService.WithRawResponse = toolgroups

        override fun tools(): ToolService.WithRawResponse = tools

        override fun toolRuntime(): ToolRuntimeService.WithRawResponse = toolRuntime

        override fun agents(): AgentService.WithRawResponse = agents

        override fun batchInference(): BatchInferenceService.WithRawResponse = batchInference

        override fun datasets(): DatasetService.WithRawResponse = datasets

        override fun eval(): EvalService.WithRawResponse = eval

        override fun inspect(): InspectService.WithRawResponse = inspect

        override fun inference(): InferenceService.WithRawResponse = inference

        override fun vectorIo(): VectorIoService.WithRawResponse = vectorIo

        override fun vectorDbs(): VectorDbService.WithRawResponse = vectorDbs

        override fun models(): ModelService.WithRawResponse = models

        override fun postTraining(): PostTrainingService.WithRawResponse = postTraining

        override fun providers(): ProviderService.WithRawResponse = providers

        override fun routes(): RouteService.WithRawResponse = routes

        override fun safety(): SafetyService.WithRawResponse = safety

        override fun shields(): ShieldService.WithRawResponse = shields

        override fun syntheticDataGeneration(): SyntheticDataGenerationService.WithRawResponse =
            syntheticDataGeneration

        override fun telemetry(): TelemetryService.WithRawResponse = telemetry

        override fun datasetio(): DatasetioService.WithRawResponse = datasetio

        override fun scoring(): ScoringService.WithRawResponse = scoring

        override fun scoringFunctions(): ScoringFunctionService.WithRawResponse = scoringFunctions

        override fun benchmarks(): BenchmarkService.WithRawResponse = benchmarks
    }
}
