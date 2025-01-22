// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.llama.llamastack.core.Enum
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
class ToolExecutionStep
@JsonCreator
private constructor(
    @JsonProperty("step_id")
    @ExcludeMissing
    private val stepId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("step_type")
    @ExcludeMissing
    private val stepType: JsonField<StepType> = JsonMissing.of(),
    @JsonProperty("tool_calls")
    @ExcludeMissing
    private val toolCalls: JsonField<List<ToolCall>> = JsonMissing.of(),
    @JsonProperty("tool_responses")
    @ExcludeMissing
    private val toolResponses: JsonField<List<ToolResponse>> = JsonMissing.of(),
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

    fun stepId(): String = stepId.getRequired("step_id")

    fun stepType(): StepType = stepType.getRequired("step_type")

    fun toolCalls(): List<ToolCall> = toolCalls.getRequired("tool_calls")

    fun toolResponses(): List<ToolResponse> = toolResponses.getRequired("tool_responses")

    fun turnId(): String = turnId.getRequired("turn_id")

    fun completedAt(): OffsetDateTime? = completedAt.getNullable("completed_at")

    fun startedAt(): OffsetDateTime? = startedAt.getNullable("started_at")

    @JsonProperty("step_id") @ExcludeMissing fun _stepId(): JsonField<String> = stepId

    @JsonProperty("step_type") @ExcludeMissing fun _stepType(): JsonField<StepType> = stepType

    @JsonProperty("tool_calls")
    @ExcludeMissing
    fun _toolCalls(): JsonField<List<ToolCall>> = toolCalls

    @JsonProperty("tool_responses")
    @ExcludeMissing
    fun _toolResponses(): JsonField<List<ToolResponse>> = toolResponses

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

    fun validate(): ToolExecutionStep = apply {
        if (validated) {
            return@apply
        }

        stepId()
        stepType()
        toolCalls().forEach { it.validate() }
        toolResponses().forEach { it.validate() }
        turnId()
        completedAt()
        startedAt()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var stepId: JsonField<String>? = null
        private var stepType: JsonField<StepType>? = null
        private var toolCalls: JsonField<MutableList<ToolCall>>? = null
        private var toolResponses: JsonField<MutableList<ToolResponse>>? = null
        private var turnId: JsonField<String>? = null
        private var completedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var startedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(toolExecutionStep: ToolExecutionStep) = apply {
            stepId = toolExecutionStep.stepId
            stepType = toolExecutionStep.stepType
            toolCalls = toolExecutionStep.toolCalls.map { it.toMutableList() }
            toolResponses = toolExecutionStep.toolResponses.map { it.toMutableList() }
            turnId = toolExecutionStep.turnId
            completedAt = toolExecutionStep.completedAt
            startedAt = toolExecutionStep.startedAt
            additionalProperties = toolExecutionStep.additionalProperties.toMutableMap()
        }

        fun stepId(stepId: String) = stepId(JsonField.of(stepId))

        fun stepId(stepId: JsonField<String>) = apply { this.stepId = stepId }

        fun stepType(stepType: StepType) = stepType(JsonField.of(stepType))

        fun stepType(stepType: JsonField<StepType>) = apply { this.stepType = stepType }

        fun toolCalls(toolCalls: List<ToolCall>) = toolCalls(JsonField.of(toolCalls))

        fun toolCalls(toolCalls: JsonField<List<ToolCall>>) = apply {
            this.toolCalls = toolCalls.map { it.toMutableList() }
        }

        fun addToolCall(toolCall: ToolCall) = apply {
            toolCalls =
                (toolCalls ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(toolCall)
                }
        }

        fun toolResponses(toolResponses: List<ToolResponse>) =
            toolResponses(JsonField.of(toolResponses))

        fun toolResponses(toolResponses: JsonField<List<ToolResponse>>) = apply {
            this.toolResponses = toolResponses.map { it.toMutableList() }
        }

        fun addToolResponse(toolResponse: ToolResponse) = apply {
            toolResponses =
                (toolResponses ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(toolResponse)
                }
        }

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

        fun build(): ToolExecutionStep =
            ToolExecutionStep(
                checkRequired("stepId", stepId),
                checkRequired("stepType", stepType),
                checkRequired("toolCalls", toolCalls).map { it.toImmutable() },
                checkRequired("toolResponses", toolResponses).map { it.toImmutable() },
                checkRequired("turnId", turnId),
                completedAt,
                startedAt,
                additionalProperties.toImmutable(),
            )
    }

    class StepType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val TOOL_EXECUTION = of("tool_execution")

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

        return /* spotless:off */ other is ToolExecutionStep && stepId == other.stepId && stepType == other.stepType && toolCalls == other.toolCalls && toolResponses == other.toolResponses && turnId == other.turnId && completedAt == other.completedAt && startedAt == other.startedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(stepId, stepType, toolCalls, toolResponses, turnId, completedAt, startedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ToolExecutionStep{stepId=$stepId, stepType=$stepType, toolCalls=$toolCalls, toolResponses=$toolResponses, turnId=$turnId, completedAt=$completedAt, startedAt=$startedAt, additionalProperties=$additionalProperties}"
}
