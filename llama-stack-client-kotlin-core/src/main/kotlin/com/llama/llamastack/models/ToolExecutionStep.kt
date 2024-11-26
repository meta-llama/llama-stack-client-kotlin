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

@JsonDeserialize(builder = ToolExecutionStep.Builder::class)
@NoAutoDetect
class ToolExecutionStep
private constructor(
    private val completedAt: JsonField<OffsetDateTime>,
    private val startedAt: JsonField<OffsetDateTime>,
    private val stepId: JsonField<String>,
    private val stepType: JsonField<StepType>,
    private val toolCalls: JsonField<List<ToolCall>>,
    private val toolResponses: JsonField<List<ToolResponse>>,
    private val turnId: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun completedAt(): OffsetDateTime? = completedAt.getNullable("completed_at")

    fun startedAt(): OffsetDateTime? = startedAt.getNullable("started_at")

    fun stepId(): String = stepId.getRequired("step_id")

    fun stepType(): StepType = stepType.getRequired("step_type")

    fun toolCalls(): List<ToolCall> = toolCalls.getRequired("tool_calls")

    fun toolResponses(): List<ToolResponse> = toolResponses.getRequired("tool_responses")

    fun turnId(): String = turnId.getRequired("turn_id")

    @JsonProperty("completed_at") @ExcludeMissing fun _completedAt() = completedAt

    @JsonProperty("started_at") @ExcludeMissing fun _startedAt() = startedAt

    @JsonProperty("step_id") @ExcludeMissing fun _stepId() = stepId

    @JsonProperty("step_type") @ExcludeMissing fun _stepType() = stepType

    @JsonProperty("tool_calls") @ExcludeMissing fun _toolCalls() = toolCalls

    @JsonProperty("tool_responses") @ExcludeMissing fun _toolResponses() = toolResponses

    @JsonProperty("turn_id") @ExcludeMissing fun _turnId() = turnId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ToolExecutionStep = apply {
        if (!validated) {
            completedAt()
            startedAt()
            stepId()
            stepType()
            toolCalls().forEach { it.validate() }
            toolResponses().forEach { it.validate() }
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
        private var startedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var stepId: JsonField<String> = JsonMissing.of()
        private var stepType: JsonField<StepType> = JsonMissing.of()
        private var toolCalls: JsonField<List<ToolCall>> = JsonMissing.of()
        private var toolResponses: JsonField<List<ToolResponse>> = JsonMissing.of()
        private var turnId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(toolExecutionStep: ToolExecutionStep) = apply {
            this.completedAt = toolExecutionStep.completedAt
            this.startedAt = toolExecutionStep.startedAt
            this.stepId = toolExecutionStep.stepId
            this.stepType = toolExecutionStep.stepType
            this.toolCalls = toolExecutionStep.toolCalls
            this.toolResponses = toolExecutionStep.toolResponses
            this.turnId = toolExecutionStep.turnId
            additionalProperties(toolExecutionStep.additionalProperties)
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

        fun toolCalls(toolCalls: List<ToolCall>) = toolCalls(JsonField.of(toolCalls))

        @JsonProperty("tool_calls")
        @ExcludeMissing
        fun toolCalls(toolCalls: JsonField<List<ToolCall>>) = apply { this.toolCalls = toolCalls }

        fun toolResponses(toolResponses: List<ToolResponse>) =
            toolResponses(JsonField.of(toolResponses))

        @JsonProperty("tool_responses")
        @ExcludeMissing
        fun toolResponses(toolResponses: JsonField<List<ToolResponse>>) = apply {
            this.toolResponses = toolResponses
        }

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

        fun build(): ToolExecutionStep =
            ToolExecutionStep(
                completedAt,
                startedAt,
                stepId,
                stepType,
                toolCalls.map { it.toImmutable() },
                toolResponses.map { it.toImmutable() },
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

            val TOOL_EXECUTION = StepType(JsonField.of("tool_execution"))

            fun of(value: String) = StepType(JsonField.of(value))
        }

        enum class Known {
            TOOL_EXECUTION,
        }

        enum class Value {
            TOOL_EXECUTION,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                TOOL_EXECUTION -> Value.TOOL_EXECUTION
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                TOOL_EXECUTION -> Known.TOOL_EXECUTION
                else -> throw LlamaStackClientInvalidDataException("Unknown StepType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ToolExecutionStep && completedAt == other.completedAt && startedAt == other.startedAt && stepId == other.stepId && stepType == other.stepType && toolCalls == other.toolCalls && toolResponses == other.toolResponses && turnId == other.turnId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(completedAt, startedAt, stepId, stepType, toolCalls, toolResponses, turnId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ToolExecutionStep{completedAt=$completedAt, startedAt=$startedAt, stepId=$stepId, stepType=$stepType, toolCalls=$toolCalls, toolResponses=$toolResponses, turnId=$turnId, additionalProperties=$additionalProperties}"
}
