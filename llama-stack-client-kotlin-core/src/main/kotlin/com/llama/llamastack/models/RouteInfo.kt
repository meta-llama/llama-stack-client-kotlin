// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.toImmutable
import java.util.Objects

@JsonDeserialize(builder = RouteInfo.Builder::class)
@NoAutoDetect
class RouteInfo
private constructor(
    private val method: JsonField<String>,
    private val providerTypes: JsonField<List<String>>,
    private val route: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun method(): String = method.getRequired("method")

    fun providerTypes(): List<String> = providerTypes.getRequired("provider_types")

    fun route(): String = route.getRequired("route")

    @JsonProperty("method") @ExcludeMissing fun _method() = method

    @JsonProperty("provider_types") @ExcludeMissing fun _providerTypes() = providerTypes

    @JsonProperty("route") @ExcludeMissing fun _route() = route

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
            this.method = routeInfo.method
            this.providerTypes = routeInfo.providerTypes
            this.route = routeInfo.route
            additionalProperties(routeInfo.additionalProperties)
        }

        fun method(method: String) = method(JsonField.of(method))

        @JsonProperty("method")
        @ExcludeMissing
        fun method(method: JsonField<String>) = apply { this.method = method }

        fun providerTypes(providerTypes: List<String>) = providerTypes(JsonField.of(providerTypes))

        @JsonProperty("provider_types")
        @ExcludeMissing
        fun providerTypes(providerTypes: JsonField<List<String>>) = apply {
            this.providerTypes = providerTypes
        }

        fun route(route: String) = route(JsonField.of(route))

        @JsonProperty("route")
        @ExcludeMissing
        fun route(route: JsonField<String>) = apply { this.route = route }

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
