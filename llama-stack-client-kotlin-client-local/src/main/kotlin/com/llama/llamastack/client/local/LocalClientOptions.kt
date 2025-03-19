// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.client.local

import com.llama.llamastack.client.local.services.AgentServiceLocalImpl
import com.llama.llamastack.client.local.util.createETLlamaModule
import org.pytorch.executorch.LlamaModule

class LocalClientOptions
private constructor(
    var modelPath: String,
    var tokenizerPath: String,
    var temperature: Float,
    var llamaModule: LlamaModule?,
    var useAgent: Boolean,
) {

    // Used to save agent over
    private var agent: AgentServiceLocalImpl? = null

    fun setAgent(agent: AgentServiceLocalImpl) {
        this.agent = agent
    }

    fun getAgent(): AgentServiceLocalImpl? {
        return agent
    }

    private var modelName: String? = null

    fun setModelName(modelName: String) {
        this.modelName = modelName
    }

    fun getModelName(): String? {
        return modelName
    }

    private var instruction: String? = null

    fun setInstruction(instruction: String) {
        this.instruction = instruction
    }

    fun getInstruction(): String? {
        return instruction
    }

    companion object {
        fun builder() = Builder()
    }

    class Builder {
        private var modelPath: String? = null
        private var tokenizerPath: String? = null
        private var temperature: Float = 0.0F
        private var llamaModule: LlamaModule? = null
        private var useAgent: Boolean = false

        fun modelPath(modelPath: String) = apply { this.modelPath = modelPath }

        fun tokenizerPath(tokenizerPath: String) = apply { this.tokenizerPath = tokenizerPath }

        fun temperature(temperature: Float) = apply { this.temperature = temperature }

        fun useAgent(useAgent: Boolean) = apply { this.useAgent = useAgent }

        fun fromEnv() = apply {}

        fun build(): LocalClientOptions {
            if (!useAgent) {
                // if using Agents then LlamaModule is initialized in AgentServiceLocalImpl
                this.llamaModule = createETLlamaModule(modelPath, tokenizerPath, temperature)
            }
            return LocalClientOptions(
                modelPath!!,
                tokenizerPath!!,
                temperature,
                llamaModule,
                useAgent,
            )
        }
    }
}
