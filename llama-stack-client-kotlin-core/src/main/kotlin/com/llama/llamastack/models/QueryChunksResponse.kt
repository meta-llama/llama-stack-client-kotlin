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
import com.llama.llamastack.core.checkKnown
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Collections
import java.util.Objects

class QueryChunksResponse
private constructor(
    private val chunks: JsonField<List<Chunk>>,
    private val scores: JsonField<List<Double>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("chunks") @ExcludeMissing chunks: JsonField<List<Chunk>> = JsonMissing.of(),
        @JsonProperty("scores") @ExcludeMissing scores: JsonField<List<Double>> = JsonMissing.of(),
    ) : this(chunks, scores, mutableMapOf())

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun chunks(): List<Chunk> = chunks.getRequired("chunks")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun scores(): List<Double> = scores.getRequired("scores")

    /**
     * Returns the raw JSON value of [chunks].
     *
     * Unlike [chunks], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("chunks") @ExcludeMissing fun _chunks(): JsonField<List<Chunk>> = chunks

    /**
     * Returns the raw JSON value of [scores].
     *
     * Unlike [scores], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scores") @ExcludeMissing fun _scores(): JsonField<List<Double>> = scores

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
         * Returns a mutable builder for constructing an instance of [QueryChunksResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .chunks()
         * .scores()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [QueryChunksResponse]. */
    class Builder internal constructor() {

        private var chunks: JsonField<MutableList<Chunk>>? = null
        private var scores: JsonField<MutableList<Double>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(queryChunksResponse: QueryChunksResponse) = apply {
            chunks = queryChunksResponse.chunks.map { it.toMutableList() }
            scores = queryChunksResponse.scores.map { it.toMutableList() }
            additionalProperties = queryChunksResponse.additionalProperties.toMutableMap()
        }

        fun chunks(chunks: List<Chunk>) = chunks(JsonField.of(chunks))

        /**
         * Sets [Builder.chunks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chunks] with a well-typed `List<Chunk>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun chunks(chunks: JsonField<List<Chunk>>) = apply {
            this.chunks = chunks.map { it.toMutableList() }
        }

        /**
         * Adds a single [Chunk] to [chunks].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addChunk(chunk: Chunk) = apply {
            chunks =
                (chunks ?: JsonField.of(mutableListOf())).also {
                    checkKnown("chunks", it).add(chunk)
                }
        }

        fun scores(scores: List<Double>) = scores(JsonField.of(scores))

        /**
         * Sets [Builder.scores] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scores] with a well-typed `List<Double>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun scores(scores: JsonField<List<Double>>) = apply {
            this.scores = scores.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [scores].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addScore(score: Double) = apply {
            scores =
                (scores ?: JsonField.of(mutableListOf())).also {
                    checkKnown("scores", it).add(score)
                }
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
         * Returns an immutable instance of [QueryChunksResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .chunks()
         * .scores()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): QueryChunksResponse =
            QueryChunksResponse(
                checkRequired("chunks", chunks).map { it.toImmutable() },
                checkRequired("scores", scores).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): QueryChunksResponse = apply {
        if (validated) {
            return@apply
        }

        chunks().forEach { it.validate() }
        scores()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (chunks.asKnown()?.sumOf { it.validity().toInt() } ?: 0) + (scores.asKnown()?.size ?: 0)

    /** A chunk of content that can be inserted into a vector database. */
    class Chunk
    private constructor(
        private val content: JsonField<InterleavedContent>,
        private val metadata: JsonField<Metadata>,
        private val chunkMetadata: JsonField<ChunkMetadata>,
        private val embedding: JsonField<List<Double>>,
        private val storedChunkId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("content")
            @ExcludeMissing
            content: JsonField<InterleavedContent> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("chunk_metadata")
            @ExcludeMissing
            chunkMetadata: JsonField<ChunkMetadata> = JsonMissing.of(),
            @JsonProperty("embedding")
            @ExcludeMissing
            embedding: JsonField<List<Double>> = JsonMissing.of(),
            @JsonProperty("stored_chunk_id")
            @ExcludeMissing
            storedChunkId: JsonField<String> = JsonMissing.of(),
        ) : this(content, metadata, chunkMetadata, embedding, storedChunkId, mutableMapOf())

        /**
         * The content of the chunk, which can be interleaved text, images, or other types.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun content(): InterleavedContent = content.getRequired("content")

        /**
         * Metadata associated with the chunk that will be used in the model context during
         * inference.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun metadata(): Metadata = metadata.getRequired("metadata")

        /**
         * Metadata for the chunk that will NOT be used in the context during inference. The
         * `chunk_metadata` is required backend functionality.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun chunkMetadata(): ChunkMetadata? = chunkMetadata.getNullable("chunk_metadata")

        /**
         * Optional embedding for the chunk. If not provided, it will be computed later.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun embedding(): List<Double>? = embedding.getNullable("embedding")

        /**
         * The chunk ID that is stored in the vector database. Used for backend functionality.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun storedChunkId(): String? = storedChunkId.getNullable("stored_chunk_id")

        /**
         * Returns the raw JSON value of [content].
         *
         * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("content")
        @ExcludeMissing
        fun _content(): JsonField<InterleavedContent> = content

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [chunkMetadata].
         *
         * Unlike [chunkMetadata], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("chunk_metadata")
        @ExcludeMissing
        fun _chunkMetadata(): JsonField<ChunkMetadata> = chunkMetadata

        /**
         * Returns the raw JSON value of [embedding].
         *
         * Unlike [embedding], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("embedding")
        @ExcludeMissing
        fun _embedding(): JsonField<List<Double>> = embedding

        /**
         * Returns the raw JSON value of [storedChunkId].
         *
         * Unlike [storedChunkId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("stored_chunk_id")
        @ExcludeMissing
        fun _storedChunkId(): JsonField<String> = storedChunkId

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
             * Returns a mutable builder for constructing an instance of [Chunk].
             *
             * The following fields are required:
             * ```kotlin
             * .content()
             * .metadata()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Chunk]. */
        class Builder internal constructor() {

            private var content: JsonField<InterleavedContent>? = null
            private var metadata: JsonField<Metadata>? = null
            private var chunkMetadata: JsonField<ChunkMetadata> = JsonMissing.of()
            private var embedding: JsonField<MutableList<Double>>? = null
            private var storedChunkId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(chunk: Chunk) = apply {
                content = chunk.content
                metadata = chunk.metadata
                chunkMetadata = chunk.chunkMetadata
                embedding = chunk.embedding.map { it.toMutableList() }
                storedChunkId = chunk.storedChunkId
                additionalProperties = chunk.additionalProperties.toMutableMap()
            }

            /** The content of the chunk, which can be interleaved text, images, or other types. */
            fun content(content: InterleavedContent) = content(JsonField.of(content))

            /**
             * Sets [Builder.content] to an arbitrary JSON value.
             *
             * You should usually call [Builder.content] with a well-typed [InterleavedContent]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun content(content: JsonField<InterleavedContent>) = apply { this.content = content }

            /** Alias for calling [content] with `InterleavedContent.ofString(string)`. */
            fun content(string: String) = content(InterleavedContent.ofString(string))

            /**
             * Alias for calling [content] with
             * `InterleavedContent.ofImageContentItem(imageContentItem)`.
             */
            fun content(imageContentItem: InterleavedContent.ImageContentItem) =
                content(InterleavedContent.ofImageContentItem(imageContentItem))

            /**
             * Alias for calling [content] with
             * `InterleavedContent.ofTextContentItem(textContentItem)`.
             */
            fun content(textContentItem: InterleavedContent.TextContentItem) =
                content(InterleavedContent.ofTextContentItem(textContentItem))

            /** Alias for calling [content] with `InterleavedContent.ofItems(items)`. */
            fun contentOfItems(items: List<InterleavedContentItem>) =
                content(InterleavedContent.ofItems(items))

            /**
             * Metadata associated with the chunk that will be used in the model context during
             * inference.
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /**
             * Metadata for the chunk that will NOT be used in the context during inference. The
             * `chunk_metadata` is required backend functionality.
             */
            fun chunkMetadata(chunkMetadata: ChunkMetadata) =
                chunkMetadata(JsonField.of(chunkMetadata))

            /**
             * Sets [Builder.chunkMetadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.chunkMetadata] with a well-typed [ChunkMetadata]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun chunkMetadata(chunkMetadata: JsonField<ChunkMetadata>) = apply {
                this.chunkMetadata = chunkMetadata
            }

            /** Optional embedding for the chunk. If not provided, it will be computed later. */
            fun embedding(embedding: List<Double>) = embedding(JsonField.of(embedding))

            /**
             * Sets [Builder.embedding] to an arbitrary JSON value.
             *
             * You should usually call [Builder.embedding] with a well-typed `List<Double>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun embedding(embedding: JsonField<List<Double>>) = apply {
                this.embedding = embedding.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [Builder.embedding].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEmbedding(embedding: Double) = apply {
                this.embedding =
                    (this.embedding ?: JsonField.of(mutableListOf())).also {
                        checkKnown("embedding", it).add(embedding)
                    }
            }

            /**
             * The chunk ID that is stored in the vector database. Used for backend functionality.
             */
            fun storedChunkId(storedChunkId: String) = storedChunkId(JsonField.of(storedChunkId))

            /**
             * Sets [Builder.storedChunkId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.storedChunkId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun storedChunkId(storedChunkId: JsonField<String>) = apply {
                this.storedChunkId = storedChunkId
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
             * Returns an immutable instance of [Chunk].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .content()
             * .metadata()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Chunk =
                Chunk(
                    checkRequired("content", content),
                    checkRequired("metadata", metadata),
                    chunkMetadata,
                    (embedding ?: JsonMissing.of()).map { it.toImmutable() },
                    storedChunkId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Chunk = apply {
            if (validated) {
                return@apply
            }

            content().validate()
            metadata().validate()
            chunkMetadata()?.validate()
            embedding()
            storedChunkId()
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
            (content.asKnown()?.validity() ?: 0) +
                (metadata.asKnown()?.validity() ?: 0) +
                (chunkMetadata.asKnown()?.validity() ?: 0) +
                (embedding.asKnown()?.size ?: 0) +
                (if (storedChunkId.asKnown() == null) 0 else 1)

        /**
         * Metadata associated with the chunk that will be used in the model context during
         * inference.
         */
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

        /**
         * Metadata for the chunk that will NOT be used in the context during inference. The
         * `chunk_metadata` is required backend functionality.
         */
        class ChunkMetadata
        private constructor(
            private val chunkEmbeddingDimension: JsonField<Long>,
            private val chunkEmbeddingModel: JsonField<String>,
            private val chunkId: JsonField<String>,
            private val chunkTokenizer: JsonField<String>,
            private val chunkWindow: JsonField<String>,
            private val contentTokenCount: JsonField<Long>,
            private val createdTimestamp: JsonField<Long>,
            private val documentId: JsonField<String>,
            private val metadataTokenCount: JsonField<Long>,
            private val source: JsonField<String>,
            private val updatedTimestamp: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("chunk_embedding_dimension")
                @ExcludeMissing
                chunkEmbeddingDimension: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("chunk_embedding_model")
                @ExcludeMissing
                chunkEmbeddingModel: JsonField<String> = JsonMissing.of(),
                @JsonProperty("chunk_id")
                @ExcludeMissing
                chunkId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("chunk_tokenizer")
                @ExcludeMissing
                chunkTokenizer: JsonField<String> = JsonMissing.of(),
                @JsonProperty("chunk_window")
                @ExcludeMissing
                chunkWindow: JsonField<String> = JsonMissing.of(),
                @JsonProperty("content_token_count")
                @ExcludeMissing
                contentTokenCount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("created_timestamp")
                @ExcludeMissing
                createdTimestamp: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("document_id")
                @ExcludeMissing
                documentId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("metadata_token_count")
                @ExcludeMissing
                metadataTokenCount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("source")
                @ExcludeMissing
                source: JsonField<String> = JsonMissing.of(),
                @JsonProperty("updated_timestamp")
                @ExcludeMissing
                updatedTimestamp: JsonField<Long> = JsonMissing.of(),
            ) : this(
                chunkEmbeddingDimension,
                chunkEmbeddingModel,
                chunkId,
                chunkTokenizer,
                chunkWindow,
                contentTokenCount,
                createdTimestamp,
                documentId,
                metadataTokenCount,
                source,
                updatedTimestamp,
                mutableMapOf(),
            )

            /**
             * The dimension of the embedding vector for the chunk.
             *
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun chunkEmbeddingDimension(): Long? =
                chunkEmbeddingDimension.getNullable("chunk_embedding_dimension")

            /**
             * The embedding model used to create the chunk's embedding.
             *
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun chunkEmbeddingModel(): String? =
                chunkEmbeddingModel.getNullable("chunk_embedding_model")

            /**
             * The ID of the chunk. If not set, it will be generated based on the document ID and
             * content.
             *
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun chunkId(): String? = chunkId.getNullable("chunk_id")

            /**
             * The tokenizer used to create the chunk. Default is Tiktoken.
             *
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun chunkTokenizer(): String? = chunkTokenizer.getNullable("chunk_tokenizer")

            /**
             * The window of the chunk, which can be used to group related chunks together.
             *
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun chunkWindow(): String? = chunkWindow.getNullable("chunk_window")

            /**
             * The number of tokens in the content of the chunk.
             *
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun contentTokenCount(): Long? = contentTokenCount.getNullable("content_token_count")

            /**
             * An optional timestamp indicating when the chunk was created.
             *
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun createdTimestamp(): Long? = createdTimestamp.getNullable("created_timestamp")

            /**
             * The ID of the document this chunk belongs to.
             *
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun documentId(): String? = documentId.getNullable("document_id")

            /**
             * The number of tokens in the metadata of the chunk.
             *
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun metadataTokenCount(): Long? = metadataTokenCount.getNullable("metadata_token_count")

            /**
             * The source of the content, such as a URL, file path, or other identifier.
             *
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun source(): String? = source.getNullable("source")

            /**
             * An optional timestamp indicating when the chunk was last updated.
             *
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun updatedTimestamp(): Long? = updatedTimestamp.getNullable("updated_timestamp")

            /**
             * Returns the raw JSON value of [chunkEmbeddingDimension].
             *
             * Unlike [chunkEmbeddingDimension], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("chunk_embedding_dimension")
            @ExcludeMissing
            fun _chunkEmbeddingDimension(): JsonField<Long> = chunkEmbeddingDimension

            /**
             * Returns the raw JSON value of [chunkEmbeddingModel].
             *
             * Unlike [chunkEmbeddingModel], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("chunk_embedding_model")
            @ExcludeMissing
            fun _chunkEmbeddingModel(): JsonField<String> = chunkEmbeddingModel

            /**
             * Returns the raw JSON value of [chunkId].
             *
             * Unlike [chunkId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("chunk_id") @ExcludeMissing fun _chunkId(): JsonField<String> = chunkId

            /**
             * Returns the raw JSON value of [chunkTokenizer].
             *
             * Unlike [chunkTokenizer], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("chunk_tokenizer")
            @ExcludeMissing
            fun _chunkTokenizer(): JsonField<String> = chunkTokenizer

            /**
             * Returns the raw JSON value of [chunkWindow].
             *
             * Unlike [chunkWindow], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("chunk_window")
            @ExcludeMissing
            fun _chunkWindow(): JsonField<String> = chunkWindow

            /**
             * Returns the raw JSON value of [contentTokenCount].
             *
             * Unlike [contentTokenCount], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("content_token_count")
            @ExcludeMissing
            fun _contentTokenCount(): JsonField<Long> = contentTokenCount

            /**
             * Returns the raw JSON value of [createdTimestamp].
             *
             * Unlike [createdTimestamp], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("created_timestamp")
            @ExcludeMissing
            fun _createdTimestamp(): JsonField<Long> = createdTimestamp

            /**
             * Returns the raw JSON value of [documentId].
             *
             * Unlike [documentId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("document_id")
            @ExcludeMissing
            fun _documentId(): JsonField<String> = documentId

            /**
             * Returns the raw JSON value of [metadataTokenCount].
             *
             * Unlike [metadataTokenCount], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("metadata_token_count")
            @ExcludeMissing
            fun _metadataTokenCount(): JsonField<Long> = metadataTokenCount

            /**
             * Returns the raw JSON value of [source].
             *
             * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

            /**
             * Returns the raw JSON value of [updatedTimestamp].
             *
             * Unlike [updatedTimestamp], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("updated_timestamp")
            @ExcludeMissing
            fun _updatedTimestamp(): JsonField<Long> = updatedTimestamp

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

                /** Returns a mutable builder for constructing an instance of [ChunkMetadata]. */
                fun builder() = Builder()
            }

            /** A builder for [ChunkMetadata]. */
            class Builder internal constructor() {

                private var chunkEmbeddingDimension: JsonField<Long> = JsonMissing.of()
                private var chunkEmbeddingModel: JsonField<String> = JsonMissing.of()
                private var chunkId: JsonField<String> = JsonMissing.of()
                private var chunkTokenizer: JsonField<String> = JsonMissing.of()
                private var chunkWindow: JsonField<String> = JsonMissing.of()
                private var contentTokenCount: JsonField<Long> = JsonMissing.of()
                private var createdTimestamp: JsonField<Long> = JsonMissing.of()
                private var documentId: JsonField<String> = JsonMissing.of()
                private var metadataTokenCount: JsonField<Long> = JsonMissing.of()
                private var source: JsonField<String> = JsonMissing.of()
                private var updatedTimestamp: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(chunkMetadata: ChunkMetadata) = apply {
                    chunkEmbeddingDimension = chunkMetadata.chunkEmbeddingDimension
                    chunkEmbeddingModel = chunkMetadata.chunkEmbeddingModel
                    chunkId = chunkMetadata.chunkId
                    chunkTokenizer = chunkMetadata.chunkTokenizer
                    chunkWindow = chunkMetadata.chunkWindow
                    contentTokenCount = chunkMetadata.contentTokenCount
                    createdTimestamp = chunkMetadata.createdTimestamp
                    documentId = chunkMetadata.documentId
                    metadataTokenCount = chunkMetadata.metadataTokenCount
                    source = chunkMetadata.source
                    updatedTimestamp = chunkMetadata.updatedTimestamp
                    additionalProperties = chunkMetadata.additionalProperties.toMutableMap()
                }

                /** The dimension of the embedding vector for the chunk. */
                fun chunkEmbeddingDimension(chunkEmbeddingDimension: Long) =
                    chunkEmbeddingDimension(JsonField.of(chunkEmbeddingDimension))

                /**
                 * Sets [Builder.chunkEmbeddingDimension] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.chunkEmbeddingDimension] with a well-typed
                 * [Long] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun chunkEmbeddingDimension(chunkEmbeddingDimension: JsonField<Long>) = apply {
                    this.chunkEmbeddingDimension = chunkEmbeddingDimension
                }

                /** The embedding model used to create the chunk's embedding. */
                fun chunkEmbeddingModel(chunkEmbeddingModel: String) =
                    chunkEmbeddingModel(JsonField.of(chunkEmbeddingModel))

                /**
                 * Sets [Builder.chunkEmbeddingModel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.chunkEmbeddingModel] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun chunkEmbeddingModel(chunkEmbeddingModel: JsonField<String>) = apply {
                    this.chunkEmbeddingModel = chunkEmbeddingModel
                }

                /**
                 * The ID of the chunk. If not set, it will be generated based on the document ID
                 * and content.
                 */
                fun chunkId(chunkId: String) = chunkId(JsonField.of(chunkId))

                /**
                 * Sets [Builder.chunkId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.chunkId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun chunkId(chunkId: JsonField<String>) = apply { this.chunkId = chunkId }

                /** The tokenizer used to create the chunk. Default is Tiktoken. */
                fun chunkTokenizer(chunkTokenizer: String) =
                    chunkTokenizer(JsonField.of(chunkTokenizer))

                /**
                 * Sets [Builder.chunkTokenizer] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.chunkTokenizer] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun chunkTokenizer(chunkTokenizer: JsonField<String>) = apply {
                    this.chunkTokenizer = chunkTokenizer
                }

                /** The window of the chunk, which can be used to group related chunks together. */
                fun chunkWindow(chunkWindow: String) = chunkWindow(JsonField.of(chunkWindow))

                /**
                 * Sets [Builder.chunkWindow] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.chunkWindow] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun chunkWindow(chunkWindow: JsonField<String>) = apply {
                    this.chunkWindow = chunkWindow
                }

                /** The number of tokens in the content of the chunk. */
                fun contentTokenCount(contentTokenCount: Long) =
                    contentTokenCount(JsonField.of(contentTokenCount))

                /**
                 * Sets [Builder.contentTokenCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.contentTokenCount] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun contentTokenCount(contentTokenCount: JsonField<Long>) = apply {
                    this.contentTokenCount = contentTokenCount
                }

                /** An optional timestamp indicating when the chunk was created. */
                fun createdTimestamp(createdTimestamp: Long) =
                    createdTimestamp(JsonField.of(createdTimestamp))

                /**
                 * Sets [Builder.createdTimestamp] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdTimestamp] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun createdTimestamp(createdTimestamp: JsonField<Long>) = apply {
                    this.createdTimestamp = createdTimestamp
                }

                /** The ID of the document this chunk belongs to. */
                fun documentId(documentId: String) = documentId(JsonField.of(documentId))

                /**
                 * Sets [Builder.documentId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.documentId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun documentId(documentId: JsonField<String>) = apply {
                    this.documentId = documentId
                }

                /** The number of tokens in the metadata of the chunk. */
                fun metadataTokenCount(metadataTokenCount: Long) =
                    metadataTokenCount(JsonField.of(metadataTokenCount))

                /**
                 * Sets [Builder.metadataTokenCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadataTokenCount] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun metadataTokenCount(metadataTokenCount: JsonField<Long>) = apply {
                    this.metadataTokenCount = metadataTokenCount
                }

                /** The source of the content, such as a URL, file path, or other identifier. */
                fun source(source: String) = source(JsonField.of(source))

                /**
                 * Sets [Builder.source] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.source] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun source(source: JsonField<String>) = apply { this.source = source }

                /** An optional timestamp indicating when the chunk was last updated. */
                fun updatedTimestamp(updatedTimestamp: Long) =
                    updatedTimestamp(JsonField.of(updatedTimestamp))

                /**
                 * Sets [Builder.updatedTimestamp] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.updatedTimestamp] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun updatedTimestamp(updatedTimestamp: JsonField<Long>) = apply {
                    this.updatedTimestamp = updatedTimestamp
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
                 * Returns an immutable instance of [ChunkMetadata].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ChunkMetadata =
                    ChunkMetadata(
                        chunkEmbeddingDimension,
                        chunkEmbeddingModel,
                        chunkId,
                        chunkTokenizer,
                        chunkWindow,
                        contentTokenCount,
                        createdTimestamp,
                        documentId,
                        metadataTokenCount,
                        source,
                        updatedTimestamp,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ChunkMetadata = apply {
                if (validated) {
                    return@apply
                }

                chunkEmbeddingDimension()
                chunkEmbeddingModel()
                chunkId()
                chunkTokenizer()
                chunkWindow()
                contentTokenCount()
                createdTimestamp()
                documentId()
                metadataTokenCount()
                source()
                updatedTimestamp()
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
                (if (chunkEmbeddingDimension.asKnown() == null) 0 else 1) +
                    (if (chunkEmbeddingModel.asKnown() == null) 0 else 1) +
                    (if (chunkId.asKnown() == null) 0 else 1) +
                    (if (chunkTokenizer.asKnown() == null) 0 else 1) +
                    (if (chunkWindow.asKnown() == null) 0 else 1) +
                    (if (contentTokenCount.asKnown() == null) 0 else 1) +
                    (if (createdTimestamp.asKnown() == null) 0 else 1) +
                    (if (documentId.asKnown() == null) 0 else 1) +
                    (if (metadataTokenCount.asKnown() == null) 0 else 1) +
                    (if (source.asKnown() == null) 0 else 1) +
                    (if (updatedTimestamp.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ChunkMetadata && chunkEmbeddingDimension == other.chunkEmbeddingDimension && chunkEmbeddingModel == other.chunkEmbeddingModel && chunkId == other.chunkId && chunkTokenizer == other.chunkTokenizer && chunkWindow == other.chunkWindow && contentTokenCount == other.contentTokenCount && createdTimestamp == other.createdTimestamp && documentId == other.documentId && metadataTokenCount == other.metadataTokenCount && source == other.source && updatedTimestamp == other.updatedTimestamp && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(chunkEmbeddingDimension, chunkEmbeddingModel, chunkId, chunkTokenizer, chunkWindow, contentTokenCount, createdTimestamp, documentId, metadataTokenCount, source, updatedTimestamp, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ChunkMetadata{chunkEmbeddingDimension=$chunkEmbeddingDimension, chunkEmbeddingModel=$chunkEmbeddingModel, chunkId=$chunkId, chunkTokenizer=$chunkTokenizer, chunkWindow=$chunkWindow, contentTokenCount=$contentTokenCount, createdTimestamp=$createdTimestamp, documentId=$documentId, metadataTokenCount=$metadataTokenCount, source=$source, updatedTimestamp=$updatedTimestamp, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Chunk && content == other.content && metadata == other.metadata && chunkMetadata == other.chunkMetadata && embedding == other.embedding && storedChunkId == other.storedChunkId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(content, metadata, chunkMetadata, embedding, storedChunkId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Chunk{content=$content, metadata=$metadata, chunkMetadata=$chunkMetadata, embedding=$embedding, storedChunkId=$storedChunkId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is QueryChunksResponse && chunks == other.chunks && scores == other.scores && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(chunks, scores, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "QueryChunksResponse{chunks=$chunks, scores=$scores, additionalProperties=$additionalProperties}"
}
