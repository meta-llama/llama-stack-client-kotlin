// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.services.blocking

import com.llama_stack_client.api.TestServerExtension
import com.llama_stack_client.api.client.okhttp.LlamaStackClientOkHttpClient
import com.llama_stack_client.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ModelServiceTest {

    @Test
    fun callList() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val modelService = client.models()
        val modelServingSpec = modelService.list(ModelListParams.builder().build())
        println(modelServingSpec)
        modelServingSpec.validate()
    }

    @Test
    fun callGet() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val modelService = client.models()
        val modelServingSpec =
            modelService.get(ModelGetParams.builder().coreModelId("core_model_id").build())
        println(modelServingSpec)
        modelServingSpec?.validate()
    }
}
