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

        fun strategy(greedy: Strategy.Greedy) = strategy(Strategy.ofGreedy(greedy))

        fun strategy(topP: Strategy.TopP) = strategy(Strategy.ofTopP(topP))

        fun strategy(topK: Strategy.TopK) = strategy(Strategy.ofTopK(topK))

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
        private val greedy: Greedy? = null,
        private val topP: TopP? = null,
        private val topK: TopK? = null,
        private val _json: JsonValue? = null,
    ) {

        fun greedy(): Greedy? = greedy

        fun topP(): TopP? = topP

        fun topK(): TopK? = topK

        fun isGreedy(): Boolean = greedy != null

        fun isTopP(): Boolean = topP != null

        fun isTopK(): Boolean = topK != null

        fun asGreedy(): Greedy = greedy.getOrThrow("greedy")

        fun asTopP(): TopP = topP.getOrThrow("topP")

        fun asTopK(): TopK = topK.getOrThrow("topK")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                greedy != null -> visitor.visitGreedy(greedy)
                topP != null -> visitor.visitTopP(topP)
                topK != null -> visitor.visitTopK(topK)
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
                    override fun visitGreedy(greedy: Greedy) {
                        greedy.validate()
                    }

                    override fun visitTopP(topP: TopP) {
                        topP.validate()
                    }

                    override fun visitTopK(topK: TopK) {
                        topK.validate()
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Strategy && greedy == other.greedy && topP == other.topP && topK == other.topK /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(greedy, topP, topK) /* spotless:on */

        override fun toString(): String =
            when {
                greedy != null -> "Strategy{greedy=$greedy}"
                topP != null -> "Strategy{topP=$topP}"
                topK != null -> "Strategy{topK=$topK}"
                _json != null -> "Strategy{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Strategy")
            }

        companion object {

            fun ofGreedy(greedy: Greedy) = Strategy(greedy = greedy)

            fun ofTopP(topP: TopP) = Strategy(topP = topP)

            fun ofTopK(topK: TopK) = Strategy(topK = topK)
        }

        interface Visitor<out T> {

            fun visitGreedy(greedy: Greedy): T

            fun visitTopP(topP: TopP): T

            fun visitTopK(topK: TopK): T

            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown Strategy: $json")
            }
        }

        class Deserializer : BaseDeserializer<Strategy>(Strategy::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Strategy {
                val json = JsonValue.fromJsonNode(node)
                val type = json.asObject()?.get("type")?.asString()

                when (type) {
                    "greedy" -> {
                        tryDeserialize(node, jacksonTypeRef<Greedy>()) { it.validate() }
                            ?.let {
                                return Strategy(greedy = it, _json = json)
                            }
                    }
                    "top_p" -> {
                        tryDeserialize(node, jacksonTypeRef<TopP>()) { it.validate() }
                            ?.let {
                                return Strategy(topP = it, _json = json)
                            }
                    }
                    "top_k" -> {
                        tryDeserialize(node, jacksonTypeRef<TopK>()) { it.validate() }
                            ?.let {
                                return Strategy(topK = it, _json = json)
                            }
                    }
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
                    value.greedy != null -> generator.writeObject(value.greedy)
                    value.topP != null -> generator.writeObject(value.topP)
                    value.topK != null -> generator.writeObject(value.topK)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Strategy")
                }
            }
        }

        @NoAutoDetect
        class Greedy
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

            fun validate(): Greedy = apply {
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

                internal fun from(greedy: Greedy) = apply {
                    type = greedy.type
                    additionalProperties = greedy.additionalProperties.toMutableMap()
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

                fun build(): Greedy =
                    Greedy(checkRequired("type", type), additionalProperties.toImmutable())
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

                return /* spotless:off */ other is Greedy && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Greedy{type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class TopP
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

            fun validate(): TopP = apply {
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

                internal fun from(topP: TopP) = apply {
                    type = topP.type
                    temperature = topP.temperature
                    this.topP = topP.topP
                    additionalProperties = topP.additionalProperties.toMutableMap()
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

                fun build(): TopP =
                    TopP(
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

                return /* spotless:off */ other is TopP && type == other.type && temperature == other.temperature && topP == other.topP && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(type, temperature, topP, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TopP{type=$type, temperature=$temperature, topP=$topP, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class TopK
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

            fun validate(): TopK = apply {
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

                internal fun from(topK: TopK) = apply {
                    this.topK = topK.topK
                    type = topK.type
                    additionalProperties = topK.additionalProperties.toMutableMap()
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

                fun build(): TopK =
                    TopK(
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

                return /* spotless:off */ other is TopK && topK == other.topK && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(topK, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TopK{topK=$topK, type=$type, additionalProperties=$additionalProperties}"
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
