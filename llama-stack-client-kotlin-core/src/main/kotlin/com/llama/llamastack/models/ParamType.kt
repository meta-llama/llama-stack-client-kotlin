// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.BaseDeserializer
import com.llama.llamastack.core.BaseSerializer
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

@JsonDeserialize(using = ParamType.Deserializer::class)
@JsonSerialize(using = ParamType.Serializer::class)
class ParamType
private constructor(
    private val string: JsonValue? = null,
    private val number: JsonValue? = null,
    private val boolean: JsonValue? = null,
    private val array: JsonValue? = null,
    private val objectType: JsonValue? = null,
    private val json: JsonValue? = null,
    private val union: JsonValue? = null,
    private val chatCompletionInput: JsonValue? = null,
    private val completionInput: JsonValue? = null,
    private val agentTurnInput: JsonValue? = null,
    private val _json: JsonValue? = null,
) {

    fun string(): JsonValue? = string

    fun number(): JsonValue? = number

    fun boolean(): JsonValue? = boolean

    fun array(): JsonValue? = array

    fun objectType(): JsonValue? = objectType

    fun json(): JsonValue? = json

    fun union(): JsonValue? = union

    fun chatCompletionInput(): JsonValue? = chatCompletionInput

    fun completionInput(): JsonValue? = completionInput

    fun agentTurnInput(): JsonValue? = agentTurnInput

    fun isString(): Boolean = string != null

    fun isNumber(): Boolean = number != null

    fun isBoolean(): Boolean = boolean != null

    fun isArray(): Boolean = array != null

    fun isObjectType(): Boolean = objectType != null

    fun isJson(): Boolean = json != null

    fun isUnion(): Boolean = union != null

    fun isChatCompletionInput(): Boolean = chatCompletionInput != null

    fun isCompletionInput(): Boolean = completionInput != null

    fun isAgentTurnInput(): Boolean = agentTurnInput != null

    fun asString(): JsonValue = string.getOrThrow("string")

    fun asNumber(): JsonValue = number.getOrThrow("number")

    fun asBoolean(): JsonValue = boolean.getOrThrow("boolean")

    fun asArray(): JsonValue = array.getOrThrow("array")

    fun asObjectType(): JsonValue = objectType.getOrThrow("objectType")

    fun asJson(): JsonValue = json.getOrThrow("json")

    fun asUnion(): JsonValue = union.getOrThrow("union")

    fun asChatCompletionInput(): JsonValue = chatCompletionInput.getOrThrow("chatCompletionInput")

    fun asCompletionInput(): JsonValue = completionInput.getOrThrow("completionInput")

    fun asAgentTurnInput(): JsonValue = agentTurnInput.getOrThrow("agentTurnInput")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            string != null -> visitor.visitString(string)
            number != null -> visitor.visitNumber(number)
            boolean != null -> visitor.visitBoolean(boolean)
            array != null -> visitor.visitArray(array)
            objectType != null -> visitor.visitObjectType(objectType)
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
                override fun visitString(string: JsonValue) {
                    string.let {
                        if (it != JsonValue.from(mapOf("type" to "string"))) {
                            throw LlamaStackClientInvalidDataException(
                                "'string' is invalid, received $it"
                            )
                        }
                    }
                }

                override fun visitNumber(number: JsonValue) {
                    number.let {
                        if (it != JsonValue.from(mapOf("type" to "number"))) {
                            throw LlamaStackClientInvalidDataException(
                                "'number' is invalid, received $it"
                            )
                        }
                    }
                }

                override fun visitBoolean(boolean: JsonValue) {
                    boolean.let {
                        if (it != JsonValue.from(mapOf("type" to "boolean"))) {
                            throw LlamaStackClientInvalidDataException(
                                "'boolean' is invalid, received $it"
                            )
                        }
                    }
                }

                override fun visitArray(array: JsonValue) {
                    array.let {
                        if (it != JsonValue.from(mapOf("type" to "array"))) {
                            throw LlamaStackClientInvalidDataException(
                                "'array' is invalid, received $it"
                            )
                        }
                    }
                }

                override fun visitObjectType(objectType: JsonValue) {
                    objectType.let {
                        if (it != JsonValue.from(mapOf("type" to "object"))) {
                            throw LlamaStackClientInvalidDataException(
                                "'objectType' is invalid, received $it"
                            )
                        }
                    }
                }

                override fun visitJson(json: JsonValue) {
                    json.let {
                        if (it != JsonValue.from(mapOf("type" to "json"))) {
                            throw LlamaStackClientInvalidDataException(
                                "'json' is invalid, received $it"
                            )
                        }
                    }
                }

                override fun visitUnion(union: JsonValue) {
                    union.let {
                        if (it != JsonValue.from(mapOf("type" to "union"))) {
                            throw LlamaStackClientInvalidDataException(
                                "'union' is invalid, received $it"
                            )
                        }
                    }
                }

                override fun visitChatCompletionInput(chatCompletionInput: JsonValue) {
                    chatCompletionInput.let {
                        if (it != JsonValue.from(mapOf("type" to "chat_completion_input"))) {
                            throw LlamaStackClientInvalidDataException(
                                "'chatCompletionInput' is invalid, received $it"
                            )
                        }
                    }
                }

                override fun visitCompletionInput(completionInput: JsonValue) {
                    completionInput.let {
                        if (it != JsonValue.from(mapOf("type" to "completion_input"))) {
                            throw LlamaStackClientInvalidDataException(
                                "'completionInput' is invalid, received $it"
                            )
                        }
                    }
                }

                override fun visitAgentTurnInput(agentTurnInput: JsonValue) {
                    agentTurnInput.let {
                        if (it != JsonValue.from(mapOf("type" to "agent_turn_input"))) {
                            throw LlamaStackClientInvalidDataException(
                                "'agentTurnInput' is invalid, received $it"
                            )
                        }
                    }
                }
            }
        )
        validated = true
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ParamType && string == other.string && number == other.number && boolean == other.boolean && array == other.array && objectType == other.objectType && json == other.json && union == other.union && chatCompletionInput == other.chatCompletionInput && completionInput == other.completionInput && agentTurnInput == other.agentTurnInput /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, number, boolean, array, objectType, json, union, chatCompletionInput, completionInput, agentTurnInput) /* spotless:on */

    override fun toString(): String =
        when {
            string != null -> "ParamType{string=$string}"
            number != null -> "ParamType{number=$number}"
            boolean != null -> "ParamType{boolean=$boolean}"
            array != null -> "ParamType{array=$array}"
            objectType != null -> "ParamType{objectType=$objectType}"
            json != null -> "ParamType{json=$json}"
            union != null -> "ParamType{union=$union}"
            chatCompletionInput != null -> "ParamType{chatCompletionInput=$chatCompletionInput}"
            completionInput != null -> "ParamType{completionInput=$completionInput}"
            agentTurnInput != null -> "ParamType{agentTurnInput=$agentTurnInput}"
            _json != null -> "ParamType{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid ParamType")
        }

    companion object {

        fun ofString() = ParamType(string = JsonValue.from(mapOf("type" to "string")))

        fun ofNumber() = ParamType(number = JsonValue.from(mapOf("type" to "number")))

        fun ofBoolean() = ParamType(boolean = JsonValue.from(mapOf("type" to "boolean")))

        fun ofArray() = ParamType(array = JsonValue.from(mapOf("type" to "array")))

        fun ofObjectType() = ParamType(objectType = JsonValue.from(mapOf("type" to "object")))

        fun ofJson() = ParamType(json = JsonValue.from(mapOf("type" to "json")))

        fun ofUnion() = ParamType(union = JsonValue.from(mapOf("type" to "union")))

        fun ofChatCompletionInput() =
            ParamType(
                chatCompletionInput = JsonValue.from(mapOf("type" to "chat_completion_input"))
            )

        fun ofCompletionInput() =
            ParamType(completionInput = JsonValue.from(mapOf("type" to "completion_input")))

        fun ofAgentTurnInput() =
            ParamType(agentTurnInput = JsonValue.from(mapOf("type" to "agent_turn_input")))
    }

    interface Visitor<out T> {

        fun visitString(string: JsonValue): T

        fun visitNumber(number: JsonValue): T

        fun visitBoolean(boolean: JsonValue): T

        fun visitArray(array: JsonValue): T

        fun visitObjectType(objectType: JsonValue): T

        fun visitJson(json: JsonValue): T

        fun visitUnion(union: JsonValue): T

        fun visitChatCompletionInput(chatCompletionInput: JsonValue): T

        fun visitCompletionInput(completionInput: JsonValue): T

        fun visitAgentTurnInput(agentTurnInput: JsonValue): T

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
                    tryDeserialize(node, jacksonTypeRef<JsonValue>()) {
                            it.let {
                                if (it != JsonValue.from(mapOf("type" to "string"))) {
                                    throw LlamaStackClientInvalidDataException(
                                        "'string' is invalid, received $it"
                                    )
                                }
                            }
                        }
                        ?.let {
                            return ParamType(string = it, _json = json)
                        }
                }
                "number" -> {
                    tryDeserialize(node, jacksonTypeRef<JsonValue>()) {
                            it.let {
                                if (it != JsonValue.from(mapOf("type" to "number"))) {
                                    throw LlamaStackClientInvalidDataException(
                                        "'number' is invalid, received $it"
                                    )
                                }
                            }
                        }
                        ?.let {
                            return ParamType(number = it, _json = json)
                        }
                }
                "boolean" -> {
                    tryDeserialize(node, jacksonTypeRef<JsonValue>()) {
                            it.let {
                                if (it != JsonValue.from(mapOf("type" to "boolean"))) {
                                    throw LlamaStackClientInvalidDataException(
                                        "'boolean' is invalid, received $it"
                                    )
                                }
                            }
                        }
                        ?.let {
                            return ParamType(boolean = it, _json = json)
                        }
                }
                "array" -> {
                    tryDeserialize(node, jacksonTypeRef<JsonValue>()) {
                            it.let {
                                if (it != JsonValue.from(mapOf("type" to "array"))) {
                                    throw LlamaStackClientInvalidDataException(
                                        "'array' is invalid, received $it"
                                    )
                                }
                            }
                        }
                        ?.let {
                            return ParamType(array = it, _json = json)
                        }
                }
                "object" -> {
                    tryDeserialize(node, jacksonTypeRef<JsonValue>()) {
                            it.let {
                                if (it != JsonValue.from(mapOf("type" to "object"))) {
                                    throw LlamaStackClientInvalidDataException(
                                        "'objectType' is invalid, received $it"
                                    )
                                }
                            }
                        }
                        ?.let {
                            return ParamType(objectType = it, _json = json)
                        }
                }
                "json" -> {
                    tryDeserialize(node, jacksonTypeRef<JsonValue>()) {
                            it.let {
                                if (it != JsonValue.from(mapOf("type" to "json"))) {
                                    throw LlamaStackClientInvalidDataException(
                                        "'json' is invalid, received $it"
                                    )
                                }
                            }
                        }
                        ?.let {
                            return ParamType(json = it, _json = json)
                        }
                }
                "union" -> {
                    tryDeserialize(node, jacksonTypeRef<JsonValue>()) {
                            it.let {
                                if (it != JsonValue.from(mapOf("type" to "union"))) {
                                    throw LlamaStackClientInvalidDataException(
                                        "'union' is invalid, received $it"
                                    )
                                }
                            }
                        }
                        ?.let {
                            return ParamType(union = it, _json = json)
                        }
                }
                "chat_completion_input" -> {
                    tryDeserialize(node, jacksonTypeRef<JsonValue>()) {
                            it.let {
                                if (
                                    it != JsonValue.from(mapOf("type" to "chat_completion_input"))
                                ) {
                                    throw LlamaStackClientInvalidDataException(
                                        "'chatCompletionInput' is invalid, received $it"
                                    )
                                }
                            }
                        }
                        ?.let {
                            return ParamType(chatCompletionInput = it, _json = json)
                        }
                }
                "completion_input" -> {
                    tryDeserialize(node, jacksonTypeRef<JsonValue>()) {
                            it.let {
                                if (it != JsonValue.from(mapOf("type" to "completion_input"))) {
                                    throw LlamaStackClientInvalidDataException(
                                        "'completionInput' is invalid, received $it"
                                    )
                                }
                            }
                        }
                        ?.let {
                            return ParamType(completionInput = it, _json = json)
                        }
                }
                "agent_turn_input" -> {
                    tryDeserialize(node, jacksonTypeRef<JsonValue>()) {
                            it.let {
                                if (it != JsonValue.from(mapOf("type" to "agent_turn_input"))) {
                                    throw LlamaStackClientInvalidDataException(
                                        "'agentTurnInput' is invalid, received $it"
                                    )
                                }
                            }
                        }
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
                value.objectType != null -> generator.writeObject(value.objectType)
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
}
