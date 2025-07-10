// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompletionCreateResponseTest {

    @Test
    fun create() {
        val completionCreateResponse =
            CompletionCreateResponse.builder()
                .id("id")
                .addChoice(
                    CompletionCreateResponse.Choice.builder()
                        .finishReason("finish_reason")
                        .index(0L)
                        .text("text")
                        .logprobs(
                            CompletionCreateResponse.Choice.Logprobs.builder()
                                .addContent(
                                    CompletionCreateResponse.Choice.Logprobs.Content.builder()
                                        .token("token")
                                        .logprob(0.0)
                                        .addTopLogprob(
                                            CompletionCreateResponse.Choice.Logprobs.Content
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
                                    CompletionCreateResponse.Choice.Logprobs.Refusal.builder()
                                        .token("token")
                                        .logprob(0.0)
                                        .addTopLogprob(
                                            CompletionCreateResponse.Choice.Logprobs.Refusal
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

        assertThat(completionCreateResponse.id()).isEqualTo("id")
        assertThat(completionCreateResponse.choices())
            .containsExactly(
                CompletionCreateResponse.Choice.builder()
                    .finishReason("finish_reason")
                    .index(0L)
                    .text("text")
                    .logprobs(
                        CompletionCreateResponse.Choice.Logprobs.builder()
                            .addContent(
                                CompletionCreateResponse.Choice.Logprobs.Content.builder()
                                    .token("token")
                                    .logprob(0.0)
                                    .addTopLogprob(
                                        CompletionCreateResponse.Choice.Logprobs.Content.TopLogprob
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
                                CompletionCreateResponse.Choice.Logprobs.Refusal.builder()
                                    .token("token")
                                    .logprob(0.0)
                                    .addTopLogprob(
                                        CompletionCreateResponse.Choice.Logprobs.Refusal.TopLogprob
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
        assertThat(completionCreateResponse.created()).isEqualTo(0L)
        assertThat(completionCreateResponse.model()).isEqualTo("model")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val completionCreateResponse =
            CompletionCreateResponse.builder()
                .id("id")
                .addChoice(
                    CompletionCreateResponse.Choice.builder()
                        .finishReason("finish_reason")
                        .index(0L)
                        .text("text")
                        .logprobs(
                            CompletionCreateResponse.Choice.Logprobs.builder()
                                .addContent(
                                    CompletionCreateResponse.Choice.Logprobs.Content.builder()
                                        .token("token")
                                        .logprob(0.0)
                                        .addTopLogprob(
                                            CompletionCreateResponse.Choice.Logprobs.Content
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
                                    CompletionCreateResponse.Choice.Logprobs.Refusal.builder()
                                        .token("token")
                                        .logprob(0.0)
                                        .addTopLogprob(
                                            CompletionCreateResponse.Choice.Logprobs.Refusal
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

        val roundtrippedCompletionCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(completionCreateResponse),
                jacksonTypeRef<CompletionCreateResponse>(),
            )

        assertThat(roundtrippedCompletionCreateResponse).isEqualTo(completionCreateResponse)
    }
}
