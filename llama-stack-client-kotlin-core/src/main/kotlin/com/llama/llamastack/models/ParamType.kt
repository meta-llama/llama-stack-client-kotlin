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
import com.llama.llamastack.models.ParamType.Type
import java.util.Objects

@JsonDeserialize(using = ParamType.Deserializer::class)
@JsonSerialize(using = ParamType.Serializer::class)
class ParamType
private constructor(
    private val type: Type? = null,
    private val _json: JsonValue? = null,
) {

    fun type(): Type? = type

    fun isType(): Boolean = type != null

    fun asType(): Type = type.getOrThrow("type")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            type != null -> visitor.visitType(type)
            else -> visitor.unknown(_json)
        }
    }

    private var validated: Boolean = false

    fun validate(): ParamType = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitType(type: Type) {
                    type.validate()
                }
            }
        )
        validated = true
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ParamType && type == other.type /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(type) /* spotless:on */

    override fun toString(): String =
        when {
            type != null -> "ParamType{type=${type}}"
            _json != null -> "ParamType{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid ParamType")
        }

    companion object {

        fun ofType(type: Type) = ParamType(type = type)
    }

    interface Visitor<out T> {

        fun visitType(type: Type): T

        fun unknown(json: JsonValue?): T {
            throw LlamaStackClientInvalidDataException("Unknown ParamType: $json")
        }
    }

    class Deserializer : BaseDeserializer<ParamType>(ParamType::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): ParamType {
            val json = JsonValue.fromJsonNode(node)

            tryDeserialize(node, jacksonTypeRef<Type>()) { it.validate() }
                ?.let {
                    return ParamType(type = it, _json = json)
                }

            return ParamType(_json = json)
        }
    }

    class Serializer : BaseSerializer<ParamType>(ParamType::class) {

        override fun serialize(
            value: ParamType,
            generator: JsonGenerator,
            provider: SerializerProvider
        ) {
            when {
                value.type != null -> generator.writeObject(value.type)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid ParamType")
            }
        }
    }

    @NoAutoDetect
    class Type
    @JsonCreator
    private constructor(
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun type(): Type = type.getRequired("type")

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ParamType.Type = apply {
            if (validated) {
                return@apply
            }

            type()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var type: JsonField<Type>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(type: ParamType.Type) = apply {
                this.type = type.type
                additionalProperties = type.additionalProperties.toMutableMap()
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

            fun build(): ParamType.Type =
                Type(
                    checkNotNull(type) { "`type` is required but was not set" },
                    additionalProperties.toImmutable()
                )
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val STRING = of("string")
                val NUMBER = of("number")
                val BOOLEAN = of("boolean")
                val ARRAY = of("array")
                val OBJECT = of("object")
                val JSON = of("json")
                val UNION = of("union")
                val CHAT_COMPLETION_INPUT = of("chat_completion_input")
                val COMPLETION_INPUT = of("completion_input")
                val AGENT_TURN_INPUT = of("agent_turn_input")

                fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                STRING,
                NUMBER,
                BOOLEAN,
                ARRAY,
                OBJECT,
                JSON,
                UNION,
                CHAT_COMPLETION_INPUT,
                COMPLETION_INPUT,
                AGENT_TURN_INPUT,
            }

            enum class Value {
                STRING,
                NUMBER,
                BOOLEAN,
                ARRAY,
                OBJECT,
                JSON,
                UNION,
                CHAT_COMPLETION_INPUT,
                COMPLETION_INPUT,
                AGENT_TURN_INPUT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    STRING -> Value.STRING
                    NUMBER -> Value.NUMBER
                    BOOLEAN -> Value.BOOLEAN
                    ARRAY -> Value.ARRAY
                    OBJECT -> Value.OBJECT
                    JSON -> Value.JSON
                    UNION -> Value.UNION
                    CHAT_COMPLETION_INPUT -> Value.CHAT_COMPLETION_INPUT
                    COMPLETION_INPUT -> Value.COMPLETION_INPUT
                    AGENT_TURN_INPUT -> Value.AGENT_TURN_INPUT
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    STRING -> Known.STRING
                    NUMBER -> Known.NUMBER
                    BOOLEAN -> Known.BOOLEAN
                    ARRAY -> Known.ARRAY
                    OBJECT -> Known.OBJECT
                    JSON -> Known.JSON
                    UNION -> Known.UNION
                    CHAT_COMPLETION_INPUT -> Known.CHAT_COMPLETION_INPUT
                    COMPLETION_INPUT -> Known.COMPLETION_INPUT
                    AGENT_TURN_INPUT -> Known.AGENT_TURN_INPUT
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

            return /* spotless:off */ other is ParamType.Type && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Type{type=$type, additionalProperties=$additionalProperties}"
    }
}
