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
import com.llama.llamastack.core.checkKnown
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Collections
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

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            loraFinetuning != null -> visitor.visitLoraFinetuning(loraFinetuning)
            qatFinetuning != null -> visitor.visitQatFinetuning(qatFinetuning)
            else -> visitor.unknown(_json)
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
        accept(
            object : Visitor<Int> {
                override fun visitLoraFinetuning(loraFinetuning: LoraFinetuningConfig) =
                    loraFinetuning.validity()

                override fun visitQatFinetuning(qatFinetuning: QatFinetuningConfig) =
                    qatFinetuning.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

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
                    return tryDeserialize(node, jacksonTypeRef<LoraFinetuningConfig>())?.let {
                        AlgorithmConfig(loraFinetuning = it, _json = json)
                    } ?: AlgorithmConfig(_json = json)
                }
                "QAT" -> {
                    return tryDeserialize(node, jacksonTypeRef<QatFinetuningConfig>())?.let {
                        AlgorithmConfig(qatFinetuning = it, _json = json)
                    } ?: AlgorithmConfig(_json = json)
                }
            }

            return AlgorithmConfig(_json = json)
        }
    }

    internal class Serializer : BaseSerializer<AlgorithmConfig>(AlgorithmConfig::class) {

        override fun serialize(
            value: AlgorithmConfig,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.loraFinetuning != null -> generator.writeObject(value.loraFinetuning)
                value.qatFinetuning != null -> generator.writeObject(value.qatFinetuning)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid AlgorithmConfig")
            }
        }
    }

    class LoraFinetuningConfig
    private constructor(
        private val alpha: JsonField<Long>,
        private val applyLoraToMlp: JsonField<Boolean>,
        private val applyLoraToOutput: JsonField<Boolean>,
        private val loraAttnModules: JsonField<List<String>>,
        private val rank: JsonField<Long>,
        private val type: JsonValue,
        private val quantizeBase: JsonField<Boolean>,
        private val useDora: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("alpha") @ExcludeMissing alpha: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("apply_lora_to_mlp")
            @ExcludeMissing
            applyLoraToMlp: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("apply_lora_to_output")
            @ExcludeMissing
            applyLoraToOutput: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("lora_attn_modules")
            @ExcludeMissing
            loraAttnModules: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("rank") @ExcludeMissing rank: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
            @JsonProperty("quantize_base")
            @ExcludeMissing
            quantizeBase: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("use_dora") @ExcludeMissing useDora: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            alpha,
            applyLoraToMlp,
            applyLoraToOutput,
            loraAttnModules,
            rank,
            type,
            quantizeBase,
            useDora,
            mutableMapOf(),
        )

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun alpha(): Long = alpha.getRequired("alpha")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun applyLoraToMlp(): Boolean = applyLoraToMlp.getRequired("apply_lora_to_mlp")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun applyLoraToOutput(): Boolean = applyLoraToOutput.getRequired("apply_lora_to_output")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun loraAttnModules(): List<String> = loraAttnModules.getRequired("lora_attn_modules")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun rank(): Long = rank.getRequired("rank")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("LoRA")
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
        fun quantizeBase(): Boolean? = quantizeBase.getNullable("quantize_base")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun useDora(): Boolean? = useDora.getNullable("use_dora")

        /**
         * Returns the raw JSON value of [alpha].
         *
         * Unlike [alpha], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("alpha") @ExcludeMissing fun _alpha(): JsonField<Long> = alpha

        /**
         * Returns the raw JSON value of [applyLoraToMlp].
         *
         * Unlike [applyLoraToMlp], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("apply_lora_to_mlp")
        @ExcludeMissing
        fun _applyLoraToMlp(): JsonField<Boolean> = applyLoraToMlp

        /**
         * Returns the raw JSON value of [applyLoraToOutput].
         *
         * Unlike [applyLoraToOutput], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("apply_lora_to_output")
        @ExcludeMissing
        fun _applyLoraToOutput(): JsonField<Boolean> = applyLoraToOutput

        /**
         * Returns the raw JSON value of [loraAttnModules].
         *
         * Unlike [loraAttnModules], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("lora_attn_modules")
        @ExcludeMissing
        fun _loraAttnModules(): JsonField<List<String>> = loraAttnModules

        /**
         * Returns the raw JSON value of [rank].
         *
         * Unlike [rank], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rank") @ExcludeMissing fun _rank(): JsonField<Long> = rank

        /**
         * Returns the raw JSON value of [quantizeBase].
         *
         * Unlike [quantizeBase], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("quantize_base")
        @ExcludeMissing
        fun _quantizeBase(): JsonField<Boolean> = quantizeBase

        /**
         * Returns the raw JSON value of [useDora].
         *
         * Unlike [useDora], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("use_dora") @ExcludeMissing fun _useDora(): JsonField<Boolean> = useDora

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
             * Returns a mutable builder for constructing an instance of [LoraFinetuningConfig].
             *
             * The following fields are required:
             * ```kotlin
             * .alpha()
             * .applyLoraToMlp()
             * .applyLoraToOutput()
             * .loraAttnModules()
             * .rank()
             * ```
             */
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

            /**
             * Sets [Builder.alpha] to an arbitrary JSON value.
             *
             * You should usually call [Builder.alpha] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun alpha(alpha: JsonField<Long>) = apply { this.alpha = alpha }

            fun applyLoraToMlp(applyLoraToMlp: Boolean) =
                applyLoraToMlp(JsonField.of(applyLoraToMlp))

            /**
             * Sets [Builder.applyLoraToMlp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.applyLoraToMlp] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun applyLoraToMlp(applyLoraToMlp: JsonField<Boolean>) = apply {
                this.applyLoraToMlp = applyLoraToMlp
            }

            fun applyLoraToOutput(applyLoraToOutput: Boolean) =
                applyLoraToOutput(JsonField.of(applyLoraToOutput))

            /**
             * Sets [Builder.applyLoraToOutput] to an arbitrary JSON value.
             *
             * You should usually call [Builder.applyLoraToOutput] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun applyLoraToOutput(applyLoraToOutput: JsonField<Boolean>) = apply {
                this.applyLoraToOutput = applyLoraToOutput
            }

            fun loraAttnModules(loraAttnModules: List<String>) =
                loraAttnModules(JsonField.of(loraAttnModules))

            /**
             * Sets [Builder.loraAttnModules] to an arbitrary JSON value.
             *
             * You should usually call [Builder.loraAttnModules] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun loraAttnModules(loraAttnModules: JsonField<List<String>>) = apply {
                this.loraAttnModules = loraAttnModules.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [loraAttnModules].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addLoraAttnModule(loraAttnModule: String) = apply {
                loraAttnModules =
                    (loraAttnModules ?: JsonField.of(mutableListOf())).also {
                        checkKnown("loraAttnModules", it).add(loraAttnModule)
                    }
            }

            fun rank(rank: Long) = rank(JsonField.of(rank))

            /**
             * Sets [Builder.rank] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rank] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun rank(rank: JsonField<Long>) = apply { this.rank = rank }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("LoRA")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonValue) = apply { this.type = type }

            fun quantizeBase(quantizeBase: Boolean) = quantizeBase(JsonField.of(quantizeBase))

            /**
             * Sets [Builder.quantizeBase] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quantizeBase] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun quantizeBase(quantizeBase: JsonField<Boolean>) = apply {
                this.quantizeBase = quantizeBase
            }

            fun useDora(useDora: Boolean) = useDora(JsonField.of(useDora))

            /**
             * Sets [Builder.useDora] to an arbitrary JSON value.
             *
             * You should usually call [Builder.useDora] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [LoraFinetuningConfig].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .alpha()
             * .applyLoraToMlp()
             * .applyLoraToOutput()
             * .loraAttnModules()
             * .rank()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
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
                    additionalProperties.toMutableMap(),
                )
        }

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
            (if (alpha.asKnown() == null) 0 else 1) +
                (if (applyLoraToMlp.asKnown() == null) 0 else 1) +
                (if (applyLoraToOutput.asKnown() == null) 0 else 1) +
                (loraAttnModules.asKnown()?.size ?: 0) +
                (if (rank.asKnown() == null) 0 else 1) +
                type.let { if (it == JsonValue.from("LoRA")) 1 else 0 } +
                (if (quantizeBase.asKnown() == null) 0 else 1) +
                (if (useDora.asKnown() == null) 0 else 1)

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

    class QatFinetuningConfig
    private constructor(
        private val groupSize: JsonField<Long>,
        private val quantizerName: JsonField<String>,
        private val type: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("group_size")
            @ExcludeMissing
            groupSize: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("quantizer_name")
            @ExcludeMissing
            quantizerName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        ) : this(groupSize, quantizerName, type, mutableMapOf())

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun groupSize(): Long = groupSize.getRequired("group_size")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun quantizerName(): String = quantizerName.getRequired("quantizer_name")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("QAT")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * Returns the raw JSON value of [groupSize].
         *
         * Unlike [groupSize], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("group_size") @ExcludeMissing fun _groupSize(): JsonField<Long> = groupSize

        /**
         * Returns the raw JSON value of [quantizerName].
         *
         * Unlike [quantizerName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("quantizer_name")
        @ExcludeMissing
        fun _quantizerName(): JsonField<String> = quantizerName

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
             * Returns a mutable builder for constructing an instance of [QatFinetuningConfig].
             *
             * The following fields are required:
             * ```kotlin
             * .groupSize()
             * .quantizerName()
             * ```
             */
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

            /**
             * Sets [Builder.groupSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groupSize] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun groupSize(groupSize: JsonField<Long>) = apply { this.groupSize = groupSize }

            fun quantizerName(quantizerName: String) = quantizerName(JsonField.of(quantizerName))

            /**
             * Sets [Builder.quantizerName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quantizerName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun quantizerName(quantizerName: JsonField<String>) = apply {
                this.quantizerName = quantizerName
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("QAT")
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [QatFinetuningConfig].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .groupSize()
             * .quantizerName()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): QatFinetuningConfig =
                QatFinetuningConfig(
                    checkRequired("groupSize", groupSize),
                    checkRequired("quantizerName", quantizerName),
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

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
            (if (groupSize.asKnown() == null) 0 else 1) +
                (if (quantizerName.asKnown() == null) 0 else 1) +
                type.let { if (it == JsonValue.from("QAT")) 1 else 0 }

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
