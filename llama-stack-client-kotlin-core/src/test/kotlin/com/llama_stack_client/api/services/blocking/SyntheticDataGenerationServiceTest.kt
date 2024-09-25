// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.services.blocking

import com.llama_stack_client.api.TestServerExtension
import com.llama_stack_client.api.client.okhttp.LlamaStackClientOkHttpClient
import com.llama_stack_client.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class SyntheticDataGenerationServiceTest {

    @Test
    fun callGenerate() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val syntheticDataGenerationService = client.syntheticDataGeneration()
        val syntheticDataGeneration =
            syntheticDataGenerationService.generate(
                SyntheticDataGenerationGenerateParams.builder()
                    .dialogs(
                        listOf(
                            SyntheticDataGenerationGenerateParams.Dialog.ofUserMessage(
                                UserMessage.builder()
                                    .content(UserMessage.Content.ofString("string"))
                                    .role(UserMessage.Role.USER)
                                    .context(UserMessage.Context.ofString("string"))
                                    .build()
                            )
                        )
                    )
                    .filteringFunction(SyntheticDataGenerationGenerateParams.FilteringFunction.NONE)
                    .model("model")
                    .build()
            )
        println(syntheticDataGeneration)
        syntheticDataGeneration.validate()
    }
}
