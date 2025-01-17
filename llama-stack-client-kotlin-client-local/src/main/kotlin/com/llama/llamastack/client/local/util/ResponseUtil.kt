package com.llama.llamastack.client.local.util

import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.InferenceChatCompletionResponse
import com.llama.llamastack.models.InterleavedContent
import com.llama.llamastack.models.ToolCall
import java.util.UUID

fun buildInferenceChatCompletionResponse(
    response: String,
    stats: Float,
    stopToken: String
): InferenceChatCompletionResponse {
    // check for prefix [ and suffix ] if so then tool call.
    // parse for "toolName", "additionalProperties"
    var completionMessage =
        if (isResponseAToolCall(response)) {
            // custom tool call
            InferenceChatCompletionResponse.ChatCompletionResponse.CompletionMessage.builder()
                .toolCalls(createCustomToolCalls(response))
                .content(InterleavedContent.ofString(""))
                .role(
                    InferenceChatCompletionResponse.ChatCompletionResponse.CompletionMessage.Role
                        .ASSISTANT
                )
                .stopReason(mapStopTokenToReason(stopToken))
                .build()
        } else {
            InferenceChatCompletionResponse.ChatCompletionResponse.CompletionMessage.builder()
                .toolCalls(listOf())
                .content(InterleavedContent.ofString(response))
                .role(
                    InferenceChatCompletionResponse.ChatCompletionResponse.CompletionMessage.Role
                        .ASSISTANT
                )
                .stopReason(mapStopTokenToReason(stopToken))
                .build()
        }

    var inferenceChatCompletionResponse =
        InferenceChatCompletionResponse.ofChatCompletionResponse(
            InferenceChatCompletionResponse.ChatCompletionResponse.builder()
                .completionMessage(completionMessage)
                .putAdditionalProperty("tps", JsonValue.from(stats))
                .build()
        )
    return inferenceChatCompletionResponse
}

fun buildInferenceChatCompletionResponseFromStreaming(
    response: String,
): InferenceChatCompletionResponse {
    return InferenceChatCompletionResponse.ofChatCompletionResponseStreamChunk(
        InferenceChatCompletionResponse.ChatCompletionResponseStreamChunk.builder()
            .event(
                InferenceChatCompletionResponse.ChatCompletionResponseStreamChunk.Event.builder()
                    .delta(
                        InferenceChatCompletionResponse.ChatCompletionResponseStreamChunk.Event
                            .Delta
                            .ofString(response)
                    )
                    .eventType(
                        InferenceChatCompletionResponse.ChatCompletionResponseStreamChunk.Event
                            .EventType
                            .PROGRESS
                    )
                    .build()
            )
            .build()
    )
}

fun buildLastInferenceChatCompletionResponseFromStreaming(
    resultMessage: String,
    stats: Float,
    stopToken: String,
): InferenceChatCompletionResponse {
    val delta =
        if (isResponseAToolCall(resultMessage)) {
            // tool call setup
            InferenceChatCompletionResponse.ChatCompletionResponseStreamChunk.Event.Delta
                .ofToolCallDelta(
                    InferenceChatCompletionResponse.ChatCompletionResponseStreamChunk.Event.Delta
                        .ToolCallDelta
                        .builder()
                        .content(createCustomToolCalls(resultMessage)[0])
                        .parseStatus(
                            InferenceChatCompletionResponse.ChatCompletionResponseStreamChunk.Event
                                .Delta
                                .ToolCallDelta
                                .ParseStatus
                                .SUCCESS
                        )
                        .build()
                )
        } else {
            InferenceChatCompletionResponse.ChatCompletionResponseStreamChunk.Event.Delta.ofString(
                ""
            )
        }

    return InferenceChatCompletionResponse.ofChatCompletionResponseStreamChunk(
        InferenceChatCompletionResponse.ChatCompletionResponseStreamChunk.builder()
            .event(
                InferenceChatCompletionResponse.ChatCompletionResponseStreamChunk.Event.builder()
                    .delta(delta)
                    .stopReason(mapStopTokenToReasonForStreaming(stopToken))
                    .eventType(
                        InferenceChatCompletionResponse.ChatCompletionResponseStreamChunk.Event
                            .EventType
                            .PROGRESS
                    )
                    .build()
            )
            .putAdditionalProperty("tps", JsonValue.from(stats))
            .build()
    )
}

fun isResponseAToolCall(response: String): Boolean {
    return response.startsWith("[") && response.endsWith("]")
}

fun createCustomToolCalls(response: String): List<ToolCall> {
    val toolCalls: MutableList<ToolCall> = mutableListOf()

    val splitsResponse = response.split("),")
    for (split in splitsResponse) {
        val formattedSplit = if (split.endsWith(')')) split else "$split)"
        val startIndex = formattedSplit.indexOf('(')
        val endIndex = formattedSplit.indexOf(')')
        val toolName = formattedSplit.substring(1, startIndex)
        val paramsString = formattedSplit.substring(startIndex + 1, endIndex)

        val paramsJson = mutableMapOf<String, JsonValue>()
        val paramsList = paramsString.split(", ")
        for (param in paramsList) {
            val keyValue = param.split("=")
            if (keyValue.size == 2) {
                val key = keyValue[0].trim()
                val value = keyValue[1].trim().replace("'", "").replace("\"", "")
                paramsJson[key] = JsonValue.from(value)
            }
        }
        toolCalls.add(
            ToolCall.builder()
                .toolName(ToolCall.ToolName.of(toolName))
                .arguments(ToolCall.Arguments.builder().additionalProperties(paramsJson).build())
                .callId(UUID.randomUUID().toString())
                .build()
        )
    }

    return toolCalls.toList()
}

fun mapStopTokenToReason(
    stopToken: String
): InferenceChatCompletionResponse.ChatCompletionResponse.CompletionMessage.StopReason =
    when (stopToken) {
        "<|eot_id|>" ->
            InferenceChatCompletionResponse.ChatCompletionResponse.CompletionMessage.StopReason
                .END_OF_TURN
        "<|eom_id|>" ->
            InferenceChatCompletionResponse.ChatCompletionResponse.CompletionMessage.StopReason
                .END_OF_MESSAGE
        else ->
            InferenceChatCompletionResponse.ChatCompletionResponse.CompletionMessage.StopReason
                .OUT_OF_TOKENS
    }

fun mapStopTokenToReasonForStreaming(
    stopToken: String
): InferenceChatCompletionResponse.ChatCompletionResponseStreamChunk.Event.StopReason =
    when (stopToken) {
        "<|eot_id|>" ->
            InferenceChatCompletionResponse.ChatCompletionResponseStreamChunk.Event.StopReason
                .END_OF_TURN
        "<|eom_id|>" ->
            InferenceChatCompletionResponse.ChatCompletionResponseStreamChunk.Event.StopReason
                .END_OF_MESSAGE
        else ->
            InferenceChatCompletionResponse.ChatCompletionResponseStreamChunk.Event.StopReason
                .OUT_OF_TOKENS
    }
