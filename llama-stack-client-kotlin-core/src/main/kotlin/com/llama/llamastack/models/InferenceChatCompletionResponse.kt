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

@JsonDeserialize(using = InferenceChatCompletionResponse.Deserializer::class)
@JsonSerialize(using = InferenceChatCompletionResponse.Serializer::class)
class InferenceChatCompletionResponse
private constructor(
    private val chatCompletionResponse: ChatCompletionResponse? = null,
    private val chatCompletionResponseStreamChunk: ChatCompletionResponseStreamChunk? = null,
    private val _json: JsonValue? = null,
) {

    private var validated: Boolean = false

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

    fun validate(): InferenceChatCompletionResponse = apply {
        if (!validated) {
            if (chatCompletionResponse == null && chatCompletionResponseStreamChunk == null) {
                throw LlamaStackClientInvalidDataException(
                    "Unknown InferenceChatCompletionResponse: $_json"
                )
            }
            chatCompletionResponse?.validate()
            chatCompletionResponseStreamChunk?.validate()
            validated = true
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InferenceChatCompletionResponse && this.chatCompletionResponse == other.chatCompletionResponse && this.chatCompletionResponseStreamChunk == other.chatCompletionResponseStreamChunk /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(chatCompletionResponse, chatCompletionResponseStreamChunk) /* spotless:on */
    }

    override fun toString(): String {
        return when {
            chatCompletionResponse != null ->
                "InferenceChatCompletionResponse{chatCompletionResponse=$chatCompletionResponse}"
            chatCompletionResponseStreamChunk != null ->
                "InferenceChatCompletionResponse{chatCompletionResponseStreamChunk=$chatCompletionResponseStreamChunk}"
            _json != null -> "InferenceChatCompletionResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid InferenceChatCompletionResponse")
        }
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

    @JsonDeserialize(builder = ChatCompletionResponse.Builder::class)
    @NoAutoDetect
    class ChatCompletionResponse
    private constructor(
        private val completionMessage: JsonField<CompletionMessage>,
        private val logprobs: JsonField<List<TokenLogProbs>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

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
                    logprobs.map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ChatCompletionResponse && this.completionMessage == other.completionMessage && this.logprobs == other.logprobs && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(completionMessage, logprobs, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ChatCompletionResponse{completionMessage=$completionMessage, logprobs=$logprobs, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = ChatCompletionResponseStreamChunk.Builder::class)
    @NoAutoDetect
    class ChatCompletionResponseStreamChunk
    private constructor(
        private val event: JsonField<Event>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun event(): Event = event.getRequired("event")

        @JsonProperty("event") @ExcludeMissing fun _event() = event

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): ChatCompletionResponseStreamChunk = apply {
            if (!validated) {
                event().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var event: JsonField<Event> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                chatCompletionResponseStreamChunk: ChatCompletionResponseStreamChunk
            ) = apply {
                this.event = chatCompletionResponseStreamChunk.event
                additionalProperties(chatCompletionResponseStreamChunk.additionalProperties)
            }

            fun event(event: Event) = event(JsonField.of(event))

            @JsonProperty("event")
            @ExcludeMissing
            fun event(event: JsonField<Event>) = apply { this.event = event }

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

            fun build(): ChatCompletionResponseStreamChunk =
                ChatCompletionResponseStreamChunk(event, additionalProperties.toImmutable())
        }

        @JsonDeserialize(builder = Event.Builder::class)
        @NoAutoDetect
        class Event
        private constructor(
            private val delta: JsonField<Delta>,
            private val eventType: JsonField<EventType>,
            private val logprobs: JsonField<List<TokenLogProbs>>,
            private val stopReason: JsonField<StopReason>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun delta(): Delta = delta.getRequired("delta")

            fun eventType(): EventType = eventType.getRequired("event_type")

            fun logprobs(): List<TokenLogProbs>? = logprobs.getNullable("logprobs")

            fun stopReason(): StopReason? = stopReason.getNullable("stop_reason")

            @JsonProperty("delta") @ExcludeMissing fun _delta() = delta

            @JsonProperty("event_type") @ExcludeMissing fun _eventType() = eventType

            @JsonProperty("logprobs") @ExcludeMissing fun _logprobs() = logprobs

            @JsonProperty("stop_reason") @ExcludeMissing fun _stopReason() = stopReason

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Event = apply {
                if (!validated) {
                    delta()
                    eventType()
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

                private var delta: JsonField<Delta> = JsonMissing.of()
                private var eventType: JsonField<EventType> = JsonMissing.of()
                private var logprobs: JsonField<List<TokenLogProbs>> = JsonMissing.of()
                private var stopReason: JsonField<StopReason> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(event: Event) = apply {
                    this.delta = event.delta
                    this.eventType = event.eventType
                    this.logprobs = event.logprobs
                    this.stopReason = event.stopReason
                    additionalProperties(event.additionalProperties)
                }

                fun delta(delta: Delta) = delta(JsonField.of(delta))

                @JsonProperty("delta")
                @ExcludeMissing
                fun delta(delta: JsonField<Delta>) = apply { this.delta = delta }

                fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

                @JsonProperty("event_type")
                @ExcludeMissing
                fun eventType(eventType: JsonField<EventType>) = apply {
                    this.eventType = eventType
                }

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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Event =
                    Event(
                        delta,
                        eventType,
                        logprobs.map { it.toImmutable() },
                        stopReason,
                        additionalProperties.toImmutable(),
                    )
            }

            @JsonDeserialize(using = Delta.Deserializer::class)
            @JsonSerialize(using = Delta.Serializer::class)
            class Delta
            private constructor(
                private val string: String? = null,
                private val toolCallDelta: ToolCallDelta? = null,
                private val _json: JsonValue? = null,
            ) {

                private var validated: Boolean = false

                fun string(): String? = string

                fun toolCallDelta(): ToolCallDelta? = toolCallDelta

                fun isString(): Boolean = string != null

                fun isToolCallDelta(): Boolean = toolCallDelta != null

                fun asString(): String = string.getOrThrow("string")

                fun asToolCallDelta(): ToolCallDelta = toolCallDelta.getOrThrow("toolCallDelta")

                fun _json(): JsonValue? = _json

                fun <T> accept(visitor: Visitor<T>): T {
                    return when {
                        string != null -> visitor.visitString(string)
                        toolCallDelta != null -> visitor.visitToolCallDelta(toolCallDelta)
                        else -> visitor.unknown(_json)
                    }
                }

                fun validate(): Delta = apply {
                    if (!validated) {
                        if (string == null && toolCallDelta == null) {
                            throw LlamaStackClientInvalidDataException("Unknown Delta: $_json")
                        }
                        toolCallDelta?.validate()
                        validated = true
                    }
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Delta && this.string == other.string && this.toolCallDelta == other.toolCallDelta /* spotless:on */
                }

                override fun hashCode(): Int {
                    return /* spotless:off */ Objects.hash(string, toolCallDelta) /* spotless:on */
                }

                override fun toString(): String {
                    return when {
                        string != null -> "Delta{string=$string}"
                        toolCallDelta != null -> "Delta{toolCallDelta=$toolCallDelta}"
                        _json != null -> "Delta{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Delta")
                    }
                }

                companion object {

                    fun ofString(string: String) = Delta(string = string)

                    fun ofToolCallDelta(toolCallDelta: ToolCallDelta) =
                        Delta(toolCallDelta = toolCallDelta)
                }

                interface Visitor<out T> {

                    fun visitString(string: String): T

                    fun visitToolCallDelta(toolCallDelta: ToolCallDelta): T

                    fun unknown(json: JsonValue?): T {
                        throw LlamaStackClientInvalidDataException("Unknown Delta: $json")
                    }
                }

                class Deserializer : BaseDeserializer<Delta>(Delta::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Delta {
                        val json = JsonValue.fromJsonNode(node)

                        tryDeserialize(node, jacksonTypeRef<String>())?.let {
                            return Delta(string = it, _json = json)
                        }
                        tryDeserialize(node, jacksonTypeRef<ToolCallDelta>()) { it.validate() }
                            ?.let {
                                return Delta(toolCallDelta = it, _json = json)
                            }

                        return Delta(_json = json)
                    }
                }

                class Serializer : BaseSerializer<Delta>(Delta::class) {

                    override fun serialize(
                        value: Delta,
                        generator: JsonGenerator,
                        provider: SerializerProvider
                    ) {
                        when {
                            value.string != null -> generator.writeObject(value.string)
                            value.toolCallDelta != null ->
                                generator.writeObject(value.toolCallDelta)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Delta")
                        }
                    }
                }

                @JsonDeserialize(builder = ToolCallDelta.Builder::class)
                @NoAutoDetect
                class ToolCallDelta
                private constructor(
                    private val content: JsonField<Content>,
                    private val parseStatus: JsonField<ParseStatus>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    fun content(): Content = content.getRequired("content")

                    fun parseStatus(): ParseStatus = parseStatus.getRequired("parse_status")

                    @JsonProperty("content") @ExcludeMissing fun _content() = content

                    @JsonProperty("parse_status") @ExcludeMissing fun _parseStatus() = parseStatus

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): ToolCallDelta = apply {
                        if (!validated) {
                            content()
                            parseStatus()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var content: JsonField<Content> = JsonMissing.of()
                        private var parseStatus: JsonField<ParseStatus> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(toolCallDelta: ToolCallDelta) = apply {
                            this.content = toolCallDelta.content
                            this.parseStatus = toolCallDelta.parseStatus
                            additionalProperties(toolCallDelta.additionalProperties)
                        }

                        fun content(content: Content) = content(JsonField.of(content))

                        @JsonProperty("content")
                        @ExcludeMissing
                        fun content(content: JsonField<Content>) = apply { this.content = content }

                        fun parseStatus(parseStatus: ParseStatus) =
                            parseStatus(JsonField.of(parseStatus))

                        @JsonProperty("parse_status")
                        @ExcludeMissing
                        fun parseStatus(parseStatus: JsonField<ParseStatus>) = apply {
                            this.parseStatus = parseStatus
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): ToolCallDelta =
                            ToolCallDelta(
                                content,
                                parseStatus,
                                additionalProperties.toImmutable(),
                            )
                    }

                    @JsonDeserialize(using = Content.Deserializer::class)
                    @JsonSerialize(using = Content.Serializer::class)
                    class Content
                    private constructor(
                        private val string: String? = null,
                        private val toolCall: ToolCall? = null,
                        private val _json: JsonValue? = null,
                    ) {

                        private var validated: Boolean = false

                        fun string(): String? = string

                        fun toolCall(): ToolCall? = toolCall

                        fun isString(): Boolean = string != null

                        fun isToolCall(): Boolean = toolCall != null

                        fun asString(): String = string.getOrThrow("string")

                        fun asToolCall(): ToolCall = toolCall.getOrThrow("toolCall")

                        fun _json(): JsonValue? = _json

                        fun <T> accept(visitor: Visitor<T>): T {
                            return when {
                                string != null -> visitor.visitString(string)
                                toolCall != null -> visitor.visitToolCall(toolCall)
                                else -> visitor.unknown(_json)
                            }
                        }

                        fun validate(): Content = apply {
                            if (!validated) {
                                if (string == null && toolCall == null) {
                                    throw LlamaStackClientInvalidDataException(
                                        "Unknown Content: $_json"
                                    )
                                }
                                toolCall?.validate()
                                validated = true
                            }
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Content && this.string == other.string && this.toolCall == other.toolCall /* spotless:on */
                        }

                        override fun hashCode(): Int {
                            return /* spotless:off */ Objects.hash(string, toolCall) /* spotless:on */
                        }

                        override fun toString(): String {
                            return when {
                                string != null -> "Content{string=$string}"
                                toolCall != null -> "Content{toolCall=$toolCall}"
                                _json != null -> "Content{_unknown=$_json}"
                                else -> throw IllegalStateException("Invalid Content")
                            }
                        }

                        companion object {

                            fun ofString(string: String) = Content(string = string)

                            fun ofToolCall(toolCall: ToolCall) = Content(toolCall = toolCall)
                        }

                        interface Visitor<out T> {

                            fun visitString(string: String): T

                            fun visitToolCall(toolCall: ToolCall): T

                            fun unknown(json: JsonValue?): T {
                                throw LlamaStackClientInvalidDataException("Unknown Content: $json")
                            }
                        }

                        class Deserializer : BaseDeserializer<Content>(Content::class) {

                            override fun ObjectCodec.deserialize(node: JsonNode): Content {
                                val json = JsonValue.fromJsonNode(node)

                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    return Content(string = it, _json = json)
                                }
                                tryDeserialize(node, jacksonTypeRef<ToolCall>()) { it.validate() }
                                    ?.let {
                                        return Content(toolCall = it, _json = json)
                                    }

                                return Content(_json = json)
                            }
                        }

                        class Serializer : BaseSerializer<Content>(Content::class) {

                            override fun serialize(
                                value: Content,
                                generator: JsonGenerator,
                                provider: SerializerProvider
                            ) {
                                when {
                                    value.string != null -> generator.writeObject(value.string)
                                    value.toolCall != null -> generator.writeObject(value.toolCall)
                                    value._json != null -> generator.writeObject(value._json)
                                    else -> throw IllegalStateException("Invalid Content")
                                }
                            }
                        }
                    }

                    class ParseStatus
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is ParseStatus && this.value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val STARTED = ParseStatus(JsonField.of("started"))

                            val IN_PROGRESS = ParseStatus(JsonField.of("in_progress"))

                            val FAILURE = ParseStatus(JsonField.of("failure"))

                            val SUCCESS = ParseStatus(JsonField.of("success"))

                            fun of(value: String) = ParseStatus(JsonField.of(value))
                        }

                        enum class Known {
                            STARTED,
                            IN_PROGRESS,
                            FAILURE,
                            SUCCESS,
                        }

                        enum class Value {
                            STARTED,
                            IN_PROGRESS,
                            FAILURE,
                            SUCCESS,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                STARTED -> Value.STARTED
                                IN_PROGRESS -> Value.IN_PROGRESS
                                FAILURE -> Value.FAILURE
                                SUCCESS -> Value.SUCCESS
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                STARTED -> Known.STARTED
                                IN_PROGRESS -> Known.IN_PROGRESS
                                FAILURE -> Known.FAILURE
                                SUCCESS -> Known.SUCCESS
                                else ->
                                    throw LlamaStackClientInvalidDataException(
                                        "Unknown ParseStatus: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is ToolCallDelta && this.content == other.content && this.parseStatus == other.parseStatus && this.additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    private var hashCode: Int = 0

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = /* spotless:off */ Objects.hash(content, parseStatus, additionalProperties) /* spotless:on */
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "ToolCallDelta{content=$content, parseStatus=$parseStatus, additionalProperties=$additionalProperties}"
                }
            }

            class EventType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is EventType && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val START = EventType(JsonField.of("start"))

                    val COMPLETE = EventType(JsonField.of("complete"))

                    val PROGRESS = EventType(JsonField.of("progress"))

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
                        else ->
                            throw LlamaStackClientInvalidDataException("Unknown StopReason: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Event && this.delta == other.delta && this.eventType == other.eventType && this.logprobs == other.logprobs && this.stopReason == other.stopReason && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(delta, eventType, logprobs, stopReason, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "Event{delta=$delta, eventType=$eventType, logprobs=$logprobs, stopReason=$stopReason, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ChatCompletionResponseStreamChunk && this.event == other.event && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(event, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ChatCompletionResponseStreamChunk{event=$event, additionalProperties=$additionalProperties}"
    }
}
