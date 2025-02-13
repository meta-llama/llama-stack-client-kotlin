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
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import java.util.Objects

@NoAutoDetect
class ProviderInfo
@JsonCreator
private constructor(
    @JsonProperty("api") @ExcludeMissing private val api: JsonField<String> = JsonMissing.of(),
    @JsonProperty("provider_id")
    @ExcludeMissing
    private val providerId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("provider_type")
    @ExcludeMissing
    private val providerType: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun api(): String = api.getRequired("api")

    fun providerId(): String = providerId.getRequired("provider_id")

    fun providerType(): String = providerType.getRequired("provider_type")

    @JsonProperty("api") @ExcludeMissing fun _api(): JsonField<String> = api

    @JsonProperty("provider_id") @ExcludeMissing fun _providerId(): JsonField<String> = providerId

    @JsonProperty("provider_type")
    @ExcludeMissing
    fun _providerType(): JsonField<String> = providerType

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ProviderInfo = apply {
        if (validated) {
            return@apply
        }

        api()
        providerId()
        providerType()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [ProviderInfo]. */
    class Builder internal constructor() {

        private var api: JsonField<String>? = null
        private var providerId: JsonField<String>? = null
        private var providerType: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(providerInfo: ProviderInfo) = apply {
            api = providerInfo.api
            providerId = providerInfo.providerId
            providerType = providerInfo.providerType
            additionalProperties = providerInfo.additionalProperties.toMutableMap()
        }

        fun api(api: String) = api(JsonField.of(api))

        fun api(api: JsonField<String>) = apply { this.api = api }

        fun providerId(providerId: String) = providerId(JsonField.of(providerId))

        fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

        fun providerType(providerType: String) = providerType(JsonField.of(providerType))

        fun providerType(providerType: JsonField<String>) = apply {
            this.providerType = providerType
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

        fun build(): ProviderInfo =
            ProviderInfo(
                checkRequired("api", api),
                checkRequired("providerId", providerId),
                checkRequired("providerType", providerType),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProviderInfo && api == other.api && providerId == other.providerId && providerType == other.providerType && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(api, providerId, providerType, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ProviderInfo{api=$api, providerId=$providerId, providerType=$providerType, additionalProperties=$additionalProperties}"
}
