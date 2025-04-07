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
    private val toolResponse: ToolResponseMessage? = null,
    private val completion: CompletionMessage? = null,
    private val _json: JsonValue? = null,
) {

    /** A message from the user in a chat conversation. */
    fun user(): UserMessage? = user

    /** A system message providing instructions or context to the model. */
    fun system(): SystemMessage? = system

    /** A message representing the result of a tool invocation. */
    fun toolResponse(): ToolResponseMessage? = toolResponse

    /** A message containing the model's (assistant) response in a chat conversation. */
    fun completion(): CompletionMessage? = completion

    fun isUser(): Boolean = user != null

    fun isSystem(): Boolean = system != null

    fun isToolResponse(): Boolean = toolResponse != null

    fun isCompletion(): Boolean = completion != null

    /** A message from the user in a chat conversation. */
    fun asUser(): UserMessage = user.getOrThrow("user")

    /** A system message providing instructions or context to the model. */
    fun asSystem(): SystemMessage = system.getOrThrow("system")

    /** A message representing the result of a tool invocation. */
    fun asToolResponse(): ToolResponseMessage = toolResponse.getOrThrow("toolResponse")

    /** A message containing the model's (assistant) response in a chat conversation. */
    fun asCompletion(): CompletionMessage = completion.getOrThrow("completion")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            user != null -> visitor.visitUser(user)
            system != null -> visitor.visitSystem(system)
            toolResponse != null -> visitor.visitToolResponse(toolResponse)
            completion != null -> visitor.visitCompletion(completion)
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

                override fun visitToolResponse(toolResponse: ToolResponseMessage) {
                    toolResponse.validate()
                }

                override fun visitCompletion(completion: CompletionMessage) {
                    completion.validate()
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

                override fun visitToolResponse(toolResponse: ToolResponseMessage) =
                    toolResponse.validity()

                override fun visitCompletion(completion: CompletionMessage) = completion.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Message && user == other.user && system == other.system && toolResponse == other.toolResponse && completion == other.completion /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(user, system, toolResponse, completion) /* spotless:on */

    override fun toString(): String =
        when {
            user != null -> "Message{user=$user}"
            system != null -> "Message{system=$system}"
            toolResponse != null -> "Message{toolResponse=$toolResponse}"
            completion != null -> "Message{completion=$completion}"
            _json != null -> "Message{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid Message")
        }

    companion object {

        /** A message from the user in a chat conversation. */
        fun ofUser(user: UserMessage) = Message(user = user)

        /** A system message providing instructions or context to the model. */
        fun ofSystem(system: SystemMessage) = Message(system = system)

        /** A message representing the result of a tool invocation. */
        fun ofToolResponse(toolResponse: ToolResponseMessage) = Message(toolResponse = toolResponse)

        /** A message containing the model's (assistant) response in a chat conversation. */
        fun ofCompletion(completion: CompletionMessage) = Message(completion = completion)
    }

    /** An interface that defines how to map each variant of [Message] to a value of type [T]. */
    interface Visitor<out T> {

        /** A message from the user in a chat conversation. */
        fun visitUser(user: UserMessage): T

        /** A system message providing instructions or context to the model. */
        fun visitSystem(system: SystemMessage): T

        /** A message representing the result of a tool invocation. */
        fun visitToolResponse(toolResponse: ToolResponseMessage): T

        /** A message containing the model's (assistant) response in a chat conversation. */
        fun visitCompletion(completion: CompletionMessage): T

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
                        Message(toolResponse = it, _json = json)
                    } ?: Message(_json = json)
                }
                "assistant" -> {
                    return tryDeserialize(node, jacksonTypeRef<CompletionMessage>())?.let {
                        Message(completion = it, _json = json)
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
                value.toolResponse != null -> generator.writeObject(value.toolResponse)
                value.completion != null -> generator.writeObject(value.completion)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid Message")
            }
        }
    }
}
