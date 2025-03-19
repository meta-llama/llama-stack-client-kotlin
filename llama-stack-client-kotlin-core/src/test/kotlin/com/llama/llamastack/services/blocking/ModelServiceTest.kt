// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.ModelRegisterParams
import com.llama.llamastack.models.ModelRetrieveParams
import com.llama.llamastack.models.ModelUnregisterParams
import kotlin.test.assertNotNull
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ModelServiceTest {

    @Test
    fun retrieve() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val modelService = client.models()

        val model = modelService.retrieve(ModelRetrieveParams.builder().modelId("model_id").build())

        assertNotNull(model)
        model.validate()
    }

    @Test
    fun list() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val modelService = client.models()

        val models = modelService.list()

        models.forEach { it.validate() }
    }

    @Test
    fun register() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val modelService = client.models()

        val model =
            modelService.register(
                ModelRegisterParams.builder()
                    .modelId("model_id")
                    .metadata(
                        ModelRegisterParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .modelType(ModelRegisterParams.ModelType.LLM)
                    .providerId("provider_id")
                    .providerModelId("provider_model_id")
                    .build()
            )

        model.validate()
    }

    @Test
    fun unregister() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val modelService = client.models()

        modelService.unregister(ModelUnregisterParams.builder().modelId("model_id").build())
    }
}
