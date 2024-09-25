// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.llama_stack_client.api.core.Enum
import com.llama_stack_client.api.core.ExcludeMissing
import com.llama_stack_client.api.core.JsonField
import com.llama_stack_client.api.core.JsonMissing
import com.llama_stack_client.api.core.JsonValue
import com.llama_stack_client.api.core.NoAutoDetect
import com.llama_stack_client.api.core.toUnmodifiable
import com.llama_stack_client.api.errors.LlamaStackClientInvalidDataException
import java.util.Objects

@JsonDeserialize(builder = CompletionStreamChunk.Builder::class)
@NoAutoDetect
class CompletionStreamChunk
private constructor(
    private val delta: JsonField<String>,
    private val logprobs: JsonField<List<TokenLogProbs>>,
    private val stopReason: JsonField<StopReason>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun delta(): String = delta.getRequired("delta")

    fun logprobs(): List<TokenLogProbs>? = logprobs.getNullable("logprobs")

    fun stopReason(): StopReason? = stopReason.getNullable("stop_reason")

    @JsonProperty("delta") @ExcludeMissing fun _delta() = delta

    @JsonProperty("logprobs") @ExcludeMissing fun _logprobs() = logprobs

    @JsonProperty("stop_reason") @ExcludeMissing fun _stopReason() = stopReason

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CompletionStreamChunk = apply {
        if (!validated) {
            delta()
            logprobs()?.forEach { it.validate() }
            stopReason()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CompletionStreamChunk &&
            this.delta == other.delta &&
            this.logprobs == other.logprobs &&
            this.stopReason == other.stopReason &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    delta,
                    logprobs,
                    stopReason,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "CompletionStreamChunk{delta=$delta, logprobs=$logprobs, stopReason=$stopReason, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var delta: JsonField<String> = JsonMissing.of()
        private var logprobs: JsonField<List<TokenLogProbs>> = JsonMissing.of()
        private var stopReason: JsonField<StopReason> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(completionStreamChunk: CompletionStreamChunk) = apply {
            this.delta = completionStreamChunk.delta
            this.logprobs = completionStreamChunk.logprobs
            this.stopReason = completionStreamChunk.stopReason
            additionalProperties(completionStreamChunk.additionalProperties)
        }

        fun delta(delta: String) = delta(JsonField.of(delta))

        @JsonProperty("delta")
        @ExcludeMissing
        fun delta(delta: JsonField<String>) = apply { this.delta = delta }

        fun logprobs(logprobs: List<TokenLogProbs>) = logprobs(JsonField.of(logprobs))

        @JsonProperty("logprobs")
        @ExcludeMissing
        fun logprobs(logprobs: JsonField<List<TokenLogProbs>>) = apply { this.logprobs = logprobs }

        fun stopReason(stopReason: StopReason) = stopReason(JsonField.of(stopReason))

        @JsonProperty("stop_reason")
        @ExcludeMissing
        fun stopReason(stopReason: JsonField<StopReason>) = apply { this.stopReason = stopReason }

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

        fun build(): CompletionStreamChunk =
            CompletionStreamChunk(
                delta,
                logprobs.map { it.toUnmodifiable() },
                stopReason,
                additionalProperties.toUnmodifiable(),
            )
    }

    class StopReason
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is StopReason && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val END_OF_TURN = StopReason(JsonField.of("end_of_turn"))

            val END_OF_MESSAGE = StopReason(JsonField.of("end_of_message"))

            val OUT_OF_TOKENS = StopReason(JsonField.of("out_of_tokens"))

            fun of(value: String) = StopReason(JsonField.of(value))
        }

        enum class Known {
            END_OF_TURN,
            END_OF_MESSAGE,
            OUT_OF_TOKENS,
        }

        enum class Value {
            END_OF_TURN,
            END_OF_MESSAGE,
            OUT_OF_TOKENS,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                END_OF_TURN -> Value.END_OF_TURN
                END_OF_MESSAGE -> Value.END_OF_MESSAGE
                OUT_OF_TOKENS -> Value.OUT_OF_TOKENS
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                END_OF_TURN -> Known.END_OF_TURN
                END_OF_MESSAGE -> Known.END_OF_MESSAGE
                OUT_OF_TOKENS -> Known.OUT_OF_TOKENS
                else -> throw LlamaStackClientInvalidDataException("Unknown StopReason: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
