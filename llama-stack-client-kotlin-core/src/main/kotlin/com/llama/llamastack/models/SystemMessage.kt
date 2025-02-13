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

/** A system message providing instructions or context to the model. */
@NoAutoDetect
class SystemMessage
@JsonCreator
private constructor(
    @JsonProperty("content")
    @ExcludeMissing
    private val content: JsonField<InterleavedContent> = JsonMissing.of(),
    @JsonProperty("role") @ExcludeMissing private val role: JsonValue = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * The content of the "system prompt". If multiple system messages are provided, they are
     * concatenated. The underlying Llama Stack code may also add other system messages (for
     * example, for formatting tool definitions).
     */
    fun content(): InterleavedContent = content.getRequired("content")

    /** Must be "system" to identify this as a system message */
    @JsonProperty("role") @ExcludeMissing fun _role(): JsonValue = role

    /**
     * The content of the "system prompt". If multiple system messages are provided, they are
     * concatenated. The underlying Llama Stack code may also add other system messages (for
     * example, for formatting tool definitions).
     */
    @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<InterleavedContent> = content

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): SystemMessage = apply {
        if (validated) {
            return@apply
        }

        content().validate()
        _role().let {
            if (it != JsonValue.from("system")) {
                throw LlamaStackClientInvalidDataException("'role' is invalid, received $it")
            }
        }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [SystemMessage]. */
    class Builder internal constructor() {

        private var content: JsonField<InterleavedContent>? = null
        private var role: JsonValue = JsonValue.from("system")
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(systemMessage: SystemMessage) = apply {
            content = systemMessage.content
            role = systemMessage.role
            additionalProperties = systemMessage.additionalProperties.toMutableMap()
        }

        /**
         * The content of the "system prompt". If multiple system messages are provided, they are
         * concatenated. The underlying Llama Stack code may also add other system messages (for
         * example, for formatting tool definitions).
         */
        fun content(content: InterleavedContent) = content(JsonField.of(content))

        /**
         * The content of the "system prompt". If multiple system messages are provided, they are
         * concatenated. The underlying Llama Stack code may also add other system messages (for
         * example, for formatting tool definitions).
         */
        fun content(content: JsonField<InterleavedContent>) = apply { this.content = content }

        /**
         * The content of the "system prompt". If multiple system messages are provided, they are
         * concatenated. The underlying Llama Stack code may also add other system messages (for
         * example, for formatting tool definitions).
         */
        fun content(string: String) = content(InterleavedContent.ofString(string))

        /** A image content item */
        fun content(imageContentItem: InterleavedContent.ImageContentItem) =
            content(InterleavedContent.ofImageContentItem(imageContentItem))

        /** A text content item */
        fun content(textContentItem: InterleavedContent.TextContentItem) =
            content(InterleavedContent.ofTextContentItem(textContentItem))

        /**
         * The content of the "system prompt". If multiple system messages are provided, they are
         * concatenated. The underlying Llama Stack code may also add other system messages (for
         * example, for formatting tool definitions).
         */
        fun contentOfItems(items: List<InterleavedContentItem>) =
            content(InterleavedContent.ofItems(items))

        /** Must be "system" to identify this as a system message */
        fun role(role: JsonValue) = apply { this.role = role }

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

        fun build(): SystemMessage =
            SystemMessage(
                checkRequired("content", content),
                role,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SystemMessage && content == other.content && role == other.role && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(content, role, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SystemMessage{content=$content, role=$role, additionalProperties=$additionalProperties}"
}
