// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatCompletionCreateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.messages())
            .containsExactly(
                ChatCompletionCreateParams.Message.ofUser(
                    ChatCompletionCreateParams.Message.User.builder()
                        .content("string")
                        .name("name")
                        .build()
                )
            )
        assertThat(body.model()).isEqualTo("model")
        assertThat(body.frequencyPenalty()).isEqualTo(0.0)
        assertThat(body.functionCall())
            .isEqualTo(ChatCompletionCreateParams.FunctionCall.ofString("string"))
        assertThat(body.functions())
            .containsExactly(
                ChatCompletionCreateParams.Function.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(body.logitBias())
            .isEqualTo(
                ChatCompletionCreateParams.LogitBias.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(body.logprobs()).isEqualTo(true)
        assertThat(body.maxCompletionTokens()).isEqualTo(0L)
        assertThat(body.maxTokens()).isEqualTo(0L)
        assertThat(body.n()).isEqualTo(0L)
        assertThat(body.parallelToolCalls()).isEqualTo(true)
        assertThat(body.presencePenalty()).isEqualTo(0.0)
        assertThat(body.responseFormat())
            .isEqualTo(ChatCompletionCreateParams.ResponseFormat.ofText())
        assertThat(body.seed()).isEqualTo(0L)
        assertThat(body.stop()).isEqualTo(ChatCompletionCreateParams.Stop.ofString("string"))
        assertThat(body.streamOptions())
            .isEqualTo(
                ChatCompletionCreateParams.StreamOptions.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(body.temperature()).isEqualTo(0.0)
        assertThat(body.toolChoice())
            .isEqualTo(ChatCompletionCreateParams.ToolChoice.ofString("string"))
        assertThat(body.tools())
            .containsExactly(
                ChatCompletionCreateParams.Tool.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(body.topLogprobs()).isEqualTo(0L)
        assertThat(body.topP()).isEqualTo(0.0)
        assertThat(body.user()).isEqualTo("user")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ChatCompletionCreateParams.builder().addUserMessage("string").model("model").build()

        val body = params._body()

        assertThat(body.messages())
            .containsExactly(
                ChatCompletionCreateParams.Message.ofUser(
                    ChatCompletionCreateParams.Message.User.builder().content("string").build()
                )
            )
        assertThat(body.model()).isEqualTo("model")
    }
}
