// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.client

import com.llama.llamastack.services.async.AgentServiceAsync
import com.llama.llamastack.services.async.BatchInferenceServiceAsync
import com.llama.llamastack.services.async.BenchmarkServiceAsync
import com.llama.llamastack.services.async.DatasetServiceAsync
import com.llama.llamastack.services.async.DatasetioServiceAsync
import com.llama.llamastack.services.async.EvalServiceAsync
import com.llama.llamastack.services.async.EvalTaskServiceAsync
import com.llama.llamastack.services.async.InferenceServiceAsync
import com.llama.llamastack.services.async.InspectServiceAsync
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
import com.llama.llamastack.services.async.ToolRuntimeServiceAsync
import com.llama.llamastack.services.async.ToolServiceAsync
import com.llama.llamastack.services.async.ToolgroupServiceAsync
import com.llama.llamastack.services.async.VectorDbServiceAsync
import com.llama.llamastack.services.async.VectorIoServiceAsync

/**
 * A client for interacting with the Llama Stack Client REST API asynchronously. You can also switch
 * to synchronous execution via the [sync] method.
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
interface LlamaStackClientClientAsync {

    /**
     * Returns a version of this client that uses synchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun sync(): LlamaStackClientClient

    fun toolgroups(): ToolgroupServiceAsync

    fun tools(): ToolServiceAsync

    fun toolRuntime(): ToolRuntimeServiceAsync

    fun agents(): AgentServiceAsync

    fun batchInference(): BatchInferenceServiceAsync

    fun datasets(): DatasetServiceAsync

    fun eval(): EvalServiceAsync

    fun inspect(): InspectServiceAsync

    fun inference(): InferenceServiceAsync

    fun vectorIo(): VectorIoServiceAsync

    fun vectorDbs(): VectorDbServiceAsync

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

    fun benchmarks(): BenchmarkServiceAsync

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
}
