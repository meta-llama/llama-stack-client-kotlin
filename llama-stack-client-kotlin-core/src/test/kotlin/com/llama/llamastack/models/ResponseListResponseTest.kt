// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResponseListResponseTest {

    @Test
    fun create() {
        val responseListResponse =
            ResponseListResponse.builder()
                .addData(
                    ResponseListResponse.Data.builder()
                        .id("id")
                        .createdAt(0L)
                        .addInput(
                            ResponseListResponse.Data.Input
                                .OpenAIResponseOutputMessageWebSearchToolCall
                                .builder()
                                .id("id")
                                .status("status")
                                .build()
                        )
                        .model("model")
                        .addOutput(
                            ResponseListResponse.Data.Output.Message.builder()
                                .content("string")
                                .role(ResponseListResponse.Data.Output.Message.Role.SYSTEM)
                                .id("id")
                                .status("status")
                                .build()
                        )
                        .parallelToolCalls(true)
                        .status("status")
                        .text(
                            ResponseListResponse.Data.Text.builder()
                                .format(
                                    ResponseListResponse.Data.Text.Format.builder()
                                        .type(ResponseListResponse.Data.Text.Format.Type.TEXT)
                                        .description("description")
                                        .name("name")
                                        .schema(
                                            ResponseListResponse.Data.Text.Format.Schema.builder()
                                                .putAdditionalProperty("foo", JsonValue.from(true))
                                                .build()
                                        )
                                        .strict(true)
                                        .build()
                                )
                                .build()
                        )
                        .error(
                            ResponseListResponse.Data.Error.builder()
                                .code("code")
                                .message("message")
                                .build()
                        )
                        .previousResponseId("previous_response_id")
                        .temperature(0.0)
                        .topP(0.0)
                        .truncation("truncation")
                        .user("user")
                        .build()
                )
                .firstId("first_id")
                .hasMore(true)
                .lastId("last_id")
                .build()

        assertThat(responseListResponse.data())
            .containsExactly(
                ResponseListResponse.Data.builder()
                    .id("id")
                    .createdAt(0L)
                    .addInput(
                        ResponseListResponse.Data.Input.OpenAIResponseOutputMessageWebSearchToolCall
                            .builder()
                            .id("id")
                            .status("status")
                            .build()
                    )
                    .model("model")
                    .addOutput(
                        ResponseListResponse.Data.Output.Message.builder()
                            .content("string")
                            .role(ResponseListResponse.Data.Output.Message.Role.SYSTEM)
                            .id("id")
                            .status("status")
                            .build()
                    )
                    .parallelToolCalls(true)
                    .status("status")
                    .text(
                        ResponseListResponse.Data.Text.builder()
                            .format(
                                ResponseListResponse.Data.Text.Format.builder()
                                    .type(ResponseListResponse.Data.Text.Format.Type.TEXT)
                                    .description("description")
                                    .name("name")
                                    .schema(
                                        ResponseListResponse.Data.Text.Format.Schema.builder()
                                            .putAdditionalProperty("foo", JsonValue.from(true))
                                            .build()
                                    )
                                    .strict(true)
                                    .build()
                            )
                            .build()
                    )
                    .error(
                        ResponseListResponse.Data.Error.builder()
                            .code("code")
                            .message("message")
                            .build()
                    )
                    .previousResponseId("previous_response_id")
                    .temperature(0.0)
                    .topP(0.0)
                    .truncation("truncation")
                    .user("user")
                    .build()
            )
        assertThat(responseListResponse.firstId()).isEqualTo("first_id")
        assertThat(responseListResponse.hasMore()).isEqualTo(true)
        assertThat(responseListResponse.lastId()).isEqualTo("last_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val responseListResponse =
            ResponseListResponse.builder()
                .addData(
                    ResponseListResponse.Data.builder()
                        .id("id")
                        .createdAt(0L)
                        .addInput(
                            ResponseListResponse.Data.Input
                                .OpenAIResponseOutputMessageWebSearchToolCall
                                .builder()
                                .id("id")
                                .status("status")
                                .build()
                        )
                        .model("model")
                        .addOutput(
                            ResponseListResponse.Data.Output.Message.builder()
                                .content("string")
                                .role(ResponseListResponse.Data.Output.Message.Role.SYSTEM)
                                .id("id")
                                .status("status")
                                .build()
                        )
                        .parallelToolCalls(true)
                        .status("status")
                        .text(
                            ResponseListResponse.Data.Text.builder()
                                .format(
                                    ResponseListResponse.Data.Text.Format.builder()
                                        .type(ResponseListResponse.Data.Text.Format.Type.TEXT)
                                        .description("description")
                                        .name("name")
                                        .schema(
                                            ResponseListResponse.Data.Text.Format.Schema.builder()
                                                .putAdditionalProperty("foo", JsonValue.from(true))
                                                .build()
                                        )
                                        .strict(true)
                                        .build()
                                )
                                .build()
                        )
                        .error(
                            ResponseListResponse.Data.Error.builder()
                                .code("code")
                                .message("message")
                                .build()
                        )
                        .previousResponseId("previous_response_id")
                        .temperature(0.0)
                        .topP(0.0)
                        .truncation("truncation")
                        .user("user")
                        .build()
                )
                .firstId("first_id")
                .hasMore(true)
                .lastId("last_id")
                .build()

        val roundtrippedResponseListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(responseListResponse),
                jacksonTypeRef<ResponseListResponse>(),
            )

        assertThat(roundtrippedResponseListResponse).isEqualTo(responseListResponse)
    }
}
