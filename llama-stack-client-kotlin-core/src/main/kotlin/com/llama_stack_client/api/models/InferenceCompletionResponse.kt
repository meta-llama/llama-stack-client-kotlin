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

@JsonDeserialize(using = InferenceCompletionResponse.Deserializer::class)
@JsonSerialize(using = InferenceCompletionResponse.Serializer::class)
class InferenceCompletionResponse
private constructor(
    private val completionResponse: CompletionResponse? = null,
    private val completionStreamChunk: CompletionStreamChunk? = null,
    private val _json: JsonValue? = null,
) {

    private var validated: Boolean = false

    fun completionResponse(): CompletionResponse? = completionResponse

    fun completionStreamChunk(): CompletionStreamChunk? = completionStreamChunk

    fun isCompletionResponse(): Boolean = completionResponse != null

    fun isCompletionStreamChunk(): Boolean = completionStreamChunk != null

    fun asCompletionResponse(): CompletionResponse =
        completionResponse.getOrThrow("completionResponse")

    fun asCompletionStreamChunk(): CompletionStreamChunk =
        completionStreamChunk.getOrThrow("completionStreamChunk")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            completionResponse != null -> visitor.visitCompletionResponse(completionResponse)
            completionStreamChunk != null ->
                visitor.visitCompletionStreamChunk(completionStreamChunk)
            else -> visitor.unknown(_json)
        }
    }

    fun validate(): InferenceCompletionResponse = apply {
        if (!validated) {
            if (completionResponse == null && completionStreamChunk == null) {
                throw LlamaStackClientInvalidDataException(
                    "Unknown InferenceCompletionResponse: $_json"
                )
            }
            completionResponse?.validate()
            completionStreamChunk?.validate()
            validated = true
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InferenceCompletionResponse &&
            this.completionResponse == other.completionResponse &&
            this.completionStreamChunk == other.completionStreamChunk
    }

    override fun hashCode(): Int {
        return Objects.hash(completionResponse, completionStreamChunk)
    }

    override fun toString(): String {
        return when {
            completionResponse != null ->
                "InferenceCompletionResponse{completionResponse=$completionResponse}"
            completionStreamChunk != null ->
                "InferenceCompletionResponse{completionStreamChunk=$completionStreamChunk}"
            _json != null -> "InferenceCompletionResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid InferenceCompletionResponse")
        }
    }

    companion object {

        fun ofCompletionResponse(completionResponse: CompletionResponse) =
            InferenceCompletionResponse(completionResponse = completionResponse)

        fun ofCompletionStreamChunk(completionStreamChunk: CompletionStreamChunk) =
            InferenceCompletionResponse(completionStreamChunk = completionStreamChunk)
    }

    interface Visitor<out T> {

        fun visitCompletionResponse(completionResponse: CompletionResponse): T

        fun visitCompletionStreamChunk(completionStreamChunk: CompletionStreamChunk): T

        fun unknown(json: JsonValue?): T {
            throw LlamaStackClientInvalidDataException("Unknown InferenceCompletionResponse: $json")
        }
    }

    class Deserializer :
        BaseDeserializer<InferenceCompletionResponse>(InferenceCompletionResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): InferenceCompletionResponse {
            val json = JsonValue.fromJsonNode(node)
            tryDeserialize(node, jacksonTypeRef<CompletionResponse>()) { it.validate() }
                ?.let {
                    return InferenceCompletionResponse(completionResponse = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<CompletionStreamChunk>()) { it.validate() }
                ?.let {
                    return InferenceCompletionResponse(completionStreamChunk = it, _json = json)
                }

            return InferenceCompletionResponse(_json = json)
        }
    }

    class Serializer :
        BaseSerializer<InferenceCompletionResponse>(InferenceCompletionResponse::class) {

        override fun serialize(
            value: InferenceCompletionResponse,
            generator: JsonGenerator,
            provider: SerializerProvider
        ) {
            when {
                value.completionResponse != null -> generator.writeObject(value.completionResponse)
                value.completionStreamChunk != null ->
                    generator.writeObject(value.completionStreamChunk)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid InferenceCompletionResponse")
            }
        }
    }

    @JsonDeserialize(builder = CompletionResponse.Builder::class)
    @NoAutoDetect
    class CompletionResponse
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

        fun validate(): CompletionResponse = apply {
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

            return other is CompletionResponse &&
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
            "CompletionResponse{completionMessage=$completionMessage, logprobs=$logprobs, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var completionMessage: JsonField<CompletionMessage> = JsonMissing.of()
            private var logprobs: JsonField<List<TokenLogProbs>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(completionResponse: CompletionResponse) = apply {
                this.completionMessage = completionResponse.completionMessage
                this.logprobs = completionResponse.logprobs
                additionalProperties(completionResponse.additionalProperties)
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

            fun build(): CompletionResponse =
                CompletionResponse(
                    completionMessage,
                    logprobs.map { it.toUnmodifiable() },
                    additionalProperties.toUnmodifiable(),
                )
        }
    }
}
