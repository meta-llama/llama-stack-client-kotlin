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
class QueryCondition
@JsonCreator
private constructor(
    @JsonProperty("key") @ExcludeMissing private val key: JsonField<String> = JsonMissing.of(),
    @JsonProperty("op") @ExcludeMissing private val op: JsonField<Op> = JsonMissing.of(),
    @JsonProperty("value") @ExcludeMissing private val value: JsonField<Value> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun key(): String = key.getRequired("key")

    fun op(): Op = op.getRequired("op")

    fun value(): Value? = value.getNullable("value")

    @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

    @JsonProperty("op") @ExcludeMissing fun _op(): JsonField<Op> = op

    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Value> = value

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): QueryCondition = apply {
        if (validated) {
            return@apply
        }

        key()
        op()
        value()?.validate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var key: JsonField<String>? = null
        private var op: JsonField<Op>? = null
        private var value: JsonField<Value>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(queryCondition: QueryCondition) = apply {
            key = queryCondition.key
            op = queryCondition.op
            value = queryCondition.value
            additionalProperties = queryCondition.additionalProperties.toMutableMap()
        }

        fun key(key: String) = key(JsonField.of(key))

        fun key(key: JsonField<String>) = apply { this.key = key }

        fun op(op: Op) = op(JsonField.of(op))

        fun op(op: JsonField<Op>) = apply { this.op = op }

        fun value(value: Value?) = value(JsonField.ofNullable(value))

        fun value(value: JsonField<Value>) = apply { this.value = value }

        fun value(boolean: Boolean) = value(Value.ofBoolean(boolean))

        fun value(double: Double) = value(Value.ofDouble(double))

        fun value(string: String) = value(Value.ofString(string))

        fun valueOfJsonValues(jsonValues: List<JsonValue>) = value(Value.ofJsonValues(jsonValues))

        fun value(json: JsonValue) = value(Value.ofJson(json))

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

        fun build(): QueryCondition =
            QueryCondition(
                checkRequired("key", key),
                checkRequired("op", op),
                checkRequired("value", value),
                additionalProperties.toImmutable(),
            )
    }

    class Op
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val EQ = of("eq")

            val NE = of("ne")

            val GT = of("gt")

            val LT = of("lt")

            fun of(value: String) = Op(JsonField.of(value))
        }

        enum class Known {
            EQ,
            NE,
            GT,
            LT,
        }

        enum class Value {
            EQ,
            NE,
            GT,
            LT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                EQ -> Value.EQ
                NE -> Value.NE
                GT -> Value.GT
                LT -> Value.LT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                EQ -> Known.EQ
                NE -> Known.NE
                GT -> Known.GT
                LT -> Known.LT
                else -> throw LlamaStackClientInvalidDataException("Unknown Op: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Op && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @JsonDeserialize(using = Value.Deserializer::class)
    @JsonSerialize(using = Value.Serializer::class)
    class Value
    private constructor(
        private val boolean: Boolean? = null,
        private val double: Double? = null,
        private val string: String? = null,
        private val jsonValues: List<JsonValue>? = null,
        private val json: JsonValue? = null,
        private val _json: JsonValue? = null,
    ) {

        fun boolean(): Boolean? = boolean

        fun double(): Double? = double

        fun string(): String? = string

        fun jsonValues(): List<JsonValue>? = jsonValues

        fun json(): JsonValue? = json

        fun isBoolean(): Boolean = boolean != null

        fun isDouble(): Boolean = double != null

        fun isString(): Boolean = string != null

        fun isJsonValues(): Boolean = jsonValues != null

        fun isJson(): Boolean = json != null

        fun asBoolean(): Boolean = boolean.getOrThrow("boolean")

        fun asDouble(): Double = double.getOrThrow("double")

        fun asString(): String = string.getOrThrow("string")

        fun asJsonValues(): List<JsonValue> = jsonValues.getOrThrow("jsonValues")

        fun asJson(): JsonValue = json.getOrThrow("json")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                boolean != null -> visitor.visitBoolean(boolean)
                double != null -> visitor.visitDouble(double)
                string != null -> visitor.visitString(string)
                jsonValues != null -> visitor.visitJsonValues(jsonValues)
                json != null -> visitor.visitJson(json)
                else -> visitor.unknown(_json)
            }
        }

        private var validated: Boolean = false

        fun validate(): Value = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitBoolean(boolean: Boolean) {}

                    override fun visitDouble(double: Double) {}

                    override fun visitString(string: String) {}

                    override fun visitJsonValues(jsonValues: List<JsonValue>) {}

                    override fun visitJson(json: JsonValue) {}
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Value && boolean == other.boolean && double == other.double && string == other.string && jsonValues == other.jsonValues && json == other.json /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(boolean, double, string, jsonValues, json) /* spotless:on */

        override fun toString(): String =
            when {
                boolean != null -> "Value{boolean=$boolean}"
                double != null -> "Value{double=$double}"
                string != null -> "Value{string=$string}"
                jsonValues != null -> "Value{jsonValues=$jsonValues}"
                json != null -> "Value{json=$json}"
                _json != null -> "Value{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Value")
            }

        companion object {

            fun ofBoolean(boolean: Boolean) = Value(boolean = boolean)

            fun ofDouble(double: Double) = Value(double = double)

            fun ofString(string: String) = Value(string = string)

            fun ofJsonValues(jsonValues: List<JsonValue>) = Value(jsonValues = jsonValues)

            fun ofJson(json: JsonValue) = Value(json = json)
        }

        interface Visitor<out T> {

            fun visitBoolean(boolean: Boolean): T

            fun visitDouble(double: Double): T

            fun visitString(string: String): T

            fun visitJsonValues(jsonValues: List<JsonValue>): T

            fun visitJson(json: JsonValue): T

            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown Value: $json")
            }
        }

        class Deserializer : BaseDeserializer<Value>(Value::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Value {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<Boolean>())?.let {
                    return Value(boolean = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                    return Value(double = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                    return Value(string = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<List<JsonValue>>())?.let {
                    return Value(jsonValues = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<JsonValue>())?.let {
                    return Value(json = it, _json = json)
                }

                return Value(_json = json)
            }
        }

        class Serializer : BaseSerializer<Value>(Value::class) {

            override fun serialize(
                value: Value,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.boolean != null -> generator.writeObject(value.boolean)
                    value.double != null -> generator.writeObject(value.double)
                    value.string != null -> generator.writeObject(value.string)
                    value.jsonValues != null -> generator.writeObject(value.jsonValues)
                    value.json != null -> generator.writeObject(value.json)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Value")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is QueryCondition && key == other.key && op == other.op && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(key, op, value, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "QueryCondition{key=$key, op=$op, value=$value, additionalProperties=$additionalProperties}"
}
