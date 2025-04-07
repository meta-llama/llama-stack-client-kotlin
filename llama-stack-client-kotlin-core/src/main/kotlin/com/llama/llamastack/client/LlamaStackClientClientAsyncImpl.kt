// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.client

import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.getPackageVersion
import com.llama.llamastack.services.async.AgentServiceAsync
import com.llama.llamastack.services.async.AgentServiceAsyncImpl
import com.llama.llamastack.services.async.BatchInferenceServiceAsync
import com.llama.llamastack.services.async.BatchInferenceServiceAsyncImpl
import com.llama.llamastack.services.async.BenchmarkServiceAsync
import com.llama.llamastack.services.async.BenchmarkServiceAsyncImpl
import com.llama.llamastack.services.async.DatasetServiceAsync
import com.llama.llamastack.services.async.DatasetServiceAsyncImpl
import com.llama.llamastack.services.async.EvalServiceAsync
import com.llama.llamastack.services.async.EvalServiceAsyncImpl
import com.llama.llamastack.services.async.InferenceServiceAsync
import com.llama.llamastack.services.async.InferenceServiceAsyncImpl
import com.llama.llamastack.services.async.InspectServiceAsync
import com.llama.llamastack.services.async.InspectServiceAsyncImpl
import com.llama.llamastack.services.async.ModelServiceAsync
import com.llama.llamastack.services.async.ModelServiceAsyncImpl
import com.llama.llamastack.services.async.PostTrainingServiceAsync
import com.llama.llamastack.services.async.PostTrainingServiceAsyncImpl
import com.llama.llamastack.services.async.ProviderServiceAsync
import com.llama.llamastack.services.async.ProviderServiceAsyncImpl
import com.llama.llamastack.services.async.RouteServiceAsync
import com.llama.llamastack.services.async.RouteServiceAsyncImpl
import com.llama.llamastack.services.async.SafetyServiceAsync
import com.llama.llamastack.services.async.SafetyServiceAsyncImpl
import com.llama.llamastack.services.async.ScoringFunctionServiceAsync
import com.llama.llamastack.services.async.ScoringFunctionServiceAsyncImpl
import com.llama.llamastack.services.async.ScoringServiceAsync
import com.llama.llamastack.services.async.ScoringServiceAsyncImpl
import com.llama.llamastack.services.async.ShieldServiceAsync
import com.llama.llamastack.services.async.ShieldServiceAsyncImpl
import com.llama.llamastack.services.async.SyntheticDataGenerationServiceAsync
import com.llama.llamastack.services.async.SyntheticDataGenerationServiceAsyncImpl
import com.llama.llamastack.services.async.TelemetryServiceAsync
import com.llama.llamastack.services.async.TelemetryServiceAsyncImpl
import com.llama.llamastack.services.async.ToolRuntimeServiceAsync
import com.llama.llamastack.services.async.ToolRuntimeServiceAsyncImpl
import com.llama.llamastack.services.async.ToolServiceAsync
import com.llama.llamastack.services.async.ToolServiceAsyncImpl
import com.llama.llamastack.services.async.ToolgroupServiceAsync
import com.llama.llamastack.services.async.ToolgroupServiceAsyncImpl
import com.llama.llamastack.services.async.VectorDbServiceAsync
import com.llama.llamastack.services.async.VectorDbServiceAsyncImpl
import com.llama.llamastack.services.async.VectorIoServiceAsync
import com.llama.llamastack.services.async.VectorIoServiceAsyncImpl

