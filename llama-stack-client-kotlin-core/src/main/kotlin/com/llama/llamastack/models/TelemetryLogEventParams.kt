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
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

class TelemetryLogEventParams
constructor(
    private val xLlamaStackClientVersion: String?,
    private val xLlamaStackProviderData: String?,
    private val body: TelemetryLogEventBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun xLlamaStackClientVersion(): String? = xLlamaStackClientVersion

    fun xLlamaStackProviderData(): String? = xLlamaStackProviderData

    fun event(): Event = body.event()

    fun ttlSeconds(): Long = body.ttlSeconds()

    fun _event(): JsonField<Event> = body._event()

    fun _ttlSeconds(): JsonField<Long> = body._ttlSeconds()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getBody(): TelemetryLogEventBody = body

    internal fun getHeaders(): Headers {
        val headers = Headers.builder()
        this.xLlamaStackClientVersion?.let {
            headers.put("X-LlamaStack-Client-Version", listOf(it.toString()))
        }
        this.xLlamaStackProviderData?.let {
            headers.put("X-LlamaStack-Provider-Data", listOf(it.toString()))
        }
        headers.putAll(additionalHeaders)
        return headers.build()
    }

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class TelemetryLogEventBody
    @JsonCreator
    internal constructor(
        @JsonProperty("event")
        @ExcludeMissing
        private val event: JsonField<Event> = JsonMissing.of(),
        @JsonProperty("ttl_seconds")
        @ExcludeMissing
        private val ttlSeconds: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun event(): Event = event.getRequired("event")

        fun ttlSeconds(): Long = ttlSeconds.getRequired("ttl_seconds")

        @JsonProperty("event") @ExcludeMissing fun _event(): JsonField<Event> = event

        @JsonProperty("ttl_seconds") @ExcludeMissing fun _ttlSeconds(): JsonField<Long> = ttlSeconds

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): TelemetryLogEventBody = apply {
            if (validated) {
                return@apply
            }

            event().validate()
            ttlSeconds()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var event: JsonField<Event>? = null
            private var ttlSeconds: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(telemetryLogEventBody: TelemetryLogEventBody) = apply {
                event = telemetryLogEventBody.event
                ttlSeconds = telemetryLogEventBody.ttlSeconds
                additionalProperties = telemetryLogEventBody.additionalProperties.toMutableMap()
            }

            fun event(event: Event) = event(JsonField.of(event))

            fun event(event: JsonField<Event>) = apply { this.event = event }

            fun event(unstructuredLog: Event.UnstructuredLog) =
                event(Event.ofUnstructuredLog(unstructuredLog))

            fun event(metric: Event.Metric) = event(Event.ofMetric(metric))

            fun event(structuredLog: Event.StructuredLog) =
                event(Event.ofStructuredLog(structuredLog))

            fun ttlSeconds(ttlSeconds: Long) = ttlSeconds(JsonField.of(ttlSeconds))

            fun ttlSeconds(ttlSeconds: JsonField<Long>) = apply { this.ttlSeconds = ttlSeconds }

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
                    checkRequired("event", event),
                    checkRequired("ttlSeconds", ttlSeconds),
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

        private var xLlamaStackClientVersion: String? = null
        private var xLlamaStackProviderData: String? = null
        private var body: TelemetryLogEventBody.Builder = TelemetryLogEventBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(telemetryLogEventParams: TelemetryLogEventParams) = apply {
            xLlamaStackClientVersion = telemetryLogEventParams.xLlamaStackClientVersion
            xLlamaStackProviderData = telemetryLogEventParams.xLlamaStackProviderData
            body = telemetryLogEventParams.body.toBuilder()
            additionalHeaders = telemetryLogEventParams.additionalHeaders.toBuilder()
            additionalQueryParams = telemetryLogEventParams.additionalQueryParams.toBuilder()
        }

        fun xLlamaStackClientVersion(xLlamaStackClientVersion: String?) = apply {
            this.xLlamaStackClientVersion = xLlamaStackClientVersion
        }

        fun xLlamaStackProviderData(xLlamaStackProviderData: String?) = apply {
            this.xLlamaStackProviderData = xLlamaStackProviderData
        }

        fun event(event: Event) = apply { body.event(event) }

        fun event(event: JsonField<Event>) = apply { body.event(event) }

        fun event(unstructuredLog: Event.UnstructuredLog) = apply { body.event(unstructuredLog) }

        fun event(metric: Event.Metric) = apply { body.event(metric) }

        fun event(structuredLog: Event.StructuredLog) = apply { body.event(structuredLog) }

        fun ttlSeconds(ttlSeconds: Long) = apply { body.ttlSeconds(ttlSeconds) }

        fun ttlSeconds(ttlSeconds: JsonField<Long>) = apply { body.ttlSeconds(ttlSeconds) }

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

        fun build(): TelemetryLogEventParams =
            TelemetryLogEventParams(
                xLlamaStackClientVersion,
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
        private val unstructuredLog: UnstructuredLog? = null,
        private val metric: Metric? = null,
        private val structuredLog: StructuredLog? = null,
        private val _json: JsonValue? = null,
    ) {

        fun unstructuredLog(): UnstructuredLog? = unstructuredLog

        fun metric(): Metric? = metric

        fun structuredLog(): StructuredLog? = structuredLog

        fun isUnstructuredLog(): Boolean = unstructuredLog != null

        fun isMetric(): Boolean = metric != null

        fun isStructuredLog(): Boolean = structuredLog != null

        fun asUnstructuredLog(): UnstructuredLog = unstructuredLog.getOrThrow("unstructuredLog")

        fun asMetric(): Metric = metric.getOrThrow("metric")

        fun asStructuredLog(): StructuredLog = structuredLog.getOrThrow("structuredLog")

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
                    override fun visitUnstructuredLog(unstructuredLog: UnstructuredLog) {
                        unstructuredLog.validate()
                    }

                    override fun visitMetric(metric: Metric) {
                        metric.validate()
                    }

                    override fun visitStructuredLog(structuredLog: StructuredLog) {
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

            fun ofUnstructuredLog(unstructuredLog: UnstructuredLog) =
                Event(unstructuredLog = unstructuredLog)

            fun ofMetric(metric: Metric) = Event(metric = metric)

            fun ofStructuredLog(structuredLog: StructuredLog) = Event(structuredLog = structuredLog)
        }

        interface Visitor<out T> {

            fun visitUnstructuredLog(unstructuredLog: UnstructuredLog): T

            fun visitMetric(metric: Metric): T

            fun visitStructuredLog(structuredLog: StructuredLog): T

            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown Event: $json")
            }
        }

        class Deserializer : BaseDeserializer<Event>(Event::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Event {
                val json = JsonValue.fromJsonNode(node)
                val type = json.asObject()?.get("type")?.asString()

                when (type) {
                    "unstructured_log" -> {
                        tryDeserialize(node, jacksonTypeRef<UnstructuredLog>()) { it.validate() }
                            ?.let {
                                return Event(unstructuredLog = it, _json = json)
                            }
                    }
                    "metric" -> {
                        tryDeserialize(node, jacksonTypeRef<Metric>()) { it.validate() }
                            ?.let {
                                return Event(metric = it, _json = json)
                            }
                    }
                    "structured_log" -> {
                        tryDeserialize(node, jacksonTypeRef<StructuredLog>()) { it.validate() }
                            ?.let {
                                return Event(structuredLog = it, _json = json)
                            }
                    }
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
                    value.unstructuredLog != null -> generator.writeObject(value.unstructuredLog)
                    value.metric != null -> generator.writeObject(value.metric)
                    value.structuredLog != null -> generator.writeObject(value.structuredLog)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Event")
                }
            }
        }

        @NoAutoDetect
        class UnstructuredLog
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
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
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

            fun type(): Type = type.getRequired("type")

            fun attributes(): Attributes? = attributes.getNullable("attributes")

            @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

            @JsonProperty("severity")
            @ExcludeMissing
            fun _severity(): JsonField<Severity> = severity

            @JsonProperty("span_id") @ExcludeMissing fun _spanId(): JsonField<String> = spanId

            @JsonProperty("timestamp")
            @ExcludeMissing
            fun _timestamp(): JsonField<OffsetDateTime> = timestamp

            @JsonProperty("trace_id") @ExcludeMissing fun _traceId(): JsonField<String> = traceId

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonProperty("attributes")
            @ExcludeMissing
            fun _attributes(): JsonField<Attributes> = attributes

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): UnstructuredLog = apply {
                if (validated) {
                    return@apply
                }

                message()
                severity()
                spanId()
                timestamp()
                traceId()
                type()
                attributes()?.validate()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var message: JsonField<String>? = null
                private var severity: JsonField<Severity>? = null
                private var spanId: JsonField<String>? = null
                private var timestamp: JsonField<OffsetDateTime>? = null
                private var traceId: JsonField<String>? = null
                private var type: JsonField<Type>? = null
                private var attributes: JsonField<Attributes> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(unstructuredLog: UnstructuredLog) = apply {
                    message = unstructuredLog.message
                    severity = unstructuredLog.severity
                    spanId = unstructuredLog.spanId
                    timestamp = unstructuredLog.timestamp
                    traceId = unstructuredLog.traceId
                    type = unstructuredLog.type
                    attributes = unstructuredLog.attributes
                    additionalProperties = unstructuredLog.additionalProperties.toMutableMap()
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

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                fun build(): UnstructuredLog =
                    UnstructuredLog(
                        checkRequired("message", message),
                        checkRequired("severity", severity),
                        checkRequired("spanId", spanId),
                        checkRequired("timestamp", timestamp),
                        checkRequired("traceId", traceId),
                        checkRequired("type", type),
                        attributes,
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

                return /* spotless:off */ other is UnstructuredLog && message == other.message && severity == other.severity && spanId == other.spanId && timestamp == other.timestamp && traceId == other.traceId && type == other.type && attributes == other.attributes && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(message, severity, spanId, timestamp, traceId, type, attributes, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UnstructuredLog{message=$message, severity=$severity, spanId=$spanId, timestamp=$timestamp, traceId=$traceId, type=$type, attributes=$attributes, additionalProperties=$additionalProperties}"
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
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
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

            fun type(): Type = type.getRequired("type")

            fun unit(): String = unit.getRequired("unit")

            fun value(): Double = value.getRequired("value")

            fun attributes(): Attributes? = attributes.getNullable("attributes")

            @JsonProperty("metric") @ExcludeMissing fun _metric(): JsonField<String> = metric

            @JsonProperty("span_id") @ExcludeMissing fun _spanId(): JsonField<String> = spanId

            @JsonProperty("timestamp")
            @ExcludeMissing
            fun _timestamp(): JsonField<OffsetDateTime> = timestamp

            @JsonProperty("trace_id") @ExcludeMissing fun _traceId(): JsonField<String> = traceId

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                type()
                unit()
                value()
                attributes()?.validate()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var metric: JsonField<String>? = null
                private var spanId: JsonField<String>? = null
                private var timestamp: JsonField<OffsetDateTime>? = null
                private var traceId: JsonField<String>? = null
                private var type: JsonField<Type>? = null
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

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                fun build(): Metric =
                    Metric(
                        checkRequired("metric", metric),
                        checkRequired("spanId", spanId),
                        checkRequired("timestamp", timestamp),
                        checkRequired("traceId", traceId),
                        checkRequired("type", type),
                        checkRequired("unit", unit),
                        checkRequired("value", value),
                        attributes,
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

                return /* spotless:off */ other is Metric && metric == other.metric && spanId == other.spanId && timestamp == other.timestamp && traceId == other.traceId && type == other.type && unit == other.unit && value == other.value && attributes == other.attributes && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(metric, spanId, timestamp, traceId, type, unit, value, attributes, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Metric{metric=$metric, spanId=$spanId, timestamp=$timestamp, traceId=$traceId, type=$type, unit=$unit, value=$value, attributes=$attributes, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class StructuredLog
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
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
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

            fun type(): Type = type.getRequired("type")

            fun attributes(): Attributes? = attributes.getNullable("attributes")

            @JsonProperty("payload") @ExcludeMissing fun _payload(): JsonField<Payload> = payload

            @JsonProperty("span_id") @ExcludeMissing fun _spanId(): JsonField<String> = spanId

            @JsonProperty("timestamp")
            @ExcludeMissing
            fun _timestamp(): JsonField<OffsetDateTime> = timestamp

            @JsonProperty("trace_id") @ExcludeMissing fun _traceId(): JsonField<String> = traceId

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonProperty("attributes")
            @ExcludeMissing
            fun _attributes(): JsonField<Attributes> = attributes

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): StructuredLog = apply {
                if (validated) {
                    return@apply
                }

                payload().validate()
                spanId()
                timestamp()
                traceId()
                type()
                attributes()?.validate()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var payload: JsonField<Payload>? = null
                private var spanId: JsonField<String>? = null
                private var timestamp: JsonField<OffsetDateTime>? = null
                private var traceId: JsonField<String>? = null
                private var type: JsonField<Type>? = null
                private var attributes: JsonField<Attributes> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(structuredLog: StructuredLog) = apply {
                    payload = structuredLog.payload
                    spanId = structuredLog.spanId
                    timestamp = structuredLog.timestamp
                    traceId = structuredLog.traceId
                    type = structuredLog.type
                    attributes = structuredLog.attributes
                    additionalProperties = structuredLog.additionalProperties.toMutableMap()
                }

                fun payload(payload: Payload) = payload(JsonField.of(payload))

                fun payload(payload: JsonField<Payload>) = apply { this.payload = payload }

                fun payload(spanStart: Payload.SpanStart) = payload(Payload.ofSpanStart(spanStart))

                fun payload(spanEnd: Payload.SpanEnd) = payload(Payload.ofSpanEnd(spanEnd))

                fun spanId(spanId: String) = spanId(JsonField.of(spanId))

                fun spanId(spanId: JsonField<String>) = apply { this.spanId = spanId }

                fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                    this.timestamp = timestamp
                }

                fun traceId(traceId: String) = traceId(JsonField.of(traceId))

                fun traceId(traceId: JsonField<String>) = apply { this.traceId = traceId }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                fun build(): StructuredLog =
                    StructuredLog(
                        checkRequired("payload", payload),
                        checkRequired("spanId", spanId),
                        checkRequired("timestamp", timestamp),
                        checkRequired("traceId", traceId),
                        checkRequired("type", type),
                        attributes,
                        additionalProperties.toImmutable(),
                    )
            }

            @JsonDeserialize(using = Payload.Deserializer::class)
            @JsonSerialize(using = Payload.Serializer::class)
            class Payload
            private constructor(
                private val spanStart: SpanStart? = null,
                private val spanEnd: SpanEnd? = null,
                private val _json: JsonValue? = null,
            ) {

                fun spanStart(): SpanStart? = spanStart

                fun spanEnd(): SpanEnd? = spanEnd

                fun isSpanStart(): Boolean = spanStart != null

                fun isSpanEnd(): Boolean = spanEnd != null

                fun asSpanStart(): SpanStart = spanStart.getOrThrow("spanStart")

                fun asSpanEnd(): SpanEnd = spanEnd.getOrThrow("spanEnd")

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
                            override fun visitSpanStart(spanStart: SpanStart) {
                                spanStart.validate()
                            }

                            override fun visitSpanEnd(spanEnd: SpanEnd) {
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

                    fun ofSpanStart(spanStart: SpanStart) = Payload(spanStart = spanStart)

                    fun ofSpanEnd(spanEnd: SpanEnd) = Payload(spanEnd = spanEnd)
                }

                interface Visitor<out T> {

                    fun visitSpanStart(spanStart: SpanStart): T

                    fun visitSpanEnd(spanEnd: SpanEnd): T

                    fun unknown(json: JsonValue?): T {
                        throw LlamaStackClientInvalidDataException("Unknown Payload: $json")
                    }
                }

                class Deserializer : BaseDeserializer<Payload>(Payload::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Payload {
                        val json = JsonValue.fromJsonNode(node)
                        val type = json.asObject()?.get("type")?.asString()

                        when (type) {
                            "span_start" -> {
                                tryDeserialize(node, jacksonTypeRef<SpanStart>()) { it.validate() }
                                    ?.let {
                                        return Payload(spanStart = it, _json = json)
                                    }
                            }
                            "span_end" -> {
                                tryDeserialize(node, jacksonTypeRef<SpanEnd>()) { it.validate() }
                                    ?.let {
                                        return Payload(spanEnd = it, _json = json)
                                    }
                            }
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
                            value.spanStart != null -> generator.writeObject(value.spanStart)
                            value.spanEnd != null -> generator.writeObject(value.spanEnd)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Payload")
                        }
                    }
                }

                @NoAutoDetect
                class SpanStart
                @JsonCreator
                private constructor(
                    @JsonProperty("name")
                    @ExcludeMissing
                    private val name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("type")
                    @ExcludeMissing
                    private val type: JsonField<Type> = JsonMissing.of(),
                    @JsonProperty("parent_span_id")
                    @ExcludeMissing
                    private val parentSpanId: JsonField<String> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun name(): String = name.getRequired("name")

                    fun type(): Type = type.getRequired("type")

                    fun parentSpanId(): String? = parentSpanId.getNullable("parent_span_id")

                    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                    @JsonProperty("parent_span_id")
                    @ExcludeMissing
                    fun _parentSpanId(): JsonField<String> = parentSpanId

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): SpanStart = apply {
                        if (validated) {
                            return@apply
                        }

                        name()
                        type()
                        parentSpanId()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var name: JsonField<String>? = null
                        private var type: JsonField<Type>? = null
                        private var parentSpanId: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(spanStart: SpanStart) = apply {
                            name = spanStart.name
                            type = spanStart.type
                            parentSpanId = spanStart.parentSpanId
                            additionalProperties = spanStart.additionalProperties.toMutableMap()
                        }

                        fun name(name: String) = name(JsonField.of(name))

                        fun name(name: JsonField<String>) = apply { this.name = name }

                        fun type(type: Type) = type(JsonField.of(type))

                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        fun parentSpanId(parentSpanId: String) =
                            parentSpanId(JsonField.of(parentSpanId))

                        fun parentSpanId(parentSpanId: JsonField<String>) = apply {
                            this.parentSpanId = parentSpanId
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

                        fun build(): SpanStart =
                            SpanStart(
                                checkRequired("name", name),
                                checkRequired("type", type),
                                parentSpanId,
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

                        return /* spotless:off */ other is SpanStart && name == other.name && type == other.type && parentSpanId == other.parentSpanId && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(name, type, parentSpanId, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "SpanStart{name=$name, type=$type, parentSpanId=$parentSpanId, additionalProperties=$additionalProperties}"
                }

                @NoAutoDetect
                class SpanEnd
                @JsonCreator
                private constructor(
                    @JsonProperty("status")
                    @ExcludeMissing
                    private val status: JsonField<Status> = JsonMissing.of(),
                    @JsonProperty("type")
                    @ExcludeMissing
                    private val type: JsonField<Type> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun status(): Status = status.getRequired("status")

                    fun type(): Type = type.getRequired("type")

                    @JsonProperty("status")
                    @ExcludeMissing
                    fun _status(): JsonField<Status> = status

                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): SpanEnd = apply {
                        if (validated) {
                            return@apply
                        }

                        status()
                        type()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var status: JsonField<Status>? = null
                        private var type: JsonField<Type>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(spanEnd: SpanEnd) = apply {
                            status = spanEnd.status
                            type = spanEnd.type
                            additionalProperties = spanEnd.additionalProperties.toMutableMap()
                        }

                        fun status(status: Status) = status(JsonField.of(status))

                        fun status(status: JsonField<Status>) = apply { this.status = status }

                        fun type(type: Type) = type(JsonField.of(type))

                        fun type(type: JsonField<Type>) = apply { this.type = type }

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

                        fun build(): SpanEnd =
                            SpanEnd(
                                checkRequired("status", status),
                                checkRequired("type", type),
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

                        return /* spotless:off */ other is SpanEnd && status == other.status && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(status, type, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "SpanEnd{status=$status, type=$type, additionalProperties=$additionalProperties}"
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

                return /* spotless:off */ other is StructuredLog && payload == other.payload && spanId == other.spanId && timestamp == other.timestamp && traceId == other.traceId && type == other.type && attributes == other.attributes && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(payload, spanId, timestamp, traceId, type, attributes, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "StructuredLog{payload=$payload, spanId=$spanId, timestamp=$timestamp, traceId=$traceId, type=$type, attributes=$attributes, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TelemetryLogEventParams && xLlamaStackClientVersion == other.xLlamaStackClientVersion && xLlamaStackProviderData == other.xLlamaStackProviderData && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(xLlamaStackClientVersion, xLlamaStackProviderData, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "TelemetryLogEventParams{xLlamaStackClientVersion=$xLlamaStackClientVersion, xLlamaStackProviderData=$xLlamaStackProviderData, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
