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

@JsonDeserialize(builder = ScoredDialogGenerations.Builder::class)
@NoAutoDetect
class ScoredDialogGenerations
private constructor(
    private val dialog: JsonField<List<Dialog>>,
    private val scoredGenerations: JsonField<List<ScoredGeneration>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun dialog(): List<Dialog> = dialog.getRequired("dialog")

    fun scoredGenerations(): List<ScoredGeneration> =
        scoredGenerations.getRequired("scored_generations")

    @JsonProperty("dialog") @ExcludeMissing fun _dialog() = dialog

    @JsonProperty("scored_generations") @ExcludeMissing fun _scoredGenerations() = scoredGenerations

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ScoredDialogGenerations = apply {
        if (!validated) {
            dialog()
            scoredGenerations().forEach { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ScoredDialogGenerations &&
            this.dialog == other.dialog &&
            this.scoredGenerations == other.scoredGenerations &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    dialog,
                    scoredGenerations,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "ScoredDialogGenerations{dialog=$dialog, scoredGenerations=$scoredGenerations, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var dialog: JsonField<List<Dialog>> = JsonMissing.of()
        private var scoredGenerations: JsonField<List<ScoredGeneration>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(scoredDialogGenerations: ScoredDialogGenerations) = apply {
            this.dialog = scoredDialogGenerations.dialog
            this.scoredGenerations = scoredDialogGenerations.scoredGenerations
            additionalProperties(scoredDialogGenerations.additionalProperties)
        }

        fun dialog(dialog: List<Dialog>) = dialog(JsonField.of(dialog))

        @JsonProperty("dialog")
        @ExcludeMissing
        fun dialog(dialog: JsonField<List<Dialog>>) = apply { this.dialog = dialog }

        fun scoredGenerations(scoredGenerations: List<ScoredGeneration>) =
            scoredGenerations(JsonField.of(scoredGenerations))

        @JsonProperty("scored_generations")
        @ExcludeMissing
        fun scoredGenerations(scoredGenerations: JsonField<List<ScoredGeneration>>) = apply {
            this.scoredGenerations = scoredGenerations
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

        fun build(): ScoredDialogGenerations =
            ScoredDialogGenerations(
                dialog.map { it.toUnmodifiable() },
                scoredGenerations.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(using = Dialog.Deserializer::class)
    @JsonSerialize(using = Dialog.Serializer::class)
    class Dialog
    private constructor(
        private val userMessage: UserMessage? = null,
        private val systemMessage: SystemMessage? = null,
        private val toolResponseMessage: ToolResponseMessage? = null,
        private val completionMessage: CompletionMessage? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

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

        fun asCompletionMessage(): CompletionMessage =
            completionMessage.getOrThrow("completionMessage")

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

        fun validate(): Dialog = apply {
            if (!validated) {
                if (
                    userMessage == null &&
                        systemMessage == null &&
                        toolResponseMessage == null &&
                        completionMessage == null
                ) {
                    throw LlamaStackClientInvalidDataException("Unknown Dialog: $_json")
                }
                userMessage?.validate()
                systemMessage?.validate()
                toolResponseMessage?.validate()
                completionMessage?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Dialog &&
                this.userMessage == other.userMessage &&
                this.systemMessage == other.systemMessage &&
                this.toolResponseMessage == other.toolResponseMessage &&
                this.completionMessage == other.completionMessage
        }

        override fun hashCode(): Int {
            return Objects.hash(
                userMessage,
                systemMessage,
                toolResponseMessage,
                completionMessage,
            )
        }

        override fun toString(): String {
            return when {
                userMessage != null -> "Dialog{userMessage=$userMessage}"
                systemMessage != null -> "Dialog{systemMessage=$systemMessage}"
                toolResponseMessage != null -> "Dialog{toolResponseMessage=$toolResponseMessage}"
                completionMessage != null -> "Dialog{completionMessage=$completionMessage}"
                _json != null -> "Dialog{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Dialog")
            }
        }

        companion object {

            fun ofUserMessage(userMessage: UserMessage) = Dialog(userMessage = userMessage)

            fun ofSystemMessage(systemMessage: SystemMessage) =
                Dialog(systemMessage = systemMessage)

            fun ofToolResponseMessage(toolResponseMessage: ToolResponseMessage) =
                Dialog(toolResponseMessage = toolResponseMessage)

            fun ofCompletionMessage(completionMessage: CompletionMessage) =
                Dialog(completionMessage = completionMessage)
        }

        interface Visitor<out T> {

            fun visitUserMessage(userMessage: UserMessage): T

            fun visitSystemMessage(systemMessage: SystemMessage): T

            fun visitToolResponseMessage(toolResponseMessage: ToolResponseMessage): T

            fun visitCompletionMessage(completionMessage: CompletionMessage): T

            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown Dialog: $json")
            }
        }

        class Deserializer : BaseDeserializer<Dialog>(Dialog::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Dialog {
                val json = JsonValue.fromJsonNode(node)
                tryDeserialize(node, jacksonTypeRef<UserMessage>()) { it.validate() }
                    ?.let {
                        return Dialog(userMessage = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<SystemMessage>()) { it.validate() }
                    ?.let {
                        return Dialog(systemMessage = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<ToolResponseMessage>()) { it.validate() }
                    ?.let {
                        return Dialog(toolResponseMessage = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<CompletionMessage>()) { it.validate() }
                    ?.let {
                        return Dialog(completionMessage = it, _json = json)
                    }

                return Dialog(_json = json)
            }
        }

        class Serializer : BaseSerializer<Dialog>(Dialog::class) {

            override fun serialize(
                value: Dialog,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.userMessage != null -> generator.writeObject(value.userMessage)
                    value.systemMessage != null -> generator.writeObject(value.systemMessage)
                    value.toolResponseMessage != null ->
                        generator.writeObject(value.toolResponseMessage)
                    value.completionMessage != null ->
                        generator.writeObject(value.completionMessage)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Dialog")
                }
            }
        }
    }

    @JsonDeserialize(builder = ScoredGeneration.Builder::class)
    @NoAutoDetect
    class ScoredGeneration
    private constructor(
        private val message: JsonField<Message>,
        private val score: JsonField<Double>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun message(): Message = message.getRequired("message")

        fun score(): Double = score.getRequired("score")

        @JsonProperty("message") @ExcludeMissing fun _message() = message

        @JsonProperty("score") @ExcludeMissing fun _score() = score

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): ScoredGeneration = apply {
            if (!validated) {
                message()
                score()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ScoredGeneration &&
                this.message == other.message &&
                this.score == other.score &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        message,
                        score,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "ScoredGeneration{message=$message, score=$score, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var message: JsonField<Message> = JsonMissing.of()
            private var score: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(scoredGeneration: ScoredGeneration) = apply {
                this.message = scoredGeneration.message
                this.score = scoredGeneration.score
                additionalProperties(scoredGeneration.additionalProperties)
            }

            fun message(message: Message) = message(JsonField.of(message))

            @JsonProperty("message")
            @ExcludeMissing
            fun message(message: JsonField<Message>) = apply { this.message = message }

            fun score(score: Double) = score(JsonField.of(score))

            @JsonProperty("score")
            @ExcludeMissing
            fun score(score: JsonField<Double>) = apply { this.score = score }

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

            fun build(): ScoredGeneration =
                ScoredGeneration(
                    message,
                    score,
                    additionalProperties.toUnmodifiable(),
                )
        }

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

            private var validated: Boolean = false

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

            fun asCompletionMessage(): CompletionMessage =
                completionMessage.getOrThrow("completionMessage")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    userMessage != null -> visitor.visitUserMessage(userMessage)
                    systemMessage != null -> visitor.visitSystemMessage(systemMessage)
                    toolResponseMessage != null ->
                        visitor.visitToolResponseMessage(toolResponseMessage)
                    completionMessage != null -> visitor.visitCompletionMessage(completionMessage)
                    else -> visitor.unknown(_json)
                }
            }

            fun validate(): Message = apply {
                if (!validated) {
                    if (
                        userMessage == null &&
                            systemMessage == null &&
                            toolResponseMessage == null &&
                            completionMessage == null
                    ) {
                        throw LlamaStackClientInvalidDataException("Unknown Message: $_json")
                    }
                    userMessage?.validate()
                    systemMessage?.validate()
                    toolResponseMessage?.validate()
                    completionMessage?.validate()
                    validated = true
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Message &&
                    this.userMessage == other.userMessage &&
                    this.systemMessage == other.systemMessage &&
                    this.toolResponseMessage == other.toolResponseMessage &&
                    this.completionMessage == other.completionMessage
            }

            override fun hashCode(): Int {
                return Objects.hash(
                    userMessage,
                    systemMessage,
                    toolResponseMessage,
                    completionMessage,
                )
            }

            override fun toString(): String {
                return when {
                    userMessage != null -> "Message{userMessage=$userMessage}"
                    systemMessage != null -> "Message{systemMessage=$systemMessage}"
                    toolResponseMessage != null ->
                        "Message{toolResponseMessage=$toolResponseMessage}"
                    completionMessage != null -> "Message{completionMessage=$completionMessage}"
                    _json != null -> "Message{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Message")
                }
            }

            companion object {

                fun ofUserMessage(userMessage: UserMessage) = Message(userMessage = userMessage)

                fun ofSystemMessage(systemMessage: SystemMessage) =
                    Message(systemMessage = systemMessage)

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
                    tryDeserialize(node, jacksonTypeRef<UserMessage>()) { it.validate() }
                        ?.let {
                            return Message(userMessage = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<SystemMessage>()) { it.validate() }
                        ?.let {
                            return Message(systemMessage = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<ToolResponseMessage>()) { it.validate() }
                        ?.let {
                            return Message(toolResponseMessage = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<CompletionMessage>()) { it.validate() }
                        ?.let {
                            return Message(completionMessage = it, _json = json)
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
                        value.completionMessage != null ->
                            generator.writeObject(value.completionMessage)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Message")
                    }
                }
            }
        }
    }
}
