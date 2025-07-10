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
import java.util.Collections
import java.util.Objects

class InferenceBatchChatCompletionResponse
private constructor(
    private val batch: JsonField<List<ChatCompletionResponse>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("batch")
        @ExcludeMissing
        batch: JsonField<List<ChatCompletionResponse>> = JsonMissing.of()
    ) : this(batch, mutableMapOf())

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun batch(): List<ChatCompletionResponse> = batch.getRequired("batch")

    /**
     * Returns the raw JSON value of [batch].
     *
     * Unlike [batch], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("batch")
    @ExcludeMissing
    fun _batch(): JsonField<List<ChatCompletionResponse>> = batch

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
         * Returns a mutable builder for constructing an instance of
         * [InferenceBatchChatCompletionResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .batch()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [InferenceBatchChatCompletionResponse]. */
    class Builder internal constructor() {

        private var batch: JsonField<MutableList<ChatCompletionResponse>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            inferenceBatchChatCompletionResponse: InferenceBatchChatCompletionResponse
        ) = apply {
            batch = inferenceBatchChatCompletionResponse.batch.map { it.toMutableList() }
            additionalProperties =
                inferenceBatchChatCompletionResponse.additionalProperties.toMutableMap()
        }

        fun batch(batch: List<ChatCompletionResponse>) = batch(JsonField.of(batch))

        /**
         * Sets [Builder.batch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.batch] with a well-typed `List<ChatCompletionResponse>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun batch(batch: JsonField<List<ChatCompletionResponse>>) = apply {
            this.batch = batch.map { it.toMutableList() }
        }

        /**
         * Adds a single [ChatCompletionResponse] to [Builder.batch].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBatch(batch: ChatCompletionResponse) = apply {
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

        /**
         * Returns an immutable instance of [InferenceBatchChatCompletionResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .batch()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InferenceBatchChatCompletionResponse =
            InferenceBatchChatCompletionResponse(
                checkRequired("batch", batch).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InferenceBatchChatCompletionResponse = apply {
        if (validated) {
            return@apply
        }

        batch().forEach { it.validate() }
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
    internal fun validity(): Int = (batch.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InferenceBatchChatCompletionResponse && batch == other.batch && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(batch, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InferenceBatchChatCompletionResponse{batch=$batch, additionalProperties=$additionalProperties}"
}
