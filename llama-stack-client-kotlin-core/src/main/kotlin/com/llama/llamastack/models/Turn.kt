// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

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
import com.llama.llamastack.core.BaseDeserializer
import com.llama.llamastack.core.BaseSerializer
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = Turn.Builder::class)
@NoAutoDetect
class Turn
private constructor(
    private val completedAt: JsonField<OffsetDateTime>,
    private val inputMessages: JsonField<List<InputMessage>>,
    private val outputAttachments: JsonField<List<Attachment>>,
    private val outputMessage: JsonField<CompletionMessage>,
    private val sessionId: JsonField<String>,
    private val startedAt: JsonField<OffsetDateTime>,
    private val steps: JsonField<List<Step>>,
    private val turnId: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun completedAt(): OffsetDateTime? = completedAt.getNullable("completed_at")

    fun inputMessages(): List<InputMessage> = inputMessages.getRequired("input_messages")

    fun outputAttachments(): List<Attachment> = outputAttachments.getRequired("output_attachments")

    fun outputMessage(): CompletionMessage = outputMessage.getRequired("output_message")

    fun sessionId(): String = sessionId.getRequired("session_id")

    fun startedAt(): OffsetDateTime = startedAt.getRequired("started_at")

    fun steps(): List<Step> = steps.getRequired("steps")

    fun turnId(): String = turnId.getRequired("turn_id")

    @JsonProperty("completed_at") @ExcludeMissing fun _completedAt() = completedAt

    @JsonProperty("input_messages") @ExcludeMissing fun _inputMessages() = inputMessages

    @JsonProperty("output_attachments") @ExcludeMissing fun _outputAttachments() = outputAttachments

    @JsonProperty("output_message") @ExcludeMissing fun _outputMessage() = outputMessage

    @JsonProperty("session_id") @ExcludeMissing fun _sessionId() = sessionId

    @JsonProperty("started_at") @ExcludeMissing fun _startedAt() = startedAt

    @JsonProperty("steps") @ExcludeMissing fun _steps() = steps

    @JsonProperty("turn_id") @ExcludeMissing fun _turnId() = turnId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Turn = apply {
        if (!validated) {
            completedAt()
            inputMessages()
            outputAttachments().forEach { it.validate() }
            outputMessage().validate()
            sessionId()
            startedAt()
            steps()
            turnId()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var completedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var inputMessages: JsonField<List<InputMessage>> = JsonMissing.of()
        private var outputAttachments: JsonField<List<Attachment>> = JsonMissing.of()
        private var outputMessage: JsonField<CompletionMessage> = JsonMissing.of()
        private var sessionId: JsonField<String> = JsonMissing.of()
        private var startedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var steps: JsonField<List<Step>> = JsonMissing.of()
        private var turnId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(turn: Turn) = apply {
            this.completedAt = turn.completedAt
            this.inputMessages = turn.inputMessages
            this.outputAttachments = turn.outputAttachments
            this.outputMessage = turn.outputMessage
            this.sessionId = turn.sessionId
            this.startedAt = turn.startedAt
            this.steps = turn.steps
            this.turnId = turn.turnId
            additionalProperties(turn.additionalProperties)
        }

        fun completedAt(completedAt: OffsetDateTime) = completedAt(JsonField.of(completedAt))

        @JsonProperty("completed_at")
        @ExcludeMissing
        fun completedAt(completedAt: JsonField<OffsetDateTime>) = apply {
            this.completedAt = completedAt
        }

        fun inputMessages(inputMessages: List<InputMessage>) =
            inputMessages(JsonField.of(inputMessages))

        @JsonProperty("input_messages")
        @ExcludeMissing
        fun inputMessages(inputMessages: JsonField<List<InputMessage>>) = apply {
            this.inputMessages = inputMessages
        }

        fun outputAttachments(outputAttachments: List<Attachment>) =
            outputAttachments(JsonField.of(outputAttachments))

        @JsonProperty("output_attachments")
        @ExcludeMissing
        fun outputAttachments(outputAttachments: JsonField<List<Attachment>>) = apply {
            this.outputAttachments = outputAttachments
        }

        fun outputMessage(outputMessage: CompletionMessage) =
            outputMessage(JsonField.of(outputMessage))

        @JsonProperty("output_message")
        @ExcludeMissing
        fun outputMessage(outputMessage: JsonField<CompletionMessage>) = apply {
            this.outputMessage = outputMessage
        }

        fun sessionId(sessionId: String) = sessionId(JsonField.of(sessionId))

        @JsonProperty("session_id")
        @ExcludeMissing
        fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

        fun startedAt(startedAt: OffsetDateTime) = startedAt(JsonField.of(startedAt))

        @JsonProperty("started_at")
        @ExcludeMissing
        fun startedAt(startedAt: JsonField<OffsetDateTime>) = apply { this.startedAt = startedAt }

        fun steps(steps: List<Step>) = steps(JsonField.of(steps))

        @JsonProperty("steps")
        @ExcludeMissing
        fun steps(steps: JsonField<List<Step>>) = apply { this.steps = steps }

        fun turnId(turnId: String) = turnId(JsonField.of(turnId))

        @JsonProperty("turn_id")
        @ExcludeMissing
        fun turnId(turnId: JsonField<String>) = apply { this.turnId = turnId }

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

        fun build(): Turn =
            Turn(
                completedAt,
                inputMessages.map { it.toImmutable() },
                outputAttachments.map { it.toImmutable() },
                outputMessage,
                sessionId,
                startedAt,
                steps.map { it.toImmutable() },
                turnId,
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(using = InputMessage.Deserializer::class)
    @JsonSerialize(using = InputMessage.Serializer::class)
    class InputMessage
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

        fun validate(): InputMessage = apply {
            if (!validated) {
                if (userMessage == null && toolResponseMessage == null) {
                    throw LlamaStackClientInvalidDataException("Unknown InputMessage: $_json")
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

            return /* spotless:off */ other is InputMessage && this.userMessage == other.userMessage && this.toolResponseMessage == other.toolResponseMessage /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(userMessage, toolResponseMessage) /* spotless:on */
        }

        override fun toString(): String {
            return when {
                userMessage != null -> "InputMessage{userMessage=$userMessage}"
                toolResponseMessage != null ->
                    "InputMessage{toolResponseMessage=$toolResponseMessage}"
                _json != null -> "InputMessage{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid InputMessage")
            }
        }

        companion object {

            fun ofUserMessage(userMessage: UserMessage) = InputMessage(userMessage = userMessage)

            fun ofToolResponseMessage(toolResponseMessage: ToolResponseMessage) =
                InputMessage(toolResponseMessage = toolResponseMessage)
        }

        interface Visitor<out T> {

            fun visitUserMessage(userMessage: UserMessage): T

            fun visitToolResponseMessage(toolResponseMessage: ToolResponseMessage): T

            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown InputMessage: $json")
            }
        }

        class Deserializer : BaseDeserializer<InputMessage>(InputMessage::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): InputMessage {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<UserMessage>()) { it.validate() }
                    ?.let {
                        return InputMessage(userMessage = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<ToolResponseMessage>()) { it.validate() }
                    ?.let {
                        return InputMessage(toolResponseMessage = it, _json = json)
                    }

                return InputMessage(_json = json)
            }
        }

        class Serializer : BaseSerializer<InputMessage>(InputMessage::class) {

            override fun serialize(
                value: InputMessage,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.userMessage != null -> generator.writeObject(value.userMessage)
                    value.toolResponseMessage != null ->
                        generator.writeObject(value.toolResponseMessage)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid InputMessage")
                }
            }
        }
    }

    @JsonDeserialize(using = Step.Deserializer::class)
    @JsonSerialize(using = Step.Serializer::class)
    class Step
    private constructor(
        private val inferenceStep: InferenceStep? = null,
        private val toolExecutionStep: ToolExecutionStep? = null,
        private val shieldCallStep: ShieldCallStep? = null,
        private val memoryRetrievalStep: MemoryRetrievalStep? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun inferenceStep(): InferenceStep? = inferenceStep

        fun toolExecutionStep(): ToolExecutionStep? = toolExecutionStep

        fun shieldCallStep(): ShieldCallStep? = shieldCallStep

        fun memoryRetrievalStep(): MemoryRetrievalStep? = memoryRetrievalStep

        fun isInferenceStep(): Boolean = inferenceStep != null

        fun isToolExecutionStep(): Boolean = toolExecutionStep != null

        fun isShieldCallStep(): Boolean = shieldCallStep != null

        fun isMemoryRetrievalStep(): Boolean = memoryRetrievalStep != null

        fun asInferenceStep(): InferenceStep = inferenceStep.getOrThrow("inferenceStep")

        fun asToolExecutionStep(): ToolExecutionStep =
            toolExecutionStep.getOrThrow("toolExecutionStep")

        fun asShieldCallStep(): ShieldCallStep = shieldCallStep.getOrThrow("shieldCallStep")

        fun asMemoryRetrievalStep(): MemoryRetrievalStep =
            memoryRetrievalStep.getOrThrow("memoryRetrievalStep")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                inferenceStep != null -> visitor.visitInferenceStep(inferenceStep)
                toolExecutionStep != null -> visitor.visitToolExecutionStep(toolExecutionStep)
                shieldCallStep != null -> visitor.visitShieldCallStep(shieldCallStep)
                memoryRetrievalStep != null -> visitor.visitMemoryRetrievalStep(memoryRetrievalStep)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): Step = apply {
            if (!validated) {
                if (
                    inferenceStep == null &&
                        toolExecutionStep == null &&
                        shieldCallStep == null &&
                        memoryRetrievalStep == null
                ) {
                    throw LlamaStackClientInvalidDataException("Unknown Step: $_json")
                }
                inferenceStep?.validate()
                toolExecutionStep?.validate()
                shieldCallStep?.validate()
                memoryRetrievalStep?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Step && this.inferenceStep == other.inferenceStep && this.toolExecutionStep == other.toolExecutionStep && this.shieldCallStep == other.shieldCallStep && this.memoryRetrievalStep == other.memoryRetrievalStep /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(inferenceStep, toolExecutionStep, shieldCallStep, memoryRetrievalStep) /* spotless:on */
        }

        override fun toString(): String {
            return when {
                inferenceStep != null -> "Step{inferenceStep=$inferenceStep}"
                toolExecutionStep != null -> "Step{toolExecutionStep=$toolExecutionStep}"
                shieldCallStep != null -> "Step{shieldCallStep=$shieldCallStep}"
                memoryRetrievalStep != null -> "Step{memoryRetrievalStep=$memoryRetrievalStep}"
                _json != null -> "Step{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Step")
            }
        }

        companion object {

            fun ofInferenceStep(inferenceStep: InferenceStep) = Step(inferenceStep = inferenceStep)

            fun ofToolExecutionStep(toolExecutionStep: ToolExecutionStep) =
                Step(toolExecutionStep = toolExecutionStep)

            fun ofShieldCallStep(shieldCallStep: ShieldCallStep) =
                Step(shieldCallStep = shieldCallStep)

            fun ofMemoryRetrievalStep(memoryRetrievalStep: MemoryRetrievalStep) =
                Step(memoryRetrievalStep = memoryRetrievalStep)
        }

        interface Visitor<out T> {

            fun visitInferenceStep(inferenceStep: InferenceStep): T

            fun visitToolExecutionStep(toolExecutionStep: ToolExecutionStep): T

            fun visitShieldCallStep(shieldCallStep: ShieldCallStep): T

            fun visitMemoryRetrievalStep(memoryRetrievalStep: MemoryRetrievalStep): T

            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown Step: $json")
            }
        }

        class Deserializer : BaseDeserializer<Step>(Step::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Step {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<InferenceStep>()) { it.validate() }
                    ?.let {
                        return Step(inferenceStep = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<ToolExecutionStep>()) { it.validate() }
                    ?.let {
                        return Step(toolExecutionStep = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<ShieldCallStep>()) { it.validate() }
                    ?.let {
                        return Step(shieldCallStep = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<MemoryRetrievalStep>()) { it.validate() }
                    ?.let {
                        return Step(memoryRetrievalStep = it, _json = json)
                    }

                return Step(_json = json)
            }
        }

        class Serializer : BaseSerializer<Step>(Step::class) {

            override fun serialize(
                value: Step,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.inferenceStep != null -> generator.writeObject(value.inferenceStep)
                    value.toolExecutionStep != null ->
                        generator.writeObject(value.toolExecutionStep)
                    value.shieldCallStep != null -> generator.writeObject(value.shieldCallStep)
                    value.memoryRetrievalStep != null ->
                        generator.writeObject(value.memoryRetrievalStep)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Step")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Turn && this.completedAt == other.completedAt && this.inputMessages == other.inputMessages && this.outputAttachments == other.outputAttachments && this.outputMessage == other.outputMessage && this.sessionId == other.sessionId && this.startedAt == other.startedAt && this.steps == other.steps && this.turnId == other.turnId && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(completedAt, inputMessages, outputAttachments, outputMessage, sessionId, startedAt, steps, turnId, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "Turn{completedAt=$completedAt, inputMessages=$inputMessages, outputAttachments=$outputAttachments, outputMessage=$outputMessage, sessionId=$sessionId, startedAt=$startedAt, steps=$steps, turnId=$turnId, additionalProperties=$additionalProperties}"
}
