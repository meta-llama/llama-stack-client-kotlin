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
import com.llama.llamastack.core.checkKnown
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/** A tool execution step in an agent turn. */
class ToolExecutionStep
private constructor(
    private val stepId: JsonField<String>,
    private val stepType: JsonValue,
    private val toolCalls: JsonField<List<ToolCall>>,
    private val toolResponses: JsonField<List<ToolResponse>>,
    private val turnId: JsonField<String>,
    private val completedAt: JsonField<OffsetDateTime>,
    private val startedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("step_id") @ExcludeMissing stepId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("step_type") @ExcludeMissing stepType: JsonValue = JsonMissing.of(),
        @JsonProperty("tool_calls")
        @ExcludeMissing
        toolCalls: JsonField<List<ToolCall>> = JsonMissing.of(),
        @JsonProperty("tool_responses")
        @ExcludeMissing
        toolResponses: JsonField<List<ToolResponse>> = JsonMissing.of(),
        @JsonProperty("turn_id") @ExcludeMissing turnId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("completed_at")
        @ExcludeMissing
        completedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("started_at")
        @ExcludeMissing
        startedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        stepId,
        stepType,
        toolCalls,
        toolResponses,
        turnId,
        completedAt,
        startedAt,
        mutableMapOf(),
    )

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
     * JsonValue.from("tool_execution")
     * ```
     *
     * However, this method can be useful for debugging and logging (e.g. if the server responded
     * with an unexpected value).
     */
    @JsonProperty("step_type") @ExcludeMissing fun _stepType(): JsonValue = stepType

    /**
     * The tool calls to execute.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun toolCalls(): List<ToolCall> = toolCalls.getRequired("tool_calls")

    /**
     * The tool responses from the tool calls.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun toolResponses(): List<ToolResponse> = toolResponses.getRequired("tool_responses")

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
     * Returns the raw JSON value of [stepId].
     *
     * Unlike [stepId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("step_id") @ExcludeMissing fun _stepId(): JsonField<String> = stepId

    /**
     * Returns the raw JSON value of [toolCalls].
     *
     * Unlike [toolCalls], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tool_calls")
    @ExcludeMissing
    fun _toolCalls(): JsonField<List<ToolCall>> = toolCalls

    /**
     * Returns the raw JSON value of [toolResponses].
     *
     * Unlike [toolResponses], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tool_responses")
    @ExcludeMissing
    fun _toolResponses(): JsonField<List<ToolResponse>> = toolResponses

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
         * Returns a mutable builder for constructing an instance of [ToolExecutionStep].
         *
         * The following fields are required:
         * ```kotlin
         * .stepId()
         * .toolCalls()
         * .toolResponses()
         * .turnId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ToolExecutionStep]. */
    class Builder internal constructor() {

        private var stepId: JsonField<String>? = null
        private var stepType: JsonValue = JsonValue.from("tool_execution")
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
         * JsonValue.from("tool_execution")
         * ```
         *
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun stepType(stepType: JsonValue) = apply { this.stepType = stepType }

        /** The tool calls to execute. */
        fun toolCalls(toolCalls: List<ToolCall>) = toolCalls(JsonField.of(toolCalls))

        /**
         * Sets [Builder.toolCalls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolCalls] with a well-typed `List<ToolCall>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun toolCalls(toolCalls: JsonField<List<ToolCall>>) = apply {
            this.toolCalls = toolCalls.map { it.toMutableList() }
        }

        /**
         * Adds a single [ToolCall] to [toolCalls].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addToolCall(toolCall: ToolCall) = apply {
            toolCalls =
                (toolCalls ?: JsonField.of(mutableListOf())).also {
                    checkKnown("toolCalls", it).add(toolCall)
                }
        }

        /** The tool responses from the tool calls. */
        fun toolResponses(toolResponses: List<ToolResponse>) =
            toolResponses(JsonField.of(toolResponses))

        /**
         * Sets [Builder.toolResponses] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolResponses] with a well-typed `List<ToolResponse>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun toolResponses(toolResponses: JsonField<List<ToolResponse>>) = apply {
            this.toolResponses = toolResponses.map { it.toMutableList() }
        }

        /**
         * Adds a single [ToolResponse] to [toolResponses].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addToolResponse(toolResponse: ToolResponse) = apply {
            toolResponses =
                (toolResponses ?: JsonField.of(mutableListOf())).also {
                    checkKnown("toolResponses", it).add(toolResponse)
                }
        }

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
         * Returns an immutable instance of [ToolExecutionStep].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .stepId()
         * .toolCalls()
         * .toolResponses()
         * .turnId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ToolExecutionStep =
            ToolExecutionStep(
                checkRequired("stepId", stepId),
                stepType,
                checkRequired("toolCalls", toolCalls).map { it.toImmutable() },
                checkRequired("toolResponses", toolResponses).map { it.toImmutable() },
                checkRequired("turnId", turnId),
                completedAt,
                startedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ToolExecutionStep = apply {
        if (validated) {
            return@apply
        }

        stepId()
        _stepType().let {
            if (it != JsonValue.from("tool_execution")) {
                throw LlamaStackClientInvalidDataException("'stepType' is invalid, received $it")
            }
        }
        toolCalls().forEach { it.validate() }
        toolResponses().forEach { it.validate() }
        turnId()
        completedAt()
        startedAt()
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
        (if (stepId.asKnown() == null) 0 else 1) +
            stepType.let { if (it == JsonValue.from("tool_execution")) 1 else 0 } +
            (toolCalls.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (toolResponses.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (turnId.asKnown() == null) 0 else 1) +
            (if (completedAt.asKnown() == null) 0 else 1) +
            (if (startedAt.asKnown() == null) 0 else 1)

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
