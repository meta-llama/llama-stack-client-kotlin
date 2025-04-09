package com.llama.llamastack.client.local.services.agents

import com.llama.llamastack.client.local.LocalClientOptions
import com.llama.llamastack.client.local.util.PromptFormatLocal
import com.llama.llamastack.client.local.util.buildAgentTurnResponseFromStream
import com.llama.llamastack.client.local.util.buildLastAgentTurnResponsesFromStream
import com.llama.llamastack.client.local.util.getNeighborSentences
import com.llama.llamastack.core.JsonArray
import com.llama.llamastack.core.JsonNumber
import com.llama.llamastack.core.JsonString
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.StreamResponse
import com.llama.llamastack.models.AgentTurnCreateParams
import com.llama.llamastack.models.AgentTurnResponseStreamChunk
import com.llama.llamastack.models.AgentTurnResumeParams
import com.llama.llamastack.models.AgentTurnRetrieveParams
import com.llama.llamastack.models.Turn
import com.llama.llamastack.services.blocking.agents.TurnService
import org.pytorch.executorch.LlamaCallback

class TurnServiceLocalImpl constructor(private val clientOptions: LocalClientOptions) :
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

    override fun withRawResponse(): TurnService.WithRawResponse {
        TODO("Not yet implemented")
    }

    override fun create(params: AgentTurnCreateParams, requestOptions: RequestOptions): Turn {
        TODO("Not yet implemented")
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
                        buildLastAgentTurnResponsesFromStream(resultMessage, statsMetric, stopToken)
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
        requestOptions: RequestOptions,
    ): StreamResponse<AgentTurnResponseStreamChunk> {
        isStreaming = true
        streamingResponseList.clear()
        resultMessage = ""

        val agentId = params.agentId()
        val agent = clientOptions.getAgent(agentId)
        val agentCreateParams = agent!!.getAgentCreateParams()
        val agentConfig = agentCreateParams!!.agentConfig()
        var instruction = agentConfig.instructions()
        val mModule = clientOptions.llamaModule
        modelName = agentConfig.model()
        var formattedPrompt = String()

        val toolGroups = params.toolgroups()
        if (toolGroups == null) {
            // Assumes normal Q/A inference or custom tool call
            // TODO: Separate out custom tool call flow
            formattedPrompt =
                PromptFormatLocal.getTotalFormattedPromptForAgent(
                    instruction,
                    params.messages(),
                    modelName,
                )
        } else {
            // Possible Tool Group like RAG
            if (toolGroups.size > 1) {
                println("createStreaming: Currently we only support one Tool Group")
            }
            val toolGroupWithArgs = toolGroups[0].agentToolGroupWithArgs()
            if (toolGroupWithArgs != null) {
                if (toolGroupWithArgs.name() == "builtin::rag/knowledge_search") {
                    val additionalProperties = toolGroupWithArgs.args()._additionalProperties()
                    val userPromptEmbedding =
                        jsonValueToFloatArray(additionalProperties["ragUserPromptEmbedded"]!!)
                    val maxNeighborCount =
                        (additionalProperties["maxNeighborCount"] as JsonNumber).value as Int
                    println("createStreaming: userPromptEmbedding value is: $userPromptEmbedding")
                    val neighborSentences =
                        getNeighborSentences(
                            clientOptions.getVectorDb(
                                (additionalProperties["vector_db_id"] as JsonString).value
                            ),
                            userPromptEmbedding,
                            maxNeighborCount,
                        )
                    // With Rag we will use a different instruction provided in the
                    // additionalProperties
                    instruction = (additionalProperties["ragInstruction"] as JsonString).value
                    formattedPrompt =
                        PromptFormatLocal.getTotalFormattedPromptForAgentForLocalRag(
                            instruction,
                            neighborSentences,
                            params.messages(),
                            modelName,
                        )
                }
            } else {
                println("createStreaming: Populate toolGroupWithArgs")
            }
        }
        println("createStreaming: $modelName , $instruction , $mModule")

        val seqLength =
            params._additionalQueryParams().values(sequenceLengthKey).lastOrNull()?.toInt()
                ?: ((formattedPrompt.length * 0.75) + 64).toInt()

        println("Agent Turn Response Prompt is: $formattedPrompt with seqLength of $seqLength")
        onResultComplete = false
        val thread = Thread { mModule!!.generate(formattedPrompt, seqLength, this, false) }
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
        requestOptions: RequestOptions,
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
                    println("turn: $p0")
                    streamingResponseList.add(buildAgentTurnResponseFromStream(p0))
                }
            }
        } else {
            resultMessage += p0
            if (p0 != null && isStreaming) {
                println("turn last: $p0")
                streamingResponseList.add(buildAgentTurnResponseFromStream(p0))
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

    // Convert JsonValue back to FloatArray
    private fun jsonValueToFloatArray(jsonValue: JsonValue): FloatArray? {
        val list = (jsonValue as JsonArray).values
        return FloatArray(list.size) { i -> ((list[i] as JsonNumber).value).toFloat() }
    }
}
