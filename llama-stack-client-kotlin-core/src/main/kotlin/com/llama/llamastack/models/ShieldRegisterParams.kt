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
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import com.llama.llamastack.models.*
import java.util.Objects

class ShieldRegisterParams
constructor(
    private val shieldId: String,
    private val shieldType: ShieldType,
    private val params: Params?,
    private val providerId: String?,
    private val providerShieldId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun shieldId(): String = shieldId

    fun shieldType(): ShieldType = shieldType

    fun params(): Params? = params

    fun providerId(): String? = providerId

    fun providerShieldId(): String? = providerShieldId

    internal fun getBody(): ShieldRegisterBody {
        return ShieldRegisterBody(
            shieldId,
            shieldType,
            params,
            providerId,
            providerShieldId,
            additionalBodyProperties,
        )
    }

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = ShieldRegisterBody.Builder::class)
    @NoAutoDetect
    class ShieldRegisterBody
    internal constructor(
        private val shieldId: String?,
        private val shieldType: ShieldType?,
        private val params: Params?,
        private val providerId: String?,
        private val providerShieldId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("shield_id") fun shieldId(): String? = shieldId

        @JsonProperty("shield_type") fun shieldType(): ShieldType? = shieldType

        @JsonProperty("params") fun params(): Params? = params

        @JsonProperty("provider_id") fun providerId(): String? = providerId

        @JsonProperty("provider_shield_id") fun providerShieldId(): String? = providerShieldId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var shieldId: String? = null
            private var shieldType: ShieldType? = null
            private var params: Params? = null
            private var providerId: String? = null
            private var providerShieldId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(shieldRegisterBody: ShieldRegisterBody) = apply {
                this.shieldId = shieldRegisterBody.shieldId
                this.shieldType = shieldRegisterBody.shieldType
                this.params = shieldRegisterBody.params
                this.providerId = shieldRegisterBody.providerId
                this.providerShieldId = shieldRegisterBody.providerShieldId
                additionalProperties(shieldRegisterBody.additionalProperties)
            }

            @JsonProperty("shield_id")
            fun shieldId(shieldId: String) = apply { this.shieldId = shieldId }

            @JsonProperty("shield_type")
            fun shieldType(shieldType: ShieldType) = apply { this.shieldType = shieldType }

            @JsonProperty("params") fun params(params: Params) = apply { this.params = params }

            @JsonProperty("provider_id")
            fun providerId(providerId: String) = apply { this.providerId = providerId }

            @JsonProperty("provider_shield_id")
            fun providerShieldId(providerShieldId: String) = apply {
                this.providerShieldId = providerShieldId
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

            fun build(): ShieldRegisterBody =
                ShieldRegisterBody(
                    checkNotNull(shieldId) { "`shieldId` is required but was not set" },
                    checkNotNull(shieldType) { "`shieldType` is required but was not set" },
                    params,
                    providerId,
                    providerShieldId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ShieldRegisterBody && this.shieldId == other.shieldId && this.shieldType == other.shieldType && this.params == other.params && this.providerId == other.providerId && this.providerShieldId == other.providerShieldId && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(shieldId, shieldType, params, providerId, providerShieldId, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ShieldRegisterBody{shieldId=$shieldId, shieldType=$shieldType, params=$params, providerId=$providerId, providerShieldId=$providerShieldId, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ShieldRegisterParams && this.shieldId == other.shieldId && this.shieldType == other.shieldType && this.params == other.params && this.providerId == other.providerId && this.providerShieldId == other.providerShieldId && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(shieldId, shieldType, params, providerId, providerShieldId, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "ShieldRegisterParams{shieldId=$shieldId, shieldType=$shieldType, params=$params, providerId=$providerId, providerShieldId=$providerShieldId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var shieldId: String? = null
        private var shieldType: ShieldType? = null
        private var params: Params? = null
        private var providerId: String? = null
        private var providerShieldId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(shieldRegisterParams: ShieldRegisterParams) = apply {
            this.shieldId = shieldRegisterParams.shieldId
            this.shieldType = shieldRegisterParams.shieldType
            this.params = shieldRegisterParams.params
            this.providerId = shieldRegisterParams.providerId
            this.providerShieldId = shieldRegisterParams.providerShieldId
            additionalHeaders(shieldRegisterParams.additionalHeaders)
            additionalQueryParams(shieldRegisterParams.additionalQueryParams)
            additionalBodyProperties(shieldRegisterParams.additionalBodyProperties)
        }

        fun shieldId(shieldId: String) = apply { this.shieldId = shieldId }

        fun shieldType(shieldType: ShieldType) = apply { this.shieldType = shieldType }

        fun params(params: Params) = apply { this.params = params }

        fun providerId(providerId: String) = apply { this.providerId = providerId }

        fun providerShieldId(providerShieldId: String) = apply {
            this.providerShieldId = providerShieldId
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

        fun build(): ShieldRegisterParams =
            ShieldRegisterParams(
                checkNotNull(shieldId) { "`shieldId` is required but was not set" },
                checkNotNull(shieldType) { "`shieldType` is required but was not set" },
                params,
                providerId,
                providerShieldId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
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

    @JsonDeserialize(builder = Params.Builder::class)
    @NoAutoDetect
    class Params
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
}
