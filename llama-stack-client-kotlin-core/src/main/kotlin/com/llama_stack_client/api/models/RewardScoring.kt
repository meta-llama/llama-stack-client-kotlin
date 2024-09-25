// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.llama_stack_client.api.core.ExcludeMissing
import com.llama_stack_client.api.core.JsonField
import com.llama_stack_client.api.core.JsonMissing
import com.llama_stack_client.api.core.JsonValue
import com.llama_stack_client.api.core.NoAutoDetect
import com.llama_stack_client.api.core.toUnmodifiable
import java.util.Objects

@JsonDeserialize(builder = RewardScoring.Builder::class)
@NoAutoDetect
class RewardScoring
private constructor(
    private val scoredGenerations: JsonField<List<ScoredDialogGenerations>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun scoredGenerations(): List<ScoredDialogGenerations> =
        scoredGenerations.getRequired("scored_generations")

    @JsonProperty("scored_generations") @ExcludeMissing fun _scoredGenerations() = scoredGenerations

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): RewardScoring = apply {
        if (!validated) {
            scoredGenerations().forEach { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RewardScoring &&
            this.scoredGenerations == other.scoredGenerations &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = Objects.hash(scoredGenerations, additionalProperties)
        }
        return hashCode
    }

    override fun toString() =
        "RewardScoring{scoredGenerations=$scoredGenerations, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var scoredGenerations: JsonField<List<ScoredDialogGenerations>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(rewardScoring: RewardScoring) = apply {
            this.scoredGenerations = rewardScoring.scoredGenerations
            additionalProperties(rewardScoring.additionalProperties)
        }

        fun scoredGenerations(scoredGenerations: List<ScoredDialogGenerations>) =
            scoredGenerations(JsonField.of(scoredGenerations))

        @JsonProperty("scored_generations")
        @ExcludeMissing
        fun scoredGenerations(scoredGenerations: JsonField<List<ScoredDialogGenerations>>) = apply {
            this.scoredGenerations = scoredGenerations
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

        fun build(): RewardScoring =
            RewardScoring(
                scoredGenerations.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable()
            )
    }
}
