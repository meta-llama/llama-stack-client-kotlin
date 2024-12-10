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
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import com.llama.llamastack.models.*
import java.util.Objects

class BatchInferenceChatCompletionParams
constructor(
    private val messagesBatch: List<List<MessagesBatch>>,
    private val model: String,
    private val logprobs: Logprobs?,
    private val samplingParams: SamplingParams?,
    private val toolChoice: ToolChoice?,
    private val toolPromptFormat: ToolPromptFormat?,
    private val tools: List<Tool>?,
    private val xLlamaStackProviderData: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun messagesBatch(): List<List<MessagesBatch>> = messagesBatch

    fun model(): String = model

    fun logprobs(): Logprobs? = logprobs

    fun samplingParams(): SamplingParams? = samplingParams

    fun toolChoice(): ToolChoice? = toolChoice

    fun toolPromptFormat(): ToolPromptFormat? = toolPromptFormat

    fun tools(): List<Tool>? = tools

    fun xLlamaStackProviderData(): String? = xLlamaStackProviderData

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

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

    internal fun getHeaders(): Headers {
        val headers = Headers.builder()
        this.xLlamaStackProviderData?.let {
            headers.put("X-LlamaStack-ProviderData", listOf(it.toString()))
        }
        headers.putAll(additionalHeaders)
        return headers.build()
    }

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = BatchInferenceChatCompletionBody.Builder::class)
    @NoAutoDetect
    class BatchInferenceChatCompletionBody
    internal constructor(
        private val messagesBatch: List<List<MessagesBatch>>?,
        private val model: String?,
        private val logprobs: Logprobs?,
        private val samplingParams: SamplingParams?,
        private val toolChoice: ToolChoice?,
        private val toolPromptFormat: ToolPromptFormat?,
        private val tools: List<Tool>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("messages_batch")
        fun messagesBatch(): List<List<MessagesBatch>>? = messagesBatch

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

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var messagesBatch: List<List<MessagesBatch>>? = null
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
            fun messagesBatch(messagesBatch: List<List<MessagesBatch>>) = apply {
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
                        .toImmutable(),
                    checkNotNull(model) { "`model` is required but was not set" },
                    logprobs,
                    samplingParams,
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

            return /* spotless:off */ other is BatchInferenceChatCompletionBody && messagesBatch == other.messagesBatch && model == other.model && logprobs == other.logprobs && samplingParams == other.samplingParams && toolChoice == other.toolChoice && toolPromptFormat == other.toolPromptFormat && tools == other.tools && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(messagesBatch, model, logprobs, samplingParams, toolChoice, toolPromptFormat, tools, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BatchInferenceChatCompletionBody{messagesBatch=$messagesBatch, model=$model, logprobs=$logprobs, samplingParams=$samplingParams, toolChoice=$toolChoice, toolPromptFormat=$toolPromptFormat, tools=$tools, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var messagesBatch: MutableList<List<MessagesBatch>> = mutableListOf()
        private var model: String? = null
        private var logprobs: Logprobs? = null
        private var samplingParams: SamplingParams? = null
        private var toolChoice: ToolChoice? = null
        private var toolPromptFormat: ToolPromptFormat? = null
        private var tools: MutableList<Tool> = mutableListOf()
        private var xLlamaStackProviderData: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(batchInferenceChatCompletionParams: BatchInferenceChatCompletionParams) =
            apply {
                messagesBatch = batchInferenceChatCompletionParams.messagesBatch.toMutableList()
                model = batchInferenceChatCompletionParams.model
                logprobs = batchInferenceChatCompletionParams.logprobs
                samplingParams = batchInferenceChatCompletionParams.samplingParams
                toolChoice = batchInferenceChatCompletionParams.toolChoice
                toolPromptFormat = batchInferenceChatCompletionParams.toolPromptFormat
                tools = batchInferenceChatCompletionParams.tools?.toMutableList() ?: mutableListOf()
                xLlamaStackProviderData = batchInferenceChatCompletionParams.xLlamaStackProviderData
                additionalHeaders = batchInferenceChatCompletionParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    batchInferenceChatCompletionParams.additionalQueryParams.toBuilder()
                additionalBodyProperties =
                    batchInferenceChatCompletionParams.additionalBodyProperties.toMutableMap()
            }

        fun messagesBatch(messagesBatch: List<List<MessagesBatch>>) = apply {
            this.messagesBatch.clear()
            this.messagesBatch.addAll(messagesBatch)
        }

        fun addMessagesBatch(messagesBatch: List<MessagesBatch>) = apply {
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

        fun xLlamaStackProviderData(xLlamaStackProviderData: String) = apply {
            this.xLlamaStackProviderData = xLlamaStackProviderData
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

        fun build(): BatchInferenceChatCompletionParams =
            BatchInferenceChatCompletionParams(
                messagesBatch.toImmutable(),
                checkNotNull(model) { "`model` is required but was not set" },
                logprobs,
                samplingParams,
                toolChoice,
                toolPromptFormat,
                tools.toImmutable().ifEmpty { null },
                xLlamaStackProviderData,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    @JsonDeserialize(using = MessagesBatch.Deserializer::class)
    @JsonSerialize(using = MessagesBatch.Serializer::class)
    class MessagesBatch
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

        fun validate(): MessagesBatch = apply {
            if (!validated) {
                if (
                    userMessage == null &&
                        systemMessage == null &&
                        toolResponseMessage == null &&
                        completionMessage == null
                ) {
                    throw LlamaStackClientInvalidDataException("Unknown MessagesBatch: $_json")
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

            return /* spotless:off */ other is MessagesBatch && userMessage == other.userMessage && systemMessage == other.systemMessage && toolResponseMessage == other.toolResponseMessage && completionMessage == other.completionMessage /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(userMessage, systemMessage, toolResponseMessage, completionMessage) /* spotless:on */

        override fun toString(): String =
            when {
                userMessage != null -> "MessagesBatch{userMessage=$userMessage}"
                systemMessage != null -> "MessagesBatch{systemMessage=$systemMessage}"
                toolResponseMessage != null ->
                    "MessagesBatch{toolResponseMessage=$toolResponseMessage}"
                completionMessage != null -> "MessagesBatch{completionMessage=$completionMessage}"
                _json != null -> "MessagesBatch{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid MessagesBatch")
            }

        companion object {

            fun ofUserMessage(userMessage: UserMessage) = MessagesBatch(userMessage = userMessage)

            fun ofSystemMessage(systemMessage: SystemMessage) =
                MessagesBatch(systemMessage = systemMessage)

            fun ofToolResponseMessage(toolResponseMessage: ToolResponseMessage) =
                MessagesBatch(toolResponseMessage = toolResponseMessage)

            fun ofCompletionMessage(completionMessage: CompletionMessage) =
                MessagesBatch(completionMessage = completionMessage)
        }

        interface Visitor<out T> {

            fun visitUserMessage(userMessage: UserMessage): T

            fun visitSystemMessage(systemMessage: SystemMessage): T

            fun visitToolResponseMessage(toolResponseMessage: ToolResponseMessage): T

            fun visitCompletionMessage(completionMessage: CompletionMessage): T

            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown MessagesBatch: $json")
            }
        }

        class Deserializer : BaseDeserializer<MessagesBatch>(MessagesBatch::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): MessagesBatch {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<UserMessage>()) { it.validate() }
                    ?.let {
                        return MessagesBatch(userMessage = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<SystemMessage>()) { it.validate() }
                    ?.let {
                        return MessagesBatch(systemMessage = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<ToolResponseMessage>()) { it.validate() }
                    ?.let {
                        return MessagesBatch(toolResponseMessage = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<CompletionMessage>()) { it.validate() }
                    ?.let {
                        return MessagesBatch(completionMessage = it, _json = json)
                    }

                return MessagesBatch(_json = json)
            }
        }

        class Serializer : BaseSerializer<MessagesBatch>(MessagesBatch::class) {

            override fun serialize(
                value: MessagesBatch,
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
                    else -> throw IllegalStateException("Invalid MessagesBatch")
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

            return /* spotless:off */ other is Logprobs && topK == other.topK && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(topK, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Logprobs{topK=$topK, additionalProperties=$additionalProperties}"
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

            return /* spotless:off */ other is ToolChoice && value == other.value /* spotless:on */
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

            return /* spotless:off */ other is ToolPromptFormat && value == other.value /* spotless:on */
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

                return /* spotless:off */ other is ToolName && value == other.value /* spotless:on */
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

            return /* spotless:off */ other is Tool && description == other.description && parameters == other.parameters && toolName == other.toolName && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(description, parameters, toolName, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Tool{description=$description, parameters=$parameters, toolName=$toolName, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BatchInferenceChatCompletionParams && messagesBatch == other.messagesBatch && model == other.model && logprobs == other.logprobs && samplingParams == other.samplingParams && toolChoice == other.toolChoice && toolPromptFormat == other.toolPromptFormat && tools == other.tools && xLlamaStackProviderData == other.xLlamaStackProviderData && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(messagesBatch, model, logprobs, samplingParams, toolChoice, toolPromptFormat, tools, xLlamaStackProviderData, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "BatchInferenceChatCompletionParams{messagesBatch=$messagesBatch, model=$model, logprobs=$logprobs, samplingParams=$samplingParams, toolChoice=$toolChoice, toolPromptFormat=$toolPromptFormat, tools=$tools, xLlamaStackProviderData=$xLlamaStackProviderData, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
