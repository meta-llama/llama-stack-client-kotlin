// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClientAsync
import com.llama.llamastack.models.SyntheticDataGenerationGenerateParams
import com.llama.llamastack.models.UserMessage
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class SyntheticDataGenerationServiceAsyncTest {

    @Test
    suspend fun generate() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val syntheticDataGenerationServiceAsync = client.syntheticDataGeneration()

        val syntheticDataGenerationResponse =
            syntheticDataGenerationServiceAsync.generate(
                SyntheticDataGenerationGenerateParams.builder()
                    .addDialog(UserMessage.builder().content("string").context("string").build())
                    .filteringFunction(SyntheticDataGenerationGenerateParams.FilteringFunction.NONE)
                    .model("model")
                    .build()
            )

        syntheticDataGenerationResponse.validate()
    }
}
