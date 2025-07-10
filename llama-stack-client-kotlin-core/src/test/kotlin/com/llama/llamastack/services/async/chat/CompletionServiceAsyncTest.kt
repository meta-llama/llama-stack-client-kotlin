// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async.chat

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClientAsync
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.ChatCompletionCreateParams
import com.llama.llamastack.models.ChatCompletionListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CompletionServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val completionServiceAsync = client.chat().completions()

        val completion =
            completionServiceAsync.create(
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
    suspend fun retrieve() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val completionServiceAsync = client.chat().completions()

        val completion = completionServiceAsync.retrieve("completion_id")

        completion.validate()
    }

    @Test
    suspend fun list() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val completionServiceAsync = client.chat().completions()

        val completions =
            completionServiceAsync.list(
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
