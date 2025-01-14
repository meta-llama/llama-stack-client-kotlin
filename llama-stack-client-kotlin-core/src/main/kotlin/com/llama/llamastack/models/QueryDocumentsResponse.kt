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
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import java.util.Objects

@NoAutoDetect
class QueryDocumentsResponse
@JsonCreator
private constructor(
    @JsonProperty("chunks")
    @ExcludeMissing
    private val chunks: JsonField<List<Chunk>> = JsonMissing.of(),
    @JsonProperty("scores")
    @ExcludeMissing
    private val scores: JsonField<List<Double>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun chunks(): List<Chunk> = chunks.getRequired("chunks")

    fun scores(): List<Double> = scores.getRequired("scores")

    @JsonProperty("chunks") @ExcludeMissing fun _chunks(): JsonField<List<Chunk>> = chunks

    @JsonProperty("scores") @ExcludeMissing fun _scores(): JsonField<List<Double>> = scores

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): QueryDocumentsResponse = apply {
        if (validated) {
            return@apply
        }

        chunks().forEach { it.validate() }
        scores()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var chunks: JsonField<MutableList<Chunk>>? = null
        private var scores: JsonField<MutableList<Double>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(queryDocumentsResponse: QueryDocumentsResponse) = apply {
            chunks = queryDocumentsResponse.chunks.map { it.toMutableList() }
            scores = queryDocumentsResponse.scores.map { it.toMutableList() }
            additionalProperties = queryDocumentsResponse.additionalProperties.toMutableMap()
        }

        fun chunks(chunks: List<Chunk>) = chunks(JsonField.of(chunks))

        fun chunks(chunks: JsonField<List<Chunk>>) = apply {
            this.chunks = chunks.map { it.toMutableList() }
        }

        fun addChunk(chunk: Chunk) = apply {
            chunks =
                (chunks ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(chunk)
                }
        }

        fun scores(scores: List<Double>) = scores(JsonField.of(scores))

        fun scores(scores: JsonField<List<Double>>) = apply {
            this.scores = scores.map { it.toMutableList() }
        }

        fun addScore(score: Double) = apply {
            scores =
                (scores ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(score)
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

        fun build(): QueryDocumentsResponse =
            QueryDocumentsResponse(
                checkNotNull(chunks) { "`chunks` is required but was not set" }
                    .map { it.toImmutable() },
                checkNotNull(scores) { "`scores` is required but was not set" }
                    .map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Chunk
    @JsonCreator
    private constructor(
        @JsonProperty("content")
        @ExcludeMissing
        private val content: JsonField<InterleavedContent> = JsonMissing.of(),
        @JsonProperty("document_id")
        @ExcludeMissing
        private val documentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("token_count")
        @ExcludeMissing
        private val tokenCount: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun content(): InterleavedContent = content.getRequired("content")

        fun documentId(): String = documentId.getRequired("document_id")

        fun tokenCount(): Long = tokenCount.getRequired("token_count")

        @JsonProperty("content")
        @ExcludeMissing
        fun _content(): JsonField<InterleavedContent> = content

        @JsonProperty("document_id")
        @ExcludeMissing
        fun _documentId(): JsonField<String> = documentId

        @JsonProperty("token_count") @ExcludeMissing fun _tokenCount(): JsonField<Long> = tokenCount

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Chunk = apply {
            if (validated) {
                return@apply
            }

            content().validate()
            documentId()
            tokenCount()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var content: JsonField<InterleavedContent>? = null
            private var documentId: JsonField<String>? = null
            private var tokenCount: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(chunk: Chunk) = apply {
                content = chunk.content
                documentId = chunk.documentId
                tokenCount = chunk.tokenCount
                additionalProperties = chunk.additionalProperties.toMutableMap()
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

            fun documentId(documentId: String) = documentId(JsonField.of(documentId))

            fun documentId(documentId: JsonField<String>) = apply { this.documentId = documentId }

            fun tokenCount(tokenCount: Long) = tokenCount(JsonField.of(tokenCount))

            fun tokenCount(tokenCount: JsonField<Long>) = apply { this.tokenCount = tokenCount }

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

            fun build(): Chunk =
                Chunk(
                    checkNotNull(content) { "`content` is required but was not set" },
                    checkNotNull(documentId) { "`documentId` is required but was not set" },
                    checkNotNull(tokenCount) { "`tokenCount` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Chunk && content == other.content && documentId == other.documentId && tokenCount == other.tokenCount && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(content, documentId, tokenCount, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Chunk{content=$content, documentId=$documentId, tokenCount=$tokenCount, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is QueryDocumentsResponse && chunks == other.chunks && scores == other.scores && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(chunks, scores, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "QueryDocumentsResponse{chunks=$chunks, scores=$scores, additionalProperties=$additionalProperties}"
}
