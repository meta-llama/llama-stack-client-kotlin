// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

/** A shield call step in an agent turn. */
@NoAutoDetect
class ShieldCallStep
@JsonCreator
private constructor(
    @JsonProperty("step_id")
    @ExcludeMissing
    private val stepId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("step_type") @ExcludeMissing private val stepType: JsonValue = JsonMissing.of(),
    @JsonProperty("turn_id")
    @ExcludeMissing
    private val turnId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("completed_at")
    @ExcludeMissing
    private val completedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("started_at")
    @ExcludeMissing
    private val startedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("violation")
    @ExcludeMissing
    private val violation: JsonField<SafetyViolation> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * The ID of the step.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun stepId(): String = stepId.getRequired("step_id")

    /**
     * Expected to always return the following:
     * ```kotlin
     * JsonValue.from("shield_call")
     * ```
     *
     * However, this method can be useful for debugging and logging (e.g. if the server responded
     * with an unexpected value).
     */
    @JsonProperty("step_type") @ExcludeMissing fun _stepType(): JsonValue = stepType

    /**
     * The ID of the turn.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun turnId(): String = turnId.getRequired("turn_id")

    /**
     * The time the step completed.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun completedAt(): OffsetDateTime? = completedAt.getNullable("completed_at")

    /**
     * The time the step started.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun startedAt(): OffsetDateTime? = startedAt.getNullable("started_at")

    /**
     * The violation from the shield call.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun violation(): SafetyViolation? = violation.getNullable("violation")

    /**
     * Returns the raw JSON value of [stepId].
     *
     * Unlike [stepId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("step_id") @ExcludeMissing fun _stepId(): JsonField<String> = stepId

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
     * Returns the raw JSON value of [startedAt].
     *
     * Unlike [startedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("started_at")
    @ExcludeMissing
    fun _startedAt(): JsonField<OffsetDateTime> = startedAt

    /**
     * Returns the raw JSON value of [violation].
     *
     * Unlike [violation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("violation")
    @ExcludeMissing
    fun _violation(): JsonField<SafetyViolation> = violation

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ShieldCallStep = apply {
        if (validated) {
            return@apply
        }

        stepId()
        _stepType().let {
            if (it != JsonValue.from("shield_call")) {
                throw LlamaStackClientInvalidDataException("'stepType' is invalid, received $it")
            }
        }
        turnId()
        completedAt()
        startedAt()
        violation()?.validate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ShieldCallStep].
         *
         * The following fields are required:
         * ```kotlin
         * .stepId()
         * .turnId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ShieldCallStep]. */
    class Builder internal constructor() {

        private var stepId: JsonField<String>? = null
        private var stepType: JsonValue = JsonValue.from("shield_call")
        private var turnId: JsonField<String>? = null
        private var completedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var startedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var violation: JsonField<SafetyViolation> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(shieldCallStep: ShieldCallStep) = apply {
            stepId = shieldCallStep.stepId
            stepType = shieldCallStep.stepType
            turnId = shieldCallStep.turnId
            completedAt = shieldCallStep.completedAt
            startedAt = shieldCallStep.startedAt
            violation = shieldCallStep.violation
            additionalProperties = shieldCallStep.additionalProperties.toMutableMap()
        }

        /** The ID of the step. */
        fun stepId(stepId: String) = stepId(JsonField.of(stepId))

        /**
         * Sets [Builder.stepId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stepId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun stepId(stepId: JsonField<String>) = apply { this.stepId = stepId }

        /**
         * Sets the field to an arbitrary JSON value.
         *
         * It is usually unnecessary to call this method because the field defaults to the
         * following:
         * ```kotlin
         * JsonValue.from("shield_call")
         * ```
         *
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun stepType(stepType: JsonValue) = apply { this.stepType = stepType }

        /** The ID of the turn. */
        fun turnId(turnId: String) = turnId(JsonField.of(turnId))

        /**
         * Sets [Builder.turnId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.turnId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun turnId(turnId: JsonField<String>) = apply { this.turnId = turnId }

        /** The time the step completed. */
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

        /** The time the step started. */
        fun startedAt(startedAt: OffsetDateTime) = startedAt(JsonField.of(startedAt))

        /**
         * Sets [Builder.startedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startedAt(startedAt: JsonField<OffsetDateTime>) = apply { this.startedAt = startedAt }

        /** The violation from the shield call. */
        fun violation(violation: SafetyViolation) = violation(JsonField.of(violation))

        /**
         * Sets [Builder.violation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.violation] with a well-typed [SafetyViolation] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun violation(violation: JsonField<SafetyViolation>) = apply { this.violation = violation }

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

        fun build(): ShieldCallStep =
            ShieldCallStep(
                checkRequired("stepId", stepId),
                stepType,
                checkRequired("turnId", turnId),
                completedAt,
                startedAt,
                violation,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ShieldCallStep && stepId == other.stepId && stepType == other.stepType && turnId == other.turnId && completedAt == other.completedAt && startedAt == other.startedAt && violation == other.violation && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(stepId, stepType, turnId, completedAt, startedAt, violation, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ShieldCallStep{stepId=$stepId, stepType=$stepType, turnId=$turnId, completedAt=$completedAt, startedAt=$startedAt, violation=$violation, additionalProperties=$additionalProperties}"
}
