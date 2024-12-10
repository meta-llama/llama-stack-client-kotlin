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
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import com.llama.llamastack.models.*
import java.time.OffsetDateTime
import java.util.Objects

class TelemetryLogEventParams
constructor(
    private val event: Event,
    private val xLlamaStackProviderData: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun event(): Event = event

    fun xLlamaStackProviderData(): String? = xLlamaStackProviderData

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    internal fun getBody(): TelemetryLogEventBody {
        return TelemetryLogEventBody(event, additionalBodyProperties)
    }

    internal fun getHeaders(): Headers {
        val headers = Headers.builder()
        this.xLlamaStackProviderData?.let {
            headers.put("X-LlamaStack-ProviderData", listOf(it.toString()))
        }
        headers.putAll(additionalHeaders)
        return headers.build()
    }

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = TelemetryLogEventBody.Builder::class)
    @NoAutoDetect
    class TelemetryLogEventBody
    internal constructor(
        private val event: Event?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("event") fun event(): Event? = event

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var event: Event? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(telemetryLogEventBody: TelemetryLogEventBody) = apply {
                this.event = telemetryLogEventBody.event
                additionalProperties(telemetryLogEventBody.additionalProperties)
            }

            @JsonProperty("event") fun event(event: Event) = apply { this.event = event }

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

            fun build(): TelemetryLogEventBody =
                TelemetryLogEventBody(
                    checkNotNull(event) { "`event` is required but was not set" },
                    additionalProperties.toImmutable()
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TelemetryLogEventBody && event == other.event && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(event, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TelemetryLogEventBody{event=$event, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var event: Event? = null
        private var xLlamaStackProviderData: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(telemetryLogEventParams: TelemetryLogEventParams) = apply {
            event = telemetryLogEventParams.event
            xLlamaStackProviderData = telemetryLogEventParams.xLlamaStackProviderData
            additionalHeaders = telemetryLogEventParams.additionalHeaders.toBuilder()
            additionalQueryParams = telemetryLogEventParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                telemetryLogEventParams.additionalBodyProperties.toMutableMap()
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

        fun xLlamaStackProviderData(xLlamaStackProviderData: String) = apply {
            this.xLlamaStackProviderData = xLlamaStackProviderData
        }

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
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): TelemetryLogEventParams =
            TelemetryLogEventParams(
                checkNotNull(event) { "`event` is required but was not set" },
                xLlamaStackProviderData,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
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

        private var validated: Boolean = false

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

        fun validate(): Event = apply {
            if (!validated) {
                if (
                    unstructuredLogEvent == null &&
                        metricEvent == null &&
                        structuredLogEvent == null
                ) {
                    throw LlamaStackClientInvalidDataException("Unknown Event: $_json")
                }
                unstructuredLogEvent?.validate()
                metricEvent?.validate()
                structuredLogEvent?.validate()
                validated = true
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

                tryDeserialize(node, jacksonTypeRef<UnstructuredLogEvent>()) { it.validate() }
                    ?.let {
                        return Event(unstructuredLogEvent = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<MetricEvent>()) { it.validate() }
                    ?.let {
                        return Event(metricEvent = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<StructuredLogEvent>()) { it.validate() }
                    ?.let {
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

        @JsonDeserialize(builder = UnstructuredLogEvent.Builder::class)
        @NoAutoDetect
        class UnstructuredLogEvent
        private constructor(
            private val attributes: JsonField<Attributes>,
            private val message: JsonField<String>,
            private val severity: JsonField<Severity>,
            private val spanId: JsonField<String>,
            private val timestamp: JsonField<OffsetDateTime>,
            private val traceId: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun attributes(): Attributes? = attributes.getNullable("attributes")

            fun message(): String = message.getRequired("message")

            fun severity(): Severity = severity.getRequired("severity")

            fun spanId(): String = spanId.getRequired("span_id")

            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            fun traceId(): String = traceId.getRequired("trace_id")

            fun type(): Type = type.getRequired("type")

            @JsonProperty("attributes") @ExcludeMissing fun _attributes() = attributes

            @JsonProperty("message") @ExcludeMissing fun _message() = message

            @JsonProperty("severity") @ExcludeMissing fun _severity() = severity

            @JsonProperty("span_id") @ExcludeMissing fun _spanId() = spanId

            @JsonProperty("timestamp") @ExcludeMissing fun _timestamp() = timestamp

            @JsonProperty("trace_id") @ExcludeMissing fun _traceId() = traceId

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): UnstructuredLogEvent = apply {
                if (!validated) {
                    attributes()?.validate()
                    message()
                    severity()
                    spanId()
                    timestamp()
                    traceId()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var attributes: JsonField<Attributes> = JsonMissing.of()
                private var message: JsonField<String> = JsonMissing.of()
                private var severity: JsonField<Severity> = JsonMissing.of()
                private var spanId: JsonField<String> = JsonMissing.of()
                private var timestamp: JsonField<OffsetDateTime> = JsonMissing.of()
                private var traceId: JsonField<String> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(unstructuredLogEvent: UnstructuredLogEvent) = apply {
                    this.attributes = unstructuredLogEvent.attributes
                    this.message = unstructuredLogEvent.message
                    this.severity = unstructuredLogEvent.severity
                    this.spanId = unstructuredLogEvent.spanId
                    this.timestamp = unstructuredLogEvent.timestamp
                    this.traceId = unstructuredLogEvent.traceId
                    this.type = unstructuredLogEvent.type
                    additionalProperties(unstructuredLogEvent.additionalProperties)
                }

                fun attributes(attributes: Attributes) = attributes(JsonField.of(attributes))

                @JsonProperty("attributes")
                @ExcludeMissing
                fun attributes(attributes: JsonField<Attributes>) = apply {
                    this.attributes = attributes
                }

                fun message(message: String) = message(JsonField.of(message))

                @JsonProperty("message")
                @ExcludeMissing
                fun message(message: JsonField<String>) = apply { this.message = message }

                fun severity(severity: Severity) = severity(JsonField.of(severity))

                @JsonProperty("severity")
                @ExcludeMissing
                fun severity(severity: JsonField<Severity>) = apply { this.severity = severity }

                fun spanId(spanId: String) = spanId(JsonField.of(spanId))

                @JsonProperty("span_id")
                @ExcludeMissing
                fun spanId(spanId: JsonField<String>) = apply { this.spanId = spanId }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                @JsonProperty("timestamp")
                @ExcludeMissing
                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun traceId(traceId: String) = traceId(JsonField.of(traceId))

                @JsonProperty("trace_id")
                @ExcludeMissing
                fun traceId(traceId: JsonField<String>) = apply { this.traceId = traceId }

                fun type(type: Type) = type(JsonField.of(type))

                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                fun build(): UnstructuredLogEvent =
                    UnstructuredLogEvent(
                        attributes,
                        message,
                        severity,
                        spanId,
                        timestamp,
                        traceId,
                        type,
                        additionalProperties.toImmutable(),
                    )
            }

            class Severity
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Severity && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val VERBOSE = Severity(JsonField.of("verbose"))

                    val DEBUG = Severity(JsonField.of("debug"))

                    val INFO = Severity(JsonField.of("info"))

                    val WARN = Severity(JsonField.of("warn"))

                    val ERROR = Severity(JsonField.of("error"))

                    val CRITICAL = Severity(JsonField.of("critical"))

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
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val UNSTRUCTURED_LOG = Type(JsonField.of("unstructured_log"))

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
            }

            @JsonDeserialize(builder = Attributes.Builder::class)
            @NoAutoDetect
            class Attributes
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Attributes = apply {
                    if (!validated) {
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(attributes: Attributes) = apply {
                        additionalProperties(attributes.additionalProperties)
                    }

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

        @JsonDeserialize(builder = MetricEvent.Builder::class)
        @NoAutoDetect
        class MetricEvent
        private constructor(
            private val attributes: JsonField<Attributes>,
            private val metric: JsonField<String>,
            private val spanId: JsonField<String>,
            private val timestamp: JsonField<OffsetDateTime>,
            private val traceId: JsonField<String>,
            private val type: JsonField<Type>,
            private val unit: JsonField<String>,
            private val value: JsonField<Double>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun attributes(): Attributes? = attributes.getNullable("attributes")

            fun metric(): String = metric.getRequired("metric")

            fun spanId(): String = spanId.getRequired("span_id")

            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            fun traceId(): String = traceId.getRequired("trace_id")

            fun type(): Type = type.getRequired("type")

            fun unit(): String = unit.getRequired("unit")

            fun value(): Double = value.getRequired("value")

            @JsonProperty("attributes") @ExcludeMissing fun _attributes() = attributes

            @JsonProperty("metric") @ExcludeMissing fun _metric() = metric

            @JsonProperty("span_id") @ExcludeMissing fun _spanId() = spanId

            @JsonProperty("timestamp") @ExcludeMissing fun _timestamp() = timestamp

            @JsonProperty("trace_id") @ExcludeMissing fun _traceId() = traceId

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonProperty("unit") @ExcludeMissing fun _unit() = unit

            @JsonProperty("value") @ExcludeMissing fun _value() = value

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): MetricEvent = apply {
                if (!validated) {
                    attributes()?.validate()
                    metric()
                    spanId()
                    timestamp()
                    traceId()
                    type()
                    unit()
                    value()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var attributes: JsonField<Attributes> = JsonMissing.of()
                private var metric: JsonField<String> = JsonMissing.of()
                private var spanId: JsonField<String> = JsonMissing.of()
                private var timestamp: JsonField<OffsetDateTime> = JsonMissing.of()
                private var traceId: JsonField<String> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var unit: JsonField<String> = JsonMissing.of()
                private var value: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(metricEvent: MetricEvent) = apply {
                    this.attributes = metricEvent.attributes
                    this.metric = metricEvent.metric
                    this.spanId = metricEvent.spanId
                    this.timestamp = metricEvent.timestamp
                    this.traceId = metricEvent.traceId
                    this.type = metricEvent.type
                    this.unit = metricEvent.unit
                    this.value = metricEvent.value
                    additionalProperties(metricEvent.additionalProperties)
                }

                fun attributes(attributes: Attributes) = attributes(JsonField.of(attributes))

                @JsonProperty("attributes")
                @ExcludeMissing
                fun attributes(attributes: JsonField<Attributes>) = apply {
                    this.attributes = attributes
                }

                fun metric(metric: String) = metric(JsonField.of(metric))

                @JsonProperty("metric")
                @ExcludeMissing
                fun metric(metric: JsonField<String>) = apply { this.metric = metric }

                fun spanId(spanId: String) = spanId(JsonField.of(spanId))

                @JsonProperty("span_id")
                @ExcludeMissing
                fun spanId(spanId: JsonField<String>) = apply { this.spanId = spanId }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                @JsonProperty("timestamp")
                @ExcludeMissing
                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun traceId(traceId: String) = traceId(JsonField.of(traceId))

                @JsonProperty("trace_id")
                @ExcludeMissing
                fun traceId(traceId: JsonField<String>) = apply { this.traceId = traceId }

                fun type(type: Type) = type(JsonField.of(type))

                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun unit(unit: String) = unit(JsonField.of(unit))

                @JsonProperty("unit")
                @ExcludeMissing
                fun unit(unit: JsonField<String>) = apply { this.unit = unit }

                fun value(value: Double) = value(JsonField.of(value))

                @JsonProperty("value")
                @ExcludeMissing
                fun value(value: JsonField<Double>) = apply { this.value = value }

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

                fun build(): MetricEvent =
                    MetricEvent(
                        attributes,
                        metric,
                        spanId,
                        timestamp,
                        traceId,
                        type,
                        unit,
                        value,
                        additionalProperties.toImmutable(),
                    )
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val METRIC = Type(JsonField.of("metric"))

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
            }

            @JsonDeserialize(builder = Attributes.Builder::class)
            @NoAutoDetect
            class Attributes
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Attributes = apply {
                    if (!validated) {
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(attributes: Attributes) = apply {
                        additionalProperties(attributes.additionalProperties)
                    }

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

        @JsonDeserialize(builder = StructuredLogEvent.Builder::class)
        @NoAutoDetect
        class StructuredLogEvent
        private constructor(
            private val attributes: JsonField<Attributes>,
            private val payload: JsonField<Payload>,
            private val spanId: JsonField<String>,
            private val timestamp: JsonField<OffsetDateTime>,
            private val traceId: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun attributes(): Attributes? = attributes.getNullable("attributes")

            fun payload(): Payload = payload.getRequired("payload")

            fun spanId(): String = spanId.getRequired("span_id")

            fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

            fun traceId(): String = traceId.getRequired("trace_id")

            fun type(): Type = type.getRequired("type")

            @JsonProperty("attributes") @ExcludeMissing fun _attributes() = attributes

            @JsonProperty("payload") @ExcludeMissing fun _payload() = payload

            @JsonProperty("span_id") @ExcludeMissing fun _spanId() = spanId

            @JsonProperty("timestamp") @ExcludeMissing fun _timestamp() = timestamp

            @JsonProperty("trace_id") @ExcludeMissing fun _traceId() = traceId

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): StructuredLogEvent = apply {
                if (!validated) {
                    attributes()?.validate()
                    payload()
                    spanId()
                    timestamp()
                    traceId()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var attributes: JsonField<Attributes> = JsonMissing.of()
                private var payload: JsonField<Payload> = JsonMissing.of()
                private var spanId: JsonField<String> = JsonMissing.of()
                private var timestamp: JsonField<OffsetDateTime> = JsonMissing.of()
                private var traceId: JsonField<String> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(structuredLogEvent: StructuredLogEvent) = apply {
                    this.attributes = structuredLogEvent.attributes
                    this.payload = structuredLogEvent.payload
                    this.spanId = structuredLogEvent.spanId
                    this.timestamp = structuredLogEvent.timestamp
                    this.traceId = structuredLogEvent.traceId
                    this.type = structuredLogEvent.type
                    additionalProperties(structuredLogEvent.additionalProperties)
                }

                fun attributes(attributes: Attributes) = attributes(JsonField.of(attributes))

                @JsonProperty("attributes")
                @ExcludeMissing
                fun attributes(attributes: JsonField<Attributes>) = apply {
                    this.attributes = attributes
                }

                fun payload(payload: Payload) = payload(JsonField.of(payload))

                @JsonProperty("payload")
                @ExcludeMissing
                fun payload(payload: JsonField<Payload>) = apply { this.payload = payload }

                fun spanId(spanId: String) = spanId(JsonField.of(spanId))

                @JsonProperty("span_id")
                @ExcludeMissing
                fun spanId(spanId: JsonField<String>) = apply { this.spanId = spanId }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                @JsonProperty("timestamp")
                @ExcludeMissing
                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun traceId(traceId: String) = traceId(JsonField.of(traceId))

                @JsonProperty("trace_id")
                @ExcludeMissing
                fun traceId(traceId: JsonField<String>) = apply { this.traceId = traceId }

                fun type(type: Type) = type(JsonField.of(type))

                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                fun build(): StructuredLogEvent =
                    StructuredLogEvent(
                        attributes,
                        payload,
                        spanId,
                        timestamp,
                        traceId,
                        type,
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

                private var validated: Boolean = false

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

                fun validate(): Payload = apply {
                    if (!validated) {
                        if (spanStartPayload == null && spanEndPayload == null) {
                            throw LlamaStackClientInvalidDataException("Unknown Payload: $_json")
                        }
                        spanStartPayload?.validate()
                        spanEndPayload?.validate()
                        validated = true
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

                        tryDeserialize(node, jacksonTypeRef<SpanStartPayload>()) { it.validate() }
                            ?.let {
                                return Payload(spanStartPayload = it, _json = json)
                            }
                        tryDeserialize(node, jacksonTypeRef<SpanEndPayload>()) { it.validate() }
                            ?.let {
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

                @JsonDeserialize(builder = SpanStartPayload.Builder::class)
                @NoAutoDetect
                class SpanStartPayload
                private constructor(
                    private val name: JsonField<String>,
                    private val parentSpanId: JsonField<String>,
                    private val type: JsonField<Type>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    fun name(): String = name.getRequired("name")

                    fun parentSpanId(): String? = parentSpanId.getNullable("parent_span_id")

                    fun type(): Type = type.getRequired("type")

                    @JsonProperty("name") @ExcludeMissing fun _name() = name

                    @JsonProperty("parent_span_id")
                    @ExcludeMissing
                    fun _parentSpanId() = parentSpanId

                    @JsonProperty("type") @ExcludeMissing fun _type() = type

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): SpanStartPayload = apply {
                        if (!validated) {
                            name()
                            parentSpanId()
                            type()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var name: JsonField<String> = JsonMissing.of()
                        private var parentSpanId: JsonField<String> = JsonMissing.of()
                        private var type: JsonField<Type> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(spanStartPayload: SpanStartPayload) = apply {
                            this.name = spanStartPayload.name
                            this.parentSpanId = spanStartPayload.parentSpanId
                            this.type = spanStartPayload.type
                            additionalProperties(spanStartPayload.additionalProperties)
                        }

                        fun name(name: String) = name(JsonField.of(name))

                        @JsonProperty("name")
                        @ExcludeMissing
                        fun name(name: JsonField<String>) = apply { this.name = name }

                        fun parentSpanId(parentSpanId: String) =
                            parentSpanId(JsonField.of(parentSpanId))

                        @JsonProperty("parent_span_id")
                        @ExcludeMissing
                        fun parentSpanId(parentSpanId: JsonField<String>) = apply {
                            this.parentSpanId = parentSpanId
                        }

                        fun type(type: Type) = type(JsonField.of(type))

                        @JsonProperty("type")
                        @ExcludeMissing
                        fun type(type: JsonField<Type>) = apply { this.type = type }

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

                        fun build(): SpanStartPayload =
                            SpanStartPayload(
                                name,
                                parentSpanId,
                                type,
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

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val SPAN_START = Type(JsonField.of("span_start"))

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

                @JsonDeserialize(builder = SpanEndPayload.Builder::class)
                @NoAutoDetect
                class SpanEndPayload
                private constructor(
                    private val status: JsonField<Status>,
                    private val type: JsonField<Type>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    fun status(): Status = status.getRequired("status")

                    fun type(): Type = type.getRequired("type")

                    @JsonProperty("status") @ExcludeMissing fun _status() = status

                    @JsonProperty("type") @ExcludeMissing fun _type() = type

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): SpanEndPayload = apply {
                        if (!validated) {
                            status()
                            type()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var status: JsonField<Status> = JsonMissing.of()
                        private var type: JsonField<Type> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(spanEndPayload: SpanEndPayload) = apply {
                            this.status = spanEndPayload.status
                            this.type = spanEndPayload.type
                            additionalProperties(spanEndPayload.additionalProperties)
                        }

                        fun status(status: Status) = status(JsonField.of(status))

                        @JsonProperty("status")
                        @ExcludeMissing
                        fun status(status: JsonField<Status>) = apply { this.status = status }

                        fun type(type: Type) = type(JsonField.of(type))

                        @JsonProperty("type")
                        @ExcludeMissing
                        fun type(type: JsonField<Type>) = apply { this.type = type }

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

                        fun build(): SpanEndPayload =
                            SpanEndPayload(
                                status,
                                type,
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

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val OK = Status(JsonField.of("ok"))

                            val ERROR = Status(JsonField.of("error"))

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
                    }

                    class Type
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

                            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val SPAN_END = Type(JsonField.of("span_end"))

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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val STRUCTURED_LOG = Type(JsonField.of("structured_log"))

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
            }

            @JsonDeserialize(builder = Attributes.Builder::class)
            @NoAutoDetect
            class Attributes
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Attributes = apply {
                    if (!validated) {
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(attributes: Attributes) = apply {
                        additionalProperties(attributes.additionalProperties)
                    }

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

        return /* spotless:off */ other is TelemetryLogEventParams && event == other.event && xLlamaStackProviderData == other.xLlamaStackProviderData && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(event, xLlamaStackProviderData, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "TelemetryLogEventParams{event=$event, xLlamaStackProviderData=$xLlamaStackProviderData, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
