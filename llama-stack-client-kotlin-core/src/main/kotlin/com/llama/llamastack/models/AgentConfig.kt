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
import com.llama.llamastack.core.checkRequired
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
    @JsonProperty("instructions")
    @ExcludeMissing
    private val instructions: JsonField<String> = JsonMissing.of(),
    @JsonProperty("max_infer_iters")
    @ExcludeMissing
    private val maxInferIters: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("model") @ExcludeMissing private val model: JsonField<String> = JsonMissing.of(),
    @JsonProperty("client_tools")
    @ExcludeMissing
    private val clientTools: JsonField<List<ToolDef>> = JsonMissing.of(),
    @JsonProperty("input_shields")
    @ExcludeMissing
    private val inputShields: JsonField<List<String>> = JsonMissing.of(),
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
    @JsonProperty("toolgroups")
    @ExcludeMissing
    private val toolgroups: JsonField<List<Toolgroup>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun enableSessionPersistence(): Boolean =
        enableSessionPersistence.getRequired("enable_session_persistence")

    fun instructions(): String = instructions.getRequired("instructions")

    fun maxInferIters(): Long = maxInferIters.getRequired("max_infer_iters")

    fun model(): String = model.getRequired("model")

    fun clientTools(): List<ToolDef>? = clientTools.getNullable("client_tools")

    fun inputShields(): List<String>? = inputShields.getNullable("input_shields")

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

    fun toolgroups(): List<Toolgroup>? = toolgroups.getNullable("toolgroups")

    @JsonProperty("enable_session_persistence")
    @ExcludeMissing
    fun _enableSessionPersistence(): JsonField<Boolean> = enableSessionPersistence

    @JsonProperty("instructions")
    @ExcludeMissing
    fun _instructions(): JsonField<String> = instructions

    @JsonProperty("max_infer_iters")
    @ExcludeMissing
    fun _maxInferIters(): JsonField<Long> = maxInferIters

    @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

    @JsonProperty("client_tools")
    @ExcludeMissing
    fun _clientTools(): JsonField<List<ToolDef>> = clientTools

    @JsonProperty("input_shields")
    @ExcludeMissing
    fun _inputShields(): JsonField<List<String>> = inputShields

    @JsonProperty("output_shields")
    @ExcludeMissing
    fun _outputShields(): JsonField<List<String>> = outputShields

    @JsonProperty("sampling_params")
    @ExcludeMissing
    fun _samplingParams(): JsonField<SamplingParams> = samplingParams

    @JsonProperty("tool_choice")
    @ExcludeMissing
    fun _toolChoice(): JsonField<ToolChoice> = toolChoice

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
    @JsonProperty("tool_prompt_format")
    @ExcludeMissing
    fun _toolPromptFormat(): JsonField<ToolPromptFormat> = toolPromptFormat

    @JsonProperty("toolgroups")
    @ExcludeMissing
    fun _toolgroups(): JsonField<List<Toolgroup>> = toolgroups

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AgentConfig = apply {
        if (validated) {
            return@apply
        }

        enableSessionPersistence()
        instructions()
        maxInferIters()
        model()
        clientTools()?.forEach { it.validate() }
        inputShields()
        outputShields()
        samplingParams()?.validate()
        toolChoice()
        toolPromptFormat()
        toolgroups()?.forEach { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var enableSessionPersistence: JsonField<Boolean>? = null
        private var instructions: JsonField<String>? = null
        private var maxInferIters: JsonField<Long>? = null
        private var model: JsonField<String>? = null
        private var clientTools: JsonField<MutableList<ToolDef>>? = null
        private var inputShields: JsonField<MutableList<String>>? = null
        private var outputShields: JsonField<MutableList<String>>? = null
        private var samplingParams: JsonField<SamplingParams> = JsonMissing.of()
        private var toolChoice: JsonField<ToolChoice> = JsonMissing.of()
        private var toolPromptFormat: JsonField<ToolPromptFormat> = JsonMissing.of()
        private var toolgroups: JsonField<MutableList<Toolgroup>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(agentConfig: AgentConfig) = apply {
            enableSessionPersistence = agentConfig.enableSessionPersistence
            instructions = agentConfig.instructions
            maxInferIters = agentConfig.maxInferIters
            model = agentConfig.model
            clientTools = agentConfig.clientTools.map { it.toMutableList() }
            inputShields = agentConfig.inputShields.map { it.toMutableList() }
            outputShields = agentConfig.outputShields.map { it.toMutableList() }
            samplingParams = agentConfig.samplingParams
            toolChoice = agentConfig.toolChoice
            toolPromptFormat = agentConfig.toolPromptFormat
            toolgroups = agentConfig.toolgroups.map { it.toMutableList() }
            additionalProperties = agentConfig.additionalProperties.toMutableMap()
        }

        fun enableSessionPersistence(enableSessionPersistence: Boolean) =
            enableSessionPersistence(JsonField.of(enableSessionPersistence))

        fun enableSessionPersistence(enableSessionPersistence: JsonField<Boolean>) = apply {
            this.enableSessionPersistence = enableSessionPersistence
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

        fun clientTools(clientTools: List<ToolDef>) = clientTools(JsonField.of(clientTools))

        fun clientTools(clientTools: JsonField<List<ToolDef>>) = apply {
            this.clientTools = clientTools.map { it.toMutableList() }
        }

        fun addClientTool(clientTool: ToolDef) = apply {
            clientTools =
                (clientTools ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(clientTool)
                }
        }

        fun inputShields(inputShields: List<String>) = inputShields(JsonField.of(inputShields))

        fun inputShields(inputShields: JsonField<List<String>>) = apply {
            this.inputShields = inputShields.map { it.toMutableList() }
        }

        fun addInputShield(inputShield: String) = apply {
            inputShields =
                (inputShields ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(inputShield)
                }
        }

        fun outputShields(outputShields: List<String>) = outputShields(JsonField.of(outputShields))

        fun outputShields(outputShields: JsonField<List<String>>) = apply {
            this.outputShields = outputShields.map { it.toMutableList() }
        }

        fun addOutputShield(outputShield: String) = apply {
            outputShields =
                (outputShields ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(outputShield)
                }
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

        fun toolgroups(toolgroups: List<Toolgroup>) = toolgroups(JsonField.of(toolgroups))

        fun toolgroups(toolgroups: JsonField<List<Toolgroup>>) = apply {
            this.toolgroups = toolgroups.map { it.toMutableList() }
        }

        fun addToolgroup(toolgroup: Toolgroup) = apply {
            toolgroups =
                (toolgroups ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(toolgroup)
                }
        }

        fun addToolgroup(string: String) = addToolgroup(Toolgroup.ofString(string))

        fun addToolgroup(unionMember1: Toolgroup.UnionMember1) =
            addToolgroup(Toolgroup.ofUnionMember1(unionMember1))

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
                checkRequired("enableSessionPersistence", enableSessionPersistence),
                checkRequired("instructions", instructions),
                checkRequired("maxInferIters", maxInferIters),
                checkRequired("model", model),
                (clientTools ?: JsonMissing.of()).map { it.toImmutable() },
                (inputShields ?: JsonMissing.of()).map { it.toImmutable() },
                (outputShields ?: JsonMissing.of()).map { it.toImmutable() },
                samplingParams,
                toolChoice,
                toolPromptFormat,
                (toolgroups ?: JsonMissing.of()).map { it.toImmutable() },
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

    @JsonDeserialize(using = Toolgroup.Deserializer::class)
    @JsonSerialize(using = Toolgroup.Serializer::class)
    class Toolgroup
    private constructor(
        private val string: String? = null,
        private val unionMember1: UnionMember1? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): String? = string

        fun unionMember1(): UnionMember1? = unionMember1

        fun isString(): Boolean = string != null

        fun isUnionMember1(): Boolean = unionMember1 != null

        fun asString(): String = string.getOrThrow("string")

        fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                string != null -> visitor.visitString(string)
                unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
                else -> visitor.unknown(_json)
            }
        }

        private var validated: Boolean = false

        fun validate(): Toolgroup = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitUnionMember1(unionMember1: UnionMember1) {
                        unionMember1.validate()
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Toolgroup && string == other.string && unionMember1 == other.unionMember1 /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, unionMember1) /* spotless:on */

        override fun toString(): String =
            when {
                string != null -> "Toolgroup{string=$string}"
                unionMember1 != null -> "Toolgroup{unionMember1=$unionMember1}"
                _json != null -> "Toolgroup{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Toolgroup")
            }

        companion object {

            fun ofString(string: String) = Toolgroup(string = string)

            fun ofUnionMember1(unionMember1: UnionMember1) = Toolgroup(unionMember1 = unionMember1)
        }

        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitUnionMember1(unionMember1: UnionMember1): T

            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown Toolgroup: $json")
            }
        }

        class Deserializer : BaseDeserializer<Toolgroup>(Toolgroup::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Toolgroup {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                    return Toolgroup(string = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<UnionMember1>()) { it.validate() }
                    ?.let {
                        return Toolgroup(unionMember1 = it, _json = json)
                    }

                return Toolgroup(_json = json)
            }
        }

        class Serializer : BaseSerializer<Toolgroup>(Toolgroup::class) {

            override fun serialize(
                value: Toolgroup,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Toolgroup")
                }
            }
        }

        @NoAutoDetect
        class UnionMember1
        @JsonCreator
        private constructor(
            @JsonProperty("args")
            @ExcludeMissing
            private val args: JsonField<Args> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun args(): Args = args.getRequired("args")

            fun name(): String = name.getRequired("name")

            @JsonProperty("args") @ExcludeMissing fun _args(): JsonField<Args> = args

            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): UnionMember1 = apply {
                if (validated) {
                    return@apply
                }

                args().validate()
                name()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var args: JsonField<Args>? = null
                private var name: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(unionMember1: UnionMember1) = apply {
                    args = unionMember1.args
                    name = unionMember1.name
                    additionalProperties = unionMember1.additionalProperties.toMutableMap()
                }

                fun args(args: Args) = args(JsonField.of(args))

                fun args(args: JsonField<Args>) = apply { this.args = args }

                fun name(name: String) = name(JsonField.of(name))

                fun name(name: JsonField<String>) = apply { this.name = name }

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

                fun build(): UnionMember1 =
                    UnionMember1(
                        checkRequired("args", args),
                        checkRequired("name", name),
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class Args
            @JsonCreator
            private constructor(
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Args = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(args: Args) = apply {
                        additionalProperties = args.additionalProperties.toMutableMap()
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

                    fun build(): Args = Args(additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Args && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() = "Args{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is UnionMember1 && args == other.args && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(args, name, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UnionMember1{args=$args, name=$name, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AgentConfig && enableSessionPersistence == other.enableSessionPersistence && instructions == other.instructions && maxInferIters == other.maxInferIters && model == other.model && clientTools == other.clientTools && inputShields == other.inputShields && outputShields == other.outputShields && samplingParams == other.samplingParams && toolChoice == other.toolChoice && toolPromptFormat == other.toolPromptFormat && toolgroups == other.toolgroups && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(enableSessionPersistence, instructions, maxInferIters, model, clientTools, inputShields, outputShields, samplingParams, toolChoice, toolPromptFormat, toolgroups, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgentConfig{enableSessionPersistence=$enableSessionPersistence, instructions=$instructions, maxInferIters=$maxInferIters, model=$model, clientTools=$clientTools, inputShields=$inputShields, outputShields=$outputShields, samplingParams=$samplingParams, toolChoice=$toolChoice, toolPromptFormat=$toolPromptFormat, toolgroups=$toolgroups, additionalProperties=$additionalProperties}"
}
