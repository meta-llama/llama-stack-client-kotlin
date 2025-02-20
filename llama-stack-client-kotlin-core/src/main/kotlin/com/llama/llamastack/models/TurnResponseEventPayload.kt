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

    fun isAgentTurnResponseStepStart(): Boolean = agentTurnResponseStepStart != null

    fun isAgentTurnResponseStepProgress(): Boolean = agentTurnResponseStepProgress != null

    fun isAgentTurnResponseStepComplete(): Boolean = agentTurnResponseStepComplete != null

    fun isAgentTurnResponseTurnStart(): Boolean = agentTurnResponseTurnStart != null

    fun isAgentTurnResponseTurnComplete(): Boolean = agentTurnResponseTurnComplete != null

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
            }
        )
        validated = true
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TurnResponseEventPayload && agentTurnResponseStepStart == other.agentTurnResponseStepStart && agentTurnResponseStepProgress == other.agentTurnResponseStepProgress && agentTurnResponseStepComplete == other.agentTurnResponseStepComplete && agentTurnResponseTurnStart == other.agentTurnResponseTurnStart && agentTurnResponseTurnComplete == other.agentTurnResponseTurnComplete /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(agentTurnResponseStepStart, agentTurnResponseStepProgress, agentTurnResponseStepComplete, agentTurnResponseTurnStart, agentTurnResponseTurnComplete) /* spotless:on */

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

        @JsonProperty("event_type") @ExcludeMissing fun _eventType(): JsonValue = eventType

        fun stepId(): String = stepId.getRequired("step_id")

        fun stepType(): StepType = stepType.getRequired("step_type")

        fun metadata(): Metadata? = metadata.getNullable("metadata")

        @JsonProperty("step_id") @ExcludeMissing fun _stepId(): JsonField<String> = stepId

        @JsonProperty("step_type") @ExcludeMissing fun _stepType(): JsonField<StepType> = stepType

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

            fun eventType(eventType: JsonValue) = apply { this.eventType = eventType }

            fun stepId(stepId: String) = stepId(JsonField.of(stepId))

            fun stepId(stepId: JsonField<String>) = apply { this.stepId = stepId }

            fun stepType(stepType: StepType) = stepType(JsonField.of(stepType))

            fun stepType(stepType: JsonField<StepType>) = apply { this.stepType = stepType }

            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

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

        fun delta(): ContentDelta = delta.getRequired("delta")

        @JsonProperty("event_type") @ExcludeMissing fun _eventType(): JsonValue = eventType

        fun stepId(): String = stepId.getRequired("step_id")

        fun stepType(): StepType = stepType.getRequired("step_type")

        @JsonProperty("delta") @ExcludeMissing fun _delta(): JsonField<ContentDelta> = delta

        @JsonProperty("step_id") @ExcludeMissing fun _stepId(): JsonField<String> = stepId

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

            fun delta(delta: JsonField<ContentDelta>) = apply { this.delta = delta }

            fun delta(text: ContentDelta.TextDelta) = delta(ContentDelta.ofText(text))

            fun textDelta(text: String) = delta(ContentDelta.TextDelta.builder().text(text).build())

            fun delta(image: ContentDelta.ImageDelta) = delta(ContentDelta.ofImage(image))

            fun imageDelta(image: String) =
                delta(ContentDelta.ImageDelta.builder().image(image).build())

            fun delta(toolCall: ContentDelta.ToolCallDelta) =
                delta(ContentDelta.ofToolCall(toolCall))

            fun eventType(eventType: JsonValue) = apply { this.eventType = eventType }

            fun stepId(stepId: String) = stepId(JsonField.of(stepId))

            fun stepId(stepId: JsonField<String>) = apply { this.stepId = stepId }

            fun stepType(stepType: StepType) = stepType(JsonField.of(stepType))

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

        @JsonProperty("event_type") @ExcludeMissing fun _eventType(): JsonValue = eventType

        fun stepDetails(): StepDetails = stepDetails.getRequired("step_details")

        fun stepId(): String = stepId.getRequired("step_id")

        fun stepType(): StepType = stepType.getRequired("step_type")

        @JsonProperty("step_details")
        @ExcludeMissing
        fun _stepDetails(): JsonField<StepDetails> = stepDetails

        @JsonProperty("step_id") @ExcludeMissing fun _stepId(): JsonField<String> = stepId

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

            fun eventType(eventType: JsonValue) = apply { this.eventType = eventType }

            fun stepDetails(stepDetails: StepDetails) = stepDetails(JsonField.of(stepDetails))

            fun stepDetails(stepDetails: JsonField<StepDetails>) = apply {
                this.stepDetails = stepDetails
            }

            fun stepDetails(inferenceStep: InferenceStep) =
                stepDetails(StepDetails.ofInferenceStep(inferenceStep))

            fun stepDetails(toolExecutionStep: ToolExecutionStep) =
                stepDetails(StepDetails.ofToolExecutionStep(toolExecutionStep))

            fun stepDetails(shieldCallStep: ShieldCallStep) =
                stepDetails(StepDetails.ofShieldCallStep(shieldCallStep))

            fun stepDetails(memoryRetrievalStep: MemoryRetrievalStep) =
                stepDetails(StepDetails.ofMemoryRetrievalStep(memoryRetrievalStep))

            fun stepId(stepId: String) = stepId(JsonField.of(stepId))

            fun stepId(stepId: JsonField<String>) = apply { this.stepId = stepId }

            fun stepType(stepType: StepType) = stepType(JsonField.of(stepType))

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

                fun ofInferenceStep(inferenceStep: InferenceStep) =
                    StepDetails(inferenceStep = inferenceStep)

                fun ofToolExecutionStep(toolExecutionStep: ToolExecutionStep) =
                    StepDetails(toolExecutionStep = toolExecutionStep)

                fun ofShieldCallStep(shieldCallStep: ShieldCallStep) =
                    StepDetails(shieldCallStep = shieldCallStep)

                fun ofMemoryRetrievalStep(memoryRetrievalStep: MemoryRetrievalStep) =
                    StepDetails(memoryRetrievalStep = memoryRetrievalStep)
            }

            /**
             * An interface that defines how to map each variant of [StepDetails] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitInferenceStep(inferenceStep: InferenceStep): T

                fun visitToolExecutionStep(toolExecutionStep: ToolExecutionStep): T

                fun visitShieldCallStep(shieldCallStep: ShieldCallStep): T

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

        @JsonProperty("event_type") @ExcludeMissing fun _eventType(): JsonValue = eventType

        fun turnId(): String = turnId.getRequired("turn_id")

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

            fun eventType(eventType: JsonValue) = apply { this.eventType = eventType }

            fun turnId(turnId: String) = turnId(JsonField.of(turnId))

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

        @JsonProperty("event_type") @ExcludeMissing fun _eventType(): JsonValue = eventType

        /** A single turn in an interaction with an Agentic System. */
        fun turn(): Turn = turn.getRequired("turn")

        /** A single turn in an interaction with an Agentic System. */
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

            fun eventType(eventType: JsonValue) = apply { this.eventType = eventType }

            /** A single turn in an interaction with an Agentic System. */
            fun turn(turn: Turn) = turn(JsonField.of(turn))

            /** A single turn in an interaction with an Agentic System. */
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
}
