// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.llama.llamastack.core.Enum
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

@NoAutoDetect
class UserMessage
@JsonCreator
private constructor(
    @JsonProperty("content")
    @ExcludeMissing
    private val content: JsonField<InterleavedContent> = JsonMissing.of(),
    @JsonProperty("role") @ExcludeMissing private val role: JsonField<Role> = JsonMissing.of(),
    @JsonProperty("context")
    @ExcludeMissing
    private val context: JsonField<InterleavedContent> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun content(): InterleavedContent = content.getRequired("content")

    fun role(): Role = role.getRequired("role")

    fun context(): InterleavedContent? = context.getNullable("context")

    @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<InterleavedContent> = content

    @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<Role> = role

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
        role()
        context()?.validate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var content: JsonField<InterleavedContent>? = null
        private var role: JsonField<Role>? = null
        private var context: JsonField<InterleavedContent> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(userMessage: UserMessage) = apply {
            content = userMessage.content
            role = userMessage.role
            context = userMessage.context
            additionalProperties = userMessage.additionalProperties.toMutableMap()
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

        fun role(role: Role) = role(JsonField.of(role))

        fun role(role: JsonField<Role>) = apply { this.role = role }

        fun context(context: InterleavedContent) = context(JsonField.of(context))

        fun context(context: JsonField<InterleavedContent>) = apply { this.context = context }

        fun context(string: String) = context(InterleavedContent.ofString(string))

        fun context(imageContentItem: InterleavedContent.ImageContentItem) =
            context(InterleavedContent.ofImageContentItem(imageContentItem))

        fun context(textContentItem: InterleavedContent.TextContentItem) =
            context(InterleavedContent.ofTextContentItem(textContentItem))

        fun contextOfInterleavedContentItems(
            interleavedContentItems: List<InterleavedContentItem>
        ) = context(InterleavedContent.ofInterleavedContentItems(interleavedContentItems))

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
                checkRequired("role", role),
                context,
                additionalProperties.toImmutable(),
            )
    }

    class Role
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val USER = of("user")

            fun of(value: String) = Role(JsonField.of(value))
        }

        enum class Known {
            USER,
        }

        enum class Value {
            USER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                USER -> Value.USER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                USER -> Known.USER
                else -> throw LlamaStackClientInvalidDataException("Unknown Role: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Role && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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
