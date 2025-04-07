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
import com.llama.llamastack.core.checkKnown
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Collections
import java.util.Objects

class RouteInfo
private constructor(
    private val method: JsonField<String>,
    private val providerTypes: JsonField<List<String>>,
    private val route: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("method") @ExcludeMissing method: JsonField<String> = JsonMissing.of(),
        @JsonProperty("provider_types")
        @ExcludeMissing
        providerTypes: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("route") @ExcludeMissing route: JsonField<String> = JsonMissing.of(),
    ) : this(method, providerTypes, route, mutableMapOf())

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun method(): String = method.getRequired("method")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun providerTypes(): List<String> = providerTypes.getRequired("provider_types")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun route(): String = route.getRequired("route")

    /**
     * Returns the raw JSON value of [method].
     *
     * Unlike [method], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<String> = method

    /**
     * Returns the raw JSON value of [providerTypes].
     *
     * Unlike [providerTypes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("provider_types")
    @ExcludeMissing
    fun _providerTypes(): JsonField<List<String>> = providerTypes

    /**
     * Returns the raw JSON value of [route].
     *
     * Unlike [route], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("route") @ExcludeMissing fun _route(): JsonField<String> = route

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RouteInfo].
         *
         * The following fields are required:
         * ```kotlin
         * .method()
         * .providerTypes()
         * .route()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [RouteInfo]. */
    class Builder internal constructor() {

        private var method: JsonField<String>? = null
        private var providerTypes: JsonField<MutableList<String>>? = null
        private var route: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(routeInfo: RouteInfo) = apply {
            method = routeInfo.method
            providerTypes = routeInfo.providerTypes.map { it.toMutableList() }
            route = routeInfo.route
            additionalProperties = routeInfo.additionalProperties.toMutableMap()
        }

        fun method(method: String) = method(JsonField.of(method))

        /**
         * Sets [Builder.method] to an arbitrary JSON value.
         *
         * You should usually call [Builder.method] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun method(method: JsonField<String>) = apply { this.method = method }

        fun providerTypes(providerTypes: List<String>) = providerTypes(JsonField.of(providerTypes))

        /**
         * Sets [Builder.providerTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.providerTypes] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun providerTypes(providerTypes: JsonField<List<String>>) = apply {
            this.providerTypes = providerTypes.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [providerTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProviderType(providerType: String) = apply {
            providerTypes =
                (providerTypes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("providerTypes", it).add(providerType)
                }
        }

        fun route(route: String) = route(JsonField.of(route))

        /**
         * Sets [Builder.route] to an arbitrary JSON value.
         *
         * You should usually call [Builder.route] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
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

        /**
         * Returns an immutable instance of [RouteInfo].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .method()
         * .providerTypes()
         * .route()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RouteInfo =
            RouteInfo(
                checkRequired("method", method),
                checkRequired("providerTypes", providerTypes).map { it.toImmutable() },
                checkRequired("route", route),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RouteInfo = apply {
        if (validated) {
            return@apply
        }

        method()
        providerTypes()
        route()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LlamaStackClientInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (method.asKnown() == null) 0 else 1) +
            (providerTypes.asKnown()?.size ?: 0) +
            (if (route.asKnown() == null) 0 else 1)

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
