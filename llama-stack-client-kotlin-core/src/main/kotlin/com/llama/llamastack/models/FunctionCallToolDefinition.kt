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

    fun description(): String = description.getRequired("description")

    fun functionName(): String = functionName.getRequired("function_name")

    fun inputShields(): List<String>? = inputShields.getNullable("input_shields")

    fun outputShields(): List<String>? = outputShields.getNullable("output_shields")

    fun parameters(): Parameters = parameters.getRequired("parameters")

    fun remoteExecution(): RestApiExecutionConfig? = remoteExecution.getNullable("remote_execution")

    fun type(): Type = type.getRequired("type")

    @JsonProperty("description") @ExcludeMissing fun _description() = description

    @JsonProperty("function_name") @ExcludeMissing fun _functionName() = functionName

    @JsonProperty("input_shields") @ExcludeMissing fun _inputShields() = inputShields

    @JsonProperty("output_shields") @ExcludeMissing fun _outputShields() = outputShields

    @JsonProperty("parameters") @ExcludeMissing fun _parameters() = parameters

    @JsonProperty("remote_execution") @ExcludeMissing fun _remoteExecution() = remoteExecution

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

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var description: JsonField<String> = JsonMissing.of()
        private var functionName: JsonField<String> = JsonMissing.of()
        private var inputShields: JsonField<List<String>> = JsonMissing.of()
        private var outputShields: JsonField<List<String>> = JsonMissing.of()
        private var parameters: JsonField<Parameters> = JsonMissing.of()
        private var remoteExecution: JsonField<RestApiExecutionConfig> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(functionCallToolDefinition: FunctionCallToolDefinition) = apply {
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
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun functionName(functionName: String) = functionName(JsonField.of(functionName))

        @JsonProperty("function_name")
        @ExcludeMissing
        fun functionName(functionName: JsonField<String>) = apply {
            this.functionName = functionName
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

        fun parameters(parameters: Parameters) = parameters(JsonField.of(parameters))

        @JsonProperty("parameters")
        @ExcludeMissing
        fun parameters(parameters: JsonField<Parameters>) = apply { this.parameters = parameters }

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

        fun build(): FunctionCallToolDefinition =
            FunctionCallToolDefinition(
                description,
                functionName,
                inputShields.map { it.toImmutable() },
                outputShields.map { it.toImmutable() },
                parameters,
                remoteExecution,
                type,
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = Parameters.Builder::class)
    @NoAutoDetect
    class Parameters
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Parameters = apply {
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
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

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
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
                else -> throw LlamaStackClientInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FunctionCallToolDefinition && description == other.description && functionName == other.functionName && inputShields == other.inputShields && outputShields == other.outputShields && parameters == other.parameters && remoteExecution == other.remoteExecution && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(description, functionName, inputShields, outputShields, parameters, remoteExecution, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FunctionCallToolDefinition{description=$description, functionName=$functionName, inputShields=$inputShields, outputShields=$outputShields, parameters=$parameters, remoteExecution=$remoteExecution, type=$type, additionalProperties=$additionalProperties}"
}
