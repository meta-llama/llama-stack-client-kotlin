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

@JsonDeserialize(using = AgentTurnCreateResponse.Deserializer::class)
@JsonSerialize(using = AgentTurnCreateResponse.Serializer::class)
class AgentTurnCreateResponse
private constructor(
    private val turn: Turn? = null,
    private val agentTurnResponseStreamChunk: AgentTurnResponseStreamChunk? = null,
    private val _json: JsonValue? = null,
) {

    fun turn(): Turn? = turn

    fun agentTurnResponseStreamChunk(): AgentTurnResponseStreamChunk? = agentTurnResponseStreamChunk

    fun isTurn(): Boolean = turn != null

    fun isAgentTurnResponseStreamChunk(): Boolean = agentTurnResponseStreamChunk != null

    fun asTurn(): Turn = turn.getOrThrow("turn")

    fun asAgentTurnResponseStreamChunk(): AgentTurnResponseStreamChunk =
        agentTurnResponseStreamChunk.getOrThrow("agentTurnResponseStreamChunk")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            turn != null -> visitor.visitTurn(turn)
            agentTurnResponseStreamChunk != null ->
                visitor.visitAgentTurnResponseStreamChunk(agentTurnResponseStreamChunk)
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

                override fun visitAgentTurnResponseStreamChunk(
                    agentTurnResponseStreamChunk: AgentTurnResponseStreamChunk
                ) {
                    agentTurnResponseStreamChunk.validate()
                }
            }
        )
        validated = true
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AgentTurnCreateResponse && turn == other.turn && agentTurnResponseStreamChunk == other.agentTurnResponseStreamChunk /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(turn, agentTurnResponseStreamChunk) /* spotless:on */

    override fun toString(): String =
        when {
            turn != null -> "AgentTurnCreateResponse{turn=$turn}"
            agentTurnResponseStreamChunk != null ->
                "AgentTurnCreateResponse{agentTurnResponseStreamChunk=$agentTurnResponseStreamChunk}"
            _json != null -> "AgentTurnCreateResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid AgentTurnCreateResponse")
        }

    companion object {

        fun ofTurn(turn: Turn) = AgentTurnCreateResponse(turn = turn)

        fun ofAgentTurnResponseStreamChunk(
            agentTurnResponseStreamChunk: AgentTurnResponseStreamChunk
        ) = AgentTurnCreateResponse(agentTurnResponseStreamChunk = agentTurnResponseStreamChunk)
    }

    interface Visitor<out T> {

        fun visitTurn(turn: Turn): T

        fun visitAgentTurnResponseStreamChunk(
            agentTurnResponseStreamChunk: AgentTurnResponseStreamChunk
        ): T

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
                    return AgentTurnCreateResponse(agentTurnResponseStreamChunk = it, _json = json)
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
                value.agentTurnResponseStreamChunk != null ->
                    generator.writeObject(value.agentTurnResponseStreamChunk)
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
        private val event: JsonField<Event> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun event(): Event = event.getRequired("event")

        @JsonProperty("event") @ExcludeMissing fun _event(): JsonField<Event> = event

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

            private var event: JsonField<Event>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(agentTurnResponseStreamChunk: AgentTurnResponseStreamChunk) = apply {
                event = agentTurnResponseStreamChunk.event
                additionalProperties =
                    agentTurnResponseStreamChunk.additionalProperties.toMutableMap()
            }

            fun event(event: Event) = event(JsonField.of(event))

            fun event(event: JsonField<Event>) = apply { this.event = event }

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

        @NoAutoDetect
        class Event
        @JsonCreator
        private constructor(
            @JsonProperty("payload")
            @ExcludeMissing
            private val payload: JsonField<Payload> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun payload(): Payload = payload.getRequired("payload")

            @JsonProperty("payload") @ExcludeMissing fun _payload(): JsonField<Payload> = payload

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Event = apply {
                if (validated) {
                    return@apply
                }

                payload().validate()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var payload: JsonField<Payload>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(event: Event) = apply {
                    payload = event.payload
                    additionalProperties = event.additionalProperties.toMutableMap()
                }

                fun payload(payload: Payload) = payload(JsonField.of(payload))

                fun payload(payload: JsonField<Payload>) = apply { this.payload = payload }

                fun payload(
                    agentTurnResponseStepStartPayload: Payload.AgentTurnResponseStepStartPayload
                ) =
                    payload(
                        Payload.ofAgentTurnResponseStepStartPayload(
                            agentTurnResponseStepStartPayload
                        )
                    )

                fun payload(
                    agentTurnResponseStepProgressPayload:
                        Payload.AgentTurnResponseStepProgressPayload
                ) =
                    payload(
                        Payload.ofAgentTurnResponseStepProgressPayload(
                            agentTurnResponseStepProgressPayload
                        )
                    )

                fun payload(
                    agentTurnResponseStepCompletePayload:
                        Payload.AgentTurnResponseStepCompletePayload
                ) =
                    payload(
                        Payload.ofAgentTurnResponseStepCompletePayload(
                            agentTurnResponseStepCompletePayload
                        )
                    )

                fun payload(
                    agentTurnResponseTurnStartPayload: Payload.AgentTurnResponseTurnStartPayload
                ) =
                    payload(
                        Payload.ofAgentTurnResponseTurnStartPayload(
                            agentTurnResponseTurnStartPayload
                        )
                    )

                fun payload(
                    agentTurnResponseTurnCompletePayload:
                        Payload.AgentTurnResponseTurnCompletePayload
                ) =
                    payload(
                        Payload.ofAgentTurnResponseTurnCompletePayload(
                            agentTurnResponseTurnCompletePayload
                        )
                    )

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): Event =
                    Event(checkRequired("payload", payload), additionalProperties.toImmutable())
            }

            @JsonDeserialize(using = Payload.Deserializer::class)
            @JsonSerialize(using = Payload.Serializer::class)
            class Payload
            private constructor(
                private val agentTurnResponseStepStartPayload: AgentTurnResponseStepStartPayload? =
                    null,
                private val agentTurnResponseStepProgressPayload:
                    AgentTurnResponseStepProgressPayload? =
                    null,
                private val agentTurnResponseStepCompletePayload:
                    AgentTurnResponseStepCompletePayload? =
                    null,
                private val agentTurnResponseTurnStartPayload: AgentTurnResponseTurnStartPayload? =
                    null,
                private val agentTurnResponseTurnCompletePayload:
                    AgentTurnResponseTurnCompletePayload? =
                    null,
                private val _json: JsonValue? = null,
            ) {

                fun agentTurnResponseStepStartPayload(): AgentTurnResponseStepStartPayload? =
                    agentTurnResponseStepStartPayload

                fun agentTurnResponseStepProgressPayload(): AgentTurnResponseStepProgressPayload? =
                    agentTurnResponseStepProgressPayload

                fun agentTurnResponseStepCompletePayload(): AgentTurnResponseStepCompletePayload? =
                    agentTurnResponseStepCompletePayload

                fun agentTurnResponseTurnStartPayload(): AgentTurnResponseTurnStartPayload? =
                    agentTurnResponseTurnStartPayload

                fun agentTurnResponseTurnCompletePayload(): AgentTurnResponseTurnCompletePayload? =
                    agentTurnResponseTurnCompletePayload

                fun isAgentTurnResponseStepStartPayload(): Boolean =
                    agentTurnResponseStepStartPayload != null

                fun isAgentTurnResponseStepProgressPayload(): Boolean =
                    agentTurnResponseStepProgressPayload != null

                fun isAgentTurnResponseStepCompletePayload(): Boolean =
                    agentTurnResponseStepCompletePayload != null

                fun isAgentTurnResponseTurnStartPayload(): Boolean =
                    agentTurnResponseTurnStartPayload != null

                fun isAgentTurnResponseTurnCompletePayload(): Boolean =
                    agentTurnResponseTurnCompletePayload != null

                fun asAgentTurnResponseStepStartPayload(): AgentTurnResponseStepStartPayload =
                    agentTurnResponseStepStartPayload.getOrThrow(
                        "agentTurnResponseStepStartPayload"
                    )

                fun asAgentTurnResponseStepProgressPayload(): AgentTurnResponseStepProgressPayload =
                    agentTurnResponseStepProgressPayload.getOrThrow(
                        "agentTurnResponseStepProgressPayload"
                    )

                fun asAgentTurnResponseStepCompletePayload(): AgentTurnResponseStepCompletePayload =
                    agentTurnResponseStepCompletePayload.getOrThrow(
                        "agentTurnResponseStepCompletePayload"
                    )

                fun asAgentTurnResponseTurnStartPayload(): AgentTurnResponseTurnStartPayload =
                    agentTurnResponseTurnStartPayload.getOrThrow(
                        "agentTurnResponseTurnStartPayload"
                    )

                fun asAgentTurnResponseTurnCompletePayload(): AgentTurnResponseTurnCompletePayload =
                    agentTurnResponseTurnCompletePayload.getOrThrow(
                        "agentTurnResponseTurnCompletePayload"
                    )

                fun _json(): JsonValue? = _json

                fun <T> accept(visitor: Visitor<T>): T {
                    return when {
                        agentTurnResponseStepStartPayload != null ->
                            visitor.visitAgentTurnResponseStepStartPayload(
                                agentTurnResponseStepStartPayload
                            )
                        agentTurnResponseStepProgressPayload != null ->
                            visitor.visitAgentTurnResponseStepProgressPayload(
                                agentTurnResponseStepProgressPayload
                            )
                        agentTurnResponseStepCompletePayload != null ->
                            visitor.visitAgentTurnResponseStepCompletePayload(
                                agentTurnResponseStepCompletePayload
                            )
                        agentTurnResponseTurnStartPayload != null ->
                            visitor.visitAgentTurnResponseTurnStartPayload(
                                agentTurnResponseTurnStartPayload
                            )
                        agentTurnResponseTurnCompletePayload != null ->
                            visitor.visitAgentTurnResponseTurnCompletePayload(
                                agentTurnResponseTurnCompletePayload
                            )
                        else -> visitor.unknown(_json)
                    }
                }

                private var validated: Boolean = false

                fun validate(): Payload = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitAgentTurnResponseStepStartPayload(
                                agentTurnResponseStepStartPayload: AgentTurnResponseStepStartPayload
                            ) {
                                agentTurnResponseStepStartPayload.validate()
                            }

                            override fun visitAgentTurnResponseStepProgressPayload(
                                agentTurnResponseStepProgressPayload:
                                    AgentTurnResponseStepProgressPayload
                            ) {
                                agentTurnResponseStepProgressPayload.validate()
                            }

                            override fun visitAgentTurnResponseStepCompletePayload(
                                agentTurnResponseStepCompletePayload:
                                    AgentTurnResponseStepCompletePayload
                            ) {
                                agentTurnResponseStepCompletePayload.validate()
                            }

                            override fun visitAgentTurnResponseTurnStartPayload(
                                agentTurnResponseTurnStartPayload: AgentTurnResponseTurnStartPayload
                            ) {
                                agentTurnResponseTurnStartPayload.validate()
                            }

                            override fun visitAgentTurnResponseTurnCompletePayload(
                                agentTurnResponseTurnCompletePayload:
                                    AgentTurnResponseTurnCompletePayload
                            ) {
                                agentTurnResponseTurnCompletePayload.validate()
                            }
                        }
                    )
                    validated = true
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Payload && agentTurnResponseStepStartPayload == other.agentTurnResponseStepStartPayload && agentTurnResponseStepProgressPayload == other.agentTurnResponseStepProgressPayload && agentTurnResponseStepCompletePayload == other.agentTurnResponseStepCompletePayload && agentTurnResponseTurnStartPayload == other.agentTurnResponseTurnStartPayload && agentTurnResponseTurnCompletePayload == other.agentTurnResponseTurnCompletePayload /* spotless:on */
                }

                override fun hashCode(): Int = /* spotless:off */ Objects.hash(agentTurnResponseStepStartPayload, agentTurnResponseStepProgressPayload, agentTurnResponseStepCompletePayload, agentTurnResponseTurnStartPayload, agentTurnResponseTurnCompletePayload) /* spotless:on */

                override fun toString(): String =
                    when {
                        agentTurnResponseStepStartPayload != null ->
                            "Payload{agentTurnResponseStepStartPayload=$agentTurnResponseStepStartPayload}"
                        agentTurnResponseStepProgressPayload != null ->
                            "Payload{agentTurnResponseStepProgressPayload=$agentTurnResponseStepProgressPayload}"
                        agentTurnResponseStepCompletePayload != null ->
                            "Payload{agentTurnResponseStepCompletePayload=$agentTurnResponseStepCompletePayload}"
                        agentTurnResponseTurnStartPayload != null ->
                            "Payload{agentTurnResponseTurnStartPayload=$agentTurnResponseTurnStartPayload}"
                        agentTurnResponseTurnCompletePayload != null ->
                            "Payload{agentTurnResponseTurnCompletePayload=$agentTurnResponseTurnCompletePayload}"
                        _json != null -> "Payload{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Payload")
                    }

                companion object {

                    fun ofAgentTurnResponseStepStartPayload(
                        agentTurnResponseStepStartPayload: AgentTurnResponseStepStartPayload
                    ) =
                        Payload(
                            agentTurnResponseStepStartPayload = agentTurnResponseStepStartPayload
                        )

                    fun ofAgentTurnResponseStepProgressPayload(
                        agentTurnResponseStepProgressPayload: AgentTurnResponseStepProgressPayload
                    ) =
                        Payload(
                            agentTurnResponseStepProgressPayload =
                                agentTurnResponseStepProgressPayload
                        )

                    fun ofAgentTurnResponseStepCompletePayload(
                        agentTurnResponseStepCompletePayload: AgentTurnResponseStepCompletePayload
                    ) =
                        Payload(
                            agentTurnResponseStepCompletePayload =
                                agentTurnResponseStepCompletePayload
                        )

                    fun ofAgentTurnResponseTurnStartPayload(
                        agentTurnResponseTurnStartPayload: AgentTurnResponseTurnStartPayload
                    ) =
                        Payload(
                            agentTurnResponseTurnStartPayload = agentTurnResponseTurnStartPayload
                        )

                    fun ofAgentTurnResponseTurnCompletePayload(
                        agentTurnResponseTurnCompletePayload: AgentTurnResponseTurnCompletePayload
                    ) =
                        Payload(
                            agentTurnResponseTurnCompletePayload =
                                agentTurnResponseTurnCompletePayload
                        )
                }

                interface Visitor<out T> {

                    fun visitAgentTurnResponseStepStartPayload(
                        agentTurnResponseStepStartPayload: AgentTurnResponseStepStartPayload
                    ): T

                    fun visitAgentTurnResponseStepProgressPayload(
                        agentTurnResponseStepProgressPayload: AgentTurnResponseStepProgressPayload
                    ): T

                    fun visitAgentTurnResponseStepCompletePayload(
                        agentTurnResponseStepCompletePayload: AgentTurnResponseStepCompletePayload
                    ): T

                    fun visitAgentTurnResponseTurnStartPayload(
                        agentTurnResponseTurnStartPayload: AgentTurnResponseTurnStartPayload
                    ): T

                    fun visitAgentTurnResponseTurnCompletePayload(
                        agentTurnResponseTurnCompletePayload: AgentTurnResponseTurnCompletePayload
                    ): T

                    fun unknown(json: JsonValue?): T {
                        throw LlamaStackClientInvalidDataException("Unknown Payload: $json")
                    }
                }

                class Deserializer : BaseDeserializer<Payload>(Payload::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Payload {
                        val json = JsonValue.fromJsonNode(node)

                        tryDeserialize(node, jacksonTypeRef<AgentTurnResponseStepStartPayload>()) {
                                it.validate()
                            }
                            ?.let {
                                return Payload(agentTurnResponseStepStartPayload = it, _json = json)
                            }
                        tryDeserialize(
                                node,
                                jacksonTypeRef<AgentTurnResponseStepProgressPayload>()
                            ) {
                                it.validate()
                            }
                            ?.let {
                                return Payload(
                                    agentTurnResponseStepProgressPayload = it,
                                    _json = json
                                )
                            }
                        tryDeserialize(
                                node,
                                jacksonTypeRef<AgentTurnResponseStepCompletePayload>()
                            ) {
                                it.validate()
                            }
                            ?.let {
                                return Payload(
                                    agentTurnResponseStepCompletePayload = it,
                                    _json = json
                                )
                            }
                        tryDeserialize(node, jacksonTypeRef<AgentTurnResponseTurnStartPayload>()) {
                                it.validate()
                            }
                            ?.let {
                                return Payload(agentTurnResponseTurnStartPayload = it, _json = json)
                            }
                        tryDeserialize(
                                node,
                                jacksonTypeRef<AgentTurnResponseTurnCompletePayload>()
                            ) {
                                it.validate()
                            }
                            ?.let {
                                return Payload(
                                    agentTurnResponseTurnCompletePayload = it,
                                    _json = json
                                )
                            }

                        return Payload(_json = json)
                    }
                }

                class Serializer : BaseSerializer<Payload>(Payload::class) {

                    override fun serialize(
                        value: Payload,
                        generator: JsonGenerator,
                        provider: SerializerProvider
                    ) {
                        when {
                            value.agentTurnResponseStepStartPayload != null ->
                                generator.writeObject(value.agentTurnResponseStepStartPayload)
                            value.agentTurnResponseStepProgressPayload != null ->
                                generator.writeObject(value.agentTurnResponseStepProgressPayload)
                            value.agentTurnResponseStepCompletePayload != null ->
                                generator.writeObject(value.agentTurnResponseStepCompletePayload)
                            value.agentTurnResponseTurnStartPayload != null ->
                                generator.writeObject(value.agentTurnResponseTurnStartPayload)
                            value.agentTurnResponseTurnCompletePayload != null ->
                                generator.writeObject(value.agentTurnResponseTurnCompletePayload)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Payload")
                        }
                    }
                }

                @NoAutoDetect
                class AgentTurnResponseStepStartPayload
                @JsonCreator
                private constructor(
                    @JsonProperty("event_type")
                    @ExcludeMissing
                    private val eventType: JsonField<EventType> = JsonMissing.of(),
                    @JsonProperty("step_id")
                    @ExcludeMissing
                    private val stepId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("step_type")
                    @ExcludeMissing
                    private val stepType: JsonField<StepType> = JsonMissing.of(),
                    @JsonProperty("metadata")
                    @ExcludeMissing
                    private val metadata: JsonField<Metadata> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun eventType(): EventType = eventType.getRequired("event_type")

                    fun stepId(): String = stepId.getRequired("step_id")

                    fun stepType(): StepType = stepType.getRequired("step_type")

                    fun metadata(): Metadata? = metadata.getNullable("metadata")

                    @JsonProperty("event_type")
                    @ExcludeMissing
                    fun _eventType(): JsonField<EventType> = eventType

                    @JsonProperty("step_id")
                    @ExcludeMissing
                    fun _stepId(): JsonField<String> = stepId

                    @JsonProperty("step_type")
                    @ExcludeMissing
                    fun _stepType(): JsonField<StepType> = stepType

                    @JsonProperty("metadata")
                    @ExcludeMissing
                    fun _metadata(): JsonField<Metadata> = metadata

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): AgentTurnResponseStepStartPayload = apply {
                        if (validated) {
                            return@apply
                        }

                        eventType()
                        stepId()
                        stepType()
                        metadata()?.validate()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var eventType: JsonField<EventType>? = null
                        private var stepId: JsonField<String>? = null
                        private var stepType: JsonField<StepType>? = null
                        private var metadata: JsonField<Metadata> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(
                            agentTurnResponseStepStartPayload: AgentTurnResponseStepStartPayload
                        ) = apply {
                            eventType = agentTurnResponseStepStartPayload.eventType
                            stepId = agentTurnResponseStepStartPayload.stepId
                            stepType = agentTurnResponseStepStartPayload.stepType
                            metadata = agentTurnResponseStepStartPayload.metadata
                            additionalProperties =
                                agentTurnResponseStepStartPayload.additionalProperties
                                    .toMutableMap()
                        }

                        fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

                        fun eventType(eventType: JsonField<EventType>) = apply {
                            this.eventType = eventType
                        }

                        fun stepId(stepId: String) = stepId(JsonField.of(stepId))

                        fun stepId(stepId: JsonField<String>) = apply { this.stepId = stepId }

                        fun stepType(stepType: StepType) = stepType(JsonField.of(stepType))

                        fun stepType(stepType: JsonField<StepType>) = apply {
                            this.stepType = stepType
                        }

                        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                        fun metadata(metadata: JsonField<Metadata>) = apply {
                            this.metadata = metadata
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): AgentTurnResponseStepStartPayload =
                            AgentTurnResponseStepStartPayload(
                                checkRequired("eventType", eventType),
                                checkRequired("stepId", stepId),
                                checkRequired("stepType", stepType),
                                metadata,
                                additionalProperties.toImmutable(),
                            )
                    }

                    class EventType
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            val STEP_START = of("step_start")

                            fun of(value: String) = EventType(JsonField.of(value))
                        }

                        enum class Known {
                            STEP_START,
                        }

                        enum class Value {
                            STEP_START,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                STEP_START -> Value.STEP_START
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                STEP_START -> Known.STEP_START
                                else ->
                                    throw LlamaStackClientInvalidDataException(
                                        "Unknown EventType: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is EventType && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    class StepType
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            val INFERENCE = of("inference")

                            val TOOL_EXECUTION = of("tool_execution")

                            val SHIELD_CALL = of("shield_call")

                            val MEMORY_RETRIEVAL = of("memory_retrieval")

                            fun of(value: String) = StepType(JsonField.of(value))
                        }

                        enum class Known {
                            INFERENCE,
                            TOOL_EXECUTION,
                            SHIELD_CALL,
                            MEMORY_RETRIEVAL,
                        }

                        enum class Value {
                            INFERENCE,
                            TOOL_EXECUTION,
                            SHIELD_CALL,
                            MEMORY_RETRIEVAL,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                INFERENCE -> Value.INFERENCE
                                TOOL_EXECUTION -> Value.TOOL_EXECUTION
                                SHIELD_CALL -> Value.SHIELD_CALL
                                MEMORY_RETRIEVAL -> Value.MEMORY_RETRIEVAL
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                INFERENCE -> Known.INFERENCE
                                TOOL_EXECUTION -> Known.TOOL_EXECUTION
                                SHIELD_CALL -> Known.SHIELD_CALL
                                MEMORY_RETRIEVAL -> Known.MEMORY_RETRIEVAL
                                else ->
                                    throw LlamaStackClientInvalidDataException(
                                        "Unknown StepType: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is StepType && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    @NoAutoDetect
                    class Metadata
                    @JsonCreator
                    private constructor(
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): Metadata = apply {
                            if (validated) {
                                return@apply
                            }

                            validated = true
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(metadata: Metadata) = apply {
                                additionalProperties = metadata.additionalProperties.toMutableMap()
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Metadata{additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AgentTurnResponseStepStartPayload && eventType == other.eventType && stepId == other.stepId && stepType == other.stepType && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(eventType, stepId, stepType, metadata, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "AgentTurnResponseStepStartPayload{eventType=$eventType, stepId=$stepId, stepType=$stepType, metadata=$metadata, additionalProperties=$additionalProperties}"
                }

                @NoAutoDetect
                class AgentTurnResponseStepProgressPayload
                @JsonCreator
                private constructor(
                    @JsonProperty("delta")
                    @ExcludeMissing
                    private val delta: JsonField<ContentDelta> = JsonMissing.of(),
                    @JsonProperty("event_type")
                    @ExcludeMissing
                    private val eventType: JsonField<EventType> = JsonMissing.of(),
                    @JsonProperty("step_id")
                    @ExcludeMissing
                    private val stepId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("step_type")
                    @ExcludeMissing
                    private val stepType: JsonField<StepType> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun delta(): ContentDelta = delta.getRequired("delta")

                    fun eventType(): EventType = eventType.getRequired("event_type")

                    fun stepId(): String = stepId.getRequired("step_id")

                    fun stepType(): StepType = stepType.getRequired("step_type")

                    @JsonProperty("delta")
                    @ExcludeMissing
                    fun _delta(): JsonField<ContentDelta> = delta

                    @JsonProperty("event_type")
                    @ExcludeMissing
                    fun _eventType(): JsonField<EventType> = eventType

                    @JsonProperty("step_id")
                    @ExcludeMissing
                    fun _stepId(): JsonField<String> = stepId

                    @JsonProperty("step_type")
                    @ExcludeMissing
                    fun _stepType(): JsonField<StepType> = stepType

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): AgentTurnResponseStepProgressPayload = apply {
                        if (validated) {
                            return@apply
                        }

                        delta().validate()
                        eventType()
                        stepId()
                        stepType()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var delta: JsonField<ContentDelta>? = null
                        private var eventType: JsonField<EventType>? = null
                        private var stepId: JsonField<String>? = null
                        private var stepType: JsonField<StepType>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(
                            agentTurnResponseStepProgressPayload:
                                AgentTurnResponseStepProgressPayload
                        ) = apply {
                            delta = agentTurnResponseStepProgressPayload.delta
                            eventType = agentTurnResponseStepProgressPayload.eventType
                            stepId = agentTurnResponseStepProgressPayload.stepId
                            stepType = agentTurnResponseStepProgressPayload.stepType
                            additionalProperties =
                                agentTurnResponseStepProgressPayload.additionalProperties
                                    .toMutableMap()
                        }

                        fun delta(delta: ContentDelta) = delta(JsonField.of(delta))

                        fun delta(delta: JsonField<ContentDelta>) = apply { this.delta = delta }

                        fun delta(textDelta: ContentDelta.TextDelta) =
                            delta(ContentDelta.ofTextDelta(textDelta))

                        fun delta(imageDelta: ContentDelta.ImageDelta) =
                            delta(ContentDelta.ofImageDelta(imageDelta))

                        fun delta(toolCallDelta: ContentDelta.ToolCallDelta) =
                            delta(ContentDelta.ofToolCallDelta(toolCallDelta))

                        fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

                        fun eventType(eventType: JsonField<EventType>) = apply {
                            this.eventType = eventType
                        }

                        fun stepId(stepId: String) = stepId(JsonField.of(stepId))

                        fun stepId(stepId: JsonField<String>) = apply { this.stepId = stepId }

                        fun stepType(stepType: StepType) = stepType(JsonField.of(stepType))

                        fun stepType(stepType: JsonField<StepType>) = apply {
                            this.stepType = stepType
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): AgentTurnResponseStepProgressPayload =
                            AgentTurnResponseStepProgressPayload(
                                checkRequired("delta", delta),
                                checkRequired("eventType", eventType),
                                checkRequired("stepId", stepId),
                                checkRequired("stepType", stepType),
                                additionalProperties.toImmutable(),
                            )
                    }

                    class EventType
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            val STEP_PROGRESS = of("step_progress")

                            fun of(value: String) = EventType(JsonField.of(value))
                        }

                        enum class Known {
                            STEP_PROGRESS,
                        }

                        enum class Value {
                            STEP_PROGRESS,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                STEP_PROGRESS -> Value.STEP_PROGRESS
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                STEP_PROGRESS -> Known.STEP_PROGRESS
                                else ->
                                    throw LlamaStackClientInvalidDataException(
                                        "Unknown EventType: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is EventType && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    class StepType
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            val INFERENCE = of("inference")

                            val TOOL_EXECUTION = of("tool_execution")

                            val SHIELD_CALL = of("shield_call")

                            val MEMORY_RETRIEVAL = of("memory_retrieval")

                            fun of(value: String) = StepType(JsonField.of(value))
                        }

                        enum class Known {
                            INFERENCE,
                            TOOL_EXECUTION,
                            SHIELD_CALL,
                            MEMORY_RETRIEVAL,
                        }

                        enum class Value {
                            INFERENCE,
                            TOOL_EXECUTION,
                            SHIELD_CALL,
                            MEMORY_RETRIEVAL,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                INFERENCE -> Value.INFERENCE
                                TOOL_EXECUTION -> Value.TOOL_EXECUTION
                                SHIELD_CALL -> Value.SHIELD_CALL
                                MEMORY_RETRIEVAL -> Value.MEMORY_RETRIEVAL
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                INFERENCE -> Known.INFERENCE
                                TOOL_EXECUTION -> Known.TOOL_EXECUTION
                                SHIELD_CALL -> Known.SHIELD_CALL
                                MEMORY_RETRIEVAL -> Known.MEMORY_RETRIEVAL
                                else ->
                                    throw LlamaStackClientInvalidDataException(
                                        "Unknown StepType: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is StepType && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AgentTurnResponseStepProgressPayload && delta == other.delta && eventType == other.eventType && stepId == other.stepId && stepType == other.stepType && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(delta, eventType, stepId, stepType, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "AgentTurnResponseStepProgressPayload{delta=$delta, eventType=$eventType, stepId=$stepId, stepType=$stepType, additionalProperties=$additionalProperties}"
                }

                @NoAutoDetect
                class AgentTurnResponseStepCompletePayload
                @JsonCreator
                private constructor(
                    @JsonProperty("event_type")
                    @ExcludeMissing
                    private val eventType: JsonField<EventType> = JsonMissing.of(),
                    @JsonProperty("step_details")
                    @ExcludeMissing
                    private val stepDetails: JsonField<StepDetails> = JsonMissing.of(),
                    @JsonProperty("step_id")
                    @ExcludeMissing
                    private val stepId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("step_type")
                    @ExcludeMissing
                    private val stepType: JsonField<StepType> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun eventType(): EventType = eventType.getRequired("event_type")

                    fun stepDetails(): StepDetails = stepDetails.getRequired("step_details")

                    fun stepId(): String = stepId.getRequired("step_id")

                    fun stepType(): StepType = stepType.getRequired("step_type")

                    @JsonProperty("event_type")
                    @ExcludeMissing
                    fun _eventType(): JsonField<EventType> = eventType

                    @JsonProperty("step_details")
                    @ExcludeMissing
                    fun _stepDetails(): JsonField<StepDetails> = stepDetails

                    @JsonProperty("step_id")
                    @ExcludeMissing
                    fun _stepId(): JsonField<String> = stepId

                    @JsonProperty("step_type")
                    @ExcludeMissing
                    fun _stepType(): JsonField<StepType> = stepType

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): AgentTurnResponseStepCompletePayload = apply {
                        if (validated) {
                            return@apply
                        }

                        eventType()
                        stepDetails().validate()
                        stepId()
                        stepType()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var eventType: JsonField<EventType>? = null
                        private var stepDetails: JsonField<StepDetails>? = null
                        private var stepId: JsonField<String>? = null
                        private var stepType: JsonField<StepType>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(
                            agentTurnResponseStepCompletePayload:
                                AgentTurnResponseStepCompletePayload
                        ) = apply {
                            eventType = agentTurnResponseStepCompletePayload.eventType
                            stepDetails = agentTurnResponseStepCompletePayload.stepDetails
                            stepId = agentTurnResponseStepCompletePayload.stepId
                            stepType = agentTurnResponseStepCompletePayload.stepType
                            additionalProperties =
                                agentTurnResponseStepCompletePayload.additionalProperties
                                    .toMutableMap()
                        }

                        fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

                        fun eventType(eventType: JsonField<EventType>) = apply {
                            this.eventType = eventType
                        }

                        fun stepDetails(stepDetails: StepDetails) =
                            stepDetails(JsonField.of(stepDetails))

                        fun stepDetails(stepDetails: JsonField<StepDetails>) = apply {
                            this.stepDetails = stepDetails
                        }

                        fun stepDetails(inferenceStep: InferenceStep) =
                            stepDetails(StepDetails.ofInferenceStep(inferenceStep))

                        fun stepDetails(toolExecutionStep: ToolExecutionStep) =
                            stepDetails(StepDetails.ofToolExecutionStep(toolExecutionStep))

                        fun stepDetails(shieldCallStep: ShieldCallStep) =
                            stepDetails(StepDetails.ofShieldCallStep(shieldCallStep))

                        fun stepDetails(memoryRetrievalStep: MemoryRetrievalStep) =
                            stepDetails(StepDetails.ofMemoryRetrievalStep(memoryRetrievalStep))

                        fun stepId(stepId: String) = stepId(JsonField.of(stepId))

                        fun stepId(stepId: JsonField<String>) = apply { this.stepId = stepId }

                        fun stepType(stepType: StepType) = stepType(JsonField.of(stepType))

                        fun stepType(stepType: JsonField<StepType>) = apply {
                            this.stepType = stepType
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): AgentTurnResponseStepCompletePayload =
                            AgentTurnResponseStepCompletePayload(
                                checkRequired("eventType", eventType),
                                checkRequired("stepDetails", stepDetails),
                                checkRequired("stepId", stepId),
                                checkRequired("stepType", stepType),
                                additionalProperties.toImmutable(),
                            )
                    }

                    class EventType
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            val STEP_COMPLETE = of("step_complete")

                            fun of(value: String) = EventType(JsonField.of(value))
                        }

                        enum class Known {
                            STEP_COMPLETE,
                        }

                        enum class Value {
                            STEP_COMPLETE,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                STEP_COMPLETE -> Value.STEP_COMPLETE
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                STEP_COMPLETE -> Known.STEP_COMPLETE
                                else ->
                                    throw LlamaStackClientInvalidDataException(
                                        "Unknown EventType: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is EventType && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    @JsonDeserialize(using = StepDetails.Deserializer::class)
                    @JsonSerialize(using = StepDetails.Serializer::class)
                    class StepDetails
                    private constructor(
                        private val inferenceStep: InferenceStep? = null,
                        private val toolExecutionStep: ToolExecutionStep? = null,
                        private val shieldCallStep: ShieldCallStep? = null,
                        private val memoryRetrievalStep: MemoryRetrievalStep? = null,
                        private val _json: JsonValue? = null,
                    ) {

                        fun inferenceStep(): InferenceStep? = inferenceStep

                        fun toolExecutionStep(): ToolExecutionStep? = toolExecutionStep

                        fun shieldCallStep(): ShieldCallStep? = shieldCallStep

                        fun memoryRetrievalStep(): MemoryRetrievalStep? = memoryRetrievalStep

                        fun isInferenceStep(): Boolean = inferenceStep != null

                        fun isToolExecutionStep(): Boolean = toolExecutionStep != null

                        fun isShieldCallStep(): Boolean = shieldCallStep != null

                        fun isMemoryRetrievalStep(): Boolean = memoryRetrievalStep != null

                        fun asInferenceStep(): InferenceStep =
                            inferenceStep.getOrThrow("inferenceStep")

                        fun asToolExecutionStep(): ToolExecutionStep =
                            toolExecutionStep.getOrThrow("toolExecutionStep")

                        fun asShieldCallStep(): ShieldCallStep =
                            shieldCallStep.getOrThrow("shieldCallStep")

                        fun asMemoryRetrievalStep(): MemoryRetrievalStep =
                            memoryRetrievalStep.getOrThrow("memoryRetrievalStep")

                        fun _json(): JsonValue? = _json

                        fun <T> accept(visitor: Visitor<T>): T {
                            return when {
                                inferenceStep != null -> visitor.visitInferenceStep(inferenceStep)
                                toolExecutionStep != null ->
                                    visitor.visitToolExecutionStep(toolExecutionStep)
                                shieldCallStep != null ->
                                    visitor.visitShieldCallStep(shieldCallStep)
                                memoryRetrievalStep != null ->
                                    visitor.visitMemoryRetrievalStep(memoryRetrievalStep)
                                else -> visitor.unknown(_json)
                            }
                        }

                        private var validated: Boolean = false

                        fun validate(): StepDetails = apply {
                            if (validated) {
                                return@apply
                            }

                            accept(
                                object : Visitor<Unit> {
                                    override fun visitInferenceStep(inferenceStep: InferenceStep) {
                                        inferenceStep.validate()
                                    }

                                    override fun visitToolExecutionStep(
                                        toolExecutionStep: ToolExecutionStep
                                    ) {
                                        toolExecutionStep.validate()
                                    }

                                    override fun visitShieldCallStep(
                                        shieldCallStep: ShieldCallStep
                                    ) {
                                        shieldCallStep.validate()
                                    }

                                    override fun visitMemoryRetrievalStep(
                                        memoryRetrievalStep: MemoryRetrievalStep
                                    ) {
                                        memoryRetrievalStep.validate()
                                    }
                                }
                            )
                            validated = true
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is StepDetails && inferenceStep == other.inferenceStep && toolExecutionStep == other.toolExecutionStep && shieldCallStep == other.shieldCallStep && memoryRetrievalStep == other.memoryRetrievalStep /* spotless:on */
                        }

                        override fun hashCode(): Int = /* spotless:off */ Objects.hash(inferenceStep, toolExecutionStep, shieldCallStep, memoryRetrievalStep) /* spotless:on */

                        override fun toString(): String =
                            when {
                                inferenceStep != null -> "StepDetails{inferenceStep=$inferenceStep}"
                                toolExecutionStep != null ->
                                    "StepDetails{toolExecutionStep=$toolExecutionStep}"
                                shieldCallStep != null ->
                                    "StepDetails{shieldCallStep=$shieldCallStep}"
                                memoryRetrievalStep != null ->
                                    "StepDetails{memoryRetrievalStep=$memoryRetrievalStep}"
                                _json != null -> "StepDetails{_unknown=$_json}"
                                else -> throw IllegalStateException("Invalid StepDetails")
                            }

                        companion object {

                            fun ofInferenceStep(inferenceStep: InferenceStep) =
                                StepDetails(inferenceStep = inferenceStep)

                            fun ofToolExecutionStep(toolExecutionStep: ToolExecutionStep) =
                                StepDetails(toolExecutionStep = toolExecutionStep)

                            fun ofShieldCallStep(shieldCallStep: ShieldCallStep) =
                                StepDetails(shieldCallStep = shieldCallStep)

                            fun ofMemoryRetrievalStep(memoryRetrievalStep: MemoryRetrievalStep) =
                                StepDetails(memoryRetrievalStep = memoryRetrievalStep)
                        }

                        interface Visitor<out T> {

                            fun visitInferenceStep(inferenceStep: InferenceStep): T

                            fun visitToolExecutionStep(toolExecutionStep: ToolExecutionStep): T

                            fun visitShieldCallStep(shieldCallStep: ShieldCallStep): T

                            fun visitMemoryRetrievalStep(
                                memoryRetrievalStep: MemoryRetrievalStep
                            ): T

                            fun unknown(json: JsonValue?): T {
                                throw LlamaStackClientInvalidDataException(
                                    "Unknown StepDetails: $json"
                                )
                            }
                        }

                        class Deserializer : BaseDeserializer<StepDetails>(StepDetails::class) {

                            override fun ObjectCodec.deserialize(node: JsonNode): StepDetails {
                                val json = JsonValue.fromJsonNode(node)

                                tryDeserialize(node, jacksonTypeRef<InferenceStep>()) {
                                        it.validate()
                                    }
                                    ?.let {
                                        return StepDetails(inferenceStep = it, _json = json)
                                    }
                                tryDeserialize(node, jacksonTypeRef<ToolExecutionStep>()) {
                                        it.validate()
                                    }
                                    ?.let {
                                        return StepDetails(toolExecutionStep = it, _json = json)
                                    }
                                tryDeserialize(node, jacksonTypeRef<ShieldCallStep>()) {
                                        it.validate()
                                    }
                                    ?.let {
                                        return StepDetails(shieldCallStep = it, _json = json)
                                    }
                                tryDeserialize(node, jacksonTypeRef<MemoryRetrievalStep>()) {
                                        it.validate()
                                    }
                                    ?.let {
                                        return StepDetails(memoryRetrievalStep = it, _json = json)
                                    }

                                return StepDetails(_json = json)
                            }
                        }

                        class Serializer : BaseSerializer<StepDetails>(StepDetails::class) {

                            override fun serialize(
                                value: StepDetails,
                                generator: JsonGenerator,
                                provider: SerializerProvider
                            ) {
                                when {
                                    value.inferenceStep != null ->
                                        generator.writeObject(value.inferenceStep)
                                    value.toolExecutionStep != null ->
                                        generator.writeObject(value.toolExecutionStep)
                                    value.shieldCallStep != null ->
                                        generator.writeObject(value.shieldCallStep)
                                    value.memoryRetrievalStep != null ->
                                        generator.writeObject(value.memoryRetrievalStep)
                                    value._json != null -> generator.writeObject(value._json)
                                    else -> throw IllegalStateException("Invalid StepDetails")
                                }
                            }
                        }
                    }

                    class StepType
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            val INFERENCE = of("inference")

                            val TOOL_EXECUTION = of("tool_execution")

                            val SHIELD_CALL = of("shield_call")

                            val MEMORY_RETRIEVAL = of("memory_retrieval")

                            fun of(value: String) = StepType(JsonField.of(value))
                        }

                        enum class Known {
                            INFERENCE,
                            TOOL_EXECUTION,
                            SHIELD_CALL,
                            MEMORY_RETRIEVAL,
                        }

                        enum class Value {
                            INFERENCE,
                            TOOL_EXECUTION,
                            SHIELD_CALL,
                            MEMORY_RETRIEVAL,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                INFERENCE -> Value.INFERENCE
                                TOOL_EXECUTION -> Value.TOOL_EXECUTION
                                SHIELD_CALL -> Value.SHIELD_CALL
                                MEMORY_RETRIEVAL -> Value.MEMORY_RETRIEVAL
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                INFERENCE -> Known.INFERENCE
                                TOOL_EXECUTION -> Known.TOOL_EXECUTION
                                SHIELD_CALL -> Known.SHIELD_CALL
                                MEMORY_RETRIEVAL -> Known.MEMORY_RETRIEVAL
                                else ->
                                    throw LlamaStackClientInvalidDataException(
                                        "Unknown StepType: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is StepType && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AgentTurnResponseStepCompletePayload && eventType == other.eventType && stepDetails == other.stepDetails && stepId == other.stepId && stepType == other.stepType && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(eventType, stepDetails, stepId, stepType, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "AgentTurnResponseStepCompletePayload{eventType=$eventType, stepDetails=$stepDetails, stepId=$stepId, stepType=$stepType, additionalProperties=$additionalProperties}"
                }

                @NoAutoDetect
                class AgentTurnResponseTurnStartPayload
                @JsonCreator
                private constructor(
                    @JsonProperty("event_type")
                    @ExcludeMissing
                    private val eventType: JsonField<EventType> = JsonMissing.of(),
                    @JsonProperty("turn_id")
                    @ExcludeMissing
                    private val turnId: JsonField<String> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun eventType(): EventType = eventType.getRequired("event_type")

                    fun turnId(): String = turnId.getRequired("turn_id")

                    @JsonProperty("event_type")
                    @ExcludeMissing
                    fun _eventType(): JsonField<EventType> = eventType

                    @JsonProperty("turn_id")
                    @ExcludeMissing
                    fun _turnId(): JsonField<String> = turnId

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): AgentTurnResponseTurnStartPayload = apply {
                        if (validated) {
                            return@apply
                        }

                        eventType()
                        turnId()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var eventType: JsonField<EventType>? = null
                        private var turnId: JsonField<String>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(
                            agentTurnResponseTurnStartPayload: AgentTurnResponseTurnStartPayload
                        ) = apply {
                            eventType = agentTurnResponseTurnStartPayload.eventType
                            turnId = agentTurnResponseTurnStartPayload.turnId
                            additionalProperties =
                                agentTurnResponseTurnStartPayload.additionalProperties
                                    .toMutableMap()
                        }

                        fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

                        fun eventType(eventType: JsonField<EventType>) = apply {
                            this.eventType = eventType
                        }

                        fun turnId(turnId: String) = turnId(JsonField.of(turnId))

                        fun turnId(turnId: JsonField<String>) = apply { this.turnId = turnId }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): AgentTurnResponseTurnStartPayload =
                            AgentTurnResponseTurnStartPayload(
                                checkRequired("eventType", eventType),
                                checkRequired("turnId", turnId),
                                additionalProperties.toImmutable(),
                            )
                    }

                    class EventType
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            val TURN_START = of("turn_start")

                            fun of(value: String) = EventType(JsonField.of(value))
                        }

                        enum class Known {
                            TURN_START,
                        }

                        enum class Value {
                            TURN_START,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                TURN_START -> Value.TURN_START
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                TURN_START -> Known.TURN_START
                                else ->
                                    throw LlamaStackClientInvalidDataException(
                                        "Unknown EventType: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is EventType && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AgentTurnResponseTurnStartPayload && eventType == other.eventType && turnId == other.turnId && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(eventType, turnId, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "AgentTurnResponseTurnStartPayload{eventType=$eventType, turnId=$turnId, additionalProperties=$additionalProperties}"
                }

                @NoAutoDetect
                class AgentTurnResponseTurnCompletePayload
                @JsonCreator
                private constructor(
                    @JsonProperty("event_type")
                    @ExcludeMissing
                    private val eventType: JsonField<EventType> = JsonMissing.of(),
                    @JsonProperty("turn")
                    @ExcludeMissing
                    private val turn: JsonField<Turn> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun eventType(): EventType = eventType.getRequired("event_type")

                    fun turn(): Turn = turn.getRequired("turn")

                    @JsonProperty("event_type")
                    @ExcludeMissing
                    fun _eventType(): JsonField<EventType> = eventType

                    @JsonProperty("turn") @ExcludeMissing fun _turn(): JsonField<Turn> = turn

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): AgentTurnResponseTurnCompletePayload = apply {
                        if (validated) {
                            return@apply
                        }

                        eventType()
                        turn().validate()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var eventType: JsonField<EventType>? = null
                        private var turn: JsonField<Turn>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(
                            agentTurnResponseTurnCompletePayload:
                                AgentTurnResponseTurnCompletePayload
                        ) = apply {
                            eventType = agentTurnResponseTurnCompletePayload.eventType
                            turn = agentTurnResponseTurnCompletePayload.turn
                            additionalProperties =
                                agentTurnResponseTurnCompletePayload.additionalProperties
                                    .toMutableMap()
                        }

                        fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

                        fun eventType(eventType: JsonField<EventType>) = apply {
                            this.eventType = eventType
                        }

                        fun turn(turn: Turn) = turn(JsonField.of(turn))

                        fun turn(turn: JsonField<Turn>) = apply { this.turn = turn }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): AgentTurnResponseTurnCompletePayload =
                            AgentTurnResponseTurnCompletePayload(
                                checkRequired("eventType", eventType),
                                checkRequired("turn", turn),
                                additionalProperties.toImmutable(),
                            )
                    }

                    class EventType
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            val TURN_COMPLETE = of("turn_complete")

                            fun of(value: String) = EventType(JsonField.of(value))
                        }

                        enum class Known {
                            TURN_COMPLETE,
                        }

                        enum class Value {
                            TURN_COMPLETE,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                TURN_COMPLETE -> Value.TURN_COMPLETE
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                TURN_COMPLETE -> Known.TURN_COMPLETE
                                else ->
                                    throw LlamaStackClientInvalidDataException(
                                        "Unknown EventType: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is EventType && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AgentTurnResponseTurnCompletePayload && eventType == other.eventType && turn == other.turn && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(eventType, turn, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "AgentTurnResponseTurnCompletePayload{eventType=$eventType, turn=$turn, additionalProperties=$additionalProperties}"
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Event && payload == other.payload && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(payload, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Event{payload=$payload, additionalProperties=$additionalProperties}"
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
