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
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

/** Response from a completion request. */
@NoAutoDetect
class CompletionResponse
@JsonCreator
private constructor(
    @JsonProperty("content")
    @ExcludeMissing
    private val content: JsonField<String> = JsonMissing.of(),
    @JsonProperty("stop_reason")
    @ExcludeMissing
    private val stopReason: JsonField<StopReason> = JsonMissing.of(),
    @JsonProperty("logprobs")
    @ExcludeMissing
    private val logprobs: JsonField<List<TokenLogProbs>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The generated completion text */
    fun content(): String = content.getRequired("content")

    /** Reason why generation stopped */
    fun stopReason(): StopReason = stopReason.getRequired("stop_reason")

    /** Optional log probabilities for generated tokens */
    fun logprobs(): List<TokenLogProbs>? = logprobs.getNullable("logprobs")

    /** The generated completion text */
    @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

    /** Reason why generation stopped */
    @JsonProperty("stop_reason")
    @ExcludeMissing
    fun _stopReason(): JsonField<StopReason> = stopReason

    /** Optional log probabilities for generated tokens */
    @JsonProperty("logprobs")
    @ExcludeMissing
    fun _logprobs(): JsonField<List<TokenLogProbs>> = logprobs

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CompletionResponse = apply {
        if (validated) {
            return@apply
        }

        content()
        stopReason()
        logprobs()?.forEach { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [CompletionResponse]. */
    class Builder internal constructor() {

        private var content: JsonField<String>? = null
        private var stopReason: JsonField<StopReason>? = null
        private var logprobs: JsonField<MutableList<TokenLogProbs>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(completionResponse: CompletionResponse) = apply {
            content = completionResponse.content
            stopReason = completionResponse.stopReason
            logprobs = completionResponse.logprobs.map { it.toMutableList() }
            additionalProperties = completionResponse.additionalProperties.toMutableMap()
        }

        /** The generated completion text */
        fun content(content: String) = content(JsonField.of(content))

        /** The generated completion text */
        fun content(content: JsonField<String>) = apply { this.content = content }

        /** Reason why generation stopped */
        fun stopReason(stopReason: StopReason) = stopReason(JsonField.of(stopReason))

        /** Reason why generation stopped */
        fun stopReason(stopReason: JsonField<StopReason>) = apply { this.stopReason = stopReason }

        /** Optional log probabilities for generated tokens */
        fun logprobs(logprobs: List<TokenLogProbs>) = logprobs(JsonField.of(logprobs))

        /** Optional log probabilities for generated tokens */
        fun logprobs(logprobs: JsonField<List<TokenLogProbs>>) = apply {
            this.logprobs = logprobs.map { it.toMutableList() }
        }

        /** Optional log probabilities for generated tokens */
        fun addLogprob(logprob: TokenLogProbs) = apply {
            logprobs =
                (logprobs ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(logprob)
                }
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

        fun build(): CompletionResponse =
            CompletionResponse(
                checkRequired("content", content),
                checkRequired("stopReason", stopReason),
                (logprobs ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    /** Reason why generation stopped */
    class StopReason
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val END_OF_TURN = of("end_of_turn")

            val END_OF_MESSAGE = of("end_of_message")

            val OUT_OF_TOKENS = of("out_of_tokens")

            fun of(value: String) = StopReason(JsonField.of(value))
        }

        /** An enum containing [StopReason]'s known values. */
        enum class Known {
            END_OF_TURN,
            END_OF_MESSAGE,
            OUT_OF_TOKENS,
        }

        /**
         * An enum containing [StopReason]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [StopReason] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            END_OF_TURN,
            END_OF_MESSAGE,
            OUT_OF_TOKENS,
            /**
             * An enum member indicating that [StopReason] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                END_OF_TURN -> Value.END_OF_TURN
                END_OF_MESSAGE -> Value.END_OF_MESSAGE
                OUT_OF_TOKENS -> Value.OUT_OF_TOKENS
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LlamaStackClientInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                END_OF_TURN -> Known.END_OF_TURN
                END_OF_MESSAGE -> Known.END_OF_MESSAGE
                OUT_OF_TOKENS -> Known.OUT_OF_TOKENS
                else -> throw LlamaStackClientInvalidDataException("Unknown StopReason: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is StopReason && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CompletionResponse && content == other.content && stopReason == other.stopReason && logprobs == other.logprobs && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(content, stopReason, logprobs, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CompletionResponse{content=$content, stopReason=$stopReason, logprobs=$logprobs, additionalProperties=$additionalProperties}"
}
