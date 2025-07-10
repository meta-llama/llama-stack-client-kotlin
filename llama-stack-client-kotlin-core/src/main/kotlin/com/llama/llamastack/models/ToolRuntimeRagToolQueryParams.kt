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

/** Query the RAG system for context; typically invoked by the agent */
class ToolRuntimeRagToolQueryParams
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
    fun content(): InterleavedContent = body.content()

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun vectorDbIds(): List<String> = body.vectorDbIds()

    /**
     * Configuration for the RAG query generation.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun queryConfig(): QueryConfig? = body.queryConfig()

    /**
     * Returns the raw JSON value of [content].
     *
     * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _content(): JsonField<InterleavedContent> = body._content()

    /**
     * Returns the raw JSON value of [vectorDbIds].
     *
     * Unlike [vectorDbIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _vectorDbIds(): JsonField<List<String>> = body._vectorDbIds()

    /**
     * Returns the raw JSON value of [queryConfig].
     *
     * Unlike [queryConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _queryConfig(): JsonField<QueryConfig> = body._queryConfig()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ToolRuntimeRagToolQueryParams].
         *
         * The following fields are required:
         * ```kotlin
         * .content()
         * .vectorDbIds()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ToolRuntimeRagToolQueryParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(toolRuntimeRagToolQueryParams: ToolRuntimeRagToolQueryParams) = apply {
            body = toolRuntimeRagToolQueryParams.body.toBuilder()
            additionalHeaders = toolRuntimeRagToolQueryParams.additionalHeaders.toBuilder()
            additionalQueryParams = toolRuntimeRagToolQueryParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [content]
         * - [vectorDbIds]
         * - [queryConfig]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** A image content item */
        fun content(content: InterleavedContent) = apply { body.content(content) }

        /**
         * Sets [Builder.content] to an arbitrary JSON value.
         *
         * You should usually call [Builder.content] with a well-typed [InterleavedContent] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun content(content: JsonField<InterleavedContent>) = apply { body.content(content) }

        /** Alias for calling [content] with `InterleavedContent.ofString(string)`. */
        fun content(string: String) = apply { body.content(string) }

        /**
         * Alias for calling [content] with
         * `InterleavedContent.ofImageContentItem(imageContentItem)`.
         */
        fun content(imageContentItem: InterleavedContent.ImageContentItem) = apply {
            body.content(imageContentItem)
        }

        /**
         * Alias for calling [content] with `InterleavedContent.ofTextContentItem(textContentItem)`.
         */
        fun content(textContentItem: InterleavedContent.TextContentItem) = apply {
            body.content(textContentItem)
        }

        /** Alias for calling [content] with `InterleavedContent.ofItems(items)`. */
        fun contentOfItems(items: List<InterleavedContentItem>) = apply {
            body.contentOfItems(items)
        }

        fun vectorDbIds(vectorDbIds: List<String>) = apply { body.vectorDbIds(vectorDbIds) }

        /**
         * Sets [Builder.vectorDbIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vectorDbIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun vectorDbIds(vectorDbIds: JsonField<List<String>>) = apply {
            body.vectorDbIds(vectorDbIds)
        }

        /**
         * Adds a single [String] to [vectorDbIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addVectorDbId(vectorDbId: String) = apply { body.addVectorDbId(vectorDbId) }

        /** Configuration for the RAG query generation. */
        fun queryConfig(queryConfig: QueryConfig) = apply { body.queryConfig(queryConfig) }

        /**
         * Sets [Builder.queryConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.queryConfig] with a well-typed [QueryConfig] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun queryConfig(queryConfig: JsonField<QueryConfig>) = apply {
            body.queryConfig(queryConfig)
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
         * Returns an immutable instance of [ToolRuntimeRagToolQueryParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .content()
         * .vectorDbIds()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ToolRuntimeRagToolQueryParams =
            ToolRuntimeRagToolQueryParams(
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
        private val content: JsonField<InterleavedContent>,
        private val vectorDbIds: JsonField<List<String>>,
        private val queryConfig: JsonField<QueryConfig>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("content")
            @ExcludeMissing
            content: JsonField<InterleavedContent> = JsonMissing.of(),
            @JsonProperty("vector_db_ids")
            @ExcludeMissing
            vectorDbIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("query_config")
            @ExcludeMissing
            queryConfig: JsonField<QueryConfig> = JsonMissing.of(),
        ) : this(content, vectorDbIds, queryConfig, mutableMapOf())

        /**
         * A image content item
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun content(): InterleavedContent = content.getRequired("content")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun vectorDbIds(): List<String> = vectorDbIds.getRequired("vector_db_ids")

        /**
         * Configuration for the RAG query generation.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun queryConfig(): QueryConfig? = queryConfig.getNullable("query_config")

        /**
         * Returns the raw JSON value of [content].
         *
         * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("content")
        @ExcludeMissing
        fun _content(): JsonField<InterleavedContent> = content

        /**
         * Returns the raw JSON value of [vectorDbIds].
         *
         * Unlike [vectorDbIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("vector_db_ids")
        @ExcludeMissing
        fun _vectorDbIds(): JsonField<List<String>> = vectorDbIds

        /**
         * Returns the raw JSON value of [queryConfig].
         *
         * Unlike [queryConfig], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("query_config")
        @ExcludeMissing
        fun _queryConfig(): JsonField<QueryConfig> = queryConfig

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
             * .content()
             * .vectorDbIds()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var content: JsonField<InterleavedContent>? = null
            private var vectorDbIds: JsonField<MutableList<String>>? = null
            private var queryConfig: JsonField<QueryConfig> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                content = body.content
                vectorDbIds = body.vectorDbIds.map { it.toMutableList() }
                queryConfig = body.queryConfig
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** A image content item */
            fun content(content: InterleavedContent) = content(JsonField.of(content))

            /**
             * Sets [Builder.content] to an arbitrary JSON value.
             *
             * You should usually call [Builder.content] with a well-typed [InterleavedContent]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun content(content: JsonField<InterleavedContent>) = apply { this.content = content }

            /** Alias for calling [content] with `InterleavedContent.ofString(string)`. */
            fun content(string: String) = content(InterleavedContent.ofString(string))

            /**
             * Alias for calling [content] with
             * `InterleavedContent.ofImageContentItem(imageContentItem)`.
             */
            fun content(imageContentItem: InterleavedContent.ImageContentItem) =
                content(InterleavedContent.ofImageContentItem(imageContentItem))

            /**
             * Alias for calling [content] with
             * `InterleavedContent.ofTextContentItem(textContentItem)`.
             */
            fun content(textContentItem: InterleavedContent.TextContentItem) =
                content(InterleavedContent.ofTextContentItem(textContentItem))

            /** Alias for calling [content] with `InterleavedContent.ofItems(items)`. */
            fun contentOfItems(items: List<InterleavedContentItem>) =
                content(InterleavedContent.ofItems(items))

            fun vectorDbIds(vectorDbIds: List<String>) = vectorDbIds(JsonField.of(vectorDbIds))

            /**
             * Sets [Builder.vectorDbIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vectorDbIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vectorDbIds(vectorDbIds: JsonField<List<String>>) = apply {
                this.vectorDbIds = vectorDbIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [vectorDbIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addVectorDbId(vectorDbId: String) = apply {
                vectorDbIds =
                    (vectorDbIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("vectorDbIds", it).add(vectorDbId)
                    }
            }

            /** Configuration for the RAG query generation. */
            fun queryConfig(queryConfig: QueryConfig) = queryConfig(JsonField.of(queryConfig))

            /**
             * Sets [Builder.queryConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.queryConfig] with a well-typed [QueryConfig] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun queryConfig(queryConfig: JsonField<QueryConfig>) = apply {
                this.queryConfig = queryConfig
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
             * .content()
             * .vectorDbIds()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("content", content),
                    checkRequired("vectorDbIds", vectorDbIds).map { it.toImmutable() },
                    queryConfig,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            content().validate()
            vectorDbIds()
            queryConfig()?.validate()
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
            (content.asKnown()?.validity() ?: 0) +
                (vectorDbIds.asKnown()?.size ?: 0) +
                (queryConfig.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && content == other.content && vectorDbIds == other.vectorDbIds && queryConfig == other.queryConfig && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(content, vectorDbIds, queryConfig, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{content=$content, vectorDbIds=$vectorDbIds, queryConfig=$queryConfig, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ToolRuntimeRagToolQueryParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ToolRuntimeRagToolQueryParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
