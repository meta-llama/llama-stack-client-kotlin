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
    private val string: String? = null,
    private val number: Number? = null,
    private val boolean: Boolean? = null,
    private val array: Array? = null,
    private val object_: Object? = null,
    private val json: Json? = null,
    private val union: Union? = null,
    private val chatCompletionInput: ChatCompletionInput? = null,
    private val completionInput: CompletionInput? = null,
    private val agentTurnInput: AgentTurnInput? = null,
    private val _json: JsonValue? = null,
) {

    fun string(): String? = string

    fun number(): Number? = number

    fun boolean(): Boolean? = boolean

    fun array(): Array? = array

    fun object_(): Object? = object_

    fun json(): Json? = json

    fun union(): Union? = union

    fun chatCompletionInput(): ChatCompletionInput? = chatCompletionInput

    fun completionInput(): CompletionInput? = completionInput

    fun agentTurnInput(): AgentTurnInput? = agentTurnInput

    fun isString(): Boolean = string != null

    fun isNumber(): Boolean = number != null

    fun isBoolean(): Boolean = boolean != null

    fun isArray(): Boolean = array != null

    fun isObject(): Boolean = object_ != null

    fun isJson(): Boolean = json != null

    fun isUnion(): Boolean = union != null

    fun isChatCompletionInput(): Boolean = chatCompletionInput != null

    fun isCompletionInput(): Boolean = completionInput != null

    fun isAgentTurnInput(): Boolean = agentTurnInput != null

    fun asString(): String = string.getOrThrow("string")

    fun asNumber(): Number = number.getOrThrow("number")

    fun asBoolean(): Boolean = boolean.getOrThrow("boolean")

    fun asArray(): Array = array.getOrThrow("array")

    fun asObject(): Object = object_.getOrThrow("object_")

    fun asJson(): Json = json.getOrThrow("json")

    fun asUnion(): Union = union.getOrThrow("union")

    fun asChatCompletionInput(): ChatCompletionInput =
        chatCompletionInput.getOrThrow("chatCompletionInput")

    fun asCompletionInput(): CompletionInput = completionInput.getOrThrow("completionInput")

    fun asAgentTurnInput(): AgentTurnInput = agentTurnInput.getOrThrow("agentTurnInput")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            string != null -> visitor.visitString(string)
            number != null -> visitor.visitNumber(number)
            boolean != null -> visitor.visitBoolean(boolean)
            array != null -> visitor.visitArray(array)
            object_ != null -> visitor.visitObject(object_)
            json != null -> visitor.visitJson(json)
            union != null -> visitor.visitUnion(union)
            chatCompletionInput != null -> visitor.visitChatCompletionInput(chatCompletionInput)
            completionInput != null -> visitor.visitCompletionInput(completionInput)
            agentTurnInput != null -> visitor.visitAgentTurnInput(agentTurnInput)
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
                override fun visitString(string: String) {
                    string.validate()
                }

                override fun visitNumber(number: Number) {
                    number.validate()
                }

                override fun visitBoolean(boolean: Boolean) {
                    boolean.validate()
                }

                override fun visitArray(array: Array) {
                    array.validate()
                }

                override fun visitObject(object_: Object) {
                    object_.validate()
                }

                override fun visitJson(json: Json) {
                    json.validate()
                }

                override fun visitUnion(union: Union) {
                    union.validate()
                }

                override fun visitChatCompletionInput(chatCompletionInput: ChatCompletionInput) {
                    chatCompletionInput.validate()
                }

                override fun visitCompletionInput(completionInput: CompletionInput) {
                    completionInput.validate()
                }

                override fun visitAgentTurnInput(agentTurnInput: AgentTurnInput) {
                    agentTurnInput.validate()
                }
            }
        )
        validated = true
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ParamType && string == other.string && number == other.number && boolean == other.boolean && array == other.array && object_ == other.object_ && json == other.json && union == other.union && chatCompletionInput == other.chatCompletionInput && completionInput == other.completionInput && agentTurnInput == other.agentTurnInput /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, number, boolean, array, object_, json, union, chatCompletionInput, completionInput, agentTurnInput) /* spotless:on */

    override fun toString(): String =
        when {
            string != null -> "ParamType{string=$string}"
            number != null -> "ParamType{number=$number}"
            boolean != null -> "ParamType{boolean=$boolean}"
            array != null -> "ParamType{array=$array}"
            object_ != null -> "ParamType{object_=$object_}"
            json != null -> "ParamType{json=$json}"
            union != null -> "ParamType{union=$union}"
            chatCompletionInput != null -> "ParamType{chatCompletionInput=$chatCompletionInput}"
            completionInput != null -> "ParamType{completionInput=$completionInput}"
            agentTurnInput != null -> "ParamType{agentTurnInput=$agentTurnInput}"
            _json != null -> "ParamType{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid ParamType")
        }

    companion object {

        fun ofString(string: String) = ParamType(string = string)

        fun ofNumber(number: Number) = ParamType(number = number)

        fun ofBoolean(boolean: Boolean) = ParamType(boolean = boolean)

        fun ofArray(array: Array) = ParamType(array = array)

        fun ofObject(object_: Object) = ParamType(object_ = object_)

        fun ofJson(json: Json) = ParamType(json = json)

        fun ofUnion(union: Union) = ParamType(union = union)

        fun ofChatCompletionInput(chatCompletionInput: ChatCompletionInput) =
            ParamType(chatCompletionInput = chatCompletionInput)

        fun ofCompletionInput(completionInput: CompletionInput) =
            ParamType(completionInput = completionInput)

        fun ofAgentTurnInput(agentTurnInput: AgentTurnInput) =
            ParamType(agentTurnInput = agentTurnInput)
    }

    interface Visitor<out T> {

        fun visitString(string: String): T

        fun visitNumber(number: Number): T

        fun visitBoolean(boolean: Boolean): T

        fun visitArray(array: Array): T

        fun visitObject(object_: Object): T

        fun visitJson(json: Json): T

        fun visitUnion(union: Union): T

        fun visitChatCompletionInput(chatCompletionInput: ChatCompletionInput): T

        fun visitCompletionInput(completionInput: CompletionInput): T

        fun visitAgentTurnInput(agentTurnInput: AgentTurnInput): T

        fun unknown(json: JsonValue?): T {
            throw LlamaStackClientInvalidDataException("Unknown ParamType: $json")
        }
    }

    class Deserializer : BaseDeserializer<ParamType>(ParamType::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): ParamType {
            val json = JsonValue.fromJsonNode(node)
            val type = json.asObject()?.get("type")?.asString()

            when (type) {
                "string" -> {
                    tryDeserialize(node, jacksonTypeRef<String>()) { it.validate() }
                        ?.let {
                            return ParamType(string = it, _json = json)
                        }
                }
                "number" -> {
                    tryDeserialize(node, jacksonTypeRef<Number>()) { it.validate() }
                        ?.let {
                            return ParamType(number = it, _json = json)
                        }
                }
                "boolean" -> {
                    tryDeserialize(node, jacksonTypeRef<Boolean>()) { it.validate() }
                        ?.let {
                            return ParamType(boolean = it, _json = json)
                        }
                }
                "array" -> {
                    tryDeserialize(node, jacksonTypeRef<Array>()) { it.validate() }
                        ?.let {
                            return ParamType(array = it, _json = json)
                        }
                }
                "object" -> {
                    tryDeserialize(node, jacksonTypeRef<Object>()) { it.validate() }
                        ?.let {
                            return ParamType(object_ = it, _json = json)
                        }
                }
                "json" -> {
                    tryDeserialize(node, jacksonTypeRef<Json>()) { it.validate() }
                        ?.let {
                            return ParamType(json = it, _json = json)
                        }
                }
                "union" -> {
                    tryDeserialize(node, jacksonTypeRef<Union>()) { it.validate() }
                        ?.let {
                            return ParamType(union = it, _json = json)
                        }
                }
                "chat_completion_input" -> {
                    tryDeserialize(node, jacksonTypeRef<ChatCompletionInput>()) { it.validate() }
                        ?.let {
                            return ParamType(chatCompletionInput = it, _json = json)
                        }
                }
                "completion_input" -> {
                    tryDeserialize(node, jacksonTypeRef<CompletionInput>()) { it.validate() }
                        ?.let {
                            return ParamType(completionInput = it, _json = json)
                        }
                }
                "agent_turn_input" -> {
                    tryDeserialize(node, jacksonTypeRef<AgentTurnInput>()) { it.validate() }
                        ?.let {
                            return ParamType(agentTurnInput = it, _json = json)
                        }
                }
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
                value.string != null -> generator.writeObject(value.string)
                value.number != null -> generator.writeObject(value.number)
                value.boolean != null -> generator.writeObject(value.boolean)
                value.array != null -> generator.writeObject(value.array)
                value.object_ != null -> generator.writeObject(value.object_)
                value.json != null -> generator.writeObject(value.json)
                value.union != null -> generator.writeObject(value.union)
                value.chatCompletionInput != null ->
                    generator.writeObject(value.chatCompletionInput)
                value.completionInput != null -> generator.writeObject(value.completionInput)
                value.agentTurnInput != null -> generator.writeObject(value.agentTurnInput)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid ParamType")
            }
        }
    }

    @NoAutoDetect
    class String
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

        fun validate(): String = apply {
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

            internal fun from(string: String) = apply {
                type = string.type
                additionalProperties = string.additionalProperties.toMutableMap()
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

            fun build(): String =
                String(checkRequired("type", type), additionalProperties.toImmutable())
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

            return /* spotless:off */ other is String && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "String{type=$type, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Number
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

        fun validate(): Number = apply {
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

            internal fun from(number: Number) = apply {
                type = number.type
                additionalProperties = number.additionalProperties.toMutableMap()
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

            fun build(): Number =
                Number(checkRequired("type", type), additionalProperties.toImmutable())
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

            return /* spotless:off */ other is Number && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Number{type=$type, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Boolean
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

        fun validate(): Boolean = apply {
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

            internal fun from(boolean: Boolean) = apply {
                type = boolean.type
                additionalProperties = boolean.additionalProperties.toMutableMap()
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

            fun build(): Boolean =
                Boolean(checkRequired("type", type), additionalProperties.toImmutable())
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

            return /* spotless:off */ other is Boolean && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Boolean{type=$type, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Array
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

        fun validate(): Array = apply {
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

            internal fun from(array: Array) = apply {
                type = array.type
                additionalProperties = array.additionalProperties.toMutableMap()
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

            fun build(): Array =
                Array(checkRequired("type", type), additionalProperties.toImmutable())
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

            return /* spotless:off */ other is Array && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Array{type=$type, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Object
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

        fun validate(): Object = apply {
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

            internal fun from(object_: Object) = apply {
                type = object_.type
                additionalProperties = object_.additionalProperties.toMutableMap()
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

            fun build(): Object =
                Object(checkRequired("type", type), additionalProperties.toImmutable())
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

            return /* spotless:off */ other is Object && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Object{type=$type, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Json
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

        fun validate(): Json = apply {
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

            internal fun from(json: Json) = apply {
                type = json.type
                additionalProperties = json.additionalProperties.toMutableMap()
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

            fun build(): Json =
                Json(checkRequired("type", type), additionalProperties.toImmutable())
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

            return /* spotless:off */ other is Json && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Json{type=$type, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Union
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

        fun validate(): Union = apply {
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

            internal fun from(union: Union) = apply {
                type = union.type
                additionalProperties = union.additionalProperties.toMutableMap()
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

            fun build(): Union =
                Union(checkRequired("type", type), additionalProperties.toImmutable())
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

            return /* spotless:off */ other is Union && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Union{type=$type, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class ChatCompletionInput
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

        fun validate(): ChatCompletionInput = apply {
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

            internal fun from(chatCompletionInput: ChatCompletionInput) = apply {
                type = chatCompletionInput.type
                additionalProperties = chatCompletionInput.additionalProperties.toMutableMap()
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

            fun build(): ChatCompletionInput =
                ChatCompletionInput(checkRequired("type", type), additionalProperties.toImmutable())
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

            return /* spotless:off */ other is ChatCompletionInput && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ChatCompletionInput{type=$type, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class CompletionInput
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

        fun validate(): CompletionInput = apply {
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

            internal fun from(completionInput: CompletionInput) = apply {
                type = completionInput.type
                additionalProperties = completionInput.additionalProperties.toMutableMap()
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

            fun build(): CompletionInput =
                CompletionInput(checkRequired("type", type), additionalProperties.toImmutable())
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

            return /* spotless:off */ other is CompletionInput && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CompletionInput{type=$type, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class AgentTurnInput
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

        fun validate(): AgentTurnInput = apply {
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

            internal fun from(agentTurnInput: AgentTurnInput) = apply {
                type = agentTurnInput.type
                additionalProperties = agentTurnInput.additionalProperties.toMutableMap()
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

            fun build(): AgentTurnInput =
                AgentTurnInput(checkRequired("type", type), additionalProperties.toImmutable())
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

            return /* spotless:off */ other is AgentTurnInput && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AgentTurnInput{type=$type, additionalProperties=$additionalProperties}"
    }
}
