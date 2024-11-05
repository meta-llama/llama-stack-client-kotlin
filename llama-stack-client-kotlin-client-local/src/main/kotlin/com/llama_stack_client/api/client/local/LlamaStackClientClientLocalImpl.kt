// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.client.local

import com.llama_stack_client.api.client.LlamaStackClientClient
import com.llama_stack_client.api.client.LlamaStackClientClientAsync
import com.llama_stack_client.api.models.*
import com.llama_stack_client.api.services.blocking.*

class LlamaStackClientClientLocalImpl
constructor(
    private val clientOptions: LocalClientOptions,
) : LlamaStackClientClient {

    private val inference: InferenceService by lazy { InferenceServiceLocalImpl(clientOptions) }

    override fun inference(): InferenceService = inference

    override fun async(): LlamaStackClientClientAsync {
        TODO("Not yet implemented")
    }

    override fun telemetry(): TelemetryService {
        TODO("Not yet implemented")
    }

    override fun agents(): AgentService {
        TODO("Not yet implemented")
    }

    override fun datasets(): DatasetService {
        TODO("Not yet implemented")
    }

    override fun evaluate(): EvaluateService {
        TODO("Not yet implemented")
    }

    override fun evaluations(): EvaluationService {
        TODO("Not yet implemented")
    }

    override fun safety(): SafetyService {
        TODO("Not yet implemented")
    }

    override fun memory(): MemoryService {
        TODO("Not yet implemented")
    }

    override fun postTraining(): PostTrainingService {
        TODO("Not yet implemented")
    }

    override fun rewardScoring(): RewardScoringService {
        TODO("Not yet implemented")
    }

    override fun syntheticDataGeneration(): SyntheticDataGenerationService {
        TODO("Not yet implemented")
    }

    override fun batchInference(): BatchInferenceService {
        TODO("Not yet implemented")
    }

    override fun models(): ModelService {
        TODO("Not yet implemented")
    }

    override fun memoryBanks(): MemoryBankService {
        TODO("Not yet implemented")
    }

    override fun shields(): ShieldService {
        TODO("Not yet implemented")
    }
}
