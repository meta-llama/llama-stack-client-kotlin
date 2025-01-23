// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.BaseDeserializer
import com.llama.llamastack.core.BaseSerializer
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

@JsonDeserialize(using = Message.Deserializer::class)
@JsonSerialize(using = Message.Serializer::class)
class Message
private constructor(
    private val userMessage: UserMessage? = null,
    private val systemMessage: SystemMessage? = null,
    private val toolResponseMessage: ToolResponseMessage? = null,
    private val completionMessage: CompletionMessage? = null,
    private val _json: JsonValue? = null,
) {

    fun userMessage(): UserMessage? = userMessage

    fun systemMessage(): SystemMessage? = systemMessage

    fun toolResponseMessage(): ToolResponseMessage? = toolResponseMessage

    fun completionMessage(): CompletionMessage? = completionMessage

    fun isUserMessage(): Boolean = userMessage != null

    fun isSystemMessage(): Boolean = systemMessage != null

    fun isToolResponseMessage(): Boolean = toolResponseMessage != null

    fun isCompletionMessage(): Boolean = completionMessage != null

    fun asUserMessage(): UserMessage = userMessage.getOrThrow("userMessage")

    fun asSystemMessage(): SystemMessage = systemMessage.getOrThrow("systemMessage")

    fun asToolResponseMessage(): ToolResponseMessage =
        toolResponseMessage.getOrThrow("toolResponseMessage")

    fun asCompletionMessage(): CompletionMessage = completionMessage.getOrThrow("completionMessage")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            userMessage != null -> visitor.visitUserMessage(userMessage)
            systemMessage != null -> visitor.visitSystemMessage(systemMessage)
            toolResponseMessage != null -> visitor.visitToolResponseMessage(toolResponseMessage)
            completionMessage != null -> visitor.visitCompletionMessage(completionMessage)
            else -> visitor.unknown(_json)
        }
    }

    private var validated: Boolean = false

    fun validate(): Message = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitUserMessage(userMessage: UserMessage) {
                    userMessage.validate()
                }

                override fun visitSystemMessage(systemMessage: SystemMessage) {
                    systemMessage.validate()
                }

                override fun visitToolResponseMessage(toolResponseMessage: ToolResponseMessage) {
                    toolResponseMessage.validate()
                }

                override fun visitCompletionMessage(completionMessage: CompletionMessage) {
                    completionMessage.validate()
                }
            }
        )
        validated = true
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Message && userMessage == other.userMessage && systemMessage == other.systemMessage && toolResponseMessage == other.toolResponseMessage && completionMessage == other.completionMessage /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(userMessage, systemMessage, toolResponseMessage, completionMessage) /* spotless:on */

    override fun toString(): String =
        when {
            userMessage != null -> "Message{userMessage=$userMessage}"
            systemMessage != null -> "Message{systemMessage=$systemMessage}"
            toolResponseMessage != null -> "Message{toolResponseMessage=$toolResponseMessage}"
            completionMessage != null -> "Message{completionMessage=$completionMessage}"
            _json != null -> "Message{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid Message")
        }

    companion object {

        fun ofUserMessage(userMessage: UserMessage) = Message(userMessage = userMessage)

        fun ofSystemMessage(systemMessage: SystemMessage) = Message(systemMessage = systemMessage)

        fun ofToolResponseMessage(toolResponseMessage: ToolResponseMessage) =
            Message(toolResponseMessage = toolResponseMessage)

        fun ofCompletionMessage(completionMessage: CompletionMessage) =
            Message(completionMessage = completionMessage)
    }

    interface Visitor<out T> {

        fun visitUserMessage(userMessage: UserMessage): T

        fun visitSystemMessage(systemMessage: SystemMessage): T

        fun visitToolResponseMessage(toolResponseMessage: ToolResponseMessage): T

        fun visitCompletionMessage(completionMessage: CompletionMessage): T

        fun unknown(json: JsonValue?): T {
            throw LlamaStackClientInvalidDataException("Unknown Message: $json")
        }
    }

    class Deserializer : BaseDeserializer<Message>(Message::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): Message {
            val json = JsonValue.fromJsonNode(node)
            val role = json.asObject()?.get("role")?.asString()

            when (role) {
                "user" -> {
                    tryDeserialize(node, jacksonTypeRef<UserMessage>()) { it.validate() }
                        ?.let {
                            return Message(userMessage = it, _json = json)
                        }
                }
                "system" -> {
                    tryDeserialize(node, jacksonTypeRef<SystemMessage>()) { it.validate() }
                        ?.let {
                            return Message(systemMessage = it, _json = json)
                        }
                }
                "tool" -> {
                    tryDeserialize(node, jacksonTypeRef<ToolResponseMessage>()) { it.validate() }
                        ?.let {
                            return Message(toolResponseMessage = it, _json = json)
                        }
                }
                "assistant" -> {
                    tryDeserialize(node, jacksonTypeRef<CompletionMessage>()) { it.validate() }
                        ?.let {
                            return Message(completionMessage = it, _json = json)
                        }
                }
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
                value.systemMessage != null -> generator.writeObject(value.systemMessage)
                value.toolResponseMessage != null ->
                    generator.writeObject(value.toolResponseMessage)
                value.completionMessage != null -> generator.writeObject(value.completionMessage)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid Message")
            }
        }
    }
}
