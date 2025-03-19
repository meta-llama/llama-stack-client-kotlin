// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.BaseDeserializer
import com.llama.llamastack.core.BaseSerializer
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

@NoAutoDetect
class SamplingParams
@JsonCreator
private constructor(
    @JsonProperty("strategy")
    @ExcludeMissing
    private val strategy: JsonField<Strategy> = JsonMissing.of(),
    @JsonProperty("max_tokens")
    @ExcludeMissing
    private val maxTokens: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("repetition_penalty")
    @ExcludeMissing
    private val repetitionPenalty: JsonField<Double> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun strategy(): Strategy = strategy.getRequired("strategy")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxTokens(): Long? = maxTokens.getNullable("max_tokens")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun repetitionPenalty(): Double? = repetitionPenalty.getNullable("repetition_penalty")

    /**
     * Returns the raw JSON value of [strategy].
     *
     * Unlike [strategy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("strategy") @ExcludeMissing fun _strategy(): JsonField<Strategy> = strategy

    /**
     * Returns the raw JSON value of [maxTokens].
     *
     * Unlike [maxTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("max_tokens") @ExcludeMissing fun _maxTokens(): JsonField<Long> = maxTokens

    /**
     * Returns the raw JSON value of [repetitionPenalty].
     *
     * Unlike [repetitionPenalty], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("repetition_penalty")
    @ExcludeMissing
    fun _repetitionPenalty(): JsonField<Double> = repetitionPenalty

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): SamplingParams = apply {
        if (validated) {
            return@apply
        }

        strategy().validate()
        maxTokens()
        repetitionPenalty()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SamplingParams].
         *
         * The following fields are required:
         * ```kotlin
         * .strategy()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SamplingParams]. */
    class Builder internal constructor() {

        private var strategy: JsonField<Strategy>? = null
        private var maxTokens: JsonField<Long> = JsonMissing.of()
        private var repetitionPenalty: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(samplingParams: SamplingParams) = apply {
            strategy = samplingParams.strategy
            maxTokens = samplingParams.maxTokens
            repetitionPenalty = samplingParams.repetitionPenalty
            additionalProperties = samplingParams.additionalProperties.toMutableMap()
        }

        fun strategy(strategy: Strategy) = strategy(JsonField.of(strategy))

        /**
         * Sets [Builder.strategy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.strategy] with a well-typed [Strategy] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun strategy(strategy: JsonField<Strategy>) = apply { this.strategy = strategy }

        /** Alias for calling [strategy] with `Strategy.ofGreedySampling()`. */
        fun strategyGreedySampling() = strategy(Strategy.ofGreedySampling())

        /** Alias for calling [strategy] with `Strategy.ofTopPSampling(topPSampling)`. */
        fun strategy(topPSampling: Strategy.TopPSamplingStrategy) =
            strategy(Strategy.ofTopPSampling(topPSampling))

        /** Alias for calling [strategy] with `Strategy.ofTopKSampling(topKSampling)`. */
        fun strategy(topKSampling: Strategy.TopKSamplingStrategy) =
            strategy(Strategy.ofTopKSampling(topKSampling))

        /**
         * Alias for calling [strategy] with the following:
         * ```kotlin
         * Strategy.TopKSamplingStrategy.builder()
         *     .topK(topK)
         *     .build()
         * ```
         */
        fun topKSamplingStrategy(topK: Long) =
            strategy(Strategy.TopKSamplingStrategy.builder().topK(topK).build())

        fun maxTokens(maxTokens: Long) = maxTokens(JsonField.of(maxTokens))

        /**
         * Sets [Builder.maxTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxTokens] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxTokens(maxTokens: JsonField<Long>) = apply { this.maxTokens = maxTokens }

        fun repetitionPenalty(repetitionPenalty: Double) =
            repetitionPenalty(JsonField.of(repetitionPenalty))

        /**
         * Sets [Builder.repetitionPenalty] to an arbitrary JSON value.
         *
         * You should usually call [Builder.repetitionPenalty] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun repetitionPenalty(repetitionPenalty: JsonField<Double>) = apply {
            this.repetitionPenalty = repetitionPenalty
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

        fun build(): SamplingParams =
            SamplingParams(
                checkRequired("strategy", strategy),
                maxTokens,
                repetitionPenalty,
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(using = Strategy.Deserializer::class)
    @JsonSerialize(using = Strategy.Serializer::class)
    class Strategy
    private constructor(
        private val greedySampling: JsonValue? = null,
        private val topPSampling: TopPSamplingStrategy? = null,
        private val topKSampling: TopKSamplingStrategy? = null,
        private val _json: JsonValue? = null,
    ) {

        fun greedySampling(): JsonValue? = greedySampling

        fun topPSampling(): TopPSamplingStrategy? = topPSampling

        fun topKSampling(): TopKSamplingStrategy? = topKSampling

        fun isGreedySampling(): Boolean = greedySampling != null

        fun isTopPSampling(): Boolean = topPSampling != null

        fun isTopKSampling(): Boolean = topKSampling != null

        fun asGreedySampling(): JsonValue = greedySampling.getOrThrow("greedySampling")

        fun asTopPSampling(): TopPSamplingStrategy = topPSampling.getOrThrow("topPSampling")

        fun asTopKSampling(): TopKSamplingStrategy = topKSampling.getOrThrow("topKSampling")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                greedySampling != null -> visitor.visitGreedySampling(greedySampling)
                topPSampling != null -> visitor.visitTopPSampling(topPSampling)
                topKSampling != null -> visitor.visitTopKSampling(topKSampling)
                else -> visitor.unknown(_json)
            }
        }

        private var validated: Boolean = false

        fun validate(): Strategy = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitGreedySampling(greedySampling: JsonValue) {
                        greedySampling.let {
                            if (it != JsonValue.from(mapOf("type" to "greedy"))) {
                                throw LlamaStackClientInvalidDataException(
                                    "'greedySampling' is invalid, received $it"
                                )
                            }
                        }
                    }

                    override fun visitTopPSampling(topPSampling: TopPSamplingStrategy) {
                        topPSampling.validate()
                    }

                    override fun visitTopKSampling(topKSampling: TopKSamplingStrategy) {
                        topKSampling.validate()
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Strategy && greedySampling == other.greedySampling && topPSampling == other.topPSampling && topKSampling == other.topKSampling /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(greedySampling, topPSampling, topKSampling) /* spotless:on */

        override fun toString(): String =
            when {
                greedySampling != null -> "Strategy{greedySampling=$greedySampling}"
                topPSampling != null -> "Strategy{topPSampling=$topPSampling}"
                topKSampling != null -> "Strategy{topKSampling=$topKSampling}"
                _json != null -> "Strategy{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Strategy")
            }

        companion object {

            fun ofGreedySampling() =
                Strategy(greedySampling = JsonValue.from(mapOf("type" to "greedy")))

            fun ofTopPSampling(topPSampling: TopPSamplingStrategy) =
                Strategy(topPSampling = topPSampling)

            fun ofTopKSampling(topKSampling: TopKSamplingStrategy) =
                Strategy(topKSampling = topKSampling)
        }

        /**
         * An interface that defines how to map each variant of [Strategy] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitGreedySampling(greedySampling: JsonValue): T

            fun visitTopPSampling(topPSampling: TopPSamplingStrategy): T

            fun visitTopKSampling(topKSampling: TopKSamplingStrategy): T

            /**
             * Maps an unknown variant of [Strategy] to a value of type [T].
             *
             * An instance of [Strategy] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws LlamaStackClientInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown Strategy: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Strategy>(Strategy::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Strategy {
                val json = JsonValue.fromJsonNode(node)
                val type = json.asObject()?.get("type")?.asString()

                when (type) {
                    "greedy" -> {
                        tryDeserialize(node, jacksonTypeRef<JsonValue>()) {
                                it.let {
                                    if (it != JsonValue.from(mapOf("type" to "greedy"))) {
                                        throw LlamaStackClientInvalidDataException(
                                            "'greedySampling' is invalid, received $it"
                                        )
                                    }
                                }
                            }
                            ?.let {
                                return Strategy(greedySampling = it, _json = json)
                            }
                    }
                    "top_p" -> {
                        tryDeserialize(node, jacksonTypeRef<TopPSamplingStrategy>()) {
                                it.validate()
                            }
                            ?.let {
                                return Strategy(topPSampling = it, _json = json)
                            }
                    }
                    "top_k" -> {
                        tryDeserialize(node, jacksonTypeRef<TopKSamplingStrategy>()) {
                                it.validate()
                            }
                            ?.let {
                                return Strategy(topKSampling = it, _json = json)
                            }
                    }
                }

                return Strategy(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Strategy>(Strategy::class) {

            override fun serialize(
                value: Strategy,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.greedySampling != null -> generator.writeObject(value.greedySampling)
                    value.topPSampling != null -> generator.writeObject(value.topPSampling)
                    value.topKSampling != null -> generator.writeObject(value.topKSampling)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Strategy")
                }
            }
        }

        @NoAutoDetect
        class TopPSamplingStrategy
        @JsonCreator
        private constructor(
            @JsonProperty("type") @ExcludeMissing private val type: JsonValue = JsonMissing.of(),
            @JsonProperty("temperature")
            @ExcludeMissing
            private val temperature: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("top_p")
            @ExcludeMissing
            private val topP: JsonField<Double> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("top_p")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun temperature(): Double? = temperature.getNullable("temperature")

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun topP(): Double? = topP.getNullable("top_p")

            /**
             * Returns the raw JSON value of [temperature].
             *
             * Unlike [temperature], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("temperature")
            @ExcludeMissing
            fun _temperature(): JsonField<Double> = temperature

            /**
             * Returns the raw JSON value of [topP].
             *
             * Unlike [topP], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("top_p") @ExcludeMissing fun _topP(): JsonField<Double> = topP

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): TopPSamplingStrategy = apply {
                if (validated) {
                    return@apply
                }

                _type().let {
                    if (it != JsonValue.from("top_p")) {
                        throw LlamaStackClientInvalidDataException(
                            "'type' is invalid, received $it"
                        )
                    }
                }
                temperature()
                topP()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [TopPSamplingStrategy].
                 */
                fun builder() = Builder()
            }

            /** A builder for [TopPSamplingStrategy]. */
            class Builder internal constructor() {

                private var type: JsonValue = JsonValue.from("top_p")
                private var temperature: JsonField<Double> = JsonMissing.of()
                private var topP: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(topPSamplingStrategy: TopPSamplingStrategy) = apply {
                    type = topPSamplingStrategy.type
                    temperature = topPSamplingStrategy.temperature
                    topP = topPSamplingStrategy.topP
                    additionalProperties = topPSamplingStrategy.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("top_p")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonValue) = apply { this.type = type }

                fun temperature(temperature: Double) = temperature(JsonField.of(temperature))

                /**
                 * Sets [Builder.temperature] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.temperature] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun temperature(temperature: JsonField<Double>) = apply {
                    this.temperature = temperature
                }

                fun topP(topP: Double) = topP(JsonField.of(topP))

                /**
                 * Sets [Builder.topP] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.topP] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun topP(topP: JsonField<Double>) = apply { this.topP = topP }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): TopPSamplingStrategy =
                    TopPSamplingStrategy(
                        type,
                        temperature,
                        topP,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is TopPSamplingStrategy && type == other.type && temperature == other.temperature && topP == other.topP && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(type, temperature, topP, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TopPSamplingStrategy{type=$type, temperature=$temperature, topP=$topP, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class TopKSamplingStrategy
        @JsonCreator
        private constructor(
            @JsonProperty("top_k")
            @ExcludeMissing
            private val topK: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing private val type: JsonValue = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun topK(): Long = topK.getRequired("top_k")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("top_k")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * Returns the raw JSON value of [topK].
             *
             * Unlike [topK], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("top_k") @ExcludeMissing fun _topK(): JsonField<Long> = topK

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): TopKSamplingStrategy = apply {
                if (validated) {
                    return@apply
                }

                topK()
                _type().let {
                    if (it != JsonValue.from("top_k")) {
                        throw LlamaStackClientInvalidDataException(
                            "'type' is invalid, received $it"
                        )
                    }
                }
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [TopKSamplingStrategy].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .topK()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [TopKSamplingStrategy]. */
            class Builder internal constructor() {

                private var topK: JsonField<Long>? = null
                private var type: JsonValue = JsonValue.from("top_k")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(topKSamplingStrategy: TopKSamplingStrategy) = apply {
                    topK = topKSamplingStrategy.topK
                    type = topKSamplingStrategy.type
                    additionalProperties = topKSamplingStrategy.additionalProperties.toMutableMap()
                }

                fun topK(topK: Long) = topK(JsonField.of(topK))

                /**
                 * Sets [Builder.topK] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.topK] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun topK(topK: JsonField<Long>) = apply { this.topK = topK }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("top_k")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonValue) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): TopKSamplingStrategy =
                    TopKSamplingStrategy(
                        checkRequired("topK", topK),
                        type,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is TopKSamplingStrategy && topK == other.topK && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(topK, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TopKSamplingStrategy{topK=$topK, type=$type, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SamplingParams && strategy == other.strategy && maxTokens == other.maxTokens && repetitionPenalty == other.repetitionPenalty && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(strategy, maxTokens, repetitionPenalty, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SamplingParams{strategy=$strategy, maxTokens=$maxTokens, repetitionPenalty=$repetitionPenalty, additionalProperties=$additionalProperties}"
}
