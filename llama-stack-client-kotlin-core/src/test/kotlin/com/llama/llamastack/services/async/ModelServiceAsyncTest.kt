// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClientAsync
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.ModelRegisterParams
import com.llama.llamastack.models.ModelRetrieveParams
import com.llama.llamastack.models.ModelUnregisterParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ModelServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val modelServiceAsync = client.models()

        val model =
            modelServiceAsync.retrieve(ModelRetrieveParams.builder().modelId("model_id").build())

        model.validate()
    }

    @Test
    suspend fun list() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val modelServiceAsync = client.models()

        val models = modelServiceAsync.list()

        models.forEach { it.validate() }
    }

    @Test
    suspend fun register() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val modelServiceAsync = client.models()

        val model =
            modelServiceAsync.register(
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
    suspend fun unregister() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val modelServiceAsync = client.models()

        modelServiceAsync.unregister(ModelUnregisterParams.builder().modelId("model_id").build())
    }
}
