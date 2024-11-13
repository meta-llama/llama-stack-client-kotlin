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
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

@JsonDeserialize(builder = AgentConfig.Builder::class)
@NoAutoDetect
class AgentConfig
private constructor(
    private val enableSessionPersistence: JsonField<Boolean>,
    private val inputShields: JsonField<List<String>>,
    private val instructions: JsonField<String>,
    private val maxInferIters: JsonField<Long>,
    private val model: JsonField<String>,
    private val outputShields: JsonField<List<String>>,
    private val samplingParams: JsonField<SamplingParams>,
    private val toolChoice: JsonField<ToolChoice>,
    private val toolPromptFormat: JsonField<ToolPromptFormat>,
    private val tools: JsonField<List<Tool>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun enableSessionPersistence(): Boolean =
        enableSessionPersistence.getRequired("enable_session_persistence")

    fun inputShields(): List<String>? = inputShields.getNullable("input_shields")

    fun instructions(): String = instructions.getRequired("instructions")

    fun maxInferIters(): Long = maxInferIters.getRequired("max_infer_iters")

    fun model(): String = model.getRequired("model")

    fun outputShields(): List<String>? = outputShields.getNullable("output_shields")

    fun samplingParams(): SamplingParams? = samplingParams.getNullable("sampling_params")

    fun toolChoice(): ToolChoice? = toolChoice.getNullable("tool_choice")

    /**
     * `json` -- Refers to the json format for calling tools. The json format takes the form like {
     * "type": "function", "function" : { "name": "function_name", "description":
     * "function_description", "parameters": {...} } }
     *
     * `function_tag` -- This is an example of how you could define your own user defined format for
     * making tool calls. The function_tag format looks like this,
     * <function=function_name>(parameters)</function>
     *
     * The detailed prompts for each of these formats are added to llama cli
     */
    fun toolPromptFormat(): ToolPromptFormat? = toolPromptFormat.getNullable("tool_prompt_format")

    fun tools(): List<Tool>? = tools.getNullable("tools")

    @JsonProperty("enable_session_persistence")
    @ExcludeMissing
    fun _enableSessionPersistence() = enableSessionPersistence

    @JsonProperty("input_shields") @ExcludeMissing fun _inputShields() = inputShields

    @JsonProperty("instructions") @ExcludeMissing fun _instructions() = instructions

    @JsonProperty("max_infer_iters") @ExcludeMissing fun _maxInferIters() = maxInferIters

    @JsonProperty("model") @ExcludeMissing fun _model() = model

    @JsonProperty("output_shields") @ExcludeMissing fun _outputShields() = outputShields

    @JsonProperty("sampling_params") @ExcludeMissing fun _samplingParams() = samplingParams

    @JsonProperty("tool_choice") @ExcludeMissing fun _toolChoice() = toolChoice

    /**
     * `json` -- Refers to the json format for calling tools. The json format takes the form like {
     * "type": "function", "function" : { "name": "function_name", "description":
     * "function_description", "parameters": {...} } }
     *
     * `function_tag` -- This is an example of how you could define your own user defined format for
     * making tool calls. The function_tag format looks like this,
     * <function=function_name>(parameters)</function>
     *
     * The detailed prompts for each of these formats are added to llama cli
     */
    @JsonProperty("tool_prompt_format") @ExcludeMissing fun _toolPromptFormat() = toolPromptFormat

    @JsonProperty("tools") @ExcludeMissing fun _tools() = tools

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): AgentConfig = apply {
        if (!validated) {
            enableSessionPersistence()
            inputShields()
            instructions()
            maxInferIters()
            model()
            outputShields()
            samplingParams()?.validate()
            toolChoice()
            toolPromptFormat()
            tools()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var enableSessionPersistence: JsonField<Boolean> = JsonMissing.of()
        private var inputShields: JsonField<List<String>> = JsonMissing.of()
        private var instructions: JsonField<String> = JsonMissing.of()
        private var maxInferIters: JsonField<Long> = JsonMissing.of()
        private var model: JsonField<String> = JsonMissing.of()
        private var outputShields: JsonField<List<String>> = JsonMissing.of()
        private var samplingParams: JsonField<SamplingParams> = JsonMissing.of()
        private var toolChoice: JsonField<ToolChoice> = JsonMissing.of()
        private var toolPromptFormat: JsonField<ToolPromptFormat> = JsonMissing.of()
        private var tools: JsonField<List<Tool>> = JsonMissing.of()
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

        fun enableSessionPersistence(enableSessionPersistence: Boolean) =
            enableSessionPersistence(JsonField.of(enableSessionPersistence))

        @JsonProperty("enable_session_persistence")
        @ExcludeMissing
        fun enableSessionPersistence(enableSessionPersistence: JsonField<Boolean>) = apply {
            this.enableSessionPersistence = enableSessionPersistence
        }

        fun inputShields(inputShields: List<String>) = inputShields(JsonField.of(inputShields))

        @JsonProperty("input_shields")
        @ExcludeMissing
        fun inputShields(inputShields: JsonField<List<String>>) = apply {
            this.inputShields = inputShields
        }

        fun instructions(instructions: String) = instructions(JsonField.of(instructions))

        @JsonProperty("instructions")
        @ExcludeMissing
        fun instructions(instructions: JsonField<String>) = apply {
            this.instructions = instructions
        }

        fun maxInferIters(maxInferIters: Long) = maxInferIters(JsonField.of(maxInferIters))

        @JsonProperty("max_infer_iters")
        @ExcludeMissing
        fun maxInferIters(maxInferIters: JsonField<Long>) = apply {
            this.maxInferIters = maxInferIters
        }

        fun model(model: String) = model(JsonField.of(model))

        @JsonProperty("model")
        @ExcludeMissing
        fun model(model: JsonField<String>) = apply { this.model = model }

        fun outputShields(outputShields: List<String>) = outputShields(JsonField.of(outputShields))

        @JsonProperty("output_shields")
        @ExcludeMissing
        fun outputShields(outputShields: JsonField<List<String>>) = apply {
            this.outputShields = outputShields
        }

        fun samplingParams(samplingParams: SamplingParams) =
            samplingParams(JsonField.of(samplingParams))

        @JsonProperty("sampling_params")
        @ExcludeMissing
        fun samplingParams(samplingParams: JsonField<SamplingParams>) = apply {
            this.samplingParams = samplingParams
        }

        fun toolChoice(toolChoice: ToolChoice) = toolChoice(JsonField.of(toolChoice))

        @JsonProperty("tool_choice")
        @ExcludeMissing
        fun toolChoice(toolChoice: JsonField<ToolChoice>) = apply { this.toolChoice = toolChoice }

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
        fun toolPromptFormat(toolPromptFormat: ToolPromptFormat) =
            toolPromptFormat(JsonField.of(toolPromptFormat))

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
        @ExcludeMissing
        fun toolPromptFormat(toolPromptFormat: JsonField<ToolPromptFormat>) = apply {
            this.toolPromptFormat = toolPromptFormat
        }

        fun tools(tools: List<Tool>) = tools(JsonField.of(tools))

        @JsonProperty("tools")
        @ExcludeMissing
        fun tools(tools: JsonField<List<Tool>>) = apply { this.tools = tools }

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
                enableSessionPersistence,
                inputShields.map { it.toImmutable() },
                instructions,
                maxInferIters,
                model,
                outputShields.map { it.toImmutable() },
                samplingParams,
                toolChoice,
                toolPromptFormat,
                tools.map { it.toImmutable() },
                additionalProperties.toImmutable(),
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

        fun wolframAlphaToolDefinition(): WolframAlphaToolDefinition? = wolframAlphaToolDefinition

        fun photogenToolDefinition(): PhotogenToolDefinition? = photogenToolDefinition

        fun codeInterpreterToolDefinition(): CodeInterpreterToolDefinition? =
            codeInterpreterToolDefinition

        fun functionCallToolDefinition(): FunctionCallToolDefinition? = functionCallToolDefinition

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

            return /* spotless:off */ other is Tool && this.searchToolDefinition == other.searchToolDefinition && this.wolframAlphaToolDefinition == other.wolframAlphaToolDefinition && this.photogenToolDefinition == other.photogenToolDefinition && this.codeInterpreterToolDefinition == other.codeInterpreterToolDefinition && this.functionCallToolDefinition == other.functionCallToolDefinition && this.memoryToolDefinition == other.memoryToolDefinition /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(searchToolDefinition, wolframAlphaToolDefinition, photogenToolDefinition, codeInterpreterToolDefinition, functionCallToolDefinition, memoryToolDefinition) /* spotless:on */
        }

        override fun toString(): String {
            return when {
                searchToolDefinition != null -> "Tool{searchToolDefinition=$searchToolDefinition}"
                wolframAlphaToolDefinition != null ->
                    "Tool{wolframAlphaToolDefinition=$wolframAlphaToolDefinition}"
                photogenToolDefinition != null ->
                    "Tool{photogenToolDefinition=$photogenToolDefinition}"
                codeInterpreterToolDefinition != null ->
                    "Tool{codeInterpreterToolDefinition=$codeInterpreterToolDefinition}"
                functionCallToolDefinition != null ->
                    "Tool{functionCallToolDefinition=$functionCallToolDefinition}"
                memoryToolDefinition != null -> "Tool{memoryToolDefinition=$memoryToolDefinition}"
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
                tryDeserialize(node, jacksonTypeRef<WolframAlphaToolDefinition>()) { it.validate() }
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
                tryDeserialize(node, jacksonTypeRef<FunctionCallToolDefinition>()) { it.validate() }
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
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AgentConfig && this.enableSessionPersistence == other.enableSessionPersistence && this.inputShields == other.inputShields && this.instructions == other.instructions && this.maxInferIters == other.maxInferIters && this.model == other.model && this.outputShields == other.outputShields && this.samplingParams == other.samplingParams && this.toolChoice == other.toolChoice && this.toolPromptFormat == other.toolPromptFormat && this.tools == other.tools && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(enableSessionPersistence, inputShields, instructions, maxInferIters, model, outputShields, samplingParams, toolChoice, toolPromptFormat, tools, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "AgentConfig{enableSessionPersistence=$enableSessionPersistence, inputShields=$inputShields, instructions=$instructions, maxInferIters=$maxInferIters, model=$model, outputShields=$outputShields, samplingParams=$samplingParams, toolChoice=$toolChoice, toolPromptFormat=$toolPromptFormat, tools=$tools, additionalProperties=$additionalProperties}"
}
