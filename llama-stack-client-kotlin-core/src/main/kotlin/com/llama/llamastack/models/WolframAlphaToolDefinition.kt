// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.llama.llamastack.core.Enum
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

@NoAutoDetect
class WolframAlphaToolDefinition
@JsonCreator
private constructor(
    @JsonProperty("api_key")
    @ExcludeMissing
    private val apiKey: JsonField<String> = JsonMissing.of(),
    @JsonProperty("input_shields")
    @ExcludeMissing
    private val inputShields: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("output_shields")
    @ExcludeMissing
    private val outputShields: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("remote_execution")
    @ExcludeMissing
    private val remoteExecution: JsonField<RestApiExecutionConfig> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun apiKey(): String = apiKey.getRequired("api_key")

    fun inputShields(): List<String>? = inputShields.getNullable("input_shields")

    fun outputShields(): List<String>? = outputShields.getNullable("output_shields")

    fun remoteExecution(): RestApiExecutionConfig? = remoteExecution.getNullable("remote_execution")

    fun type(): Type = type.getRequired("type")

    @JsonProperty("api_key") @ExcludeMissing fun _apiKey() = apiKey

    @JsonProperty("input_shields") @ExcludeMissing fun _inputShields() = inputShields

    @JsonProperty("output_shields") @ExcludeMissing fun _outputShields() = outputShields

    @JsonProperty("remote_execution") @ExcludeMissing fun _remoteExecution() = remoteExecution

    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

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

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var apiKey: JsonField<String> = JsonMissing.of()
        private var inputShields: JsonField<List<String>> = JsonMissing.of()
        private var outputShields: JsonField<List<String>> = JsonMissing.of()
        private var remoteExecution: JsonField<RestApiExecutionConfig> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(wolframAlphaToolDefinition: WolframAlphaToolDefinition) = apply {
            apiKey = wolframAlphaToolDefinition.apiKey
            inputShields = wolframAlphaToolDefinition.inputShields
            outputShields = wolframAlphaToolDefinition.outputShields
            remoteExecution = wolframAlphaToolDefinition.remoteExecution
            type = wolframAlphaToolDefinition.type
            additionalProperties = wolframAlphaToolDefinition.additionalProperties.toMutableMap()
        }

        fun apiKey(apiKey: String) = apiKey(JsonField.of(apiKey))

        fun apiKey(apiKey: JsonField<String>) = apply { this.apiKey = apiKey }

        fun inputShields(inputShields: List<String>) = inputShields(JsonField.of(inputShields))

        fun inputShields(inputShields: JsonField<List<String>>) = apply {
            this.inputShields = inputShields
        }

        fun outputShields(outputShields: List<String>) = outputShields(JsonField.of(outputShields))

        fun outputShields(outputShields: JsonField<List<String>>) = apply {
            this.outputShields = outputShields
        }

        fun remoteExecution(remoteExecution: RestApiExecutionConfig) =
            remoteExecution(JsonField.of(remoteExecution))

        fun remoteExecution(remoteExecution: JsonField<RestApiExecutionConfig>) = apply {
            this.remoteExecution = remoteExecution
        }

        fun type(type: Type) = type(JsonField.of(type))

        fun type(type: JsonField<Type>) = apply { this.type = type }

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

        fun build(): WolframAlphaToolDefinition =
            WolframAlphaToolDefinition(
                apiKey,
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

        companion object {

            val WOLFRAM_ALPHA = of("wolfram_alpha")

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
                else -> throw LlamaStackClientInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is WolframAlphaToolDefinition && apiKey == other.apiKey && inputShields == other.inputShields && outputShields == other.outputShields && remoteExecution == other.remoteExecution && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(apiKey, inputShields, outputShields, remoteExecution, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WolframAlphaToolDefinition{apiKey=$apiKey, inputShields=$inputShields, outputShields=$outputShields, remoteExecution=$remoteExecution, type=$type, additionalProperties=$additionalProperties}"
}
