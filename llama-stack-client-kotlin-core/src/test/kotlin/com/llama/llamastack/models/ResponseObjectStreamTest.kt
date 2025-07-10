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

internal class ResponseObjectStreamTest {

    @Test
    fun ofCreated() {
        val created =
            ResponseObjectStream.ResponseCreated.builder()
                .response(
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
                        .error(
                            ResponseObject.Error.builder().code("code").message("message").build()
                        )
                        .previousResponseId("previous_response_id")
                        .temperature(0.0)
                        .topP(0.0)
                        .truncation("truncation")
                        .user("user")
                        .build()
                )
                .build()

        val responseObjectStream = ResponseObjectStream.ofCreated(created)

        assertThat(responseObjectStream.created()).isEqualTo(created)
        assertThat(responseObjectStream.outputItemAdded()).isNull()
        assertThat(responseObjectStream.outputItemDone()).isNull()
        assertThat(responseObjectStream.outputTextDelta()).isNull()
        assertThat(responseObjectStream.outputTextDone()).isNull()
        assertThat(responseObjectStream.functionCallArgumentsDelta()).isNull()
        assertThat(responseObjectStream.functionCallArgumentsDone()).isNull()
        assertThat(responseObjectStream.webSearchCallInProgress()).isNull()
        assertThat(responseObjectStream.webSearchCallSearching()).isNull()
        assertThat(responseObjectStream.webSearchCallCompleted()).isNull()
        assertThat(responseObjectStream.mcpListToolsInProgress()).isNull()
        assertThat(responseObjectStream.mcpListToolsFailed()).isNull()
        assertThat(responseObjectStream.mcpListToolsCompleted()).isNull()
        assertThat(responseObjectStream.mcpCallArgumentsDelta()).isNull()
        assertThat(responseObjectStream.mcpCallArgumentsDone()).isNull()
        assertThat(responseObjectStream.mcpCallInProgress()).isNull()
        assertThat(responseObjectStream.mcpCallFailed()).isNull()
        assertThat(responseObjectStream.mcpCallCompleted()).isNull()
        assertThat(responseObjectStream.completed()).isNull()
    }

    @Test
    fun ofCreatedRoundtrip() {
        val jsonMapper = jsonMapper()
        val responseObjectStream =
            ResponseObjectStream.ofCreated(
                ResponseObjectStream.ResponseCreated.builder()
                    .response(
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
                                                    .putAdditionalProperty(
                                                        "foo",
                                                        JsonValue.from(true),
                                                    )
                                                    .build()
                                            )
                                            .strict(true)
                                            .build()
                                    )
                                    .build()
                            )
                            .error(
                                ResponseObject.Error.builder()
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
                    .build()
            )

