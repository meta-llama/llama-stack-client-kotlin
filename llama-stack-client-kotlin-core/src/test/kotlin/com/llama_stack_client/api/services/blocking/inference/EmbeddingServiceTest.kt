// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.services.blocking.inference

import com.llama_stack_client.api.TestServerExtension
import com.llama_stack_client.api.client.okhttp.LlamaStackClientOkHttpClient
import com.llama_stack_client.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class EmbeddingServiceTest {

    @Test
    fun callCreate() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val embeddingService = client.inference().embeddings()
        val embeddings =
            embeddingService.create(
                InferenceEmbeddingCreateParams.builder()
                    .contents(listOf(InferenceEmbeddingCreateParams.Content.ofString("string")))
                    .model("model")
                    .build()
            )
        println(embeddings)
        embeddings.validate()
    }
}
