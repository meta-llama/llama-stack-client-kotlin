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

@JsonDeserialize(builder = EmbeddingsResponse.Builder::class)
@NoAutoDetect
class EmbeddingsResponse
private constructor(
    private val embeddings: JsonField<List<List<Double>>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun embeddings(): List<List<Double>> = embeddings.getRequired("embeddings")

    @JsonProperty("embeddings") @ExcludeMissing fun _embeddings() = embeddings

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): EmbeddingsResponse = apply {
        if (!validated) {
            embeddings()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var embeddings: JsonField<List<List<Double>>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(embeddingsResponse: EmbeddingsResponse) = apply {
            this.embeddings = embeddingsResponse.embeddings
            additionalProperties(embeddingsResponse.additionalProperties)
        }

        fun embeddings(embeddings: List<List<Double>>) = embeddings(JsonField.of(embeddings))

        @JsonProperty("embeddings")
        @ExcludeMissing
        fun embeddings(embeddings: JsonField<List<List<Double>>>) = apply {
            this.embeddings = embeddings
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

        fun build(): EmbeddingsResponse =
            EmbeddingsResponse(
                embeddings.map { it.toImmutable() },
                additionalProperties.toImmutable()
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EmbeddingsResponse && this.embeddings == other.embeddings && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(embeddings, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "EmbeddingsResponse{embeddings=$embeddings, additionalProperties=$additionalProperties}"
}
