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
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
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

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            unstructuredLog != null -> visitor.visitUnstructuredLog(unstructuredLog)
            metric != null -> visitor.visitMetric(metric)
            structuredLog != null -> visitor.visitStructuredLog(structuredLog)
            else -> visitor.unknown(_json)
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
                override fun visitUnstructuredLog(unstructuredLog: UnstructuredLogEvent) =
                    unstructuredLog.validity()

                override fun visitMetric(metric: MetricEvent) = metric.validity()

                override fun visitStructuredLog(structuredLog: StructuredLogEvent) =
                    structuredLog.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

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
                    return tryDeserialize(node, jacksonTypeRef<UnstructuredLogEvent>())?.let {
                        Event(unstructuredLog = it, _json = json)
                    } ?: Event(_json = json)
                }
                "metric" -> {
                    return tryDeserialize(node, jacksonTypeRef<MetricEvent>())?.let {
                        Event(metric = it, _json = json)
                    } ?: Event(_json = json)
                }
                "structured_log" -> {
                    return tryDeserialize(node, jacksonTypeRef<StructuredLogEvent>())?.let {
                        Event(structuredLog = it, _json = json)
                    } ?: Event(_json = json)
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

    class UnstructuredLogEvent
    private constructor(
        private val message: JsonField<String>,
        private val severity: JsonField<Severity>,
        private val spanId: JsonField<String>,
        private val timestamp: JsonField<OffsetDateTime>,
        private val traceId: JsonField<String>,
        private val type: JsonValue,
        private val attributes: JsonField<Attributes>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
            @JsonProperty("severity")
            @ExcludeMissing
            severity: JsonField<Severity> = JsonMissing.of(),
            @JsonProperty("span_id") @ExcludeMissing spanId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("trace_id") @ExcludeMissing traceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
            @JsonProperty("attributes")
            @ExcludeMissing
            attributes: JsonField<Attributes> = JsonMissing.of(),
        ) : this(message, severity, spanId, timestamp, traceId, type, attributes, mutableMapOf())

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun message(): String = message.getRequired("message")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun severity(): Severity = severity.getRequired("severity")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun spanId(): String = spanId.getRequired("span_id")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun traceId(): String = traceId.getRequired("trace_id")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("unstructured_log")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun attributes(): Attributes? = attributes.getNullable("attributes")

        /**
         * Returns the raw JSON value of [message].
         *
         * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

        /**
         * Returns the raw JSON value of [severity].
         *
         * Unlike [severity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("severity") @ExcludeMissing fun _severity(): JsonField<Severity> = severity

        /**
         * Returns the raw JSON value of [spanId].
         *
         * Unlike [spanId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("span_id") @ExcludeMissing fun _spanId(): JsonField<String> = spanId

        /**
         * Returns the raw JSON value of [timestamp].
         *
         * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timestamp")
        @ExcludeMissing
        fun _timestamp(): JsonField<OffsetDateTime> = timestamp

        /**
         * Returns the raw JSON value of [traceId].
         *
         * Unlike [traceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("trace_id") @ExcludeMissing fun _traceId(): JsonField<String> = traceId

        /**
         * Returns the raw JSON value of [attributes].
         *
         * Unlike [attributes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("attributes")
        @ExcludeMissing
        fun _attributes(): JsonField<Attributes> = attributes

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [UnstructuredLogEvent].
             *
             * The following fields are required:
             * ```kotlin
             * .message()
             * .severity()
             * .spanId()
             * .timestamp()
             * .traceId()
             * ```
             */
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

            /**
             * Sets [Builder.message] to an arbitrary JSON value.
             *
             * You should usually call [Builder.message] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun message(message: JsonField<String>) = apply { this.message = message }

            fun severity(severity: Severity) = severity(JsonField.of(severity))

            /**
             * Sets [Builder.severity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.severity] with a well-typed [Severity] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun severity(severity: JsonField<Severity>) = apply { this.severity = severity }

            fun spanId(spanId: String) = spanId(JsonField.of(spanId))

            /**
             * Sets [Builder.spanId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.spanId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun spanId(spanId: JsonField<String>) = apply { this.spanId = spanId }

            fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

            /**
             * Sets [Builder.timestamp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                this.timestamp = timestamp
            }

            fun traceId(traceId: String) = traceId(JsonField.of(traceId))

            /**
             * Sets [Builder.traceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.traceId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun traceId(traceId: JsonField<String>) = apply { this.traceId = traceId }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("unstructured_log")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonValue) = apply { this.type = type }

            fun attributes(attributes: Attributes) = attributes(JsonField.of(attributes))

            /**
             * Sets [Builder.attributes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.attributes] with a well-typed [Attributes] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [UnstructuredLogEvent].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .message()
             * .severity()
             * .spanId()
             * .timestamp()
             * .traceId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): UnstructuredLogEvent =
                UnstructuredLogEvent(
                    checkRequired("message", message),
                    checkRequired("severity", severity),
                    checkRequired("spanId", spanId),
                    checkRequired("timestamp", timestamp),
                    checkRequired("traceId", traceId),
                    type,
                    attributes,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): UnstructuredLogEvent = apply {
            if (validated) {
                return@apply
            }

            message()
            severity().validate()
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

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaStackClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (message.asKnown() == null) 0 else 1) +
                (severity.asKnown()?.validity() ?: 0) +
                (if (spanId.asKnown() == null) 0 else 1) +
                (if (timestamp.asKnown() == null) 0 else 1) +
                (if (traceId.asKnown() == null) 0 else 1) +
                type.let { if (it == JsonValue.from("unstructured_log")) 1 else 0 } +
                (attributes.asKnown()?.validity() ?: 0)

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

            private var validated: Boolean = false

            fun validate(): Severity = apply {
                if (validated) {
                    return@apply
                }

                known()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Severity && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Attributes
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Attributes]. */
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

                /**
                 * Returns an immutable instance of [Attributes].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Attributes = Attributes(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Attributes = apply {
                if (validated) {
                    return@apply
                }

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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

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

    class MetricEvent
    private constructor(
        private val metric: JsonField<String>,
        private val spanId: JsonField<String>,
        private val timestamp: JsonField<OffsetDateTime>,
        private val traceId: JsonField<String>,
        private val type: JsonValue,
        private val unit: JsonField<String>,
        private val value: JsonField<Double>,
        private val attributes: JsonField<Attributes>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("metric") @ExcludeMissing metric: JsonField<String> = JsonMissing.of(),
            @JsonProperty("span_id") @ExcludeMissing spanId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("trace_id") @ExcludeMissing traceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
            @JsonProperty("unit") @ExcludeMissing unit: JsonField<String> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("attributes")
            @ExcludeMissing
            attributes: JsonField<Attributes> = JsonMissing.of(),
        ) : this(metric, spanId, timestamp, traceId, type, unit, value, attributes, mutableMapOf())

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun metric(): String = metric.getRequired("metric")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun spanId(): String = spanId.getRequired("span_id")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun traceId(): String = traceId.getRequired("trace_id")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("metric")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun unit(): String = unit.getRequired("unit")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun value(): Double = value.getRequired("value")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun attributes(): Attributes? = attributes.getNullable("attributes")

        /**
         * Returns the raw JSON value of [metric].
         *
         * Unlike [metric], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metric") @ExcludeMissing fun _metric(): JsonField<String> = metric

        /**
         * Returns the raw JSON value of [spanId].
         *
         * Unlike [spanId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("span_id") @ExcludeMissing fun _spanId(): JsonField<String> = spanId

        /**
         * Returns the raw JSON value of [timestamp].
         *
         * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timestamp")
        @ExcludeMissing
        fun _timestamp(): JsonField<OffsetDateTime> = timestamp

        /**
         * Returns the raw JSON value of [traceId].
         *
         * Unlike [traceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("trace_id") @ExcludeMissing fun _traceId(): JsonField<String> = traceId

        /**
         * Returns the raw JSON value of [unit].
         *
         * Unlike [unit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<String> = unit

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

        /**
         * Returns the raw JSON value of [attributes].
         *
         * Unlike [attributes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("attributes")
        @ExcludeMissing
        fun _attributes(): JsonField<Attributes> = attributes

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [MetricEvent].
             *
             * The following fields are required:
             * ```kotlin
             * .metric()
             * .spanId()
             * .timestamp()
             * .traceId()
             * .unit()
             * .value()
             * ```
             */
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

            /**
             * Sets [Builder.metric] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metric] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metric(metric: JsonField<String>) = apply { this.metric = metric }

            fun spanId(spanId: String) = spanId(JsonField.of(spanId))

            /**
             * Sets [Builder.spanId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.spanId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun spanId(spanId: JsonField<String>) = apply { this.spanId = spanId }

            fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

            /**
             * Sets [Builder.timestamp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                this.timestamp = timestamp
            }

            fun traceId(traceId: String) = traceId(JsonField.of(traceId))

            /**
             * Sets [Builder.traceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.traceId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun traceId(traceId: JsonField<String>) = apply { this.traceId = traceId }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("metric")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonValue) = apply { this.type = type }

            fun unit(unit: String) = unit(JsonField.of(unit))

            /**
             * Sets [Builder.unit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unit] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun unit(unit: JsonField<String>) = apply { this.unit = unit }

            fun value(value: Double) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun value(value: JsonField<Double>) = apply { this.value = value }

            fun attributes(attributes: Attributes) = attributes(JsonField.of(attributes))

            /**
             * Sets [Builder.attributes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.attributes] with a well-typed [Attributes] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [MetricEvent].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .metric()
             * .spanId()
             * .timestamp()
             * .traceId()
             * .unit()
             * .value()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
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
                    additionalProperties.toMutableMap(),
                )
        }

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

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaStackClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (metric.asKnown() == null) 0 else 1) +
                (if (spanId.asKnown() == null) 0 else 1) +
                (if (timestamp.asKnown() == null) 0 else 1) +
                (if (traceId.asKnown() == null) 0 else 1) +
                type.let { if (it == JsonValue.from("metric")) 1 else 0 } +
                (if (unit.asKnown() == null) 0 else 1) +
                (if (value.asKnown() == null) 0 else 1) +
                (attributes.asKnown()?.validity() ?: 0)

        class Attributes
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Attributes]. */
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

                /**
                 * Returns an immutable instance of [Attributes].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Attributes = Attributes(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Attributes = apply {
                if (validated) {
                    return@apply
                }

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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

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

    class StructuredLogEvent
    private constructor(
        private val payload: JsonField<Payload>,
        private val spanId: JsonField<String>,
        private val timestamp: JsonField<OffsetDateTime>,
        private val traceId: JsonField<String>,
        private val type: JsonValue,
        private val attributes: JsonField<Attributes>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("payload") @ExcludeMissing payload: JsonField<Payload> = JsonMissing.of(),
            @JsonProperty("span_id") @ExcludeMissing spanId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("trace_id") @ExcludeMissing traceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
            @JsonProperty("attributes")
            @ExcludeMissing
            attributes: JsonField<Attributes> = JsonMissing.of(),
        ) : this(payload, spanId, timestamp, traceId, type, attributes, mutableMapOf())

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun payload(): Payload = payload.getRequired("payload")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun spanId(): String = spanId.getRequired("span_id")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun traceId(): String = traceId.getRequired("trace_id")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("structured_log")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun attributes(): Attributes? = attributes.getNullable("attributes")

        /**
         * Returns the raw JSON value of [payload].
         *
         * Unlike [payload], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("payload") @ExcludeMissing fun _payload(): JsonField<Payload> = payload

        /**
         * Returns the raw JSON value of [spanId].
         *
         * Unlike [spanId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("span_id") @ExcludeMissing fun _spanId(): JsonField<String> = spanId

        /**
         * Returns the raw JSON value of [timestamp].
         *
         * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timestamp")
        @ExcludeMissing
        fun _timestamp(): JsonField<OffsetDateTime> = timestamp

        /**
         * Returns the raw JSON value of [traceId].
         *
         * Unlike [traceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("trace_id") @ExcludeMissing fun _traceId(): JsonField<String> = traceId

        /**
         * Returns the raw JSON value of [attributes].
         *
         * Unlike [attributes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("attributes")
        @ExcludeMissing
        fun _attributes(): JsonField<Attributes> = attributes

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [StructuredLogEvent].
             *
             * The following fields are required:
             * ```kotlin
             * .payload()
             * .spanId()
             * .timestamp()
             * .traceId()
             * ```
             */
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

            /**
             * Sets [Builder.payload] to an arbitrary JSON value.
             *
             * You should usually call [Builder.payload] with a well-typed [Payload] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun payload(payload: JsonField<Payload>) = apply { this.payload = payload }

            /** Alias for calling [payload] with `Payload.ofSpanStart(spanStart)`. */
            fun payload(spanStart: Payload.SpanStartPayload) =
                payload(Payload.ofSpanStart(spanStart))

            /**
             * Alias for calling [payload] with the following:
             * ```kotlin
             * Payload.SpanStartPayload.builder()
             *     .name(name)
             *     .build()
             * ```
             */
            fun spanStartPayload(name: String) =
                payload(Payload.SpanStartPayload.builder().name(name).build())

            /** Alias for calling [payload] with `Payload.ofSpanEnd(spanEnd)`. */
            fun payload(spanEnd: Payload.SpanEndPayload) = payload(Payload.ofSpanEnd(spanEnd))

            /**
             * Alias for calling [payload] with the following:
             * ```kotlin
             * Payload.SpanEndPayload.builder()
             *     .status(status)
             *     .build()
             * ```
             */
            fun spanEndPayload(status: Payload.SpanEndPayload.Status) =
                payload(Payload.SpanEndPayload.builder().status(status).build())

            fun spanId(spanId: String) = spanId(JsonField.of(spanId))

            /**
             * Sets [Builder.spanId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.spanId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun spanId(spanId: JsonField<String>) = apply { this.spanId = spanId }

            fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

            /**
             * Sets [Builder.timestamp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                this.timestamp = timestamp
            }

            fun traceId(traceId: String) = traceId(JsonField.of(traceId))

            /**
             * Sets [Builder.traceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.traceId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun traceId(traceId: JsonField<String>) = apply { this.traceId = traceId }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("structured_log")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonValue) = apply { this.type = type }

            fun attributes(attributes: Attributes) = attributes(JsonField.of(attributes))

            /**
             * Sets [Builder.attributes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.attributes] with a well-typed [Attributes] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [StructuredLogEvent].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .payload()
             * .spanId()
             * .timestamp()
             * .traceId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): StructuredLogEvent =
                StructuredLogEvent(
                    checkRequired("payload", payload),
                    checkRequired("spanId", spanId),
                    checkRequired("timestamp", timestamp),
                    checkRequired("traceId", traceId),
                    type,
                    attributes,
                    additionalProperties.toMutableMap(),
                )
        }

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

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaStackClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (payload.asKnown()?.validity() ?: 0) +
                (if (spanId.asKnown() == null) 0 else 1) +
                (if (timestamp.asKnown() == null) 0 else 1) +
                (if (traceId.asKnown() == null) 0 else 1) +
                type.let { if (it == JsonValue.from("structured_log")) 1 else 0 } +
                (attributes.asKnown()?.validity() ?: 0)

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

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    spanStart != null -> visitor.visitSpanStart(spanStart)
                    spanEnd != null -> visitor.visitSpanEnd(spanEnd)
                    else -> visitor.unknown(_json)
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

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LlamaStackClientInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                accept(
                    object : Visitor<Int> {
                        override fun visitSpanStart(spanStart: SpanStartPayload) =
                            spanStart.validity()

                        override fun visitSpanEnd(spanEnd: SpanEndPayload) = spanEnd.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

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
                            return tryDeserialize(node, jacksonTypeRef<SpanStartPayload>())?.let {
                                Payload(spanStart = it, _json = json)
                            } ?: Payload(_json = json)
                        }
                        "span_end" -> {
                            return tryDeserialize(node, jacksonTypeRef<SpanEndPayload>())?.let {
                                Payload(spanEnd = it, _json = json)
                            } ?: Payload(_json = json)
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

            class SpanStartPayload
            private constructor(
                private val name: JsonField<String>,
                private val type: JsonValue,
                private val parentSpanId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                    @JsonProperty("parent_span_id")
                    @ExcludeMissing
                    parentSpanId: JsonField<String> = JsonMissing.of(),
                ) : this(name, type, parentSpanId, mutableMapOf())

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("span_start")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun parentSpanId(): String? = parentSpanId.getNullable("parent_span_id")

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [parentSpanId].
                 *
                 * Unlike [parentSpanId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("parent_span_id")
                @ExcludeMissing
                fun _parentSpanId(): JsonField<String> = parentSpanId

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [SpanStartPayload].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .name()
                     * ```
                     */
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

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("span_start")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun type(type: JsonValue) = apply { this.type = type }

                    fun parentSpanId(parentSpanId: String) =
                        parentSpanId(JsonField.of(parentSpanId))

                    /**
                     * Sets [Builder.parentSpanId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.parentSpanId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
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

                    /**
                     * Returns an immutable instance of [SpanStartPayload].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .name()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): SpanStartPayload =
                        SpanStartPayload(
                            checkRequired("name", name),
                            type,
                            parentSpanId,
                            additionalProperties.toMutableMap(),
                        )
                }

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

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaStackClientInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    (if (name.asKnown() == null) 0 else 1) +
                        type.let { if (it == JsonValue.from("span_start")) 1 else 0 } +
                        (if (parentSpanId.asKnown() == null) 0 else 1)

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

            class SpanEndPayload
            private constructor(
                private val status: JsonField<Status>,
                private val type: JsonValue,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("status")
                    @ExcludeMissing
                    status: JsonField<Status> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                ) : this(status, type, mutableMapOf())

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun status(): Status = status.getRequired("status")

                /**
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("span_end")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                /**
                 * Returns the raw JSON value of [status].
                 *
                 * Unlike [status], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [SpanEndPayload].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .status()
                     * ```
                     */
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

                    /**
                     * Sets [Builder.status] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.status] with a well-typed [Status] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun status(status: JsonField<Status>) = apply { this.status = status }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("span_end")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
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

                    /**
                     * Returns an immutable instance of [SpanEndPayload].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .status()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): SpanEndPayload =
                        SpanEndPayload(
                            checkRequired("status", status),
                            type,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): SpanEndPayload = apply {
                    if (validated) {
                        return@apply
                    }

                    status().validate()
                    _type().let {
                        if (it != JsonValue.from("span_end")) {
                            throw LlamaStackClientInvalidDataException(
                                "'type' is invalid, received $it"
                            )
                        }
                    }
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    (status.asKnown()?.validity() ?: 0) +
                        type.let { if (it == JsonValue.from("span_end")) 1 else 0 }

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

                    private var validated: Boolean = false

                    fun validate(): Status = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
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
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

        class Attributes
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Attributes]. */
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

                /**
                 * Returns an immutable instance of [Attributes].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Attributes = Attributes(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Attributes = apply {
                if (validated) {
                    return@apply
                }

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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

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
