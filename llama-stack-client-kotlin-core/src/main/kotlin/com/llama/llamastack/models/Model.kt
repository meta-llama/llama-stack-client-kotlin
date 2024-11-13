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

@JsonDeserialize(builder = Model.Builder::class)
@NoAutoDetect
class Model
private constructor(
    private val identifier: JsonField<String>,
    private val metadata: JsonField<Metadata>,
    private val providerId: JsonField<String>,
    private val providerResourceId: JsonField<String>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun identifier(): String = identifier.getRequired("identifier")

    fun metadata(): Metadata = metadata.getRequired("metadata")

    fun providerId(): String = providerId.getRequired("provider_id")

    fun providerResourceId(): String = providerResourceId.getRequired("provider_resource_id")

    fun type(): Type = type.getRequired("type")

    @JsonProperty("identifier") @ExcludeMissing fun _identifier() = identifier

    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

    @JsonProperty("provider_id") @ExcludeMissing fun _providerId() = providerId

    @JsonProperty("provider_resource_id")
    @ExcludeMissing
    fun _providerResourceId() = providerResourceId

    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Model = apply {
        if (!validated) {
            identifier()
            metadata().validate()
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
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var providerId: JsonField<String> = JsonMissing.of()
        private var providerResourceId: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(model: Model) = apply {
            this.identifier = model.identifier
            this.metadata = model.metadata
            this.providerId = model.providerId
            this.providerResourceId = model.providerResourceId
            this.type = model.type
            additionalProperties(model.additionalProperties)
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

        fun build(): Model =
            Model(
                identifier,
                metadata,
                providerId,
                providerResourceId,
                type,
                additionalProperties.toImmutable(),
            )
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

            return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

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

            return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val MODEL = Type(JsonField.of("model"))

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            MODEL,
        }

        enum class Value {
            MODEL,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                MODEL -> Value.MODEL
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                MODEL -> Known.MODEL
                else -> throw LlamaStackClientInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Model && this.identifier == other.identifier && this.metadata == other.metadata && this.providerId == other.providerId && this.providerResourceId == other.providerResourceId && this.type == other.type && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(identifier, metadata, providerId, providerResourceId, type, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "Model{identifier=$identifier, metadata=$metadata, providerId=$providerId, providerResourceId=$providerResourceId, type=$type, additionalProperties=$additionalProperties}"
}
