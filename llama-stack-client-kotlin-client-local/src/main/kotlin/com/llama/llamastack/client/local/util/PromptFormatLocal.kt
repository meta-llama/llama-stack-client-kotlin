package com.llama.llamastack.client.local.util

import com.llama.llamastack.models.CompletionMessage
import com.llama.llamastack.models.InferenceChatCompletionParams
import com.llama.llamastack.models.SystemMessage
import com.llama.llamastack.models.UserMessage

object PromptFormatLocal {
    private const val SYSTEM_PLACEHOLDER: String = "{{ system_prompt }}"
    private const val USER_PLACEHOLDER: String = "{{ user_prompt }}"
    private const val ASSISTANT_PLACEHOLDER: String = "{{ assistant_response }}"

    private fun getSystemPromptTemplate(modelName: String?): String {
        return when (modelName) {
            "LLAMA_3",
            "LLAMA_3_1",
            "LLAMA_3_2" ->
                "<|begin_of_text|><|start_header_id|>system<|end_header_id|>\n$SYSTEM_PLACEHOLDER<|eot_id|>"
            else -> SYSTEM_PLACEHOLDER
        }
    }

    private fun getUserPromptTemplate(modelName: String?): String {
        return when (modelName) {
            "LLAMA_3",
            "LLAMA_3_1",
            "LLAMA_3_2",
            "LLAMA_GUARD_3" ->
                "<|start_header_id|>user<|end_header_id|>$USER_PLACEHOLDER<|eot_id|><|start_header_id|>assistant<|end_header_id|>"
            else -> USER_PLACEHOLDER
        }
    }

    private fun getAssistantPromptTemplate(modelName: String?): String {
        return when (modelName) {
            "LLAMA_3",
            "LLAMA_3_1",
            "LLAMA_3_2" -> "\n$ASSISTANT_PLACEHOLDER<|eot_id|>"
            else -> ASSISTANT_PLACEHOLDER
        }
    }

    fun getStopTokens(modelName: String?): List<String> {
        return when (modelName) {
            "LLAMA_3",
            "LLAMA_3_1",
            "LLAMA_3_2",
            "LLAMA_GUARD_3" -> listOf("<|eot_id|>", "<|eom_id|>")
            else -> listOf("")
        }
    }

    fun getTotalFormattedPrompt(
        messages: List<InferenceChatCompletionParams.Message>,
        modelName: String?
    ): String {
        var formattedPrompt: String = ""
        if (messages.isEmpty()) return formattedPrompt

        var format: String = ""

        for (message in messages) {
            when {
                message.isSystemMessage() -> {
                    // system message. Expecting this will only called once
                    val systemMessage: SystemMessage? = message.systemMessage()
                    val content: String? = systemMessage?.content()?.string()
                    if (content != null) {
                        formattedPrompt =
                            getSystemPromptTemplate(modelName)
                                .replace(SYSTEM_PLACEHOLDER, content) + formattedPrompt
                    }
                }
                message.isUserMessage() -> {
                    // user message
                    val userMessage: UserMessage? = message.userMessage()
                    val content: String? = userMessage?.content()?.string()
                    if (content != null) {
                        format = getUserPromptTemplate(modelName).replace(USER_PLACEHOLDER, content)
                    }
                }
                message.isCompletionMessage() -> {
                    // assistant message
                    val completionMessage: CompletionMessage? = message.completionMessage()
                    val content: String? = completionMessage?.content()?.string()
                    if (content != null) {
                        format =
                            getAssistantPromptTemplate(modelName)
                                .replace(ASSISTANT_PLACEHOLDER, content)
                    }
                }
            }
            formattedPrompt += format
        }

        return formattedPrompt
    }
}
