// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.ResponseCreateParams
import com.llama.llamastack.models.ResponseListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ResponseServiceTest {

    @Test
    fun create() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val responseService = client.responses()

        val responseObject =
            responseService.create(
                ResponseCreateParams.builder()
                    .input("string")
                    .model("model")
                    .instructions("instructions")
                    .maxInferIters(0L)
                    .previousResponseId("previous_response_id")
                    .store(true)
                    .temperature(0.0)
                    .text(
                        ResponseCreateParams.Text.builder()
                            .format(
                                ResponseCreateParams.Text.Format.builder()
                                    .type(ResponseCreateParams.Text.Format.Type.TEXT)
                                    .description("description")
                                    .name("name")
                                    .schema(
                                        ResponseCreateParams.Text.Format.Schema.builder()
                                            .putAdditionalProperty("foo", JsonValue.from(true))
                                            .build()
                                    )
                                    .strict(true)
                                    .build()
                            )
                            .build()
                    )
                    .addTool(
                        ResponseCreateParams.Tool.OpenAIResponseInputToolWebSearch.builder()
                            .type(
                                ResponseCreateParams.Tool.OpenAIResponseInputToolWebSearch.Type
                                    .WEB_SEARCH
                            )
                            .searchContextSize("search_context_size")
                            .build()
                    )
                    .build()
            )

        responseObject.validate()
    }

    @Test
    fun createStreaming() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val responseService = client.responses()

        val responseObjectStreamResponse =
            responseService.createStreaming(
                ResponseCreateParams.builder()
                    .input("string")
                    .model("model")
                    .instructions("instructions")
                    .maxInferIters(0L)
                    .previousResponseId("previous_response_id")
                    .store(true)
                    .temperature(0.0)
                    .text(
                        ResponseCreateParams.Text.builder()
                            .format(
                                ResponseCreateParams.Text.Format.builder()
                                    .type(ResponseCreateParams.Text.Format.Type.TEXT)
                                    .description("description")
                                    .name("name")
                                    .schema(
                                        ResponseCreateParams.Text.Format.Schema.builder()
                                            .putAdditionalProperty("foo", JsonValue.from(true))
                                            .build()
                                    )
                                    .strict(true)
                                    .build()
                            )
                            .build()
                    )
                    .addTool(
                        ResponseCreateParams.Tool.OpenAIResponseInputToolWebSearch.builder()
                            .type(
                                ResponseCreateParams.Tool.OpenAIResponseInputToolWebSearch.Type
                                    .WEB_SEARCH
                            )
                            .searchContextSize("search_context_size")
                            .build()
                    )
                    .build()
            )

        responseObjectStreamResponse.use {
            responseObjectStreamResponse.asSequence().forEach { responseObject ->
                responseObject.validate()
            }
        }
    }

    @Test
    fun retrieve() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val responseService = client.responses()

        val responseObject = responseService.retrieve("response_id")

        responseObject.validate()
    }

    @Test
    fun list() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val responseService = client.responses()

        val responses =
            responseService.list(
                ResponseListParams.builder()
                    .after("after")
                    .limit(0L)
                    .model("model")
                    .order(ResponseListParams.Order.ASC)
                    .build()
            )

        responses.validate()
    }
}
