// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResponseCreateParamsTest {

    @Test
    fun create() {
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
                        ResponseCreateParams.Tool.OpenAIResponseInputToolWebSearch.Type.WEB_SEARCH
                    )
                    .searchContextSize("search_context_size")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.input()).isEqualTo(ResponseCreateParams.Input.ofString("string"))
        assertThat(body.model()).isEqualTo("model")
        assertThat(body.instructions()).isEqualTo("instructions")
        assertThat(body.maxInferIters()).isEqualTo(0L)
        assertThat(body.previousResponseId()).isEqualTo("previous_response_id")
        assertThat(body.store()).isEqualTo(true)
        assertThat(body.temperature()).isEqualTo(0.0)
        assertThat(body.text())
            .isEqualTo(
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
        assertThat(body.tools())
            .containsExactly(
                ResponseCreateParams.Tool.ofOpenAIResponseInputToolWebSearch(
                    ResponseCreateParams.Tool.OpenAIResponseInputToolWebSearch.builder()
                        .type(
                            ResponseCreateParams.Tool.OpenAIResponseInputToolWebSearch.Type
                                .WEB_SEARCH
                        )
                        .searchContextSize("search_context_size")
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ResponseCreateParams.builder().input("string").model("model").build()

        val body = params._body()

        assertThat(body.input()).isEqualTo(ResponseCreateParams.Input.ofString("string"))
        assertThat(body.model()).isEqualTo("model")
    }
}
