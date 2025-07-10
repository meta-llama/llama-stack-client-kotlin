// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking.chat

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.ChatCompletionCreateParams
import com.llama.llamastack.models.ChatCompletionListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CompletionServiceTest {

    @Test
    fun create() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val completionService = client.chat().completions()

        val completion =
            completionService.create(
                ChatCompletionCreateParams.builder()
                    .addMessage(
                        ChatCompletionCreateParams.Message.User.builder()
                            .content("string")
                            .name("name")
                            .build()
                    )
                    .model("model")
                    .frequencyPenalty(0.0)
                    .functionCall("string")
                    .addFunction(
                        ChatCompletionCreateParams.Function.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .logitBias(
                        ChatCompletionCreateParams.LogitBias.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .logprobs(true)
                    .maxCompletionTokens(0L)
                    .maxTokens(0L)
                    .n(0L)
                    .parallelToolCalls(true)
                    .presencePenalty(0.0)
                    .responseFormatText()
                    .seed(0L)
                    .stop("string")
                    .streamOptions(
                        ChatCompletionCreateParams.StreamOptions.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .temperature(0.0)
                    .toolChoice("string")
                    .addTool(
                        ChatCompletionCreateParams.Tool.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .topLogprobs(0L)
                    .topP(0.0)
                    .user("user")
                    .build()
            )

        completion.validate()
    }

    @Test
    fun createStreaming() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val completionService = client.chat().completions()

        val completionStreamResponse =
            completionService.createStreaming(
                ChatCompletionCreateParams.builder()
                    .addMessage(
                        ChatCompletionCreateParams.Message.User.builder()
                            .content("string")
                            .name("name")
                            .build()
                    )
                    .model("model")
                    .frequencyPenalty(0.0)
                    .functionCall("string")
                    .addFunction(
                        ChatCompletionCreateParams.Function.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .logitBias(
                        ChatCompletionCreateParams.LogitBias.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .logprobs(true)
                    .maxCompletionTokens(0L)
                    .maxTokens(0L)
                    .n(0L)
                    .parallelToolCalls(true)
                    .presencePenalty(0.0)
                    .responseFormatText()
                    .seed(0L)
                    .stop("string")
                    .streamOptions(
                        ChatCompletionCreateParams.StreamOptions.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .temperature(0.0)
                    .toolChoice("string")
                    .addTool(
                        ChatCompletionCreateParams.Tool.builder()
                            .putAdditionalProperty("foo", JsonValue.from(true))
                            .build()
                    )
                    .topLogprobs(0L)
                    .topP(0.0)
                    .user("user")
                    .build()
            )

        completionStreamResponse.use {
            completionStreamResponse.asSequence().forEach { completion -> completion.validate() }
        }
    }

    @Test
    fun retrieve() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val completionService = client.chat().completions()

        val completion = completionService.retrieve("completion_id")

        completion.validate()
    }

    @Test
    fun list() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val completionService = client.chat().completions()

        val completions =
            completionService.list(
                ChatCompletionListParams.builder()
                    .after("after")
                    .limit(0L)
                    .model("model")
                    .order(ChatCompletionListParams.Order.ASC)
                    .build()
            )

        completions.validate()
    }
}
