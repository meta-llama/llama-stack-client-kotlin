package com.llama.llamastack.client.local.util

import com.llama.llamastack.errors.LlamaStackClientException
import org.pytorch.executorch.LlamaModule

fun createETLlamaModule(
    modelPath: String?,
    tokenizerPath: String?,
    temperature: Float,
): LlamaModule {
    checkNotNull(modelPath) { "`modelPath` is required but not set" }
    checkNotNull(tokenizerPath) { "`tokenizerPath` is required but not set" }

    val llamaModule: LlamaModule?

    try {
        llamaModule = LlamaModule(1, modelPath, tokenizerPath, temperature)
        llamaModule.load()
        println(
            "llamaModule loading with modelPath: $modelPath | " +
                "tokenizerPath: $tokenizerPath | temperature: $temperature"
        )
    } catch (e: NoClassDefFoundError) {
        throw LlamaStackClientException(
            "ExecuTorch AAR file needs to be included in the libs/ for your app. " +
                "Please see the README for more details: " +
                "https://github.com/meta-llama/llama-stack-client-kotlin/tree/main",
            e,
        )
    }
    return llamaModule
}
