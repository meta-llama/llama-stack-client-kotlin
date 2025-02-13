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

    fun batch(): List<CompletionResponse> = batch.getRequired("batch")

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

        fun batch(batch: JsonField<List<CompletionResponse>>) = apply {
            this.batch = batch.map { it.toMutableList() }
        }

        fun addBatch(batch: CompletionResponse) = apply {
            this.batch =
                (this.batch ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(batch)
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
                additionalProperties.toImmutable()
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
