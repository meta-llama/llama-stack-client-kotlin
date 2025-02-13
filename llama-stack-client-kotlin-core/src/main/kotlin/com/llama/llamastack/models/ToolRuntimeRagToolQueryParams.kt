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
import java.util.Objects

/** Query the RAG system for context; typically invoked by the agent */
class ToolRuntimeRagToolQueryParams
private constructor(
    private val body: ToolRuntimeRagToolQueryBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** A image content item */
    fun content(): InterleavedContent = body.content()

    fun vectorDbIds(): List<String> = body.vectorDbIds()

    fun queryConfig(): QueryConfig? = body.queryConfig()

    /** A image content item */
    fun _content(): JsonField<InterleavedContent> = body._content()

    fun _vectorDbIds(): JsonField<List<String>> = body._vectorDbIds()

    fun _queryConfig(): JsonField<QueryConfig> = body._queryConfig()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): ToolRuntimeRagToolQueryBody = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class ToolRuntimeRagToolQueryBody
    @JsonCreator
    internal constructor(
        @JsonProperty("content")
        @ExcludeMissing
        private val content: JsonField<InterleavedContent> = JsonMissing.of(),
        @JsonProperty("vector_db_ids")
        @ExcludeMissing
        private val vectorDbIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("query_config")
        @ExcludeMissing
        private val queryConfig: JsonField<QueryConfig> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** A image content item */
        fun content(): InterleavedContent = content.getRequired("content")

        fun vectorDbIds(): List<String> = vectorDbIds.getRequired("vector_db_ids")

        fun queryConfig(): QueryConfig? = queryConfig.getNullable("query_config")

        /** A image content item */
        @JsonProperty("content")
        @ExcludeMissing
        fun _content(): JsonField<InterleavedContent> = content

        @JsonProperty("vector_db_ids")
        @ExcludeMissing
        fun _vectorDbIds(): JsonField<List<String>> = vectorDbIds

        @JsonProperty("query_config")
        @ExcludeMissing
        fun _queryConfig(): JsonField<QueryConfig> = queryConfig

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ToolRuntimeRagToolQueryBody = apply {
            if (validated) {
                return@apply
            }

            content().validate()
            vectorDbIds()
            queryConfig()?.validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [ToolRuntimeRagToolQueryBody]. */
        class Builder internal constructor() {

            private var content: JsonField<InterleavedContent>? = null
            private var vectorDbIds: JsonField<MutableList<String>>? = null
            private var queryConfig: JsonField<QueryConfig> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(toolRuntimeRagToolQueryBody: ToolRuntimeRagToolQueryBody) = apply {
                content = toolRuntimeRagToolQueryBody.content
                vectorDbIds = toolRuntimeRagToolQueryBody.vectorDbIds.map { it.toMutableList() }
                queryConfig = toolRuntimeRagToolQueryBody.queryConfig
                additionalProperties =
                    toolRuntimeRagToolQueryBody.additionalProperties.toMutableMap()
            }

            /** A image content item */
            fun content(content: InterleavedContent) = content(JsonField.of(content))

            /** A image content item */
            fun content(content: JsonField<InterleavedContent>) = apply { this.content = content }

            /** A image content item */
            fun content(string: String) = content(InterleavedContent.ofString(string))

            /** A image content item */
            fun content(imageContentItem: InterleavedContent.ImageContentItem) =
                content(InterleavedContent.ofImageContentItem(imageContentItem))

            /** A text content item */
            fun content(textContentItem: InterleavedContent.TextContentItem) =
                content(InterleavedContent.ofTextContentItem(textContentItem))

            /** A image content item */
            fun contentOfItems(items: List<InterleavedContentItem>) =
                content(InterleavedContent.ofItems(items))

            fun vectorDbIds(vectorDbIds: List<String>) = vectorDbIds(JsonField.of(vectorDbIds))

            fun vectorDbIds(vectorDbIds: JsonField<List<String>>) = apply {
                this.vectorDbIds = vectorDbIds.map { it.toMutableList() }
            }

            fun addVectorDbId(vectorDbId: String) = apply {
                vectorDbIds =
                    (vectorDbIds ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(vectorDbId)
                    }
            }

            fun queryConfig(queryConfig: QueryConfig) = queryConfig(JsonField.of(queryConfig))

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

            fun build(): ToolRuntimeRagToolQueryBody =
                ToolRuntimeRagToolQueryBody(
                    checkRequired("content", content),
                    checkRequired("vectorDbIds", vectorDbIds).map { it.toImmutable() },
                    queryConfig,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ToolRuntimeRagToolQueryBody && content == other.content && vectorDbIds == other.vectorDbIds && queryConfig == other.queryConfig && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(content, vectorDbIds, queryConfig, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ToolRuntimeRagToolQueryBody{content=$content, vectorDbIds=$vectorDbIds, queryConfig=$queryConfig, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [ToolRuntimeRagToolQueryParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: ToolRuntimeRagToolQueryBody.Builder =
            ToolRuntimeRagToolQueryBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(toolRuntimeRagToolQueryParams: ToolRuntimeRagToolQueryParams) = apply {
            body = toolRuntimeRagToolQueryParams.body.toBuilder()
            additionalHeaders = toolRuntimeRagToolQueryParams.additionalHeaders.toBuilder()
            additionalQueryParams = toolRuntimeRagToolQueryParams.additionalQueryParams.toBuilder()
        }

        /** A image content item */
        fun content(content: InterleavedContent) = apply { body.content(content) }

        /** A image content item */
        fun content(content: JsonField<InterleavedContent>) = apply { body.content(content) }

        /** A image content item */
        fun content(string: String) = apply { body.content(string) }

        /** A image content item */
        fun content(imageContentItem: InterleavedContent.ImageContentItem) = apply {
            body.content(imageContentItem)
        }

        /** A text content item */
        fun content(textContentItem: InterleavedContent.TextContentItem) = apply {
            body.content(textContentItem)
        }

        /** A image content item */
        fun contentOfItems(items: List<InterleavedContentItem>) = apply {
            body.contentOfItems(items)
        }

        fun vectorDbIds(vectorDbIds: List<String>) = apply { body.vectorDbIds(vectorDbIds) }

        fun vectorDbIds(vectorDbIds: JsonField<List<String>>) = apply {
            body.vectorDbIds(vectorDbIds)
        }

        fun addVectorDbId(vectorDbId: String) = apply { body.addVectorDbId(vectorDbId) }

        fun queryConfig(queryConfig: QueryConfig) = apply { body.queryConfig(queryConfig) }

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

        fun build(): ToolRuntimeRagToolQueryParams =
            ToolRuntimeRagToolQueryParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
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
