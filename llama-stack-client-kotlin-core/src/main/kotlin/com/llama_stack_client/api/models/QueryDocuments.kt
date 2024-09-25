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
import com.llama_stack_client.api.core.JsonField
import com.llama_stack_client.api.core.JsonMissing
import com.llama_stack_client.api.core.JsonValue
import com.llama_stack_client.api.core.NoAutoDetect
import com.llama_stack_client.api.core.getOrThrow
import com.llama_stack_client.api.core.toUnmodifiable
import com.llama_stack_client.api.errors.LlamaStackClientInvalidDataException
import java.util.Objects

@JsonDeserialize(builder = QueryDocuments.Builder::class)
@NoAutoDetect
class QueryDocuments
private constructor(
    private val chunks: JsonField<List<Chunk>>,
    private val scores: JsonField<List<Double>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun chunks(): List<Chunk> = chunks.getRequired("chunks")

    fun scores(): List<Double> = scores.getRequired("scores")

    @JsonProperty("chunks") @ExcludeMissing fun _chunks() = chunks

    @JsonProperty("scores") @ExcludeMissing fun _scores() = scores

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): QueryDocuments = apply {
        if (!validated) {
            chunks().forEach { it.validate() }
            scores()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is QueryDocuments &&
            this.chunks == other.chunks &&
            this.scores == other.scores &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    chunks,
                    scores,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "QueryDocuments{chunks=$chunks, scores=$scores, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var chunks: JsonField<List<Chunk>> = JsonMissing.of()
        private var scores: JsonField<List<Double>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(queryDocuments: QueryDocuments) = apply {
            this.chunks = queryDocuments.chunks
            this.scores = queryDocuments.scores
            additionalProperties(queryDocuments.additionalProperties)
        }

        fun chunks(chunks: List<Chunk>) = chunks(JsonField.of(chunks))

        @JsonProperty("chunks")
        @ExcludeMissing
        fun chunks(chunks: JsonField<List<Chunk>>) = apply { this.chunks = chunks }

        fun scores(scores: List<Double>) = scores(JsonField.of(scores))

        @JsonProperty("scores")
        @ExcludeMissing
        fun scores(scores: JsonField<List<Double>>) = apply { this.scores = scores }

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

        fun build(): QueryDocuments =
            QueryDocuments(
                chunks.map { it.toUnmodifiable() },
                scores.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Chunk.Builder::class)
    @NoAutoDetect
    class Chunk
    private constructor(
        private val content: JsonField<Content>,
        private val documentId: JsonField<String>,
        private val tokenCount: JsonField<Long>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun content(): Content = content.getRequired("content")

        fun documentId(): String = documentId.getRequired("document_id")

        fun tokenCount(): Long = tokenCount.getRequired("token_count")

        @JsonProperty("content") @ExcludeMissing fun _content() = content

        @JsonProperty("document_id") @ExcludeMissing fun _documentId() = documentId

        @JsonProperty("token_count") @ExcludeMissing fun _tokenCount() = tokenCount

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Chunk = apply {
            if (!validated) {
                content()
                documentId()
                tokenCount()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Chunk &&
                this.content == other.content &&
                this.documentId == other.documentId &&
                this.tokenCount == other.tokenCount &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        content,
                        documentId,
                        tokenCount,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Chunk{content=$content, documentId=$documentId, tokenCount=$tokenCount, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var content: JsonField<Content> = JsonMissing.of()
            private var documentId: JsonField<String> = JsonMissing.of()
            private var tokenCount: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(chunk: Chunk) = apply {
                this.content = chunk.content
                this.documentId = chunk.documentId
                this.tokenCount = chunk.tokenCount
                additionalProperties(chunk.additionalProperties)
            }

            fun content(content: Content) = content(JsonField.of(content))

            @JsonProperty("content")
            @ExcludeMissing
            fun content(content: JsonField<Content>) = apply { this.content = content }

            fun documentId(documentId: String) = documentId(JsonField.of(documentId))

            @JsonProperty("document_id")
            @ExcludeMissing
            fun documentId(documentId: JsonField<String>) = apply { this.documentId = documentId }

            fun tokenCount(tokenCount: Long) = tokenCount(JsonField.of(tokenCount))

            @JsonProperty("token_count")
            @ExcludeMissing
            fun tokenCount(tokenCount: JsonField<Long>) = apply { this.tokenCount = tokenCount }

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

            fun build(): Chunk =
                Chunk(
                    content,
                    documentId,
                    tokenCount,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(using = Content.Deserializer::class)
        @JsonSerialize(using = Content.Serializer::class)
        class Content
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

            fun validate(): Content = apply {
                if (!validated) {
                    if (string == null && strings == null) {
                        throw LlamaStackClientInvalidDataException("Unknown Content: $_json")
                    }
                    validated = true
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Content &&
                    this.string == other.string &&
                    this.strings == other.strings
            }

            override fun hashCode(): Int {
                return Objects.hash(string, strings)
            }

            override fun toString(): String {
                return when {
                    string != null -> "Content{string=$string}"
                    strings != null -> "Content{strings=$strings}"
                    _json != null -> "Content{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Content")
                }
            }

            companion object {

                fun ofString(string: String) = Content(string = string)

                fun ofStrings(strings: List<String>) = Content(strings = strings)
            }

            interface Visitor<out T> {

                fun visitString(string: String): T

                fun visitStrings(strings: List<String>): T

                fun unknown(json: JsonValue?): T {
                    throw LlamaStackClientInvalidDataException("Unknown Content: $json")
                }
            }

            class Deserializer : BaseDeserializer<Content>(Content::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Content {
                    val json = JsonValue.fromJsonNode(node)
                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                        return Content(string = it, _json = json)
                    }
                    tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                        return Content(strings = it, _json = json)
                    }

                    return Content(_json = json)
                }
            }

            class Serializer : BaseSerializer<Content>(Content::class) {

                override fun serialize(
                    value: Content,
                    generator: JsonGenerator,
                    provider: SerializerProvider
                ) {
                    when {
                        value.string != null -> generator.writeObject(value.string)
                        value.strings != null -> generator.writeObject(value.strings)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Content")
                    }
                }
            }
        }
    }
}
