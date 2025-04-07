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

/**
 * Response from the synthetic data generation. Batch of (prompt, response, score) tuples that pass
 * the threshold.
 */
class SyntheticDataGenerationResponse
private constructor(
    private val syntheticData: JsonField<List<SyntheticData>>,
    private val statistics: JsonField<Statistics>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("synthetic_data")
        @ExcludeMissing
        syntheticData: JsonField<List<SyntheticData>> = JsonMissing.of(),
        @JsonProperty("statistics")
        @ExcludeMissing
        statistics: JsonField<Statistics> = JsonMissing.of(),
    ) : this(syntheticData, statistics, mutableMapOf())

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun syntheticData(): List<SyntheticData> = syntheticData.getRequired("synthetic_data")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun statistics(): Statistics? = statistics.getNullable("statistics")

    /**
     * Returns the raw JSON value of [syntheticData].
     *
     * Unlike [syntheticData], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("synthetic_data")
    @ExcludeMissing
    fun _syntheticData(): JsonField<List<SyntheticData>> = syntheticData

    /**
     * Returns the raw JSON value of [statistics].
     *
     * Unlike [statistics], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("statistics")
    @ExcludeMissing
    fun _statistics(): JsonField<Statistics> = statistics

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
         * [SyntheticDataGenerationResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .syntheticData()
         * ```
         */
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

        /**
         * Sets [Builder.syntheticData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.syntheticData] with a well-typed `List<SyntheticData>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun syntheticData(syntheticData: JsonField<List<SyntheticData>>) = apply {
            this.syntheticData = syntheticData.map { it.toMutableList() }
        }

        /**
         * Adds a single [SyntheticData] to [Builder.syntheticData].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSyntheticData(syntheticData: SyntheticData) = apply {
            this.syntheticData =
                (this.syntheticData ?: JsonField.of(mutableListOf())).also {
                    checkKnown("syntheticData", it).add(syntheticData)
                }
        }

        fun statistics(statistics: Statistics) = statistics(JsonField.of(statistics))

        /**
         * Sets [Builder.statistics] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statistics] with a well-typed [Statistics] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
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

        /**
         * Returns an immutable instance of [SyntheticDataGenerationResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .syntheticData()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SyntheticDataGenerationResponse =
            SyntheticDataGenerationResponse(
                checkRequired("syntheticData", syntheticData).map { it.toImmutable() },
                statistics,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SyntheticDataGenerationResponse = apply {
        if (validated) {
            return@apply
        }

        syntheticData().forEach { it.validate() }
        statistics()?.validate()
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
    internal fun validity(): Int =
        (syntheticData.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (statistics.asKnown()?.validity() ?: 0)

    class SyntheticData
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [SyntheticData]. */
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

            /**
             * Returns an immutable instance of [SyntheticData].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): SyntheticData = SyntheticData(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): SyntheticData = apply {
            if (validated) {
                return@apply
            }

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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

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

    class Statistics
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Statistics]. */
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

            /**
             * Returns an immutable instance of [Statistics].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Statistics = Statistics(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Statistics = apply {
            if (validated) {
                return@apply
            }

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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

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
