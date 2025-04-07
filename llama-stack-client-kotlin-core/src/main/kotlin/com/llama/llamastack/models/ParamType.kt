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
private constructor(private val object_: JsonValue? = null, private val _json: JsonValue? = null) {

    fun object_(): JsonValue? = object_

    fun isObject(): Boolean = object_ != null

    fun asObject(): JsonValue = object_.getOrThrow("object_")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            object_ != null -> visitor.visitObject(object_)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): ParamType = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitObject(object_: JsonValue) {
                    object_.let {
                        if (it != JsonValue.from(mapOf("type" to "string"))) {
                            throw LlamaStackClientInvalidDataException(
                                "'object_' is invalid, received $it"
                            )
                        }
                    }
                }
            }
        )
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LlamaStackClientInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitObject(object_: JsonValue) =
                    object_.let { if (it == JsonValue.from(mapOf("type" to "string"))) 1 else 0 }

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ParamType && object_ == other.object_ && object_ == other.object_ && object_ == other.object_ && object_ == other.object_ && object_ == other.object_ && object_ == other.object_ && object_ == other.object_ && object_ == other.object_ && object_ == other.object_ && object_ == other.object_ /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(object_, object_, object_, object_, object_, object_, object_, object_, object_, object_) /* spotless:on */

    override fun toString(): String =
        when {
            object_ != null -> "ParamType{object_=$object_}"
            _json != null -> "ParamType{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid ParamType")
        }

    companion object {

        fun ofObject() = ParamType(object_ = JsonValue.from(mapOf("type" to "string")))
    }

    /** An interface that defines how to map each variant of [ParamType] to a value of type [T]. */
    interface Visitor<out T> {

        fun visitObject(object_: JsonValue): T

        /**
         * Maps an unknown variant of [ParamType] to a value of type [T].
         *
         * An instance of [ParamType] can contain an unknown variant if it was deserialized from
         * data that doesn't match any known variant. For example, if the SDK is on an older version
         * than the API, then the API may respond with new variants that the SDK is unaware of.
         *
         * @throws LlamaStackClientInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LlamaStackClientInvalidDataException("Unknown ParamType: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<ParamType>(ParamType::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): ParamType {
            val json = JsonValue.fromJsonNode(node)
            val type = json.asObject()?.get("type")?.asString()

            when (type) {
                "string" -> {
                    return tryDeserialize(node, jacksonTypeRef<JsonValue>())
                        ?.let { ParamType(object_ = it, _json = json) }
                        ?.takeIf { it.isValid() } ?: ParamType(_json = json)
                }
                "number" -> {
                    return tryDeserialize(node, jacksonTypeRef<JsonValue>())
                        ?.let { ParamType(object_ = it, _json = json) }
                        ?.takeIf { it.isValid() } ?: ParamType(_json = json)
                }
                "boolean" -> {
                    return tryDeserialize(node, jacksonTypeRef<JsonValue>())
                        ?.let { ParamType(object_ = it, _json = json) }
                        ?.takeIf { it.isValid() } ?: ParamType(_json = json)
                }
                "array" -> {
                    return tryDeserialize(node, jacksonTypeRef<JsonValue>())
                        ?.let { ParamType(object_ = it, _json = json) }
                        ?.takeIf { it.isValid() } ?: ParamType(_json = json)
                }
                "object" -> {
                    return tryDeserialize(node, jacksonTypeRef<JsonValue>())
                        ?.let { ParamType(object_ = it, _json = json) }
                        ?.takeIf { it.isValid() } ?: ParamType(_json = json)
                }
                "json" -> {
                    return tryDeserialize(node, jacksonTypeRef<JsonValue>())
                        ?.let { ParamType(object_ = it, _json = json) }
                        ?.takeIf { it.isValid() } ?: ParamType(_json = json)
                }
                "union" -> {
                    return tryDeserialize(node, jacksonTypeRef<JsonValue>())
                        ?.let { ParamType(object_ = it, _json = json) }
                        ?.takeIf { it.isValid() } ?: ParamType(_json = json)
                }
                "chat_completion_input" -> {
                    return tryDeserialize(node, jacksonTypeRef<JsonValue>())
                        ?.let { ParamType(object_ = it, _json = json) }
                        ?.takeIf { it.isValid() } ?: ParamType(_json = json)
                }
                "completion_input" -> {
                    return tryDeserialize(node, jacksonTypeRef<JsonValue>())
                        ?.let { ParamType(object_ = it, _json = json) }
                        ?.takeIf { it.isValid() } ?: ParamType(_json = json)
                }
                "agent_turn_input" -> {
                    return tryDeserialize(node, jacksonTypeRef<JsonValue>())
                        ?.let { ParamType(object_ = it, _json = json) }
                        ?.takeIf { it.isValid() } ?: ParamType(_json = json)
                }
            }

            return ParamType(_json = json)
        }
    }

    internal class Serializer : BaseSerializer<ParamType>(ParamType::class) {

        override fun serialize(
            value: ParamType,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.object_ != null -> generator.writeObject(value.object_)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid ParamType")
            }
        }
    }
}
