// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.llama.llamastack.core.Enum
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.Params
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

/** Generate a chat completion for the given messages using the specified model. */
class InferenceChatCompletionParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** List of messages in the conversation */
    fun messages(): List<Message> = body.messages()

    /**
     * The identifier of the model to use. The model must be registered with Llama Stack and
     * available via the /models endpoint.
     */
    fun modelId(): String = body.modelId()

    /** (Optional) If specified, log probabilities for each token position will be returned. */
    fun logprobs(): Logprobs? = body.logprobs()

    /**
     * (Optional) Grammar specification for guided (structured) decoding. There are two options: -
     * `ResponseFormat.json_schema`: The grammar is a JSON schema. Most providers support this
     * format. - `ResponseFormat.grammar`: The grammar is a BNF grammar. This format is more
     * flexible, but not all providers support it.
     */
    fun responseFormat(): ResponseFormat? = body.responseFormat()

    /** Parameters to control the sampling strategy */
    fun samplingParams(): SamplingParams? = body.samplingParams()

    /**
     * (Optional) Whether tool use is required or automatic. Defaults to ToolChoice.auto. ..
     * deprecated:: Use tool_config instead.
     */
    fun toolChoice(): ToolChoice? = body.toolChoice()

    /** (Optional) Configuration for tool use. */
    fun toolConfig(): ToolConfig? = body.toolConfig()

    /**
     * (Optional) Instructs the model how to format tool calls. By default, Llama Stack will attempt
     * to use a format that is best adapted to the model. - `ToolPromptFormat.json`: The tool calls
     * are formatted as a JSON object. - `ToolPromptFormat.function_tag`: The tool calls are
     * enclosed in a <function=function_name> tag. - `ToolPromptFormat.python_list`: The tool calls
     * are output as Python syntax -- a list of function calls. .. deprecated:: Use tool_config
     * instead.
     */
    fun toolPromptFormat(): ToolPromptFormat? = body.toolPromptFormat()

    /** (Optional) List of tool definitions available to the model */
    fun tools(): List<Tool>? = body.tools()

    /** List of messages in the conversation */
    fun _messages(): JsonField<List<Message>> = body._messages()

    /**
     * The identifier of the model to use. The model must be registered with Llama Stack and
     * available via the /models endpoint.
     */
    fun _modelId(): JsonField<String> = body._modelId()

    /** (Optional) If specified, log probabilities for each token position will be returned. */
    fun _logprobs(): JsonField<Logprobs> = body._logprobs()

    /**
     * (Optional) Grammar specification for guided (structured) decoding. There are two options: -
     * `ResponseFormat.json_schema`: The grammar is a JSON schema. Most providers support this
     * format. - `ResponseFormat.grammar`: The grammar is a BNF grammar. This format is more
     * flexible, but not all providers support it.
     */
    fun _responseFormat(): JsonField<ResponseFormat> = body._responseFormat()

    /** Parameters to control the sampling strategy */
    fun _samplingParams(): JsonField<SamplingParams> = body._samplingParams()

    /**
     * (Optional) Whether tool use is required or automatic. Defaults to ToolChoice.auto. ..
     * deprecated:: Use tool_config instead.
     */
    fun _toolChoice(): JsonField<ToolChoice> = body._toolChoice()

    /** (Optional) Configuration for tool use. */
    fun _toolConfig(): JsonField<ToolConfig> = body._toolConfig()

    /**
     * (Optional) Instructs the model how to format tool calls. By default, Llama Stack will attempt
     * to use a format that is best adapted to the model. - `ToolPromptFormat.json`: The tool calls
     * are formatted as a JSON object. - `ToolPromptFormat.function_tag`: The tool calls are
     * enclosed in a <function=function_name> tag. - `ToolPromptFormat.python_list`: The tool calls
     * are output as Python syntax -- a list of function calls. .. deprecated:: Use tool_config
     * instead.
     */
    fun _toolPromptFormat(): JsonField<ToolPromptFormat> = body._toolPromptFormat()

    /** (Optional) List of tool definitions available to the model */
    fun _tools(): JsonField<List<Tool>> = body._tools()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("messages")
        @ExcludeMissing
        private val messages: JsonField<List<Message>> = JsonMissing.of(),
        @JsonProperty("model_id")
        @ExcludeMissing
        private val modelId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("logprobs")
        @ExcludeMissing
        private val logprobs: JsonField<Logprobs> = JsonMissing.of(),
        @JsonProperty("response_format")
        @ExcludeMissing
        private val responseFormat: JsonField<ResponseFormat> = JsonMissing.of(),
        @JsonProperty("sampling_params")
        @ExcludeMissing
        private val samplingParams: JsonField<SamplingParams> = JsonMissing.of(),
        @JsonProperty("tool_choice")
        @ExcludeMissing
        private val toolChoice: JsonField<ToolChoice> = JsonMissing.of(),
        @JsonProperty("tool_config")
        @ExcludeMissing
        private val toolConfig: JsonField<ToolConfig> = JsonMissing.of(),
        @JsonProperty("tool_prompt_format")
        @ExcludeMissing
        private val toolPromptFormat: JsonField<ToolPromptFormat> = JsonMissing.of(),
        @JsonProperty("tools")
        @ExcludeMissing
        private val tools: JsonField<List<Tool>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** List of messages in the conversation */
        fun messages(): List<Message> = messages.getRequired("messages")

        /**
         * The identifier of the model to use. The model must be registered with Llama Stack and
         * available via the /models endpoint.
         */
        fun modelId(): String = modelId.getRequired("model_id")

        /** (Optional) If specified, log probabilities for each token position will be returned. */
        fun logprobs(): Logprobs? = logprobs.getNullable("logprobs")

        /**
         * (Optional) Grammar specification for guided (structured) decoding. There are two
         * options: - `ResponseFormat.json_schema`: The grammar is a JSON schema. Most providers
         * support this format. - `ResponseFormat.grammar`: The grammar is a BNF grammar. This
         * format is more flexible, but not all providers support it.
         */
        fun responseFormat(): ResponseFormat? = responseFormat.getNullable("response_format")

        /** Parameters to control the sampling strategy */
        fun samplingParams(): SamplingParams? = samplingParams.getNullable("sampling_params")

        /**
         * (Optional) Whether tool use is required or automatic. Defaults to ToolChoice.auto. ..
         * deprecated:: Use tool_config instead.
         */
        fun toolChoice(): ToolChoice? = toolChoice.getNullable("tool_choice")

        /** (Optional) Configuration for tool use. */
        fun toolConfig(): ToolConfig? = toolConfig.getNullable("tool_config")

        /**
         * (Optional) Instructs the model how to format tool calls. By default, Llama Stack will
         * attempt to use a format that is best adapted to the model. - `ToolPromptFormat.json`: The
         * tool calls are formatted as a JSON object. - `ToolPromptFormat.function_tag`: The tool
         * calls are enclosed in a <function=function_name> tag. - `ToolPromptFormat.python_list`:
         * The tool calls are output as Python syntax -- a list of function calls. .. deprecated::
         * Use tool_config instead.
         */
        fun toolPromptFormat(): ToolPromptFormat? =
            toolPromptFormat.getNullable("tool_prompt_format")

        /** (Optional) List of tool definitions available to the model */
        fun tools(): List<Tool>? = tools.getNullable("tools")

        /** List of messages in the conversation */
        @JsonProperty("messages")
        @ExcludeMissing
        fun _messages(): JsonField<List<Message>> = messages

        /**
         * The identifier of the model to use. The model must be registered with Llama Stack and
         * available via the /models endpoint.
         */
        @JsonProperty("model_id") @ExcludeMissing fun _modelId(): JsonField<String> = modelId

        /** (Optional) If specified, log probabilities for each token position will be returned. */
        @JsonProperty("logprobs") @ExcludeMissing fun _logprobs(): JsonField<Logprobs> = logprobs

        /**
         * (Optional) Grammar specification for guided (structured) decoding. There are two
         * options: - `ResponseFormat.json_schema`: The grammar is a JSON schema. Most providers
         * support this format. - `ResponseFormat.grammar`: The grammar is a BNF grammar. This
         * format is more flexible, but not all providers support it.
         */
        @JsonProperty("response_format")
        @ExcludeMissing
        fun _responseFormat(): JsonField<ResponseFormat> = responseFormat

        /** Parameters to control the sampling strategy */
        @JsonProperty("sampling_params")
        @ExcludeMissing
        fun _samplingParams(): JsonField<SamplingParams> = samplingParams

        /**
         * (Optional) Whether tool use is required or automatic. Defaults to ToolChoice.auto. ..
         * deprecated:: Use tool_config instead.
         */
        @JsonProperty("tool_choice")
        @ExcludeMissing
        fun _toolChoice(): JsonField<ToolChoice> = toolChoice

        /** (Optional) Configuration for tool use. */
        @JsonProperty("tool_config")
        @ExcludeMissing
        fun _toolConfig(): JsonField<ToolConfig> = toolConfig

        /**
         * (Optional) Instructs the model how to format tool calls. By default, Llama Stack will
         * attempt to use a format that is best adapted to the model. - `ToolPromptFormat.json`: The
         * tool calls are formatted as a JSON object. - `ToolPromptFormat.function_tag`: The tool
         * calls are enclosed in a <function=function_name> tag. - `ToolPromptFormat.python_list`:
         * The tool calls are output as Python syntax -- a list of function calls. .. deprecated::
         * Use tool_config instead.
         */
        @JsonProperty("tool_prompt_format")
        @ExcludeMissing
        fun _toolPromptFormat(): JsonField<ToolPromptFormat> = toolPromptFormat

        /** (Optional) List of tool definitions available to the model */
        @JsonProperty("tools") @ExcludeMissing fun _tools(): JsonField<List<Tool>> = tools

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            messages().forEach { it.validate() }
            modelId()
            logprobs()?.validate()
            responseFormat()?.validate()
            samplingParams()?.validate()
            toolChoice()
            toolConfig()?.validate()
            toolPromptFormat()
            tools()?.forEach { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var messages: JsonField<MutableList<Message>>? = null
            private var modelId: JsonField<String>? = null
            private var logprobs: JsonField<Logprobs> = JsonMissing.of()
            private var responseFormat: JsonField<ResponseFormat> = JsonMissing.of()
            private var samplingParams: JsonField<SamplingParams> = JsonMissing.of()
            private var toolChoice: JsonField<ToolChoice> = JsonMissing.of()
            private var toolConfig: JsonField<ToolConfig> = JsonMissing.of()
            private var toolPromptFormat: JsonField<ToolPromptFormat> = JsonMissing.of()
            private var tools: JsonField<MutableList<Tool>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                messages = body.messages.map { it.toMutableList() }
                modelId = body.modelId
                logprobs = body.logprobs
                responseFormat = body.responseFormat
                samplingParams = body.samplingParams
                toolChoice = body.toolChoice
                toolConfig = body.toolConfig
                toolPromptFormat = body.toolPromptFormat
                tools = body.tools.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** List of messages in the conversation */
            fun messages(messages: List<Message>) = messages(JsonField.of(messages))

            /** List of messages in the conversation */
            fun messages(messages: JsonField<List<Message>>) = apply {
                this.messages = messages.map { it.toMutableList() }
            }

            /** List of messages in the conversation */
            fun addMessage(message: Message) = apply {
                messages =
                    (messages ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(message)
                    }
            }

            /** A message from the user in a chat conversation. */
            fun addMessage(user: UserMessage) = addMessage(Message.ofUser(user))

            /** A message from the user in a chat conversation. */
            fun addUserMessage(content: InterleavedContent) =
                addMessage(UserMessage.builder().content(content).build())

            /** A message from the user in a chat conversation. */
            fun addUserMessage(string: String) = addUserMessage(InterleavedContent.ofString(string))

            /** A image content item */
            fun addUserMessage(imageContentItem: InterleavedContent.ImageContentItem) =
                addUserMessage(InterleavedContent.ofImageContentItem(imageContentItem))

            /** A text content item */
            fun addUserMessage(textContentItem: InterleavedContent.TextContentItem) =
                addUserMessage(InterleavedContent.ofTextContentItem(textContentItem))

            /** A message from the user in a chat conversation. */
            fun addUserMessageOfItems(items: List<InterleavedContentItem>) =
                addUserMessage(InterleavedContent.ofItems(items))

            /** A system message providing instructions or context to the model. */
            fun addMessage(system: SystemMessage) = addMessage(Message.ofSystem(system))

            /** A system message providing instructions or context to the model. */
            fun addSystemMessage(content: InterleavedContent) =
                addMessage(SystemMessage.builder().content(content).build())

            /** A system message providing instructions or context to the model. */
            fun addSystemMessage(string: String) =
                addSystemMessage(InterleavedContent.ofString(string))

            /** A image content item */
            fun addSystemMessage(imageContentItem: InterleavedContent.ImageContentItem) =
                addSystemMessage(InterleavedContent.ofImageContentItem(imageContentItem))

            /** A text content item */
            fun addSystemMessage(textContentItem: InterleavedContent.TextContentItem) =
                addSystemMessage(InterleavedContent.ofTextContentItem(textContentItem))

            /** A system message providing instructions or context to the model. */
            fun addSystemMessageOfItems(items: List<InterleavedContentItem>) =
                addSystemMessage(InterleavedContent.ofItems(items))

            /** A message representing the result of a tool invocation. */
            fun addMessage(toolResponse: ToolResponseMessage) =
                addMessage(Message.ofToolResponse(toolResponse))

            /** A message containing the model's (assistant) response in a chat conversation. */
            fun addMessage(completion: CompletionMessage) =
                addMessage(Message.ofCompletion(completion))

            /**
             * The identifier of the model to use. The model must be registered with Llama Stack and
             * available via the /models endpoint.
             */
            fun modelId(modelId: String) = modelId(JsonField.of(modelId))

            /**
             * The identifier of the model to use. The model must be registered with Llama Stack and
             * available via the /models endpoint.
             */
            fun modelId(modelId: JsonField<String>) = apply { this.modelId = modelId }

            /**
             * (Optional) If specified, log probabilities for each token position will be returned.
             */
            fun logprobs(logprobs: Logprobs) = logprobs(JsonField.of(logprobs))

            /**
             * (Optional) If specified, log probabilities for each token position will be returned.
             */
            fun logprobs(logprobs: JsonField<Logprobs>) = apply { this.logprobs = logprobs }

            /**
             * (Optional) Grammar specification for guided (structured) decoding. There are two
             * options: - `ResponseFormat.json_schema`: The grammar is a JSON schema. Most providers
             * support this format. - `ResponseFormat.grammar`: The grammar is a BNF grammar. This
             * format is more flexible, but not all providers support it.
             */
            fun responseFormat(responseFormat: ResponseFormat) =
                responseFormat(JsonField.of(responseFormat))

            /**
             * (Optional) Grammar specification for guided (structured) decoding. There are two
             * options: - `ResponseFormat.json_schema`: The grammar is a JSON schema. Most providers
             * support this format. - `ResponseFormat.grammar`: The grammar is a BNF grammar. This
             * format is more flexible, but not all providers support it.
             */
            fun responseFormat(responseFormat: JsonField<ResponseFormat>) = apply {
                this.responseFormat = responseFormat
            }

            /** Configuration for JSON schema-guided response generation. */
            fun responseFormat(jsonSchema: ResponseFormat.JsonSchemaResponseFormat) =
                responseFormat(ResponseFormat.ofJsonSchema(jsonSchema))

            /** Configuration for JSON schema-guided response generation. */
            fun jsonSchemaResponseFormat(
                jsonSchema: ResponseFormat.JsonSchemaResponseFormat.JsonSchema
            ) =
                responseFormat(
                    ResponseFormat.JsonSchemaResponseFormat.builder().jsonSchema(jsonSchema).build()
                )

            /** Configuration for grammar-guided response generation. */
            fun responseFormat(grammar: ResponseFormat.GrammarResponseFormat) =
                responseFormat(ResponseFormat.ofGrammar(grammar))

            /** Configuration for grammar-guided response generation. */
            fun grammarResponseFormat(bnf: ResponseFormat.GrammarResponseFormat.Bnf) =
                responseFormat(ResponseFormat.GrammarResponseFormat.builder().bnf(bnf).build())

            /** Parameters to control the sampling strategy */
            fun samplingParams(samplingParams: SamplingParams) =
                samplingParams(JsonField.of(samplingParams))

            /** Parameters to control the sampling strategy */
            fun samplingParams(samplingParams: JsonField<SamplingParams>) = apply {
                this.samplingParams = samplingParams
            }

            /**
             * (Optional) Whether tool use is required or automatic. Defaults to ToolChoice.auto. ..
             * deprecated:: Use tool_config instead.
             */
            fun toolChoice(toolChoice: ToolChoice) = toolChoice(JsonField.of(toolChoice))

            /**
             * (Optional) Whether tool use is required or automatic. Defaults to ToolChoice.auto. ..
             * deprecated:: Use tool_config instead.
             */
            fun toolChoice(toolChoice: JsonField<ToolChoice>) = apply {
                this.toolChoice = toolChoice
            }

            /** (Optional) Configuration for tool use. */
            fun toolConfig(toolConfig: ToolConfig) = toolConfig(JsonField.of(toolConfig))

            /** (Optional) Configuration for tool use. */
            fun toolConfig(toolConfig: JsonField<ToolConfig>) = apply {
                this.toolConfig = toolConfig
            }

            /**
             * (Optional) Instructs the model how to format tool calls. By default, Llama Stack will
             * attempt to use a format that is best adapted to the model. - `ToolPromptFormat.json`:
             * The tool calls are formatted as a JSON object. - `ToolPromptFormat.function_tag`: The
             * tool calls are enclosed in a <function=function_name> tag. -
             * `ToolPromptFormat.python_list`: The tool calls are output as Python syntax -- a list
             * of function calls. .. deprecated:: Use tool_config instead.
             */
            fun toolPromptFormat(toolPromptFormat: ToolPromptFormat) =
                toolPromptFormat(JsonField.of(toolPromptFormat))

            /**
             * (Optional) Instructs the model how to format tool calls. By default, Llama Stack will
             * attempt to use a format that is best adapted to the model. - `ToolPromptFormat.json`:
             * The tool calls are formatted as a JSON object. - `ToolPromptFormat.function_tag`: The
             * tool calls are enclosed in a <function=function_name> tag. -
             * `ToolPromptFormat.python_list`: The tool calls are output as Python syntax -- a list
             * of function calls. .. deprecated:: Use tool_config instead.
             */
            fun toolPromptFormat(toolPromptFormat: JsonField<ToolPromptFormat>) = apply {
                this.toolPromptFormat = toolPromptFormat
            }

            /** (Optional) List of tool definitions available to the model */
            fun tools(tools: List<Tool>) = tools(JsonField.of(tools))

            /** (Optional) List of tool definitions available to the model */
            fun tools(tools: JsonField<List<Tool>>) = apply {
                this.tools = tools.map { it.toMutableList() }
            }

            /** (Optional) List of tool definitions available to the model */
            fun addTool(tool: Tool) = apply {
                tools =
                    (tools ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(tool)
                    }
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): Body =
                Body(
                    checkRequired("messages", messages).map { it.toImmutable() },
                    checkRequired("modelId", modelId),
                    logprobs,
                    responseFormat,
                    samplingParams,
                    toolChoice,
                    toolConfig,
                    toolPromptFormat,
                    (tools ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && messages == other.messages && modelId == other.modelId && logprobs == other.logprobs && responseFormat == other.responseFormat && samplingParams == other.samplingParams && toolChoice == other.toolChoice && toolConfig == other.toolConfig && toolPromptFormat == other.toolPromptFormat && tools == other.tools && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(messages, modelId, logprobs, responseFormat, samplingParams, toolChoice, toolConfig, toolPromptFormat, tools, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{messages=$messages, modelId=$modelId, logprobs=$logprobs, responseFormat=$responseFormat, samplingParams=$samplingParams, toolChoice=$toolChoice, toolConfig=$toolConfig, toolPromptFormat=$toolPromptFormat, tools=$tools, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [InferenceChatCompletionParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(inferenceChatCompletionParams: InferenceChatCompletionParams) = apply {
            body = inferenceChatCompletionParams.body.toBuilder()
            additionalHeaders = inferenceChatCompletionParams.additionalHeaders.toBuilder()
            additionalQueryParams = inferenceChatCompletionParams.additionalQueryParams.toBuilder()
        }

        /** List of messages in the conversation */
        fun messages(messages: List<Message>) = apply { body.messages(messages) }

        /** List of messages in the conversation */
        fun messages(messages: JsonField<List<Message>>) = apply { body.messages(messages) }

        /** List of messages in the conversation */
        fun addMessage(message: Message) = apply { body.addMessage(message) }

        /** A message from the user in a chat conversation. */
        fun addMessage(user: UserMessage) = apply { body.addMessage(user) }

        /** A message from the user in a chat conversation. */
        fun addUserMessage(content: InterleavedContent) = apply { body.addUserMessage(content) }

        /** A message from the user in a chat conversation. */
        fun addUserMessage(string: String) = apply { body.addUserMessage(string) }

        /** A image content item */
        fun addUserMessage(imageContentItem: InterleavedContent.ImageContentItem) = apply {
            body.addUserMessage(imageContentItem)
        }

        /** A text content item */
        fun addUserMessage(textContentItem: InterleavedContent.TextContentItem) = apply {
            body.addUserMessage(textContentItem)
        }

        /** A message from the user in a chat conversation. */
        fun addUserMessageOfItems(items: List<InterleavedContentItem>) = apply {
            body.addUserMessageOfItems(items)
        }

        /** A system message providing instructions or context to the model. */
        fun addMessage(system: SystemMessage) = apply { body.addMessage(system) }

        /** A system message providing instructions or context to the model. */
        fun addSystemMessage(content: InterleavedContent) = apply { body.addSystemMessage(content) }

        /** A system message providing instructions or context to the model. */
        fun addSystemMessage(string: String) = apply { body.addSystemMessage(string) }

        /** A image content item */
        fun addSystemMessage(imageContentItem: InterleavedContent.ImageContentItem) = apply {
            body.addSystemMessage(imageContentItem)
        }

        /** A text content item */
        fun addSystemMessage(textContentItem: InterleavedContent.TextContentItem) = apply {
            body.addSystemMessage(textContentItem)
        }

        /** A system message providing instructions or context to the model. */
        fun addSystemMessageOfItems(items: List<InterleavedContentItem>) = apply {
            body.addSystemMessageOfItems(items)
        }

        /** A message representing the result of a tool invocation. */
        fun addMessage(toolResponse: ToolResponseMessage) = apply { body.addMessage(toolResponse) }

        /** A message containing the model's (assistant) response in a chat conversation. */
        fun addMessage(completion: CompletionMessage) = apply { body.addMessage(completion) }

        /**
         * The identifier of the model to use. The model must be registered with Llama Stack and
         * available via the /models endpoint.
         */
        fun modelId(modelId: String) = apply { body.modelId(modelId) }

        /**
         * The identifier of the model to use. The model must be registered with Llama Stack and
         * available via the /models endpoint.
         */
        fun modelId(modelId: JsonField<String>) = apply { body.modelId(modelId) }

        /** (Optional) If specified, log probabilities for each token position will be returned. */
        fun logprobs(logprobs: Logprobs) = apply { body.logprobs(logprobs) }

        /** (Optional) If specified, log probabilities for each token position will be returned. */
        fun logprobs(logprobs: JsonField<Logprobs>) = apply { body.logprobs(logprobs) }

        /**
         * (Optional) Grammar specification for guided (structured) decoding. There are two
         * options: - `ResponseFormat.json_schema`: The grammar is a JSON schema. Most providers
         * support this format. - `ResponseFormat.grammar`: The grammar is a BNF grammar. This
         * format is more flexible, but not all providers support it.
         */
        fun responseFormat(responseFormat: ResponseFormat) = apply {
            body.responseFormat(responseFormat)
        }

        /**
         * (Optional) Grammar specification for guided (structured) decoding. There are two
         * options: - `ResponseFormat.json_schema`: The grammar is a JSON schema. Most providers
         * support this format. - `ResponseFormat.grammar`: The grammar is a BNF grammar. This
         * format is more flexible, but not all providers support it.
         */
        fun responseFormat(responseFormat: JsonField<ResponseFormat>) = apply {
            body.responseFormat(responseFormat)
        }

        /** Configuration for JSON schema-guided response generation. */
        fun responseFormat(jsonSchema: ResponseFormat.JsonSchemaResponseFormat) = apply {
            body.responseFormat(jsonSchema)
        }

        /** Configuration for JSON schema-guided response generation. */
        fun jsonSchemaResponseFormat(
            jsonSchema: ResponseFormat.JsonSchemaResponseFormat.JsonSchema
        ) = apply { body.jsonSchemaResponseFormat(jsonSchema) }

        /** Configuration for grammar-guided response generation. */
        fun responseFormat(grammar: ResponseFormat.GrammarResponseFormat) = apply {
            body.responseFormat(grammar)
        }

        /** Configuration for grammar-guided response generation. */
        fun grammarResponseFormat(bnf: ResponseFormat.GrammarResponseFormat.Bnf) = apply {
            body.grammarResponseFormat(bnf)
        }

        /** Parameters to control the sampling strategy */
        fun samplingParams(samplingParams: SamplingParams) = apply {
            body.samplingParams(samplingParams)
        }

        /** Parameters to control the sampling strategy */
        fun samplingParams(samplingParams: JsonField<SamplingParams>) = apply {
            body.samplingParams(samplingParams)
        }

        /**
         * (Optional) Whether tool use is required or automatic. Defaults to ToolChoice.auto. ..
         * deprecated:: Use tool_config instead.
         */
        fun toolChoice(toolChoice: ToolChoice) = apply { body.toolChoice(toolChoice) }

        /**
         * (Optional) Whether tool use is required or automatic. Defaults to ToolChoice.auto. ..
         * deprecated:: Use tool_config instead.
         */
        fun toolChoice(toolChoice: JsonField<ToolChoice>) = apply { body.toolChoice(toolChoice) }

        /** (Optional) Configuration for tool use. */
        fun toolConfig(toolConfig: ToolConfig) = apply { body.toolConfig(toolConfig) }

        /** (Optional) Configuration for tool use. */
        fun toolConfig(toolConfig: JsonField<ToolConfig>) = apply { body.toolConfig(toolConfig) }

        /**
         * (Optional) Instructs the model how to format tool calls. By default, Llama Stack will
         * attempt to use a format that is best adapted to the model. - `ToolPromptFormat.json`: The
         * tool calls are formatted as a JSON object. - `ToolPromptFormat.function_tag`: The tool
         * calls are enclosed in a <function=function_name> tag. - `ToolPromptFormat.python_list`:
         * The tool calls are output as Python syntax -- a list of function calls. .. deprecated::
         * Use tool_config instead.
         */
        fun toolPromptFormat(toolPromptFormat: ToolPromptFormat) = apply {
            body.toolPromptFormat(toolPromptFormat)
        }

        /**
         * (Optional) Instructs the model how to format tool calls. By default, Llama Stack will
         * attempt to use a format that is best adapted to the model. - `ToolPromptFormat.json`: The
         * tool calls are formatted as a JSON object. - `ToolPromptFormat.function_tag`: The tool
         * calls are enclosed in a <function=function_name> tag. - `ToolPromptFormat.python_list`:
         * The tool calls are output as Python syntax -- a list of function calls. .. deprecated::
         * Use tool_config instead.
         */
        fun toolPromptFormat(toolPromptFormat: JsonField<ToolPromptFormat>) = apply {
            body.toolPromptFormat(toolPromptFormat)
        }

        /** (Optional) List of tool definitions available to the model */
        fun tools(tools: List<Tool>) = apply { body.tools(tools) }

        /** (Optional) List of tool definitions available to the model */
        fun tools(tools: JsonField<List<Tool>>) = apply { body.tools(tools) }

        /** (Optional) List of tool definitions available to the model */
        fun addTool(tool: Tool) = apply { body.addTool(tool) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): InferenceChatCompletionParams =
            InferenceChatCompletionParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** (Optional) If specified, log probabilities for each token position will be returned. */
    @NoAutoDetect
    class Logprobs
    @JsonCreator
    private constructor(
        @JsonProperty("top_k") @ExcludeMissing private val topK: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** How many tokens (for each position) to return log probabilities for. */
        fun topK(): Long? = topK.getNullable("top_k")

        /** How many tokens (for each position) to return log probabilities for. */
        @JsonProperty("top_k") @ExcludeMissing fun _topK(): JsonField<Long> = topK

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Logprobs = apply {
            if (validated) {
                return@apply
            }

            topK()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [Logprobs]. */
        class Builder internal constructor() {

            private var topK: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(logprobs: Logprobs) = apply {
                topK = logprobs.topK
                additionalProperties = logprobs.additionalProperties.toMutableMap()
            }

            /** How many tokens (for each position) to return log probabilities for. */
            fun topK(topK: Long) = topK(JsonField.of(topK))

            /** How many tokens (for each position) to return log probabilities for. */
            fun topK(topK: JsonField<Long>) = apply { this.topK = topK }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): Logprobs = Logprobs(topK, additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Logprobs && topK == other.topK && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(topK, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Logprobs{topK=$topK, additionalProperties=$additionalProperties}"
    }

    /**
     * (Optional) Whether tool use is required or automatic. Defaults to ToolChoice.auto. ..
     * deprecated:: Use tool_config instead.
     */
    class ToolChoice @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val AUTO = of("auto")

            val REQUIRED = of("required")

            val NONE = of("none")

            fun of(value: String) = ToolChoice(JsonField.of(value))
        }

        /** An enum containing [ToolChoice]'s known values. */
        enum class Known {
            AUTO,
            REQUIRED,
            NONE,
        }

        /**
         * An enum containing [ToolChoice]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ToolChoice] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AUTO,
            REQUIRED,
            NONE,
            /**
             * An enum member indicating that [ToolChoice] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                AUTO -> Value.AUTO
                REQUIRED -> Value.REQUIRED
                NONE -> Value.NONE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LlamaStackClientInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                AUTO -> Known.AUTO
                REQUIRED -> Known.REQUIRED
                NONE -> Known.NONE
                else -> throw LlamaStackClientInvalidDataException("Unknown ToolChoice: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LlamaStackClientInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString()
                ?: throw LlamaStackClientInvalidDataException("Value is not a String")

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ToolChoice && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** (Optional) Configuration for tool use. */
    @NoAutoDetect
    class ToolConfig
    @JsonCreator
    private constructor(
        @JsonProperty("system_message_behavior")
        @ExcludeMissing
        private val systemMessageBehavior: JsonField<SystemMessageBehavior> = JsonMissing.of(),
        @JsonProperty("tool_choice")
        @ExcludeMissing
        private val toolChoice: JsonField<ToolChoice> = JsonMissing.of(),
        @JsonProperty("tool_prompt_format")
        @ExcludeMissing
        private val toolPromptFormat: JsonField<ToolPromptFormat> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * (Optional) Config for how to override the default system prompt. -
         * `SystemMessageBehavior.append`: Appends the provided system message to the default system
         * prompt. - `SystemMessageBehavior.replace`: Replaces the default system prompt with the
         * provided system message. The system message can include the string
         * '{{function_definitions}}' to indicate where the function definitions should be inserted.
         */
        fun systemMessageBehavior(): SystemMessageBehavior? =
            systemMessageBehavior.getNullable("system_message_behavior")

        /**
         * (Optional) Whether tool use is automatic, required, or none. Can also specify a tool name
         * to use a specific tool. Defaults to ToolChoice.auto.
         */
        fun toolChoice(): ToolChoice? = toolChoice.getNullable("tool_choice")

        /**
         * (Optional) Instructs the model how to format tool calls. By default, Llama Stack will
         * attempt to use a format that is best adapted to the model. - `ToolPromptFormat.json`: The
         * tool calls are formatted as a JSON object. - `ToolPromptFormat.function_tag`: The tool
         * calls are enclosed in a <function=function_name> tag. - `ToolPromptFormat.python_list`:
         * The tool calls are output as Python syntax -- a list of function calls.
         */
        fun toolPromptFormat(): ToolPromptFormat? =
            toolPromptFormat.getNullable("tool_prompt_format")

        /**
         * (Optional) Config for how to override the default system prompt. -
         * `SystemMessageBehavior.append`: Appends the provided system message to the default system
         * prompt. - `SystemMessageBehavior.replace`: Replaces the default system prompt with the
         * provided system message. The system message can include the string
         * '{{function_definitions}}' to indicate where the function definitions should be inserted.
         */
        @JsonProperty("system_message_behavior")
        @ExcludeMissing
        fun _systemMessageBehavior(): JsonField<SystemMessageBehavior> = systemMessageBehavior

        /**
         * (Optional) Whether tool use is automatic, required, or none. Can also specify a tool name
         * to use a specific tool. Defaults to ToolChoice.auto.
         */
        @JsonProperty("tool_choice")
        @ExcludeMissing
        fun _toolChoice(): JsonField<ToolChoice> = toolChoice

        /**
         * (Optional) Instructs the model how to format tool calls. By default, Llama Stack will
         * attempt to use a format that is best adapted to the model. - `ToolPromptFormat.json`: The
         * tool calls are formatted as a JSON object. - `ToolPromptFormat.function_tag`: The tool
         * calls are enclosed in a <function=function_name> tag. - `ToolPromptFormat.python_list`:
         * The tool calls are output as Python syntax -- a list of function calls.
         */
        @JsonProperty("tool_prompt_format")
        @ExcludeMissing
        fun _toolPromptFormat(): JsonField<ToolPromptFormat> = toolPromptFormat

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ToolConfig = apply {
            if (validated) {
                return@apply
            }

            systemMessageBehavior()
            toolChoice()
            toolPromptFormat()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [ToolConfig]. */
        class Builder internal constructor() {

            private var systemMessageBehavior: JsonField<SystemMessageBehavior> = JsonMissing.of()
            private var toolChoice: JsonField<ToolChoice> = JsonMissing.of()
            private var toolPromptFormat: JsonField<ToolPromptFormat> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(toolConfig: ToolConfig) = apply {
                systemMessageBehavior = toolConfig.systemMessageBehavior
                toolChoice = toolConfig.toolChoice
                toolPromptFormat = toolConfig.toolPromptFormat
                additionalProperties = toolConfig.additionalProperties.toMutableMap()
            }

            /**
             * (Optional) Config for how to override the default system prompt. -
             * `SystemMessageBehavior.append`: Appends the provided system message to the default
             * system prompt. - `SystemMessageBehavior.replace`: Replaces the default system prompt
             * with the provided system message. The system message can include the string
             * '{{function_definitions}}' to indicate where the function definitions should be
             * inserted.
             */
            fun systemMessageBehavior(systemMessageBehavior: SystemMessageBehavior) =
                systemMessageBehavior(JsonField.of(systemMessageBehavior))

            /**
             * (Optional) Config for how to override the default system prompt. -
             * `SystemMessageBehavior.append`: Appends the provided system message to the default
             * system prompt. - `SystemMessageBehavior.replace`: Replaces the default system prompt
             * with the provided system message. The system message can include the string
             * '{{function_definitions}}' to indicate where the function definitions should be
             * inserted.
             */
            fun systemMessageBehavior(systemMessageBehavior: JsonField<SystemMessageBehavior>) =
                apply {
                    this.systemMessageBehavior = systemMessageBehavior
                }

            /**
             * (Optional) Whether tool use is automatic, required, or none. Can also specify a tool
             * name to use a specific tool. Defaults to ToolChoice.auto.
             */
            fun toolChoice(toolChoice: ToolChoice) = toolChoice(JsonField.of(toolChoice))

            /**
             * (Optional) Whether tool use is automatic, required, or none. Can also specify a tool
             * name to use a specific tool. Defaults to ToolChoice.auto.
             */
            fun toolChoice(toolChoice: JsonField<ToolChoice>) = apply {
                this.toolChoice = toolChoice
            }

            /**
             * (Optional) Whether tool use is automatic, required, or none. Can also specify a tool
             * name to use a specific tool. Defaults to ToolChoice.auto.
             */
            fun toolChoice(value: String) = toolChoice(ToolChoice.of(value))

            /**
             * (Optional) Instructs the model how to format tool calls. By default, Llama Stack will
             * attempt to use a format that is best adapted to the model. - `ToolPromptFormat.json`:
             * The tool calls are formatted as a JSON object. - `ToolPromptFormat.function_tag`: The
             * tool calls are enclosed in a <function=function_name> tag. -
             * `ToolPromptFormat.python_list`: The tool calls are output as Python syntax -- a list
             * of function calls.
             */
            fun toolPromptFormat(toolPromptFormat: ToolPromptFormat) =
                toolPromptFormat(JsonField.of(toolPromptFormat))

            /**
             * (Optional) Instructs the model how to format tool calls. By default, Llama Stack will
             * attempt to use a format that is best adapted to the model. - `ToolPromptFormat.json`:
             * The tool calls are formatted as a JSON object. - `ToolPromptFormat.function_tag`: The
             * tool calls are enclosed in a <function=function_name> tag. -
             * `ToolPromptFormat.python_list`: The tool calls are output as Python syntax -- a list
             * of function calls.
             */
            fun toolPromptFormat(toolPromptFormat: JsonField<ToolPromptFormat>) = apply {
                this.toolPromptFormat = toolPromptFormat
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): ToolConfig =
                ToolConfig(
                    systemMessageBehavior,
                    toolChoice,
                    toolPromptFormat,
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * (Optional) Config for how to override the default system prompt. -
         * `SystemMessageBehavior.append`: Appends the provided system message to the default system
         * prompt. - `SystemMessageBehavior.replace`: Replaces the default system prompt with the
         * provided system message. The system message can include the string
         * '{{function_definitions}}' to indicate where the function definitions should be inserted.
         */
        class SystemMessageBehavior
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val APPEND = of("append")

                val REPLACE = of("replace")

                fun of(value: String) = SystemMessageBehavior(JsonField.of(value))
            }

            /** An enum containing [SystemMessageBehavior]'s known values. */
            enum class Known {
                APPEND,
                REPLACE,
            }

            /**
             * An enum containing [SystemMessageBehavior]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [SystemMessageBehavior] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                APPEND,
                REPLACE,
                /**
                 * An enum member indicating that [SystemMessageBehavior] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    APPEND -> Value.APPEND
                    REPLACE -> Value.REPLACE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LlamaStackClientInvalidDataException if this class instance's value is a not
             *   a known member.
             */
            fun known(): Known =
                when (this) {
                    APPEND -> Known.APPEND
                    REPLACE -> Known.REPLACE
                    else ->
                        throw LlamaStackClientInvalidDataException(
                            "Unknown SystemMessageBehavior: $value"
                        )
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LlamaStackClientInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString()
                    ?: throw LlamaStackClientInvalidDataException("Value is not a String")

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is SystemMessageBehavior && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Whether tool use is required or automatic. This is a hint to the model which may not be
         * followed. It depends on the Instruction Following capabilities of the model.
         */
        class ToolChoice @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val AUTO = of("auto")

                val REQUIRED = of("required")

                val NONE = of("none")

                fun of(value: String) = ToolChoice(JsonField.of(value))
            }

            /** An enum containing [ToolChoice]'s known values. */
            enum class Known {
                AUTO,
                REQUIRED,
                NONE,
            }

            /**
             * An enum containing [ToolChoice]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ToolChoice] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AUTO,
                REQUIRED,
                NONE,
                /**
                 * An enum member indicating that [ToolChoice] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    AUTO -> Value.AUTO
                    REQUIRED -> Value.REQUIRED
                    NONE -> Value.NONE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LlamaStackClientInvalidDataException if this class instance's value is a not
             *   a known member.
             */
            fun known(): Known =
                when (this) {
                    AUTO -> Known.AUTO
                    REQUIRED -> Known.REQUIRED
                    NONE -> Known.NONE
                    else -> throw LlamaStackClientInvalidDataException("Unknown ToolChoice: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LlamaStackClientInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString()
                    ?: throw LlamaStackClientInvalidDataException("Value is not a String")

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ToolChoice && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * (Optional) Instructs the model how to format tool calls. By default, Llama Stack will
         * attempt to use a format that is best adapted to the model. - `ToolPromptFormat.json`: The
         * tool calls are formatted as a JSON object. - `ToolPromptFormat.function_tag`: The tool
         * calls are enclosed in a <function=function_name> tag. - `ToolPromptFormat.python_list`:
         * The tool calls are output as Python syntax -- a list of function calls.
         */
        class ToolPromptFormat
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val JSON = of("json")

                val FUNCTION_TAG = of("function_tag")

                val PYTHON_LIST = of("python_list")

                fun of(value: String) = ToolPromptFormat(JsonField.of(value))
            }

            /** An enum containing [ToolPromptFormat]'s known values. */
            enum class Known {
                JSON,
                FUNCTION_TAG,
                PYTHON_LIST,
            }

            /**
             * An enum containing [ToolPromptFormat]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [ToolPromptFormat] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                JSON,
                FUNCTION_TAG,
                PYTHON_LIST,
                /**
                 * An enum member indicating that [ToolPromptFormat] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    JSON -> Value.JSON
                    FUNCTION_TAG -> Value.FUNCTION_TAG
                    PYTHON_LIST -> Value.PYTHON_LIST
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LlamaStackClientInvalidDataException if this class instance's value is a not
             *   a known member.
             */
            fun known(): Known =
                when (this) {
                    JSON -> Known.JSON
                    FUNCTION_TAG -> Known.FUNCTION_TAG
                    PYTHON_LIST -> Known.PYTHON_LIST
                    else ->
                        throw LlamaStackClientInvalidDataException(
                            "Unknown ToolPromptFormat: $value"
                        )
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LlamaStackClientInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString()
                    ?: throw LlamaStackClientInvalidDataException("Value is not a String")

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ToolPromptFormat && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ToolConfig && systemMessageBehavior == other.systemMessageBehavior && toolChoice == other.toolChoice && toolPromptFormat == other.toolPromptFormat && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(systemMessageBehavior, toolChoice, toolPromptFormat, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ToolConfig{systemMessageBehavior=$systemMessageBehavior, toolChoice=$toolChoice, toolPromptFormat=$toolPromptFormat, additionalProperties=$additionalProperties}"
    }

    /**
     * (Optional) Instructs the model how to format tool calls. By default, Llama Stack will attempt
     * to use a format that is best adapted to the model. - `ToolPromptFormat.json`: The tool calls
     * are formatted as a JSON object. - `ToolPromptFormat.function_tag`: The tool calls are
     * enclosed in a <function=function_name> tag. - `ToolPromptFormat.python_list`: The tool calls
     * are output as Python syntax -- a list of function calls. .. deprecated:: Use tool_config
     * instead.
     */
    class ToolPromptFormat @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val JSON = of("json")

            val FUNCTION_TAG = of("function_tag")

            val PYTHON_LIST = of("python_list")

            fun of(value: String) = ToolPromptFormat(JsonField.of(value))
        }

        /** An enum containing [ToolPromptFormat]'s known values. */
        enum class Known {
            JSON,
            FUNCTION_TAG,
            PYTHON_LIST,
        }

        /**
         * An enum containing [ToolPromptFormat]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ToolPromptFormat] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            JSON,
            FUNCTION_TAG,
            PYTHON_LIST,
            /**
             * An enum member indicating that [ToolPromptFormat] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                JSON -> Value.JSON
                FUNCTION_TAG -> Value.FUNCTION_TAG
                PYTHON_LIST -> Value.PYTHON_LIST
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LlamaStackClientInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                JSON -> Known.JSON
                FUNCTION_TAG -> Known.FUNCTION_TAG
                PYTHON_LIST -> Known.PYTHON_LIST
                else ->
                    throw LlamaStackClientInvalidDataException("Unknown ToolPromptFormat: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LlamaStackClientInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString()
                ?: throw LlamaStackClientInvalidDataException("Value is not a String")

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ToolPromptFormat && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class Tool
    @JsonCreator
    private constructor(
        @JsonProperty("tool_name")
        @ExcludeMissing
        private val toolName: JsonField<ToolName> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("parameters")
        @ExcludeMissing
        private val parameters: JsonField<Parameters> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun toolName(): ToolName = toolName.getRequired("tool_name")

        fun description(): String? = description.getNullable("description")

        fun parameters(): Parameters? = parameters.getNullable("parameters")

        @JsonProperty("tool_name") @ExcludeMissing fun _toolName(): JsonField<ToolName> = toolName

        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        @JsonProperty("parameters")
        @ExcludeMissing
        fun _parameters(): JsonField<Parameters> = parameters

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Tool = apply {
            if (validated) {
                return@apply
            }

            toolName()
            description()
            parameters()?.validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [Tool]. */
        class Builder internal constructor() {

            private var toolName: JsonField<ToolName>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var parameters: JsonField<Parameters> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(tool: Tool) = apply {
                toolName = tool.toolName
                description = tool.description
                parameters = tool.parameters
                additionalProperties = tool.additionalProperties.toMutableMap()
            }

            fun toolName(toolName: ToolName) = toolName(JsonField.of(toolName))

            fun toolName(toolName: JsonField<ToolName>) = apply { this.toolName = toolName }

            fun toolName(value: String) = toolName(ToolName.of(value))

            fun description(description: String) = description(JsonField.of(description))

            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun parameters(parameters: Parameters) = parameters(JsonField.of(parameters))

            fun parameters(parameters: JsonField<Parameters>) = apply {
                this.parameters = parameters
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): Tool =
                Tool(
                    checkRequired("toolName", toolName),
                    description,
                    parameters,
                    additionalProperties.toImmutable(),
                )
        }

        class ToolName @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val BRAVE_SEARCH = of("brave_search")

                val WOLFRAM_ALPHA = of("wolfram_alpha")

                val PHOTOGEN = of("photogen")

                val CODE_INTERPRETER = of("code_interpreter")

                fun of(value: String) = ToolName(JsonField.of(value))
            }

            /** An enum containing [ToolName]'s known values. */
            enum class Known {
                BRAVE_SEARCH,
                WOLFRAM_ALPHA,
                PHOTOGEN,
                CODE_INTERPRETER,
            }

            /**
             * An enum containing [ToolName]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ToolName] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                BRAVE_SEARCH,
                WOLFRAM_ALPHA,
                PHOTOGEN,
                CODE_INTERPRETER,
                /**
                 * An enum member indicating that [ToolName] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    BRAVE_SEARCH -> Value.BRAVE_SEARCH
                    WOLFRAM_ALPHA -> Value.WOLFRAM_ALPHA
                    PHOTOGEN -> Value.PHOTOGEN
                    CODE_INTERPRETER -> Value.CODE_INTERPRETER
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LlamaStackClientInvalidDataException if this class instance's value is a not
             *   a known member.
             */
            fun known(): Known =
                when (this) {
                    BRAVE_SEARCH -> Known.BRAVE_SEARCH
                    WOLFRAM_ALPHA -> Known.WOLFRAM_ALPHA
                    PHOTOGEN -> Known.PHOTOGEN
                    CODE_INTERPRETER -> Known.CODE_INTERPRETER
                    else -> throw LlamaStackClientInvalidDataException("Unknown ToolName: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LlamaStackClientInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString()
                    ?: throw LlamaStackClientInvalidDataException("Value is not a String")

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ToolName && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class Parameters
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Parameters = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            /** A builder for [Parameters]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(parameters: Parameters) = apply {
                    additionalProperties = parameters.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): Parameters = Parameters(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Parameters && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Parameters{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Tool && toolName == other.toolName && description == other.description && parameters == other.parameters && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(toolName, description, parameters, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Tool{toolName=$toolName, description=$description, parameters=$parameters, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InferenceChatCompletionParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "InferenceChatCompletionParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
