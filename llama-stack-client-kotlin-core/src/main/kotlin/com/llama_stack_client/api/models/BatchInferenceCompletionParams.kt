// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

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
import com.llama_stack_client.api.core.BaseDeserializer
import com.llama_stack_client.api.core.BaseSerializer
import com.llama_stack_client.api.core.ExcludeMissing
import com.llama_stack_client.api.core.JsonValue
import com.llama_stack_client.api.core.NoAutoDetect
import com.llama_stack_client.api.core.getOrThrow
import com.llama_stack_client.api.core.toUnmodifiable
import com.llama_stack_client.api.errors.LlamaStackClientInvalidDataException
import com.llama_stack_client.api.models.*
import java.util.Objects

class BatchInferenceCompletionParams
constructor(
    private val contentBatch: List<ContentBatch>,
    private val model: String,
    private val logprobs: Logprobs?,
    private val samplingParams: SamplingParams?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
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

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

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

        private var hashCode: Int = 0

        @JsonProperty("content_batch") fun contentBatch(): List<ContentBatch>? = contentBatch

        @JsonProperty("model") fun model(): String? = model

        @JsonProperty("logprobs") fun logprobs(): Logprobs? = logprobs

        @JsonProperty("sampling_params") fun samplingParams(): SamplingParams? = samplingParams

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BatchInferenceCompletionBody &&
                this.contentBatch == other.contentBatch &&
                this.model == other.model &&
                this.logprobs == other.logprobs &&
                this.samplingParams == other.samplingParams &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        contentBatch,
                        model,
                        logprobs,
                        samplingParams,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "BatchInferenceCompletionBody{contentBatch=$contentBatch, model=$model, logprobs=$logprobs, samplingParams=$samplingParams, additionalProperties=$additionalProperties}"

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
                        .toUnmodifiable(),
                    checkNotNull(model) { "`model` is required but was not set" },
                    logprobs,
                    samplingParams,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BatchInferenceCompletionParams &&
            this.contentBatch == other.contentBatch &&
            this.model == other.model &&
            this.logprobs == other.logprobs &&
            this.samplingParams == other.samplingParams &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            contentBatch,
            model,
            logprobs,
            samplingParams,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "BatchInferenceCompletionParams{contentBatch=$contentBatch, model=$model, logprobs=$logprobs, samplingParams=$samplingParams, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

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
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(batchInferenceCompletionParams: BatchInferenceCompletionParams) = apply {
            this.contentBatch(batchInferenceCompletionParams.contentBatch)
            this.model = batchInferenceCompletionParams.model
            this.logprobs = batchInferenceCompletionParams.logprobs
            this.samplingParams = batchInferenceCompletionParams.samplingParams
            additionalQueryParams(batchInferenceCompletionParams.additionalQueryParams)
            additionalHeaders(batchInferenceCompletionParams.additionalHeaders)
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

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): BatchInferenceCompletionParams =
            BatchInferenceCompletionParams(
                checkNotNull(contentBatch) { "`contentBatch` is required but was not set" }
                    .toUnmodifiable(),
                checkNotNull(model) { "`model` is required but was not set" },
                logprobs,
                samplingParams,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(using = ContentBatch.Deserializer::class)
    @JsonSerialize(using = ContentBatch.Serializer::class)
    class ContentBatch
    private constructor(
        private val string: String? = null,
        private val strings: List<String>? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun string(): String? = string

        fun strings(): List<String>? = strings

        fun isString(): Boolean = string != null

        fun isStrings(): Boolean = strings != null

        fun asString(): String = string.getOrThrow("string")

        fun asStrings(): List<String> = strings.getOrThrow("strings")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                string != null -> visitor.visitString(string)
                strings != null -> visitor.visitStrings(strings)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): ContentBatch = apply {
            if (!validated) {
                if (string == null && strings == null) {
                    throw LlamaStackClientInvalidDataException("Unknown ContentBatch: $_json")
                }
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ContentBatch &&
                this.string == other.string &&
                this.strings == other.strings
        }

        override fun hashCode(): Int {
            return Objects.hash(string, strings)
        }

        override fun toString(): String {
            return when {
                string != null -> "ContentBatch{string=$string}"
                strings != null -> "ContentBatch{strings=$strings}"
                _json != null -> "ContentBatch{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid ContentBatch")
            }
        }

        companion object {

            fun ofString(string: String) = ContentBatch(string = string)

            fun ofStrings(strings: List<String>) = ContentBatch(strings = strings)
        }

        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitStrings(strings: List<String>): T

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
                tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                    return ContentBatch(strings = it, _json = json)
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
                    value.strings != null -> generator.writeObject(value.strings)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid ContentBatch")
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

        private var hashCode: Int = 0

        @JsonProperty("top_k") fun topK(): Long? = topK

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Logprobs &&
                this.topK == other.topK &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(topK, additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "Logprobs{topK=$topK, additionalProperties=$additionalProperties}"

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

            fun build(): Logprobs = Logprobs(topK, additionalProperties.toUnmodifiable())
        }
    }
}
