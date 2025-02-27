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
    @JsonProperty("tool_name")
    @ExcludeMissing
    private val toolName: JsonField<ToolName> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Unique identifier for the tool call this response is for */
    fun callId(): String = callId.getRequired("call_id")

    /** The response content from the tool */
    fun content(): InterleavedContent = content.getRequired("content")

    /** Must be "tool" to identify this as a tool response */
    @JsonProperty("role") @ExcludeMissing fun _role(): JsonValue = role

    /** Name of the tool that was called */
    fun toolName(): ToolName = toolName.getRequired("tool_name")

    /** Unique identifier for the tool call this response is for */
    @JsonProperty("call_id") @ExcludeMissing fun _callId(): JsonField<String> = callId

    /** The response content from the tool */
    @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<InterleavedContent> = content

    /** Name of the tool that was called */
    @JsonProperty("tool_name") @ExcludeMissing fun _toolName(): JsonField<ToolName> = toolName

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
        toolName()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [ToolResponseMessage]. */
    class Builder internal constructor() {

        private var callId: JsonField<String>? = null
        private var content: JsonField<InterleavedContent>? = null
        private var role: JsonValue = JsonValue.from("tool")
        private var toolName: JsonField<ToolName>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(toolResponseMessage: ToolResponseMessage) = apply {
            callId = toolResponseMessage.callId
            content = toolResponseMessage.content
            role = toolResponseMessage.role
            toolName = toolResponseMessage.toolName
            additionalProperties = toolResponseMessage.additionalProperties.toMutableMap()
        }

        /** Unique identifier for the tool call this response is for */
        fun callId(callId: String) = callId(JsonField.of(callId))

        /** Unique identifier for the tool call this response is for */
        fun callId(callId: JsonField<String>) = apply { this.callId = callId }

        /** The response content from the tool */
        fun content(content: InterleavedContent) = content(JsonField.of(content))

        /** The response content from the tool */
        fun content(content: JsonField<InterleavedContent>) = apply { this.content = content }

        /** The response content from the tool */
        fun content(string: String) = content(InterleavedContent.ofString(string))

        /** A image content item */
        fun content(imageContentItem: InterleavedContent.ImageContentItem) =
            content(InterleavedContent.ofImageContentItem(imageContentItem))

        /** A text content item */
        fun content(textContentItem: InterleavedContent.TextContentItem) =
            content(InterleavedContent.ofTextContentItem(textContentItem))

        /** The response content from the tool */
        fun contentOfItems(items: List<InterleavedContentItem>) =
            content(InterleavedContent.ofItems(items))

        /** Must be "tool" to identify this as a tool response */
        fun role(role: JsonValue) = apply { this.role = role }

        /** Name of the tool that was called */
        fun toolName(toolName: ToolName) = toolName(JsonField.of(toolName))

        /** Name of the tool that was called */
        fun toolName(toolName: JsonField<ToolName>) = apply { this.toolName = toolName }

        /** Name of the tool that was called */
        fun toolName(value: String) = toolName(ToolName.of(value))

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
                checkRequired("toolName", toolName),
                additionalProperties.toImmutable(),
            )
    }

    /** Name of the tool that was called */
    class ToolName @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val BRAVE_SEARCH = of("brave_search")

            val WOLFRAM_ALPHA = of("wolfram_alpha")

            val PHOTOGEN = of("photogen")

            val CODE_INTERPRETER = of("code_interpreter")

            fun of(value: String) = ToolName(JsonField.of(value))
        }

        /** An enum containing [ToolName]'s known values. */
        enum class Known {
            BRAVE_SEARCH,
            WOLFRAM_ALPHA,
            PHOTOGEN,
            CODE_INTERPRETER,
        }

        /**
         * An enum containing [ToolName]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ToolName] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BRAVE_SEARCH,
            WOLFRAM_ALPHA,
            PHOTOGEN,
            CODE_INTERPRETER,
            /** An enum member indicating that [ToolName] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                BRAVE_SEARCH -> Value.BRAVE_SEARCH
                WOLFRAM_ALPHA -> Value.WOLFRAM_ALPHA
                PHOTOGEN -> Value.PHOTOGEN
                CODE_INTERPRETER -> Value.CODE_INTERPRETER
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LlamaStackClientInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                BRAVE_SEARCH -> Known.BRAVE_SEARCH
                WOLFRAM_ALPHA -> Known.WOLFRAM_ALPHA
                PHOTOGEN -> Known.PHOTOGEN
                CODE_INTERPRETER -> Known.CODE_INTERPRETER
                else -> throw LlamaStackClientInvalidDataException("Unknown ToolName: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LlamaStackClientInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString()
                ?: throw LlamaStackClientInvalidDataException("Value is not a String")

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ToolName && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ToolResponseMessage && callId == other.callId && content == other.content && role == other.role && toolName == other.toolName && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(callId, content, role, toolName, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ToolResponseMessage{callId=$callId, content=$content, role=$role, toolName=$toolName, additionalProperties=$additionalProperties}"
}
