// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.client

import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.services.blocking.AgentService
import com.llama.llamastack.services.blocking.BenchmarkService
import com.llama.llamastack.services.blocking.ChatService
import com.llama.llamastack.services.blocking.CompletionService
import com.llama.llamastack.services.blocking.DatasetService
import com.llama.llamastack.services.blocking.EmbeddingService
import com.llama.llamastack.services.blocking.EvalService
import com.llama.llamastack.services.blocking.FileService
import com.llama.llamastack.services.blocking.InferenceService
import com.llama.llamastack.services.blocking.InspectService
import com.llama.llamastack.services.blocking.ModelService
import com.llama.llamastack.services.blocking.PostTrainingService
import com.llama.llamastack.services.blocking.ProviderService
import com.llama.llamastack.services.blocking.ResponseService
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
import com.llama.llamastack.services.blocking.VectorStoreService

/**
 * A client for interacting with the Llama Stack Client REST API synchronously. You can also switch
 * to asynchronous execution via the [async] method.
 *
 * This client performs best when you create a single instance and reuse it for all interactions
 * with the REST API. This is because each client holds its own connection pool and thread pools.
 * Reusing connections and threads reduces latency and saves memory. The client also handles rate
 * limiting per client. This means that creating and using multiple instances at the same time will
 * not respect rate limits.
 *
 * The threads and connections that are held will be released automatically if they remain idle. But
 * if you are writing an application that needs to aggressively release unused resources, then you
 * may call [close].
 */
interface LlamaStackClientClient {

    /**
     * Returns a version of this client that uses asynchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun async(): LlamaStackClientClientAsync

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LlamaStackClientClient

    fun toolgroups(): ToolgroupService

    fun tools(): ToolService

    fun toolRuntime(): ToolRuntimeService

    fun responses(): ResponseService

    fun agents(): AgentService

    fun datasets(): DatasetService

    fun eval(): EvalService

    fun inspect(): InspectService

    fun inference(): InferenceService

    fun embeddings(): EmbeddingService

    fun chat(): ChatService

    fun completions(): CompletionService

    fun vectorIo(): VectorIoService

    fun vectorDbs(): VectorDbService

    fun vectorStores(): VectorStoreService

    fun models(): ModelService

    fun postTraining(): PostTrainingService

    fun providers(): ProviderService

    fun routes(): RouteService

    fun safety(): SafetyService

    fun shields(): ShieldService

    fun syntheticDataGeneration(): SyntheticDataGenerationService

    fun telemetry(): TelemetryService

    fun scoring(): ScoringService

    fun scoringFunctions(): ScoringFunctionService

    fun benchmarks(): BenchmarkService

    fun files(): FileService

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()

    /**
     * A view of [LlamaStackClientClient] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): LlamaStackClientClient.WithRawResponse

        fun toolgroups(): ToolgroupService.WithRawResponse

        fun tools(): ToolService.WithRawResponse

        fun toolRuntime(): ToolRuntimeService.WithRawResponse

        fun responses(): ResponseService.WithRawResponse

        fun agents(): AgentService.WithRawResponse

        fun datasets(): DatasetService.WithRawResponse

        fun eval(): EvalService.WithRawResponse

        fun inspect(): InspectService.WithRawResponse

        fun inference(): InferenceService.WithRawResponse

        fun embeddings(): EmbeddingService.WithRawResponse

        fun chat(): ChatService.WithRawResponse

        fun completions(): CompletionService.WithRawResponse

        fun vectorIo(): VectorIoService.WithRawResponse

        fun vectorDbs(): VectorDbService.WithRawResponse

        fun vectorStores(): VectorStoreService.WithRawResponse

        fun models(): ModelService.WithRawResponse

        fun postTraining(): PostTrainingService.WithRawResponse

        fun providers(): ProviderService.WithRawResponse

        fun routes(): RouteService.WithRawResponse

        fun safety(): SafetyService.WithRawResponse

        fun shields(): ShieldService.WithRawResponse

        fun syntheticDataGeneration(): SyntheticDataGenerationService.WithRawResponse

        fun telemetry(): TelemetryService.WithRawResponse

        fun scoring(): ScoringService.WithRawResponse

        fun scoringFunctions(): ScoringFunctionService.WithRawResponse

        fun benchmarks(): BenchmarkService.WithRawResponse

        fun files(): FileService.WithRawResponse
    }
}
