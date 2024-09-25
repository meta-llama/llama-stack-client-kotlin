// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama_stack_client.api.core.BaseDeserializer
import com.llama_stack_client.api.core.BaseSerializer
import com.llama_stack_client.api.core.Enum
import com.llama_stack_client.api.core.ExcludeMissing
import com.llama_stack_client.api.core.JsonField
import com.llama_stack_client.api.core.JsonValue
import com.llama_stack_client.api.core.NoAutoDetect
import com.llama_stack_client.api.core.getOrThrow
import com.llama_stack_client.api.core.toUnmodifiable
import com.llama_stack_client.api.errors.LlamaStackClientInvalidDataException
import com.llama_stack_client.api.models.*
import java.util.Objects

class BatchInferenceChatCompletionParams
constructor(
    private val messagesBatch: List<List<Message>>,
    private val model: String,
    private val logprobs: Logprobs?,
    private val samplingParams: SamplingParams?,
    private val toolChoice: ToolChoice?,
    private val toolPromptFormat: ToolPromptFormat?,
    private val tools: List<Tool>?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun messagesBatch(): List<List<Message>> = messagesBatch

    fun model(): String = model

    fun logprobs(): Logprobs? = logprobs

    fun samplingParams(): SamplingParams? = samplingParams

    fun toolChoice(): ToolChoice? = toolChoice

    fun toolPromptFormat(): ToolPromptFormat? = toolPromptFormat

    fun tools(): List<Tool>? = tools

    internal fun getBody(): BatchInferenceChatCompletionBody {
        return BatchInferenceChatCompletionBody(
            messagesBatch,
            model,
            logprobs,
            samplingParams,
            toolChoice,
            toolPromptFormat,
            tools,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = BatchInferenceChatCompletionBody.Builder::class)
    @NoAutoDetect
    class BatchInferenceChatCompletionBody
    internal constructor(
        private val messagesBatch: List<List<Message>>?,
        private val model: String?,
        private val logprobs: Logprobs?,
        private val samplingParams: SamplingParams?,
        private val toolChoice: ToolChoice?,
        private val toolPromptFormat: ToolPromptFormat?,
        private val tools: List<Tool>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("messages_batch") fun messagesBatch(): List<List<Message>>? = messagesBatch

        @JsonProperty("model") fun model(): String? = model

        @JsonProperty("logprobs") fun logprobs(): Logprobs? = logprobs

        @JsonProperty("sampling_params") fun samplingParams(): SamplingParams? = samplingParams

        @JsonProperty("tool_choice") fun toolChoice(): ToolChoice? = toolChoice

        /**
         * `json` -- Refers to the json format for calling tools. The json format takes the form
         * like { "type": "function", "function" : { "name": "function_name", "description":
         * "function_description", "parameters": {...} } }
         *
         * `function_tag` -- This is an example of how you could define your own user defined format
         * for making tool calls. The function_tag format looks like this,
         * <function=function_name>(parameters)</function>
         *
         * The detailed prompts for each of these formats are added to llama cli
         */
        @JsonProperty("tool_prompt_format")
        fun toolPromptFormat(): ToolPromptFormat? = toolPromptFormat

        @JsonProperty("tools") fun tools(): List<Tool>? = tools

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BatchInferenceChatCompletionBody &&
                this.messagesBatch == other.messagesBatch &&
                this.model == other.model &&
                this.logprobs == other.logprobs &&
                this.samplingParams == other.samplingParams &&
                this.toolChoice == other.toolChoice &&
                this.toolPromptFormat == other.toolPromptFormat &&
                this.tools == other.tools &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        messagesBatch,
                        model,
                        logprobs,
                        samplingParams,
                        toolChoice,
                        toolPromptFormat,
                        tools,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "BatchInferenceChatCompletionBody{messagesBatch=$messagesBatch, model=$model, logprobs=$logprobs, samplingParams=$samplingParams, toolChoice=$toolChoice, toolPromptFormat=$toolPromptFormat, tools=$tools, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var messagesBatch: List<List<Message>>? = null
            private var model: String? = null
            private var logprobs: Logprobs? = null
            private var samplingParams: SamplingParams? = null
            private var toolChoice: ToolChoice? = null
            private var toolPromptFormat: ToolPromptFormat? = null
            private var tools: List<Tool>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(batchInferenceChatCompletionBody: BatchInferenceChatCompletionBody) =
                apply {
                    this.messagesBatch = batchInferenceChatCompletionBody.messagesBatch
                    this.model = batchInferenceChatCompletionBody.model
                    this.logprobs = batchInferenceChatCompletionBody.logprobs
                    this.samplingParams = batchInferenceChatCompletionBody.samplingParams
                    this.toolChoice = batchInferenceChatCompletionBody.toolChoice
                    this.toolPromptFormat = batchInferenceChatCompletionBody.toolPromptFormat
                    this.tools = batchInferenceChatCompletionBody.tools
                    additionalProperties(batchInferenceChatCompletionBody.additionalProperties)
                }

            @JsonProperty("messages_batch")
            fun messagesBatch(messagesBatch: List<List<Message>>) = apply {
                this.messagesBatch = messagesBatch
            }

            @JsonProperty("model") fun model(model: String) = apply { this.model = model }

            @JsonProperty("logprobs")
            fun logprobs(logprobs: Logprobs) = apply { this.logprobs = logprobs }

            @JsonProperty("sampling_params")
            fun samplingParams(samplingParams: SamplingParams) = apply {
                this.samplingParams = samplingParams
            }

            @JsonProperty("tool_choice")
            fun toolChoice(toolChoice: ToolChoice) = apply { this.toolChoice = toolChoice }

            /**
             * `json` -- Refers to the json format for calling tools. The json format takes the form
             * like { "type": "function", "function" : { "name": "function_name", "description":
             * "function_description", "parameters": {...} } }
             *
             * `function_tag` -- This is an example of how you could define your own user defined
             * format for making tool calls. The function_tag format looks like this,
             * <function=function_name>(parameters)</function>
             *
             * The detailed prompts for each of these formats are added to llama cli
             */
            @JsonProperty("tool_prompt_format")
            fun toolPromptFormat(toolPromptFormat: ToolPromptFormat) = apply {
                this.toolPromptFormat = toolPromptFormat
            }

            @JsonProperty("tools") fun tools(tools: List<Tool>) = apply { this.tools = tools }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): BatchInferenceChatCompletionBody =
                BatchInferenceChatCompletionBody(
                    checkNotNull(messagesBatch) { "`messagesBatch` is required but was not set" }
                        .toUnmodifiable(),
                    checkNotNull(model) { "`model` is required but was not set" },
                    logprobs,
                    samplingParams,
                    toolChoice,
                    toolPromptFormat,
                    tools?.toUnmodifiable(),
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BatchInferenceChatCompletionParams &&
            this.messagesBatch == other.messagesBatch &&
            this.model == other.model &&
            this.logprobs == other.logprobs &&
            this.samplingParams == other.samplingParams &&
            this.toolChoice == other.toolChoice &&
            this.toolPromptFormat == other.toolPromptFormat &&
            this.tools == other.tools &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            messagesBatch,
            model,
            logprobs,
            samplingParams,
            toolChoice,
            toolPromptFormat,
            tools,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "BatchInferenceChatCompletionParams{messagesBatch=$messagesBatch, model=$model, logprobs=$logprobs, samplingParams=$samplingParams, toolChoice=$toolChoice, toolPromptFormat=$toolPromptFormat, tools=$tools, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var messagesBatch: MutableList<List<Message>> = mutableListOf()
        private var model: String? = null
        private var logprobs: Logprobs? = null
        private var samplingParams: SamplingParams? = null
        private var toolChoice: ToolChoice? = null
        private var toolPromptFormat: ToolPromptFormat? = null
        private var tools: MutableList<Tool> = mutableListOf()
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(batchInferenceChatCompletionParams: BatchInferenceChatCompletionParams) =
            apply {
                this.messagesBatch(batchInferenceChatCompletionParams.messagesBatch)
                this.model = batchInferenceChatCompletionParams.model
                this.logprobs = batchInferenceChatCompletionParams.logprobs
                this.samplingParams = batchInferenceChatCompletionParams.samplingParams
                this.toolChoice = batchInferenceChatCompletionParams.toolChoice
                this.toolPromptFormat = batchInferenceChatCompletionParams.toolPromptFormat
                this.tools(batchInferenceChatCompletionParams.tools ?: listOf())
                additionalQueryParams(batchInferenceChatCompletionParams.additionalQueryParams)
                additionalHeaders(batchInferenceChatCompletionParams.additionalHeaders)
                additionalBodyProperties(
                    batchInferenceChatCompletionParams.additionalBodyProperties
                )
            }

        fun messagesBatch(messagesBatch: List<List<Message>>) = apply {
            this.messagesBatch.clear()
            this.messagesBatch.addAll(messagesBatch)
        }

        fun addMessagesBatch(messagesBatch: List<Message>) = apply {
            this.messagesBatch.add(messagesBatch)
        }

        fun model(model: String) = apply { this.model = model }

        fun logprobs(logprobs: Logprobs) = apply { this.logprobs = logprobs }

        fun samplingParams(samplingParams: SamplingParams) = apply {
            this.samplingParams = samplingParams
        }

        fun toolChoice(toolChoice: ToolChoice) = apply { this.toolChoice = toolChoice }

        /**
         * `json` -- Refers to the json format for calling tools. The json format takes the form
         * like { "type": "function", "function" : { "name": "function_name", "description":
         * "function_description", "parameters": {...} } }
         *
         * `function_tag` -- This is an example of how you could define your own user defined format
         * for making tool calls. The function_tag format looks like this,
         * <function=function_name>(parameters)</function>
         *
         * The detailed prompts for each of these formats are added to llama cli
         */
        fun toolPromptFormat(toolPromptFormat: ToolPromptFormat) = apply {
            this.toolPromptFormat = toolPromptFormat
        }

        fun tools(tools: List<Tool>) = apply {
            this.tools.clear()
            this.tools.addAll(tools)
        }

        fun addTool(tool: Tool) = apply { this.tools.add(tool) }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): BatchInferenceChatCompletionParams =
            BatchInferenceChatCompletionParams(
                checkNotNull(messagesBatch) { "`messagesBatch` is required but was not set" }
                    .toUnmodifiable(),
                checkNotNull(model) { "`model` is required but was not set" },
                logprobs,
                samplingParams,
                toolChoice,
                toolPromptFormat,
                if (tools.size == 0) null else tools.toUnmodifiable(),
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(using = Message.Deserializer::class)
    @JsonSerialize(using = Message.Serializer::class)
    class Message
    private constructor(
        private val userMessage: UserMessage? = null,
        private val systemMessage: SystemMessage? = null,
        private val toolResponseMessage: ToolResponseMessage? = null,
        private val completionMessage: CompletionMessage? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun userMessage(): UserMessage? = userMessage

        fun systemMessage(): SystemMessage? = systemMessage

        fun toolResponseMessage(): ToolResponseMessage? = toolResponseMessage

        fun completionMessage(): CompletionMessage? = completionMessage

        fun isUserMessage(): Boolean = userMessage != null

        fun isSystemMessage(): Boolean = systemMessage != null

        fun isToolResponseMessage(): Boolean = toolResponseMessage != null

        fun isCompletionMessage(): Boolean = completionMessage != null

        fun asUserMessage(): UserMessage = userMessage.getOrThrow("userMessage")

        fun asSystemMessage(): SystemMessage = systemMessage.getOrThrow("systemMessage")

        fun asToolResponseMessage(): ToolResponseMessage =
            toolResponseMessage.getOrThrow("toolResponseMessage")

        fun asCompletionMessage(): CompletionMessage =
            completionMessage.getOrThrow("completionMessage")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                userMessage != null -> visitor.visitUserMessage(userMessage)
                systemMessage != null -> visitor.visitSystemMessage(systemMessage)
                toolResponseMessage != null -> visitor.visitToolResponseMessage(toolResponseMessage)
                completionMessage != null -> visitor.visitCompletionMessage(completionMessage)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): Message = apply {
            if (!validated) {
                if (
                    userMessage == null &&
                        systemMessage == null &&
                        toolResponseMessage == null &&
                        completionMessage == null
                ) {
                    throw LlamaStackClientInvalidDataException("Unknown Message: $_json")
                }
                userMessage?.validate()
                systemMessage?.validate()
                toolResponseMessage?.validate()
                completionMessage?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Message &&
                this.userMessage == other.userMessage &&
                this.systemMessage == other.systemMessage &&
                this.toolResponseMessage == other.toolResponseMessage &&
                this.completionMessage == other.completionMessage
        }

        override fun hashCode(): Int {
            return Objects.hash(
                userMessage,
                systemMessage,
                toolResponseMessage,
                completionMessage,
            )
        }

        override fun toString(): String {
            return when {
                userMessage != null -> "Message{userMessage=$userMessage}"
                systemMessage != null -> "Message{systemMessage=$systemMessage}"
                toolResponseMessage != null -> "Message{toolResponseMessage=$toolResponseMessage}"
                completionMessage != null -> "Message{completionMessage=$completionMessage}"
                _json != null -> "Message{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Message")
            }
        }

        companion object {

            fun ofUserMessage(userMessage: UserMessage) = Message(userMessage = userMessage)

            fun ofSystemMessage(systemMessage: SystemMessage) =
                Message(systemMessage = systemMessage)

            fun ofToolResponseMessage(toolResponseMessage: ToolResponseMessage) =
                Message(toolResponseMessage = toolResponseMessage)

            fun ofCompletionMessage(completionMessage: CompletionMessage) =
                Message(completionMessage = completionMessage)
        }

        interface Visitor<out T> {

            fun visitUserMessage(userMessage: UserMessage): T

            fun visitSystemMessage(systemMessage: SystemMessage): T

            fun visitToolResponseMessage(toolResponseMessage: ToolResponseMessage): T

            fun visitCompletionMessage(completionMessage: CompletionMessage): T

            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown Message: $json")
            }
        }

        class Deserializer : BaseDeserializer<Message>(Message::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Message {
                val json = JsonValue.fromJsonNode(node)
                tryDeserialize(node, jacksonTypeRef<UserMessage>()) { it.validate() }
                    ?.let {
                        return Message(userMessage = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<SystemMessage>()) { it.validate() }
                    ?.let {
                        return Message(systemMessage = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<ToolResponseMessage>()) { it.validate() }
                    ?.let {
                        return Message(toolResponseMessage = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<CompletionMessage>()) { it.validate() }
                    ?.let {
                        return Message(completionMessage = it, _json = json)
                    }

                return Message(_json = json)
            }
        }

        class Serializer : BaseSerializer<Message>(Message::class) {

            override fun serialize(
                value: Message,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.userMessage != null -> generator.writeObject(value.userMessage)
                    value.systemMessage != null -> generator.writeObject(value.systemMessage)
                    value.toolResponseMessage != null ->
                        generator.writeObject(value.toolResponseMessage)
                    value.completionMessage != null ->
                        generator.writeObject(value.completionMessage)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Message")
                }
            }
        }
    }

    @JsonDeserialize(builder = Logprobs.Builder::class)
    @NoAutoDetect
    class Logprobs
    private constructor(
        private val topK: Long?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("top_k") fun topK(): Long? = topK

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Logprobs &&
                this.topK == other.topK &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(topK, additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "Logprobs{topK=$topK, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var topK: Long? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(logprobs: Logprobs) = apply {
                this.topK = logprobs.topK
                additionalProperties(logprobs.additionalProperties)
            }

            @JsonProperty("top_k") fun topK(topK: Long) = apply { this.topK = topK }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Logprobs = Logprobs(topK, additionalProperties.toUnmodifiable())
        }
    }

    class ToolChoice
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ToolChoice && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val AUTO = ToolChoice(JsonField.of("auto"))

            val REQUIRED = ToolChoice(JsonField.of("required"))

            fun of(value: String) = ToolChoice(JsonField.of(value))
        }

        enum class Known {
            AUTO,
            REQUIRED,
        }

        enum class Value {
            AUTO,
            REQUIRED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                AUTO -> Value.AUTO
                REQUIRED -> Value.REQUIRED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                AUTO -> Known.AUTO
                REQUIRED -> Known.REQUIRED
                else -> throw LlamaStackClientInvalidDataException("Unknown ToolChoice: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class ToolPromptFormat
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ToolPromptFormat && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val JSON = ToolPromptFormat(JsonField.of("json"))

            val FUNCTION_TAG = ToolPromptFormat(JsonField.of("function_tag"))

            fun of(value: String) = ToolPromptFormat(JsonField.of(value))
        }

        enum class Known {
            JSON,
            FUNCTION_TAG,
        }

        enum class Value {
            JSON,
            FUNCTION_TAG,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                JSON -> Value.JSON
                FUNCTION_TAG -> Value.FUNCTION_TAG
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                JSON -> Known.JSON
                FUNCTION_TAG -> Known.FUNCTION_TAG
                else ->
                    throw LlamaStackClientInvalidDataException("Unknown ToolPromptFormat: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    @JsonDeserialize(builder = Tool.Builder::class)
    @NoAutoDetect
    class Tool
    private constructor(
        private val description: String?,
        private val parameters: Parameters?,
        private val toolName: ToolName?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("description") fun description(): String? = description

        @JsonProperty("parameters") fun parameters(): Parameters? = parameters

        @JsonProperty("tool_name") fun toolName(): ToolName? = toolName

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Tool &&
                this.description == other.description &&
                this.parameters == other.parameters &&
                this.toolName == other.toolName &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        description,
                        parameters,
                        toolName,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Tool{description=$description, parameters=$parameters, toolName=$toolName, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var description: String? = null
            private var parameters: Parameters? = null
            private var toolName: ToolName? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(tool: Tool) = apply {
                this.description = tool.description
                this.parameters = tool.parameters
                this.toolName = tool.toolName
                additionalProperties(tool.additionalProperties)
            }

            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            @JsonProperty("parameters")
            fun parameters(parameters: Parameters) = apply { this.parameters = parameters }

            @JsonProperty("tool_name")
            fun toolName(toolName: ToolName) = apply { this.toolName = toolName }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Tool =
                Tool(
                    description,
                    parameters,
                    checkNotNull(toolName) { "`toolName` is required but was not set" },
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(using = ToolName.Deserializer::class)
        @JsonSerialize(using = ToolName.Serializer::class)
        class ToolName
        private constructor(
            private val builtinTool: BuiltinTool? = null,
            private val string: String? = null,
            private val _json: JsonValue? = null,
        ) {

            private var validated: Boolean = false

            fun builtinTool(): BuiltinTool? = builtinTool

            fun string(): String? = string

            fun isBuiltinTool(): Boolean = builtinTool != null

            fun isString(): Boolean = string != null

            fun asBuiltinTool(): BuiltinTool = builtinTool.getOrThrow("builtinTool")

            fun asString(): String = string.getOrThrow("string")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    builtinTool != null -> visitor.visitBuiltinTool(builtinTool)
                    string != null -> visitor.visitString(string)
                    else -> visitor.unknown(_json)
                }
            }

            fun validate(): ToolName = apply {
                if (!validated) {
                    if (builtinTool == null && string == null) {
                        throw LlamaStackClientInvalidDataException("Unknown ToolName: $_json")
                    }
                    validated = true
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ToolName &&
                    this.builtinTool == other.builtinTool &&
                    this.string == other.string
            }

            override fun hashCode(): Int {
                return Objects.hash(builtinTool, string)
            }

            override fun toString(): String {
                return when {
                    builtinTool != null -> "ToolName{builtinTool=$builtinTool}"
                    string != null -> "ToolName{string=$string}"
                    _json != null -> "ToolName{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid ToolName")
                }
            }

            companion object {

                fun ofBuiltinTool(builtinTool: BuiltinTool) = ToolName(builtinTool = builtinTool)

                fun ofString(string: String) = ToolName(string = string)
            }

            interface Visitor<out T> {

                fun visitBuiltinTool(builtinTool: BuiltinTool): T

                fun visitString(string: String): T

                fun unknown(json: JsonValue?): T {
                    throw LlamaStackClientInvalidDataException("Unknown ToolName: $json")
                }
            }

            class Deserializer : BaseDeserializer<ToolName>(ToolName::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): ToolName {
                    val json = JsonValue.fromJsonNode(node)
                    tryDeserialize(node, jacksonTypeRef<BuiltinTool>())?.let {
                        return ToolName(builtinTool = it, _json = json)
                    }
                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                        return ToolName(string = it, _json = json)
                    }

                    return ToolName(_json = json)
                }
            }

            class Serializer : BaseSerializer<ToolName>(ToolName::class) {

                override fun serialize(
                    value: ToolName,
                    generator: JsonGenerator,
                    provider: SerializerProvider
                ) {
                    when {
                        value.builtinTool != null -> generator.writeObject(value.builtinTool)
                        value.string != null -> generator.writeObject(value.string)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid ToolName")
                    }
                }
            }

            class BuiltinTool
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is BuiltinTool && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val BRAVE_SEARCH = BuiltinTool(JsonField.of("brave_search"))

                    val WOLFRAM_ALPHA = BuiltinTool(JsonField.of("wolfram_alpha"))

                    val PHOTOGEN = BuiltinTool(JsonField.of("photogen"))

                    val CODE_INTERPRETER = BuiltinTool(JsonField.of("code_interpreter"))

                    fun of(value: String) = BuiltinTool(JsonField.of(value))
                }

                enum class Known {
                    BRAVE_SEARCH,
                    WOLFRAM_ALPHA,
                    PHOTOGEN,
                    CODE_INTERPRETER,
                }

                enum class Value {
                    BRAVE_SEARCH,
                    WOLFRAM_ALPHA,
                    PHOTOGEN,
                    CODE_INTERPRETER,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        BRAVE_SEARCH -> Value.BRAVE_SEARCH
                        WOLFRAM_ALPHA -> Value.WOLFRAM_ALPHA
                        PHOTOGEN -> Value.PHOTOGEN
                        CODE_INTERPRETER -> Value.CODE_INTERPRETER
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        BRAVE_SEARCH -> Known.BRAVE_SEARCH
                        WOLFRAM_ALPHA -> Known.WOLFRAM_ALPHA
                        PHOTOGEN -> Known.PHOTOGEN
                        CODE_INTERPRETER -> Known.CODE_INTERPRETER
                        else ->
                            throw LlamaStackClientInvalidDataException(
                                "Unknown BuiltinTool: $value"
                            )
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }

        @JsonDeserialize(builder = Parameters.Builder::class)
        @NoAutoDetect
        class Parameters
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Parameters &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(additionalProperties)
                }
                return hashCode
            }

            override fun toString() = "Parameters{additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(parameters: Parameters) = apply {
                    additionalProperties(parameters.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Parameters = Parameters(additionalProperties.toUnmodifiable())
            }
        }
    }
}
