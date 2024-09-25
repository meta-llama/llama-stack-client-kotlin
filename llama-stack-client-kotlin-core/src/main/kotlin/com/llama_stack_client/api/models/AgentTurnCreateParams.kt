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
import com.llama_stack_client.api.core.JsonValue
import com.llama_stack_client.api.core.NoAutoDetect
import com.llama_stack_client.api.core.getOrThrow
import com.llama_stack_client.api.core.toUnmodifiable
import com.llama_stack_client.api.errors.LlamaStackClientInvalidDataException
import com.llama_stack_client.api.models.*
import java.util.Objects

class AgentTurnCreateParams
constructor(
    private val agentId: String,
    private val messages: List<Message>,
    private val sessionId: String,
    private val attachments: List<Attachment>?,
    private val stream: Boolean?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun agentId(): String = agentId

    fun messages(): List<Message> = messages

    fun sessionId(): String = sessionId

    fun attachments(): List<Attachment>? = attachments

    fun stream(): Boolean? = stream

    internal fun getBody(): AgentTurnCreateBody {
        return AgentTurnCreateBody(
            agentId,
            messages,
            sessionId,
            attachments,
            stream,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = AgentTurnCreateBody.Builder::class)
    @NoAutoDetect
    class AgentTurnCreateBody
    internal constructor(
        private val agentId: String?,
        private val messages: List<Message>?,
        private val sessionId: String?,
        private val attachments: List<Attachment>?,
        private val stream: Boolean?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("agent_id") fun agentId(): String? = agentId

        @JsonProperty("messages") fun messages(): List<Message>? = messages

        @JsonProperty("session_id") fun sessionId(): String? = sessionId

        @JsonProperty("attachments") fun attachments(): List<Attachment>? = attachments

        @JsonProperty("stream") fun stream(): Boolean? = stream

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AgentTurnCreateBody &&
                this.agentId == other.agentId &&
                this.messages == other.messages &&
                this.sessionId == other.sessionId &&
                this.attachments == other.attachments &&
                this.stream == other.stream &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        agentId,
                        messages,
                        sessionId,
                        attachments,
                        stream,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "AgentTurnCreateBody{agentId=$agentId, messages=$messages, sessionId=$sessionId, attachments=$attachments, stream=$stream, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var agentId: String? = null
            private var messages: List<Message>? = null
            private var sessionId: String? = null
            private var attachments: List<Attachment>? = null
            private var stream: Boolean? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(agentTurnCreateBody: AgentTurnCreateBody) = apply {
                this.agentId = agentTurnCreateBody.agentId
                this.messages = agentTurnCreateBody.messages
                this.sessionId = agentTurnCreateBody.sessionId
                this.attachments = agentTurnCreateBody.attachments
                this.stream = agentTurnCreateBody.stream
                additionalProperties(agentTurnCreateBody.additionalProperties)
            }

            @JsonProperty("agent_id")
            fun agentId(agentId: String) = apply { this.agentId = agentId }

            @JsonProperty("messages")
            fun messages(messages: List<Message>) = apply { this.messages = messages }

            @JsonProperty("session_id")
            fun sessionId(sessionId: String) = apply { this.sessionId = sessionId }

            @JsonProperty("attachments")
            fun attachments(attachments: List<Attachment>) = apply {
                this.attachments = attachments
            }

            @JsonProperty("stream") fun stream(stream: Boolean) = apply { this.stream = stream }

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

            fun build(): AgentTurnCreateBody =
                AgentTurnCreateBody(
                    checkNotNull(agentId) { "`agentId` is required but was not set" },
                    checkNotNull(messages) { "`messages` is required but was not set" }
                        .toUnmodifiable(),
                    checkNotNull(sessionId) { "`sessionId` is required but was not set" },
                    attachments?.toUnmodifiable(),
                    stream,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentTurnCreateParams &&
            this.agentId == other.agentId &&
            this.messages == other.messages &&
            this.sessionId == other.sessionId &&
            this.attachments == other.attachments &&
            this.stream == other.stream &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            agentId,
            messages,
            sessionId,
            attachments,
            stream,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "AgentTurnCreateParams{agentId=$agentId, messages=$messages, sessionId=$sessionId, attachments=$attachments, stream=$stream, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var agentId: String? = null
        private var messages: MutableList<Message> = mutableListOf()
        private var sessionId: String? = null
        private var attachments: MutableList<Attachment> = mutableListOf()
        private var stream: Boolean? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(agentTurnCreateParams: AgentTurnCreateParams) = apply {
            this.agentId = agentTurnCreateParams.agentId
            this.messages(agentTurnCreateParams.messages)
            this.sessionId = agentTurnCreateParams.sessionId
            this.attachments(agentTurnCreateParams.attachments ?: listOf())
            this.stream = agentTurnCreateParams.stream
            additionalQueryParams(agentTurnCreateParams.additionalQueryParams)
            additionalHeaders(agentTurnCreateParams.additionalHeaders)
            additionalBodyProperties(agentTurnCreateParams.additionalBodyProperties)
        }

        fun agentId(agentId: String) = apply { this.agentId = agentId }

        fun messages(messages: List<Message>) = apply {
            this.messages.clear()
            this.messages.addAll(messages)
        }

        fun addMessage(message: Message) = apply { this.messages.add(message) }

        fun sessionId(sessionId: String) = apply { this.sessionId = sessionId }

        fun attachments(attachments: List<Attachment>) = apply {
            this.attachments.clear()
            this.attachments.addAll(attachments)
        }

        fun addAttachment(attachment: Attachment) = apply { this.attachments.add(attachment) }

        fun stream(stream: Boolean) = apply { this.stream = stream }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): AgentTurnCreateParams =
            AgentTurnCreateParams(
                checkNotNull(agentId) { "`agentId` is required but was not set" },
                checkNotNull(messages) { "`messages` is required but was not set" }
                    .toUnmodifiable(),
                checkNotNull(sessionId) { "`sessionId` is required but was not set" },
                if (attachments.size == 0) null else attachments.toUnmodifiable(),
                stream,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(using = Message.Deserializer::class)
    @JsonSerialize(using = Message.Serializer::class)
    class Message
    private constructor(
        private val userMessage: UserMessage? = null,
        private val toolResponseMessage: ToolResponseMessage? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun userMessage(): UserMessage? = userMessage

        fun toolResponseMessage(): ToolResponseMessage? = toolResponseMessage

        fun isUserMessage(): Boolean = userMessage != null

        fun isToolResponseMessage(): Boolean = toolResponseMessage != null

        fun asUserMessage(): UserMessage = userMessage.getOrThrow("userMessage")

        fun asToolResponseMessage(): ToolResponseMessage =
            toolResponseMessage.getOrThrow("toolResponseMessage")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                userMessage != null -> visitor.visitUserMessage(userMessage)
                toolResponseMessage != null -> visitor.visitToolResponseMessage(toolResponseMessage)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): Message = apply {
            if (!validated) {
                if (userMessage == null && toolResponseMessage == null) {
                    throw LlamaStackClientInvalidDataException("Unknown Message: $_json")
                }
                userMessage?.validate()
                toolResponseMessage?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Message &&
                this.userMessage == other.userMessage &&
                this.toolResponseMessage == other.toolResponseMessage
        }

        override fun hashCode(): Int {
            return Objects.hash(userMessage, toolResponseMessage)
        }

        override fun toString(): String {
            return when {
                userMessage != null -> "Message{userMessage=$userMessage}"
                toolResponseMessage != null -> "Message{toolResponseMessage=$toolResponseMessage}"
                _json != null -> "Message{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Message")
            }
        }

        companion object {

            fun ofUserMessage(userMessage: UserMessage) = Message(userMessage = userMessage)

            fun ofToolResponseMessage(toolResponseMessage: ToolResponseMessage) =
                Message(toolResponseMessage = toolResponseMessage)
        }

        interface Visitor<out T> {

            fun visitUserMessage(userMessage: UserMessage): T

            fun visitToolResponseMessage(toolResponseMessage: ToolResponseMessage): T

            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown Message: $json")
            }
        }

        class Deserializer : BaseDeserializer<Message>(Message::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Message {
                val json = JsonValue.fromJsonNode(node)
                tryDeserialize(node, jacksonTypeRef<UserMessage>()) { it.validate() }
                    ?.let {
                        return Message(userMessage = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<ToolResponseMessage>()) { it.validate() }
                    ?.let {
                        return Message(toolResponseMessage = it, _json = json)
                    }

                return Message(_json = json)
            }
        }

        class Serializer : BaseSerializer<Message>(Message::class) {

            override fun serialize(
                value: Message,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.userMessage != null -> generator.writeObject(value.userMessage)
                    value.toolResponseMessage != null ->
                        generator.writeObject(value.toolResponseMessage)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Message")
                }
            }
        }
    }
}
