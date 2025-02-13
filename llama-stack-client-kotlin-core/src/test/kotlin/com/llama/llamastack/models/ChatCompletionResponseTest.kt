// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ChatCompletionResponseTest {

    @Test
    fun createChatCompletionResponse() {
        val chatCompletionResponse =
            ChatCompletionResponse.builder()
                .completionMessage(
                    CompletionMessage.builder()
                        .content("string")
                        .stopReason(CompletionMessage.StopReason.END_OF_TURN)
                        .addToolCall(
                            ToolCall.builder()
                                .arguments(
                                    ToolCall.Arguments.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .callId("call_id")
                                .toolName(ToolCall.ToolName.BRAVE_SEARCH)
                                .build()
                        )
                        .build()
                )
                .addLogprob(
                    TokenLogProbs.builder()
                        .logprobsByToken(
                            TokenLogProbs.LogprobsByToken.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .build()
                )
                .build()
        assertThat(chatCompletionResponse).isNotNull
        assertThat(chatCompletionResponse.completionMessage())
            .isEqualTo(
                CompletionMessage.builder()
                    .content("string")
                    .stopReason(CompletionMessage.StopReason.END_OF_TURN)
                    .addToolCall(
                        ToolCall.builder()
                            .arguments(
                                ToolCall.Arguments.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .callId("call_id")
                            .toolName(ToolCall.ToolName.BRAVE_SEARCH)
                            .build()
                    )
                    .build()
            )
        assertThat(chatCompletionResponse.logprobs())
            .containsExactly(
                TokenLogProbs.builder()
                    .logprobsByToken(
                        TokenLogProbs.LogprobsByToken.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .build()
            )
    }
}
