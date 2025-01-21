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
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class SpanWithStatus
@JsonCreator
private constructor(
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("span_id")
    @ExcludeMissing
    private val spanId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("start_time")
    @ExcludeMissing
    private val startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("trace_id")
    @ExcludeMissing
    private val traceId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("attributes")
    @ExcludeMissing
    private val attributes: JsonField<Attributes> = JsonMissing.of(),
    @JsonProperty("end_time")
    @ExcludeMissing
    private val endTime: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("parent_span_id")
    @ExcludeMissing
    private val parentSpanId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun name(): String = name.getRequired("name")

    fun spanId(): String = spanId.getRequired("span_id")

    fun startTime(): OffsetDateTime = startTime.getRequired("start_time")

    fun traceId(): String = traceId.getRequired("trace_id")

    fun attributes(): Attributes? = attributes.getNullable("attributes")

    fun endTime(): OffsetDateTime? = endTime.getNullable("end_time")

    fun parentSpanId(): String? = parentSpanId.getNullable("parent_span_id")

    fun status(): Status? = status.getNullable("status")

    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    @JsonProperty("span_id") @ExcludeMissing fun _spanId(): JsonField<String> = spanId

    @JsonProperty("start_time")
    @ExcludeMissing
    fun _startTime(): JsonField<OffsetDateTime> = startTime

    @JsonProperty("trace_id") @ExcludeMissing fun _traceId(): JsonField<String> = traceId

    @JsonProperty("attributes")
    @ExcludeMissing
    fun _attributes(): JsonField<Attributes> = attributes

    @JsonProperty("end_time") @ExcludeMissing fun _endTime(): JsonField<OffsetDateTime> = endTime

    @JsonProperty("parent_span_id")
    @ExcludeMissing
    fun _parentSpanId(): JsonField<String> = parentSpanId

    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): SpanWithStatus = apply {
        if (validated) {
            return@apply
        }

        name()
        spanId()
        startTime()
        traceId()
        attributes()?.validate()
        endTime()
        parentSpanId()
        status()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var name: JsonField<String>? = null
        private var spanId: JsonField<String>? = null
        private var startTime: JsonField<OffsetDateTime>? = null
        private var traceId: JsonField<String>? = null
        private var attributes: JsonField<Attributes> = JsonMissing.of()
        private var endTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var parentSpanId: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(spanWithStatus: SpanWithStatus) = apply {
            name = spanWithStatus.name
            spanId = spanWithStatus.spanId
            startTime = spanWithStatus.startTime
            traceId = spanWithStatus.traceId
            attributes = spanWithStatus.attributes
            endTime = spanWithStatus.endTime
            parentSpanId = spanWithStatus.parentSpanId
            status = spanWithStatus.status
            additionalProperties = spanWithStatus.additionalProperties.toMutableMap()
        }

        fun name(name: String) = name(JsonField.of(name))

        fun name(name: JsonField<String>) = apply { this.name = name }

        fun spanId(spanId: String) = spanId(JsonField.of(spanId))

        fun spanId(spanId: JsonField<String>) = apply { this.spanId = spanId }

        fun startTime(startTime: OffsetDateTime) = startTime(JsonField.of(startTime))

        fun startTime(startTime: JsonField<OffsetDateTime>) = apply { this.startTime = startTime }

        fun traceId(traceId: String) = traceId(JsonField.of(traceId))

        fun traceId(traceId: JsonField<String>) = apply { this.traceId = traceId }

        fun attributes(attributes: Attributes) = attributes(JsonField.of(attributes))

        fun attributes(attributes: JsonField<Attributes>) = apply { this.attributes = attributes }

        fun endTime(endTime: OffsetDateTime) = endTime(JsonField.of(endTime))

        fun endTime(endTime: JsonField<OffsetDateTime>) = apply { this.endTime = endTime }

        fun parentSpanId(parentSpanId: String) = parentSpanId(JsonField.of(parentSpanId))

        fun parentSpanId(parentSpanId: JsonField<String>) = apply {
            this.parentSpanId = parentSpanId
        }

        fun status(status: Status) = status(JsonField.of(status))

        fun status(status: JsonField<Status>) = apply { this.status = status }

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

        fun build(): SpanWithStatus =
            SpanWithStatus(
                checkNotNull(name) { "`name` is required but was not set" },
                checkNotNull(spanId) { "`spanId` is required but was not set" },
                checkNotNull(startTime) { "`startTime` is required but was not set" },
                checkNotNull(traceId) { "`traceId` is required but was not set" },
                attributes,
                endTime,
                parentSpanId,
                status,
                additionalProperties.toImmutable(),
            )
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

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

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

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
                else -> throw LlamaStackClientInvalidDataException("Unknown Status: $value")
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SpanWithStatus && name == other.name && spanId == other.spanId && startTime == other.startTime && traceId == other.traceId && attributes == other.attributes && endTime == other.endTime && parentSpanId == other.parentSpanId && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(name, spanId, startTime, traceId, attributes, endTime, parentSpanId, status, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SpanWithStatus{name=$name, spanId=$spanId, startTime=$startTime, traceId=$traceId, attributes=$attributes, endTime=$endTime, parentSpanId=$parentSpanId, status=$status, additionalProperties=$additionalProperties}"
}
