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
import com.llama_stack_client.api.core.JsonMissing
import com.llama_stack_client.api.core.JsonValue
import com.llama_stack_client.api.core.NoAutoDetect
import com.llama_stack_client.api.core.getOrThrow
import com.llama_stack_client.api.core.toUnmodifiable
import com.llama_stack_client.api.errors.LlamaStackClientInvalidDataException
import com.llama_stack_client.api.models.*
import java.util.Objects

class AgentCreateParams
constructor(
    private val agentConfig: AgentConfig,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun agentConfig(): AgentConfig = agentConfig

    internal fun getBody(): AgentCreateBody {
        return AgentCreateBody(agentConfig, additionalBodyProperties)
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = AgentCreateBody.Builder::class)
    @NoAutoDetect
    class AgentCreateBody
    internal constructor(
        private val agentConfig: AgentConfig?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("agent_config") fun agentConfig(): AgentConfig? = agentConfig

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AgentCreateBody &&
                this.agentConfig == other.agentConfig &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(agentConfig, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "AgentCreateBody{agentConfig=$agentConfig, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var agentConfig: AgentConfig? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(agentCreateBody: AgentCreateBody) = apply {
                this.agentConfig = agentCreateBody.agentConfig
                additionalProperties(agentCreateBody.additionalProperties)
            }

            @JsonProperty("agent_config")
            fun agentConfig(agentConfig: AgentConfig) = apply { this.agentConfig = agentConfig }

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

            fun build(): AgentCreateBody =
                AgentCreateBody(
                    checkNotNull(agentConfig) { "`agentConfig` is required but was not set" },
                    additionalProperties.toUnmodifiable()
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

        return other is AgentCreateParams &&
            this.agentConfig == other.agentConfig &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            agentConfig,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "AgentCreateParams{agentConfig=$agentConfig, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var agentConfig: AgentConfig? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(agentCreateParams: AgentCreateParams) = apply {
            this.agentConfig = agentCreateParams.agentConfig
            additionalQueryParams(agentCreateParams.additionalQueryParams)
            additionalHeaders(agentCreateParams.additionalHeaders)
            additionalBodyProperties(agentCreateParams.additionalBodyProperties)
        }

        fun agentConfig(agentConfig: AgentConfig) = apply { this.agentConfig = agentConfig }

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

        fun build(): AgentCreateParams =
            AgentCreateParams(
                checkNotNull(agentConfig) { "`agentConfig` is required but was not set" },
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = AgentConfig.Builder::class)
    @NoAutoDetect
    class AgentConfig
    private constructor(
        private val enableSessionPersistence: Boolean?,
        private val inputShields: List<String>?,
        private val instructions: String?,
        private val maxInferIters: Long?,
        private val model: String?,
        private val outputShields: List<String>?,
        private val samplingParams: SamplingParams?,
        private val toolChoice: ToolChoice?,
        private val toolPromptFormat: ToolPromptFormat?,
        private val tools: List<Tool>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("enable_session_persistence")
        fun enableSessionPersistence(): Boolean? = enableSessionPersistence

        @JsonProperty("input_shields") fun inputShields(): List<String>? = inputShields

        @JsonProperty("instructions") fun instructions(): String? = instructions

        @JsonProperty("max_infer_iters") fun maxInferIters(): Long? = maxInferIters

        @JsonProperty("model") fun model(): String? = model

        @JsonProperty("output_shields") fun outputShields(): List<String>? = outputShields

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

            return other is AgentConfig &&
                this.enableSessionPersistence == other.enableSessionPersistence &&
                this.inputShields == other.inputShields &&
                this.instructions == other.instructions &&
                this.maxInferIters == other.maxInferIters &&
                this.model == other.model &&
                this.outputShields == other.outputShields &&
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
                        enableSessionPersistence,
                        inputShields,
                        instructions,
                        maxInferIters,
                        model,
                        outputShields,
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
            "AgentConfig{enableSessionPersistence=$enableSessionPersistence, inputShields=$inputShields, instructions=$instructions, maxInferIters=$maxInferIters, model=$model, outputShields=$outputShields, samplingParams=$samplingParams, toolChoice=$toolChoice, toolPromptFormat=$toolPromptFormat, tools=$tools, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var enableSessionPersistence: Boolean? = null
            private var inputShields: List<String>? = null
            private var instructions: String? = null
            private var maxInferIters: Long? = null
            private var model: String? = null
            private var outputShields: List<String>? = null
            private var samplingParams: SamplingParams? = null
            private var toolChoice: ToolChoice? = null
            private var toolPromptFormat: ToolPromptFormat? = null
            private var tools: List<Tool>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(agentConfig: AgentConfig) = apply {
                this.enableSessionPersistence = agentConfig.enableSessionPersistence
                this.inputShields = agentConfig.inputShields
                this.instructions = agentConfig.instructions
                this.maxInferIters = agentConfig.maxInferIters
                this.model = agentConfig.model
                this.outputShields = agentConfig.outputShields
                this.samplingParams = agentConfig.samplingParams
                this.toolChoice = agentConfig.toolChoice
                this.toolPromptFormat = agentConfig.toolPromptFormat
                this.tools = agentConfig.tools
                additionalProperties(agentConfig.additionalProperties)
            }

            @JsonProperty("enable_session_persistence")
            fun enableSessionPersistence(enableSessionPersistence: Boolean) = apply {
                this.enableSessionPersistence = enableSessionPersistence
            }

            @JsonProperty("input_shields")
            fun inputShields(inputShields: List<String>) = apply {
                this.inputShields = inputShields
            }

            @JsonProperty("instructions")
            fun instructions(instructions: String) = apply { this.instructions = instructions }

            @JsonProperty("max_infer_iters")
            fun maxInferIters(maxInferIters: Long) = apply { this.maxInferIters = maxInferIters }

            @JsonProperty("model") fun model(model: String) = apply { this.model = model }

            @JsonProperty("output_shields")
            fun outputShields(outputShields: List<String>) = apply {
                this.outputShields = outputShields
            }

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

            fun build(): AgentConfig =
                AgentConfig(
                    checkNotNull(enableSessionPersistence) {
                        "`enableSessionPersistence` is required but was not set"
                    },
                    inputShields?.toUnmodifiable(),
                    checkNotNull(instructions) { "`instructions` is required but was not set" },
                    checkNotNull(maxInferIters) { "`maxInferIters` is required but was not set" },
                    checkNotNull(model) { "`model` is required but was not set" },
                    outputShields?.toUnmodifiable(),
                    samplingParams,
                    toolChoice,
                    toolPromptFormat,
                    tools?.toUnmodifiable(),
                    additionalProperties.toUnmodifiable(),
                )
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
                        throw LlamaStackClientInvalidDataException(
                            "Unknown ToolPromptFormat: $value"
                        )
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(using = Tool.Deserializer::class)
        @JsonSerialize(using = Tool.Serializer::class)
        class Tool
        private constructor(
            private val searchToolDefinition: SearchToolDefinition? = null,
            private val wolframAlphaToolDefinition: WolframAlphaToolDefinition? = null,
            private val photogenToolDefinition: PhotogenToolDefinition? = null,
            private val codeInterpreterToolDefinition: CodeInterpreterToolDefinition? = null,
            private val functionCallToolDefinition: FunctionCallToolDefinition? = null,
            private val memoryToolDefinition: MemoryToolDefinition? = null,
            private val _json: JsonValue? = null,
        ) {

            private var validated: Boolean = false

            fun searchToolDefinition(): SearchToolDefinition? = searchToolDefinition

            fun wolframAlphaToolDefinition(): WolframAlphaToolDefinition? =
                wolframAlphaToolDefinition

            fun photogenToolDefinition(): PhotogenToolDefinition? = photogenToolDefinition

            fun codeInterpreterToolDefinition(): CodeInterpreterToolDefinition? =
                codeInterpreterToolDefinition

            fun functionCallToolDefinition(): FunctionCallToolDefinition? =
                functionCallToolDefinition

            fun memoryToolDefinition(): MemoryToolDefinition? = memoryToolDefinition

            fun isSearchToolDefinition(): Boolean = searchToolDefinition != null

            fun isWolframAlphaToolDefinition(): Boolean = wolframAlphaToolDefinition != null

            fun isPhotogenToolDefinition(): Boolean = photogenToolDefinition != null

            fun isCodeInterpreterToolDefinition(): Boolean = codeInterpreterToolDefinition != null

            fun isFunctionCallToolDefinition(): Boolean = functionCallToolDefinition != null

            fun isMemoryToolDefinition(): Boolean = memoryToolDefinition != null

            fun asSearchToolDefinition(): SearchToolDefinition =
                searchToolDefinition.getOrThrow("searchToolDefinition")

            fun asWolframAlphaToolDefinition(): WolframAlphaToolDefinition =
                wolframAlphaToolDefinition.getOrThrow("wolframAlphaToolDefinition")

            fun asPhotogenToolDefinition(): PhotogenToolDefinition =
                photogenToolDefinition.getOrThrow("photogenToolDefinition")

            fun asCodeInterpreterToolDefinition(): CodeInterpreterToolDefinition =
                codeInterpreterToolDefinition.getOrThrow("codeInterpreterToolDefinition")

            fun asFunctionCallToolDefinition(): FunctionCallToolDefinition =
                functionCallToolDefinition.getOrThrow("functionCallToolDefinition")

            fun asMemoryToolDefinition(): MemoryToolDefinition =
                memoryToolDefinition.getOrThrow("memoryToolDefinition")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    searchToolDefinition != null ->
                        visitor.visitSearchToolDefinition(searchToolDefinition)
                    wolframAlphaToolDefinition != null ->
                        visitor.visitWolframAlphaToolDefinition(wolframAlphaToolDefinition)
                    photogenToolDefinition != null ->
                        visitor.visitPhotogenToolDefinition(photogenToolDefinition)
                    codeInterpreterToolDefinition != null ->
                        visitor.visitCodeInterpreterToolDefinition(codeInterpreterToolDefinition)
                    functionCallToolDefinition != null ->
                        visitor.visitFunctionCallToolDefinition(functionCallToolDefinition)
                    memoryToolDefinition != null ->
                        visitor.visitMemoryToolDefinition(memoryToolDefinition)
                    else -> visitor.unknown(_json)
                }
            }

            fun validate(): Tool = apply {
                if (!validated) {
                    if (
                        searchToolDefinition == null &&
                            wolframAlphaToolDefinition == null &&
                            photogenToolDefinition == null &&
                            codeInterpreterToolDefinition == null &&
                            functionCallToolDefinition == null &&
                            memoryToolDefinition == null
                    ) {
                        throw LlamaStackClientInvalidDataException("Unknown Tool: $_json")
                    }
                    searchToolDefinition?.validate()
                    wolframAlphaToolDefinition?.validate()
                    photogenToolDefinition?.validate()
                    codeInterpreterToolDefinition?.validate()
                    functionCallToolDefinition?.validate()
                    memoryToolDefinition?.validate()
                    validated = true
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Tool &&
                    this.searchToolDefinition == other.searchToolDefinition &&
                    this.wolframAlphaToolDefinition == other.wolframAlphaToolDefinition &&
                    this.photogenToolDefinition == other.photogenToolDefinition &&
                    this.codeInterpreterToolDefinition == other.codeInterpreterToolDefinition &&
                    this.functionCallToolDefinition == other.functionCallToolDefinition &&
                    this.memoryToolDefinition == other.memoryToolDefinition
            }

            override fun hashCode(): Int {
                return Objects.hash(
                    searchToolDefinition,
                    wolframAlphaToolDefinition,
                    photogenToolDefinition,
                    codeInterpreterToolDefinition,
                    functionCallToolDefinition,
                    memoryToolDefinition,
                )
            }

            override fun toString(): String {
                return when {
                    searchToolDefinition != null ->
                        "Tool{searchToolDefinition=$searchToolDefinition}"
                    wolframAlphaToolDefinition != null ->
                        "Tool{wolframAlphaToolDefinition=$wolframAlphaToolDefinition}"
                    photogenToolDefinition != null ->
                        "Tool{photogenToolDefinition=$photogenToolDefinition}"
                    codeInterpreterToolDefinition != null ->
                        "Tool{codeInterpreterToolDefinition=$codeInterpreterToolDefinition}"
                    functionCallToolDefinition != null ->
                        "Tool{functionCallToolDefinition=$functionCallToolDefinition}"
                    memoryToolDefinition != null ->
                        "Tool{memoryToolDefinition=$memoryToolDefinition}"
                    _json != null -> "Tool{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Tool")
                }
            }

            companion object {

                fun ofSearchToolDefinition(searchToolDefinition: SearchToolDefinition) =
                    Tool(searchToolDefinition = searchToolDefinition)

                fun ofWolframAlphaToolDefinition(
                    wolframAlphaToolDefinition: WolframAlphaToolDefinition
                ) = Tool(wolframAlphaToolDefinition = wolframAlphaToolDefinition)

                fun ofPhotogenToolDefinition(photogenToolDefinition: PhotogenToolDefinition) =
                    Tool(photogenToolDefinition = photogenToolDefinition)

                fun ofCodeInterpreterToolDefinition(
                    codeInterpreterToolDefinition: CodeInterpreterToolDefinition
                ) = Tool(codeInterpreterToolDefinition = codeInterpreterToolDefinition)

                fun ofFunctionCallToolDefinition(
                    functionCallToolDefinition: FunctionCallToolDefinition
                ) = Tool(functionCallToolDefinition = functionCallToolDefinition)

                fun ofMemoryToolDefinition(memoryToolDefinition: MemoryToolDefinition) =
                    Tool(memoryToolDefinition = memoryToolDefinition)
            }

            interface Visitor<out T> {

                fun visitSearchToolDefinition(searchToolDefinition: SearchToolDefinition): T

                fun visitWolframAlphaToolDefinition(
                    wolframAlphaToolDefinition: WolframAlphaToolDefinition
                ): T

                fun visitPhotogenToolDefinition(photogenToolDefinition: PhotogenToolDefinition): T

                fun visitCodeInterpreterToolDefinition(
                    codeInterpreterToolDefinition: CodeInterpreterToolDefinition
                ): T

                fun visitFunctionCallToolDefinition(
                    functionCallToolDefinition: FunctionCallToolDefinition
                ): T

                fun visitMemoryToolDefinition(memoryToolDefinition: MemoryToolDefinition): T

                fun unknown(json: JsonValue?): T {
                    throw LlamaStackClientInvalidDataException("Unknown Tool: $json")
                }
            }

            class Deserializer : BaseDeserializer<Tool>(Tool::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Tool {
                    val json = JsonValue.fromJsonNode(node)
                    tryDeserialize(node, jacksonTypeRef<SearchToolDefinition>()) { it.validate() }
                        ?.let {
                            return Tool(searchToolDefinition = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<WolframAlphaToolDefinition>()) {
                            it.validate()
                        }
                        ?.let {
                            return Tool(wolframAlphaToolDefinition = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<PhotogenToolDefinition>()) { it.validate() }
                        ?.let {
                            return Tool(photogenToolDefinition = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<CodeInterpreterToolDefinition>()) {
                            it.validate()
                        }
                        ?.let {
                            return Tool(codeInterpreterToolDefinition = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<FunctionCallToolDefinition>()) {
                            it.validate()
                        }
                        ?.let {
                            return Tool(functionCallToolDefinition = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<MemoryToolDefinition>()) { it.validate() }
                        ?.let {
                            return Tool(memoryToolDefinition = it, _json = json)
                        }

                    return Tool(_json = json)
                }
            }

            class Serializer : BaseSerializer<Tool>(Tool::class) {

                override fun serialize(
                    value: Tool,
                    generator: JsonGenerator,
                    provider: SerializerProvider
                ) {
                    when {
                        value.searchToolDefinition != null ->
                            generator.writeObject(value.searchToolDefinition)
                        value.wolframAlphaToolDefinition != null ->
                            generator.writeObject(value.wolframAlphaToolDefinition)
                        value.photogenToolDefinition != null ->
                            generator.writeObject(value.photogenToolDefinition)
                        value.codeInterpreterToolDefinition != null ->
                            generator.writeObject(value.codeInterpreterToolDefinition)
                        value.functionCallToolDefinition != null ->
                            generator.writeObject(value.functionCallToolDefinition)
                        value.memoryToolDefinition != null ->
                            generator.writeObject(value.memoryToolDefinition)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Tool")
                    }
                }
            }

            @JsonDeserialize(builder = SearchToolDefinition.Builder::class)
            @NoAutoDetect
            class SearchToolDefinition
            private constructor(
                private val apiKey: JsonField<String>,
                private val engine: JsonField<Engine>,
                private val inputShields: JsonField<List<String>>,
                private val outputShields: JsonField<List<String>>,
                private val remoteExecution: JsonField<RestApiExecutionConfig>,
                private val type: JsonField<Type>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun apiKey(): String = apiKey.getRequired("api_key")

                fun engine(): Engine = engine.getRequired("engine")

                fun inputShields(): List<String>? = inputShields.getNullable("input_shields")

                fun outputShields(): List<String>? = outputShields.getNullable("output_shields")

                fun remoteExecution(): RestApiExecutionConfig? =
                    remoteExecution.getNullable("remote_execution")

                fun type(): Type = type.getRequired("type")

                @JsonProperty("api_key") @ExcludeMissing fun _apiKey() = apiKey

                @JsonProperty("engine") @ExcludeMissing fun _engine() = engine

                @JsonProperty("input_shields") @ExcludeMissing fun _inputShields() = inputShields

                @JsonProperty("output_shields") @ExcludeMissing fun _outputShields() = outputShields

                @JsonProperty("remote_execution")
                @ExcludeMissing
                fun _remoteExecution() = remoteExecution

                @JsonProperty("type") @ExcludeMissing fun _type() = type

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): SearchToolDefinition = apply {
                    if (!validated) {
                        apiKey()
                        engine()
                        inputShields()
                        outputShields()
                        remoteExecution()?.validate()
                        type()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is SearchToolDefinition &&
                        this.apiKey == other.apiKey &&
                        this.engine == other.engine &&
                        this.inputShields == other.inputShields &&
                        this.outputShields == other.outputShields &&
                        this.remoteExecution == other.remoteExecution &&
                        this.type == other.type &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                apiKey,
                                engine,
                                inputShields,
                                outputShields,
                                remoteExecution,
                                type,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "SearchToolDefinition{apiKey=$apiKey, engine=$engine, inputShields=$inputShields, outputShields=$outputShields, remoteExecution=$remoteExecution, type=$type, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var apiKey: JsonField<String> = JsonMissing.of()
                    private var engine: JsonField<Engine> = JsonMissing.of()
                    private var inputShields: JsonField<List<String>> = JsonMissing.of()
                    private var outputShields: JsonField<List<String>> = JsonMissing.of()
                    private var remoteExecution: JsonField<RestApiExecutionConfig> =
                        JsonMissing.of()
                    private var type: JsonField<Type> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(searchToolDefinition: SearchToolDefinition) = apply {
                        this.apiKey = searchToolDefinition.apiKey
                        this.engine = searchToolDefinition.engine
                        this.inputShields = searchToolDefinition.inputShields
                        this.outputShields = searchToolDefinition.outputShields
                        this.remoteExecution = searchToolDefinition.remoteExecution
                        this.type = searchToolDefinition.type
                        additionalProperties(searchToolDefinition.additionalProperties)
                    }

                    fun apiKey(apiKey: String) = apiKey(JsonField.of(apiKey))

                    @JsonProperty("api_key")
                    @ExcludeMissing
                    fun apiKey(apiKey: JsonField<String>) = apply { this.apiKey = apiKey }

                    fun engine(engine: Engine) = engine(JsonField.of(engine))

                    @JsonProperty("engine")
                    @ExcludeMissing
                    fun engine(engine: JsonField<Engine>) = apply { this.engine = engine }

                    fun inputShields(inputShields: List<String>) =
                        inputShields(JsonField.of(inputShields))

                    @JsonProperty("input_shields")
                    @ExcludeMissing
                    fun inputShields(inputShields: JsonField<List<String>>) = apply {
                        this.inputShields = inputShields
                    }

                    fun outputShields(outputShields: List<String>) =
                        outputShields(JsonField.of(outputShields))

                    @JsonProperty("output_shields")
                    @ExcludeMissing
                    fun outputShields(outputShields: JsonField<List<String>>) = apply {
                        this.outputShields = outputShields
                    }

                    fun remoteExecution(remoteExecution: RestApiExecutionConfig) =
                        remoteExecution(JsonField.of(remoteExecution))

                    @JsonProperty("remote_execution")
                    @ExcludeMissing
                    fun remoteExecution(remoteExecution: JsonField<RestApiExecutionConfig>) =
                        apply {
                            this.remoteExecution = remoteExecution
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

                    fun build(): SearchToolDefinition =
                        SearchToolDefinition(
                            apiKey,
                            engine,
                            inputShields.map { it.toUnmodifiable() },
                            outputShields.map { it.toUnmodifiable() },
                            remoteExecution,
                            type,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Engine
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Engine && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val BING = Engine(JsonField.of("bing"))

                        val BRAVE = Engine(JsonField.of("brave"))

                        fun of(value: String) = Engine(JsonField.of(value))
                    }

                    enum class Known {
                        BING,
                        BRAVE,
                    }

                    enum class Value {
                        BING,
                        BRAVE,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            BING -> Value.BING
                            BRAVE -> Value.BRAVE
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            BING -> Known.BING
                            BRAVE -> Known.BRAVE
                            else ->
                                throw LlamaStackClientInvalidDataException("Unknown Engine: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                class Type
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Type && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val BRAVE_SEARCH = Type(JsonField.of("brave_search"))

                        fun of(value: String) = Type(JsonField.of(value))
                    }

                    enum class Known {
                        BRAVE_SEARCH,
                    }

                    enum class Value {
                        BRAVE_SEARCH,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            BRAVE_SEARCH -> Value.BRAVE_SEARCH
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            BRAVE_SEARCH -> Known.BRAVE_SEARCH
                            else ->
                                throw LlamaStackClientInvalidDataException("Unknown Type: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }

            @JsonDeserialize(builder = WolframAlphaToolDefinition.Builder::class)
            @NoAutoDetect
            class WolframAlphaToolDefinition
            private constructor(
                private val apiKey: JsonField<String>,
                private val inputShields: JsonField<List<String>>,
                private val outputShields: JsonField<List<String>>,
                private val remoteExecution: JsonField<RestApiExecutionConfig>,
                private val type: JsonField<Type>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun apiKey(): String = apiKey.getRequired("api_key")

                fun inputShields(): List<String>? = inputShields.getNullable("input_shields")

                fun outputShields(): List<String>? = outputShields.getNullable("output_shields")

                fun remoteExecution(): RestApiExecutionConfig? =
                    remoteExecution.getNullable("remote_execution")

                fun type(): Type = type.getRequired("type")

                @JsonProperty("api_key") @ExcludeMissing fun _apiKey() = apiKey

                @JsonProperty("input_shields") @ExcludeMissing fun _inputShields() = inputShields

                @JsonProperty("output_shields") @ExcludeMissing fun _outputShields() = outputShields

                @JsonProperty("remote_execution")
                @ExcludeMissing
                fun _remoteExecution() = remoteExecution

                @JsonProperty("type") @ExcludeMissing fun _type() = type

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): WolframAlphaToolDefinition = apply {
                    if (!validated) {
                        apiKey()
                        inputShields()
                        outputShields()
                        remoteExecution()?.validate()
                        type()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is WolframAlphaToolDefinition &&
                        this.apiKey == other.apiKey &&
                        this.inputShields == other.inputShields &&
                        this.outputShields == other.outputShields &&
                        this.remoteExecution == other.remoteExecution &&
                        this.type == other.type &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                apiKey,
                                inputShields,
                                outputShields,
                                remoteExecution,
                                type,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "WolframAlphaToolDefinition{apiKey=$apiKey, inputShields=$inputShields, outputShields=$outputShields, remoteExecution=$remoteExecution, type=$type, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var apiKey: JsonField<String> = JsonMissing.of()
                    private var inputShields: JsonField<List<String>> = JsonMissing.of()
                    private var outputShields: JsonField<List<String>> = JsonMissing.of()
                    private var remoteExecution: JsonField<RestApiExecutionConfig> =
                        JsonMissing.of()
                    private var type: JsonField<Type> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(wolframAlphaToolDefinition: WolframAlphaToolDefinition) =
                        apply {
                            this.apiKey = wolframAlphaToolDefinition.apiKey
                            this.inputShields = wolframAlphaToolDefinition.inputShields
                            this.outputShields = wolframAlphaToolDefinition.outputShields
                            this.remoteExecution = wolframAlphaToolDefinition.remoteExecution
                            this.type = wolframAlphaToolDefinition.type
                            additionalProperties(wolframAlphaToolDefinition.additionalProperties)
                        }

                    fun apiKey(apiKey: String) = apiKey(JsonField.of(apiKey))

                    @JsonProperty("api_key")
                    @ExcludeMissing
                    fun apiKey(apiKey: JsonField<String>) = apply { this.apiKey = apiKey }

                    fun inputShields(inputShields: List<String>) =
                        inputShields(JsonField.of(inputShields))

                    @JsonProperty("input_shields")
                    @ExcludeMissing
                    fun inputShields(inputShields: JsonField<List<String>>) = apply {
                        this.inputShields = inputShields
                    }

                    fun outputShields(outputShields: List<String>) =
                        outputShields(JsonField.of(outputShields))

                    @JsonProperty("output_shields")
                    @ExcludeMissing
                    fun outputShields(outputShields: JsonField<List<String>>) = apply {
                        this.outputShields = outputShields
                    }

                    fun remoteExecution(remoteExecution: RestApiExecutionConfig) =
                        remoteExecution(JsonField.of(remoteExecution))

                    @JsonProperty("remote_execution")
                    @ExcludeMissing
                    fun remoteExecution(remoteExecution: JsonField<RestApiExecutionConfig>) =
                        apply {
                            this.remoteExecution = remoteExecution
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

                    fun build(): WolframAlphaToolDefinition =
                        WolframAlphaToolDefinition(
                            apiKey,
                            inputShields.map { it.toUnmodifiable() },
                            outputShields.map { it.toUnmodifiable() },
                            remoteExecution,
                            type,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Type
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Type && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val WOLFRAM_ALPHA = Type(JsonField.of("wolfram_alpha"))

                        fun of(value: String) = Type(JsonField.of(value))
                    }

                    enum class Known {
                        WOLFRAM_ALPHA,
                    }

                    enum class Value {
                        WOLFRAM_ALPHA,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            WOLFRAM_ALPHA -> Value.WOLFRAM_ALPHA
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            WOLFRAM_ALPHA -> Known.WOLFRAM_ALPHA
                            else ->
                                throw LlamaStackClientInvalidDataException("Unknown Type: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }

            @JsonDeserialize(builder = PhotogenToolDefinition.Builder::class)
            @NoAutoDetect
            class PhotogenToolDefinition
            private constructor(
                private val inputShields: JsonField<List<String>>,
                private val outputShields: JsonField<List<String>>,
                private val remoteExecution: JsonField<RestApiExecutionConfig>,
                private val type: JsonField<Type>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun inputShields(): List<String>? = inputShields.getNullable("input_shields")

                fun outputShields(): List<String>? = outputShields.getNullable("output_shields")

                fun remoteExecution(): RestApiExecutionConfig? =
                    remoteExecution.getNullable("remote_execution")

                fun type(): Type = type.getRequired("type")

                @JsonProperty("input_shields") @ExcludeMissing fun _inputShields() = inputShields

                @JsonProperty("output_shields") @ExcludeMissing fun _outputShields() = outputShields

                @JsonProperty("remote_execution")
                @ExcludeMissing
                fun _remoteExecution() = remoteExecution

                @JsonProperty("type") @ExcludeMissing fun _type() = type

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): PhotogenToolDefinition = apply {
                    if (!validated) {
                        inputShields()
                        outputShields()
                        remoteExecution()?.validate()
                        type()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PhotogenToolDefinition &&
                        this.inputShields == other.inputShields &&
                        this.outputShields == other.outputShields &&
                        this.remoteExecution == other.remoteExecution &&
                        this.type == other.type &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                inputShields,
                                outputShields,
                                remoteExecution,
                                type,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "PhotogenToolDefinition{inputShields=$inputShields, outputShields=$outputShields, remoteExecution=$remoteExecution, type=$type, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var inputShields: JsonField<List<String>> = JsonMissing.of()
                    private var outputShields: JsonField<List<String>> = JsonMissing.of()
                    private var remoteExecution: JsonField<RestApiExecutionConfig> =
                        JsonMissing.of()
                    private var type: JsonField<Type> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(photogenToolDefinition: PhotogenToolDefinition) = apply {
                        this.inputShields = photogenToolDefinition.inputShields
                        this.outputShields = photogenToolDefinition.outputShields
                        this.remoteExecution = photogenToolDefinition.remoteExecution
                        this.type = photogenToolDefinition.type
                        additionalProperties(photogenToolDefinition.additionalProperties)
                    }

                    fun inputShields(inputShields: List<String>) =
                        inputShields(JsonField.of(inputShields))

                    @JsonProperty("input_shields")
                    @ExcludeMissing
                    fun inputShields(inputShields: JsonField<List<String>>) = apply {
                        this.inputShields = inputShields
                    }

                    fun outputShields(outputShields: List<String>) =
                        outputShields(JsonField.of(outputShields))

                    @JsonProperty("output_shields")
                    @ExcludeMissing
                    fun outputShields(outputShields: JsonField<List<String>>) = apply {
                        this.outputShields = outputShields
                    }

                    fun remoteExecution(remoteExecution: RestApiExecutionConfig) =
                        remoteExecution(JsonField.of(remoteExecution))

                    @JsonProperty("remote_execution")
                    @ExcludeMissing
                    fun remoteExecution(remoteExecution: JsonField<RestApiExecutionConfig>) =
                        apply {
                            this.remoteExecution = remoteExecution
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

                    fun build(): PhotogenToolDefinition =
                        PhotogenToolDefinition(
                            inputShields.map { it.toUnmodifiable() },
                            outputShields.map { it.toUnmodifiable() },
                            remoteExecution,
                            type,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Type
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Type && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val PHOTOGEN = Type(JsonField.of("photogen"))

                        fun of(value: String) = Type(JsonField.of(value))
                    }

                    enum class Known {
                        PHOTOGEN,
                    }

                    enum class Value {
                        PHOTOGEN,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            PHOTOGEN -> Value.PHOTOGEN
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            PHOTOGEN -> Known.PHOTOGEN
                            else ->
                                throw LlamaStackClientInvalidDataException("Unknown Type: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }

            @JsonDeserialize(builder = CodeInterpreterToolDefinition.Builder::class)
            @NoAutoDetect
            class CodeInterpreterToolDefinition
            private constructor(
                private val enableInlineCodeExecution: JsonField<Boolean>,
                private val inputShields: JsonField<List<String>>,
                private val outputShields: JsonField<List<String>>,
                private val remoteExecution: JsonField<RestApiExecutionConfig>,
                private val type: JsonField<Type>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun enableInlineCodeExecution(): Boolean =
                    enableInlineCodeExecution.getRequired("enable_inline_code_execution")

                fun inputShields(): List<String>? = inputShields.getNullable("input_shields")

                fun outputShields(): List<String>? = outputShields.getNullable("output_shields")

                fun remoteExecution(): RestApiExecutionConfig? =
                    remoteExecution.getNullable("remote_execution")

                fun type(): Type = type.getRequired("type")

                @JsonProperty("enable_inline_code_execution")
                @ExcludeMissing
                fun _enableInlineCodeExecution() = enableInlineCodeExecution

                @JsonProperty("input_shields") @ExcludeMissing fun _inputShields() = inputShields

                @JsonProperty("output_shields") @ExcludeMissing fun _outputShields() = outputShields

                @JsonProperty("remote_execution")
                @ExcludeMissing
                fun _remoteExecution() = remoteExecution

                @JsonProperty("type") @ExcludeMissing fun _type() = type

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): CodeInterpreterToolDefinition = apply {
                    if (!validated) {
                        enableInlineCodeExecution()
                        inputShields()
                        outputShields()
                        remoteExecution()?.validate()
                        type()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CodeInterpreterToolDefinition &&
                        this.enableInlineCodeExecution == other.enableInlineCodeExecution &&
                        this.inputShields == other.inputShields &&
                        this.outputShields == other.outputShields &&
                        this.remoteExecution == other.remoteExecution &&
                        this.type == other.type &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                enableInlineCodeExecution,
                                inputShields,
                                outputShields,
                                remoteExecution,
                                type,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "CodeInterpreterToolDefinition{enableInlineCodeExecution=$enableInlineCodeExecution, inputShields=$inputShields, outputShields=$outputShields, remoteExecution=$remoteExecution, type=$type, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var enableInlineCodeExecution: JsonField<Boolean> = JsonMissing.of()
                    private var inputShields: JsonField<List<String>> = JsonMissing.of()
                    private var outputShields: JsonField<List<String>> = JsonMissing.of()
                    private var remoteExecution: JsonField<RestApiExecutionConfig> =
                        JsonMissing.of()
                    private var type: JsonField<Type> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(
                        codeInterpreterToolDefinition: CodeInterpreterToolDefinition
                    ) = apply {
                        this.enableInlineCodeExecution =
                            codeInterpreterToolDefinition.enableInlineCodeExecution
                        this.inputShields = codeInterpreterToolDefinition.inputShields
                        this.outputShields = codeInterpreterToolDefinition.outputShields
                        this.remoteExecution = codeInterpreterToolDefinition.remoteExecution
                        this.type = codeInterpreterToolDefinition.type
                        additionalProperties(codeInterpreterToolDefinition.additionalProperties)
                    }

                    fun enableInlineCodeExecution(enableInlineCodeExecution: Boolean) =
                        enableInlineCodeExecution(JsonField.of(enableInlineCodeExecution))

                    @JsonProperty("enable_inline_code_execution")
                    @ExcludeMissing
                    fun enableInlineCodeExecution(enableInlineCodeExecution: JsonField<Boolean>) =
                        apply {
                            this.enableInlineCodeExecution = enableInlineCodeExecution
                        }

                    fun inputShields(inputShields: List<String>) =
                        inputShields(JsonField.of(inputShields))

                    @JsonProperty("input_shields")
                    @ExcludeMissing
                    fun inputShields(inputShields: JsonField<List<String>>) = apply {
                        this.inputShields = inputShields
                    }

                    fun outputShields(outputShields: List<String>) =
                        outputShields(JsonField.of(outputShields))

                    @JsonProperty("output_shields")
                    @ExcludeMissing
                    fun outputShields(outputShields: JsonField<List<String>>) = apply {
                        this.outputShields = outputShields
                    }

                    fun remoteExecution(remoteExecution: RestApiExecutionConfig) =
                        remoteExecution(JsonField.of(remoteExecution))

                    @JsonProperty("remote_execution")
                    @ExcludeMissing
                    fun remoteExecution(remoteExecution: JsonField<RestApiExecutionConfig>) =
                        apply {
                            this.remoteExecution = remoteExecution
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

                    fun build(): CodeInterpreterToolDefinition =
                        CodeInterpreterToolDefinition(
                            enableInlineCodeExecution,
                            inputShields.map { it.toUnmodifiable() },
                            outputShields.map { it.toUnmodifiable() },
                            remoteExecution,
                            type,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Type
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Type && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val CODE_INTERPRETER = Type(JsonField.of("code_interpreter"))

                        fun of(value: String) = Type(JsonField.of(value))
                    }

                    enum class Known {
                        CODE_INTERPRETER,
                    }

                    enum class Value {
                        CODE_INTERPRETER,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            CODE_INTERPRETER -> Value.CODE_INTERPRETER
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            CODE_INTERPRETER -> Known.CODE_INTERPRETER
                            else ->
                                throw LlamaStackClientInvalidDataException("Unknown Type: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }

            @JsonDeserialize(builder = FunctionCallToolDefinition.Builder::class)
            @NoAutoDetect
            class FunctionCallToolDefinition
            private constructor(
                private val description: JsonField<String>,
                private val functionName: JsonField<String>,
                private val inputShields: JsonField<List<String>>,
                private val outputShields: JsonField<List<String>>,
                private val parameters: JsonField<Parameters>,
                private val remoteExecution: JsonField<RestApiExecutionConfig>,
                private val type: JsonField<Type>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun description(): String = description.getRequired("description")

                fun functionName(): String = functionName.getRequired("function_name")

                fun inputShields(): List<String>? = inputShields.getNullable("input_shields")

                fun outputShields(): List<String>? = outputShields.getNullable("output_shields")

                fun parameters(): Parameters = parameters.getRequired("parameters")

                fun remoteExecution(): RestApiExecutionConfig? =
                    remoteExecution.getNullable("remote_execution")

                fun type(): Type = type.getRequired("type")

                @JsonProperty("description") @ExcludeMissing fun _description() = description

                @JsonProperty("function_name") @ExcludeMissing fun _functionName() = functionName

                @JsonProperty("input_shields") @ExcludeMissing fun _inputShields() = inputShields

                @JsonProperty("output_shields") @ExcludeMissing fun _outputShields() = outputShields

                @JsonProperty("parameters") @ExcludeMissing fun _parameters() = parameters

                @JsonProperty("remote_execution")
                @ExcludeMissing
                fun _remoteExecution() = remoteExecution

                @JsonProperty("type") @ExcludeMissing fun _type() = type

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): FunctionCallToolDefinition = apply {
                    if (!validated) {
                        description()
                        functionName()
                        inputShields()
                        outputShields()
                        parameters().validate()
                        remoteExecution()?.validate()
                        type()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is FunctionCallToolDefinition &&
                        this.description == other.description &&
                        this.functionName == other.functionName &&
                        this.inputShields == other.inputShields &&
                        this.outputShields == other.outputShields &&
                        this.parameters == other.parameters &&
                        this.remoteExecution == other.remoteExecution &&
                        this.type == other.type &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                description,
                                functionName,
                                inputShields,
                                outputShields,
                                parameters,
                                remoteExecution,
                                type,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "FunctionCallToolDefinition{description=$description, functionName=$functionName, inputShields=$inputShields, outputShields=$outputShields, parameters=$parameters, remoteExecution=$remoteExecution, type=$type, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var description: JsonField<String> = JsonMissing.of()
                    private var functionName: JsonField<String> = JsonMissing.of()
                    private var inputShields: JsonField<List<String>> = JsonMissing.of()
                    private var outputShields: JsonField<List<String>> = JsonMissing.of()
                    private var parameters: JsonField<Parameters> = JsonMissing.of()
                    private var remoteExecution: JsonField<RestApiExecutionConfig> =
                        JsonMissing.of()
                    private var type: JsonField<Type> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(functionCallToolDefinition: FunctionCallToolDefinition) =
                        apply {
                            this.description = functionCallToolDefinition.description
                            this.functionName = functionCallToolDefinition.functionName
                            this.inputShields = functionCallToolDefinition.inputShields
                            this.outputShields = functionCallToolDefinition.outputShields
                            this.parameters = functionCallToolDefinition.parameters
                            this.remoteExecution = functionCallToolDefinition.remoteExecution
                            this.type = functionCallToolDefinition.type
                            additionalProperties(functionCallToolDefinition.additionalProperties)
                        }

                    fun description(description: String) = description(JsonField.of(description))

                    @JsonProperty("description")
                    @ExcludeMissing
                    fun description(description: JsonField<String>) = apply {
                        this.description = description
                    }

                    fun functionName(functionName: String) =
                        functionName(JsonField.of(functionName))

                    @JsonProperty("function_name")
                    @ExcludeMissing
                    fun functionName(functionName: JsonField<String>) = apply {
                        this.functionName = functionName
                    }

                    fun inputShields(inputShields: List<String>) =
                        inputShields(JsonField.of(inputShields))

                    @JsonProperty("input_shields")
                    @ExcludeMissing
                    fun inputShields(inputShields: JsonField<List<String>>) = apply {
                        this.inputShields = inputShields
                    }

                    fun outputShields(outputShields: List<String>) =
                        outputShields(JsonField.of(outputShields))

                    @JsonProperty("output_shields")
                    @ExcludeMissing
                    fun outputShields(outputShields: JsonField<List<String>>) = apply {
                        this.outputShields = outputShields
                    }

                    fun parameters(parameters: Parameters) = parameters(JsonField.of(parameters))

                    @JsonProperty("parameters")
                    @ExcludeMissing
                    fun parameters(parameters: JsonField<Parameters>) = apply {
                        this.parameters = parameters
                    }

                    fun remoteExecution(remoteExecution: RestApiExecutionConfig) =
                        remoteExecution(JsonField.of(remoteExecution))

                    @JsonProperty("remote_execution")
                    @ExcludeMissing
                    fun remoteExecution(remoteExecution: JsonField<RestApiExecutionConfig>) =
                        apply {
                            this.remoteExecution = remoteExecution
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

                    fun build(): FunctionCallToolDefinition =
                        FunctionCallToolDefinition(
                            description,
                            functionName,
                            inputShields.map { it.toUnmodifiable() },
                            outputShields.map { it.toUnmodifiable() },
                            parameters,
                            remoteExecution,
                            type,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                @JsonDeserialize(builder = Parameters.Builder::class)
                @NoAutoDetect
                class Parameters
                private constructor(
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Parameters = apply {
                        if (!validated) {
                            validated = true
                        }
                    }

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

                    override fun toString() =
                        "Parameters{additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(parameters: Parameters) = apply {
                            additionalProperties(parameters.additionalProperties)
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Parameters = Parameters(additionalProperties.toUnmodifiable())
                    }
                }

                class Type
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Type && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val FUNCTION_CALL = Type(JsonField.of("function_call"))

                        fun of(value: String) = Type(JsonField.of(value))
                    }

                    enum class Known {
                        FUNCTION_CALL,
                    }

                    enum class Value {
                        FUNCTION_CALL,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            FUNCTION_CALL -> Value.FUNCTION_CALL
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            FUNCTION_CALL -> Known.FUNCTION_CALL
                            else ->
                                throw LlamaStackClientInvalidDataException("Unknown Type: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }

            @JsonDeserialize(builder = MemoryToolDefinition.Builder::class)
            @NoAutoDetect
            class MemoryToolDefinition
            private constructor(
                private val inputShields: JsonField<List<String>>,
                private val maxChunks: JsonField<Long>,
                private val maxTokensInContext: JsonField<Long>,
                private val memoryBankConfigs: JsonField<List<MemoryBankConfig>>,
                private val outputShields: JsonField<List<String>>,
                private val queryGeneratorConfig: JsonField<QueryGeneratorConfig>,
                private val type: JsonField<Type>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun inputShields(): List<String>? = inputShields.getNullable("input_shields")

                fun maxChunks(): Long = maxChunks.getRequired("max_chunks")

                fun maxTokensInContext(): Long =
                    maxTokensInContext.getRequired("max_tokens_in_context")

                fun memoryBankConfigs(): List<MemoryBankConfig> =
                    memoryBankConfigs.getRequired("memory_bank_configs")

                fun outputShields(): List<String>? = outputShields.getNullable("output_shields")

                fun queryGeneratorConfig(): QueryGeneratorConfig =
                    queryGeneratorConfig.getRequired("query_generator_config")

                fun type(): Type = type.getRequired("type")

                @JsonProperty("input_shields") @ExcludeMissing fun _inputShields() = inputShields

                @JsonProperty("max_chunks") @ExcludeMissing fun _maxChunks() = maxChunks

                @JsonProperty("max_tokens_in_context")
                @ExcludeMissing
                fun _maxTokensInContext() = maxTokensInContext

                @JsonProperty("memory_bank_configs")
                @ExcludeMissing
                fun _memoryBankConfigs() = memoryBankConfigs

                @JsonProperty("output_shields") @ExcludeMissing fun _outputShields() = outputShields

                @JsonProperty("query_generator_config")
                @ExcludeMissing
                fun _queryGeneratorConfig() = queryGeneratorConfig

                @JsonProperty("type") @ExcludeMissing fun _type() = type

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): MemoryToolDefinition = apply {
                    if (!validated) {
                        inputShields()
                        maxChunks()
                        maxTokensInContext()
                        memoryBankConfigs()
                        outputShields()
                        queryGeneratorConfig()
                        type()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is MemoryToolDefinition &&
                        this.inputShields == other.inputShields &&
                        this.maxChunks == other.maxChunks &&
                        this.maxTokensInContext == other.maxTokensInContext &&
                        this.memoryBankConfigs == other.memoryBankConfigs &&
                        this.outputShields == other.outputShields &&
                        this.queryGeneratorConfig == other.queryGeneratorConfig &&
                        this.type == other.type &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                inputShields,
                                maxChunks,
                                maxTokensInContext,
                                memoryBankConfigs,
                                outputShields,
                                queryGeneratorConfig,
                                type,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "MemoryToolDefinition{inputShields=$inputShields, maxChunks=$maxChunks, maxTokensInContext=$maxTokensInContext, memoryBankConfigs=$memoryBankConfigs, outputShields=$outputShields, queryGeneratorConfig=$queryGeneratorConfig, type=$type, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var inputShields: JsonField<List<String>> = JsonMissing.of()
                    private var maxChunks: JsonField<Long> = JsonMissing.of()
                    private var maxTokensInContext: JsonField<Long> = JsonMissing.of()
                    private var memoryBankConfigs: JsonField<List<MemoryBankConfig>> =
                        JsonMissing.of()
                    private var outputShields: JsonField<List<String>> = JsonMissing.of()
                    private var queryGeneratorConfig: JsonField<QueryGeneratorConfig> =
                        JsonMissing.of()
                    private var type: JsonField<Type> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(memoryToolDefinition: MemoryToolDefinition) = apply {
                        this.inputShields = memoryToolDefinition.inputShields
                        this.maxChunks = memoryToolDefinition.maxChunks
                        this.maxTokensInContext = memoryToolDefinition.maxTokensInContext
                        this.memoryBankConfigs = memoryToolDefinition.memoryBankConfigs
                        this.outputShields = memoryToolDefinition.outputShields
                        this.queryGeneratorConfig = memoryToolDefinition.queryGeneratorConfig
                        this.type = memoryToolDefinition.type
                        additionalProperties(memoryToolDefinition.additionalProperties)
                    }

                    fun inputShields(inputShields: List<String>) =
                        inputShields(JsonField.of(inputShields))

                    @JsonProperty("input_shields")
                    @ExcludeMissing
                    fun inputShields(inputShields: JsonField<List<String>>) = apply {
                        this.inputShields = inputShields
                    }

                    fun maxChunks(maxChunks: Long) = maxChunks(JsonField.of(maxChunks))

                    @JsonProperty("max_chunks")
                    @ExcludeMissing
                    fun maxChunks(maxChunks: JsonField<Long>) = apply { this.maxChunks = maxChunks }

                    fun maxTokensInContext(maxTokensInContext: Long) =
                        maxTokensInContext(JsonField.of(maxTokensInContext))

                    @JsonProperty("max_tokens_in_context")
                    @ExcludeMissing
                    fun maxTokensInContext(maxTokensInContext: JsonField<Long>) = apply {
                        this.maxTokensInContext = maxTokensInContext
                    }

                    fun memoryBankConfigs(memoryBankConfigs: List<MemoryBankConfig>) =
                        memoryBankConfigs(JsonField.of(memoryBankConfigs))

                    @JsonProperty("memory_bank_configs")
                    @ExcludeMissing
                    fun memoryBankConfigs(memoryBankConfigs: JsonField<List<MemoryBankConfig>>) =
                        apply {
                            this.memoryBankConfigs = memoryBankConfigs
                        }

                    fun outputShields(outputShields: List<String>) =
                        outputShields(JsonField.of(outputShields))

                    @JsonProperty("output_shields")
                    @ExcludeMissing
                    fun outputShields(outputShields: JsonField<List<String>>) = apply {
                        this.outputShields = outputShields
                    }

                    fun queryGeneratorConfig(queryGeneratorConfig: QueryGeneratorConfig) =
                        queryGeneratorConfig(JsonField.of(queryGeneratorConfig))

                    @JsonProperty("query_generator_config")
                    @ExcludeMissing
                    fun queryGeneratorConfig(
                        queryGeneratorConfig: JsonField<QueryGeneratorConfig>
                    ) = apply { this.queryGeneratorConfig = queryGeneratorConfig }

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

                    fun build(): MemoryToolDefinition =
                        MemoryToolDefinition(
                            inputShields.map { it.toUnmodifiable() },
                            maxChunks,
                            maxTokensInContext,
                            memoryBankConfigs.map { it.toUnmodifiable() },
                            outputShields.map { it.toUnmodifiable() },
                            queryGeneratorConfig,
                            type,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                @JsonDeserialize(using = MemoryBankConfig.Deserializer::class)
                @JsonSerialize(using = MemoryBankConfig.Serializer::class)
                class MemoryBankConfig
                private constructor(
                    private val unionMember0: UnionMember0? = null,
                    private val unionMember1: UnionMember1? = null,
                    private val unionMember2: UnionMember2? = null,
                    private val unionMember3: UnionMember3? = null,
                    private val _json: JsonValue? = null,
                ) {

                    private var validated: Boolean = false

                    fun unionMember0(): UnionMember0? = unionMember0

                    fun unionMember1(): UnionMember1? = unionMember1

                    fun unionMember2(): UnionMember2? = unionMember2

                    fun unionMember3(): UnionMember3? = unionMember3

                    fun isUnionMember0(): Boolean = unionMember0 != null

                    fun isUnionMember1(): Boolean = unionMember1 != null

                    fun isUnionMember2(): Boolean = unionMember2 != null

                    fun isUnionMember3(): Boolean = unionMember3 != null

                    fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")

                    fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")

                    fun asUnionMember2(): UnionMember2 = unionMember2.getOrThrow("unionMember2")

                    fun asUnionMember3(): UnionMember3 = unionMember3.getOrThrow("unionMember3")

                    fun _json(): JsonValue? = _json

                    fun <T> accept(visitor: Visitor<T>): T {
                        return when {
                            unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
                            unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
                            unionMember2 != null -> visitor.visitUnionMember2(unionMember2)
                            unionMember3 != null -> visitor.visitUnionMember3(unionMember3)
                            else -> visitor.unknown(_json)
                        }
                    }

                    fun validate(): MemoryBankConfig = apply {
                        if (!validated) {
                            if (
                                unionMember0 == null &&
                                    unionMember1 == null &&
                                    unionMember2 == null &&
                                    unionMember3 == null
                            ) {
                                throw LlamaStackClientInvalidDataException(
                                    "Unknown MemoryBankConfig: $_json"
                                )
                            }
                            unionMember0?.validate()
                            unionMember1?.validate()
                            unionMember2?.validate()
                            unionMember3?.validate()
                            validated = true
                        }
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is MemoryBankConfig &&
                            this.unionMember0 == other.unionMember0 &&
                            this.unionMember1 == other.unionMember1 &&
                            this.unionMember2 == other.unionMember2 &&
                            this.unionMember3 == other.unionMember3
                    }

                    override fun hashCode(): Int {
                        return Objects.hash(
                            unionMember0,
                            unionMember1,
                            unionMember2,
                            unionMember3,
                        )
                    }

                    override fun toString(): String {
                        return when {
                            unionMember0 != null -> "MemoryBankConfig{unionMember0=$unionMember0}"
                            unionMember1 != null -> "MemoryBankConfig{unionMember1=$unionMember1}"
                            unionMember2 != null -> "MemoryBankConfig{unionMember2=$unionMember2}"
                            unionMember3 != null -> "MemoryBankConfig{unionMember3=$unionMember3}"
                            _json != null -> "MemoryBankConfig{_unknown=$_json}"
                            else -> throw IllegalStateException("Invalid MemoryBankConfig")
                        }
                    }

                    companion object {

                        fun ofUnionMember0(unionMember0: UnionMember0) =
                            MemoryBankConfig(unionMember0 = unionMember0)

                        fun ofUnionMember1(unionMember1: UnionMember1) =
                            MemoryBankConfig(unionMember1 = unionMember1)

                        fun ofUnionMember2(unionMember2: UnionMember2) =
                            MemoryBankConfig(unionMember2 = unionMember2)

                        fun ofUnionMember3(unionMember3: UnionMember3) =
                            MemoryBankConfig(unionMember3 = unionMember3)
                    }

                    interface Visitor<out T> {

                        fun visitUnionMember0(unionMember0: UnionMember0): T

                        fun visitUnionMember1(unionMember1: UnionMember1): T

                        fun visitUnionMember2(unionMember2: UnionMember2): T

                        fun visitUnionMember3(unionMember3: UnionMember3): T

                        fun unknown(json: JsonValue?): T {
                            throw LlamaStackClientInvalidDataException(
                                "Unknown MemoryBankConfig: $json"
                            )
                        }
                    }

                    class Deserializer :
                        BaseDeserializer<MemoryBankConfig>(MemoryBankConfig::class) {

                        override fun ObjectCodec.deserialize(node: JsonNode): MemoryBankConfig {
                            val json = JsonValue.fromJsonNode(node)
                            tryDeserialize(node, jacksonTypeRef<UnionMember0>()) { it.validate() }
                                ?.let {
                                    return MemoryBankConfig(unionMember0 = it, _json = json)
                                }
                            tryDeserialize(node, jacksonTypeRef<UnionMember1>()) { it.validate() }
                                ?.let {
                                    return MemoryBankConfig(unionMember1 = it, _json = json)
                                }
                            tryDeserialize(node, jacksonTypeRef<UnionMember2>()) { it.validate() }
                                ?.let {
                                    return MemoryBankConfig(unionMember2 = it, _json = json)
                                }
                            tryDeserialize(node, jacksonTypeRef<UnionMember3>()) { it.validate() }
                                ?.let {
                                    return MemoryBankConfig(unionMember3 = it, _json = json)
                                }

                            return MemoryBankConfig(_json = json)
                        }
                    }

                    class Serializer : BaseSerializer<MemoryBankConfig>(MemoryBankConfig::class) {

                        override fun serialize(
                            value: MemoryBankConfig,
                            generator: JsonGenerator,
                            provider: SerializerProvider
                        ) {
                            when {
                                value.unionMember0 != null ->
                                    generator.writeObject(value.unionMember0)
                                value.unionMember1 != null ->
                                    generator.writeObject(value.unionMember1)
                                value.unionMember2 != null ->
                                    generator.writeObject(value.unionMember2)
                                value.unionMember3 != null ->
                                    generator.writeObject(value.unionMember3)
                                value._json != null -> generator.writeObject(value._json)
                                else -> throw IllegalStateException("Invalid MemoryBankConfig")
                            }
                        }
                    }

                    @JsonDeserialize(builder = UnionMember0.Builder::class)
                    @NoAutoDetect
                    class UnionMember0
                    private constructor(
                        private val bankId: JsonField<String>,
                        private val type: JsonField<Type>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        fun bankId(): String = bankId.getRequired("bank_id")

                        fun type(): Type = type.getRequired("type")

                        @JsonProperty("bank_id") @ExcludeMissing fun _bankId() = bankId

                        @JsonProperty("type") @ExcludeMissing fun _type() = type

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): UnionMember0 = apply {
                            if (!validated) {
                                bankId()
                                type()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is UnionMember0 &&
                                this.bankId == other.bankId &&
                                this.type == other.type &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        bankId,
                                        type,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "UnionMember0{bankId=$bankId, type=$type, additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var bankId: JsonField<String> = JsonMissing.of()
                            private var type: JsonField<Type> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(unionMember0: UnionMember0) = apply {
                                this.bankId = unionMember0.bankId
                                this.type = unionMember0.type
                                additionalProperties(unionMember0.additionalProperties)
                            }

                            fun bankId(bankId: String) = bankId(JsonField.of(bankId))

                            @JsonProperty("bank_id")
                            @ExcludeMissing
                            fun bankId(bankId: JsonField<String>) = apply { this.bankId = bankId }

                            fun type(type: Type) = type(JsonField.of(type))

                            @JsonProperty("type")
                            @ExcludeMissing
                            fun type(type: JsonField<Type>) = apply { this.type = type }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): UnionMember0 =
                                UnionMember0(
                                    bankId,
                                    type,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }

                        class Type
                        @JsonCreator
                        private constructor(
                            private val value: JsonField<String>,
                        ) : Enum {

                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Type && this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                val VECTOR = Type(JsonField.of("vector"))

                                fun of(value: String) = Type(JsonField.of(value))
                            }

                            enum class Known {
                                VECTOR,
                            }

                            enum class Value {
                                VECTOR,
                                _UNKNOWN,
                            }

                            fun value(): Value =
                                when (this) {
                                    VECTOR -> Value.VECTOR
                                    else -> Value._UNKNOWN
                                }

                            fun known(): Known =
                                when (this) {
                                    VECTOR -> Known.VECTOR
                                    else ->
                                        throw LlamaStackClientInvalidDataException(
                                            "Unknown Type: $value"
                                        )
                                }

                            fun asString(): String = _value().asStringOrThrow()
                        }
                    }

                    @JsonDeserialize(builder = UnionMember1.Builder::class)
                    @NoAutoDetect
                    class UnionMember1
                    private constructor(
                        private val bankId: JsonField<String>,
                        private val keys: JsonField<List<String>>,
                        private val type: JsonField<Type>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        fun bankId(): String = bankId.getRequired("bank_id")

                        fun keys(): List<String> = keys.getRequired("keys")

                        fun type(): Type = type.getRequired("type")

                        @JsonProperty("bank_id") @ExcludeMissing fun _bankId() = bankId

                        @JsonProperty("keys") @ExcludeMissing fun _keys() = keys

                        @JsonProperty("type") @ExcludeMissing fun _type() = type

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): UnionMember1 = apply {
                            if (!validated) {
                                bankId()
                                keys()
                                type()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is UnionMember1 &&
                                this.bankId == other.bankId &&
                                this.keys == other.keys &&
                                this.type == other.type &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        bankId,
                                        keys,
                                        type,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "UnionMember1{bankId=$bankId, keys=$keys, type=$type, additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var bankId: JsonField<String> = JsonMissing.of()
                            private var keys: JsonField<List<String>> = JsonMissing.of()
                            private var type: JsonField<Type> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(unionMember1: UnionMember1) = apply {
                                this.bankId = unionMember1.bankId
                                this.keys = unionMember1.keys
                                this.type = unionMember1.type
                                additionalProperties(unionMember1.additionalProperties)
                            }

                            fun bankId(bankId: String) = bankId(JsonField.of(bankId))

                            @JsonProperty("bank_id")
                            @ExcludeMissing
                            fun bankId(bankId: JsonField<String>) = apply { this.bankId = bankId }

                            fun keys(keys: List<String>) = keys(JsonField.of(keys))

                            @JsonProperty("keys")
                            @ExcludeMissing
                            fun keys(keys: JsonField<List<String>>) = apply { this.keys = keys }

                            fun type(type: Type) = type(JsonField.of(type))

                            @JsonProperty("type")
                            @ExcludeMissing
                            fun type(type: JsonField<Type>) = apply { this.type = type }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): UnionMember1 =
                                UnionMember1(
                                    bankId,
                                    keys.map { it.toUnmodifiable() },
                                    type,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }

                        class Type
                        @JsonCreator
                        private constructor(
                            private val value: JsonField<String>,
                        ) : Enum {

                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Type && this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                val KEYVALUE = Type(JsonField.of("keyvalue"))

                                fun of(value: String) = Type(JsonField.of(value))
                            }

                            enum class Known {
                                KEYVALUE,
                            }

                            enum class Value {
                                KEYVALUE,
                                _UNKNOWN,
                            }

                            fun value(): Value =
                                when (this) {
                                    KEYVALUE -> Value.KEYVALUE
                                    else -> Value._UNKNOWN
                                }

                            fun known(): Known =
                                when (this) {
                                    KEYVALUE -> Known.KEYVALUE
                                    else ->
                                        throw LlamaStackClientInvalidDataException(
                                            "Unknown Type: $value"
                                        )
                                }

                            fun asString(): String = _value().asStringOrThrow()
                        }
                    }

                    @JsonDeserialize(builder = UnionMember2.Builder::class)
                    @NoAutoDetect
                    class UnionMember2
                    private constructor(
                        private val bankId: JsonField<String>,
                        private val type: JsonField<Type>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        fun bankId(): String = bankId.getRequired("bank_id")

                        fun type(): Type = type.getRequired("type")

                        @JsonProperty("bank_id") @ExcludeMissing fun _bankId() = bankId

                        @JsonProperty("type") @ExcludeMissing fun _type() = type

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): UnionMember2 = apply {
                            if (!validated) {
                                bankId()
                                type()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is UnionMember2 &&
                                this.bankId == other.bankId &&
                                this.type == other.type &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        bankId,
                                        type,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "UnionMember2{bankId=$bankId, type=$type, additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var bankId: JsonField<String> = JsonMissing.of()
                            private var type: JsonField<Type> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(unionMember2: UnionMember2) = apply {
                                this.bankId = unionMember2.bankId
                                this.type = unionMember2.type
                                additionalProperties(unionMember2.additionalProperties)
                            }

                            fun bankId(bankId: String) = bankId(JsonField.of(bankId))

                            @JsonProperty("bank_id")
                            @ExcludeMissing
                            fun bankId(bankId: JsonField<String>) = apply { this.bankId = bankId }

                            fun type(type: Type) = type(JsonField.of(type))

                            @JsonProperty("type")
                            @ExcludeMissing
                            fun type(type: JsonField<Type>) = apply { this.type = type }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): UnionMember2 =
                                UnionMember2(
                                    bankId,
                                    type,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }

                        class Type
                        @JsonCreator
                        private constructor(
                            private val value: JsonField<String>,
                        ) : Enum {

                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Type && this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                val KEYWORD = Type(JsonField.of("keyword"))

                                fun of(value: String) = Type(JsonField.of(value))
                            }

                            enum class Known {
                                KEYWORD,
                            }

                            enum class Value {
                                KEYWORD,
                                _UNKNOWN,
                            }

                            fun value(): Value =
                                when (this) {
                                    KEYWORD -> Value.KEYWORD
                                    else -> Value._UNKNOWN
                                }

                            fun known(): Known =
                                when (this) {
                                    KEYWORD -> Known.KEYWORD
                                    else ->
                                        throw LlamaStackClientInvalidDataException(
                                            "Unknown Type: $value"
                                        )
                                }

                            fun asString(): String = _value().asStringOrThrow()
                        }
                    }

                    @JsonDeserialize(builder = UnionMember3.Builder::class)
                    @NoAutoDetect
                    class UnionMember3
                    private constructor(
                        private val bankId: JsonField<String>,
                        private val entities: JsonField<List<String>>,
                        private val type: JsonField<Type>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        fun bankId(): String = bankId.getRequired("bank_id")

                        fun entities(): List<String> = entities.getRequired("entities")

                        fun type(): Type = type.getRequired("type")

                        @JsonProperty("bank_id") @ExcludeMissing fun _bankId() = bankId

                        @JsonProperty("entities") @ExcludeMissing fun _entities() = entities

                        @JsonProperty("type") @ExcludeMissing fun _type() = type

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): UnionMember3 = apply {
                            if (!validated) {
                                bankId()
                                entities()
                                type()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is UnionMember3 &&
                                this.bankId == other.bankId &&
                                this.entities == other.entities &&
                                this.type == other.type &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        bankId,
                                        entities,
                                        type,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "UnionMember3{bankId=$bankId, entities=$entities, type=$type, additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var bankId: JsonField<String> = JsonMissing.of()
                            private var entities: JsonField<List<String>> = JsonMissing.of()
                            private var type: JsonField<Type> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(unionMember3: UnionMember3) = apply {
                                this.bankId = unionMember3.bankId
                                this.entities = unionMember3.entities
                                this.type = unionMember3.type
                                additionalProperties(unionMember3.additionalProperties)
                            }

                            fun bankId(bankId: String) = bankId(JsonField.of(bankId))

                            @JsonProperty("bank_id")
                            @ExcludeMissing
                            fun bankId(bankId: JsonField<String>) = apply { this.bankId = bankId }

                            fun entities(entities: List<String>) = entities(JsonField.of(entities))

                            @JsonProperty("entities")
                            @ExcludeMissing
                            fun entities(entities: JsonField<List<String>>) = apply {
                                this.entities = entities
                            }

                            fun type(type: Type) = type(JsonField.of(type))

                            @JsonProperty("type")
                            @ExcludeMissing
                            fun type(type: JsonField<Type>) = apply { this.type = type }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): UnionMember3 =
                                UnionMember3(
                                    bankId,
                                    entities.map { it.toUnmodifiable() },
                                    type,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }

                        class Type
                        @JsonCreator
                        private constructor(
                            private val value: JsonField<String>,
                        ) : Enum {

                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Type && this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                val GRAPH = Type(JsonField.of("graph"))

                                fun of(value: String) = Type(JsonField.of(value))
                            }

                            enum class Known {
                                GRAPH,
                            }

                            enum class Value {
                                GRAPH,
                                _UNKNOWN,
                            }

                            fun value(): Value =
                                when (this) {
                                    GRAPH -> Value.GRAPH
                                    else -> Value._UNKNOWN
                                }

                            fun known(): Known =
                                when (this) {
                                    GRAPH -> Known.GRAPH
                                    else ->
                                        throw LlamaStackClientInvalidDataException(
                                            "Unknown Type: $value"
                                        )
                                }

                            fun asString(): String = _value().asStringOrThrow()
                        }
                    }
                }

                @JsonDeserialize(using = QueryGeneratorConfig.Deserializer::class)
                @JsonSerialize(using = QueryGeneratorConfig.Serializer::class)
                class QueryGeneratorConfig
                private constructor(
                    private val unionMember0: UnionMember0? = null,
                    private val unionMember1: UnionMember1? = null,
                    private val type: Type? = null,
                    private val _json: JsonValue? = null,
                ) {

                    private var validated: Boolean = false

                    fun unionMember0(): UnionMember0? = unionMember0

                    fun unionMember1(): UnionMember1? = unionMember1

                    fun type(): Type? = type

                    fun isUnionMember0(): Boolean = unionMember0 != null

                    fun isUnionMember1(): Boolean = unionMember1 != null

                    fun isType(): Boolean = type != null

                    fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")

                    fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")

                    fun asType(): Type = type.getOrThrow("type")

                    fun _json(): JsonValue? = _json

                    fun <T> accept(visitor: Visitor<T>): T {
                        return when {
                            unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
                            unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
                            type != null -> visitor.visitType(type)
                            else -> visitor.unknown(_json)
                        }
                    }

                    fun validate(): QueryGeneratorConfig = apply {
                        if (!validated) {
                            if (unionMember0 == null && unionMember1 == null && type == null) {
                                throw LlamaStackClientInvalidDataException(
                                    "Unknown QueryGeneratorConfig: $_json"
                                )
                            }
                            unionMember0?.validate()
                            unionMember1?.validate()
                            type?.validate()
                            validated = true
                        }
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is QueryGeneratorConfig &&
                            this.unionMember0 == other.unionMember0 &&
                            this.unionMember1 == other.unionMember1 &&
                            this.type == other.type
                    }

                    override fun hashCode(): Int {
                        return Objects.hash(
                            unionMember0,
                            unionMember1,
                            type,
                        )
                    }

                    override fun toString(): String {
                        return when {
                            unionMember0 != null ->
                                "QueryGeneratorConfig{unionMember0=$unionMember0}"
                            unionMember1 != null ->
                                "QueryGeneratorConfig{unionMember1=$unionMember1}"
                            type != null -> "QueryGeneratorConfig{type=$type}"
                            _json != null -> "QueryGeneratorConfig{_unknown=$_json}"
                            else -> throw IllegalStateException("Invalid QueryGeneratorConfig")
                        }
                    }

                    companion object {

                        fun ofUnionMember0(unionMember0: UnionMember0) =
                            QueryGeneratorConfig(unionMember0 = unionMember0)

                        fun ofUnionMember1(unionMember1: UnionMember1) =
                            QueryGeneratorConfig(unionMember1 = unionMember1)

                        fun ofType(type: Type) = QueryGeneratorConfig(type = type)
                    }

                    interface Visitor<out T> {

                        fun visitUnionMember0(unionMember0: UnionMember0): T

                        fun visitUnionMember1(unionMember1: UnionMember1): T

                        fun visitType(type: Type): T

                        fun unknown(json: JsonValue?): T {
                            throw LlamaStackClientInvalidDataException(
                                "Unknown QueryGeneratorConfig: $json"
                            )
                        }
                    }

                    class Deserializer :
                        BaseDeserializer<QueryGeneratorConfig>(QueryGeneratorConfig::class) {

                        override fun ObjectCodec.deserialize(node: JsonNode): QueryGeneratorConfig {
                            val json = JsonValue.fromJsonNode(node)
                            tryDeserialize(node, jacksonTypeRef<UnionMember0>()) { it.validate() }
                                ?.let {
                                    return QueryGeneratorConfig(unionMember0 = it, _json = json)
                                }
                            tryDeserialize(node, jacksonTypeRef<UnionMember1>()) { it.validate() }
                                ?.let {
                                    return QueryGeneratorConfig(unionMember1 = it, _json = json)
                                }
                            tryDeserialize(node, jacksonTypeRef<Type>()) { it.validate() }
                                ?.let {
                                    return QueryGeneratorConfig(type = it, _json = json)
                                }

                            return QueryGeneratorConfig(_json = json)
                        }
                    }

                    class Serializer :
                        BaseSerializer<QueryGeneratorConfig>(QueryGeneratorConfig::class) {

                        override fun serialize(
                            value: QueryGeneratorConfig,
                            generator: JsonGenerator,
                            provider: SerializerProvider
                        ) {
                            when {
                                value.unionMember0 != null ->
                                    generator.writeObject(value.unionMember0)
                                value.unionMember1 != null ->
                                    generator.writeObject(value.unionMember1)
                                value.type != null -> generator.writeObject(value.type)
                                value._json != null -> generator.writeObject(value._json)
                                else -> throw IllegalStateException("Invalid QueryGeneratorConfig")
                            }
                        }
                    }

                    @JsonDeserialize(builder = UnionMember0.Builder::class)
                    @NoAutoDetect
                    class UnionMember0
                    private constructor(
                        private val sep: JsonField<String>,
                        private val type: JsonField<Type>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        fun sep(): String = sep.getRequired("sep")

                        fun type(): Type = type.getRequired("type")

                        @JsonProperty("sep") @ExcludeMissing fun _sep() = sep

                        @JsonProperty("type") @ExcludeMissing fun _type() = type

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): UnionMember0 = apply {
                            if (!validated) {
                                sep()
                                type()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is UnionMember0 &&
                                this.sep == other.sep &&
                                this.type == other.type &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        sep,
                                        type,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "UnionMember0{sep=$sep, type=$type, additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var sep: JsonField<String> = JsonMissing.of()
                            private var type: JsonField<Type> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(unionMember0: UnionMember0) = apply {
                                this.sep = unionMember0.sep
                                this.type = unionMember0.type
                                additionalProperties(unionMember0.additionalProperties)
                            }

                            fun sep(sep: String) = sep(JsonField.of(sep))

                            @JsonProperty("sep")
                            @ExcludeMissing
                            fun sep(sep: JsonField<String>) = apply { this.sep = sep }

                            fun type(type: Type) = type(JsonField.of(type))

                            @JsonProperty("type")
                            @ExcludeMissing
                            fun type(type: JsonField<Type>) = apply { this.type = type }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): UnionMember0 =
                                UnionMember0(
                                    sep,
                                    type,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }

                        class Type
                        @JsonCreator
                        private constructor(
                            private val value: JsonField<String>,
                        ) : Enum {

                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Type && this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                val DEFAULT = Type(JsonField.of("default"))

                                fun of(value: String) = Type(JsonField.of(value))
                            }

                            enum class Known {
                                DEFAULT,
                            }

                            enum class Value {
                                DEFAULT,
                                _UNKNOWN,
                            }

                            fun value(): Value =
                                when (this) {
                                    DEFAULT -> Value.DEFAULT
                                    else -> Value._UNKNOWN
                                }

                            fun known(): Known =
                                when (this) {
                                    DEFAULT -> Known.DEFAULT
                                    else ->
                                        throw LlamaStackClientInvalidDataException(
                                            "Unknown Type: $value"
                                        )
                                }

                            fun asString(): String = _value().asStringOrThrow()
                        }
                    }

                    @JsonDeserialize(builder = UnionMember1.Builder::class)
                    @NoAutoDetect
                    class UnionMember1
                    private constructor(
                        private val model: JsonField<String>,
                        private val template: JsonField<String>,
                        private val type: JsonField<Type>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        fun model(): String = model.getRequired("model")

                        fun template(): String = template.getRequired("template")

                        fun type(): Type = type.getRequired("type")

                        @JsonProperty("model") @ExcludeMissing fun _model() = model

                        @JsonProperty("template") @ExcludeMissing fun _template() = template

                        @JsonProperty("type") @ExcludeMissing fun _type() = type

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): UnionMember1 = apply {
                            if (!validated) {
                                model()
                                template()
                                type()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is UnionMember1 &&
                                this.model == other.model &&
                                this.template == other.template &&
                                this.type == other.type &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        model,
                                        template,
                                        type,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "UnionMember1{model=$model, template=$template, type=$type, additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var model: JsonField<String> = JsonMissing.of()
                            private var template: JsonField<String> = JsonMissing.of()
                            private var type: JsonField<Type> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(unionMember1: UnionMember1) = apply {
                                this.model = unionMember1.model
                                this.template = unionMember1.template
                                this.type = unionMember1.type
                                additionalProperties(unionMember1.additionalProperties)
                            }

                            fun model(model: String) = model(JsonField.of(model))

                            @JsonProperty("model")
                            @ExcludeMissing
                            fun model(model: JsonField<String>) = apply { this.model = model }

                            fun template(template: String) = template(JsonField.of(template))

                            @JsonProperty("template")
                            @ExcludeMissing
                            fun template(template: JsonField<String>) = apply {
                                this.template = template
                            }

                            fun type(type: Type) = type(JsonField.of(type))

                            @JsonProperty("type")
                            @ExcludeMissing
                            fun type(type: JsonField<Type>) = apply { this.type = type }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): UnionMember1 =
                                UnionMember1(
                                    model,
                                    template,
                                    type,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }

                        class Type
                        @JsonCreator
                        private constructor(
                            private val value: JsonField<String>,
                        ) : Enum {

                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Type && this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                val LLM = Type(JsonField.of("llm"))

                                fun of(value: String) = Type(JsonField.of(value))
                            }

                            enum class Known {
                                LLM,
                            }

                            enum class Value {
                                LLM,
                                _UNKNOWN,
                            }

                            fun value(): Value =
                                when (this) {
                                    LLM -> Value.LLM
                                    else -> Value._UNKNOWN
                                }

                            fun known(): Known =
                                when (this) {
                                    LLM -> Known.LLM
                                    else ->
                                        throw LlamaStackClientInvalidDataException(
                                            "Unknown Type: $value"
                                        )
                                }

                            fun asString(): String = _value().asStringOrThrow()
                        }
                    }

                    @JsonDeserialize(builder = Type.Builder::class)
                    @NoAutoDetect
                    class Type
                    private constructor(
                        private val type: JsonField<Type>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        fun type(): Type = type.getRequired("type")

                        @JsonProperty("type") @ExcludeMissing fun _type() = type

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): QueryGeneratorConfig.Type = apply {
                            if (!validated) {
                                type()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Type &&
                                this.type == other &&
                                this.additionalProperties == this.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode = Objects.hash(type, additionalProperties)
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "Type{type=$type, additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var type: JsonField<Type> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(type: QueryGeneratorConfig.Type) = apply {
                                this.type = type.type
                                additionalProperties(type.additionalProperties)
                            }

                            fun type(type: Type) = type(JsonField.of(type))

                            @JsonProperty("type")
                            @ExcludeMissing
                            fun type(type: JsonField<Type>) = apply { this.type = type }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): QueryGeneratorConfig.Type =
                                Type(type, additionalProperties.toUnmodifiable())
                        }

                        class Type
                        @JsonCreator
                        private constructor(
                            private val value: JsonField<String>,
                        ) : Enum {

                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Type && this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                val CUSTOM = Type(JsonField.of("custom"))

                                fun of(value: String) = Type(JsonField.of(value))
                            }

                            enum class Known {
                                CUSTOM,
                            }

                            enum class Value {
                                CUSTOM,
                                _UNKNOWN,
                            }

                            fun value(): Value =
                                when (this) {
                                    CUSTOM -> Value.CUSTOM
                                    else -> Value._UNKNOWN
                                }

                            fun known(): Known =
                                when (this) {
                                    CUSTOM -> Known.CUSTOM
                                    else ->
                                        throw LlamaStackClientInvalidDataException(
                                            "Unknown Type: $value"
                                        )
                                }

                            fun asString(): String = _value().asStringOrThrow()
                        }
                    }
                }

                class Type
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Type && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val MEMORY = Type(JsonField.of("memory"))

                        fun of(value: String) = Type(JsonField.of(value))
                    }

                    enum class Known {
                        MEMORY,
                    }

                    enum class Value {
                        MEMORY,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            MEMORY -> Value.MEMORY
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            MEMORY -> Known.MEMORY
                            else ->
                                throw LlamaStackClientInvalidDataException("Unknown Type: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }
        }
    }
}
