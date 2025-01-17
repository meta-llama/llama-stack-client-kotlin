// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.client.local

import com.llama.llamastack.client.local.util.PromptFormatLocal
import com.llama.llamastack.client.local.util.buildInferenceChatCompletionResponse
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.StreamResponse
import com.llama.llamastack.models.EmbeddingsResponse
import com.llama.llamastack.models.InferenceChatCompletionParams
import com.llama.llamastack.models.InferenceChatCompletionResponse
import com.llama.llamastack.models.InferenceCompletionParams
import com.llama.llamastack.models.InferenceCompletionResponse
import com.llama.llamastack.models.InferenceEmbeddingsParams
import com.llama.llamastack.services.blocking.InferenceService
import org.pytorch.executorch.LlamaCallback

class InferenceServiceLocalImpl
constructor(
    private val clientOptions: LocalClientOptions,
) : InferenceService, LlamaCallback {

    private var resultMessage: String = ""
    private var onResultComplete: Boolean = false
    private var statsMetric: Float = 0.0f
    private var onStatsComplete: Boolean = false
    private var modelName: String = ""

    private var sequenceLengthKey: String = "seq_len"
    private var stopToken: String = ""

    private val streamingResponseList = mutableListOf<InferenceChatCompletionResponse>()
    private var isStreaming: Boolean = false

    private val waitTime: Long = 100;

    override fun onResult(p0: String?) {
        if (PromptFormatLocal.getStopTokens(modelName).any { it == p0 }) {
            stopToken = p0!!
            onResultComplete = true
            return
        }

        if (p0.equals("\n\n") || p0.equals("\n")) {
            if (resultMessage.isNotEmpty()) {
                resultMessage += p0
                if (p0 != null && isStreaming) {
                    streamingResponseList.add(getInferenceChatCompletionResponseFromString(p0))
                }
            }
        } else {
            resultMessage += p0
            if (p0 != null && isStreaming) {
                streamingResponseList.add(getInferenceChatCompletionResponseFromString(p0))
            }
        }
    }

    override fun onStats(p0: Float) {
        onResultComplete =
            true // required since in some cases where seq_len is met then EOT is not appended by ET
        // logic
        statsMetric = p0
        onStatsComplete = true
    }

    override fun chatCompletion(
        params: InferenceChatCompletionParams,
        requestOptions: RequestOptions
    ): InferenceChatCompletionResponse {
        isStreaming = false
        clearElements()
        val mModule = clientOptions.llamaModule
        modelName = params.modelId()
        val formattedPrompt =
            PromptFormatLocal.getTotalFormattedPrompt(params.messages(), modelName)

        // Developer can pass in their sequence length but if not then it will default to a
        // particular dynamic value. This is to ensure enough value is provided to give a reasonably
        // complete response. 0.75 is the approximate words per token. And 64 is buffer for tokens
        // for generate response.
        val seqLength =
            params._additionalQueryParams().values(sequenceLengthKey).lastOrNull()?.toInt()
                ?: ((formattedPrompt.length * 0.75) + 64).toInt()

        println("Chat Completion Prompt is: $formattedPrompt with seqLength of $seqLength")
        onResultComplete = false
        mModule.generate(formattedPrompt, seqLength, this, false)

        while (!onResultComplete && !onStatsComplete) {
            Thread.sleep(waitTime)
        }
        onResultComplete = false
        onStatsComplete = false

        return buildInferenceChatCompletionResponse(resultMessage, statsMetric, stopToken)
    }

    private val streamResponse =
        object : StreamResponse<InferenceChatCompletionResponse> {
            override fun asSequence(): Sequence<InferenceChatCompletionResponse> {
                return sequence {
                    while (!onResultComplete || streamingResponseList.isNotEmpty()) {
                        if (streamingResponseList.isNotEmpty()) {
                            yield(streamingResponseList.removeAt(0))
                        } else {
                            Thread.sleep(waitTime)
                        }
                    }
                }
            }

            override fun close() {
                isStreaming = false
            }
        }

    private fun getInferenceChatCompletionResponseFromString(
        response: String
    ): InferenceChatCompletionResponse {
        return InferenceChatCompletionResponse.ofChatCompletionResponseStreamChunk(
            InferenceChatCompletionResponse.ChatCompletionResponseStreamChunk.builder()
                .event(
                    InferenceChatCompletionResponse.ChatCompletionResponseStreamChunk.Event
                        .builder()
                        .delta(
                            InferenceChatCompletionResponse.ChatCompletionResponseStreamChunk.Event
                                .Delta
                                .ofString(response)
                        )
                        .eventType(
                            InferenceChatCompletionResponse.ChatCompletionResponseStreamChunk.Event
                                .EventType
                                .PROGRESS
                        )
                        .build()
                )
                .build()
        )
    }

    override fun chatCompletionStreaming(
        params: InferenceChatCompletionParams,
        requestOptions: RequestOptions
    ): StreamResponse<InferenceChatCompletionResponse> {
        isStreaming = true
        streamingResponseList.clear()
        resultMessage = ""
        val mModule = clientOptions.llamaModule
        modelName = params.modelId()
        val formattedPrompt =
            PromptFormatLocal.getTotalFormattedPrompt(params.messages(), modelName)

        val seqLength =
            params._additionalQueryParams().values(sequenceLengthKey).lastOrNull()?.toInt()
                ?: ((formattedPrompt.length * 0.75) + 64).toInt()

        println("Chat Completion Prompt is: $formattedPrompt with seqLength of $seqLength")
        onResultComplete = false
        val thread = Thread { mModule.generate(formattedPrompt, seqLength, this, false) }
        thread.start()

        return streamResponse
    }

    override fun completion(
        params: InferenceCompletionParams,
        requestOptions: RequestOptions
    ): InferenceCompletionResponse {
        TODO("Not yet implemented")
    }

    override fun completionStreaming(
        params: InferenceCompletionParams,
        requestOptions: RequestOptions
    ): StreamResponse<InferenceCompletionResponse> {
        TODO("Not yet implemented")
    }

    override fun embeddings(
        params: InferenceEmbeddingsParams,
        requestOptions: RequestOptions
    ): EmbeddingsResponse {
        TODO("Not yet implemented")
    }

    fun clearElements() {
        resultMessage = ""
        stopToken = ""
    }
}
