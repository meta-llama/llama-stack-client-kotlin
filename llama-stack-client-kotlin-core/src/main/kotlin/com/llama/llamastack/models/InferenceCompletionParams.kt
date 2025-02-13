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

/** Generate a completion for the given content using the specified model. */
class InferenceCompletionParams
private constructor(
    private val body: InferenceCompletionBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The content to generate a completion for */
    fun content(): InterleavedContent = body.content()

    /**
     * The identifier of the model to use. The model must be registered with Llama Stack and
     * available via the /models endpoint.
     */
    fun modelId(): String = body.modelId()

    /** (Optional) If specified, log probabilities for each token position will be returned. */
    fun logprobs(): Logprobs? = body.logprobs()

    /** (Optional) Grammar specification for guided (structured) decoding */
    fun responseFormat(): ResponseFormat? = body.responseFormat()

    /** (Optional) Parameters to control the sampling strategy */
    fun samplingParams(): SamplingParams? = body.samplingParams()

    /** The content to generate a completion for */
    fun _content(): JsonField<InterleavedContent> = body._content()

    /**
     * The identifier of the model to use. The model must be registered with Llama Stack and
     * available via the /models endpoint.
     */
    fun _modelId(): JsonField<String> = body._modelId()

    /** (Optional) If specified, log probabilities for each token position will be returned. */
    fun _logprobs(): JsonField<Logprobs> = body._logprobs()

    /** (Optional) Grammar specification for guided (structured) decoding */
    fun _responseFormat(): JsonField<ResponseFormat> = body._responseFormat()

    /** (Optional) Parameters to control the sampling strategy */
    fun _samplingParams(): JsonField<SamplingParams> = body._samplingParams()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): InferenceCompletionBody = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

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

        /** The content to generate a completion for */
        fun content(): InterleavedContent = content.getRequired("content")

        /**
         * The identifier of the model to use. The model must be registered with Llama Stack and
         * available via the /models endpoint.
         */
        fun modelId(): String = modelId.getRequired("model_id")

        /** (Optional) If specified, log probabilities for each token position will be returned. */
        fun logprobs(): Logprobs? = logprobs.getNullable("logprobs")

        /** (Optional) Grammar specification for guided (structured) decoding */
        fun responseFormat(): ResponseFormat? = responseFormat.getNullable("response_format")

        /** (Optional) Parameters to control the sampling strategy */
        fun samplingParams(): SamplingParams? = samplingParams.getNullable("sampling_params")

        /** The content to generate a completion for */
        @JsonProperty("content")
        @ExcludeMissing
        fun _content(): JsonField<InterleavedContent> = content

        /**
         * The identifier of the model to use. The model must be registered with Llama Stack and
         * available via the /models endpoint.
         */
        @JsonProperty("model_id") @ExcludeMissing fun _modelId(): JsonField<String> = modelId

        /** (Optional) If specified, log probabilities for each token position will be returned. */
        @JsonProperty("logprobs") @ExcludeMissing fun _logprobs(): JsonField<Logprobs> = logprobs

        /** (Optional) Grammar specification for guided (structured) decoding */
        @JsonProperty("response_format")
        @ExcludeMissing
        fun _responseFormat(): JsonField<ResponseFormat> = responseFormat

        /** (Optional) Parameters to control the sampling strategy */
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

        /** A builder for [InferenceCompletionBody]. */
        class Builder internal constructor() {

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

            /** The content to generate a completion for */
            fun content(content: InterleavedContent) = content(JsonField.of(content))

            /** The content to generate a completion for */
            fun content(content: JsonField<InterleavedContent>) = apply { this.content = content }

            /** The content to generate a completion for */
            fun content(string: String) = content(InterleavedContent.ofString(string))

            /** A image content item */
            fun content(imageContentItem: InterleavedContent.ImageContentItem) =
                content(InterleavedContent.ofImageContentItem(imageContentItem))

            /** A text content item */
            fun content(textContentItem: InterleavedContent.TextContentItem) =
                content(InterleavedContent.ofTextContentItem(textContentItem))

            /** The content to generate a completion for */
            fun contentOfItems(items: List<InterleavedContentItem>) =
                content(InterleavedContent.ofItems(items))

            /**
             * The identifier of the model to use. The model must be registered with Llama Stack and
             * available via the /models endpoint.
             */
            fun modelId(modelId: String) = modelId(JsonField.of(modelId))

            /**
             * The identifier of the model to use. The model must be registered with Llama Stack and
             * available via the /models endpoint.
             */
            fun modelId(modelId: JsonField<String>) = apply { this.modelId = modelId }

            /**
             * (Optional) If specified, log probabilities for each token position will be returned.
             */
            fun logprobs(logprobs: Logprobs) = logprobs(JsonField.of(logprobs))

            /**
             * (Optional) If specified, log probabilities for each token position will be returned.
             */
            fun logprobs(logprobs: JsonField<Logprobs>) = apply { this.logprobs = logprobs }

            /** (Optional) Grammar specification for guided (structured) decoding */
            fun responseFormat(responseFormat: ResponseFormat) =
                responseFormat(JsonField.of(responseFormat))

            /** (Optional) Grammar specification for guided (structured) decoding */
            fun responseFormat(responseFormat: JsonField<ResponseFormat>) = apply {
                this.responseFormat = responseFormat
            }

            /** Configuration for JSON schema-guided response generation. */
            fun responseFormat(jsonSchema: ResponseFormat.JsonSchemaResponseFormat) =
                responseFormat(ResponseFormat.ofJsonSchema(jsonSchema))

            /** Configuration for JSON schema-guided response generation. */
            fun jsonSchemaResponseFormat(
                jsonSchema: ResponseFormat.JsonSchemaResponseFormat.JsonSchema
            ) =
                responseFormat(
                    ResponseFormat.JsonSchemaResponseFormat.builder().jsonSchema(jsonSchema).build()
                )

            /** Configuration for grammar-guided response generation. */
            fun responseFormat(grammar: ResponseFormat.GrammarResponseFormat) =
                responseFormat(ResponseFormat.ofGrammar(grammar))

            /** Configuration for grammar-guided response generation. */
            fun grammarResponseFormat(bnf: ResponseFormat.GrammarResponseFormat.Bnf) =
                responseFormat(ResponseFormat.GrammarResponseFormat.builder().bnf(bnf).build())

            /** (Optional) Parameters to control the sampling strategy */
            fun samplingParams(samplingParams: SamplingParams) =
                samplingParams(JsonField.of(samplingParams))

            /** (Optional) Parameters to control the sampling strategy */
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

    /** A builder for [InferenceCompletionParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: InferenceCompletionBody.Builder = InferenceCompletionBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(inferenceCompletionParams: InferenceCompletionParams) = apply {
            body = inferenceCompletionParams.body.toBuilder()
            additionalHeaders = inferenceCompletionParams.additionalHeaders.toBuilder()
            additionalQueryParams = inferenceCompletionParams.additionalQueryParams.toBuilder()
        }

        /** The content to generate a completion for */
        fun content(content: InterleavedContent) = apply { body.content(content) }

        /** The content to generate a completion for */
        fun content(content: JsonField<InterleavedContent>) = apply { body.content(content) }

        /** The content to generate a completion for */
        fun content(string: String) = apply { body.content(string) }

        /** A image content item */
        fun content(imageContentItem: InterleavedContent.ImageContentItem) = apply {
            body.content(imageContentItem)
        }

        /** A text content item */
        fun content(textContentItem: InterleavedContent.TextContentItem) = apply {
            body.content(textContentItem)
        }

        /** The content to generate a completion for */
        fun contentOfItems(items: List<InterleavedContentItem>) = apply {
            body.contentOfItems(items)
        }

        /**
         * The identifier of the model to use. The model must be registered with Llama Stack and
         * available via the /models endpoint.
         */
        fun modelId(modelId: String) = apply { body.modelId(modelId) }

        /**
         * The identifier of the model to use. The model must be registered with Llama Stack and
         * available via the /models endpoint.
         */
        fun modelId(modelId: JsonField<String>) = apply { body.modelId(modelId) }

        /** (Optional) If specified, log probabilities for each token position will be returned. */
        fun logprobs(logprobs: Logprobs) = apply { body.logprobs(logprobs) }

        /** (Optional) If specified, log probabilities for each token position will be returned. */
        fun logprobs(logprobs: JsonField<Logprobs>) = apply { body.logprobs(logprobs) }

        /** (Optional) Grammar specification for guided (structured) decoding */
        fun responseFormat(responseFormat: ResponseFormat) = apply {
            body.responseFormat(responseFormat)
        }

        /** (Optional) Grammar specification for guided (structured) decoding */
        fun responseFormat(responseFormat: JsonField<ResponseFormat>) = apply {
            body.responseFormat(responseFormat)
        }

        /** Configuration for JSON schema-guided response generation. */
        fun responseFormat(jsonSchema: ResponseFormat.JsonSchemaResponseFormat) = apply {
            body.responseFormat(jsonSchema)
        }

        /** Configuration for JSON schema-guided response generation. */
        fun jsonSchemaResponseFormat(
            jsonSchema: ResponseFormat.JsonSchemaResponseFormat.JsonSchema
        ) = apply { body.jsonSchemaResponseFormat(jsonSchema) }

        /** Configuration for grammar-guided response generation. */
        fun responseFormat(grammar: ResponseFormat.GrammarResponseFormat) = apply {
            body.responseFormat(grammar)
        }

        /** Configuration for grammar-guided response generation. */
        fun grammarResponseFormat(bnf: ResponseFormat.GrammarResponseFormat.Bnf) = apply {
            body.grammarResponseFormat(bnf)
        }

        /** (Optional) Parameters to control the sampling strategy */
        fun samplingParams(samplingParams: SamplingParams) = apply {
            body.samplingParams(samplingParams)
        }

        /** (Optional) Parameters to control the sampling strategy */
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
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** (Optional) If specified, log probabilities for each token position will be returned. */
    @NoAutoDetect
    class Logprobs
    @JsonCreator
    private constructor(
        @JsonProperty("top_k") @ExcludeMissing private val topK: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** How many tokens (for each position) to return log probabilities for. */
        fun topK(): Long? = topK.getNullable("top_k")

        /** How many tokens (for each position) to return log probabilities for. */
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

        /** A builder for [Logprobs]. */
        class Builder internal constructor() {

            private var topK: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(logprobs: Logprobs) = apply {
                topK = logprobs.topK
                additionalProperties = logprobs.additionalProperties.toMutableMap()
            }

            /** How many tokens (for each position) to return log probabilities for. */
            fun topK(topK: Long) = topK(JsonField.of(topK))

            /** How many tokens (for each position) to return log probabilities for. */
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

        return /* spotless:off */ other is InferenceCompletionParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "InferenceCompletionParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
