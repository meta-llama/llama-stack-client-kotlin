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
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import java.util.Objects

@NoAutoDetect
class QueryResult
@JsonCreator
private constructor(
    @JsonProperty("content")
    @ExcludeMissing
    private val content: JsonField<InterleavedContent> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** A image content item */
    fun content(): InterleavedContent? = content.getNullable("content")

    /** A image content item */
    @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<InterleavedContent> = content

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): QueryResult = apply {
        if (validated) {
            return@apply
        }

        content()?.validate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [QueryResult]. */
    class Builder internal constructor() {

        private var content: JsonField<InterleavedContent> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(queryResult: QueryResult) = apply {
            content = queryResult.content
            additionalProperties = queryResult.additionalProperties.toMutableMap()
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

        fun build(): QueryResult = QueryResult(content, additionalProperties.toImmutable())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is QueryResult && content == other.content && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(content, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "QueryResult{content=$content, additionalProperties=$additionalProperties}"
}
