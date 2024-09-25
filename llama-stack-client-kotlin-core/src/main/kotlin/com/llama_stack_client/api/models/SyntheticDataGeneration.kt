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

@JsonDeserialize(builder = SyntheticDataGeneration.Builder::class)
@NoAutoDetect
class SyntheticDataGeneration
private constructor(
    private val statistics: JsonField<Statistics>,
    private val syntheticData: JsonField<List<ScoredDialogGenerations>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun statistics(): Statistics? = statistics.getNullable("statistics")

    fun syntheticData(): List<ScoredDialogGenerations> = syntheticData.getRequired("synthetic_data")

    @JsonProperty("statistics") @ExcludeMissing fun _statistics() = statistics

    @JsonProperty("synthetic_data") @ExcludeMissing fun _syntheticData() = syntheticData

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): SyntheticDataGeneration = apply {
        if (!validated) {
            statistics()?.validate()
            syntheticData().forEach { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SyntheticDataGeneration &&
            this.statistics == other.statistics &&
            this.syntheticData == other.syntheticData &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    statistics,
                    syntheticData,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "SyntheticDataGeneration{statistics=$statistics, syntheticData=$syntheticData, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var statistics: JsonField<Statistics> = JsonMissing.of()
        private var syntheticData: JsonField<List<ScoredDialogGenerations>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(syntheticDataGeneration: SyntheticDataGeneration) = apply {
            this.statistics = syntheticDataGeneration.statistics
            this.syntheticData = syntheticDataGeneration.syntheticData
            additionalProperties(syntheticDataGeneration.additionalProperties)
        }

        fun statistics(statistics: Statistics) = statistics(JsonField.of(statistics))

        @JsonProperty("statistics")
        @ExcludeMissing
        fun statistics(statistics: JsonField<Statistics>) = apply { this.statistics = statistics }

        fun syntheticData(syntheticData: List<ScoredDialogGenerations>) =
            syntheticData(JsonField.of(syntheticData))

        @JsonProperty("synthetic_data")
        @ExcludeMissing
        fun syntheticData(syntheticData: JsonField<List<ScoredDialogGenerations>>) = apply {
            this.syntheticData = syntheticData
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

        fun build(): SyntheticDataGeneration =
            SyntheticDataGeneration(
                statistics,
                syntheticData.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Statistics.Builder::class)
    @NoAutoDetect
    class Statistics
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Statistics = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Statistics && this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "Statistics{additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(statistics: Statistics) = apply {
                additionalProperties(statistics.additionalProperties)
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

            fun build(): Statistics = Statistics(additionalProperties.toUnmodifiable())
        }
    }
}
