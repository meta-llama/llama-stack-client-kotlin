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
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = Session.Builder::class)
@NoAutoDetect
class Session
private constructor(
    private val memoryBank: JsonField<MemoryBank>,
    private val sessionId: JsonField<String>,
    private val sessionName: JsonField<String>,
    private val startedAt: JsonField<OffsetDateTime>,
    private val turns: JsonField<List<Turn>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun memoryBank(): MemoryBank? = memoryBank.getNullable("memory_bank")

    fun sessionId(): String = sessionId.getRequired("session_id")

    fun sessionName(): String = sessionName.getRequired("session_name")

    fun startedAt(): OffsetDateTime = startedAt.getRequired("started_at")

    fun turns(): List<Turn> = turns.getRequired("turns")

    @JsonProperty("memory_bank") @ExcludeMissing fun _memoryBank() = memoryBank

    @JsonProperty("session_id") @ExcludeMissing fun _sessionId() = sessionId

    @JsonProperty("session_name") @ExcludeMissing fun _sessionName() = sessionName

    @JsonProperty("started_at") @ExcludeMissing fun _startedAt() = startedAt

    @JsonProperty("turns") @ExcludeMissing fun _turns() = turns

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Session = apply {
        if (!validated) {
            memoryBank()
            sessionId()
            sessionName()
            startedAt()
            turns().forEach { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var memoryBank: JsonField<MemoryBank> = JsonMissing.of()
        private var sessionId: JsonField<String> = JsonMissing.of()
        private var sessionName: JsonField<String> = JsonMissing.of()
        private var startedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var turns: JsonField<List<Turn>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(session: Session) = apply {
            this.memoryBank = session.memoryBank
            this.sessionId = session.sessionId
            this.sessionName = session.sessionName
            this.startedAt = session.startedAt
            this.turns = session.turns
            additionalProperties(session.additionalProperties)
        }

        fun memoryBank(memoryBank: MemoryBank) = memoryBank(JsonField.of(memoryBank))

        @JsonProperty("memory_bank")
        @ExcludeMissing
        fun memoryBank(memoryBank: JsonField<MemoryBank>) = apply { this.memoryBank = memoryBank }

        fun sessionId(sessionId: String) = sessionId(JsonField.of(sessionId))

        @JsonProperty("session_id")
        @ExcludeMissing
        fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

        fun sessionName(sessionName: String) = sessionName(JsonField.of(sessionName))

        @JsonProperty("session_name")
        @ExcludeMissing
        fun sessionName(sessionName: JsonField<String>) = apply { this.sessionName = sessionName }

        fun startedAt(startedAt: OffsetDateTime) = startedAt(JsonField.of(startedAt))

        @JsonProperty("started_at")
        @ExcludeMissing
        fun startedAt(startedAt: JsonField<OffsetDateTime>) = apply { this.startedAt = startedAt }

        fun turns(turns: List<Turn>) = turns(JsonField.of(turns))

        @JsonProperty("turns")
        @ExcludeMissing
        fun turns(turns: JsonField<List<Turn>>) = apply { this.turns = turns }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): Session =
            Session(
                memoryBank,
                sessionId,
                sessionName,
                startedAt,
                turns.map { it.toImmutable() },
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

        fun validate(): MemoryBank = apply {
            if (!validated) {
                if (
                    vectorMemoryBank == null &&
                        keyValueMemoryBank == null &&
                        keywordMemoryBank == null &&
                        graphMemoryBank == null
                ) {
                    throw LlamaStackClientInvalidDataException("Unknown MemoryBank: $_json")
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

            return /* spotless:off */ other is MemoryBank && this.vectorMemoryBank == other.vectorMemoryBank && this.keyValueMemoryBank == other.keyValueMemoryBank && this.keywordMemoryBank == other.keywordMemoryBank && this.graphMemoryBank == other.graphMemoryBank /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(vectorMemoryBank, keyValueMemoryBank, keywordMemoryBank, graphMemoryBank) /* spotless:on */
        }

        override fun toString(): String {
            return when {
                vectorMemoryBank != null -> "MemoryBank{vectorMemoryBank=$vectorMemoryBank}"
                keyValueMemoryBank != null -> "MemoryBank{keyValueMemoryBank=$keyValueMemoryBank}"
                keywordMemoryBank != null -> "MemoryBank{keywordMemoryBank=$keywordMemoryBank}"
                graphMemoryBank != null -> "MemoryBank{graphMemoryBank=$graphMemoryBank}"
                _json != null -> "MemoryBank{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid MemoryBank")
            }
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

        @JsonDeserialize(builder = VectorMemoryBank.Builder::class)
        @NoAutoDetect
        class VectorMemoryBank
        private constructor(
            private val chunkSizeInTokens: JsonField<Long>,
            private val embeddingModel: JsonField<String>,
            private val identifier: JsonField<String>,
            private val memoryBankType: JsonField<MemoryBankType>,
            private val overlapSizeInTokens: JsonField<Long>,
            private val providerId: JsonField<String>,
            private val providerResourceId: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun chunkSizeInTokens(): Long = chunkSizeInTokens.getRequired("chunk_size_in_tokens")

            fun embeddingModel(): String = embeddingModel.getRequired("embedding_model")

            fun identifier(): String = identifier.getRequired("identifier")

            fun memoryBankType(): MemoryBankType = memoryBankType.getRequired("memory_bank_type")

            fun overlapSizeInTokens(): Long? =
                overlapSizeInTokens.getNullable("overlap_size_in_tokens")

            fun providerId(): String = providerId.getRequired("provider_id")

            fun providerResourceId(): String =
                providerResourceId.getRequired("provider_resource_id")

            fun type(): Type = type.getRequired("type")

            @JsonProperty("chunk_size_in_tokens")
            @ExcludeMissing
            fun _chunkSizeInTokens() = chunkSizeInTokens

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

            fun validate(): VectorMemoryBank = apply {
                if (!validated) {
                    chunkSizeInTokens()
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
                private var embeddingModel: JsonField<String> = JsonMissing.of()
                private var identifier: JsonField<String> = JsonMissing.of()
                private var memoryBankType: JsonField<MemoryBankType> = JsonMissing.of()
                private var overlapSizeInTokens: JsonField<Long> = JsonMissing.of()
                private var providerId: JsonField<String> = JsonMissing.of()
                private var providerResourceId: JsonField<String> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(vectorMemoryBank: VectorMemoryBank) = apply {
                    this.chunkSizeInTokens = vectorMemoryBank.chunkSizeInTokens
                    this.embeddingModel = vectorMemoryBank.embeddingModel
                    this.identifier = vectorMemoryBank.identifier
                    this.memoryBankType = vectorMemoryBank.memoryBankType
                    this.overlapSizeInTokens = vectorMemoryBank.overlapSizeInTokens
                    this.providerId = vectorMemoryBank.providerId
                    this.providerResourceId = vectorMemoryBank.providerResourceId
                    this.type = vectorMemoryBank.type
                    additionalProperties(vectorMemoryBank.additionalProperties)
                }

                fun chunkSizeInTokens(chunkSizeInTokens: Long) =
                    chunkSizeInTokens(JsonField.of(chunkSizeInTokens))

                @JsonProperty("chunk_size_in_tokens")
                @ExcludeMissing
                fun chunkSizeInTokens(chunkSizeInTokens: JsonField<Long>) = apply {
                    this.chunkSizeInTokens = chunkSizeInTokens
                }

                fun embeddingModel(embeddingModel: String) =
                    embeddingModel(JsonField.of(embeddingModel))

                @JsonProperty("embedding_model")
                @ExcludeMissing
                fun embeddingModel(embeddingModel: JsonField<String>) = apply {
                    this.embeddingModel = embeddingModel
                }

                fun identifier(identifier: String) = identifier(JsonField.of(identifier))

                @JsonProperty("identifier")
                @ExcludeMissing
                fun identifier(identifier: JsonField<String>) = apply {
                    this.identifier = identifier
                }

                fun memoryBankType(memoryBankType: MemoryBankType) =
                    memoryBankType(JsonField.of(memoryBankType))

                @JsonProperty("memory_bank_type")
                @ExcludeMissing
                fun memoryBankType(memoryBankType: JsonField<MemoryBankType>) = apply {
                    this.memoryBankType = memoryBankType
                }

                fun overlapSizeInTokens(overlapSizeInTokens: Long) =
                    overlapSizeInTokens(JsonField.of(overlapSizeInTokens))

                @JsonProperty("overlap_size_in_tokens")
                @ExcludeMissing
                fun overlapSizeInTokens(overlapSizeInTokens: JsonField<Long>) = apply {
                    this.overlapSizeInTokens = overlapSizeInTokens
                }

                fun providerId(providerId: String) = providerId(JsonField.of(providerId))

                @JsonProperty("provider_id")
                @ExcludeMissing
                fun providerId(providerId: JsonField<String>) = apply {
                    this.providerId = providerId
                }

                fun providerResourceId(providerResourceId: String) =
                    providerResourceId(JsonField.of(providerResourceId))

                @JsonProperty("provider_resource_id")
                @ExcludeMissing
                fun providerResourceId(providerResourceId: JsonField<String>) = apply {
                    this.providerResourceId = providerResourceId
                }

                fun type(type: Type) = type(JsonField.of(type))

                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): VectorMemoryBank =
                    VectorMemoryBank(
                        chunkSizeInTokens,
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is MemoryBankType && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val VECTOR = MemoryBankType(JsonField.of("vector"))

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
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val MEMORY_BANK = Type(JsonField.of("memory_bank"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is VectorMemoryBank && this.chunkSizeInTokens == other.chunkSizeInTokens && this.embeddingModel == other.embeddingModel && this.identifier == other.identifier && this.memoryBankType == other.memoryBankType && this.overlapSizeInTokens == other.overlapSizeInTokens && this.providerId == other.providerId && this.providerResourceId == other.providerResourceId && this.type == other.type && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(chunkSizeInTokens, embeddingModel, identifier, memoryBankType, overlapSizeInTokens, providerId, providerResourceId, type, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "VectorMemoryBank{chunkSizeInTokens=$chunkSizeInTokens, embeddingModel=$embeddingModel, identifier=$identifier, memoryBankType=$memoryBankType, overlapSizeInTokens=$overlapSizeInTokens, providerId=$providerId, providerResourceId=$providerResourceId, type=$type, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = KeyValueMemoryBank.Builder::class)
        @NoAutoDetect
        class KeyValueMemoryBank
        private constructor(
            private val identifier: JsonField<String>,
            private val memoryBankType: JsonField<MemoryBankType>,
            private val providerId: JsonField<String>,
            private val providerResourceId: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun identifier(): String = identifier.getRequired("identifier")

            fun memoryBankType(): MemoryBankType = memoryBankType.getRequired("memory_bank_type")

            fun providerId(): String = providerId.getRequired("provider_id")

            fun providerResourceId(): String =
                providerResourceId.getRequired("provider_resource_id")

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
                    this.identifier = keyValueMemoryBank.identifier
                    this.memoryBankType = keyValueMemoryBank.memoryBankType
                    this.providerId = keyValueMemoryBank.providerId
                    this.providerResourceId = keyValueMemoryBank.providerResourceId
                    this.type = keyValueMemoryBank.type
                    additionalProperties(keyValueMemoryBank.additionalProperties)
                }

                fun identifier(identifier: String) = identifier(JsonField.of(identifier))

                @JsonProperty("identifier")
                @ExcludeMissing
                fun identifier(identifier: JsonField<String>) = apply {
                    this.identifier = identifier
                }

                fun memoryBankType(memoryBankType: MemoryBankType) =
                    memoryBankType(JsonField.of(memoryBankType))

                @JsonProperty("memory_bank_type")
                @ExcludeMissing
                fun memoryBankType(memoryBankType: JsonField<MemoryBankType>) = apply {
                    this.memoryBankType = memoryBankType
                }

                fun providerId(providerId: String) = providerId(JsonField.of(providerId))

                @JsonProperty("provider_id")
                @ExcludeMissing
                fun providerId(providerId: JsonField<String>) = apply {
                    this.providerId = providerId
                }

                fun providerResourceId(providerResourceId: String) =
                    providerResourceId(JsonField.of(providerResourceId))

                @JsonProperty("provider_resource_id")
                @ExcludeMissing
                fun providerResourceId(providerResourceId: JsonField<String>) = apply {
                    this.providerResourceId = providerResourceId
                }

                fun type(type: Type) = type(JsonField.of(type))

                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is MemoryBankType && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val KEYVALUE = MemoryBankType(JsonField.of("keyvalue"))

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
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val MEMORY_BANK = Type(JsonField.of("memory_bank"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is KeyValueMemoryBank && this.identifier == other.identifier && this.memoryBankType == other.memoryBankType && this.providerId == other.providerId && this.providerResourceId == other.providerResourceId && this.type == other.type && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(identifier, memoryBankType, providerId, providerResourceId, type, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "KeyValueMemoryBank{identifier=$identifier, memoryBankType=$memoryBankType, providerId=$providerId, providerResourceId=$providerResourceId, type=$type, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = KeywordMemoryBank.Builder::class)
        @NoAutoDetect
        class KeywordMemoryBank
        private constructor(
            private val identifier: JsonField<String>,
            private val memoryBankType: JsonField<MemoryBankType>,
            private val providerId: JsonField<String>,
            private val providerResourceId: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun identifier(): String = identifier.getRequired("identifier")

            fun memoryBankType(): MemoryBankType = memoryBankType.getRequired("memory_bank_type")

            fun providerId(): String = providerId.getRequired("provider_id")

            fun providerResourceId(): String =
                providerResourceId.getRequired("provider_resource_id")

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
                    this.identifier = keywordMemoryBank.identifier
                    this.memoryBankType = keywordMemoryBank.memoryBankType
                    this.providerId = keywordMemoryBank.providerId
                    this.providerResourceId = keywordMemoryBank.providerResourceId
                    this.type = keywordMemoryBank.type
                    additionalProperties(keywordMemoryBank.additionalProperties)
                }

                fun identifier(identifier: String) = identifier(JsonField.of(identifier))

                @JsonProperty("identifier")
                @ExcludeMissing
                fun identifier(identifier: JsonField<String>) = apply {
                    this.identifier = identifier
                }

                fun memoryBankType(memoryBankType: MemoryBankType) =
                    memoryBankType(JsonField.of(memoryBankType))

                @JsonProperty("memory_bank_type")
                @ExcludeMissing
                fun memoryBankType(memoryBankType: JsonField<MemoryBankType>) = apply {
                    this.memoryBankType = memoryBankType
                }

                fun providerId(providerId: String) = providerId(JsonField.of(providerId))

                @JsonProperty("provider_id")
                @ExcludeMissing
                fun providerId(providerId: JsonField<String>) = apply {
                    this.providerId = providerId
                }

                fun providerResourceId(providerResourceId: String) =
                    providerResourceId(JsonField.of(providerResourceId))

                @JsonProperty("provider_resource_id")
                @ExcludeMissing
                fun providerResourceId(providerResourceId: JsonField<String>) = apply {
                    this.providerResourceId = providerResourceId
                }

                fun type(type: Type) = type(JsonField.of(type))

                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is MemoryBankType && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val KEYWORD = MemoryBankType(JsonField.of("keyword"))

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
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val MEMORY_BANK = Type(JsonField.of("memory_bank"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is KeywordMemoryBank && this.identifier == other.identifier && this.memoryBankType == other.memoryBankType && this.providerId == other.providerId && this.providerResourceId == other.providerResourceId && this.type == other.type && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(identifier, memoryBankType, providerId, providerResourceId, type, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "KeywordMemoryBank{identifier=$identifier, memoryBankType=$memoryBankType, providerId=$providerId, providerResourceId=$providerResourceId, type=$type, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = GraphMemoryBank.Builder::class)
        @NoAutoDetect
        class GraphMemoryBank
        private constructor(
            private val identifier: JsonField<String>,
            private val memoryBankType: JsonField<MemoryBankType>,
            private val providerId: JsonField<String>,
            private val providerResourceId: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun identifier(): String = identifier.getRequired("identifier")

            fun memoryBankType(): MemoryBankType = memoryBankType.getRequired("memory_bank_type")

            fun providerId(): String = providerId.getRequired("provider_id")

            fun providerResourceId(): String =
                providerResourceId.getRequired("provider_resource_id")

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
                    this.identifier = graphMemoryBank.identifier
                    this.memoryBankType = graphMemoryBank.memoryBankType
                    this.providerId = graphMemoryBank.providerId
                    this.providerResourceId = graphMemoryBank.providerResourceId
                    this.type = graphMemoryBank.type
                    additionalProperties(graphMemoryBank.additionalProperties)
                }

                fun identifier(identifier: String) = identifier(JsonField.of(identifier))

                @JsonProperty("identifier")
                @ExcludeMissing
                fun identifier(identifier: JsonField<String>) = apply {
                    this.identifier = identifier
                }

                fun memoryBankType(memoryBankType: MemoryBankType) =
                    memoryBankType(JsonField.of(memoryBankType))

                @JsonProperty("memory_bank_type")
                @ExcludeMissing
                fun memoryBankType(memoryBankType: JsonField<MemoryBankType>) = apply {
                    this.memoryBankType = memoryBankType
                }

                fun providerId(providerId: String) = providerId(JsonField.of(providerId))

                @JsonProperty("provider_id")
                @ExcludeMissing
                fun providerId(providerId: JsonField<String>) = apply {
                    this.providerId = providerId
                }

                fun providerResourceId(providerResourceId: String) =
                    providerResourceId(JsonField.of(providerResourceId))

                @JsonProperty("provider_resource_id")
                @ExcludeMissing
                fun providerResourceId(providerResourceId: JsonField<String>) = apply {
                    this.providerResourceId = providerResourceId
                }

                fun type(type: Type) = type(JsonField.of(type))

                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is MemoryBankType && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val GRAPH = MemoryBankType(JsonField.of("graph"))

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
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val MEMORY_BANK = Type(JsonField.of("memory_bank"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is GraphMemoryBank && this.identifier == other.identifier && this.memoryBankType == other.memoryBankType && this.providerId == other.providerId && this.providerResourceId == other.providerResourceId && this.type == other.type && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(identifier, memoryBankType, providerId, providerResourceId, type, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "GraphMemoryBank{identifier=$identifier, memoryBankType=$memoryBankType, providerId=$providerId, providerResourceId=$providerResourceId, type=$type, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Session && this.memoryBank == other.memoryBank && this.sessionId == other.sessionId && this.sessionName == other.sessionName && this.startedAt == other.startedAt && this.turns == other.turns && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(memoryBank, sessionId, sessionName, startedAt, turns, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "Session{memoryBank=$memoryBank, sessionId=$sessionId, sessionName=$sessionName, startedAt=$startedAt, turns=$turns, additionalProperties=$additionalProperties}"
}
