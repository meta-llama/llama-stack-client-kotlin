// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.Params
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.toImmutable
import java.util.Objects

class TelemetryQuerySpansParams
private constructor(
    private val attributeFilters: List<QueryCondition>,
    private val attributesToReturn: List<String>,
    private val maxDepth: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun attributeFilters(): List<QueryCondition> = attributeFilters

    fun attributesToReturn(): List<String> = attributesToReturn

    fun maxDepth(): Long? = maxDepth

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.attributeFilters.let {
            queryParams.put("attribute_filters", listOf(it.joinToString(separator = ",")))
        }
        this.attributesToReturn.let {
            queryParams.put("attributes_to_return", listOf(it.joinToString(separator = ",")))
        }
        this.maxDepth?.let { queryParams.put("max_depth", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [TelemetryQuerySpansParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var attributeFilters: MutableList<QueryCondition>? = null
        private var attributesToReturn: MutableList<String>? = null
        private var maxDepth: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(telemetryQuerySpansParams: TelemetryQuerySpansParams) = apply {
            attributeFilters = telemetryQuerySpansParams.attributeFilters.toMutableList()
            attributesToReturn = telemetryQuerySpansParams.attributesToReturn.toMutableList()
            maxDepth = telemetryQuerySpansParams.maxDepth
            additionalHeaders = telemetryQuerySpansParams.additionalHeaders.toBuilder()
            additionalQueryParams = telemetryQuerySpansParams.additionalQueryParams.toBuilder()
        }

        fun attributeFilters(attributeFilters: List<QueryCondition>) = apply {
            this.attributeFilters = attributeFilters.toMutableList()
        }

        fun addAttributeFilter(attributeFilter: QueryCondition) = apply {
            attributeFilters = (attributeFilters ?: mutableListOf()).apply { add(attributeFilter) }
        }

        fun attributesToReturn(attributesToReturn: List<String>) = apply {
            this.attributesToReturn = attributesToReturn.toMutableList()
        }

        fun addAttributesToReturn(attributesToReturn: String) = apply {
            this.attributesToReturn =
                (this.attributesToReturn ?: mutableListOf()).apply { add(attributesToReturn) }
        }

        fun maxDepth(maxDepth: Long?) = apply { this.maxDepth = maxDepth }

        fun maxDepth(maxDepth: Long) = maxDepth(maxDepth as Long?)

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

        fun build(): TelemetryQuerySpansParams =
            TelemetryQuerySpansParams(
                checkRequired("attributeFilters", attributeFilters).toImmutable(),
                checkRequired("attributesToReturn", attributesToReturn).toImmutable(),
                maxDepth,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TelemetryQuerySpansParams && attributeFilters == other.attributeFilters && attributesToReturn == other.attributesToReturn && maxDepth == other.maxDepth && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(attributeFilters, attributesToReturn, maxDepth, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "TelemetryQuerySpansParams{attributeFilters=$attributeFilters, attributesToReturn=$attributesToReturn, maxDepth=$maxDepth, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
