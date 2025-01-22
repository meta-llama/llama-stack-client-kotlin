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

class BatchInferenceCompletionParams
constructor(
    private val xLlamaStackClientVersion: String?,
    private val xLlamaStackProviderData: String?,
    private val body: BatchInferenceCompletionBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun xLlamaStackClientVersion(): String? = xLlamaStackClientVersion

    fun xLlamaStackProviderData(): String? = xLlamaStackProviderData

    fun contentBatch(): List<InterleavedContent> = body.contentBatch()

    fun model(): String = body.model()

    fun logprobs(): Logprobs? = body.logprobs()

    fun samplingParams(): SamplingParams? = body.samplingParams()

    fun _contentBatch(): JsonField<List<InterleavedContent>> = body._contentBatch()

    fun _model(): JsonField<String> = body._model()

    fun _logprobs(): JsonField<Logprobs> = body._logprobs()

    fun _samplingParams(): JsonField<SamplingParams> = body._samplingParams()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getBody(): BatchInferenceCompletionBody = body

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
    class BatchInferenceCompletionBody
    @JsonCreator
    internal constructor(
        @JsonProperty("content_batch")
        @ExcludeMissing
        private val contentBatch: JsonField<List<InterleavedContent>> = JsonMissing.of(),
        @JsonProperty("model")
        @ExcludeMissing
        private val model: JsonField<String> = JsonMissing.of(),
        @JsonProperty("logprobs")
        @ExcludeMissing
        private val logprobs: JsonField<Logprobs> = JsonMissing.of(),
        @JsonProperty("sampling_params")
        @ExcludeMissing
        private val samplingParams: JsonField<SamplingParams> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun contentBatch(): List<InterleavedContent> = contentBatch.getRequired("content_batch")

        fun model(): String = model.getRequired("model")

        fun logprobs(): Logprobs? = logprobs.getNullable("logprobs")

        fun samplingParams(): SamplingParams? = samplingParams.getNullable("sampling_params")

        @JsonProperty("content_batch")
        @ExcludeMissing
        fun _contentBatch(): JsonField<List<InterleavedContent>> = contentBatch

        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

        @JsonProperty("logprobs") @ExcludeMissing fun _logprobs(): JsonField<Logprobs> = logprobs

        @JsonProperty("sampling_params")
        @ExcludeMissing
        fun _samplingParams(): JsonField<SamplingParams> = samplingParams

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): BatchInferenceCompletionBody = apply {
            if (validated) {
                return@apply
            }

            contentBatch().forEach { it.validate() }
            model()
            logprobs()?.validate()
            samplingParams()?.validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var contentBatch: JsonField<MutableList<InterleavedContent>>? = null
            private var model: JsonField<String>? = null
            private var logprobs: JsonField<Logprobs> = JsonMissing.of()
            private var samplingParams: JsonField<SamplingParams> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(batchInferenceCompletionBody: BatchInferenceCompletionBody) = apply {
                contentBatch = batchInferenceCompletionBody.contentBatch.map { it.toMutableList() }
                model = batchInferenceCompletionBody.model
                logprobs = batchInferenceCompletionBody.logprobs
                samplingParams = batchInferenceCompletionBody.samplingParams
                additionalProperties =
                    batchInferenceCompletionBody.additionalProperties.toMutableMap()
            }

            fun contentBatch(contentBatch: List<InterleavedContent>) =
                contentBatch(JsonField.of(contentBatch))

            fun contentBatch(contentBatch: JsonField<List<InterleavedContent>>) = apply {
                this.contentBatch = contentBatch.map { it.toMutableList() }
            }

            fun addContentBatch(contentBatch: InterleavedContent) = apply {
                this.contentBatch =
                    (this.contentBatch ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(contentBatch)
                    }
            }

            fun addContentBatch(string: String) =
                addContentBatch(InterleavedContent.ofString(string))

            fun addContentBatch(imageContentItem: InterleavedContent.ImageContentItem) =
                addContentBatch(InterleavedContent.ofImageContentItem(imageContentItem))

            fun addContentBatch(textContentItem: InterleavedContent.TextContentItem) =
                addContentBatch(InterleavedContent.ofTextContentItem(textContentItem))

            fun addContentBatchOfInterleavedContentItems(
                interleavedContentItems: List<InterleavedContentItem>
            ) =
                addContentBatch(
                    InterleavedContent.ofInterleavedContentItems(interleavedContentItems)
                )

            fun model(model: String) = model(JsonField.of(model))

            fun model(model: JsonField<String>) = apply { this.model = model }

            fun logprobs(logprobs: Logprobs) = logprobs(JsonField.of(logprobs))

            fun logprobs(logprobs: JsonField<Logprobs>) = apply { this.logprobs = logprobs }

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

            fun build(): BatchInferenceCompletionBody =
                BatchInferenceCompletionBody(
                    checkRequired("contentBatch", contentBatch).map { it.toImmutable() },
                    checkRequired("model", model),
                    logprobs,
                    samplingParams,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BatchInferenceCompletionBody && contentBatch == other.contentBatch && model == other.model && logprobs == other.logprobs && samplingParams == other.samplingParams && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(contentBatch, model, logprobs, samplingParams, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BatchInferenceCompletionBody{contentBatch=$contentBatch, model=$model, logprobs=$logprobs, samplingParams=$samplingParams, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var xLlamaStackClientVersion: String? = null
        private var xLlamaStackProviderData: String? = null
        private var body: BatchInferenceCompletionBody.Builder =
            BatchInferenceCompletionBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(batchInferenceCompletionParams: BatchInferenceCompletionParams) = apply {
            xLlamaStackClientVersion = batchInferenceCompletionParams.xLlamaStackClientVersion
            xLlamaStackProviderData = batchInferenceCompletionParams.xLlamaStackProviderData
            body = batchInferenceCompletionParams.body.toBuilder()
            additionalHeaders = batchInferenceCompletionParams.additionalHeaders.toBuilder()
            additionalQueryParams = batchInferenceCompletionParams.additionalQueryParams.toBuilder()
        }

        fun xLlamaStackClientVersion(xLlamaStackClientVersion: String?) = apply {
            this.xLlamaStackClientVersion = xLlamaStackClientVersion
        }

        fun xLlamaStackProviderData(xLlamaStackProviderData: String?) = apply {
            this.xLlamaStackProviderData = xLlamaStackProviderData
        }

        fun contentBatch(contentBatch: List<InterleavedContent>) = apply {
            body.contentBatch(contentBatch)
        }

        fun contentBatch(contentBatch: JsonField<List<InterleavedContent>>) = apply {
            body.contentBatch(contentBatch)
        }

        fun addContentBatch(contentBatch: InterleavedContent) = apply {
            body.addContentBatch(contentBatch)
        }

        fun addContentBatch(string: String) = apply { body.addContentBatch(string) }

        fun addContentBatch(imageContentItem: InterleavedContent.ImageContentItem) = apply {
            body.addContentBatch(imageContentItem)
        }

        fun addContentBatch(textContentItem: InterleavedContent.TextContentItem) = apply {
            body.addContentBatch(textContentItem)
        }

        fun addContentBatchOfInterleavedContentItems(
            interleavedContentItems: List<InterleavedContentItem>
        ) = apply { body.addContentBatchOfInterleavedContentItems(interleavedContentItems) }

        fun model(model: String) = apply { body.model(model) }

        fun model(model: JsonField<String>) = apply { body.model(model) }

        fun logprobs(logprobs: Logprobs) = apply { body.logprobs(logprobs) }

        fun logprobs(logprobs: JsonField<Logprobs>) = apply { body.logprobs(logprobs) }

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

        fun build(): BatchInferenceCompletionParams =
            BatchInferenceCompletionParams(
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BatchInferenceCompletionParams && xLlamaStackClientVersion == other.xLlamaStackClientVersion && xLlamaStackProviderData == other.xLlamaStackProviderData && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(xLlamaStackClientVersion, xLlamaStackProviderData, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "BatchInferenceCompletionParams{xLlamaStackClientVersion=$xLlamaStackClientVersion, xLlamaStackProviderData=$xLlamaStackProviderData, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
