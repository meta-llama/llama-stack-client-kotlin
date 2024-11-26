// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

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
import com.llama.llamastack.core.BaseDeserializer
import com.llama.llamastack.core.BaseSerializer
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

@JsonDeserialize(builder = QueryDocumentsResponse.Builder::class)
@NoAutoDetect
class QueryDocumentsResponse
private constructor(
    private val chunks: JsonField<List<Chunk>>,
    private val scores: JsonField<List<Double>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun chunks(): List<Chunk> = chunks.getRequired("chunks")

    fun scores(): List<Double> = scores.getRequired("scores")

    @JsonProperty("chunks") @ExcludeMissing fun _chunks() = chunks

    @JsonProperty("scores") @ExcludeMissing fun _scores() = scores

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): QueryDocumentsResponse = apply {
        if (!validated) {
            chunks().forEach { it.validate() }
            scores()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var chunks: JsonField<List<Chunk>> = JsonMissing.of()
        private var scores: JsonField<List<Double>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(queryDocumentsResponse: QueryDocumentsResponse) = apply {
            this.chunks = queryDocumentsResponse.chunks
            this.scores = queryDocumentsResponse.scores
            additionalProperties(queryDocumentsResponse.additionalProperties)
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

        fun build(): QueryDocumentsResponse =
            QueryDocumentsResponse(
                chunks.map { it.toImmutable() },
                scores.map { it.toImmutable() },
                additionalProperties.toImmutable(),
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
                    additionalProperties.toImmutable(),
                )
        }

        @JsonDeserialize(using = Content.Deserializer::class)
        @JsonSerialize(using = Content.Serializer::class)
        class Content
        private constructor(
            private val string: String? = null,
            private val imageMedia: ImageMedia? = null,
            private val imageMediaArray: List<StringOrImageMediaUnion>? = null,
            private val _json: JsonValue? = null,
        ) {

            private var validated: Boolean = false

            fun string(): String? = string

            fun imageMedia(): ImageMedia? = imageMedia

            fun imageMediaArray(): List<StringOrImageMediaUnion>? = imageMediaArray

            fun isString(): Boolean = string != null

            fun isImageMedia(): Boolean = imageMedia != null

            fun isImageMediaArray(): Boolean = imageMediaArray != null

            fun asString(): String = string.getOrThrow("string")

            fun asImageMedia(): ImageMedia = imageMedia.getOrThrow("imageMedia")

            fun asImageMediaArray(): List<StringOrImageMediaUnion> =
                imageMediaArray.getOrThrow("imageMediaArray")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    string != null -> visitor.visitString(string)
                    imageMedia != null -> visitor.visitImageMedia(imageMedia)
                    imageMediaArray != null -> visitor.visitImageMediaArray(imageMediaArray)
                    else -> visitor.unknown(_json)
                }
            }

            fun validate(): Content = apply {
                if (!validated) {
                    if (string == null && imageMedia == null && imageMediaArray == null) {
                        throw LlamaStackClientInvalidDataException("Unknown Content: $_json")
                    }
                    imageMedia?.validate()
                    validated = true
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Content && string == other.string && imageMedia == other.imageMedia && imageMediaArray == other.imageMediaArray /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, imageMedia, imageMediaArray) /* spotless:on */

            override fun toString(): String =
                when {
                    string != null -> "Content{string=$string}"
                    imageMedia != null -> "Content{imageMedia=$imageMedia}"
                    imageMediaArray != null -> "Content{imageMediaArray=$imageMediaArray}"
                    _json != null -> "Content{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Content")
                }

            companion object {

                fun ofString(string: String) = Content(string = string)

                fun ofImageMedia(imageMedia: ImageMedia) = Content(imageMedia = imageMedia)

                fun ofImageMediaArray(imageMediaArray: List<StringOrImageMediaUnion>) =
                    Content(imageMediaArray = imageMediaArray)
            }

            interface Visitor<out T> {

                fun visitString(string: String): T

                fun visitImageMedia(imageMedia: ImageMedia): T

                fun visitImageMediaArray(imageMediaArray: List<StringOrImageMediaUnion>): T

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
                    tryDeserialize(node, jacksonTypeRef<ImageMedia>()) { it.validate() }
                        ?.let {
                            return Content(imageMedia = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<List<StringOrImageMediaUnion>>())?.let {
                        return Content(imageMediaArray = it, _json = json)
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
                        value.imageMedia != null -> generator.writeObject(value.imageMedia)
                        value.imageMediaArray != null ->
                            generator.writeObject(value.imageMediaArray)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Content")
                    }
                }
            }

            @JsonDeserialize(using = StringOrImageMediaUnion.Deserializer::class)
            @JsonSerialize(using = StringOrImageMediaUnion.Serializer::class)
            class StringOrImageMediaUnion
            private constructor(
                private val string: String? = null,
                private val imageMedia: ImageMedia? = null,
                private val _json: JsonValue? = null,
            ) {

                private var validated: Boolean = false

                fun string(): String? = string

                fun imageMedia(): ImageMedia? = imageMedia

                fun isString(): Boolean = string != null

                fun isImageMedia(): Boolean = imageMedia != null

                fun asString(): String = string.getOrThrow("string")

                fun asImageMedia(): ImageMedia = imageMedia.getOrThrow("imageMedia")

                fun _json(): JsonValue? = _json

                fun <T> accept(visitor: Visitor<T>): T {
                    return when {
                        string != null -> visitor.visitString(string)
                        imageMedia != null -> visitor.visitImageMedia(imageMedia)
                        else -> visitor.unknown(_json)
                    }
                }

                fun validate(): StringOrImageMediaUnion = apply {
                    if (!validated) {
                        if (string == null && imageMedia == null) {
                            throw LlamaStackClientInvalidDataException(
                                "Unknown StringOrImageMediaUnion: $_json"
                            )
                        }
                        imageMedia?.validate()
                        validated = true
                    }
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is StringOrImageMediaUnion && string == other.string && imageMedia == other.imageMedia /* spotless:on */
                }

                override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, imageMedia) /* spotless:on */

                override fun toString(): String =
                    when {
                        string != null -> "StringOrImageMediaUnion{string=$string}"
                        imageMedia != null -> "StringOrImageMediaUnion{imageMedia=$imageMedia}"
                        _json != null -> "StringOrImageMediaUnion{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid StringOrImageMediaUnion")
                    }

                companion object {

                    fun ofString(string: String) = StringOrImageMediaUnion(string = string)

                    fun ofImageMedia(imageMedia: ImageMedia) =
                        StringOrImageMediaUnion(imageMedia = imageMedia)
                }

                interface Visitor<out T> {

                    fun visitString(string: String): T

                    fun visitImageMedia(imageMedia: ImageMedia): T

                    fun unknown(json: JsonValue?): T {
                        throw LlamaStackClientInvalidDataException(
                            "Unknown StringOrImageMediaUnion: $json"
                        )
                    }
                }

                class Deserializer :
                    BaseDeserializer<StringOrImageMediaUnion>(StringOrImageMediaUnion::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): StringOrImageMediaUnion {
                        val json = JsonValue.fromJsonNode(node)

                        tryDeserialize(node, jacksonTypeRef<String>())?.let {
                            return StringOrImageMediaUnion(string = it, _json = json)
                        }
                        tryDeserialize(node, jacksonTypeRef<ImageMedia>()) { it.validate() }
                            ?.let {
                                return StringOrImageMediaUnion(imageMedia = it, _json = json)
                            }

                        return StringOrImageMediaUnion(_json = json)
                    }
                }

                class Serializer :
                    BaseSerializer<StringOrImageMediaUnion>(StringOrImageMediaUnion::class) {

                    override fun serialize(
                        value: StringOrImageMediaUnion,
                        generator: JsonGenerator,
                        provider: SerializerProvider
                    ) {
                        when {
                            value.string != null -> generator.writeObject(value.string)
                            value.imageMedia != null -> generator.writeObject(value.imageMedia)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid StringOrImageMediaUnion")
                        }
                    }
                }
            }
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
