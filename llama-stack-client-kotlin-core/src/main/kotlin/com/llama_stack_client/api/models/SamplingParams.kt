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

@JsonDeserialize(builder = SamplingParams.Builder::class)
@NoAutoDetect
class SamplingParams
private constructor(
    private val maxTokens: JsonField<Long>,
    private val repetitionPenalty: JsonField<Double>,
    private val strategy: JsonField<Strategy>,
    private val temperature: JsonField<Double>,
    private val topK: JsonField<Long>,
    private val topP: JsonField<Double>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun maxTokens(): Long? = maxTokens.getNullable("max_tokens")

    fun repetitionPenalty(): Double? = repetitionPenalty.getNullable("repetition_penalty")

    fun strategy(): Strategy = strategy.getRequired("strategy")

    fun temperature(): Double? = temperature.getNullable("temperature")

    fun topK(): Long? = topK.getNullable("top_k")

    fun topP(): Double? = topP.getNullable("top_p")

    @JsonProperty("max_tokens") @ExcludeMissing fun _maxTokens() = maxTokens

    @JsonProperty("repetition_penalty") @ExcludeMissing fun _repetitionPenalty() = repetitionPenalty

    @JsonProperty("strategy") @ExcludeMissing fun _strategy() = strategy

    @JsonProperty("temperature") @ExcludeMissing fun _temperature() = temperature

    @JsonProperty("top_k") @ExcludeMissing fun _topK() = topK

    @JsonProperty("top_p") @ExcludeMissing fun _topP() = topP

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): SamplingParams = apply {
        if (!validated) {
            maxTokens()
            repetitionPenalty()
            strategy()
            temperature()
            topK()
            topP()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SamplingParams &&
            this.maxTokens == other.maxTokens &&
            this.repetitionPenalty == other.repetitionPenalty &&
            this.strategy == other.strategy &&
            this.temperature == other.temperature &&
            this.topK == other.topK &&
            this.topP == other.topP &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    maxTokens,
                    repetitionPenalty,
                    strategy,
                    temperature,
                    topK,
                    topP,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "SamplingParams{maxTokens=$maxTokens, repetitionPenalty=$repetitionPenalty, strategy=$strategy, temperature=$temperature, topK=$topK, topP=$topP, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var maxTokens: JsonField<Long> = JsonMissing.of()
        private var repetitionPenalty: JsonField<Double> = JsonMissing.of()
        private var strategy: JsonField<Strategy> = JsonMissing.of()
        private var temperature: JsonField<Double> = JsonMissing.of()
        private var topK: JsonField<Long> = JsonMissing.of()
        private var topP: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(samplingParams: SamplingParams) = apply {
            this.maxTokens = samplingParams.maxTokens
            this.repetitionPenalty = samplingParams.repetitionPenalty
            this.strategy = samplingParams.strategy
            this.temperature = samplingParams.temperature
            this.topK = samplingParams.topK
            this.topP = samplingParams.topP
            additionalProperties(samplingParams.additionalProperties)
        }

        fun maxTokens(maxTokens: Long) = maxTokens(JsonField.of(maxTokens))

        @JsonProperty("max_tokens")
        @ExcludeMissing
        fun maxTokens(maxTokens: JsonField<Long>) = apply { this.maxTokens = maxTokens }

        fun repetitionPenalty(repetitionPenalty: Double) =
            repetitionPenalty(JsonField.of(repetitionPenalty))

        @JsonProperty("repetition_penalty")
        @ExcludeMissing
        fun repetitionPenalty(repetitionPenalty: JsonField<Double>) = apply {
            this.repetitionPenalty = repetitionPenalty
        }

        fun strategy(strategy: Strategy) = strategy(JsonField.of(strategy))

        @JsonProperty("strategy")
        @ExcludeMissing
        fun strategy(strategy: JsonField<Strategy>) = apply { this.strategy = strategy }

        fun temperature(temperature: Double) = temperature(JsonField.of(temperature))

        @JsonProperty("temperature")
        @ExcludeMissing
        fun temperature(temperature: JsonField<Double>) = apply { this.temperature = temperature }

        fun topK(topK: Long) = topK(JsonField.of(topK))

        @JsonProperty("top_k")
        @ExcludeMissing
        fun topK(topK: JsonField<Long>) = apply { this.topK = topK }

        fun topP(topP: Double) = topP(JsonField.of(topP))

        @JsonProperty("top_p")
        @ExcludeMissing
        fun topP(topP: JsonField<Double>) = apply { this.topP = topP }

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

        fun build(): SamplingParams =
            SamplingParams(
                maxTokens,
                repetitionPenalty,
                strategy,
                temperature,
                topK,
                topP,
                additionalProperties.toUnmodifiable(),
            )
    }

    class Strategy
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Strategy && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val GREEDY = Strategy(JsonField.of("greedy"))

            val TOP_P = Strategy(JsonField.of("top_p"))

            val TOP_K = Strategy(JsonField.of("top_k"))

            fun of(value: String) = Strategy(JsonField.of(value))
        }

        enum class Known {
            GREEDY,
            TOP_P,
            TOP_K,
        }

        enum class Value {
            GREEDY,
            TOP_P,
            TOP_K,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                GREEDY -> Value.GREEDY
                TOP_P -> Value.TOP_P
                TOP_K -> Value.TOP_K
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                GREEDY -> Known.GREEDY
                TOP_P -> Known.TOP_P
                TOP_K -> Known.TOP_K
                else -> throw LlamaStackClientInvalidDataException("Unknown Strategy: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
