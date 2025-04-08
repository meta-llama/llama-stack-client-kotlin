// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.client.local

import com.llama.llamastack.client.local.services.AgentServiceLocalImpl
import com.llama.llamastack.client.local.services.vectordb.objectbox.RagVectorDb
import com.llama.llamastack.client.local.util.createETLlamaModule
import com.llama.llamastack.core.JsonString
import com.llama.llamastack.models.AgentConfig
import io.objectbox.Box
import org.pytorch.executorch.LlamaModule

class LocalClientOptions
private constructor(
    var modelPath: String,
    var tokenizerPath: String,
    var temperature: Float,
    var llamaModule: LlamaModule?,
    var useAgent: Boolean,
) {

    // Used to save agents: (agentID, AgentServiceLocalImpl) mappings
    private val agentMap = HashMap<String, AgentServiceLocalImpl>()
    private var modelName: String? = null
    private var ragVectorDbMap = HashMap<String, Box<RagVectorDb>>()

    fun setAgent(agent: AgentServiceLocalImpl) {
        this.agentMap[agent.agentId.toString()] = agent
    }

    fun getAgent(agentId: String): AgentServiceLocalImpl? {
        if (!agentMap.containsKey(agentId)) {
            println("getAgent: agentID not in AgentMap")
            return null
        }
        return agentMap[agentId]
    }

    fun setVectorDb(id: String, db: Box<RagVectorDb>) {
        this.ragVectorDbMap[id] = db
    }

    fun getVectorDb(id: String): Box<RagVectorDb>? {
        if (!ragVectorDbMap.containsKey(id)) {
            println("getVectorDb: id not in ragVectorDbMap")
        }
        return ragVectorDbMap[id]
    }

    fun overrideModelConfigsFromAgent(agentConfig: AgentConfig) {
        modelPath = (agentConfig._additionalProperties()["modelPath"] as JsonString).value
        tokenizerPath = (agentConfig._additionalProperties()["tokenizerPath"] as JsonString).value
        checkNotNull(modelPath) { "`modelPath` is required but not set" }
        checkNotNull(tokenizerPath) { "`tokenizerPath` is required but not set" }
    }

    fun initializeLlamaModule() {
        llamaModule = createETLlamaModule(modelPath, tokenizerPath, temperature)
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
