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
import com.llama.llamastack.core.checkKnown
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Collections
import java.util.Objects

/** A scoring result for a single row. */
class ScoringResult
private constructor(
    private val aggregatedResults: JsonField<AggregatedResults>,
    private val scoreRows: JsonField<List<ScoreRow>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("aggregated_results")
        @ExcludeMissing
        aggregatedResults: JsonField<AggregatedResults> = JsonMissing.of(),
        @JsonProperty("score_rows")
        @ExcludeMissing
        scoreRows: JsonField<List<ScoreRow>> = JsonMissing.of(),
    ) : this(aggregatedResults, scoreRows, mutableMapOf())

    /**
     * Map of metric name to aggregated value
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun aggregatedResults(): AggregatedResults = aggregatedResults.getRequired("aggregated_results")

    /**
     * The scoring result for each row. Each row is a map of column name to value.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun scoreRows(): List<ScoreRow> = scoreRows.getRequired("score_rows")

    /**
     * Returns the raw JSON value of [aggregatedResults].
     *
     * Unlike [aggregatedResults], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("aggregated_results")
    @ExcludeMissing
    fun _aggregatedResults(): JsonField<AggregatedResults> = aggregatedResults

    /**
     * Returns the raw JSON value of [scoreRows].
     *
     * Unlike [scoreRows], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("score_rows")
    @ExcludeMissing
    fun _scoreRows(): JsonField<List<ScoreRow>> = scoreRows

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ScoringResult].
         *
         * The following fields are required:
         * ```kotlin
         * .aggregatedResults()
         * .scoreRows()
         * ```
         */
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

        /** Map of metric name to aggregated value */
        fun aggregatedResults(aggregatedResults: AggregatedResults) =
            aggregatedResults(JsonField.of(aggregatedResults))

        /**
         * Sets [Builder.aggregatedResults] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aggregatedResults] with a well-typed [AggregatedResults]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun aggregatedResults(aggregatedResults: JsonField<AggregatedResults>) = apply {
            this.aggregatedResults = aggregatedResults
        }

        /** The scoring result for each row. Each row is a map of column name to value. */
        fun scoreRows(scoreRows: List<ScoreRow>) = scoreRows(JsonField.of(scoreRows))

        /**
         * Sets [Builder.scoreRows] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scoreRows] with a well-typed `List<ScoreRow>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun scoreRows(scoreRows: JsonField<List<ScoreRow>>) = apply {
            this.scoreRows = scoreRows.map { it.toMutableList() }
        }

        /**
         * Adds a single [ScoreRow] to [scoreRows].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addScoreRow(scoreRow: ScoreRow) = apply {
            scoreRows =
                (scoreRows ?: JsonField.of(mutableListOf())).also {
                    checkKnown("scoreRows", it).add(scoreRow)
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

        /**
         * Returns an immutable instance of [ScoringResult].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .aggregatedResults()
         * .scoreRows()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ScoringResult =
            ScoringResult(
                checkRequired("aggregatedResults", aggregatedResults),
                checkRequired("scoreRows", scoreRows).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ScoringResult = apply {
        if (validated) {
            return@apply
        }

        aggregatedResults().validate()
        scoreRows().forEach { it.validate() }
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LlamaStackClientInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (aggregatedResults.asKnown()?.validity() ?: 0) +
            (scoreRows.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

    /** Map of metric name to aggregated value */
    class AggregatedResults
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [AggregatedResults]. */
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

            /**
             * Returns an immutable instance of [AggregatedResults].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): AggregatedResults = AggregatedResults(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): AggregatedResults = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaStackClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

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

    class ScoreRow
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [ScoreRow]. */
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

            /**
             * Returns an immutable instance of [ScoreRow].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ScoreRow = ScoreRow(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): ScoreRow = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaStackClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

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
