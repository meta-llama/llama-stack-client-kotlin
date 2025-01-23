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
            val type = json.asObject()?.get("type")?.asString()

            when (type) {
                "string" -> {
                    tryDeserialize(node, jacksonTypeRef<StringType>()) { it.validate() }
                        ?.let {
                            return ParamType(stringType = it, _json = json)
                        }
                }
                "number" -> {
                    tryDeserialize(node, jacksonTypeRef<NumberType>()) { it.validate() }
                        ?.let {
                            return ParamType(numberType = it, _json = json)
                        }
                }
                "boolean" -> {
                    tryDeserialize(node, jacksonTypeRef<BooleanType>()) { it.validate() }
                        ?.let {
                            return ParamType(booleanType = it, _json = json)
                        }
                }
                "array" -> {
                    tryDeserialize(node, jacksonTypeRef<ArrayType>()) { it.validate() }
                        ?.let {
                            return ParamType(arrayType = it, _json = json)
                        }
                }
                "object" -> {
                    tryDeserialize(node, jacksonTypeRef<ObjectType>()) { it.validate() }
                        ?.let {
                            return ParamType(objectType = it, _json = json)
                        }
                }
                "json" -> {
                    tryDeserialize(node, jacksonTypeRef<JsonType>()) { it.validate() }
                        ?.let {
                            return ParamType(jsonType = it, _json = json)
                        }
                }
                "union" -> {
                    tryDeserialize(node, jacksonTypeRef<UnionType>()) { it.validate() }
                        ?.let {
                            return ParamType(unionType = it, _json = json)
                        }
                }
                "chat_completion_input" -> {
                    tryDeserialize(node, jacksonTypeRef<ChatCompletionInputType>()) {
                            it.validate()
                        }
                        ?.let {
                            return ParamType(chatCompletionInputType = it, _json = json)
                        }
                }
                "completion_input" -> {
                    tryDeserialize(node, jacksonTypeRef<CompletionInputType>()) { it.validate() }
                        ?.let {
                            return ParamType(completionInputType = it, _json = json)
                        }
                }
                "agent_turn_input" -> {
                    tryDeserialize(node, jacksonTypeRef<AgentTurnInputType>()) { it.validate() }
                        ?.let {
                            return ParamType(agentTurnInputType = it, _json = json)
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
}
