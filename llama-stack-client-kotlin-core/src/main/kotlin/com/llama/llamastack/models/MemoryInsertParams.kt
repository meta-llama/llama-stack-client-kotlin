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
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import com.llama.llamastack.models.*
import java.util.Objects

class MemoryInsertParams
constructor(
    private val bankId: String,
    private val documents: List<Document>,
    private val ttlSeconds: Long?,
    private val xLlamaStackProviderData: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun bankId(): String = bankId

    fun documents(): List<Document> = documents

    fun ttlSeconds(): Long? = ttlSeconds

    fun xLlamaStackProviderData(): String? = xLlamaStackProviderData

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    internal fun getBody(): MemoryInsertBody {
        return MemoryInsertBody(
            bankId,
            documents,
            ttlSeconds,
            additionalBodyProperties,
        )
    }

    internal fun getHeaders(): Headers {
        val headers = Headers.builder()
        this.xLlamaStackProviderData?.let {
            headers.put("X-LlamaStack-ProviderData", listOf(it.toString()))
        }
        headers.putAll(additionalHeaders)
        return headers.build()
    }

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = MemoryInsertBody.Builder::class)
    @NoAutoDetect
    class MemoryInsertBody
    internal constructor(
        private val bankId: String?,
        private val documents: List<Document>?,
        private val ttlSeconds: Long?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("bank_id") fun bankId(): String? = bankId

        @JsonProperty("documents") fun documents(): List<Document>? = documents

        @JsonProperty("ttl_seconds") fun ttlSeconds(): Long? = ttlSeconds

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var bankId: String? = null
            private var documents: List<Document>? = null
            private var ttlSeconds: Long? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(memoryInsertBody: MemoryInsertBody) = apply {
                this.bankId = memoryInsertBody.bankId
                this.documents = memoryInsertBody.documents
                this.ttlSeconds = memoryInsertBody.ttlSeconds
                additionalProperties(memoryInsertBody.additionalProperties)
            }

            @JsonProperty("bank_id") fun bankId(bankId: String) = apply { this.bankId = bankId }

            @JsonProperty("documents")
            fun documents(documents: List<Document>) = apply { this.documents = documents }

            @JsonProperty("ttl_seconds")
            fun ttlSeconds(ttlSeconds: Long) = apply { this.ttlSeconds = ttlSeconds }

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

            fun build(): MemoryInsertBody =
                MemoryInsertBody(
                    checkNotNull(bankId) { "`bankId` is required but was not set" },
                    checkNotNull(documents) { "`documents` is required but was not set" }
                        .toImmutable(),
                    ttlSeconds,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is MemoryInsertBody && bankId == other.bankId && documents == other.documents && ttlSeconds == other.ttlSeconds && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(bankId, documents, ttlSeconds, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "MemoryInsertBody{bankId=$bankId, documents=$documents, ttlSeconds=$ttlSeconds, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var bankId: String? = null
        private var documents: MutableList<Document> = mutableListOf()
        private var ttlSeconds: Long? = null
        private var xLlamaStackProviderData: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(memoryInsertParams: MemoryInsertParams) = apply {
            bankId = memoryInsertParams.bankId
            documents = memoryInsertParams.documents.toMutableList()
            ttlSeconds = memoryInsertParams.ttlSeconds
            xLlamaStackProviderData = memoryInsertParams.xLlamaStackProviderData
            additionalHeaders = memoryInsertParams.additionalHeaders.toBuilder()
            additionalQueryParams = memoryInsertParams.additionalQueryParams.toBuilder()
            additionalBodyProperties = memoryInsertParams.additionalBodyProperties.toMutableMap()
        }

        fun bankId(bankId: String) = apply { this.bankId = bankId }

        fun documents(documents: List<Document>) = apply {
            this.documents.clear()
            this.documents.addAll(documents)
        }

        fun addDocument(document: Document) = apply { this.documents.add(document) }

        fun ttlSeconds(ttlSeconds: Long) = apply { this.ttlSeconds = ttlSeconds }

        fun xLlamaStackProviderData(xLlamaStackProviderData: String) = apply {
            this.xLlamaStackProviderData = xLlamaStackProviderData
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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): MemoryInsertParams =
            MemoryInsertParams(
                checkNotNull(bankId) { "`bankId` is required but was not set" },
                documents.toImmutable(),
                ttlSeconds,
                xLlamaStackProviderData,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = Document.Builder::class)
    @NoAutoDetect
    class Document
    private constructor(
        private val content: Content?,
        private val documentId: String?,
        private val metadata: Metadata?,
        private val mimeType: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("content") fun content(): Content? = content

        @JsonProperty("document_id") fun documentId(): String? = documentId

        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        @JsonProperty("mime_type") fun mimeType(): String? = mimeType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var content: Content? = null
            private var documentId: String? = null
            private var metadata: Metadata? = null
            private var mimeType: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(document: Document) = apply {
                this.content = document.content
                this.documentId = document.documentId
                this.metadata = document.metadata
                this.mimeType = document.mimeType
                additionalProperties(document.additionalProperties)
            }

            @JsonProperty("content")
            fun content(content: Content) = apply { this.content = content }

            @JsonProperty("document_id")
            fun documentId(documentId: String) = apply { this.documentId = documentId }

            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            @JsonProperty("mime_type")
            fun mimeType(mimeType: String) = apply { this.mimeType = mimeType }

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

            fun build(): Document =
                Document(
                    checkNotNull(content) { "`content` is required but was not set" },
                    checkNotNull(documentId) { "`documentId` is required but was not set" },
                    checkNotNull(metadata) { "`metadata` is required but was not set" },
                    mimeType,
                    additionalProperties.toImmutable(),
                )
        }

        @JsonDeserialize(using = Content.Deserializer::class)
        @JsonSerialize(using = Content.Serializer::class)
        class Content
        private constructor(
            private val string: String? = null,
            private val imageMedia: ImageMedia? = null,
            private val contentArray: List<StringOrImageMediaUnion>? = null,
            private val _json: JsonValue? = null,
        ) {

            private var validated: Boolean = false

            fun string(): String? = string

            fun imageMedia(): ImageMedia? = imageMedia

            fun contentArray(): List<StringOrImageMediaUnion>? = contentArray

            fun isString(): Boolean = string != null

            fun isImageMedia(): Boolean = imageMedia != null

            fun isContentArray(): Boolean = contentArray != null

            fun asString(): String = string.getOrThrow("string")

            fun asImageMedia(): ImageMedia = imageMedia.getOrThrow("imageMedia")

            fun asContentArray(): List<StringOrImageMediaUnion> =
                contentArray.getOrThrow("contentArray")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    string != null -> visitor.visitString(string)
                    imageMedia != null -> visitor.visitImageMedia(imageMedia)
                    contentArray != null -> visitor.visitContentArray(contentArray)
                    else -> visitor.unknown(_json)
                }
            }

            fun validate(): Content = apply {
                if (!validated) {
                    if (string == null && imageMedia == null && contentArray == null) {
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

                return /* spotless:off */ other is Content && string == other.string && imageMedia == other.imageMedia && contentArray == other.contentArray /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, imageMedia, contentArray) /* spotless:on */

            override fun toString(): String =
                when {
                    string != null -> "Content{string=$string}"
                    imageMedia != null -> "Content{imageMedia=$imageMedia}"
                    contentArray != null -> "Content{contentArray=$contentArray}"
                    _json != null -> "Content{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Content")
                }

            companion object {

                fun ofString(string: String) = Content(string = string)

                fun ofImageMedia(imageMedia: ImageMedia) = Content(imageMedia = imageMedia)

                fun ofContentArray(contentArray: List<StringOrImageMediaUnion>) =
                    Content(contentArray = contentArray)
            }

            interface Visitor<out T> {

                fun visitString(string: String): T

                fun visitImageMedia(imageMedia: ImageMedia): T

                fun visitContentArray(contentArray: List<StringOrImageMediaUnion>): T

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
                        return Content(contentArray = it, _json = json)
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
                        value.contentArray != null -> generator.writeObject(value.contentArray)
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

        @JsonDeserialize(builder = Metadata.Builder::class)
        @NoAutoDetect
        class Metadata
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(metadata: Metadata) = apply {
                    additionalProperties(metadata.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
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

            return /* spotless:off */ other is Document && content == other.content && documentId == other.documentId && metadata == other.metadata && mimeType == other.mimeType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(content, documentId, metadata, mimeType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Document{content=$content, documentId=$documentId, metadata=$metadata, mimeType=$mimeType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is MemoryInsertParams && bankId == other.bankId && documents == other.documents && ttlSeconds == other.ttlSeconds && xLlamaStackProviderData == other.xLlamaStackProviderData && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(bankId, documents, ttlSeconds, xLlamaStackProviderData, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "MemoryInsertParams{bankId=$bankId, documents=$documents, ttlSeconds=$ttlSeconds, xLlamaStackProviderData=$xLlamaStackProviderData, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
