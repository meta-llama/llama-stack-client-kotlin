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
import com.llama.llamastack.core.checkKnown
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

class BatchInferenceCompletionParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contentBatch(): List<InterleavedContent> = body.contentBatch()

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun model(): String = body.model()

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun logprobs(): Logprobs? = body.logprobs()

    /**
     * Configuration for JSON schema-guided response generation.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun responseFormat(): ResponseFormat? = body.responseFormat()

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun samplingParams(): SamplingParams? = body.samplingParams()

    /**
     * Returns the raw JSON value of [contentBatch].
     *
     * Unlike [contentBatch], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _contentBatch(): JsonField<List<InterleavedContent>> = body._contentBatch()

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _model(): JsonField<String> = body._model()

    /**
     * Returns the raw JSON value of [logprobs].
     *
     * Unlike [logprobs], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _logprobs(): JsonField<Logprobs> = body._logprobs()

    /**
     * Returns the raw JSON value of [responseFormat].
     *
     * Unlike [responseFormat], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _responseFormat(): JsonField<ResponseFormat> = body._responseFormat()

    /**
     * Returns the raw JSON value of [samplingParams].
     *
     * Unlike [samplingParams], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _samplingParams(): JsonField<SamplingParams> = body._samplingParams()

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
        @JsonProperty("content_batch")
        @ExcludeMissing
        private val contentBatch: JsonField<List<InterleavedContent>> = JsonMissing.of(),
        @JsonProperty("model")
        @ExcludeMissing
        private val model: JsonField<String> = JsonMissing.of(),
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

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun contentBatch(): List<InterleavedContent> = contentBatch.getRequired("content_batch")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun model(): String = model.getRequired("model")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun logprobs(): Logprobs? = logprobs.getNullable("logprobs")

        /**
         * Configuration for JSON schema-guided response generation.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun responseFormat(): ResponseFormat? = responseFormat.getNullable("response_format")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun samplingParams(): SamplingParams? = samplingParams.getNullable("sampling_params")

        /**
         * Returns the raw JSON value of [contentBatch].
         *
         * Unlike [contentBatch], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("content_batch")
        @ExcludeMissing
        fun _contentBatch(): JsonField<List<InterleavedContent>> = contentBatch

        /**
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

        /**
         * Returns the raw JSON value of [logprobs].
         *
         * Unlike [logprobs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("logprobs") @ExcludeMissing fun _logprobs(): JsonField<Logprobs> = logprobs

        /**
         * Returns the raw JSON value of [responseFormat].
         *
         * Unlike [responseFormat], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("response_format")
        @ExcludeMissing
        fun _responseFormat(): JsonField<ResponseFormat> = responseFormat

        /**
         * Returns the raw JSON value of [samplingParams].
         *
         * Unlike [samplingParams], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sampling_params")
        @ExcludeMissing
        fun _samplingParams(): JsonField<SamplingParams> = samplingParams

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            contentBatch().forEach { it.validate() }
            model()
            logprobs()?.validate()
            responseFormat()?.validate()
            samplingParams()?.validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .contentBatch()
             * .model()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var contentBatch: JsonField<MutableList<InterleavedContent>>? = null
            private var model: JsonField<String>? = null
            private var logprobs: JsonField<Logprobs> = JsonMissing.of()
            private var responseFormat: JsonField<ResponseFormat> = JsonMissing.of()
            private var samplingParams: JsonField<SamplingParams> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                contentBatch = body.contentBatch.map { it.toMutableList() }
                model = body.model
                logprobs = body.logprobs
                responseFormat = body.responseFormat
                samplingParams = body.samplingParams
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun contentBatch(contentBatch: List<InterleavedContent>) =
                contentBatch(JsonField.of(contentBatch))

            /**
             * Sets [Builder.contentBatch] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contentBatch] with a well-typed
             * `List<InterleavedContent>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun contentBatch(contentBatch: JsonField<List<InterleavedContent>>) = apply {
                this.contentBatch = contentBatch.map { it.toMutableList() }
            }

            /**
             * Adds a single [InterleavedContent] to [Builder.contentBatch].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addContentBatch(contentBatch: InterleavedContent) = apply {
                this.contentBatch =
                    (this.contentBatch ?: JsonField.of(mutableListOf())).also {
                        checkKnown("contentBatch", it).add(contentBatch)
                    }
            }

            /** Alias for calling [addContentBatch] with `InterleavedContent.ofString(string)`. */
            fun addContentBatch(string: String) =
                addContentBatch(InterleavedContent.ofString(string))

            /**
             * Alias for calling [addContentBatch] with
             * `InterleavedContent.ofImageContentItem(imageContentItem)`.
             */
            fun addContentBatch(imageContentItem: InterleavedContent.ImageContentItem) =
                addContentBatch(InterleavedContent.ofImageContentItem(imageContentItem))

            /**
             * Alias for calling [addContentBatch] with
             * `InterleavedContent.ofTextContentItem(textContentItem)`.
             */
            fun addContentBatch(textContentItem: InterleavedContent.TextContentItem) =
                addContentBatch(InterleavedContent.ofTextContentItem(textContentItem))

            /** Alias for calling [addContentBatch] with `InterleavedContent.ofItems(items)`. */
            fun addContentBatchOfItems(items: List<InterleavedContentItem>) =
                addContentBatch(InterleavedContent.ofItems(items))

            fun model(model: String) = model(JsonField.of(model))

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun model(model: JsonField<String>) = apply { this.model = model }

            fun logprobs(logprobs: Logprobs) = logprobs(JsonField.of(logprobs))

            /**
             * Sets [Builder.logprobs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.logprobs] with a well-typed [Logprobs] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun logprobs(logprobs: JsonField<Logprobs>) = apply { this.logprobs = logprobs }

            /** Configuration for JSON schema-guided response generation. */
            fun responseFormat(responseFormat: ResponseFormat) =
                responseFormat(JsonField.of(responseFormat))

            /**
             * Sets [Builder.responseFormat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.responseFormat] with a well-typed [ResponseFormat]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun responseFormat(responseFormat: JsonField<ResponseFormat>) = apply {
                this.responseFormat = responseFormat
            }

            /**
             * Alias for calling [responseFormat] with `ResponseFormat.ofJsonSchema(jsonSchema)`.
             */
            fun responseFormat(jsonSchema: ResponseFormat.JsonSchemaResponseFormat) =
                responseFormat(ResponseFormat.ofJsonSchema(jsonSchema))

            /**
             * Alias for calling [responseFormat] with the following:
             * ```kotlin
             * ResponseFormat.JsonSchemaResponseFormat.builder()
             *     .jsonSchema(jsonSchema)
             *     .build()
             * ```
             */
            fun jsonSchemaResponseFormat(
                jsonSchema: ResponseFormat.JsonSchemaResponseFormat.JsonSchema
            ) =
                responseFormat(
                    ResponseFormat.JsonSchemaResponseFormat.builder().jsonSchema(jsonSchema).build()
                )

            /** Alias for calling [responseFormat] with `ResponseFormat.ofGrammar(grammar)`. */
            fun responseFormat(grammar: ResponseFormat.GrammarResponseFormat) =
                responseFormat(ResponseFormat.ofGrammar(grammar))

            /**
             * Alias for calling [responseFormat] with the following:
             * ```kotlin
             * ResponseFormat.GrammarResponseFormat.builder()
             *     .bnf(bnf)
             *     .build()
             * ```
             */
            fun grammarResponseFormat(bnf: ResponseFormat.GrammarResponseFormat.Bnf) =
                responseFormat(ResponseFormat.GrammarResponseFormat.builder().bnf(bnf).build())

            fun samplingParams(samplingParams: SamplingParams) =
                samplingParams(JsonField.of(samplingParams))

            /**
             * Sets [Builder.samplingParams] to an arbitrary JSON value.
             *
             * You should usually call [Builder.samplingParams] with a well-typed [SamplingParams]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
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

            fun build(): Body =
                Body(
                    checkRequired("contentBatch", contentBatch).map { it.toImmutable() },
                    checkRequired("model", model),
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

            return /* spotless:off */ other is Body && contentBatch == other.contentBatch && model == other.model && logprobs == other.logprobs && responseFormat == other.responseFormat && samplingParams == other.samplingParams && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(contentBatch, model, logprobs, responseFormat, samplingParams, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{contentBatch=$contentBatch, model=$model, logprobs=$logprobs, responseFormat=$responseFormat, samplingParams=$samplingParams, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [BatchInferenceCompletionParams].
         *
         * The following fields are required:
         * ```kotlin
         * .contentBatch()
         * .model()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [BatchInferenceCompletionParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(batchInferenceCompletionParams: BatchInferenceCompletionParams) = apply {
            body = batchInferenceCompletionParams.body.toBuilder()
            additionalHeaders = batchInferenceCompletionParams.additionalHeaders.toBuilder()
            additionalQueryParams = batchInferenceCompletionParams.additionalQueryParams.toBuilder()
        }

        fun contentBatch(contentBatch: List<InterleavedContent>) = apply {
            body.contentBatch(contentBatch)
        }

        /**
         * Sets [Builder.contentBatch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contentBatch] with a well-typed
         * `List<InterleavedContent>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun contentBatch(contentBatch: JsonField<List<InterleavedContent>>) = apply {
            body.contentBatch(contentBatch)
        }

        /**
         * Adds a single [InterleavedContent] to [Builder.contentBatch].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addContentBatch(contentBatch: InterleavedContent) = apply {
            body.addContentBatch(contentBatch)
        }

        /** Alias for calling [addContentBatch] with `InterleavedContent.ofString(string)`. */
        fun addContentBatch(string: String) = apply { body.addContentBatch(string) }

        /**
         * Alias for calling [addContentBatch] with
         * `InterleavedContent.ofImageContentItem(imageContentItem)`.
         */
        fun addContentBatch(imageContentItem: InterleavedContent.ImageContentItem) = apply {
            body.addContentBatch(imageContentItem)
        }

        /**
         * Alias for calling [addContentBatch] with
         * `InterleavedContent.ofTextContentItem(textContentItem)`.
         */
        fun addContentBatch(textContentItem: InterleavedContent.TextContentItem) = apply {
            body.addContentBatch(textContentItem)
        }

        /** Alias for calling [addContentBatch] with `InterleavedContent.ofItems(items)`. */
        fun addContentBatchOfItems(items: List<InterleavedContentItem>) = apply {
            body.addContentBatchOfItems(items)
        }

        fun model(model: String) = apply { body.model(model) }

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { body.model(model) }

        fun logprobs(logprobs: Logprobs) = apply { body.logprobs(logprobs) }

        /**
         * Sets [Builder.logprobs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logprobs] with a well-typed [Logprobs] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun logprobs(logprobs: JsonField<Logprobs>) = apply { body.logprobs(logprobs) }

        /** Configuration for JSON schema-guided response generation. */
        fun responseFormat(responseFormat: ResponseFormat) = apply {
            body.responseFormat(responseFormat)
        }

        /**
         * Sets [Builder.responseFormat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.responseFormat] with a well-typed [ResponseFormat] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun responseFormat(responseFormat: JsonField<ResponseFormat>) = apply {
            body.responseFormat(responseFormat)
        }

        /** Alias for calling [responseFormat] with `ResponseFormat.ofJsonSchema(jsonSchema)`. */
        fun responseFormat(jsonSchema: ResponseFormat.JsonSchemaResponseFormat) = apply {
            body.responseFormat(jsonSchema)
        }

        /**
         * Alias for calling [responseFormat] with the following:
         * ```kotlin
         * ResponseFormat.JsonSchemaResponseFormat.builder()
         *     .jsonSchema(jsonSchema)
         *     .build()
         * ```
         */
        fun jsonSchemaResponseFormat(
            jsonSchema: ResponseFormat.JsonSchemaResponseFormat.JsonSchema
        ) = apply { body.jsonSchemaResponseFormat(jsonSchema) }

        /** Alias for calling [responseFormat] with `ResponseFormat.ofGrammar(grammar)`. */
        fun responseFormat(grammar: ResponseFormat.GrammarResponseFormat) = apply {
            body.responseFormat(grammar)
        }

        /**
         * Alias for calling [responseFormat] with the following:
         * ```kotlin
         * ResponseFormat.GrammarResponseFormat.builder()
         *     .bnf(bnf)
         *     .build()
         * ```
         */
        fun grammarResponseFormat(bnf: ResponseFormat.GrammarResponseFormat.Bnf) = apply {
            body.grammarResponseFormat(bnf)
        }

        fun samplingParams(samplingParams: SamplingParams) = apply {
            body.samplingParams(samplingParams)
        }

        /**
         * Sets [Builder.samplingParams] to an arbitrary JSON value.
         *
         * You should usually call [Builder.samplingParams] with a well-typed [SamplingParams] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
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

        /**
         * How many tokens (for each position) to return log probabilities for.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun topK(): Long? = topK.getNullable("top_k")

        /**
         * Returns the raw JSON value of [topK].
         *
         * Unlike [topK], this method doesn't throw if the JSON field has an unexpected type.
         */
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

            /** Returns a mutable builder for constructing an instance of [Logprobs]. */
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

            /**
             * Sets [Builder.topK] to an arbitrary JSON value.
             *
             * You should usually call [Builder.topK] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
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

        return /* spotless:off */ other is BatchInferenceCompletionParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "BatchInferenceCompletionParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
