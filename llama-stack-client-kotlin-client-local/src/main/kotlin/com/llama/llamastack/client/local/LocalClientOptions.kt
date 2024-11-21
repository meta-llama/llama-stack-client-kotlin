// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.client.local

import org.pytorch.executorch.LlamaModule

class LocalClientOptions
private constructor(
    val modelPath: String,
    val tokenizerPath: String,
    val temperature: Float,
    val llamaModule: LlamaModule
) {

    companion object {
        fun builder() = Builder()
    }

    class Builder {
        private var modelPath: String? = null
        private var tokenizerPath: String? = null
        private var temperature: Float = 0.0F
        private var llamaModule: LlamaModule? = null

        fun modelPath(modelPath: String) = apply { this.modelPath = modelPath }

        fun tokenizerPath(tokenizerPath: String) = apply { this.tokenizerPath = tokenizerPath }

        fun temperature(temperature: Float) = apply { this.temperature = temperature }

        fun fromEnv() = apply {}

        fun build(): LocalClientOptions {
            checkNotNull(modelPath) { "`modelPath` is required but not set" }
            checkNotNull(tokenizerPath) { "`tokenizerPath` is required but not set" }

            this.llamaModule = LlamaModule(1, modelPath, tokenizerPath, temperature)
            checkNotNull(llamaModule) { "`temperature` is required but not set" }
            this.llamaModule =
                LlamaModule(
                    1,
                    modelPath,
                    tokenizerPath,
                    temperature
                )
            checkNotNull(llamaModule) { "`temperature` is required but not set" }
            llamaModule!!.load()

            return LocalClientOptions(modelPath!!, tokenizerPath!!, temperature, llamaModule!!)
        }
    }
}
