// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.llama.llamastack.core.Enum
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

/** A chunk of a streamed chat completion response. */
@NoAutoDetect
class ChatCompletionResponseStreamChunk
@JsonCreator
private constructor(
    @JsonProperty("event") @ExcludeMissing private val event: JsonField<Event> = JsonMissing.of(),
    @JsonProperty("metrics")
    @ExcludeMissing
    private val metrics: JsonField<List<Metric>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The event containing the new content */
    fun event(): Event = event.getRequired("event")

    fun metrics(): List<Metric>? = metrics.getNullable("metrics")

    /** The event containing the new content */
    @JsonProperty("event") @ExcludeMissing fun _event(): JsonField<Event> = event

    @JsonProperty("metrics") @ExcludeMissing fun _metrics(): JsonField<List<Metric>> = metrics

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ChatCompletionResponseStreamChunk = apply {
        if (validated) {
            return@apply
        }

        event().validate()
        metrics()?.forEach { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [ChatCompletionResponseStreamChunk]. */
    class Builder internal constructor() {

        private var event: JsonField<Event>? = null
        private var metrics: JsonField<MutableList<Metric>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(chatCompletionResponseStreamChunk: ChatCompletionResponseStreamChunk) =
            apply {
                event = chatCompletionResponseStreamChunk.event
                metrics = chatCompletionResponseStreamChunk.metrics.map { it.toMutableList() }
                additionalProperties =
                    chatCompletionResponseStreamChunk.additionalProperties.toMutableMap()
            }

        /** The event containing the new content */
        fun event(event: Event) = event(JsonField.of(event))

        /** The event containing the new content */
        fun event(event: JsonField<Event>) = apply { this.event = event }

        fun metrics(metrics: List<Metric>) = metrics(JsonField.of(metrics))

        fun metrics(metrics: JsonField<List<Metric>>) = apply {
            this.metrics = metrics.map { it.toMutableList() }
        }

        fun addMetric(metric: Metric) = apply {
            metrics =
                (metrics ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(metric)
                }
        }

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

        fun build(): ChatCompletionResponseStreamChunk =
            ChatCompletionResponseStreamChunk(
                checkRequired("event", event),
                (metrics ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    /** The event containing the new content */
    @NoAutoDetect
    class Event
    @JsonCreator
    private constructor(
        @JsonProperty("delta")
        @ExcludeMissing
        private val delta: JsonField<ContentDelta> = JsonMissing.of(),
        @JsonProperty("event_type")
        @ExcludeMissing
        private val eventType: JsonField<EventType> = JsonMissing.of(),
        @JsonProperty("logprobs")
        @ExcludeMissing
        private val logprobs: JsonField<List<TokenLogProbs>> = JsonMissing.of(),
        @JsonProperty("stop_reason")
        @ExcludeMissing
        private val stopReason: JsonField<StopReason> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Content generated since last event. This can be one or more tokens, or a tool call. */
        fun delta(): ContentDelta = delta.getRequired("delta")

        /** Type of the event */
        fun eventType(): EventType = eventType.getRequired("event_type")

        /** Optional log probabilities for generated tokens */
        fun logprobs(): List<TokenLogProbs>? = logprobs.getNullable("logprobs")

        /** Optional reason why generation stopped, if complete */
        fun stopReason(): StopReason? = stopReason.getNullable("stop_reason")

        /** Content generated since last event. This can be one or more tokens, or a tool call. */
        @JsonProperty("delta") @ExcludeMissing fun _delta(): JsonField<ContentDelta> = delta

        /** Type of the event */
        @JsonProperty("event_type")
        @ExcludeMissing
        fun _eventType(): JsonField<EventType> = eventType

        /** Optional log probabilities for generated tokens */
        @JsonProperty("logprobs")
        @ExcludeMissing
        fun _logprobs(): JsonField<List<TokenLogProbs>> = logprobs

        /** Optional reason why generation stopped, if complete */
        @JsonProperty("stop_reason")
        @ExcludeMissing
        fun _stopReason(): JsonField<StopReason> = stopReason

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Event = apply {
            if (validated) {
                return@apply
            }

            delta().validate()
            eventType()
            logprobs()?.forEach { it.validate() }
            stopReason()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [Event]. */
        class Builder internal constructor() {

            private var delta: JsonField<ContentDelta>? = null
            private var eventType: JsonField<EventType>? = null
            private var logprobs: JsonField<MutableList<TokenLogProbs>>? = null
            private var stopReason: JsonField<StopReason> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(event: Event) = apply {
                delta = event.delta
                eventType = event.eventType
                logprobs = event.logprobs.map { it.toMutableList() }
                stopReason = event.stopReason
                additionalProperties = event.additionalProperties.toMutableMap()
            }

            /**
             * Content generated since last event. This can be one or more tokens, or a tool call.
             */
            fun delta(delta: ContentDelta) = delta(JsonField.of(delta))

            /**
             * Content generated since last event. This can be one or more tokens, or a tool call.
             */
            fun delta(delta: JsonField<ContentDelta>) = apply { this.delta = delta }

            /**
             * Content generated since last event. This can be one or more tokens, or a tool call.
             */
            fun delta(text: ContentDelta.TextDelta) = delta(ContentDelta.ofText(text))

            /**
             * Content generated since last event. This can be one or more tokens, or a tool call.
             */
            fun textDelta(text: String) = delta(ContentDelta.TextDelta.builder().text(text).build())

            /**
             * Content generated since last event. This can be one or more tokens, or a tool call.
             */
            fun delta(image: ContentDelta.ImageDelta) = delta(ContentDelta.ofImage(image))

            /**
             * Content generated since last event. This can be one or more tokens, or a tool call.
             */
            fun imageDelta(image: String) =
                delta(ContentDelta.ImageDelta.builder().image(image).build())

            /**
             * Content generated since last event. This can be one or more tokens, or a tool call.
             */
            fun delta(toolCall: ContentDelta.ToolCallDelta) =
                delta(ContentDelta.ofToolCall(toolCall))

            /** Type of the event */
            fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

            /** Type of the event */
            fun eventType(eventType: JsonField<EventType>) = apply { this.eventType = eventType }

            /** Optional log probabilities for generated tokens */
            fun logprobs(logprobs: List<TokenLogProbs>) = logprobs(JsonField.of(logprobs))

            /** Optional log probabilities for generated tokens */
            fun logprobs(logprobs: JsonField<List<TokenLogProbs>>) = apply {
                this.logprobs = logprobs.map { it.toMutableList() }
            }

            /** Optional log probabilities for generated tokens */
            fun addLogprob(logprob: TokenLogProbs) = apply {
                logprobs =
                    (logprobs ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(logprob)
                    }
            }

            /** Optional reason why generation stopped, if complete */
            fun stopReason(stopReason: StopReason) = stopReason(JsonField.of(stopReason))

            /** Optional reason why generation stopped, if complete */
            fun stopReason(stopReason: JsonField<StopReason>) = apply {
                this.stopReason = stopReason
            }

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

            fun build(): Event =
                Event(
                    checkRequired("delta", delta),
                    checkRequired("eventType", eventType),
                    (logprobs ?: JsonMissing.of()).map { it.toImmutable() },
                    stopReason,
                    additionalProperties.toImmutable(),
                )
        }

        /** Type of the event */
        class EventType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val START = of("start")

                val COMPLETE = of("complete")

                val PROGRESS = of("progress")

                fun of(value: String) = EventType(JsonField.of(value))
            }

            /** An enum containing [EventType]'s known values. */
            enum class Known {
                START,
                COMPLETE,
                PROGRESS,
            }

            /**
             * An enum containing [EventType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [EventType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                START,
                COMPLETE,
                PROGRESS,
                /**
                 * An enum member indicating that [EventType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    START -> Value.START
                    COMPLETE -> Value.COMPLETE
                    PROGRESS -> Value.PROGRESS
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LlamaStackClientInvalidDataException if this class instance's value is a not
             *   a known member.
             */
            fun known(): Known =
                when (this) {
                    START -> Known.START
                    COMPLETE -> Known.COMPLETE
                    PROGRESS -> Known.PROGRESS
                    else -> throw LlamaStackClientInvalidDataException("Unknown EventType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LlamaStackClientInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString()
                    ?: throw LlamaStackClientInvalidDataException("Value is not a String")

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is EventType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Optional reason why generation stopped, if complete */
        class StopReason @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val END_OF_TURN = of("end_of_turn")

                val END_OF_MESSAGE = of("end_of_message")

                val OUT_OF_TOKENS = of("out_of_tokens")

                fun of(value: String) = StopReason(JsonField.of(value))
            }

            /** An enum containing [StopReason]'s known values. */
            enum class Known {
                END_OF_TURN,
                END_OF_MESSAGE,
                OUT_OF_TOKENS,
            }

            /**
             * An enum containing [StopReason]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [StopReason] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                END_OF_TURN,
                END_OF_MESSAGE,
                OUT_OF_TOKENS,
                /**
                 * An enum member indicating that [StopReason] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    END_OF_TURN -> Value.END_OF_TURN
                    END_OF_MESSAGE -> Value.END_OF_MESSAGE
                    OUT_OF_TOKENS -> Value.OUT_OF_TOKENS
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LlamaStackClientInvalidDataException if this class instance's value is a not
             *   a known member.
             */
            fun known(): Known =
                when (this) {
                    END_OF_TURN -> Known.END_OF_TURN
                    END_OF_MESSAGE -> Known.END_OF_MESSAGE
                    OUT_OF_TOKENS -> Known.OUT_OF_TOKENS
                    else -> throw LlamaStackClientInvalidDataException("Unknown StopReason: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LlamaStackClientInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString()
                    ?: throw LlamaStackClientInvalidDataException("Value is not a String")

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is StopReason && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Event && delta == other.delta && eventType == other.eventType && logprobs == other.logprobs && stopReason == other.stopReason && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(delta, eventType, logprobs, stopReason, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Event{delta=$delta, eventType=$eventType, logprobs=$logprobs, stopReason=$stopReason, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Metric
    @JsonCreator
    private constructor(
        @JsonProperty("metric")
        @ExcludeMissing
        private val metric: JsonField<String> = JsonMissing.of(),
        @JsonProperty("span_id")
        @ExcludeMissing
        private val spanId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timestamp")
        @ExcludeMissing
        private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("trace_id")
        @ExcludeMissing
        private val traceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonValue = JsonMissing.of(),
        @JsonProperty("unit")
        @ExcludeMissing
        private val unit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("value")
        @ExcludeMissing
        private val value: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("attributes")
        @ExcludeMissing
        private val attributes: JsonField<Attributes> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun metric(): String = metric.getRequired("metric")

        fun spanId(): String = spanId.getRequired("span_id")

        fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

        fun traceId(): String = traceId.getRequired("trace_id")

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        fun unit(): String = unit.getRequired("unit")

        fun value(): Double = value.getRequired("value")

        fun attributes(): Attributes? = attributes.getNullable("attributes")

        @JsonProperty("metric") @ExcludeMissing fun _metric(): JsonField<String> = metric

        @JsonProperty("span_id") @ExcludeMissing fun _spanId(): JsonField<String> = spanId

        @JsonProperty("timestamp")
        @ExcludeMissing
        fun _timestamp(): JsonField<OffsetDateTime> = timestamp

        @JsonProperty("trace_id") @ExcludeMissing fun _traceId(): JsonField<String> = traceId

        @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<String> = unit

        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

        @JsonProperty("attributes")
        @ExcludeMissing
        fun _attributes(): JsonField<Attributes> = attributes

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Metric = apply {
            if (validated) {
                return@apply
            }

            metric()
            spanId()
            timestamp()
            traceId()
            _type().let {
                if (it != JsonValue.from("metric")) {
                    throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
                }
            }
            unit()
            value()
            attributes()?.validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [Metric]. */
        class Builder internal constructor() {

            private var metric: JsonField<String>? = null
            private var spanId: JsonField<String>? = null
            private var timestamp: JsonField<OffsetDateTime>? = null
            private var traceId: JsonField<String>? = null
            private var type: JsonValue = JsonValue.from("metric")
            private var unit: JsonField<String>? = null
            private var value: JsonField<Double>? = null
            private var attributes: JsonField<Attributes> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(metric: Metric) = apply {
                this.metric = metric.metric
                spanId = metric.spanId
                timestamp = metric.timestamp
                traceId = metric.traceId
                type = metric.type
                unit = metric.unit
                value = metric.value
                attributes = metric.attributes
                additionalProperties = metric.additionalProperties.toMutableMap()
            }

            fun metric(metric: String) = metric(JsonField.of(metric))

            fun metric(metric: JsonField<String>) = apply { this.metric = metric }

            fun spanId(spanId: String) = spanId(JsonField.of(spanId))

            fun spanId(spanId: JsonField<String>) = apply { this.spanId = spanId }

            fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

            fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                this.timestamp = timestamp
            }

            fun traceId(traceId: String) = traceId(JsonField.of(traceId))

            fun traceId(traceId: JsonField<String>) = apply { this.traceId = traceId }

            fun type(type: JsonValue) = apply { this.type = type }

            fun unit(unit: String) = unit(JsonField.of(unit))

            fun unit(unit: JsonField<String>) = apply { this.unit = unit }

            fun value(value: Double) = value(JsonField.of(value))

            fun value(value: JsonField<Double>) = apply { this.value = value }

            fun attributes(attributes: Attributes) = attributes(JsonField.of(attributes))

            fun attributes(attributes: JsonField<Attributes>) = apply {
                this.attributes = attributes
            }

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

            fun build(): Metric =
                Metric(
                    checkRequired("metric", metric),
                    checkRequired("spanId", spanId),
                    checkRequired("timestamp", timestamp),
                    checkRequired("traceId", traceId),
                    type,
                    checkRequired("unit", unit),
                    checkRequired("value", value),
                    attributes,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class Attributes
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Attributes = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            /** A builder for [Attributes]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(attributes: Attributes) = apply {
                    additionalProperties = attributes.additionalProperties.toMutableMap()
                }

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

                fun build(): Attributes = Attributes(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Attributes && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Attributes{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metric && metric == other.metric && spanId == other.spanId && timestamp == other.timestamp && traceId == other.traceId && type == other.type && unit == other.unit && value == other.value && attributes == other.attributes && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(metric, spanId, timestamp, traceId, type, unit, value, attributes, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Metric{metric=$metric, spanId=$spanId, timestamp=$timestamp, traceId=$traceId, type=$type, unit=$unit, value=$value, attributes=$attributes, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ChatCompletionResponseStreamChunk && event == other.event && metrics == other.metrics && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(event, metrics, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ChatCompletionResponseStreamChunk{event=$event, metrics=$metrics, additionalProperties=$additionalProperties}"
}
