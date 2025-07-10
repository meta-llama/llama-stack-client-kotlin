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
import com.llama.llamastack.core.Params
import com.llama.llamastack.core.checkKnown
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Collections
import java.util.Objects

/** Evaluate a list of rows on a benchmark. */
class EvalEvaluateRowsParams
private constructor(
    private val benchmarkId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun benchmarkId(): String? = benchmarkId

    /**
     * The configuration for the benchmark.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun benchmarkConfig(): BenchmarkConfig = body.benchmarkConfig()

    /**
     * The rows to evaluate.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inputRows(): List<InputRow> = body.inputRows()

    /**
     * The scoring functions to use for the evaluation.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun scoringFunctions(): List<String> = body.scoringFunctions()

    /**
     * Returns the raw JSON value of [benchmarkConfig].
     *
     * Unlike [benchmarkConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _benchmarkConfig(): JsonField<BenchmarkConfig> = body._benchmarkConfig()

    /**
     * Returns the raw JSON value of [inputRows].
     *
     * Unlike [inputRows], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _inputRows(): JsonField<List<InputRow>> = body._inputRows()

    /**
     * Returns the raw JSON value of [scoringFunctions].
     *
     * Unlike [scoringFunctions], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _scoringFunctions(): JsonField<List<String>> = body._scoringFunctions()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EvalEvaluateRowsParams].
         *
         * The following fields are required:
         * ```kotlin
         * .benchmarkConfig()
         * .inputRows()
         * .scoringFunctions()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [EvalEvaluateRowsParams]. */
    class Builder internal constructor() {

        private var benchmarkId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(evalEvaluateRowsParams: EvalEvaluateRowsParams) = apply {
            benchmarkId = evalEvaluateRowsParams.benchmarkId
            body = evalEvaluateRowsParams.body.toBuilder()
            additionalHeaders = evalEvaluateRowsParams.additionalHeaders.toBuilder()
            additionalQueryParams = evalEvaluateRowsParams.additionalQueryParams.toBuilder()
        }

        fun benchmarkId(benchmarkId: String?) = apply { this.benchmarkId = benchmarkId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [benchmarkConfig]
         * - [inputRows]
         * - [scoringFunctions]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The configuration for the benchmark. */
        fun benchmarkConfig(benchmarkConfig: BenchmarkConfig) = apply {
            body.benchmarkConfig(benchmarkConfig)
        }

        /**
         * Sets [Builder.benchmarkConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.benchmarkConfig] with a well-typed [BenchmarkConfig]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun benchmarkConfig(benchmarkConfig: JsonField<BenchmarkConfig>) = apply {
            body.benchmarkConfig(benchmarkConfig)
        }

        /** The rows to evaluate. */
        fun inputRows(inputRows: List<InputRow>) = apply { body.inputRows(inputRows) }

        /**
         * Sets [Builder.inputRows] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inputRows] with a well-typed `List<InputRow>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun inputRows(inputRows: JsonField<List<InputRow>>) = apply { body.inputRows(inputRows) }

        /**
         * Adds a single [InputRow] to [inputRows].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInputRow(inputRow: InputRow) = apply { body.addInputRow(inputRow) }

        /** The scoring functions to use for the evaluation. */
        fun scoringFunctions(scoringFunctions: List<String>) = apply {
            body.scoringFunctions(scoringFunctions)
        }

        /**
         * Sets [Builder.scoringFunctions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scoringFunctions] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun scoringFunctions(scoringFunctions: JsonField<List<String>>) = apply {
            body.scoringFunctions(scoringFunctions)
        }

        /**
         * Adds a single [String] to [scoringFunctions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addScoringFunction(scoringFunction: String) = apply {
            body.addScoringFunction(scoringFunction)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [EvalEvaluateRowsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .benchmarkConfig()
         * .inputRows()
         * .scoringFunctions()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EvalEvaluateRowsParams =
            EvalEvaluateRowsParams(
                benchmarkId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> benchmarkId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val benchmarkConfig: JsonField<BenchmarkConfig>,
        private val inputRows: JsonField<List<InputRow>>,
        private val scoringFunctions: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("benchmark_config")
            @ExcludeMissing
            benchmarkConfig: JsonField<BenchmarkConfig> = JsonMissing.of(),
            @JsonProperty("input_rows")
            @ExcludeMissing
            inputRows: JsonField<List<InputRow>> = JsonMissing.of(),
            @JsonProperty("scoring_functions")
            @ExcludeMissing
            scoringFunctions: JsonField<List<String>> = JsonMissing.of(),
        ) : this(benchmarkConfig, inputRows, scoringFunctions, mutableMapOf())

        /**
         * The configuration for the benchmark.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun benchmarkConfig(): BenchmarkConfig = benchmarkConfig.getRequired("benchmark_config")

        /**
         * The rows to evaluate.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun inputRows(): List<InputRow> = inputRows.getRequired("input_rows")

        /**
         * The scoring functions to use for the evaluation.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun scoringFunctions(): List<String> = scoringFunctions.getRequired("scoring_functions")

        /**
         * Returns the raw JSON value of [benchmarkConfig].
         *
         * Unlike [benchmarkConfig], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("benchmark_config")
        @ExcludeMissing
        fun _benchmarkConfig(): JsonField<BenchmarkConfig> = benchmarkConfig

        /**
         * Returns the raw JSON value of [inputRows].
         *
         * Unlike [inputRows], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("input_rows")
        @ExcludeMissing
        fun _inputRows(): JsonField<List<InputRow>> = inputRows

        /**
         * Returns the raw JSON value of [scoringFunctions].
         *
         * Unlike [scoringFunctions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("scoring_functions")
        @ExcludeMissing
        fun _scoringFunctions(): JsonField<List<String>> = scoringFunctions

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .benchmarkConfig()
             * .inputRows()
             * .scoringFunctions()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var benchmarkConfig: JsonField<BenchmarkConfig>? = null
            private var inputRows: JsonField<MutableList<InputRow>>? = null
            private var scoringFunctions: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                benchmarkConfig = body.benchmarkConfig
                inputRows = body.inputRows.map { it.toMutableList() }
                scoringFunctions = body.scoringFunctions.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The configuration for the benchmark. */
            fun benchmarkConfig(benchmarkConfig: BenchmarkConfig) =
                benchmarkConfig(JsonField.of(benchmarkConfig))

            /**
             * Sets [Builder.benchmarkConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.benchmarkConfig] with a well-typed [BenchmarkConfig]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun benchmarkConfig(benchmarkConfig: JsonField<BenchmarkConfig>) = apply {
                this.benchmarkConfig = benchmarkConfig
            }

            /** The rows to evaluate. */
            fun inputRows(inputRows: List<InputRow>) = inputRows(JsonField.of(inputRows))

            /**
             * Sets [Builder.inputRows] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputRows] with a well-typed `List<InputRow>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inputRows(inputRows: JsonField<List<InputRow>>) = apply {
                this.inputRows = inputRows.map { it.toMutableList() }
            }

            /**
             * Adds a single [InputRow] to [inputRows].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addInputRow(inputRow: InputRow) = apply {
                inputRows =
                    (inputRows ?: JsonField.of(mutableListOf())).also {
                        checkKnown("inputRows", it).add(inputRow)
                    }
            }

            /** The scoring functions to use for the evaluation. */
            fun scoringFunctions(scoringFunctions: List<String>) =
                scoringFunctions(JsonField.of(scoringFunctions))

            /**
             * Sets [Builder.scoringFunctions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scoringFunctions] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun scoringFunctions(scoringFunctions: JsonField<List<String>>) = apply {
                this.scoringFunctions = scoringFunctions.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [scoringFunctions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addScoringFunction(scoringFunction: String) = apply {
                scoringFunctions =
                    (scoringFunctions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("scoringFunctions", it).add(scoringFunction)
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .benchmarkConfig()
             * .inputRows()
             * .scoringFunctions()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("benchmarkConfig", benchmarkConfig),
                    checkRequired("inputRows", inputRows).map { it.toImmutable() },
                    checkRequired("scoringFunctions", scoringFunctions).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            benchmarkConfig().validate()
            inputRows().forEach { it.validate() }
            scoringFunctions()
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
            (benchmarkConfig.asKnown()?.validity() ?: 0) +
                (inputRows.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (scoringFunctions.asKnown()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && benchmarkConfig == other.benchmarkConfig && inputRows == other.inputRows && scoringFunctions == other.scoringFunctions && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(benchmarkConfig, inputRows, scoringFunctions, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{benchmarkConfig=$benchmarkConfig, inputRows=$inputRows, scoringFunctions=$scoringFunctions, additionalProperties=$additionalProperties}"
    }

    class InputRow
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

            /** Returns a mutable builder for constructing an instance of [InputRow]. */
            fun builder() = Builder()
        }

        /** A builder for [InputRow]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(inputRow: InputRow) = apply {
                additionalProperties = inputRow.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [InputRow].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): InputRow = InputRow(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): InputRow = apply {
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

            return /* spotless:off */ other is InputRow && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "InputRow{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EvalEvaluateRowsParams && benchmarkId == other.benchmarkId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(benchmarkId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "EvalEvaluateRowsParams{benchmarkId=$benchmarkId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
