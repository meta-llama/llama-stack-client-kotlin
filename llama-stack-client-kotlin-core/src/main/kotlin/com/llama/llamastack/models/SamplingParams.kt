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
import com.llama.llamastack.core.Enum
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

    fun strategy(): Strategy = strategy.getRequired("strategy")

    fun maxTokens(): Long? = maxTokens.getNullable("max_tokens")

    fun repetitionPenalty(): Double? = repetitionPenalty.getNullable("repetition_penalty")

    @JsonProperty("strategy") @ExcludeMissing fun _strategy(): JsonField<Strategy> = strategy

    @JsonProperty("max_tokens") @ExcludeMissing fun _maxTokens(): JsonField<Long> = maxTokens

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

        fun builder() = Builder()
    }

    class Builder {

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

        fun strategy(strategy: JsonField<Strategy>) = apply { this.strategy = strategy }

        fun strategy(greedySamplingStrategy: Strategy.GreedySamplingStrategy) =
            strategy(Strategy.ofGreedySamplingStrategy(greedySamplingStrategy))

        fun strategy(topPSamplingStrategy: Strategy.TopPSamplingStrategy) =
            strategy(Strategy.ofTopPSamplingStrategy(topPSamplingStrategy))

        fun strategy(topKSamplingStrategy: Strategy.TopKSamplingStrategy) =
            strategy(Strategy.ofTopKSamplingStrategy(topKSamplingStrategy))

        fun maxTokens(maxTokens: Long) = maxTokens(JsonField.of(maxTokens))

        fun maxTokens(maxTokens: JsonField<Long>) = apply { this.maxTokens = maxTokens }

        fun repetitionPenalty(repetitionPenalty: Double) =
            repetitionPenalty(JsonField.of(repetitionPenalty))

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
        private val greedySamplingStrategy: GreedySamplingStrategy? = null,
        private val topPSamplingStrategy: TopPSamplingStrategy? = null,
        private val topKSamplingStrategy: TopKSamplingStrategy? = null,
        private val _json: JsonValue? = null,
    ) {

        fun greedySamplingStrategy(): GreedySamplingStrategy? = greedySamplingStrategy

        fun topPSamplingStrategy(): TopPSamplingStrategy? = topPSamplingStrategy

        fun topKSamplingStrategy(): TopKSamplingStrategy? = topKSamplingStrategy

        fun isGreedySamplingStrategy(): Boolean = greedySamplingStrategy != null

        fun isTopPSamplingStrategy(): Boolean = topPSamplingStrategy != null

        fun isTopKSamplingStrategy(): Boolean = topKSamplingStrategy != null

        fun asGreedySamplingStrategy(): GreedySamplingStrategy =
            greedySamplingStrategy.getOrThrow("greedySamplingStrategy")

        fun asTopPSamplingStrategy(): TopPSamplingStrategy =
            topPSamplingStrategy.getOrThrow("topPSamplingStrategy")

        fun asTopKSamplingStrategy(): TopKSamplingStrategy =
            topKSamplingStrategy.getOrThrow("topKSamplingStrategy")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                greedySamplingStrategy != null ->
                    visitor.visitGreedySamplingStrategy(greedySamplingStrategy)
                topPSamplingStrategy != null ->
                    visitor.visitTopPSamplingStrategy(topPSamplingStrategy)
                topKSamplingStrategy != null ->
                    visitor.visitTopKSamplingStrategy(topKSamplingStrategy)
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
                    override fun visitGreedySamplingStrategy(
                        greedySamplingStrategy: GreedySamplingStrategy
                    ) {
                        greedySamplingStrategy.validate()
                    }

                    override fun visitTopPSamplingStrategy(
                        topPSamplingStrategy: TopPSamplingStrategy
                    ) {
                        topPSamplingStrategy.validate()
                    }

                    override fun visitTopKSamplingStrategy(
                        topKSamplingStrategy: TopKSamplingStrategy
                    ) {
                        topKSamplingStrategy.validate()
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Strategy && greedySamplingStrategy == other.greedySamplingStrategy && topPSamplingStrategy == other.topPSamplingStrategy && topKSamplingStrategy == other.topKSamplingStrategy /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(greedySamplingStrategy, topPSamplingStrategy, topKSamplingStrategy) /* spotless:on */

        override fun toString(): String =
            when {
                greedySamplingStrategy != null ->
                    "Strategy{greedySamplingStrategy=$greedySamplingStrategy}"
                topPSamplingStrategy != null ->
                    "Strategy{topPSamplingStrategy=$topPSamplingStrategy}"
                topKSamplingStrategy != null ->
                    "Strategy{topKSamplingStrategy=$topKSamplingStrategy}"
                _json != null -> "Strategy{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Strategy")
            }

        companion object {

            fun ofGreedySamplingStrategy(greedySamplingStrategy: GreedySamplingStrategy) =
                Strategy(greedySamplingStrategy = greedySamplingStrategy)

            fun ofTopPSamplingStrategy(topPSamplingStrategy: TopPSamplingStrategy) =
                Strategy(topPSamplingStrategy = topPSamplingStrategy)

            fun ofTopKSamplingStrategy(topKSamplingStrategy: TopKSamplingStrategy) =
                Strategy(topKSamplingStrategy = topKSamplingStrategy)
        }

        interface Visitor<out T> {

            fun visitGreedySamplingStrategy(greedySamplingStrategy: GreedySamplingStrategy): T

            fun visitTopPSamplingStrategy(topPSamplingStrategy: TopPSamplingStrategy): T

            fun visitTopKSamplingStrategy(topKSamplingStrategy: TopKSamplingStrategy): T

            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown Strategy: $json")
            }
        }

        class Deserializer : BaseDeserializer<Strategy>(Strategy::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Strategy {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<GreedySamplingStrategy>()) { it.validate() }
                    ?.let {
                        return Strategy(greedySamplingStrategy = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<TopPSamplingStrategy>()) { it.validate() }
                    ?.let {
                        return Strategy(topPSamplingStrategy = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<TopKSamplingStrategy>()) { it.validate() }
                    ?.let {
                        return Strategy(topKSamplingStrategy = it, _json = json)
                    }

                return Strategy(_json = json)
            }
        }

        class Serializer : BaseSerializer<Strategy>(Strategy::class) {

            override fun serialize(
                value: Strategy,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.greedySamplingStrategy != null ->
                        generator.writeObject(value.greedySamplingStrategy)
                    value.topPSamplingStrategy != null ->
                        generator.writeObject(value.topPSamplingStrategy)
                    value.topKSamplingStrategy != null ->
                        generator.writeObject(value.topKSamplingStrategy)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Strategy")
                }
            }
        }

        @NoAutoDetect
        class GreedySamplingStrategy
        @JsonCreator
        private constructor(
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun type(): Type = type.getRequired("type")

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): GreedySamplingStrategy = apply {
                if (validated) {
                    return@apply
                }

                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(greedySamplingStrategy: GreedySamplingStrategy) = apply {
                    type = greedySamplingStrategy.type
                    additionalProperties =
                        greedySamplingStrategy.additionalProperties.toMutableMap()
                }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                fun build(): GreedySamplingStrategy =
                    GreedySamplingStrategy(
                        checkRequired("type", type),
                        additionalProperties.toImmutable()
                    )
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val GREEDY = of("greedy")

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    GREEDY,
                }

                enum class Value {
                    GREEDY,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        GREEDY -> Value.GREEDY
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        GREEDY -> Known.GREEDY
                        else -> throw LlamaStackClientInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is GreedySamplingStrategy && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "GreedySamplingStrategy{type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class TopPSamplingStrategy
        @JsonCreator
        private constructor(
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("temperature")
            @ExcludeMissing
            private val temperature: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("top_p")
            @ExcludeMissing
            private val topP: JsonField<Double> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun type(): Type = type.getRequired("type")

            fun temperature(): Double? = temperature.getNullable("temperature")

            fun topP(): Double? = topP.getNullable("top_p")

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonProperty("temperature")
            @ExcludeMissing
            fun _temperature(): JsonField<Double> = temperature

            @JsonProperty("top_p") @ExcludeMissing fun _topP(): JsonField<Double> = topP

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): TopPSamplingStrategy = apply {
                if (validated) {
                    return@apply
                }

                type()
                temperature()
                topP()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var type: JsonField<Type>? = null
                private var temperature: JsonField<Double> = JsonMissing.of()
                private var topP: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(topPSamplingStrategy: TopPSamplingStrategy) = apply {
                    type = topPSamplingStrategy.type
                    temperature = topPSamplingStrategy.temperature
                    topP = topPSamplingStrategy.topP
                    additionalProperties = topPSamplingStrategy.additionalProperties.toMutableMap()
                }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun temperature(temperature: Double) = temperature(JsonField.of(temperature))

                fun temperature(temperature: JsonField<Double>) = apply {
                    this.temperature = temperature
                }

                fun topP(topP: Double) = topP(JsonField.of(topP))

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
                        checkRequired("type", type),
                        temperature,
                        topP,
                        additionalProperties.toImmutable(),
                    )
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val TOP_P = of("top_p")

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    TOP_P,
                }

                enum class Value {
                    TOP_P,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        TOP_P -> Value.TOP_P
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        TOP_P -> Known.TOP_P
                        else -> throw LlamaStackClientInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
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
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun topK(): Long = topK.getRequired("top_k")

            fun type(): Type = type.getRequired("type")

            @JsonProperty("top_k") @ExcludeMissing fun _topK(): JsonField<Long> = topK

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): TopKSamplingStrategy = apply {
                if (validated) {
                    return@apply
                }

                topK()
                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var topK: JsonField<Long>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(topKSamplingStrategy: TopKSamplingStrategy) = apply {
                    topK = topKSamplingStrategy.topK
                    type = topKSamplingStrategy.type
                    additionalProperties = topKSamplingStrategy.additionalProperties.toMutableMap()
                }

                fun topK(topK: Long) = topK(JsonField.of(topK))

                fun topK(topK: JsonField<Long>) = apply { this.topK = topK }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

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
                        checkRequired("type", type),
                        additionalProperties.toImmutable(),
                    )
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val TOP_K = of("top_k")

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    TOP_K,
                }

                enum class Value {
                    TOP_K,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        TOP_K -> Value.TOP_K
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        TOP_K -> Known.TOP_K
                        else -> throw LlamaStackClientInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
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
