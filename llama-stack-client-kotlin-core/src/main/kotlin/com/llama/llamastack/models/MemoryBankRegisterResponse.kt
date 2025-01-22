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

@JsonDeserialize(using = MemoryBankRegisterResponse.Deserializer::class)
@JsonSerialize(using = MemoryBankRegisterResponse.Serializer::class)
class MemoryBankRegisterResponse
private constructor(
    private val vectorMemoryBank: VectorMemoryBank? = null,
    private val keyValueMemoryBank: KeyValueMemoryBank? = null,
    private val keywordMemoryBank: KeywordMemoryBank? = null,
    private val graphMemoryBank: GraphMemoryBank? = null,
    private val _json: JsonValue? = null,
) {

    fun vectorMemoryBank(): VectorMemoryBank? = vectorMemoryBank

    fun keyValueMemoryBank(): KeyValueMemoryBank? = keyValueMemoryBank

    fun keywordMemoryBank(): KeywordMemoryBank? = keywordMemoryBank

    fun graphMemoryBank(): GraphMemoryBank? = graphMemoryBank

    fun isVectorMemoryBank(): Boolean = vectorMemoryBank != null

    fun isKeyValueMemoryBank(): Boolean = keyValueMemoryBank != null

    fun isKeywordMemoryBank(): Boolean = keywordMemoryBank != null

    fun isGraphMemoryBank(): Boolean = graphMemoryBank != null

    fun asVectorMemoryBank(): VectorMemoryBank = vectorMemoryBank.getOrThrow("vectorMemoryBank")

    fun asKeyValueMemoryBank(): KeyValueMemoryBank =
        keyValueMemoryBank.getOrThrow("keyValueMemoryBank")

    fun asKeywordMemoryBank(): KeywordMemoryBank = keywordMemoryBank.getOrThrow("keywordMemoryBank")

    fun asGraphMemoryBank(): GraphMemoryBank = graphMemoryBank.getOrThrow("graphMemoryBank")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            vectorMemoryBank != null -> visitor.visitVectorMemoryBank(vectorMemoryBank)
            keyValueMemoryBank != null -> visitor.visitKeyValueMemoryBank(keyValueMemoryBank)
            keywordMemoryBank != null -> visitor.visitKeywordMemoryBank(keywordMemoryBank)
            graphMemoryBank != null -> visitor.visitGraphMemoryBank(graphMemoryBank)
            else -> visitor.unknown(_json)
        }
    }

    private var validated: Boolean = false

    fun validate(): MemoryBankRegisterResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitVectorMemoryBank(vectorMemoryBank: VectorMemoryBank) {
                    vectorMemoryBank.validate()
                }

                override fun visitKeyValueMemoryBank(keyValueMemoryBank: KeyValueMemoryBank) {
                    keyValueMemoryBank.validate()
                }

                override fun visitKeywordMemoryBank(keywordMemoryBank: KeywordMemoryBank) {
                    keywordMemoryBank.validate()
                }

                override fun visitGraphMemoryBank(graphMemoryBank: GraphMemoryBank) {
                    graphMemoryBank.validate()
                }
            }
        )
        validated = true
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is MemoryBankRegisterResponse && vectorMemoryBank == other.vectorMemoryBank && keyValueMemoryBank == other.keyValueMemoryBank && keywordMemoryBank == other.keywordMemoryBank && graphMemoryBank == other.graphMemoryBank /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(vectorMemoryBank, keyValueMemoryBank, keywordMemoryBank, graphMemoryBank) /* spotless:on */

    override fun toString(): String =
        when {
            vectorMemoryBank != null ->
                "MemoryBankRegisterResponse{vectorMemoryBank=$vectorMemoryBank}"
            keyValueMemoryBank != null ->
                "MemoryBankRegisterResponse{keyValueMemoryBank=$keyValueMemoryBank}"
            keywordMemoryBank != null ->
                "MemoryBankRegisterResponse{keywordMemoryBank=$keywordMemoryBank}"
            graphMemoryBank != null ->
                "MemoryBankRegisterResponse{graphMemoryBank=$graphMemoryBank}"
            _json != null -> "MemoryBankRegisterResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid MemoryBankRegisterResponse")
        }

    companion object {

        fun ofVectorMemoryBank(vectorMemoryBank: VectorMemoryBank) =
            MemoryBankRegisterResponse(vectorMemoryBank = vectorMemoryBank)

        fun ofKeyValueMemoryBank(keyValueMemoryBank: KeyValueMemoryBank) =
            MemoryBankRegisterResponse(keyValueMemoryBank = keyValueMemoryBank)

        fun ofKeywordMemoryBank(keywordMemoryBank: KeywordMemoryBank) =
            MemoryBankRegisterResponse(keywordMemoryBank = keywordMemoryBank)

        fun ofGraphMemoryBank(graphMemoryBank: GraphMemoryBank) =
            MemoryBankRegisterResponse(graphMemoryBank = graphMemoryBank)
    }

    interface Visitor<out T> {

        fun visitVectorMemoryBank(vectorMemoryBank: VectorMemoryBank): T

        fun visitKeyValueMemoryBank(keyValueMemoryBank: KeyValueMemoryBank): T

        fun visitKeywordMemoryBank(keywordMemoryBank: KeywordMemoryBank): T

        fun visitGraphMemoryBank(graphMemoryBank: GraphMemoryBank): T

        fun unknown(json: JsonValue?): T {
            throw LlamaStackClientInvalidDataException("Unknown MemoryBankRegisterResponse: $json")
        }
    }

    class Deserializer :
        BaseDeserializer<MemoryBankRegisterResponse>(MemoryBankRegisterResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): MemoryBankRegisterResponse {
            val json = JsonValue.fromJsonNode(node)

            tryDeserialize(node, jacksonTypeRef<VectorMemoryBank>()) { it.validate() }
                ?.let {
                    return MemoryBankRegisterResponse(vectorMemoryBank = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<KeyValueMemoryBank>()) { it.validate() }
                ?.let {
                    return MemoryBankRegisterResponse(keyValueMemoryBank = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<KeywordMemoryBank>()) { it.validate() }
                ?.let {
                    return MemoryBankRegisterResponse(keywordMemoryBank = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<GraphMemoryBank>()) { it.validate() }
                ?.let {
                    return MemoryBankRegisterResponse(graphMemoryBank = it, _json = json)
                }

            return MemoryBankRegisterResponse(_json = json)
        }
    }

    class Serializer :
        BaseSerializer<MemoryBankRegisterResponse>(MemoryBankRegisterResponse::class) {

        override fun serialize(
            value: MemoryBankRegisterResponse,
            generator: JsonGenerator,
            provider: SerializerProvider
        ) {
            when {
                value.vectorMemoryBank != null -> generator.writeObject(value.vectorMemoryBank)
                value.keyValueMemoryBank != null -> generator.writeObject(value.keyValueMemoryBank)
                value.keywordMemoryBank != null -> generator.writeObject(value.keywordMemoryBank)
                value.graphMemoryBank != null -> generator.writeObject(value.graphMemoryBank)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid MemoryBankRegisterResponse")
            }
        }
    }

    @NoAutoDetect
    class VectorMemoryBank
    @JsonCreator
    private constructor(
        @JsonProperty("chunk_size_in_tokens")
        @ExcludeMissing
        private val chunkSizeInTokens: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("embedding_model")
        @ExcludeMissing
        private val embeddingModel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("identifier")
        @ExcludeMissing
        private val identifier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("memory_bank_type")
        @ExcludeMissing
        private val memoryBankType: JsonField<MemoryBankType> = JsonMissing.of(),
        @JsonProperty("provider_id")
        @ExcludeMissing
        private val providerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("provider_resource_id")
        @ExcludeMissing
        private val providerResourceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("embedding_dimension")
        @ExcludeMissing
        private val embeddingDimension: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("overlap_size_in_tokens")
        @ExcludeMissing
        private val overlapSizeInTokens: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun chunkSizeInTokens(): Long = chunkSizeInTokens.getRequired("chunk_size_in_tokens")

        fun embeddingModel(): String = embeddingModel.getRequired("embedding_model")

        fun identifier(): String = identifier.getRequired("identifier")

        fun memoryBankType(): MemoryBankType = memoryBankType.getRequired("memory_bank_type")

        fun providerId(): String = providerId.getRequired("provider_id")

        fun providerResourceId(): String = providerResourceId.getRequired("provider_resource_id")

        fun type(): Type = type.getRequired("type")

        fun embeddingDimension(): Long? = embeddingDimension.getNullable("embedding_dimension")

        fun overlapSizeInTokens(): Long? = overlapSizeInTokens.getNullable("overlap_size_in_tokens")

        @JsonProperty("chunk_size_in_tokens")
        @ExcludeMissing
        fun _chunkSizeInTokens(): JsonField<Long> = chunkSizeInTokens

        @JsonProperty("embedding_model")
        @ExcludeMissing
        fun _embeddingModel(): JsonField<String> = embeddingModel

        @JsonProperty("identifier")
        @ExcludeMissing
        fun _identifier(): JsonField<String> = identifier

        @JsonProperty("memory_bank_type")
        @ExcludeMissing
        fun _memoryBankType(): JsonField<MemoryBankType> = memoryBankType

        @JsonProperty("provider_id")
        @ExcludeMissing
        fun _providerId(): JsonField<String> = providerId

        @JsonProperty("provider_resource_id")
        @ExcludeMissing
        fun _providerResourceId(): JsonField<String> = providerResourceId

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        @JsonProperty("embedding_dimension")
        @ExcludeMissing
        fun _embeddingDimension(): JsonField<Long> = embeddingDimension

        @JsonProperty("overlap_size_in_tokens")
        @ExcludeMissing
        fun _overlapSizeInTokens(): JsonField<Long> = overlapSizeInTokens

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): VectorMemoryBank = apply {
            if (validated) {
                return@apply
            }

            chunkSizeInTokens()
            embeddingModel()
            identifier()
            memoryBankType()
            providerId()
            providerResourceId()
            type()
            embeddingDimension()
            overlapSizeInTokens()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var chunkSizeInTokens: JsonField<Long>? = null
            private var embeddingModel: JsonField<String>? = null
            private var identifier: JsonField<String>? = null
            private var memoryBankType: JsonField<MemoryBankType>? = null
            private var providerId: JsonField<String>? = null
            private var providerResourceId: JsonField<String>? = null
            private var type: JsonField<Type>? = null
            private var embeddingDimension: JsonField<Long> = JsonMissing.of()
            private var overlapSizeInTokens: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(vectorMemoryBank: VectorMemoryBank) = apply {
                chunkSizeInTokens = vectorMemoryBank.chunkSizeInTokens
                embeddingModel = vectorMemoryBank.embeddingModel
                identifier = vectorMemoryBank.identifier
                memoryBankType = vectorMemoryBank.memoryBankType
                providerId = vectorMemoryBank.providerId
                providerResourceId = vectorMemoryBank.providerResourceId
                type = vectorMemoryBank.type
                embeddingDimension = vectorMemoryBank.embeddingDimension
                overlapSizeInTokens = vectorMemoryBank.overlapSizeInTokens
                additionalProperties = vectorMemoryBank.additionalProperties.toMutableMap()
            }

            fun chunkSizeInTokens(chunkSizeInTokens: Long) =
                chunkSizeInTokens(JsonField.of(chunkSizeInTokens))

            fun chunkSizeInTokens(chunkSizeInTokens: JsonField<Long>) = apply {
                this.chunkSizeInTokens = chunkSizeInTokens
            }

            fun embeddingModel(embeddingModel: String) =
                embeddingModel(JsonField.of(embeddingModel))

            fun embeddingModel(embeddingModel: JsonField<String>) = apply {
                this.embeddingModel = embeddingModel
            }

            fun identifier(identifier: String) = identifier(JsonField.of(identifier))

            fun identifier(identifier: JsonField<String>) = apply { this.identifier = identifier }

            fun memoryBankType(memoryBankType: MemoryBankType) =
                memoryBankType(JsonField.of(memoryBankType))

            fun memoryBankType(memoryBankType: JsonField<MemoryBankType>) = apply {
                this.memoryBankType = memoryBankType
            }

            fun providerId(providerId: String) = providerId(JsonField.of(providerId))

            fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

            fun providerResourceId(providerResourceId: String) =
                providerResourceId(JsonField.of(providerResourceId))

            fun providerResourceId(providerResourceId: JsonField<String>) = apply {
                this.providerResourceId = providerResourceId
            }

            fun type(type: Type) = type(JsonField.of(type))

            fun type(type: JsonField<Type>) = apply { this.type = type }

            fun embeddingDimension(embeddingDimension: Long) =
                embeddingDimension(JsonField.of(embeddingDimension))

            fun embeddingDimension(embeddingDimension: JsonField<Long>) = apply {
                this.embeddingDimension = embeddingDimension
            }

            fun overlapSizeInTokens(overlapSizeInTokens: Long) =
                overlapSizeInTokens(JsonField.of(overlapSizeInTokens))

            fun overlapSizeInTokens(overlapSizeInTokens: JsonField<Long>) = apply {
                this.overlapSizeInTokens = overlapSizeInTokens
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

            fun build(): VectorMemoryBank =
                VectorMemoryBank(
                    checkRequired("chunkSizeInTokens", chunkSizeInTokens),
                    checkRequired("embeddingModel", embeddingModel),
                    checkRequired("identifier", identifier),
                    checkRequired("memoryBankType", memoryBankType),
                    checkRequired("providerId", providerId),
                    checkRequired("providerResourceId", providerResourceId),
                    checkRequired("type", type),
                    embeddingDimension,
                    overlapSizeInTokens,
                    additionalProperties.toImmutable(),
                )
        }

        class MemoryBankType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val VECTOR = of("vector")

                fun of(value: String) = MemoryBankType(JsonField.of(value))
            }

            enum class Known {
                VECTOR,
            }

            enum class Value {
                VECTOR,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    VECTOR -> Value.VECTOR
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    VECTOR -> Known.VECTOR
                    else ->
                        throw LlamaStackClientInvalidDataException("Unknown MemoryBankType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is MemoryBankType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val MEMORY_BANK = of("memory_bank")

                fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                MEMORY_BANK,
            }

            enum class Value {
                MEMORY_BANK,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    MEMORY_BANK -> Value.MEMORY_BANK
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    MEMORY_BANK -> Known.MEMORY_BANK
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

            return /* spotless:off */ other is VectorMemoryBank && chunkSizeInTokens == other.chunkSizeInTokens && embeddingModel == other.embeddingModel && identifier == other.identifier && memoryBankType == other.memoryBankType && providerId == other.providerId && providerResourceId == other.providerResourceId && type == other.type && embeddingDimension == other.embeddingDimension && overlapSizeInTokens == other.overlapSizeInTokens && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(chunkSizeInTokens, embeddingModel, identifier, memoryBankType, providerId, providerResourceId, type, embeddingDimension, overlapSizeInTokens, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "VectorMemoryBank{chunkSizeInTokens=$chunkSizeInTokens, embeddingModel=$embeddingModel, identifier=$identifier, memoryBankType=$memoryBankType, providerId=$providerId, providerResourceId=$providerResourceId, type=$type, embeddingDimension=$embeddingDimension, overlapSizeInTokens=$overlapSizeInTokens, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class KeyValueMemoryBank
    @JsonCreator
    private constructor(
        @JsonProperty("identifier")
        @ExcludeMissing
        private val identifier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("memory_bank_type")
        @ExcludeMissing
        private val memoryBankType: JsonField<MemoryBankType> = JsonMissing.of(),
        @JsonProperty("provider_id")
        @ExcludeMissing
        private val providerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("provider_resource_id")
        @ExcludeMissing
        private val providerResourceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun identifier(): String = identifier.getRequired("identifier")

        fun memoryBankType(): MemoryBankType = memoryBankType.getRequired("memory_bank_type")

        fun providerId(): String = providerId.getRequired("provider_id")

        fun providerResourceId(): String = providerResourceId.getRequired("provider_resource_id")

        fun type(): Type = type.getRequired("type")

        @JsonProperty("identifier")
        @ExcludeMissing
        fun _identifier(): JsonField<String> = identifier

        @JsonProperty("memory_bank_type")
        @ExcludeMissing
        fun _memoryBankType(): JsonField<MemoryBankType> = memoryBankType

        @JsonProperty("provider_id")
        @ExcludeMissing
        fun _providerId(): JsonField<String> = providerId

        @JsonProperty("provider_resource_id")
        @ExcludeMissing
        fun _providerResourceId(): JsonField<String> = providerResourceId

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): KeyValueMemoryBank = apply {
            if (validated) {
                return@apply
            }

            identifier()
            memoryBankType()
            providerId()
            providerResourceId()
            type()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var identifier: JsonField<String>? = null
            private var memoryBankType: JsonField<MemoryBankType>? = null
            private var providerId: JsonField<String>? = null
            private var providerResourceId: JsonField<String>? = null
            private var type: JsonField<Type>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(keyValueMemoryBank: KeyValueMemoryBank) = apply {
                identifier = keyValueMemoryBank.identifier
                memoryBankType = keyValueMemoryBank.memoryBankType
                providerId = keyValueMemoryBank.providerId
                providerResourceId = keyValueMemoryBank.providerResourceId
                type = keyValueMemoryBank.type
                additionalProperties = keyValueMemoryBank.additionalProperties.toMutableMap()
            }

            fun identifier(identifier: String) = identifier(JsonField.of(identifier))

            fun identifier(identifier: JsonField<String>) = apply { this.identifier = identifier }

            fun memoryBankType(memoryBankType: MemoryBankType) =
                memoryBankType(JsonField.of(memoryBankType))

            fun memoryBankType(memoryBankType: JsonField<MemoryBankType>) = apply {
                this.memoryBankType = memoryBankType
            }

            fun providerId(providerId: String) = providerId(JsonField.of(providerId))

            fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

            fun providerResourceId(providerResourceId: String) =
                providerResourceId(JsonField.of(providerResourceId))

            fun providerResourceId(providerResourceId: JsonField<String>) = apply {
                this.providerResourceId = providerResourceId
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): KeyValueMemoryBank =
                KeyValueMemoryBank(
                    checkRequired("identifier", identifier),
                    checkRequired("memoryBankType", memoryBankType),
                    checkRequired("providerId", providerId),
                    checkRequired("providerResourceId", providerResourceId),
                    checkRequired("type", type),
                    additionalProperties.toImmutable(),
                )
        }

        class MemoryBankType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val KEYVALUE = of("keyvalue")

                fun of(value: String) = MemoryBankType(JsonField.of(value))
            }

            enum class Known {
                KEYVALUE,
            }

            enum class Value {
                KEYVALUE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    KEYVALUE -> Value.KEYVALUE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    KEYVALUE -> Known.KEYVALUE
                    else ->
                        throw LlamaStackClientInvalidDataException("Unknown MemoryBankType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is MemoryBankType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val MEMORY_BANK = of("memory_bank")

                fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                MEMORY_BANK,
            }

            enum class Value {
                MEMORY_BANK,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    MEMORY_BANK -> Value.MEMORY_BANK
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    MEMORY_BANK -> Known.MEMORY_BANK
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

            return /* spotless:off */ other is KeyValueMemoryBank && identifier == other.identifier && memoryBankType == other.memoryBankType && providerId == other.providerId && providerResourceId == other.providerResourceId && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(identifier, memoryBankType, providerId, providerResourceId, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "KeyValueMemoryBank{identifier=$identifier, memoryBankType=$memoryBankType, providerId=$providerId, providerResourceId=$providerResourceId, type=$type, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class KeywordMemoryBank
    @JsonCreator
    private constructor(
        @JsonProperty("identifier")
        @ExcludeMissing
        private val identifier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("memory_bank_type")
        @ExcludeMissing
        private val memoryBankType: JsonField<MemoryBankType> = JsonMissing.of(),
        @JsonProperty("provider_id")
        @ExcludeMissing
        private val providerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("provider_resource_id")
        @ExcludeMissing
        private val providerResourceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun identifier(): String = identifier.getRequired("identifier")

        fun memoryBankType(): MemoryBankType = memoryBankType.getRequired("memory_bank_type")

        fun providerId(): String = providerId.getRequired("provider_id")

        fun providerResourceId(): String = providerResourceId.getRequired("provider_resource_id")

        fun type(): Type = type.getRequired("type")

        @JsonProperty("identifier")
        @ExcludeMissing
        fun _identifier(): JsonField<String> = identifier

        @JsonProperty("memory_bank_type")
        @ExcludeMissing
        fun _memoryBankType(): JsonField<MemoryBankType> = memoryBankType

        @JsonProperty("provider_id")
        @ExcludeMissing
        fun _providerId(): JsonField<String> = providerId

        @JsonProperty("provider_resource_id")
        @ExcludeMissing
        fun _providerResourceId(): JsonField<String> = providerResourceId

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): KeywordMemoryBank = apply {
            if (validated) {
                return@apply
            }

            identifier()
            memoryBankType()
            providerId()
            providerResourceId()
            type()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var identifier: JsonField<String>? = null
            private var memoryBankType: JsonField<MemoryBankType>? = null
            private var providerId: JsonField<String>? = null
            private var providerResourceId: JsonField<String>? = null
            private var type: JsonField<Type>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(keywordMemoryBank: KeywordMemoryBank) = apply {
                identifier = keywordMemoryBank.identifier
                memoryBankType = keywordMemoryBank.memoryBankType
                providerId = keywordMemoryBank.providerId
                providerResourceId = keywordMemoryBank.providerResourceId
                type = keywordMemoryBank.type
                additionalProperties = keywordMemoryBank.additionalProperties.toMutableMap()
            }

            fun identifier(identifier: String) = identifier(JsonField.of(identifier))

            fun identifier(identifier: JsonField<String>) = apply { this.identifier = identifier }

            fun memoryBankType(memoryBankType: MemoryBankType) =
                memoryBankType(JsonField.of(memoryBankType))

            fun memoryBankType(memoryBankType: JsonField<MemoryBankType>) = apply {
                this.memoryBankType = memoryBankType
            }

            fun providerId(providerId: String) = providerId(JsonField.of(providerId))

            fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

            fun providerResourceId(providerResourceId: String) =
                providerResourceId(JsonField.of(providerResourceId))

            fun providerResourceId(providerResourceId: JsonField<String>) = apply {
                this.providerResourceId = providerResourceId
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): KeywordMemoryBank =
                KeywordMemoryBank(
                    checkRequired("identifier", identifier),
                    checkRequired("memoryBankType", memoryBankType),
                    checkRequired("providerId", providerId),
                    checkRequired("providerResourceId", providerResourceId),
                    checkRequired("type", type),
                    additionalProperties.toImmutable(),
                )
        }

        class MemoryBankType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val KEYWORD = of("keyword")

                fun of(value: String) = MemoryBankType(JsonField.of(value))
            }

            enum class Known {
                KEYWORD,
            }

            enum class Value {
                KEYWORD,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    KEYWORD -> Value.KEYWORD
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    KEYWORD -> Known.KEYWORD
                    else ->
                        throw LlamaStackClientInvalidDataException("Unknown MemoryBankType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is MemoryBankType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val MEMORY_BANK = of("memory_bank")

                fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                MEMORY_BANK,
            }

            enum class Value {
                MEMORY_BANK,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    MEMORY_BANK -> Value.MEMORY_BANK
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    MEMORY_BANK -> Known.MEMORY_BANK
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

            return /* spotless:off */ other is KeywordMemoryBank && identifier == other.identifier && memoryBankType == other.memoryBankType && providerId == other.providerId && providerResourceId == other.providerResourceId && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(identifier, memoryBankType, providerId, providerResourceId, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "KeywordMemoryBank{identifier=$identifier, memoryBankType=$memoryBankType, providerId=$providerId, providerResourceId=$providerResourceId, type=$type, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class GraphMemoryBank
    @JsonCreator
    private constructor(
        @JsonProperty("identifier")
        @ExcludeMissing
        private val identifier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("memory_bank_type")
        @ExcludeMissing
        private val memoryBankType: JsonField<MemoryBankType> = JsonMissing.of(),
        @JsonProperty("provider_id")
        @ExcludeMissing
        private val providerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("provider_resource_id")
        @ExcludeMissing
        private val providerResourceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun identifier(): String = identifier.getRequired("identifier")

        fun memoryBankType(): MemoryBankType = memoryBankType.getRequired("memory_bank_type")

        fun providerId(): String = providerId.getRequired("provider_id")

        fun providerResourceId(): String = providerResourceId.getRequired("provider_resource_id")

        fun type(): Type = type.getRequired("type")

        @JsonProperty("identifier")
        @ExcludeMissing
        fun _identifier(): JsonField<String> = identifier

        @JsonProperty("memory_bank_type")
        @ExcludeMissing
        fun _memoryBankType(): JsonField<MemoryBankType> = memoryBankType

        @JsonProperty("provider_id")
        @ExcludeMissing
        fun _providerId(): JsonField<String> = providerId

        @JsonProperty("provider_resource_id")
        @ExcludeMissing
        fun _providerResourceId(): JsonField<String> = providerResourceId

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): GraphMemoryBank = apply {
            if (validated) {
                return@apply
            }

            identifier()
            memoryBankType()
            providerId()
            providerResourceId()
            type()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var identifier: JsonField<String>? = null
            private var memoryBankType: JsonField<MemoryBankType>? = null
            private var providerId: JsonField<String>? = null
            private var providerResourceId: JsonField<String>? = null
            private var type: JsonField<Type>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(graphMemoryBank: GraphMemoryBank) = apply {
                identifier = graphMemoryBank.identifier
                memoryBankType = graphMemoryBank.memoryBankType
                providerId = graphMemoryBank.providerId
                providerResourceId = graphMemoryBank.providerResourceId
                type = graphMemoryBank.type
                additionalProperties = graphMemoryBank.additionalProperties.toMutableMap()
            }

            fun identifier(identifier: String) = identifier(JsonField.of(identifier))

            fun identifier(identifier: JsonField<String>) = apply { this.identifier = identifier }

            fun memoryBankType(memoryBankType: MemoryBankType) =
                memoryBankType(JsonField.of(memoryBankType))

            fun memoryBankType(memoryBankType: JsonField<MemoryBankType>) = apply {
                this.memoryBankType = memoryBankType
            }

            fun providerId(providerId: String) = providerId(JsonField.of(providerId))

            fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

            fun providerResourceId(providerResourceId: String) =
                providerResourceId(JsonField.of(providerResourceId))

            fun providerResourceId(providerResourceId: JsonField<String>) = apply {
                this.providerResourceId = providerResourceId
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): GraphMemoryBank =
                GraphMemoryBank(
                    checkRequired("identifier", identifier),
                    checkRequired("memoryBankType", memoryBankType),
                    checkRequired("providerId", providerId),
                    checkRequired("providerResourceId", providerResourceId),
                    checkRequired("type", type),
                    additionalProperties.toImmutable(),
                )
        }

        class MemoryBankType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val GRAPH = of("graph")

                fun of(value: String) = MemoryBankType(JsonField.of(value))
            }

            enum class Known {
                GRAPH,
            }

            enum class Value {
                GRAPH,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    GRAPH -> Value.GRAPH
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    GRAPH -> Known.GRAPH
                    else ->
                        throw LlamaStackClientInvalidDataException("Unknown MemoryBankType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is MemoryBankType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val MEMORY_BANK = of("memory_bank")

                fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                MEMORY_BANK,
            }

            enum class Value {
                MEMORY_BANK,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    MEMORY_BANK -> Value.MEMORY_BANK
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    MEMORY_BANK -> Known.MEMORY_BANK
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

            return /* spotless:off */ other is GraphMemoryBank && identifier == other.identifier && memoryBankType == other.memoryBankType && providerId == other.providerId && providerResourceId == other.providerResourceId && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(identifier, memoryBankType, providerId, providerResourceId, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "GraphMemoryBank{identifier=$identifier, memoryBankType=$memoryBankType, providerId=$providerId, providerResourceId=$providerResourceId, type=$type, additionalProperties=$additionalProperties}"
    }
}
