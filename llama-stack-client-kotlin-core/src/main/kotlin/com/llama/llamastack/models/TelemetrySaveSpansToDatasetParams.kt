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

/** Save spans to a dataset. */
class TelemetrySaveSpansToDatasetParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The attribute filters to apply to the spans.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun attributeFilters(): List<QueryCondition> = body.attributeFilters()

    /**
     * The attributes to save to the dataset.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun attributesToSave(): List<String> = body.attributesToSave()

    /**
     * The ID of the dataset to save the spans to.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun datasetId(): String = body.datasetId()

    /**
     * The maximum depth of the tree.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxDepth(): Long? = body.maxDepth()

    /**
     * Returns the raw JSON value of [attributeFilters].
     *
     * Unlike [attributeFilters], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _attributeFilters(): JsonField<List<QueryCondition>> = body._attributeFilters()

    /**
     * Returns the raw JSON value of [attributesToSave].
     *
     * Unlike [attributesToSave], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _attributesToSave(): JsonField<List<String>> = body._attributesToSave()

    /**
     * Returns the raw JSON value of [datasetId].
     *
     * Unlike [datasetId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _datasetId(): JsonField<String> = body._datasetId()

    /**
     * Returns the raw JSON value of [maxDepth].
     *
     * Unlike [maxDepth], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maxDepth(): JsonField<Long> = body._maxDepth()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [TelemetrySaveSpansToDatasetParams].
         *
         * The following fields are required:
         * ```kotlin
         * .attributeFilters()
         * .attributesToSave()
         * .datasetId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [TelemetrySaveSpansToDatasetParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(telemetrySaveSpansToDatasetParams: TelemetrySaveSpansToDatasetParams) =
            apply {
                body = telemetrySaveSpansToDatasetParams.body.toBuilder()
                additionalHeaders = telemetrySaveSpansToDatasetParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    telemetrySaveSpansToDatasetParams.additionalQueryParams.toBuilder()
            }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [attributeFilters]
         * - [attributesToSave]
         * - [datasetId]
         * - [maxDepth]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The attribute filters to apply to the spans. */
        fun attributeFilters(attributeFilters: List<QueryCondition>) = apply {
            body.attributeFilters(attributeFilters)
        }

        /**
         * Sets [Builder.attributeFilters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attributeFilters] with a well-typed
         * `List<QueryCondition>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun attributeFilters(attributeFilters: JsonField<List<QueryCondition>>) = apply {
            body.attributeFilters(attributeFilters)
        }

        /**
         * Adds a single [QueryCondition] to [attributeFilters].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAttributeFilter(attributeFilter: QueryCondition) = apply {
            body.addAttributeFilter(attributeFilter)
        }

        /** The attributes to save to the dataset. */
        fun attributesToSave(attributesToSave: List<String>) = apply {
            body.attributesToSave(attributesToSave)
        }

        /**
         * Sets [Builder.attributesToSave] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attributesToSave] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun attributesToSave(attributesToSave: JsonField<List<String>>) = apply {
            body.attributesToSave(attributesToSave)
        }

        /**
         * Adds a single [String] to [Builder.attributesToSave].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAttributesToSave(attributesToSave: String) = apply {
            body.addAttributesToSave(attributesToSave)
        }

        /** The ID of the dataset to save the spans to. */
        fun datasetId(datasetId: String) = apply { body.datasetId(datasetId) }

        /**
         * Sets [Builder.datasetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.datasetId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun datasetId(datasetId: JsonField<String>) = apply { body.datasetId(datasetId) }

        /** The maximum depth of the tree. */
        fun maxDepth(maxDepth: Long) = apply { body.maxDepth(maxDepth) }

        /**
         * Sets [Builder.maxDepth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxDepth] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxDepth(maxDepth: JsonField<Long>) = apply { body.maxDepth(maxDepth) }

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
         * Returns an immutable instance of [TelemetrySaveSpansToDatasetParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .attributeFilters()
         * .attributesToSave()
         * .datasetId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TelemetrySaveSpansToDatasetParams =
            TelemetrySaveSpansToDatasetParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val attributeFilters: JsonField<List<QueryCondition>>,
        private val attributesToSave: JsonField<List<String>>,
        private val datasetId: JsonField<String>,
        private val maxDepth: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("attribute_filters")
            @ExcludeMissing
            attributeFilters: JsonField<List<QueryCondition>> = JsonMissing.of(),
            @JsonProperty("attributes_to_save")
            @ExcludeMissing
            attributesToSave: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("dataset_id")
            @ExcludeMissing
            datasetId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("max_depth") @ExcludeMissing maxDepth: JsonField<Long> = JsonMissing.of(),
        ) : this(attributeFilters, attributesToSave, datasetId, maxDepth, mutableMapOf())

        /**
         * The attribute filters to apply to the spans.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun attributeFilters(): List<QueryCondition> =
            attributeFilters.getRequired("attribute_filters")

        /**
         * The attributes to save to the dataset.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun attributesToSave(): List<String> = attributesToSave.getRequired("attributes_to_save")

        /**
         * The ID of the dataset to save the spans to.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun datasetId(): String = datasetId.getRequired("dataset_id")

        /**
         * The maximum depth of the tree.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun maxDepth(): Long? = maxDepth.getNullable("max_depth")

        /**
         * Returns the raw JSON value of [attributeFilters].
         *
         * Unlike [attributeFilters], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("attribute_filters")
        @ExcludeMissing
        fun _attributeFilters(): JsonField<List<QueryCondition>> = attributeFilters

        /**
         * Returns the raw JSON value of [attributesToSave].
         *
         * Unlike [attributesToSave], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("attributes_to_save")
        @ExcludeMissing
        fun _attributesToSave(): JsonField<List<String>> = attributesToSave

        /**
         * Returns the raw JSON value of [datasetId].
         *
         * Unlike [datasetId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dataset_id") @ExcludeMissing fun _datasetId(): JsonField<String> = datasetId

        /**
         * Returns the raw JSON value of [maxDepth].
         *
         * Unlike [maxDepth], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_depth") @ExcludeMissing fun _maxDepth(): JsonField<Long> = maxDepth

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
             * .attributeFilters()
             * .attributesToSave()
             * .datasetId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var attributeFilters: JsonField<MutableList<QueryCondition>>? = null
            private var attributesToSave: JsonField<MutableList<String>>? = null
            private var datasetId: JsonField<String>? = null
            private var maxDepth: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                attributeFilters = body.attributeFilters.map { it.toMutableList() }
                attributesToSave = body.attributesToSave.map { it.toMutableList() }
                datasetId = body.datasetId
                maxDepth = body.maxDepth
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The attribute filters to apply to the spans. */
            fun attributeFilters(attributeFilters: List<QueryCondition>) =
                attributeFilters(JsonField.of(attributeFilters))

            /**
             * Sets [Builder.attributeFilters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.attributeFilters] with a well-typed
             * `List<QueryCondition>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun attributeFilters(attributeFilters: JsonField<List<QueryCondition>>) = apply {
                this.attributeFilters = attributeFilters.map { it.toMutableList() }
            }

            /**
             * Adds a single [QueryCondition] to [attributeFilters].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAttributeFilter(attributeFilter: QueryCondition) = apply {
                attributeFilters =
                    (attributeFilters ?: JsonField.of(mutableListOf())).also {
                        checkKnown("attributeFilters", it).add(attributeFilter)
                    }
            }

            /** The attributes to save to the dataset. */
            fun attributesToSave(attributesToSave: List<String>) =
                attributesToSave(JsonField.of(attributesToSave))

            /**
             * Sets [Builder.attributesToSave] to an arbitrary JSON value.
             *
             * You should usually call [Builder.attributesToSave] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun attributesToSave(attributesToSave: JsonField<List<String>>) = apply {
                this.attributesToSave = attributesToSave.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.attributesToSave].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAttributesToSave(attributesToSave: String) = apply {
                this.attributesToSave =
                    (this.attributesToSave ?: JsonField.of(mutableListOf())).also {
                        checkKnown("attributesToSave", it).add(attributesToSave)
                    }
            }

            /** The ID of the dataset to save the spans to. */
            fun datasetId(datasetId: String) = datasetId(JsonField.of(datasetId))

            /**
             * Sets [Builder.datasetId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.datasetId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun datasetId(datasetId: JsonField<String>) = apply { this.datasetId = datasetId }

            /** The maximum depth of the tree. */
            fun maxDepth(maxDepth: Long) = maxDepth(JsonField.of(maxDepth))

            /**
             * Sets [Builder.maxDepth] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxDepth] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxDepth(maxDepth: JsonField<Long>) = apply { this.maxDepth = maxDepth }

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
             * .attributeFilters()
             * .attributesToSave()
             * .datasetId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("attributeFilters", attributeFilters).map { it.toImmutable() },
                    checkRequired("attributesToSave", attributesToSave).map { it.toImmutable() },
                    checkRequired("datasetId", datasetId),
                    maxDepth,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            attributeFilters().forEach { it.validate() }
            attributesToSave()
            datasetId()
            maxDepth()
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
            (attributeFilters.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (attributesToSave.asKnown()?.size ?: 0) +
                (if (datasetId.asKnown() == null) 0 else 1) +
                (if (maxDepth.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && attributeFilters == other.attributeFilters && attributesToSave == other.attributesToSave && datasetId == other.datasetId && maxDepth == other.maxDepth && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(attributeFilters, attributesToSave, datasetId, maxDepth, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{attributeFilters=$attributeFilters, attributesToSave=$attributesToSave, datasetId=$datasetId, maxDepth=$maxDepth, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TelemetrySaveSpansToDatasetParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "TelemetrySaveSpansToDatasetParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
