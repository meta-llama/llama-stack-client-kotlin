// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.llama_stack_client.api.core.Enum
import com.llama_stack_client.api.core.ExcludeMissing
import com.llama_stack_client.api.core.JsonField
import com.llama_stack_client.api.core.JsonMissing
import com.llama_stack_client.api.core.JsonValue
import com.llama_stack_client.api.core.NoAutoDetect
import com.llama_stack_client.api.core.toUnmodifiable
import com.llama_stack_client.api.errors.LlamaStackClientInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = ShieldCallStep.Builder::class)
@NoAutoDetect
class ShieldCallStep
private constructor(
    private val completedAt: JsonField<OffsetDateTime>,
    private val startedAt: JsonField<OffsetDateTime>,
    private val stepId: JsonField<String>,
    private val stepType: JsonField<StepType>,
    private val turnId: JsonField<String>,
    private val violation: JsonField<Violation>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun completedAt(): OffsetDateTime? = completedAt.getNullable("completed_at")

    fun startedAt(): OffsetDateTime? = startedAt.getNullable("started_at")

    fun stepId(): String = stepId.getRequired("step_id")

    fun stepType(): StepType = stepType.getRequired("step_type")

    fun turnId(): String = turnId.getRequired("turn_id")

    fun violation(): Violation? = violation.getNullable("violation")

    @JsonProperty("completed_at") @ExcludeMissing fun _completedAt() = completedAt

    @JsonProperty("started_at") @ExcludeMissing fun _startedAt() = startedAt

    @JsonProperty("step_id") @ExcludeMissing fun _stepId() = stepId

    @JsonProperty("step_type") @ExcludeMissing fun _stepType() = stepType

    @JsonProperty("turn_id") @ExcludeMissing fun _turnId() = turnId

    @JsonProperty("violation") @ExcludeMissing fun _violation() = violation

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ShieldCallStep = apply {
        if (!validated) {
            completedAt()
            startedAt()
            stepId()
            stepType()
            turnId()
            violation()?.validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ShieldCallStep &&
            this.completedAt == other.completedAt &&
            this.startedAt == other.startedAt &&
            this.stepId == other.stepId &&
            this.stepType == other.stepType &&
            this.turnId == other.turnId &&
            this.violation == other.violation &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    completedAt,
                    startedAt,
                    stepId,
                    stepType,
                    turnId,
                    violation,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "ShieldCallStep{completedAt=$completedAt, startedAt=$startedAt, stepId=$stepId, stepType=$stepType, turnId=$turnId, violation=$violation, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var completedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var startedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var stepId: JsonField<String> = JsonMissing.of()
        private var stepType: JsonField<StepType> = JsonMissing.of()
        private var turnId: JsonField<String> = JsonMissing.of()
        private var violation: JsonField<Violation> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(shieldCallStep: ShieldCallStep) = apply {
            this.completedAt = shieldCallStep.completedAt
            this.startedAt = shieldCallStep.startedAt
            this.stepId = shieldCallStep.stepId
            this.stepType = shieldCallStep.stepType
            this.turnId = shieldCallStep.turnId
            this.violation = shieldCallStep.violation
            additionalProperties(shieldCallStep.additionalProperties)
        }

        fun completedAt(completedAt: OffsetDateTime) = completedAt(JsonField.of(completedAt))

        @JsonProperty("completed_at")
        @ExcludeMissing
        fun completedAt(completedAt: JsonField<OffsetDateTime>) = apply {
            this.completedAt = completedAt
        }

        fun startedAt(startedAt: OffsetDateTime) = startedAt(JsonField.of(startedAt))

        @JsonProperty("started_at")
        @ExcludeMissing
        fun startedAt(startedAt: JsonField<OffsetDateTime>) = apply { this.startedAt = startedAt }

        fun stepId(stepId: String) = stepId(JsonField.of(stepId))

        @JsonProperty("step_id")
        @ExcludeMissing
        fun stepId(stepId: JsonField<String>) = apply { this.stepId = stepId }

        fun stepType(stepType: StepType) = stepType(JsonField.of(stepType))

        @JsonProperty("step_type")
        @ExcludeMissing
        fun stepType(stepType: JsonField<StepType>) = apply { this.stepType = stepType }

        fun turnId(turnId: String) = turnId(JsonField.of(turnId))

        @JsonProperty("turn_id")
        @ExcludeMissing
        fun turnId(turnId: JsonField<String>) = apply { this.turnId = turnId }

        fun violation(violation: Violation) = violation(JsonField.of(violation))

        @JsonProperty("violation")
        @ExcludeMissing
        fun violation(violation: JsonField<Violation>) = apply { this.violation = violation }

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

        fun build(): ShieldCallStep =
            ShieldCallStep(
                completedAt,
                startedAt,
                stepId,
                stepType,
                turnId,
                violation,
                additionalProperties.toUnmodifiable(),
            )
    }

    class StepType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is StepType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val SHIELD_CALL = StepType(JsonField.of("shield_call"))

            fun of(value: String) = StepType(JsonField.of(value))
        }

        enum class Known {
            SHIELD_CALL,
        }

        enum class Value {
            SHIELD_CALL,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                SHIELD_CALL -> Value.SHIELD_CALL
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                SHIELD_CALL -> Known.SHIELD_CALL
                else -> throw LlamaStackClientInvalidDataException("Unknown StepType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    @JsonDeserialize(builder = Violation.Builder::class)
    @NoAutoDetect
    class Violation
    private constructor(
        private val metadata: JsonField<Metadata>,
        private val userMessage: JsonField<String>,
        private val violationLevel: JsonField<ViolationLevel>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun metadata(): Metadata = metadata.getRequired("metadata")

        fun userMessage(): String? = userMessage.getNullable("user_message")

        fun violationLevel(): ViolationLevel = violationLevel.getRequired("violation_level")

        @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

        @JsonProperty("user_message") @ExcludeMissing fun _userMessage() = userMessage

        @JsonProperty("violation_level") @ExcludeMissing fun _violationLevel() = violationLevel

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Violation = apply {
            if (!validated) {
                metadata().validate()
                userMessage()
                violationLevel()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Violation &&
                this.metadata == other.metadata &&
                this.userMessage == other.userMessage &&
                this.violationLevel == other.violationLevel &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        metadata,
                        userMessage,
                        violationLevel,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Violation{metadata=$metadata, userMessage=$userMessage, violationLevel=$violationLevel, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var userMessage: JsonField<String> = JsonMissing.of()
            private var violationLevel: JsonField<ViolationLevel> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(violation: Violation) = apply {
                this.metadata = violation.metadata
                this.userMessage = violation.userMessage
                this.violationLevel = violation.violationLevel
                additionalProperties(violation.additionalProperties)
            }

            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            @JsonProperty("metadata")
            @ExcludeMissing
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            fun userMessage(userMessage: String) = userMessage(JsonField.of(userMessage))

            @JsonProperty("user_message")
            @ExcludeMissing
            fun userMessage(userMessage: JsonField<String>) = apply {
                this.userMessage = userMessage
            }

            fun violationLevel(violationLevel: ViolationLevel) =
                violationLevel(JsonField.of(violationLevel))

            @JsonProperty("violation_level")
            @ExcludeMissing
            fun violationLevel(violationLevel: JsonField<ViolationLevel>) = apply {
                this.violationLevel = violationLevel
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

            fun build(): Violation =
                Violation(
                    metadata,
                    userMessage,
                    violationLevel,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = Metadata.Builder::class)
        @NoAutoDetect
        class Metadata
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Metadata = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Metadata && this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(additionalProperties)
                }
                return hashCode
            }

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(metadata: Metadata) = apply {
                    additionalProperties(metadata.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
            }
        }

        class ViolationLevel
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ViolationLevel && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val INFO = ViolationLevel(JsonField.of("info"))

                val WARN = ViolationLevel(JsonField.of("warn"))

                val ERROR = ViolationLevel(JsonField.of("error"))

                fun of(value: String) = ViolationLevel(JsonField.of(value))
            }

            enum class Known {
                INFO,
                WARN,
                ERROR,
            }

            enum class Value {
                INFO,
                WARN,
                ERROR,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    INFO -> Value.INFO
                    WARN -> Value.WARN
                    ERROR -> Value.ERROR
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    INFO -> Known.INFO
                    WARN -> Known.WARN
                    ERROR -> Known.ERROR
                    else ->
                        throw LlamaStackClientInvalidDataException("Unknown ViolationLevel: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }
}
