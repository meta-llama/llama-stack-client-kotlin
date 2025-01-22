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
class BatchInferenceChatCompletionResponse
@JsonCreator
private constructor(
    @JsonProperty("completion_message_batch")
    @ExcludeMissing
    private val completionMessageBatch: JsonField<List<CompletionMessageBatch>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun completionMessageBatch(): List<CompletionMessageBatch> =
        completionMessageBatch.getRequired("completion_message_batch")

    @JsonProperty("completion_message_batch")
    @ExcludeMissing
    fun _completionMessageBatch(): JsonField<List<CompletionMessageBatch>> = completionMessageBatch

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): BatchInferenceChatCompletionResponse = apply {
        if (validated) {
            return@apply
        }

        completionMessageBatch().forEach { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var completionMessageBatch: JsonField<MutableList<CompletionMessageBatch>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            batchInferenceChatCompletionResponse: BatchInferenceChatCompletionResponse
        ) = apply {
            completionMessageBatch =
                batchInferenceChatCompletionResponse.completionMessageBatch.map {
                    it.toMutableList()
                }
            additionalProperties =
                batchInferenceChatCompletionResponse.additionalProperties.toMutableMap()
        }

        fun completionMessageBatch(completionMessageBatch: List<CompletionMessageBatch>) =
            completionMessageBatch(JsonField.of(completionMessageBatch))

        fun completionMessageBatch(
            completionMessageBatch: JsonField<List<CompletionMessageBatch>>
        ) = apply {
            this.completionMessageBatch = completionMessageBatch.map { it.toMutableList() }
        }

        fun addCompletionMessageBatch(completionMessageBatch: CompletionMessageBatch) = apply {
            this.completionMessageBatch =
                (this.completionMessageBatch ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(completionMessageBatch)
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

        fun build(): BatchInferenceChatCompletionResponse =
            BatchInferenceChatCompletionResponse(
                checkRequired("completionMessageBatch", completionMessageBatch).map {
                    it.toImmutable()
                },
                additionalProperties.toImmutable()
            )
    }

    @NoAutoDetect
    class CompletionMessageBatch
    @JsonCreator
    private constructor(
        @JsonProperty("content")
        @ExcludeMissing
        private val content: JsonField<InterleavedContent> = JsonMissing.of(),
        @JsonProperty("role") @ExcludeMissing private val role: JsonField<Role> = JsonMissing.of(),
        @JsonProperty("stop_reason")
        @ExcludeMissing
        private val stopReason: JsonField<StopReason> = JsonMissing.of(),
        @JsonProperty("tool_calls")
        @ExcludeMissing
        private val toolCalls: JsonField<List<ToolCall>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun content(): InterleavedContent = content.getRequired("content")

        fun role(): Role = role.getRequired("role")

        fun stopReason(): StopReason = stopReason.getRequired("stop_reason")

        fun toolCalls(): List<ToolCall> = toolCalls.getRequired("tool_calls")

        @JsonProperty("content")
        @ExcludeMissing
        fun _content(): JsonField<InterleavedContent> = content

        @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<Role> = role

        @JsonProperty("stop_reason")
        @ExcludeMissing
        fun _stopReason(): JsonField<StopReason> = stopReason

        @JsonProperty("tool_calls")
        @ExcludeMissing
        fun _toolCalls(): JsonField<List<ToolCall>> = toolCalls

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CompletionMessageBatch = apply {
            if (validated) {
                return@apply
            }

            content().validate()
            role()
            stopReason()
            toolCalls().forEach { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var content: JsonField<InterleavedContent>? = null
            private var role: JsonField<Role>? = null
            private var stopReason: JsonField<StopReason>? = null
            private var toolCalls: JsonField<MutableList<ToolCall>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(completionMessageBatch: CompletionMessageBatch) = apply {
                content = completionMessageBatch.content
                role = completionMessageBatch.role
                stopReason = completionMessageBatch.stopReason
                toolCalls = completionMessageBatch.toolCalls.map { it.toMutableList() }
                additionalProperties = completionMessageBatch.additionalProperties.toMutableMap()
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

            fun stopReason(stopReason: StopReason) = stopReason(JsonField.of(stopReason))

            fun stopReason(stopReason: JsonField<StopReason>) = apply {
                this.stopReason = stopReason
            }

            fun toolCalls(toolCalls: List<ToolCall>) = toolCalls(JsonField.of(toolCalls))

            fun toolCalls(toolCalls: JsonField<List<ToolCall>>) = apply {
                this.toolCalls = toolCalls.map { it.toMutableList() }
            }

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

            fun build(): CompletionMessageBatch =
                CompletionMessageBatch(
                    checkRequired("content", content),
                    checkRequired("role", role),
                    checkRequired("stopReason", stopReason),
                    checkRequired("toolCalls", toolCalls).map { it.toImmutable() },
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

                val ASSISTANT = of("assistant")

                fun of(value: String) = Role(JsonField.of(value))
            }

            enum class Known {
                ASSISTANT,
            }

            enum class Value {
                ASSISTANT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ASSISTANT -> Value.ASSISTANT
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ASSISTANT -> Known.ASSISTANT
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

        class StopReason
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val END_OF_TURN = of("end_of_turn")

                val END_OF_MESSAGE = of("end_of_message")

                val OUT_OF_TOKENS = of("out_of_tokens")

                fun of(value: String) = StopReason(JsonField.of(value))
            }

            enum class Known {
                END_OF_TURN,
                END_OF_MESSAGE,
                OUT_OF_TOKENS,
            }

            enum class Value {
                END_OF_TURN,
                END_OF_MESSAGE,
                OUT_OF_TOKENS,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    END_OF_TURN -> Value.END_OF_TURN
                    END_OF_MESSAGE -> Value.END_OF_MESSAGE
                    OUT_OF_TOKENS -> Value.OUT_OF_TOKENS
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    END_OF_TURN -> Known.END_OF_TURN
                    END_OF_MESSAGE -> Known.END_OF_MESSAGE
                    OUT_OF_TOKENS -> Known.OUT_OF_TOKENS
                    else -> throw LlamaStackClientInvalidDataException("Unknown StopReason: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

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

            return /* spotless:off */ other is CompletionMessageBatch && content == other.content && role == other.role && stopReason == other.stopReason && toolCalls == other.toolCalls && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(content, role, stopReason, toolCalls, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CompletionMessageBatch{content=$content, role=$role, stopReason=$stopReason, toolCalls=$toolCalls, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BatchInferenceChatCompletionResponse && completionMessageBatch == other.completionMessageBatch && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(completionMessageBatch, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BatchInferenceChatCompletionResponse{completionMessageBatch=$completionMessageBatch, additionalProperties=$additionalProperties}"
}
