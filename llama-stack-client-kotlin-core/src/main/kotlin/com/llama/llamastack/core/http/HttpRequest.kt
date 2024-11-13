package com.llama.llamastack.core.http

import com.llama.llamastack.core.toImmutable

class HttpRequest
private constructor(
    val method: HttpMethod,
    val url: String?,
    val pathSegments: List<String>,
    val headers: Headers,
    val queryParams: QueryParams,
    val body: HttpRequestBody?,
) {

    fun toBuilder(): Builder = Builder().from(this)

    override fun toString(): String =
        "HttpRequest{method=$method, url=$url, pathSegments=$pathSegments, headers=$headers, queryParams=$queryParams, body=$body}"

    companion object {
        fun builder() = Builder()
    }

    class Builder {

        private var method: HttpMethod? = null
        private var url: String? = null
        private var pathSegments: MutableList<String> = mutableListOf()
        private var headers: Headers.Builder = Headers.builder()
        private var queryParams: QueryParams.Builder = QueryParams.builder()
        private var body: HttpRequestBody? = null

        internal fun from(request: HttpRequest) = apply {
            method = request.method
            url = request.url
            pathSegments = request.pathSegments.toMutableList()
            headers = request.headers.toBuilder()
            queryParams = request.queryParams.toBuilder()
            body = request.body
        }

        fun method(method: HttpMethod) = apply { this.method = method }

        fun url(url: String) = apply { this.url = url }

        fun addPathSegment(pathSegment: String) = apply { pathSegments.add(pathSegment) }

        fun addPathSegments(vararg pathSegments: String) = apply {
            this.pathSegments.addAll(pathSegments)
        }

        fun headers(headers: Headers) = apply {
            this.headers.clear()
            putAllHeaders(headers)
        }

        fun headers(headers: Map<String, Iterable<String>>) = apply {
            this.headers.clear()
            putAllHeaders(headers)
        }

        fun putHeader(name: String, value: String) = apply { headers.put(name, value) }

        fun putHeaders(name: String, values: Iterable<String>) = apply { headers.put(name, values) }

        fun putAllHeaders(headers: Headers) = apply { this.headers.putAll(headers) }

        fun putAllHeaders(headers: Map<String, Iterable<String>>) = apply {
            this.headers.putAll(headers)
        }

        fun replaceHeaders(name: String, value: String) = apply { headers.replace(name, value) }

        fun replaceHeaders(name: String, values: Iterable<String>) = apply {
            headers.replace(name, values)
        }

        fun replaceAllHeaders(headers: Headers) = apply { this.headers.replaceAll(headers) }

        fun replaceAllHeaders(headers: Map<String, Iterable<String>>) = apply {
            this.headers.replaceAll(headers)
        }

        fun removeHeaders(name: String) = apply { headers.remove(name) }

        fun removeAllHeaders(names: Set<String>) = apply { headers.removeAll(names) }

        fun queryParams(queryParams: QueryParams) = apply {
            this.queryParams.clear()
            putAllQueryParams(queryParams)
        }

        fun queryParams(queryParams: Map<String, Iterable<String>>) = apply {
            this.queryParams.clear()
            putAllQueryParams(queryParams)
        }

        fun putQueryParam(key: String, value: String) = apply { queryParams.put(key, value) }

        fun putQueryParams(key: String, values: Iterable<String>) = apply {
            queryParams.put(key, values)
        }

        fun putAllQueryParams(queryParams: QueryParams) = apply {
            this.queryParams.putAll(queryParams)
        }

        fun putAllQueryParams(queryParams: Map<String, Iterable<String>>) = apply {
            this.queryParams.putAll(queryParams)
        }

        fun replaceQueryParams(key: String, value: String) = apply {
            queryParams.replace(key, value)
        }

        fun replaceQueryParams(key: String, values: Iterable<String>) = apply {
            queryParams.replace(key, values)
        }

        fun replaceAllQueryParams(queryParams: QueryParams) = apply {
            this.queryParams.replaceAll(queryParams)
        }

        fun replaceAllQueryParams(queryParams: Map<String, Iterable<String>>) = apply {
            this.queryParams.replaceAll(queryParams)
        }

        fun removeQueryParams(key: String) = apply { queryParams.remove(key) }

        fun removeAllQueryParams(keys: Set<String>) = apply { queryParams.removeAll(keys) }

        fun body(body: HttpRequestBody) = apply { this.body = body }

        fun build(): HttpRequest =
            HttpRequest(
                checkNotNull(method) { "`method` is required but was not set" },
                url,
                pathSegments.toImmutable(),
                headers.build(),
                queryParams.build(),
                body,
            )
    }
}
