package com.llama.llamastack.client.local.services.toolruntime

import ai.djl.huggingface.tokenizers.HuggingFaceTokenizer
import com.llama.llamastack.client.local.LocalClientOptions
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.QueryResult
import com.llama.llamastack.models.ToolRuntimeRagToolInsertParams
import com.llama.llamastack.models.ToolRuntimeRagToolQueryParams
import com.llama.llamastack.models.VectorIoInsertParams
import com.llama.llamastack.services.blocking.toolRuntime.RagToolService
import java.nio.file.Paths

class RagToolServiceLocalImpl constructor(private val clientOptions: LocalClientOptions) :
    RagToolService {

    private var overlapLen = 4

    override fun insert(params: ToolRuntimeRagToolInsertParams, requestOptions: RequestOptions) {
        val box = clientOptions.getVectorDb() // trick way to get db. TODO needs to be modified
        val document = params.documents()[0]
        val text = document.content().asString()

        // converting all the text into tokens
        val tokenizer =
            HuggingFaceTokenizer.newInstance(Paths.get("data/local/tmp/llama/tokenizer.json"))
        val tokens = tokenizer.encode(text).tokens
        val chunks =
            makeOverlappedChunks(
                tokenizer,
                tokens,
                params.chunkSizeInTokens(),
                document.documentId(),
            )
    }

    override fun query(
        params: ToolRuntimeRagToolQueryParams,
        requestOptions: RequestOptions,
    ): QueryResult {
        TODO("Not yet implemented")
    }

    private fun makeOverlappedChunks(
        tokenizer: HuggingFaceTokenizer,
        tokens: Array<String>,
        chunkSize: Long,
        documentId: String,
    ): MutableList<VectorIoInsertParams.Chunk> {
        val chunks = mutableListOf<VectorIoInsertParams.Chunk>()
        for (i in 0 until tokens.size step ((chunkSize - overlapLen).toInt())) {
            val toks = tokens.slice(i until minOf((i + chunkSize).toInt(), tokens.size))
            println("cmodiii toks are: $toks")
            chunks.add(
                VectorIoInsertParams.Chunk.builder()
                    .content("hi")
                    .metadata(
                        VectorIoInsertParams.Chunk.Metadata.builder()
                            .putAdditionalProperty("token_count", JsonValue.from(toks.size))
                            .putAdditionalProperty("document_id", JsonValue.from(documentId))
                            .build()
                    )
                    .build()
            )
            //            val chunk = tokenizer.decode(toks)
            //            chunks.add(
            //                VectorIoInsertParams.Chunk.builder()
            //                    .content(chunk)
            //                    .metadata(
            //                        VectorIoInsertParams.Chunk.Metadata.builder()
            //                            .putAdditionalProperty("token_count",
            // JsonValue.from(toks.size))
            //                            .putAdditionalProperty("document_id",
            // JsonValue.from(documentId))
            //                            .build()
            //                    )
            //                    .build()
            //            )
        }

        return chunks
    }
}
