// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResponseObjectTest {

    @Test
    fun create() {
        val responseObject =
            ResponseObject.builder()
                .id("id")
                .createdAt(0L)
                .model("model")
                .addOutput(
                    ResponseObject.Output.Message.builder()
                        .content("string")
                        .role(ResponseObject.Output.Message.Role.SYSTEM)
                        .id("id")
                        .status("status")
                        .build()
                )
                .parallelToolCalls(true)
                .status("status")
                .text(
                    ResponseObject.Text.builder()
                        .format(
                            ResponseObject.Text.Format.builder()
                                .type(ResponseObject.Text.Format.Type.TEXT)
                                .description("description")
                                .name("name")
                                .schema(
                                    ResponseObject.Text.Format.Schema.builder()
                                        .putAdditionalProperty("foo", JsonValue.from(true))
                                        .build()
                                )
                                .strict(true)
                                .build()
                        )
                        .build()
                )
                .error(ResponseObject.Error.builder().code("code").message("message").build())
                .previousResponseId("previous_response_id")
                .temperature(0.0)
                .topP(0.0)
                .truncation("truncation")
                .user("user")
                .build()

        assertThat(responseObject.id()).isEqualTo("id")
        assertThat(responseObject.createdAt()).isEqualTo(0L)
        assertThat(responseObject.model()).isEqualTo("model")
        assertThat(responseObject.output())
            .containsExactly(
                ResponseObject.Output.ofMessage(
                    ResponseObject.Output.Message.builder()
                        .content("string")
                        .role(ResponseObject.Output.Message.Role.SYSTEM)
                        .id("id")
                        .status("status")
                        .build()
                )
            )
        assertThat(responseObject.parallelToolCalls()).isEqualTo(true)
        assertThat(responseObject.status()).isEqualTo("status")
        assertThat(responseObject.text())
            .isEqualTo(
                ResponseObject.Text.builder()
                    .format(
                        ResponseObject.Text.Format.builder()
                            .type(ResponseObject.Text.Format.Type.TEXT)
                            .description("description")
                            .name("name")
                            .schema(
                                ResponseObject.Text.Format.Schema.builder()
                                    .putAdditionalProperty("foo", JsonValue.from(true))
                                    .build()
                            )
                            .strict(true)
                            .build()
                    )
                    .build()
            )
        assertThat(responseObject.error())
            .isEqualTo(ResponseObject.Error.builder().code("code").message("message").build())
        assertThat(responseObject.previousResponseId()).isEqualTo("previous_response_id")
        assertThat(responseObject.temperature()).isEqualTo(0.0)
        assertThat(responseObject.topP()).isEqualTo(0.0)
        assertThat(responseObject.truncation()).isEqualTo("truncation")
        assertThat(responseObject.user()).isEqualTo("user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val responseObject =
            ResponseObject.builder()
                .id("id")
                .createdAt(0L)
                .model("model")
                .addOutput(
                    ResponseObject.Output.Message.builder()
                        .content("string")
                        .role(ResponseObject.Output.Message.Role.SYSTEM)
                        .id("id")
                        .status("status")
                        .build()
                )
                .parallelToolCalls(true)
                .status("status")
                .text(
                    ResponseObject.Text.builder()
                        .format(
                            ResponseObject.Text.Format.builder()
                                .type(ResponseObject.Text.Format.Type.TEXT)
                                .description("description")
                                .name("name")
                                .schema(
                                    ResponseObject.Text.Format.Schema.builder()
                                        .putAdditionalProperty("foo", JsonValue.from(true))
                                        .build()
                                )
                                .strict(true)
                                .build()
                        )
                        .build()
                )
                .error(ResponseObject.Error.builder().code("code").message("message").build())
                .previousResponseId("previous_response_id")
                .temperature(0.0)
                .topP(0.0)
                .truncation("truncation")
                .user("user")
                .build()

        val roundtrippedResponseObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(responseObject),
                jacksonTypeRef<ResponseObject>(),
            )

        assertThat(roundtrippedResponseObject).isEqualTo(responseObject)
    }
}
