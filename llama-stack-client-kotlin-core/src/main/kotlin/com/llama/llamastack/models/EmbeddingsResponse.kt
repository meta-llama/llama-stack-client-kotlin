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
class EmbeddingsResponse
@JsonCreator
private constructor(
    @JsonProperty("embeddings")
    @ExcludeMissing
    private val embeddings: JsonField<List<List<Double>>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun embeddings(): List<List<Double>> = embeddings.getRequired("embeddings")

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

        fun builder() = Builder()
    }

    class Builder {

        private var embeddings: JsonField<MutableList<List<Double>>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(embeddingsResponse: EmbeddingsResponse) = apply {
            embeddings = embeddingsResponse.embeddings.map { it.toMutableList() }
            additionalProperties = embeddingsResponse.additionalProperties.toMutableMap()
        }

        fun embeddings(embeddings: List<List<Double>>) = embeddings(JsonField.of(embeddings))

        fun embeddings(embeddings: JsonField<List<List<Double>>>) = apply {
            this.embeddings = embeddings.map { it.toMutableList() }
        }

        fun addEmbedding(embedding: List<Double>) = apply {
            embeddings =
                (embeddings ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(embedding)
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
                additionalProperties.toImmutable()
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
