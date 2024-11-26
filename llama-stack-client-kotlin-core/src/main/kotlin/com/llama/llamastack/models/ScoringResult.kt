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
import java.util.Objects

@JsonDeserialize(builder = ScoringResult.Builder::class)
@NoAutoDetect
class ScoringResult
private constructor(
    private val aggregatedResults: JsonField<AggregatedResults>,
    private val scoreRows: JsonField<List<ScoreRow>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun aggregatedResults(): AggregatedResults = aggregatedResults.getRequired("aggregated_results")

    fun scoreRows(): List<ScoreRow> = scoreRows.getRequired("score_rows")

    @JsonProperty("aggregated_results") @ExcludeMissing fun _aggregatedResults() = aggregatedResults

    @JsonProperty("score_rows") @ExcludeMissing fun _scoreRows() = scoreRows

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ScoringResult = apply {
        if (!validated) {
            aggregatedResults().validate()
            scoreRows().forEach { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var aggregatedResults: JsonField<AggregatedResults> = JsonMissing.of()
        private var scoreRows: JsonField<List<ScoreRow>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(scoringResult: ScoringResult) = apply {
            this.aggregatedResults = scoringResult.aggregatedResults
            this.scoreRows = scoringResult.scoreRows
            additionalProperties(scoringResult.additionalProperties)
        }

        fun aggregatedResults(aggregatedResults: AggregatedResults) =
            aggregatedResults(JsonField.of(aggregatedResults))

        @JsonProperty("aggregated_results")
        @ExcludeMissing
        fun aggregatedResults(aggregatedResults: JsonField<AggregatedResults>) = apply {
            this.aggregatedResults = aggregatedResults
        }

        fun scoreRows(scoreRows: List<ScoreRow>) = scoreRows(JsonField.of(scoreRows))

        @JsonProperty("score_rows")
        @ExcludeMissing
        fun scoreRows(scoreRows: JsonField<List<ScoreRow>>) = apply { this.scoreRows = scoreRows }

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

        fun build(): ScoringResult =
            ScoringResult(
                aggregatedResults,
                scoreRows.map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = AggregatedResults.Builder::class)
    @NoAutoDetect
    class AggregatedResults
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): AggregatedResults = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(aggregatedResults: AggregatedResults) = apply {
                additionalProperties(aggregatedResults.additionalProperties)
            }

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

    @JsonDeserialize(builder = ScoreRow.Builder::class)
    @NoAutoDetect
    class ScoreRow
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): ScoreRow = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(scoreRow: ScoreRow) = apply {
                additionalProperties(scoreRow.additionalProperties)
            }

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
