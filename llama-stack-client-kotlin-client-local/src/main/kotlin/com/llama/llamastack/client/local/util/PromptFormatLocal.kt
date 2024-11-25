package com.llama.llamastack.client.local.util

import com.llama.llamastack.models.InferenceChatCompletionParams
import com.llama.llamastack.models.SystemMessage
import com.llama.llamastack.models.UserMessage

object PromptFormatLocal {
    private const val SYSTEM_PLACEHOLDER: String = "{{ system_prompt }}"
    private const val USER_PLACEHOLDER: String = "{{ user_prompt }}"
    private const val ASSISTANT_PLACEHOLDER: String = "{{ assistant_response }}"

    private const val ROLE_KEY: String = "header_id"
    private const val ROLE_USER: String = "user"
    private const val ROLE_ASSISTANT: String = "assistant"

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

    fun getStopToken(modelName: String?): String {
        return when (modelName) {
            "LLAMA_3",
            "LLAMA_3_1",
            "LLAMA_3_2",
            "LLAMA_GUARD_3" -> "<|eot_id|>"

            else -> ""
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
            if (message.isSystemMessage()) {
                // system message. Expecting this will only called once
                val systemMessage: SystemMessage? = message.systemMessage()
                val content: String? = systemMessage?.content()?.string()
                if (content != null) {
                    formattedPrompt =
                        getSystemPromptTemplate(modelName).replace(SYSTEM_PLACEHOLDER, content) +
                                formattedPrompt
                }
            } else if (message.isUserMessage()) {
                // user or assistant
                val userMessage: UserMessage? = message.userMessage()
                val role = userMessage?._additionalProperties()?.get(ROLE_KEY)?.toString()
                val content: String? = userMessage?.content()?.string()
                if (content != null) {
                    // order needs to be UserPrompt A, AssistantResponse A, UserPrompt B, AssistantResponse B, ...
                    if (role == ROLE_USER) {
                        format = getUserPromptTemplate(modelName).replace(USER_PLACEHOLDER, content)
                    } else if (role == ROLE_ASSISTANT) {
                        format =
                            getAssistantPromptTemplate(modelName)
                                .replace(ASSISTANT_PLACEHOLDER, content)
                    }
                }
                formattedPrompt += format
            }
        }

        return formattedPrompt
    }
}
