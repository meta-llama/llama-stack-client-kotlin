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
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class MemoryRetrievalStep
@JsonCreator
private constructor(
    @JsonProperty("completed_at")
    @ExcludeMissing
    private val completedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("inserted_context")
    @ExcludeMissing
    private val insertedContext: JsonField<InterleavedContent> = JsonMissing.of(),
    @JsonProperty("memory_bank_ids")
    @ExcludeMissing
    private val memoryBankIds: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("started_at")
    @ExcludeMissing
    private val startedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("step_id")
    @ExcludeMissing
    private val stepId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("step_type")
    @ExcludeMissing
    private val stepType: JsonField<StepType> = JsonMissing.of(),
    @JsonProperty("turn_id")
    @ExcludeMissing
    private val turnId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun completedAt(): OffsetDateTime? = completedAt.getNullable("completed_at")

    fun insertedContext(): InterleavedContent = insertedContext.getRequired("inserted_context")

    fun memoryBankIds(): List<String> = memoryBankIds.getRequired("memory_bank_ids")

    fun startedAt(): OffsetDateTime? = startedAt.getNullable("started_at")

    fun stepId(): String = stepId.getRequired("step_id")

    fun stepType(): StepType = stepType.getRequired("step_type")

    fun turnId(): String = turnId.getRequired("turn_id")

    @JsonProperty("completed_at") @ExcludeMissing fun _completedAt() = completedAt

    @JsonProperty("inserted_context") @ExcludeMissing fun _insertedContext() = insertedContext

    @JsonProperty("memory_bank_ids") @ExcludeMissing fun _memoryBankIds() = memoryBankIds

    @JsonProperty("started_at") @ExcludeMissing fun _startedAt() = startedAt

    @JsonProperty("step_id") @ExcludeMissing fun _stepId() = stepId

    @JsonProperty("step_type") @ExcludeMissing fun _stepType() = stepType

    @JsonProperty("turn_id") @ExcludeMissing fun _turnId() = turnId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): MemoryRetrievalStep = apply {
        if (!validated) {
            completedAt()
            insertedContext()
            memoryBankIds()
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
        private var insertedContext: JsonField<InterleavedContent> = JsonMissing.of()
        private var memoryBankIds: JsonField<List<String>> = JsonMissing.of()
        private var startedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var stepId: JsonField<String> = JsonMissing.of()
        private var stepType: JsonField<StepType> = JsonMissing.of()
        private var turnId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(memoryRetrievalStep: MemoryRetrievalStep) = apply {
            completedAt = memoryRetrievalStep.completedAt
            insertedContext = memoryRetrievalStep.insertedContext
            memoryBankIds = memoryRetrievalStep.memoryBankIds
            startedAt = memoryRetrievalStep.startedAt
            stepId = memoryRetrievalStep.stepId
            stepType = memoryRetrievalStep.stepType
            turnId = memoryRetrievalStep.turnId
            additionalProperties = memoryRetrievalStep.additionalProperties.toMutableMap()
        }

        fun completedAt(completedAt: OffsetDateTime) = completedAt(JsonField.of(completedAt))

        fun completedAt(completedAt: JsonField<OffsetDateTime>) = apply {
            this.completedAt = completedAt
        }

        fun insertedContext(insertedContext: InterleavedContent) =
            insertedContext(JsonField.of(insertedContext))

        fun insertedContext(insertedContext: JsonField<InterleavedContent>) = apply {
            this.insertedContext = insertedContext
        }

        fun memoryBankIds(memoryBankIds: List<String>) = memoryBankIds(JsonField.of(memoryBankIds))

        fun memoryBankIds(memoryBankIds: JsonField<List<String>>) = apply {
            this.memoryBankIds = memoryBankIds
        }

        fun startedAt(startedAt: OffsetDateTime) = startedAt(JsonField.of(startedAt))

        fun startedAt(startedAt: JsonField<OffsetDateTime>) = apply { this.startedAt = startedAt }

        fun stepId(stepId: String) = stepId(JsonField.of(stepId))

        fun stepId(stepId: JsonField<String>) = apply { this.stepId = stepId }

        fun stepType(stepType: StepType) = stepType(JsonField.of(stepType))

        fun stepType(stepType: JsonField<StepType>) = apply { this.stepType = stepType }

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

        fun build(): MemoryRetrievalStep =
            MemoryRetrievalStep(
                completedAt,
                insertedContext,
                memoryBankIds.map { it.toImmutable() },
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

        companion object {

            val MEMORY_RETRIEVAL = of("memory_retrieval")

            fun of(value: String) = StepType(JsonField.of(value))
        }

        enum class Known {
            MEMORY_RETRIEVAL,
        }

        enum class Value {
            MEMORY_RETRIEVAL,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                MEMORY_RETRIEVAL -> Value.MEMORY_RETRIEVAL
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                MEMORY_RETRIEVAL -> Known.MEMORY_RETRIEVAL
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

        return /* spotless:off */ other is MemoryRetrievalStep && completedAt == other.completedAt && insertedContext == other.insertedContext && memoryBankIds == other.memoryBankIds && startedAt == other.startedAt && stepId == other.stepId && stepType == other.stepType && turnId == other.turnId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(completedAt, insertedContext, memoryBankIds, startedAt, stepId, stepType, turnId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MemoryRetrievalStep{completedAt=$completedAt, insertedContext=$insertedContext, memoryBankIds=$memoryBankIds, startedAt=$startedAt, stepId=$stepId, stepType=$stepType, turnId=$turnId, additionalProperties=$additionalProperties}"
}
