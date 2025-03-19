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
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.checkKnown
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

/** A single turn in an interaction with an Agentic System. */
@NoAutoDetect
class Turn
@JsonCreator
private constructor(
    @JsonProperty("input_messages")
    @ExcludeMissing
    private val inputMessages: JsonField<List<InputMessage>> = JsonMissing.of(),
    @JsonProperty("output_message")
    @ExcludeMissing
    private val outputMessage: JsonField<CompletionMessage> = JsonMissing.of(),
    @JsonProperty("session_id")
    @ExcludeMissing
    private val sessionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("started_at")
    @ExcludeMissing
    private val startedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("steps")
    @ExcludeMissing
    private val steps: JsonField<List<Step>> = JsonMissing.of(),
    @JsonProperty("turn_id")
    @ExcludeMissing
    private val turnId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("completed_at")
    @ExcludeMissing
    private val completedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("output_attachments")
    @ExcludeMissing
    private val outputAttachments: JsonField<List<OutputAttachment>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inputMessages(): List<InputMessage> = inputMessages.getRequired("input_messages")

    /**
     * A message containing the model's (assistant) response in a chat conversation.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun outputMessage(): CompletionMessage = outputMessage.getRequired("output_message")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sessionId(): String = sessionId.getRequired("session_id")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startedAt(): OffsetDateTime = startedAt.getRequired("started_at")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun steps(): List<Step> = steps.getRequired("steps")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun turnId(): String = turnId.getRequired("turn_id")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun completedAt(): OffsetDateTime? = completedAt.getNullable("completed_at")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun outputAttachments(): List<OutputAttachment>? =
        outputAttachments.getNullable("output_attachments")

    /**
     * Returns the raw JSON value of [inputMessages].
     *
     * Unlike [inputMessages], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("input_messages")
    @ExcludeMissing
    fun _inputMessages(): JsonField<List<InputMessage>> = inputMessages

    /**
     * Returns the raw JSON value of [outputMessage].
     *
     * Unlike [outputMessage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("output_message")
    @ExcludeMissing
    fun _outputMessage(): JsonField<CompletionMessage> = outputMessage

    /**
     * Returns the raw JSON value of [sessionId].
     *
     * Unlike [sessionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("session_id") @ExcludeMissing fun _sessionId(): JsonField<String> = sessionId

    /**
     * Returns the raw JSON value of [startedAt].
     *
     * Unlike [startedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("started_at")
    @ExcludeMissing
    fun _startedAt(): JsonField<OffsetDateTime> = startedAt

    /**
     * Returns the raw JSON value of [steps].
     *
     * Unlike [steps], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("steps") @ExcludeMissing fun _steps(): JsonField<List<Step>> = steps

    /**
     * Returns the raw JSON value of [turnId].
     *
     * Unlike [turnId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("turn_id") @ExcludeMissing fun _turnId(): JsonField<String> = turnId

    /**
     * Returns the raw JSON value of [completedAt].
     *
     * Unlike [completedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("completed_at")
    @ExcludeMissing
    fun _completedAt(): JsonField<OffsetDateTime> = completedAt

    /**
     * Returns the raw JSON value of [outputAttachments].
     *
     * Unlike [outputAttachments], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("output_attachments")
    @ExcludeMissing
    fun _outputAttachments(): JsonField<List<OutputAttachment>> = outputAttachments

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Turn = apply {
        if (validated) {
            return@apply
        }

        inputMessages().forEach { it.validate() }
        outputMessage().validate()
        sessionId()
        startedAt()
        steps().forEach { it.validate() }
        turnId()
        completedAt()
        outputAttachments()?.forEach { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Turn].
         *
         * The following fields are required:
         * ```kotlin
         * .inputMessages()
         * .outputMessage()
         * .sessionId()
         * .startedAt()
         * .steps()
         * .turnId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Turn]. */
    class Builder internal constructor() {

        private var inputMessages: JsonField<MutableList<InputMessage>>? = null
        private var outputMessage: JsonField<CompletionMessage>? = null
        private var sessionId: JsonField<String>? = null
        private var startedAt: JsonField<OffsetDateTime>? = null
        private var steps: JsonField<MutableList<Step>>? = null
        private var turnId: JsonField<String>? = null
        private var completedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var outputAttachments: JsonField<MutableList<OutputAttachment>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(turn: Turn) = apply {
            inputMessages = turn.inputMessages.map { it.toMutableList() }
            outputMessage = turn.outputMessage
            sessionId = turn.sessionId
            startedAt = turn.startedAt
            steps = turn.steps.map { it.toMutableList() }
            turnId = turn.turnId
            completedAt = turn.completedAt
            outputAttachments = turn.outputAttachments.map { it.toMutableList() }
            additionalProperties = turn.additionalProperties.toMutableMap()
        }

        fun inputMessages(inputMessages: List<InputMessage>) =
            inputMessages(JsonField.of(inputMessages))

        /**
         * Sets [Builder.inputMessages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inputMessages] with a well-typed `List<InputMessage>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun inputMessages(inputMessages: JsonField<List<InputMessage>>) = apply {
            this.inputMessages = inputMessages.map { it.toMutableList() }
        }

        /**
         * Adds a single [InputMessage] to [inputMessages].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInputMessage(inputMessage: InputMessage) = apply {
            inputMessages =
                (inputMessages ?: JsonField.of(mutableListOf())).also {
                    checkKnown("inputMessages", it).add(inputMessage)
                }
        }

        /** Alias for calling [addInputMessage] with `InputMessage.ofUser(user)`. */
        fun addInputMessage(user: UserMessage) = addInputMessage(InputMessage.ofUser(user))

        /** Alias for calling [addInputMessage] with `InputMessage.ofToolResponse(toolResponse)`. */
        fun addInputMessage(toolResponse: ToolResponseMessage) =
            addInputMessage(InputMessage.ofToolResponse(toolResponse))

        /** A message containing the model's (assistant) response in a chat conversation. */
        fun outputMessage(outputMessage: CompletionMessage) =
            outputMessage(JsonField.of(outputMessage))

        /**
         * Sets [Builder.outputMessage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outputMessage] with a well-typed [CompletionMessage]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun outputMessage(outputMessage: JsonField<CompletionMessage>) = apply {
            this.outputMessage = outputMessage
        }

        fun sessionId(sessionId: String) = sessionId(JsonField.of(sessionId))

        /**
         * Sets [Builder.sessionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sessionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

        fun startedAt(startedAt: OffsetDateTime) = startedAt(JsonField.of(startedAt))

        /**
         * Sets [Builder.startedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startedAt(startedAt: JsonField<OffsetDateTime>) = apply { this.startedAt = startedAt }

        fun steps(steps: List<Step>) = steps(JsonField.of(steps))

        /**
         * Sets [Builder.steps] to an arbitrary JSON value.
         *
         * You should usually call [Builder.steps] with a well-typed `List<Step>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun steps(steps: JsonField<List<Step>>) = apply {
            this.steps = steps.map { it.toMutableList() }
        }

        /**
         * Adds a single [Step] to [steps].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addStep(step: Step) = apply {
            steps =
                (steps ?: JsonField.of(mutableListOf())).also { checkKnown("steps", it).add(step) }
        }

        /** Alias for calling [addStep] with `Step.ofInference(inference)`. */
        fun addStep(inference: InferenceStep) = addStep(Step.ofInference(inference))

        /** Alias for calling [addStep] with `Step.ofToolExecution(toolExecution)`. */
        fun addStep(toolExecution: ToolExecutionStep) = addStep(Step.ofToolExecution(toolExecution))

        /** Alias for calling [addStep] with `Step.ofShieldCall(shieldCall)`. */
        fun addStep(shieldCall: ShieldCallStep) = addStep(Step.ofShieldCall(shieldCall))

        /** Alias for calling [addStep] with `Step.ofMemoryRetrieval(memoryRetrieval)`. */
        fun addStep(memoryRetrieval: MemoryRetrievalStep) =
            addStep(Step.ofMemoryRetrieval(memoryRetrieval))

        fun turnId(turnId: String) = turnId(JsonField.of(turnId))

        /**
         * Sets [Builder.turnId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.turnId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun turnId(turnId: JsonField<String>) = apply { this.turnId = turnId }

        fun completedAt(completedAt: OffsetDateTime) = completedAt(JsonField.of(completedAt))

        /**
         * Sets [Builder.completedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.completedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun completedAt(completedAt: JsonField<OffsetDateTime>) = apply {
            this.completedAt = completedAt
        }

        fun outputAttachments(outputAttachments: List<OutputAttachment>) =
            outputAttachments(JsonField.of(outputAttachments))

        /**
         * Sets [Builder.outputAttachments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outputAttachments] with a well-typed
         * `List<OutputAttachment>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun outputAttachments(outputAttachments: JsonField<List<OutputAttachment>>) = apply {
            this.outputAttachments = outputAttachments.map { it.toMutableList() }
        }

        /**
         * Adds a single [OutputAttachment] to [outputAttachments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOutputAttachment(outputAttachment: OutputAttachment) = apply {
            outputAttachments =
                (outputAttachments ?: JsonField.of(mutableListOf())).also {
                    checkKnown("outputAttachments", it).add(outputAttachment)
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

        fun build(): Turn =
            Turn(
                checkRequired("inputMessages", inputMessages).map { it.toImmutable() },
                checkRequired("outputMessage", outputMessage),
                checkRequired("sessionId", sessionId),
                checkRequired("startedAt", startedAt),
                checkRequired("steps", steps).map { it.toImmutable() },
                checkRequired("turnId", turnId),
                completedAt,
                (outputAttachments ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    /** A message from the user in a chat conversation. */
    @JsonDeserialize(using = InputMessage.Deserializer::class)
    @JsonSerialize(using = InputMessage.Serializer::class)
    class InputMessage
    private constructor(
        private val user: UserMessage? = null,
        private val toolResponse: ToolResponseMessage? = null,
        private val _json: JsonValue? = null,
    ) {

        /** A message from the user in a chat conversation. */
        fun user(): UserMessage? = user

        /** A message representing the result of a tool invocation. */
        fun toolResponse(): ToolResponseMessage? = toolResponse

        fun isUser(): Boolean = user != null

        fun isToolResponse(): Boolean = toolResponse != null

        /** A message from the user in a chat conversation. */
        fun asUser(): UserMessage = user.getOrThrow("user")

        /** A message representing the result of a tool invocation. */
        fun asToolResponse(): ToolResponseMessage = toolResponse.getOrThrow("toolResponse")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                user != null -> visitor.visitUser(user)
                toolResponse != null -> visitor.visitToolResponse(toolResponse)
                else -> visitor.unknown(_json)
            }
        }

        private var validated: Boolean = false

        fun validate(): InputMessage = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitUser(user: UserMessage) {
                        user.validate()
                    }

                    override fun visitToolResponse(toolResponse: ToolResponseMessage) {
                        toolResponse.validate()
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InputMessage && user == other.user && toolResponse == other.toolResponse /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(user, toolResponse) /* spotless:on */

        override fun toString(): String =
            when {
                user != null -> "InputMessage{user=$user}"
                toolResponse != null -> "InputMessage{toolResponse=$toolResponse}"
                _json != null -> "InputMessage{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid InputMessage")
            }

        companion object {

            /** A message from the user in a chat conversation. */
            fun ofUser(user: UserMessage) = InputMessage(user = user)

            /** A message representing the result of a tool invocation. */
            fun ofToolResponse(toolResponse: ToolResponseMessage) =
                InputMessage(toolResponse = toolResponse)
        }

        /**
         * An interface that defines how to map each variant of [InputMessage] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            /** A message from the user in a chat conversation. */
            fun visitUser(user: UserMessage): T

            /** A message representing the result of a tool invocation. */
            fun visitToolResponse(toolResponse: ToolResponseMessage): T

            /**
             * Maps an unknown variant of [InputMessage] to a value of type [T].
             *
             * An instance of [InputMessage] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws LlamaStackClientInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown InputMessage: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<InputMessage>(InputMessage::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): InputMessage {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<UserMessage>()) { it.validate() }
                    ?.let {
                        return InputMessage(user = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<ToolResponseMessage>()) { it.validate() }
                    ?.let {
                        return InputMessage(toolResponse = it, _json = json)
                    }

                return InputMessage(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<InputMessage>(InputMessage::class) {

            override fun serialize(
                value: InputMessage,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.user != null -> generator.writeObject(value.user)
                    value.toolResponse != null -> generator.writeObject(value.toolResponse)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid InputMessage")
                }
            }
        }
    }

    /** An inference step in an agent turn. */
    @JsonDeserialize(using = Step.Deserializer::class)
    @JsonSerialize(using = Step.Serializer::class)
    class Step
    private constructor(
        private val inference: InferenceStep? = null,
        private val toolExecution: ToolExecutionStep? = null,
        private val shieldCall: ShieldCallStep? = null,
        private val memoryRetrieval: MemoryRetrievalStep? = null,
        private val _json: JsonValue? = null,
    ) {

        /** An inference step in an agent turn. */
        fun inference(): InferenceStep? = inference

        /** A tool execution step in an agent turn. */
        fun toolExecution(): ToolExecutionStep? = toolExecution

        /** A shield call step in an agent turn. */
        fun shieldCall(): ShieldCallStep? = shieldCall

        /** A memory retrieval step in an agent turn. */
        fun memoryRetrieval(): MemoryRetrievalStep? = memoryRetrieval

        fun isInference(): Boolean = inference != null

        fun isToolExecution(): Boolean = toolExecution != null

        fun isShieldCall(): Boolean = shieldCall != null

        fun isMemoryRetrieval(): Boolean = memoryRetrieval != null

        /** An inference step in an agent turn. */
        fun asInference(): InferenceStep = inference.getOrThrow("inference")

        /** A tool execution step in an agent turn. */
        fun asToolExecution(): ToolExecutionStep = toolExecution.getOrThrow("toolExecution")

        /** A shield call step in an agent turn. */
        fun asShieldCall(): ShieldCallStep = shieldCall.getOrThrow("shieldCall")

        /** A memory retrieval step in an agent turn. */
        fun asMemoryRetrieval(): MemoryRetrievalStep = memoryRetrieval.getOrThrow("memoryRetrieval")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                inference != null -> visitor.visitInference(inference)
                toolExecution != null -> visitor.visitToolExecution(toolExecution)
                shieldCall != null -> visitor.visitShieldCall(shieldCall)
                memoryRetrieval != null -> visitor.visitMemoryRetrieval(memoryRetrieval)
                else -> visitor.unknown(_json)
            }
        }

        private var validated: Boolean = false

        fun validate(): Step = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitInference(inference: InferenceStep) {
                        inference.validate()
                    }

                    override fun visitToolExecution(toolExecution: ToolExecutionStep) {
                        toolExecution.validate()
                    }

                    override fun visitShieldCall(shieldCall: ShieldCallStep) {
                        shieldCall.validate()
                    }

                    override fun visitMemoryRetrieval(memoryRetrieval: MemoryRetrievalStep) {
                        memoryRetrieval.validate()
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Step && inference == other.inference && toolExecution == other.toolExecution && shieldCall == other.shieldCall && memoryRetrieval == other.memoryRetrieval /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(inference, toolExecution, shieldCall, memoryRetrieval) /* spotless:on */

        override fun toString(): String =
            when {
                inference != null -> "Step{inference=$inference}"
                toolExecution != null -> "Step{toolExecution=$toolExecution}"
                shieldCall != null -> "Step{shieldCall=$shieldCall}"
                memoryRetrieval != null -> "Step{memoryRetrieval=$memoryRetrieval}"
                _json != null -> "Step{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Step")
            }

        companion object {

            /** An inference step in an agent turn. */
            fun ofInference(inference: InferenceStep) = Step(inference = inference)

            /** A tool execution step in an agent turn. */
            fun ofToolExecution(toolExecution: ToolExecutionStep) =
                Step(toolExecution = toolExecution)

            /** A shield call step in an agent turn. */
            fun ofShieldCall(shieldCall: ShieldCallStep) = Step(shieldCall = shieldCall)

            /** A memory retrieval step in an agent turn. */
            fun ofMemoryRetrieval(memoryRetrieval: MemoryRetrievalStep) =
                Step(memoryRetrieval = memoryRetrieval)
        }

        /** An interface that defines how to map each variant of [Step] to a value of type [T]. */
        interface Visitor<out T> {

            /** An inference step in an agent turn. */
            fun visitInference(inference: InferenceStep): T

            /** A tool execution step in an agent turn. */
            fun visitToolExecution(toolExecution: ToolExecutionStep): T

            /** A shield call step in an agent turn. */
            fun visitShieldCall(shieldCall: ShieldCallStep): T

            /** A memory retrieval step in an agent turn. */
            fun visitMemoryRetrieval(memoryRetrieval: MemoryRetrievalStep): T

            /**
             * Maps an unknown variant of [Step] to a value of type [T].
             *
             * An instance of [Step] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws LlamaStackClientInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown Step: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Step>(Step::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Step {
                val json = JsonValue.fromJsonNode(node)
                val stepType = json.asObject()?.get("step_type")?.asString()

                when (stepType) {
                    "inference" -> {
                        tryDeserialize(node, jacksonTypeRef<InferenceStep>()) { it.validate() }
                            ?.let {
                                return Step(inference = it, _json = json)
                            }
                    }
                    "tool_execution" -> {
                        tryDeserialize(node, jacksonTypeRef<ToolExecutionStep>()) { it.validate() }
                            ?.let {
                                return Step(toolExecution = it, _json = json)
                            }
                    }
                    "shield_call" -> {
                        tryDeserialize(node, jacksonTypeRef<ShieldCallStep>()) { it.validate() }
                            ?.let {
                                return Step(shieldCall = it, _json = json)
                            }
                    }
                    "memory_retrieval" -> {
                        tryDeserialize(node, jacksonTypeRef<MemoryRetrievalStep>()) {
                                it.validate()
                            }
                            ?.let {
                                return Step(memoryRetrieval = it, _json = json)
                            }
                    }
                }

                return Step(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Step>(Step::class) {

            override fun serialize(
                value: Step,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.inference != null -> generator.writeObject(value.inference)
                    value.toolExecution != null -> generator.writeObject(value.toolExecution)
                    value.shieldCall != null -> generator.writeObject(value.shieldCall)
                    value.memoryRetrieval != null -> generator.writeObject(value.memoryRetrieval)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Step")
                }
            }
        }
    }

    /** An attachment to an agent turn. */
    @NoAutoDetect
    class OutputAttachment
    @JsonCreator
    private constructor(
        @JsonProperty("content")
        @ExcludeMissing
        private val content: JsonField<Content> = JsonMissing.of(),
        @JsonProperty("mime_type")
        @ExcludeMissing
        private val mimeType: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The content of the attachment.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun content(): Content = content.getRequired("content")

        /**
         * The MIME type of the attachment.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun mimeType(): String = mimeType.getRequired("mime_type")

        /**
         * Returns the raw JSON value of [content].
         *
         * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<Content> = content

        /**
         * Returns the raw JSON value of [mimeType].
         *
         * Unlike [mimeType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mime_type") @ExcludeMissing fun _mimeType(): JsonField<String> = mimeType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): OutputAttachment = apply {
            if (validated) {
                return@apply
            }

            content().validate()
            mimeType()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [OutputAttachment].
             *
             * The following fields are required:
             * ```kotlin
             * .content()
             * .mimeType()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [OutputAttachment]. */
        class Builder internal constructor() {

            private var content: JsonField<Content>? = null
            private var mimeType: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(outputAttachment: OutputAttachment) = apply {
                content = outputAttachment.content
                mimeType = outputAttachment.mimeType
                additionalProperties = outputAttachment.additionalProperties.toMutableMap()
            }

            /** The content of the attachment. */
            fun content(content: Content) = content(JsonField.of(content))

            /**
             * Sets [Builder.content] to an arbitrary JSON value.
             *
             * You should usually call [Builder.content] with a well-typed [Content] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun content(content: JsonField<Content>) = apply { this.content = content }

            /** Alias for calling [content] with `Content.ofString(string)`. */
            fun content(string: String) = content(Content.ofString(string))

            /** Alias for calling [content] with `Content.ofImageContentItem(imageContentItem)`. */
            fun content(imageContentItem: Content.ImageContentItem) =
                content(Content.ofImageContentItem(imageContentItem))

            /** Alias for calling [content] with `Content.ofTextContentItem(textContentItem)`. */
            fun content(textContentItem: Content.TextContentItem) =
                content(Content.ofTextContentItem(textContentItem))

            /**
             * Alias for calling [content] with
             * `Content.ofInterleavedContentItems(interleavedContentItems)`.
             */
            fun contentOfInterleavedContentItems(
                interleavedContentItems: List<InterleavedContentItem>
            ) = content(Content.ofInterleavedContentItems(interleavedContentItems))

            /** Alias for calling [content] with `Content.ofUrl(url)`. */
            fun content(url: Content.Url) = content(Content.ofUrl(url))

            /** The MIME type of the attachment. */
            fun mimeType(mimeType: String) = mimeType(JsonField.of(mimeType))

            /**
             * Sets [Builder.mimeType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mimeType] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mimeType(mimeType: JsonField<String>) = apply { this.mimeType = mimeType }

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

            fun build(): OutputAttachment =
                OutputAttachment(
                    checkRequired("content", content),
                    checkRequired("mimeType", mimeType),
                    additionalProperties.toImmutable(),
                )
        }

        /** The content of the attachment. */
        @JsonDeserialize(using = Content.Deserializer::class)
        @JsonSerialize(using = Content.Serializer::class)
        class Content
        private constructor(
            private val string: String? = null,
            private val imageContentItem: ImageContentItem? = null,
            private val textContentItem: TextContentItem? = null,
            private val interleavedContentItems: List<InterleavedContentItem>? = null,
            private val url: Url? = null,
            private val _json: JsonValue? = null,
        ) {

            fun string(): String? = string

            /** A image content item */
            fun imageContentItem(): ImageContentItem? = imageContentItem

            /** A text content item */
            fun textContentItem(): TextContentItem? = textContentItem

            fun interleavedContentItems(): List<InterleavedContentItem>? = interleavedContentItems

            fun url(): Url? = url

            fun isString(): Boolean = string != null

            fun isImageContentItem(): Boolean = imageContentItem != null

            fun isTextContentItem(): Boolean = textContentItem != null

            fun isInterleavedContentItems(): Boolean = interleavedContentItems != null

            fun isUrl(): Boolean = url != null

            fun asString(): String = string.getOrThrow("string")

            /** A image content item */
            fun asImageContentItem(): ImageContentItem =
                imageContentItem.getOrThrow("imageContentItem")

            /** A text content item */
            fun asTextContentItem(): TextContentItem = textContentItem.getOrThrow("textContentItem")

            fun asInterleavedContentItems(): List<InterleavedContentItem> =
                interleavedContentItems.getOrThrow("interleavedContentItems")

            fun asUrl(): Url = url.getOrThrow("url")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    string != null -> visitor.visitString(string)
                    imageContentItem != null -> visitor.visitImageContentItem(imageContentItem)
                    textContentItem != null -> visitor.visitTextContentItem(textContentItem)
                    interleavedContentItems != null ->
                        visitor.visitInterleavedContentItems(interleavedContentItems)
                    url != null -> visitor.visitUrl(url)
                    else -> visitor.unknown(_json)
                }
            }

            private var validated: Boolean = false

            fun validate(): Content = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitString(string: String) {}

                        override fun visitImageContentItem(imageContentItem: ImageContentItem) {
                            imageContentItem.validate()
                        }

                        override fun visitTextContentItem(textContentItem: TextContentItem) {
                            textContentItem.validate()
                        }

                        override fun visitInterleavedContentItems(
                            interleavedContentItems: List<InterleavedContentItem>
                        ) {
                            interleavedContentItems.forEach { it.validate() }
                        }

                        override fun visitUrl(url: Url) {
                            url.validate()
                        }
                    }
                )
                validated = true
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Content && string == other.string && imageContentItem == other.imageContentItem && textContentItem == other.textContentItem && interleavedContentItems == other.interleavedContentItems && url == other.url /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, imageContentItem, textContentItem, interleavedContentItems, url) /* spotless:on */

            override fun toString(): String =
                when {
                    string != null -> "Content{string=$string}"
                    imageContentItem != null -> "Content{imageContentItem=$imageContentItem}"
                    textContentItem != null -> "Content{textContentItem=$textContentItem}"
                    interleavedContentItems != null ->
                        "Content{interleavedContentItems=$interleavedContentItems}"
                    url != null -> "Content{url=$url}"
                    _json != null -> "Content{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Content")
                }

            companion object {

                fun ofString(string: String) = Content(string = string)

                /** A image content item */
                fun ofImageContentItem(imageContentItem: ImageContentItem) =
                    Content(imageContentItem = imageContentItem)

                /** A text content item */
                fun ofTextContentItem(textContentItem: TextContentItem) =
                    Content(textContentItem = textContentItem)

                fun ofInterleavedContentItems(
                    interleavedContentItems: List<InterleavedContentItem>
                ) = Content(interleavedContentItems = interleavedContentItems)

                fun ofUrl(url: Url) = Content(url = url)
            }

            /**
             * An interface that defines how to map each variant of [Content] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitString(string: String): T

                /** A image content item */
                fun visitImageContentItem(imageContentItem: ImageContentItem): T

                /** A text content item */
                fun visitTextContentItem(textContentItem: TextContentItem): T

                fun visitInterleavedContentItems(
                    interleavedContentItems: List<InterleavedContentItem>
                ): T

                fun visitUrl(url: Url): T

                /**
                 * Maps an unknown variant of [Content] to a value of type [T].
                 *
                 * An instance of [Content] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws LlamaStackClientInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw LlamaStackClientInvalidDataException("Unknown Content: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Content>(Content::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Content {
                    val json = JsonValue.fromJsonNode(node)

                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                        return Content(string = it, _json = json)
                    }
                    tryDeserialize(node, jacksonTypeRef<ImageContentItem>()) { it.validate() }
                        ?.let {
                            return Content(imageContentItem = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<TextContentItem>()) { it.validate() }
                        ?.let {
                            return Content(textContentItem = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<List<InterleavedContentItem>>()) {
                            it.forEach { it.validate() }
                        }
                        ?.let {
                            return Content(interleavedContentItems = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<Url>()) { it.validate() }
                        ?.let {
                            return Content(url = it, _json = json)
                        }

                    return Content(_json = json)
                }
            }

            internal class Serializer : BaseSerializer<Content>(Content::class) {

                override fun serialize(
                    value: Content,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.string != null -> generator.writeObject(value.string)
                        value.imageContentItem != null ->
                            generator.writeObject(value.imageContentItem)
                        value.textContentItem != null ->
                            generator.writeObject(value.textContentItem)
                        value.interleavedContentItems != null ->
                            generator.writeObject(value.interleavedContentItems)
                        value.url != null -> generator.writeObject(value.url)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Content")
                    }
                }
            }

            /** A image content item */
            @NoAutoDetect
            class ImageContentItem
            @JsonCreator
            private constructor(
                @JsonProperty("image")
                @ExcludeMissing
                private val image: JsonField<Image> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                private val type: JsonValue = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /**
                 * Image as a base64 encoded string or an URL
                 *
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun image(): Image = image.getRequired("image")

                /**
                 * Discriminator type of the content item. Always "image"
                 *
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("image")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                /**
                 * Returns the raw JSON value of [image].
                 *
                 * Unlike [image], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("image") @ExcludeMissing fun _image(): JsonField<Image> = image

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): ImageContentItem = apply {
                    if (validated) {
                        return@apply
                    }

                    image().validate()
                    _type().let {
                        if (it != JsonValue.from("image")) {
                            throw LlamaStackClientInvalidDataException(
                                "'type' is invalid, received $it"
                            )
                        }
                    }
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [ImageContentItem].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .image()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [ImageContentItem]. */
                class Builder internal constructor() {

                    private var image: JsonField<Image>? = null
                    private var type: JsonValue = JsonValue.from("image")
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(imageContentItem: ImageContentItem) = apply {
                        image = imageContentItem.image
                        type = imageContentItem.type
                        additionalProperties = imageContentItem.additionalProperties.toMutableMap()
                    }

                    /** Image as a base64 encoded string or an URL */
                    fun image(image: Image) = image(JsonField.of(image))

                    /**
                     * Sets [Builder.image] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.image] with a well-typed [Image] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun image(image: JsonField<Image>) = apply { this.image = image }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("image")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun type(type: JsonValue) = apply { this.type = type }

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

                    fun build(): ImageContentItem =
                        ImageContentItem(
                            checkRequired("image", image),
                            type,
                            additionalProperties.toImmutable(),
                        )
                }

                /** Image as a base64 encoded string or an URL */
                @NoAutoDetect
                class Image
                @JsonCreator
                private constructor(
                    @JsonProperty("data")
                    @ExcludeMissing
                    private val data: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("url")
                    @ExcludeMissing
                    private val url: JsonField<Url> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /**
                     * base64 encoded image data as string
                     *
                     * @throws LlamaStackClientInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun data(): String? = data.getNullable("data")

                    /**
                     * A URL of the image or data URL in the format of
                     * data:image/{type};base64,{data}. Note that URL could have length limits.
                     *
                     * @throws LlamaStackClientInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun url(): Url? = url.getNullable("url")

                    /**
                     * Returns the raw JSON value of [data].
                     *
                     * Unlike [data], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<String> = data

                    /**
                     * Returns the raw JSON value of [url].
                     *
                     * Unlike [url], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<Url> = url

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Image = apply {
                        if (validated) {
                            return@apply
                        }

                        data()
                        url()?.validate()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /** Returns a mutable builder for constructing an instance of [Image]. */
                        fun builder() = Builder()
                    }

                    /** A builder for [Image]. */
                    class Builder internal constructor() {

                        private var data: JsonField<String> = JsonMissing.of()
                        private var url: JsonField<Url> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(image: Image) = apply {
                            data = image.data
                            url = image.url
                            additionalProperties = image.additionalProperties.toMutableMap()
                        }

                        /** base64 encoded image data as string */
                        fun data(data: String) = data(JsonField.of(data))

                        /**
                         * Sets [Builder.data] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.data] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun data(data: JsonField<String>) = apply { this.data = data }

                        /**
                         * A URL of the image or data URL in the format of
                         * data:image/{type};base64,{data}. Note that URL could have length limits.
                         */
                        fun url(url: Url) = url(JsonField.of(url))

                        /**
                         * Sets [Builder.url] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.url] with a well-typed [Url] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun url(url: JsonField<Url>) = apply { this.url = url }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): Image = Image(data, url, additionalProperties.toImmutable())
                    }

                    /**
                     * A URL of the image or data URL in the format of
                     * data:image/{type};base64,{data}. Note that URL could have length limits.
                     */
                    @NoAutoDetect
                    class Url
                    @JsonCreator
                    private constructor(
                        @JsonProperty("uri")
                        @ExcludeMissing
                        private val uri: JsonField<String> = JsonMissing.of(),
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        /**
                         * @throws LlamaStackClientInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun uri(): String = uri.getRequired("uri")

                        /**
                         * Returns the raw JSON value of [uri].
                         *
                         * Unlike [uri], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("uri") @ExcludeMissing fun _uri(): JsonField<String> = uri

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): Url = apply {
                            if (validated) {
                                return@apply
                            }

                            uri()
                            validated = true
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            /**
                             * Returns a mutable builder for constructing an instance of [Url].
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .uri()
                             * ```
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [Url]. */
                        class Builder internal constructor() {

                            private var uri: JsonField<String>? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(url: Url) = apply {
                                uri = url.uri
                                additionalProperties = url.additionalProperties.toMutableMap()
                            }

                            fun uri(uri: String) = uri(JsonField.of(uri))

                            /**
                             * Sets [Builder.uri] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.uri] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun uri(uri: JsonField<String>) = apply { this.uri = uri }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            fun build(): Url =
                                Url(checkRequired("uri", uri), additionalProperties.toImmutable())
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Url && uri == other.uri && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(uri, additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Url{uri=$uri, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Image && data == other.data && url == other.url && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(data, url, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Image{data=$data, url=$url, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ImageContentItem && image == other.image && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(image, type, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ImageContentItem{image=$image, type=$type, additionalProperties=$additionalProperties}"
            }

            /** A text content item */
            @NoAutoDetect
            class TextContentItem
            @JsonCreator
            private constructor(
                @JsonProperty("text")
                @ExcludeMissing
                private val text: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                private val type: JsonValue = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /**
                 * Text content
                 *
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun text(): String = text.getRequired("text")

                /**
                 * Discriminator type of the content item. Always "text"
                 *
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("text")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                /**
                 * Returns the raw JSON value of [text].
                 *
                 * Unlike [text], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): TextContentItem = apply {
                    if (validated) {
                        return@apply
                    }

                    text()
                    _type().let {
                        if (it != JsonValue.from("text")) {
                            throw LlamaStackClientInvalidDataException(
                                "'type' is invalid, received $it"
                            )
                        }
                    }
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [TextContentItem].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .text()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [TextContentItem]. */
                class Builder internal constructor() {

                    private var text: JsonField<String>? = null
                    private var type: JsonValue = JsonValue.from("text")
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(textContentItem: TextContentItem) = apply {
                        text = textContentItem.text
                        type = textContentItem.type
                        additionalProperties = textContentItem.additionalProperties.toMutableMap()
                    }

                    /** Text content */
                    fun text(text: String) = text(JsonField.of(text))

                    /**
                     * Sets [Builder.text] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.text] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun text(text: JsonField<String>) = apply { this.text = text }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("text")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun type(type: JsonValue) = apply { this.type = type }

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

                    fun build(): TextContentItem =
                        TextContentItem(
                            checkRequired("text", text),
                            type,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is TextContentItem && text == other.text && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(text, type, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "TextContentItem{text=$text, type=$type, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class Url
            @JsonCreator
            private constructor(
                @JsonProperty("uri")
                @ExcludeMissing
                private val uri: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun uri(): String = uri.getRequired("uri")

                /**
                 * Returns the raw JSON value of [uri].
                 *
                 * Unlike [uri], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("uri") @ExcludeMissing fun _uri(): JsonField<String> = uri

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Url = apply {
                    if (validated) {
                        return@apply
                    }

                    uri()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Url].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .uri()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Url]. */
                class Builder internal constructor() {

                    private var uri: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(url: Url) = apply {
                        uri = url.uri
                        additionalProperties = url.additionalProperties.toMutableMap()
                    }

                    fun uri(uri: String) = uri(JsonField.of(uri))

                    /**
                     * Sets [Builder.uri] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.uri] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun uri(uri: JsonField<String>) = apply { this.uri = uri }

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

                    fun build(): Url =
                        Url(checkRequired("uri", uri), additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Url && uri == other.uri && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(uri, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Url{uri=$uri, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is OutputAttachment && content == other.content && mimeType == other.mimeType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(content, mimeType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "OutputAttachment{content=$content, mimeType=$mimeType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Turn && inputMessages == other.inputMessages && outputMessage == other.outputMessage && sessionId == other.sessionId && startedAt == other.startedAt && steps == other.steps && turnId == other.turnId && completedAt == other.completedAt && outputAttachments == other.outputAttachments && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(inputMessages, outputMessage, sessionId, startedAt, steps, turnId, completedAt, outputAttachments, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Turn{inputMessages=$inputMessages, outputMessage=$outputMessage, sessionId=$sessionId, startedAt=$startedAt, steps=$steps, turnId=$turnId, completedAt=$completedAt, outputAttachments=$outputAttachments, additionalProperties=$additionalProperties}"
}
