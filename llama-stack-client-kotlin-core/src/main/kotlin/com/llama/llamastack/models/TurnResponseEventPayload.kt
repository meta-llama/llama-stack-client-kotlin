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
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Collections
import java.util.Objects

@JsonDeserialize(using = TurnResponseEventPayload.Deserializer::class)
@JsonSerialize(using = TurnResponseEventPayload.Serializer::class)
class TurnResponseEventPayload
private constructor(
    private val stepStart: StepStart? = null,
    private val stepProgress: StepProgress? = null,
    private val stepComplete: StepComplete? = null,
    private val start: TurnStart? = null,
    private val complete: TurnComplete? = null,
    private val awaitingInput: TurnAwaitingInput? = null,
    private val _json: JsonValue? = null,
) {

    fun stepStart(): StepStart? = stepStart

    fun stepProgress(): StepProgress? = stepProgress

    fun stepComplete(): StepComplete? = stepComplete

    fun start(): TurnStart? = start

    fun complete(): TurnComplete? = complete

    fun awaitingInput(): TurnAwaitingInput? = awaitingInput

    fun isStepStart(): Boolean = stepStart != null

    fun isStepProgress(): Boolean = stepProgress != null

    fun isStepComplete(): Boolean = stepComplete != null

    fun isStart(): Boolean = start != null

    fun isComplete(): Boolean = complete != null

    fun isAwaitingInput(): Boolean = awaitingInput != null

    fun asStepStart(): StepStart = stepStart.getOrThrow("stepStart")

    fun asStepProgress(): StepProgress = stepProgress.getOrThrow("stepProgress")

    fun asStepComplete(): StepComplete = stepComplete.getOrThrow("stepComplete")

    fun asStart(): TurnStart = start.getOrThrow("start")

    fun asComplete(): TurnComplete = complete.getOrThrow("complete")

    fun asAwaitingInput(): TurnAwaitingInput = awaitingInput.getOrThrow("awaitingInput")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            stepStart != null -> visitor.visitStepStart(stepStart)
            stepProgress != null -> visitor.visitStepProgress(stepProgress)
            stepComplete != null -> visitor.visitStepComplete(stepComplete)
            start != null -> visitor.visitStart(start)
            complete != null -> visitor.visitComplete(complete)
            awaitingInput != null -> visitor.visitAwaitingInput(awaitingInput)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): TurnResponseEventPayload = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitStepStart(stepStart: StepStart) {
                    stepStart.validate()
                }

                override fun visitStepProgress(stepProgress: StepProgress) {
                    stepProgress.validate()
                }

                override fun visitStepComplete(stepComplete: StepComplete) {
                    stepComplete.validate()
                }

                override fun visitStart(start: TurnStart) {
                    start.validate()
                }

                override fun visitComplete(complete: TurnComplete) {
                    complete.validate()
                }

                override fun visitAwaitingInput(awaitingInput: TurnAwaitingInput) {
                    awaitingInput.validate()
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
                override fun visitStepStart(stepStart: StepStart) = stepStart.validity()

                override fun visitStepProgress(stepProgress: StepProgress) = stepProgress.validity()

                override fun visitStepComplete(stepComplete: StepComplete) = stepComplete.validity()

                override fun visitStart(start: TurnStart) = start.validity()

                override fun visitComplete(complete: TurnComplete) = complete.validity()

                override fun visitAwaitingInput(awaitingInput: TurnAwaitingInput) =
                    awaitingInput.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TurnResponseEventPayload && stepStart == other.stepStart && stepProgress == other.stepProgress && stepComplete == other.stepComplete && start == other.start && complete == other.complete && awaitingInput == other.awaitingInput /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(stepStart, stepProgress, stepComplete, start, complete, awaitingInput) /* spotless:on */

    override fun toString(): String =
        when {
            stepStart != null -> "TurnResponseEventPayload{stepStart=$stepStart}"
            stepProgress != null -> "TurnResponseEventPayload{stepProgress=$stepProgress}"
            stepComplete != null -> "TurnResponseEventPayload{stepComplete=$stepComplete}"
            start != null -> "TurnResponseEventPayload{start=$start}"
            complete != null -> "TurnResponseEventPayload{complete=$complete}"
            awaitingInput != null -> "TurnResponseEventPayload{awaitingInput=$awaitingInput}"
            _json != null -> "TurnResponseEventPayload{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid TurnResponseEventPayload")
        }

    companion object {

        fun ofStepStart(stepStart: StepStart) = TurnResponseEventPayload(stepStart = stepStart)

        fun ofStepProgress(stepProgress: StepProgress) =
            TurnResponseEventPayload(stepProgress = stepProgress)

        fun ofStepComplete(stepComplete: StepComplete) =
            TurnResponseEventPayload(stepComplete = stepComplete)

        fun ofStart(start: TurnStart) = TurnResponseEventPayload(start = start)

        fun ofComplete(complete: TurnComplete) = TurnResponseEventPayload(complete = complete)

        fun ofAwaitingInput(awaitingInput: TurnAwaitingInput) =
            TurnResponseEventPayload(awaitingInput = awaitingInput)
    }

    /**
     * An interface that defines how to map each variant of [TurnResponseEventPayload] to a value of
     * type [T].
     */
    interface Visitor<out T> {

        fun visitStepStart(stepStart: StepStart): T

        fun visitStepProgress(stepProgress: StepProgress): T

        fun visitStepComplete(stepComplete: StepComplete): T

        fun visitStart(start: TurnStart): T

        fun visitComplete(complete: TurnComplete): T

        fun visitAwaitingInput(awaitingInput: TurnAwaitingInput): T

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
                    return tryDeserialize(node, jacksonTypeRef<StepStart>())?.let {
                        TurnResponseEventPayload(stepStart = it, _json = json)
                    } ?: TurnResponseEventPayload(_json = json)
                }
                "step_progress" -> {
                    return tryDeserialize(node, jacksonTypeRef<StepProgress>())?.let {
                        TurnResponseEventPayload(stepProgress = it, _json = json)
                    } ?: TurnResponseEventPayload(_json = json)
                }
                "step_complete" -> {
                    return tryDeserialize(node, jacksonTypeRef<StepComplete>())?.let {
                        TurnResponseEventPayload(stepComplete = it, _json = json)
                    } ?: TurnResponseEventPayload(_json = json)
                }
                "turn_start" -> {
                    return tryDeserialize(node, jacksonTypeRef<TurnStart>())?.let {
                        TurnResponseEventPayload(start = it, _json = json)
                    } ?: TurnResponseEventPayload(_json = json)
                }
                "turn_complete" -> {
                    return tryDeserialize(node, jacksonTypeRef<TurnComplete>())?.let {
                        TurnResponseEventPayload(complete = it, _json = json)
                    } ?: TurnResponseEventPayload(_json = json)
                }
                "turn_awaiting_input" -> {
                    return tryDeserialize(node, jacksonTypeRef<TurnAwaitingInput>())?.let {
                        TurnResponseEventPayload(awaitingInput = it, _json = json)
                    } ?: TurnResponseEventPayload(_json = json)
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
                value.stepStart != null -> generator.writeObject(value.stepStart)
                value.stepProgress != null -> generator.writeObject(value.stepProgress)
                value.stepComplete != null -> generator.writeObject(value.stepComplete)
                value.start != null -> generator.writeObject(value.start)
                value.complete != null -> generator.writeObject(value.complete)
                value.awaitingInput != null -> generator.writeObject(value.awaitingInput)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid TurnResponseEventPayload")
            }
        }
    }

    class StepStart
    private constructor(
        private val eventType: JsonValue,
        private val stepId: JsonField<String>,
        private val stepType: JsonField<StepType>,
        private val metadata: JsonField<Metadata>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("event_type") @ExcludeMissing eventType: JsonValue = JsonMissing.of(),
            @JsonProperty("step_id") @ExcludeMissing stepId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("step_type")
            @ExcludeMissing
            stepType: JsonField<StepType> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
        ) : this(eventType, stepId, stepType, metadata, mutableMapOf())

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

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [StepStart].
             *
             * The following fields are required:
             * ```kotlin
             * .stepId()
             * .stepType()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [StepStart]. */
        class Builder internal constructor() {

            private var eventType: JsonValue = JsonValue.from("step_start")
            private var stepId: JsonField<String>? = null
            private var stepType: JsonField<StepType>? = null
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(stepStart: StepStart) = apply {
                eventType = stepStart.eventType
                stepId = stepStart.stepId
                stepType = stepStart.stepType
                metadata = stepStart.metadata
                additionalProperties = stepStart.additionalProperties.toMutableMap()
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

            /**
             * Returns an immutable instance of [StepStart].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .stepId()
             * .stepType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): StepStart =
                StepStart(
                    eventType,
                    checkRequired("stepId", stepId),
                    checkRequired("stepType", stepType),
                    metadata,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): StepStart = apply {
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
            stepType().validate()
            metadata()?.validate()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            eventType.let { if (it == JsonValue.from("step_start")) 1 else 0 } +
                (if (stepId.asKnown() == null) 0 else 1) +
                (stepType.asKnown()?.validity() ?: 0) +
                (metadata.asKnown()?.validity() ?: 0)

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

            private var validated: Boolean = false

            fun validate(): StepType = apply {
                if (validated) {
                    return@apply
                }

                known()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is StepType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Metadata
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

                /**
                 * Returns an immutable instance of [Metadata].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Metadata = apply {
                if (validated) {
                    return@apply
                }

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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

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

            return /* spotless:off */ other is StepStart && eventType == other.eventType && stepId == other.stepId && stepType == other.stepType && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(eventType, stepId, stepType, metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "StepStart{eventType=$eventType, stepId=$stepId, stepType=$stepType, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    class StepProgress
    private constructor(
        private val delta: JsonField<ContentDelta>,
        private val eventType: JsonValue,
        private val stepId: JsonField<String>,
        private val stepType: JsonField<StepType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("delta")
            @ExcludeMissing
            delta: JsonField<ContentDelta> = JsonMissing.of(),
            @JsonProperty("event_type") @ExcludeMissing eventType: JsonValue = JsonMissing.of(),
            @JsonProperty("step_id") @ExcludeMissing stepId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("step_type")
            @ExcludeMissing
            stepType: JsonField<StepType> = JsonMissing.of(),
        ) : this(delta, eventType, stepId, stepType, mutableMapOf())

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

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [StepProgress].
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

        /** A builder for [StepProgress]. */
        class Builder internal constructor() {

            private var delta: JsonField<ContentDelta>? = null
            private var eventType: JsonValue = JsonValue.from("step_progress")
            private var stepId: JsonField<String>? = null
            private var stepType: JsonField<StepType>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(stepProgress: StepProgress) = apply {
                delta = stepProgress.delta
                eventType = stepProgress.eventType
                stepId = stepProgress.stepId
                stepType = stepProgress.stepType
                additionalProperties = stepProgress.additionalProperties.toMutableMap()
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
            fun delta(text: ContentDelta.Text) = delta(ContentDelta.ofText(text))

            /**
             * Alias for calling [delta] with the following:
             * ```kotlin
             * ContentDelta.Text.builder()
             *     .text(text)
             *     .build()
             * ```
             */
            fun textDelta(text: String) = delta(ContentDelta.Text.builder().text(text).build())

            /** Alias for calling [delta] with `ContentDelta.ofImage(image)`. */
            fun delta(image: ContentDelta.Image) = delta(ContentDelta.ofImage(image))

            /**
             * Alias for calling [delta] with the following:
             * ```kotlin
             * ContentDelta.Image.builder()
             *     .image(image)
             *     .build()
             * ```
             */
            fun imageDelta(image: String) = delta(ContentDelta.Image.builder().image(image).build())

            /** Alias for calling [delta] with `ContentDelta.ofToolCall(toolCall)`. */
            fun delta(toolCall: ContentDelta.ToolCall) = delta(ContentDelta.ofToolCall(toolCall))

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

            /**
             * Returns an immutable instance of [StepProgress].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .delta()
             * .stepId()
             * .stepType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): StepProgress =
                StepProgress(
                    checkRequired("delta", delta),
                    eventType,
                    checkRequired("stepId", stepId),
                    checkRequired("stepType", stepType),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): StepProgress = apply {
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
            stepType().validate()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (delta.asKnown()?.validity() ?: 0) +
                eventType.let { if (it == JsonValue.from("step_progress")) 1 else 0 } +
                (if (stepId.asKnown() == null) 0 else 1) +
                (stepType.asKnown()?.validity() ?: 0)

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

            private var validated: Boolean = false

            fun validate(): StepType = apply {
                if (validated) {
                    return@apply
                }

                known()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

            return /* spotless:off */ other is StepProgress && delta == other.delta && eventType == other.eventType && stepId == other.stepId && stepType == other.stepType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(delta, eventType, stepId, stepType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "StepProgress{delta=$delta, eventType=$eventType, stepId=$stepId, stepType=$stepType, additionalProperties=$additionalProperties}"
    }

    class StepComplete
    private constructor(
        private val eventType: JsonValue,
        private val stepDetails: JsonField<StepDetails>,
        private val stepId: JsonField<String>,
        private val stepType: JsonField<StepType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("event_type") @ExcludeMissing eventType: JsonValue = JsonMissing.of(),
            @JsonProperty("step_details")
            @ExcludeMissing
            stepDetails: JsonField<StepDetails> = JsonMissing.of(),
            @JsonProperty("step_id") @ExcludeMissing stepId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("step_type")
            @ExcludeMissing
            stepType: JsonField<StepType> = JsonMissing.of(),
        ) : this(eventType, stepDetails, stepId, stepType, mutableMapOf())

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

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [StepComplete].
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

        /** A builder for [StepComplete]. */
        class Builder internal constructor() {

            private var eventType: JsonValue = JsonValue.from("step_complete")
            private var stepDetails: JsonField<StepDetails>? = null
            private var stepId: JsonField<String>? = null
            private var stepType: JsonField<StepType>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(stepComplete: StepComplete) = apply {
                eventType = stepComplete.eventType
                stepDetails = stepComplete.stepDetails
                stepId = stepComplete.stepId
                stepType = stepComplete.stepType
                additionalProperties = stepComplete.additionalProperties.toMutableMap()
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

            /** Alias for calling [stepDetails] with `StepDetails.ofInference(inference)`. */
            fun stepDetails(inference: InferenceStep) =
                stepDetails(StepDetails.ofInference(inference))

            /**
             * Alias for calling [stepDetails] with `StepDetails.ofToolExecution(toolExecution)`.
             */
            fun stepDetails(toolExecution: ToolExecutionStep) =
                stepDetails(StepDetails.ofToolExecution(toolExecution))

            /** Alias for calling [stepDetails] with `StepDetails.ofShieldCall(shieldCall)`. */
            fun stepDetails(shieldCall: ShieldCallStep) =
                stepDetails(StepDetails.ofShieldCall(shieldCall))

            /**
             * Alias for calling [stepDetails] with
             * `StepDetails.ofMemoryRetrieval(memoryRetrieval)`.
             */
            fun stepDetails(memoryRetrieval: MemoryRetrievalStep) =
                stepDetails(StepDetails.ofMemoryRetrieval(memoryRetrieval))

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

            /**
             * Returns an immutable instance of [StepComplete].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .stepDetails()
             * .stepId()
             * .stepType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): StepComplete =
                StepComplete(
                    eventType,
                    checkRequired("stepDetails", stepDetails),
                    checkRequired("stepId", stepId),
                    checkRequired("stepType", stepType),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): StepComplete = apply {
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
            stepType().validate()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            eventType.let { if (it == JsonValue.from("step_complete")) 1 else 0 } +
                (stepDetails.asKnown()?.validity() ?: 0) +
                (if (stepId.asKnown() == null) 0 else 1) +
                (stepType.asKnown()?.validity() ?: 0)

        /** An inference step in an agent turn. */
        @JsonDeserialize(using = StepDetails.Deserializer::class)
        @JsonSerialize(using = StepDetails.Serializer::class)
        class StepDetails
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
            fun asMemoryRetrieval(): MemoryRetrievalStep =
                memoryRetrieval.getOrThrow("memoryRetrieval")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    inference != null -> visitor.visitInference(inference)
                    toolExecution != null -> visitor.visitToolExecution(toolExecution)
                    shieldCall != null -> visitor.visitShieldCall(shieldCall)
                    memoryRetrieval != null -> visitor.visitMemoryRetrieval(memoryRetrieval)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): StepDetails = apply {
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

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LlamaStackClientInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                accept(
                    object : Visitor<Int> {
                        override fun visitInference(inference: InferenceStep) = inference.validity()

                        override fun visitToolExecution(toolExecution: ToolExecutionStep) =
                            toolExecution.validity()

                        override fun visitShieldCall(shieldCall: ShieldCallStep) =
                            shieldCall.validity()

                        override fun visitMemoryRetrieval(memoryRetrieval: MemoryRetrievalStep) =
                            memoryRetrieval.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is StepDetails && inference == other.inference && toolExecution == other.toolExecution && shieldCall == other.shieldCall && memoryRetrieval == other.memoryRetrieval /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(inference, toolExecution, shieldCall, memoryRetrieval) /* spotless:on */

            override fun toString(): String =
                when {
                    inference != null -> "StepDetails{inference=$inference}"
                    toolExecution != null -> "StepDetails{toolExecution=$toolExecution}"
                    shieldCall != null -> "StepDetails{shieldCall=$shieldCall}"
                    memoryRetrieval != null -> "StepDetails{memoryRetrieval=$memoryRetrieval}"
                    _json != null -> "StepDetails{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid StepDetails")
                }

            companion object {

                /** An inference step in an agent turn. */
                fun ofInference(inference: InferenceStep) = StepDetails(inference = inference)

                /** A tool execution step in an agent turn. */
                fun ofToolExecution(toolExecution: ToolExecutionStep) =
                    StepDetails(toolExecution = toolExecution)

                /** A shield call step in an agent turn. */
                fun ofShieldCall(shieldCall: ShieldCallStep) = StepDetails(shieldCall = shieldCall)

                /** A memory retrieval step in an agent turn. */
                fun ofMemoryRetrieval(memoryRetrieval: MemoryRetrievalStep) =
                    StepDetails(memoryRetrieval = memoryRetrieval)
            }

            /**
             * An interface that defines how to map each variant of [StepDetails] to a value of type
             * [T].
             */
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
                            return tryDeserialize(node, jacksonTypeRef<InferenceStep>())?.let {
                                StepDetails(inference = it, _json = json)
                            } ?: StepDetails(_json = json)
                        }
                        "tool_execution" -> {
                            return tryDeserialize(node, jacksonTypeRef<ToolExecutionStep>())?.let {
                                StepDetails(toolExecution = it, _json = json)
                            } ?: StepDetails(_json = json)
                        }
                        "shield_call" -> {
                            return tryDeserialize(node, jacksonTypeRef<ShieldCallStep>())?.let {
                                StepDetails(shieldCall = it, _json = json)
                            } ?: StepDetails(_json = json)
                        }
                        "memory_retrieval" -> {
                            return tryDeserialize(node, jacksonTypeRef<MemoryRetrievalStep>())
                                ?.let { StepDetails(memoryRetrieval = it, _json = json) }
                                ?: StepDetails(_json = json)
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
                        value.inference != null -> generator.writeObject(value.inference)
                        value.toolExecution != null -> generator.writeObject(value.toolExecution)
                        value.shieldCall != null -> generator.writeObject(value.shieldCall)
                        value.memoryRetrieval != null ->
                            generator.writeObject(value.memoryRetrieval)
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

            private var validated: Boolean = false

            fun validate(): StepType = apply {
                if (validated) {
                    return@apply
                }

                known()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

            return /* spotless:off */ other is StepComplete && eventType == other.eventType && stepDetails == other.stepDetails && stepId == other.stepId && stepType == other.stepType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(eventType, stepDetails, stepId, stepType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "StepComplete{eventType=$eventType, stepDetails=$stepDetails, stepId=$stepId, stepType=$stepType, additionalProperties=$additionalProperties}"
    }

    class TurnStart
    private constructor(
        private val eventType: JsonValue,
        private val turnId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("event_type") @ExcludeMissing eventType: JsonValue = JsonMissing.of(),
            @JsonProperty("turn_id") @ExcludeMissing turnId: JsonField<String> = JsonMissing.of(),
        ) : this(eventType, turnId, mutableMapOf())

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

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [TurnStart].
             *
             * The following fields are required:
             * ```kotlin
             * .turnId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [TurnStart]. */
        class Builder internal constructor() {

            private var eventType: JsonValue = JsonValue.from("turn_start")
            private var turnId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(turnStart: TurnStart) = apply {
                eventType = turnStart.eventType
                turnId = turnStart.turnId
                additionalProperties = turnStart.additionalProperties.toMutableMap()
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

            /**
             * Returns an immutable instance of [TurnStart].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .turnId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): TurnStart =
                TurnStart(
                    eventType,
                    checkRequired("turnId", turnId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): TurnStart = apply {
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

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaStackClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            eventType.let { if (it == JsonValue.from("turn_start")) 1 else 0 } +
                (if (turnId.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TurnStart && eventType == other.eventType && turnId == other.turnId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(eventType, turnId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TurnStart{eventType=$eventType, turnId=$turnId, additionalProperties=$additionalProperties}"
    }

    class TurnComplete
    private constructor(
        private val eventType: JsonValue,
        private val turn: JsonField<Turn>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("event_type") @ExcludeMissing eventType: JsonValue = JsonMissing.of(),
            @JsonProperty("turn") @ExcludeMissing turn: JsonField<Turn> = JsonMissing.of(),
        ) : this(eventType, turn, mutableMapOf())

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

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [TurnComplete].
             *
             * The following fields are required:
             * ```kotlin
             * .turn()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [TurnComplete]. */
        class Builder internal constructor() {

            private var eventType: JsonValue = JsonValue.from("turn_complete")
            private var turn: JsonField<Turn>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(turnComplete: TurnComplete) = apply {
                eventType = turnComplete.eventType
                turn = turnComplete.turn
                additionalProperties = turnComplete.additionalProperties.toMutableMap()
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

            /**
             * Returns an immutable instance of [TurnComplete].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .turn()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): TurnComplete =
                TurnComplete(
                    eventType,
                    checkRequired("turn", turn),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): TurnComplete = apply {
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

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaStackClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            eventType.let { if (it == JsonValue.from("turn_complete")) 1 else 0 } +
                (turn.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TurnComplete && eventType == other.eventType && turn == other.turn && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(eventType, turn, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TurnComplete{eventType=$eventType, turn=$turn, additionalProperties=$additionalProperties}"
    }

    class TurnAwaitingInput
    private constructor(
        private val eventType: JsonValue,
        private val turn: JsonField<Turn>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("event_type") @ExcludeMissing eventType: JsonValue = JsonMissing.of(),
            @JsonProperty("turn") @ExcludeMissing turn: JsonField<Turn> = JsonMissing.of(),
        ) : this(eventType, turn, mutableMapOf())

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

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [TurnAwaitingInput].
             *
             * The following fields are required:
             * ```kotlin
             * .turn()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [TurnAwaitingInput]. */
        class Builder internal constructor() {

            private var eventType: JsonValue = JsonValue.from("turn_awaiting_input")
            private var turn: JsonField<Turn>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(turnAwaitingInput: TurnAwaitingInput) = apply {
                eventType = turnAwaitingInput.eventType
                turn = turnAwaitingInput.turn
                additionalProperties = turnAwaitingInput.additionalProperties.toMutableMap()
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

            /**
             * Returns an immutable instance of [TurnAwaitingInput].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .turn()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): TurnAwaitingInput =
                TurnAwaitingInput(
                    eventType,
                    checkRequired("turn", turn),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): TurnAwaitingInput = apply {
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

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaStackClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            eventType.let { if (it == JsonValue.from("turn_awaiting_input")) 1 else 0 } +
                (turn.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TurnAwaitingInput && eventType == other.eventType && turn == other.turn && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(eventType, turn, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TurnAwaitingInput{eventType=$eventType, turn=$turn, additionalProperties=$additionalProperties}"
    }
}
