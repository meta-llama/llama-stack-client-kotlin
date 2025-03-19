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
import com.llama.llamastack.core.Params
import com.llama.llamastack.core.checkKnown
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

/** Score a list of rows. */
class ScoringScoreParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The rows to score.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inputRows(): List<InputRow> = body.inputRows()

    /**
     * The scoring functions to use for the scoring.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun scoringFunctions(): ScoringFunctions = body.scoringFunctions()

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
    fun _scoringFunctions(): JsonField<ScoringFunctions> = body._scoringFunctions()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("input_rows")
        @ExcludeMissing
        private val inputRows: JsonField<List<InputRow>> = JsonMissing.of(),
        @JsonProperty("scoring_functions")
        @ExcludeMissing
        private val scoringFunctions: JsonField<ScoringFunctions> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The rows to score.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun inputRows(): List<InputRow> = inputRows.getRequired("input_rows")

        /**
         * The scoring functions to use for the scoring.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun scoringFunctions(): ScoringFunctions = scoringFunctions.getRequired("scoring_functions")

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
        fun _scoringFunctions(): JsonField<ScoringFunctions> = scoringFunctions

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            inputRows().forEach { it.validate() }
            scoringFunctions().validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .inputRows()
             * .scoringFunctions()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var inputRows: JsonField<MutableList<InputRow>>? = null
            private var scoringFunctions: JsonField<ScoringFunctions>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                inputRows = body.inputRows.map { it.toMutableList() }
                scoringFunctions = body.scoringFunctions
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The rows to score. */
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

            /** The scoring functions to use for the scoring. */
            fun scoringFunctions(scoringFunctions: ScoringFunctions) =
                scoringFunctions(JsonField.of(scoringFunctions))

            /**
             * Sets [Builder.scoringFunctions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scoringFunctions] with a well-typed
             * [ScoringFunctions] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun scoringFunctions(scoringFunctions: JsonField<ScoringFunctions>) = apply {
                this.scoringFunctions = scoringFunctions
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

            fun build(): Body =
                Body(
                    checkRequired("inputRows", inputRows).map { it.toImmutable() },
                    checkRequired("scoringFunctions", scoringFunctions),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && inputRows == other.inputRows && scoringFunctions == other.scoringFunctions && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(inputRows, scoringFunctions, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{inputRows=$inputRows, scoringFunctions=$scoringFunctions, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ScoringScoreParams].
         *
         * The following fields are required:
         * ```kotlin
         * .inputRows()
         * .scoringFunctions()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ScoringScoreParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(scoringScoreParams: ScoringScoreParams) = apply {
            body = scoringScoreParams.body.toBuilder()
            additionalHeaders = scoringScoreParams.additionalHeaders.toBuilder()
            additionalQueryParams = scoringScoreParams.additionalQueryParams.toBuilder()
        }

        /** The rows to score. */
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

        /** The scoring functions to use for the scoring. */
        fun scoringFunctions(scoringFunctions: ScoringFunctions) = apply {
            body.scoringFunctions(scoringFunctions)
        }

        /**
         * Sets [Builder.scoringFunctions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scoringFunctions] with a well-typed [ScoringFunctions]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun scoringFunctions(scoringFunctions: JsonField<ScoringFunctions>) = apply {
            body.scoringFunctions(scoringFunctions)
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

        fun build(): ScoringScoreParams =
            ScoringScoreParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class InputRow
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): InputRow = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

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

            fun build(): InputRow = InputRow(additionalProperties.toImmutable())
        }

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

    /** The scoring functions to use for the scoring. */
    @NoAutoDetect
    class ScoringFunctions
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ScoringFunctions = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [ScoringFunctions]. */
            fun builder() = Builder()
        }

        /** A builder for [ScoringFunctions]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(scoringFunctions: ScoringFunctions) = apply {
                additionalProperties = scoringFunctions.additionalProperties.toMutableMap()
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

            fun build(): ScoringFunctions = ScoringFunctions(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ScoringFunctions && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "ScoringFunctions{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ScoringScoreParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ScoringScoreParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
