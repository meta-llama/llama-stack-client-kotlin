// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
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
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import com.llama.llamastack.models.*
import java.util.Objects

class BatchInferenceCompletionParams
constructor(
    private val contentBatch: List<ContentBatch>,
    private val model: String,
    private val logprobs: Logprobs?,
    private val samplingParams: SamplingParams?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun contentBatch(): List<ContentBatch> = contentBatch

    fun model(): String = model

    fun logprobs(): Logprobs? = logprobs

    fun samplingParams(): SamplingParams? = samplingParams

    internal fun getBody(): BatchInferenceCompletionBody {
        return BatchInferenceCompletionBody(
            contentBatch,
            model,
            logprobs,
            samplingParams,
            additionalBodyProperties,
        )
    }

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = BatchInferenceCompletionBody.Builder::class)
    @NoAutoDetect
    class BatchInferenceCompletionBody
    internal constructor(
        private val contentBatch: List<ContentBatch>?,
        private val model: String?,
        private val logprobs: Logprobs?,
        private val samplingParams: SamplingParams?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("content_batch") fun contentBatch(): List<ContentBatch>? = contentBatch

        @JsonProperty("model") fun model(): String? = model

        @JsonProperty("logprobs") fun logprobs(): Logprobs? = logprobs

        @JsonProperty("sampling_params") fun samplingParams(): SamplingParams? = samplingParams

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var contentBatch: List<ContentBatch>? = null
            private var model: String? = null
            private var logprobs: Logprobs? = null
            private var samplingParams: SamplingParams? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(batchInferenceCompletionBody: BatchInferenceCompletionBody) = apply {
                this.contentBatch = batchInferenceCompletionBody.contentBatch
                this.model = batchInferenceCompletionBody.model
                this.logprobs = batchInferenceCompletionBody.logprobs
                this.samplingParams = batchInferenceCompletionBody.samplingParams
                additionalProperties(batchInferenceCompletionBody.additionalProperties)
            }

            @JsonProperty("content_batch")
            fun contentBatch(contentBatch: List<ContentBatch>) = apply {
                this.contentBatch = contentBatch
            }

            @JsonProperty("model") fun model(model: String) = apply { this.model = model }

            @JsonProperty("logprobs")
            fun logprobs(logprobs: Logprobs) = apply { this.logprobs = logprobs }

            @JsonProperty("sampling_params")
            fun samplingParams(samplingParams: SamplingParams) = apply {
                this.samplingParams = samplingParams
            }

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

            fun build(): BatchInferenceCompletionBody =
                BatchInferenceCompletionBody(
                    checkNotNull(contentBatch) { "`contentBatch` is required but was not set" }
                        .toImmutable(),
                    checkNotNull(model) { "`model` is required but was not set" },
                    logprobs,
                    samplingParams,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BatchInferenceCompletionBody && this.contentBatch == other.contentBatch && this.model == other.model && this.logprobs == other.logprobs && this.samplingParams == other.samplingParams && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(contentBatch, model, logprobs, samplingParams, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "BatchInferenceCompletionBody{contentBatch=$contentBatch, model=$model, logprobs=$logprobs, samplingParams=$samplingParams, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BatchInferenceCompletionParams && this.contentBatch == other.contentBatch && this.model == other.model && this.logprobs == other.logprobs && this.samplingParams == other.samplingParams && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(contentBatch, model, logprobs, samplingParams, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "BatchInferenceCompletionParams{contentBatch=$contentBatch, model=$model, logprobs=$logprobs, samplingParams=$samplingParams, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var contentBatch: MutableList<ContentBatch> = mutableListOf()
        private var model: String? = null
        private var logprobs: Logprobs? = null
        private var samplingParams: SamplingParams? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(batchInferenceCompletionParams: BatchInferenceCompletionParams) = apply {
            this.contentBatch(batchInferenceCompletionParams.contentBatch)
            this.model = batchInferenceCompletionParams.model
            this.logprobs = batchInferenceCompletionParams.logprobs
            this.samplingParams = batchInferenceCompletionParams.samplingParams
            additionalHeaders(batchInferenceCompletionParams.additionalHeaders)
            additionalQueryParams(batchInferenceCompletionParams.additionalQueryParams)
            additionalBodyProperties(batchInferenceCompletionParams.additionalBodyProperties)
        }

        fun contentBatch(contentBatch: List<ContentBatch>) = apply {
            this.contentBatch.clear()
            this.contentBatch.addAll(contentBatch)
        }

        fun addContentBatch(contentBatch: ContentBatch) = apply {
            this.contentBatch.add(contentBatch)
        }

        fun model(model: String) = apply { this.model = model }

        fun logprobs(logprobs: Logprobs) = apply { this.logprobs = logprobs }

        fun samplingParams(samplingParams: SamplingParams) = apply {
            this.samplingParams = samplingParams
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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): BatchInferenceCompletionParams =
            BatchInferenceCompletionParams(
                checkNotNull(contentBatch) { "`contentBatch` is required but was not set" }
                    .toImmutable(),
                checkNotNull(model) { "`model` is required but was not set" },
                logprobs,
                samplingParams,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    @JsonDeserialize(using = ContentBatch.Deserializer::class)
    @JsonSerialize(using = ContentBatch.Serializer::class)
    class ContentBatch
    private constructor(
        private val string: String? = null,
        private val imageMedia: ImageMedia? = null,
        private val imageMediaArray: List<StringOrImageMediaUnion>? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun string(): String? = string

        fun imageMedia(): ImageMedia? = imageMedia

        fun imageMediaArray(): List<StringOrImageMediaUnion>? = imageMediaArray

        fun isString(): Boolean = string != null

        fun isImageMedia(): Boolean = imageMedia != null

        fun isImageMediaArray(): Boolean = imageMediaArray != null

        fun asString(): String = string.getOrThrow("string")

        fun asImageMedia(): ImageMedia = imageMedia.getOrThrow("imageMedia")

        fun asImageMediaArray(): List<StringOrImageMediaUnion> =
            imageMediaArray.getOrThrow("imageMediaArray")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                string != null -> visitor.visitString(string)
                imageMedia != null -> visitor.visitImageMedia(imageMedia)
                imageMediaArray != null -> visitor.visitImageMediaArray(imageMediaArray)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): ContentBatch = apply {
            if (!validated) {
                if (string == null && imageMedia == null && imageMediaArray == null) {
                    throw LlamaStackClientInvalidDataException("Unknown ContentBatch: $_json")
                }
                imageMedia?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ContentBatch && this.string == other.string && this.imageMedia == other.imageMedia && this.imageMediaArray == other.imageMediaArray /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(string, imageMedia, imageMediaArray) /* spotless:on */
        }

        override fun toString(): String {
            return when {
                string != null -> "ContentBatch{string=$string}"
                imageMedia != null -> "ContentBatch{imageMedia=$imageMedia}"
                imageMediaArray != null -> "ContentBatch{imageMediaArray=$imageMediaArray}"
                _json != null -> "ContentBatch{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid ContentBatch")
            }
        }

        companion object {

            fun ofString(string: String) = ContentBatch(string = string)

            fun ofImageMedia(imageMedia: ImageMedia) = ContentBatch(imageMedia = imageMedia)

            fun ofImageMediaArray(imageMediaArray: List<StringOrImageMediaUnion>) =
                ContentBatch(imageMediaArray = imageMediaArray)
        }

        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitImageMedia(imageMedia: ImageMedia): T

            fun visitImageMediaArray(imageMediaArray: List<StringOrImageMediaUnion>): T

            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown ContentBatch: $json")
            }
        }

        class Deserializer : BaseDeserializer<ContentBatch>(ContentBatch::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): ContentBatch {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                    return ContentBatch(string = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<ImageMedia>()) { it.validate() }
                    ?.let {
                        return ContentBatch(imageMedia = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<List<StringOrImageMediaUnion>>())?.let {
                    return ContentBatch(imageMediaArray = it, _json = json)
                }

                return ContentBatch(_json = json)
            }
        }

        class Serializer : BaseSerializer<ContentBatch>(ContentBatch::class) {

            override fun serialize(
                value: ContentBatch,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.imageMedia != null -> generator.writeObject(value.imageMedia)
                    value.imageMediaArray != null -> generator.writeObject(value.imageMediaArray)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid ContentBatch")
                }
            }
        }

        @JsonDeserialize(using = StringOrImageMediaUnion.Deserializer::class)
        @JsonSerialize(using = StringOrImageMediaUnion.Serializer::class)
        class StringOrImageMediaUnion
        private constructor(
            private val string: String? = null,
            private val imageMedia: ImageMedia? = null,
            private val _json: JsonValue? = null,
        ) {

            private var validated: Boolean = false

            fun string(): String? = string

            fun imageMedia(): ImageMedia? = imageMedia

            fun isString(): Boolean = string != null

            fun isImageMedia(): Boolean = imageMedia != null

            fun asString(): String = string.getOrThrow("string")

            fun asImageMedia(): ImageMedia = imageMedia.getOrThrow("imageMedia")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    string != null -> visitor.visitString(string)
                    imageMedia != null -> visitor.visitImageMedia(imageMedia)
                    else -> visitor.unknown(_json)
                }
            }

            fun validate(): StringOrImageMediaUnion = apply {
                if (!validated) {
                    if (string == null && imageMedia == null) {
                        throw LlamaStackClientInvalidDataException(
                            "Unknown StringOrImageMediaUnion: $_json"
                        )
                    }
                    imageMedia?.validate()
                    validated = true
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is StringOrImageMediaUnion && this.string == other.string && this.imageMedia == other.imageMedia /* spotless:on */
            }

            override fun hashCode(): Int {
                return /* spotless:off */ Objects.hash(string, imageMedia) /* spotless:on */
            }

            override fun toString(): String {
                return when {
                    string != null -> "StringOrImageMediaUnion{string=$string}"
                    imageMedia != null -> "StringOrImageMediaUnion{imageMedia=$imageMedia}"
                    _json != null -> "StringOrImageMediaUnion{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid StringOrImageMediaUnion")
                }
            }

            companion object {

                fun ofString(string: String) = StringOrImageMediaUnion(string = string)

                fun ofImageMedia(imageMedia: ImageMedia) =
                    StringOrImageMediaUnion(imageMedia = imageMedia)
            }

            interface Visitor<out T> {

                fun visitString(string: String): T

                fun visitImageMedia(imageMedia: ImageMedia): T

                fun unknown(json: JsonValue?): T {
                    throw LlamaStackClientInvalidDataException(
                        "Unknown StringOrImageMediaUnion: $json"
                    )
                }
            }

            class Deserializer :
                BaseDeserializer<StringOrImageMediaUnion>(StringOrImageMediaUnion::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): StringOrImageMediaUnion {
                    val json = JsonValue.fromJsonNode(node)

                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                        return StringOrImageMediaUnion(string = it, _json = json)
                    }
                    tryDeserialize(node, jacksonTypeRef<ImageMedia>()) { it.validate() }
                        ?.let {
                            return StringOrImageMediaUnion(imageMedia = it, _json = json)
                        }

                    return StringOrImageMediaUnion(_json = json)
                }
            }

            class Serializer :
                BaseSerializer<StringOrImageMediaUnion>(StringOrImageMediaUnion::class) {

                override fun serialize(
                    value: StringOrImageMediaUnion,
                    generator: JsonGenerator,
                    provider: SerializerProvider
                ) {
                    when {
                        value.string != null -> generator.writeObject(value.string)
                        value.imageMedia != null -> generator.writeObject(value.imageMedia)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid StringOrImageMediaUnion")
                    }
                }
            }
        }
    }

    @JsonDeserialize(builder = Logprobs.Builder::class)
    @NoAutoDetect
    class Logprobs
    private constructor(
        private val topK: Long?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("top_k") fun topK(): Long? = topK

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var topK: Long? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(logprobs: Logprobs) = apply {
                this.topK = logprobs.topK
                additionalProperties(logprobs.additionalProperties)
            }

            @JsonProperty("top_k") fun topK(topK: Long) = apply { this.topK = topK }

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

            fun build(): Logprobs = Logprobs(topK, additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Logprobs && this.topK == other.topK && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(topK, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "Logprobs{topK=$topK, additionalProperties=$additionalProperties}"
    }
}
