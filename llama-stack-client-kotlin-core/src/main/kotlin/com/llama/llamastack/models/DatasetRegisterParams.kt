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
import com.llama.llamastack.core.Params
import com.llama.llamastack.core.checkKnown
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Collections
import java.util.Objects

/** Register a new dataset. */
class DatasetRegisterParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The purpose of the dataset. One of: - "post-training/messages": The dataset contains a
     * messages column with list of messages for post-training. { "messages":
     * [ {"role": "user", "content": "Hello, world!"}, {"role": "assistant", "content": "Hello, world!"}, ]
     * } - "eval/question-answer": The dataset contains a question column and an answer column for
     * evaluation. { "question": "What is the capital of France?", "answer": "Paris" } -
     * "eval/messages-answer": The dataset contains a messages column with list of messages and an
     * answer column for evaluation. { "messages":
     * [ {"role": "user", "content": "Hello, my name is John Doe."}, {"role": "assistant", "content": "Hello, John Doe. How can I help you today?"}, {"role": "user", "content": "What's my name?"}, ],
     * "answer": "John Doe" }
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun purpose(): Purpose = body.purpose()

    /**
     * The data source of the dataset. Ensure that the data source schema is compatible with the
     * purpose of the dataset. Examples: - { "type": "uri", "uri":
     * "https://mywebsite.com/mydata.jsonl" } - { "type": "uri", "uri": "lsfs://mydata.jsonl" } - {
     * "type": "uri", "uri": "data:csv;base64,{base64_content}" } - { "type": "uri", "uri":
     * "huggingface://llamastack/simpleqa?split=train" } - { "type": "rows", "rows":
     * [ { "messages": [ {"role": "user", "content": "Hello, world!"}, {"role": "assistant", "content": "Hello, world!"}, ]
     * } ] }
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): Source = body.source()

    /**
     * The ID of the dataset. If not provided, an ID will be generated.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun datasetId(): String? = body.datasetId()

    /**
     * The metadata for the dataset. - E.g. {"description": "My dataset"}.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun metadata(): Metadata? = body.metadata()

    /**
     * Returns the raw JSON value of [purpose].
     *
     * Unlike [purpose], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _purpose(): JsonField<Purpose> = body._purpose()

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _source(): JsonField<Source> = body._source()

    /**
     * Returns the raw JSON value of [datasetId].
     *
     * Unlike [datasetId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _datasetId(): JsonField<String> = body._datasetId()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DatasetRegisterParams].
         *
         * The following fields are required:
         * ```kotlin
         * .purpose()
         * .source()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [DatasetRegisterParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(datasetRegisterParams: DatasetRegisterParams) = apply {
            body = datasetRegisterParams.body.toBuilder()
            additionalHeaders = datasetRegisterParams.additionalHeaders.toBuilder()
            additionalQueryParams = datasetRegisterParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [purpose]
         * - [source]
         * - [datasetId]
         * - [metadata]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * The purpose of the dataset. One of: - "post-training/messages": The dataset contains a
         * messages column with list of messages for post-training. { "messages":
         * [ {"role": "user", "content": "Hello, world!"}, {"role": "assistant", "content": "Hello, world!"}, ]
         * } - "eval/question-answer": The dataset contains a question column and an answer column
         * for evaluation. { "question": "What is the capital of France?", "answer": "Paris" } -
         * "eval/messages-answer": The dataset contains a messages column with list of messages and
         * an answer column for evaluation. { "messages":
         * [ {"role": "user", "content": "Hello, my name is John Doe."}, {"role": "assistant", "content": "Hello, John Doe. How can I help you today?"}, {"role": "user", "content": "What's my name?"}, ],
         * "answer": "John Doe" }
         */
        fun purpose(purpose: Purpose) = apply { body.purpose(purpose) }

        /**
         * Sets [Builder.purpose] to an arbitrary JSON value.
         *
         * You should usually call [Builder.purpose] with a well-typed [Purpose] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun purpose(purpose: JsonField<Purpose>) = apply { body.purpose(purpose) }

        /**
         * The data source of the dataset. Ensure that the data source schema is compatible with the
         * purpose of the dataset. Examples: - { "type": "uri", "uri":
         * "https://mywebsite.com/mydata.jsonl" } - { "type": "uri", "uri": "lsfs://mydata.jsonl"
         * } - { "type": "uri", "uri": "data:csv;base64,{base64_content}" } - { "type": "uri",
         * "uri": "huggingface://llamastack/simpleqa?split=train" } - { "type": "rows", "rows":
         * [ { "messages": [ {"role": "user", "content": "Hello, world!"}, {"role": "assistant", "content": "Hello, world!"}, ]
         * } ] }
         */
        fun source(source: Source) = apply { body.source(source) }

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [Source] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<Source>) = apply { body.source(source) }

        /** Alias for calling [source] with `Source.ofUri(uri)`. */
        fun source(uri: Source.Uri) = apply { body.source(uri) }

        /**
         * Alias for calling [source] with the following:
         * ```kotlin
         * Source.Uri.builder()
         *     .uri(uri)
         *     .build()
         * ```
         */
        fun uriSource(uri: String) = apply { body.uriSource(uri) }

        /** Alias for calling [source] with `Source.ofRows(rows)`. */
        fun source(rows: Source.Rows) = apply { body.source(rows) }

        /**
         * Alias for calling [source] with the following:
         * ```kotlin
         * Source.Rows.builder()
         *     .rows(rows)
         *     .build()
         * ```
         */
        fun rowsSource(rows: List<Source.Rows.Row>) = apply { body.rowsSource(rows) }

        /** The ID of the dataset. If not provided, an ID will be generated. */
        fun datasetId(datasetId: String) = apply { body.datasetId(datasetId) }

        /**
         * Sets [Builder.datasetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.datasetId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun datasetId(datasetId: JsonField<String>) = apply { body.datasetId(datasetId) }

        /** The metadata for the dataset. - E.g. {"description": "My dataset"}. */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

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

        /**
         * Returns an immutable instance of [DatasetRegisterParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .purpose()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DatasetRegisterParams =
            DatasetRegisterParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val purpose: JsonField<Purpose>,
        private val source: JsonField<Source>,
        private val datasetId: JsonField<String>,
        private val metadata: JsonField<Metadata>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("purpose") @ExcludeMissing purpose: JsonField<Purpose> = JsonMissing.of(),
            @JsonProperty("source") @ExcludeMissing source: JsonField<Source> = JsonMissing.of(),
            @JsonProperty("dataset_id")
            @ExcludeMissing
            datasetId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
        ) : this(purpose, source, datasetId, metadata, mutableMapOf())

        /**
         * The purpose of the dataset. One of: - "post-training/messages": The dataset contains a
         * messages column with list of messages for post-training. { "messages":
         * [ {"role": "user", "content": "Hello, world!"}, {"role": "assistant", "content": "Hello, world!"}, ]
         * } - "eval/question-answer": The dataset contains a question column and an answer column
         * for evaluation. { "question": "What is the capital of France?", "answer": "Paris" } -
         * "eval/messages-answer": The dataset contains a messages column with list of messages and
         * an answer column for evaluation. { "messages":
         * [ {"role": "user", "content": "Hello, my name is John Doe."}, {"role": "assistant", "content": "Hello, John Doe. How can I help you today?"}, {"role": "user", "content": "What's my name?"}, ],
         * "answer": "John Doe" }
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun purpose(): Purpose = purpose.getRequired("purpose")

        /**
         * The data source of the dataset. Ensure that the data source schema is compatible with the
         * purpose of the dataset. Examples: - { "type": "uri", "uri":
         * "https://mywebsite.com/mydata.jsonl" } - { "type": "uri", "uri": "lsfs://mydata.jsonl"
         * } - { "type": "uri", "uri": "data:csv;base64,{base64_content}" } - { "type": "uri",
         * "uri": "huggingface://llamastack/simpleqa?split=train" } - { "type": "rows", "rows":
         * [ { "messages": [ {"role": "user", "content": "Hello, world!"}, {"role": "assistant", "content": "Hello, world!"}, ]
         * } ] }
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun source(): Source = source.getRequired("source")

        /**
         * The ID of the dataset. If not provided, an ID will be generated.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun datasetId(): String? = datasetId.getNullable("dataset_id")

        /**
         * The metadata for the dataset. - E.g. {"description": "My dataset"}.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /**
         * Returns the raw JSON value of [purpose].
         *
         * Unlike [purpose], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("purpose") @ExcludeMissing fun _purpose(): JsonField<Purpose> = purpose

        /**
         * Returns the raw JSON value of [source].
         *
         * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<Source> = source

        /**
         * Returns the raw JSON value of [datasetId].
         *
         * Unlike [datasetId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dataset_id") @ExcludeMissing fun _datasetId(): JsonField<String> = datasetId

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .purpose()
             * .source()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var purpose: JsonField<Purpose>? = null
            private var source: JsonField<Source>? = null
            private var datasetId: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                purpose = body.purpose
                source = body.source
                datasetId = body.datasetId
                metadata = body.metadata
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The purpose of the dataset. One of: - "post-training/messages": The dataset contains
             * a messages column with list of messages for post-training. { "messages":
             * [ {"role": "user", "content": "Hello, world!"}, {"role": "assistant", "content": "Hello, world!"}, ]
             * } - "eval/question-answer": The dataset contains a question column and an answer
             * column for evaluation. { "question": "What is the capital of France?", "answer":
             * "Paris" } - "eval/messages-answer": The dataset contains a messages column with list
             * of messages and an answer column for evaluation. { "messages":
             * [ {"role": "user", "content": "Hello, my name is John Doe."}, {"role": "assistant", "content": "Hello, John Doe. How can I help you today?"}, {"role": "user", "content": "What's my name?"}, ],
             * "answer": "John Doe" }
             */
            fun purpose(purpose: Purpose) = purpose(JsonField.of(purpose))

            /**
             * Sets [Builder.purpose] to an arbitrary JSON value.
             *
             * You should usually call [Builder.purpose] with a well-typed [Purpose] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun purpose(purpose: JsonField<Purpose>) = apply { this.purpose = purpose }

            /**
             * The data source of the dataset. Ensure that the data source schema is compatible with
             * the purpose of the dataset. Examples: - { "type": "uri", "uri":
             * "https://mywebsite.com/mydata.jsonl" } - { "type": "uri", "uri":
             * "lsfs://mydata.jsonl" } - { "type": "uri", "uri": "data:csv;base64,{base64_content}"
             * } - { "type": "uri", "uri": "huggingface://llamastack/simpleqa?split=train" } - {
             * "type": "rows", "rows":
             * [ { "messages": [ {"role": "user", "content": "Hello, world!"}, {"role": "assistant", "content": "Hello, world!"}, ]
             * } ] }
             */
            fun source(source: Source) = source(JsonField.of(source))

            /**
             * Sets [Builder.source] to an arbitrary JSON value.
             *
             * You should usually call [Builder.source] with a well-typed [Source] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun source(source: JsonField<Source>) = apply { this.source = source }

            /** Alias for calling [source] with `Source.ofUri(uri)`. */
            fun source(uri: Source.Uri) = source(Source.ofUri(uri))

            /**
             * Alias for calling [source] with the following:
             * ```kotlin
             * Source.Uri.builder()
             *     .uri(uri)
             *     .build()
             * ```
             */
            fun uriSource(uri: String) = source(Source.Uri.builder().uri(uri).build())

            /** Alias for calling [source] with `Source.ofRows(rows)`. */
            fun source(rows: Source.Rows) = source(Source.ofRows(rows))

            /**
             * Alias for calling [source] with the following:
             * ```kotlin
             * Source.Rows.builder()
             *     .rows(rows)
             *     .build()
             * ```
             */
            fun rowsSource(rows: List<Source.Rows.Row>) =
                source(Source.Rows.builder().rows(rows).build())

            /** The ID of the dataset. If not provided, an ID will be generated. */
            fun datasetId(datasetId: String) = datasetId(JsonField.of(datasetId))

            /**
             * Sets [Builder.datasetId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.datasetId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun datasetId(datasetId: JsonField<String>) = apply { this.datasetId = datasetId }

            /** The metadata for the dataset. - E.g. {"description": "My dataset"}. */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .purpose()
             * .source()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("purpose", purpose),
                    checkRequired("source", source),
                    datasetId,
                    metadata,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            purpose().validate()
            source().validate()
            datasetId()
            metadata()?.validate()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaStackClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (purpose.asKnown()?.validity() ?: 0) +
                (source.asKnown()?.validity() ?: 0) +
                (if (datasetId.asKnown() == null) 0 else 1) +
                (metadata.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && purpose == other.purpose && source == other.source && datasetId == other.datasetId && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(purpose, source, datasetId, metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{purpose=$purpose, source=$source, datasetId=$datasetId, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    /**
     * The purpose of the dataset. One of: - "post-training/messages": The dataset contains a
     * messages column with list of messages for post-training. { "messages":
     * [ {"role": "user", "content": "Hello, world!"}, {"role": "assistant", "content": "Hello, world!"}, ]
     * } - "eval/question-answer": The dataset contains a question column and an answer column for
     * evaluation. { "question": "What is the capital of France?", "answer": "Paris" } -
     * "eval/messages-answer": The dataset contains a messages column with list of messages and an
     * answer column for evaluation. { "messages":
     * [ {"role": "user", "content": "Hello, my name is John Doe."}, {"role": "assistant", "content": "Hello, John Doe. How can I help you today?"}, {"role": "user", "content": "What's my name?"}, ],
     * "answer": "John Doe" }
     */
    class Purpose @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val POST_TRAINING_MESSAGES = of("post-training/messages")

            val EVAL_QUESTION_ANSWER = of("eval/question-answer")

            val EVAL_MESSAGES_ANSWER = of("eval/messages-answer")

            fun of(value: String) = Purpose(JsonField.of(value))
        }

        /** An enum containing [Purpose]'s known values. */
        enum class Known {
            POST_TRAINING_MESSAGES,
            EVAL_QUESTION_ANSWER,
            EVAL_MESSAGES_ANSWER,
        }

        /**
         * An enum containing [Purpose]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Purpose] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            POST_TRAINING_MESSAGES,
            EVAL_QUESTION_ANSWER,
            EVAL_MESSAGES_ANSWER,
            /** An enum member indicating that [Purpose] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                POST_TRAINING_MESSAGES -> Value.POST_TRAINING_MESSAGES
                EVAL_QUESTION_ANSWER -> Value.EVAL_QUESTION_ANSWER
                EVAL_MESSAGES_ANSWER -> Value.EVAL_MESSAGES_ANSWER
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LlamaStackClientInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                POST_TRAINING_MESSAGES -> Known.POST_TRAINING_MESSAGES
                EVAL_QUESTION_ANSWER -> Known.EVAL_QUESTION_ANSWER
                EVAL_MESSAGES_ANSWER -> Known.EVAL_MESSAGES_ANSWER
                else -> throw LlamaStackClientInvalidDataException("Unknown Purpose: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LlamaStackClientInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString()
                ?: throw LlamaStackClientInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        fun validate(): Purpose = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaStackClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Purpose && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The data source of the dataset. Ensure that the data source schema is compatible with the
     * purpose of the dataset. Examples: - { "type": "uri", "uri":
     * "https://mywebsite.com/mydata.jsonl" } - { "type": "uri", "uri": "lsfs://mydata.jsonl" } - {
     * "type": "uri", "uri": "data:csv;base64,{base64_content}" } - { "type": "uri", "uri":
     * "huggingface://llamastack/simpleqa?split=train" } - { "type": "rows", "rows":
     * [ { "messages": [ {"role": "user", "content": "Hello, world!"}, {"role": "assistant", "content": "Hello, world!"}, ]
     * } ] }
     */
    @JsonDeserialize(using = Source.Deserializer::class)
    @JsonSerialize(using = Source.Serializer::class)
    class Source
    private constructor(
        private val uri: Uri? = null,
        private val rows: Rows? = null,
        private val _json: JsonValue? = null,
    ) {

        /** A dataset that can be obtained from a URI. */
        fun uri(): Uri? = uri

        /** A dataset stored in rows. */
        fun rows(): Rows? = rows

        fun isUri(): Boolean = uri != null

        fun isRows(): Boolean = rows != null

        /** A dataset that can be obtained from a URI. */
        fun asUri(): Uri = uri.getOrThrow("uri")

        /** A dataset stored in rows. */
        fun asRows(): Rows = rows.getOrThrow("rows")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                uri != null -> visitor.visitUri(uri)
                rows != null -> visitor.visitRows(rows)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Source = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitUri(uri: Uri) {
                        uri.validate()
                    }

                    override fun visitRows(rows: Rows) {
                        rows.validate()
                    }
                }
            )
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaStackClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitUri(uri: Uri) = uri.validity()

                    override fun visitRows(rows: Rows) = rows.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Source && uri == other.uri && rows == other.rows /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(uri, rows) /* spotless:on */

        override fun toString(): String =
            when {
                uri != null -> "Source{uri=$uri}"
                rows != null -> "Source{rows=$rows}"
                _json != null -> "Source{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Source")
            }

        companion object {

            /** A dataset that can be obtained from a URI. */
            fun ofUri(uri: Uri) = Source(uri = uri)

            /** A dataset stored in rows. */
            fun ofRows(rows: Rows) = Source(rows = rows)
        }

        /** An interface that defines how to map each variant of [Source] to a value of type [T]. */
        interface Visitor<out T> {

            /** A dataset that can be obtained from a URI. */
            fun visitUri(uri: Uri): T

            /** A dataset stored in rows. */
            fun visitRows(rows: Rows): T

            /**
             * Maps an unknown variant of [Source] to a value of type [T].
             *
             * An instance of [Source] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws LlamaStackClientInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown Source: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Source>(Source::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Source {
                val json = JsonValue.fromJsonNode(node)
                val type = json.asObject()?.get("type")?.asString()

                when (type) {
                    "uri" -> {
                        return tryDeserialize(node, jacksonTypeRef<Uri>())?.let {
                            Source(uri = it, _json = json)
                        } ?: Source(_json = json)
                    }
                    "rows" -> {
                        return tryDeserialize(node, jacksonTypeRef<Rows>())?.let {
                            Source(rows = it, _json = json)
                        } ?: Source(_json = json)
                    }
                }

                return Source(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Source>(Source::class) {

            override fun serialize(
                value: Source,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.uri != null -> generator.writeObject(value.uri)
                    value.rows != null -> generator.writeObject(value.rows)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Source")
                }
            }
        }

        /** A dataset that can be obtained from a URI. */
        class Uri
        private constructor(
            private val type: JsonValue,
            private val uri: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                @JsonProperty("uri") @ExcludeMissing uri: JsonField<String> = JsonMissing.of(),
            ) : this(type, uri, mutableMapOf())

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("uri")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * The dataset can be obtained from a URI. E.g. - "https://mywebsite.com/mydata.jsonl" -
             * "lsfs://mydata.jsonl" - "data:csv;base64,{base64_content}"
             *
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun uri(): String = uri.getRequired("uri")

            /**
             * Returns the raw JSON value of [uri].
             *
             * Unlike [uri], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("uri") @ExcludeMissing fun _uri(): JsonField<String> = uri

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Uri].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .uri()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Uri]. */
            class Builder internal constructor() {

                private var type: JsonValue = JsonValue.from("uri")
                private var uri: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(uri: Uri) = apply {
                    type = uri.type
                    this.uri = uri.uri
                    additionalProperties = uri.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("uri")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonValue) = apply { this.type = type }

                /**
                 * The dataset can be obtained from a URI. E.g. -
                 * "https://mywebsite.com/mydata.jsonl" - "lsfs://mydata.jsonl" -
                 * "data:csv;base64,{base64_content}"
                 */
                fun uri(uri: String) = uri(JsonField.of(uri))

                /**
                 * Sets [Builder.uri] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.uri] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun uri(uri: JsonField<String>) = apply { this.uri = uri }

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

                /**
                 * Returns an immutable instance of [Uri].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .uri()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Uri =
                    Uri(type, checkRequired("uri", uri), additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Uri = apply {
                if (validated) {
                    return@apply
                }

                _type().let {
                    if (it != JsonValue.from("uri")) {
                        throw LlamaStackClientInvalidDataException(
                            "'type' is invalid, received $it"
                        )
                    }
                }
                uri()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LlamaStackClientInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                type.let { if (it == JsonValue.from("uri")) 1 else 0 } +
                    (if (uri.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Uri && type == other.type && uri == other.uri && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(type, uri, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Uri{type=$type, uri=$uri, additionalProperties=$additionalProperties}"
        }

        /** A dataset stored in rows. */
        class Rows
        private constructor(
            private val rows: JsonField<List<Row>>,
            private val type: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("rows") @ExcludeMissing rows: JsonField<List<Row>> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
            ) : this(rows, type, mutableMapOf())

            /**
             * The dataset is stored in rows.
             * E.g. - [ {"messages": [{"role": "user", "content": "Hello, world!"}, {"role": "assistant", "content": "Hello, world!"}]}
             * ]
             *
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun rows(): List<Row> = rows.getRequired("rows")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("rows")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * Returns the raw JSON value of [rows].
             *
             * Unlike [rows], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("rows") @ExcludeMissing fun _rows(): JsonField<List<Row>> = rows

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Rows].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .rows()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Rows]. */
            class Builder internal constructor() {

                private var rows: JsonField<MutableList<Row>>? = null
                private var type: JsonValue = JsonValue.from("rows")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(rows: Rows) = apply {
                    this.rows = rows.rows.map { it.toMutableList() }
                    type = rows.type
                    additionalProperties = rows.additionalProperties.toMutableMap()
                }

                /**
                 * The dataset is stored in rows.
                 * E.g. - [ {"messages": [{"role": "user", "content": "Hello, world!"}, {"role": "assistant", "content": "Hello, world!"}]}
                 * ]
                 */
                fun rows(rows: List<Row>) = rows(JsonField.of(rows))

                /**
                 * Sets [Builder.rows] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rows] with a well-typed `List<Row>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun rows(rows: JsonField<List<Row>>) = apply {
                    this.rows = rows.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Row] to [rows].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addRow(row: Row) = apply {
                    rows =
                        (rows ?: JsonField.of(mutableListOf())).also {
                            checkKnown("rows", it).add(row)
                        }
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("rows")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonValue) = apply { this.type = type }

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

                /**
                 * Returns an immutable instance of [Rows].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .rows()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Rows =
                    Rows(
                        checkRequired("rows", rows).map { it.toImmutable() },
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Rows = apply {
                if (validated) {
                    return@apply
                }

                rows().forEach { it.validate() }
                _type().let {
                    if (it != JsonValue.from("rows")) {
                        throw LlamaStackClientInvalidDataException(
                            "'type' is invalid, received $it"
                        )
                    }
                }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LlamaStackClientInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                (rows.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    type.let { if (it == JsonValue.from("rows")) 1 else 0 }

            class Row
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Row]. */
                    fun builder() = Builder()
                }

                /** A builder for [Row]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(row: Row) = apply {
                        additionalProperties = row.additionalProperties.toMutableMap()
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

                    /**
                     * Returns an immutable instance of [Row].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Row = Row(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): Row = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LlamaStackClientInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Row && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() = "Row{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Rows && rows == other.rows && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(rows, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Rows{rows=$rows, type=$type, additionalProperties=$additionalProperties}"
        }
    }

    /** The metadata for the dataset. - E.g. {"description": "My dataset"}. */
    class Metadata
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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

            /**
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaStackClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DatasetRegisterParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "DatasetRegisterParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
