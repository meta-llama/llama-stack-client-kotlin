// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.llama_stack_client.api.core.ExcludeMissing
import com.llama_stack_client.api.core.JsonField
import com.llama_stack_client.api.core.JsonMissing
import com.llama_stack_client.api.core.JsonValue
import com.llama_stack_client.api.core.NoAutoDetect
import com.llama_stack_client.api.core.toUnmodifiable
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = TelemetryGetTraceResponse.Builder::class)
@NoAutoDetect
class TelemetryGetTraceResponse
private constructor(
    private val endTime: JsonField<OffsetDateTime>,
    private val rootSpanId: JsonField<String>,
    private val startTime: JsonField<OffsetDateTime>,
    private val traceId: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

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

    fun validate(): TelemetryGetTraceResponse = apply {
        if (!validated) {
            endTime()
            rootSpanId()
            startTime()
            traceId()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TelemetryGetTraceResponse &&
            this.endTime == other.endTime &&
            this.rootSpanId == other.rootSpanId &&
            this.startTime == other.startTime &&
            this.traceId == other.traceId &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    endTime,
                    rootSpanId,
                    startTime,
                    traceId,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "TelemetryGetTraceResponse{endTime=$endTime, rootSpanId=$rootSpanId, startTime=$startTime, traceId=$traceId, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var endTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var rootSpanId: JsonField<String> = JsonMissing.of()
        private var startTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var traceId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(telemetryGetTraceResponse: TelemetryGetTraceResponse) = apply {
            this.endTime = telemetryGetTraceResponse.endTime
            this.rootSpanId = telemetryGetTraceResponse.rootSpanId
            this.startTime = telemetryGetTraceResponse.startTime
            this.traceId = telemetryGetTraceResponse.traceId
            additionalProperties(telemetryGetTraceResponse.additionalProperties)
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

        fun build(): TelemetryGetTraceResponse =
            TelemetryGetTraceResponse(
                endTime,
                rootSpanId,
                startTime,
                traceId,
                additionalProperties.toUnmodifiable(),
            )
    }
}
