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

@JsonDeserialize(builder = SyntheticDataGenerationResponse.Builder::class)
@NoAutoDetect
class SyntheticDataGenerationResponse
private constructor(
    private val statistics: JsonField<Statistics>,
    private val syntheticData: JsonField<List<SyntheticData>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun statistics(): Statistics? = statistics.getNullable("statistics")

    fun syntheticData(): List<SyntheticData> = syntheticData.getRequired("synthetic_data")

    @JsonProperty("statistics") @ExcludeMissing fun _statistics() = statistics

    @JsonProperty("synthetic_data") @ExcludeMissing fun _syntheticData() = syntheticData

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): SyntheticDataGenerationResponse = apply {
        if (!validated) {
            statistics()?.validate()
            syntheticData().forEach { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var statistics: JsonField<Statistics> = JsonMissing.of()
        private var syntheticData: JsonField<List<SyntheticData>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(syntheticDataGenerationResponse: SyntheticDataGenerationResponse) =
            apply {
                this.statistics = syntheticDataGenerationResponse.statistics
                this.syntheticData = syntheticDataGenerationResponse.syntheticData
                additionalProperties(syntheticDataGenerationResponse.additionalProperties)
            }

        fun statistics(statistics: Statistics) = statistics(JsonField.of(statistics))

        @JsonProperty("statistics")
        @ExcludeMissing
        fun statistics(statistics: JsonField<Statistics>) = apply { this.statistics = statistics }

        fun syntheticData(syntheticData: List<SyntheticData>) =
            syntheticData(JsonField.of(syntheticData))

        @JsonProperty("synthetic_data")
        @ExcludeMissing
        fun syntheticData(syntheticData: JsonField<List<SyntheticData>>) = apply {
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

        fun build(): SyntheticDataGenerationResponse =
            SyntheticDataGenerationResponse(
                statistics,
                syntheticData.map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = SyntheticData.Builder::class)
    @NoAutoDetect
    class SyntheticData
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): SyntheticData = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(syntheticData: SyntheticData) = apply {
                additionalProperties(syntheticData.additionalProperties)
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

            fun build(): SyntheticData = SyntheticData(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SyntheticData && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "SyntheticData{additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = Statistics.Builder::class)
    @NoAutoDetect
    class Statistics
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Statistics = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

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

            fun build(): Statistics = Statistics(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Statistics && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "Statistics{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SyntheticDataGenerationResponse && this.statistics == other.statistics && this.syntheticData == other.syntheticData && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(statistics, syntheticData, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "SyntheticDataGenerationResponse{statistics=$statistics, syntheticData=$syntheticData, additionalProperties=$additionalProperties}"
}