class LlamaStackClientClientAsyncImpl(private val clientOptions: ClientOptions) :
    LlamaStackClientClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: LlamaStackClientClient by lazy { LlamaStackClientClientImpl(clientOptions) }

    private val withRawResponse: LlamaStackClientClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val toolgroups: ToolgroupServiceAsync by lazy {
        ToolgroupServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val tools: ToolServiceAsync by lazy { ToolServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val toolRuntime: ToolRuntimeServiceAsync by lazy {
        ToolRuntimeServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val agents: AgentServiceAsync by lazy {
        AgentServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val batchInference: BatchInferenceServiceAsync by lazy {
        BatchInferenceServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val datasets: DatasetServiceAsync by lazy {
        DatasetServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val eval: EvalServiceAsync by lazy { EvalServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val inspect: InspectServiceAsync by lazy {
        InspectServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val inference: InferenceServiceAsync by lazy {
        InferenceServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val vectorIo: VectorIoServiceAsync by lazy {
        VectorIoServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val vectorDbs: VectorDbServiceAsync by lazy {
        VectorDbServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val models: ModelServiceAsync by lazy {
        ModelServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val postTraining: PostTrainingServiceAsync by lazy {
        PostTrainingServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val providers: ProviderServiceAsync by lazy {
        ProviderServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val routes: RouteServiceAsync by lazy {
        RouteServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val safety: SafetyServiceAsync by lazy {
        SafetyServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val shields: ShieldServiceAsync by lazy {
        ShieldServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val syntheticDataGeneration: SyntheticDataGenerationServiceAsync by lazy {
        SyntheticDataGenerationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val telemetry: TelemetryServiceAsync by lazy {
        TelemetryServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val scoring: ScoringServiceAsync by lazy {
        ScoringServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val scoringFunctions: ScoringFunctionServiceAsync by lazy {
        ScoringFunctionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val benchmarks: BenchmarkServiceAsync by lazy {
        BenchmarkServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): LlamaStackClientClient = sync

    override fun withRawResponse(): LlamaStackClientClientAsync.WithRawResponse = withRawResponse

    override fun toolgroups(): ToolgroupServiceAsync = toolgroups

    override fun tools(): ToolServiceAsync = tools

    override fun toolRuntime(): ToolRuntimeServiceAsync = toolRuntime

    override fun agents(): AgentServiceAsync = agents

    override fun batchInference(): BatchInferenceServiceAsync = batchInference

    override fun datasets(): DatasetServiceAsync = datasets

    override fun eval(): EvalServiceAsync = eval

    override fun inspect(): InspectServiceAsync = inspect

    override fun inference(): InferenceServiceAsync = inference

    override fun vectorIo(): VectorIoServiceAsync = vectorIo

    override fun vectorDbs(): VectorDbServiceAsync = vectorDbs

    override fun models(): ModelServiceAsync = models

    override fun postTraining(): PostTrainingServiceAsync = postTraining

    override fun providers(): ProviderServiceAsync = providers

    override fun routes(): RouteServiceAsync = routes

    override fun safety(): SafetyServiceAsync = safety

    override fun shields(): ShieldServiceAsync = shields

    override fun syntheticDataGeneration(): SyntheticDataGenerationServiceAsync =
        syntheticDataGeneration

    override fun telemetry(): TelemetryServiceAsync = telemetry

    override fun scoring(): ScoringServiceAsync = scoring

    override fun scoringFunctions(): ScoringFunctionServiceAsync = scoringFunctions

    override fun benchmarks(): BenchmarkServiceAsync = benchmarks

    override fun close() = clientOptions.httpClient.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LlamaStackClientClientAsync.WithRawResponse {

        private val toolgroups: ToolgroupServiceAsync.WithRawResponse by lazy {
            ToolgroupServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val tools: ToolServiceAsync.WithRawResponse by lazy {
            ToolServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val toolRuntime: ToolRuntimeServiceAsync.WithRawResponse by lazy {
            ToolRuntimeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val agents: AgentServiceAsync.WithRawResponse by lazy {
            AgentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val batchInference: BatchInferenceServiceAsync.WithRawResponse by lazy {
            BatchInferenceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val datasets: DatasetServiceAsync.WithRawResponse by lazy {
            DatasetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val eval: EvalServiceAsync.WithRawResponse by lazy {
            EvalServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val inspect: InspectServiceAsync.WithRawResponse by lazy {
            InspectServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val inference: InferenceServiceAsync.WithRawResponse by lazy {
            InferenceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val vectorIo: VectorIoServiceAsync.WithRawResponse by lazy {
            VectorIoServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val vectorDbs: VectorDbServiceAsync.WithRawResponse by lazy {
            VectorDbServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val models: ModelServiceAsync.WithRawResponse by lazy {
            ModelServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val postTraining: PostTrainingServiceAsync.WithRawResponse by lazy {
            PostTrainingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val providers: ProviderServiceAsync.WithRawResponse by lazy {
            ProviderServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val routes: RouteServiceAsync.WithRawResponse by lazy {
            RouteServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val safety: SafetyServiceAsync.WithRawResponse by lazy {
            SafetyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val shields: ShieldServiceAsync.WithRawResponse by lazy {
            ShieldServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val syntheticDataGeneration:
            SyntheticDataGenerationServiceAsync.WithRawResponse by lazy {
            SyntheticDataGenerationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val telemetry: TelemetryServiceAsync.WithRawResponse by lazy {
            TelemetryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val scoring: ScoringServiceAsync.WithRawResponse by lazy {
            ScoringServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val scoringFunctions: ScoringFunctionServiceAsync.WithRawResponse by lazy {
            ScoringFunctionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val benchmarks: BenchmarkServiceAsync.WithRawResponse by lazy {
            BenchmarkServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun toolgroups(): ToolgroupServiceAsync.WithRawResponse = toolgroups

        override fun tools(): ToolServiceAsync.WithRawResponse = tools

        override fun toolRuntime(): ToolRuntimeServiceAsync.WithRawResponse = toolRuntime

        override fun agents(): AgentServiceAsync.WithRawResponse = agents

        override fun batchInference(): BatchInferenceServiceAsync.WithRawResponse = batchInference

        override fun datasets(): DatasetServiceAsync.WithRawResponse = datasets

        override fun eval(): EvalServiceAsync.WithRawResponse = eval

        override fun inspect(): InspectServiceAsync.WithRawResponse = inspect

        override fun inference(): InferenceServiceAsync.WithRawResponse = inference

        override fun vectorIo(): VectorIoServiceAsync.WithRawResponse = vectorIo

        override fun vectorDbs(): VectorDbServiceAsync.WithRawResponse = vectorDbs

        override fun models(): ModelServiceAsync.WithRawResponse = models

        override fun postTraining(): PostTrainingServiceAsync.WithRawResponse = postTraining

        override fun providers(): ProviderServiceAsync.WithRawResponse = providers

        override fun routes(): RouteServiceAsync.WithRawResponse = routes

        override fun safety(): SafetyServiceAsync.WithRawResponse = safety

        override fun shields(): ShieldServiceAsync.WithRawResponse = shields

        override fun syntheticDataGeneration():
            SyntheticDataGenerationServiceAsync.WithRawResponse = syntheticDataGeneration

        override fun telemetry(): TelemetryServiceAsync.WithRawResponse = telemetry

        override fun scoring(): ScoringServiceAsync.WithRawResponse = scoring

        override fun scoringFunctions(): ScoringFunctionServiceAsync.WithRawResponse =
            scoringFunctions

        override fun benchmarks(): BenchmarkServiceAsync.WithRawResponse = benchmarks
    }
}
