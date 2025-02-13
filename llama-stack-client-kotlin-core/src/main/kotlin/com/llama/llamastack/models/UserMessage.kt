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
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

/** A message from the user in a chat conversation. */
@NoAutoDetect
class UserMessage
@JsonCreator
private constructor(
    @JsonProperty("content")
    @ExcludeMissing
    private val content: JsonField<InterleavedContent> = JsonMissing.of(),
    @JsonProperty("role") @ExcludeMissing private val role: JsonValue = JsonMissing.of(),
    @JsonProperty("context")
    @ExcludeMissing
    private val context: JsonField<InterleavedContent> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The content of the message, which can include text and other media */
    fun content(): InterleavedContent = content.getRequired("content")

    /** Must be "user" to identify this as a user message */
    @JsonProperty("role") @ExcludeMissing fun _role(): JsonValue = role

    /**
     * (Optional) This field is used internally by Llama Stack to pass RAG context. This field may
     * be removed in the API in the future.
     */
    fun context(): InterleavedContent? = context.getNullable("context")

    /** The content of the message, which can include text and other media */
    @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<InterleavedContent> = content

    /**
     * (Optional) This field is used internally by Llama Stack to pass RAG context. This field may
     * be removed in the API in the future.
     */
    @JsonProperty("context") @ExcludeMissing fun _context(): JsonField<InterleavedContent> = context

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): UserMessage = apply {
        if (validated) {
            return@apply
        }

        content().validate()
        _role().let {
            if (it != JsonValue.from("user")) {
                throw LlamaStackClientInvalidDataException("'role' is invalid, received $it")
            }
        }
        context()?.validate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [UserMessage]. */
    class Builder internal constructor() {

        private var content: JsonField<InterleavedContent>? = null
        private var role: JsonValue = JsonValue.from("user")
        private var context: JsonField<InterleavedContent> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(userMessage: UserMessage) = apply {
            content = userMessage.content
            role = userMessage.role
            context = userMessage.context
            additionalProperties = userMessage.additionalProperties.toMutableMap()
        }

        /** The content of the message, which can include text and other media */
        fun content(content: InterleavedContent) = content(JsonField.of(content))

        /** The content of the message, which can include text and other media */
        fun content(content: JsonField<InterleavedContent>) = apply { this.content = content }

        /** The content of the message, which can include text and other media */
        fun content(string: String) = content(InterleavedContent.ofString(string))

        /** A image content item */
        fun content(imageContentItem: InterleavedContent.ImageContentItem) =
            content(InterleavedContent.ofImageContentItem(imageContentItem))

        /** A text content item */
        fun content(textContentItem: InterleavedContent.TextContentItem) =
            content(InterleavedContent.ofTextContentItem(textContentItem))

        /** The content of the message, which can include text and other media */
        fun contentOfItems(items: List<InterleavedContentItem>) =
            content(InterleavedContent.ofItems(items))

        /** Must be "user" to identify this as a user message */
        fun role(role: JsonValue) = apply { this.role = role }

        /**
         * (Optional) This field is used internally by Llama Stack to pass RAG context. This field
         * may be removed in the API in the future.
         */
        fun context(context: InterleavedContent) = context(JsonField.of(context))

        /**
         * (Optional) This field is used internally by Llama Stack to pass RAG context. This field
         * may be removed in the API in the future.
         */
        fun context(context: JsonField<InterleavedContent>) = apply { this.context = context }

        /**
         * (Optional) This field is used internally by Llama Stack to pass RAG context. This field
         * may be removed in the API in the future.
         */
        fun context(string: String) = context(InterleavedContent.ofString(string))

        /** A image content item */
        fun context(imageContentItem: InterleavedContent.ImageContentItem) =
            context(InterleavedContent.ofImageContentItem(imageContentItem))

        /** A text content item */
        fun context(textContentItem: InterleavedContent.TextContentItem) =
            context(InterleavedContent.ofTextContentItem(textContentItem))

        /**
         * (Optional) This field is used internally by Llama Stack to pass RAG context. This field
         * may be removed in the API in the future.
         */
        fun contextOfItems(items: List<InterleavedContentItem>) =
            context(InterleavedContent.ofItems(items))

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

        fun build(): UserMessage =
            UserMessage(
                checkRequired("content", content),
                role,
                context,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is UserMessage && content == other.content && role == other.role && context == other.context && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(content, role, context, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UserMessage{content=$content, role=$role, context=$context, additionalProperties=$additionalProperties}"
}
