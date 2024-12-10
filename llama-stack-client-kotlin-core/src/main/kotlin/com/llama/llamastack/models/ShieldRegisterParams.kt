// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.models.*
import java.util.Objects

class ShieldRegisterParams
constructor(
    private val shieldId: String,
    private val params: Params?,
    private val providerId: String?,
    private val providerShieldId: String?,
    private val xLlamaStackProviderData: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun shieldId(): String = shieldId

    fun params(): Params? = params

    fun providerId(): String? = providerId

    fun providerShieldId(): String? = providerShieldId

    fun xLlamaStackProviderData(): String? = xLlamaStackProviderData

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    internal fun getBody(): ShieldRegisterBody {
        return ShieldRegisterBody(
            shieldId,
            params,
            providerId,
            providerShieldId,
            additionalBodyProperties,
        )
    }

    internal fun getHeaders(): Headers {
        val headers = Headers.builder()
        this.xLlamaStackProviderData?.let {
            headers.put("X-LlamaStack-ProviderData", listOf(it.toString()))
        }
        headers.putAll(additionalHeaders)
        return headers.build()
    }

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = ShieldRegisterBody.Builder::class)
    @NoAutoDetect
    class ShieldRegisterBody
    internal constructor(
        private val shieldId: String?,
        private val params: Params?,
        private val providerId: String?,
        private val providerShieldId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("shield_id") fun shieldId(): String? = shieldId

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
            private var params: Params? = null
            private var providerId: String? = null
            private var providerShieldId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(shieldRegisterBody: ShieldRegisterBody) = apply {
                this.shieldId = shieldRegisterBody.shieldId
                this.params = shieldRegisterBody.params
                this.providerId = shieldRegisterBody.providerId
                this.providerShieldId = shieldRegisterBody.providerShieldId
                additionalProperties(shieldRegisterBody.additionalProperties)
            }

            @JsonProperty("shield_id")
            fun shieldId(shieldId: String) = apply { this.shieldId = shieldId }

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

            return /* spotless:off */ other is ShieldRegisterBody && shieldId == other.shieldId && params == other.params && providerId == other.providerId && providerShieldId == other.providerShieldId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(shieldId, params, providerId, providerShieldId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ShieldRegisterBody{shieldId=$shieldId, params=$params, providerId=$providerId, providerShieldId=$providerShieldId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var shieldId: String? = null
        private var params: Params? = null
        private var providerId: String? = null
        private var providerShieldId: String? = null
        private var xLlamaStackProviderData: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(shieldRegisterParams: ShieldRegisterParams) = apply {
            shieldId = shieldRegisterParams.shieldId
            params = shieldRegisterParams.params
            providerId = shieldRegisterParams.providerId
            providerShieldId = shieldRegisterParams.providerShieldId
            xLlamaStackProviderData = shieldRegisterParams.xLlamaStackProviderData
            additionalHeaders = shieldRegisterParams.additionalHeaders.toBuilder()
            additionalQueryParams = shieldRegisterParams.additionalQueryParams.toBuilder()
            additionalBodyProperties = shieldRegisterParams.additionalBodyProperties.toMutableMap()
        }

        fun shieldId(shieldId: String) = apply { this.shieldId = shieldId }

        fun params(params: Params) = apply { this.params = params }

        fun providerId(providerId: String) = apply { this.providerId = providerId }

        fun providerShieldId(providerShieldId: String) = apply {
            this.providerShieldId = providerShieldId
        }

        fun xLlamaStackProviderData(xLlamaStackProviderData: String) = apply {
            this.xLlamaStackProviderData = xLlamaStackProviderData
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
                params,
                providerId,
                providerShieldId,
                xLlamaStackProviderData,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
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

            return /* spotless:off */ other is Params && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Params{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ShieldRegisterParams && shieldId == other.shieldId && params == other.params && providerId == other.providerId && providerShieldId == other.providerShieldId && xLlamaStackProviderData == other.xLlamaStackProviderData && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(shieldId, params, providerId, providerShieldId, xLlamaStackProviderData, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "ShieldRegisterParams{shieldId=$shieldId, params=$params, providerId=$providerId, providerShieldId=$providerShieldId, xLlamaStackProviderData=$xLlamaStackProviderData, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
