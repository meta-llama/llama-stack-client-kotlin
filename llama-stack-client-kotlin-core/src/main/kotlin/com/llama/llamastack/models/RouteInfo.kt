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
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import java.util.Objects

@NoAutoDetect
class RouteInfo
@JsonCreator
private constructor(
    @JsonProperty("method")
    @ExcludeMissing
    private val method: JsonField<String> = JsonMissing.of(),
    @JsonProperty("provider_types")
    @ExcludeMissing
    private val providerTypes: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("route") @ExcludeMissing private val route: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun method(): String = method.getRequired("method")

    fun providerTypes(): List<String> = providerTypes.getRequired("provider_types")

    fun route(): String = route.getRequired("route")

    @JsonProperty("method") @ExcludeMissing fun _method() = method

    @JsonProperty("provider_types") @ExcludeMissing fun _providerTypes() = providerTypes

    @JsonProperty("route") @ExcludeMissing fun _route() = route

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): RouteInfo = apply {
        if (!validated) {
            method()
            providerTypes()
            route()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var method: JsonField<String> = JsonMissing.of()
        private var providerTypes: JsonField<List<String>> = JsonMissing.of()
        private var route: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(routeInfo: RouteInfo) = apply {
            method = routeInfo.method
            providerTypes = routeInfo.providerTypes
            route = routeInfo.route
            additionalProperties = routeInfo.additionalProperties.toMutableMap()
        }

        fun method(method: String) = method(JsonField.of(method))

        fun method(method: JsonField<String>) = apply { this.method = method }

        fun providerTypes(providerTypes: List<String>) = providerTypes(JsonField.of(providerTypes))

        fun providerTypes(providerTypes: JsonField<List<String>>) = apply {
            this.providerTypes = providerTypes
        }

        fun route(route: String) = route(JsonField.of(route))

        fun route(route: JsonField<String>) = apply { this.route = route }

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

        fun build(): RouteInfo =
            RouteInfo(
                method,
                providerTypes.map { it.toImmutable() },
                route,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RouteInfo && method == other.method && providerTypes == other.providerTypes && route == other.route && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(method, providerTypes, route, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RouteInfo{method=$method, providerTypes=$providerTypes, route=$route, additionalProperties=$additionalProperties}"
}
