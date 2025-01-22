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

@JsonDeserialize(using = ParamType.Deserializer::class)
@JsonSerialize(using = ParamType.Serializer::class)
class ParamType
private constructor(
    private val stringType: StringType? = null,
    private val numberType: NumberType? = null,
    private val booleanType: BooleanType? = null,
    private val arrayType: ArrayType? = null,
    private val objectType: ObjectType? = null,
    private val jsonType: JsonType? = null,
    private val unionType: UnionType? = null,
    private val chatCompletionInputType: ChatCompletionInputType? = null,
    private val completionInputType: CompletionInputType? = null,
    private val agentTurnInputType: AgentTurnInputType? = null,
    private val _json: JsonValue? = null,
) {

    fun stringType(): StringType? = stringType

    fun numberType(): NumberType? = numberType

    fun booleanType(): BooleanType? = booleanType

    fun arrayType(): ArrayType? = arrayType

    fun objectType(): ObjectType? = objectType

    fun jsonType(): JsonType? = jsonType

    fun unionType(): UnionType? = unionType

    fun chatCompletionInputType(): ChatCompletionInputType? = chatCompletionInputType

    fun completionInputType(): CompletionInputType? = completionInputType

    fun agentTurnInputType(): AgentTurnInputType? = agentTurnInputType

    fun isStringType(): Boolean = stringType != null

    fun isNumberType(): Boolean = numberType != null

    fun isBooleanType(): Boolean = booleanType != null

    fun isArrayType(): Boolean = arrayType != null

    fun isObjectType(): Boolean = objectType != null

    fun isJsonType(): Boolean = jsonType != null

    fun isUnionType(): Boolean = unionType != null

    fun isChatCompletionInputType(): Boolean = chatCompletionInputType != null

    fun isCompletionInputType(): Boolean = completionInputType != null

    fun isAgentTurnInputType(): Boolean = agentTurnInputType != null

    fun asStringType(): StringType = stringType.getOrThrow("stringType")

    fun asNumberType(): NumberType = numberType.getOrThrow("numberType")

    fun asBooleanType(): BooleanType = booleanType.getOrThrow("booleanType")

    fun asArrayType(): ArrayType = arrayType.getOrThrow("arrayType")

    fun asObjectType(): ObjectType = objectType.getOrThrow("objectType")

    fun asJsonType(): JsonType = jsonType.getOrThrow("jsonType")

    fun asUnionType(): UnionType = unionType.getOrThrow("unionType")

    fun asChatCompletionInputType(): ChatCompletionInputType =
        chatCompletionInputType.getOrThrow("chatCompletionInputType")

    fun asCompletionInputType(): CompletionInputType =
        completionInputType.getOrThrow("completionInputType")

    fun asAgentTurnInputType(): AgentTurnInputType =
        agentTurnInputType.getOrThrow("agentTurnInputType")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            stringType != null -> visitor.visitStringType(stringType)
            numberType != null -> visitor.visitNumberType(numberType)
            booleanType != null -> visitor.visitBooleanType(booleanType)
            arrayType != null -> visitor.visitArrayType(arrayType)
            objectType != null -> visitor.visitObjectType(objectType)
            jsonType != null -> visitor.visitJsonType(jsonType)
            unionType != null -> visitor.visitUnionType(unionType)
            chatCompletionInputType != null ->
                visitor.visitChatCompletionInputType(chatCompletionInputType)
            completionInputType != null -> visitor.visitCompletionInputType(completionInputType)
            agentTurnInputType != null -> visitor.visitAgentTurnInputType(agentTurnInputType)
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
                override fun visitStringType(stringType: StringType) {
                    stringType.validate()
                }

                override fun visitNumberType(numberType: NumberType) {
                    numberType.validate()
                }

                override fun visitBooleanType(booleanType: BooleanType) {
                    booleanType.validate()
                }

                override fun visitArrayType(arrayType: ArrayType) {
                    arrayType.validate()
                }

                override fun visitObjectType(objectType: ObjectType) {
                    objectType.validate()
                }

                override fun visitJsonType(jsonType: JsonType) {
                    jsonType.validate()
                }

                override fun visitUnionType(unionType: UnionType) {
                    unionType.validate()
                }

                override fun visitChatCompletionInputType(
                    chatCompletionInputType: ChatCompletionInputType
                ) {
                    chatCompletionInputType.validate()
                }

                override fun visitCompletionInputType(completionInputType: CompletionInputType) {
                    completionInputType.validate()
                }

                override fun visitAgentTurnInputType(agentTurnInputType: AgentTurnInputType) {
                    agentTurnInputType.validate()
                }
            }
        )
        validated = true
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ParamType && stringType == other.stringType && numberType == other.numberType && booleanType == other.booleanType && arrayType == other.arrayType && objectType == other.objectType && jsonType == other.jsonType && unionType == other.unionType && chatCompletionInputType == other.chatCompletionInputType && completionInputType == other.completionInputType && agentTurnInputType == other.agentTurnInputType /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(stringType, numberType, booleanType, arrayType, objectType, jsonType, unionType, chatCompletionInputType, completionInputType, agentTurnInputType) /* spotless:on */

    override fun toString(): String =
        when {
            stringType != null -> "ParamType{stringType=$stringType}"
            numberType != null -> "ParamType{numberType=$numberType}"
            booleanType != null -> "ParamType{booleanType=$booleanType}"
            arrayType != null -> "ParamType{arrayType=$arrayType}"
            objectType != null -> "ParamType{objectType=$objectType}"
            jsonType != null -> "ParamType{jsonType=$jsonType}"
            unionType != null -> "ParamType{unionType=$unionType}"
            chatCompletionInputType != null ->
                "ParamType{chatCompletionInputType=$chatCompletionInputType}"
            completionInputType != null -> "ParamType{completionInputType=$completionInputType}"
            agentTurnInputType != null -> "ParamType{agentTurnInputType=$agentTurnInputType}"
            _json != null -> "ParamType{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid ParamType")
        }

    companion object {

        fun ofStringType(stringType: StringType) = ParamType(stringType = stringType)

        fun ofNumberType(numberType: NumberType) = ParamType(numberType = numberType)

        fun ofBooleanType(booleanType: BooleanType) = ParamType(booleanType = booleanType)

        fun ofArrayType(arrayType: ArrayType) = ParamType(arrayType = arrayType)

        fun ofObjectType(objectType: ObjectType) = ParamType(objectType = objectType)

        fun ofJsonType(jsonType: JsonType) = ParamType(jsonType = jsonType)

        fun ofUnionType(unionType: UnionType) = ParamType(unionType = unionType)

        fun ofChatCompletionInputType(chatCompletionInputType: ChatCompletionInputType) =
            ParamType(chatCompletionInputType = chatCompletionInputType)

        fun ofCompletionInputType(completionInputType: CompletionInputType) =
            ParamType(completionInputType = completionInputType)

        fun ofAgentTurnInputType(agentTurnInputType: AgentTurnInputType) =
            ParamType(agentTurnInputType = agentTurnInputType)
    }

    interface Visitor<out T> {

        fun visitStringType(stringType: StringType): T

        fun visitNumberType(numberType: NumberType): T

        fun visitBooleanType(booleanType: BooleanType): T

        fun visitArrayType(arrayType: ArrayType): T

        fun visitObjectType(objectType: ObjectType): T

        fun visitJsonType(jsonType: JsonType): T

        fun visitUnionType(unionType: UnionType): T

        fun visitChatCompletionInputType(chatCompletionInputType: ChatCompletionInputType): T

        fun visitCompletionInputType(completionInputType: CompletionInputType): T

        fun visitAgentTurnInputType(agentTurnInputType: AgentTurnInputType): T

        fun unknown(json: JsonValue?): T {
            throw LlamaStackClientInvalidDataException("Unknown ParamType: $json")
        }
    }

    class Deserializer : BaseDeserializer<ParamType>(ParamType::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): ParamType {
            val json = JsonValue.fromJsonNode(node)

            tryDeserialize(node, jacksonTypeRef<StringType>()) { it.validate() }
                ?.let {
                    return ParamType(stringType = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<NumberType>()) { it.validate() }
                ?.let {
                    return ParamType(numberType = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<BooleanType>()) { it.validate() }
                ?.let {
                    return ParamType(booleanType = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<ArrayType>()) { it.validate() }
                ?.let {
                    return ParamType(arrayType = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<ObjectType>()) { it.validate() }
                ?.let {
                    return ParamType(objectType = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<JsonType>()) { it.validate() }
                ?.let {
                    return ParamType(jsonType = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<UnionType>()) { it.validate() }
                ?.let {
                    return ParamType(unionType = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<ChatCompletionInputType>()) { it.validate() }
                ?.let {
                    return ParamType(chatCompletionInputType = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<CompletionInputType>()) { it.validate() }
                ?.let {
                    return ParamType(completionInputType = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<AgentTurnInputType>()) { it.validate() }
                ?.let {
                    return ParamType(agentTurnInputType = it, _json = json)
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
                value.stringType != null -> generator.writeObject(value.stringType)
                value.numberType != null -> generator.writeObject(value.numberType)
                value.booleanType != null -> generator.writeObject(value.booleanType)
                value.arrayType != null -> generator.writeObject(value.arrayType)
                value.objectType != null -> generator.writeObject(value.objectType)
                value.jsonType != null -> generator.writeObject(value.jsonType)
                value.unionType != null -> generator.writeObject(value.unionType)
                value.chatCompletionInputType != null ->
                    generator.writeObject(value.chatCompletionInputType)
                value.completionInputType != null ->
                    generator.writeObject(value.completionInputType)
                value.agentTurnInputType != null -> generator.writeObject(value.agentTurnInputType)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid ParamType")
            }
        }
    }

    @NoAutoDetect
    class StringType
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

        fun validate(): StringType = apply {
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

            internal fun from(stringType: StringType) = apply {
                type = stringType.type
                additionalProperties = stringType.additionalProperties.toMutableMap()
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

            fun build(): StringType =
                StringType(checkRequired("type", type), additionalProperties.toImmutable())
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val STRING = of("string")

                fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                STRING,
            }

            enum class Value {
                STRING,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    STRING -> Value.STRING
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    STRING -> Known.STRING
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

            return /* spotless:off */ other is StringType && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "StringType{type=$type, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NumberType
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

        fun validate(): NumberType = apply {
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

            internal fun from(numberType: NumberType) = apply {
                type = numberType.type
                additionalProperties = numberType.additionalProperties.toMutableMap()
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

            fun build(): NumberType =
                NumberType(checkRequired("type", type), additionalProperties.toImmutable())
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val NUMBER = of("number")

                fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                NUMBER,
            }

            enum class Value {
                NUMBER,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    NUMBER -> Value.NUMBER
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    NUMBER -> Known.NUMBER
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

            return /* spotless:off */ other is NumberType && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NumberType{type=$type, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class BooleanType
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

        fun validate(): BooleanType = apply {
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

            internal fun from(booleanType: BooleanType) = apply {
                type = booleanType.type
                additionalProperties = booleanType.additionalProperties.toMutableMap()
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

            fun build(): BooleanType =
                BooleanType(checkRequired("type", type), additionalProperties.toImmutable())
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val BOOLEAN = of("boolean")

                fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                BOOLEAN,
            }

            enum class Value {
                BOOLEAN,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    BOOLEAN -> Value.BOOLEAN
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    BOOLEAN -> Known.BOOLEAN
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

            return /* spotless:off */ other is BooleanType && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BooleanType{type=$type, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class ArrayType
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

        fun validate(): ArrayType = apply {
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

            internal fun from(arrayType: ArrayType) = apply {
                type = arrayType.type
                additionalProperties = arrayType.additionalProperties.toMutableMap()
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

            fun build(): ArrayType =
                ArrayType(checkRequired("type", type), additionalProperties.toImmutable())
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ARRAY = of("array")

                fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                ARRAY,
            }

            enum class Value {
                ARRAY,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ARRAY -> Value.ARRAY
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ARRAY -> Known.ARRAY
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

            return /* spotless:off */ other is ArrayType && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ArrayType{type=$type, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class ObjectType
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

        fun validate(): ObjectType = apply {
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

            internal fun from(objectType: ObjectType) = apply {
                type = objectType.type
                additionalProperties = objectType.additionalProperties.toMutableMap()
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

            fun build(): ObjectType =
                ObjectType(checkRequired("type", type), additionalProperties.toImmutable())
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val OBJECT = of("object")

                fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                OBJECT,
            }

            enum class Value {
                OBJECT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    OBJECT -> Value.OBJECT
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    OBJECT -> Known.OBJECT
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

            return /* spotless:off */ other is ObjectType && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ObjectType{type=$type, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class JsonType
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

        fun validate(): JsonType = apply {
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

            internal fun from(jsonType: JsonType) = apply {
                type = jsonType.type
                additionalProperties = jsonType.additionalProperties.toMutableMap()
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

            fun build(): JsonType =
                JsonType(checkRequired("type", type), additionalProperties.toImmutable())
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val JSON = of("json")

                fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                JSON,
            }

            enum class Value {
                JSON,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    JSON -> Value.JSON
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    JSON -> Known.JSON
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

            return /* spotless:off */ other is JsonType && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "JsonType{type=$type, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class UnionType
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

        fun validate(): UnionType = apply {
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

            internal fun from(unionType: UnionType) = apply {
                type = unionType.type
                additionalProperties = unionType.additionalProperties.toMutableMap()
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

            fun build(): UnionType =
                UnionType(checkRequired("type", type), additionalProperties.toImmutable())
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val UNION = of("union")

                fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                UNION,
            }

            enum class Value {
                UNION,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    UNION -> Value.UNION
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    UNION -> Known.UNION
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

            return /* spotless:off */ other is UnionType && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UnionType{type=$type, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class ChatCompletionInputType
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

        fun validate(): ChatCompletionInputType = apply {
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

            internal fun from(chatCompletionInputType: ChatCompletionInputType) = apply {
                type = chatCompletionInputType.type
                additionalProperties = chatCompletionInputType.additionalProperties.toMutableMap()
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

            fun build(): ChatCompletionInputType =
                ChatCompletionInputType(
                    checkRequired("type", type),
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

                val CHAT_COMPLETION_INPUT = of("chat_completion_input")

                fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                CHAT_COMPLETION_INPUT,
            }

            enum class Value {
                CHAT_COMPLETION_INPUT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    CHAT_COMPLETION_INPUT -> Value.CHAT_COMPLETION_INPUT
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    CHAT_COMPLETION_INPUT -> Known.CHAT_COMPLETION_INPUT
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

            return /* spotless:off */ other is ChatCompletionInputType && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ChatCompletionInputType{type=$type, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class CompletionInputType
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

        fun validate(): CompletionInputType = apply {
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

            internal fun from(completionInputType: CompletionInputType) = apply {
                type = completionInputType.type
                additionalProperties = completionInputType.additionalProperties.toMutableMap()
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

            fun build(): CompletionInputType =
                CompletionInputType(checkRequired("type", type), additionalProperties.toImmutable())
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val COMPLETION_INPUT = of("completion_input")

                fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                COMPLETION_INPUT,
            }

            enum class Value {
                COMPLETION_INPUT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    COMPLETION_INPUT -> Value.COMPLETION_INPUT
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    COMPLETION_INPUT -> Known.COMPLETION_INPUT
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

            return /* spotless:off */ other is CompletionInputType && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CompletionInputType{type=$type, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class AgentTurnInputType
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

        fun validate(): AgentTurnInputType = apply {
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

            internal fun from(agentTurnInputType: AgentTurnInputType) = apply {
                type = agentTurnInputType.type
                additionalProperties = agentTurnInputType.additionalProperties.toMutableMap()
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

            fun build(): AgentTurnInputType =
                AgentTurnInputType(checkRequired("type", type), additionalProperties.toImmutable())
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val AGENT_TURN_INPUT = of("agent_turn_input")

                fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                AGENT_TURN_INPUT,
            }

            enum class Value {
                AGENT_TURN_INPUT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    AGENT_TURN_INPUT -> Value.AGENT_TURN_INPUT
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
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

            return /* spotless:off */ other is AgentTurnInputType && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AgentTurnInputType{type=$type, additionalProperties=$additionalProperties}"
    }
}
