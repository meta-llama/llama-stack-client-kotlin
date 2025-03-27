// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.client.local.services

// import kotlinx.coroutines.runBlocking
import com.llama.llamastack.client.local.LocalClientOptions
import com.llama.llamastack.client.local.util.PromptFormatLocal
import com.llama.llamastack.client.local.util.buildInferenceChatCompletionResponse
import com.llama.llamastack.client.local.util.buildInferenceChatCompletionResponseFromStream
import com.llama.llamastack.client.local.util.buildLastInferenceChatCompletionResponsesFromStream
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.core.http.StreamResponse
import com.llama.llamastack.models.ChatCompletionResponse
import com.llama.llamastack.models.ChatCompletionResponseStreamChunk
import com.llama.llamastack.models.CompletionResponse
import com.llama.llamastack.models.EmbeddingsResponse
import com.llama.llamastack.models.InferenceChatCompletionParams
import com.llama.llamastack.models.InferenceCompletionParams
import com.llama.llamastack.models.InferenceEmbeddingsParams
import com.llama.llamastack.services.blocking.InferenceService
import org.pytorch.executorch.LlamaCallback

class InferenceServiceLocalImpl constructor(private val clientOptions: LocalClientOptions) :
    InferenceService, LlamaCallback {

    private var resultMessage: String = ""
    private var onResultComplete: Boolean = false
    private var statsMetric: Float = 0.0f
    private var onStatsComplete: Boolean = false
    private var modelName: String = ""

    private var sequenceLengthKey: String = "seq_len"
    private var stopToken: String = ""

    private val streamingResponseList = mutableListOf<ChatCompletionResponseStreamChunk>()
    private var isStreaming: Boolean = false

    private val waitTime: Long = 100

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
                    streamingResponseList.add(buildInferenceChatCompletionResponseFromStream(p0))
                }
            }
        } else {
            resultMessage += p0
            if (p0 != null && isStreaming) {
                streamingResponseList.add(buildInferenceChatCompletionResponseFromStream(p0))
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

    override fun withRawResponse(): InferenceService.WithRawResponse {
        TODO("Not yet implemented")
    }

    override fun chatCompletion(
        params: InferenceChatCompletionParams,
        requestOptions: RequestOptions,
    ): ChatCompletionResponse {
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
        mModule!!.generate(formattedPrompt, seqLength, this, false)

        while (!onResultComplete && !onStatsComplete) {
            Thread.sleep(waitTime)
        }
        onResultComplete = false
        onStatsComplete = false

        return buildInferenceChatCompletionResponse(resultMessage, statsMetric, stopToken)
    }

    private val streamResponse =
        object : StreamResponse<ChatCompletionResponseStreamChunk> {
            override fun asSequence(): Sequence<ChatCompletionResponseStreamChunk> {
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
                    val chatCompletionResponses =
                        buildLastInferenceChatCompletionResponsesFromStream(
                            resultMessage,
                            statsMetric,
                            stopToken,
                        )
                    for (ccr in chatCompletionResponses) {
                        yield(ccr)
                    }
                }
            }

            override fun close() {
                isStreaming = false
            }
        }

    override fun chatCompletionStreaming(
        params: InferenceChatCompletionParams,
        requestOptions: RequestOptions,
    ): StreamResponse<ChatCompletionResponseStreamChunk> {
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
        val thread = Thread { mModule!!.generate(formattedPrompt, seqLength, this, false) }
        thread.start()

        return streamResponse
    }

    override fun completion(
        params: InferenceCompletionParams,
        requestOptions: RequestOptions,
    ): CompletionResponse {
        TODO("Not yet implemented")
    }

    override fun completionStreaming(
        params: InferenceCompletionParams,
        requestOptions: RequestOptions,
    ): StreamResponse<CompletionResponse> {
        TODO("Not yet implemented")
    }

    override fun embeddings(
        params: InferenceEmbeddingsParams,
        requestOptions: RequestOptions,
    ): EmbeddingsResponse {
        TODO("Not yet implemented")
        //        val sentenceEmbedding = SentenceEmbedding()
        //        val texts = params.contents().strings()!![0]
        //
        //        val modelFile = File("data/local/tmp/llama/model-all-miniLM-L6-v2.onnx")
        //        val tokenizerFile = File("data/local/tmp/llama/tokenizer-all-miniLM-L6-v2.json")
        //        val tokenizerBytes = tokenizerFile.readBytes()
        //        println("cmodiii modelFile and tokenizerFile done")
        //
        //        runBlocking {
        //            sentenceEmbedding.init(
        //                modelFilepath = modelFile.absolutePath,
        //                tokenizerBytes = tokenizerBytes,
        //                useTokenTypeIds = false,
        //                outputTensorName = "sentence_embedding",
        //                useFP16 = false,
        //                normalizeEmbeddings = true,
        //                useXNNPack = false,
        //            )
        //        }
        //        println("cmodiii sentenceEmbedding init done")
        //
        //        val embedding = embeddingInference(sentenceEmbedding, texts).toList().map {
        // it.toDouble() }
        //
        //        println("cmodiii embedding is done for $texts. EMBEDDING: $embedding")
        //
        //        return EmbeddingsResponse.builder().embeddings(listOf(embedding)).build()
    }

    //    private fun embeddingInference(sentenceEmbedding: SentenceEmbedding, text: String):
    // FloatArray {
    //        val embedding: FloatArray
    //        runBlocking { embedding = sentenceEmbedding.encode(text) }
    //        return embedding
    //    }

    fun clearElements() {
        resultMessage = ""
        stopToken = ""
    }
}
