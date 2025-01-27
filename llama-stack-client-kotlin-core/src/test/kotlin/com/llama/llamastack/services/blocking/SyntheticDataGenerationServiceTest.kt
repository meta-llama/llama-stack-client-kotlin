// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.models.SyntheticDataGenerationGenerateParams
import com.llama.llamastack.models.UserMessage
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class SyntheticDataGenerationServiceTest {

    @Test
    fun callGenerate() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val syntheticDataGenerationService = client.syntheticDataGeneration()
        val syntheticDataGenerationResponse =
            syntheticDataGenerationService.generate(
                SyntheticDataGenerationGenerateParams.builder()
                    .addDialog(UserMessage.builder().content("string").context("string").build())
                    .filteringFunction(SyntheticDataGenerationGenerateParams.FilteringFunction.NONE)
                    .model("model")
                    .xLlamaStackClientVersion("X-LlamaStack-Client-Version")
                    .xLlamaStackProviderData("X-LlamaStack-Provider-Data")
                    .build()
            )
        println(syntheticDataGenerationResponse)
        syntheticDataGenerationResponse.validate()
    }
}
