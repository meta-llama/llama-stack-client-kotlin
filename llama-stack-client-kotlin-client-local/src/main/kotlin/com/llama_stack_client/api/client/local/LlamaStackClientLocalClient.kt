package com.llama_stack_client.api.client.local

import com.llama_stack_client.api.client.LlamaStackClientClient

class LlamaStackClientLocalClient private constructor() {

    companion object {
        fun builder() = Builder()
    }

    class Builder {

        private var clientOptions: LocalClientOptions.Builder = LocalClientOptions.builder()

        private var modelPath: String? = null
        private var tokenizerPath: String? = null

        fun modelPath(modelPath: String) = apply { this.modelPath = modelPath }

        fun tokenizerPath(tokenizerPath: String) = apply { this.tokenizerPath = tokenizerPath }

        fun fromEnv() = apply { clientOptions.fromEnv() }

        fun build(): LlamaStackClientClient {

            return LlamaStackClientClientLocalImpl(
                clientOptions
                    .modelPath("MODEL_PATH")
                    .tokenizerPath("TOKENIZER_PATH")
                    .temperature(0.0F)
                    .build()
            )
        }
    }
}
