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

@JsonDeserialize(builder = Shield.Builder::class)
@NoAutoDetect
class Shield
private constructor(
    private val identifier: JsonField<String>,
    private val params: JsonField<Params>,
    private val providerId: JsonField<String>,
    private val providerResourceId: JsonField<String>,
    private val shieldType: JsonField<ShieldType>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun identifier(): String = identifier.getRequired("identifier")

    fun params(): Params? = params.getNullable("params")

    fun providerId(): String = providerId.getRequired("provider_id")

    fun providerResourceId(): String = providerResourceId.getRequired("provider_resource_id")

    fun shieldType(): ShieldType = shieldType.getRequired("shield_type")

    fun type(): Type = type.getRequired("type")

    @JsonProperty("identifier") @ExcludeMissing fun _identifier() = identifier

    @JsonProperty("params") @ExcludeMissing fun _params() = params

    @JsonProperty("provider_id") @ExcludeMissing fun _providerId() = providerId

    @JsonProperty("provider_resource_id")
    @ExcludeMissing
    fun _providerResourceId() = providerResourceId

    @JsonProperty("shield_type") @ExcludeMissing fun _shieldType() = shieldType

    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Shield = apply {
        if (!validated) {
            identifier()
            params()?.validate()
            providerId()
            providerResourceId()
            shieldType()
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
        private var params: JsonField<Params> = JsonMissing.of()
        private var providerId: JsonField<String> = JsonMissing.of()
        private var providerResourceId: JsonField<String> = JsonMissing.of()
        private var shieldType: JsonField<ShieldType> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(shield: Shield) = apply {
            this.identifier = shield.identifier
            this.params = shield.params
            this.providerId = shield.providerId
            this.providerResourceId = shield.providerResourceId
            this.shieldType = shield.shieldType
            this.type = shield.type
            additionalProperties(shield.additionalProperties)
        }

        fun identifier(identifier: String) = identifier(JsonField.of(identifier))

        @JsonProperty("identifier")
        @ExcludeMissing
        fun identifier(identifier: JsonField<String>) = apply { this.identifier = identifier }

        fun params(params: Params) = params(JsonField.of(params))

        @JsonProperty("params")
        @ExcludeMissing
        fun params(params: JsonField<Params>) = apply { this.params = params }

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

        fun shieldType(shieldType: ShieldType) = shieldType(JsonField.of(shieldType))

        @JsonProperty("shield_type")
        @ExcludeMissing
        fun shieldType(shieldType: JsonField<ShieldType>) = apply { this.shieldType = shieldType }

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

        fun build(): Shield =
            Shield(
                identifier,
                params,
                providerId,
                providerResourceId,
                shieldType,
                type,
                additionalProperties.toImmutable(),
            )
    }

    class ShieldType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ShieldType && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val GENERIC_CONTENT_SHIELD = ShieldType(JsonField.of("generic_content_shield"))

            val LLAMA_GUARD = ShieldType(JsonField.of("llama_guard"))

            val CODE_SCANNER = ShieldType(JsonField.of("code_scanner"))

            val PROMPT_GUARD = ShieldType(JsonField.of("prompt_guard"))

            fun of(value: String) = ShieldType(JsonField.of(value))
        }

        enum class Known {
            GENERIC_CONTENT_SHIELD,
            LLAMA_GUARD,
            CODE_SCANNER,
            PROMPT_GUARD,
        }

        enum class Value {
            GENERIC_CONTENT_SHIELD,
            LLAMA_GUARD,
            CODE_SCANNER,
            PROMPT_GUARD,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                GENERIC_CONTENT_SHIELD -> Value.GENERIC_CONTENT_SHIELD
                LLAMA_GUARD -> Value.LLAMA_GUARD
                CODE_SCANNER -> Value.CODE_SCANNER
                PROMPT_GUARD -> Value.PROMPT_GUARD
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                GENERIC_CONTENT_SHIELD -> Known.GENERIC_CONTENT_SHIELD
                LLAMA_GUARD -> Known.LLAMA_GUARD
                CODE_SCANNER -> Known.CODE_SCANNER
                PROMPT_GUARD -> Known.PROMPT_GUARD
                else -> throw LlamaStackClientInvalidDataException("Unknown ShieldType: $value")
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

            val SHIELD = Type(JsonField.of("shield"))

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            SHIELD,
        }

        enum class Value {
            SHIELD,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                SHIELD -> Value.SHIELD
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                SHIELD -> Known.SHIELD
                else -> throw LlamaStackClientInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    @JsonDeserialize(builder = Params.Builder::class)
    @NoAutoDetect
    class Params
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Params = apply {
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

            internal fun from(params: Params) = apply {
                additionalProperties(params.additionalProperties)
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

            fun build(): Params = Params(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Params && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "Params{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Shield && this.identifier == other.identifier && this.params == other.params && this.providerId == other.providerId && this.providerResourceId == other.providerResourceId && this.shieldType == other.shieldType && this.type == other.type && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(identifier, params, providerId, providerResourceId, shieldType, type, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "Shield{identifier=$identifier, params=$params, providerId=$providerId, providerResourceId=$providerResourceId, shieldType=$shieldType, type=$type, additionalProperties=$additionalProperties}"
}
