// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.BaseDeserializer
import com.llama.llamastack.core.BaseSerializer
import com.llama.llamastack.core.Enum
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

@JsonDeserialize(using = InferenceCompletionResponse.Deserializer::class)
@JsonSerialize(using = InferenceCompletionResponse.Serializer::class)
class InferenceCompletionResponse
private constructor(
    private val completionResponse: CompletionResponse? = null,
    private val completionResponseStreamChunk: CompletionResponseStreamChunk? = null,
    private val _json: JsonValue? = null,
) {

    private var validated: Boolean = false

    fun completionResponse(): CompletionResponse? = completionResponse

    fun completionResponseStreamChunk(): CompletionResponseStreamChunk? =
        completionResponseStreamChunk

    fun isCompletionResponse(): Boolean = completionResponse != null

    fun isCompletionResponseStreamChunk(): Boolean = completionResponseStreamChunk != null

    fun asCompletionResponse(): CompletionResponse =
        completionResponse.getOrThrow("completionResponse")

    fun asCompletionResponseStreamChunk(): CompletionResponseStreamChunk =
        completionResponseStreamChunk.getOrThrow("completionResponseStreamChunk")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            completionResponse != null -> visitor.visitCompletionResponse(completionResponse)
            completionResponseStreamChunk != null ->
                visitor.visitCompletionResponseStreamChunk(completionResponseStreamChunk)
            else -> visitor.unknown(_json)
        }
    }

    fun validate(): InferenceCompletionResponse = apply {
        if (!validated) {
            if (completionResponse == null && completionResponseStreamChunk == null) {
                throw LlamaStackClientInvalidDataException(
                    "Unknown InferenceCompletionResponse: $_json"
                )
            }
            completionResponse?.validate()
            completionResponseStreamChunk?.validate()
            validated = true
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InferenceCompletionResponse && this.completionResponse == other.completionResponse && this.completionResponseStreamChunk == other.completionResponseStreamChunk /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(completionResponse, completionResponseStreamChunk) /* spotless:on */
    }

    override fun toString(): String {
        return when {
            completionResponse != null ->
                "InferenceCompletionResponse{completionResponse=$completionResponse}"
            completionResponseStreamChunk != null ->
                "InferenceCompletionResponse{completionResponseStreamChunk=$completionResponseStreamChunk}"
            _json != null -> "InferenceCompletionResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid InferenceCompletionResponse")
        }
    }

    companion object {

        fun ofCompletionResponse(completionResponse: CompletionResponse) =
            InferenceCompletionResponse(completionResponse = completionResponse)

        fun ofCompletionResponseStreamChunk(
            completionResponseStreamChunk: CompletionResponseStreamChunk
        ) =
            InferenceCompletionResponse(
                completionResponseStreamChunk = completionResponseStreamChunk
            )
    }

    interface Visitor<out T> {

        fun visitCompletionResponse(completionResponse: CompletionResponse): T

        fun visitCompletionResponseStreamChunk(
            completionResponseStreamChunk: CompletionResponseStreamChunk
        ): T

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
            tryDeserialize(node, jacksonTypeRef<CompletionResponseStreamChunk>()) { it.validate() }
                ?.let {
                    return InferenceCompletionResponse(
                        completionResponseStreamChunk = it,
                        _json = json
                    )
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
                value.completionResponseStreamChunk != null ->
                    generator.writeObject(value.completionResponseStreamChunk)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid InferenceCompletionResponse")
            }
        }
    }

    @JsonDeserialize(builder = CompletionResponseStreamChunk.Builder::class)
    @NoAutoDetect
    class CompletionResponseStreamChunk
    private constructor(
        private val delta: JsonField<String>,
        private val logprobs: JsonField<List<TokenLogProbs>>,
        private val stopReason: JsonField<StopReason>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun delta(): String = delta.getRequired("delta")

        fun logprobs(): List<TokenLogProbs>? = logprobs.getNullable("logprobs")

        fun stopReason(): StopReason? = stopReason.getNullable("stop_reason")

        @JsonProperty("delta") @ExcludeMissing fun _delta() = delta

        @JsonProperty("logprobs") @ExcludeMissing fun _logprobs() = logprobs

        @JsonProperty("stop_reason") @ExcludeMissing fun _stopReason() = stopReason

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): CompletionResponseStreamChunk = apply {
            if (!validated) {
                delta()
                logprobs()?.forEach { it.validate() }
                stopReason()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var delta: JsonField<String> = JsonMissing.of()
            private var logprobs: JsonField<List<TokenLogProbs>> = JsonMissing.of()
            private var stopReason: JsonField<StopReason> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(completionResponseStreamChunk: CompletionResponseStreamChunk) =
                apply {
                    this.delta = completionResponseStreamChunk.delta
                    this.logprobs = completionResponseStreamChunk.logprobs
                    this.stopReason = completionResponseStreamChunk.stopReason
                    additionalProperties(completionResponseStreamChunk.additionalProperties)
                }

            fun delta(delta: String) = delta(JsonField.of(delta))

            @JsonProperty("delta")
            @ExcludeMissing
            fun delta(delta: JsonField<String>) = apply { this.delta = delta }

            fun logprobs(logprobs: List<TokenLogProbs>) = logprobs(JsonField.of(logprobs))

            @JsonProperty("logprobs")
            @ExcludeMissing
            fun logprobs(logprobs: JsonField<List<TokenLogProbs>>) = apply {
                this.logprobs = logprobs
            }

            fun stopReason(stopReason: StopReason) = stopReason(JsonField.of(stopReason))

            @JsonProperty("stop_reason")
            @ExcludeMissing
            fun stopReason(stopReason: JsonField<StopReason>) = apply {
                this.stopReason = stopReason
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

            fun build(): CompletionResponseStreamChunk =
                CompletionResponseStreamChunk(
                    delta,
                    logprobs.map { it.toImmutable() },
                    stopReason,
                    additionalProperties.toImmutable(),
                )
        }

        class StopReason
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is StopReason && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val END_OF_TURN = StopReason(JsonField.of("end_of_turn"))

                val END_OF_MESSAGE = StopReason(JsonField.of("end_of_message"))

                val OUT_OF_TOKENS = StopReason(JsonField.of("out_of_tokens"))

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
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CompletionResponseStreamChunk && this.delta == other.delta && this.logprobs == other.logprobs && this.stopReason == other.stopReason && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(delta, logprobs, stopReason, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "CompletionResponseStreamChunk{delta=$delta, logprobs=$logprobs, stopReason=$stopReason, additionalProperties=$additionalProperties}"
    }
}
