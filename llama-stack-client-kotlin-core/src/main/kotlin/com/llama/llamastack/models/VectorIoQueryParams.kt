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
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

class VectorIoQueryParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * A image content item
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun query(): InterleavedContent = body.query()

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun vectorDbId(): String = body.vectorDbId()

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun params(): Params? = body.params()

    /**
     * Returns the raw JSON value of [query].
     *
     * Unlike [query], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _query(): JsonField<InterleavedContent> = body._query()

    /**
     * Returns the raw JSON value of [vectorDbId].
     *
     * Unlike [vectorDbId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _vectorDbId(): JsonField<String> = body._vectorDbId()

    /**
     * Returns the raw JSON value of [params].
     *
     * Unlike [params], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _params(): JsonField<Params> = body._params()

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
        @JsonProperty("query")
        @ExcludeMissing
        private val query: JsonField<InterleavedContent> = JsonMissing.of(),
        @JsonProperty("vector_db_id")
        @ExcludeMissing
        private val vectorDbId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("params")
        @ExcludeMissing
        private val params: JsonField<Params> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * A image content item
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun query(): InterleavedContent = query.getRequired("query")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun vectorDbId(): String = vectorDbId.getRequired("vector_db_id")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun params(): Params? = params.getNullable("params")

        /**
         * Returns the raw JSON value of [query].
         *
         * Unlike [query], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("query") @ExcludeMissing fun _query(): JsonField<InterleavedContent> = query

        /**
         * Returns the raw JSON value of [vectorDbId].
         *
         * Unlike [vectorDbId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("vector_db_id")
        @ExcludeMissing
        fun _vectorDbId(): JsonField<String> = vectorDbId

        /**
         * Returns the raw JSON value of [params].
         *
         * Unlike [params], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("params") @ExcludeMissing fun _params(): JsonField<Params> = params

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            query().validate()
            vectorDbId()
            params()?.validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .query()
             * .vectorDbId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var query: JsonField<InterleavedContent>? = null
            private var vectorDbId: JsonField<String>? = null
            private var params: JsonField<Params> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                query = body.query
                vectorDbId = body.vectorDbId
                params = body.params
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** A image content item */
            fun query(query: InterleavedContent) = query(JsonField.of(query))

            /**
             * Sets [Builder.query] to an arbitrary JSON value.
             *
             * You should usually call [Builder.query] with a well-typed [InterleavedContent] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun query(query: JsonField<InterleavedContent>) = apply { this.query = query }

            /** Alias for calling [query] with `InterleavedContent.ofString(string)`. */
            fun query(string: String) = query(InterleavedContent.ofString(string))

            /**
             * Alias for calling [query] with
             * `InterleavedContent.ofImageContentItem(imageContentItem)`.
             */
            fun query(imageContentItem: InterleavedContent.ImageContentItem) =
                query(InterleavedContent.ofImageContentItem(imageContentItem))

            /**
             * Alias for calling [query] with
             * `InterleavedContent.ofTextContentItem(textContentItem)`.
             */
            fun query(textContentItem: InterleavedContent.TextContentItem) =
                query(InterleavedContent.ofTextContentItem(textContentItem))

            /** Alias for calling [query] with `InterleavedContent.ofItems(items)`. */
            fun queryOfItems(items: List<InterleavedContentItem>) =
                query(InterleavedContent.ofItems(items))

            fun vectorDbId(vectorDbId: String) = vectorDbId(JsonField.of(vectorDbId))

            /**
             * Sets [Builder.vectorDbId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vectorDbId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vectorDbId(vectorDbId: JsonField<String>) = apply { this.vectorDbId = vectorDbId }

            fun params(params: Params) = params(JsonField.of(params))

            /**
             * Sets [Builder.params] to an arbitrary JSON value.
             *
             * You should usually call [Builder.params] with a well-typed [Params] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun params(params: JsonField<Params>) = apply { this.params = params }

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
                    checkRequired("query", query),
                    checkRequired("vectorDbId", vectorDbId),
                    params,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && query == other.query && vectorDbId == other.vectorDbId && params == other.params && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(query, vectorDbId, params, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{query=$query, vectorDbId=$vectorDbId, params=$params, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [VectorIoQueryParams].
         *
         * The following fields are required:
         * ```kotlin
         * .query()
         * .vectorDbId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [VectorIoQueryParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(vectorIoQueryParams: VectorIoQueryParams) = apply {
            body = vectorIoQueryParams.body.toBuilder()
            additionalHeaders = vectorIoQueryParams.additionalHeaders.toBuilder()
            additionalQueryParams = vectorIoQueryParams.additionalQueryParams.toBuilder()
        }

        /** A image content item */
        fun query(query: InterleavedContent) = apply { body.query(query) }

        /**
         * Sets [Builder.query] to an arbitrary JSON value.
         *
         * You should usually call [Builder.query] with a well-typed [InterleavedContent] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun query(query: JsonField<InterleavedContent>) = apply { body.query(query) }

        /** Alias for calling [query] with `InterleavedContent.ofString(string)`. */
        fun query(string: String) = apply { body.query(string) }

        /**
         * Alias for calling [query] with `InterleavedContent.ofImageContentItem(imageContentItem)`.
         */
        fun query(imageContentItem: InterleavedContent.ImageContentItem) = apply {
            body.query(imageContentItem)
        }

        /**
         * Alias for calling [query] with `InterleavedContent.ofTextContentItem(textContentItem)`.
         */
        fun query(textContentItem: InterleavedContent.TextContentItem) = apply {
            body.query(textContentItem)
        }

        /** Alias for calling [query] with `InterleavedContent.ofItems(items)`. */
        fun queryOfItems(items: List<InterleavedContentItem>) = apply { body.queryOfItems(items) }

        fun vectorDbId(vectorDbId: String) = apply { body.vectorDbId(vectorDbId) }

        /**
         * Sets [Builder.vectorDbId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vectorDbId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun vectorDbId(vectorDbId: JsonField<String>) = apply { body.vectorDbId(vectorDbId) }

        fun params(params: Params) = apply { body.params(params) }

        /**
         * Sets [Builder.params] to an arbitrary JSON value.
         *
         * You should usually call [Builder.params] with a well-typed [Params] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun params(params: JsonField<Params>) = apply { body.params(params) }

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

        fun build(): VectorIoQueryParams =
            VectorIoQueryParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class Params
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Params = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Params]. */
            fun builder() = Builder()
        }

        /** A builder for [Params]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(params: Params) = apply {
                additionalProperties = params.additionalProperties.toMutableMap()
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

            fun build(): Params = Params(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Params && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Params{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is VectorIoQueryParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "VectorIoQueryParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
