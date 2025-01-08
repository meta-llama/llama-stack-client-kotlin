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
import java.util.Objects

@NoAutoDetect
class SamplingParams
@JsonCreator
private constructor(
    @JsonProperty("max_tokens")
    @ExcludeMissing
    private val maxTokens: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("repetition_penalty")
    @ExcludeMissing
    private val repetitionPenalty: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("strategy")
    @ExcludeMissing
    private val strategy: JsonField<Strategy> = JsonMissing.of(),
    @JsonProperty("temperature")
    @ExcludeMissing
    private val temperature: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("top_k") @ExcludeMissing private val topK: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("top_p") @ExcludeMissing private val topP: JsonField<Double> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

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

    private var validated: Boolean = false

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
            maxTokens = samplingParams.maxTokens
            repetitionPenalty = samplingParams.repetitionPenalty
            strategy = samplingParams.strategy
            temperature = samplingParams.temperature
            topK = samplingParams.topK
            topP = samplingParams.topP
            additionalProperties = samplingParams.additionalProperties.toMutableMap()
        }

        fun maxTokens(maxTokens: Long) = maxTokens(JsonField.of(maxTokens))

        fun maxTokens(maxTokens: JsonField<Long>) = apply { this.maxTokens = maxTokens }

        fun repetitionPenalty(repetitionPenalty: Double) =
            repetitionPenalty(JsonField.of(repetitionPenalty))

        fun repetitionPenalty(repetitionPenalty: JsonField<Double>) = apply {
            this.repetitionPenalty = repetitionPenalty
        }

        fun strategy(strategy: Strategy) = strategy(JsonField.of(strategy))

        fun strategy(strategy: JsonField<Strategy>) = apply { this.strategy = strategy }

        fun temperature(temperature: Double) = temperature(JsonField.of(temperature))

        fun temperature(temperature: JsonField<Double>) = apply { this.temperature = temperature }

        fun topK(topK: Long) = topK(JsonField.of(topK))

        fun topK(topK: JsonField<Long>) = apply { this.topK = topK }

        fun topP(topP: Double) = topP(JsonField.of(topP))

        fun topP(topP: JsonField<Double>) = apply { this.topP = topP }

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

        fun build(): SamplingParams =
            SamplingParams(
                maxTokens,
                repetitionPenalty,
                strategy,
                temperature,
                topK,
                topP,
                additionalProperties.toImmutable(),
            )
    }

    class Strategy
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val GREEDY = of("greedy")

            val TOP_P = of("top_p")

            val TOP_K = of("top_k")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Strategy && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SamplingParams && maxTokens == other.maxTokens && repetitionPenalty == other.repetitionPenalty && strategy == other.strategy && temperature == other.temperature && topK == other.topK && topP == other.topP && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(maxTokens, repetitionPenalty, strategy, temperature, topK, topP, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SamplingParams{maxTokens=$maxTokens, repetitionPenalty=$repetitionPenalty, strategy=$strategy, temperature=$temperature, topK=$topK, topP=$topP, additionalProperties=$additionalProperties}"
}
