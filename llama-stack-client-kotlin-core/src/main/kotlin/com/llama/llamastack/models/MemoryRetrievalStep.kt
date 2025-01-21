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
    @JsonProperty("inserted_context")
    @ExcludeMissing
    private val insertedContext: JsonField<InterleavedContent> = JsonMissing.of(),
    @JsonProperty("memory_bank_ids")
    @ExcludeMissing
    private val memoryBankIds: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("step_id")
    @ExcludeMissing
    private val stepId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("step_type")
    @ExcludeMissing
    private val stepType: JsonField<StepType> = JsonMissing.of(),
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

    fun insertedContext(): InterleavedContent = insertedContext.getRequired("inserted_context")

    fun memoryBankIds(): List<String> = memoryBankIds.getRequired("memory_bank_ids")

    fun stepId(): String = stepId.getRequired("step_id")

    fun stepType(): StepType = stepType.getRequired("step_type")

    fun turnId(): String = turnId.getRequired("turn_id")

    fun completedAt(): OffsetDateTime? = completedAt.getNullable("completed_at")

    fun startedAt(): OffsetDateTime? = startedAt.getNullable("started_at")

    @JsonProperty("inserted_context")
    @ExcludeMissing
    fun _insertedContext(): JsonField<InterleavedContent> = insertedContext

    @JsonProperty("memory_bank_ids")
    @ExcludeMissing
    fun _memoryBankIds(): JsonField<List<String>> = memoryBankIds

    @JsonProperty("step_id") @ExcludeMissing fun _stepId(): JsonField<String> = stepId

    @JsonProperty("step_type") @ExcludeMissing fun _stepType(): JsonField<StepType> = stepType

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

    fun validate(): MemoryRetrievalStep = apply {
        if (validated) {
            return@apply
        }

        insertedContext().validate()
        memoryBankIds()
        stepId()
        stepType()
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

        private var insertedContext: JsonField<InterleavedContent>? = null
        private var memoryBankIds: JsonField<MutableList<String>>? = null
        private var stepId: JsonField<String>? = null
        private var stepType: JsonField<StepType>? = null
        private var turnId: JsonField<String>? = null
        private var completedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var startedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(memoryRetrievalStep: MemoryRetrievalStep) = apply {
            insertedContext = memoryRetrievalStep.insertedContext
            memoryBankIds = memoryRetrievalStep.memoryBankIds.map { it.toMutableList() }
            stepId = memoryRetrievalStep.stepId
            stepType = memoryRetrievalStep.stepType
            turnId = memoryRetrievalStep.turnId
            completedAt = memoryRetrievalStep.completedAt
            startedAt = memoryRetrievalStep.startedAt
            additionalProperties = memoryRetrievalStep.additionalProperties.toMutableMap()
        }

        fun insertedContext(insertedContext: InterleavedContent) =
            insertedContext(JsonField.of(insertedContext))

        fun insertedContext(insertedContext: JsonField<InterleavedContent>) = apply {
            this.insertedContext = insertedContext
        }

        fun insertedContext(string: String) = insertedContext(InterleavedContent.ofString(string))

        fun insertedContext(imageContentItem: InterleavedContent.ImageContentItem) =
            insertedContext(InterleavedContent.ofImageContentItem(imageContentItem))

        fun insertedContext(textContentItem: InterleavedContent.TextContentItem) =
            insertedContext(InterleavedContent.ofTextContentItem(textContentItem))

        fun insertedContextOfInterleavedContentItems(
            interleavedContentItems: List<InterleavedContentItem>
        ) = insertedContext(InterleavedContent.ofInterleavedContentItems(interleavedContentItems))

        fun memoryBankIds(memoryBankIds: List<String>) = memoryBankIds(JsonField.of(memoryBankIds))

        fun memoryBankIds(memoryBankIds: JsonField<List<String>>) = apply {
            this.memoryBankIds = memoryBankIds.map { it.toMutableList() }
        }

        fun addMemoryBankId(memoryBankId: String) = apply {
            memoryBankIds =
                (memoryBankIds ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(memoryBankId)
                }
        }

        fun stepId(stepId: String) = stepId(JsonField.of(stepId))

        fun stepId(stepId: JsonField<String>) = apply { this.stepId = stepId }

        fun stepType(stepType: StepType) = stepType(JsonField.of(stepType))

        fun stepType(stepType: JsonField<StepType>) = apply { this.stepType = stepType }

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

        fun build(): MemoryRetrievalStep =
            MemoryRetrievalStep(
                checkNotNull(insertedContext) { "`insertedContext` is required but was not set" },
                checkNotNull(memoryBankIds) { "`memoryBankIds` is required but was not set" }
                    .map { it.toImmutable() },
                checkNotNull(stepId) { "`stepId` is required but was not set" },
                checkNotNull(stepType) { "`stepType` is required but was not set" },
                checkNotNull(turnId) { "`turnId` is required but was not set" },
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

        return /* spotless:off */ other is MemoryRetrievalStep && insertedContext == other.insertedContext && memoryBankIds == other.memoryBankIds && stepId == other.stepId && stepType == other.stepType && turnId == other.turnId && completedAt == other.completedAt && startedAt == other.startedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(insertedContext, memoryBankIds, stepId, stepType, turnId, completedAt, startedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MemoryRetrievalStep{insertedContext=$insertedContext, memoryBankIds=$memoryBankIds, stepId=$stepId, stepType=$stepType, turnId=$turnId, completedAt=$completedAt, startedAt=$startedAt, additionalProperties=$additionalProperties}"
}
