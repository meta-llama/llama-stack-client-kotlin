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
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

class TelemetryLogEventParams
constructor(
    private val xLlamaStackProviderData: String?,
    private val body: TelemetryLogEventBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun xLlamaStackProviderData(): String? = xLlamaStackProviderData

    fun event(): Event = body.event()

    fun ttlSeconds(): Long = body.ttlSeconds()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    internal fun getBody(): TelemetryLogEventBody = body

    internal fun getHeaders(): Headers {
        val headers = Headers.builder()
        this.xLlamaStackProviderData?.let {
            headers.put("X-LlamaStack-ProviderData", listOf(it.toString()))
        }
        headers.putAll(additionalHeaders)
        return headers.build()
    }

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class TelemetryLogEventBody
    @JsonCreator
    internal constructor(
        @JsonProperty("event") private val event: Event,
        @JsonProperty("ttl_seconds") private val ttlSeconds: Long,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("event") fun event(): Event = event

        @JsonProperty("ttl_seconds") fun ttlSeconds(): Long = ttlSeconds

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var event: Event? = null
            private var ttlSeconds: Long? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(telemetryLogEventBody: TelemetryLogEventBody) = apply {
                event = telemetryLogEventBody.event
                ttlSeconds = telemetryLogEventBody.ttlSeconds
                additionalProperties = telemetryLogEventBody.additionalProperties.toMutableMap()
            }

            fun event(event: Event) = apply { this.event = event }

            fun event(unstructuredLogEvent: Event.UnstructuredLogEvent) = apply {
                this.event = Event.ofUnstructuredLogEvent(unstructuredLogEvent)
            }

            fun event(metricEvent: Event.MetricEvent) = apply {
                this.event = Event.ofMetricEvent(metricEvent)
            }

            fun event(structuredLogEvent: Event.StructuredLogEvent) = apply {
                this.event = Event.ofStructuredLogEvent(structuredLogEvent)
            }

            fun ttlSeconds(ttlSeconds: Long) = apply { this.ttlSeconds = ttlSeconds }

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

            fun build(): TelemetryLogEventBody =
                TelemetryLogEventBody(
                    checkNotNull(event) { "`event` is required but was not set" },
                    checkNotNull(ttlSeconds) { "`ttlSeconds` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TelemetryLogEventBody && event == other.event && ttlSeconds == other.ttlSeconds && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(event, ttlSeconds, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TelemetryLogEventBody{event=$event, ttlSeconds=$ttlSeconds, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var xLlamaStackProviderData: String? = null
        private var body: TelemetryLogEventBody.Builder = TelemetryLogEventBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(telemetryLogEventParams: TelemetryLogEventParams) = apply {
            xLlamaStackProviderData = telemetryLogEventParams.xLlamaStackProviderData
            body = telemetryLogEventParams.body.toBuilder()
            additionalHeaders = telemetryLogEventParams.additionalHeaders.toBuilder()
            additionalQueryParams = telemetryLogEventParams.additionalQueryParams.toBuilder()
        }

        fun xLlamaStackProviderData(xLlamaStackProviderData: String) = apply {
            this.xLlamaStackProviderData = xLlamaStackProviderData
        }

        fun event(event: Event) = apply { body.event(event) }

        fun event(unstructuredLogEvent: Event.UnstructuredLogEvent) = apply {
            body.event(unstructuredLogEvent)
        }

        fun event(metricEvent: Event.MetricEvent) = apply { body.event(metricEvent) }

        fun event(structuredLogEvent: Event.StructuredLogEvent) = apply {
            body.event(structuredLogEvent)
        }

        fun ttlSeconds(ttlSeconds: Long) = apply { body.ttlSeconds(ttlSeconds) }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun build(): TelemetryLogEventParams =
            TelemetryLogEventParams(
                xLlamaStackProviderData,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @JsonDeserialize(using = Event.Deserializer::class)
    @JsonSerialize(using = Event.Serializer::class)
    class Event
    private constructor(
        private val unstructuredLogEvent: UnstructuredLogEvent? = null,
        private val metricEvent: MetricEvent? = null,
        private val structuredLogEvent: StructuredLogEvent? = null,
        private val _json: JsonValue? = null,
    ) {

        fun unstructuredLogEvent(): UnstructuredLogEvent? = unstructuredLogEvent

        fun metricEvent(): MetricEvent? = metricEvent

        fun structuredLogEvent(): StructuredLogEvent? = structuredLogEvent

        fun isUnstructuredLogEvent(): Boolean = unstructuredLogEvent != null

        fun isMetricEvent(): Boolean = metricEvent != null

        fun isStructuredLogEvent(): Boolean = structuredLogEvent != null

        fun asUnstructuredLogEvent(): UnstructuredLogEvent =
            unstructuredLogEvent.getOrThrow("unstructuredLogEvent")

        fun asMetricEvent(): MetricEvent = metricEvent.getOrThrow("metricEvent")

        fun asStructuredLogEvent(): StructuredLogEvent =
            structuredLogEvent.getOrThrow("structuredLogEvent")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                unstructuredLogEvent != null ->
                    visitor.visitUnstructuredLogEvent(unstructuredLogEvent)
                metricEvent != null -> visitor.visitMetricEvent(metricEvent)
                structuredLogEvent != null -> visitor.visitStructuredLogEvent(structuredLogEvent)
                else -> visitor.unknown(_json)
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Event && unstructuredLogEvent == other.unstructuredLogEvent && metricEvent == other.metricEvent && structuredLogEvent == other.structuredLogEvent /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(unstructuredLogEvent, metricEvent, structuredLogEvent) /* spotless:on */

        override fun toString(): String =
            when {
                unstructuredLogEvent != null -> "Event{unstructuredLogEvent=$unstructuredLogEvent}"
                metricEvent != null -> "Event{metricEvent=$metricEvent}"
                structuredLogEvent != null -> "Event{structuredLogEvent=$structuredLogEvent}"
                _json != null -> "Event{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Event")
            }

        companion object {

            fun ofUnstructuredLogEvent(unstructuredLogEvent: UnstructuredLogEvent) =
                Event(unstructuredLogEvent = unstructuredLogEvent)

            fun ofMetricEvent(metricEvent: MetricEvent) = Event(metricEvent = metricEvent)

            fun ofStructuredLogEvent(structuredLogEvent: StructuredLogEvent) =
                Event(structuredLogEvent = structuredLogEvent)
        }

        interface Visitor<out T> {

            fun visitUnstructuredLogEvent(unstructuredLogEvent: UnstructuredLogEvent): T

            fun visitMetricEvent(metricEvent: MetricEvent): T

            fun visitStructuredLogEvent(structuredLogEvent: StructuredLogEvent): T

            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown Event: $json")
            }
        }

        class Deserializer : BaseDeserializer<Event>(Event::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Event {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<UnstructuredLogEvent>())?.let {
                    return Event(unstructuredLogEvent = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<MetricEvent>())?.let {
                    return Event(metricEvent = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<StructuredLogEvent>())?.let {
                    return Event(structuredLogEvent = it, _json = json)
                }

                return Event(_json = json)
            }
        }

        class Serializer : BaseSerializer<Event>(Event::class) {

            override fun serialize(
                value: Event,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.unstructuredLogEvent != null ->
                        generator.writeObject(value.unstructuredLogEvent)
                    value.metricEvent != null -> generator.writeObject(value.metricEvent)
                    value.structuredLogEvent != null ->
                        generator.writeObject(value.structuredLogEvent)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Event")
                }
            }
        }

        @NoAutoDetect
        class UnstructuredLogEvent
        @JsonCreator
        private constructor(
            @JsonProperty("attributes") private val attributes: Attributes?,
            @JsonProperty("message") private val message: String,
            @JsonProperty("severity") private val severity: Severity,
            @JsonProperty("span_id") private val spanId: String,
            @JsonProperty("timestamp") private val timestamp: OffsetDateTime,
            @JsonProperty("trace_id") private val traceId: String,
            @JsonProperty("type") private val type: Type,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonProperty("attributes") fun attributes(): Attributes? = attributes

            @JsonProperty("message") fun message(): String = message

            @JsonProperty("severity") fun severity(): Severity = severity

            @JsonProperty("span_id") fun spanId(): String = spanId

            @JsonProperty("timestamp") fun timestamp(): OffsetDateTime = timestamp

            @JsonProperty("trace_id") fun traceId(): String = traceId

            @JsonProperty("type") fun type(): Type = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var attributes: Attributes? = null
                private var message: String? = null
                private var severity: Severity? = null
                private var spanId: String? = null
                private var timestamp: OffsetDateTime? = null
                private var traceId: String? = null
                private var type: Type? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(unstructuredLogEvent: UnstructuredLogEvent) = apply {
                    attributes = unstructuredLogEvent.attributes
                    message = unstructuredLogEvent.message
                    severity = unstructuredLogEvent.severity
                    spanId = unstructuredLogEvent.spanId
                    timestamp = unstructuredLogEvent.timestamp
                    traceId = unstructuredLogEvent.traceId
                    type = unstructuredLogEvent.type
                    additionalProperties = unstructuredLogEvent.additionalProperties.toMutableMap()
                }

                fun attributes(attributes: Attributes) = apply { this.attributes = attributes }

                fun message(message: String) = apply { this.message = message }

                fun severity(severity: Severity) = apply { this.severity = severity }

                fun spanId(spanId: String) = apply { this.spanId = spanId }

                fun timestamp(timestamp: OffsetDateTime) = apply { this.timestamp = timestamp }

                fun traceId(traceId: String) = apply { this.traceId = traceId }

                fun type(type: Type) = apply { this.type = type }

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

                fun build(): UnstructuredLogEvent =
                    UnstructuredLogEvent(
                        attributes,
                        checkNotNull(message) { "`message` is required but was not set" },
                        checkNotNull(severity) { "`severity` is required but was not set" },
                        checkNotNull(spanId) { "`spanId` is required but was not set" },
                        checkNotNull(timestamp) { "`timestamp` is required but was not set" },
                        checkNotNull(traceId) { "`traceId` is required but was not set" },
                        checkNotNull(type) { "`type` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class Severity
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

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

                enum class Known {
                    VERBOSE,
                    DEBUG,
                    INFO,
                    WARN,
                    ERROR,
                    CRITICAL,
                }

                enum class Value {
                    VERBOSE,
                    DEBUG,
                    INFO,
                    WARN,
                    ERROR,
                    CRITICAL,
                    _UNKNOWN,
                }

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

                fun known(): Known =
                    when (this) {
                        VERBOSE -> Known.VERBOSE
                        DEBUG -> Known.DEBUG
                        INFO -> Known.INFO
                        WARN -> Known.WARN
                        ERROR -> Known.ERROR
                        CRITICAL -> Known.CRITICAL
                        else ->
                            throw LlamaStackClientInvalidDataException("Unknown Severity: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Severity && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val UNSTRUCTURED_LOG = of("unstructured_log")

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    UNSTRUCTURED_LOG,
                }

                enum class Value {
                    UNSTRUCTURED_LOG,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        UNSTRUCTURED_LOG -> Value.UNSTRUCTURED_LOG
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        UNSTRUCTURED_LOG -> Known.UNSTRUCTURED_LOG
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

            @NoAutoDetect
            class Attributes
            @JsonCreator
            private constructor(
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

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

                return /* spotless:off */ other is UnstructuredLogEvent && attributes == other.attributes && message == other.message && severity == other.severity && spanId == other.spanId && timestamp == other.timestamp && traceId == other.traceId && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(attributes, message, severity, spanId, timestamp, traceId, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UnstructuredLogEvent{attributes=$attributes, message=$message, severity=$severity, spanId=$spanId, timestamp=$timestamp, traceId=$traceId, type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class MetricEvent
        @JsonCreator
        private constructor(
            @JsonProperty("attributes") private val attributes: Attributes?,
            @JsonProperty("metric") private val metric: String,
            @JsonProperty("span_id") private val spanId: String,
            @JsonProperty("timestamp") private val timestamp: OffsetDateTime,
            @JsonProperty("trace_id") private val traceId: String,
            @JsonProperty("type") private val type: Type,
            @JsonProperty("unit") private val unit: String,
            @JsonProperty("value") private val value: Double,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonProperty("attributes") fun attributes(): Attributes? = attributes

            @JsonProperty("metric") fun metric(): String = metric

            @JsonProperty("span_id") fun spanId(): String = spanId

            @JsonProperty("timestamp") fun timestamp(): OffsetDateTime = timestamp

            @JsonProperty("trace_id") fun traceId(): String = traceId

            @JsonProperty("type") fun type(): Type = type

            @JsonProperty("unit") fun unit(): String = unit

            @JsonProperty("value") fun value(): Double = value

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var attributes: Attributes? = null
                private var metric: String? = null
                private var spanId: String? = null
                private var timestamp: OffsetDateTime? = null
                private var traceId: String? = null
                private var type: Type? = null
                private var unit: String? = null
                private var value: Double? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(metricEvent: MetricEvent) = apply {
                    attributes = metricEvent.attributes
                    metric = metricEvent.metric
                    spanId = metricEvent.spanId
                    timestamp = metricEvent.timestamp
                    traceId = metricEvent.traceId
                    type = metricEvent.type
                    unit = metricEvent.unit
                    value = metricEvent.value
                    additionalProperties = metricEvent.additionalProperties.toMutableMap()
                }

                fun attributes(attributes: Attributes) = apply { this.attributes = attributes }

                fun metric(metric: String) = apply { this.metric = metric }

                fun spanId(spanId: String) = apply { this.spanId = spanId }

                fun timestamp(timestamp: OffsetDateTime) = apply { this.timestamp = timestamp }

                fun traceId(traceId: String) = apply { this.traceId = traceId }

                fun type(type: Type) = apply { this.type = type }

                fun unit(unit: String) = apply { this.unit = unit }

                fun value(value: Double) = apply { this.value = value }

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

                fun build(): MetricEvent =
                    MetricEvent(
                        attributes,
                        checkNotNull(metric) { "`metric` is required but was not set" },
                        checkNotNull(spanId) { "`spanId` is required but was not set" },
                        checkNotNull(timestamp) { "`timestamp` is required but was not set" },
                        checkNotNull(traceId) { "`traceId` is required but was not set" },
                        checkNotNull(type) { "`type` is required but was not set" },
                        checkNotNull(unit) { "`unit` is required but was not set" },
                        checkNotNull(value) { "`value` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val METRIC = of("metric")

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    METRIC,
                }

                enum class Value {
                    METRIC,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        METRIC -> Value.METRIC
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        METRIC -> Known.METRIC
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

            @NoAutoDetect
            class Attributes
            @JsonCreator
            private constructor(
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

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

                return /* spotless:off */ other is MetricEvent && attributes == other.attributes && metric == other.metric && spanId == other.spanId && timestamp == other.timestamp && traceId == other.traceId && type == other.type && unit == other.unit && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(attributes, metric, spanId, timestamp, traceId, type, unit, value, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MetricEvent{attributes=$attributes, metric=$metric, spanId=$spanId, timestamp=$timestamp, traceId=$traceId, type=$type, unit=$unit, value=$value, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class StructuredLogEvent
        @JsonCreator
        private constructor(
            @JsonProperty("attributes") private val attributes: Attributes?,
            @JsonProperty("payload") private val payload: Payload,
            @JsonProperty("span_id") private val spanId: String,
            @JsonProperty("timestamp") private val timestamp: OffsetDateTime,
            @JsonProperty("trace_id") private val traceId: String,
            @JsonProperty("type") private val type: Type,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonProperty("attributes") fun attributes(): Attributes? = attributes

            @JsonProperty("payload") fun payload(): Payload = payload

            @JsonProperty("span_id") fun spanId(): String = spanId

            @JsonProperty("timestamp") fun timestamp(): OffsetDateTime = timestamp

            @JsonProperty("trace_id") fun traceId(): String = traceId

            @JsonProperty("type") fun type(): Type = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var attributes: Attributes? = null
                private var payload: Payload? = null
                private var spanId: String? = null
                private var timestamp: OffsetDateTime? = null
                private var traceId: String? = null
                private var type: Type? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(structuredLogEvent: StructuredLogEvent) = apply {
                    attributes = structuredLogEvent.attributes
                    payload = structuredLogEvent.payload
                    spanId = structuredLogEvent.spanId
                    timestamp = structuredLogEvent.timestamp
                    traceId = structuredLogEvent.traceId
                    type = structuredLogEvent.type
                    additionalProperties = structuredLogEvent.additionalProperties.toMutableMap()
                }

                fun attributes(attributes: Attributes) = apply { this.attributes = attributes }

                fun payload(payload: Payload) = apply { this.payload = payload }

                fun payload(spanStartPayload: Payload.SpanStartPayload) = apply {
                    this.payload = Payload.ofSpanStartPayload(spanStartPayload)
                }

                fun payload(spanEndPayload: Payload.SpanEndPayload) = apply {
                    this.payload = Payload.ofSpanEndPayload(spanEndPayload)
                }

                fun spanId(spanId: String) = apply { this.spanId = spanId }

                fun timestamp(timestamp: OffsetDateTime) = apply { this.timestamp = timestamp }

                fun traceId(traceId: String) = apply { this.traceId = traceId }

                fun type(type: Type) = apply { this.type = type }

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

                fun build(): StructuredLogEvent =
                    StructuredLogEvent(
                        attributes,
                        checkNotNull(payload) { "`payload` is required but was not set" },
                        checkNotNull(spanId) { "`spanId` is required but was not set" },
                        checkNotNull(timestamp) { "`timestamp` is required but was not set" },
                        checkNotNull(traceId) { "`traceId` is required but was not set" },
                        checkNotNull(type) { "`type` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            @JsonDeserialize(using = Payload.Deserializer::class)
            @JsonSerialize(using = Payload.Serializer::class)
            class Payload
            private constructor(
                private val spanStartPayload: SpanStartPayload? = null,
                private val spanEndPayload: SpanEndPayload? = null,
                private val _json: JsonValue? = null,
            ) {

                fun spanStartPayload(): SpanStartPayload? = spanStartPayload

                fun spanEndPayload(): SpanEndPayload? = spanEndPayload

                fun isSpanStartPayload(): Boolean = spanStartPayload != null

                fun isSpanEndPayload(): Boolean = spanEndPayload != null

                fun asSpanStartPayload(): SpanStartPayload =
                    spanStartPayload.getOrThrow("spanStartPayload")

                fun asSpanEndPayload(): SpanEndPayload = spanEndPayload.getOrThrow("spanEndPayload")

                fun _json(): JsonValue? = _json

                fun <T> accept(visitor: Visitor<T>): T {
                    return when {
                        spanStartPayload != null -> visitor.visitSpanStartPayload(spanStartPayload)
                        spanEndPayload != null -> visitor.visitSpanEndPayload(spanEndPayload)
                        else -> visitor.unknown(_json)
                    }
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Payload && spanStartPayload == other.spanStartPayload && spanEndPayload == other.spanEndPayload /* spotless:on */
                }

                override fun hashCode(): Int = /* spotless:off */ Objects.hash(spanStartPayload, spanEndPayload) /* spotless:on */

                override fun toString(): String =
                    when {
                        spanStartPayload != null -> "Payload{spanStartPayload=$spanStartPayload}"
                        spanEndPayload != null -> "Payload{spanEndPayload=$spanEndPayload}"
                        _json != null -> "Payload{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Payload")
                    }

                companion object {

                    fun ofSpanStartPayload(spanStartPayload: SpanStartPayload) =
                        Payload(spanStartPayload = spanStartPayload)

                    fun ofSpanEndPayload(spanEndPayload: SpanEndPayload) =
                        Payload(spanEndPayload = spanEndPayload)
                }

                interface Visitor<out T> {

                    fun visitSpanStartPayload(spanStartPayload: SpanStartPayload): T

                    fun visitSpanEndPayload(spanEndPayload: SpanEndPayload): T

                    fun unknown(json: JsonValue?): T {
                        throw LlamaStackClientInvalidDataException("Unknown Payload: $json")
                    }
                }

                class Deserializer : BaseDeserializer<Payload>(Payload::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Payload {
                        val json = JsonValue.fromJsonNode(node)

                        tryDeserialize(node, jacksonTypeRef<SpanStartPayload>())?.let {
                            return Payload(spanStartPayload = it, _json = json)
                        }
                        tryDeserialize(node, jacksonTypeRef<SpanEndPayload>())?.let {
                            return Payload(spanEndPayload = it, _json = json)
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
                            value.spanStartPayload != null ->
                                generator.writeObject(value.spanStartPayload)
                            value.spanEndPayload != null ->
                                generator.writeObject(value.spanEndPayload)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Payload")
                        }
                    }
                }

                @NoAutoDetect
                class SpanStartPayload
                @JsonCreator
                private constructor(
                    @JsonProperty("name") private val name: String,
                    @JsonProperty("parent_span_id") private val parentSpanId: String?,
                    @JsonProperty("type") private val type: Type,
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    @JsonProperty("name") fun name(): String = name

                    @JsonProperty("parent_span_id") fun parentSpanId(): String? = parentSpanId

                    @JsonProperty("type") fun type(): Type = type

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var name: String? = null
                        private var parentSpanId: String? = null
                        private var type: Type? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(spanStartPayload: SpanStartPayload) = apply {
                            name = spanStartPayload.name
                            parentSpanId = spanStartPayload.parentSpanId
                            type = spanStartPayload.type
                            additionalProperties =
                                spanStartPayload.additionalProperties.toMutableMap()
                        }

                        fun name(name: String) = apply { this.name = name }

                        fun parentSpanId(parentSpanId: String) = apply {
                            this.parentSpanId = parentSpanId
                        }

                        fun type(type: Type) = apply { this.type = type }

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

                        fun build(): SpanStartPayload =
                            SpanStartPayload(
                                checkNotNull(name) { "`name` is required but was not set" },
                                parentSpanId,
                                checkNotNull(type) { "`type` is required but was not set" },
                                additionalProperties.toImmutable(),
                            )
                    }

                    class Type
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            val SPAN_START = of("span_start")

                            fun of(value: String) = Type(JsonField.of(value))
                        }

                        enum class Known {
                            SPAN_START,
                        }

                        enum class Value {
                            SPAN_START,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                SPAN_START -> Value.SPAN_START
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                SPAN_START -> Known.SPAN_START
                                else ->
                                    throw LlamaStackClientInvalidDataException(
                                        "Unknown Type: $value"
                                    )
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

                        return /* spotless:off */ other is SpanStartPayload && name == other.name && parentSpanId == other.parentSpanId && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(name, parentSpanId, type, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "SpanStartPayload{name=$name, parentSpanId=$parentSpanId, type=$type, additionalProperties=$additionalProperties}"
                }

                @NoAutoDetect
                class SpanEndPayload
                @JsonCreator
                private constructor(
                    @JsonProperty("status") private val status: Status,
                    @JsonProperty("type") private val type: Type,
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    @JsonProperty("status") fun status(): Status = status

                    @JsonProperty("type") fun type(): Type = type

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var status: Status? = null
                        private var type: Type? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(spanEndPayload: SpanEndPayload) = apply {
                            status = spanEndPayload.status
                            type = spanEndPayload.type
                            additionalProperties =
                                spanEndPayload.additionalProperties.toMutableMap()
                        }

                        fun status(status: Status) = apply { this.status = status }

                        fun type(type: Type) = apply { this.type = type }

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

                        fun build(): SpanEndPayload =
                            SpanEndPayload(
                                checkNotNull(status) { "`status` is required but was not set" },
                                checkNotNull(type) { "`type` is required but was not set" },
                                additionalProperties.toImmutable(),
                            )
                    }

                    class Status
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            val OK = of("ok")

                            val ERROR = of("error")

                            fun of(value: String) = Status(JsonField.of(value))
                        }

                        enum class Known {
                            OK,
                            ERROR,
                        }

                        enum class Value {
                            OK,
                            ERROR,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                OK -> Value.OK
                                ERROR -> Value.ERROR
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                OK -> Known.OK
                                ERROR -> Known.ERROR
                                else ->
                                    throw LlamaStackClientInvalidDataException(
                                        "Unknown Status: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    class Type
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            val SPAN_END = of("span_end")

                            fun of(value: String) = Type(JsonField.of(value))
                        }

                        enum class Known {
                            SPAN_END,
                        }

                        enum class Value {
                            SPAN_END,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                SPAN_END -> Value.SPAN_END
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                SPAN_END -> Known.SPAN_END
                                else ->
                                    throw LlamaStackClientInvalidDataException(
                                        "Unknown Type: $value"
                                    )
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

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val STRUCTURED_LOG = of("structured_log")

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    STRUCTURED_LOG,
                }

                enum class Value {
                    STRUCTURED_LOG,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        STRUCTURED_LOG -> Value.STRUCTURED_LOG
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        STRUCTURED_LOG -> Known.STRUCTURED_LOG
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

            @NoAutoDetect
            class Attributes
            @JsonCreator
            private constructor(
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

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

                return /* spotless:off */ other is StructuredLogEvent && attributes == other.attributes && payload == other.payload && spanId == other.spanId && timestamp == other.timestamp && traceId == other.traceId && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(attributes, payload, spanId, timestamp, traceId, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "StructuredLogEvent{attributes=$attributes, payload=$payload, spanId=$spanId, timestamp=$timestamp, traceId=$traceId, type=$type, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TelemetryLogEventParams && xLlamaStackProviderData == other.xLlamaStackProviderData && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(xLlamaStackProviderData, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "TelemetryLogEventParams{xLlamaStackProviderData=$xLlamaStackProviderData, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
