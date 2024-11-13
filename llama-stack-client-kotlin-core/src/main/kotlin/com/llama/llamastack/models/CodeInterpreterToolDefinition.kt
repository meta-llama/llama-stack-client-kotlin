// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.llama.llamastack.core.Enum
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

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

    fun enableInlineCodeExecution(): Boolean =
        enableInlineCodeExecution.getRequired("enable_inline_code_execution")

    fun inputShields(): List<String>? = inputShields.getNullable("input_shields")

    fun outputShields(): List<String>? = outputShields.getNullable("output_shields")

    fun remoteExecution(): RestApiExecutionConfig? = remoteExecution.getNullable("remote_execution")

    fun type(): Type = type.getRequired("type")

    @JsonProperty("enable_inline_code_execution")
    @ExcludeMissing
    fun _enableInlineCodeExecution() = enableInlineCodeExecution

    @JsonProperty("input_shields") @ExcludeMissing fun _inputShields() = inputShields

    @JsonProperty("output_shields") @ExcludeMissing fun _outputShields() = outputShields

    @JsonProperty("remote_execution") @ExcludeMissing fun _remoteExecution() = remoteExecution

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

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var enableInlineCodeExecution: JsonField<Boolean> = JsonMissing.of()
        private var inputShields: JsonField<List<String>> = JsonMissing.of()
        private var outputShields: JsonField<List<String>> = JsonMissing.of()
        private var remoteExecution: JsonField<RestApiExecutionConfig> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(codeInterpreterToolDefinition: CodeInterpreterToolDefinition) = apply {
            this.enableInlineCodeExecution = codeInterpreterToolDefinition.enableInlineCodeExecution
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
        fun enableInlineCodeExecution(enableInlineCodeExecution: JsonField<Boolean>) = apply {
            this.enableInlineCodeExecution = enableInlineCodeExecution
        }

        fun inputShields(inputShields: List<String>) = inputShields(JsonField.of(inputShields))

        @JsonProperty("input_shields")
        @ExcludeMissing
        fun inputShields(inputShields: JsonField<List<String>>) = apply {
            this.inputShields = inputShields
        }

        fun outputShields(outputShields: List<String>) = outputShields(JsonField.of(outputShields))

        @JsonProperty("output_shields")
        @ExcludeMissing
        fun outputShields(outputShields: JsonField<List<String>>) = apply {
            this.outputShields = outputShields
        }

        fun remoteExecution(remoteExecution: RestApiExecutionConfig) =
            remoteExecution(JsonField.of(remoteExecution))

        @JsonProperty("remote_execution")
        @ExcludeMissing
        fun remoteExecution(remoteExecution: JsonField<RestApiExecutionConfig>) = apply {
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

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): CodeInterpreterToolDefinition =
            CodeInterpreterToolDefinition(
                enableInlineCodeExecution,
                inputShields.map { it.toImmutable() },
                outputShields.map { it.toImmutable() },
                remoteExecution,
                type,
                additionalProperties.toImmutable(),
            )
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
                else -> throw LlamaStackClientInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CodeInterpreterToolDefinition && this.enableInlineCodeExecution == other.enableInlineCodeExecution && this.inputShields == other.inputShields && this.outputShields == other.outputShields && this.remoteExecution == other.remoteExecution && this.type == other.type && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(enableInlineCodeExecution, inputShields, outputShields, remoteExecution, type, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "CodeInterpreterToolDefinition{enableInlineCodeExecution=$enableInlineCodeExecution, inputShields=$inputShields, outputShields=$outputShields, remoteExecution=$remoteExecution, type=$type, additionalProperties=$additionalProperties}"
}
