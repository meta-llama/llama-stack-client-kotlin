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

@NoAutoDetect
class InferenceStep
@JsonCreator
private constructor(
    @JsonProperty("model_response")
    @ExcludeMissing
    private val modelResponse: JsonField<CompletionMessage> = JsonMissing.of(),
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
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** A message containing the model's (assistant) response in a chat conversation. */
    fun modelResponse(): CompletionMessage = modelResponse.getRequired("model_response")

    fun stepId(): String = stepId.getRequired("step_id")

    @JsonProperty("step_type") @ExcludeMissing fun _stepType(): JsonValue = stepType

    fun turnId(): String = turnId.getRequired("turn_id")

    fun completedAt(): OffsetDateTime? = null

    fun startedAt(): OffsetDateTime? = null

    /** A message containing the model's (assistant) response in a chat conversation. */
    @JsonProperty("model_response")
    @ExcludeMissing
    fun _modelResponse(): JsonField<CompletionMessage> = modelResponse

    @JsonProperty("step_id") @ExcludeMissing fun _stepId(): JsonField<String> = stepId

    @JsonProperty("turn_id") @ExcludeMissing fun _turnId(): JsonField<String> = turnId

    @JsonProperty("completed_at")
    @ExcludeMissing
    fun _completedAt(): JsonField<OffsetDateTime> = completedAt

    @JsonProperty("started_at")
    @ExcludeMissing
    fun _startedAt(): JsonField<OffsetDateTime> = startedAt

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): InferenceStep = apply {
        if (validated) {
            return@apply
        }

        modelResponse().validate()
        stepId()
        _stepType().let {
            if (it != JsonValue.from("inference")) {
                throw LlamaStackClientInvalidDataException("'stepType' is invalid, received $it")
            }
        }
        turnId()
        completedAt()
        startedAt()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [InferenceStep]. */
    class Builder internal constructor() {

        private var modelResponse: JsonField<CompletionMessage>? = null
        private var stepId: JsonField<String>? = null
        private var stepType: JsonValue = JsonValue.from("inference")
        private var turnId: JsonField<String>? = null
        private var completedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var startedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(inferenceStep: InferenceStep) = apply {
            modelResponse = inferenceStep.modelResponse
            stepId = inferenceStep.stepId
            stepType = inferenceStep.stepType
            turnId = inferenceStep.turnId
            completedAt = inferenceStep.completedAt
            startedAt = inferenceStep.startedAt
            additionalProperties = inferenceStep.additionalProperties.toMutableMap()
        }

        /** A message containing the model's (assistant) response in a chat conversation. */
        fun modelResponse(modelResponse: CompletionMessage) =
            modelResponse(JsonField.of(modelResponse))

        /** A message containing the model's (assistant) response in a chat conversation. */
        fun modelResponse(modelResponse: JsonField<CompletionMessage>) = apply {
            this.modelResponse = modelResponse
        }

        fun stepId(stepId: String) = stepId(JsonField.of(stepId))

        fun stepId(stepId: JsonField<String>) = apply { this.stepId = stepId }

        fun stepType(stepType: JsonValue) = apply { this.stepType = stepType }

        fun turnId(turnId: String) = turnId(JsonField.of(turnId))

        fun turnId(turnId: JsonField<String>) = apply { this.turnId = turnId }

        fun completedAt(completedAt: OffsetDateTime) = completedAt(JsonField.of(completedAt))

        fun completedAt(completedAt: JsonField<OffsetDateTime>) = apply {
            this.completedAt = completedAt
        }

        fun startedAt(startedAt: OffsetDateTime) = startedAt(JsonField.of(startedAt))

        fun startedAt(startedAt: JsonField<OffsetDateTime>) = apply { this.startedAt = startedAt }

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

        fun build(): InferenceStep =
            InferenceStep(
                checkRequired("modelResponse", modelResponse),
                checkRequired("stepId", stepId),
                stepType,
                checkRequired("turnId", turnId),
                completedAt,
                startedAt,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InferenceStep && modelResponse == other.modelResponse && stepId == other.stepId && stepType == other.stepType && turnId == other.turnId && completedAt == other.completedAt && startedAt == other.startedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(modelResponse, stepId, stepType, turnId, completedAt, startedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InferenceStep{modelResponse=$modelResponse, stepId=$stepId, stepType=$stepType, turnId=$turnId, completedAt=$completedAt, startedAt=$startedAt, additionalProperties=$additionalProperties}"
}
