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
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(using = Event.Deserializer::class)
@JsonSerialize(using = Event.Serializer::class)
class Event
private constructor(
    private val unstructuredLog: UnstructuredLogEvent? = null,
    private val metric: MetricEvent? = null,
    private val structuredLog: StructuredLogEvent? = null,
    private val _json: JsonValue? = null,
) {

    fun unstructuredLog(): UnstructuredLogEvent? = unstructuredLog

    fun metric(): MetricEvent? = metric

    fun structuredLog(): StructuredLogEvent? = structuredLog

    fun isUnstructuredLog(): Boolean = unstructuredLog != null

    fun isMetric(): Boolean = metric != null

    fun isStructuredLog(): Boolean = structuredLog != null

    fun asUnstructuredLog(): UnstructuredLogEvent = unstructuredLog.getOrThrow("unstructuredLog")

    fun asMetric(): MetricEvent = metric.getOrThrow("metric")

    fun asStructuredLog(): StructuredLogEvent = structuredLog.getOrThrow("structuredLog")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            unstructuredLog != null -> visitor.visitUnstructuredLog(unstructuredLog)
            metric != null -> visitor.visitMetric(metric)
            structuredLog != null -> visitor.visitStructuredLog(structuredLog)
            else -> visitor.unknown(_json)
        }
    }

    private var validated: Boolean = false

    fun validate(): Event = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitUnstructuredLog(unstructuredLog: UnstructuredLogEvent) {
                    unstructuredLog.validate()
                }

                override fun visitMetric(metric: MetricEvent) {
                    metric.validate()
                }

                override fun visitStructuredLog(structuredLog: StructuredLogEvent) {
                    structuredLog.validate()
                }
            }
        )
        validated = true
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Event && unstructuredLog == other.unstructuredLog && metric == other.metric && structuredLog == other.structuredLog /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(unstructuredLog, metric, structuredLog) /* spotless:on */

    override fun toString(): String =
        when {
            unstructuredLog != null -> "Event{unstructuredLog=$unstructuredLog}"
            metric != null -> "Event{metric=$metric}"
            structuredLog != null -> "Event{structuredLog=$structuredLog}"
            _json != null -> "Event{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid Event")
        }

    companion object {

        fun ofUnstructuredLog(unstructuredLog: UnstructuredLogEvent) =
            Event(unstructuredLog = unstructuredLog)

        fun ofMetric(metric: MetricEvent) = Event(metric = metric)

        fun ofStructuredLog(structuredLog: StructuredLogEvent) =
            Event(structuredLog = structuredLog)
    }

    /** An interface that defines how to map each variant of [Event] to a value of type [T]. */
    interface Visitor<out T> {

        fun visitUnstructuredLog(unstructuredLog: UnstructuredLogEvent): T

        fun visitMetric(metric: MetricEvent): T

        fun visitStructuredLog(structuredLog: StructuredLogEvent): T

        /**
         * Maps an unknown variant of [Event] to a value of type [T].
         *
         * An instance of [Event] can contain an unknown variant if it was deserialized from data
         * that doesn't match any known variant. For example, if the SDK is on an older version than
         * the API, then the API may respond with new variants that the SDK is unaware of.
         *
         * @throws LlamaStackClientInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LlamaStackClientInvalidDataException("Unknown Event: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<Event>(Event::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): Event {
            val json = JsonValue.fromJsonNode(node)
            val type = json.asObject()?.get("type")?.asString()

            when (type) {
                "unstructured_log" -> {
                    tryDeserialize(node, jacksonTypeRef<UnstructuredLogEvent>()) { it.validate() }
                        ?.let {
                            return Event(unstructuredLog = it, _json = json)
                        }
                }
                "metric" -> {
                    tryDeserialize(node, jacksonTypeRef<MetricEvent>()) { it.validate() }
                        ?.let {
                            return Event(metric = it, _json = json)
                        }
                }
                "structured_log" -> {
                    tryDeserialize(node, jacksonTypeRef<StructuredLogEvent>()) { it.validate() }
                        ?.let {
                            return Event(structuredLog = it, _json = json)
                        }
                }
            }

            return Event(_json = json)
        }
    }

    internal class Serializer : BaseSerializer<Event>(Event::class) {

        override fun serialize(
            value: Event,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.unstructuredLog != null -> generator.writeObject(value.unstructuredLog)
                value.metric != null -> generator.writeObject(value.metric)
                value.structuredLog != null -> generator.writeObject(value.structuredLog)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid Event")
            }
        }
    }

    @NoAutoDetect
    class UnstructuredLogEvent
    @JsonCreator
    private constructor(
        @JsonProperty("message")
        @ExcludeMissing
        private val message: JsonField<String> = JsonMissing.of(),
        @JsonProperty("severity")
        @ExcludeMissing
        private val severity: JsonField<Severity> = JsonMissing.of(),
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
        @JsonProperty("attributes")
        @ExcludeMissing
        private val attributes: JsonField<Attributes> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun message(): String = message.getRequired("message")

        fun severity(): Severity = severity.getRequired("severity")

        fun spanId(): String = spanId.getRequired("span_id")

        fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

        fun traceId(): String = traceId.getRequired("trace_id")

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        fun attributes(): Attributes? = attributes.getNullable("attributes")

        @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

        @JsonProperty("severity") @ExcludeMissing fun _severity(): JsonField<Severity> = severity

        @JsonProperty("span_id") @ExcludeMissing fun _spanId(): JsonField<String> = spanId

        @JsonProperty("timestamp")
        @ExcludeMissing
        fun _timestamp(): JsonField<OffsetDateTime> = timestamp

        @JsonProperty("trace_id") @ExcludeMissing fun _traceId(): JsonField<String> = traceId

        @JsonProperty("attributes")
        @ExcludeMissing
        fun _attributes(): JsonField<Attributes> = attributes

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): UnstructuredLogEvent = apply {
            if (validated) {
                return@apply
            }

            message()
            severity()
            spanId()
            timestamp()
            traceId()
            _type().let {
                if (it != JsonValue.from("unstructured_log")) {
                    throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
                }
            }
            attributes()?.validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [UnstructuredLogEvent]. */
        class Builder internal constructor() {

            private var message: JsonField<String>? = null
            private var severity: JsonField<Severity>? = null
            private var spanId: JsonField<String>? = null
            private var timestamp: JsonField<OffsetDateTime>? = null
            private var traceId: JsonField<String>? = null
            private var type: JsonValue = JsonValue.from("unstructured_log")
            private var attributes: JsonField<Attributes> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(unstructuredLogEvent: UnstructuredLogEvent) = apply {
                message = unstructuredLogEvent.message
                severity = unstructuredLogEvent.severity
                spanId = unstructuredLogEvent.spanId
                timestamp = unstructuredLogEvent.timestamp
                traceId = unstructuredLogEvent.traceId
                type = unstructuredLogEvent.type
                attributes = unstructuredLogEvent.attributes
                additionalProperties = unstructuredLogEvent.additionalProperties.toMutableMap()
            }

            fun message(message: String) = message(JsonField.of(message))

            fun message(message: JsonField<String>) = apply { this.message = message }

            fun severity(severity: Severity) = severity(JsonField.of(severity))

            fun severity(severity: JsonField<Severity>) = apply { this.severity = severity }

            fun spanId(spanId: String) = spanId(JsonField.of(spanId))

            fun spanId(spanId: JsonField<String>) = apply { this.spanId = spanId }

            fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

            fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                this.timestamp = timestamp
            }

            fun traceId(traceId: String) = traceId(JsonField.of(traceId))

            fun traceId(traceId: JsonField<String>) = apply { this.traceId = traceId }

            fun type(type: JsonValue) = apply { this.type = type }

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

            fun build(): UnstructuredLogEvent =
                UnstructuredLogEvent(
                    checkRequired("message", message),
                    checkRequired("severity", severity),
                    checkRequired("spanId", spanId),
                    checkRequired("timestamp", timestamp),
                    checkRequired("traceId", traceId),
                    type,
                    attributes,
                    additionalProperties.toImmutable(),
                )
        }

        class Severity @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val VERBOSE = of("verbose")

                val DEBUG = of("debug")

                val INFO = of("info")

                val WARN = of("warn")

                val ERROR = of("error")

                val CRITICAL = of("critical")

                fun of(value: String) = Severity(JsonField.of(value))
            }

            /** An enum containing [Severity]'s known values. */
            enum class Known {
                VERBOSE,
                DEBUG,
                INFO,
                WARN,
                ERROR,
                CRITICAL,
            }

            /**
             * An enum containing [Severity]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Severity] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                VERBOSE,
                DEBUG,
                INFO,
                WARN,
                ERROR,
                CRITICAL,
                /**
                 * An enum member indicating that [Severity] was instantiated with an unknown value.
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
                    VERBOSE -> Value.VERBOSE
                    DEBUG -> Value.DEBUG
                    INFO -> Value.INFO
                    WARN -> Value.WARN
                    ERROR -> Value.ERROR
                    CRITICAL -> Value.CRITICAL
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
                    VERBOSE -> Known.VERBOSE
                    DEBUG -> Known.DEBUG
                    INFO -> Known.INFO
                    WARN -> Known.WARN
                    ERROR -> Known.ERROR
                    CRITICAL -> Known.CRITICAL
                    else -> throw LlamaStackClientInvalidDataException("Unknown Severity: $value")
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

                return /* spotless:off */ other is Severity && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
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

            return /* spotless:off */ other is UnstructuredLogEvent && message == other.message && severity == other.severity && spanId == other.spanId && timestamp == other.timestamp && traceId == other.traceId && type == other.type && attributes == other.attributes && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(message, severity, spanId, timestamp, traceId, type, attributes, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UnstructuredLogEvent{message=$message, severity=$severity, spanId=$spanId, timestamp=$timestamp, traceId=$traceId, type=$type, attributes=$attributes, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class MetricEvent
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

        fun validate(): MetricEvent = apply {
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

        /** A builder for [MetricEvent]. */
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

            internal fun from(metricEvent: MetricEvent) = apply {
                metric = metricEvent.metric
                spanId = metricEvent.spanId
                timestamp = metricEvent.timestamp
                traceId = metricEvent.traceId
                type = metricEvent.type
                unit = metricEvent.unit
                value = metricEvent.value
                attributes = metricEvent.attributes
                additionalProperties = metricEvent.additionalProperties.toMutableMap()
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

            fun build(): MetricEvent =
                MetricEvent(
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

            return /* spotless:off */ other is MetricEvent && metric == other.metric && spanId == other.spanId && timestamp == other.timestamp && traceId == other.traceId && type == other.type && unit == other.unit && value == other.value && attributes == other.attributes && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(metric, spanId, timestamp, traceId, type, unit, value, attributes, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "MetricEvent{metric=$metric, spanId=$spanId, timestamp=$timestamp, traceId=$traceId, type=$type, unit=$unit, value=$value, attributes=$attributes, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class StructuredLogEvent
    @JsonCreator
    private constructor(
        @JsonProperty("payload")
        @ExcludeMissing
        private val payload: JsonField<Payload> = JsonMissing.of(),
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
        @JsonProperty("attributes")
        @ExcludeMissing
        private val attributes: JsonField<Attributes> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun payload(): Payload = payload.getRequired("payload")

        fun spanId(): String = spanId.getRequired("span_id")

        fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

        fun traceId(): String = traceId.getRequired("trace_id")

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        fun attributes(): Attributes? = attributes.getNullable("attributes")

        @JsonProperty("payload") @ExcludeMissing fun _payload(): JsonField<Payload> = payload

        @JsonProperty("span_id") @ExcludeMissing fun _spanId(): JsonField<String> = spanId

        @JsonProperty("timestamp")
        @ExcludeMissing
        fun _timestamp(): JsonField<OffsetDateTime> = timestamp

        @JsonProperty("trace_id") @ExcludeMissing fun _traceId(): JsonField<String> = traceId

        @JsonProperty("attributes")
        @ExcludeMissing
        fun _attributes(): JsonField<Attributes> = attributes

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): StructuredLogEvent = apply {
            if (validated) {
                return@apply
            }

            payload().validate()
            spanId()
            timestamp()
            traceId()
            _type().let {
                if (it != JsonValue.from("structured_log")) {
                    throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
                }
            }
            attributes()?.validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [StructuredLogEvent]. */
        class Builder internal constructor() {

            private var payload: JsonField<Payload>? = null
            private var spanId: JsonField<String>? = null
            private var timestamp: JsonField<OffsetDateTime>? = null
            private var traceId: JsonField<String>? = null
            private var type: JsonValue = JsonValue.from("structured_log")
            private var attributes: JsonField<Attributes> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(structuredLogEvent: StructuredLogEvent) = apply {
                payload = structuredLogEvent.payload
                spanId = structuredLogEvent.spanId
                timestamp = structuredLogEvent.timestamp
                traceId = structuredLogEvent.traceId
                type = structuredLogEvent.type
                attributes = structuredLogEvent.attributes
                additionalProperties = structuredLogEvent.additionalProperties.toMutableMap()
            }

            fun payload(payload: Payload) = payload(JsonField.of(payload))

            fun payload(payload: JsonField<Payload>) = apply { this.payload = payload }

            fun payload(spanStart: Payload.SpanStartPayload) =
                payload(Payload.ofSpanStart(spanStart))

            fun spanStartPayload(name: String) =
                payload(Payload.SpanStartPayload.builder().name(name).build())

            fun payload(spanEnd: Payload.SpanEndPayload) = payload(Payload.ofSpanEnd(spanEnd))

            fun spanEndPayload(status: Payload.SpanEndPayload.Status) =
                payload(Payload.SpanEndPayload.builder().status(status).build())

            fun spanId(spanId: String) = spanId(JsonField.of(spanId))

            fun spanId(spanId: JsonField<String>) = apply { this.spanId = spanId }

            fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

            fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                this.timestamp = timestamp
            }

            fun traceId(traceId: String) = traceId(JsonField.of(traceId))

            fun traceId(traceId: JsonField<String>) = apply { this.traceId = traceId }

            fun type(type: JsonValue) = apply { this.type = type }

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

            fun build(): StructuredLogEvent =
                StructuredLogEvent(
                    checkRequired("payload", payload),
                    checkRequired("spanId", spanId),
                    checkRequired("timestamp", timestamp),
                    checkRequired("traceId", traceId),
                    type,
                    attributes,
                    additionalProperties.toImmutable(),
                )
        }

        @JsonDeserialize(using = Payload.Deserializer::class)
        @JsonSerialize(using = Payload.Serializer::class)
        class Payload
        private constructor(
            private val spanStart: SpanStartPayload? = null,
            private val spanEnd: SpanEndPayload? = null,
            private val _json: JsonValue? = null,
        ) {

            fun spanStart(): SpanStartPayload? = spanStart

            fun spanEnd(): SpanEndPayload? = spanEnd

            fun isSpanStart(): Boolean = spanStart != null

            fun isSpanEnd(): Boolean = spanEnd != null

            fun asSpanStart(): SpanStartPayload = spanStart.getOrThrow("spanStart")

            fun asSpanEnd(): SpanEndPayload = spanEnd.getOrThrow("spanEnd")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    spanStart != null -> visitor.visitSpanStart(spanStart)
                    spanEnd != null -> visitor.visitSpanEnd(spanEnd)
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
                        override fun visitSpanStart(spanStart: SpanStartPayload) {
                            spanStart.validate()
                        }

                        override fun visitSpanEnd(spanEnd: SpanEndPayload) {
                            spanEnd.validate()
                        }
                    }
                )
                validated = true
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Payload && spanStart == other.spanStart && spanEnd == other.spanEnd /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(spanStart, spanEnd) /* spotless:on */

            override fun toString(): String =
                when {
                    spanStart != null -> "Payload{spanStart=$spanStart}"
                    spanEnd != null -> "Payload{spanEnd=$spanEnd}"
                    _json != null -> "Payload{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Payload")
                }

            companion object {

                fun ofSpanStart(spanStart: SpanStartPayload) = Payload(spanStart = spanStart)

                fun ofSpanEnd(spanEnd: SpanEndPayload) = Payload(spanEnd = spanEnd)
            }

            /**
             * An interface that defines how to map each variant of [Payload] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitSpanStart(spanStart: SpanStartPayload): T

                fun visitSpanEnd(spanEnd: SpanEndPayload): T

                /**
                 * Maps an unknown variant of [Payload] to a value of type [T].
                 *
                 * An instance of [Payload] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws LlamaStackClientInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw LlamaStackClientInvalidDataException("Unknown Payload: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Payload>(Payload::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Payload {
                    val json = JsonValue.fromJsonNode(node)
                    val type = json.asObject()?.get("type")?.asString()

                    when (type) {
                        "span_start" -> {
                            tryDeserialize(node, jacksonTypeRef<SpanStartPayload>()) {
                                    it.validate()
                                }
                                ?.let {
                                    return Payload(spanStart = it, _json = json)
                                }
                        }
                        "span_end" -> {
                            tryDeserialize(node, jacksonTypeRef<SpanEndPayload>()) { it.validate() }
                                ?.let {
                                    return Payload(spanEnd = it, _json = json)
                                }
                        }
                    }

                    return Payload(_json = json)
                }
            }

            internal class Serializer : BaseSerializer<Payload>(Payload::class) {

                override fun serialize(
                    value: Payload,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.spanStart != null -> generator.writeObject(value.spanStart)
                        value.spanEnd != null -> generator.writeObject(value.spanEnd)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Payload")
                    }
                }
            }

            @NoAutoDetect
            class SpanStartPayload
            @JsonCreator
            private constructor(
                @JsonProperty("name")
                @ExcludeMissing
                private val name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                private val type: JsonValue = JsonMissing.of(),
                @JsonProperty("parent_span_id")
                @ExcludeMissing
                private val parentSpanId: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun name(): String = name.getRequired("name")

                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                fun parentSpanId(): String? = parentSpanId.getNullable("parent_span_id")

                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                @JsonProperty("parent_span_id")
                @ExcludeMissing
                fun _parentSpanId(): JsonField<String> = parentSpanId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): SpanStartPayload = apply {
                    if (validated) {
                        return@apply
                    }

                    name()
                    _type().let {
                        if (it != JsonValue.from("span_start")) {
                            throw LlamaStackClientInvalidDataException(
                                "'type' is invalid, received $it"
                            )
                        }
                    }
                    parentSpanId()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                /** A builder for [SpanStartPayload]. */
                class Builder internal constructor() {

                    private var name: JsonField<String>? = null
                    private var type: JsonValue = JsonValue.from("span_start")
                    private var parentSpanId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(spanStartPayload: SpanStartPayload) = apply {
                        name = spanStartPayload.name
                        type = spanStartPayload.type
                        parentSpanId = spanStartPayload.parentSpanId
                        additionalProperties = spanStartPayload.additionalProperties.toMutableMap()
                    }

                    fun name(name: String) = name(JsonField.of(name))

                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun type(type: JsonValue) = apply { this.type = type }

                    fun parentSpanId(parentSpanId: String) =
                        parentSpanId(JsonField.of(parentSpanId))

                    fun parentSpanId(parentSpanId: JsonField<String>) = apply {
                        this.parentSpanId = parentSpanId
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

                    fun build(): SpanStartPayload =
                        SpanStartPayload(
                            checkRequired("name", name),
                            type,
                            parentSpanId,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is SpanStartPayload && name == other.name && type == other.type && parentSpanId == other.parentSpanId && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(name, type, parentSpanId, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SpanStartPayload{name=$name, type=$type, parentSpanId=$parentSpanId, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class SpanEndPayload
            @JsonCreator
            private constructor(
                @JsonProperty("status")
                @ExcludeMissing
                private val status: JsonField<Status> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                private val type: JsonValue = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun status(): Status = status.getRequired("status")

                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): SpanEndPayload = apply {
                    if (validated) {
                        return@apply
                    }

                    status()
                    _type().let {
                        if (it != JsonValue.from("span_end")) {
                            throw LlamaStackClientInvalidDataException(
                                "'type' is invalid, received $it"
                            )
                        }
                    }
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                /** A builder for [SpanEndPayload]. */
                class Builder internal constructor() {

                    private var status: JsonField<Status>? = null
                    private var type: JsonValue = JsonValue.from("span_end")
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(spanEndPayload: SpanEndPayload) = apply {
                        status = spanEndPayload.status
                        type = spanEndPayload.type
                        additionalProperties = spanEndPayload.additionalProperties.toMutableMap()
                    }

                    fun status(status: Status) = status(JsonField.of(status))

                    fun status(status: JsonField<Status>) = apply { this.status = status }

                    fun type(type: JsonValue) = apply { this.type = type }

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

                    fun build(): SpanEndPayload =
                        SpanEndPayload(
                            checkRequired("status", status),
                            type,
                            additionalProperties.toImmutable(),
                        )
                }

                class Status
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val OK = of("ok")

                        val ERROR = of("error")

                        fun of(value: String) = Status(JsonField.of(value))
                    }

                    /** An enum containing [Status]'s known values. */
                    enum class Known {
                        OK,
                        ERROR,
                    }

                    /**
                     * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Status] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        OK,
                        ERROR,
                        /**
                         * An enum member indicating that [Status] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            OK -> Value.OK
                            ERROR -> Value.ERROR
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws LlamaStackClientInvalidDataException if this class instance's value
                     *   is a not a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            OK -> Known.OK
                            ERROR -> Known.ERROR
                            else ->
                                throw LlamaStackClientInvalidDataException("Unknown Status: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws LlamaStackClientInvalidDataException if this class instance's value
                     *   does not have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString()
                            ?: throw LlamaStackClientInvalidDataException("Value is not a String")

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Status && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is SpanEndPayload && status == other.status && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(status, type, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SpanEndPayload{status=$status, type=$type, additionalProperties=$additionalProperties}"
            }
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

            return /* spotless:off */ other is StructuredLogEvent && payload == other.payload && spanId == other.spanId && timestamp == other.timestamp && traceId == other.traceId && type == other.type && attributes == other.attributes && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(payload, spanId, timestamp, traceId, type, attributes, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "StructuredLogEvent{payload=$payload, spanId=$spanId, timestamp=$timestamp, traceId=$traceId, type=$type, attributes=$attributes, additionalProperties=$additionalProperties}"
    }
}
