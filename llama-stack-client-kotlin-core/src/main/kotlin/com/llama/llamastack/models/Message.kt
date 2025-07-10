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

/** A message from the user in a chat conversation. */
@JsonDeserialize(using = Message.Deserializer::class)
@JsonSerialize(using = Message.Serializer::class)
class Message
private constructor(
    private val user: UserMessage? = null,
    private val system: SystemMessage? = null,
    private val tool: ToolResponseMessage? = null,
    private val assistant: CompletionMessage? = null,
    private val _json: JsonValue? = null,
) {

    /** A message from the user in a chat conversation. */
    fun user(): UserMessage? = user

    /** A system message providing instructions or context to the model. */
    fun system(): SystemMessage? = system

    /** A message representing the result of a tool invocation. */
    fun tool(): ToolResponseMessage? = tool

    /** A message containing the model's (assistant) response in a chat conversation. */
    fun assistant(): CompletionMessage? = assistant

    fun isUser(): Boolean = user != null

    fun isSystem(): Boolean = system != null

    fun isTool(): Boolean = tool != null

    fun isAssistant(): Boolean = assistant != null

    /** A message from the user in a chat conversation. */
    fun asUser(): UserMessage = user.getOrThrow("user")

    /** A system message providing instructions or context to the model. */
    fun asSystem(): SystemMessage = system.getOrThrow("system")

    /** A message representing the result of a tool invocation. */
    fun asTool(): ToolResponseMessage = tool.getOrThrow("tool")

    /** A message containing the model's (assistant) response in a chat conversation. */
    fun asAssistant(): CompletionMessage = assistant.getOrThrow("assistant")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            user != null -> visitor.visitUser(user)
            system != null -> visitor.visitSystem(system)
            tool != null -> visitor.visitTool(tool)
            assistant != null -> visitor.visitAssistant(assistant)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): Message = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitUser(user: UserMessage) {
                    user.validate()
                }

                override fun visitSystem(system: SystemMessage) {
                    system.validate()
                }

                override fun visitTool(tool: ToolResponseMessage) {
                    tool.validate()
                }

                override fun visitAssistant(assistant: CompletionMessage) {
                    assistant.validate()
                }
            }
        )
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LlamaStackClientInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitUser(user: UserMessage) = user.validity()

                override fun visitSystem(system: SystemMessage) = system.validity()

                override fun visitTool(tool: ToolResponseMessage) = tool.validity()

                override fun visitAssistant(assistant: CompletionMessage) = assistant.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Message && user == other.user && system == other.system && tool == other.tool && assistant == other.assistant /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(user, system, tool, assistant) /* spotless:on */

    override fun toString(): String =
        when {
            user != null -> "Message{user=$user}"
            system != null -> "Message{system=$system}"
            tool != null -> "Message{tool=$tool}"
            assistant != null -> "Message{assistant=$assistant}"
            _json != null -> "Message{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid Message")
        }

    companion object {

        /** A message from the user in a chat conversation. */
        fun ofUser(user: UserMessage) = Message(user = user)

        /** A system message providing instructions or context to the model. */
        fun ofSystem(system: SystemMessage) = Message(system = system)

        /** A message representing the result of a tool invocation. */
        fun ofTool(tool: ToolResponseMessage) = Message(tool = tool)

        /** A message containing the model's (assistant) response in a chat conversation. */
        fun ofAssistant(assistant: CompletionMessage) = Message(assistant = assistant)
    }

    /** An interface that defines how to map each variant of [Message] to a value of type [T]. */
    interface Visitor<out T> {

        /** A message from the user in a chat conversation. */
        fun visitUser(user: UserMessage): T

        /** A system message providing instructions or context to the model. */
        fun visitSystem(system: SystemMessage): T

        /** A message representing the result of a tool invocation. */
        fun visitTool(tool: ToolResponseMessage): T

        /** A message containing the model's (assistant) response in a chat conversation. */
        fun visitAssistant(assistant: CompletionMessage): T

        /**
         * Maps an unknown variant of [Message] to a value of type [T].
         *
         * An instance of [Message] can contain an unknown variant if it was deserialized from data
         * that doesn't match any known variant. For example, if the SDK is on an older version than
         * the API, then the API may respond with new variants that the SDK is unaware of.
         *
         * @throws LlamaStackClientInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LlamaStackClientInvalidDataException("Unknown Message: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<Message>(Message::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): Message {
            val json = JsonValue.fromJsonNode(node)
            val role = json.asObject()?.get("role")?.asString()

            when (role) {
                "user" -> {
                    return tryDeserialize(node, jacksonTypeRef<UserMessage>())?.let {
                        Message(user = it, _json = json)
                    } ?: Message(_json = json)
                }
                "system" -> {
                    return tryDeserialize(node, jacksonTypeRef<SystemMessage>())?.let {
                        Message(system = it, _json = json)
                    } ?: Message(_json = json)
                }
                "tool" -> {
                    return tryDeserialize(node, jacksonTypeRef<ToolResponseMessage>())?.let {
                        Message(tool = it, _json = json)
                    } ?: Message(_json = json)
                }
                "assistant" -> {
                    return tryDeserialize(node, jacksonTypeRef<CompletionMessage>())?.let {
                        Message(assistant = it, _json = json)
                    } ?: Message(_json = json)
                }
            }

            return Message(_json = json)
        }
    }

    internal class Serializer : BaseSerializer<Message>(Message::class) {

        override fun serialize(
            value: Message,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.user != null -> generator.writeObject(value.user)
                value.system != null -> generator.writeObject(value.system)
                value.tool != null -> generator.writeObject(value.tool)
                value.assistant != null -> generator.writeObject(value.assistant)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid Message")
            }
        }
    }
}
