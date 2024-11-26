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

@JsonDeserialize(builder = InferenceStep.Builder::class)
@NoAutoDetect
class InferenceStep
private constructor(
    private val completedAt: JsonField<OffsetDateTime>,
    private val modelResponse: JsonField<CompletionMessage>,
    private val startedAt: JsonField<OffsetDateTime>,
    private val stepId: JsonField<String>,
    private val stepType: JsonField<StepType>,
    private val turnId: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun completedAt(): OffsetDateTime? = completedAt.getNullable("completed_at")

    fun modelResponse(): CompletionMessage = modelResponse.getRequired("model_response")

    fun startedAt(): OffsetDateTime? = startedAt.getNullable("started_at")

    fun stepId(): String = stepId.getRequired("step_id")

    fun stepType(): StepType = stepType.getRequired("step_type")

    fun turnId(): String = turnId.getRequired("turn_id")

    @JsonProperty("completed_at") @ExcludeMissing fun _completedAt() = completedAt

    @JsonProperty("model_response") @ExcludeMissing fun _modelResponse() = modelResponse

    @JsonProperty("started_at") @ExcludeMissing fun _startedAt() = startedAt

    @JsonProperty("step_id") @ExcludeMissing fun _stepId() = stepId

    @JsonProperty("step_type") @ExcludeMissing fun _stepType() = stepType

    @JsonProperty("turn_id") @ExcludeMissing fun _turnId() = turnId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): InferenceStep = apply {
        if (!validated) {
            completedAt()
            modelResponse().validate()
            startedAt()
            stepId()
            stepType()
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
        private var modelResponse: JsonField<CompletionMessage> = JsonMissing.of()
        private var startedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var stepId: JsonField<String> = JsonMissing.of()
        private var stepType: JsonField<StepType> = JsonMissing.of()
        private var turnId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(inferenceStep: InferenceStep) = apply {
            this.completedAt = inferenceStep.completedAt
            this.modelResponse = inferenceStep.modelResponse
            this.startedAt = inferenceStep.startedAt
            this.stepId = inferenceStep.stepId
            this.stepType = inferenceStep.stepType
            this.turnId = inferenceStep.turnId
            additionalProperties(inferenceStep.additionalProperties)
        }

        fun completedAt(completedAt: OffsetDateTime) = completedAt(JsonField.of(completedAt))

        @JsonProperty("completed_at")
        @ExcludeMissing
        fun completedAt(completedAt: JsonField<OffsetDateTime>) = apply {
            this.completedAt = completedAt
        }

        fun modelResponse(modelResponse: CompletionMessage) =
            modelResponse(JsonField.of(modelResponse))

        @JsonProperty("model_response")
        @ExcludeMissing
        fun modelResponse(modelResponse: JsonField<CompletionMessage>) = apply {
            this.modelResponse = modelResponse
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

        fun build(): InferenceStep =
            InferenceStep(
                completedAt,
                modelResponse,
                startedAt,
                stepId,
                stepType,
                turnId,
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

            return /* spotless:off */ other is StepType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val INFERENCE = StepType(JsonField.of("inference"))

            fun of(value: String) = StepType(JsonField.of(value))
        }

        enum class Known {
            INFERENCE,
        }

        enum class Value {
            INFERENCE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                INFERENCE -> Value.INFERENCE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                INFERENCE -> Known.INFERENCE
                else -> throw LlamaStackClientInvalidDataException("Unknown StepType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InferenceStep && completedAt == other.completedAt && modelResponse == other.modelResponse && startedAt == other.startedAt && stepId == other.stepId && stepType == other.stepType && turnId == other.turnId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(completedAt, modelResponse, startedAt, stepId, stepType, turnId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InferenceStep{completedAt=$completedAt, modelResponse=$modelResponse, startedAt=$startedAt, stepId=$stepId, stepType=$stepType, turnId=$turnId, additionalProperties=$additionalProperties}"
}
