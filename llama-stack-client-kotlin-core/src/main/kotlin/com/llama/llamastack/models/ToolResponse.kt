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
class ToolResponse
@JsonCreator
private constructor(
    @JsonProperty("call_id")
    @ExcludeMissing
    private val callId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("content")
    @ExcludeMissing
    private val content: JsonField<InterleavedContent> = JsonMissing.of(),
    @JsonProperty("tool_name")
    @ExcludeMissing
    private val toolName: JsonField<ToolName> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun callId(): String = callId.getRequired("call_id")

    fun content(): InterleavedContent = content.getRequired("content")

    fun toolName(): ToolName = toolName.getRequired("tool_name")

    @JsonProperty("call_id") @ExcludeMissing fun _callId(): JsonField<String> = callId

    @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<InterleavedContent> = content

    @JsonProperty("tool_name") @ExcludeMissing fun _toolName(): JsonField<ToolName> = toolName

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ToolResponse = apply {
        if (validated) {
            return@apply
        }

        callId()
        content().validate()
        toolName()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var callId: JsonField<String>? = null
        private var content: JsonField<InterleavedContent>? = null
        private var toolName: JsonField<ToolName>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(toolResponse: ToolResponse) = apply {
            callId = toolResponse.callId
            content = toolResponse.content
            toolName = toolResponse.toolName
            additionalProperties = toolResponse.additionalProperties.toMutableMap()
        }

        fun callId(callId: String) = callId(JsonField.of(callId))

        fun callId(callId: JsonField<String>) = apply { this.callId = callId }

        fun content(content: InterleavedContent) = content(JsonField.of(content))

        fun content(content: JsonField<InterleavedContent>) = apply { this.content = content }

        fun content(string: String) = content(InterleavedContent.ofString(string))

        fun content(imageContentItem: InterleavedContent.ImageContentItem) =
            content(InterleavedContent.ofImageContentItem(imageContentItem))

        fun content(textContentItem: InterleavedContent.TextContentItem) =
            content(InterleavedContent.ofTextContentItem(textContentItem))

        fun contentOfItems(items: List<InterleavedContentItem>) =
            content(InterleavedContent.ofItems(items))

        fun toolName(toolName: ToolName) = toolName(JsonField.of(toolName))

        fun toolName(toolName: JsonField<ToolName>) = apply { this.toolName = toolName }

        fun toolName(value: String) = apply { toolName(ToolName.of(value)) }

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

        fun build(): ToolResponse =
            ToolResponse(
                checkRequired("callId", callId),
                checkRequired("content", content),
                checkRequired("toolName", toolName),
                additionalProperties.toImmutable(),
            )
    }

    class ToolName
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val BRAVE_SEARCH = of("brave_search")

            val WOLFRAM_ALPHA = of("wolfram_alpha")

            val PHOTOGEN = of("photogen")

            val CODE_INTERPRETER = of("code_interpreter")

            fun of(value: String) = ToolName(JsonField.of(value))
        }

        enum class Known {
            BRAVE_SEARCH,
            WOLFRAM_ALPHA,
            PHOTOGEN,
            CODE_INTERPRETER,
        }

        enum class Value {
            BRAVE_SEARCH,
            WOLFRAM_ALPHA,
            PHOTOGEN,
            CODE_INTERPRETER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                BRAVE_SEARCH -> Value.BRAVE_SEARCH
                WOLFRAM_ALPHA -> Value.WOLFRAM_ALPHA
                PHOTOGEN -> Value.PHOTOGEN
                CODE_INTERPRETER -> Value.CODE_INTERPRETER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                BRAVE_SEARCH -> Known.BRAVE_SEARCH
                WOLFRAM_ALPHA -> Known.WOLFRAM_ALPHA
                PHOTOGEN -> Known.PHOTOGEN
                CODE_INTERPRETER -> Known.CODE_INTERPRETER
                else -> throw LlamaStackClientInvalidDataException("Unknown ToolName: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

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

        return /* spotless:off */ other is ToolResponse && callId == other.callId && content == other.content && toolName == other.toolName && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(callId, content, toolName, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ToolResponse{callId=$callId, content=$content, toolName=$toolName, additionalProperties=$additionalProperties}"
}
