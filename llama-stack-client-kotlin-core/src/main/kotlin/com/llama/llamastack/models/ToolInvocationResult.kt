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
import java.util.Objects

@NoAutoDetect
class ToolInvocationResult
@JsonCreator
private constructor(
    @JsonProperty("content")
    @ExcludeMissing
    private val content: JsonField<InterleavedContent> = JsonMissing.of(),
    @JsonProperty("error_code")
    @ExcludeMissing
    private val errorCode: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("error_message")
    @ExcludeMissing
    private val errorMessage: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun content(): InterleavedContent = content.getRequired("content")

    fun errorCode(): Long? = errorCode.getNullable("error_code")

    fun errorMessage(): String? = errorMessage.getNullable("error_message")

    @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<InterleavedContent> = content

    @JsonProperty("error_code") @ExcludeMissing fun _errorCode(): JsonField<Long> = errorCode

    @JsonProperty("error_message")
    @ExcludeMissing
    fun _errorMessage(): JsonField<String> = errorMessage

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ToolInvocationResult = apply {
        if (validated) {
            return@apply
        }

        content().validate()
        errorCode()
        errorMessage()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var content: JsonField<InterleavedContent>? = null
        private var errorCode: JsonField<Long> = JsonMissing.of()
        private var errorMessage: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(toolInvocationResult: ToolInvocationResult) = apply {
            content = toolInvocationResult.content
            errorCode = toolInvocationResult.errorCode
            errorMessage = toolInvocationResult.errorMessage
            additionalProperties = toolInvocationResult.additionalProperties.toMutableMap()
        }

        fun content(content: InterleavedContent) = content(JsonField.of(content))

        fun content(content: JsonField<InterleavedContent>) = apply { this.content = content }

        fun content(string: String) = content(InterleavedContent.ofString(string))

        fun content(imageContentItem: InterleavedContent.ImageContentItem) =
            content(InterleavedContent.ofImageContentItem(imageContentItem))

        fun content(textContentItem: InterleavedContent.TextContentItem) =
            content(InterleavedContent.ofTextContentItem(textContentItem))

        fun contentOfInterleavedContentItems(
            interleavedContentItems: List<InterleavedContentItem>
        ) = content(InterleavedContent.ofInterleavedContentItems(interleavedContentItems))

        fun errorCode(errorCode: Long) = errorCode(JsonField.of(errorCode))

        fun errorCode(errorCode: JsonField<Long>) = apply { this.errorCode = errorCode }

        fun errorMessage(errorMessage: String) = errorMessage(JsonField.of(errorMessage))

        fun errorMessage(errorMessage: JsonField<String>) = apply {
            this.errorMessage = errorMessage
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

        fun build(): ToolInvocationResult =
            ToolInvocationResult(
                checkRequired("content", content),
                errorCode,
                errorMessage,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ToolInvocationResult && content == other.content && errorCode == other.errorCode && errorMessage == other.errorMessage && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(content, errorCode, errorMessage, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ToolInvocationResult{content=$content, errorCode=$errorCode, errorMessage=$errorMessage, additionalProperties=$additionalProperties}"
}
