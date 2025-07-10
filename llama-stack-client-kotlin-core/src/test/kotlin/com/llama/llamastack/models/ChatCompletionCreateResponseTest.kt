// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class ChatCompletionCreateResponseTest {

    @Test
    fun ofOpenAIChatCompletion() {
        val openaiChatCompletion =
            ChatCompletionCreateResponse.OpenAIChatCompletion.builder()
                .id("id")
                .addChoice(
                    ChatCompletionCreateResponse.OpenAIChatCompletion.Choice.builder()
                        .finishReason("finish_reason")
                        .index(0L)
                        .message(
                            ChatCompletionCreateResponse.OpenAIChatCompletion.Choice.Message.User
                                .builder()
                                .content("string")
                                .name("name")
                                .build()
                        )
                        .logprobs(
                            ChatCompletionCreateResponse.OpenAIChatCompletion.Choice.Logprobs
                                .builder()
                                .addContent(
                                    ChatCompletionCreateResponse.OpenAIChatCompletion.Choice
                                        .Logprobs
                                        .Content
                                        .builder()
                                        .token("token")
                                        .logprob(0.0)
                                        .addTopLogprob(
                                            ChatCompletionCreateResponse.OpenAIChatCompletion.Choice
                                                .Logprobs
                                                .Content
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
                                    ChatCompletionCreateResponse.OpenAIChatCompletion.Choice
                                        .Logprobs
                                        .Refusal
                                        .builder()
                                        .token("token")
                                        .logprob(0.0)
                                        .addTopLogprob(
                                            ChatCompletionCreateResponse.OpenAIChatCompletion.Choice
                                                .Logprobs
                                                .Refusal
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
                .model("model")
                .build()

        val chatCompletionCreateResponse =
            ChatCompletionCreateResponse.ofOpenAIChatCompletion(openaiChatCompletion)

        assertThat(chatCompletionCreateResponse.openaiChatCompletion())
            .isEqualTo(openaiChatCompletion)
        assertThat(chatCompletionCreateResponse.chunk()).isNull()
    }

    @Test
    fun ofOpenAIChatCompletionRoundtrip() {
        val jsonMapper = jsonMapper()
        val chatCompletionCreateResponse =
            ChatCompletionCreateResponse.ofOpenAIChatCompletion(
                ChatCompletionCreateResponse.OpenAIChatCompletion.builder()
                    .id("id")
                    .addChoice(
                        ChatCompletionCreateResponse.OpenAIChatCompletion.Choice.builder()
                            .finishReason("finish_reason")
                            .index(0L)
                            .message(
                                ChatCompletionCreateResponse.OpenAIChatCompletion.Choice.Message
                                    .User
                                    .builder()
                                    .content("string")
                                    .name("name")
                                    .build()
                            )
                            .logprobs(
                                ChatCompletionCreateResponse.OpenAIChatCompletion.Choice.Logprobs
                                    .builder()
                                    .addContent(
                                        ChatCompletionCreateResponse.OpenAIChatCompletion.Choice
                                            .Logprobs
                                            .Content
                                            .builder()
                                            .token("token")
                                            .logprob(0.0)
                                            .addTopLogprob(
                                                ChatCompletionCreateResponse.OpenAIChatCompletion
                                                    .Choice
                                                    .Logprobs
                                                    .Content
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
                                        ChatCompletionCreateResponse.OpenAIChatCompletion.Choice
                                            .Logprobs
                                            .Refusal
                                            .builder()
                                            .token("token")
                                            .logprob(0.0)
                                            .addTopLogprob(
                                                ChatCompletionCreateResponse.OpenAIChatCompletion
                                                    .Choice
                                                    .Logprobs
                                                    .Refusal
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
                    .model("model")
                    .build()
            )

        val roundtrippedChatCompletionCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chatCompletionCreateResponse),
                jacksonTypeRef<ChatCompletionCreateResponse>(),
            )

        assertThat(roundtrippedChatCompletionCreateResponse).isEqualTo(chatCompletionCreateResponse)
    }

    @Test
    fun ofChunk() {
        val chunk =
            ChatCompletionChunk.builder()
                .id("id")
                .addChoice(
                    ChatCompletionChunk.Choice.builder()
                        .delta(
                            ChatCompletionChunk.Choice.Delta.builder()
                                .content("content")
                                .refusal("refusal")
                                .role("role")
                                .addToolCall(
                                    ChatCompletionChunk.Choice.Delta.ToolCall.builder()
                                        .id("id")
                                        .function(
                                            ChatCompletionChunk.Choice.Delta.ToolCall.Function
                                                .builder()
                                                .arguments("arguments")
                                                .name("name")
                                                .build()
                                        )
                                        .index(0L)
                                        .build()
                                )
                                .build()
                        )
                        .finishReason("finish_reason")
                        .index(0L)
                        .logprobs(
                            ChatCompletionChunk.Choice.Logprobs.builder()
                                .addContent(
                                    ChatCompletionChunk.Choice.Logprobs.Content.builder()
                                        .token("token")
                                        .logprob(0.0)
                                        .addTopLogprob(
                                            ChatCompletionChunk.Choice.Logprobs.Content.TopLogprob
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
                                    ChatCompletionChunk.Choice.Logprobs.Refusal.builder()
                                        .token("token")
                                        .logprob(0.0)
                                        .addTopLogprob(
                                            ChatCompletionChunk.Choice.Logprobs.Refusal.TopLogprob
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
                .model("model")
                .build()

        val chatCompletionCreateResponse = ChatCompletionCreateResponse.ofChunk(chunk)

        assertThat(chatCompletionCreateResponse.openaiChatCompletion()).isNull()
        assertThat(chatCompletionCreateResponse.chunk()).isEqualTo(chunk)
    }

    @Test
    fun ofChunkRoundtrip() {
        val jsonMapper = jsonMapper()
        val chatCompletionCreateResponse =
            ChatCompletionCreateResponse.ofChunk(
                ChatCompletionChunk.builder()
                    .id("id")
                    .addChoice(
                        ChatCompletionChunk.Choice.builder()
                            .delta(
                                ChatCompletionChunk.Choice.Delta.builder()
                                    .content("content")
                                    .refusal("refusal")
                                    .role("role")
                                    .addToolCall(
                                        ChatCompletionChunk.Choice.Delta.ToolCall.builder()
                                            .id("id")
                                            .function(
                                                ChatCompletionChunk.Choice.Delta.ToolCall.Function
                                                    .builder()
                                                    .arguments("arguments")
                                                    .name("name")
                                                    .build()
                                            )
                                            .index(0L)
                                            .build()
                                    )
                                    .build()
                            )
                            .finishReason("finish_reason")
                            .index(0L)
                            .logprobs(
                                ChatCompletionChunk.Choice.Logprobs.builder()
                                    .addContent(
                                        ChatCompletionChunk.Choice.Logprobs.Content.builder()
                                            .token("token")
                                            .logprob(0.0)
                                            .addTopLogprob(
                                                ChatCompletionChunk.Choice.Logprobs.Content
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
                                        ChatCompletionChunk.Choice.Logprobs.Refusal.builder()
                                            .token("token")
                                            .logprob(0.0)
                                            .addTopLogprob(
                                                ChatCompletionChunk.Choice.Logprobs.Refusal
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
                    .model("model")
                    .build()
            )

        val roundtrippedChatCompletionCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chatCompletionCreateResponse),
                jacksonTypeRef<ChatCompletionCreateResponse>(),
            )

        assertThat(roundtrippedChatCompletionCreateResponse).isEqualTo(chatCompletionCreateResponse)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val chatCompletionCreateResponse =
            jsonMapper()
                .convertValue(testCase.value, jacksonTypeRef<ChatCompletionCreateResponse>())

        val e =
            assertThrows<LlamaStackClientInvalidDataException> {
                chatCompletionCreateResponse.validate()
            }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
