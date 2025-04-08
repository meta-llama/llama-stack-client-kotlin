package com.example.llamastackandroiddemo

import android.util.Log
import com.ml.shubham0204.sentence_embeddings.SentenceEmbedding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import java.io.File

class SentenceEmbeddingModel {
    private val sentenceEmbedding = SentenceEmbedding()

    init {
        initializeSentenceEmbedding()
    }

    private fun initializeSentenceEmbedding() {
        val modelFile = File("/data/local/tmp/llama", "model-all-miniLM-L6-v2.onnx")
        val tokenizerFile = File("/data/local/tmp/llama", "tokenizer-all-miniLM-L6-v2.json")
        val tokenizerBytes = tokenizerFile.readBytes()

        runBlocking(Dispatchers.IO) {
            sentenceEmbedding.init(
                modelFilepath = modelFile.absolutePath,
                tokenizerBytes = tokenizerBytes,
                useTokenTypeIds = true,
                outputTensorName = "sentence_embedding",
                useFP16 = false,
                useXNNPack = false,
                normalizeEmbeddings = true,
            )
        }

        Log.d("initializeSentenceEmbedding","cmodii this is complete")
    }

    fun createEmbedding(chunk: String): FloatArray = runBlocking(Dispatchers.Default) {
        return@runBlocking sentenceEmbedding.encode(chunk)
    }
}