// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.toImmutable
import java.util.Objects

class TelemetryQueryTracesParams
constructor(
    private val attributeFilters: List<QueryCondition>?,
    private val limit: Long?,
    private val offset: Long?,
    private val orderBy: List<String>?,
    private val xLlamaStackClientVersion: String?,
    private val xLlamaStackProviderData: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun attributeFilters(): List<QueryCondition>? = attributeFilters

    fun limit(): Long? = limit

    fun offset(): Long? = offset

    fun orderBy(): List<String>? = orderBy

    fun xLlamaStackClientVersion(): String? = xLlamaStackClientVersion

    fun xLlamaStackProviderData(): String? = xLlamaStackProviderData

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getHeaders(): Headers {
        val headers = Headers.builder()
        this.xLlamaStackClientVersion?.let {
            headers.put("X-LlamaStack-Client-Version", listOf(it.toString()))
        }
        this.xLlamaStackProviderData?.let {
            headers.put("X-LlamaStack-Provider-Data", listOf(it.toString()))
        }
        headers.putAll(additionalHeaders)
        return headers.build()
    }

    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.attributeFilters?.let {
            queryParams.put("attribute_filters", listOf(it.joinToString(separator = ",")))
        }
        this.limit?.let { queryParams.put("limit", listOf(it.toString())) }
        this.offset?.let { queryParams.put("offset", listOf(it.toString())) }
        this.orderBy?.let { queryParams.put("order_by", listOf(it.joinToString(separator = ","))) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var attributeFilters: MutableList<QueryCondition>? = null
        private var limit: Long? = null
        private var offset: Long? = null
        private var orderBy: MutableList<String>? = null
        private var xLlamaStackClientVersion: String? = null
        private var xLlamaStackProviderData: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(telemetryQueryTracesParams: TelemetryQueryTracesParams) = apply {
            attributeFilters = telemetryQueryTracesParams.attributeFilters?.toMutableList()
            limit = telemetryQueryTracesParams.limit
            offset = telemetryQueryTracesParams.offset
            orderBy = telemetryQueryTracesParams.orderBy?.toMutableList()
            xLlamaStackClientVersion = telemetryQueryTracesParams.xLlamaStackClientVersion
            xLlamaStackProviderData = telemetryQueryTracesParams.xLlamaStackProviderData
            additionalHeaders = telemetryQueryTracesParams.additionalHeaders.toBuilder()
            additionalQueryParams = telemetryQueryTracesParams.additionalQueryParams.toBuilder()
        }

        fun attributeFilters(attributeFilters: List<QueryCondition>?) = apply {
            this.attributeFilters = attributeFilters?.toMutableList()
        }

        fun addAttributeFilter(attributeFilter: QueryCondition) = apply {
            attributeFilters = (attributeFilters ?: mutableListOf()).apply { add(attributeFilter) }
        }

        fun limit(limit: Long?) = apply { this.limit = limit }

        fun limit(limit: Long) = limit(limit as Long?)

        fun offset(offset: Long?) = apply { this.offset = offset }

        fun offset(offset: Long) = offset(offset as Long?)

        fun orderBy(orderBy: List<String>?) = apply { this.orderBy = orderBy?.toMutableList() }

        fun addOrderBy(orderBy: String) = apply {
            this.orderBy = (this.orderBy ?: mutableListOf()).apply { add(orderBy) }
        }

        fun xLlamaStackClientVersion(xLlamaStackClientVersion: String?) = apply {
            this.xLlamaStackClientVersion = xLlamaStackClientVersion
        }

        fun xLlamaStackProviderData(xLlamaStackProviderData: String?) = apply {
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

        fun build(): TelemetryQueryTracesParams =
            TelemetryQueryTracesParams(
                attributeFilters?.toImmutable(),
                limit,
                offset,
                orderBy?.toImmutable(),
                xLlamaStackClientVersion,
                xLlamaStackProviderData,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TelemetryQueryTracesParams && attributeFilters == other.attributeFilters && limit == other.limit && offset == other.offset && orderBy == other.orderBy && xLlamaStackClientVersion == other.xLlamaStackClientVersion && xLlamaStackProviderData == other.xLlamaStackProviderData && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(attributeFilters, limit, offset, orderBy, xLlamaStackClientVersion, xLlamaStackProviderData, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "TelemetryQueryTracesParams{attributeFilters=$attributeFilters, limit=$limit, offset=$offset, orderBy=$orderBy, xLlamaStackClientVersion=$xLlamaStackClientVersion, xLlamaStackProviderData=$xLlamaStackProviderData, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
