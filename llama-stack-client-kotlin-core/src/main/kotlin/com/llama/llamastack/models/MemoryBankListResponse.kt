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
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

@JsonDeserialize(using = MemoryBankListResponse.Deserializer::class)
@JsonSerialize(using = MemoryBankListResponse.Serializer::class)
class MemoryBankListResponse
private constructor(
    private val vectorMemoryBank: VectorMemoryBank? = null,
    private val keyValueMemoryBank: KeyValueMemoryBank? = null,
    private val keywordMemoryBank: KeywordMemoryBank? = null,
    private val graphMemoryBank: GraphMemoryBank? = null,
    private val _json: JsonValue? = null,
) {

    private var validated: Boolean = false

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

    fun validate(): MemoryBankListResponse = apply {
        if (!validated) {
            if (
                vectorMemoryBank == null &&
                    keyValueMemoryBank == null &&
                    keywordMemoryBank == null &&
                    graphMemoryBank == null
            ) {
                throw LlamaStackClientInvalidDataException("Unknown MemoryBankListResponse: $_json")
            }
            vectorMemoryBank?.validate()
            keyValueMemoryBank?.validate()
            keywordMemoryBank?.validate()
            graphMemoryBank?.validate()
            validated = true
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is MemoryBankListResponse && vectorMemoryBank == other.vectorMemoryBank && keyValueMemoryBank == other.keyValueMemoryBank && keywordMemoryBank == other.keywordMemoryBank && graphMemoryBank == other.graphMemoryBank /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(vectorMemoryBank, keyValueMemoryBank, keywordMemoryBank, graphMemoryBank) /* spotless:on */

    override fun toString(): String =
        when {
            vectorMemoryBank != null -> "MemoryBankListResponse{vectorMemoryBank=$vectorMemoryBank}"
            keyValueMemoryBank != null ->
                "MemoryBankListResponse{keyValueMemoryBank=$keyValueMemoryBank}"
            keywordMemoryBank != null ->
                "MemoryBankListResponse{keywordMemoryBank=$keywordMemoryBank}"
            graphMemoryBank != null -> "MemoryBankListResponse{graphMemoryBank=$graphMemoryBank}"
            _json != null -> "MemoryBankListResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid MemoryBankListResponse")
        }

    companion object {

        fun ofVectorMemoryBank(vectorMemoryBank: VectorMemoryBank) =
            MemoryBankListResponse(vectorMemoryBank = vectorMemoryBank)

        fun ofKeyValueMemoryBank(keyValueMemoryBank: KeyValueMemoryBank) =
            MemoryBankListResponse(keyValueMemoryBank = keyValueMemoryBank)

        fun ofKeywordMemoryBank(keywordMemoryBank: KeywordMemoryBank) =
            MemoryBankListResponse(keywordMemoryBank = keywordMemoryBank)

        fun ofGraphMemoryBank(graphMemoryBank: GraphMemoryBank) =
            MemoryBankListResponse(graphMemoryBank = graphMemoryBank)
    }

    interface Visitor<out T> {

        fun visitVectorMemoryBank(vectorMemoryBank: VectorMemoryBank): T

        fun visitKeyValueMemoryBank(keyValueMemoryBank: KeyValueMemoryBank): T

        fun visitKeywordMemoryBank(keywordMemoryBank: KeywordMemoryBank): T

        fun visitGraphMemoryBank(graphMemoryBank: GraphMemoryBank): T

        fun unknown(json: JsonValue?): T {
            throw LlamaStackClientInvalidDataException("Unknown MemoryBankListResponse: $json")
        }
    }

    class Deserializer : BaseDeserializer<MemoryBankListResponse>(MemoryBankListResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): MemoryBankListResponse {
            val json = JsonValue.fromJsonNode(node)

            tryDeserialize(node, jacksonTypeRef<VectorMemoryBank>()) { it.validate() }
                ?.let {
                    return MemoryBankListResponse(vectorMemoryBank = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<KeyValueMemoryBank>()) { it.validate() }
                ?.let {
                    return MemoryBankListResponse(keyValueMemoryBank = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<KeywordMemoryBank>()) { it.validate() }
                ?.let {
                    return MemoryBankListResponse(keywordMemoryBank = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<GraphMemoryBank>()) { it.validate() }
                ?.let {
                    return MemoryBankListResponse(graphMemoryBank = it, _json = json)
                }

            return MemoryBankListResponse(_json = json)
        }
    }

    class Serializer : BaseSerializer<MemoryBankListResponse>(MemoryBankListResponse::class) {

        override fun serialize(
            value: MemoryBankListResponse,
            generator: JsonGenerator,
            provider: SerializerProvider
        ) {
            when {
                value.vectorMemoryBank != null -> generator.writeObject(value.vectorMemoryBank)
                value.keyValueMemoryBank != null -> generator.writeObject(value.keyValueMemoryBank)
                value.keywordMemoryBank != null -> generator.writeObject(value.keywordMemoryBank)
                value.graphMemoryBank != null -> generator.writeObject(value.graphMemoryBank)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid MemoryBankListResponse")
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
        @JsonProperty("embedding_dimension")
        @ExcludeMissing
        private val embeddingDimension: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("embedding_model")
        @ExcludeMissing
        private val embeddingModel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("identifier")
        @ExcludeMissing
        private val identifier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("memory_bank_type")
        @ExcludeMissing
        private val memoryBankType: JsonField<MemoryBankType> = JsonMissing.of(),
        @JsonProperty("overlap_size_in_tokens")
        @ExcludeMissing
        private val overlapSizeInTokens: JsonField<Long> = JsonMissing.of(),
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

        fun chunkSizeInTokens(): Long = chunkSizeInTokens.getRequired("chunk_size_in_tokens")

        fun embeddingDimension(): Long? = embeddingDimension.getNullable("embedding_dimension")

        fun embeddingModel(): String = embeddingModel.getRequired("embedding_model")

        fun identifier(): String = identifier.getRequired("identifier")

        fun memoryBankType(): MemoryBankType = memoryBankType.getRequired("memory_bank_type")

        fun overlapSizeInTokens(): Long? = overlapSizeInTokens.getNullable("overlap_size_in_tokens")

        fun providerId(): String = providerId.getRequired("provider_id")

        fun providerResourceId(): String = providerResourceId.getRequired("provider_resource_id")

        fun type(): Type = type.getRequired("type")

        @JsonProperty("chunk_size_in_tokens")
        @ExcludeMissing
        fun _chunkSizeInTokens() = chunkSizeInTokens

        @JsonProperty("embedding_dimension")
        @ExcludeMissing
        fun _embeddingDimension() = embeddingDimension

        @JsonProperty("embedding_model") @ExcludeMissing fun _embeddingModel() = embeddingModel

        @JsonProperty("identifier") @ExcludeMissing fun _identifier() = identifier

        @JsonProperty("memory_bank_type") @ExcludeMissing fun _memoryBankType() = memoryBankType

        @JsonProperty("overlap_size_in_tokens")
        @ExcludeMissing
        fun _overlapSizeInTokens() = overlapSizeInTokens

        @JsonProperty("provider_id") @ExcludeMissing fun _providerId() = providerId

        @JsonProperty("provider_resource_id")
        @ExcludeMissing
        fun _providerResourceId() = providerResourceId

        @JsonProperty("type") @ExcludeMissing fun _type() = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): VectorMemoryBank = apply {
            if (!validated) {
                chunkSizeInTokens()
                embeddingDimension()
                embeddingModel()
                identifier()
                memoryBankType()
                overlapSizeInTokens()
                providerId()
                providerResourceId()
                type()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var chunkSizeInTokens: JsonField<Long> = JsonMissing.of()
            private var embeddingDimension: JsonField<Long> = JsonMissing.of()
            private var embeddingModel: JsonField<String> = JsonMissing.of()
            private var identifier: JsonField<String> = JsonMissing.of()
            private var memoryBankType: JsonField<MemoryBankType> = JsonMissing.of()
            private var overlapSizeInTokens: JsonField<Long> = JsonMissing.of()
            private var providerId: JsonField<String> = JsonMissing.of()
            private var providerResourceId: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(vectorMemoryBank: VectorMemoryBank) = apply {
                chunkSizeInTokens = vectorMemoryBank.chunkSizeInTokens
                embeddingDimension = vectorMemoryBank.embeddingDimension
                embeddingModel = vectorMemoryBank.embeddingModel
                identifier = vectorMemoryBank.identifier
                memoryBankType = vectorMemoryBank.memoryBankType
                overlapSizeInTokens = vectorMemoryBank.overlapSizeInTokens
                providerId = vectorMemoryBank.providerId
                providerResourceId = vectorMemoryBank.providerResourceId
                type = vectorMemoryBank.type
                additionalProperties = vectorMemoryBank.additionalProperties.toMutableMap()
            }

            fun chunkSizeInTokens(chunkSizeInTokens: Long) =
                chunkSizeInTokens(JsonField.of(chunkSizeInTokens))

            fun chunkSizeInTokens(chunkSizeInTokens: JsonField<Long>) = apply {
                this.chunkSizeInTokens = chunkSizeInTokens
            }

            fun embeddingDimension(embeddingDimension: Long) =
                embeddingDimension(JsonField.of(embeddingDimension))

            fun embeddingDimension(embeddingDimension: JsonField<Long>) = apply {
                this.embeddingDimension = embeddingDimension
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

            fun overlapSizeInTokens(overlapSizeInTokens: Long) =
                overlapSizeInTokens(JsonField.of(overlapSizeInTokens))

            fun overlapSizeInTokens(overlapSizeInTokens: JsonField<Long>) = apply {
                this.overlapSizeInTokens = overlapSizeInTokens
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

            fun build(): VectorMemoryBank =
                VectorMemoryBank(
                    chunkSizeInTokens,
                    embeddingDimension,
                    embeddingModel,
                    identifier,
                    memoryBankType,
                    overlapSizeInTokens,
                    providerId,
                    providerResourceId,
                    type,
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

            return /* spotless:off */ other is VectorMemoryBank && chunkSizeInTokens == other.chunkSizeInTokens && embeddingDimension == other.embeddingDimension && embeddingModel == other.embeddingModel && identifier == other.identifier && memoryBankType == other.memoryBankType && overlapSizeInTokens == other.overlapSizeInTokens && providerId == other.providerId && providerResourceId == other.providerResourceId && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(chunkSizeInTokens, embeddingDimension, embeddingModel, identifier, memoryBankType, overlapSizeInTokens, providerId, providerResourceId, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "VectorMemoryBank{chunkSizeInTokens=$chunkSizeInTokens, embeddingDimension=$embeddingDimension, embeddingModel=$embeddingModel, identifier=$identifier, memoryBankType=$memoryBankType, overlapSizeInTokens=$overlapSizeInTokens, providerId=$providerId, providerResourceId=$providerResourceId, type=$type, additionalProperties=$additionalProperties}"
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

        @JsonProperty("identifier") @ExcludeMissing fun _identifier() = identifier

        @JsonProperty("memory_bank_type") @ExcludeMissing fun _memoryBankType() = memoryBankType

        @JsonProperty("provider_id") @ExcludeMissing fun _providerId() = providerId

        @JsonProperty("provider_resource_id")
        @ExcludeMissing
        fun _providerResourceId() = providerResourceId

        @JsonProperty("type") @ExcludeMissing fun _type() = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): KeyValueMemoryBank = apply {
            if (!validated) {
                identifier()
                memoryBankType()
                providerId()
                providerResourceId()
                type()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var identifier: JsonField<String> = JsonMissing.of()
            private var memoryBankType: JsonField<MemoryBankType> = JsonMissing.of()
            private var providerId: JsonField<String> = JsonMissing.of()
            private var providerResourceId: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
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
                    identifier,
                    memoryBankType,
                    providerId,
                    providerResourceId,
                    type,
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

        @JsonProperty("identifier") @ExcludeMissing fun _identifier() = identifier

        @JsonProperty("memory_bank_type") @ExcludeMissing fun _memoryBankType() = memoryBankType

        @JsonProperty("provider_id") @ExcludeMissing fun _providerId() = providerId

        @JsonProperty("provider_resource_id")
        @ExcludeMissing
        fun _providerResourceId() = providerResourceId

        @JsonProperty("type") @ExcludeMissing fun _type() = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): KeywordMemoryBank = apply {
            if (!validated) {
                identifier()
                memoryBankType()
                providerId()
                providerResourceId()
                type()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var identifier: JsonField<String> = JsonMissing.of()
            private var memoryBankType: JsonField<MemoryBankType> = JsonMissing.of()
            private var providerId: JsonField<String> = JsonMissing.of()
            private var providerResourceId: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
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
                    identifier,
                    memoryBankType,
                    providerId,
                    providerResourceId,
                    type,
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

        @JsonProperty("identifier") @ExcludeMissing fun _identifier() = identifier

        @JsonProperty("memory_bank_type") @ExcludeMissing fun _memoryBankType() = memoryBankType

        @JsonProperty("provider_id") @ExcludeMissing fun _providerId() = providerId

        @JsonProperty("provider_resource_id")
        @ExcludeMissing
        fun _providerResourceId() = providerResourceId

        @JsonProperty("type") @ExcludeMissing fun _type() = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): GraphMemoryBank = apply {
            if (!validated) {
                identifier()
                memoryBankType()
                providerId()
                providerResourceId()
                type()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var identifier: JsonField<String> = JsonMissing.of()
            private var memoryBankType: JsonField<MemoryBankType> = JsonMissing.of()
            private var providerId: JsonField<String> = JsonMissing.of()
            private var providerResourceId: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
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
                    identifier,
                    memoryBankType,
                    providerId,
                    providerResourceId,
                    type,
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
