package com.llama.llamastack.client.local.services.agents

import com.llama.llamastack.client.local.util.PromptFormatLocal
import com.llama.llamastack.client.local.util.buildInferenceChatCompletionResponse
import com.llama.llamastack.client.local.util.buildInferenceChatCompletionResponseFromStream
import com.llama.llamastack.client.local.util.buildLastInferenceChatCompletionResponsesFromStream
import com.llama.llamastack.core.ClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.StreamResponse
import com.llama.llamastack.models.AgentTurnCreateParams
import com.llama.llamastack.models.AgentTurnResponseStreamChunk
import com.llama.llamastack.models.AgentTurnResumeParams
import com.llama.llamastack.models.AgentTurnRetrieveParams
import com.llama.llamastack.models.Turn
import com.llama.llamastack.services.blocking.agents.TurnService
import org.pytorch.executorch.LlamaCallback

class TurnServiceLocalImpl constructor(private val clientOptions: ClientOptions) :
    TurnService, LlamaCallback {

    private var resultMessage: String = ""
    private var onResultComplete: Boolean = false
    private var statsMetric: Float = 0.0f
    private var onStatsComplete: Boolean = false
    private var modelName: String = ""

    private var sequenceLengthKey: String = "seq_len"
    private var stopToken: String = ""

    private val streamingResponseList = mutableListOf<AgentTurnResponseStreamChunk>()
    private var isStreaming: Boolean = false

    private val waitTime: Long = 100

    override fun create(params: AgentTurnCreateParams, requestOptions: RequestOptions): Turn {
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

        return buildAgentTurnResponsesFromStream(resultMessage, statsMetric, stopToken)
    }

    private val streamResponse =
        object : StreamResponse<AgentTurnResponseStreamChunk> {
            override fun asSequence(): Sequence<AgentTurnResponseStreamChunk> {
                return sequence {
                    while (!onResultComplete || streamingResponseList.isNotEmpty()) {
                        if (streamingResponseList.isNotEmpty()) {
                            yield(streamingResponseList.removeAt(0))
                        } else {
                            Thread.sleep(waitTime)
                        }
                    }
                    while (!onStatsComplete) {
                        Thread.sleep(waitTime)
                    }
                    val agentTurnResponses =
                        buildLastAgentTurnResponsesFromStream(
                            resultMessage,
                            statsMetric,
                            stopToken,
                        )
                    for (atr in agentTurnResponses) {
                        yield(atr)
                    }
                }
            }

            override fun close() {
                isStreaming = false
            }
        }

    override fun createStreaming(
        params: AgentTurnCreateParams,
        requestOptions: RequestOptions
    ): StreamResponse<AgentTurnResponseStreamChunk> {
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

    override fun retrieve(params: AgentTurnRetrieveParams, requestOptions: RequestOptions): Turn {
        TODO("Not yet implemented")
    }

    override fun resume(params: AgentTurnResumeParams, requestOptions: RequestOptions): Turn {
        TODO("Not yet implemented")
    }

    override fun resumeStreaming(
        params: AgentTurnResumeParams,
        requestOptions: RequestOptions
    ): StreamResponse<AgentTurnResponseStreamChunk> {
        TODO("Not yet implemented")
    }

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
                    streamingResponseList.add(buildAgentTurnResponsesFromStream(p0))
                }
            }
        } else {
            resultMessage += p0
            if (p0 != null && isStreaming) {
                streamingResponseList.add(buildAgentTurnResponsesFromStream(p0))
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

    fun clearElements() {
        resultMessage = ""
        stopToken = ""
    }
}