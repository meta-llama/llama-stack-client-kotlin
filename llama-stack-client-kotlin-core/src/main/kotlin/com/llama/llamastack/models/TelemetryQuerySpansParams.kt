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

class TelemetryQuerySpansParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun attributeFilters(): List<QueryCondition> = body.attributeFilters()

    fun attributesToReturn(): List<String> = body.attributesToReturn()

    fun maxDepth(): Long? = body.maxDepth()

    fun _attributeFilters(): JsonField<List<QueryCondition>> = body._attributeFilters()

    fun _attributesToReturn(): JsonField<List<String>> = body._attributesToReturn()

    fun _maxDepth(): JsonField<Long> = body._maxDepth()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("attribute_filters")
        @ExcludeMissing
        private val attributeFilters: JsonField<List<QueryCondition>> = JsonMissing.of(),
        @JsonProperty("attributes_to_return")
        @ExcludeMissing
        private val attributesToReturn: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("max_depth")
        @ExcludeMissing
        private val maxDepth: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun attributeFilters(): List<QueryCondition> =
            attributeFilters.getRequired("attribute_filters")

        fun attributesToReturn(): List<String> =
            attributesToReturn.getRequired("attributes_to_return")

        fun maxDepth(): Long? = maxDepth.getNullable("max_depth")

        @JsonProperty("attribute_filters")
        @ExcludeMissing
        fun _attributeFilters(): JsonField<List<QueryCondition>> = attributeFilters

        @JsonProperty("attributes_to_return")
        @ExcludeMissing
        fun _attributesToReturn(): JsonField<List<String>> = attributesToReturn

        @JsonProperty("max_depth") @ExcludeMissing fun _maxDepth(): JsonField<Long> = maxDepth

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            attributeFilters().forEach { it.validate() }
            attributesToReturn()
            maxDepth()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var attributeFilters: JsonField<MutableList<QueryCondition>>? = null
            private var attributesToReturn: JsonField<MutableList<String>>? = null
            private var maxDepth: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                attributeFilters = body.attributeFilters.map { it.toMutableList() }
                attributesToReturn = body.attributesToReturn.map { it.toMutableList() }
                maxDepth = body.maxDepth
                additionalProperties = body.additionalProperties.toMutableMap()
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

            fun attributesToReturn(attributesToReturn: List<String>) =
                attributesToReturn(JsonField.of(attributesToReturn))

            fun attributesToReturn(attributesToReturn: JsonField<List<String>>) = apply {
                this.attributesToReturn = attributesToReturn.map { it.toMutableList() }
            }

            fun addAttributesToReturn(attributesToReturn: String) = apply {
                this.attributesToReturn =
                    (this.attributesToReturn ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(attributesToReturn)
                    }
            }

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

            fun build(): Body =
                Body(
                    checkRequired("attributeFilters", attributeFilters).map { it.toImmutable() },
                    checkRequired("attributesToReturn", attributesToReturn).map {
                        it.toImmutable()
                    },
                    maxDepth,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && attributeFilters == other.attributeFilters && attributesToReturn == other.attributesToReturn && maxDepth == other.maxDepth && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(attributeFilters, attributesToReturn, maxDepth, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{attributeFilters=$attributeFilters, attributesToReturn=$attributesToReturn, maxDepth=$maxDepth, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [TelemetryQuerySpansParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(telemetryQuerySpansParams: TelemetryQuerySpansParams) = apply {
            body = telemetryQuerySpansParams.body.toBuilder()
            additionalHeaders = telemetryQuerySpansParams.additionalHeaders.toBuilder()
            additionalQueryParams = telemetryQuerySpansParams.additionalQueryParams.toBuilder()
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

        fun attributesToReturn(attributesToReturn: List<String>) = apply {
            body.attributesToReturn(attributesToReturn)
        }

        fun attributesToReturn(attributesToReturn: JsonField<List<String>>) = apply {
            body.attributesToReturn(attributesToReturn)
        }

        fun addAttributesToReturn(attributesToReturn: String) = apply {
            body.addAttributesToReturn(attributesToReturn)
        }

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

        fun build(): TelemetryQuerySpansParams =
            TelemetryQuerySpansParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TelemetryQuerySpansParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "TelemetryQuerySpansParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
