// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

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
import com.llama.llamastack.core.BaseDeserializer
import com.llama.llamastack.core.BaseSerializer
import com.llama.llamastack.core.Enum
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import com.llama.llamastack.models.*
import java.util.Objects

class InferenceChatCompletionParams
constructor(
    private val messages: List<Message>,
    private val model: String,
    private val logprobs: Logprobs?,
    private val responseFormat: ResponseFormat?,
    private val samplingParams: SamplingParams?,
    private val stream: Boolean?,
    private val toolChoice: ToolChoice?,
    private val toolPromptFormat: ToolPromptFormat?,
    private val tools: List<Tool>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun messages(): List<Message> = messages

    fun model(): String = model

    fun logprobs(): Logprobs? = logprobs

    fun responseFormat(): ResponseFormat? = responseFormat

    fun samplingParams(): SamplingParams? = samplingParams

    fun stream(): Boolean? = stream

    fun toolChoice(): ToolChoice? = toolChoice

    fun toolPromptFormat(): ToolPromptFormat? = toolPromptFormat

    fun tools(): List<Tool>? = tools

    internal fun getBody(): InferenceChatCompletionBody {
        return InferenceChatCompletionBody(
            messages,
            model,
            logprobs,
            responseFormat,
            samplingParams,
            stream,
            toolChoice,
            toolPromptFormat,
            tools,
            additionalBodyProperties,
        )
    }

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = InferenceChatCompletionBody.Builder::class)
    @NoAutoDetect
    class InferenceChatCompletionBody
    internal constructor(
        private val messages: List<Message>?,
        private val model: String?,
        private val logprobs: Logprobs?,
        private val responseFormat: ResponseFormat?,
        private val samplingParams: SamplingParams?,
        private val stream: Boolean?,
        private val toolChoice: ToolChoice?,
        private val toolPromptFormat: ToolPromptFormat?,
        private val tools: List<Tool>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("messages") fun messages(): List<Message>? = messages

        @JsonProperty("model") fun model(): String? = model

        @JsonProperty("logprobs") fun logprobs(): Logprobs? = logprobs

        @JsonProperty("response_format") fun responseFormat(): ResponseFormat? = responseFormat

        @JsonProperty("sampling_params") fun samplingParams(): SamplingParams? = samplingParams

        @JsonProperty("stream") fun stream(): Boolean? = stream

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

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var messages: List<Message>? = null
            private var model: String? = null
            private var logprobs: Logprobs? = null
            private var responseFormat: ResponseFormat? = null
            private var samplingParams: SamplingParams? = null
            private var stream: Boolean? = null
            private var toolChoice: ToolChoice? = null
            private var toolPromptFormat: ToolPromptFormat? = null
            private var tools: List<Tool>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(inferenceChatCompletionBody: InferenceChatCompletionBody) = apply {
                this.messages = inferenceChatCompletionBody.messages
                this.model = inferenceChatCompletionBody.model
                this.logprobs = inferenceChatCompletionBody.logprobs
                this.responseFormat = inferenceChatCompletionBody.responseFormat
                this.samplingParams = inferenceChatCompletionBody.samplingParams
                this.stream = inferenceChatCompletionBody.stream
                this.toolChoice = inferenceChatCompletionBody.toolChoice
                this.toolPromptFormat = inferenceChatCompletionBody.toolPromptFormat
                this.tools = inferenceChatCompletionBody.tools
                additionalProperties(inferenceChatCompletionBody.additionalProperties)
            }

            @JsonProperty("messages")
            fun messages(messages: List<Message>) = apply { this.messages = messages }

            @JsonProperty("model") fun model(model: String) = apply { this.model = model }

            @JsonProperty("logprobs")
            fun logprobs(logprobs: Logprobs) = apply { this.logprobs = logprobs }

            @JsonProperty("response_format")
            fun responseFormat(responseFormat: ResponseFormat) = apply {
                this.responseFormat = responseFormat
            }

            @JsonProperty("sampling_params")
            fun samplingParams(samplingParams: SamplingParams) = apply {
                this.samplingParams = samplingParams
            }

            @JsonProperty("stream") fun stream(stream: Boolean) = apply { this.stream = stream }

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

            fun build(): InferenceChatCompletionBody =
                InferenceChatCompletionBody(
                    checkNotNull(messages) { "`messages` is required but was not set" }
                        .toImmutable(),
                    checkNotNull(model) { "`model` is required but was not set" },
                    logprobs,
                    responseFormat,
                    samplingParams,
                    stream,
                    toolChoice,
                    toolPromptFormat,
                    tools?.toImmutable(),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InferenceChatCompletionBody && this.messages == other.messages && this.model == other.model && this.logprobs == other.logprobs && this.responseFormat == other.responseFormat && this.samplingParams == other.samplingParams && this.stream == other.stream && this.toolChoice == other.toolChoice && this.toolPromptFormat == other.toolPromptFormat && this.tools == other.tools && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(messages, model, logprobs, responseFormat, samplingParams, stream, toolChoice, toolPromptFormat, tools, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "InferenceChatCompletionBody{messages=$messages, model=$model, logprobs=$logprobs, responseFormat=$responseFormat, samplingParams=$samplingParams, stream=$stream, toolChoice=$toolChoice, toolPromptFormat=$toolPromptFormat, tools=$tools, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InferenceChatCompletionParams && this.messages == other.messages && this.model == other.model && this.logprobs == other.logprobs && this.responseFormat == other.responseFormat && this.samplingParams == other.samplingParams && this.stream == other.stream && this.toolChoice == other.toolChoice && this.toolPromptFormat == other.toolPromptFormat && this.tools == other.tools && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(messages, model, logprobs, responseFormat, samplingParams, stream, toolChoice, toolPromptFormat, tools, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "InferenceChatCompletionParams{messages=$messages, model=$model, logprobs=$logprobs, responseFormat=$responseFormat, samplingParams=$samplingParams, stream=$stream, toolChoice=$toolChoice, toolPromptFormat=$toolPromptFormat, tools=$tools, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var messages: MutableList<Message> = mutableListOf()
        private var model: String? = null
        private var logprobs: Logprobs? = null
        private var responseFormat: ResponseFormat? = null
        private var samplingParams: SamplingParams? = null
        private var stream: Boolean? = null
        private var toolChoice: ToolChoice? = null
        private var toolPromptFormat: ToolPromptFormat? = null
        private var tools: MutableList<Tool> = mutableListOf()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(inferenceChatCompletionParams: InferenceChatCompletionParams) = apply {
            this.messages(inferenceChatCompletionParams.messages)
            this.model = inferenceChatCompletionParams.model
            this.logprobs = inferenceChatCompletionParams.logprobs
            this.responseFormat = inferenceChatCompletionParams.responseFormat
            this.samplingParams = inferenceChatCompletionParams.samplingParams
            this.stream = inferenceChatCompletionParams.stream
            this.toolChoice = inferenceChatCompletionParams.toolChoice
            this.toolPromptFormat = inferenceChatCompletionParams.toolPromptFormat
            this.tools(inferenceChatCompletionParams.tools ?: listOf())
            additionalHeaders(inferenceChatCompletionParams.additionalHeaders)
            additionalQueryParams(inferenceChatCompletionParams.additionalQueryParams)
            additionalBodyProperties(inferenceChatCompletionParams.additionalBodyProperties)
        }

        fun messages(messages: List<Message>) = apply {
            this.messages.clear()
            this.messages.addAll(messages)
        }

        fun addMessage(message: Message) = apply { this.messages.add(message) }

        fun model(model: String) = apply { this.model = model }

        fun logprobs(logprobs: Logprobs) = apply { this.logprobs = logprobs }

        fun responseFormat(responseFormat: ResponseFormat) = apply {
            this.responseFormat = responseFormat
        }

        fun responseFormat(jsonSchemaFormat: ResponseFormat.JsonSchemaFormat) = apply {
            this.responseFormat = ResponseFormat.ofJsonSchemaFormat(jsonSchemaFormat)
        }

        fun responseFormat(grammarFormat: ResponseFormat.GrammarFormat) = apply {
            this.responseFormat = ResponseFormat.ofGrammarFormat(grammarFormat)
        }

        fun samplingParams(samplingParams: SamplingParams) = apply {
            this.samplingParams = samplingParams
        }

        fun stream(stream: Boolean) = apply { this.stream = stream }

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): InferenceChatCompletionParams =
            InferenceChatCompletionParams(
                checkNotNull(messages) { "`messages` is required but was not set" }.toImmutable(),
                checkNotNull(model) { "`model` is required but was not set" },
                logprobs,
                responseFormat,
                samplingParams,
                stream,
                toolChoice,
                toolPromptFormat,
                if (tools.size == 0) null else tools.toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
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

            return /* spotless:off */ other is Message && this.userMessage == other.userMessage && this.systemMessage == other.systemMessage && this.toolResponseMessage == other.toolResponseMessage && this.completionMessage == other.completionMessage /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(userMessage, systemMessage, toolResponseMessage, completionMessage) /* spotless:on */
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

        @JsonProperty("top_k") fun topK(): Long? = topK

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

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

            fun build(): Logprobs = Logprobs(topK, additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Logprobs && this.topK == other.topK && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(topK, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "Logprobs{topK=$topK, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = ResponseFormat.Deserializer::class)
    @JsonSerialize(using = ResponseFormat.Serializer::class)
    class ResponseFormat
    private constructor(
        private val jsonSchemaFormat: JsonSchemaFormat? = null,
        private val grammarFormat: GrammarFormat? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun jsonSchemaFormat(): JsonSchemaFormat? = jsonSchemaFormat

        fun grammarFormat(): GrammarFormat? = grammarFormat

        fun isJsonSchemaFormat(): Boolean = jsonSchemaFormat != null

        fun isGrammarFormat(): Boolean = grammarFormat != null

        fun asJsonSchemaFormat(): JsonSchemaFormat = jsonSchemaFormat.getOrThrow("jsonSchemaFormat")

        fun asGrammarFormat(): GrammarFormat = grammarFormat.getOrThrow("grammarFormat")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                jsonSchemaFormat != null -> visitor.visitJsonSchemaFormat(jsonSchemaFormat)
                grammarFormat != null -> visitor.visitGrammarFormat(grammarFormat)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): ResponseFormat = apply {
            if (!validated) {
                if (jsonSchemaFormat == null && grammarFormat == null) {
                    throw LlamaStackClientInvalidDataException("Unknown ResponseFormat: $_json")
                }
                jsonSchemaFormat?.validate()
                grammarFormat?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ResponseFormat && this.jsonSchemaFormat == other.jsonSchemaFormat && this.grammarFormat == other.grammarFormat /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(jsonSchemaFormat, grammarFormat) /* spotless:on */
        }

        override fun toString(): String {
            return when {
                jsonSchemaFormat != null -> "ResponseFormat{jsonSchemaFormat=$jsonSchemaFormat}"
                grammarFormat != null -> "ResponseFormat{grammarFormat=$grammarFormat}"
                _json != null -> "ResponseFormat{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid ResponseFormat")
            }
        }

        companion object {

            fun ofJsonSchemaFormat(jsonSchemaFormat: JsonSchemaFormat) =
                ResponseFormat(jsonSchemaFormat = jsonSchemaFormat)

            fun ofGrammarFormat(grammarFormat: GrammarFormat) =
                ResponseFormat(grammarFormat = grammarFormat)
        }

        interface Visitor<out T> {

            fun visitJsonSchemaFormat(jsonSchemaFormat: JsonSchemaFormat): T

            fun visitGrammarFormat(grammarFormat: GrammarFormat): T

            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown ResponseFormat: $json")
            }
        }

        class Deserializer : BaseDeserializer<ResponseFormat>(ResponseFormat::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): ResponseFormat {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<JsonSchemaFormat>()) { it.validate() }
                    ?.let {
                        return ResponseFormat(jsonSchemaFormat = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<GrammarFormat>()) { it.validate() }
                    ?.let {
                        return ResponseFormat(grammarFormat = it, _json = json)
                    }

                return ResponseFormat(_json = json)
            }
        }

        class Serializer : BaseSerializer<ResponseFormat>(ResponseFormat::class) {

            override fun serialize(
                value: ResponseFormat,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.jsonSchemaFormat != null -> generator.writeObject(value.jsonSchemaFormat)
                    value.grammarFormat != null -> generator.writeObject(value.grammarFormat)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid ResponseFormat")
                }
            }
        }

        @JsonDeserialize(builder = JsonSchemaFormat.Builder::class)
        @NoAutoDetect
        class JsonSchemaFormat
        private constructor(
            private val jsonSchema: JsonField<JsonSchema>,
            private val type: JsonField<Type>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun jsonSchema(): JsonSchema = jsonSchema.getRequired("json_schema")

            fun type(): Type = type.getRequired("type")

            @JsonProperty("json_schema") @ExcludeMissing fun _jsonSchema() = jsonSchema

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): JsonSchemaFormat = apply {
                if (!validated) {
                    jsonSchema().validate()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var jsonSchema: JsonField<JsonSchema> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(jsonSchemaFormat: JsonSchemaFormat) = apply {
                    this.jsonSchema = jsonSchemaFormat.jsonSchema
                    this.type = jsonSchemaFormat.type
                    additionalProperties(jsonSchemaFormat.additionalProperties)
                }

                fun jsonSchema(jsonSchema: JsonSchema) = jsonSchema(JsonField.of(jsonSchema))

                @JsonProperty("json_schema")
                @ExcludeMissing
                fun jsonSchema(jsonSchema: JsonField<JsonSchema>) = apply {
                    this.jsonSchema = jsonSchema
                }

                fun type(type: Type) = type(JsonField.of(type))

                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                fun build(): JsonSchemaFormat =
                    JsonSchemaFormat(
                        jsonSchema,
                        type,
                        additionalProperties.toImmutable(),
                    )
            }

            @JsonDeserialize(builder = JsonSchema.Builder::class)
            @NoAutoDetect
            class JsonSchema
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): JsonSchema = apply {
                    if (!validated) {
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(jsonSchema: JsonSchema) = apply {
                        additionalProperties(jsonSchema.additionalProperties)
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

                    fun build(): JsonSchema = JsonSchema(additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is JsonSchema && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() = "JsonSchema{additionalProperties=$additionalProperties}"
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val JSON_SCHEMA = Type(JsonField.of("json_schema"))

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    JSON_SCHEMA,
                }

                enum class Value {
                    JSON_SCHEMA,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        JSON_SCHEMA -> Value.JSON_SCHEMA
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        JSON_SCHEMA -> Known.JSON_SCHEMA
                        else -> throw LlamaStackClientInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is JsonSchemaFormat && this.jsonSchema == other.jsonSchema && this.type == other.type && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(jsonSchema, type, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "JsonSchemaFormat{jsonSchema=$jsonSchema, type=$type, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = GrammarFormat.Builder::class)
        @NoAutoDetect
        class GrammarFormat
        private constructor(
            private val bnf: JsonField<Bnf>,
            private val type: JsonField<Type>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun bnf(): Bnf = bnf.getRequired("bnf")

            fun type(): Type = type.getRequired("type")

            @JsonProperty("bnf") @ExcludeMissing fun _bnf() = bnf

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): GrammarFormat = apply {
                if (!validated) {
                    bnf().validate()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var bnf: JsonField<Bnf> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(grammarFormat: GrammarFormat) = apply {
                    this.bnf = grammarFormat.bnf
                    this.type = grammarFormat.type
                    additionalProperties(grammarFormat.additionalProperties)
                }

                fun bnf(bnf: Bnf) = bnf(JsonField.of(bnf))

                @JsonProperty("bnf")
                @ExcludeMissing
                fun bnf(bnf: JsonField<Bnf>) = apply { this.bnf = bnf }

                fun type(type: Type) = type(JsonField.of(type))

                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                fun build(): GrammarFormat =
                    GrammarFormat(
                        bnf,
                        type,
                        additionalProperties.toImmutable(),
                    )
            }

            @JsonDeserialize(builder = Bnf.Builder::class)
            @NoAutoDetect
            class Bnf
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Bnf = apply {
                    if (!validated) {
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(bnf: Bnf) = apply {
                        additionalProperties(bnf.additionalProperties)
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

                    fun build(): Bnf = Bnf(additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Bnf && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() = "Bnf{additionalProperties=$additionalProperties}"
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val GRAMMAR = Type(JsonField.of("grammar"))

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    GRAMMAR,
                }

                enum class Value {
                    GRAMMAR,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        GRAMMAR -> Value.GRAMMAR
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        GRAMMAR -> Known.GRAMMAR
                        else -> throw LlamaStackClientInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is GrammarFormat && this.bnf == other.bnf && this.type == other.type && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(bnf, type, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "GrammarFormat{bnf=$bnf, type=$type, additionalProperties=$additionalProperties}"
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

            return /* spotless:off */ other is ToolChoice && this.value == other.value /* spotless:on */
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

            return /* spotless:off */ other is ToolPromptFormat && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val JSON = ToolPromptFormat(JsonField.of("json"))

            val FUNCTION_TAG = ToolPromptFormat(JsonField.of("function_tag"))

            val PYTHON_LIST = ToolPromptFormat(JsonField.of("python_list"))

            fun of(value: String) = ToolPromptFormat(JsonField.of(value))
        }

        enum class Known {
            JSON,
            FUNCTION_TAG,
            PYTHON_LIST,
        }

        enum class Value {
            JSON,
            FUNCTION_TAG,
            PYTHON_LIST,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                JSON -> Value.JSON
                FUNCTION_TAG -> Value.FUNCTION_TAG
                PYTHON_LIST -> Value.PYTHON_LIST
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                JSON -> Known.JSON
                FUNCTION_TAG -> Known.FUNCTION_TAG
                PYTHON_LIST -> Known.PYTHON_LIST
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

        @JsonProperty("description") fun description(): String? = description

        @JsonProperty("parameters") fun parameters(): Parameters? = parameters

        @JsonProperty("tool_name") fun toolName(): ToolName? = toolName

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

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
                    additionalProperties.toImmutable(),
                )
        }

        class ToolName
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ToolName && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val BRAVE_SEARCH = ToolName(JsonField.of("brave_search"))

                val WOLFRAM_ALPHA = ToolName(JsonField.of("wolfram_alpha"))

                val PHOTOGEN = ToolName(JsonField.of("photogen"))

                val CODE_INTERPRETER = ToolName(JsonField.of("code_interpreter"))

                fun of(value: String) = ToolName(JsonField.of(value))
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
                    else -> throw LlamaStackClientInvalidDataException("Unknown ToolName: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(builder = Parameters.Builder::class)
        @NoAutoDetect
        class Parameters
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

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

                fun build(): Parameters = Parameters(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Parameters && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() = "Parameters{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Tool && this.description == other.description && this.parameters == other.parameters && this.toolName == other.toolName && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(description, parameters, toolName, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Tool{description=$description, parameters=$parameters, toolName=$toolName, additionalProperties=$additionalProperties}"
    }
}
