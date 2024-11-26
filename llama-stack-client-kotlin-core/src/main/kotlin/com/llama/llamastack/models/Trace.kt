// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = Trace.Builder::class)
@NoAutoDetect
class Trace
private constructor(
    private val endTime: JsonField<OffsetDateTime>,
    private val rootSpanId: JsonField<String>,
    private val startTime: JsonField<OffsetDateTime>,
    private val traceId: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun endTime(): OffsetDateTime? = endTime.getNullable("end_time")

    fun rootSpanId(): String = rootSpanId.getRequired("root_span_id")

    fun startTime(): OffsetDateTime = startTime.getRequired("start_time")

    fun traceId(): String = traceId.getRequired("trace_id")

    @JsonProperty("end_time") @ExcludeMissing fun _endTime() = endTime

    @JsonProperty("root_span_id") @ExcludeMissing fun _rootSpanId() = rootSpanId

    @JsonProperty("start_time") @ExcludeMissing fun _startTime() = startTime

    @JsonProperty("trace_id") @ExcludeMissing fun _traceId() = traceId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Trace = apply {
        if (!validated) {
            endTime()
            rootSpanId()
            startTime()
            traceId()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var endTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var rootSpanId: JsonField<String> = JsonMissing.of()
        private var startTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var traceId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(trace: Trace) = apply {
            this.endTime = trace.endTime
            this.rootSpanId = trace.rootSpanId
            this.startTime = trace.startTime
            this.traceId = trace.traceId
            additionalProperties(trace.additionalProperties)
        }

        fun endTime(endTime: OffsetDateTime) = endTime(JsonField.of(endTime))

        @JsonProperty("end_time")
        @ExcludeMissing
        fun endTime(endTime: JsonField<OffsetDateTime>) = apply { this.endTime = endTime }

        fun rootSpanId(rootSpanId: String) = rootSpanId(JsonField.of(rootSpanId))

        @JsonProperty("root_span_id")
        @ExcludeMissing
        fun rootSpanId(rootSpanId: JsonField<String>) = apply { this.rootSpanId = rootSpanId }

        fun startTime(startTime: OffsetDateTime) = startTime(JsonField.of(startTime))

        @JsonProperty("start_time")
        @ExcludeMissing
        fun startTime(startTime: JsonField<OffsetDateTime>) = apply { this.startTime = startTime }

        fun traceId(traceId: String) = traceId(JsonField.of(traceId))

        @JsonProperty("trace_id")
        @ExcludeMissing
        fun traceId(traceId: JsonField<String>) = apply { this.traceId = traceId }

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

        fun build(): Trace =
            Trace(
                endTime,
                rootSpanId,
                startTime,
                traceId,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Trace && endTime == other.endTime && rootSpanId == other.rootSpanId && startTime == other.startTime && traceId == other.traceId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(endTime, rootSpanId, startTime, traceId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Trace{endTime=$endTime, rootSpanId=$rootSpanId, startTime=$startTime, traceId=$traceId, additionalProperties=$additionalProperties}"
}
