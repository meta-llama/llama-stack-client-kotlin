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
import com.llama.llamastack.core.Params
import com.llama.llamastack.core.checkKnown
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Collections
import java.util.Objects

/** Creates a vector store. */
class VectorStoreCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * A name for the vector store.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun chunkingStrategy(): ChunkingStrategy? = body.chunkingStrategy()

    /**
     * The dimension of the embedding vectors (default: 384).
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun embeddingDimension(): Long? = body.embeddingDimension()

    /**
     * The embedding model to use for this vector store.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun embeddingModel(): String? = body.embeddingModel()

    /**
     * The expiration policy for a vector store.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun expiresAfter(): ExpiresAfter? = body.expiresAfter()

    /**
     * A list of File IDs that the vector store should use. Useful for tools like `file_search` that
     * can access files.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun fileIds(): List<String>? = body.fileIds()

    /**
     * Set of 16 key-value pairs that can be attached to an object.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun metadata(): Metadata? = body.metadata()

    /**
     * The ID of the provider to use for this vector store.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun providerId(): String? = body.providerId()

    /**
     * The provider-specific vector database ID.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun providerVectorDbId(): String? = body.providerVectorDbId()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [chunkingStrategy].
     *
     * Unlike [chunkingStrategy], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _chunkingStrategy(): JsonField<ChunkingStrategy> = body._chunkingStrategy()

    /**
     * Returns the raw JSON value of [embeddingDimension].
     *
     * Unlike [embeddingDimension], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _embeddingDimension(): JsonField<Long> = body._embeddingDimension()

    /**
     * Returns the raw JSON value of [embeddingModel].
     *
     * Unlike [embeddingModel], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _embeddingModel(): JsonField<String> = body._embeddingModel()

    /**
     * Returns the raw JSON value of [expiresAfter].
     *
     * Unlike [expiresAfter], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _expiresAfter(): JsonField<ExpiresAfter> = body._expiresAfter()

    /**
     * Returns the raw JSON value of [fileIds].
     *
     * Unlike [fileIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _fileIds(): JsonField<List<String>> = body._fileIds()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [providerId].
     *
     * Unlike [providerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _providerId(): JsonField<String> = body._providerId()

    /**
     * Returns the raw JSON value of [providerVectorDbId].
     *
     * Unlike [providerVectorDbId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _providerVectorDbId(): JsonField<String> = body._providerVectorDbId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [VectorStoreCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .name()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [VectorStoreCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(vectorStoreCreateParams: VectorStoreCreateParams) = apply {
            body = vectorStoreCreateParams.body.toBuilder()
            additionalHeaders = vectorStoreCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = vectorStoreCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [name]
         * - [chunkingStrategy]
         * - [embeddingDimension]
         * - [embeddingModel]
         * - [expiresAfter]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** A name for the vector store. */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * The chunking strategy used to chunk the file(s). If not set, will use the `auto`
         * strategy.
         */
        fun chunkingStrategy(chunkingStrategy: ChunkingStrategy) = apply {
            body.chunkingStrategy(chunkingStrategy)
        }

        /**
         * Sets [Builder.chunkingStrategy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chunkingStrategy] with a well-typed [ChunkingStrategy]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun chunkingStrategy(chunkingStrategy: JsonField<ChunkingStrategy>) = apply {
            body.chunkingStrategy(chunkingStrategy)
        }

        /** The dimension of the embedding vectors (default: 384). */
        fun embeddingDimension(embeddingDimension: Long) = apply {
            body.embeddingDimension(embeddingDimension)
        }

        /**
         * Sets [Builder.embeddingDimension] to an arbitrary JSON value.
         *
         * You should usually call [Builder.embeddingDimension] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun embeddingDimension(embeddingDimension: JsonField<Long>) = apply {
            body.embeddingDimension(embeddingDimension)
        }

        /** The embedding model to use for this vector store. */
        fun embeddingModel(embeddingModel: String) = apply { body.embeddingModel(embeddingModel) }

        /**
         * Sets [Builder.embeddingModel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.embeddingModel] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun embeddingModel(embeddingModel: JsonField<String>) = apply {
            body.embeddingModel(embeddingModel)
        }

        /** The expiration policy for a vector store. */
        fun expiresAfter(expiresAfter: ExpiresAfter) = apply { body.expiresAfter(expiresAfter) }

        /**
         * Sets [Builder.expiresAfter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAfter] with a well-typed [ExpiresAfter] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAfter(expiresAfter: JsonField<ExpiresAfter>) = apply {
            body.expiresAfter(expiresAfter)
        }

        /**
         * A list of File IDs that the vector store should use. Useful for tools like `file_search`
         * that can access files.
         */
        fun fileIds(fileIds: List<String>) = apply { body.fileIds(fileIds) }

        /**
         * Sets [Builder.fileIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileIds] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fileIds(fileIds: JsonField<List<String>>) = apply { body.fileIds(fileIds) }

        /**
         * Adds a single [String] to [fileIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFileId(fileId: String) = apply { body.addFileId(fileId) }

        /** Set of 16 key-value pairs that can be attached to an object. */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /** The ID of the provider to use for this vector store. */
        fun providerId(providerId: String) = apply { body.providerId(providerId) }

        /**
         * Sets [Builder.providerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.providerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun providerId(providerId: JsonField<String>) = apply { body.providerId(providerId) }

        /** The provider-specific vector database ID. */
        fun providerVectorDbId(providerVectorDbId: String) = apply {
            body.providerVectorDbId(providerVectorDbId)
        }

        /**
         * Sets [Builder.providerVectorDbId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.providerVectorDbId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun providerVectorDbId(providerVectorDbId: JsonField<String>) = apply {
            body.providerVectorDbId(providerVectorDbId)
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

        /**
         * Returns an immutable instance of [VectorStoreCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VectorStoreCreateParams =
            VectorStoreCreateParams(
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
        private val name: JsonField<String>,
        private val chunkingStrategy: JsonField<ChunkingStrategy>,
        private val embeddingDimension: JsonField<Long>,
        private val embeddingModel: JsonField<String>,
        private val expiresAfter: JsonField<ExpiresAfter>,
        private val fileIds: JsonField<List<String>>,
        private val metadata: JsonField<Metadata>,
        private val providerId: JsonField<String>,
        private val providerVectorDbId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("chunking_strategy")
            @ExcludeMissing
            chunkingStrategy: JsonField<ChunkingStrategy> = JsonMissing.of(),
            @JsonProperty("embedding_dimension")
            @ExcludeMissing
            embeddingDimension: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("embedding_model")
            @ExcludeMissing
            embeddingModel: JsonField<String> = JsonMissing.of(),
            @JsonProperty("expires_after")
            @ExcludeMissing
            expiresAfter: JsonField<ExpiresAfter> = JsonMissing.of(),
            @JsonProperty("file_ids")
            @ExcludeMissing
            fileIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("provider_id")
            @ExcludeMissing
            providerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("provider_vector_db_id")
            @ExcludeMissing
            providerVectorDbId: JsonField<String> = JsonMissing.of(),
        ) : this(
            name,
            chunkingStrategy,
            embeddingDimension,
            embeddingModel,
            expiresAfter,
            fileIds,
            metadata,
            providerId,
            providerVectorDbId,
            mutableMapOf(),
        )

        /**
         * A name for the vector store.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * The chunking strategy used to chunk the file(s). If not set, will use the `auto`
         * strategy.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun chunkingStrategy(): ChunkingStrategy? =
            chunkingStrategy.getNullable("chunking_strategy")

        /**
         * The dimension of the embedding vectors (default: 384).
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun embeddingDimension(): Long? = embeddingDimension.getNullable("embedding_dimension")

        /**
         * The embedding model to use for this vector store.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun embeddingModel(): String? = embeddingModel.getNullable("embedding_model")

        /**
         * The expiration policy for a vector store.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun expiresAfter(): ExpiresAfter? = expiresAfter.getNullable("expires_after")

        /**
         * A list of File IDs that the vector store should use. Useful for tools like `file_search`
         * that can access files.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun fileIds(): List<String>? = fileIds.getNullable("file_ids")

        /**
         * Set of 16 key-value pairs that can be attached to an object.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /**
         * The ID of the provider to use for this vector store.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun providerId(): String? = providerId.getNullable("provider_id")

        /**
         * The provider-specific vector database ID.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun providerVectorDbId(): String? = providerVectorDbId.getNullable("provider_vector_db_id")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [chunkingStrategy].
         *
         * Unlike [chunkingStrategy], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("chunking_strategy")
        @ExcludeMissing
        fun _chunkingStrategy(): JsonField<ChunkingStrategy> = chunkingStrategy

        /**
         * Returns the raw JSON value of [embeddingDimension].
         *
         * Unlike [embeddingDimension], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("embedding_dimension")
        @ExcludeMissing
        fun _embeddingDimension(): JsonField<Long> = embeddingDimension

        /**
         * Returns the raw JSON value of [embeddingModel].
         *
         * Unlike [embeddingModel], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("embedding_model")
        @ExcludeMissing
        fun _embeddingModel(): JsonField<String> = embeddingModel

        /**
         * Returns the raw JSON value of [expiresAfter].
         *
         * Unlike [expiresAfter], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("expires_after")
        @ExcludeMissing
        fun _expiresAfter(): JsonField<ExpiresAfter> = expiresAfter

        /**
         * Returns the raw JSON value of [fileIds].
         *
         * Unlike [fileIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("file_ids") @ExcludeMissing fun _fileIds(): JsonField<List<String>> = fileIds

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [providerId].
         *
         * Unlike [providerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("provider_id")
        @ExcludeMissing
        fun _providerId(): JsonField<String> = providerId

        /**
         * Returns the raw JSON value of [providerVectorDbId].
         *
         * Unlike [providerVectorDbId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("provider_vector_db_id")
        @ExcludeMissing
        fun _providerVectorDbId(): JsonField<String> = providerVectorDbId

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
             * .name()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var chunkingStrategy: JsonField<ChunkingStrategy> = JsonMissing.of()
            private var embeddingDimension: JsonField<Long> = JsonMissing.of()
            private var embeddingModel: JsonField<String> = JsonMissing.of()
            private var expiresAfter: JsonField<ExpiresAfter> = JsonMissing.of()
            private var fileIds: JsonField<MutableList<String>>? = null
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var providerId: JsonField<String> = JsonMissing.of()
            private var providerVectorDbId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                name = body.name
                chunkingStrategy = body.chunkingStrategy
                embeddingDimension = body.embeddingDimension
                embeddingModel = body.embeddingModel
                expiresAfter = body.expiresAfter
                fileIds = body.fileIds.map { it.toMutableList() }
                metadata = body.metadata
                providerId = body.providerId
                providerVectorDbId = body.providerVectorDbId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** A name for the vector store. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * The chunking strategy used to chunk the file(s). If not set, will use the `auto`
             * strategy.
             */
            fun chunkingStrategy(chunkingStrategy: ChunkingStrategy) =
                chunkingStrategy(JsonField.of(chunkingStrategy))

            /**
             * Sets [Builder.chunkingStrategy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.chunkingStrategy] with a well-typed
             * [ChunkingStrategy] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun chunkingStrategy(chunkingStrategy: JsonField<ChunkingStrategy>) = apply {
                this.chunkingStrategy = chunkingStrategy
            }

            /** The dimension of the embedding vectors (default: 384). */
            fun embeddingDimension(embeddingDimension: Long) =
                embeddingDimension(JsonField.of(embeddingDimension))

            /**
             * Sets [Builder.embeddingDimension] to an arbitrary JSON value.
             *
             * You should usually call [Builder.embeddingDimension] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun embeddingDimension(embeddingDimension: JsonField<Long>) = apply {
                this.embeddingDimension = embeddingDimension
            }

            /** The embedding model to use for this vector store. */
            fun embeddingModel(embeddingModel: String) =
                embeddingModel(JsonField.of(embeddingModel))

            /**
             * Sets [Builder.embeddingModel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.embeddingModel] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun embeddingModel(embeddingModel: JsonField<String>) = apply {
                this.embeddingModel = embeddingModel
            }

            /** The expiration policy for a vector store. */
            fun expiresAfter(expiresAfter: ExpiresAfter) = expiresAfter(JsonField.of(expiresAfter))

            /**
             * Sets [Builder.expiresAfter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expiresAfter] with a well-typed [ExpiresAfter] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expiresAfter(expiresAfter: JsonField<ExpiresAfter>) = apply {
                this.expiresAfter = expiresAfter
            }

            /**
             * A list of File IDs that the vector store should use. Useful for tools like
             * `file_search` that can access files.
             */
            fun fileIds(fileIds: List<String>) = fileIds(JsonField.of(fileIds))

            /**
             * Sets [Builder.fileIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fileIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fileIds(fileIds: JsonField<List<String>>) = apply {
                this.fileIds = fileIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [fileIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFileId(fileId: String) = apply {
                fileIds =
                    (fileIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("fileIds", it).add(fileId)
                    }
            }

            /** Set of 16 key-value pairs that can be attached to an object. */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /** The ID of the provider to use for this vector store. */
            fun providerId(providerId: String) = providerId(JsonField.of(providerId))

            /**
             * Sets [Builder.providerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.providerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

            /** The provider-specific vector database ID. */
            fun providerVectorDbId(providerVectorDbId: String) =
                providerVectorDbId(JsonField.of(providerVectorDbId))

            /**
             * Sets [Builder.providerVectorDbId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.providerVectorDbId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun providerVectorDbId(providerVectorDbId: JsonField<String>) = apply {
                this.providerVectorDbId = providerVectorDbId
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("name", name),
                    chunkingStrategy,
                    embeddingDimension,
                    embeddingModel,
                    expiresAfter,
                    (fileIds ?: JsonMissing.of()).map { it.toImmutable() },
                    metadata,
                    providerId,
                    providerVectorDbId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            name()
            chunkingStrategy()?.validate()
            embeddingDimension()
            embeddingModel()
            expiresAfter()?.validate()
            fileIds()
            metadata()?.validate()
            providerId()
            providerVectorDbId()
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
            (if (name.asKnown() == null) 0 else 1) +
                (chunkingStrategy.asKnown()?.validity() ?: 0) +
                (if (embeddingDimension.asKnown() == null) 0 else 1) +
                (if (embeddingModel.asKnown() == null) 0 else 1) +
                (expiresAfter.asKnown()?.validity() ?: 0) +
                (fileIds.asKnown()?.size ?: 0) +
                (metadata.asKnown()?.validity() ?: 0) +
                (if (providerId.asKnown() == null) 0 else 1) +
                (if (providerVectorDbId.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && name == other.name && chunkingStrategy == other.chunkingStrategy && embeddingDimension == other.embeddingDimension && embeddingModel == other.embeddingModel && expiresAfter == other.expiresAfter && fileIds == other.fileIds && metadata == other.metadata && providerId == other.providerId && providerVectorDbId == other.providerVectorDbId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, chunkingStrategy, embeddingDimension, embeddingModel, expiresAfter, fileIds, metadata, providerId, providerVectorDbId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{name=$name, chunkingStrategy=$chunkingStrategy, embeddingDimension=$embeddingDimension, embeddingModel=$embeddingModel, expiresAfter=$expiresAfter, fileIds=$fileIds, metadata=$metadata, providerId=$providerId, providerVectorDbId=$providerVectorDbId, additionalProperties=$additionalProperties}"
    }

    /**
     * The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy.
     */
    class ChunkingStrategy
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

            /** Returns a mutable builder for constructing an instance of [ChunkingStrategy]. */
            fun builder() = Builder()
        }

        /** A builder for [ChunkingStrategy]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(chunkingStrategy: ChunkingStrategy) = apply {
                additionalProperties = chunkingStrategy.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ChunkingStrategy].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ChunkingStrategy = ChunkingStrategy(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): ChunkingStrategy = apply {
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

            return /* spotless:off */ other is ChunkingStrategy && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "ChunkingStrategy{additionalProperties=$additionalProperties}"
    }

    /** The expiration policy for a vector store. */
    class ExpiresAfter
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

            /** Returns a mutable builder for constructing an instance of [ExpiresAfter]. */
            fun builder() = Builder()
        }

        /** A builder for [ExpiresAfter]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(expiresAfter: ExpiresAfter) = apply {
                additionalProperties = expiresAfter.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ExpiresAfter].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ExpiresAfter = ExpiresAfter(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): ExpiresAfter = apply {
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

            return /* spotless:off */ other is ExpiresAfter && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "ExpiresAfter{additionalProperties=$additionalProperties}"
    }

    /** Set of 16 key-value pairs that can be attached to an object. */
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

        return /* spotless:off */ other is VectorStoreCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "VectorStoreCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
