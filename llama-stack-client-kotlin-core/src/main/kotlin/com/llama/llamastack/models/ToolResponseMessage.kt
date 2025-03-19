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

/** A message representing the result of a tool invocation. */
@NoAutoDetect
class ToolResponseMessage
@JsonCreator
private constructor(
    @JsonProperty("call_id")
    @ExcludeMissing
    private val callId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("content")
    @ExcludeMissing
    private val content: JsonField<InterleavedContent> = JsonMissing.of(),
    @JsonProperty("role") @ExcludeMissing private val role: JsonValue = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * Unique identifier for the tool call this response is for
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun callId(): String = callId.getRequired("call_id")

    /**
     * The response content from the tool
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun content(): InterleavedContent = content.getRequired("content")

    /**
     * Must be "tool" to identify this as a tool response
     *
     * Expected to always return the following:
     * ```kotlin
     * JsonValue.from("tool")
     * ```
     *
     * However, this method can be useful for debugging and logging (e.g. if the server responded
     * with an unexpected value).
     */
    @JsonProperty("role") @ExcludeMissing fun _role(): JsonValue = role

    /**
     * Returns the raw JSON value of [callId].
     *
     * Unlike [callId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("call_id") @ExcludeMissing fun _callId(): JsonField<String> = callId

    /**
     * Returns the raw JSON value of [content].
     *
     * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<InterleavedContent> = content

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ToolResponseMessage = apply {
        if (validated) {
            return@apply
        }

        callId()
        content().validate()
        _role().let {
            if (it != JsonValue.from("tool")) {
                throw LlamaStackClientInvalidDataException("'role' is invalid, received $it")
            }
        }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ToolResponseMessage].
         *
         * The following fields are required:
         * ```kotlin
         * .callId()
         * .content()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ToolResponseMessage]. */
    class Builder internal constructor() {

        private var callId: JsonField<String>? = null
        private var content: JsonField<InterleavedContent>? = null
        private var role: JsonValue = JsonValue.from("tool")
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(toolResponseMessage: ToolResponseMessage) = apply {
            callId = toolResponseMessage.callId
            content = toolResponseMessage.content
            role = toolResponseMessage.role
            additionalProperties = toolResponseMessage.additionalProperties.toMutableMap()
        }

        /** Unique identifier for the tool call this response is for */
        fun callId(callId: String) = callId(JsonField.of(callId))

        /**
         * Sets [Builder.callId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun callId(callId: JsonField<String>) = apply { this.callId = callId }

        /** The response content from the tool */
        fun content(content: InterleavedContent) = content(JsonField.of(content))

        /**
         * Sets [Builder.content] to an arbitrary JSON value.
         *
         * You should usually call [Builder.content] with a well-typed [InterleavedContent] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * Alias for calling [content] with `InterleavedContent.ofTextContentItem(textContentItem)`.
         */
        fun content(textContentItem: InterleavedContent.TextContentItem) =
            content(InterleavedContent.ofTextContentItem(textContentItem))

        /** Alias for calling [content] with `InterleavedContent.ofItems(items)`. */
        fun contentOfItems(items: List<InterleavedContentItem>) =
            content(InterleavedContent.ofItems(items))

        /**
         * Sets the field to an arbitrary JSON value.
         *
         * It is usually unnecessary to call this method because the field defaults to the
         * following:
         * ```kotlin
         * JsonValue.from("tool")
         * ```
         *
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
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

        fun build(): ToolResponseMessage =
            ToolResponseMessage(
                checkRequired("callId", callId),
                checkRequired("content", content),
                role,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ToolResponseMessage && callId == other.callId && content == other.content && role == other.role && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(callId, content, role, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ToolResponseMessage{callId=$callId, content=$content, role=$role, additionalProperties=$additionalProperties}"
}
