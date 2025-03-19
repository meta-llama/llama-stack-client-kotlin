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
import com.llama.llamastack.core.checkKnown
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

@NoAutoDetect
class BatchCompletion
@JsonCreator
private constructor(
    @JsonProperty("batch")
    @ExcludeMissing
    private val batch: JsonField<List<CompletionResponse>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun batch(): List<CompletionResponse> = batch.getRequired("batch")

    /**
     * Returns the raw JSON value of [batch].
     *
     * Unlike [batch], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("batch") @ExcludeMissing fun _batch(): JsonField<List<CompletionResponse>> = batch

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): BatchCompletion = apply {
        if (validated) {
            return@apply
        }

        batch().forEach { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BatchCompletion].
         *
         * The following fields are required:
         * ```kotlin
         * .batch()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [BatchCompletion]. */
    class Builder internal constructor() {

        private var batch: JsonField<MutableList<CompletionResponse>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(batchCompletion: BatchCompletion) = apply {
            batch = batchCompletion.batch.map { it.toMutableList() }
            additionalProperties = batchCompletion.additionalProperties.toMutableMap()
        }

        fun batch(batch: List<CompletionResponse>) = batch(JsonField.of(batch))

        /**
         * Sets [Builder.batch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.batch] with a well-typed `List<CompletionResponse>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun batch(batch: JsonField<List<CompletionResponse>>) = apply {
            this.batch = batch.map { it.toMutableList() }
        }

        /**
         * Adds a single [CompletionResponse] to [Builder.batch].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBatch(batch: CompletionResponse) = apply {
            this.batch =
                (this.batch ?: JsonField.of(mutableListOf())).also {
                    checkKnown("batch", it).add(batch)
                }
        }

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

        fun build(): BatchCompletion =
            BatchCompletion(
                checkRequired("batch", batch).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BatchCompletion && batch == other.batch && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(batch, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BatchCompletion{batch=$batch, additionalProperties=$additionalProperties}"
}
