package com.llama.llamastack.client.local.util

import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.CompletionMessage
import com.llama.llamastack.models.ContentDelta
import com.llama.llamastack.models.InferenceChatCompletionResponse
import com.llama.llamastack.models.InterleavedContent
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
            CompletionMessage.builder()
                .toolCalls(createCustomToolCalls(response))
                .content(InterleavedContent.ofString(""))
                //                .role(CompletionMessage.Role.ASSISTANT)
                .stopReason(mapStopTokenToReason(stopToken))
                .build()
        } else {
            CompletionMessage.builder()
                .toolCalls(listOf())
                .content(InterleavedContent.ofString(response))
                //                .role(CompletionMessage.Role.ASSISTANT)
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

fun buildInferenceChatCompletionResponseFromStream(
    response: String,
): InferenceChatCompletionResponse {
    return InferenceChatCompletionResponse.ofChatCompletionResponseStreamChunk(
        InferenceChatCompletionResponse.ChatCompletionResponseStreamChunk.builder()
            .event(
                InferenceChatCompletionResponse.ChatCompletionResponseStreamChunk.Event.builder()
                    .delta(ContentDelta.TextDelta.builder().text(response).build())
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

fun buildLastInferenceChatCompletionResponsesFromStream(
    resultMessage: String,
    stats: Float,
    stopToken: String,
): List<InferenceChatCompletionResponse> {
    val listOfResponses: MutableList<InferenceChatCompletionResponse> = mutableListOf()
    if (isResponseAToolCall(resultMessage)) {
        val toolCalls = createCustomToolCalls(resultMessage)
        for (toolCall in toolCalls) {
            listOfResponses.add(
                buildInferenceChatCompletionResponseForCustomToolCallStream(
                    toolCall,
                    stopToken,
                    stats
                )
            )
        }
    } else {
        buildInferenceChatCompletionResponseForStringStream("", stopToken, stats)
    }
    return listOfResponses.toList()
}

fun buildInferenceChatCompletionResponseForCustomToolCallStream(
    toolCall: CompletionMessage.ToolCall,
    stopToken: String,
    stats: Float
): InferenceChatCompletionResponse {
    // Convert ToolCall to ToolCallDelta
    val delta = ContentDelta.ToolCallDelta.builder().toolCall(toolCall.toString()).build()
    return InferenceChatCompletionResponse.ofChatCompletionResponseStreamChunk(
        InferenceChatCompletionResponse.ChatCompletionResponseStreamChunk.builder()
            .event(
                InferenceChatCompletionResponse.ChatCompletionResponseStreamChunk.Event.builder()
                    .delta(delta)
                    .stopReason(mapStopTokenToReasonForStream(stopToken))
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

fun buildInferenceChatCompletionResponseForStringStream(
    str: String,
    stopToken: String,
    stats: Float
): InferenceChatCompletionResponse {

    return InferenceChatCompletionResponse.ofChatCompletionResponseStreamChunk(
        InferenceChatCompletionResponse.ChatCompletionResponseStreamChunk.builder()
            .event(
                InferenceChatCompletionResponse.ChatCompletionResponseStreamChunk.Event.builder()
                    .delta(ContentDelta.TextDelta.builder().text(str).build())
                    .stopReason(mapStopTokenToReasonForStream(stopToken))
                    .eventType(
                        InferenceChatCompletionResponse.ChatCompletionResponseStreamChunk.Event
                            .EventType
                            .PROGRESS
                    )
                    .putAdditionalProperty("tps", JsonValue.from(stats))
                    .build()
            )
            .build()
    )
}

fun isResponseAToolCall(response: String): Boolean {
    return response.startsWith("[") && response.endsWith("]")
}

fun createCustomToolCalls(response: String): List<CompletionMessage.ToolCall> {
    val toolCalls: MutableList<CompletionMessage.ToolCall> = mutableListOf()

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
            CompletionMessage.ToolCall.builder()
                .toolName(CompletionMessage.ToolCall.ToolName.of(toolName))
                .arguments(
                    CompletionMessage.ToolCall.Arguments.builder()
                        .additionalProperties(paramsJson)
                        .build()
                )
                .callId(UUID.randomUUID().toString())
                .build()
        )
    }

    return toolCalls.toList()
}

fun mapStopTokenToReason(stopToken: String): CompletionMessage.StopReason =
    when (stopToken) {
        "<|eot_id|>" -> CompletionMessage.StopReason.END_OF_TURN
        "<|eom_id|>" -> CompletionMessage.StopReason.END_OF_MESSAGE
        else -> CompletionMessage.StopReason.OUT_OF_TOKENS
    }

fun mapStopTokenToReasonForStream(
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
