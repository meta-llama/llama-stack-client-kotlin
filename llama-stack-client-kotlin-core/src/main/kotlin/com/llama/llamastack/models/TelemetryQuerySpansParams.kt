// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.BaseDeserializer
import com.llama.llamastack.core.BaseSerializer
import com.llama.llamastack.core.Enum
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

class TelemetryQuerySpansParams
constructor(
    private val xLlamaStackProviderData: String?,
    private val body: TelemetryQuerySpansBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun xLlamaStackProviderData(): String? = xLlamaStackProviderData

    fun attributeFilters(): List<AttributeFilter> = body.attributeFilters()

    fun attributesToReturn(): List<String> = body.attributesToReturn()

    fun maxDepth(): Long? = body.maxDepth()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    internal fun getBody(): TelemetryQuerySpansBody = body

    internal fun getHeaders(): Headers {
        val headers = Headers.builder()
        this.xLlamaStackProviderData?.let {
            headers.put("X-LlamaStack-ProviderData", listOf(it.toString()))
        }
        headers.putAll(additionalHeaders)
        return headers.build()
    }

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class TelemetryQuerySpansBody
    @JsonCreator
    internal constructor(
        @JsonProperty("attribute_filters") private val attributeFilters: List<AttributeFilter>,
        @JsonProperty("attributes_to_return") private val attributesToReturn: List<String>,
        @JsonProperty("max_depth") private val maxDepth: Long?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("attribute_filters")
        fun attributeFilters(): List<AttributeFilter> = attributeFilters

        @JsonProperty("attributes_to_return")
        fun attributesToReturn(): List<String> = attributesToReturn

        @JsonProperty("max_depth") fun maxDepth(): Long? = maxDepth

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var attributeFilters: MutableList<AttributeFilter>? = null
            private var attributesToReturn: MutableList<String>? = null
            private var maxDepth: Long? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(telemetryQuerySpansBody: TelemetryQuerySpansBody) = apply {
                attributeFilters = telemetryQuerySpansBody.attributeFilters.toMutableList()
                attributesToReturn = telemetryQuerySpansBody.attributesToReturn.toMutableList()
                maxDepth = telemetryQuerySpansBody.maxDepth
                additionalProperties = telemetryQuerySpansBody.additionalProperties.toMutableMap()
            }

            fun attributeFilters(attributeFilters: List<AttributeFilter>) = apply {
                this.attributeFilters = attributeFilters.toMutableList()
            }

            fun addAttributeFilter(attributeFilter: AttributeFilter) = apply {
                attributeFilters =
                    (attributeFilters ?: mutableListOf()).apply { add(attributeFilter) }
            }

            fun attributesToReturn(attributesToReturn: List<String>) = apply {
                this.attributesToReturn = attributesToReturn.toMutableList()
            }

            fun addAttributesToReturn(attributesToReturn: String) = apply {
                this.attributesToReturn =
                    (this.attributesToReturn ?: mutableListOf()).apply { add(attributesToReturn) }
            }

            fun maxDepth(maxDepth: Long) = apply { this.maxDepth = maxDepth }

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

            fun build(): TelemetryQuerySpansBody =
                TelemetryQuerySpansBody(
                    checkNotNull(attributeFilters) {
                            "`attributeFilters` is required but was not set"
                        }
                        .toImmutable(),
                    checkNotNull(attributesToReturn) {
                            "`attributesToReturn` is required but was not set"
                        }
                        .toImmutable(),
                    maxDepth,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TelemetryQuerySpansBody && attributeFilters == other.attributeFilters && attributesToReturn == other.attributesToReturn && maxDepth == other.maxDepth && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(attributeFilters, attributesToReturn, maxDepth, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TelemetryQuerySpansBody{attributeFilters=$attributeFilters, attributesToReturn=$attributesToReturn, maxDepth=$maxDepth, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var xLlamaStackProviderData: String? = null
        private var body: TelemetryQuerySpansBody.Builder = TelemetryQuerySpansBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(telemetryQuerySpansParams: TelemetryQuerySpansParams) = apply {
            xLlamaStackProviderData = telemetryQuerySpansParams.xLlamaStackProviderData
            body = telemetryQuerySpansParams.body.toBuilder()
            additionalHeaders = telemetryQuerySpansParams.additionalHeaders.toBuilder()
            additionalQueryParams = telemetryQuerySpansParams.additionalQueryParams.toBuilder()
        }

        fun xLlamaStackProviderData(xLlamaStackProviderData: String) = apply {
            this.xLlamaStackProviderData = xLlamaStackProviderData
        }

        fun attributeFilters(attributeFilters: List<AttributeFilter>) = apply {
            body.attributeFilters(attributeFilters)
        }

        fun addAttributeFilter(attributeFilter: AttributeFilter) = apply {
            body.addAttributeFilter(attributeFilter)
        }

        fun attributesToReturn(attributesToReturn: List<String>) = apply {
            body.attributesToReturn(attributesToReturn)
        }

        fun addAttributesToReturn(attributesToReturn: String) = apply {
            body.addAttributesToReturn(attributesToReturn)
        }

        fun maxDepth(maxDepth: Long) = apply { body.maxDepth(maxDepth) }

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

        fun build(): TelemetryQuerySpansParams =
            TelemetryQuerySpansParams(
                xLlamaStackProviderData,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class AttributeFilter
    @JsonCreator
    private constructor(
        @JsonProperty("key") private val key: String,
        @JsonProperty("op") private val op: Op,
        @JsonProperty("value") private val value: Value?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("key") fun key(): String = key

        @JsonProperty("op") fun op(): Op = op

        @JsonProperty("value") fun value(): Value? = value

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var key: String? = null
            private var op: Op? = null
            private var value: Value? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(attributeFilter: AttributeFilter) = apply {
                key = attributeFilter.key
                op = attributeFilter.op
                value = attributeFilter.value
                additionalProperties = attributeFilter.additionalProperties.toMutableMap()
            }

            fun key(key: String) = apply { this.key = key }

            fun op(op: Op) = apply { this.op = op }

            fun value(value: Value) = apply { this.value = value }

            fun value(boolean: Boolean) = apply { this.value = Value.ofBoolean(boolean) }

            fun value(double: Double) = apply { this.value = Value.ofDouble(double) }

            fun value(string: String) = apply { this.value = Value.ofString(string) }

            fun valueOfJsonValues(jsonValues: List<JsonValue>) = apply {
                this.value = Value.ofJsonValues(jsonValues)
            }

            fun value(jsonValue: JsonValue) = apply { this.value = Value.ofJsonValue(jsonValue) }

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

            fun build(): AttributeFilter =
                AttributeFilter(
                    checkNotNull(key) { "`key` is required but was not set" },
                    checkNotNull(op) { "`op` is required but was not set" },
                    value,
                    additionalProperties.toImmutable(),
                )
        }

        class Op
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val EQ = of("eq")

                val NE = of("ne")

                val GT = of("gt")

                val LT = of("lt")

                fun of(value: String) = Op(JsonField.of(value))
            }

            enum class Known {
                EQ,
                NE,
                GT,
                LT,
            }

            enum class Value {
                EQ,
                NE,
                GT,
                LT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    EQ -> Value.EQ
                    NE -> Value.NE
                    GT -> Value.GT
                    LT -> Value.LT
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    EQ -> Known.EQ
                    NE -> Known.NE
                    GT -> Known.GT
                    LT -> Known.LT
                    else -> throw LlamaStackClientInvalidDataException("Unknown Op: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Op && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @JsonDeserialize(using = Value.Deserializer::class)
        @JsonSerialize(using = Value.Serializer::class)
        class Value
        private constructor(
            private val boolean: Boolean? = null,
            private val double: Double? = null,
            private val string: String? = null,
            private val jsonValues: List<JsonValue>? = null,
            private val jsonValue: JsonValue? = null,
            private val _json: JsonValue? = null,
        ) {

            fun boolean(): Boolean? = boolean

            fun double(): Double? = double

            fun string(): String? = string

            fun jsonValues(): List<JsonValue>? = jsonValues

            fun jsonValue(): JsonValue? = jsonValue

            fun isBoolean(): Boolean = boolean != null

            fun isDouble(): Boolean = double != null

            fun isString(): Boolean = string != null

            fun isJsonValues(): Boolean = jsonValues != null

            fun isJsonValue(): Boolean = jsonValue != null

            fun asBoolean(): Boolean = boolean.getOrThrow("boolean")

            fun asDouble(): Double = double.getOrThrow("double")

            fun asString(): String = string.getOrThrow("string")

            fun asJsonValues(): List<JsonValue> = jsonValues.getOrThrow("jsonValues")

            fun asJsonValue(): JsonValue = jsonValue.getOrThrow("jsonValue")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    boolean != null -> visitor.visitBoolean(boolean)
                    double != null -> visitor.visitDouble(double)
                    string != null -> visitor.visitString(string)
                    jsonValues != null -> visitor.visitJsonValues(jsonValues)
                    jsonValue != null -> visitor.visitJsonValue(jsonValue)
                    else -> visitor.unknown(_json)
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Value && boolean == other.boolean && double == other.double && string == other.string && jsonValues == other.jsonValues && jsonValue == other.jsonValue /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(boolean, double, string, jsonValues, jsonValue) /* spotless:on */

            override fun toString(): String =
                when {
                    boolean != null -> "Value{boolean=$boolean}"
                    double != null -> "Value{double=$double}"
                    string != null -> "Value{string=$string}"
                    jsonValues != null -> "Value{jsonValues=$jsonValues}"
                    jsonValue != null -> "Value{jsonValue=$jsonValue}"
                    _json != null -> "Value{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Value")
                }

            companion object {

                fun ofBoolean(boolean: Boolean) = Value(boolean = boolean)

                fun ofDouble(double: Double) = Value(double = double)

                fun ofString(string: String) = Value(string = string)

                fun ofJsonValues(jsonValues: List<JsonValue>) = Value(jsonValues = jsonValues)

                fun ofJsonValue(jsonValue: JsonValue) = Value(jsonValue = jsonValue)
            }

            interface Visitor<out T> {

                fun visitBoolean(boolean: Boolean): T

                fun visitDouble(double: Double): T

                fun visitString(string: String): T

                fun visitJsonValues(jsonValues: List<JsonValue>): T

                fun visitJsonValue(jsonValue: JsonValue): T

                fun unknown(json: JsonValue?): T {
                    throw LlamaStackClientInvalidDataException("Unknown Value: $json")
                }
            }

            class Deserializer : BaseDeserializer<Value>(Value::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Value {
                    val json = JsonValue.fromJsonNode(node)

                    tryDeserialize(node, jacksonTypeRef<Boolean>())?.let {
                        return Value(boolean = it, _json = json)
                    }
                    tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                        return Value(double = it, _json = json)
                    }
                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                        return Value(string = it, _json = json)
                    }
                    tryDeserialize(node, jacksonTypeRef<List<JsonValue>>())?.let {
                        return Value(jsonValues = it, _json = json)
                    }
                    tryDeserialize(node, jacksonTypeRef<JsonValue>())?.let {
                        return Value(jsonValue = it, _json = json)
                    }

                    return Value(_json = json)
                }
            }

            class Serializer : BaseSerializer<Value>(Value::class) {

                override fun serialize(
                    value: Value,
                    generator: JsonGenerator,
                    provider: SerializerProvider
                ) {
                    when {
                        value.boolean != null -> generator.writeObject(value.boolean)
                        value.double != null -> generator.writeObject(value.double)
                        value.string != null -> generator.writeObject(value.string)
                        value.jsonValues != null -> generator.writeObject(value.jsonValues)
                        value.jsonValue != null -> generator.writeObject(value.jsonValue)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Value")
                    }
                }
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AttributeFilter && key == other.key && op == other.op && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(key, op, value, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AttributeFilter{key=$key, op=$op, value=$value, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TelemetryQuerySpansParams && xLlamaStackProviderData == other.xLlamaStackProviderData && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(xLlamaStackProviderData, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "TelemetryQuerySpansParams{xLlamaStackProviderData=$xLlamaStackProviderData, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
