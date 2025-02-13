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

/** Response from a chat completion request. */
@NoAutoDetect
class ChatCompletionResponse
@JsonCreator
private constructor(
    @JsonProperty("completion_message")
    @ExcludeMissing
    private val completionMessage: JsonField<CompletionMessage> = JsonMissing.of(),
    @JsonProperty("logprobs")
    @ExcludeMissing
    private val logprobs: JsonField<List<TokenLogProbs>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The complete response message */
    fun completionMessage(): CompletionMessage = completionMessage.getRequired("completion_message")

    /** Optional log probabilities for generated tokens */
    fun logprobs(): List<TokenLogProbs>? = logprobs.getNullable("logprobs")

    /** The complete response message */
    @JsonProperty("completion_message")
    @ExcludeMissing
    fun _completionMessage(): JsonField<CompletionMessage> = completionMessage

    /** Optional log probabilities for generated tokens */
    @JsonProperty("logprobs")
    @ExcludeMissing
    fun _logprobs(): JsonField<List<TokenLogProbs>> = logprobs

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ChatCompletionResponse = apply {
        if (validated) {
            return@apply
        }

        completionMessage().validate()
        logprobs()?.forEach { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [ChatCompletionResponse]. */
    class Builder internal constructor() {

        private var completionMessage: JsonField<CompletionMessage>? = null
        private var logprobs: JsonField<MutableList<TokenLogProbs>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(chatCompletionResponse: ChatCompletionResponse) = apply {
            completionMessage = chatCompletionResponse.completionMessage
            logprobs = chatCompletionResponse.logprobs.map { it.toMutableList() }
            additionalProperties = chatCompletionResponse.additionalProperties.toMutableMap()
        }

        /** The complete response message */
        fun completionMessage(completionMessage: CompletionMessage) =
            completionMessage(JsonField.of(completionMessage))

        /** The complete response message */
        fun completionMessage(completionMessage: JsonField<CompletionMessage>) = apply {
            this.completionMessage = completionMessage
        }

        /** Optional log probabilities for generated tokens */
        fun logprobs(logprobs: List<TokenLogProbs>) = logprobs(JsonField.of(logprobs))

        /** Optional log probabilities for generated tokens */
        fun logprobs(logprobs: JsonField<List<TokenLogProbs>>) = apply {
            this.logprobs = logprobs.map { it.toMutableList() }
        }

        /** Optional log probabilities for generated tokens */
        fun addLogprob(logprob: TokenLogProbs) = apply {
            logprobs =
                (logprobs ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(logprob)
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

        fun build(): ChatCompletionResponse =
            ChatCompletionResponse(
                checkRequired("completionMessage", completionMessage),
                (logprobs ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ChatCompletionResponse && completionMessage == other.completionMessage && logprobs == other.logprobs && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(completionMessage, logprobs, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ChatCompletionResponse{completionMessage=$completionMessage, logprobs=$logprobs, additionalProperties=$additionalProperties}"
}
