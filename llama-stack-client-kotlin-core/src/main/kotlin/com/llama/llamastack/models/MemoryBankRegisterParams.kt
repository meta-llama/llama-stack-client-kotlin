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
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

class MemoryBankRegisterParams
constructor(
    private val xLlamaStackProviderData: String?,
    private val body: MemoryBankRegisterBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun xLlamaStackProviderData(): String? = xLlamaStackProviderData

    fun memoryBankId(): String = body.memoryBankId()

    fun params(): Params = body.params()

    fun providerId(): String? = body.providerId()

    fun providerMemoryBankId(): String? = body.providerMemoryBankId()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    internal fun getBody(): MemoryBankRegisterBody = body

    internal fun getHeaders(): Headers {
        val headers = Headers.builder()
        this.xLlamaStackProviderData?.let {
            headers.put("X-LlamaStack-ProviderData", listOf(it.toString()))
        }
        headers.putAll(additionalHeaders)
        return headers.build()
    }

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class MemoryBankRegisterBody
    @JsonCreator
    internal constructor(
        @JsonProperty("memory_bank_id") private val memoryBankId: String,
        @JsonProperty("params") private val params: Params,
        @JsonProperty("provider_id") private val providerId: String?,
        @JsonProperty("provider_memory_bank_id") private val providerMemoryBankId: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("memory_bank_id") fun memoryBankId(): String = memoryBankId

        @JsonProperty("params") fun params(): Params = params

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
                memoryBankId = memoryBankRegisterBody.memoryBankId
                params = memoryBankRegisterBody.params
                providerId = memoryBankRegisterBody.providerId
                providerMemoryBankId = memoryBankRegisterBody.providerMemoryBankId
                additionalProperties = memoryBankRegisterBody.additionalProperties.toMutableMap()
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

            return /* spotless:off */ other is MemoryBankRegisterBody && memoryBankId == other.memoryBankId && params == other.params && providerId == other.providerId && providerMemoryBankId == other.providerMemoryBankId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(memoryBankId, params, providerId, providerMemoryBankId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "MemoryBankRegisterBody{memoryBankId=$memoryBankId, params=$params, providerId=$providerId, providerMemoryBankId=$providerMemoryBankId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var xLlamaStackProviderData: String? = null
        private var body: MemoryBankRegisterBody.Builder = MemoryBankRegisterBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(memoryBankRegisterParams: MemoryBankRegisterParams) = apply {
            xLlamaStackProviderData = memoryBankRegisterParams.xLlamaStackProviderData
            body = memoryBankRegisterParams.body.toBuilder()
            additionalHeaders = memoryBankRegisterParams.additionalHeaders.toBuilder()
            additionalQueryParams = memoryBankRegisterParams.additionalQueryParams.toBuilder()
        }

        fun xLlamaStackProviderData(xLlamaStackProviderData: String) = apply {
            this.xLlamaStackProviderData = xLlamaStackProviderData
        }

        fun memoryBankId(memoryBankId: String) = apply { body.memoryBankId(memoryBankId) }

        fun params(params: Params) = apply { body.params(params) }

        fun params(vectorMemoryBankParams: Params.VectorMemoryBankParams) = apply {
            body.params(vectorMemoryBankParams)
        }

        fun params(keyValueMemoryBankParams: Params.KeyValueMemoryBankParams) = apply {
            body.params(keyValueMemoryBankParams)
        }

        fun params(keywordMemoryBankParams: Params.KeywordMemoryBankParams) = apply {
            body.params(keywordMemoryBankParams)
        }

        fun params(graphMemoryBankParams: Params.GraphMemoryBankParams) = apply {
            body.params(graphMemoryBankParams)
        }

        fun providerId(providerId: String) = apply { body.providerId(providerId) }

        fun providerMemoryBankId(providerMemoryBankId: String) = apply {
            body.providerMemoryBankId(providerMemoryBankId)
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
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun build(): MemoryBankRegisterParams =
            MemoryBankRegisterParams(
                xLlamaStackProviderData,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Params && vectorMemoryBankParams == other.vectorMemoryBankParams && keyValueMemoryBankParams == other.keyValueMemoryBankParams && keywordMemoryBankParams == other.keywordMemoryBankParams && graphMemoryBankParams == other.graphMemoryBankParams /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(vectorMemoryBankParams, keyValueMemoryBankParams, keywordMemoryBankParams, graphMemoryBankParams) /* spotless:on */

        override fun toString(): String =
            when {
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

                tryDeserialize(node, jacksonTypeRef<VectorMemoryBankParams>())?.let {
                    return Params(vectorMemoryBankParams = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<KeyValueMemoryBankParams>())?.let {
                    return Params(keyValueMemoryBankParams = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<KeywordMemoryBankParams>())?.let {
                    return Params(keywordMemoryBankParams = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<GraphMemoryBankParams>())?.let {
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

        @NoAutoDetect
        class VectorMemoryBankParams
        @JsonCreator
        private constructor(
            @JsonProperty("chunk_size_in_tokens") private val chunkSizeInTokens: Long,
            @JsonProperty("embedding_model") private val embeddingModel: String,
            @JsonProperty("memory_bank_type") private val memoryBankType: MemoryBankType,
            @JsonProperty("overlap_size_in_tokens") private val overlapSizeInTokens: Long?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonProperty("chunk_size_in_tokens") fun chunkSizeInTokens(): Long = chunkSizeInTokens

            @JsonProperty("embedding_model") fun embeddingModel(): String = embeddingModel

            @JsonProperty("memory_bank_type") fun memoryBankType(): MemoryBankType = memoryBankType

            @JsonProperty("overlap_size_in_tokens")
            fun overlapSizeInTokens(): Long? = overlapSizeInTokens

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var chunkSizeInTokens: Long? = null
                private var embeddingModel: String? = null
                private var memoryBankType: MemoryBankType? = null
                private var overlapSizeInTokens: Long? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(vectorMemoryBankParams: VectorMemoryBankParams) = apply {
                    chunkSizeInTokens = vectorMemoryBankParams.chunkSizeInTokens
                    embeddingModel = vectorMemoryBankParams.embeddingModel
                    memoryBankType = vectorMemoryBankParams.memoryBankType
                    overlapSizeInTokens = vectorMemoryBankParams.overlapSizeInTokens
                    additionalProperties =
                        vectorMemoryBankParams.additionalProperties.toMutableMap()
                }

                fun chunkSizeInTokens(chunkSizeInTokens: Long) = apply {
                    this.chunkSizeInTokens = chunkSizeInTokens
                }

                fun embeddingModel(embeddingModel: String) = apply {
                    this.embeddingModel = embeddingModel
                }

                fun memoryBankType(memoryBankType: MemoryBankType) = apply {
                    this.memoryBankType = memoryBankType
                }

                fun overlapSizeInTokens(overlapSizeInTokens: Long) = apply {
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

                fun build(): VectorMemoryBankParams =
                    VectorMemoryBankParams(
                        checkNotNull(chunkSizeInTokens) {
                            "`chunkSizeInTokens` is required but was not set"
                        },
                        checkNotNull(embeddingModel) {
                            "`embeddingModel` is required but was not set"
                        },
                        checkNotNull(memoryBankType) {
                            "`memoryBankType` is required but was not set"
                        },
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is VectorMemoryBankParams && chunkSizeInTokens == other.chunkSizeInTokens && embeddingModel == other.embeddingModel && memoryBankType == other.memoryBankType && overlapSizeInTokens == other.overlapSizeInTokens && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(chunkSizeInTokens, embeddingModel, memoryBankType, overlapSizeInTokens, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "VectorMemoryBankParams{chunkSizeInTokens=$chunkSizeInTokens, embeddingModel=$embeddingModel, memoryBankType=$memoryBankType, overlapSizeInTokens=$overlapSizeInTokens, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class KeyValueMemoryBankParams
        @JsonCreator
        private constructor(
            @JsonProperty("memory_bank_type") private val memoryBankType: MemoryBankType,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonProperty("memory_bank_type") fun memoryBankType(): MemoryBankType = memoryBankType

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var memoryBankType: MemoryBankType? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(keyValueMemoryBankParams: KeyValueMemoryBankParams) = apply {
                    memoryBankType = keyValueMemoryBankParams.memoryBankType
                    additionalProperties =
                        keyValueMemoryBankParams.additionalProperties.toMutableMap()
                }

                fun memoryBankType(memoryBankType: MemoryBankType) = apply {
                    this.memoryBankType = memoryBankType
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

                fun build(): KeyValueMemoryBankParams =
                    KeyValueMemoryBankParams(
                        checkNotNull(memoryBankType) {
                            "`memoryBankType` is required but was not set"
                        },
                        additionalProperties.toImmutable()
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is KeyValueMemoryBankParams && memoryBankType == other.memoryBankType && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(memoryBankType, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "KeyValueMemoryBankParams{memoryBankType=$memoryBankType, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class KeywordMemoryBankParams
        @JsonCreator
        private constructor(
            @JsonProperty("memory_bank_type") private val memoryBankType: MemoryBankType,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonProperty("memory_bank_type") fun memoryBankType(): MemoryBankType = memoryBankType

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var memoryBankType: MemoryBankType? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(keywordMemoryBankParams: KeywordMemoryBankParams) = apply {
                    memoryBankType = keywordMemoryBankParams.memoryBankType
                    additionalProperties =
                        keywordMemoryBankParams.additionalProperties.toMutableMap()
                }

                fun memoryBankType(memoryBankType: MemoryBankType) = apply {
                    this.memoryBankType = memoryBankType
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

                fun build(): KeywordMemoryBankParams =
                    KeywordMemoryBankParams(
                        checkNotNull(memoryBankType) {
                            "`memoryBankType` is required but was not set"
                        },
                        additionalProperties.toImmutable()
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is KeywordMemoryBankParams && memoryBankType == other.memoryBankType && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(memoryBankType, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "KeywordMemoryBankParams{memoryBankType=$memoryBankType, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class GraphMemoryBankParams
        @JsonCreator
        private constructor(
            @JsonProperty("memory_bank_type") private val memoryBankType: MemoryBankType,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonProperty("memory_bank_type") fun memoryBankType(): MemoryBankType = memoryBankType

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var memoryBankType: MemoryBankType? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(graphMemoryBankParams: GraphMemoryBankParams) = apply {
                    memoryBankType = graphMemoryBankParams.memoryBankType
                    additionalProperties = graphMemoryBankParams.additionalProperties.toMutableMap()
                }

                fun memoryBankType(memoryBankType: MemoryBankType) = apply {
                    this.memoryBankType = memoryBankType
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

                fun build(): GraphMemoryBankParams =
                    GraphMemoryBankParams(
                        checkNotNull(memoryBankType) {
                            "`memoryBankType` is required but was not set"
                        },
                        additionalProperties.toImmutable()
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is GraphMemoryBankParams && memoryBankType == other.memoryBankType && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(memoryBankType, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "GraphMemoryBankParams{memoryBankType=$memoryBankType, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is MemoryBankRegisterParams && xLlamaStackProviderData == other.xLlamaStackProviderData && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(xLlamaStackProviderData, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "MemoryBankRegisterParams{xLlamaStackProviderData=$xLlamaStackProviderData, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
