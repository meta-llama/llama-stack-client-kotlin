package com.llama.llamastack.client.local.util

import com.llama.llamastack.models.AgentTurnCreateParams
import com.llama.llamastack.models.CompletionMessage
import com.llama.llamastack.models.Message
import com.llama.llamastack.models.SystemMessage
import com.llama.llamastack.models.ToolResponseMessage
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

    fun getTotalFormattedPrompt(messages: List<Message>, modelName: String?): String {
        var formattedPrompt: String = ""
        if (messages.isEmpty()) return formattedPrompt

        var format: String = ""

        for (message in messages) {
            when {
                message.isSystem() -> {
                    // system message. Expecting this will only called once
                    val systemMessage: SystemMessage? = message.system()
                    val content: String? = systemMessage?.content()?.string()
                    if (content != null) {
                        formattedPrompt =
                            getSystemPromptTemplate(modelName)
                                .replace(SYSTEM_PLACEHOLDER, content) + formattedPrompt
                    }
                }

                message.isUser() -> {
                    // user message
                    val userMessage: UserMessage? = message.user()
                    val content: String? = userMessage?.content()?.string()
                    if (content != null) {
                        format = getUserPromptTemplate(modelName).replace(USER_PLACEHOLDER, content)
                    }
                }

                message.isAssistant() -> {
                    // assistant message
                    val completionMessage: CompletionMessage? = message.assistant()
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

    fun getTotalFormattedPromptForAgent(
        instruction: String,
        messages: List<AgentTurnCreateParams.Message>,
        modelName: String?,
    ): String {
        var formattedPrompt: String = ""
        if (messages.isEmpty()) return formattedPrompt

        // First populate system message
        if (instruction.isNotEmpty()) {
            formattedPrompt =
                getSystemPromptTemplate(modelName).replace(SYSTEM_PLACEHOLDER, instruction)
        }

        var format: String = ""

        for (message in messages) {
            when {
                message.isUser() -> {
                    // user message
                    val userMessage: UserMessage? = message.user()
                    val content: String? = userMessage?.content()?.string()
                    if (content != null) {
                        format = getUserPromptTemplate(modelName).replace(USER_PLACEHOLDER, content)
                    }
                }

                message.isToolResponse() -> {
                    // assistant message
                    val toolResponseMessage: ToolResponseMessage? = message.toolResponse()
                    val content: String? = toolResponseMessage?.content()?.string()
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

    fun getTotalFormattedPromptForAgentForLocalRag(
        instruction: String,
        neighborSentences: String,
        messages: List<AgentTurnCreateParams.Message>,
        modelName: String?,
    ): String {
        var formattedPrompt: String = ""
        if (messages.isEmpty()) return formattedPrompt

        // First populate system message
        if (instruction.isNotEmpty()) {
            formattedPrompt =
                getSystemPromptTemplate(modelName)
                    .replace(
                        SYSTEM_PLACEHOLDER,
                        instruction.replace("_RETRIEVED_CONTEXT_", neighborSentences),
                    )
        }

        var format: String = ""

        for (message in messages) {
            when {
                message.isUser() -> {
                    // user message
                    val userMessage: UserMessage? = message.user()
                    val content: String? = userMessage?.content()?.string()
                    if (content != null) {
                        format = getUserPromptTemplate(modelName).replace(USER_PLACEHOLDER, content)
                    }
                }

                message.isToolResponse() -> {
                    // assistant message
                    val toolResponseMessage: ToolResponseMessage? = message.toolResponse()
                    val content: String? = toolResponseMessage?.content()?.string()
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
