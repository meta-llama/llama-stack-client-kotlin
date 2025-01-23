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
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

@NoAutoDetect
class VectorDbRegisterResponse
@JsonCreator
private constructor(
    @JsonProperty("embedding_dimension")
    @ExcludeMissing
    private val embeddingDimension: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("embedding_model")
    @ExcludeMissing
    private val embeddingModel: JsonField<String> = JsonMissing.of(),
    @JsonProperty("identifier")
    @ExcludeMissing
    private val identifier: JsonField<String> = JsonMissing.of(),
    @JsonProperty("provider_id")
    @ExcludeMissing
    private val providerId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("provider_resource_id")
    @ExcludeMissing
    private val providerResourceId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun embeddingDimension(): Long = embeddingDimension.getRequired("embedding_dimension")

    fun embeddingModel(): String = embeddingModel.getRequired("embedding_model")

    fun identifier(): String = identifier.getRequired("identifier")

    fun providerId(): String = providerId.getRequired("provider_id")

    fun providerResourceId(): String = providerResourceId.getRequired("provider_resource_id")

    fun type(): Type = type.getRequired("type")

    @JsonProperty("embedding_dimension")
    @ExcludeMissing
    fun _embeddingDimension(): JsonField<Long> = embeddingDimension

    @JsonProperty("embedding_model")
    @ExcludeMissing
    fun _embeddingModel(): JsonField<String> = embeddingModel

    @JsonProperty("identifier") @ExcludeMissing fun _identifier(): JsonField<String> = identifier

    @JsonProperty("provider_id") @ExcludeMissing fun _providerId(): JsonField<String> = providerId

    @JsonProperty("provider_resource_id")
    @ExcludeMissing
    fun _providerResourceId(): JsonField<String> = providerResourceId

    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): VectorDbRegisterResponse = apply {
        if (validated) {
            return@apply
        }

        embeddingDimension()
        embeddingModel()
        identifier()
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

        private var embeddingDimension: JsonField<Long>? = null
        private var embeddingModel: JsonField<String>? = null
        private var identifier: JsonField<String>? = null
        private var providerId: JsonField<String>? = null
        private var providerResourceId: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(vectorDbRegisterResponse: VectorDbRegisterResponse) = apply {
            embeddingDimension = vectorDbRegisterResponse.embeddingDimension
            embeddingModel = vectorDbRegisterResponse.embeddingModel
            identifier = vectorDbRegisterResponse.identifier
            providerId = vectorDbRegisterResponse.providerId
            providerResourceId = vectorDbRegisterResponse.providerResourceId
            type = vectorDbRegisterResponse.type
            additionalProperties = vectorDbRegisterResponse.additionalProperties.toMutableMap()
        }

        fun embeddingDimension(embeddingDimension: Long) =
            embeddingDimension(JsonField.of(embeddingDimension))

        fun embeddingDimension(embeddingDimension: JsonField<Long>) = apply {
            this.embeddingDimension = embeddingDimension
        }

        fun embeddingModel(embeddingModel: String) = embeddingModel(JsonField.of(embeddingModel))

        fun embeddingModel(embeddingModel: JsonField<String>) = apply {
            this.embeddingModel = embeddingModel
        }

        fun identifier(identifier: String) = identifier(JsonField.of(identifier))

        fun identifier(identifier: JsonField<String>) = apply { this.identifier = identifier }

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

        fun build(): VectorDbRegisterResponse =
            VectorDbRegisterResponse(
                checkRequired("embeddingDimension", embeddingDimension),
                checkRequired("embeddingModel", embeddingModel),
                checkRequired("identifier", identifier),
                checkRequired("providerId", providerId),
                checkRequired("providerResourceId", providerResourceId),
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

            val VECTOR_DB = of("vector_db")

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            VECTOR_DB,
        }

        enum class Value {
            VECTOR_DB,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                VECTOR_DB -> Value.VECTOR_DB
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                VECTOR_DB -> Known.VECTOR_DB
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

        return /* spotless:off */ other is VectorDbRegisterResponse && embeddingDimension == other.embeddingDimension && embeddingModel == other.embeddingModel && identifier == other.identifier && providerId == other.providerId && providerResourceId == other.providerResourceId && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(embeddingDimension, embeddingModel, identifier, providerId, providerResourceId, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VectorDbRegisterResponse{embeddingDimension=$embeddingDimension, embeddingModel=$embeddingModel, identifier=$identifier, providerId=$providerId, providerResourceId=$providerResourceId, type=$type, additionalProperties=$additionalProperties}"
}
