// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.Params
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import java.util.Objects

class ShieldRegisterParams
private constructor(
    private val body: ShieldRegisterBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun shieldId(): String = body.shieldId()

    fun params(): Params? = body.params()

    fun providerId(): String? = body.providerId()

    fun providerShieldId(): String? = body.providerShieldId()

    fun _shieldId(): JsonField<String> = body._shieldId()

    fun _params(): JsonField<Params> = body._params()

    fun _providerId(): JsonField<String> = body._providerId()

    fun _providerShieldId(): JsonField<String> = body._providerShieldId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): ShieldRegisterBody = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class ShieldRegisterBody
    @JsonCreator
    internal constructor(
        @JsonProperty("shield_id")
        @ExcludeMissing
        private val shieldId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("params")
        @ExcludeMissing
        private val params: JsonField<Params> = JsonMissing.of(),
        @JsonProperty("provider_id")
        @ExcludeMissing
        private val providerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("provider_shield_id")
        @ExcludeMissing
        private val providerShieldId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun shieldId(): String = shieldId.getRequired("shield_id")

        fun params(): Params? = params.getNullable("params")

        fun providerId(): String? = providerId.getNullable("provider_id")

        fun providerShieldId(): String? = providerShieldId.getNullable("provider_shield_id")

        @JsonProperty("shield_id") @ExcludeMissing fun _shieldId(): JsonField<String> = shieldId

        @JsonProperty("params") @ExcludeMissing fun _params(): JsonField<Params> = params

        @JsonProperty("provider_id")
        @ExcludeMissing
        fun _providerId(): JsonField<String> = providerId

        @JsonProperty("provider_shield_id")
        @ExcludeMissing
        fun _providerShieldId(): JsonField<String> = providerShieldId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ShieldRegisterBody = apply {
            if (validated) {
                return@apply
            }

            shieldId()
            params()?.validate()
            providerId()
            providerShieldId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [ShieldRegisterBody]. */
        class Builder internal constructor() {

            private var shieldId: JsonField<String>? = null
            private var params: JsonField<Params> = JsonMissing.of()
            private var providerId: JsonField<String> = JsonMissing.of()
            private var providerShieldId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(shieldRegisterBody: ShieldRegisterBody) = apply {
                shieldId = shieldRegisterBody.shieldId
                params = shieldRegisterBody.params
                providerId = shieldRegisterBody.providerId
                providerShieldId = shieldRegisterBody.providerShieldId
                additionalProperties = shieldRegisterBody.additionalProperties.toMutableMap()
            }

            fun shieldId(shieldId: String) = shieldId(JsonField.of(shieldId))

            fun shieldId(shieldId: JsonField<String>) = apply { this.shieldId = shieldId }

            fun params(params: Params) = params(JsonField.of(params))

            fun params(params: JsonField<Params>) = apply { this.params = params }

            fun providerId(providerId: String) = providerId(JsonField.of(providerId))

            fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

            fun providerShieldId(providerShieldId: String) =
                providerShieldId(JsonField.of(providerShieldId))

            fun providerShieldId(providerShieldId: JsonField<String>) = apply {
                this.providerShieldId = providerShieldId
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

            fun build(): ShieldRegisterBody =
                ShieldRegisterBody(
                    checkRequired("shieldId", shieldId),
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

    /** A builder for [ShieldRegisterParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: ShieldRegisterBody.Builder = ShieldRegisterBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(shieldRegisterParams: ShieldRegisterParams) = apply {
            body = shieldRegisterParams.body.toBuilder()
            additionalHeaders = shieldRegisterParams.additionalHeaders.toBuilder()
            additionalQueryParams = shieldRegisterParams.additionalQueryParams.toBuilder()
        }

        fun shieldId(shieldId: String) = apply { body.shieldId(shieldId) }

        fun shieldId(shieldId: JsonField<String>) = apply { body.shieldId(shieldId) }

        fun params(params: Params) = apply { body.params(params) }

        fun params(params: JsonField<Params>) = apply { body.params(params) }

        fun providerId(providerId: String) = apply { body.providerId(providerId) }

        fun providerId(providerId: JsonField<String>) = apply { body.providerId(providerId) }

        fun providerShieldId(providerShieldId: String) = apply {
            body.providerShieldId(providerShieldId)
        }

        fun providerShieldId(providerShieldId: JsonField<String>) = apply {
            body.providerShieldId(providerShieldId)
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

        fun build(): ShieldRegisterParams =
            ShieldRegisterParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class Params
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Params = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [Params]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(params: Params) = apply {
                additionalProperties = params.additionalProperties.toMutableMap()
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

        return /* spotless:off */ other is ShieldRegisterParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ShieldRegisterParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
