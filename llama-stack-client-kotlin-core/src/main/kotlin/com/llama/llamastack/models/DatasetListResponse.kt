// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.llama.llamastack.core.Enum
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

@JsonDeserialize(builder = DatasetListResponse.Builder::class)
@NoAutoDetect
class DatasetListResponse
private constructor(
    private val datasetSchema: JsonField<DatasetSchema>,
    private val identifier: JsonField<String>,
    private val metadata: JsonField<Metadata>,
    private val providerId: JsonField<String>,
    private val providerResourceId: JsonField<String>,
    private val type: JsonField<Type>,
    private val url: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun datasetSchema(): DatasetSchema = datasetSchema.getRequired("dataset_schema")

    fun identifier(): String = identifier.getRequired("identifier")

    fun metadata(): Metadata = metadata.getRequired("metadata")

    fun providerId(): String = providerId.getRequired("provider_id")

    fun providerResourceId(): String = providerResourceId.getRequired("provider_resource_id")

    fun type(): Type = type.getRequired("type")

    fun url(): String = url.getRequired("url")

    @JsonProperty("dataset_schema") @ExcludeMissing fun _datasetSchema() = datasetSchema

    @JsonProperty("identifier") @ExcludeMissing fun _identifier() = identifier

    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

    @JsonProperty("provider_id") @ExcludeMissing fun _providerId() = providerId

    @JsonProperty("provider_resource_id")
    @ExcludeMissing
    fun _providerResourceId() = providerResourceId

    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonProperty("url") @ExcludeMissing fun _url() = url

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): DatasetListResponse = apply {
        if (!validated) {
            datasetSchema().validate()
            identifier()
            metadata().validate()
            providerId()
            providerResourceId()
            type()
            url()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var datasetSchema: JsonField<DatasetSchema> = JsonMissing.of()
        private var identifier: JsonField<String> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var providerId: JsonField<String> = JsonMissing.of()
        private var providerResourceId: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var url: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(datasetListResponse: DatasetListResponse) = apply {
            this.datasetSchema = datasetListResponse.datasetSchema
            this.identifier = datasetListResponse.identifier
            this.metadata = datasetListResponse.metadata
            this.providerId = datasetListResponse.providerId
            this.providerResourceId = datasetListResponse.providerResourceId
            this.type = datasetListResponse.type
            this.url = datasetListResponse.url
            additionalProperties(datasetListResponse.additionalProperties)
        }

        fun datasetSchema(datasetSchema: DatasetSchema) = datasetSchema(JsonField.of(datasetSchema))

        @JsonProperty("dataset_schema")
        @ExcludeMissing
        fun datasetSchema(datasetSchema: JsonField<DatasetSchema>) = apply {
            this.datasetSchema = datasetSchema
        }

        fun identifier(identifier: String) = identifier(JsonField.of(identifier))

        @JsonProperty("identifier")
        @ExcludeMissing
        fun identifier(identifier: JsonField<String>) = apply { this.identifier = identifier }

        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        @JsonProperty("metadata")
        @ExcludeMissing
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        fun providerId(providerId: String) = providerId(JsonField.of(providerId))

        @JsonProperty("provider_id")
        @ExcludeMissing
        fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

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

        fun url(url: String) = url(JsonField.of(url))

        @JsonProperty("url")
        @ExcludeMissing
        fun url(url: JsonField<String>) = apply { this.url = url }

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

        fun build(): DatasetListResponse =
            DatasetListResponse(
                datasetSchema,
                identifier,
                metadata,
                providerId,
                providerResourceId,
                type,
                url,
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = DatasetSchema.Builder::class)
    @NoAutoDetect
    class DatasetSchema
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): DatasetSchema = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(datasetSchema: DatasetSchema) = apply {
                additionalProperties(datasetSchema.additionalProperties)
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

            fun build(): DatasetSchema = DatasetSchema(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DatasetSchema && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "DatasetSchema{additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Metadata = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(metadata: Metadata) = apply {
                additionalProperties(metadata.additionalProperties)
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

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val DATASET = Type(JsonField.of("dataset"))

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            DATASET,
        }

        enum class Value {
            DATASET,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DATASET -> Value.DATASET
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DATASET -> Known.DATASET
                else -> throw LlamaStackClientInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DatasetListResponse && datasetSchema == other.datasetSchema && identifier == other.identifier && metadata == other.metadata && providerId == other.providerId && providerResourceId == other.providerResourceId && type == other.type && url == other.url && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(datasetSchema, identifier, metadata, providerId, providerResourceId, type, url, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DatasetListResponse{datasetSchema=$datasetSchema, identifier=$identifier, metadata=$metadata, providerId=$providerId, providerResourceId=$providerResourceId, type=$type, url=$url, additionalProperties=$additionalProperties}"
}
