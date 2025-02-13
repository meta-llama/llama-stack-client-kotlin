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
import java.util.Objects

@NoAutoDetect
class ScoringResult
@JsonCreator
private constructor(
    @JsonProperty("aggregated_results")
    @ExcludeMissing
    private val aggregatedResults: JsonField<AggregatedResults> = JsonMissing.of(),
    @JsonProperty("score_rows")
    @ExcludeMissing
    private val scoreRows: JsonField<List<ScoreRow>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun aggregatedResults(): AggregatedResults = aggregatedResults.getRequired("aggregated_results")

    fun scoreRows(): List<ScoreRow> = scoreRows.getRequired("score_rows")

    @JsonProperty("aggregated_results")
    @ExcludeMissing
    fun _aggregatedResults(): JsonField<AggregatedResults> = aggregatedResults

    @JsonProperty("score_rows")
    @ExcludeMissing
    fun _scoreRows(): JsonField<List<ScoreRow>> = scoreRows

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ScoringResult = apply {
        if (validated) {
            return@apply
        }

        aggregatedResults().validate()
        scoreRows().forEach { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [ScoringResult]. */
    class Builder internal constructor() {

        private var aggregatedResults: JsonField<AggregatedResults>? = null
        private var scoreRows: JsonField<MutableList<ScoreRow>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(scoringResult: ScoringResult) = apply {
            aggregatedResults = scoringResult.aggregatedResults
            scoreRows = scoringResult.scoreRows.map { it.toMutableList() }
            additionalProperties = scoringResult.additionalProperties.toMutableMap()
        }

        fun aggregatedResults(aggregatedResults: AggregatedResults) =
            aggregatedResults(JsonField.of(aggregatedResults))

        fun aggregatedResults(aggregatedResults: JsonField<AggregatedResults>) = apply {
            this.aggregatedResults = aggregatedResults
        }

        fun scoreRows(scoreRows: List<ScoreRow>) = scoreRows(JsonField.of(scoreRows))

        fun scoreRows(scoreRows: JsonField<List<ScoreRow>>) = apply {
            this.scoreRows = scoreRows.map { it.toMutableList() }
        }

        fun addScoreRow(scoreRow: ScoreRow) = apply {
            scoreRows =
                (scoreRows ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(scoreRow)
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

        fun build(): ScoringResult =
            ScoringResult(
                checkRequired("aggregatedResults", aggregatedResults),
                checkRequired("scoreRows", scoreRows).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class AggregatedResults
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AggregatedResults = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [AggregatedResults]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(aggregatedResults: AggregatedResults) = apply {
                additionalProperties = aggregatedResults.additionalProperties.toMutableMap()
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

            fun build(): AggregatedResults = AggregatedResults(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AggregatedResults && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "AggregatedResults{additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class ScoreRow
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ScoreRow = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [ScoreRow]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(scoreRow: ScoreRow) = apply {
                additionalProperties = scoreRow.additionalProperties.toMutableMap()
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

            fun build(): ScoreRow = ScoreRow(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ScoreRow && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "ScoreRow{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ScoringResult && aggregatedResults == other.aggregatedResults && scoreRows == other.scoreRows && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(aggregatedResults, scoreRows, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ScoringResult{aggregatedResults=$aggregatedResults, scoreRows=$scoreRows, additionalProperties=$additionalProperties}"
}
