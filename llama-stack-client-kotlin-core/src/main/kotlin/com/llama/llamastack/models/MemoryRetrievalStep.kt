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
class MemoryRetrievalStep
@JsonCreator
private constructor(
    @JsonProperty("inserted_context")
    @ExcludeMissing
    private val insertedContext: JsonField<InterleavedContent> = JsonMissing.of(),
    @JsonProperty("step_id")
    @ExcludeMissing
    private val stepId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("step_type") @ExcludeMissing private val stepType: JsonValue = JsonMissing.of(),
    @JsonProperty("turn_id")
    @ExcludeMissing
    private val turnId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("vector_db_ids")
    @ExcludeMissing
    private val vectorDbIds: JsonField<String> = JsonMissing.of(),
    @JsonProperty("completed_at")
    @ExcludeMissing
    private val completedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("started_at")
    @ExcludeMissing
    private val startedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** A image content item */
    fun insertedContext(): InterleavedContent = insertedContext.getRequired("inserted_context")

    fun stepId(): String = stepId.getRequired("step_id")

    @JsonProperty("step_type") @ExcludeMissing fun _stepType(): JsonValue = stepType

    fun turnId(): String = turnId.getRequired("turn_id")

    fun vectorDbIds(): String = vectorDbIds.getRequired("vector_db_ids")

    fun completedAt(): OffsetDateTime? = completedAt.getNullable("completed_at")

    fun startedAt(): OffsetDateTime? = startedAt.getNullable("started_at")

    /** A image content item */
    @JsonProperty("inserted_context")
    @ExcludeMissing
    fun _insertedContext(): JsonField<InterleavedContent> = insertedContext

    @JsonProperty("step_id") @ExcludeMissing fun _stepId(): JsonField<String> = stepId

    @JsonProperty("turn_id") @ExcludeMissing fun _turnId(): JsonField<String> = turnId

    @JsonProperty("vector_db_ids")
    @ExcludeMissing
    fun _vectorDbIds(): JsonField<String> = vectorDbIds

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
        stepId()
        _stepType().let {
            if (it != JsonValue.from("memory_retrieval")) {
                throw LlamaStackClientInvalidDataException("'stepType' is invalid, received $it")
            }
        }
        turnId()
        vectorDbIds()
        completedAt()
        startedAt()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [MemoryRetrievalStep]. */
    class Builder internal constructor() {

        private var insertedContext: JsonField<InterleavedContent>? = null
        private var stepId: JsonField<String>? = null
        private var stepType: JsonValue = JsonValue.from("memory_retrieval")
        private var turnId: JsonField<String>? = null
        private var vectorDbIds: JsonField<String>? = null
        private var completedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var startedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(memoryRetrievalStep: MemoryRetrievalStep) = apply {
            insertedContext = memoryRetrievalStep.insertedContext
            stepId = memoryRetrievalStep.stepId
            stepType = memoryRetrievalStep.stepType
            turnId = memoryRetrievalStep.turnId
            vectorDbIds = memoryRetrievalStep.vectorDbIds
            completedAt = memoryRetrievalStep.completedAt
            startedAt = memoryRetrievalStep.startedAt
            additionalProperties = memoryRetrievalStep.additionalProperties.toMutableMap()
        }

        /** A image content item */
        fun insertedContext(insertedContext: InterleavedContent) =
            insertedContext(JsonField.of(insertedContext))

        /** A image content item */
        fun insertedContext(insertedContext: JsonField<InterleavedContent>) = apply {
            this.insertedContext = insertedContext
        }

        /** A image content item */
        fun insertedContext(string: String) = insertedContext(InterleavedContent.ofString(string))

        /** A image content item */
        fun insertedContext(imageContentItem: InterleavedContent.ImageContentItem) =
            insertedContext(InterleavedContent.ofImageContentItem(imageContentItem))

        /** A text content item */
        fun insertedContext(textContentItem: InterleavedContent.TextContentItem) =
            insertedContext(InterleavedContent.ofTextContentItem(textContentItem))

        /** A image content item */
        fun insertedContextOfItems(items: List<InterleavedContentItem>) =
            insertedContext(InterleavedContent.ofItems(items))

        fun stepId(stepId: String) = stepId(JsonField.of(stepId))

        fun stepId(stepId: JsonField<String>) = apply { this.stepId = stepId }

        fun stepType(stepType: JsonValue) = apply { this.stepType = stepType }

        fun turnId(turnId: String) = turnId(JsonField.of(turnId))

        fun turnId(turnId: JsonField<String>) = apply { this.turnId = turnId }

        fun vectorDbIds(vectorDbIds: String) = vectorDbIds(JsonField.of(vectorDbIds))

        fun vectorDbIds(vectorDbIds: JsonField<String>) = apply { this.vectorDbIds = vectorDbIds }

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
                checkRequired("insertedContext", insertedContext),
                checkRequired("stepId", stepId),
                stepType,
                checkRequired("turnId", turnId),
                checkRequired("vectorDbIds", vectorDbIds),
                completedAt,
                startedAt,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is MemoryRetrievalStep && insertedContext == other.insertedContext && stepId == other.stepId && stepType == other.stepType && turnId == other.turnId && vectorDbIds == other.vectorDbIds && completedAt == other.completedAt && startedAt == other.startedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(insertedContext, stepId, stepType, turnId, vectorDbIds, completedAt, startedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MemoryRetrievalStep{insertedContext=$insertedContext, stepId=$stepId, stepType=$stepType, turnId=$turnId, vectorDbIds=$vectorDbIds, completedAt=$completedAt, startedAt=$startedAt, additionalProperties=$additionalProperties}"
}
