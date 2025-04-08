package com.llama.llamastack.client.local.services.toolruntime

// import ai.djl.huggingface.tokenizers.HuggingFaceTokenizer
import com.llama.llamastack.client.local.LocalClientOptions
import com.llama.llamastack.client.local.services.vectordb.objectbox.RagVectorDb
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.QueryResult
import com.llama.llamastack.models.ToolRuntimeRagToolInsertParams
import com.llama.llamastack.models.ToolRuntimeRagToolQueryParams
import com.llama.llamastack.services.blocking.InferenceService
import com.llama.llamastack.services.blocking.toolRuntime.RagToolService

class RagToolServiceLocalImpl
constructor(
    private val clientOptions: LocalClientOptions,
    private val inferenceServiceLocalImpl: InferenceService,
) : RagToolService {
    private var vectorId: Long = 0

    override fun withRawResponse(): RagToolService.WithRawResponse {
        TODO("Not yet implemented")
    }

    override fun insert(params: ToolRuntimeRagToolInsertParams, requestOptions: RequestOptions) {
        TODO("Not yet implemented. Use other insert() function instead.")
    }

    fun insert(
        vectorDbId: String,
        embeddings: MutableList<FloatArray>,
        rawChunks: MutableList<String>,
    ) {
        val box = clientOptions.getVectorDb(vectorDbId)
        for (i in 0..<embeddings.size) {
            val chunk = RagVectorDb(rawChunk = rawChunks[i], embeddedChunk = embeddings[i])
            box!!.put(chunk)
            println("Added chunk index $i")
        }
    }

    fun createChunks(params: ToolRuntimeRagToolInsertParams): MutableList<String> {
        val document = params.documents()[0]
        val text = document.content().asString()
        // TODO: add overlap window as part of params so app can pass that in

        return makeOverlappedChunksFromWords(
            text,
            document.documentId(),
            params.chunkSizeInTokens(),
        )
    }

    override fun query(
        params: ToolRuntimeRagToolQueryParams,
        requestOptions: RequestOptions,
    ): QueryResult {
        TODO("Not yet implemented")
    }

    //    private fun insertIntoVectorDB(box: Box<RagVectorDb>?, chunks:
    // MutableList<VectorIoInsertParams.Chunk>): Boolean {
    //        if (box != null) {
    //
    //        }
    //
    //        return false
    //    }

    private fun makeOverlappedChunksFromWords(
        text: String,
        documentId: String,
        chunkSize: Long = 50,
        overlapLen: Long = 10,
    ): MutableList<String> {
        val words = text.split("\\s+".toRegex())
        val chunks = mutableListOf<String>()
        for (i in words.indices step (chunkSize.toInt() - overlapLen.toInt())) {
            val end = minOf(i + chunkSize.toInt(), words.size)
            chunks.add(words.slice(i until end).joinToString(" "))
        }
        return chunks
    }

    //    private fun makeOverlappedChunksFromTokens(
    //        tokenizer: HuggingFaceTokenizer,
    //        tokens: Array<String>,
    //        chunkSize: Long,
    //        documentId: String,
    //    ): MutableList<VectorIoInsertParams.Chunk> {
    //        val chunks = mutableListOf<VectorIoInsertParams.Chunk>()
    //        for (i in 0 until tokens.size step ((chunkSize - overlapLen).toInt())) {
    //            val toks = tokens.slice(i until minOf((i + chunkSize).toInt(), tokens.size))
    //            println("cmodiii toks are: $toks")
    //            // val chunk = tokenizer.decode(toks)
    //            chunks.add(
    //                VectorIoInsertParams.Chunk.builder()
    //                    .content("hi")
    //                    .metadata(
    //                        VectorIoInsertParams.Chunk.Metadata.builder()
    //                            .putAdditionalProperty("token_count", JsonValue.from(toks.size))
    //                            .putAdditionalProperty("document_id", JsonValue.from(documentId))
    //                            .build()
    //                    )
    //                    .build()
    //            )
    //        }
    //        return chunks
    //    }
}
