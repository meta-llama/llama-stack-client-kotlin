// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.llama.llamastack.core.Enum
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
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
    private val violation: JsonField<SafetyViolation>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun completedAt(): OffsetDateTime? = completedAt.getNullable("completed_at")

    fun startedAt(): OffsetDateTime? = startedAt.getNullable("started_at")

    fun stepId(): String = stepId.getRequired("step_id")

    fun stepType(): StepType = stepType.getRequired("step_type")

    fun turnId(): String = turnId.getRequired("turn_id")

    fun violation(): SafetyViolation? = violation.getNullable("violation")

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

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var completedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var startedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var stepId: JsonField<String> = JsonMissing.of()
        private var stepType: JsonField<StepType> = JsonMissing.of()
        private var turnId: JsonField<String> = JsonMissing.of()
        private var violation: JsonField<SafetyViolation> = JsonMissing.of()
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

        fun violation(violation: SafetyViolation) = violation(JsonField.of(violation))

        @JsonProperty("violation")
        @ExcludeMissing
        fun violation(violation: JsonField<SafetyViolation>) = apply { this.violation = violation }

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
                additionalProperties.toImmutable(),
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

            return /* spotless:off */ other is StepType && this.value == other.value /* spotless:on */
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ShieldCallStep && this.completedAt == other.completedAt && this.startedAt == other.startedAt && this.stepId == other.stepId && this.stepType == other.stepType && this.turnId == other.turnId && this.violation == other.violation && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(completedAt, startedAt, stepId, stepType, turnId, violation, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "ShieldCallStep{completedAt=$completedAt, startedAt=$startedAt, stepId=$stepId, stepType=$stepType, turnId=$turnId, violation=$violation, additionalProperties=$additionalProperties}"
}
