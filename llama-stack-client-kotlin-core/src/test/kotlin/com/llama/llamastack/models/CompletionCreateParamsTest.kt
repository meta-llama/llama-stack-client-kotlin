// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompletionCreateParamsTest {

    @Test
    fun create() {
        CompletionCreateParams.builder()
            .model("model")
            .prompt("string")
            .bestOf(0L)
            .echo(true)
            .frequencyPenalty(0.0)
            .addGuidedChoice("string")
            .logitBias(
                CompletionCreateParams.LogitBias.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
            .logprobs(true)
            .maxTokens(0L)
            .n(0L)
            .presencePenalty(0.0)
            .promptLogprobs(0L)
            .seed(0L)
            .stop("string")
            .streamOptions(
                CompletionCreateParams.StreamOptions.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
            .suffix("suffix")
            .temperature(0.0)
            .topP(0.0)
            .user("user")
            .build()
    }

    @Test
    fun body() {
        val params =
            CompletionCreateParams.builder()
                .model("model")
                .prompt("string")
                .bestOf(0L)
                .echo(true)
                .frequencyPenalty(0.0)
                .addGuidedChoice("string")
                .logitBias(
                    CompletionCreateParams.LogitBias.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .logprobs(true)
                .maxTokens(0L)
                .n(0L)
                .presencePenalty(0.0)
                .promptLogprobs(0L)
                .seed(0L)
                .stop("string")
                .streamOptions(
                    CompletionCreateParams.StreamOptions.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .suffix("suffix")
                .temperature(0.0)
                .topP(0.0)
                .user("user")
                .build()

        val body = params._body()

        assertThat(body.model()).isEqualTo("model")
        assertThat(body.prompt()).isEqualTo(CompletionCreateParams.Prompt.ofString("string"))
        assertThat(body.bestOf()).isEqualTo(0L)
        assertThat(body.echo()).isEqualTo(true)
        assertThat(body.frequencyPenalty()).isEqualTo(0.0)
        assertThat(body.guidedChoice()).containsExactly("string")
        assertThat(body.logitBias())
            .isEqualTo(
                CompletionCreateParams.LogitBias.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(body.logprobs()).isEqualTo(true)
        assertThat(body.maxTokens()).isEqualTo(0L)
        assertThat(body.n()).isEqualTo(0L)
        assertThat(body.presencePenalty()).isEqualTo(0.0)
        assertThat(body.promptLogprobs()).isEqualTo(0L)
        assertThat(body.seed()).isEqualTo(0L)
        assertThat(body.stop()).isEqualTo(CompletionCreateParams.Stop.ofString("string"))
        assertThat(body.streamOptions())
            .isEqualTo(
                CompletionCreateParams.StreamOptions.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(body.suffix()).isEqualTo("suffix")
        assertThat(body.temperature()).isEqualTo(0.0)
        assertThat(body.topP()).isEqualTo(0.0)
        assertThat(body.user()).isEqualTo("user")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CompletionCreateParams.builder().model("model").prompt("string").build()

        val body = params._body()

        assertThat(body.model()).isEqualTo("model")
        assertThat(body.prompt()).isEqualTo(CompletionCreateParams.Prompt.ofString("string"))
    }
}
