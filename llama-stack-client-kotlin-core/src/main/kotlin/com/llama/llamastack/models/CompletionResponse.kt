// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.llama.llamastack.core.Enum
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

@JsonDeserialize(builder = CompletionResponse.Builder::class)
@NoAutoDetect
class CompletionResponse
private constructor(
    private val content: JsonField<String>,
    private val logprobs: JsonField<List<TokenLogProbs>>,
    private val stopReason: JsonField<StopReason>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun content(): String = content.getRequired("content")

    fun logprobs(): List<TokenLogProbs>? = logprobs.getNullable("logprobs")

    fun stopReason(): StopReason = stopReason.getRequired("stop_reason")

    @JsonProperty("content") @ExcludeMissing fun _content() = content

    @JsonProperty("logprobs") @ExcludeMissing fun _logprobs() = logprobs

    @JsonProperty("stop_reason") @ExcludeMissing fun _stopReason() = stopReason

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CompletionResponse = apply {
        if (!validated) {
            content()
            logprobs()?.forEach { it.validate() }
            stopReason()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var content: JsonField<String> = JsonMissing.of()
        private var logprobs: JsonField<List<TokenLogProbs>> = JsonMissing.of()
        private var stopReason: JsonField<StopReason> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(completionResponse: CompletionResponse) = apply {
            this.content = completionResponse.content
            this.logprobs = completionResponse.logprobs
            this.stopReason = completionResponse.stopReason
            additionalProperties(completionResponse.additionalProperties)
        }

        fun content(content: String) = content(JsonField.of(content))

        @JsonProperty("content")
        @ExcludeMissing
        fun content(content: JsonField<String>) = apply { this.content = content }

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

        fun build(): CompletionResponse =
            CompletionResponse(
                content,
                logprobs.map { it.toImmutable() },
                stopReason,
                additionalProperties.toImmutable(),
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

            return /* spotless:off */ other is StopReason && value == other.value /* spotless:on */
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CompletionResponse && content == other.content && logprobs == other.logprobs && stopReason == other.stopReason && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(content, logprobs, stopReason, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CompletionResponse{content=$content, logprobs=$logprobs, stopReason=$stopReason, additionalProperties=$additionalProperties}"
}
