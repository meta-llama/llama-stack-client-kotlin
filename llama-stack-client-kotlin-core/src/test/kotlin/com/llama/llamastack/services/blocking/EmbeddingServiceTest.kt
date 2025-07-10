// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.models.EmbeddingCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EmbeddingServiceTest {

    @Test
    fun create() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val embeddingService = client.embeddings()

        val createEmbeddingsResponse =
            embeddingService.create(
                EmbeddingCreateParams.builder()
                    .input("string")
                    .model("model")
                    .dimensions(0L)
                    .encodingFormat("encoding_format")
                    .user("user")
                    .build()
            )

        createEmbeddingsResponse.validate()
    }
}
