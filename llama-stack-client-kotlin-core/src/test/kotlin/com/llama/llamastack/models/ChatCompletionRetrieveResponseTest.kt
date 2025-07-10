// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatCompletionRetrieveResponseTest {

    @Test
    fun create() {
        val chatCompletionRetrieveResponse =
            ChatCompletionRetrieveResponse.builder()
                .id("id")
                .addChoice(
                    ChatCompletionRetrieveResponse.Choice.builder()
                        .finishReason("finish_reason")
                        .index(0L)
                        .message(
                            ChatCompletionRetrieveResponse.Choice.Message.User.builder()
                                .content("string")
                                .name("name")
                                .build()
                        )
                        .logprobs(
                            ChatCompletionRetrieveResponse.Choice.Logprobs.builder()
                                .addContent(
                                    ChatCompletionRetrieveResponse.Choice.Logprobs.Content.builder()
                                        .token("token")
                                        .logprob(0.0)
                                        .addTopLogprob(
                                            ChatCompletionRetrieveResponse.Choice.Logprobs.Content
                                                .TopLogprob
                                                .builder()
                                                .token("token")
                                                .logprob(0.0)
                                                .addByte(0L)
                                                .build()
                                        )
                                        .addByte(0L)
                                        .build()
                                )
                                .addRefusal(
                                    ChatCompletionRetrieveResponse.Choice.Logprobs.Refusal.builder()
                                        .token("token")
                                        .logprob(0.0)
                                        .addTopLogprob(
                                            ChatCompletionRetrieveResponse.Choice.Logprobs.Refusal
                                                .TopLogprob
                                                .builder()
                                                .token("token")
                                                .logprob(0.0)
                                                .addByte(0L)
                                                .build()
                                        )
                                        .addByte(0L)
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .created(0L)
                .addInputMessage(
                    ChatCompletionRetrieveResponse.InputMessage.User.builder()
                        .content("string")
                        .name("name")
                        .build()
                )
                .model("model")
                .build()

        assertThat(chatCompletionRetrieveResponse.id()).isEqualTo("id")
        assertThat(chatCompletionRetrieveResponse.choices())
            .containsExactly(
                ChatCompletionRetrieveResponse.Choice.builder()
                    .finishReason("finish_reason")
                    .index(0L)
                    .message(
                        ChatCompletionRetrieveResponse.Choice.Message.User.builder()
                            .content("string")
                            .name("name")
                            .build()
                    )
                    .logprobs(
                        ChatCompletionRetrieveResponse.Choice.Logprobs.builder()
                            .addContent(
                                ChatCompletionRetrieveResponse.Choice.Logprobs.Content.builder()
                                    .token("token")
                                    .logprob(0.0)
                                    .addTopLogprob(
                                        ChatCompletionRetrieveResponse.Choice.Logprobs.Content
                                            .TopLogprob
                                            .builder()
                                            .token("token")
                                            .logprob(0.0)
                                            .addByte(0L)
                                            .build()
                                    )
                                    .addByte(0L)
                                    .build()
                            )
                            .addRefusal(
                                ChatCompletionRetrieveResponse.Choice.Logprobs.Refusal.builder()
                                    .token("token")
                                    .logprob(0.0)
                                    .addTopLogprob(
                                        ChatCompletionRetrieveResponse.Choice.Logprobs.Refusal
                                            .TopLogprob
                                            .builder()
                                            .token("token")
                                            .logprob(0.0)
                                            .addByte(0L)
                                            .build()
                                    )
                                    .addByte(0L)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(chatCompletionRetrieveResponse.created()).isEqualTo(0L)
        assertThat(chatCompletionRetrieveResponse.inputMessages())
            .containsExactly(
                ChatCompletionRetrieveResponse.InputMessage.ofUser(
                    ChatCompletionRetrieveResponse.InputMessage.User.builder()
                        .content("string")
                        .name("name")
                        .build()
                )
            )
        assertThat(chatCompletionRetrieveResponse.model()).isEqualTo("model")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chatCompletionRetrieveResponse =
            ChatCompletionRetrieveResponse.builder()
                .id("id")
                .addChoice(
                    ChatCompletionRetrieveResponse.Choice.builder()
                        .finishReason("finish_reason")
                        .index(0L)
                        .message(
                            ChatCompletionRetrieveResponse.Choice.Message.User.builder()
                                .content("string")
                                .name("name")
                                .build()
                        )
                        .logprobs(
                            ChatCompletionRetrieveResponse.Choice.Logprobs.builder()
                                .addContent(
                                    ChatCompletionRetrieveResponse.Choice.Logprobs.Content.builder()
                                        .token("token")
                                        .logprob(0.0)
                                        .addTopLogprob(
                                            ChatCompletionRetrieveResponse.Choice.Logprobs.Content
                                                .TopLogprob
                                                .builder()
                                                .token("token")
                                                .logprob(0.0)
                                                .addByte(0L)
                                                .build()
                                        )
                                        .addByte(0L)
                                        .build()
                                )
                                .addRefusal(
                                    ChatCompletionRetrieveResponse.Choice.Logprobs.Refusal.builder()
                                        .token("token")
                                        .logprob(0.0)
                                        .addTopLogprob(
                                            ChatCompletionRetrieveResponse.Choice.Logprobs.Refusal
                                                .TopLogprob
                                                .builder()
                                                .token("token")
                                                .logprob(0.0)
                                                .addByte(0L)
                                                .build()
                                        )
                                        .addByte(0L)
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .created(0L)
                .addInputMessage(
                    ChatCompletionRetrieveResponse.InputMessage.User.builder()
                        .content("string")
                        .name("name")
                        .build()
                )
                .model("model")
                .build()

        val roundtrippedChatCompletionRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chatCompletionRetrieveResponse),
                jacksonTypeRef<ChatCompletionRetrieveResponse>(),
            )

        assertThat(roundtrippedChatCompletionRetrieveResponse)
            .isEqualTo(chatCompletionRetrieveResponse)
    }
}
