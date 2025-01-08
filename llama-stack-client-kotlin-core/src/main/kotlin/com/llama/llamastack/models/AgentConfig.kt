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
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

@NoAutoDetect
class AgentConfig
@JsonCreator
private constructor(
    @JsonProperty("enable_session_persistence")
    @ExcludeMissing
    private val enableSessionPersistence: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("input_shields")
    @ExcludeMissing
    private val inputShields: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("instructions")
    @ExcludeMissing
    private val instructions: JsonField<String> = JsonMissing.of(),
    @JsonProperty("max_infer_iters")
    @ExcludeMissing
    private val maxInferIters: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("model") @ExcludeMissing private val model: JsonField<String> = JsonMissing.of(),
    @JsonProperty("output_shields")
    @ExcludeMissing
    private val outputShields: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("sampling_params")
    @ExcludeMissing
    private val samplingParams: JsonField<SamplingParams> = JsonMissing.of(),
    @JsonProperty("tool_choice")
    @ExcludeMissing
    private val toolChoice: JsonField<ToolChoice> = JsonMissing.of(),
    @JsonProperty("tool_prompt_format")
    @ExcludeMissing
    private val toolPromptFormat: JsonField<ToolPromptFormat> = JsonMissing.of(),
    @JsonProperty("tools")
    @ExcludeMissing
    private val tools: JsonField<List<Tool>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

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

    private var validated: Boolean = false

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
            enableSessionPersistence = agentConfig.enableSessionPersistence
            inputShields = agentConfig.inputShields
            instructions = agentConfig.instructions
            maxInferIters = agentConfig.maxInferIters
            model = agentConfig.model
            outputShields = agentConfig.outputShields
            samplingParams = agentConfig.samplingParams
            toolChoice = agentConfig.toolChoice
            toolPromptFormat = agentConfig.toolPromptFormat
            tools = agentConfig.tools
            additionalProperties = agentConfig.additionalProperties.toMutableMap()
        }

        fun enableSessionPersistence(enableSessionPersistence: Boolean) =
            enableSessionPersistence(JsonField.of(enableSessionPersistence))

        fun enableSessionPersistence(enableSessionPersistence: JsonField<Boolean>) = apply {
            this.enableSessionPersistence = enableSessionPersistence
        }

        fun inputShields(inputShields: List<String>) = inputShields(JsonField.of(inputShields))

        fun inputShields(inputShields: JsonField<List<String>>) = apply {
            this.inputShields = inputShields
        }

        fun instructions(instructions: String) = instructions(JsonField.of(instructions))

        fun instructions(instructions: JsonField<String>) = apply {
            this.instructions = instructions
        }

        fun maxInferIters(maxInferIters: Long) = maxInferIters(JsonField.of(maxInferIters))

        fun maxInferIters(maxInferIters: JsonField<Long>) = apply {
            this.maxInferIters = maxInferIters
        }

        fun model(model: String) = model(JsonField.of(model))

        fun model(model: JsonField<String>) = apply { this.model = model }

        fun outputShields(outputShields: List<String>) = outputShields(JsonField.of(outputShields))

        fun outputShields(outputShields: JsonField<List<String>>) = apply {
            this.outputShields = outputShields
        }

        fun samplingParams(samplingParams: SamplingParams) =
            samplingParams(JsonField.of(samplingParams))

        fun samplingParams(samplingParams: JsonField<SamplingParams>) = apply {
            this.samplingParams = samplingParams
        }

        fun toolChoice(toolChoice: ToolChoice) = toolChoice(JsonField.of(toolChoice))

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
        fun toolPromptFormat(toolPromptFormat: JsonField<ToolPromptFormat>) = apply {
            this.toolPromptFormat = toolPromptFormat
        }

        fun tools(tools: List<Tool>) = tools(JsonField.of(tools))

        fun tools(tools: JsonField<List<Tool>>) = apply { this.tools = tools }

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

        companion object {

            val AUTO = of("auto")

            val REQUIRED = of("required")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ToolChoice && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class ToolPromptFormat
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val JSON = of("json")

            val FUNCTION_TAG = of("function_tag")

            val PYTHON_LIST = of("python_list")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ToolPromptFormat && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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

            return /* spotless:off */ other is Tool && searchToolDefinition == other.searchToolDefinition && wolframAlphaToolDefinition == other.wolframAlphaToolDefinition && photogenToolDefinition == other.photogenToolDefinition && codeInterpreterToolDefinition == other.codeInterpreterToolDefinition && functionCallToolDefinition == other.functionCallToolDefinition && memoryToolDefinition == other.memoryToolDefinition /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(searchToolDefinition, wolframAlphaToolDefinition, photogenToolDefinition, codeInterpreterToolDefinition, functionCallToolDefinition, memoryToolDefinition) /* spotless:on */

        override fun toString(): String =
            when {
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

        return /* spotless:off */ other is AgentConfig && enableSessionPersistence == other.enableSessionPersistence && inputShields == other.inputShields && instructions == other.instructions && maxInferIters == other.maxInferIters && model == other.model && outputShields == other.outputShields && samplingParams == other.samplingParams && toolChoice == other.toolChoice && toolPromptFormat == other.toolPromptFormat && tools == other.tools && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(enableSessionPersistence, inputShields, instructions, maxInferIters, model, outputShields, samplingParams, toolChoice, toolPromptFormat, tools, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgentConfig{enableSessionPersistence=$enableSessionPersistence, inputShields=$inputShields, instructions=$instructions, maxInferIters=$maxInferIters, model=$model, outputShields=$outputShields, samplingParams=$samplingParams, toolChoice=$toolChoice, toolPromptFormat=$toolPromptFormat, tools=$tools, additionalProperties=$additionalProperties}"
}
