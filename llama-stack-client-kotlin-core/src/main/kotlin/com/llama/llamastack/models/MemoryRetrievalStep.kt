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
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/** A memory retrieval step in an agent turn. */
class MemoryRetrievalStep
private constructor(
    private val insertedContext: JsonField<InterleavedContent>,
    private val stepId: JsonField<String>,
    private val stepType: JsonValue,
    private val turnId: JsonField<String>,
    private val vectorDbIds: JsonField<String>,
    private val completedAt: JsonField<OffsetDateTime>,
    private val startedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("inserted_context")
        @ExcludeMissing
        insertedContext: JsonField<InterleavedContent> = JsonMissing.of(),
        @JsonProperty("step_id") @ExcludeMissing stepId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("step_type") @ExcludeMissing stepType: JsonValue = JsonMissing.of(),
        @JsonProperty("turn_id") @ExcludeMissing turnId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vector_db_ids")
        @ExcludeMissing
        vectorDbIds: JsonField<String> = JsonMissing.of(),
        @JsonProperty("completed_at")
        @ExcludeMissing
        completedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("started_at")
        @ExcludeMissing
        startedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        insertedContext,
        stepId,
        stepType,
        turnId,
        vectorDbIds,
        completedAt,
        startedAt,
        mutableMapOf(),
    )

    /**
     * The context retrieved from the vector databases.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun insertedContext(): InterleavedContent = insertedContext.getRequired("inserted_context")

    /**
     * The ID of the step.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun stepId(): String = stepId.getRequired("step_id")

    /**
     * Type of the step in an agent turn.
     *
     * Expected to always return the following:
     * ```kotlin
     * JsonValue.from("memory_retrieval")
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
     * The IDs of the vector databases to retrieve context from.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun vectorDbIds(): String = vectorDbIds.getRequired("vector_db_ids")

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
     * Returns the raw JSON value of [insertedContext].
     *
     * Unlike [insertedContext], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inserted_context")
    @ExcludeMissing
    fun _insertedContext(): JsonField<InterleavedContent> = insertedContext

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
     * Returns the raw JSON value of [vectorDbIds].
     *
     * Unlike [vectorDbIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vector_db_ids")
    @ExcludeMissing
    fun _vectorDbIds(): JsonField<String> = vectorDbIds

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
         * Returns a mutable builder for constructing an instance of [MemoryRetrievalStep].
         *
         * The following fields are required:
         * ```kotlin
         * .insertedContext()
         * .stepId()
         * .turnId()
         * .vectorDbIds()
         * ```
         */
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

        /** The context retrieved from the vector databases. */
        fun insertedContext(insertedContext: InterleavedContent) =
            insertedContext(JsonField.of(insertedContext))

        /**
         * Sets [Builder.insertedContext] to an arbitrary JSON value.
         *
         * You should usually call [Builder.insertedContext] with a well-typed [InterleavedContent]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun insertedContext(insertedContext: JsonField<InterleavedContent>) = apply {
            this.insertedContext = insertedContext
        }

        /** Alias for calling [insertedContext] with `InterleavedContent.ofString(string)`. */
        fun insertedContext(string: String) = insertedContext(InterleavedContent.ofString(string))

        /**
         * Alias for calling [insertedContext] with
         * `InterleavedContent.ofImageContentItem(imageContentItem)`.
         */
        fun insertedContext(imageContentItem: InterleavedContent.ImageContentItem) =
            insertedContext(InterleavedContent.ofImageContentItem(imageContentItem))

        /**
         * Alias for calling [insertedContext] with
         * `InterleavedContent.ofTextContentItem(textContentItem)`.
         */
        fun insertedContext(textContentItem: InterleavedContent.TextContentItem) =
            insertedContext(InterleavedContent.ofTextContentItem(textContentItem))

        /** Alias for calling [insertedContext] with `InterleavedContent.ofItems(items)`. */
        fun insertedContextOfItems(items: List<InterleavedContentItem>) =
            insertedContext(InterleavedContent.ofItems(items))

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
         * JsonValue.from("memory_retrieval")
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

        /** The IDs of the vector databases to retrieve context from. */
        fun vectorDbIds(vectorDbIds: String) = vectorDbIds(JsonField.of(vectorDbIds))

        /**
         * Sets [Builder.vectorDbIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vectorDbIds] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun vectorDbIds(vectorDbIds: JsonField<String>) = apply { this.vectorDbIds = vectorDbIds }

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
         * Returns an immutable instance of [MemoryRetrievalStep].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .insertedContext()
         * .stepId()
         * .turnId()
         * .vectorDbIds()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MemoryRetrievalStep =
            MemoryRetrievalStep(
                checkRequired("insertedContext", insertedContext),
                checkRequired("stepId", stepId),
                stepType,
                checkRequired("turnId", turnId),
                checkRequired("vectorDbIds", vectorDbIds),
                completedAt,
                startedAt,
                additionalProperties.toMutableMap(),
            )
    }

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
        (insertedContext.asKnown()?.validity() ?: 0) +
            (if (stepId.asKnown() == null) 0 else 1) +
            stepType.let { if (it == JsonValue.from("memory_retrieval")) 1 else 0 } +
            (if (turnId.asKnown() == null) 0 else 1) +
            (if (vectorDbIds.asKnown() == null) 0 else 1) +
            (if (completedAt.asKnown() == null) 0 else 1) +
            (if (startedAt.asKnown() == null) 0 else 1)

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
