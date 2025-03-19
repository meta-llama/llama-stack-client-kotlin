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
import com.llama.llamastack.core.checkKnown
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

    /**
     * List of messages in the conversation
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun messages(): List<Message> = body.messages()

    /**
     * The identifier of the model to use. The model must be registered with Llama Stack and
     * available via the /models endpoint.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun modelId(): String = body.modelId()

    /**
     * (Optional) If specified, log probabilities for each token position will be returned.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun logprobs(): Logprobs? = body.logprobs()

    /**
     * (Optional) Grammar specification for guided (structured) decoding. There are two options: -
     * `ResponseFormat.json_schema`: The grammar is a JSON schema. Most providers support this
     * format. - `ResponseFormat.grammar`: The grammar is a BNF grammar. This format is more
     * flexible, but not all providers support it.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun responseFormat(): ResponseFormat? = body.responseFormat()

    /**
     * Parameters to control the sampling strategy
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun samplingParams(): SamplingParams? = body.samplingParams()

    /**
     * (Optional) Whether tool use is required or automatic. Defaults to ToolChoice.auto. ..
     * deprecated:: Use tool_config instead.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun toolChoice(): ToolChoice? = body.toolChoice()

    /**
     * (Optional) Configuration for tool use.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun toolConfig(): ToolConfig? = body.toolConfig()

    /**
     * (Optional) Instructs the model how to format tool calls. By default, Llama Stack will attempt
     * to use a format that is best adapted to the model. - `ToolPromptFormat.json`: The tool calls
     * are formatted as a JSON object. - `ToolPromptFormat.function_tag`: The tool calls are
     * enclosed in a <function=function_name> tag. - `ToolPromptFormat.python_list`: The tool calls
     * are output as Python syntax -- a list of function calls. .. deprecated:: Use tool_config
     * instead.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun toolPromptFormat(): ToolPromptFormat? = body.toolPromptFormat()

    /**
     * (Optional) List of tool definitions available to the model
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun tools(): List<Tool>? = body.tools()

    /**
     * Returns the raw JSON value of [messages].
     *
     * Unlike [messages], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _messages(): JsonField<List<Message>> = body._messages()

    /**
     * Returns the raw JSON value of [modelId].
     *
     * Unlike [modelId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _modelId(): JsonField<String> = body._modelId()

    /**
     * Returns the raw JSON value of [logprobs].
     *
     * Unlike [logprobs], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _logprobs(): JsonField<Logprobs> = body._logprobs()

    /**
     * Returns the raw JSON value of [responseFormat].
     *
     * Unlike [responseFormat], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _responseFormat(): JsonField<ResponseFormat> = body._responseFormat()

    /**
     * Returns the raw JSON value of [samplingParams].
     *
     * Unlike [samplingParams], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _samplingParams(): JsonField<SamplingParams> = body._samplingParams()

    /**
     * Returns the raw JSON value of [toolChoice].
     *
     * Unlike [toolChoice], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _toolChoice(): JsonField<ToolChoice> = body._toolChoice()

    /**
     * Returns the raw JSON value of [toolConfig].
     *
     * Unlike [toolConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _toolConfig(): JsonField<ToolConfig> = body._toolConfig()

    /**
     * Returns the raw JSON value of [toolPromptFormat].
     *
     * Unlike [toolPromptFormat], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _toolPromptFormat(): JsonField<ToolPromptFormat> = body._toolPromptFormat()

    /**
     * Returns the raw JSON value of [tools].
     *
     * Unlike [tools], this method doesn't throw if the JSON field has an unexpected type.
     */
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

        /**
         * List of messages in the conversation
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun messages(): List<Message> = messages.getRequired("messages")

        /**
         * The identifier of the model to use. The model must be registered with Llama Stack and
         * available via the /models endpoint.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun modelId(): String = modelId.getRequired("model_id")

        /**
         * (Optional) If specified, log probabilities for each token position will be returned.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun logprobs(): Logprobs? = logprobs.getNullable("logprobs")

        /**
         * (Optional) Grammar specification for guided (structured) decoding. There are two
         * options: - `ResponseFormat.json_schema`: The grammar is a JSON schema. Most providers
         * support this format. - `ResponseFormat.grammar`: The grammar is a BNF grammar. This
         * format is more flexible, but not all providers support it.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun responseFormat(): ResponseFormat? = responseFormat.getNullable("response_format")

        /**
         * Parameters to control the sampling strategy
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun samplingParams(): SamplingParams? = samplingParams.getNullable("sampling_params")

        /**
         * (Optional) Whether tool use is required or automatic. Defaults to ToolChoice.auto. ..
         * deprecated:: Use tool_config instead.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun toolChoice(): ToolChoice? = toolChoice.getNullable("tool_choice")

        /**
         * (Optional) Configuration for tool use.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun toolConfig(): ToolConfig? = toolConfig.getNullable("tool_config")

        /**
         * (Optional) Instructs the model how to format tool calls. By default, Llama Stack will
         * attempt to use a format that is best adapted to the model. - `ToolPromptFormat.json`: The
         * tool calls are formatted as a JSON object. - `ToolPromptFormat.function_tag`: The tool
         * calls are enclosed in a <function=function_name> tag. - `ToolPromptFormat.python_list`:
         * The tool calls are output as Python syntax -- a list of function calls. .. deprecated::
         * Use tool_config instead.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun toolPromptFormat(): ToolPromptFormat? =
            toolPromptFormat.getNullable("tool_prompt_format")

        /**
         * (Optional) List of tool definitions available to the model
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun tools(): List<Tool>? = tools.getNullable("tools")

        /**
         * Returns the raw JSON value of [messages].
         *
         * Unlike [messages], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("messages")
        @ExcludeMissing
        fun _messages(): JsonField<List<Message>> = messages

        /**
         * Returns the raw JSON value of [modelId].
         *
         * Unlike [modelId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model_id") @ExcludeMissing fun _modelId(): JsonField<String> = modelId

        /**
         * Returns the raw JSON value of [logprobs].
         *
         * Unlike [logprobs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("logprobs") @ExcludeMissing fun _logprobs(): JsonField<Logprobs> = logprobs

        /**
         * Returns the raw JSON value of [responseFormat].
         *
         * Unlike [responseFormat], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("response_format")
        @ExcludeMissing
        fun _responseFormat(): JsonField<ResponseFormat> = responseFormat

        /**
         * Returns the raw JSON value of [samplingParams].
         *
         * Unlike [samplingParams], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sampling_params")
        @ExcludeMissing
        fun _samplingParams(): JsonField<SamplingParams> = samplingParams

        /**
         * Returns the raw JSON value of [toolChoice].
         *
         * Unlike [toolChoice], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tool_choice")
        @ExcludeMissing
        fun _toolChoice(): JsonField<ToolChoice> = toolChoice

        /**
         * Returns the raw JSON value of [toolConfig].
         *
         * Unlike [toolConfig], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tool_config")
        @ExcludeMissing
        fun _toolConfig(): JsonField<ToolConfig> = toolConfig

        /**
         * Returns the raw JSON value of [toolPromptFormat].
         *
         * Unlike [toolPromptFormat], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("tool_prompt_format")
        @ExcludeMissing
        fun _toolPromptFormat(): JsonField<ToolPromptFormat> = toolPromptFormat

        /**
         * Returns the raw JSON value of [tools].
         *
         * Unlike [tools], this method doesn't throw if the JSON field has an unexpected type.
         */
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

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .messages()
             * .modelId()
             * ```
             */
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

            /**
             * Sets [Builder.messages] to an arbitrary JSON value.
             *
             * You should usually call [Builder.messages] with a well-typed `List<Message>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun messages(messages: JsonField<List<Message>>) = apply {
                this.messages = messages.map { it.toMutableList() }
            }

            /**
             * Adds a single [Message] to [messages].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMessage(message: Message) = apply {
                messages =
                    (messages ?: JsonField.of(mutableListOf())).also {
                        checkKnown("messages", it).add(message)
                    }
            }

            /** Alias for calling [addMessage] with `Message.ofUser(user)`. */
            fun addMessage(user: UserMessage) = addMessage(Message.ofUser(user))

            /**
             * Alias for calling [addMessage] with the following:
             * ```kotlin
             * UserMessage.builder()
             *     .content(content)
             *     .build()
             * ```
             */
            fun addUserMessage(content: InterleavedContent) =
                addMessage(UserMessage.builder().content(content).build())

            /** Alias for calling [addUserMessage] with `InterleavedContent.ofString(string)`. */
            fun addUserMessage(string: String) = addUserMessage(InterleavedContent.ofString(string))

            /**
             * Alias for calling [addUserMessage] with
             * `InterleavedContent.ofImageContentItem(imageContentItem)`.
             */
            fun addUserMessage(imageContentItem: InterleavedContent.ImageContentItem) =
                addUserMessage(InterleavedContent.ofImageContentItem(imageContentItem))

            /**
             * Alias for calling [addUserMessage] with
             * `InterleavedContent.ofTextContentItem(textContentItem)`.
             */
            fun addUserMessage(textContentItem: InterleavedContent.TextContentItem) =
                addUserMessage(InterleavedContent.ofTextContentItem(textContentItem))

            /** Alias for calling [addUserMessage] with `InterleavedContent.ofItems(items)`. */
            fun addUserMessageOfItems(items: List<InterleavedContentItem>) =
                addUserMessage(InterleavedContent.ofItems(items))

            /** Alias for calling [addMessage] with `Message.ofSystem(system)`. */
            fun addMessage(system: SystemMessage) = addMessage(Message.ofSystem(system))

            /**
             * Alias for calling [addMessage] with the following:
             * ```kotlin
             * SystemMessage.builder()
             *     .content(content)
             *     .build()
             * ```
             */
            fun addSystemMessage(content: InterleavedContent) =
                addMessage(SystemMessage.builder().content(content).build())

            /** Alias for calling [addSystemMessage] with `InterleavedContent.ofString(string)`. */
            fun addSystemMessage(string: String) =
                addSystemMessage(InterleavedContent.ofString(string))

            /**
             * Alias for calling [addSystemMessage] with
             * `InterleavedContent.ofImageContentItem(imageContentItem)`.
             */
            fun addSystemMessage(imageContentItem: InterleavedContent.ImageContentItem) =
                addSystemMessage(InterleavedContent.ofImageContentItem(imageContentItem))

            /**
             * Alias for calling [addSystemMessage] with
             * `InterleavedContent.ofTextContentItem(textContentItem)`.
             */
            fun addSystemMessage(textContentItem: InterleavedContent.TextContentItem) =
                addSystemMessage(InterleavedContent.ofTextContentItem(textContentItem))

            /** Alias for calling [addSystemMessage] with `InterleavedContent.ofItems(items)`. */
            fun addSystemMessageOfItems(items: List<InterleavedContentItem>) =
                addSystemMessage(InterleavedContent.ofItems(items))

            /** Alias for calling [addMessage] with `Message.ofToolResponse(toolResponse)`. */
            fun addMessage(toolResponse: ToolResponseMessage) =
                addMessage(Message.ofToolResponse(toolResponse))

            /** Alias for calling [addMessage] with `Message.ofCompletion(completion)`. */
            fun addMessage(completion: CompletionMessage) =
                addMessage(Message.ofCompletion(completion))

            /**
             * The identifier of the model to use. The model must be registered with Llama Stack and
             * available via the /models endpoint.
             */
            fun modelId(modelId: String) = modelId(JsonField.of(modelId))

            /**
             * Sets [Builder.modelId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modelId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modelId(modelId: JsonField<String>) = apply { this.modelId = modelId }

            /**
             * (Optional) If specified, log probabilities for each token position will be returned.
             */
            fun logprobs(logprobs: Logprobs) = logprobs(JsonField.of(logprobs))

            /**
             * Sets [Builder.logprobs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.logprobs] with a well-typed [Logprobs] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Sets [Builder.responseFormat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.responseFormat] with a well-typed [ResponseFormat]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun responseFormat(responseFormat: JsonField<ResponseFormat>) = apply {
                this.responseFormat = responseFormat
            }

            /**
             * Alias for calling [responseFormat] with `ResponseFormat.ofJsonSchema(jsonSchema)`.
             */
            fun responseFormat(jsonSchema: ResponseFormat.JsonSchemaResponseFormat) =
                responseFormat(ResponseFormat.ofJsonSchema(jsonSchema))

            /**
             * Alias for calling [responseFormat] with the following:
             * ```kotlin
             * ResponseFormat.JsonSchemaResponseFormat.builder()
             *     .jsonSchema(jsonSchema)
             *     .build()
             * ```
             */
            fun jsonSchemaResponseFormat(
                jsonSchema: ResponseFormat.JsonSchemaResponseFormat.JsonSchema
            ) =
                responseFormat(
                    ResponseFormat.JsonSchemaResponseFormat.builder().jsonSchema(jsonSchema).build()
                )

            /** Alias for calling [responseFormat] with `ResponseFormat.ofGrammar(grammar)`. */
            fun responseFormat(grammar: ResponseFormat.GrammarResponseFormat) =
                responseFormat(ResponseFormat.ofGrammar(grammar))

            /**
             * Alias for calling [responseFormat] with the following:
             * ```kotlin
             * ResponseFormat.GrammarResponseFormat.builder()
             *     .bnf(bnf)
             *     .build()
             * ```
             */
            fun grammarResponseFormat(bnf: ResponseFormat.GrammarResponseFormat.Bnf) =
                responseFormat(ResponseFormat.GrammarResponseFormat.builder().bnf(bnf).build())

            /** Parameters to control the sampling strategy */
            fun samplingParams(samplingParams: SamplingParams) =
                samplingParams(JsonField.of(samplingParams))

            /**
             * Sets [Builder.samplingParams] to an arbitrary JSON value.
             *
             * You should usually call [Builder.samplingParams] with a well-typed [SamplingParams]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun samplingParams(samplingParams: JsonField<SamplingParams>) = apply {
                this.samplingParams = samplingParams
            }

            /**
             * (Optional) Whether tool use is required or automatic. Defaults to ToolChoice.auto. ..
             * deprecated:: Use tool_config instead.
             */
            fun toolChoice(toolChoice: ToolChoice) = toolChoice(JsonField.of(toolChoice))

            /**
             * Sets [Builder.toolChoice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.toolChoice] with a well-typed [ToolChoice] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun toolChoice(toolChoice: JsonField<ToolChoice>) = apply {
                this.toolChoice = toolChoice
            }

            /** (Optional) Configuration for tool use. */
            fun toolConfig(toolConfig: ToolConfig) = toolConfig(JsonField.of(toolConfig))

            /**
             * Sets [Builder.toolConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.toolConfig] with a well-typed [ToolConfig] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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
             * Sets [Builder.toolPromptFormat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.toolPromptFormat] with a well-typed
             * [ToolPromptFormat] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun toolPromptFormat(toolPromptFormat: JsonField<ToolPromptFormat>) = apply {
                this.toolPromptFormat = toolPromptFormat
            }

            /** (Optional) List of tool definitions available to the model */
            fun tools(tools: List<Tool>) = tools(JsonField.of(tools))

            /**
             * Sets [Builder.tools] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tools] with a well-typed `List<Tool>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tools(tools: JsonField<List<Tool>>) = apply {
                this.tools = tools.map { it.toMutableList() }
            }

            /**
             * Adds a single [Tool] to [tools].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTool(tool: Tool) = apply {
                tools =
                    (tools ?: JsonField.of(mutableListOf())).also {
                        checkKnown("tools", it).add(tool)
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

        /**
         * Returns a mutable builder for constructing an instance of
         * [InferenceChatCompletionParams].
         *
         * The following fields are required:
         * ```kotlin
         * .messages()
         * .modelId()
         * ```
         */
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

        /**
         * Sets [Builder.messages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messages] with a well-typed `List<Message>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun messages(messages: JsonField<List<Message>>) = apply { body.messages(messages) }

        /**
         * Adds a single [Message] to [messages].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMessage(message: Message) = apply { body.addMessage(message) }

        /** Alias for calling [addMessage] with `Message.ofUser(user)`. */
        fun addMessage(user: UserMessage) = apply { body.addMessage(user) }

        /**
         * Alias for calling [addMessage] with the following:
         * ```kotlin
         * UserMessage.builder()
         *     .content(content)
         *     .build()
         * ```
         */
        fun addUserMessage(content: InterleavedContent) = apply { body.addUserMessage(content) }

        /** Alias for calling [addUserMessage] with `InterleavedContent.ofString(string)`. */
        fun addUserMessage(string: String) = apply { body.addUserMessage(string) }

        /**
         * Alias for calling [addUserMessage] with
         * `InterleavedContent.ofImageContentItem(imageContentItem)`.
         */
        fun addUserMessage(imageContentItem: InterleavedContent.ImageContentItem) = apply {
            body.addUserMessage(imageContentItem)
        }

        /**
         * Alias for calling [addUserMessage] with
         * `InterleavedContent.ofTextContentItem(textContentItem)`.
         */
        fun addUserMessage(textContentItem: InterleavedContent.TextContentItem) = apply {
            body.addUserMessage(textContentItem)
        }

        /** Alias for calling [addUserMessage] with `InterleavedContent.ofItems(items)`. */
        fun addUserMessageOfItems(items: List<InterleavedContentItem>) = apply {
            body.addUserMessageOfItems(items)
        }

        /** Alias for calling [addMessage] with `Message.ofSystem(system)`. */
        fun addMessage(system: SystemMessage) = apply { body.addMessage(system) }

        /**
         * Alias for calling [addMessage] with the following:
         * ```kotlin
         * SystemMessage.builder()
         *     .content(content)
         *     .build()
         * ```
         */
        fun addSystemMessage(content: InterleavedContent) = apply { body.addSystemMessage(content) }

        /** Alias for calling [addSystemMessage] with `InterleavedContent.ofString(string)`. */
        fun addSystemMessage(string: String) = apply { body.addSystemMessage(string) }

        /**
         * Alias for calling [addSystemMessage] with
         * `InterleavedContent.ofImageContentItem(imageContentItem)`.
         */
        fun addSystemMessage(imageContentItem: InterleavedContent.ImageContentItem) = apply {
            body.addSystemMessage(imageContentItem)
        }

        /**
         * Alias for calling [addSystemMessage] with
         * `InterleavedContent.ofTextContentItem(textContentItem)`.
         */
        fun addSystemMessage(textContentItem: InterleavedContent.TextContentItem) = apply {
            body.addSystemMessage(textContentItem)
        }

        /** Alias for calling [addSystemMessage] with `InterleavedContent.ofItems(items)`. */
        fun addSystemMessageOfItems(items: List<InterleavedContentItem>) = apply {
            body.addSystemMessageOfItems(items)
        }

        /** Alias for calling [addMessage] with `Message.ofToolResponse(toolResponse)`. */
        fun addMessage(toolResponse: ToolResponseMessage) = apply { body.addMessage(toolResponse) }

        /** Alias for calling [addMessage] with `Message.ofCompletion(completion)`. */
        fun addMessage(completion: CompletionMessage) = apply { body.addMessage(completion) }

        /**
         * The identifier of the model to use. The model must be registered with Llama Stack and
         * available via the /models endpoint.
         */
        fun modelId(modelId: String) = apply { body.modelId(modelId) }

        /**
         * Sets [Builder.modelId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modelId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun modelId(modelId: JsonField<String>) = apply { body.modelId(modelId) }

        /** (Optional) If specified, log probabilities for each token position will be returned. */
        fun logprobs(logprobs: Logprobs) = apply { body.logprobs(logprobs) }

        /**
         * Sets [Builder.logprobs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logprobs] with a well-typed [Logprobs] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
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
         * Sets [Builder.responseFormat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.responseFormat] with a well-typed [ResponseFormat] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun responseFormat(responseFormat: JsonField<ResponseFormat>) = apply {
            body.responseFormat(responseFormat)
        }

        /** Alias for calling [responseFormat] with `ResponseFormat.ofJsonSchema(jsonSchema)`. */
        fun responseFormat(jsonSchema: ResponseFormat.JsonSchemaResponseFormat) = apply {
            body.responseFormat(jsonSchema)
        }

        /**
         * Alias for calling [responseFormat] with the following:
         * ```kotlin
         * ResponseFormat.JsonSchemaResponseFormat.builder()
         *     .jsonSchema(jsonSchema)
         *     .build()
         * ```
         */
        fun jsonSchemaResponseFormat(
            jsonSchema: ResponseFormat.JsonSchemaResponseFormat.JsonSchema
        ) = apply { body.jsonSchemaResponseFormat(jsonSchema) }

        /** Alias for calling [responseFormat] with `ResponseFormat.ofGrammar(grammar)`. */
        fun responseFormat(grammar: ResponseFormat.GrammarResponseFormat) = apply {
            body.responseFormat(grammar)
        }

        /**
         * Alias for calling [responseFormat] with the following:
         * ```kotlin
         * ResponseFormat.GrammarResponseFormat.builder()
         *     .bnf(bnf)
         *     .build()
         * ```
         */
        fun grammarResponseFormat(bnf: ResponseFormat.GrammarResponseFormat.Bnf) = apply {
            body.grammarResponseFormat(bnf)
        }

        /** Parameters to control the sampling strategy */
        fun samplingParams(samplingParams: SamplingParams) = apply {
            body.samplingParams(samplingParams)
        }

        /**
         * Sets [Builder.samplingParams] to an arbitrary JSON value.
         *
         * You should usually call [Builder.samplingParams] with a well-typed [SamplingParams] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun samplingParams(samplingParams: JsonField<SamplingParams>) = apply {
            body.samplingParams(samplingParams)
        }

        /**
         * (Optional) Whether tool use is required or automatic. Defaults to ToolChoice.auto. ..
         * deprecated:: Use tool_config instead.
         */
        fun toolChoice(toolChoice: ToolChoice) = apply { body.toolChoice(toolChoice) }

        /**
         * Sets [Builder.toolChoice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolChoice] with a well-typed [ToolChoice] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun toolChoice(toolChoice: JsonField<ToolChoice>) = apply { body.toolChoice(toolChoice) }

        /** (Optional) Configuration for tool use. */
        fun toolConfig(toolConfig: ToolConfig) = apply { body.toolConfig(toolConfig) }

        /**
         * Sets [Builder.toolConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolConfig] with a well-typed [ToolConfig] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
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
         * Sets [Builder.toolPromptFormat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolPromptFormat] with a well-typed [ToolPromptFormat]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun toolPromptFormat(toolPromptFormat: JsonField<ToolPromptFormat>) = apply {
            body.toolPromptFormat(toolPromptFormat)
        }

        /** (Optional) List of tool definitions available to the model */
        fun tools(tools: List<Tool>) = apply { body.tools(tools) }

        /**
         * Sets [Builder.tools] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tools] with a well-typed `List<Tool>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tools(tools: JsonField<List<Tool>>) = apply { body.tools(tools) }

        /**
         * Adds a single [Tool] to [tools].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
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

        /**
         * How many tokens (for each position) to return log probabilities for.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun topK(): Long? = topK.getNullable("top_k")

        /**
         * Returns the raw JSON value of [topK].
         *
         * Unlike [topK], this method doesn't throw if the JSON field has an unexpected type.
         */
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

            /** Returns a mutable builder for constructing an instance of [Logprobs]. */
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

            /**
             * Sets [Builder.topK] to an arbitrary JSON value.
             *
             * You should usually call [Builder.topK] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
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
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun systemMessageBehavior(): SystemMessageBehavior? =
            systemMessageBehavior.getNullable("system_message_behavior")

        /**
         * (Optional) Whether tool use is automatic, required, or none. Can also specify a tool name
         * to use a specific tool. Defaults to ToolChoice.auto.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun toolChoice(): ToolChoice? = toolChoice.getNullable("tool_choice")

        /**
         * (Optional) Instructs the model how to format tool calls. By default, Llama Stack will
         * attempt to use a format that is best adapted to the model. - `ToolPromptFormat.json`: The
         * tool calls are formatted as a JSON object. - `ToolPromptFormat.function_tag`: The tool
         * calls are enclosed in a <function=function_name> tag. - `ToolPromptFormat.python_list`:
         * The tool calls are output as Python syntax -- a list of function calls.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun toolPromptFormat(): ToolPromptFormat? =
            toolPromptFormat.getNullable("tool_prompt_format")

        /**
         * Returns the raw JSON value of [systemMessageBehavior].
         *
         * Unlike [systemMessageBehavior], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("system_message_behavior")
        @ExcludeMissing
        fun _systemMessageBehavior(): JsonField<SystemMessageBehavior> = systemMessageBehavior

        /**
         * Returns the raw JSON value of [toolChoice].
         *
         * Unlike [toolChoice], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tool_choice")
        @ExcludeMissing
        fun _toolChoice(): JsonField<ToolChoice> = toolChoice

        /**
         * Returns the raw JSON value of [toolPromptFormat].
         *
         * Unlike [toolPromptFormat], this method doesn't throw if the JSON field has an unexpected
         * type.
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

            /** Returns a mutable builder for constructing an instance of [ToolConfig]. */
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
             * Sets [Builder.systemMessageBehavior] to an arbitrary JSON value.
             *
             * You should usually call [Builder.systemMessageBehavior] with a well-typed
             * [SystemMessageBehavior] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
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
             * Sets [Builder.toolChoice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.toolChoice] with a well-typed [ToolChoice] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun toolChoice(toolChoice: JsonField<ToolChoice>) = apply {
                this.toolChoice = toolChoice
            }

            /**
             * Sets [toolChoice] to an arbitrary [String].
             *
             * You should usually call [toolChoice] with a well-typed [ToolChoice] constant instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Sets [Builder.toolPromptFormat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.toolPromptFormat] with a well-typed
             * [ToolPromptFormat] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
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

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun toolName(): ToolName = toolName.getRequired("tool_name")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun description(): String? = description.getNullable("description")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun parameters(): Parameters? = parameters.getNullable("parameters")

        /**
         * Returns the raw JSON value of [toolName].
         *
         * Unlike [toolName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tool_name") @ExcludeMissing fun _toolName(): JsonField<ToolName> = toolName

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [parameters].
         *
         * Unlike [parameters], this method doesn't throw if the JSON field has an unexpected type.
         */
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

            /**
             * Returns a mutable builder for constructing an instance of [Tool].
             *
             * The following fields are required:
             * ```kotlin
             * .toolName()
             * ```
             */
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

            /**
             * Sets [Builder.toolName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.toolName] with a well-typed [ToolName] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun toolName(toolName: JsonField<ToolName>) = apply { this.toolName = toolName }

            /**
             * Sets [toolName] to an arbitrary [String].
             *
             * You should usually call [toolName] with a well-typed [ToolName] constant instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun toolName(value: String) = toolName(ToolName.of(value))

            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun parameters(parameters: Parameters) = parameters(JsonField.of(parameters))

            /**
             * Sets [Builder.parameters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parameters] with a well-typed [Parameters] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

                /** Returns a mutable builder for constructing an instance of [Parameters]. */
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
