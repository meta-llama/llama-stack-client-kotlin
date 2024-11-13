// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.llama.llamastack.core.Enum
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

@JsonDeserialize(builder = ToolCall.Builder::class)
@NoAutoDetect
class ToolCall
private constructor(
    private val arguments: JsonField<Arguments>,
    private val callId: JsonField<String>,
    private val toolName: JsonField<ToolName>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun arguments(): Arguments = arguments.getRequired("arguments")

    fun callId(): String = callId.getRequired("call_id")

    fun toolName(): ToolName = toolName.getRequired("tool_name")

    @JsonProperty("arguments") @ExcludeMissing fun _arguments() = arguments

    @JsonProperty("call_id") @ExcludeMissing fun _callId() = callId

    @JsonProperty("tool_name") @ExcludeMissing fun _toolName() = toolName

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ToolCall = apply {
        if (!validated) {
            arguments().validate()
            callId()
            toolName()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var arguments: JsonField<Arguments> = JsonMissing.of()
        private var callId: JsonField<String> = JsonMissing.of()
        private var toolName: JsonField<ToolName> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(toolCall: ToolCall) = apply {
            this.arguments = toolCall.arguments
            this.callId = toolCall.callId
            this.toolName = toolCall.toolName
            additionalProperties(toolCall.additionalProperties)
        }

        fun arguments(arguments: Arguments) = arguments(JsonField.of(arguments))

        @JsonProperty("arguments")
        @ExcludeMissing
        fun arguments(arguments: JsonField<Arguments>) = apply { this.arguments = arguments }

        fun callId(callId: String) = callId(JsonField.of(callId))

        @JsonProperty("call_id")
        @ExcludeMissing
        fun callId(callId: JsonField<String>) = apply { this.callId = callId }

        fun toolName(toolName: ToolName) = toolName(JsonField.of(toolName))

        @JsonProperty("tool_name")
        @ExcludeMissing
        fun toolName(toolName: JsonField<ToolName>) = apply { this.toolName = toolName }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): ToolCall =
            ToolCall(
                arguments,
                callId,
                toolName,
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = Arguments.Builder::class)
    @NoAutoDetect
    class Arguments
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Arguments = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(arguments: Arguments) = apply {
                additionalProperties(arguments.additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Arguments = Arguments(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Arguments && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "Arguments{additionalProperties=$additionalProperties}"
    }

    class ToolName
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ToolName && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val BRAVE_SEARCH = ToolName(JsonField.of("brave_search"))

            val WOLFRAM_ALPHA = ToolName(JsonField.of("wolfram_alpha"))

            val PHOTOGEN = ToolName(JsonField.of("photogen"))

            val CODE_INTERPRETER = ToolName(JsonField.of("code_interpreter"))

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
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ToolCall && this.arguments == other.arguments && this.callId == other.callId && this.toolName == other.toolName && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(arguments, callId, toolName, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "ToolCall{arguments=$arguments, callId=$callId, toolName=$toolName, additionalProperties=$additionalProperties}"
}
