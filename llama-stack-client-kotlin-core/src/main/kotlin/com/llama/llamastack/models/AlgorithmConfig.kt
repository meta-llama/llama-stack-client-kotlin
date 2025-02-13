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

@JsonDeserialize(using = AlgorithmConfig.Deserializer::class)
@JsonSerialize(using = AlgorithmConfig.Serializer::class)
class AlgorithmConfig
private constructor(
    private val loraFinetuning: LoraFinetuningConfig? = null,
    private val qatFinetuning: QatFinetuningConfig? = null,
    private val _json: JsonValue? = null,
) {

    fun loraFinetuning(): LoraFinetuningConfig? = loraFinetuning

    fun qatFinetuning(): QatFinetuningConfig? = qatFinetuning

    fun isLoraFinetuning(): Boolean = loraFinetuning != null

    fun isQatFinetuning(): Boolean = qatFinetuning != null

    fun asLoraFinetuning(): LoraFinetuningConfig = loraFinetuning.getOrThrow("loraFinetuning")

    fun asQatFinetuning(): QatFinetuningConfig = qatFinetuning.getOrThrow("qatFinetuning")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            loraFinetuning != null -> visitor.visitLoraFinetuning(loraFinetuning)
            qatFinetuning != null -> visitor.visitQatFinetuning(qatFinetuning)
            else -> visitor.unknown(_json)
        }
    }

    private var validated: Boolean = false

    fun validate(): AlgorithmConfig = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitLoraFinetuning(loraFinetuning: LoraFinetuningConfig) {
                    loraFinetuning.validate()
                }

                override fun visitQatFinetuning(qatFinetuning: QatFinetuningConfig) {
                    qatFinetuning.validate()
                }
            }
        )
        validated = true
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AlgorithmConfig && loraFinetuning == other.loraFinetuning && qatFinetuning == other.qatFinetuning /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(loraFinetuning, qatFinetuning) /* spotless:on */

    override fun toString(): String =
        when {
            loraFinetuning != null -> "AlgorithmConfig{loraFinetuning=$loraFinetuning}"
            qatFinetuning != null -> "AlgorithmConfig{qatFinetuning=$qatFinetuning}"
            _json != null -> "AlgorithmConfig{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid AlgorithmConfig")
        }

    companion object {

        fun ofLoraFinetuning(loraFinetuning: LoraFinetuningConfig) =
            AlgorithmConfig(loraFinetuning = loraFinetuning)

        fun ofQatFinetuning(qatFinetuning: QatFinetuningConfig) =
            AlgorithmConfig(qatFinetuning = qatFinetuning)
    }

    /**
     * An interface that defines how to map each variant of [AlgorithmConfig] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        fun visitLoraFinetuning(loraFinetuning: LoraFinetuningConfig): T

        fun visitQatFinetuning(qatFinetuning: QatFinetuningConfig): T

        /**
         * Maps an unknown variant of [AlgorithmConfig] to a value of type [T].
         *
         * An instance of [AlgorithmConfig] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws LlamaStackClientInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LlamaStackClientInvalidDataException("Unknown AlgorithmConfig: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<AlgorithmConfig>(AlgorithmConfig::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): AlgorithmConfig {
            val json = JsonValue.fromJsonNode(node)
            val type = json.asObject()?.get("type")?.asString()

            when (type) {
                "LoRA" -> {
                    tryDeserialize(node, jacksonTypeRef<LoraFinetuningConfig>()) { it.validate() }
                        ?.let {
                            return AlgorithmConfig(loraFinetuning = it, _json = json)
                        }
                }
                "QAT" -> {
                    tryDeserialize(node, jacksonTypeRef<QatFinetuningConfig>()) { it.validate() }
                        ?.let {
                            return AlgorithmConfig(qatFinetuning = it, _json = json)
                        }
                }
            }

            return AlgorithmConfig(_json = json)
        }
    }

    internal class Serializer : BaseSerializer<AlgorithmConfig>(AlgorithmConfig::class) {

        override fun serialize(
            value: AlgorithmConfig,
            generator: JsonGenerator,
            provider: SerializerProvider
        ) {
            when {
                value.loraFinetuning != null -> generator.writeObject(value.loraFinetuning)
                value.qatFinetuning != null -> generator.writeObject(value.qatFinetuning)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid AlgorithmConfig")
            }
        }
    }

    @NoAutoDetect
    class LoraFinetuningConfig
    @JsonCreator
    private constructor(
        @JsonProperty("alpha")
        @ExcludeMissing
        private val alpha: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("apply_lora_to_mlp")
        @ExcludeMissing
        private val applyLoraToMlp: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("apply_lora_to_output")
        @ExcludeMissing
        private val applyLoraToOutput: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("lora_attn_modules")
        @ExcludeMissing
        private val loraAttnModules: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("rank") @ExcludeMissing private val rank: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonValue = JsonMissing.of(),
        @JsonProperty("quantize_base")
        @ExcludeMissing
        private val quantizeBase: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("use_dora")
        @ExcludeMissing
        private val useDora: JsonField<Boolean> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun alpha(): Long = alpha.getRequired("alpha")

        fun applyLoraToMlp(): Boolean = applyLoraToMlp.getRequired("apply_lora_to_mlp")

        fun applyLoraToOutput(): Boolean = applyLoraToOutput.getRequired("apply_lora_to_output")

        fun loraAttnModules(): List<String> = loraAttnModules.getRequired("lora_attn_modules")

        fun rank(): Long = rank.getRequired("rank")

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        fun quantizeBase(): Boolean? = quantizeBase.getNullable("quantize_base")

        fun useDora(): Boolean? = useDora.getNullable("use_dora")

        @JsonProperty("alpha") @ExcludeMissing fun _alpha(): JsonField<Long> = alpha

        @JsonProperty("apply_lora_to_mlp")
        @ExcludeMissing
        fun _applyLoraToMlp(): JsonField<Boolean> = applyLoraToMlp

        @JsonProperty("apply_lora_to_output")
        @ExcludeMissing
        fun _applyLoraToOutput(): JsonField<Boolean> = applyLoraToOutput

        @JsonProperty("lora_attn_modules")
        @ExcludeMissing
        fun _loraAttnModules(): JsonField<List<String>> = loraAttnModules

        @JsonProperty("rank") @ExcludeMissing fun _rank(): JsonField<Long> = rank

        @JsonProperty("quantize_base")
        @ExcludeMissing
        fun _quantizeBase(): JsonField<Boolean> = quantizeBase

        @JsonProperty("use_dora") @ExcludeMissing fun _useDora(): JsonField<Boolean> = useDora

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): LoraFinetuningConfig = apply {
            if (validated) {
                return@apply
            }

            alpha()
            applyLoraToMlp()
            applyLoraToOutput()
            loraAttnModules()
            rank()
            _type().let {
                if (it != JsonValue.from("LoRA")) {
                    throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
                }
            }
            quantizeBase()
            useDora()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [LoraFinetuningConfig]. */
        class Builder internal constructor() {

            private var alpha: JsonField<Long>? = null
            private var applyLoraToMlp: JsonField<Boolean>? = null
            private var applyLoraToOutput: JsonField<Boolean>? = null
            private var loraAttnModules: JsonField<MutableList<String>>? = null
            private var rank: JsonField<Long>? = null
            private var type: JsonValue = JsonValue.from("LoRA")
            private var quantizeBase: JsonField<Boolean> = JsonMissing.of()
            private var useDora: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(loraFinetuningConfig: LoraFinetuningConfig) = apply {
                alpha = loraFinetuningConfig.alpha
                applyLoraToMlp = loraFinetuningConfig.applyLoraToMlp
                applyLoraToOutput = loraFinetuningConfig.applyLoraToOutput
                loraAttnModules = loraFinetuningConfig.loraAttnModules.map { it.toMutableList() }
                rank = loraFinetuningConfig.rank
                type = loraFinetuningConfig.type
                quantizeBase = loraFinetuningConfig.quantizeBase
                useDora = loraFinetuningConfig.useDora
                additionalProperties = loraFinetuningConfig.additionalProperties.toMutableMap()
            }

            fun alpha(alpha: Long) = alpha(JsonField.of(alpha))

            fun alpha(alpha: JsonField<Long>) = apply { this.alpha = alpha }

            fun applyLoraToMlp(applyLoraToMlp: Boolean) =
                applyLoraToMlp(JsonField.of(applyLoraToMlp))

            fun applyLoraToMlp(applyLoraToMlp: JsonField<Boolean>) = apply {
                this.applyLoraToMlp = applyLoraToMlp
            }

            fun applyLoraToOutput(applyLoraToOutput: Boolean) =
                applyLoraToOutput(JsonField.of(applyLoraToOutput))

            fun applyLoraToOutput(applyLoraToOutput: JsonField<Boolean>) = apply {
                this.applyLoraToOutput = applyLoraToOutput
            }

            fun loraAttnModules(loraAttnModules: List<String>) =
                loraAttnModules(JsonField.of(loraAttnModules))

            fun loraAttnModules(loraAttnModules: JsonField<List<String>>) = apply {
                this.loraAttnModules = loraAttnModules.map { it.toMutableList() }
            }

            fun addLoraAttnModule(loraAttnModule: String) = apply {
                loraAttnModules =
                    (loraAttnModules ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(loraAttnModule)
                    }
            }

            fun rank(rank: Long) = rank(JsonField.of(rank))

            fun rank(rank: JsonField<Long>) = apply { this.rank = rank }

            fun type(type: JsonValue) = apply { this.type = type }

            fun quantizeBase(quantizeBase: Boolean) = quantizeBase(JsonField.of(quantizeBase))

            fun quantizeBase(quantizeBase: JsonField<Boolean>) = apply {
                this.quantizeBase = quantizeBase
            }

            fun useDora(useDora: Boolean) = useDora(JsonField.of(useDora))

            fun useDora(useDora: JsonField<Boolean>) = apply { this.useDora = useDora }

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

            fun build(): LoraFinetuningConfig =
                LoraFinetuningConfig(
                    checkRequired("alpha", alpha),
                    checkRequired("applyLoraToMlp", applyLoraToMlp),
                    checkRequired("applyLoraToOutput", applyLoraToOutput),
                    checkRequired("loraAttnModules", loraAttnModules).map { it.toImmutable() },
                    checkRequired("rank", rank),
                    type,
                    quantizeBase,
                    useDora,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LoraFinetuningConfig && alpha == other.alpha && applyLoraToMlp == other.applyLoraToMlp && applyLoraToOutput == other.applyLoraToOutput && loraAttnModules == other.loraAttnModules && rank == other.rank && type == other.type && quantizeBase == other.quantizeBase && useDora == other.useDora && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(alpha, applyLoraToMlp, applyLoraToOutput, loraAttnModules, rank, type, quantizeBase, useDora, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LoraFinetuningConfig{alpha=$alpha, applyLoraToMlp=$applyLoraToMlp, applyLoraToOutput=$applyLoraToOutput, loraAttnModules=$loraAttnModules, rank=$rank, type=$type, quantizeBase=$quantizeBase, useDora=$useDora, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class QatFinetuningConfig
    @JsonCreator
    private constructor(
        @JsonProperty("group_size")
        @ExcludeMissing
        private val groupSize: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("quantizer_name")
        @ExcludeMissing
        private val quantizerName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonValue = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun groupSize(): Long = groupSize.getRequired("group_size")

        fun quantizerName(): String = quantizerName.getRequired("quantizer_name")

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        @JsonProperty("group_size") @ExcludeMissing fun _groupSize(): JsonField<Long> = groupSize

        @JsonProperty("quantizer_name")
        @ExcludeMissing
        fun _quantizerName(): JsonField<String> = quantizerName

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): QatFinetuningConfig = apply {
            if (validated) {
                return@apply
            }

            groupSize()
            quantizerName()
            _type().let {
                if (it != JsonValue.from("QAT")) {
                    throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
                }
            }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [QatFinetuningConfig]. */
        class Builder internal constructor() {

            private var groupSize: JsonField<Long>? = null
            private var quantizerName: JsonField<String>? = null
            private var type: JsonValue = JsonValue.from("QAT")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(qatFinetuningConfig: QatFinetuningConfig) = apply {
                groupSize = qatFinetuningConfig.groupSize
                quantizerName = qatFinetuningConfig.quantizerName
                type = qatFinetuningConfig.type
                additionalProperties = qatFinetuningConfig.additionalProperties.toMutableMap()
            }

            fun groupSize(groupSize: Long) = groupSize(JsonField.of(groupSize))

            fun groupSize(groupSize: JsonField<Long>) = apply { this.groupSize = groupSize }

            fun quantizerName(quantizerName: String) = quantizerName(JsonField.of(quantizerName))

            fun quantizerName(quantizerName: JsonField<String>) = apply {
                this.quantizerName = quantizerName
            }

            fun type(type: JsonValue) = apply { this.type = type }

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

            fun build(): QatFinetuningConfig =
                QatFinetuningConfig(
                    checkRequired("groupSize", groupSize),
                    checkRequired("quantizerName", quantizerName),
                    type,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is QatFinetuningConfig && groupSize == other.groupSize && quantizerName == other.quantizerName && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(groupSize, quantizerName, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "QatFinetuningConfig{groupSize=$groupSize, quantizerName=$quantizerName, type=$type, additionalProperties=$additionalProperties}"
    }
}
