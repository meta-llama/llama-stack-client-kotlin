// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.models.*
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ModelServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val modelService = client.models()
        val model =
            modelService.retrieve(ModelRetrieveParams.builder().identifier("identifier").build())
        println(model)
        model?.validate()
    }

    @Disabled(
        "skipped: currently no good way to test endpoints with content type application/jsonl, Prism mock server will fail"
    )
    @Test
    fun callList() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val modelService = client.models()
        val model = modelService.list(ModelListParams.builder().build())
        println(model)
        model.validate()
    }

    @Test
    fun callRegister() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val modelService = client.models()
        val model =
            modelService.register(
                ModelRegisterParams.builder()
                    .modelId("model_id")
                    .metadata(ModelRegisterParams.Metadata.builder().build())
                    .providerId("provider_id")
                    .providerModelId("provider_model_id")
                    .build()
            )
        println(model)
        model.validate()
    }
}
