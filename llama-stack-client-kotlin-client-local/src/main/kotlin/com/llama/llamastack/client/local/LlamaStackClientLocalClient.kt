package com.llama.llamastack.client.local

import com.llama.llamastack.client.LlamaStackClientClient

class LlamaStackClientLocalClient private constructor() {

    companion object {
        fun builder() = Builder()
    }

    class Builder {

        private var clientOptions: LocalClientOptions.Builder = LocalClientOptions.builder()
        private var modelPath: String? = null
        private var tokenizerPath: String? = null
        private var temperature: Float = 0.0F

        fun modelPath(modelPath: String) = apply { this.modelPath = modelPath }

        fun tokenizerPath(tokenizerPath: String) = apply { this.tokenizerPath = tokenizerPath }

        fun temperature(temperature: Float) = apply { this.temperature = temperature }

        fun fromEnv() = apply { clientOptions.fromEnv() }

        fun build(): LlamaStackClientClient {

            return LlamaStackClientClientLocalImpl(
                clientOptions
                    .modelPath(modelPath!!)
                    .tokenizerPath(tokenizerPath!!)
                    .temperature(temperature)
                    .build()
            )
        }
    }
}
