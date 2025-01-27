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

@JsonDeserialize(using = AgentTurnCreateResponse.Deserializer::class)
@JsonSerialize(using = AgentTurnCreateResponse.Serializer::class)
class AgentTurnCreateResponse
private constructor(
    private val turn: Turn? = null,
    private val responseStreamChunk: AgentTurnResponseStreamChunk? = null,
    private val _json: JsonValue? = null,
) {

    fun turn(): Turn? = turn

    fun responseStreamChunk(): AgentTurnResponseStreamChunk? = responseStreamChunk

    fun isTurn(): Boolean = turn != null

    fun isResponseStreamChunk(): Boolean = responseStreamChunk != null

    fun asTurn(): Turn = turn.getOrThrow("turn")

    fun asResponseStreamChunk(): AgentTurnResponseStreamChunk =
        responseStreamChunk.getOrThrow("responseStreamChunk")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            turn != null -> visitor.visitTurn(turn)
            responseStreamChunk != null -> visitor.visitResponseStreamChunk(responseStreamChunk)
            else -> visitor.unknown(_json)
        }
    }

    private var validated: Boolean = false

    fun validate(): AgentTurnCreateResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitTurn(turn: Turn) {
                    turn.validate()
                }

                override fun visitResponseStreamChunk(
                    responseStreamChunk: AgentTurnResponseStreamChunk
                ) {
                    responseStreamChunk.validate()
                }
            }
        )
        validated = true
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AgentTurnCreateResponse && turn == other.turn && responseStreamChunk == other.responseStreamChunk /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(turn, responseStreamChunk) /* spotless:on */

    override fun toString(): String =
        when {
            turn != null -> "AgentTurnCreateResponse{turn=$turn}"
            responseStreamChunk != null ->
                "AgentTurnCreateResponse{responseStreamChunk=$responseStreamChunk}"
            _json != null -> "AgentTurnCreateResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid AgentTurnCreateResponse")
        }

    companion object {

        fun ofTurn(turn: Turn) = AgentTurnCreateResponse(turn = turn)

        fun ofResponseStreamChunk(responseStreamChunk: AgentTurnResponseStreamChunk) =
            AgentTurnCreateResponse(responseStreamChunk = responseStreamChunk)
    }

    interface Visitor<out T> {

        fun visitTurn(turn: Turn): T

        fun visitResponseStreamChunk(responseStreamChunk: AgentTurnResponseStreamChunk): T

        fun unknown(json: JsonValue?): T {
            throw LlamaStackClientInvalidDataException("Unknown AgentTurnCreateResponse: $json")
        }
    }

    class Deserializer : BaseDeserializer<AgentTurnCreateResponse>(AgentTurnCreateResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): AgentTurnCreateResponse {
            val json = JsonValue.fromJsonNode(node)

            tryDeserialize(node, jacksonTypeRef<Turn>()) { it.validate() }
                ?.let {
                    return AgentTurnCreateResponse(turn = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<AgentTurnResponseStreamChunk>()) { it.validate() }
                ?.let {
                    return AgentTurnCreateResponse(responseStreamChunk = it, _json = json)
                }

            return AgentTurnCreateResponse(_json = json)
        }
    }

    class Serializer : BaseSerializer<AgentTurnCreateResponse>(AgentTurnCreateResponse::class) {

        override fun serialize(
            value: AgentTurnCreateResponse,
            generator: JsonGenerator,
            provider: SerializerProvider
        ) {
            when {
                value.turn != null -> generator.writeObject(value.turn)
                value.responseStreamChunk != null ->
                    generator.writeObject(value.responseStreamChunk)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid AgentTurnCreateResponse")
            }
        }
    }

    @NoAutoDetect
    class AgentTurnResponseStreamChunk
    @JsonCreator
    private constructor(
        @JsonProperty("event")
        @ExcludeMissing
        private val event: JsonField<TurnResponseEvent> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun event(): TurnResponseEvent = event.getRequired("event")

        @JsonProperty("event") @ExcludeMissing fun _event(): JsonField<TurnResponseEvent> = event

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AgentTurnResponseStreamChunk = apply {
            if (validated) {
                return@apply
            }

            event().validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var event: JsonField<TurnResponseEvent>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(agentTurnResponseStreamChunk: AgentTurnResponseStreamChunk) = apply {
                event = agentTurnResponseStreamChunk.event
                additionalProperties =
                    agentTurnResponseStreamChunk.additionalProperties.toMutableMap()
            }

            fun event(event: TurnResponseEvent) = event(JsonField.of(event))

            fun event(event: JsonField<TurnResponseEvent>) = apply { this.event = event }

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

            fun build(): AgentTurnResponseStreamChunk =
                AgentTurnResponseStreamChunk(
                    checkRequired("event", event),
                    additionalProperties.toImmutable()
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AgentTurnResponseStreamChunk && event == other.event && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(event, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AgentTurnResponseStreamChunk{event=$event, additionalProperties=$additionalProperties}"
    }
}
