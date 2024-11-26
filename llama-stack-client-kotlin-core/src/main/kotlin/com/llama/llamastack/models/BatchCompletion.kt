// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.toImmutable
import java.util.Objects

@JsonDeserialize(builder = BatchCompletion.Builder::class)
@NoAutoDetect
class BatchCompletion
private constructor(
    private val completionMessageBatch: JsonField<List<CompletionMessage>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun completionMessageBatch(): List<CompletionMessage> =
        completionMessageBatch.getRequired("completion_message_batch")

    @JsonProperty("completion_message_batch")
    @ExcludeMissing
    fun _completionMessageBatch() = completionMessageBatch

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): BatchCompletion = apply {
        if (!validated) {
            completionMessageBatch().forEach { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var completionMessageBatch: JsonField<List<CompletionMessage>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(batchCompletion: BatchCompletion) = apply {
            this.completionMessageBatch = batchCompletion.completionMessageBatch
            additionalProperties(batchCompletion.additionalProperties)
        }

        fun completionMessageBatch(completionMessageBatch: List<CompletionMessage>) =
            completionMessageBatch(JsonField.of(completionMessageBatch))

        @JsonProperty("completion_message_batch")
        @ExcludeMissing
        fun completionMessageBatch(completionMessageBatch: JsonField<List<CompletionMessage>>) =
            apply {
                this.completionMessageBatch = completionMessageBatch
            }

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

        fun build(): BatchCompletion =
            BatchCompletion(
                completionMessageBatch.map { it.toImmutable() },
                additionalProperties.toImmutable()
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BatchCompletion && completionMessageBatch == other.completionMessageBatch && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(completionMessageBatch, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BatchCompletion{completionMessageBatch=$completionMessageBatch, additionalProperties=$additionalProperties}"
}
