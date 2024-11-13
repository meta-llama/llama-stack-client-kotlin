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

    fun apiKey(): String = apiKey.getRequired("api_key")

    fun engine(): Engine = engine.getRequired("engine")

    fun inputShields(): List<String>? = inputShields.getNullable("input_shields")

    fun outputShields(): List<String>? = outputShields.getNullable("output_shields")

    fun remoteExecution(): RestApiExecutionConfig? = remoteExecution.getNullable("remote_execution")

    fun type(): Type = type.getRequired("type")

    @JsonProperty("api_key") @ExcludeMissing fun _apiKey() = apiKey

    @JsonProperty("engine") @ExcludeMissing fun _engine() = engine

    @JsonProperty("input_shields") @ExcludeMissing fun _inputShields() = inputShields

    @JsonProperty("output_shields") @ExcludeMissing fun _outputShields() = outputShields

    @JsonProperty("remote_execution") @ExcludeMissing fun _remoteExecution() = remoteExecution

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

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var apiKey: JsonField<String> = JsonMissing.of()
        private var engine: JsonField<Engine> = JsonMissing.of()
        private var inputShields: JsonField<List<String>> = JsonMissing.of()
        private var outputShields: JsonField<List<String>> = JsonMissing.of()
        private var remoteExecution: JsonField<RestApiExecutionConfig> = JsonMissing.of()
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

        fun build(): SearchToolDefinition =
            SearchToolDefinition(
                apiKey,
                engine,
                inputShields.map { it.toImmutable() },
                outputShields.map { it.toImmutable() },
                remoteExecution,
                type,
                additionalProperties.toImmutable(),
            )
    }

    class Engine
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Engine && this.value == other.value /* spotless:on */
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
                else -> throw LlamaStackClientInvalidDataException("Unknown Engine: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
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
                else -> throw LlamaStackClientInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SearchToolDefinition && this.apiKey == other.apiKey && this.engine == other.engine && this.inputShields == other.inputShields && this.outputShields == other.outputShields && this.remoteExecution == other.remoteExecution && this.type == other.type && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(apiKey, engine, inputShields, outputShields, remoteExecution, type, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "SearchToolDefinition{apiKey=$apiKey, engine=$engine, inputShields=$inputShields, outputShields=$outputShields, remoteExecution=$remoteExecution, type=$type, additionalProperties=$additionalProperties}"
}
