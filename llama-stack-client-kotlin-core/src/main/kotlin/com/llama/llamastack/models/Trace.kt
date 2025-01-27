// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class Trace
@JsonCreator
private constructor(
    @JsonProperty("root_span_id")
    @ExcludeMissing
    private val rootSpanId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("start_time")
    @ExcludeMissing
    private val startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("trace_id")
    @ExcludeMissing
    private val traceId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("end_time")
    @ExcludeMissing
    private val endTime: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun rootSpanId(): String = rootSpanId.getRequired("root_span_id")

    fun startTime(): OffsetDateTime = startTime.getRequired("start_time")

    fun traceId(): String = traceId.getRequired("trace_id")

    fun endTime(): OffsetDateTime? = endTime.getNullable("end_time")

    @JsonProperty("root_span_id") @ExcludeMissing fun _rootSpanId(): JsonField<String> = rootSpanId

    @JsonProperty("start_time")
    @ExcludeMissing
    fun _startTime(): JsonField<OffsetDateTime> = startTime

    @JsonProperty("trace_id") @ExcludeMissing fun _traceId(): JsonField<String> = traceId

    @JsonProperty("end_time") @ExcludeMissing fun _endTime(): JsonField<OffsetDateTime> = endTime

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Trace = apply {
        if (validated) {
            return@apply
        }

        rootSpanId()
        startTime()
        traceId()
        endTime()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var rootSpanId: JsonField<String>? = null
        private var startTime: JsonField<OffsetDateTime>? = null
        private var traceId: JsonField<String>? = null
        private var endTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(trace: Trace) = apply {
            rootSpanId = trace.rootSpanId
            startTime = trace.startTime
            traceId = trace.traceId
            endTime = trace.endTime
            additionalProperties = trace.additionalProperties.toMutableMap()
        }

        fun rootSpanId(rootSpanId: String) = rootSpanId(JsonField.of(rootSpanId))

        fun rootSpanId(rootSpanId: JsonField<String>) = apply { this.rootSpanId = rootSpanId }

        fun startTime(startTime: OffsetDateTime) = startTime(JsonField.of(startTime))

        fun startTime(startTime: JsonField<OffsetDateTime>) = apply { this.startTime = startTime }

        fun traceId(traceId: String) = traceId(JsonField.of(traceId))

        fun traceId(traceId: JsonField<String>) = apply { this.traceId = traceId }

        fun endTime(endTime: OffsetDateTime) = endTime(JsonField.of(endTime))

        fun endTime(endTime: JsonField<OffsetDateTime>) = apply { this.endTime = endTime }

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

        fun build(): Trace =
            Trace(
                checkRequired("rootSpanId", rootSpanId),
                checkRequired("startTime", startTime),
                checkRequired("traceId", traceId),
                endTime,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Trace && rootSpanId == other.rootSpanId && startTime == other.startTime && traceId == other.traceId && endTime == other.endTime && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(rootSpanId, startTime, traceId, endTime, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Trace{rootSpanId=$rootSpanId, startTime=$startTime, traceId=$traceId, endTime=$endTime, additionalProperties=$additionalProperties}"
}
