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

    private var validated: Boolean = false

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

    fun validate(): AgentTurnCreateResponse = apply {
        if (!validated) {
            if (turn == null && agentTurnResponseStreamChunk == null) {
                throw LlamaStackClientInvalidDataException(
                    "Unknown AgentTurnCreateResponse: $_json"
                )
            }
            turn?.validate()
            agentTurnResponseStreamChunk?.validate()
            validated = true
        }
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

    @JsonDeserialize(builder = AgentTurnResponseStreamChunk.Builder::class)
    @NoAutoDetect
    class AgentTurnResponseStreamChunk
    private constructor(
        private val event: JsonField<Event>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun event(): Event = event.getRequired("event")

        @JsonProperty("event") @ExcludeMissing fun _event() = event

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): AgentTurnResponseStreamChunk = apply {
            if (!validated) {
                event().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var event: JsonField<Event> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(agentTurnResponseStreamChunk: AgentTurnResponseStreamChunk) = apply {
                this.event = agentTurnResponseStreamChunk.event
                additionalProperties(agentTurnResponseStreamChunk.additionalProperties)
            }

            fun event(event: Event) = event(JsonField.of(event))

            @JsonProperty("event")
            @ExcludeMissing
            fun event(event: JsonField<Event>) = apply { this.event = event }

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

            fun build(): AgentTurnResponseStreamChunk =
                AgentTurnResponseStreamChunk(event, additionalProperties.toImmutable())
        }

        @JsonDeserialize(builder = Event.Builder::class)
        @NoAutoDetect
        class Event
        private constructor(
            private val payload: JsonField<Payload>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun payload(): Payload = payload.getRequired("payload")

            @JsonProperty("payload") @ExcludeMissing fun _payload() = payload

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Event = apply {
                if (!validated) {
                    payload()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var payload: JsonField<Payload> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(event: Event) = apply {
                    this.payload = event.payload
                    additionalProperties(event.additionalProperties)
                }

                fun payload(payload: Payload) = payload(JsonField.of(payload))

                @JsonProperty("payload")
                @ExcludeMissing
                fun payload(payload: JsonField<Payload>) = apply { this.payload = payload }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Event = Event(payload, additionalProperties.toImmutable())
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

                private var validated: Boolean = false

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

                fun validate(): Payload = apply {
                    if (!validated) {
                        if (
                            agentTurnResponseStepStartPayload == null &&
                                agentTurnResponseStepProgressPayload == null &&
                                agentTurnResponseStepCompletePayload == null &&
                                agentTurnResponseTurnStartPayload == null &&
                                agentTurnResponseTurnCompletePayload == null
                        ) {
                            throw LlamaStackClientInvalidDataException("Unknown Payload: $_json")
                        }
                        agentTurnResponseStepStartPayload?.validate()
                        agentTurnResponseStepProgressPayload?.validate()
                        agentTurnResponseStepCompletePayload?.validate()
                        agentTurnResponseTurnStartPayload?.validate()
                        agentTurnResponseTurnCompletePayload?.validate()
                        validated = true
                    }
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

                @JsonDeserialize(builder = AgentTurnResponseStepStartPayload.Builder::class)
                @NoAutoDetect
                class AgentTurnResponseStepStartPayload
                private constructor(
                    private val eventType: JsonField<EventType>,
                    private val metadata: JsonField<Metadata>,
                    private val stepId: JsonField<String>,
                    private val stepType: JsonField<StepType>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    fun eventType(): EventType = eventType.getRequired("event_type")

                    fun metadata(): Metadata? = metadata.getNullable("metadata")

                    fun stepId(): String = stepId.getRequired("step_id")

                    fun stepType(): StepType = stepType.getRequired("step_type")

                    @JsonProperty("event_type") @ExcludeMissing fun _eventType() = eventType

                    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

                    @JsonProperty("step_id") @ExcludeMissing fun _stepId() = stepId

                    @JsonProperty("step_type") @ExcludeMissing fun _stepType() = stepType

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): AgentTurnResponseStepStartPayload = apply {
                        if (!validated) {
                            eventType()
                            metadata()?.validate()
                            stepId()
                            stepType()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var eventType: JsonField<EventType> = JsonMissing.of()
                        private var metadata: JsonField<Metadata> = JsonMissing.of()
                        private var stepId: JsonField<String> = JsonMissing.of()
                        private var stepType: JsonField<StepType> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(
                            agentTurnResponseStepStartPayload: AgentTurnResponseStepStartPayload
                        ) = apply {
                            this.eventType = agentTurnResponseStepStartPayload.eventType
                            this.metadata = agentTurnResponseStepStartPayload.metadata
                            this.stepId = agentTurnResponseStepStartPayload.stepId
                            this.stepType = agentTurnResponseStepStartPayload.stepType
                            additionalProperties(
                                agentTurnResponseStepStartPayload.additionalProperties
                            )
                        }

                        fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

                        @JsonProperty("event_type")
                        @ExcludeMissing
                        fun eventType(eventType: JsonField<EventType>) = apply {
                            this.eventType = eventType
                        }

                        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                        @JsonProperty("metadata")
                        @ExcludeMissing
                        fun metadata(metadata: JsonField<Metadata>) = apply {
                            this.metadata = metadata
                        }

                        fun stepId(stepId: String) = stepId(JsonField.of(stepId))

                        @JsonProperty("step_id")
                        @ExcludeMissing
                        fun stepId(stepId: JsonField<String>) = apply { this.stepId = stepId }

                        fun stepType(stepType: StepType) = stepType(JsonField.of(stepType))

                        @JsonProperty("step_type")
                        @ExcludeMissing
                        fun stepType(stepType: JsonField<StepType>) = apply {
                            this.stepType = stepType
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): AgentTurnResponseStepStartPayload =
                            AgentTurnResponseStepStartPayload(
                                eventType,
                                metadata,
                                stepId,
                                stepType,
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

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is EventType && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val STEP_START = EventType(JsonField.of("step_start"))

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
                    }

                    class StepType
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is StepType && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val INFERENCE = StepType(JsonField.of("inference"))

                            val TOOL_EXECUTION = StepType(JsonField.of("tool_execution"))

                            val SHIELD_CALL = StepType(JsonField.of("shield_call"))

                            val MEMORY_RETRIEVAL = StepType(JsonField.of("memory_retrieval"))

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
                    }

                    @JsonDeserialize(builder = Metadata.Builder::class)
                    @NoAutoDetect
                    class Metadata
                    private constructor(
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): Metadata = apply {
                            if (!validated) {
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(metadata: Metadata) = apply {
                                additionalProperties(metadata.additionalProperties)
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

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

                        return /* spotless:off */ other is AgentTurnResponseStepStartPayload && eventType == other.eventType && metadata == other.metadata && stepId == other.stepId && stepType == other.stepType && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(eventType, metadata, stepId, stepType, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "AgentTurnResponseStepStartPayload{eventType=$eventType, metadata=$metadata, stepId=$stepId, stepType=$stepType, additionalProperties=$additionalProperties}"
                }

                @JsonDeserialize(builder = AgentTurnResponseStepProgressPayload.Builder::class)
                @NoAutoDetect
                class AgentTurnResponseStepProgressPayload
                private constructor(
                    private val eventType: JsonField<EventType>,
                    private val modelResponseTextDelta: JsonField<String>,
                    private val stepId: JsonField<String>,
                    private val stepType: JsonField<StepType>,
                    private val toolCallDelta: JsonField<ToolCallDelta>,
                    private val toolResponseTextDelta: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    fun eventType(): EventType = eventType.getRequired("event_type")

                    fun modelResponseTextDelta(): String? =
                        modelResponseTextDelta.getNullable("model_response_text_delta")

                    fun stepId(): String = stepId.getRequired("step_id")

                    fun stepType(): StepType = stepType.getRequired("step_type")

                    fun toolCallDelta(): ToolCallDelta? =
                        toolCallDelta.getNullable("tool_call_delta")

                    fun toolResponseTextDelta(): String? =
                        toolResponseTextDelta.getNullable("tool_response_text_delta")

                    @JsonProperty("event_type") @ExcludeMissing fun _eventType() = eventType

                    @JsonProperty("model_response_text_delta")
                    @ExcludeMissing
                    fun _modelResponseTextDelta() = modelResponseTextDelta

                    @JsonProperty("step_id") @ExcludeMissing fun _stepId() = stepId

                    @JsonProperty("step_type") @ExcludeMissing fun _stepType() = stepType

                    @JsonProperty("tool_call_delta")
                    @ExcludeMissing
                    fun _toolCallDelta() = toolCallDelta

                    @JsonProperty("tool_response_text_delta")
                    @ExcludeMissing
                    fun _toolResponseTextDelta() = toolResponseTextDelta

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): AgentTurnResponseStepProgressPayload = apply {
                        if (!validated) {
                            eventType()
                            modelResponseTextDelta()
                            stepId()
                            stepType()
                            toolCallDelta()?.validate()
                            toolResponseTextDelta()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var eventType: JsonField<EventType> = JsonMissing.of()
                        private var modelResponseTextDelta: JsonField<String> = JsonMissing.of()
                        private var stepId: JsonField<String> = JsonMissing.of()
                        private var stepType: JsonField<StepType> = JsonMissing.of()
                        private var toolCallDelta: JsonField<ToolCallDelta> = JsonMissing.of()
                        private var toolResponseTextDelta: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(
                            agentTurnResponseStepProgressPayload:
                                AgentTurnResponseStepProgressPayload
                        ) = apply {
                            this.eventType = agentTurnResponseStepProgressPayload.eventType
                            this.modelResponseTextDelta =
                                agentTurnResponseStepProgressPayload.modelResponseTextDelta
                            this.stepId = agentTurnResponseStepProgressPayload.stepId
                            this.stepType = agentTurnResponseStepProgressPayload.stepType
                            this.toolCallDelta = agentTurnResponseStepProgressPayload.toolCallDelta
                            this.toolResponseTextDelta =
                                agentTurnResponseStepProgressPayload.toolResponseTextDelta
                            additionalProperties(
                                agentTurnResponseStepProgressPayload.additionalProperties
                            )
                        }

                        fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

                        @JsonProperty("event_type")
                        @ExcludeMissing
                        fun eventType(eventType: JsonField<EventType>) = apply {
                            this.eventType = eventType
                        }

                        fun modelResponseTextDelta(modelResponseTextDelta: String) =
                            modelResponseTextDelta(JsonField.of(modelResponseTextDelta))

                        @JsonProperty("model_response_text_delta")
                        @ExcludeMissing
                        fun modelResponseTextDelta(modelResponseTextDelta: JsonField<String>) =
                            apply {
                                this.modelResponseTextDelta = modelResponseTextDelta
                            }

                        fun stepId(stepId: String) = stepId(JsonField.of(stepId))

                        @JsonProperty("step_id")
                        @ExcludeMissing
                        fun stepId(stepId: JsonField<String>) = apply { this.stepId = stepId }

                        fun stepType(stepType: StepType) = stepType(JsonField.of(stepType))

                        @JsonProperty("step_type")
                        @ExcludeMissing
                        fun stepType(stepType: JsonField<StepType>) = apply {
                            this.stepType = stepType
                        }

                        fun toolCallDelta(toolCallDelta: ToolCallDelta) =
                            toolCallDelta(JsonField.of(toolCallDelta))

                        @JsonProperty("tool_call_delta")
                        @ExcludeMissing
                        fun toolCallDelta(toolCallDelta: JsonField<ToolCallDelta>) = apply {
                            this.toolCallDelta = toolCallDelta
                        }

                        fun toolResponseTextDelta(toolResponseTextDelta: String) =
                            toolResponseTextDelta(JsonField.of(toolResponseTextDelta))

                        @JsonProperty("tool_response_text_delta")
                        @ExcludeMissing
                        fun toolResponseTextDelta(toolResponseTextDelta: JsonField<String>) =
                            apply {
                                this.toolResponseTextDelta = toolResponseTextDelta
                            }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): AgentTurnResponseStepProgressPayload =
                            AgentTurnResponseStepProgressPayload(
                                eventType,
                                modelResponseTextDelta,
                                stepId,
                                stepType,
                                toolCallDelta,
                                toolResponseTextDelta,
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

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is EventType && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val STEP_PROGRESS = EventType(JsonField.of("step_progress"))

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
                    }

                    class StepType
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is StepType && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val INFERENCE = StepType(JsonField.of("inference"))

                            val TOOL_EXECUTION = StepType(JsonField.of("tool_execution"))

                            val SHIELD_CALL = StepType(JsonField.of("shield_call"))

                            val MEMORY_RETRIEVAL = StepType(JsonField.of("memory_retrieval"))

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
                    }

                    @JsonDeserialize(builder = ToolCallDelta.Builder::class)
                    @NoAutoDetect
                    class ToolCallDelta
                    private constructor(
                        private val content: JsonField<Content>,
                        private val parseStatus: JsonField<ParseStatus>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        fun content(): Content = content.getRequired("content")

                        fun parseStatus(): ParseStatus = parseStatus.getRequired("parse_status")

                        @JsonProperty("content") @ExcludeMissing fun _content() = content

                        @JsonProperty("parse_status")
                        @ExcludeMissing
                        fun _parseStatus() = parseStatus

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): ToolCallDelta = apply {
                            if (!validated) {
                                content()
                                parseStatus()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var content: JsonField<Content> = JsonMissing.of()
                            private var parseStatus: JsonField<ParseStatus> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(toolCallDelta: ToolCallDelta) = apply {
                                this.content = toolCallDelta.content
                                this.parseStatus = toolCallDelta.parseStatus
                                additionalProperties(toolCallDelta.additionalProperties)
                            }

                            fun content(content: Content) = content(JsonField.of(content))

                            @JsonProperty("content")
                            @ExcludeMissing
                            fun content(content: JsonField<Content>) = apply {
                                this.content = content
                            }

                            fun parseStatus(parseStatus: ParseStatus) =
                                parseStatus(JsonField.of(parseStatus))

                            @JsonProperty("parse_status")
                            @ExcludeMissing
                            fun parseStatus(parseStatus: JsonField<ParseStatus>) = apply {
                                this.parseStatus = parseStatus
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): ToolCallDelta =
                                ToolCallDelta(
                                    content,
                                    parseStatus,
                                    additionalProperties.toImmutable(),
                                )
                        }

                        @JsonDeserialize(using = Content.Deserializer::class)
                        @JsonSerialize(using = Content.Serializer::class)
                        class Content
                        private constructor(
                            private val string: String? = null,
                            private val toolCall: ToolCall? = null,
                            private val _json: JsonValue? = null,
                        ) {

                            private var validated: Boolean = false

                            fun string(): String? = string

                            fun toolCall(): ToolCall? = toolCall

                            fun isString(): Boolean = string != null

                            fun isToolCall(): Boolean = toolCall != null

                            fun asString(): String = string.getOrThrow("string")

                            fun asToolCall(): ToolCall = toolCall.getOrThrow("toolCall")

                            fun _json(): JsonValue? = _json

                            fun <T> accept(visitor: Visitor<T>): T {
                                return when {
                                    string != null -> visitor.visitString(string)
                                    toolCall != null -> visitor.visitToolCall(toolCall)
                                    else -> visitor.unknown(_json)
                                }
                            }

                            fun validate(): Content = apply {
                                if (!validated) {
                                    if (string == null && toolCall == null) {
                                        throw LlamaStackClientInvalidDataException(
                                            "Unknown Content: $_json"
                                        )
                                    }
                                    toolCall?.validate()
                                    validated = true
                                }
                            }

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return /* spotless:off */ other is Content && string == other.string && toolCall == other.toolCall /* spotless:on */
                            }

                            override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, toolCall) /* spotless:on */

                            override fun toString(): String =
                                when {
                                    string != null -> "Content{string=$string}"
                                    toolCall != null -> "Content{toolCall=$toolCall}"
                                    _json != null -> "Content{_unknown=$_json}"
                                    else -> throw IllegalStateException("Invalid Content")
                                }

                            companion object {

                                fun ofString(string: String) = Content(string = string)

                                fun ofToolCall(toolCall: ToolCall) = Content(toolCall = toolCall)
                            }

                            interface Visitor<out T> {

                                fun visitString(string: String): T

                                fun visitToolCall(toolCall: ToolCall): T

                                fun unknown(json: JsonValue?): T {
                                    throw LlamaStackClientInvalidDataException(
                                        "Unknown Content: $json"
                                    )
                                }
                            }

                            class Deserializer : BaseDeserializer<Content>(Content::class) {

                                override fun ObjectCodec.deserialize(node: JsonNode): Content {
                                    val json = JsonValue.fromJsonNode(node)

                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        return Content(string = it, _json = json)
                                    }
                                    tryDeserialize(node, jacksonTypeRef<ToolCall>()) {
                                            it.validate()
                                        }
                                        ?.let {
                                            return Content(toolCall = it, _json = json)
                                        }

                                    return Content(_json = json)
                                }
                            }

                            class Serializer : BaseSerializer<Content>(Content::class) {

                                override fun serialize(
                                    value: Content,
                                    generator: JsonGenerator,
                                    provider: SerializerProvider
                                ) {
                                    when {
                                        value.string != null -> generator.writeObject(value.string)
                                        value.toolCall != null ->
                                            generator.writeObject(value.toolCall)
                                        value._json != null -> generator.writeObject(value._json)
                                        else -> throw IllegalStateException("Invalid Content")
                                    }
                                }
                            }
                        }

                        class ParseStatus
                        @JsonCreator
                        private constructor(
                            private val value: JsonField<String>,
                        ) : Enum {

                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return /* spotless:off */ other is ParseStatus && value == other.value /* spotless:on */
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                val STARTED = ParseStatus(JsonField.of("started"))

                                val IN_PROGRESS = ParseStatus(JsonField.of("in_progress"))

                                val FAILURE = ParseStatus(JsonField.of("failure"))

                                val SUCCESS = ParseStatus(JsonField.of("success"))

                                fun of(value: String) = ParseStatus(JsonField.of(value))
                            }

                            enum class Known {
                                STARTED,
                                IN_PROGRESS,
                                FAILURE,
                                SUCCESS,
                            }

                            enum class Value {
                                STARTED,
                                IN_PROGRESS,
                                FAILURE,
                                SUCCESS,
                                _UNKNOWN,
                            }

                            fun value(): Value =
                                when (this) {
                                    STARTED -> Value.STARTED
                                    IN_PROGRESS -> Value.IN_PROGRESS
                                    FAILURE -> Value.FAILURE
                                    SUCCESS -> Value.SUCCESS
                                    else -> Value._UNKNOWN
                                }

                            fun known(): Known =
                                when (this) {
                                    STARTED -> Known.STARTED
                                    IN_PROGRESS -> Known.IN_PROGRESS
                                    FAILURE -> Known.FAILURE
                                    SUCCESS -> Known.SUCCESS
                                    else ->
                                        throw LlamaStackClientInvalidDataException(
                                            "Unknown ParseStatus: $value"
                                        )
                                }

                            fun asString(): String = _value().asStringOrThrow()
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is ToolCallDelta && content == other.content && parseStatus == other.parseStatus && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(content, parseStatus, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "ToolCallDelta{content=$content, parseStatus=$parseStatus, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AgentTurnResponseStepProgressPayload && eventType == other.eventType && modelResponseTextDelta == other.modelResponseTextDelta && stepId == other.stepId && stepType == other.stepType && toolCallDelta == other.toolCallDelta && toolResponseTextDelta == other.toolResponseTextDelta && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(eventType, modelResponseTextDelta, stepId, stepType, toolCallDelta, toolResponseTextDelta, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "AgentTurnResponseStepProgressPayload{eventType=$eventType, modelResponseTextDelta=$modelResponseTextDelta, stepId=$stepId, stepType=$stepType, toolCallDelta=$toolCallDelta, toolResponseTextDelta=$toolResponseTextDelta, additionalProperties=$additionalProperties}"
                }

                @JsonDeserialize(builder = AgentTurnResponseStepCompletePayload.Builder::class)
                @NoAutoDetect
                class AgentTurnResponseStepCompletePayload
                private constructor(
                    private val eventType: JsonField<EventType>,
                    private val stepDetails: JsonField<StepDetails>,
                    private val stepType: JsonField<StepType>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    fun eventType(): EventType = eventType.getRequired("event_type")

                    fun stepDetails(): StepDetails = stepDetails.getRequired("step_details")

                    fun stepType(): StepType = stepType.getRequired("step_type")

                    @JsonProperty("event_type") @ExcludeMissing fun _eventType() = eventType

                    @JsonProperty("step_details") @ExcludeMissing fun _stepDetails() = stepDetails

                    @JsonProperty("step_type") @ExcludeMissing fun _stepType() = stepType

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): AgentTurnResponseStepCompletePayload = apply {
                        if (!validated) {
                            eventType()
                            stepDetails()
                            stepType()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var eventType: JsonField<EventType> = JsonMissing.of()
                        private var stepDetails: JsonField<StepDetails> = JsonMissing.of()
                        private var stepType: JsonField<StepType> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(
                            agentTurnResponseStepCompletePayload:
                                AgentTurnResponseStepCompletePayload
                        ) = apply {
                            this.eventType = agentTurnResponseStepCompletePayload.eventType
                            this.stepDetails = agentTurnResponseStepCompletePayload.stepDetails
                            this.stepType = agentTurnResponseStepCompletePayload.stepType
                            additionalProperties(
                                agentTurnResponseStepCompletePayload.additionalProperties
                            )
                        }

                        fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

                        @JsonProperty("event_type")
                        @ExcludeMissing
                        fun eventType(eventType: JsonField<EventType>) = apply {
                            this.eventType = eventType
                        }

                        fun stepDetails(stepDetails: StepDetails) =
                            stepDetails(JsonField.of(stepDetails))

                        @JsonProperty("step_details")
                        @ExcludeMissing
                        fun stepDetails(stepDetails: JsonField<StepDetails>) = apply {
                            this.stepDetails = stepDetails
                        }

                        fun stepType(stepType: StepType) = stepType(JsonField.of(stepType))

                        @JsonProperty("step_type")
                        @ExcludeMissing
                        fun stepType(stepType: JsonField<StepType>) = apply {
                            this.stepType = stepType
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): AgentTurnResponseStepCompletePayload =
                            AgentTurnResponseStepCompletePayload(
                                eventType,
                                stepDetails,
                                stepType,
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

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is EventType && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val STEP_COMPLETE = EventType(JsonField.of("step_complete"))

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

                        private var validated: Boolean = false

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

                        fun validate(): StepDetails = apply {
                            if (!validated) {
                                if (
                                    inferenceStep == null &&
                                        toolExecutionStep == null &&
                                        shieldCallStep == null &&
                                        memoryRetrievalStep == null
                                ) {
                                    throw LlamaStackClientInvalidDataException(
                                        "Unknown StepDetails: $_json"
                                    )
                                }
                                inferenceStep?.validate()
                                toolExecutionStep?.validate()
                                shieldCallStep?.validate()
                                memoryRetrievalStep?.validate()
                                validated = true
                            }
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

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is StepType && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val INFERENCE = StepType(JsonField.of("inference"))

                            val TOOL_EXECUTION = StepType(JsonField.of("tool_execution"))

                            val SHIELD_CALL = StepType(JsonField.of("shield_call"))

                            val MEMORY_RETRIEVAL = StepType(JsonField.of("memory_retrieval"))

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
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AgentTurnResponseStepCompletePayload && eventType == other.eventType && stepDetails == other.stepDetails && stepType == other.stepType && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(eventType, stepDetails, stepType, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "AgentTurnResponseStepCompletePayload{eventType=$eventType, stepDetails=$stepDetails, stepType=$stepType, additionalProperties=$additionalProperties}"
                }

                @JsonDeserialize(builder = AgentTurnResponseTurnStartPayload.Builder::class)
                @NoAutoDetect
                class AgentTurnResponseTurnStartPayload
                private constructor(
                    private val eventType: JsonField<EventType>,
                    private val turnId: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    fun eventType(): EventType = eventType.getRequired("event_type")

                    fun turnId(): String = turnId.getRequired("turn_id")

                    @JsonProperty("event_type") @ExcludeMissing fun _eventType() = eventType

                    @JsonProperty("turn_id") @ExcludeMissing fun _turnId() = turnId

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): AgentTurnResponseTurnStartPayload = apply {
                        if (!validated) {
                            eventType()
                            turnId()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var eventType: JsonField<EventType> = JsonMissing.of()
                        private var turnId: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(
                            agentTurnResponseTurnStartPayload: AgentTurnResponseTurnStartPayload
                        ) = apply {
                            this.eventType = agentTurnResponseTurnStartPayload.eventType
                            this.turnId = agentTurnResponseTurnStartPayload.turnId
                            additionalProperties(
                                agentTurnResponseTurnStartPayload.additionalProperties
                            )
                        }

                        fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

                        @JsonProperty("event_type")
                        @ExcludeMissing
                        fun eventType(eventType: JsonField<EventType>) = apply {
                            this.eventType = eventType
                        }

                        fun turnId(turnId: String) = turnId(JsonField.of(turnId))

                        @JsonProperty("turn_id")
                        @ExcludeMissing
                        fun turnId(turnId: JsonField<String>) = apply { this.turnId = turnId }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): AgentTurnResponseTurnStartPayload =
                            AgentTurnResponseTurnStartPayload(
                                eventType,
                                turnId,
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

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is EventType && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val TURN_START = EventType(JsonField.of("turn_start"))

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

                @JsonDeserialize(builder = AgentTurnResponseTurnCompletePayload.Builder::class)
                @NoAutoDetect
                class AgentTurnResponseTurnCompletePayload
                private constructor(
                    private val eventType: JsonField<EventType>,
                    private val turn: JsonField<Turn>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    fun eventType(): EventType = eventType.getRequired("event_type")

                    fun turn(): Turn = turn.getRequired("turn")

                    @JsonProperty("event_type") @ExcludeMissing fun _eventType() = eventType

                    @JsonProperty("turn") @ExcludeMissing fun _turn() = turn

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): AgentTurnResponseTurnCompletePayload = apply {
                        if (!validated) {
                            eventType()
                            turn().validate()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var eventType: JsonField<EventType> = JsonMissing.of()
                        private var turn: JsonField<Turn> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(
                            agentTurnResponseTurnCompletePayload:
                                AgentTurnResponseTurnCompletePayload
                        ) = apply {
                            this.eventType = agentTurnResponseTurnCompletePayload.eventType
                            this.turn = agentTurnResponseTurnCompletePayload.turn
                            additionalProperties(
                                agentTurnResponseTurnCompletePayload.additionalProperties
                            )
                        }

                        fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

                        @JsonProperty("event_type")
                        @ExcludeMissing
                        fun eventType(eventType: JsonField<EventType>) = apply {
                            this.eventType = eventType
                        }

                        fun turn(turn: Turn) = turn(JsonField.of(turn))

                        @JsonProperty("turn")
                        @ExcludeMissing
                        fun turn(turn: JsonField<Turn>) = apply { this.turn = turn }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): AgentTurnResponseTurnCompletePayload =
                            AgentTurnResponseTurnCompletePayload(
                                eventType,
                                turn,
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

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is EventType && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val TURN_COMPLETE = EventType(JsonField.of("turn_complete"))

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
