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
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

@NoAutoDetect
class BenchmarkConfig
@JsonCreator
private constructor(
    @JsonProperty("eval_candidate")
    @ExcludeMissing
    private val evalCandidate: JsonField<EvalCandidate> = JsonMissing.of(),
    @JsonProperty("scoring_params")
    @ExcludeMissing
    private val scoringParams: JsonField<ScoringParams> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonValue = JsonMissing.of(),
    @JsonProperty("num_examples")
    @ExcludeMissing
    private val numExamples: JsonField<Long> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun evalCandidate(): EvalCandidate = evalCandidate.getRequired("eval_candidate")

    fun scoringParams(): ScoringParams = scoringParams.getRequired("scoring_params")

    @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

    fun numExamples(): Long? = numExamples.getNullable("num_examples")

    @JsonProperty("eval_candidate")
    @ExcludeMissing
    fun _evalCandidate(): JsonField<EvalCandidate> = evalCandidate

    @JsonProperty("scoring_params")
    @ExcludeMissing
    fun _scoringParams(): JsonField<ScoringParams> = scoringParams

    @JsonProperty("num_examples") @ExcludeMissing fun _numExamples(): JsonField<Long> = numExamples

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): BenchmarkConfig = apply {
        if (validated) {
            return@apply
        }

        evalCandidate().validate()
        scoringParams().validate()
        _type().let {
            if (it != JsonValue.from("benchmark")) {
                throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
            }
        }
        numExamples()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [BenchmarkConfig]. */
    class Builder internal constructor() {

        private var evalCandidate: JsonField<EvalCandidate>? = null
        private var scoringParams: JsonField<ScoringParams>? = null
        private var type: JsonValue = JsonValue.from("benchmark")
        private var numExamples: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(benchmarkConfig: BenchmarkConfig) = apply {
            evalCandidate = benchmarkConfig.evalCandidate
            scoringParams = benchmarkConfig.scoringParams
            type = benchmarkConfig.type
            numExamples = benchmarkConfig.numExamples
            additionalProperties = benchmarkConfig.additionalProperties.toMutableMap()
        }

        fun evalCandidate(evalCandidate: EvalCandidate) = evalCandidate(JsonField.of(evalCandidate))

        fun evalCandidate(evalCandidate: JsonField<EvalCandidate>) = apply {
            this.evalCandidate = evalCandidate
        }

        fun evalCandidate(model: EvalCandidate.ModelCandidate) =
            evalCandidate(EvalCandidate.ofModel(model))

        fun evalCandidate(agent: EvalCandidate.AgentCandidate) =
            evalCandidate(EvalCandidate.ofAgent(agent))

        fun agentEvalCandidate(config: AgentConfig) =
            evalCandidate(EvalCandidate.AgentCandidate.builder().config(config).build())

        fun scoringParams(scoringParams: ScoringParams) = scoringParams(JsonField.of(scoringParams))

        fun scoringParams(scoringParams: JsonField<ScoringParams>) = apply {
            this.scoringParams = scoringParams
        }

        fun type(type: JsonValue) = apply { this.type = type }

        fun numExamples(numExamples: Long) = numExamples(JsonField.of(numExamples))

        fun numExamples(numExamples: JsonField<Long>) = apply { this.numExamples = numExamples }

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

        fun build(): BenchmarkConfig =
            BenchmarkConfig(
                checkRequired("evalCandidate", evalCandidate),
                checkRequired("scoringParams", scoringParams),
                type,
                numExamples,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class ScoringParams
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ScoringParams = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [ScoringParams]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(scoringParams: ScoringParams) = apply {
                additionalProperties = scoringParams.additionalProperties.toMutableMap()
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

            fun build(): ScoringParams = ScoringParams(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ScoringParams && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "ScoringParams{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BenchmarkConfig && evalCandidate == other.evalCandidate && scoringParams == other.scoringParams && type == other.type && numExamples == other.numExamples && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(evalCandidate, scoringParams, type, numExamples, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BenchmarkConfig{evalCandidate=$evalCandidate, scoringParams=$scoringParams, type=$type, numExamples=$numExamples, additionalProperties=$additionalProperties}"
}
