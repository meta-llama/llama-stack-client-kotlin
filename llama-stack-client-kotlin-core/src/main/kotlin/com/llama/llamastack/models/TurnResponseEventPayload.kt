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

@JsonDeserialize(using = TurnResponseEventPayload.Deserializer::class)
@JsonSerialize(using = TurnResponseEventPayload.Serializer::class)
class TurnResponseEventPayload
private constructor(
    private val agentTurnResponseStepStart: AgentTurnResponseStepStartPayload? = null,
    private val agentTurnResponseStepProgress: AgentTurnResponseStepProgressPayload? = null,
    private val agentTurnResponseStepComplete: AgentTurnResponseStepCompletePayload? = null,
    private val agentTurnResponseTurnStart: AgentTurnResponseTurnStartPayload? = null,
    private val agentTurnResponseTurnComplete: AgentTurnResponseTurnCompletePayload? = null,
    private val agentTurnResponseTurnAwaitingInput: AgentTurnResponseTurnAwaitingInputPayload? =
        null,
    private val _json: JsonValue? = null,
) {

    fun agentTurnResponseStepStart(): AgentTurnResponseStepStartPayload? =
        agentTurnResponseStepStart

    fun agentTurnResponseStepProgress(): AgentTurnResponseStepProgressPayload? =
        agentTurnResponseStepProgress

    fun agentTurnResponseStepComplete(): AgentTurnResponseStepCompletePayload? =
        agentTurnResponseStepComplete

    fun agentTurnResponseTurnStart(): AgentTurnResponseTurnStartPayload? =
        agentTurnResponseTurnStart

    fun agentTurnResponseTurnComplete(): AgentTurnResponseTurnCompletePayload? =
        agentTurnResponseTurnComplete

    fun agentTurnResponseTurnAwaitingInput(): AgentTurnResponseTurnAwaitingInputPayload? =
        agentTurnResponseTurnAwaitingInput

    fun isAgentTurnResponseStepStart(): Boolean = agentTurnResponseStepStart != null

    fun isAgentTurnResponseStepProgress(): Boolean = agentTurnResponseStepProgress != null

    fun isAgentTurnResponseStepComplete(): Boolean = agentTurnResponseStepComplete != null

    fun isAgentTurnResponseTurnStart(): Boolean = agentTurnResponseTurnStart != null

    fun isAgentTurnResponseTurnComplete(): Boolean = agentTurnResponseTurnComplete != null

    fun isAgentTurnResponseTurnAwaitingInput(): Boolean = agentTurnResponseTurnAwaitingInput != null

    fun asAgentTurnResponseStepStart(): AgentTurnResponseStepStartPayload =
        agentTurnResponseStepStart.getOrThrow("agentTurnResponseStepStart")

    fun asAgentTurnResponseStepProgress(): AgentTurnResponseStepProgressPayload =
        agentTurnResponseStepProgress.getOrThrow("agentTurnResponseStepProgress")

    fun asAgentTurnResponseStepComplete(): AgentTurnResponseStepCompletePayload =
        agentTurnResponseStepComplete.getOrThrow("agentTurnResponseStepComplete")

    fun asAgentTurnResponseTurnStart(): AgentTurnResponseTurnStartPayload =
        agentTurnResponseTurnStart.getOrThrow("agentTurnResponseTurnStart")

    fun asAgentTurnResponseTurnComplete(): AgentTurnResponseTurnCompletePayload =
        agentTurnResponseTurnComplete.getOrThrow("agentTurnResponseTurnComplete")

    fun asAgentTurnResponseTurnAwaitingInput(): AgentTurnResponseTurnAwaitingInputPayload =
        agentTurnResponseTurnAwaitingInput.getOrThrow("agentTurnResponseTurnAwaitingInput")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            agentTurnResponseStepStart != null ->
                visitor.visitAgentTurnResponseStepStart(agentTurnResponseStepStart)
            agentTurnResponseStepProgress != null ->
                visitor.visitAgentTurnResponseStepProgress(agentTurnResponseStepProgress)
            agentTurnResponseStepComplete != null ->
                visitor.visitAgentTurnResponseStepComplete(agentTurnResponseStepComplete)
            agentTurnResponseTurnStart != null ->
                visitor.visitAgentTurnResponseTurnStart(agentTurnResponseTurnStart)
            agentTurnResponseTurnComplete != null ->
                visitor.visitAgentTurnResponseTurnComplete(agentTurnResponseTurnComplete)
            agentTurnResponseTurnAwaitingInput != null ->
                visitor.visitAgentTurnResponseTurnAwaitingInput(agentTurnResponseTurnAwaitingInput)
            else -> visitor.unknown(_json)
        }
    }

    private var validated: Boolean = false

    fun validate(): TurnResponseEventPayload = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitAgentTurnResponseStepStart(
                    agentTurnResponseStepStart: AgentTurnResponseStepStartPayload
                ) {
                    agentTurnResponseStepStart.validate()
                }

                override fun visitAgentTurnResponseStepProgress(
                    agentTurnResponseStepProgress: AgentTurnResponseStepProgressPayload
                ) {
                    agentTurnResponseStepProgress.validate()
                }

                override fun visitAgentTurnResponseStepComplete(
                    agentTurnResponseStepComplete: AgentTurnResponseStepCompletePayload
                ) {
                    agentTurnResponseStepComplete.validate()
                }

                override fun visitAgentTurnResponseTurnStart(
                    agentTurnResponseTurnStart: AgentTurnResponseTurnStartPayload
                ) {
                    agentTurnResponseTurnStart.validate()
                }

                override fun visitAgentTurnResponseTurnComplete(
                    agentTurnResponseTurnComplete: AgentTurnResponseTurnCompletePayload
                ) {
                    agentTurnResponseTurnComplete.validate()
                }

                override fun visitAgentTurnResponseTurnAwaitingInput(
                    agentTurnResponseTurnAwaitingInput: AgentTurnResponseTurnAwaitingInputPayload
                ) {
                    agentTurnResponseTurnAwaitingInput.validate()
                }
            }
        )
        validated = true
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TurnResponseEventPayload && agentTurnResponseStepStart == other.agentTurnResponseStepStart && agentTurnResponseStepProgress == other.agentTurnResponseStepProgress && agentTurnResponseStepComplete == other.agentTurnResponseStepComplete && agentTurnResponseTurnStart == other.agentTurnResponseTurnStart && agentTurnResponseTurnComplete == other.agentTurnResponseTurnComplete && agentTurnResponseTurnAwaitingInput == other.agentTurnResponseTurnAwaitingInput /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(agentTurnResponseStepStart, agentTurnResponseStepProgress, agentTurnResponseStepComplete, agentTurnResponseTurnStart, agentTurnResponseTurnComplete, agentTurnResponseTurnAwaitingInput) /* spotless:on */

    override fun toString(): String =
        when {
            agentTurnResponseStepStart != null ->
                "TurnResponseEventPayload{agentTurnResponseStepStart=$agentTurnResponseStepStart}"
            agentTurnResponseStepProgress != null ->
                "TurnResponseEventPayload{agentTurnResponseStepProgress=$agentTurnResponseStepProgress}"
            agentTurnResponseStepComplete != null ->
                "TurnResponseEventPayload{agentTurnResponseStepComplete=$agentTurnResponseStepComplete}"
            agentTurnResponseTurnStart != null ->
                "TurnResponseEventPayload{agentTurnResponseTurnStart=$agentTurnResponseTurnStart}"
            agentTurnResponseTurnComplete != null ->
                "TurnResponseEventPayload{agentTurnResponseTurnComplete=$agentTurnResponseTurnComplete}"
            agentTurnResponseTurnAwaitingInput != null ->
                "TurnResponseEventPayload{agentTurnResponseTurnAwaitingInput=$agentTurnResponseTurnAwaitingInput}"
            _json != null -> "TurnResponseEventPayload{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid TurnResponseEventPayload")
        }

    companion object {

        fun ofAgentTurnResponseStepStart(
            agentTurnResponseStepStart: AgentTurnResponseStepStartPayload
        ) = TurnResponseEventPayload(agentTurnResponseStepStart = agentTurnResponseStepStart)

        fun ofAgentTurnResponseStepProgress(
            agentTurnResponseStepProgress: AgentTurnResponseStepProgressPayload
        ) = TurnResponseEventPayload(agentTurnResponseStepProgress = agentTurnResponseStepProgress)

        fun ofAgentTurnResponseStepComplete(
            agentTurnResponseStepComplete: AgentTurnResponseStepCompletePayload
        ) = TurnResponseEventPayload(agentTurnResponseStepComplete = agentTurnResponseStepComplete)

        fun ofAgentTurnResponseTurnStart(
            agentTurnResponseTurnStart: AgentTurnResponseTurnStartPayload
        ) = TurnResponseEventPayload(agentTurnResponseTurnStart = agentTurnResponseTurnStart)

        fun ofAgentTurnResponseTurnComplete(
            agentTurnResponseTurnComplete: AgentTurnResponseTurnCompletePayload
        ) = TurnResponseEventPayload(agentTurnResponseTurnComplete = agentTurnResponseTurnComplete)

        fun ofAgentTurnResponseTurnAwaitingInput(
            agentTurnResponseTurnAwaitingInput: AgentTurnResponseTurnAwaitingInputPayload
        ) =
            TurnResponseEventPayload(
                agentTurnResponseTurnAwaitingInput = agentTurnResponseTurnAwaitingInput
            )
    }

    /**
     * An interface that defines how to map each variant of [TurnResponseEventPayload] to a value of
     * type [T].
     */
    interface Visitor<out T> {

        fun visitAgentTurnResponseStepStart(
            agentTurnResponseStepStart: AgentTurnResponseStepStartPayload
        ): T

        fun visitAgentTurnResponseStepProgress(
            agentTurnResponseStepProgress: AgentTurnResponseStepProgressPayload
        ): T

        fun visitAgentTurnResponseStepComplete(
            agentTurnResponseStepComplete: AgentTurnResponseStepCompletePayload
        ): T

        fun visitAgentTurnResponseTurnStart(
            agentTurnResponseTurnStart: AgentTurnResponseTurnStartPayload
        ): T

        fun visitAgentTurnResponseTurnComplete(
            agentTurnResponseTurnComplete: AgentTurnResponseTurnCompletePayload
        ): T

        fun visitAgentTurnResponseTurnAwaitingInput(
            agentTurnResponseTurnAwaitingInput: AgentTurnResponseTurnAwaitingInputPayload
        ): T

        /**
         * Maps an unknown variant of [TurnResponseEventPayload] to a value of type [T].
         *
         * An instance of [TurnResponseEventPayload] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws LlamaStackClientInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LlamaStackClientInvalidDataException("Unknown TurnResponseEventPayload: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<TurnResponseEventPayload>(TurnResponseEventPayload::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): TurnResponseEventPayload {
            val json = JsonValue.fromJsonNode(node)
            val eventType = json.asObject()?.get("event_type")?.asString()

            when (eventType) {
                "step_start" -> {
                    tryDeserialize(node, jacksonTypeRef<AgentTurnResponseStepStartPayload>()) {
                            it.validate()
                        }
                        ?.let {
                            return TurnResponseEventPayload(
                                agentTurnResponseStepStart = it,
                                _json = json,
                            )
                        }
                }
                "step_progress" -> {
                    tryDeserialize(node, jacksonTypeRef<AgentTurnResponseStepProgressPayload>()) {
                            it.validate()
                        }
                        ?.let {
                            return TurnResponseEventPayload(
                                agentTurnResponseStepProgress = it,
                                _json = json,
                            )
                        }
                }
                "step_complete" -> {
                    tryDeserialize(node, jacksonTypeRef<AgentTurnResponseStepCompletePayload>()) {
                            it.validate()
                        }
                        ?.let {
                            return TurnResponseEventPayload(
                                agentTurnResponseStepComplete = it,
                                _json = json,
                            )
                        }
                }
                "turn_start" -> {
                    tryDeserialize(node, jacksonTypeRef<AgentTurnResponseTurnStartPayload>()) {
                            it.validate()
                        }
                        ?.let {
                            return TurnResponseEventPayload(
                                agentTurnResponseTurnStart = it,
                                _json = json,
                            )
                        }
                }
                "turn_complete" -> {
                    tryDeserialize(node, jacksonTypeRef<AgentTurnResponseTurnCompletePayload>()) {
                            it.validate()
                        }
                        ?.let {
                            return TurnResponseEventPayload(
                                agentTurnResponseTurnComplete = it,
                                _json = json,
                            )
                        }
                }
                "turn_awaiting_input" -> {
                    tryDeserialize(
                            node,
                            jacksonTypeRef<AgentTurnResponseTurnAwaitingInputPayload>(),
                        ) {
                            it.validate()
                        }
                        ?.let {
                            return TurnResponseEventPayload(
                                agentTurnResponseTurnAwaitingInput = it,
                                _json = json,
                            )
                        }
                }
            }

            return TurnResponseEventPayload(_json = json)
        }
    }

    internal class Serializer :
        BaseSerializer<TurnResponseEventPayload>(TurnResponseEventPayload::class) {

        override fun serialize(
            value: TurnResponseEventPayload,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.agentTurnResponseStepStart != null ->
                    generator.writeObject(value.agentTurnResponseStepStart)
                value.agentTurnResponseStepProgress != null ->
                    generator.writeObject(value.agentTurnResponseStepProgress)
                value.agentTurnResponseStepComplete != null ->
                    generator.writeObject(value.agentTurnResponseStepComplete)
                value.agentTurnResponseTurnStart != null ->
                    generator.writeObject(value.agentTurnResponseTurnStart)
                value.agentTurnResponseTurnComplete != null ->
                    generator.writeObject(value.agentTurnResponseTurnComplete)
                value.agentTurnResponseTurnAwaitingInput != null ->
                    generator.writeObject(value.agentTurnResponseTurnAwaitingInput)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid TurnResponseEventPayload")
            }
        }
    }

    @NoAutoDetect
    class AgentTurnResponseStepStartPayload
    @JsonCreator
    private constructor(
        @JsonProperty("event_type")
        @ExcludeMissing
        private val eventType: JsonValue = JsonMissing.of(),
        @JsonProperty("step_id")
        @ExcludeMissing
        private val stepId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("step_type")
        @ExcludeMissing
        private val stepType: JsonField<StepType> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("step_start")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("event_type") @ExcludeMissing fun _eventType(): JsonValue = eventType

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun stepId(): String = stepId.getRequired("step_id")

        /**
         * Type of the step in an agent turn.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun stepType(): StepType = stepType.getRequired("step_type")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /**
         * Returns the raw JSON value of [stepId].
         *
         * Unlike [stepId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("step_id") @ExcludeMissing fun _stepId(): JsonField<String> = stepId

        /**
         * Returns the raw JSON value of [stepType].
         *
         * Unlike [stepType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("step_type") @ExcludeMissing fun _stepType(): JsonField<StepType> = stepType

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AgentTurnResponseStepStartPayload = apply {
            if (validated) {
                return@apply
            }

            _eventType().let {
                if (it != JsonValue.from("step_start")) {
                    throw LlamaStackClientInvalidDataException(
                        "'eventType' is invalid, received $it"
                    )
                }
            }
            stepId()
            stepType()
            metadata()?.validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [AgentTurnResponseStepStartPayload].
             *
             * The following fields are required:
             * ```kotlin
             * .stepId()
             * .stepType()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [AgentTurnResponseStepStartPayload]. */
        class Builder internal constructor() {

            private var eventType: JsonValue = JsonValue.from("step_start")
            private var stepId: JsonField<String>? = null
            private var stepType: JsonField<StepType>? = null
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                agentTurnResponseStepStartPayload: AgentTurnResponseStepStartPayload
            ) = apply {
                eventType = agentTurnResponseStepStartPayload.eventType
                stepId = agentTurnResponseStepStartPayload.stepId
                stepType = agentTurnResponseStepStartPayload.stepType
                metadata = agentTurnResponseStepStartPayload.metadata
                additionalProperties =
                    agentTurnResponseStepStartPayload.additionalProperties.toMutableMap()
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("step_start")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun eventType(eventType: JsonValue) = apply { this.eventType = eventType }

            fun stepId(stepId: String) = stepId(JsonField.of(stepId))

            /**
             * Sets [Builder.stepId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stepId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stepId(stepId: JsonField<String>) = apply { this.stepId = stepId }

            /** Type of the step in an agent turn. */
            fun stepType(stepType: StepType) = stepType(JsonField.of(stepType))

            /**
             * Sets [Builder.stepType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stepType] with a well-typed [StepType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stepType(stepType: JsonField<StepType>) = apply { this.stepType = stepType }

            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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

            fun build(): AgentTurnResponseStepStartPayload =
                AgentTurnResponseStepStartPayload(
                    eventType,
                    checkRequired("stepId", stepId),
                    checkRequired("stepType", stepType),
                    metadata,
                    additionalProperties.toImmutable(),
                )
        }

        /** Type of the step in an agent turn. */
        class StepType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val INFERENCE = of("inference")

                val TOOL_EXECUTION = of("tool_execution")

                val SHIELD_CALL = of("shield_call")

                val MEMORY_RETRIEVAL = of("memory_retrieval")

                fun of(value: String) = StepType(JsonField.of(value))
            }

            /** An enum containing [StepType]'s known values. */
            enum class Known {
                INFERENCE,
                TOOL_EXECUTION,
                SHIELD_CALL,
                MEMORY_RETRIEVAL,
            }

            /**
             * An enum containing [StepType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [StepType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                INFERENCE,
                TOOL_EXECUTION,
                SHIELD_CALL,
                MEMORY_RETRIEVAL,
                /**
                 * An enum member indicating that [StepType] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    INFERENCE -> Value.INFERENCE
                    TOOL_EXECUTION -> Value.TOOL_EXECUTION
                    SHIELD_CALL -> Value.SHIELD_CALL
                    MEMORY_RETRIEVAL -> Value.MEMORY_RETRIEVAL
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LlamaStackClientInvalidDataException if this class instance's value is a not
             *   a known member.
             */
            fun known(): Known =
                when (this) {
                    INFERENCE -> Known.INFERENCE
                    TOOL_EXECUTION -> Known.TOOL_EXECUTION
                    SHIELD_CALL -> Known.SHIELD_CALL
                    MEMORY_RETRIEVAL -> Known.MEMORY_RETRIEVAL
                    else -> throw LlamaStackClientInvalidDataException("Unknown StepType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LlamaStackClientInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString()
                    ?: throw LlamaStackClientInvalidDataException("Value is not a String")

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is StepType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class Metadata
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Metadata = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Metadata]. */
                fun builder() = Builder()
            }

            /** A builder for [Metadata]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(metadata: Metadata) = apply {
                    additionalProperties = metadata.additionalProperties.toMutableMap()
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

                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AgentTurnResponseStepStartPayload && eventType == other.eventType && stepId == other.stepId && stepType == other.stepType && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(eventType, stepId, stepType, metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AgentTurnResponseStepStartPayload{eventType=$eventType, stepId=$stepId, stepType=$stepType, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class AgentTurnResponseStepProgressPayload
    @JsonCreator
    private constructor(
        @JsonProperty("delta")
        @ExcludeMissing
        private val delta: JsonField<ContentDelta> = JsonMissing.of(),
        @JsonProperty("event_type")
        @ExcludeMissing
        private val eventType: JsonValue = JsonMissing.of(),
        @JsonProperty("step_id")
        @ExcludeMissing
        private val stepId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("step_type")
        @ExcludeMissing
        private val stepType: JsonField<StepType> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun delta(): ContentDelta = delta.getRequired("delta")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("step_progress")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("event_type") @ExcludeMissing fun _eventType(): JsonValue = eventType

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun stepId(): String = stepId.getRequired("step_id")

        /**
         * Type of the step in an agent turn.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun stepType(): StepType = stepType.getRequired("step_type")

        /**
         * Returns the raw JSON value of [delta].
         *
         * Unlike [delta], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("delta") @ExcludeMissing fun _delta(): JsonField<ContentDelta> = delta

        /**
         * Returns the raw JSON value of [stepId].
         *
         * Unlike [stepId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("step_id") @ExcludeMissing fun _stepId(): JsonField<String> = stepId

        /**
         * Returns the raw JSON value of [stepType].
         *
         * Unlike [stepType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("step_type") @ExcludeMissing fun _stepType(): JsonField<StepType> = stepType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AgentTurnResponseStepProgressPayload = apply {
            if (validated) {
                return@apply
            }

            delta().validate()
            _eventType().let {
                if (it != JsonValue.from("step_progress")) {
                    throw LlamaStackClientInvalidDataException(
                        "'eventType' is invalid, received $it"
                    )
                }
            }
            stepId()
            stepType()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [AgentTurnResponseStepProgressPayload].
             *
             * The following fields are required:
             * ```kotlin
             * .delta()
             * .stepId()
             * .stepType()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [AgentTurnResponseStepProgressPayload]. */
        class Builder internal constructor() {

            private var delta: JsonField<ContentDelta>? = null
            private var eventType: JsonValue = JsonValue.from("step_progress")
            private var stepId: JsonField<String>? = null
            private var stepType: JsonField<StepType>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                agentTurnResponseStepProgressPayload: AgentTurnResponseStepProgressPayload
            ) = apply {
                delta = agentTurnResponseStepProgressPayload.delta
                eventType = agentTurnResponseStepProgressPayload.eventType
                stepId = agentTurnResponseStepProgressPayload.stepId
                stepType = agentTurnResponseStepProgressPayload.stepType
                additionalProperties =
                    agentTurnResponseStepProgressPayload.additionalProperties.toMutableMap()
            }

            fun delta(delta: ContentDelta) = delta(JsonField.of(delta))

            /**
             * Sets [Builder.delta] to an arbitrary JSON value.
             *
             * You should usually call [Builder.delta] with a well-typed [ContentDelta] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun delta(delta: JsonField<ContentDelta>) = apply { this.delta = delta }

            /** Alias for calling [delta] with `ContentDelta.ofText(text)`. */
            fun delta(text: ContentDelta.TextDelta) = delta(ContentDelta.ofText(text))

            /**
             * Alias for calling [delta] with the following:
             * ```kotlin
             * ContentDelta.TextDelta.builder()
             *     .text(text)
             *     .build()
             * ```
             */
            fun textDelta(text: String) = delta(ContentDelta.TextDelta.builder().text(text).build())

            /** Alias for calling [delta] with `ContentDelta.ofImage(image)`. */
            fun delta(image: ContentDelta.ImageDelta) = delta(ContentDelta.ofImage(image))

            /**
             * Alias for calling [delta] with the following:
             * ```kotlin
             * ContentDelta.ImageDelta.builder()
             *     .image(image)
             *     .build()
             * ```
             */
            fun imageDelta(image: String) =
                delta(ContentDelta.ImageDelta.builder().image(image).build())

            /** Alias for calling [delta] with `ContentDelta.ofToolCall(toolCall)`. */
            fun delta(toolCall: ContentDelta.ToolCallDelta) =
                delta(ContentDelta.ofToolCall(toolCall))

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("step_progress")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun eventType(eventType: JsonValue) = apply { this.eventType = eventType }

            fun stepId(stepId: String) = stepId(JsonField.of(stepId))

            /**
             * Sets [Builder.stepId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stepId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stepId(stepId: JsonField<String>) = apply { this.stepId = stepId }

            /** Type of the step in an agent turn. */
            fun stepType(stepType: StepType) = stepType(JsonField.of(stepType))

            /**
             * Sets [Builder.stepType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stepType] with a well-typed [StepType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stepType(stepType: JsonField<StepType>) = apply { this.stepType = stepType }

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

            fun build(): AgentTurnResponseStepProgressPayload =
                AgentTurnResponseStepProgressPayload(
                    checkRequired("delta", delta),
                    eventType,
                    checkRequired("stepId", stepId),
                    checkRequired("stepType", stepType),
                    additionalProperties.toImmutable(),
                )
        }

        /** Type of the step in an agent turn. */
        class StepType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val INFERENCE = of("inference")

                val TOOL_EXECUTION = of("tool_execution")

                val SHIELD_CALL = of("shield_call")

                val MEMORY_RETRIEVAL = of("memory_retrieval")

                fun of(value: String) = StepType(JsonField.of(value))
            }

            /** An enum containing [StepType]'s known values. */
            enum class Known {
                INFERENCE,
                TOOL_EXECUTION,
                SHIELD_CALL,
                MEMORY_RETRIEVAL,
            }

            /**
             * An enum containing [StepType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [StepType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                INFERENCE,
                TOOL_EXECUTION,
                SHIELD_CALL,
                MEMORY_RETRIEVAL,
                /**
                 * An enum member indicating that [StepType] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    INFERENCE -> Value.INFERENCE
                    TOOL_EXECUTION -> Value.TOOL_EXECUTION
                    SHIELD_CALL -> Value.SHIELD_CALL
                    MEMORY_RETRIEVAL -> Value.MEMORY_RETRIEVAL
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LlamaStackClientInvalidDataException if this class instance's value is a not
             *   a known member.
             */
            fun known(): Known =
                when (this) {
                    INFERENCE -> Known.INFERENCE
                    TOOL_EXECUTION -> Known.TOOL_EXECUTION
                    SHIELD_CALL -> Known.SHIELD_CALL
                    MEMORY_RETRIEVAL -> Known.MEMORY_RETRIEVAL
                    else -> throw LlamaStackClientInvalidDataException("Unknown StepType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LlamaStackClientInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString()
                    ?: throw LlamaStackClientInvalidDataException("Value is not a String")

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is StepType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AgentTurnResponseStepProgressPayload && delta == other.delta && eventType == other.eventType && stepId == other.stepId && stepType == other.stepType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(delta, eventType, stepId, stepType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AgentTurnResponseStepProgressPayload{delta=$delta, eventType=$eventType, stepId=$stepId, stepType=$stepType, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class AgentTurnResponseStepCompletePayload
    @JsonCreator
    private constructor(
        @JsonProperty("event_type")
        @ExcludeMissing
        private val eventType: JsonValue = JsonMissing.of(),
        @JsonProperty("step_details")
        @ExcludeMissing
        private val stepDetails: JsonField<StepDetails> = JsonMissing.of(),
        @JsonProperty("step_id")
        @ExcludeMissing
        private val stepId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("step_type")
        @ExcludeMissing
        private val stepType: JsonField<StepType> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("step_complete")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("event_type") @ExcludeMissing fun _eventType(): JsonValue = eventType

        /**
         * An inference step in an agent turn.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun stepDetails(): StepDetails = stepDetails.getRequired("step_details")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun stepId(): String = stepId.getRequired("step_id")

        /**
         * Type of the step in an agent turn.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun stepType(): StepType = stepType.getRequired("step_type")

        /**
         * Returns the raw JSON value of [stepDetails].
         *
         * Unlike [stepDetails], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("step_details")
        @ExcludeMissing
        fun _stepDetails(): JsonField<StepDetails> = stepDetails

        /**
         * Returns the raw JSON value of [stepId].
         *
         * Unlike [stepId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("step_id") @ExcludeMissing fun _stepId(): JsonField<String> = stepId

        /**
         * Returns the raw JSON value of [stepType].
         *
         * Unlike [stepType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("step_type") @ExcludeMissing fun _stepType(): JsonField<StepType> = stepType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AgentTurnResponseStepCompletePayload = apply {
            if (validated) {
                return@apply
            }

            _eventType().let {
                if (it != JsonValue.from("step_complete")) {
                    throw LlamaStackClientInvalidDataException(
                        "'eventType' is invalid, received $it"
                    )
                }
            }
            stepDetails().validate()
            stepId()
            stepType()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [AgentTurnResponseStepCompletePayload].
             *
             * The following fields are required:
             * ```kotlin
             * .stepDetails()
             * .stepId()
             * .stepType()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [AgentTurnResponseStepCompletePayload]. */
        class Builder internal constructor() {

            private var eventType: JsonValue = JsonValue.from("step_complete")
            private var stepDetails: JsonField<StepDetails>? = null
            private var stepId: JsonField<String>? = null
            private var stepType: JsonField<StepType>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                agentTurnResponseStepCompletePayload: AgentTurnResponseStepCompletePayload
            ) = apply {
                eventType = agentTurnResponseStepCompletePayload.eventType
                stepDetails = agentTurnResponseStepCompletePayload.stepDetails
                stepId = agentTurnResponseStepCompletePayload.stepId
                stepType = agentTurnResponseStepCompletePayload.stepType
                additionalProperties =
                    agentTurnResponseStepCompletePayload.additionalProperties.toMutableMap()
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("step_complete")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun eventType(eventType: JsonValue) = apply { this.eventType = eventType }

            /** An inference step in an agent turn. */
            fun stepDetails(stepDetails: StepDetails) = stepDetails(JsonField.of(stepDetails))

            /**
             * Sets [Builder.stepDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stepDetails] with a well-typed [StepDetails] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stepDetails(stepDetails: JsonField<StepDetails>) = apply {
                this.stepDetails = stepDetails
            }

            /**
             * Alias for calling [stepDetails] with `StepDetails.ofInferenceStep(inferenceStep)`.
             */
            fun stepDetails(inferenceStep: InferenceStep) =
                stepDetails(StepDetails.ofInferenceStep(inferenceStep))

            /**
             * Alias for calling [stepDetails] with
             * `StepDetails.ofToolExecutionStep(toolExecutionStep)`.
             */
            fun stepDetails(toolExecutionStep: ToolExecutionStep) =
                stepDetails(StepDetails.ofToolExecutionStep(toolExecutionStep))

            /**
             * Alias for calling [stepDetails] with `StepDetails.ofShieldCallStep(shieldCallStep)`.
             */
            fun stepDetails(shieldCallStep: ShieldCallStep) =
                stepDetails(StepDetails.ofShieldCallStep(shieldCallStep))

            /**
             * Alias for calling [stepDetails] with
             * `StepDetails.ofMemoryRetrievalStep(memoryRetrievalStep)`.
             */
            fun stepDetails(memoryRetrievalStep: MemoryRetrievalStep) =
                stepDetails(StepDetails.ofMemoryRetrievalStep(memoryRetrievalStep))

            fun stepId(stepId: String) = stepId(JsonField.of(stepId))

            /**
             * Sets [Builder.stepId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stepId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stepId(stepId: JsonField<String>) = apply { this.stepId = stepId }

            /** Type of the step in an agent turn. */
            fun stepType(stepType: StepType) = stepType(JsonField.of(stepType))

            /**
             * Sets [Builder.stepType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stepType] with a well-typed [StepType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stepType(stepType: JsonField<StepType>) = apply { this.stepType = stepType }

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

            fun build(): AgentTurnResponseStepCompletePayload =
                AgentTurnResponseStepCompletePayload(
                    eventType,
                    checkRequired("stepDetails", stepDetails),
                    checkRequired("stepId", stepId),
                    checkRequired("stepType", stepType),
                    additionalProperties.toImmutable(),
                )
        }

        /** An inference step in an agent turn. */
        @JsonDeserialize(using = StepDetails.Deserializer::class)
        @JsonSerialize(using = StepDetails.Serializer::class)
        class StepDetails
        private constructor(
            private val inferenceStep: InferenceStep? = null,
            private val toolExecutionStep: ToolExecutionStep? = null,
            private val shieldCallStep: ShieldCallStep? = null,
            private val memoryRetrievalStep: MemoryRetrievalStep? = null,
            private val _json: JsonValue? = null,
        ) {

            /** An inference step in an agent turn. */
            fun inferenceStep(): InferenceStep? = inferenceStep

            /** A tool execution step in an agent turn. */
            fun toolExecutionStep(): ToolExecutionStep? = toolExecutionStep

            /** A shield call step in an agent turn. */
            fun shieldCallStep(): ShieldCallStep? = shieldCallStep

            /** A memory retrieval step in an agent turn. */
            fun memoryRetrievalStep(): MemoryRetrievalStep? = memoryRetrievalStep

            fun isInferenceStep(): Boolean = inferenceStep != null

            fun isToolExecutionStep(): Boolean = toolExecutionStep != null

            fun isShieldCallStep(): Boolean = shieldCallStep != null

            fun isMemoryRetrievalStep(): Boolean = memoryRetrievalStep != null

            /** An inference step in an agent turn. */
            fun asInferenceStep(): InferenceStep = inferenceStep.getOrThrow("inferenceStep")

            /** A tool execution step in an agent turn. */
            fun asToolExecutionStep(): ToolExecutionStep =
                toolExecutionStep.getOrThrow("toolExecutionStep")

            /** A shield call step in an agent turn. */
            fun asShieldCallStep(): ShieldCallStep = shieldCallStep.getOrThrow("shieldCallStep")

            /** A memory retrieval step in an agent turn. */
            fun asMemoryRetrievalStep(): MemoryRetrievalStep =
                memoryRetrievalStep.getOrThrow("memoryRetrievalStep")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    inferenceStep != null -> visitor.visitInferenceStep(inferenceStep)
                    toolExecutionStep != null -> visitor.visitToolExecutionStep(toolExecutionStep)
                    shieldCallStep != null -> visitor.visitShieldCallStep(shieldCallStep)
                    memoryRetrievalStep != null ->
                        visitor.visitMemoryRetrievalStep(memoryRetrievalStep)
                    else -> visitor.unknown(_json)
                }
            }

            private var validated: Boolean = false

            fun validate(): StepDetails = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitInferenceStep(inferenceStep: InferenceStep) {
                            inferenceStep.validate()
                        }

                        override fun visitToolExecutionStep(toolExecutionStep: ToolExecutionStep) {
                            toolExecutionStep.validate()
                        }

                        override fun visitShieldCallStep(shieldCallStep: ShieldCallStep) {
                            shieldCallStep.validate()
                        }

                        override fun visitMemoryRetrievalStep(
                            memoryRetrievalStep: MemoryRetrievalStep
                        ) {
                            memoryRetrievalStep.validate()
                        }
                    }
                )
                validated = true
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is StepDetails && inferenceStep == other.inferenceStep && toolExecutionStep == other.toolExecutionStep && shieldCallStep == other.shieldCallStep && memoryRetrievalStep == other.memoryRetrievalStep /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(inferenceStep, toolExecutionStep, shieldCallStep, memoryRetrievalStep) /* spotless:on */

            override fun toString(): String =
                when {
                    inferenceStep != null -> "StepDetails{inferenceStep=$inferenceStep}"
                    toolExecutionStep != null -> "StepDetails{toolExecutionStep=$toolExecutionStep}"
                    shieldCallStep != null -> "StepDetails{shieldCallStep=$shieldCallStep}"
                    memoryRetrievalStep != null ->
                        "StepDetails{memoryRetrievalStep=$memoryRetrievalStep}"
                    _json != null -> "StepDetails{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid StepDetails")
                }

            companion object {

                /** An inference step in an agent turn. */
                fun ofInferenceStep(inferenceStep: InferenceStep) =
                    StepDetails(inferenceStep = inferenceStep)

                /** A tool execution step in an agent turn. */
                fun ofToolExecutionStep(toolExecutionStep: ToolExecutionStep) =
                    StepDetails(toolExecutionStep = toolExecutionStep)

                /** A shield call step in an agent turn. */
                fun ofShieldCallStep(shieldCallStep: ShieldCallStep) =
                    StepDetails(shieldCallStep = shieldCallStep)

                /** A memory retrieval step in an agent turn. */
                fun ofMemoryRetrievalStep(memoryRetrievalStep: MemoryRetrievalStep) =
                    StepDetails(memoryRetrievalStep = memoryRetrievalStep)
            }

            /**
             * An interface that defines how to map each variant of [StepDetails] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                /** An inference step in an agent turn. */
                fun visitInferenceStep(inferenceStep: InferenceStep): T

                /** A tool execution step in an agent turn. */
                fun visitToolExecutionStep(toolExecutionStep: ToolExecutionStep): T

                /** A shield call step in an agent turn. */
                fun visitShieldCallStep(shieldCallStep: ShieldCallStep): T

                /** A memory retrieval step in an agent turn. */
                fun visitMemoryRetrievalStep(memoryRetrievalStep: MemoryRetrievalStep): T

                /**
                 * Maps an unknown variant of [StepDetails] to a value of type [T].
                 *
                 * An instance of [StepDetails] can contain an unknown variant if it was
                 * deserialized from data that doesn't match any known variant. For example, if the
                 * SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws LlamaStackClientInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw LlamaStackClientInvalidDataException("Unknown StepDetails: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<StepDetails>(StepDetails::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): StepDetails {
                    val json = JsonValue.fromJsonNode(node)
                    val stepType = json.asObject()?.get("step_type")?.asString()

                    when (stepType) {
                        "inference" -> {
                            tryDeserialize(node, jacksonTypeRef<InferenceStep>()) { it.validate() }
                                ?.let {
                                    return StepDetails(inferenceStep = it, _json = json)
                                }
                        }
                        "tool_execution" -> {
                            tryDeserialize(node, jacksonTypeRef<ToolExecutionStep>()) {
                                    it.validate()
                                }
                                ?.let {
                                    return StepDetails(toolExecutionStep = it, _json = json)
                                }
                        }
                        "shield_call" -> {
                            tryDeserialize(node, jacksonTypeRef<ShieldCallStep>()) { it.validate() }
                                ?.let {
                                    return StepDetails(shieldCallStep = it, _json = json)
                                }
                        }
                        "memory_retrieval" -> {
                            tryDeserialize(node, jacksonTypeRef<MemoryRetrievalStep>()) {
                                    it.validate()
                                }
                                ?.let {
                                    return StepDetails(memoryRetrievalStep = it, _json = json)
                                }
                        }
                    }

                    return StepDetails(_json = json)
                }
            }

            internal class Serializer : BaseSerializer<StepDetails>(StepDetails::class) {

                override fun serialize(
                    value: StepDetails,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.inferenceStep != null -> generator.writeObject(value.inferenceStep)
                        value.toolExecutionStep != null ->
                            generator.writeObject(value.toolExecutionStep)
                        value.shieldCallStep != null -> generator.writeObject(value.shieldCallStep)
                        value.memoryRetrievalStep != null ->
                            generator.writeObject(value.memoryRetrievalStep)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid StepDetails")
                    }
                }
            }
        }

        /** Type of the step in an agent turn. */
        class StepType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val INFERENCE = of("inference")

                val TOOL_EXECUTION = of("tool_execution")

                val SHIELD_CALL = of("shield_call")

                val MEMORY_RETRIEVAL = of("memory_retrieval")

                fun of(value: String) = StepType(JsonField.of(value))
            }

            /** An enum containing [StepType]'s known values. */
            enum class Known {
                INFERENCE,
                TOOL_EXECUTION,
                SHIELD_CALL,
                MEMORY_RETRIEVAL,
            }

            /**
             * An enum containing [StepType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [StepType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                INFERENCE,
                TOOL_EXECUTION,
                SHIELD_CALL,
                MEMORY_RETRIEVAL,
                /**
                 * An enum member indicating that [StepType] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    INFERENCE -> Value.INFERENCE
                    TOOL_EXECUTION -> Value.TOOL_EXECUTION
                    SHIELD_CALL -> Value.SHIELD_CALL
                    MEMORY_RETRIEVAL -> Value.MEMORY_RETRIEVAL
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LlamaStackClientInvalidDataException if this class instance's value is a not
             *   a known member.
             */
            fun known(): Known =
                when (this) {
                    INFERENCE -> Known.INFERENCE
                    TOOL_EXECUTION -> Known.TOOL_EXECUTION
                    SHIELD_CALL -> Known.SHIELD_CALL
                    MEMORY_RETRIEVAL -> Known.MEMORY_RETRIEVAL
                    else -> throw LlamaStackClientInvalidDataException("Unknown StepType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LlamaStackClientInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString()
                    ?: throw LlamaStackClientInvalidDataException("Value is not a String")

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is StepType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AgentTurnResponseStepCompletePayload && eventType == other.eventType && stepDetails == other.stepDetails && stepId == other.stepId && stepType == other.stepType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(eventType, stepDetails, stepId, stepType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AgentTurnResponseStepCompletePayload{eventType=$eventType, stepDetails=$stepDetails, stepId=$stepId, stepType=$stepType, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class AgentTurnResponseTurnStartPayload
    @JsonCreator
    private constructor(
        @JsonProperty("event_type")
        @ExcludeMissing
        private val eventType: JsonValue = JsonMissing.of(),
        @JsonProperty("turn_id")
        @ExcludeMissing
        private val turnId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("turn_start")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("event_type") @ExcludeMissing fun _eventType(): JsonValue = eventType

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun turnId(): String = turnId.getRequired("turn_id")

        /**
         * Returns the raw JSON value of [turnId].
         *
         * Unlike [turnId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("turn_id") @ExcludeMissing fun _turnId(): JsonField<String> = turnId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AgentTurnResponseTurnStartPayload = apply {
            if (validated) {
                return@apply
            }

            _eventType().let {
                if (it != JsonValue.from("turn_start")) {
                    throw LlamaStackClientInvalidDataException(
                        "'eventType' is invalid, received $it"
                    )
                }
            }
            turnId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [AgentTurnResponseTurnStartPayload].
             *
             * The following fields are required:
             * ```kotlin
             * .turnId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [AgentTurnResponseTurnStartPayload]. */
        class Builder internal constructor() {

            private var eventType: JsonValue = JsonValue.from("turn_start")
            private var turnId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                agentTurnResponseTurnStartPayload: AgentTurnResponseTurnStartPayload
            ) = apply {
                eventType = agentTurnResponseTurnStartPayload.eventType
                turnId = agentTurnResponseTurnStartPayload.turnId
                additionalProperties =
                    agentTurnResponseTurnStartPayload.additionalProperties.toMutableMap()
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("turn_start")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun eventType(eventType: JsonValue) = apply { this.eventType = eventType }

            fun turnId(turnId: String) = turnId(JsonField.of(turnId))

            /**
             * Sets [Builder.turnId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.turnId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun turnId(turnId: JsonField<String>) = apply { this.turnId = turnId }

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

            fun build(): AgentTurnResponseTurnStartPayload =
                AgentTurnResponseTurnStartPayload(
                    eventType,
                    checkRequired("turnId", turnId),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AgentTurnResponseTurnStartPayload && eventType == other.eventType && turnId == other.turnId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(eventType, turnId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AgentTurnResponseTurnStartPayload{eventType=$eventType, turnId=$turnId, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class AgentTurnResponseTurnCompletePayload
    @JsonCreator
    private constructor(
        @JsonProperty("event_type")
        @ExcludeMissing
        private val eventType: JsonValue = JsonMissing.of(),
        @JsonProperty("turn") @ExcludeMissing private val turn: JsonField<Turn> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("turn_complete")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("event_type") @ExcludeMissing fun _eventType(): JsonValue = eventType

        /**
         * A single turn in an interaction with an Agentic System.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun turn(): Turn = turn.getRequired("turn")

        /**
         * Returns the raw JSON value of [turn].
         *
         * Unlike [turn], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("turn") @ExcludeMissing fun _turn(): JsonField<Turn> = turn

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AgentTurnResponseTurnCompletePayload = apply {
            if (validated) {
                return@apply
            }

            _eventType().let {
                if (it != JsonValue.from("turn_complete")) {
                    throw LlamaStackClientInvalidDataException(
                        "'eventType' is invalid, received $it"
                    )
                }
            }
            turn().validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [AgentTurnResponseTurnCompletePayload].
             *
             * The following fields are required:
             * ```kotlin
             * .turn()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [AgentTurnResponseTurnCompletePayload]. */
        class Builder internal constructor() {

            private var eventType: JsonValue = JsonValue.from("turn_complete")
            private var turn: JsonField<Turn>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                agentTurnResponseTurnCompletePayload: AgentTurnResponseTurnCompletePayload
            ) = apply {
                eventType = agentTurnResponseTurnCompletePayload.eventType
                turn = agentTurnResponseTurnCompletePayload.turn
                additionalProperties =
                    agentTurnResponseTurnCompletePayload.additionalProperties.toMutableMap()
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("turn_complete")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun eventType(eventType: JsonValue) = apply { this.eventType = eventType }

            /** A single turn in an interaction with an Agentic System. */
            fun turn(turn: Turn) = turn(JsonField.of(turn))

            /**
             * Sets [Builder.turn] to an arbitrary JSON value.
             *
             * You should usually call [Builder.turn] with a well-typed [Turn] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun turn(turn: JsonField<Turn>) = apply { this.turn = turn }

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

            fun build(): AgentTurnResponseTurnCompletePayload =
                AgentTurnResponseTurnCompletePayload(
                    eventType,
                    checkRequired("turn", turn),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AgentTurnResponseTurnCompletePayload && eventType == other.eventType && turn == other.turn && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(eventType, turn, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AgentTurnResponseTurnCompletePayload{eventType=$eventType, turn=$turn, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class AgentTurnResponseTurnAwaitingInputPayload
    @JsonCreator
    private constructor(
        @JsonProperty("event_type")
        @ExcludeMissing
        private val eventType: JsonValue = JsonMissing.of(),
        @JsonProperty("turn") @ExcludeMissing private val turn: JsonField<Turn> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("turn_awaiting_input")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("event_type") @ExcludeMissing fun _eventType(): JsonValue = eventType

        /**
         * A single turn in an interaction with an Agentic System.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun turn(): Turn = turn.getRequired("turn")

        /**
         * Returns the raw JSON value of [turn].
         *
         * Unlike [turn], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("turn") @ExcludeMissing fun _turn(): JsonField<Turn> = turn

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AgentTurnResponseTurnAwaitingInputPayload = apply {
            if (validated) {
                return@apply
            }

            _eventType().let {
                if (it != JsonValue.from("turn_awaiting_input")) {
                    throw LlamaStackClientInvalidDataException(
                        "'eventType' is invalid, received $it"
                    )
                }
            }
            turn().validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [AgentTurnResponseTurnAwaitingInputPayload].
             *
             * The following fields are required:
             * ```kotlin
             * .turn()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [AgentTurnResponseTurnAwaitingInputPayload]. */
        class Builder internal constructor() {

            private var eventType: JsonValue = JsonValue.from("turn_awaiting_input")
            private var turn: JsonField<Turn>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                agentTurnResponseTurnAwaitingInputPayload: AgentTurnResponseTurnAwaitingInputPayload
            ) = apply {
                eventType = agentTurnResponseTurnAwaitingInputPayload.eventType
                turn = agentTurnResponseTurnAwaitingInputPayload.turn
                additionalProperties =
                    agentTurnResponseTurnAwaitingInputPayload.additionalProperties.toMutableMap()
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("turn_awaiting_input")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun eventType(eventType: JsonValue) = apply { this.eventType = eventType }

            /** A single turn in an interaction with an Agentic System. */
            fun turn(turn: Turn) = turn(JsonField.of(turn))

            /**
             * Sets [Builder.turn] to an arbitrary JSON value.
             *
             * You should usually call [Builder.turn] with a well-typed [Turn] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun turn(turn: JsonField<Turn>) = apply { this.turn = turn }

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

            fun build(): AgentTurnResponseTurnAwaitingInputPayload =
                AgentTurnResponseTurnAwaitingInputPayload(
                    eventType,
                    checkRequired("turn", turn),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AgentTurnResponseTurnAwaitingInputPayload && eventType == other.eventType && turn == other.turn && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(eventType, turn, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AgentTurnResponseTurnAwaitingInputPayload{eventType=$eventType, turn=$turn, additionalProperties=$additionalProperties}"
    }
}
