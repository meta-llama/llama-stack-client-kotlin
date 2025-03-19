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

/** Response containing generated embeddings. */
@NoAutoDetect
class EmbeddingsResponse
@JsonCreator
private constructor(
    @JsonProperty("embeddings")
    @ExcludeMissing
    private val embeddings: JsonField<List<List<Double>>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * List of embedding vectors, one per input content. Each embedding is a list of floats. The
     * dimensionality of the embedding is model-specific; you can check model metadata using
     * /models/{model_id}
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun embeddings(): List<List<Double>> = embeddings.getRequired("embeddings")

    /**
     * Returns the raw JSON value of [embeddings].
     *
     * Unlike [embeddings], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("embeddings")
    @ExcludeMissing
    fun _embeddings(): JsonField<List<List<Double>>> = embeddings

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): EmbeddingsResponse = apply {
        if (validated) {
            return@apply
        }

        embeddings()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EmbeddingsResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .embeddings()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [EmbeddingsResponse]. */
    class Builder internal constructor() {

        private var embeddings: JsonField<MutableList<List<Double>>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(embeddingsResponse: EmbeddingsResponse) = apply {
            embeddings = embeddingsResponse.embeddings.map { it.toMutableList() }
            additionalProperties = embeddingsResponse.additionalProperties.toMutableMap()
        }

        /**
         * List of embedding vectors, one per input content. Each embedding is a list of floats. The
         * dimensionality of the embedding is model-specific; you can check model metadata using
         * /models/{model_id}
         */
        fun embeddings(embeddings: List<List<Double>>) = embeddings(JsonField.of(embeddings))

        /**
         * Sets [Builder.embeddings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.embeddings] with a well-typed `List<List<Double>>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun embeddings(embeddings: JsonField<List<List<Double>>>) = apply {
            this.embeddings = embeddings.map { it.toMutableList() }
        }

        /**
         * Adds a single [List<Double>] to [embeddings].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEmbedding(embedding: List<Double>) = apply {
            embeddings =
                (embeddings ?: JsonField.of(mutableListOf())).also {
                    checkKnown("embeddings", it).add(embedding)
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

        fun build(): EmbeddingsResponse =
            EmbeddingsResponse(
                checkRequired("embeddings", embeddings).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EmbeddingsResponse && embeddings == other.embeddings && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(embeddings, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EmbeddingsResponse{embeddings=$embeddings, additionalProperties=$additionalProperties}"
}