        val roundtrippedResponseObjectStream =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(responseObjectStream),
                jacksonTypeRef<ResponseObjectStream>(),
            )

        assertThat(roundtrippedResponseObjectStream).isEqualTo(responseObjectStream)
    }

    @Test
    fun ofOutputItemAdded() {
        val outputItemAdded =
            ResponseObjectStream.ResponseOutputItemAdded.builder()
                .item(
                    ResponseObjectStream.ResponseOutputItemAdded.Item.Message.builder()
                        .content("string")
                        .role(ResponseObjectStream.ResponseOutputItemAdded.Item.Message.Role.SYSTEM)
                        .id("id")
                        .status("status")
                        .build()
                )
                .outputIndex(0L)
                .responseId("response_id")
                .sequenceNumber(0L)
                .build()

        val responseObjectStream = ResponseObjectStream.ofOutputItemAdded(outputItemAdded)

        assertThat(responseObjectStream.created()).isNull()
        assertThat(responseObjectStream.outputItemAdded()).isEqualTo(outputItemAdded)
        assertThat(responseObjectStream.outputItemDone()).isNull()
        assertThat(responseObjectStream.outputTextDelta()).isNull()
        assertThat(responseObjectStream.outputTextDone()).isNull()
        assertThat(responseObjectStream.functionCallArgumentsDelta()).isNull()
        assertThat(responseObjectStream.functionCallArgumentsDone()).isNull()
        assertThat(responseObjectStream.webSearchCallInProgress()).isNull()
        assertThat(responseObjectStream.webSearchCallSearching()).isNull()
        assertThat(responseObjectStream.webSearchCallCompleted()).isNull()
        assertThat(responseObjectStream.mcpListToolsInProgress()).isNull()
        assertThat(responseObjectStream.mcpListToolsFailed()).isNull()
        assertThat(responseObjectStream.mcpListToolsCompleted()).isNull()
        assertThat(responseObjectStream.mcpCallArgumentsDelta()).isNull()
        assertThat(responseObjectStream.mcpCallArgumentsDone()).isNull()
        assertThat(responseObjectStream.mcpCallInProgress()).isNull()
        assertThat(responseObjectStream.mcpCallFailed()).isNull()
        assertThat(responseObjectStream.mcpCallCompleted()).isNull()
        assertThat(responseObjectStream.completed()).isNull()
    }

    @Test
    fun ofOutputItemAddedRoundtrip() {
        val jsonMapper = jsonMapper()
        val responseObjectStream =
            ResponseObjectStream.ofOutputItemAdded(
                ResponseObjectStream.ResponseOutputItemAdded.builder()
                    .item(
                        ResponseObjectStream.ResponseOutputItemAdded.Item.Message.builder()
                            .content("string")
                            .role(
                                ResponseObjectStream.ResponseOutputItemAdded.Item.Message.Role
                                    .SYSTEM
                            )
                            .id("id")
                            .status("status")
                            .build()
                    )
                    .outputIndex(0L)
                    .responseId("response_id")
                    .sequenceNumber(0L)
                    .build()
            )

        val roundtrippedResponseObjectStream =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(responseObjectStream),
                jacksonTypeRef<ResponseObjectStream>(),
            )

        assertThat(roundtrippedResponseObjectStream).isEqualTo(responseObjectStream)
    }

    @Test
    fun ofOutputItemDone() {
        val outputItemDone =
            ResponseObjectStream.ResponseOutputItemDone.builder()
                .item(
                    ResponseObjectStream.ResponseOutputItemDone.Item.Message.builder()
                        .content("string")
                        .role(ResponseObjectStream.ResponseOutputItemDone.Item.Message.Role.SYSTEM)
                        .id("id")
                        .status("status")
                        .build()
                )
                .outputIndex(0L)
                .responseId("response_id")
                .sequenceNumber(0L)
                .build()

        val responseObjectStream = ResponseObjectStream.ofOutputItemDone(outputItemDone)

        assertThat(responseObjectStream.created()).isNull()
        assertThat(responseObjectStream.outputItemAdded()).isNull()
        assertThat(responseObjectStream.outputItemDone()).isEqualTo(outputItemDone)
        assertThat(responseObjectStream.outputTextDelta()).isNull()
        assertThat(responseObjectStream.outputTextDone()).isNull()
        assertThat(responseObjectStream.functionCallArgumentsDelta()).isNull()
        assertThat(responseObjectStream.functionCallArgumentsDone()).isNull()
        assertThat(responseObjectStream.webSearchCallInProgress()).isNull()
        assertThat(responseObjectStream.webSearchCallSearching()).isNull()
        assertThat(responseObjectStream.webSearchCallCompleted()).isNull()
        assertThat(responseObjectStream.mcpListToolsInProgress()).isNull()
        assertThat(responseObjectStream.mcpListToolsFailed()).isNull()
        assertThat(responseObjectStream.mcpListToolsCompleted()).isNull()
        assertThat(responseObjectStream.mcpCallArgumentsDelta()).isNull()
        assertThat(responseObjectStream.mcpCallArgumentsDone()).isNull()
        assertThat(responseObjectStream.mcpCallInProgress()).isNull()
        assertThat(responseObjectStream.mcpCallFailed()).isNull()
        assertThat(responseObjectStream.mcpCallCompleted()).isNull()
        assertThat(responseObjectStream.completed()).isNull()
    }

    @Test
    fun ofOutputItemDoneRoundtrip() {
        val jsonMapper = jsonMapper()
        val responseObjectStream =
            ResponseObjectStream.ofOutputItemDone(
                ResponseObjectStream.ResponseOutputItemDone.builder()
                    .item(
                        ResponseObjectStream.ResponseOutputItemDone.Item.Message.builder()
                            .content("string")
                            .role(
                                ResponseObjectStream.ResponseOutputItemDone.Item.Message.Role.SYSTEM
                            )
                            .id("id")
                            .status("status")
                            .build()
                    )
                    .outputIndex(0L)
                    .responseId("response_id")
                    .sequenceNumber(0L)
                    .build()
            )

        val roundtrippedResponseObjectStream =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(responseObjectStream),
                jacksonTypeRef<ResponseObjectStream>(),
            )

        assertThat(roundtrippedResponseObjectStream).isEqualTo(responseObjectStream)
    }

    @Test
    fun ofOutputTextDelta() {
        val outputTextDelta =
            ResponseObjectStream.ResponseOutputTextDelta.builder()
                .contentIndex(0L)
                .delta("delta")
                .itemId("item_id")
                .outputIndex(0L)
                .sequenceNumber(0L)
                .build()

        val responseObjectStream = ResponseObjectStream.ofOutputTextDelta(outputTextDelta)

        assertThat(responseObjectStream.created()).isNull()
        assertThat(responseObjectStream.outputItemAdded()).isNull()
        assertThat(responseObjectStream.outputItemDone()).isNull()
        assertThat(responseObjectStream.outputTextDelta()).isEqualTo(outputTextDelta)
        assertThat(responseObjectStream.outputTextDone()).isNull()
        assertThat(responseObjectStream.functionCallArgumentsDelta()).isNull()
        assertThat(responseObjectStream.functionCallArgumentsDone()).isNull()
        assertThat(responseObjectStream.webSearchCallInProgress()).isNull()
        assertThat(responseObjectStream.webSearchCallSearching()).isNull()
        assertThat(responseObjectStream.webSearchCallCompleted()).isNull()
        assertThat(responseObjectStream.mcpListToolsInProgress()).isNull()
        assertThat(responseObjectStream.mcpListToolsFailed()).isNull()
        assertThat(responseObjectStream.mcpListToolsCompleted()).isNull()
        assertThat(responseObjectStream.mcpCallArgumentsDelta()).isNull()
        assertThat(responseObjectStream.mcpCallArgumentsDone()).isNull()
        assertThat(responseObjectStream.mcpCallInProgress()).isNull()
        assertThat(responseObjectStream.mcpCallFailed()).isNull()
        assertThat(responseObjectStream.mcpCallCompleted()).isNull()
        assertThat(responseObjectStream.completed()).isNull()
    }

    @Test
    fun ofOutputTextDeltaRoundtrip() {
        val jsonMapper = jsonMapper()
        val responseObjectStream =
            ResponseObjectStream.ofOutputTextDelta(
                ResponseObjectStream.ResponseOutputTextDelta.builder()
                    .contentIndex(0L)
                    .delta("delta")
                    .itemId("item_id")
                    .outputIndex(0L)
                    .sequenceNumber(0L)
                    .build()
            )

        val roundtrippedResponseObjectStream =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(responseObjectStream),
                jacksonTypeRef<ResponseObjectStream>(),
            )

        assertThat(roundtrippedResponseObjectStream).isEqualTo(responseObjectStream)
    }

    @Test
    fun ofOutputTextDone() {
        val outputTextDone =
            ResponseObjectStream.ResponseOutputTextDone.builder()
                .contentIndex(0L)
                .itemId("item_id")
                .outputIndex(0L)
                .sequenceNumber(0L)
                .text("text")
                .build()

        val responseObjectStream = ResponseObjectStream.ofOutputTextDone(outputTextDone)

        assertThat(responseObjectStream.created()).isNull()
        assertThat(responseObjectStream.outputItemAdded()).isNull()
        assertThat(responseObjectStream.outputItemDone()).isNull()
        assertThat(responseObjectStream.outputTextDelta()).isNull()
        assertThat(responseObjectStream.outputTextDone()).isEqualTo(outputTextDone)
        assertThat(responseObjectStream.functionCallArgumentsDelta()).isNull()
        assertThat(responseObjectStream.functionCallArgumentsDone()).isNull()
        assertThat(responseObjectStream.webSearchCallInProgress()).isNull()
        assertThat(responseObjectStream.webSearchCallSearching()).isNull()
        assertThat(responseObjectStream.webSearchCallCompleted()).isNull()
        assertThat(responseObjectStream.mcpListToolsInProgress()).isNull()
        assertThat(responseObjectStream.mcpListToolsFailed()).isNull()
        assertThat(responseObjectStream.mcpListToolsCompleted()).isNull()
        assertThat(responseObjectStream.mcpCallArgumentsDelta()).isNull()
        assertThat(responseObjectStream.mcpCallArgumentsDone()).isNull()
        assertThat(responseObjectStream.mcpCallInProgress()).isNull()
        assertThat(responseObjectStream.mcpCallFailed()).isNull()
        assertThat(responseObjectStream.mcpCallCompleted()).isNull()
        assertThat(responseObjectStream.completed()).isNull()
    }

    @Test
    fun ofOutputTextDoneRoundtrip() {
        val jsonMapper = jsonMapper()
        val responseObjectStream =
            ResponseObjectStream.ofOutputTextDone(
                ResponseObjectStream.ResponseOutputTextDone.builder()
                    .contentIndex(0L)
                    .itemId("item_id")
                    .outputIndex(0L)
                    .sequenceNumber(0L)
                    .text("text")
                    .build()
            )

        val roundtrippedResponseObjectStream =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(responseObjectStream),
                jacksonTypeRef<ResponseObjectStream>(),
            )

        assertThat(roundtrippedResponseObjectStream).isEqualTo(responseObjectStream)
    }

    @Test
    fun ofFunctionCallArgumentsDelta() {
        val functionCallArgumentsDelta =
            ResponseObjectStream.ResponseFunctionCallArgumentsDelta.builder()
                .delta("delta")
                .itemId("item_id")
                .outputIndex(0L)
                .sequenceNumber(0L)
                .build()

        val responseObjectStream =
            ResponseObjectStream.ofFunctionCallArgumentsDelta(functionCallArgumentsDelta)

        assertThat(responseObjectStream.created()).isNull()
        assertThat(responseObjectStream.outputItemAdded()).isNull()
        assertThat(responseObjectStream.outputItemDone()).isNull()
        assertThat(responseObjectStream.outputTextDelta()).isNull()
        assertThat(responseObjectStream.outputTextDone()).isNull()
        assertThat(responseObjectStream.functionCallArgumentsDelta())
            .isEqualTo(functionCallArgumentsDelta)
        assertThat(responseObjectStream.functionCallArgumentsDone()).isNull()
        assertThat(responseObjectStream.webSearchCallInProgress()).isNull()
        assertThat(responseObjectStream.webSearchCallSearching()).isNull()
        assertThat(responseObjectStream.webSearchCallCompleted()).isNull()
        assertThat(responseObjectStream.mcpListToolsInProgress()).isNull()
        assertThat(responseObjectStream.mcpListToolsFailed()).isNull()
        assertThat(responseObjectStream.mcpListToolsCompleted()).isNull()
        assertThat(responseObjectStream.mcpCallArgumentsDelta()).isNull()
        assertThat(responseObjectStream.mcpCallArgumentsDone()).isNull()
        assertThat(responseObjectStream.mcpCallInProgress()).isNull()
        assertThat(responseObjectStream.mcpCallFailed()).isNull()
        assertThat(responseObjectStream.mcpCallCompleted()).isNull()
        assertThat(responseObjectStream.completed()).isNull()
    }

    @Test
    fun ofFunctionCallArgumentsDeltaRoundtrip() {
        val jsonMapper = jsonMapper()
        val responseObjectStream =
            ResponseObjectStream.ofFunctionCallArgumentsDelta(
                ResponseObjectStream.ResponseFunctionCallArgumentsDelta.builder()
                    .delta("delta")
                    .itemId("item_id")
                    .outputIndex(0L)
                    .sequenceNumber(0L)
                    .build()
            )

        val roundtrippedResponseObjectStream =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(responseObjectStream),
                jacksonTypeRef<ResponseObjectStream>(),
            )

        assertThat(roundtrippedResponseObjectStream).isEqualTo(responseObjectStream)
    }

    @Test
    fun ofFunctionCallArgumentsDone() {
        val functionCallArgumentsDone =
            ResponseObjectStream.ResponseFunctionCallArgumentsDone.builder()
                .arguments("arguments")
                .itemId("item_id")
                .outputIndex(0L)
                .sequenceNumber(0L)
                .build()

        val responseObjectStream =
            ResponseObjectStream.ofFunctionCallArgumentsDone(functionCallArgumentsDone)

        assertThat(responseObjectStream.created()).isNull()
        assertThat(responseObjectStream.outputItemAdded()).isNull()
        assertThat(responseObjectStream.outputItemDone()).isNull()
        assertThat(responseObjectStream.outputTextDelta()).isNull()
        assertThat(responseObjectStream.outputTextDone()).isNull()
        assertThat(responseObjectStream.functionCallArgumentsDelta()).isNull()
        assertThat(responseObjectStream.functionCallArgumentsDone())
            .isEqualTo(functionCallArgumentsDone)
        assertThat(responseObjectStream.webSearchCallInProgress()).isNull()
        assertThat(responseObjectStream.webSearchCallSearching()).isNull()
        assertThat(responseObjectStream.webSearchCallCompleted()).isNull()
        assertThat(responseObjectStream.mcpListToolsInProgress()).isNull()
        assertThat(responseObjectStream.mcpListToolsFailed()).isNull()
        assertThat(responseObjectStream.mcpListToolsCompleted()).isNull()
        assertThat(responseObjectStream.mcpCallArgumentsDelta()).isNull()
        assertThat(responseObjectStream.mcpCallArgumentsDone()).isNull()
        assertThat(responseObjectStream.mcpCallInProgress()).isNull()
        assertThat(responseObjectStream.mcpCallFailed()).isNull()
        assertThat(responseObjectStream.mcpCallCompleted()).isNull()
        assertThat(responseObjectStream.completed()).isNull()
    }

    @Test
    fun ofFunctionCallArgumentsDoneRoundtrip() {
        val jsonMapper = jsonMapper()
        val responseObjectStream =
            ResponseObjectStream.ofFunctionCallArgumentsDone(
                ResponseObjectStream.ResponseFunctionCallArgumentsDone.builder()
                    .arguments("arguments")
                    .itemId("item_id")
                    .outputIndex(0L)
                    .sequenceNumber(0L)
                    .build()
            )

        val roundtrippedResponseObjectStream =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(responseObjectStream),
                jacksonTypeRef<ResponseObjectStream>(),
            )

        assertThat(roundtrippedResponseObjectStream).isEqualTo(responseObjectStream)
    }

    @Test
    fun ofWebSearchCallInProgress() {
        val webSearchCallInProgress =
            ResponseObjectStream.ResponseWebSearchCallInProgress.builder()
                .itemId("item_id")
                .outputIndex(0L)
                .sequenceNumber(0L)
                .build()

        val responseObjectStream =
            ResponseObjectStream.ofWebSearchCallInProgress(webSearchCallInProgress)

        assertThat(responseObjectStream.created()).isNull()
        assertThat(responseObjectStream.outputItemAdded()).isNull()
        assertThat(responseObjectStream.outputItemDone()).isNull()
        assertThat(responseObjectStream.outputTextDelta()).isNull()
        assertThat(responseObjectStream.outputTextDone()).isNull()
        assertThat(responseObjectStream.functionCallArgumentsDelta()).isNull()
        assertThat(responseObjectStream.functionCallArgumentsDone()).isNull()
        assertThat(responseObjectStream.webSearchCallInProgress())
            .isEqualTo(webSearchCallInProgress)
        assertThat(responseObjectStream.webSearchCallSearching()).isNull()
        assertThat(responseObjectStream.webSearchCallCompleted()).isNull()
        assertThat(responseObjectStream.mcpListToolsInProgress()).isNull()
        assertThat(responseObjectStream.mcpListToolsFailed()).isNull()
        assertThat(responseObjectStream.mcpListToolsCompleted()).isNull()
        assertThat(responseObjectStream.mcpCallArgumentsDelta()).isNull()
        assertThat(responseObjectStream.mcpCallArgumentsDone()).isNull()
        assertThat(responseObjectStream.mcpCallInProgress()).isNull()
        assertThat(responseObjectStream.mcpCallFailed()).isNull()
        assertThat(responseObjectStream.mcpCallCompleted()).isNull()
        assertThat(responseObjectStream.completed()).isNull()
    }

    @Test
    fun ofWebSearchCallInProgressRoundtrip() {
        val jsonMapper = jsonMapper()
        val responseObjectStream =
            ResponseObjectStream.ofWebSearchCallInProgress(
                ResponseObjectStream.ResponseWebSearchCallInProgress.builder()
                    .itemId("item_id")
                    .outputIndex(0L)
                    .sequenceNumber(0L)
                    .build()
            )

        val roundtrippedResponseObjectStream =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(responseObjectStream),
                jacksonTypeRef<ResponseObjectStream>(),
            )

        assertThat(roundtrippedResponseObjectStream).isEqualTo(responseObjectStream)
    }

    @Test
    fun ofWebSearchCallSearching() {
        val webSearchCallSearching =
            ResponseObjectStream.ResponseWebSearchCallSearching.builder()
                .itemId("item_id")
                .outputIndex(0L)
                .sequenceNumber(0L)
                .build()

        val responseObjectStream =
            ResponseObjectStream.ofWebSearchCallSearching(webSearchCallSearching)

        assertThat(responseObjectStream.created()).isNull()
        assertThat(responseObjectStream.outputItemAdded()).isNull()
        assertThat(responseObjectStream.outputItemDone()).isNull()
        assertThat(responseObjectStream.outputTextDelta()).isNull()
        assertThat(responseObjectStream.outputTextDone()).isNull()
        assertThat(responseObjectStream.functionCallArgumentsDelta()).isNull()
        assertThat(responseObjectStream.functionCallArgumentsDone()).isNull()
        assertThat(responseObjectStream.webSearchCallInProgress()).isNull()
        assertThat(responseObjectStream.webSearchCallSearching()).isEqualTo(webSearchCallSearching)
        assertThat(responseObjectStream.webSearchCallCompleted()).isNull()
        assertThat(responseObjectStream.mcpListToolsInProgress()).isNull()
        assertThat(responseObjectStream.mcpListToolsFailed()).isNull()
        assertThat(responseObjectStream.mcpListToolsCompleted()).isNull()
        assertThat(responseObjectStream.mcpCallArgumentsDelta()).isNull()
        assertThat(responseObjectStream.mcpCallArgumentsDone()).isNull()
        assertThat(responseObjectStream.mcpCallInProgress()).isNull()
        assertThat(responseObjectStream.mcpCallFailed()).isNull()
        assertThat(responseObjectStream.mcpCallCompleted()).isNull()
        assertThat(responseObjectStream.completed()).isNull()
    }

    @Test
    fun ofWebSearchCallSearchingRoundtrip() {
        val jsonMapper = jsonMapper()
        val responseObjectStream =
            ResponseObjectStream.ofWebSearchCallSearching(
                ResponseObjectStream.ResponseWebSearchCallSearching.builder()
                    .itemId("item_id")
                    .outputIndex(0L)
                    .sequenceNumber(0L)
                    .build()
            )

        val roundtrippedResponseObjectStream =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(responseObjectStream),
                jacksonTypeRef<ResponseObjectStream>(),
            )

        assertThat(roundtrippedResponseObjectStream).isEqualTo(responseObjectStream)
    }

    @Test
    fun ofWebSearchCallCompleted() {
        val webSearchCallCompleted =
            ResponseObjectStream.ResponseWebSearchCallCompleted.builder()
                .itemId("item_id")
                .outputIndex(0L)
                .sequenceNumber(0L)
                .build()

        val responseObjectStream =
            ResponseObjectStream.ofWebSearchCallCompleted(webSearchCallCompleted)

        assertThat(responseObjectStream.created()).isNull()
        assertThat(responseObjectStream.outputItemAdded()).isNull()
        assertThat(responseObjectStream.outputItemDone()).isNull()
        assertThat(responseObjectStream.outputTextDelta()).isNull()
        assertThat(responseObjectStream.outputTextDone()).isNull()
        assertThat(responseObjectStream.functionCallArgumentsDelta()).isNull()
        assertThat(responseObjectStream.functionCallArgumentsDone()).isNull()
        assertThat(responseObjectStream.webSearchCallInProgress()).isNull()
        assertThat(responseObjectStream.webSearchCallSearching()).isNull()
        assertThat(responseObjectStream.webSearchCallCompleted()).isEqualTo(webSearchCallCompleted)
        assertThat(responseObjectStream.mcpListToolsInProgress()).isNull()
        assertThat(responseObjectStream.mcpListToolsFailed()).isNull()
        assertThat(responseObjectStream.mcpListToolsCompleted()).isNull()
        assertThat(responseObjectStream.mcpCallArgumentsDelta()).isNull()
        assertThat(responseObjectStream.mcpCallArgumentsDone()).isNull()
        assertThat(responseObjectStream.mcpCallInProgress()).isNull()
        assertThat(responseObjectStream.mcpCallFailed()).isNull()
        assertThat(responseObjectStream.mcpCallCompleted()).isNull()
        assertThat(responseObjectStream.completed()).isNull()
    }

    @Test
    fun ofWebSearchCallCompletedRoundtrip() {
        val jsonMapper = jsonMapper()
        val responseObjectStream =
            ResponseObjectStream.ofWebSearchCallCompleted(
                ResponseObjectStream.ResponseWebSearchCallCompleted.builder()
                    .itemId("item_id")
                    .outputIndex(0L)
                    .sequenceNumber(0L)
                    .build()
            )

        val roundtrippedResponseObjectStream =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(responseObjectStream),
                jacksonTypeRef<ResponseObjectStream>(),
            )

        assertThat(roundtrippedResponseObjectStream).isEqualTo(responseObjectStream)
    }

    @Test
    fun ofMcpListToolsInProgress() {
        val mcpListToolsInProgress =
            ResponseObjectStream.ResponseMcpListToolsInProgress.builder().sequenceNumber(0L).build()

        val responseObjectStream =
            ResponseObjectStream.ofMcpListToolsInProgress(mcpListToolsInProgress)

        assertThat(responseObjectStream.created()).isNull()
        assertThat(responseObjectStream.outputItemAdded()).isNull()
        assertThat(responseObjectStream.outputItemDone()).isNull()
        assertThat(responseObjectStream.outputTextDelta()).isNull()
        assertThat(responseObjectStream.outputTextDone()).isNull()
        assertThat(responseObjectStream.functionCallArgumentsDelta()).isNull()
        assertThat(responseObjectStream.functionCallArgumentsDone()).isNull()
        assertThat(responseObjectStream.webSearchCallInProgress()).isNull()
        assertThat(responseObjectStream.webSearchCallSearching()).isNull()
        assertThat(responseObjectStream.webSearchCallCompleted()).isNull()
        assertThat(responseObjectStream.mcpListToolsInProgress()).isEqualTo(mcpListToolsInProgress)
        assertThat(responseObjectStream.mcpListToolsFailed()).isNull()
        assertThat(responseObjectStream.mcpListToolsCompleted()).isNull()
        assertThat(responseObjectStream.mcpCallArgumentsDelta()).isNull()
        assertThat(responseObjectStream.mcpCallArgumentsDone()).isNull()
        assertThat(responseObjectStream.mcpCallInProgress()).isNull()
        assertThat(responseObjectStream.mcpCallFailed()).isNull()
        assertThat(responseObjectStream.mcpCallCompleted()).isNull()
        assertThat(responseObjectStream.completed()).isNull()
    }

    @Test
    fun ofMcpListToolsInProgressRoundtrip() {
        val jsonMapper = jsonMapper()
        val responseObjectStream =
            ResponseObjectStream.ofMcpListToolsInProgress(
                ResponseObjectStream.ResponseMcpListToolsInProgress.builder()
                    .sequenceNumber(0L)
                    .build()
            )

        val roundtrippedResponseObjectStream =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(responseObjectStream),
                jacksonTypeRef<ResponseObjectStream>(),
            )

        assertThat(roundtrippedResponseObjectStream).isEqualTo(responseObjectStream)
    }

    @Test
    fun ofMcpListToolsFailed() {
        val mcpListToolsFailed =
            ResponseObjectStream.ResponseMcpListToolsFailed.builder().sequenceNumber(0L).build()

        val responseObjectStream = ResponseObjectStream.ofMcpListToolsFailed(mcpListToolsFailed)

        assertThat(responseObjectStream.created()).isNull()
        assertThat(responseObjectStream.outputItemAdded()).isNull()
        assertThat(responseObjectStream.outputItemDone()).isNull()
        assertThat(responseObjectStream.outputTextDelta()).isNull()
        assertThat(responseObjectStream.outputTextDone()).isNull()
        assertThat(responseObjectStream.functionCallArgumentsDelta()).isNull()
        assertThat(responseObjectStream.functionCallArgumentsDone()).isNull()
        assertThat(responseObjectStream.webSearchCallInProgress()).isNull()
        assertThat(responseObjectStream.webSearchCallSearching()).isNull()
        assertThat(responseObjectStream.webSearchCallCompleted()).isNull()
        assertThat(responseObjectStream.mcpListToolsInProgress()).isNull()
        assertThat(responseObjectStream.mcpListToolsFailed()).isEqualTo(mcpListToolsFailed)
        assertThat(responseObjectStream.mcpListToolsCompleted()).isNull()
        assertThat(responseObjectStream.mcpCallArgumentsDelta()).isNull()
        assertThat(responseObjectStream.mcpCallArgumentsDone()).isNull()
        assertThat(responseObjectStream.mcpCallInProgress()).isNull()
        assertThat(responseObjectStream.mcpCallFailed()).isNull()
        assertThat(responseObjectStream.mcpCallCompleted()).isNull()
        assertThat(responseObjectStream.completed()).isNull()
    }

    @Test
    fun ofMcpListToolsFailedRoundtrip() {
        val jsonMapper = jsonMapper()
        val responseObjectStream =
            ResponseObjectStream.ofMcpListToolsFailed(
                ResponseObjectStream.ResponseMcpListToolsFailed.builder().sequenceNumber(0L).build()
            )

        val roundtrippedResponseObjectStream =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(responseObjectStream),
                jacksonTypeRef<ResponseObjectStream>(),
            )

        assertThat(roundtrippedResponseObjectStream).isEqualTo(responseObjectStream)
    }

    @Test
    fun ofMcpListToolsCompleted() {
        val mcpListToolsCompleted =
            ResponseObjectStream.ResponseMcpListToolsCompleted.builder().sequenceNumber(0L).build()

        val responseObjectStream =
            ResponseObjectStream.ofMcpListToolsCompleted(mcpListToolsCompleted)

        assertThat(responseObjectStream.created()).isNull()
        assertThat(responseObjectStream.outputItemAdded()).isNull()
        assertThat(responseObjectStream.outputItemDone()).isNull()
        assertThat(responseObjectStream.outputTextDelta()).isNull()
        assertThat(responseObjectStream.outputTextDone()).isNull()
        assertThat(responseObjectStream.functionCallArgumentsDelta()).isNull()
        assertThat(responseObjectStream.functionCallArgumentsDone()).isNull()
        assertThat(responseObjectStream.webSearchCallInProgress()).isNull()
        assertThat(responseObjectStream.webSearchCallSearching()).isNull()
        assertThat(responseObjectStream.webSearchCallCompleted()).isNull()
        assertThat(responseObjectStream.mcpListToolsInProgress()).isNull()
        assertThat(responseObjectStream.mcpListToolsFailed()).isNull()
        assertThat(responseObjectStream.mcpListToolsCompleted()).isEqualTo(mcpListToolsCompleted)
        assertThat(responseObjectStream.mcpCallArgumentsDelta()).isNull()
        assertThat(responseObjectStream.mcpCallArgumentsDone()).isNull()
        assertThat(responseObjectStream.mcpCallInProgress()).isNull()
        assertThat(responseObjectStream.mcpCallFailed()).isNull()
        assertThat(responseObjectStream.mcpCallCompleted()).isNull()
        assertThat(responseObjectStream.completed()).isNull()
    }

    @Test
    fun ofMcpListToolsCompletedRoundtrip() {
        val jsonMapper = jsonMapper()
        val responseObjectStream =
            ResponseObjectStream.ofMcpListToolsCompleted(
                ResponseObjectStream.ResponseMcpListToolsCompleted.builder()
                    .sequenceNumber(0L)
                    .build()
            )

        val roundtrippedResponseObjectStream =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(responseObjectStream),
                jacksonTypeRef<ResponseObjectStream>(),
            )

        assertThat(roundtrippedResponseObjectStream).isEqualTo(responseObjectStream)
    }

    @Test
    fun ofMcpCallArgumentsDelta() {
        val mcpCallArgumentsDelta =
            ResponseObjectStream.ResponseMcpCallArgumentsDelta.builder()
                .delta("delta")
                .itemId("item_id")
                .outputIndex(0L)
                .sequenceNumber(0L)
                .build()

        val responseObjectStream =
            ResponseObjectStream.ofMcpCallArgumentsDelta(mcpCallArgumentsDelta)

        assertThat(responseObjectStream.created()).isNull()
        assertThat(responseObjectStream.outputItemAdded()).isNull()
        assertThat(responseObjectStream.outputItemDone()).isNull()
        assertThat(responseObjectStream.outputTextDelta()).isNull()
        assertThat(responseObjectStream.outputTextDone()).isNull()
        assertThat(responseObjectStream.functionCallArgumentsDelta()).isNull()
        assertThat(responseObjectStream.functionCallArgumentsDone()).isNull()
        assertThat(responseObjectStream.webSearchCallInProgress()).isNull()
        assertThat(responseObjectStream.webSearchCallSearching()).isNull()
        assertThat(responseObjectStream.webSearchCallCompleted()).isNull()
        assertThat(responseObjectStream.mcpListToolsInProgress()).isNull()
        assertThat(responseObjectStream.mcpListToolsFailed()).isNull()
        assertThat(responseObjectStream.mcpListToolsCompleted()).isNull()
        assertThat(responseObjectStream.mcpCallArgumentsDelta()).isEqualTo(mcpCallArgumentsDelta)
        assertThat(responseObjectStream.mcpCallArgumentsDone()).isNull()
        assertThat(responseObjectStream.mcpCallInProgress()).isNull()
        assertThat(responseObjectStream.mcpCallFailed()).isNull()
        assertThat(responseObjectStream.mcpCallCompleted()).isNull()
        assertThat(responseObjectStream.completed()).isNull()
    }

    @Test
    fun ofMcpCallArgumentsDeltaRoundtrip() {
        val jsonMapper = jsonMapper()
        val responseObjectStream =
            ResponseObjectStream.ofMcpCallArgumentsDelta(
                ResponseObjectStream.ResponseMcpCallArgumentsDelta.builder()
                    .delta("delta")
                    .itemId("item_id")
                    .outputIndex(0L)
                    .sequenceNumber(0L)
                    .build()
            )

        val roundtrippedResponseObjectStream =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(responseObjectStream),
                jacksonTypeRef<ResponseObjectStream>(),
            )

        assertThat(roundtrippedResponseObjectStream).isEqualTo(responseObjectStream)
    }

    @Test
    fun ofMcpCallArgumentsDone() {
        val mcpCallArgumentsDone =
            ResponseObjectStream.ResponseMcpCallArgumentsDone.builder()
                .arguments("arguments")
                .itemId("item_id")
                .outputIndex(0L)
                .sequenceNumber(0L)
                .build()

        val responseObjectStream = ResponseObjectStream.ofMcpCallArgumentsDone(mcpCallArgumentsDone)

        assertThat(responseObjectStream.created()).isNull()
        assertThat(responseObjectStream.outputItemAdded()).isNull()
        assertThat(responseObjectStream.outputItemDone()).isNull()
        assertThat(responseObjectStream.outputTextDelta()).isNull()
        assertThat(responseObjectStream.outputTextDone()).isNull()
        assertThat(responseObjectStream.functionCallArgumentsDelta()).isNull()
        assertThat(responseObjectStream.functionCallArgumentsDone()).isNull()
        assertThat(responseObjectStream.webSearchCallInProgress()).isNull()
        assertThat(responseObjectStream.webSearchCallSearching()).isNull()
        assertThat(responseObjectStream.webSearchCallCompleted()).isNull()
        assertThat(responseObjectStream.mcpListToolsInProgress()).isNull()
        assertThat(responseObjectStream.mcpListToolsFailed()).isNull()
        assertThat(responseObjectStream.mcpListToolsCompleted()).isNull()
        assertThat(responseObjectStream.mcpCallArgumentsDelta()).isNull()
        assertThat(responseObjectStream.mcpCallArgumentsDone()).isEqualTo(mcpCallArgumentsDone)
        assertThat(responseObjectStream.mcpCallInProgress()).isNull()
        assertThat(responseObjectStream.mcpCallFailed()).isNull()
        assertThat(responseObjectStream.mcpCallCompleted()).isNull()
        assertThat(responseObjectStream.completed()).isNull()
    }

    @Test
    fun ofMcpCallArgumentsDoneRoundtrip() {
        val jsonMapper = jsonMapper()
        val responseObjectStream =
            ResponseObjectStream.ofMcpCallArgumentsDone(
                ResponseObjectStream.ResponseMcpCallArgumentsDone.builder()
                    .arguments("arguments")
                    .itemId("item_id")
                    .outputIndex(0L)
                    .sequenceNumber(0L)
                    .build()
            )

        val roundtrippedResponseObjectStream =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(responseObjectStream),
                jacksonTypeRef<ResponseObjectStream>(),
            )

        assertThat(roundtrippedResponseObjectStream).isEqualTo(responseObjectStream)
    }

    @Test
    fun ofMcpCallInProgress() {
        val mcpCallInProgress =
            ResponseObjectStream.ResponseMcpCallInProgress.builder()
                .itemId("item_id")
                .outputIndex(0L)
                .sequenceNumber(0L)
                .build()

        val responseObjectStream = ResponseObjectStream.ofMcpCallInProgress(mcpCallInProgress)

        assertThat(responseObjectStream.created()).isNull()
        assertThat(responseObjectStream.outputItemAdded()).isNull()
        assertThat(responseObjectStream.outputItemDone()).isNull()
        assertThat(responseObjectStream.outputTextDelta()).isNull()
        assertThat(responseObjectStream.outputTextDone()).isNull()
        assertThat(responseObjectStream.functionCallArgumentsDelta()).isNull()
        assertThat(responseObjectStream.functionCallArgumentsDone()).isNull()
        assertThat(responseObjectStream.webSearchCallInProgress()).isNull()
        assertThat(responseObjectStream.webSearchCallSearching()).isNull()
        assertThat(responseObjectStream.webSearchCallCompleted()).isNull()
        assertThat(responseObjectStream.mcpListToolsInProgress()).isNull()
        assertThat(responseObjectStream.mcpListToolsFailed()).isNull()
        assertThat(responseObjectStream.mcpListToolsCompleted()).isNull()
        assertThat(responseObjectStream.mcpCallArgumentsDelta()).isNull()
        assertThat(responseObjectStream.mcpCallArgumentsDone()).isNull()
        assertThat(responseObjectStream.mcpCallInProgress()).isEqualTo(mcpCallInProgress)
        assertThat(responseObjectStream.mcpCallFailed()).isNull()
        assertThat(responseObjectStream.mcpCallCompleted()).isNull()
        assertThat(responseObjectStream.completed()).isNull()
    }

    @Test
    fun ofMcpCallInProgressRoundtrip() {
        val jsonMapper = jsonMapper()
        val responseObjectStream =
            ResponseObjectStream.ofMcpCallInProgress(
                ResponseObjectStream.ResponseMcpCallInProgress.builder()
                    .itemId("item_id")
                    .outputIndex(0L)
                    .sequenceNumber(0L)
                    .build()
            )

        val roundtrippedResponseObjectStream =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(responseObjectStream),
                jacksonTypeRef<ResponseObjectStream>(),
            )

        assertThat(roundtrippedResponseObjectStream).isEqualTo(responseObjectStream)
    }

    @Test
    fun ofMcpCallFailed() {
        val mcpCallFailed =
            ResponseObjectStream.ResponseMcpCallFailed.builder().sequenceNumber(0L).build()

        val responseObjectStream = ResponseObjectStream.ofMcpCallFailed(mcpCallFailed)

        assertThat(responseObjectStream.created()).isNull()
        assertThat(responseObjectStream.outputItemAdded()).isNull()
        assertThat(responseObjectStream.outputItemDone()).isNull()
        assertThat(responseObjectStream.outputTextDelta()).isNull()
        assertThat(responseObjectStream.outputTextDone()).isNull()
        assertThat(responseObjectStream.functionCallArgumentsDelta()).isNull()
        assertThat(responseObjectStream.functionCallArgumentsDone()).isNull()
        assertThat(responseObjectStream.webSearchCallInProgress()).isNull()
        assertThat(responseObjectStream.webSearchCallSearching()).isNull()
        assertThat(responseObjectStream.webSearchCallCompleted()).isNull()
        assertThat(responseObjectStream.mcpListToolsInProgress()).isNull()
        assertThat(responseObjectStream.mcpListToolsFailed()).isNull()
        assertThat(responseObjectStream.mcpListToolsCompleted()).isNull()
        assertThat(responseObjectStream.mcpCallArgumentsDelta()).isNull()
        assertThat(responseObjectStream.mcpCallArgumentsDone()).isNull()
        assertThat(responseObjectStream.mcpCallInProgress()).isNull()
        assertThat(responseObjectStream.mcpCallFailed()).isEqualTo(mcpCallFailed)
        assertThat(responseObjectStream.mcpCallCompleted()).isNull()
        assertThat(responseObjectStream.completed()).isNull()
    }

    @Test
    fun ofMcpCallFailedRoundtrip() {
        val jsonMapper = jsonMapper()
        val responseObjectStream =
            ResponseObjectStream.ofMcpCallFailed(
                ResponseObjectStream.ResponseMcpCallFailed.builder().sequenceNumber(0L).build()
            )

        val roundtrippedResponseObjectStream =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(responseObjectStream),
                jacksonTypeRef<ResponseObjectStream>(),
            )

        assertThat(roundtrippedResponseObjectStream).isEqualTo(responseObjectStream)
    }

    @Test
    fun ofMcpCallCompleted() {
        val mcpCallCompleted =
            ResponseObjectStream.ResponseMcpCallCompleted.builder().sequenceNumber(0L).build()

        val responseObjectStream = ResponseObjectStream.ofMcpCallCompleted(mcpCallCompleted)

        assertThat(responseObjectStream.created()).isNull()
        assertThat(responseObjectStream.outputItemAdded()).isNull()
        assertThat(responseObjectStream.outputItemDone()).isNull()
        assertThat(responseObjectStream.outputTextDelta()).isNull()
        assertThat(responseObjectStream.outputTextDone()).isNull()
        assertThat(responseObjectStream.functionCallArgumentsDelta()).isNull()
        assertThat(responseObjectStream.functionCallArgumentsDone()).isNull()
        assertThat(responseObjectStream.webSearchCallInProgress()).isNull()
        assertThat(responseObjectStream.webSearchCallSearching()).isNull()
        assertThat(responseObjectStream.webSearchCallCompleted()).isNull()
        assertThat(responseObjectStream.mcpListToolsInProgress()).isNull()
        assertThat(responseObjectStream.mcpListToolsFailed()).isNull()
        assertThat(responseObjectStream.mcpListToolsCompleted()).isNull()
        assertThat(responseObjectStream.mcpCallArgumentsDelta()).isNull()
        assertThat(responseObjectStream.mcpCallArgumentsDone()).isNull()
        assertThat(responseObjectStream.mcpCallInProgress()).isNull()
        assertThat(responseObjectStream.mcpCallFailed()).isNull()
        assertThat(responseObjectStream.mcpCallCompleted()).isEqualTo(mcpCallCompleted)
        assertThat(responseObjectStream.completed()).isNull()
    }

    @Test
    fun ofMcpCallCompletedRoundtrip() {
        val jsonMapper = jsonMapper()
        val responseObjectStream =
            ResponseObjectStream.ofMcpCallCompleted(
                ResponseObjectStream.ResponseMcpCallCompleted.builder().sequenceNumber(0L).build()
            )

        val roundtrippedResponseObjectStream =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(responseObjectStream),
                jacksonTypeRef<ResponseObjectStream>(),
            )

        assertThat(roundtrippedResponseObjectStream).isEqualTo(responseObjectStream)
    }

    @Test
    fun ofCompleted() {
        val completed =
            ResponseObjectStream.ResponseCompleted.builder()
                .response(
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
                        .error(
                            ResponseObject.Error.builder().code("code").message("message").build()
                        )
                        .previousResponseId("previous_response_id")
                        .temperature(0.0)
                        .topP(0.0)
                        .truncation("truncation")
                        .user("user")
                        .build()
                )
                .build()

        val responseObjectStream = ResponseObjectStream.ofCompleted(completed)

        assertThat(responseObjectStream.created()).isNull()
        assertThat(responseObjectStream.outputItemAdded()).isNull()
        assertThat(responseObjectStream.outputItemDone()).isNull()
        assertThat(responseObjectStream.outputTextDelta()).isNull()
        assertThat(responseObjectStream.outputTextDone()).isNull()
        assertThat(responseObjectStream.functionCallArgumentsDelta()).isNull()
        assertThat(responseObjectStream.functionCallArgumentsDone()).isNull()
        assertThat(responseObjectStream.webSearchCallInProgress()).isNull()
        assertThat(responseObjectStream.webSearchCallSearching()).isNull()
        assertThat(responseObjectStream.webSearchCallCompleted()).isNull()
        assertThat(responseObjectStream.mcpListToolsInProgress()).isNull()
        assertThat(responseObjectStream.mcpListToolsFailed()).isNull()
        assertThat(responseObjectStream.mcpListToolsCompleted()).isNull()
        assertThat(responseObjectStream.mcpCallArgumentsDelta()).isNull()
        assertThat(responseObjectStream.mcpCallArgumentsDone()).isNull()
        assertThat(responseObjectStream.mcpCallInProgress()).isNull()
        assertThat(responseObjectStream.mcpCallFailed()).isNull()
        assertThat(responseObjectStream.mcpCallCompleted()).isNull()
        assertThat(responseObjectStream.completed()).isEqualTo(completed)
    }

    @Test
    fun ofCompletedRoundtrip() {
        val jsonMapper = jsonMapper()
        val responseObjectStream =
            ResponseObjectStream.ofCompleted(
                ResponseObjectStream.ResponseCompleted.builder()
                    .response(
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
                                                    .putAdditionalProperty(
                                                        "foo",
                                                        JsonValue.from(true),
                                                    )
                                                    .build()
                                            )
                                            .strict(true)
                                            .build()
                                    )
                                    .build()
                            )
                            .error(
                                ResponseObject.Error.builder()
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
                    .build()
            )

        val roundtrippedResponseObjectStream =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(responseObjectStream),
                jacksonTypeRef<ResponseObjectStream>(),
            )

        assertThat(roundtrippedResponseObjectStream).isEqualTo(responseObjectStream)
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
        val responseObjectStream =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<ResponseObjectStream>())

        val e =
            assertThrows<LlamaStackClientInvalidDataException> { responseObjectStream.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
