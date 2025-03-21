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
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

class TelemetryQueryTracesParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun attributeFilters(): List<QueryCondition>? = body.attributeFilters()

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun limit(): Long? = body.limit()

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun offset(): Long? = body.offset()

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun orderBy(): List<String>? = body.orderBy()

    /**
     * Returns the raw JSON value of [attributeFilters].
     *
     * Unlike [attributeFilters], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _attributeFilters(): JsonField<List<QueryCondition>> = body._attributeFilters()

    /**
     * Returns the raw JSON value of [limit].
     *
     * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _limit(): JsonField<Long> = body._limit()

    /**
     * Returns the raw JSON value of [offset].
     *
     * Unlike [offset], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _offset(): JsonField<Long> = body._offset()

    /**
     * Returns the raw JSON value of [orderBy].
     *
     * Unlike [orderBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _orderBy(): JsonField<List<String>> = body._orderBy()

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
        @JsonProperty("attribute_filters")
        @ExcludeMissing
        private val attributeFilters: JsonField<List<QueryCondition>> = JsonMissing.of(),
        @JsonProperty("limit")
        @ExcludeMissing
        private val limit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("offset")
        @ExcludeMissing
        private val offset: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("order_by")
        @ExcludeMissing
        private val orderBy: JsonField<List<String>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun attributeFilters(): List<QueryCondition>? =
            attributeFilters.getNullable("attribute_filters")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun limit(): Long? = limit.getNullable("limit")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun offset(): Long? = offset.getNullable("offset")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun orderBy(): List<String>? = orderBy.getNullable("order_by")

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
         * Returns the raw JSON value of [limit].
         *
         * Unlike [limit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("limit") @ExcludeMissing fun _limit(): JsonField<Long> = limit

        /**
         * Returns the raw JSON value of [offset].
         *
         * Unlike [offset], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("offset") @ExcludeMissing fun _offset(): JsonField<Long> = offset

        /**
         * Returns the raw JSON value of [orderBy].
         *
         * Unlike [orderBy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("order_by") @ExcludeMissing fun _orderBy(): JsonField<List<String>> = orderBy

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            attributeFilters()?.forEach { it.validate() }
            limit()
            offset()
            orderBy()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Body]. */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var attributeFilters: JsonField<MutableList<QueryCondition>>? = null
            private var limit: JsonField<Long> = JsonMissing.of()
            private var offset: JsonField<Long> = JsonMissing.of()
            private var orderBy: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                attributeFilters = body.attributeFilters.map { it.toMutableList() }
                limit = body.limit
                offset = body.offset
                orderBy = body.orderBy.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

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

            fun limit(limit: Long) = limit(JsonField.of(limit))

            /**
             * Sets [Builder.limit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.limit] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun limit(limit: JsonField<Long>) = apply { this.limit = limit }

            fun offset(offset: Long) = offset(JsonField.of(offset))

            /**
             * Sets [Builder.offset] to an arbitrary JSON value.
             *
             * You should usually call [Builder.offset] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun offset(offset: JsonField<Long>) = apply { this.offset = offset }

            fun orderBy(orderBy: List<String>) = orderBy(JsonField.of(orderBy))

            /**
             * Sets [Builder.orderBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.orderBy] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun orderBy(orderBy: JsonField<List<String>>) = apply {
                this.orderBy = orderBy.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.orderBy].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOrderBy(orderBy: String) = apply {
                this.orderBy =
                    (this.orderBy ?: JsonField.of(mutableListOf())).also {
                        checkKnown("orderBy", it).add(orderBy)
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

            fun build(): Body =
                Body(
                    (attributeFilters ?: JsonMissing.of()).map { it.toImmutable() },
                    limit,
                    offset,
                    (orderBy ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && attributeFilters == other.attributeFilters && limit == other.limit && offset == other.offset && orderBy == other.orderBy && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(attributeFilters, limit, offset, orderBy, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{attributeFilters=$attributeFilters, limit=$limit, offset=$offset, orderBy=$orderBy, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TelemetryQueryTracesParams].
         */
        fun builder() = Builder()
    }

    /** A builder for [TelemetryQueryTracesParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(telemetryQueryTracesParams: TelemetryQueryTracesParams) = apply {
            body = telemetryQueryTracesParams.body.toBuilder()
            additionalHeaders = telemetryQueryTracesParams.additionalHeaders.toBuilder()
            additionalQueryParams = telemetryQueryTracesParams.additionalQueryParams.toBuilder()
        }

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

        fun limit(limit: Long) = apply { body.limit(limit) }

        /**
         * Sets [Builder.limit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limit] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun limit(limit: JsonField<Long>) = apply { body.limit(limit) }

        fun offset(offset: Long) = apply { body.offset(offset) }

        /**
         * Sets [Builder.offset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.offset] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun offset(offset: JsonField<Long>) = apply { body.offset(offset) }

        fun orderBy(orderBy: List<String>) = apply { body.orderBy(orderBy) }

        /**
         * Sets [Builder.orderBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.orderBy] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun orderBy(orderBy: JsonField<List<String>>) = apply { body.orderBy(orderBy) }

        /**
         * Adds a single [String] to [Builder.orderBy].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOrderBy(orderBy: String) = apply { body.addOrderBy(orderBy) }

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

        fun build(): TelemetryQueryTracesParams =
            TelemetryQueryTracesParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TelemetryQueryTracesParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "TelemetryQueryTracesParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
