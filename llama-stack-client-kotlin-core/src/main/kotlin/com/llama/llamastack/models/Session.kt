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
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class Session
@JsonCreator
private constructor(
    @JsonProperty("session_id")
    @ExcludeMissing
    private val sessionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("session_name")
    @ExcludeMissing
    private val sessionName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("started_at")
    @ExcludeMissing
    private val startedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("turns")
    @ExcludeMissing
    private val turns: JsonField<List<Turn>> = JsonMissing.of(),
    @JsonProperty("memory_bank")
    @ExcludeMissing
    private val memoryBank: JsonField<MemoryBank> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun sessionId(): String = sessionId.getRequired("session_id")

    fun sessionName(): String = sessionName.getRequired("session_name")

    fun startedAt(): OffsetDateTime = startedAt.getRequired("started_at")

    fun turns(): List<Turn> = turns.getRequired("turns")

    fun memoryBank(): MemoryBank? = memoryBank.getNullable("memory_bank")

    @JsonProperty("session_id") @ExcludeMissing fun _sessionId(): JsonField<String> = sessionId

    @JsonProperty("session_name")
    @ExcludeMissing
    fun _sessionName(): JsonField<String> = sessionName

    @JsonProperty("started_at")
    @ExcludeMissing
    fun _startedAt(): JsonField<OffsetDateTime> = startedAt

    @JsonProperty("turns") @ExcludeMissing fun _turns(): JsonField<List<Turn>> = turns

    @JsonProperty("memory_bank")
    @ExcludeMissing
    fun _memoryBank(): JsonField<MemoryBank> = memoryBank

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Session = apply {
        if (validated) {
            return@apply
        }

        sessionId()
        sessionName()
        startedAt()
        turns().forEach { it.validate() }
        memoryBank()?.validate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var sessionId: JsonField<String>? = null
        private var sessionName: JsonField<String>? = null
        private var startedAt: JsonField<OffsetDateTime>? = null
        private var turns: JsonField<MutableList<Turn>>? = null
        private var memoryBank: JsonField<MemoryBank> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(session: Session) = apply {
            sessionId = session.sessionId
            sessionName = session.sessionName
            startedAt = session.startedAt
            turns = session.turns.map { it.toMutableList() }
            memoryBank = session.memoryBank
            additionalProperties = session.additionalProperties.toMutableMap()
        }

        fun sessionId(sessionId: String) = sessionId(JsonField.of(sessionId))

        fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

        fun sessionName(sessionName: String) = sessionName(JsonField.of(sessionName))

        fun sessionName(sessionName: JsonField<String>) = apply { this.sessionName = sessionName }

        fun startedAt(startedAt: OffsetDateTime) = startedAt(JsonField.of(startedAt))

        fun startedAt(startedAt: JsonField<OffsetDateTime>) = apply { this.startedAt = startedAt }

        fun turns(turns: List<Turn>) = turns(JsonField.of(turns))

        fun turns(turns: JsonField<List<Turn>>) = apply {
            this.turns = turns.map { it.toMutableList() }
        }

        fun addTurn(turn: Turn) = apply {
            turns =
                (turns ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(turn)
                }
        }

        fun memoryBank(memoryBank: MemoryBank) = memoryBank(JsonField.of(memoryBank))

        fun memoryBank(memoryBank: JsonField<MemoryBank>) = apply { this.memoryBank = memoryBank }

        fun memoryBank(vectorMemoryBank: MemoryBank.VectorMemoryBank) =
            memoryBank(MemoryBank.ofVectorMemoryBank(vectorMemoryBank))

        fun memoryBank(keyValueMemoryBank: MemoryBank.KeyValueMemoryBank) =
            memoryBank(MemoryBank.ofKeyValueMemoryBank(keyValueMemoryBank))

        fun memoryBank(keywordMemoryBank: MemoryBank.KeywordMemoryBank) =
            memoryBank(MemoryBank.ofKeywordMemoryBank(keywordMemoryBank))

        fun memoryBank(graphMemoryBank: MemoryBank.GraphMemoryBank) =
            memoryBank(MemoryBank.ofGraphMemoryBank(graphMemoryBank))

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

        fun build(): Session =
            Session(
                checkRequired("sessionId", sessionId),
                checkRequired("sessionName", sessionName),
                checkRequired("startedAt", startedAt),
                checkRequired("turns", turns).map { it.toImmutable() },
                memoryBank,
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(using = MemoryBank.Deserializer::class)
    @JsonSerialize(using = MemoryBank.Serializer::class)
    class MemoryBank
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

        fun asKeywordMemoryBank(): KeywordMemoryBank =
            keywordMemoryBank.getOrThrow("keywordMemoryBank")

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

        fun validate(): MemoryBank = apply {
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

            return /* spotless:off */ other is MemoryBank && vectorMemoryBank == other.vectorMemoryBank && keyValueMemoryBank == other.keyValueMemoryBank && keywordMemoryBank == other.keywordMemoryBank && graphMemoryBank == other.graphMemoryBank /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(vectorMemoryBank, keyValueMemoryBank, keywordMemoryBank, graphMemoryBank) /* spotless:on */

        override fun toString(): String =
            when {
                vectorMemoryBank != null -> "MemoryBank{vectorMemoryBank=$vectorMemoryBank}"
                keyValueMemoryBank != null -> "MemoryBank{keyValueMemoryBank=$keyValueMemoryBank}"
                keywordMemoryBank != null -> "MemoryBank{keywordMemoryBank=$keywordMemoryBank}"
                graphMemoryBank != null -> "MemoryBank{graphMemoryBank=$graphMemoryBank}"
                _json != null -> "MemoryBank{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid MemoryBank")
            }

        companion object {

            fun ofVectorMemoryBank(vectorMemoryBank: VectorMemoryBank) =
                MemoryBank(vectorMemoryBank = vectorMemoryBank)

            fun ofKeyValueMemoryBank(keyValueMemoryBank: KeyValueMemoryBank) =
                MemoryBank(keyValueMemoryBank = keyValueMemoryBank)

            fun ofKeywordMemoryBank(keywordMemoryBank: KeywordMemoryBank) =
                MemoryBank(keywordMemoryBank = keywordMemoryBank)

            fun ofGraphMemoryBank(graphMemoryBank: GraphMemoryBank) =
                MemoryBank(graphMemoryBank = graphMemoryBank)
        }

        interface Visitor<out T> {

            fun visitVectorMemoryBank(vectorMemoryBank: VectorMemoryBank): T

            fun visitKeyValueMemoryBank(keyValueMemoryBank: KeyValueMemoryBank): T

            fun visitKeywordMemoryBank(keywordMemoryBank: KeywordMemoryBank): T

            fun visitGraphMemoryBank(graphMemoryBank: GraphMemoryBank): T

            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown MemoryBank: $json")
            }
        }

        class Deserializer : BaseDeserializer<MemoryBank>(MemoryBank::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): MemoryBank {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<VectorMemoryBank>()) { it.validate() }
                    ?.let {
                        return MemoryBank(vectorMemoryBank = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<KeyValueMemoryBank>()) { it.validate() }
                    ?.let {
                        return MemoryBank(keyValueMemoryBank = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<KeywordMemoryBank>()) { it.validate() }
                    ?.let {
                        return MemoryBank(keywordMemoryBank = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<GraphMemoryBank>()) { it.validate() }
                    ?.let {
                        return MemoryBank(graphMemoryBank = it, _json = json)
                    }

                return MemoryBank(_json = json)
            }
        }

        class Serializer : BaseSerializer<MemoryBank>(MemoryBank::class) {

            override fun serialize(
                value: MemoryBank,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.vectorMemoryBank != null -> generator.writeObject(value.vectorMemoryBank)
                    value.keyValueMemoryBank != null ->
                        generator.writeObject(value.keyValueMemoryBank)
                    value.keywordMemoryBank != null ->
                        generator.writeObject(value.keywordMemoryBank)
                    value.graphMemoryBank != null -> generator.writeObject(value.graphMemoryBank)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid MemoryBank")
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
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
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

            fun providerResourceId(): String =
                providerResourceId.getRequired("provider_resource_id")

            fun type(): Type = type.getRequired("type")

            fun embeddingDimension(): Long? = embeddingDimension.getNullable("embedding_dimension")

            fun overlapSizeInTokens(): Long? =
                overlapSizeInTokens.getNullable("overlap_size_in_tokens")

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

                fun identifier(identifier: JsonField<String>) = apply {
                    this.identifier = identifier
                }

                fun memoryBankType(memoryBankType: MemoryBankType) =
                    memoryBankType(JsonField.of(memoryBankType))

                fun memoryBankType(memoryBankType: JsonField<MemoryBankType>) = apply {
                    this.memoryBankType = memoryBankType
                }

                fun providerId(providerId: String) = providerId(JsonField.of(providerId))

                fun providerId(providerId: JsonField<String>) = apply {
                    this.providerId = providerId
                }

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
                            throw LlamaStackClientInvalidDataException(
                                "Unknown MemoryBankType: $value"
                            )
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
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun identifier(): String = identifier.getRequired("identifier")

            fun memoryBankType(): MemoryBankType = memoryBankType.getRequired("memory_bank_type")

            fun providerId(): String = providerId.getRequired("provider_id")

            fun providerResourceId(): String =
                providerResourceId.getRequired("provider_resource_id")

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

                fun identifier(identifier: JsonField<String>) = apply {
                    this.identifier = identifier
                }

                fun memoryBankType(memoryBankType: MemoryBankType) =
                    memoryBankType(JsonField.of(memoryBankType))

                fun memoryBankType(memoryBankType: JsonField<MemoryBankType>) = apply {
                    this.memoryBankType = memoryBankType
                }

                fun providerId(providerId: String) = providerId(JsonField.of(providerId))

                fun providerId(providerId: JsonField<String>) = apply {
                    this.providerId = providerId
                }

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
                            throw LlamaStackClientInvalidDataException(
                                "Unknown MemoryBankType: $value"
                            )
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
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun identifier(): String = identifier.getRequired("identifier")

            fun memoryBankType(): MemoryBankType = memoryBankType.getRequired("memory_bank_type")

            fun providerId(): String = providerId.getRequired("provider_id")

            fun providerResourceId(): String =
                providerResourceId.getRequired("provider_resource_id")

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

                fun identifier(identifier: JsonField<String>) = apply {
                    this.identifier = identifier
                }

                fun memoryBankType(memoryBankType: MemoryBankType) =
                    memoryBankType(JsonField.of(memoryBankType))

                fun memoryBankType(memoryBankType: JsonField<MemoryBankType>) = apply {
                    this.memoryBankType = memoryBankType
                }

                fun providerId(providerId: String) = providerId(JsonField.of(providerId))

                fun providerId(providerId: JsonField<String>) = apply {
                    this.providerId = providerId
                }

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
                            throw LlamaStackClientInvalidDataException(
                                "Unknown MemoryBankType: $value"
                            )
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
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun identifier(): String = identifier.getRequired("identifier")

            fun memoryBankType(): MemoryBankType = memoryBankType.getRequired("memory_bank_type")

            fun providerId(): String = providerId.getRequired("provider_id")

            fun providerResourceId(): String =
                providerResourceId.getRequired("provider_resource_id")

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

                fun identifier(identifier: JsonField<String>) = apply {
                    this.identifier = identifier
                }

                fun memoryBankType(memoryBankType: MemoryBankType) =
                    memoryBankType(JsonField.of(memoryBankType))

                fun memoryBankType(memoryBankType: JsonField<MemoryBankType>) = apply {
                    this.memoryBankType = memoryBankType
                }

                fun providerId(providerId: String) = providerId(JsonField.of(providerId))

                fun providerId(providerId: JsonField<String>) = apply {
                    this.providerId = providerId
                }

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
                            throw LlamaStackClientInvalidDataException(
                                "Unknown MemoryBankType: $value"
                            )
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Session && sessionId == other.sessionId && sessionName == other.sessionName && startedAt == other.startedAt && turns == other.turns && memoryBank == other.memoryBank && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(sessionId, sessionName, startedAt, turns, memoryBank, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Session{sessionId=$sessionId, sessionName=$sessionName, startedAt=$startedAt, turns=$turns, memoryBank=$memoryBank, additionalProperties=$additionalProperties}"
}
