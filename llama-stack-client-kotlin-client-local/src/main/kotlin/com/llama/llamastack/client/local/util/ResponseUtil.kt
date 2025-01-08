package com.llama.llamastack.client.local.util

import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.models.CompletionMessage
import com.llama.llamastack.models.InferenceChatCompletionResponse
import com.llama.llamastack.models.InterleavedContent
import com.llama.llamastack.models.ToolCall
import java.util.UUID

fun buildInferenceChatCompletionResponse(
    response: String,
    stats: Float
): InferenceChatCompletionResponse {
    // check for prefix [ and suffix ] if so then tool call.
    // parse for "toolName", "additionalProperties"

    var completionMessage =
        if (response.startsWith("[") && response.endsWith("]")) {
            // custom tool call
            CompletionMessage.builder()
                .toolCalls(createCustomToolCalls(response))
                .content(InterleavedContent.ofString(""))
                .build()
        } else {
            CompletionMessage.builder().content(InterleavedContent.ofString(response)).build()
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
