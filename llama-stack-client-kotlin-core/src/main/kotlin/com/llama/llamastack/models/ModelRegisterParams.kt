// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.llama.llamastack.core.Enum
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

class ModelRegisterParams
constructor(
    private val xLlamaStackClientVersion: String?,
    private val xLlamaStackProviderData: String?,
    private val body: ModelRegisterBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun xLlamaStackClientVersion(): String? = xLlamaStackClientVersion

    fun xLlamaStackProviderData(): String? = xLlamaStackProviderData

    fun modelId(): String = body.modelId()

    fun metadata(): Metadata? = body.metadata()

    fun modelType(): ModelType? = body.modelType()

    fun providerId(): String? = body.providerId()

    fun providerModelId(): String? = body.providerModelId()

    fun _modelId(): JsonField<String> = body._modelId()

    fun _metadata(): JsonField<Metadata> = body._metadata()

    fun _modelType(): JsonField<ModelType> = body._modelType()

    fun _providerId(): JsonField<String> = body._providerId()

    fun _providerModelId(): JsonField<String> = body._providerModelId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getBody(): ModelRegisterBody = body

    internal fun getHeaders(): Headers {
        val headers = Headers.builder()
        this.xLlamaStackClientVersion?.let {
            headers.put("X-LlamaStack-Client-Version", listOf(it.toString()))
        }
        this.xLlamaStackProviderData?.let {
            headers.put("X-LlamaStack-Provider-Data", listOf(it.toString()))
        }
        headers.putAll(additionalHeaders)
        return headers.build()
    }

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class ModelRegisterBody
    @JsonCreator
    internal constructor(
        @JsonProperty("model_id")
        @ExcludeMissing
        private val modelId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("model_type")
        @ExcludeMissing
        private val modelType: JsonField<ModelType> = JsonMissing.of(),
        @JsonProperty("provider_id")
        @ExcludeMissing
        private val providerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("provider_model_id")
        @ExcludeMissing
        private val providerModelId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun modelId(): String = modelId.getRequired("model_id")

        fun metadata(): Metadata? = metadata.getNullable("metadata")

        fun modelType(): ModelType? = modelType.getNullable("model_type")

        fun providerId(): String? = providerId.getNullable("provider_id")

        fun providerModelId(): String? = providerModelId.getNullable("provider_model_id")

        @JsonProperty("model_id") @ExcludeMissing fun _modelId(): JsonField<String> = modelId

        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        @JsonProperty("model_type")
        @ExcludeMissing
        fun _modelType(): JsonField<ModelType> = modelType

        @JsonProperty("provider_id")
        @ExcludeMissing
        fun _providerId(): JsonField<String> = providerId

        @JsonProperty("provider_model_id")
        @ExcludeMissing
        fun _providerModelId(): JsonField<String> = providerModelId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ModelRegisterBody = apply {
            if (validated) {
                return@apply
            }

            modelId()
            metadata()?.validate()
            modelType()
            providerId()
            providerModelId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var modelId: JsonField<String>? = null
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var modelType: JsonField<ModelType> = JsonMissing.of()
            private var providerId: JsonField<String> = JsonMissing.of()
            private var providerModelId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(modelRegisterBody: ModelRegisterBody) = apply {
                modelId = modelRegisterBody.modelId
                metadata = modelRegisterBody.metadata
                modelType = modelRegisterBody.modelType
                providerId = modelRegisterBody.providerId
                providerModelId = modelRegisterBody.providerModelId
                additionalProperties = modelRegisterBody.additionalProperties.toMutableMap()
            }

            fun modelId(modelId: String) = modelId(JsonField.of(modelId))

            fun modelId(modelId: JsonField<String>) = apply { this.modelId = modelId }

            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            fun modelType(modelType: ModelType) = modelType(JsonField.of(modelType))

            fun modelType(modelType: JsonField<ModelType>) = apply { this.modelType = modelType }

            fun providerId(providerId: String) = providerId(JsonField.of(providerId))

            fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

            fun providerModelId(providerModelId: String) =
                providerModelId(JsonField.of(providerModelId))

            fun providerModelId(providerModelId: JsonField<String>) = apply {
                this.providerModelId = providerModelId
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

            fun build(): ModelRegisterBody =
                ModelRegisterBody(
                    checkNotNull(modelId) { "`modelId` is required but was not set" },
                    metadata,
                    modelType,
                    providerId,
                    providerModelId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ModelRegisterBody && modelId == other.modelId && metadata == other.metadata && modelType == other.modelType && providerId == other.providerId && providerModelId == other.providerModelId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(modelId, metadata, modelType, providerId, providerModelId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ModelRegisterBody{modelId=$modelId, metadata=$metadata, modelType=$modelType, providerId=$providerId, providerModelId=$providerModelId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var xLlamaStackClientVersion: String? = null
        private var xLlamaStackProviderData: String? = null
        private var body: ModelRegisterBody.Builder = ModelRegisterBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(modelRegisterParams: ModelRegisterParams) = apply {
            xLlamaStackClientVersion = modelRegisterParams.xLlamaStackClientVersion
            xLlamaStackProviderData = modelRegisterParams.xLlamaStackProviderData
            body = modelRegisterParams.body.toBuilder()
            additionalHeaders = modelRegisterParams.additionalHeaders.toBuilder()
            additionalQueryParams = modelRegisterParams.additionalQueryParams.toBuilder()
        }

        fun xLlamaStackClientVersion(xLlamaStackClientVersion: String?) = apply {
            this.xLlamaStackClientVersion = xLlamaStackClientVersion
        }

        fun xLlamaStackProviderData(xLlamaStackProviderData: String?) = apply {
            this.xLlamaStackProviderData = xLlamaStackProviderData
        }

        fun modelId(modelId: String) = apply { body.modelId(modelId) }

        fun modelId(modelId: JsonField<String>) = apply { body.modelId(modelId) }

        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        fun modelType(modelType: ModelType) = apply { body.modelType(modelType) }

        fun modelType(modelType: JsonField<ModelType>) = apply { body.modelType(modelType) }

        fun providerId(providerId: String) = apply { body.providerId(providerId) }

        fun providerId(providerId: JsonField<String>) = apply { body.providerId(providerId) }

        fun providerModelId(providerModelId: String) = apply {
            body.providerModelId(providerModelId)
        }

        fun providerModelId(providerModelId: JsonField<String>) = apply {
            body.providerModelId(providerModelId)
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

        fun build(): ModelRegisterParams =
            ModelRegisterParams(
                xLlamaStackClientVersion,
                xLlamaStackProviderData,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class Metadata
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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

            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    class ModelType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val LLM = of("llm")

            val EMBEDDING = of("embedding")

            fun of(value: String) = ModelType(JsonField.of(value))
        }

        enum class Known {
            LLM,
            EMBEDDING,
        }

        enum class Value {
            LLM,
            EMBEDDING,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                LLM -> Value.LLM
                EMBEDDING -> Value.EMBEDDING
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                LLM -> Known.LLM
                EMBEDDING -> Known.EMBEDDING
                else -> throw LlamaStackClientInvalidDataException("Unknown ModelType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ModelType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ModelRegisterParams && xLlamaStackClientVersion == other.xLlamaStackClientVersion && xLlamaStackProviderData == other.xLlamaStackProviderData && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(xLlamaStackClientVersion, xLlamaStackProviderData, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ModelRegisterParams{xLlamaStackClientVersion=$xLlamaStackClientVersion, xLlamaStackProviderData=$xLlamaStackProviderData, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
