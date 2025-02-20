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

/** A message containing the model's (assistant) response in a chat conversation. */
@NoAutoDetect
class CompletionMessage
@JsonCreator
private constructor(
    @JsonProperty("content")
    @ExcludeMissing
    private val content: JsonField<InterleavedContent> = JsonMissing.of(),
    @JsonProperty("role") @ExcludeMissing private val role: JsonValue = JsonMissing.of(),
    @JsonProperty("stop_reason")
    @ExcludeMissing
    private val stopReason: JsonField<StopReason> = JsonMissing.of(),
    @JsonProperty("tool_calls")
    @ExcludeMissing
    private val toolCalls: JsonField<List<ToolCall>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The content of the model's response */
    fun content(): InterleavedContent = content.getRequired("content")

    /** Must be "assistant" to identify this as the model's response */
    @JsonProperty("role") @ExcludeMissing fun _role(): JsonValue = role

    /**
     * Reason why the model stopped generating. Options are: - `StopReason.end_of_turn`: The model
     * finished generating the entire response. - `StopReason.end_of_message`: The model finished
     * generating but generated a partial response -- usually, a tool call. The user may call the
     * tool and continue the conversation with the tool's response. - `StopReason.out_of_tokens`:
     * The model ran out of token budget.
     */
    fun stopReason(): StopReason = stopReason.getRequired("stop_reason")

    /** List of tool calls. Each tool call is a ToolCall object. */
    fun toolCalls(): List<ToolCall>? = toolCalls.getNullable("tool_calls")

    /** The content of the model's response */
    @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<InterleavedContent> = content

    /**
     * Reason why the model stopped generating. Options are: - `StopReason.end_of_turn`: The model
     * finished generating the entire response. - `StopReason.end_of_message`: The model finished
     * generating but generated a partial response -- usually, a tool call. The user may call the
     * tool and continue the conversation with the tool's response. - `StopReason.out_of_tokens`:
     * The model ran out of token budget.
     */
    @JsonProperty("stop_reason")
    @ExcludeMissing
    fun _stopReason(): JsonField<StopReason> = stopReason

    /** List of tool calls. Each tool call is a ToolCall object. */
    @JsonProperty("tool_calls")
    @ExcludeMissing
    fun _toolCalls(): JsonField<List<ToolCall>> = toolCalls

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CompletionMessage = apply {
        if (validated) {
            return@apply
        }

        content().validate()
        _role().let {
            if (it != JsonValue.from("assistant")) {
                throw LlamaStackClientInvalidDataException("'role' is invalid, received $it")
            }
        }
        stopReason()
        toolCalls()?.forEach { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [CompletionMessage]. */
    class Builder internal constructor() {

        private var content: JsonField<InterleavedContent>? = null
        private var role: JsonValue = JsonValue.from("assistant")
        private var stopReason: JsonField<StopReason>? = null
        private var toolCalls: JsonField<MutableList<ToolCall>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(completionMessage: CompletionMessage) = apply {
            content = completionMessage.content
            role = completionMessage.role
            stopReason = completionMessage.stopReason
            toolCalls = completionMessage.toolCalls.map { it.toMutableList() }
            additionalProperties = completionMessage.additionalProperties.toMutableMap()
        }

        /** The content of the model's response */
        fun content(content: InterleavedContent) = content(JsonField.of(content))

        /** The content of the model's response */
        fun content(content: JsonField<InterleavedContent>) = apply { this.content = content }

        /** The content of the model's response */
        fun content(string: String) = content(InterleavedContent.ofString(string))

        /** A image content item */
        fun content(imageContentItem: InterleavedContent.ImageContentItem) =
            content(InterleavedContent.ofImageContentItem(imageContentItem))

        /** A text content item */
        fun content(textContentItem: InterleavedContent.TextContentItem) =
            content(InterleavedContent.ofTextContentItem(textContentItem))

        /** The content of the model's response */
        fun contentOfItems(items: List<InterleavedContentItem>) =
            content(InterleavedContent.ofItems(items))

        /** Must be "assistant" to identify this as the model's response */
        fun role(role: JsonValue) = apply { this.role = role }

        /**
         * Reason why the model stopped generating. Options are: - `StopReason.end_of_turn`: The
         * model finished generating the entire response. - `StopReason.end_of_message`: The model
         * finished generating but generated a partial response -- usually, a tool call. The user
         * may call the tool and continue the conversation with the tool's response. -
         * `StopReason.out_of_tokens`: The model ran out of token budget.
         */
        fun stopReason(stopReason: StopReason) = stopReason(JsonField.of(stopReason))

        /**
         * Reason why the model stopped generating. Options are: - `StopReason.end_of_turn`: The
         * model finished generating the entire response. - `StopReason.end_of_message`: The model
         * finished generating but generated a partial response -- usually, a tool call. The user
         * may call the tool and continue the conversation with the tool's response. -
         * `StopReason.out_of_tokens`: The model ran out of token budget.
         */
        fun stopReason(stopReason: JsonField<StopReason>) = apply { this.stopReason = stopReason }

        /** List of tool calls. Each tool call is a ToolCall object. */
        fun toolCalls(toolCalls: List<ToolCall>) = toolCalls(JsonField.of(toolCalls))

        /** List of tool calls. Each tool call is a ToolCall object. */
        fun toolCalls(toolCalls: JsonField<List<ToolCall>>) = apply {
            this.toolCalls = toolCalls.map { it.toMutableList() }
        }

        /** List of tool calls. Each tool call is a ToolCall object. */
        fun addToolCall(toolCall: ToolCall) = apply {
            toolCalls =
                (toolCalls ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(toolCall)
                }
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

        fun build(): CompletionMessage =
            CompletionMessage(
                checkRequired("content", content),
                role,
                checkRequired("stopReason", stopReason),
                (toolCalls ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    /**
     * Reason why the model stopped generating. Options are: - `StopReason.end_of_turn`: The model
     * finished generating the entire response. - `StopReason.end_of_message`: The model finished
     * generating but generated a partial response -- usually, a tool call. The user may call the
     * tool and continue the conversation with the tool's response. - `StopReason.out_of_tokens`:
     * The model ran out of token budget.
     */
    class StopReason @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val END_OF_TURN = of("end_of_turn")

            val END_OF_MESSAGE = of("end_of_message")

            val OUT_OF_TOKENS = of("out_of_tokens")

            fun of(value: String) = StopReason(JsonField.of(value))
        }

        /** An enum containing [StopReason]'s known values. */
        enum class Known {
            END_OF_TURN,
            END_OF_MESSAGE,
            OUT_OF_TOKENS,
        }

        /**
         * An enum containing [StopReason]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [StopReason] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            END_OF_TURN,
            END_OF_MESSAGE,
            OUT_OF_TOKENS,
            /**
             * An enum member indicating that [StopReason] was instantiated with an unknown value.
             */
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
                END_OF_TURN -> Value.END_OF_TURN
                END_OF_MESSAGE -> Value.END_OF_MESSAGE
                OUT_OF_TOKENS -> Value.OUT_OF_TOKENS
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
                END_OF_TURN -> Known.END_OF_TURN
                END_OF_MESSAGE -> Known.END_OF_MESSAGE
                OUT_OF_TOKENS -> Known.OUT_OF_TOKENS
                else -> throw LlamaStackClientInvalidDataException("Unknown StopReason: $value")
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

            return /* spotless:off */ other is StopReason && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CompletionMessage && content == other.content && role == other.role && stopReason == other.stopReason && toolCalls == other.toolCalls && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(content, role, stopReason, toolCalls, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CompletionMessage{content=$content, role=$role, stopReason=$stopReason, toolCalls=$toolCalls, additionalProperties=$additionalProperties}"
}
