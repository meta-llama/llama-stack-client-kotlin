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

/**
 * Response from the synthetic data generation. Batch of (prompt, response, score) tuples that pass
 * the threshold.
 */
@NoAutoDetect
class SyntheticDataGenerationResponse
@JsonCreator
private constructor(
    @JsonProperty("synthetic_data")
    @ExcludeMissing
    private val syntheticData: JsonField<List<SyntheticData>> = JsonMissing.of(),
    @JsonProperty("statistics")
    @ExcludeMissing
    private val statistics: JsonField<Statistics> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun syntheticData(): List<SyntheticData> = syntheticData.getRequired("synthetic_data")

    fun statistics(): Statistics? = statistics.getNullable("statistics")

    @JsonProperty("synthetic_data")
    @ExcludeMissing
    fun _syntheticData(): JsonField<List<SyntheticData>> = syntheticData

    @JsonProperty("statistics")
    @ExcludeMissing
    fun _statistics(): JsonField<Statistics> = statistics

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): SyntheticDataGenerationResponse = apply {
        if (validated) {
            return@apply
        }

        syntheticData().forEach { it.validate() }
        statistics()?.validate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [SyntheticDataGenerationResponse]. */
    class Builder internal constructor() {

        private var syntheticData: JsonField<MutableList<SyntheticData>>? = null
        private var statistics: JsonField<Statistics> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(syntheticDataGenerationResponse: SyntheticDataGenerationResponse) =
            apply {
                syntheticData =
                    syntheticDataGenerationResponse.syntheticData.map { it.toMutableList() }
                statistics = syntheticDataGenerationResponse.statistics
                additionalProperties =
                    syntheticDataGenerationResponse.additionalProperties.toMutableMap()
            }

        fun syntheticData(syntheticData: List<SyntheticData>) =
            syntheticData(JsonField.of(syntheticData))

        fun syntheticData(syntheticData: JsonField<List<SyntheticData>>) = apply {
            this.syntheticData = syntheticData.map { it.toMutableList() }
        }

        fun addSyntheticData(syntheticData: SyntheticData) = apply {
            this.syntheticData =
                (this.syntheticData ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(syntheticData)
                }
        }

        fun statistics(statistics: Statistics) = statistics(JsonField.of(statistics))

        fun statistics(statistics: JsonField<Statistics>) = apply { this.statistics = statistics }

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

        fun build(): SyntheticDataGenerationResponse =
            SyntheticDataGenerationResponse(
                checkRequired("syntheticData", syntheticData).map { it.toImmutable() },
                statistics,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class SyntheticData
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): SyntheticData = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [SyntheticData]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(syntheticData: SyntheticData) = apply {
                additionalProperties = syntheticData.additionalProperties.toMutableMap()
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

            fun build(): SyntheticData = SyntheticData(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SyntheticData && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "SyntheticData{additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Statistics
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Statistics = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [Statistics]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(statistics: Statistics) = apply {
                additionalProperties = statistics.additionalProperties.toMutableMap()
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

            fun build(): Statistics = Statistics(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Statistics && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Statistics{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SyntheticDataGenerationResponse && syntheticData == other.syntheticData && statistics == other.statistics && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(syntheticData, statistics, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SyntheticDataGenerationResponse{syntheticData=$syntheticData, statistics=$statistics, additionalProperties=$additionalProperties}"
}
