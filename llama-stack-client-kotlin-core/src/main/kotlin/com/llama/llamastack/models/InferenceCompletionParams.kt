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
import com.llama.llamastack.core.JsonMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

class InferenceCompletionParams
constructor(
    private val xLlamaStackClientVersion: String?,
    private val xLlamaStackProviderData: String?,
    private val body: InferenceCompletionBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun xLlamaStackClientVersion(): String? = xLlamaStackClientVersion

    fun xLlamaStackProviderData(): String? = xLlamaStackProviderData

    fun content(): InterleavedContent = body.content()

    fun modelId(): String = body.modelId()

    fun logprobs(): Logprobs? = body.logprobs()

    fun responseFormat(): ResponseFormat? = body.responseFormat()

    fun samplingParams(): SamplingParams? = body.samplingParams()

    fun _content(): JsonField<InterleavedContent> = body._content()

    fun _modelId(): JsonField<String> = body._modelId()

    fun _logprobs(): JsonField<Logprobs> = body._logprobs()

    fun _responseFormat(): JsonField<ResponseFormat> = body._responseFormat()

    fun _samplingParams(): JsonField<SamplingParams> = body._samplingParams()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getBody(): InferenceCompletionBody = body

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
    class InferenceCompletionBody
    @JsonCreator
    internal constructor(
        @JsonProperty("content")
        @ExcludeMissing
        private val content: JsonField<InterleavedContent> = JsonMissing.of(),
        @JsonProperty("model_id")
        @ExcludeMissing
        private val modelId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("logprobs")
        @ExcludeMissing
        private val logprobs: JsonField<Logprobs> = JsonMissing.of(),
        @JsonProperty("response_format")
        @ExcludeMissing
        private val responseFormat: JsonField<ResponseFormat> = JsonMissing.of(),
        @JsonProperty("sampling_params")
        @ExcludeMissing
        private val samplingParams: JsonField<SamplingParams> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun content(): InterleavedContent = content.getRequired("content")

        fun modelId(): String = modelId.getRequired("model_id")

        fun logprobs(): Logprobs? = logprobs.getNullable("logprobs")

        fun responseFormat(): ResponseFormat? = responseFormat.getNullable("response_format")

        fun samplingParams(): SamplingParams? = samplingParams.getNullable("sampling_params")

        @JsonProperty("content")
        @ExcludeMissing
        fun _content(): JsonField<InterleavedContent> = content

        @JsonProperty("model_id") @ExcludeMissing fun _modelId(): JsonField<String> = modelId

        @JsonProperty("logprobs") @ExcludeMissing fun _logprobs(): JsonField<Logprobs> = logprobs

        @JsonProperty("response_format")
        @ExcludeMissing
        fun _responseFormat(): JsonField<ResponseFormat> = responseFormat

        @JsonProperty("sampling_params")
        @ExcludeMissing
        fun _samplingParams(): JsonField<SamplingParams> = samplingParams

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): InferenceCompletionBody = apply {
            if (validated) {
                return@apply
            }

            content().validate()
            modelId()
            logprobs()?.validate()
            responseFormat()?.validate()
            samplingParams()?.validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var content: JsonField<InterleavedContent>? = null
            private var modelId: JsonField<String>? = null
            private var logprobs: JsonField<Logprobs> = JsonMissing.of()
            private var responseFormat: JsonField<ResponseFormat> = JsonMissing.of()
            private var samplingParams: JsonField<SamplingParams> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(inferenceCompletionBody: InferenceCompletionBody) = apply {
                content = inferenceCompletionBody.content
                modelId = inferenceCompletionBody.modelId
                logprobs = inferenceCompletionBody.logprobs
                responseFormat = inferenceCompletionBody.responseFormat
                samplingParams = inferenceCompletionBody.samplingParams
                additionalProperties = inferenceCompletionBody.additionalProperties.toMutableMap()
            }

            fun content(content: InterleavedContent) = content(JsonField.of(content))

            fun content(content: JsonField<InterleavedContent>) = apply { this.content = content }

            fun content(string: String) = content(InterleavedContent.ofString(string))

            fun content(imageContentItem: InterleavedContent.ImageContentItem) =
                content(InterleavedContent.ofImageContentItem(imageContentItem))

            fun content(textContentItem: InterleavedContent.TextContentItem) =
                content(InterleavedContent.ofTextContentItem(textContentItem))

            fun contentOfInterleavedContentItems(
                interleavedContentItems: List<InterleavedContentItem>
            ) = content(InterleavedContent.ofInterleavedContentItems(interleavedContentItems))

            fun modelId(modelId: String) = modelId(JsonField.of(modelId))

            fun modelId(modelId: JsonField<String>) = apply { this.modelId = modelId }

            fun logprobs(logprobs: Logprobs) = logprobs(JsonField.of(logprobs))

            fun logprobs(logprobs: JsonField<Logprobs>) = apply { this.logprobs = logprobs }

            fun responseFormat(responseFormat: ResponseFormat) =
                responseFormat(JsonField.of(responseFormat))

            fun responseFormat(responseFormat: JsonField<ResponseFormat>) = apply {
                this.responseFormat = responseFormat
            }

            fun responseFormat(unionMember0: ResponseFormat.UnionMember0) =
                responseFormat(ResponseFormat.ofUnionMember0(unionMember0))

            fun responseFormat(unionMember1: ResponseFormat.UnionMember1) =
                responseFormat(ResponseFormat.ofUnionMember1(unionMember1))

            fun samplingParams(samplingParams: SamplingParams) =
                samplingParams(JsonField.of(samplingParams))

            fun samplingParams(samplingParams: JsonField<SamplingParams>) = apply {
                this.samplingParams = samplingParams
            }

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

            fun build(): InferenceCompletionBody =
                InferenceCompletionBody(
                    checkRequired("content", content),
                    checkRequired("modelId", modelId),
                    logprobs,
                    responseFormat,
                    samplingParams,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InferenceCompletionBody && content == other.content && modelId == other.modelId && logprobs == other.logprobs && responseFormat == other.responseFormat && samplingParams == other.samplingParams && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(content, modelId, logprobs, responseFormat, samplingParams, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InferenceCompletionBody{content=$content, modelId=$modelId, logprobs=$logprobs, responseFormat=$responseFormat, samplingParams=$samplingParams, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var xLlamaStackClientVersion: String? = null
        private var xLlamaStackProviderData: String? = null
        private var body: InferenceCompletionBody.Builder = InferenceCompletionBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(inferenceCompletionParams: InferenceCompletionParams) = apply {
            xLlamaStackClientVersion = inferenceCompletionParams.xLlamaStackClientVersion
            xLlamaStackProviderData = inferenceCompletionParams.xLlamaStackProviderData
            body = inferenceCompletionParams.body.toBuilder()
            additionalHeaders = inferenceCompletionParams.additionalHeaders.toBuilder()
            additionalQueryParams = inferenceCompletionParams.additionalQueryParams.toBuilder()
        }

        fun xLlamaStackClientVersion(xLlamaStackClientVersion: String?) = apply {
            this.xLlamaStackClientVersion = xLlamaStackClientVersion
        }

        fun xLlamaStackProviderData(xLlamaStackProviderData: String?) = apply {
            this.xLlamaStackProviderData = xLlamaStackProviderData
        }

        fun content(content: InterleavedContent) = apply { body.content(content) }

        fun content(content: JsonField<InterleavedContent>) = apply { body.content(content) }

        fun content(string: String) = apply { body.content(string) }

        fun content(imageContentItem: InterleavedContent.ImageContentItem) = apply {
            body.content(imageContentItem)
        }

        fun content(textContentItem: InterleavedContent.TextContentItem) = apply {
            body.content(textContentItem)
        }

        fun contentOfInterleavedContentItems(
            interleavedContentItems: List<InterleavedContentItem>
        ) = apply { body.contentOfInterleavedContentItems(interleavedContentItems) }

        fun modelId(modelId: String) = apply { body.modelId(modelId) }

        fun modelId(modelId: JsonField<String>) = apply { body.modelId(modelId) }

        fun logprobs(logprobs: Logprobs) = apply { body.logprobs(logprobs) }

        fun logprobs(logprobs: JsonField<Logprobs>) = apply { body.logprobs(logprobs) }

        fun responseFormat(responseFormat: ResponseFormat) = apply {
            body.responseFormat(responseFormat)
        }

        fun responseFormat(responseFormat: JsonField<ResponseFormat>) = apply {
            body.responseFormat(responseFormat)
        }

        fun responseFormat(unionMember0: ResponseFormat.UnionMember0) = apply {
            body.responseFormat(unionMember0)
        }

        fun responseFormat(unionMember1: ResponseFormat.UnionMember1) = apply {
            body.responseFormat(unionMember1)
        }

        fun samplingParams(samplingParams: SamplingParams) = apply {
            body.samplingParams(samplingParams)
        }

        fun samplingParams(samplingParams: JsonField<SamplingParams>) = apply {
            body.samplingParams(samplingParams)
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

        fun build(): InferenceCompletionParams =
            InferenceCompletionParams(
                xLlamaStackClientVersion,
                xLlamaStackProviderData,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class Logprobs
    @JsonCreator
    private constructor(
        @JsonProperty("top_k") @ExcludeMissing private val topK: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun topK(): Long? = topK.getNullable("top_k")

        @JsonProperty("top_k") @ExcludeMissing fun _topK(): JsonField<Long> = topK

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Logprobs = apply {
            if (validated) {
                return@apply
            }

            topK()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var topK: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(logprobs: Logprobs) = apply {
                topK = logprobs.topK
                additionalProperties = logprobs.additionalProperties.toMutableMap()
            }

            fun topK(topK: Long) = topK(JsonField.of(topK))

            fun topK(topK: JsonField<Long>) = apply { this.topK = topK }

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

            fun build(): Logprobs = Logprobs(topK, additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Logprobs && topK == other.topK && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(topK, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Logprobs{topK=$topK, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = ResponseFormat.Deserializer::class)
    @JsonSerialize(using = ResponseFormat.Serializer::class)
    class ResponseFormat
    private constructor(
        private val unionMember0: UnionMember0? = null,
        private val unionMember1: UnionMember1? = null,
        private val _json: JsonValue? = null,
    ) {

        fun unionMember0(): UnionMember0? = unionMember0

        fun unionMember1(): UnionMember1? = unionMember1

        fun isUnionMember0(): Boolean = unionMember0 != null

        fun isUnionMember1(): Boolean = unionMember1 != null

        fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")

        fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
                unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
                else -> visitor.unknown(_json)
            }
        }

        private var validated: Boolean = false

        fun validate(): ResponseFormat = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitUnionMember0(unionMember0: UnionMember0) {
                        unionMember0.validate()
                    }

                    override fun visitUnionMember1(unionMember1: UnionMember1) {
                        unionMember1.validate()
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ResponseFormat && unionMember0 == other.unionMember0 && unionMember1 == other.unionMember1 /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(unionMember0, unionMember1) /* spotless:on */

        override fun toString(): String =
            when {
                unionMember0 != null -> "ResponseFormat{unionMember0=$unionMember0}"
                unionMember1 != null -> "ResponseFormat{unionMember1=$unionMember1}"
                _json != null -> "ResponseFormat{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid ResponseFormat")
            }

        companion object {

            fun ofUnionMember0(unionMember0: UnionMember0) =
                ResponseFormat(unionMember0 = unionMember0)

            fun ofUnionMember1(unionMember1: UnionMember1) =
                ResponseFormat(unionMember1 = unionMember1)
        }

        interface Visitor<out T> {

            fun visitUnionMember0(unionMember0: UnionMember0): T

            fun visitUnionMember1(unionMember1: UnionMember1): T

            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown ResponseFormat: $json")
            }
        }

        class Deserializer : BaseDeserializer<ResponseFormat>(ResponseFormat::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): ResponseFormat {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<UnionMember0>()) { it.validate() }
                    ?.let {
                        return ResponseFormat(unionMember0 = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<UnionMember1>()) { it.validate() }
                    ?.let {
                        return ResponseFormat(unionMember1 = it, _json = json)
                    }

                return ResponseFormat(_json = json)
            }
        }

        class Serializer : BaseSerializer<ResponseFormat>(ResponseFormat::class) {

            override fun serialize(
                value: ResponseFormat,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.unionMember0 != null -> generator.writeObject(value.unionMember0)
                    value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid ResponseFormat")
                }
            }
        }

        @NoAutoDetect
        class UnionMember0
        @JsonCreator
        private constructor(
            @JsonProperty("json_schema")
            @ExcludeMissing
            private val jsonSchema: JsonField<JsonSchema> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun jsonSchema(): JsonSchema = jsonSchema.getRequired("json_schema")

            fun type(): Type = type.getRequired("type")

            @JsonProperty("json_schema")
            @ExcludeMissing
            fun _jsonSchema(): JsonField<JsonSchema> = jsonSchema

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): UnionMember0 = apply {
                if (validated) {
                    return@apply
                }

                jsonSchema().validate()
                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var jsonSchema: JsonField<JsonSchema>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(unionMember0: UnionMember0) = apply {
                    jsonSchema = unionMember0.jsonSchema
                    type = unionMember0.type
                    additionalProperties = unionMember0.additionalProperties.toMutableMap()
                }

                fun jsonSchema(jsonSchema: JsonSchema) = jsonSchema(JsonField.of(jsonSchema))

                fun jsonSchema(jsonSchema: JsonField<JsonSchema>) = apply {
                    this.jsonSchema = jsonSchema
                }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): UnionMember0 =
                    UnionMember0(
                        checkRequired("jsonSchema", jsonSchema),
                        checkRequired("type", type),
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class JsonSchema
            @JsonCreator
            private constructor(
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): JsonSchema = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(jsonSchema: JsonSchema) = apply {
                        additionalProperties = jsonSchema.additionalProperties.toMutableMap()
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): JsonSchema = JsonSchema(additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is JsonSchema && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() = "JsonSchema{additionalProperties=$additionalProperties}"
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val JSON_SCHEMA = of("json_schema")

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    JSON_SCHEMA,
                }

                enum class Value {
                    JSON_SCHEMA,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        JSON_SCHEMA -> Value.JSON_SCHEMA
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        JSON_SCHEMA -> Known.JSON_SCHEMA
                        else -> throw LlamaStackClientInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is UnionMember0 && jsonSchema == other.jsonSchema && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(jsonSchema, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UnionMember0{jsonSchema=$jsonSchema, type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class UnionMember1
        @JsonCreator
        private constructor(
            @JsonProperty("bnf") @ExcludeMissing private val bnf: JsonField<Bnf> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun bnf(): Bnf = bnf.getRequired("bnf")

            fun type(): Type = type.getRequired("type")

            @JsonProperty("bnf") @ExcludeMissing fun _bnf(): JsonField<Bnf> = bnf

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): UnionMember1 = apply {
                if (validated) {
                    return@apply
                }

                bnf().validate()
                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var bnf: JsonField<Bnf>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(unionMember1: UnionMember1) = apply {
                    bnf = unionMember1.bnf
                    type = unionMember1.type
                    additionalProperties = unionMember1.additionalProperties.toMutableMap()
                }

                fun bnf(bnf: Bnf) = bnf(JsonField.of(bnf))

                fun bnf(bnf: JsonField<Bnf>) = apply { this.bnf = bnf }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): UnionMember1 =
                    UnionMember1(
                        checkRequired("bnf", bnf),
                        checkRequired("type", type),
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class Bnf
            @JsonCreator
            private constructor(
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Bnf = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(bnf: Bnf) = apply {
                        additionalProperties = bnf.additionalProperties.toMutableMap()
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): Bnf = Bnf(additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Bnf && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() = "Bnf{additionalProperties=$additionalProperties}"
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val GRAMMAR = of("grammar")

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    GRAMMAR,
                }

                enum class Value {
                    GRAMMAR,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        GRAMMAR -> Value.GRAMMAR
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        GRAMMAR -> Known.GRAMMAR
                        else -> throw LlamaStackClientInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is UnionMember1 && bnf == other.bnf && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(bnf, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UnionMember1{bnf=$bnf, type=$type, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InferenceCompletionParams && xLlamaStackClientVersion == other.xLlamaStackClientVersion && xLlamaStackProviderData == other.xLlamaStackProviderData && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(xLlamaStackClientVersion, xLlamaStackProviderData, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "InferenceCompletionParams{xLlamaStackClientVersion=$xLlamaStackClientVersion, xLlamaStackProviderData=$xLlamaStackProviderData, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
