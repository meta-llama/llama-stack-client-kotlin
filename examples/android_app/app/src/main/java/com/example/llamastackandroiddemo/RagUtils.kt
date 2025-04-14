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
    suspend fun setupRagVectorDatabase(client: LlamaStackClientClient, uris: List<String>, context: Context): String {
        // Define documents to be used for RAG

        // Create multiple documents
        val documents = uris.mapIndexed { i, uri ->
            val metadata = Document.Metadata.builder()
                .putAdditionalProperty("title", JsonValue.from(uri))
                .build()

            val dataUri = readFileFromURI(Uri.parse(uri), context)

            Document.builder()
                .documentId("num$i")
                .content(uri)
                .content(dataUri)
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
}
