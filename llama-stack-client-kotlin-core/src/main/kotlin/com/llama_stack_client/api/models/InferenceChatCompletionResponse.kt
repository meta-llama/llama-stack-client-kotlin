// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama_stack_client.api.core.BaseDeserializer
import com.llama_stack_client.api.core.BaseSerializer
import com.llama_stack_client.api.core.ExcludeMissing
import com.llama_stack_client.api.core.JsonField
import com.llama_stack_client.api.core.JsonMissing
import com.llama_stack_client.api.core.JsonValue
import com.llama_stack_client.api.core.NoAutoDetect
import com.llama_stack_client.api.core.getOrThrow
import com.llama_stack_client.api.core.toUnmodifiable
import com.llama_stack_client.api.errors.LlamaStackClientInvalidDataException
import java.util.Objects

@JsonDeserialize(using = InferenceChatCompletionResponse.Deserializer::class)
@JsonSerialize(using = InferenceChatCompletionResponse.Serializer::class)
class InferenceChatCompletionResponse
private constructor(
    private val chatCompletionResponse: ChatCompletionResponse? = null,
    private val chatCompletionStreamChunk: ChatCompletionStreamChunk? = null,
    private val _json: JsonValue? = null,
) {

    private var validated: Boolean = false

    fun chatCompletionResponse(): ChatCompletionResponse? = chatCompletionResponse

    fun chatCompletionStreamChunk(): ChatCompletionStreamChunk? = chatCompletionStreamChunk

    fun isChatCompletionResponse(): Boolean = chatCompletionResponse != null

    fun isChatCompletionStreamChunk(): Boolean = chatCompletionStreamChunk != null

    fun asChatCompletionResponse(): ChatCompletionResponse =
        chatCompletionResponse.getOrThrow("chatCompletionResponse")

    fun asChatCompletionStreamChunk(): ChatCompletionStreamChunk =
        chatCompletionStreamChunk.getOrThrow("chatCompletionStreamChunk")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            chatCompletionResponse != null ->
                visitor.visitChatCompletionResponse(chatCompletionResponse)
            chatCompletionStreamChunk != null ->
                visitor.visitChatCompletionStreamChunk(chatCompletionStreamChunk)
            else -> visitor.unknown(_json)
        }
    }

    fun validate(): InferenceChatCompletionResponse = apply {
        if (!validated) {
            if (chatCompletionResponse == null && chatCompletionStreamChunk == null) {
                throw LlamaStackClientInvalidDataException(
                    "Unknown InferenceChatCompletionResponse: $_json"
                )
            }
            chatCompletionResponse?.validate()
            chatCompletionStreamChunk?.validate()
            validated = true
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InferenceChatCompletionResponse &&
            this.chatCompletionResponse == other.chatCompletionResponse &&
            this.chatCompletionStreamChunk == other.chatCompletionStreamChunk
    }

    override fun hashCode(): Int {
        return Objects.hash(chatCompletionResponse, chatCompletionStreamChunk)
    }

    override fun toString(): String {
        return when {
            chatCompletionResponse != null ->
                "InferenceChatCompletionResponse{chatCompletionResponse=$chatCompletionResponse}"
            chatCompletionStreamChunk != null ->
                "InferenceChatCompletionResponse{chatCompletionStreamChunk=$chatCompletionStreamChunk}"
            _json != null -> "InferenceChatCompletionResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid InferenceChatCompletionResponse")
        }
    }

    companion object {

        fun ofChatCompletionResponse(chatCompletionResponse: ChatCompletionResponse) =
            InferenceChatCompletionResponse(chatCompletionResponse = chatCompletionResponse)

        fun ofChatCompletionStreamChunk(chatCompletionStreamChunk: ChatCompletionStreamChunk) =
            InferenceChatCompletionResponse(chatCompletionStreamChunk = chatCompletionStreamChunk)
    }

    interface Visitor<out T> {

        fun visitChatCompletionResponse(chatCompletionResponse: ChatCompletionResponse): T

        fun visitChatCompletionStreamChunk(chatCompletionStreamChunk: ChatCompletionStreamChunk): T

        fun unknown(json: JsonValue?): T {
            throw LlamaStackClientInvalidDataException(
                "Unknown InferenceChatCompletionResponse: $json"
            )
        }
    }

    class Deserializer :
        BaseDeserializer<InferenceChatCompletionResponse>(InferenceChatCompletionResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): InferenceChatCompletionResponse {
            val json = JsonValue.fromJsonNode(node)
            tryDeserialize(node, jacksonTypeRef<ChatCompletionResponse>()) { it.validate() }
                ?.let {
                    return InferenceChatCompletionResponse(
                        chatCompletionResponse = it,
                        _json = json
                    )
                }
            tryDeserialize(node, jacksonTypeRef<ChatCompletionStreamChunk>()) { it.validate() }
                ?.let {
                    return InferenceChatCompletionResponse(
                        chatCompletionStreamChunk = it,
                        _json = json
                    )
                }

            return InferenceChatCompletionResponse(_json = json)
        }
    }

    class Serializer :
        BaseSerializer<InferenceChatCompletionResponse>(InferenceChatCompletionResponse::class) {

        override fun serialize(
            value: InferenceChatCompletionResponse,
            generator: JsonGenerator,
            provider: SerializerProvider
        ) {
            when {
                value.chatCompletionResponse != null ->
                    generator.writeObject(value.chatCompletionResponse)
                value.chatCompletionStreamChunk != null ->
                    generator.writeObject(value.chatCompletionStreamChunk)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid InferenceChatCompletionResponse")
            }
        }
    }

    @JsonDeserialize(builder = ChatCompletionResponse.Builder::class)
    @NoAutoDetect
    class ChatCompletionResponse
    private constructor(
        private val completionMessage: JsonField<CompletionMessage>,
        private val logprobs: JsonField<List<TokenLogProbs>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun completionMessage(): CompletionMessage =
            completionMessage.getRequired("completion_message")

        fun logprobs(): List<TokenLogProbs>? = logprobs.getNullable("logprobs")

        @JsonProperty("completion_message")
        @ExcludeMissing
        fun _completionMessage() = completionMessage

        @JsonProperty("logprobs") @ExcludeMissing fun _logprobs() = logprobs

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): ChatCompletionResponse = apply {
            if (!validated) {
                completionMessage().validate()
                logprobs()?.forEach { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ChatCompletionResponse &&
                this.completionMessage == other.completionMessage &&
                this.logprobs == other.logprobs &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        completionMessage,
                        logprobs,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "ChatCompletionResponse{completionMessage=$completionMessage, logprobs=$logprobs, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var completionMessage: JsonField<CompletionMessage> = JsonMissing.of()
            private var logprobs: JsonField<List<TokenLogProbs>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(chatCompletionResponse: ChatCompletionResponse) = apply {
                this.completionMessage = chatCompletionResponse.completionMessage
                this.logprobs = chatCompletionResponse.logprobs
                additionalProperties(chatCompletionResponse.additionalProperties)
            }

            fun completionMessage(completionMessage: CompletionMessage) =
                completionMessage(JsonField.of(completionMessage))

            @JsonProperty("completion_message")
            @ExcludeMissing
            fun completionMessage(completionMessage: JsonField<CompletionMessage>) = apply {
                this.completionMessage = completionMessage
            }

            fun logprobs(logprobs: List<TokenLogProbs>) = logprobs(JsonField.of(logprobs))

            @JsonProperty("logprobs")
            @ExcludeMissing
            fun logprobs(logprobs: JsonField<List<TokenLogProbs>>) = apply {
                this.logprobs = logprobs
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

            fun build(): ChatCompletionResponse =
                ChatCompletionResponse(
                    completionMessage,
                    logprobs.map { it.toUnmodifiable() },
                    additionalProperties.toUnmodifiable(),
                )
        }
    }
}
