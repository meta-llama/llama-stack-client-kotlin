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
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

@JsonDeserialize(using = InferenceChatCompletionResponse.Deserializer::class)
@JsonSerialize(using = InferenceChatCompletionResponse.Serializer::class)
class InferenceChatCompletionResponse
private constructor(
    private val chatCompletionResponse: ChatCompletionResponse? = null,
    private val chatCompletionResponseStreamChunk: ChatCompletionResponseStreamChunk? = null,
    private val _json: JsonValue? = null,
) {

    fun chatCompletionResponse(): ChatCompletionResponse? = chatCompletionResponse

    fun chatCompletionResponseStreamChunk(): ChatCompletionResponseStreamChunk? =
        chatCompletionResponseStreamChunk

    fun isChatCompletionResponse(): Boolean = chatCompletionResponse != null

    fun isChatCompletionResponseStreamChunk(): Boolean = chatCompletionResponseStreamChunk != null

    fun asChatCompletionResponse(): ChatCompletionResponse =
        chatCompletionResponse.getOrThrow("chatCompletionResponse")

    fun asChatCompletionResponseStreamChunk(): ChatCompletionResponseStreamChunk =
        chatCompletionResponseStreamChunk.getOrThrow("chatCompletionResponseStreamChunk")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            chatCompletionResponse != null ->
                visitor.visitChatCompletionResponse(chatCompletionResponse)
            chatCompletionResponseStreamChunk != null ->
                visitor.visitChatCompletionResponseStreamChunk(chatCompletionResponseStreamChunk)
            else -> visitor.unknown(_json)
        }
    }

    private var validated: Boolean = false

    fun validate(): InferenceChatCompletionResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitChatCompletionResponse(
                    chatCompletionResponse: ChatCompletionResponse
                ) {
                    chatCompletionResponse.validate()
                }

                override fun visitChatCompletionResponseStreamChunk(
                    chatCompletionResponseStreamChunk: ChatCompletionResponseStreamChunk
                ) {
                    chatCompletionResponseStreamChunk.validate()
                }
            }
        )
        validated = true
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InferenceChatCompletionResponse && chatCompletionResponse == other.chatCompletionResponse && chatCompletionResponseStreamChunk == other.chatCompletionResponseStreamChunk /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(chatCompletionResponse, chatCompletionResponseStreamChunk) /* spotless:on */

    override fun toString(): String =
        when {
            chatCompletionResponse != null ->
                "InferenceChatCompletionResponse{chatCompletionResponse=$chatCompletionResponse}"
            chatCompletionResponseStreamChunk != null ->
                "InferenceChatCompletionResponse{chatCompletionResponseStreamChunk=$chatCompletionResponseStreamChunk}"
            _json != null -> "InferenceChatCompletionResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid InferenceChatCompletionResponse")
        }

    companion object {

        fun ofChatCompletionResponse(chatCompletionResponse: ChatCompletionResponse) =
            InferenceChatCompletionResponse(chatCompletionResponse = chatCompletionResponse)

        fun ofChatCompletionResponseStreamChunk(
            chatCompletionResponseStreamChunk: ChatCompletionResponseStreamChunk
        ) =
            InferenceChatCompletionResponse(
                chatCompletionResponseStreamChunk = chatCompletionResponseStreamChunk
            )
    }

    interface Visitor<out T> {

        fun visitChatCompletionResponse(chatCompletionResponse: ChatCompletionResponse): T

        fun visitChatCompletionResponseStreamChunk(
            chatCompletionResponseStreamChunk: ChatCompletionResponseStreamChunk
        ): T

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
            tryDeserialize(node, jacksonTypeRef<ChatCompletionResponseStreamChunk>()) {
                    it.validate()
                }
                ?.let {
                    return InferenceChatCompletionResponse(
                        chatCompletionResponseStreamChunk = it,
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
                value.chatCompletionResponseStreamChunk != null ->
                    generator.writeObject(value.chatCompletionResponseStreamChunk)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid InferenceChatCompletionResponse")
            }
        }
    }

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
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun completionMessage(): CompletionMessage =
            completionMessage.getRequired("completion_message")

        fun logprobs(): List<TokenLogProbs>? = logprobs.getNullable("logprobs")

        @JsonProperty("completion_message")
        @ExcludeMissing
        fun _completionMessage(): JsonField<CompletionMessage> = completionMessage

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

        class Builder {

            private var completionMessage: JsonField<CompletionMessage>? = null
            private var logprobs: JsonField<MutableList<TokenLogProbs>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(chatCompletionResponse: ChatCompletionResponse) = apply {
                completionMessage = chatCompletionResponse.completionMessage
                logprobs = chatCompletionResponse.logprobs.map { it.toMutableList() }
                additionalProperties = chatCompletionResponse.additionalProperties.toMutableMap()
            }

            fun completionMessage(completionMessage: CompletionMessage) =
                completionMessage(JsonField.of(completionMessage))

            fun completionMessage(completionMessage: JsonField<CompletionMessage>) = apply {
                this.completionMessage = completionMessage
            }

            fun logprobs(logprobs: List<TokenLogProbs>) = logprobs(JsonField.of(logprobs))

            fun logprobs(logprobs: JsonField<List<TokenLogProbs>>) = apply {
                this.logprobs = logprobs.map { it.toMutableList() }
            }

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

    @NoAutoDetect
    class ChatCompletionResponseStreamChunk
    @JsonCreator
    private constructor(
        @JsonProperty("event")
        @ExcludeMissing
        private val event: JsonField<Event> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun event(): Event = event.getRequired("event")

        @JsonProperty("event") @ExcludeMissing fun _event(): JsonField<Event> = event

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ChatCompletionResponseStreamChunk = apply {
            if (validated) {
                return@apply
            }

            event().validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var event: JsonField<Event>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                chatCompletionResponseStreamChunk: ChatCompletionResponseStreamChunk
            ) = apply {
                event = chatCompletionResponseStreamChunk.event
                additionalProperties =
                    chatCompletionResponseStreamChunk.additionalProperties.toMutableMap()
            }

            fun event(event: Event) = event(JsonField.of(event))

            fun event(event: JsonField<Event>) = apply { this.event = event }

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

            fun build(): ChatCompletionResponseStreamChunk =
                ChatCompletionResponseStreamChunk(
                    checkRequired("event", event),
                    additionalProperties.toImmutable()
                )
        }

        @NoAutoDetect
        class Event
        @JsonCreator
        private constructor(
            @JsonProperty("delta")
            @ExcludeMissing
            private val delta: JsonField<ContentDelta> = JsonMissing.of(),
            @JsonProperty("event_type")
            @ExcludeMissing
            private val eventType: JsonField<EventType> = JsonMissing.of(),
            @JsonProperty("logprobs")
            @ExcludeMissing
            private val logprobs: JsonField<List<TokenLogProbs>> = JsonMissing.of(),
            @JsonProperty("stop_reason")
            @ExcludeMissing
            private val stopReason: JsonField<StopReason> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun delta(): ContentDelta = delta.getRequired("delta")

            fun eventType(): EventType = eventType.getRequired("event_type")

            fun logprobs(): List<TokenLogProbs>? = logprobs.getNullable("logprobs")

            fun stopReason(): StopReason? = stopReason.getNullable("stop_reason")

            @JsonProperty("delta") @ExcludeMissing fun _delta(): JsonField<ContentDelta> = delta

            @JsonProperty("event_type")
            @ExcludeMissing
            fun _eventType(): JsonField<EventType> = eventType

            @JsonProperty("logprobs")
            @ExcludeMissing
            fun _logprobs(): JsonField<List<TokenLogProbs>> = logprobs

            @JsonProperty("stop_reason")
            @ExcludeMissing
            fun _stopReason(): JsonField<StopReason> = stopReason

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Event = apply {
                if (validated) {
                    return@apply
                }

                delta().validate()
                eventType()
                logprobs()?.forEach { it.validate() }
                stopReason()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var delta: JsonField<ContentDelta>? = null
                private var eventType: JsonField<EventType>? = null
                private var logprobs: JsonField<MutableList<TokenLogProbs>>? = null
                private var stopReason: JsonField<StopReason> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(event: Event) = apply {
                    delta = event.delta
                    eventType = event.eventType
                    logprobs = event.logprobs.map { it.toMutableList() }
                    stopReason = event.stopReason
                    additionalProperties = event.additionalProperties.toMutableMap()
                }

                fun delta(delta: ContentDelta) = delta(JsonField.of(delta))

                fun delta(delta: JsonField<ContentDelta>) = apply { this.delta = delta }

                fun delta(text: ContentDelta.Text) = delta(ContentDelta.ofText(text))

                fun delta(image: ContentDelta.Image) = delta(ContentDelta.ofImage(image))

                fun delta(toolCall: ContentDelta.ToolCall) =
                    delta(ContentDelta.ofToolCall(toolCall))

                fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

                fun eventType(eventType: JsonField<EventType>) = apply {
                    this.eventType = eventType
                }

                fun logprobs(logprobs: List<TokenLogProbs>) = logprobs(JsonField.of(logprobs))

                fun logprobs(logprobs: JsonField<List<TokenLogProbs>>) = apply {
                    this.logprobs = logprobs.map { it.toMutableList() }
                }

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

                fun stopReason(stopReason: StopReason) = stopReason(JsonField.of(stopReason))

                fun stopReason(stopReason: JsonField<StopReason>) = apply {
                    this.stopReason = stopReason
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): Event =
                    Event(
                        checkRequired("delta", delta),
                        checkRequired("eventType", eventType),
                        (logprobs ?: JsonMissing.of()).map { it.toImmutable() },
                        stopReason,
                        additionalProperties.toImmutable(),
                    )
            }

            class EventType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val START = of("start")

                    val COMPLETE = of("complete")

                    val PROGRESS = of("progress")

                    fun of(value: String) = EventType(JsonField.of(value))
                }

                enum class Known {
                    START,
                    COMPLETE,
                    PROGRESS,
                }

                enum class Value {
                    START,
                    COMPLETE,
                    PROGRESS,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        START -> Value.START
                        COMPLETE -> Value.COMPLETE
                        PROGRESS -> Value.PROGRESS
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        START -> Known.START
                        COMPLETE -> Known.COMPLETE
                        PROGRESS -> Known.PROGRESS
                        else ->
                            throw LlamaStackClientInvalidDataException("Unknown EventType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is EventType && value == other.value /* spotless:on */
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
                        else ->
                            throw LlamaStackClientInvalidDataException("Unknown StopReason: $value")
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

                return /* spotless:off */ other is Event && delta == other.delta && eventType == other.eventType && logprobs == other.logprobs && stopReason == other.stopReason && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(delta, eventType, logprobs, stopReason, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Event{delta=$delta, eventType=$eventType, logprobs=$logprobs, stopReason=$stopReason, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ChatCompletionResponseStreamChunk && event == other.event && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(event, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ChatCompletionResponseStreamChunk{event=$event, additionalProperties=$additionalProperties}"
    }
}
