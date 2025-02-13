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
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import java.util.Objects

@NoAutoDetect
class QueryChunksResponse
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

    fun validate(): QueryChunksResponse = apply {
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

        fun build(): QueryChunksResponse =
            QueryChunksResponse(
                checkRequired("chunks", chunks).map { it.toImmutable() },
                checkRequired("scores", scores).map { it.toImmutable() },
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
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** A image content item */
        fun content(): InterleavedContent = content.getRequired("content")

        fun metadata(): Metadata = metadata.getRequired("metadata")

        /** A image content item */
        @JsonProperty("content")
        @ExcludeMissing
        fun _content(): JsonField<InterleavedContent> = content

        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Chunk = apply {
            if (validated) {
                return@apply
            }

            content().validate()
            metadata().validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [Chunk]. */
        class Builder internal constructor() {

            private var content: JsonField<InterleavedContent>? = null
            private var metadata: JsonField<Metadata>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(chunk: Chunk) = apply {
                content = chunk.content
                metadata = chunk.metadata
                additionalProperties = chunk.additionalProperties.toMutableMap()
            }

            /** A image content item */
            fun content(content: InterleavedContent) = content(JsonField.of(content))

            /** A image content item */
            fun content(content: JsonField<InterleavedContent>) = apply { this.content = content }

            /** A image content item */
            fun content(string: String) = content(InterleavedContent.ofString(string))

            /** A image content item */
            fun content(imageContentItem: InterleavedContent.ImageContentItem) =
                content(InterleavedContent.ofImageContentItem(imageContentItem))

            /** A text content item */
            fun content(textContentItem: InterleavedContent.TextContentItem) =
                content(InterleavedContent.ofTextContentItem(textContentItem))

            /** A image content item */
            fun contentOfItems(items: List<InterleavedContentItem>) =
                content(InterleavedContent.ofItems(items))

            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

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

            fun build(): Chunk =
                Chunk(
                    checkRequired("content", content),
                    checkRequired("metadata", metadata),
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class Metadata
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Metadata = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

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

            return /* spotless:off */ other is Chunk && content == other.content && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(content, metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Chunk{content=$content, metadata=$metadata, additionalProperties=$additionalProperties}"
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
