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
    @JsonProperty("attributes")
    @ExcludeMissing
    private val attributes: JsonField<Attributes> = JsonMissing.of(),
    @JsonProperty("end_time")
    @ExcludeMissing
    private val endTime: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("parent_span_id")
    @ExcludeMissing
    private val parentSpanId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("span_id")
    @ExcludeMissing
    private val spanId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("start_time")
    @ExcludeMissing
    private val startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("trace_id")
    @ExcludeMissing
    private val traceId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun attributes(): Attributes? = attributes.getNullable("attributes")

    fun endTime(): OffsetDateTime? = endTime.getNullable("end_time")

    fun name(): String = name.getRequired("name")

    fun parentSpanId(): String? = parentSpanId.getNullable("parent_span_id")

    fun spanId(): String = spanId.getRequired("span_id")

    fun startTime(): OffsetDateTime = startTime.getRequired("start_time")

    fun status(): Status? = status.getNullable("status")

    fun traceId(): String = traceId.getRequired("trace_id")

    @JsonProperty("attributes") @ExcludeMissing fun _attributes() = attributes

    @JsonProperty("end_time") @ExcludeMissing fun _endTime() = endTime

    @JsonProperty("name") @ExcludeMissing fun _name() = name

    @JsonProperty("parent_span_id") @ExcludeMissing fun _parentSpanId() = parentSpanId

    @JsonProperty("span_id") @ExcludeMissing fun _spanId() = spanId

    @JsonProperty("start_time") @ExcludeMissing fun _startTime() = startTime

    @JsonProperty("status") @ExcludeMissing fun _status() = status

    @JsonProperty("trace_id") @ExcludeMissing fun _traceId() = traceId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): SpanWithStatus = apply {
        if (!validated) {
            attributes()?.validate()
            endTime()
            name()
            parentSpanId()
            spanId()
            startTime()
            status()
            traceId()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var attributes: JsonField<Attributes> = JsonMissing.of()
        private var endTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var parentSpanId: JsonField<String> = JsonMissing.of()
        private var spanId: JsonField<String> = JsonMissing.of()
        private var startTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var traceId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(spanWithStatus: SpanWithStatus) = apply {
            attributes = spanWithStatus.attributes
            endTime = spanWithStatus.endTime
            name = spanWithStatus.name
            parentSpanId = spanWithStatus.parentSpanId
            spanId = spanWithStatus.spanId
            startTime = spanWithStatus.startTime
            status = spanWithStatus.status
            traceId = spanWithStatus.traceId
            additionalProperties = spanWithStatus.additionalProperties.toMutableMap()
        }

        fun attributes(attributes: Attributes) = attributes(JsonField.of(attributes))

        fun attributes(attributes: JsonField<Attributes>) = apply { this.attributes = attributes }

        fun endTime(endTime: OffsetDateTime) = endTime(JsonField.of(endTime))

        fun endTime(endTime: JsonField<OffsetDateTime>) = apply { this.endTime = endTime }

        fun name(name: String) = name(JsonField.of(name))

        fun name(name: JsonField<String>) = apply { this.name = name }

        fun parentSpanId(parentSpanId: String) = parentSpanId(JsonField.of(parentSpanId))

        fun parentSpanId(parentSpanId: JsonField<String>) = apply {
            this.parentSpanId = parentSpanId
        }

        fun spanId(spanId: String) = spanId(JsonField.of(spanId))

        fun spanId(spanId: JsonField<String>) = apply { this.spanId = spanId }

        fun startTime(startTime: OffsetDateTime) = startTime(JsonField.of(startTime))

        fun startTime(startTime: JsonField<OffsetDateTime>) = apply { this.startTime = startTime }

        fun status(status: Status) = status(JsonField.of(status))

        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun traceId(traceId: String) = traceId(JsonField.of(traceId))

        fun traceId(traceId: JsonField<String>) = apply { this.traceId = traceId }

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
                attributes,
                endTime,
                name,
                parentSpanId,
                spanId,
                startTime,
                status,
                traceId,
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

        return /* spotless:off */ other is SpanWithStatus && attributes == other.attributes && endTime == other.endTime && name == other.name && parentSpanId == other.parentSpanId && spanId == other.spanId && startTime == other.startTime && status == other.status && traceId == other.traceId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(attributes, endTime, name, parentSpanId, spanId, startTime, status, traceId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SpanWithStatus{attributes=$attributes, endTime=$endTime, name=$name, parentSpanId=$parentSpanId, spanId=$spanId, startTime=$startTime, status=$status, traceId=$traceId, additionalProperties=$additionalProperties}"
}
