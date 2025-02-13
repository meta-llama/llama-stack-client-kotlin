// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.Params
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import java.util.Objects

class DatasetioGetRowsPaginatedParams
private constructor(
    private val datasetId: String,
    private val rowsInPage: Long,
    private val filterCondition: String?,
    private val pageToken: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun datasetId(): String = datasetId

    fun rowsInPage(): Long = rowsInPage

    fun filterCondition(): String? = filterCondition

    fun pageToken(): String? = pageToken

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.datasetId.let { queryParams.put("dataset_id", listOf(it.toString())) }
        this.rowsInPage.let { queryParams.put("rows_in_page", listOf(it.toString())) }
        this.filterCondition?.let { queryParams.put("filter_condition", listOf(it.toString())) }
        this.pageToken?.let { queryParams.put("page_token", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [DatasetioGetRowsPaginatedParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var datasetId: String? = null
        private var rowsInPage: Long? = null
        private var filterCondition: String? = null
        private var pageToken: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(datasetioGetRowsPaginatedParams: DatasetioGetRowsPaginatedParams) =
            apply {
                datasetId = datasetioGetRowsPaginatedParams.datasetId
                rowsInPage = datasetioGetRowsPaginatedParams.rowsInPage
                filterCondition = datasetioGetRowsPaginatedParams.filterCondition
                pageToken = datasetioGetRowsPaginatedParams.pageToken
                additionalHeaders = datasetioGetRowsPaginatedParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    datasetioGetRowsPaginatedParams.additionalQueryParams.toBuilder()
            }

        fun datasetId(datasetId: String) = apply { this.datasetId = datasetId }

        fun rowsInPage(rowsInPage: Long) = apply { this.rowsInPage = rowsInPage }

        fun filterCondition(filterCondition: String?) = apply {
            this.filterCondition = filterCondition
        }

        fun pageToken(pageToken: String?) = apply { this.pageToken = pageToken }

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

        fun build(): DatasetioGetRowsPaginatedParams =
            DatasetioGetRowsPaginatedParams(
                checkRequired("datasetId", datasetId),
                checkRequired("rowsInPage", rowsInPage),
                filterCondition,
                pageToken,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DatasetioGetRowsPaginatedParams && datasetId == other.datasetId && rowsInPage == other.rowsInPage && filterCondition == other.filterCondition && pageToken == other.pageToken && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(datasetId, rowsInPage, filterCondition, pageToken, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "DatasetioGetRowsPaginatedParams{datasetId=$datasetId, rowsInPage=$rowsInPage, filterCondition=$filterCondition, pageToken=$pageToken, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
