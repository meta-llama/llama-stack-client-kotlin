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
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import java.util.Objects

class TelemetrySaveSpansToDatasetParams
constructor(
    private val xLlamaStackClientVersion: String?,
    private val xLlamaStackProviderData: String?,
    private val body: TelemetrySaveSpansToDatasetBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun xLlamaStackClientVersion(): String? = xLlamaStackClientVersion

    fun xLlamaStackProviderData(): String? = xLlamaStackProviderData

    fun attributeFilters(): List<QueryCondition> = body.attributeFilters()

    fun attributesToSave(): List<String> = body.attributesToSave()

    fun datasetId(): String = body.datasetId()

    fun maxDepth(): Long? = body.maxDepth()

    fun _attributeFilters(): JsonField<List<QueryCondition>> = body._attributeFilters()

    fun _attributesToSave(): JsonField<List<String>> = body._attributesToSave()

    fun _datasetId(): JsonField<String> = body._datasetId()

    fun _maxDepth(): JsonField<Long> = body._maxDepth()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getBody(): TelemetrySaveSpansToDatasetBody = body

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

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class TelemetrySaveSpansToDatasetBody
    @JsonCreator
    internal constructor(
        @JsonProperty("attribute_filters")
        @ExcludeMissing
        private val attributeFilters: JsonField<List<QueryCondition>> = JsonMissing.of(),
        @JsonProperty("attributes_to_save")
        @ExcludeMissing
        private val attributesToSave: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("dataset_id")
        @ExcludeMissing
        private val datasetId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("max_depth")
        @ExcludeMissing
        private val maxDepth: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun attributeFilters(): List<QueryCondition> =
            attributeFilters.getRequired("attribute_filters")

        fun attributesToSave(): List<String> = attributesToSave.getRequired("attributes_to_save")

        fun datasetId(): String = datasetId.getRequired("dataset_id")

        fun maxDepth(): Long? = maxDepth.getNullable("max_depth")

        @JsonProperty("attribute_filters")
        @ExcludeMissing
        fun _attributeFilters(): JsonField<List<QueryCondition>> = attributeFilters

        @JsonProperty("attributes_to_save")
        @ExcludeMissing
        fun _attributesToSave(): JsonField<List<String>> = attributesToSave

        @JsonProperty("dataset_id") @ExcludeMissing fun _datasetId(): JsonField<String> = datasetId

        @JsonProperty("max_depth") @ExcludeMissing fun _maxDepth(): JsonField<Long> = maxDepth

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): TelemetrySaveSpansToDatasetBody = apply {
            if (validated) {
                return@apply
            }

            attributeFilters().forEach { it.validate() }
            attributesToSave()
            datasetId()
            maxDepth()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var attributeFilters: JsonField<MutableList<QueryCondition>>? = null
            private var attributesToSave: JsonField<MutableList<String>>? = null
            private var datasetId: JsonField<String>? = null
            private var maxDepth: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(telemetrySaveSpansToDatasetBody: TelemetrySaveSpansToDatasetBody) =
                apply {
                    attributeFilters =
                        telemetrySaveSpansToDatasetBody.attributeFilters.map { it.toMutableList() }
                    attributesToSave =
                        telemetrySaveSpansToDatasetBody.attributesToSave.map { it.toMutableList() }
                    datasetId = telemetrySaveSpansToDatasetBody.datasetId
                    maxDepth = telemetrySaveSpansToDatasetBody.maxDepth
                    additionalProperties =
                        telemetrySaveSpansToDatasetBody.additionalProperties.toMutableMap()
                }

            fun attributeFilters(attributeFilters: List<QueryCondition>) =
                attributeFilters(JsonField.of(attributeFilters))

            fun attributeFilters(attributeFilters: JsonField<List<QueryCondition>>) = apply {
                this.attributeFilters = attributeFilters.map { it.toMutableList() }
            }

            fun addAttributeFilter(attributeFilter: QueryCondition) = apply {
                attributeFilters =
                    (attributeFilters ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(attributeFilter)
                    }
            }

            fun attributesToSave(attributesToSave: List<String>) =
                attributesToSave(JsonField.of(attributesToSave))

            fun attributesToSave(attributesToSave: JsonField<List<String>>) = apply {
                this.attributesToSave = attributesToSave.map { it.toMutableList() }
            }

            fun addAttributesToSave(attributesToSave: String) = apply {
                this.attributesToSave =
                    (this.attributesToSave ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(attributesToSave)
                    }
            }

            fun datasetId(datasetId: String) = datasetId(JsonField.of(datasetId))

            fun datasetId(datasetId: JsonField<String>) = apply { this.datasetId = datasetId }

            fun maxDepth(maxDepth: Long) = maxDepth(JsonField.of(maxDepth))

            fun maxDepth(maxDepth: JsonField<Long>) = apply { this.maxDepth = maxDepth }

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

            fun build(): TelemetrySaveSpansToDatasetBody =
                TelemetrySaveSpansToDatasetBody(
                    checkRequired("attributeFilters", attributeFilters).map { it.toImmutable() },
                    checkRequired("attributesToSave", attributesToSave).map { it.toImmutable() },
                    checkRequired("datasetId", datasetId),
                    maxDepth,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TelemetrySaveSpansToDatasetBody && attributeFilters == other.attributeFilters && attributesToSave == other.attributesToSave && datasetId == other.datasetId && maxDepth == other.maxDepth && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(attributeFilters, attributesToSave, datasetId, maxDepth, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TelemetrySaveSpansToDatasetBody{attributeFilters=$attributeFilters, attributesToSave=$attributesToSave, datasetId=$datasetId, maxDepth=$maxDepth, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var xLlamaStackClientVersion: String? = null
        private var xLlamaStackProviderData: String? = null
        private var body: TelemetrySaveSpansToDatasetBody.Builder =
            TelemetrySaveSpansToDatasetBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(telemetrySaveSpansToDatasetParams: TelemetrySaveSpansToDatasetParams) =
            apply {
                xLlamaStackClientVersion =
                    telemetrySaveSpansToDatasetParams.xLlamaStackClientVersion
                xLlamaStackProviderData = telemetrySaveSpansToDatasetParams.xLlamaStackProviderData
                body = telemetrySaveSpansToDatasetParams.body.toBuilder()
                additionalHeaders = telemetrySaveSpansToDatasetParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    telemetrySaveSpansToDatasetParams.additionalQueryParams.toBuilder()
            }

        fun xLlamaStackClientVersion(xLlamaStackClientVersion: String?) = apply {
            this.xLlamaStackClientVersion = xLlamaStackClientVersion
        }

        fun xLlamaStackProviderData(xLlamaStackProviderData: String?) = apply {
            this.xLlamaStackProviderData = xLlamaStackProviderData
        }

        fun attributeFilters(attributeFilters: List<QueryCondition>) = apply {
            body.attributeFilters(attributeFilters)
        }

        fun attributeFilters(attributeFilters: JsonField<List<QueryCondition>>) = apply {
            body.attributeFilters(attributeFilters)
        }

        fun addAttributeFilter(attributeFilter: QueryCondition) = apply {
            body.addAttributeFilter(attributeFilter)
        }

        fun attributesToSave(attributesToSave: List<String>) = apply {
            body.attributesToSave(attributesToSave)
        }

        fun attributesToSave(attributesToSave: JsonField<List<String>>) = apply {
            body.attributesToSave(attributesToSave)
        }

        fun addAttributesToSave(attributesToSave: String) = apply {
            body.addAttributesToSave(attributesToSave)
        }

        fun datasetId(datasetId: String) = apply { body.datasetId(datasetId) }

        fun datasetId(datasetId: JsonField<String>) = apply { body.datasetId(datasetId) }

        fun maxDepth(maxDepth: Long) = apply { body.maxDepth(maxDepth) }

        fun maxDepth(maxDepth: JsonField<Long>) = apply { body.maxDepth(maxDepth) }

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

        fun build(): TelemetrySaveSpansToDatasetParams =
            TelemetrySaveSpansToDatasetParams(
                xLlamaStackClientVersion,
                xLlamaStackProviderData,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TelemetrySaveSpansToDatasetParams && xLlamaStackClientVersion == other.xLlamaStackClientVersion && xLlamaStackProviderData == other.xLlamaStackProviderData && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(xLlamaStackClientVersion, xLlamaStackProviderData, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "TelemetrySaveSpansToDatasetParams{xLlamaStackClientVersion=$xLlamaStackClientVersion, xLlamaStackProviderData=$xLlamaStackProviderData, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
