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
import com.llama.llamastack.core.checkKnown
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
    @JsonProperty("instructions")
    @ExcludeMissing
    private val instructions: JsonField<String> = JsonMissing.of(),
    @JsonProperty("model") @ExcludeMissing private val model: JsonField<String> = JsonMissing.of(),
    @JsonProperty("client_tools")
    @ExcludeMissing
    private val clientTools: JsonField<List<ToolDef>> = JsonMissing.of(),
    @JsonProperty("enable_session_persistence")
    @ExcludeMissing
    private val enableSessionPersistence: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("input_shields")
    @ExcludeMissing
    private val inputShields: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("max_infer_iters")
    @ExcludeMissing
    private val maxInferIters: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("output_shields")
    @ExcludeMissing
    private val outputShields: JsonField<List<String>> = JsonMissing.of(),
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
    @JsonProperty("toolgroups")
    @ExcludeMissing
    private val toolgroups: JsonField<List<Toolgroup>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun instructions(): String = instructions.getRequired("instructions")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun model(): String = model.getRequired("model")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun clientTools(): List<ToolDef>? = clientTools.getNullable("client_tools")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun enableSessionPersistence(): Boolean? =
        enableSessionPersistence.getNullable("enable_session_persistence")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun inputShields(): List<String>? = inputShields.getNullable("input_shields")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxInferIters(): Long? = maxInferIters.getNullable("max_infer_iters")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun outputShields(): List<String>? = outputShields.getNullable("output_shields")

    /**
     * Configuration for JSON schema-guided response generation.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun responseFormat(): ResponseFormat? = responseFormat.getNullable("response_format")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun samplingParams(): SamplingParams? = samplingParams.getNullable("sampling_params")

    /**
     * Whether tool use is required or automatic. This is a hint to the model which may not be
     * followed. It depends on the Instruction Following capabilities of the model.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    @Deprecated("deprecated") fun toolChoice(): ToolChoice? = toolChoice.getNullable("tool_choice")

    /**
     * Configuration for tool use.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun toolConfig(): ToolConfig? = toolConfig.getNullable("tool_config")

    /**
     * Prompt format for calling custom / zero shot tools.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun toolPromptFormat(): ToolPromptFormat? = toolPromptFormat.getNullable("tool_prompt_format")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun toolgroups(): List<Toolgroup>? = toolgroups.getNullable("toolgroups")

    /**
     * Returns the raw JSON value of [instructions].
     *
     * Unlike [instructions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instructions")
    @ExcludeMissing
    fun _instructions(): JsonField<String> = instructions

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

    /**
     * Returns the raw JSON value of [clientTools].
     *
     * Unlike [clientTools], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("client_tools")
    @ExcludeMissing
    fun _clientTools(): JsonField<List<ToolDef>> = clientTools

    /**
     * Returns the raw JSON value of [enableSessionPersistence].
     *
     * Unlike [enableSessionPersistence], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("enable_session_persistence")
    @ExcludeMissing
    fun _enableSessionPersistence(): JsonField<Boolean> = enableSessionPersistence

    /**
     * Returns the raw JSON value of [inputShields].
     *
     * Unlike [inputShields], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("input_shields")
    @ExcludeMissing
    fun _inputShields(): JsonField<List<String>> = inputShields

    /**
     * Returns the raw JSON value of [maxInferIters].
     *
     * Unlike [maxInferIters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("max_infer_iters")
    @ExcludeMissing
    fun _maxInferIters(): JsonField<Long> = maxInferIters

    /**
     * Returns the raw JSON value of [outputShields].
     *
     * Unlike [outputShields], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("output_shields")
    @ExcludeMissing
    fun _outputShields(): JsonField<List<String>> = outputShields

    /**
     * Returns the raw JSON value of [responseFormat].
     *
     * Unlike [responseFormat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("response_format")
    @ExcludeMissing
    fun _responseFormat(): JsonField<ResponseFormat> = responseFormat

    /**
     * Returns the raw JSON value of [samplingParams].
     *
     * Unlike [samplingParams], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sampling_params")
    @ExcludeMissing
    fun _samplingParams(): JsonField<SamplingParams> = samplingParams

    /**
     * Returns the raw JSON value of [toolChoice].
     *
     * Unlike [toolChoice], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
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
    @Deprecated("deprecated")
    @JsonProperty("tool_prompt_format")
    @ExcludeMissing
    fun _toolPromptFormat(): JsonField<ToolPromptFormat> = toolPromptFormat

    /**
     * Returns the raw JSON value of [toolgroups].
     *
     * Unlike [toolgroups], this method doesn't throw if the JSON field has an unexpected type.
     */
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

        instructions()
        model()
        clientTools()?.forEach { it.validate() }
        enableSessionPersistence()
        inputShields()
        maxInferIters()
        outputShields()
        responseFormat()?.validate()
        samplingParams()?.validate()
        toolChoice()
        toolConfig()?.validate()
        toolPromptFormat()
        toolgroups()?.forEach { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AgentConfig].
         *
         * The following fields are required:
         * ```kotlin
         * .instructions()
         * .model()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AgentConfig]. */
    class Builder internal constructor() {

        private var instructions: JsonField<String>? = null
        private var model: JsonField<String>? = null
        private var clientTools: JsonField<MutableList<ToolDef>>? = null
        private var enableSessionPersistence: JsonField<Boolean> = JsonMissing.of()
        private var inputShields: JsonField<MutableList<String>>? = null
        private var maxInferIters: JsonField<Long> = JsonMissing.of()
        private var outputShields: JsonField<MutableList<String>>? = null
        private var responseFormat: JsonField<ResponseFormat> = JsonMissing.of()
        private var samplingParams: JsonField<SamplingParams> = JsonMissing.of()
        private var toolChoice: JsonField<ToolChoice> = JsonMissing.of()
        private var toolConfig: JsonField<ToolConfig> = JsonMissing.of()
        private var toolPromptFormat: JsonField<ToolPromptFormat> = JsonMissing.of()
        private var toolgroups: JsonField<MutableList<Toolgroup>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(agentConfig: AgentConfig) = apply {
            instructions = agentConfig.instructions
            model = agentConfig.model
            clientTools = agentConfig.clientTools.map { it.toMutableList() }
            enableSessionPersistence = agentConfig.enableSessionPersistence
            inputShields = agentConfig.inputShields.map { it.toMutableList() }
            maxInferIters = agentConfig.maxInferIters
            outputShields = agentConfig.outputShields.map { it.toMutableList() }
            responseFormat = agentConfig.responseFormat
            samplingParams = agentConfig.samplingParams
            toolChoice = agentConfig.toolChoice
            toolConfig = agentConfig.toolConfig
            toolPromptFormat = agentConfig.toolPromptFormat
            toolgroups = agentConfig.toolgroups.map { it.toMutableList() }
            additionalProperties = agentConfig.additionalProperties.toMutableMap()
        }

        fun instructions(instructions: String) = instructions(JsonField.of(instructions))

        /**
         * Sets [Builder.instructions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instructions] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun instructions(instructions: JsonField<String>) = apply {
            this.instructions = instructions
        }

        fun model(model: String) = model(JsonField.of(model))

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { this.model = model }

        fun clientTools(clientTools: List<ToolDef>) = clientTools(JsonField.of(clientTools))

        /**
         * Sets [Builder.clientTools] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientTools] with a well-typed `List<ToolDef>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun clientTools(clientTools: JsonField<List<ToolDef>>) = apply {
            this.clientTools = clientTools.map { it.toMutableList() }
        }

        /**
         * Adds a single [ToolDef] to [clientTools].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addClientTool(clientTool: ToolDef) = apply {
            clientTools =
                (clientTools ?: JsonField.of(mutableListOf())).also {
                    checkKnown("clientTools", it).add(clientTool)
                }
        }

        fun enableSessionPersistence(enableSessionPersistence: Boolean) =
            enableSessionPersistence(JsonField.of(enableSessionPersistence))

        /**
         * Sets [Builder.enableSessionPersistence] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enableSessionPersistence] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun enableSessionPersistence(enableSessionPersistence: JsonField<Boolean>) = apply {
            this.enableSessionPersistence = enableSessionPersistence
        }

        fun inputShields(inputShields: List<String>) = inputShields(JsonField.of(inputShields))

        /**
         * Sets [Builder.inputShields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inputShields] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun inputShields(inputShields: JsonField<List<String>>) = apply {
            this.inputShields = inputShields.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [inputShields].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInputShield(inputShield: String) = apply {
            inputShields =
                (inputShields ?: JsonField.of(mutableListOf())).also {
                    checkKnown("inputShields", it).add(inputShield)
                }
        }

        fun maxInferIters(maxInferIters: Long) = maxInferIters(JsonField.of(maxInferIters))

        /**
         * Sets [Builder.maxInferIters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxInferIters] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxInferIters(maxInferIters: JsonField<Long>) = apply {
            this.maxInferIters = maxInferIters
        }

        fun outputShields(outputShields: List<String>) = outputShields(JsonField.of(outputShields))

        /**
         * Sets [Builder.outputShields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outputShields] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun outputShields(outputShields: JsonField<List<String>>) = apply {
            this.outputShields = outputShields.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [outputShields].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOutputShield(outputShield: String) = apply {
            outputShields =
                (outputShields ?: JsonField.of(mutableListOf())).also {
                    checkKnown("outputShields", it).add(outputShield)
                }
        }

        /** Configuration for JSON schema-guided response generation. */
        fun responseFormat(responseFormat: ResponseFormat) =
            responseFormat(JsonField.of(responseFormat))

        /**
         * Sets [Builder.responseFormat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.responseFormat] with a well-typed [ResponseFormat] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun responseFormat(responseFormat: JsonField<ResponseFormat>) = apply {
            this.responseFormat = responseFormat
        }

        /** Alias for calling [responseFormat] with `ResponseFormat.ofJsonSchema(jsonSchema)`. */
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

        fun samplingParams(samplingParams: SamplingParams) =
            samplingParams(JsonField.of(samplingParams))

        /**
         * Sets [Builder.samplingParams] to an arbitrary JSON value.
         *
         * You should usually call [Builder.samplingParams] with a well-typed [SamplingParams] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun samplingParams(samplingParams: JsonField<SamplingParams>) = apply {
            this.samplingParams = samplingParams
        }

        /**
         * Whether tool use is required or automatic. This is a hint to the model which may not be
         * followed. It depends on the Instruction Following capabilities of the model.
         */
        @Deprecated("deprecated")
        fun toolChoice(toolChoice: ToolChoice) = toolChoice(JsonField.of(toolChoice))

        /**
         * Sets [Builder.toolChoice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolChoice] with a well-typed [ToolChoice] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        @Deprecated("deprecated")
        fun toolChoice(toolChoice: JsonField<ToolChoice>) = apply { this.toolChoice = toolChoice }

        /** Configuration for tool use. */
        fun toolConfig(toolConfig: ToolConfig) = toolConfig(JsonField.of(toolConfig))

        /**
         * Sets [Builder.toolConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolConfig] with a well-typed [ToolConfig] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun toolConfig(toolConfig: JsonField<ToolConfig>) = apply { this.toolConfig = toolConfig }

        /** Prompt format for calling custom / zero shot tools. */
        @Deprecated("deprecated")
        fun toolPromptFormat(toolPromptFormat: ToolPromptFormat) =
            toolPromptFormat(JsonField.of(toolPromptFormat))

        /**
         * Sets [Builder.toolPromptFormat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolPromptFormat] with a well-typed [ToolPromptFormat]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        @Deprecated("deprecated")
        fun toolPromptFormat(toolPromptFormat: JsonField<ToolPromptFormat>) = apply {
            this.toolPromptFormat = toolPromptFormat
        }

        fun toolgroups(toolgroups: List<Toolgroup>) = toolgroups(JsonField.of(toolgroups))

        /**
         * Sets [Builder.toolgroups] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolgroups] with a well-typed `List<Toolgroup>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun toolgroups(toolgroups: JsonField<List<Toolgroup>>) = apply {
            this.toolgroups = toolgroups.map { it.toMutableList() }
        }

        /**
         * Adds a single [Toolgroup] to [toolgroups].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addToolgroup(toolgroup: Toolgroup) = apply {
            toolgroups =
                (toolgroups ?: JsonField.of(mutableListOf())).also {
                    checkKnown("toolgroups", it).add(toolgroup)
                }
        }

        /** Alias for calling [addToolgroup] with `Toolgroup.ofString(string)`. */
        fun addToolgroup(string: String) = addToolgroup(Toolgroup.ofString(string))

        /**
         * Alias for calling [addToolgroup] with
         * `Toolgroup.ofAgentToolGroupWithArgs(agentToolGroupWithArgs)`.
         */
        fun addToolgroup(agentToolGroupWithArgs: Toolgroup.AgentToolGroupWithArgs) =
            addToolgroup(Toolgroup.ofAgentToolGroupWithArgs(agentToolGroupWithArgs))

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
                checkRequired("instructions", instructions),
                checkRequired("model", model),
                (clientTools ?: JsonMissing.of()).map { it.toImmutable() },
                enableSessionPersistence,
                (inputShields ?: JsonMissing.of()).map { it.toImmutable() },
                maxInferIters,
                (outputShields ?: JsonMissing.of()).map { it.toImmutable() },
                responseFormat,
                samplingParams,
                toolChoice,
                toolConfig,
                toolPromptFormat,
                (toolgroups ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    /**
     * Whether tool use is required or automatic. This is a hint to the model which may not be
     * followed. It depends on the Instruction Following capabilities of the model.
     */
    @Deprecated("deprecated")
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

    /** Configuration for tool use. */
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

    /** Prompt format for calling custom / zero shot tools. */
    @Deprecated("deprecated")
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

    @JsonDeserialize(using = Toolgroup.Deserializer::class)
    @JsonSerialize(using = Toolgroup.Serializer::class)
    class Toolgroup
    private constructor(
        private val string: String? = null,
        private val agentToolGroupWithArgs: AgentToolGroupWithArgs? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): String? = string

        fun agentToolGroupWithArgs(): AgentToolGroupWithArgs? = agentToolGroupWithArgs

        fun isString(): Boolean = string != null

        fun isAgentToolGroupWithArgs(): Boolean = agentToolGroupWithArgs != null

        fun asString(): String = string.getOrThrow("string")

        fun asAgentToolGroupWithArgs(): AgentToolGroupWithArgs =
            agentToolGroupWithArgs.getOrThrow("agentToolGroupWithArgs")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                string != null -> visitor.visitString(string)
                agentToolGroupWithArgs != null ->
                    visitor.visitAgentToolGroupWithArgs(agentToolGroupWithArgs)
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

                    override fun visitAgentToolGroupWithArgs(
                        agentToolGroupWithArgs: AgentToolGroupWithArgs
                    ) {
                        agentToolGroupWithArgs.validate()
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Toolgroup && string == other.string && agentToolGroupWithArgs == other.agentToolGroupWithArgs /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, agentToolGroupWithArgs) /* spotless:on */

        override fun toString(): String =
            when {
                string != null -> "Toolgroup{string=$string}"
                agentToolGroupWithArgs != null ->
                    "Toolgroup{agentToolGroupWithArgs=$agentToolGroupWithArgs}"
                _json != null -> "Toolgroup{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Toolgroup")
            }

        companion object {

            fun ofString(string: String) = Toolgroup(string = string)

            fun ofAgentToolGroupWithArgs(agentToolGroupWithArgs: AgentToolGroupWithArgs) =
                Toolgroup(agentToolGroupWithArgs = agentToolGroupWithArgs)
        }

        /**
         * An interface that defines how to map each variant of [Toolgroup] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitAgentToolGroupWithArgs(agentToolGroupWithArgs: AgentToolGroupWithArgs): T

            /**
             * Maps an unknown variant of [Toolgroup] to a value of type [T].
             *
             * An instance of [Toolgroup] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws LlamaStackClientInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown Toolgroup: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Toolgroup>(Toolgroup::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Toolgroup {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                    return Toolgroup(string = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<AgentToolGroupWithArgs>()) { it.validate() }
                    ?.let {
                        return Toolgroup(agentToolGroupWithArgs = it, _json = json)
                    }

                return Toolgroup(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Toolgroup>(Toolgroup::class) {

            override fun serialize(
                value: Toolgroup,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.agentToolGroupWithArgs != null ->
                        generator.writeObject(value.agentToolGroupWithArgs)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Toolgroup")
                }
            }
        }

        @NoAutoDetect
        class AgentToolGroupWithArgs
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

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun args(): Args = args.getRequired("args")

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * Returns the raw JSON value of [args].
             *
             * Unlike [args], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("args") @ExcludeMissing fun _args(): JsonField<Args> = args

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): AgentToolGroupWithArgs = apply {
                if (validated) {
                    return@apply
                }

                args().validate()
                name()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [AgentToolGroupWithArgs].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .args()
                 * .name()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [AgentToolGroupWithArgs]. */
            class Builder internal constructor() {

                private var args: JsonField<Args>? = null
                private var name: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(agentToolGroupWithArgs: AgentToolGroupWithArgs) = apply {
                    args = agentToolGroupWithArgs.args
                    name = agentToolGroupWithArgs.name
                    additionalProperties =
                        agentToolGroupWithArgs.additionalProperties.toMutableMap()
                }

                fun args(args: Args) = args(JsonField.of(args))

                /**
                 * Sets [Builder.args] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.args] with a well-typed [Args] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun args(args: JsonField<Args>) = apply { this.args = args }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
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

                fun build(): AgentToolGroupWithArgs =
                    AgentToolGroupWithArgs(
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
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
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

                    /** Returns a mutable builder for constructing an instance of [Args]. */
                    fun builder() = Builder()
                }

                /** A builder for [Args]. */
                class Builder internal constructor() {

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

                return /* spotless:off */ other is AgentToolGroupWithArgs && args == other.args && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(args, name, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AgentToolGroupWithArgs{args=$args, name=$name, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AgentConfig && instructions == other.instructions && model == other.model && clientTools == other.clientTools && enableSessionPersistence == other.enableSessionPersistence && inputShields == other.inputShields && maxInferIters == other.maxInferIters && outputShields == other.outputShields && responseFormat == other.responseFormat && samplingParams == other.samplingParams && toolChoice == other.toolChoice && toolConfig == other.toolConfig && toolPromptFormat == other.toolPromptFormat && toolgroups == other.toolgroups && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(instructions, model, clientTools, enableSessionPersistence, inputShields, maxInferIters, outputShields, responseFormat, samplingParams, toolChoice, toolConfig, toolPromptFormat, toolgroups, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgentConfig{instructions=$instructions, model=$model, clientTools=$clientTools, enableSessionPersistence=$enableSessionPersistence, inputShields=$inputShields, maxInferIters=$maxInferIters, outputShields=$outputShields, responseFormat=$responseFormat, samplingParams=$samplingParams, toolChoice=$toolChoice, toolConfig=$toolConfig, toolPromptFormat=$toolPromptFormat, toolgroups=$toolgroups, additionalProperties=$additionalProperties}"
}
