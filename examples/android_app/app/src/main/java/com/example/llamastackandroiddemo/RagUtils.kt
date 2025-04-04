package com.example.llamastackandroiddemo

import android.content.Context
import com.llama.llamastack.client.LlamaStackClientClient
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.AgentConfig
import com.llama.llamastack.models.Document
import com.llama.llamastack.models.ProviderListParams
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.ToolRuntimeRagToolInsertParams
import com.llama.llamastack.models.VectorDbRegisterParams
import java.util.UUID
import android.util.Base64
import android.net.Uri
import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.time.Duration

object RagUtils {
    /**
     * Creates a RAG knowledge search toolgroup with the specified vector database ID
     * @param vectorDbId The ID of the vector database to search
     * @return A configured Toolgroup for RAG knowledge search
     */
    fun createRagKnowledgeSearchToolgroup(vectorDbId: String): AgentConfig.Toolgroup {
        // Create the args object with vector_db_ids
        val args = AgentConfig.Toolgroup.AgentToolGroupWithArgs.Args.builder()
            .putAdditionalProperty("vector_db_ids", JsonValue.from(listOf(vectorDbId)))
            .build()

        // Create the AgentToolGroupWithArgs object
        val toolGroupWithArgs = AgentConfig.Toolgroup.AgentToolGroupWithArgs.builder()
            .name("builtin::rag/knowledge_search")
            .args(args)
            .build()

        // Create and return the Toolgroup
        return AgentConfig.Toolgroup.ofAgentToolGroupWithArgs(toolGroupWithArgs)
    }

    suspend fun setupRagVectorDatabase(client: LlamaStackClientClient, uris: List<String>): String {
        // Define documents to be used for RAG

        // Create multiple documents
        val documents = uris.mapIndexed { i, uri ->
            val metadata = Document.Metadata.builder()
                .putAdditionalProperty("title", JsonValue.from(uri))
                .build()

            Document.builder()
                .documentId("num$i")
                .content(uri)
                .mimeType("text/plain")
                .metadata(metadata)
                .build()
        }

        // Get vector providers
        val params = ProviderListParams.builder()
             // You can add additional query parameters if needed
              .putAdditionalQueryParam("api", "vector_io")
             .build()
        val requestOptions = RequestOptions.builder()
             .timeout(Duration.ofSeconds(2)) // Set an appropriate timeout
             .responseValidation(false) // Enable response validation if needed
            .build()
        val vectorProviders = withContext(Dispatchers.IO) {
            client.providers().list(params, requestOptions).filter { it.api() == "vector_io" }
        }
        if (vectorProviders.isEmpty()) {
            throw RuntimeException("No vector providers available")
        }
        val providerId = vectorProviders[0].providerId()

        // Register a vector database
        val vectorDbId = "test-vector-db-${UUID.randomUUID().toString().replace("-", "")}"
//        val vectorDbId = "test-vector-db-47fe7a894a4a471ca529f4e90235caab"
        client.vectorDbs().register(
            VectorDbRegisterParams.builder()
                .providerId(providerId)
                .vectorDbId(vectorDbId)
                .embeddingModel("all-MiniLM-L6-v2")
                .embeddingDimension(384)
                .build()
        )

        // Insert the documents into the vector database
        client.toolRuntime().ragTool().insert(
            ToolRuntimeRagToolInsertParams.builder()
                .documents(documents)
                .vectorDbId(vectorDbId)
                .chunkSizeInTokens(512)
                .build()
        )

        return vectorDbId
    }

    private fun dataUrlFromUrl(path: String, context: Context): String {
        val bytes: ByteArray
        val mimeType: String

        // Read from assets
        context.assets.open(path).use { inputStream ->
            bytes = inputStream.readBytes()
        }
        mimeType = when {
            path.endsWith(".txt") -> "text/plain"
            path.endsWith(".pdf") -> "application/pdf"
            path.endsWith(".json") -> "application/json"
            else -> "application/octet-stream"
        }

        val base64 = Base64.encodeToString(bytes, Base64.NO_WRAP)
        return "data:$mimeType;base64,$base64"
    }
}
