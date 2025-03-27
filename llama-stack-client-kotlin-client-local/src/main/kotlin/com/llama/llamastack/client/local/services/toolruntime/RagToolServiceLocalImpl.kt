package com.llama.llamastack.client.local.services.toolruntime

// import ai.djl.huggingface.tokenizers.HuggingFaceTokenizer
import com.llama.llamastack.client.local.LocalClientOptions
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.InferenceEmbeddingsParams
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

    private var overlapLen = 4

    override fun insert(params: ToolRuntimeRagToolInsertParams, requestOptions: RequestOptions) {
        val box = clientOptions.getVectorDb() // trick way to get db. TODO needs to be modified
        val document = params.documents()[0]
        val text = document.content().asString()

        val chunks = makeOverlappedChunksFromWords(text, document.documentId())

        inferenceServiceLocalImpl.embeddings(
            InferenceEmbeddingsParams.builder().contentsOfStrings(chunks).build()
        )

        // insertIntoVectorDB(box, chunks)

        // converting all the text into tokens
        //        val tokenizer =
        //
        // HuggingFaceTokenizer.newInstance(Paths.get("data/local/tmp/llama/tokenizer.json"))
        //        val tokens = tokenizer.encode(text).tokens
        //        val chunks =
        //            makeOverlappedChunksFromTokens(
        //                tokenizer,
        //                tokens,
        //                params.chunkSizeInTokens(),
        //                document.documentId(),
        //            )
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
    ): MutableList<String> {
        val chunks = mutableListOf<String>()
        val chunkSize = 50

        text.chunked(chunkSize).map { chunks.add(it) }

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
