package com.example.llamastackandroiddemo

import android.content.Context
import android.net.Uri
import com.llama.llamastack.client.LlamaStackClientClient
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.RequestOptions
import com.llama.llamastack.models.Document
import com.llama.llamastack.models.ProviderListParams
import com.llama.llamastack.models.ToolRuntimeRagToolInsertParams
import com.llama.llamastack.models.VectorDbRegisterParams
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.time.Duration
import java.util.UUID

const val DEFAULT_CHUNK_SIZE = 512L

object RemoteRagUtils {
    suspend fun setupRagVectorDatabase(client: LlamaStackClientClient, uris: List<String>, context: Context): String {
        // Create multiple documents
        val documents = uris.mapIndexed { i, uri ->
            val metadata = Document.Metadata.builder()
                .putAdditionalProperty("title", JsonValue.from(uri))
                .build()

            val content = FileUtils.readFileFromURI(Uri.parse(uri), context)

            Document.builder()
                .documentId("num$i")
                .content(content)
                .mimeType("text/plain")
                .metadata(metadata)
                .build()
        }

        // Get vector provider ID
        val providerId = getVectorProviderId(client)

        // Register a vector database
        val vectorDbId = "test-vector-db-${UUID.randomUUID().toString().replace("-", "")}"
        registerVectorDb(client, providerId, vectorDbId)

        // Insert the documents into the vector database
        insertDocumentsToVectorDb(client, documents, vectorDbId)

        return vectorDbId
    }

    private suspend fun getVectorProviderId(client: LlamaStackClientClient): String {
        val params = ProviderListParams.builder()
            .putAdditionalQueryParam("api", "vector_io")
            .build()
        val requestOptions = RequestOptions.builder()
            .timeout(Duration.ofSeconds(2))
            .responseValidation(false)
            .build()

        val vectorProviders = withContext(Dispatchers.IO) {
            client.providers().list(params, requestOptions).filter { it.api() == "vector_io" }
        }

        if (vectorProviders.isEmpty()) {
            throw RuntimeException("No vector providers available")
        }

        return vectorProviders[0].providerId()
    }

    private fun registerVectorDb(client: LlamaStackClientClient, providerId: String, vectorDbId: String) {
        client.vectorDbs().register(
            VectorDbRegisterParams.builder()
                .providerId(providerId)
                .vectorDbId(vectorDbId)
                .embeddingModel("all-MiniLM-L6-v2")
                .embeddingDimension(384)
                .build()
        )
    }

    private fun insertDocumentsToVectorDb(client: LlamaStackClientClient, documents: List<Document>, vectorDbId: String) {
        client.toolRuntime().ragTool().insert(
            ToolRuntimeRagToolInsertParams.builder()
                .documents(documents)
                .vectorDbId(vectorDbId)
                .chunkSizeInTokens(DEFAULT_CHUNK_SIZE)
                .build()
        )
    }
}
