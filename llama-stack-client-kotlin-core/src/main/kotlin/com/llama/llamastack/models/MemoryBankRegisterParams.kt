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
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import com.llama.llamastack.models.*
import java.util.Objects

class MemoryBankRegisterParams
constructor(
    private val memoryBankId: String,
    private val params: Params,
    private val providerId: String?,
    private val providerMemoryBankId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun memoryBankId(): String = memoryBankId

    fun params(): Params = params

    fun providerId(): String? = providerId

    fun providerMemoryBankId(): String? = providerMemoryBankId

    internal fun getBody(): MemoryBankRegisterBody {
        return MemoryBankRegisterBody(
            memoryBankId,
            params,
            providerId,
            providerMemoryBankId,
            additionalBodyProperties,
        )
    }

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = MemoryBankRegisterBody.Builder::class)
    @NoAutoDetect
    class MemoryBankRegisterBody
    internal constructor(
        private val memoryBankId: String?,
        private val params: Params?,
        private val providerId: String?,
        private val providerMemoryBankId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("memory_bank_id") fun memoryBankId(): String? = memoryBankId

        @JsonProperty("params") fun params(): Params? = params

        @JsonProperty("provider_id") fun providerId(): String? = providerId

        @JsonProperty("provider_memory_bank_id")
        fun providerMemoryBankId(): String? = providerMemoryBankId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var memoryBankId: String? = null
            private var params: Params? = null
            private var providerId: String? = null
            private var providerMemoryBankId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(memoryBankRegisterBody: MemoryBankRegisterBody) = apply {
                this.memoryBankId = memoryBankRegisterBody.memoryBankId
                this.params = memoryBankRegisterBody.params
                this.providerId = memoryBankRegisterBody.providerId
                this.providerMemoryBankId = memoryBankRegisterBody.providerMemoryBankId
                additionalProperties(memoryBankRegisterBody.additionalProperties)
            }

            @JsonProperty("memory_bank_id")
            fun memoryBankId(memoryBankId: String) = apply { this.memoryBankId = memoryBankId }

            @JsonProperty("params") fun params(params: Params) = apply { this.params = params }

            @JsonProperty("provider_id")
            fun providerId(providerId: String) = apply { this.providerId = providerId }

            @JsonProperty("provider_memory_bank_id")
            fun providerMemoryBankId(providerMemoryBankId: String) = apply {
                this.providerMemoryBankId = providerMemoryBankId
            }

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

            fun build(): MemoryBankRegisterBody =
                MemoryBankRegisterBody(
                    checkNotNull(memoryBankId) { "`memoryBankId` is required but was not set" },
                    checkNotNull(params) { "`params` is required but was not set" },
                    providerId,
                    providerMemoryBankId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is MemoryBankRegisterBody && this.memoryBankId == other.memoryBankId && this.params == other.params && this.providerId == other.providerId && this.providerMemoryBankId == other.providerMemoryBankId && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(memoryBankId, params, providerId, providerMemoryBankId, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "MemoryBankRegisterBody{memoryBankId=$memoryBankId, params=$params, providerId=$providerId, providerMemoryBankId=$providerMemoryBankId, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is MemoryBankRegisterParams && this.memoryBankId == other.memoryBankId && this.params == other.params && this.providerId == other.providerId && this.providerMemoryBankId == other.providerMemoryBankId && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(memoryBankId, params, providerId, providerMemoryBankId, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "MemoryBankRegisterParams{memoryBankId=$memoryBankId, params=$params, providerId=$providerId, providerMemoryBankId=$providerMemoryBankId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var memoryBankId: String? = null
        private var params: Params? = null
        private var providerId: String? = null
        private var providerMemoryBankId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(memoryBankRegisterParams: MemoryBankRegisterParams) = apply {
            this.memoryBankId = memoryBankRegisterParams.memoryBankId
            this.params = memoryBankRegisterParams.params
            this.providerId = memoryBankRegisterParams.providerId
            this.providerMemoryBankId = memoryBankRegisterParams.providerMemoryBankId
            additionalHeaders(memoryBankRegisterParams.additionalHeaders)
            additionalQueryParams(memoryBankRegisterParams.additionalQueryParams)
            additionalBodyProperties(memoryBankRegisterParams.additionalBodyProperties)
        }

        fun memoryBankId(memoryBankId: String) = apply { this.memoryBankId = memoryBankId }

        fun params(params: Params) = apply { this.params = params }

        fun params(vectorMemoryBankParams: Params.VectorMemoryBankParams) = apply {
            this.params = Params.ofVectorMemoryBankParams(vectorMemoryBankParams)
        }

        fun params(keyValueMemoryBankParams: Params.KeyValueMemoryBankParams) = apply {
            this.params = Params.ofKeyValueMemoryBankParams(keyValueMemoryBankParams)
        }

        fun params(keywordMemoryBankParams: Params.KeywordMemoryBankParams) = apply {
            this.params = Params.ofKeywordMemoryBankParams(keywordMemoryBankParams)
        }

        fun params(graphMemoryBankParams: Params.GraphMemoryBankParams) = apply {
            this.params = Params.ofGraphMemoryBankParams(graphMemoryBankParams)
        }

        fun providerId(providerId: String) = apply { this.providerId = providerId }

        fun providerMemoryBankId(providerMemoryBankId: String) = apply {
            this.providerMemoryBankId = providerMemoryBankId
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): MemoryBankRegisterParams =
            MemoryBankRegisterParams(
                checkNotNull(memoryBankId) { "`memoryBankId` is required but was not set" },
                checkNotNull(params) { "`params` is required but was not set" },
                providerId,
                providerMemoryBankId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    @JsonDeserialize(using = Params.Deserializer::class)
    @JsonSerialize(using = Params.Serializer::class)
    class Params
    private constructor(
        private val vectorMemoryBankParams: VectorMemoryBankParams? = null,
        private val keyValueMemoryBankParams: KeyValueMemoryBankParams? = null,
        private val keywordMemoryBankParams: KeywordMemoryBankParams? = null,
        private val graphMemoryBankParams: GraphMemoryBankParams? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun vectorMemoryBankParams(): VectorMemoryBankParams? = vectorMemoryBankParams

        fun keyValueMemoryBankParams(): KeyValueMemoryBankParams? = keyValueMemoryBankParams

        fun keywordMemoryBankParams(): KeywordMemoryBankParams? = keywordMemoryBankParams

        fun graphMemoryBankParams(): GraphMemoryBankParams? = graphMemoryBankParams

        fun isVectorMemoryBankParams(): Boolean = vectorMemoryBankParams != null

        fun isKeyValueMemoryBankParams(): Boolean = keyValueMemoryBankParams != null

        fun isKeywordMemoryBankParams(): Boolean = keywordMemoryBankParams != null

        fun isGraphMemoryBankParams(): Boolean = graphMemoryBankParams != null

        fun asVectorMemoryBankParams(): VectorMemoryBankParams =
            vectorMemoryBankParams.getOrThrow("vectorMemoryBankParams")

        fun asKeyValueMemoryBankParams(): KeyValueMemoryBankParams =
            keyValueMemoryBankParams.getOrThrow("keyValueMemoryBankParams")

        fun asKeywordMemoryBankParams(): KeywordMemoryBankParams =
            keywordMemoryBankParams.getOrThrow("keywordMemoryBankParams")

        fun asGraphMemoryBankParams(): GraphMemoryBankParams =
            graphMemoryBankParams.getOrThrow("graphMemoryBankParams")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                vectorMemoryBankParams != null ->
                    visitor.visitVectorMemoryBankParams(vectorMemoryBankParams)
                keyValueMemoryBankParams != null ->
                    visitor.visitKeyValueMemoryBankParams(keyValueMemoryBankParams)
                keywordMemoryBankParams != null ->
                    visitor.visitKeywordMemoryBankParams(keywordMemoryBankParams)
                graphMemoryBankParams != null ->
                    visitor.visitGraphMemoryBankParams(graphMemoryBankParams)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): Params = apply {
            if (!validated) {
                if (
                    vectorMemoryBankParams == null &&
                        keyValueMemoryBankParams == null &&
                        keywordMemoryBankParams == null &&
                        graphMemoryBankParams == null
                ) {
                    throw LlamaStackClientInvalidDataException("Unknown Params: $_json")
                }
                vectorMemoryBankParams?.validate()
                keyValueMemoryBankParams?.validate()
                keywordMemoryBankParams?.validate()
                graphMemoryBankParams?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Params && this.vectorMemoryBankParams == other.vectorMemoryBankParams && this.keyValueMemoryBankParams == other.keyValueMemoryBankParams && this.keywordMemoryBankParams == other.keywordMemoryBankParams && this.graphMemoryBankParams == other.graphMemoryBankParams /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(vectorMemoryBankParams, keyValueMemoryBankParams, keywordMemoryBankParams, graphMemoryBankParams) /* spotless:on */
        }

        override fun toString(): String {
            return when {
                vectorMemoryBankParams != null ->
                    "Params{vectorMemoryBankParams=$vectorMemoryBankParams}"
                keyValueMemoryBankParams != null ->
                    "Params{keyValueMemoryBankParams=$keyValueMemoryBankParams}"
                keywordMemoryBankParams != null ->
                    "Params{keywordMemoryBankParams=$keywordMemoryBankParams}"
                graphMemoryBankParams != null ->
                    "Params{graphMemoryBankParams=$graphMemoryBankParams}"
                _json != null -> "Params{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Params")
            }
        }

        companion object {

            fun ofVectorMemoryBankParams(vectorMemoryBankParams: VectorMemoryBankParams) =
                Params(vectorMemoryBankParams = vectorMemoryBankParams)

            fun ofKeyValueMemoryBankParams(keyValueMemoryBankParams: KeyValueMemoryBankParams) =
                Params(keyValueMemoryBankParams = keyValueMemoryBankParams)

            fun ofKeywordMemoryBankParams(keywordMemoryBankParams: KeywordMemoryBankParams) =
                Params(keywordMemoryBankParams = keywordMemoryBankParams)

            fun ofGraphMemoryBankParams(graphMemoryBankParams: GraphMemoryBankParams) =
                Params(graphMemoryBankParams = graphMemoryBankParams)
        }

        interface Visitor<out T> {

            fun visitVectorMemoryBankParams(vectorMemoryBankParams: VectorMemoryBankParams): T

            fun visitKeyValueMemoryBankParams(keyValueMemoryBankParams: KeyValueMemoryBankParams): T

            fun visitKeywordMemoryBankParams(keywordMemoryBankParams: KeywordMemoryBankParams): T

            fun visitGraphMemoryBankParams(graphMemoryBankParams: GraphMemoryBankParams): T

            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown Params: $json")
            }
        }

        class Deserializer : BaseDeserializer<Params>(Params::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Params {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<VectorMemoryBankParams>()) { it.validate() }
                    ?.let {
                        return Params(vectorMemoryBankParams = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<KeyValueMemoryBankParams>()) { it.validate() }
                    ?.let {
                        return Params(keyValueMemoryBankParams = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<KeywordMemoryBankParams>()) { it.validate() }
                    ?.let {
                        return Params(keywordMemoryBankParams = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<GraphMemoryBankParams>()) { it.validate() }
                    ?.let {
                        return Params(graphMemoryBankParams = it, _json = json)
                    }

                return Params(_json = json)
            }
        }

        class Serializer : BaseSerializer<Params>(Params::class) {

            override fun serialize(
                value: Params,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.vectorMemoryBankParams != null ->
                        generator.writeObject(value.vectorMemoryBankParams)
                    value.keyValueMemoryBankParams != null ->
                        generator.writeObject(value.keyValueMemoryBankParams)
                    value.keywordMemoryBankParams != null ->
                        generator.writeObject(value.keywordMemoryBankParams)
                    value.graphMemoryBankParams != null ->
                        generator.writeObject(value.graphMemoryBankParams)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Params")
                }
            }
        }

        @JsonDeserialize(builder = VectorMemoryBankParams.Builder::class)
        @NoAutoDetect
        class VectorMemoryBankParams
        private constructor(
            private val chunkSizeInTokens: JsonField<Long>,
            private val embeddingModel: JsonField<String>,
            private val memoryBankType: JsonField<MemoryBankType>,
            private val overlapSizeInTokens: JsonField<Long>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun chunkSizeInTokens(): Long = chunkSizeInTokens.getRequired("chunk_size_in_tokens")

            fun embeddingModel(): String = embeddingModel.getRequired("embedding_model")

            fun memoryBankType(): MemoryBankType = memoryBankType.getRequired("memory_bank_type")

            fun overlapSizeInTokens(): Long? =
                overlapSizeInTokens.getNullable("overlap_size_in_tokens")

            @JsonProperty("chunk_size_in_tokens")
            @ExcludeMissing
            fun _chunkSizeInTokens() = chunkSizeInTokens

            @JsonProperty("embedding_model") @ExcludeMissing fun _embeddingModel() = embeddingModel

            @JsonProperty("memory_bank_type") @ExcludeMissing fun _memoryBankType() = memoryBankType

            @JsonProperty("overlap_size_in_tokens")
            @ExcludeMissing
            fun _overlapSizeInTokens() = overlapSizeInTokens

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): VectorMemoryBankParams = apply {
                if (!validated) {
                    chunkSizeInTokens()
                    embeddingModel()
                    memoryBankType()
                    overlapSizeInTokens()
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
                private var memoryBankType: JsonField<MemoryBankType> = JsonMissing.of()
                private var overlapSizeInTokens: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(vectorMemoryBankParams: VectorMemoryBankParams) = apply {
                    this.chunkSizeInTokens = vectorMemoryBankParams.chunkSizeInTokens
                    this.embeddingModel = vectorMemoryBankParams.embeddingModel
                    this.memoryBankType = vectorMemoryBankParams.memoryBankType
                    this.overlapSizeInTokens = vectorMemoryBankParams.overlapSizeInTokens
                    additionalProperties(vectorMemoryBankParams.additionalProperties)
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

                fun build(): VectorMemoryBankParams =
                    VectorMemoryBankParams(
                        chunkSizeInTokens,
                        embeddingModel,
                        memoryBankType,
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is VectorMemoryBankParams && this.chunkSizeInTokens == other.chunkSizeInTokens && this.embeddingModel == other.embeddingModel && this.memoryBankType == other.memoryBankType && this.overlapSizeInTokens == other.overlapSizeInTokens && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(chunkSizeInTokens, embeddingModel, memoryBankType, overlapSizeInTokens, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "VectorMemoryBankParams{chunkSizeInTokens=$chunkSizeInTokens, embeddingModel=$embeddingModel, memoryBankType=$memoryBankType, overlapSizeInTokens=$overlapSizeInTokens, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = KeyValueMemoryBankParams.Builder::class)
        @NoAutoDetect
        class KeyValueMemoryBankParams
        private constructor(
            private val memoryBankType: JsonField<MemoryBankType>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun memoryBankType(): MemoryBankType = memoryBankType.getRequired("memory_bank_type")

            @JsonProperty("memory_bank_type") @ExcludeMissing fun _memoryBankType() = memoryBankType

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): KeyValueMemoryBankParams = apply {
                if (!validated) {
                    memoryBankType()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var memoryBankType: JsonField<MemoryBankType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(keyValueMemoryBankParams: KeyValueMemoryBankParams) = apply {
                    this.memoryBankType = keyValueMemoryBankParams.memoryBankType
                    additionalProperties(keyValueMemoryBankParams.additionalProperties)
                }

                fun memoryBankType(memoryBankType: MemoryBankType) =
                    memoryBankType(JsonField.of(memoryBankType))

                @JsonProperty("memory_bank_type")
                @ExcludeMissing
                fun memoryBankType(memoryBankType: JsonField<MemoryBankType>) = apply {
                    this.memoryBankType = memoryBankType
                }

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

                fun build(): KeyValueMemoryBankParams =
                    KeyValueMemoryBankParams(memoryBankType, additionalProperties.toImmutable())
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is KeyValueMemoryBankParams && this.memoryBankType == other.memoryBankType && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(memoryBankType, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "KeyValueMemoryBankParams{memoryBankType=$memoryBankType, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = KeywordMemoryBankParams.Builder::class)
        @NoAutoDetect
        class KeywordMemoryBankParams
        private constructor(
            private val memoryBankType: JsonField<MemoryBankType>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun memoryBankType(): MemoryBankType = memoryBankType.getRequired("memory_bank_type")

            @JsonProperty("memory_bank_type") @ExcludeMissing fun _memoryBankType() = memoryBankType

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): KeywordMemoryBankParams = apply {
                if (!validated) {
                    memoryBankType()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var memoryBankType: JsonField<MemoryBankType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(keywordMemoryBankParams: KeywordMemoryBankParams) = apply {
                    this.memoryBankType = keywordMemoryBankParams.memoryBankType
                    additionalProperties(keywordMemoryBankParams.additionalProperties)
                }

                fun memoryBankType(memoryBankType: MemoryBankType) =
                    memoryBankType(JsonField.of(memoryBankType))

                @JsonProperty("memory_bank_type")
                @ExcludeMissing
                fun memoryBankType(memoryBankType: JsonField<MemoryBankType>) = apply {
                    this.memoryBankType = memoryBankType
                }

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

                fun build(): KeywordMemoryBankParams =
                    KeywordMemoryBankParams(memoryBankType, additionalProperties.toImmutable())
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is KeywordMemoryBankParams && this.memoryBankType == other.memoryBankType && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(memoryBankType, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "KeywordMemoryBankParams{memoryBankType=$memoryBankType, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = GraphMemoryBankParams.Builder::class)
        @NoAutoDetect
        class GraphMemoryBankParams
        private constructor(
            private val memoryBankType: JsonField<MemoryBankType>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun memoryBankType(): MemoryBankType = memoryBankType.getRequired("memory_bank_type")

            @JsonProperty("memory_bank_type") @ExcludeMissing fun _memoryBankType() = memoryBankType

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): GraphMemoryBankParams = apply {
                if (!validated) {
                    memoryBankType()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var memoryBankType: JsonField<MemoryBankType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(graphMemoryBankParams: GraphMemoryBankParams) = apply {
                    this.memoryBankType = graphMemoryBankParams.memoryBankType
                    additionalProperties(graphMemoryBankParams.additionalProperties)
                }

                fun memoryBankType(memoryBankType: MemoryBankType) =
                    memoryBankType(JsonField.of(memoryBankType))

                @JsonProperty("memory_bank_type")
                @ExcludeMissing
                fun memoryBankType(memoryBankType: JsonField<MemoryBankType>) = apply {
                    this.memoryBankType = memoryBankType
                }

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

                fun build(): GraphMemoryBankParams =
                    GraphMemoryBankParams(memoryBankType, additionalProperties.toImmutable())
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is GraphMemoryBankParams && this.memoryBankType == other.memoryBankType && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(memoryBankType, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "GraphMemoryBankParams{memoryBankType=$memoryBankType, additionalProperties=$additionalProperties}"
        }
    }
}
