package com.example.llamastackandroiddemo

import com.llama.llamastack.client.LlamaStackClientClient
import com.llama.llamastack.client.local.services.toolruntime.RagToolServiceLocalImpl
import com.llama.llamastack.models.Document
import com.llama.llamastack.models.ToolRuntimeRagToolInsertParams
import com.llama.llamastack.models.VectorDbRegisterParams
import java.util.UUID

object LocalRagUtils {
    fun storeAndEmbedDocument(
        client: LlamaStackClientClient?,
        sentenceEmbeddingModel: SentenceEmbeddingModel,
        text: String,
        chunkSizeInWords: Long = RagUtils.DEFAULT_CHUNK_SIZE
    ): String {
        // Currently just supporting single documents
        AppLogging.getInstance().log("Building Llama Stack Document object")
        val document = Document.builder()
            .documentId("1")
            .content(text)
            .metadata(Document.Metadata.builder().build())
            .build()

        val vectorDbId = UUID.randomUUID().toString()

        // Create Vector DB
        AppLogging.getInstance().log("Registering to create vector db")
        client!!.vectorDbs().register(
            VectorDbRegisterParams.builder()
                .vectorDbId(vectorDbId)
                .embeddingModel("placeholder")
                .build()
        )

        // unique to local
        val ragTool = client.toolRuntime().ragTool() as RagToolServiceLocalImpl

        // Create chunks
        AppLogging.getInstance().log("Create chunks")
        val tagToolParams = ToolRuntimeRagToolInsertParams.builder()
            .vectorDbId(vectorDbId)
            .chunkSizeInTokens(chunkSizeInWords)
            .documents(listOf(document))
            .build()
        val chunks = ragTool.createChunks(tagToolParams)

        // Create embeddings
        AppLogging.getInstance().log("Create embeddings for chunks")
        val embeddings = chunks.map { sentenceEmbeddingModel.createEmbedding(it) }.toMutableList()

        // Store embeddings
        AppLogging.getInstance().log("Store embedded chunks to vector db")
        ragTool.insert(vectorDbId, embeddings, chunks)

        return vectorDbId
    }

    fun getSystemPromptForLocalRAG(): String {
        // It is important to keep _RETRIEVED_CONTEXT_ placeholder. This is what will be used in SDK to
        // replace it with similar neighbors
        return "You are a helpful assistant. You will be provided with retrieved context. " +
                "Your answer to the user request should be based on the retrieved context." +
                "Make sure you ONLY use the retrieve context to answer the question. " +
                "Retrieved context: _RETRIEVED_CONTEXT_"
    }
}
