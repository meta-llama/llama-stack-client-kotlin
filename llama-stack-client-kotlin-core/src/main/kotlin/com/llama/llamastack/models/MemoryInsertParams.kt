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
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

class MemoryInsertParams
constructor(
    private val xLlamaStackClientVersion: String?,
    private val xLlamaStackProviderData: String?,
    private val body: MemoryInsertBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun xLlamaStackClientVersion(): String? = xLlamaStackClientVersion

    fun xLlamaStackProviderData(): String? = xLlamaStackProviderData

    fun bankId(): String = body.bankId()

    fun documents(): List<Document> = body.documents()

    fun ttlSeconds(): Long? = body.ttlSeconds()

    fun _bankId(): JsonField<String> = body._bankId()

    fun _documents(): JsonField<List<Document>> = body._documents()

    fun _ttlSeconds(): JsonField<Long> = body._ttlSeconds()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getBody(): MemoryInsertBody = body

    internal fun getHeaders(): Headers {
        val headers = Headers.builder()
        this.xLlamaStackClientVersion?.let {
            headers.put("X-LlamaStack-Client-Version", listOf(it.toString()))
        }
        this.xLlamaStackProviderData?.let {
            headers.put("X-LlamaStack-Provider-Data", listOf(it.toString()))
        }
        headers.putAll(additionalHeaders)
        return headers.build()
    }

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class MemoryInsertBody
    @JsonCreator
    internal constructor(
        @JsonProperty("bank_id")
        @ExcludeMissing
        private val bankId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("documents")
        @ExcludeMissing
        private val documents: JsonField<List<Document>> = JsonMissing.of(),
        @JsonProperty("ttl_seconds")
        @ExcludeMissing
        private val ttlSeconds: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun bankId(): String = bankId.getRequired("bank_id")

        fun documents(): List<Document> = documents.getRequired("documents")

        fun ttlSeconds(): Long? = ttlSeconds.getNullable("ttl_seconds")

        @JsonProperty("bank_id") @ExcludeMissing fun _bankId(): JsonField<String> = bankId

        @JsonProperty("documents")
        @ExcludeMissing
        fun _documents(): JsonField<List<Document>> = documents

        @JsonProperty("ttl_seconds") @ExcludeMissing fun _ttlSeconds(): JsonField<Long> = ttlSeconds

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): MemoryInsertBody = apply {
            if (validated) {
                return@apply
            }

            bankId()
            documents().forEach { it.validate() }
            ttlSeconds()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var bankId: JsonField<String>? = null
            private var documents: JsonField<MutableList<Document>>? = null
            private var ttlSeconds: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(memoryInsertBody: MemoryInsertBody) = apply {
                bankId = memoryInsertBody.bankId
                documents = memoryInsertBody.documents.map { it.toMutableList() }
                ttlSeconds = memoryInsertBody.ttlSeconds
                additionalProperties = memoryInsertBody.additionalProperties.toMutableMap()
            }

            fun bankId(bankId: String) = bankId(JsonField.of(bankId))

            fun bankId(bankId: JsonField<String>) = apply { this.bankId = bankId }

            fun documents(documents: List<Document>) = documents(JsonField.of(documents))

            fun documents(documents: JsonField<List<Document>>) = apply {
                this.documents = documents.map { it.toMutableList() }
            }

            fun addDocument(document: Document) = apply {
                documents =
                    (documents ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(document)
                    }
            }

            fun ttlSeconds(ttlSeconds: Long) = ttlSeconds(JsonField.of(ttlSeconds))

            fun ttlSeconds(ttlSeconds: JsonField<Long>) = apply { this.ttlSeconds = ttlSeconds }

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

            fun build(): MemoryInsertBody =
                MemoryInsertBody(
                    checkNotNull(bankId) { "`bankId` is required but was not set" },
                    checkNotNull(documents) { "`documents` is required but was not set" }
                        .map { it.toImmutable() },
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

        private var xLlamaStackClientVersion: String? = null
        private var xLlamaStackProviderData: String? = null
        private var body: MemoryInsertBody.Builder = MemoryInsertBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(memoryInsertParams: MemoryInsertParams) = apply {
            xLlamaStackClientVersion = memoryInsertParams.xLlamaStackClientVersion
            xLlamaStackProviderData = memoryInsertParams.xLlamaStackProviderData
            body = memoryInsertParams.body.toBuilder()
            additionalHeaders = memoryInsertParams.additionalHeaders.toBuilder()
            additionalQueryParams = memoryInsertParams.additionalQueryParams.toBuilder()
        }

        fun xLlamaStackClientVersion(xLlamaStackClientVersion: String?) = apply {
            this.xLlamaStackClientVersion = xLlamaStackClientVersion
        }

        fun xLlamaStackProviderData(xLlamaStackProviderData: String?) = apply {
            this.xLlamaStackProviderData = xLlamaStackProviderData
        }

        fun bankId(bankId: String) = apply { body.bankId(bankId) }

        fun bankId(bankId: JsonField<String>) = apply { body.bankId(bankId) }

        fun documents(documents: List<Document>) = apply { body.documents(documents) }

        fun documents(documents: JsonField<List<Document>>) = apply { body.documents(documents) }

        fun addDocument(document: Document) = apply { body.addDocument(document) }

        fun ttlSeconds(ttlSeconds: Long) = apply { body.ttlSeconds(ttlSeconds) }

        fun ttlSeconds(ttlSeconds: JsonField<Long>) = apply { body.ttlSeconds(ttlSeconds) }

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

        fun build(): MemoryInsertParams =
            MemoryInsertParams(
                xLlamaStackClientVersion,
                xLlamaStackProviderData,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class Document
    @JsonCreator
    private constructor(
        @JsonProperty("content")
        @ExcludeMissing
        private val content: JsonField<Content> = JsonMissing.of(),
        @JsonProperty("document_id")
        @ExcludeMissing
        private val documentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("mime_type")
        @ExcludeMissing
        private val mimeType: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun content(): Content = content.getRequired("content")

        fun documentId(): String = documentId.getRequired("document_id")

        fun metadata(): Metadata = metadata.getRequired("metadata")

        fun mimeType(): String? = mimeType.getNullable("mime_type")

        @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<Content> = content

        @JsonProperty("document_id")
        @ExcludeMissing
        fun _documentId(): JsonField<String> = documentId

        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        @JsonProperty("mime_type") @ExcludeMissing fun _mimeType(): JsonField<String> = mimeType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Document = apply {
            if (validated) {
                return@apply
            }

            content().validate()
            documentId()
            metadata().validate()
            mimeType()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var content: JsonField<Content>? = null
            private var documentId: JsonField<String>? = null
            private var metadata: JsonField<Metadata>? = null
            private var mimeType: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(document: Document) = apply {
                content = document.content
                documentId = document.documentId
                metadata = document.metadata
                mimeType = document.mimeType
                additionalProperties = document.additionalProperties.toMutableMap()
            }

            fun content(content: Content) = content(JsonField.of(content))

            fun content(content: JsonField<Content>) = apply { this.content = content }

            fun content(string: String) = content(Content.ofString(string))

            fun content(imageContentItem: Content.ImageContentItem) =
                content(Content.ofImageContentItem(imageContentItem))

            fun content(textContentItem: Content.TextContentItem) =
                content(Content.ofTextContentItem(textContentItem))

            fun contentOfInterleavedContentItems(
                interleavedContentItems: List<InterleavedContentItem>
            ) = content(Content.ofInterleavedContentItems(interleavedContentItems))

            fun content(url: Url) = content(Content.ofUrl(url))

            fun documentId(documentId: String) = documentId(JsonField.of(documentId))

            fun documentId(documentId: JsonField<String>) = apply { this.documentId = documentId }

            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            fun mimeType(mimeType: String) = mimeType(JsonField.of(mimeType))

            fun mimeType(mimeType: JsonField<String>) = apply { this.mimeType = mimeType }

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
            private val imageContentItem: ImageContentItem? = null,
            private val textContentItem: TextContentItem? = null,
            private val interleavedContentItems: List<InterleavedContentItem>? = null,
            private val url: Url? = null,
            private val _json: JsonValue? = null,
        ) {

            fun string(): String? = string

            fun imageContentItem(): ImageContentItem? = imageContentItem

            fun textContentItem(): TextContentItem? = textContentItem

            fun interleavedContentItems(): List<InterleavedContentItem>? = interleavedContentItems

            fun url(): Url? = url

            fun isString(): Boolean = string != null

            fun isImageContentItem(): Boolean = imageContentItem != null

            fun isTextContentItem(): Boolean = textContentItem != null

            fun isInterleavedContentItems(): Boolean = interleavedContentItems != null

            fun isUrl(): Boolean = url != null

            fun asString(): String = string.getOrThrow("string")

            fun asImageContentItem(): ImageContentItem =
                imageContentItem.getOrThrow("imageContentItem")

            fun asTextContentItem(): TextContentItem = textContentItem.getOrThrow("textContentItem")

            fun asInterleavedContentItems(): List<InterleavedContentItem> =
                interleavedContentItems.getOrThrow("interleavedContentItems")

            fun asUrl(): Url = url.getOrThrow("url")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    string != null -> visitor.visitString(string)
                    imageContentItem != null -> visitor.visitImageContentItem(imageContentItem)
                    textContentItem != null -> visitor.visitTextContentItem(textContentItem)
                    interleavedContentItems != null ->
                        visitor.visitInterleavedContentItems(interleavedContentItems)
                    url != null -> visitor.visitUrl(url)
                    else -> visitor.unknown(_json)
                }
            }

            private var validated: Boolean = false

            fun validate(): Content = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitString(string: String) {}

                        override fun visitImageContentItem(imageContentItem: ImageContentItem) {
                            imageContentItem.validate()
                        }

                        override fun visitTextContentItem(textContentItem: TextContentItem) {
                            textContentItem.validate()
                        }

                        override fun visitInterleavedContentItems(
                            interleavedContentItems: List<InterleavedContentItem>
                        ) {
                            interleavedContentItems.forEach { it.validate() }
                        }

                        override fun visitUrl(url: Url) {
                            url.validate()
                        }
                    }
                )
                validated = true
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Content && string == other.string && imageContentItem == other.imageContentItem && textContentItem == other.textContentItem && interleavedContentItems == other.interleavedContentItems && url == other.url /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, imageContentItem, textContentItem, interleavedContentItems, url) /* spotless:on */

            override fun toString(): String =
                when {
                    string != null -> "Content{string=$string}"
                    imageContentItem != null -> "Content{imageContentItem=$imageContentItem}"
                    textContentItem != null -> "Content{textContentItem=$textContentItem}"
                    interleavedContentItems != null ->
                        "Content{interleavedContentItems=$interleavedContentItems}"
                    url != null -> "Content{url=$url}"
                    _json != null -> "Content{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Content")
                }

            companion object {

                fun ofString(string: String) = Content(string = string)

                fun ofImageContentItem(imageContentItem: ImageContentItem) =
                    Content(imageContentItem = imageContentItem)

                fun ofTextContentItem(textContentItem: TextContentItem) =
                    Content(textContentItem = textContentItem)

                fun ofInterleavedContentItems(
                    interleavedContentItems: List<InterleavedContentItem>
                ) = Content(interleavedContentItems = interleavedContentItems)

                fun ofUrl(url: Url) = Content(url = url)
            }

            interface Visitor<out T> {

                fun visitString(string: String): T

                fun visitImageContentItem(imageContentItem: ImageContentItem): T

                fun visitTextContentItem(textContentItem: TextContentItem): T

                fun visitInterleavedContentItems(
                    interleavedContentItems: List<InterleavedContentItem>
                ): T

                fun visitUrl(url: Url): T

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
                    tryDeserialize(node, jacksonTypeRef<ImageContentItem>()) { it.validate() }
                        ?.let {
                            return Content(imageContentItem = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<TextContentItem>()) { it.validate() }
                        ?.let {
                            return Content(textContentItem = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<List<InterleavedContentItem>>()) {
                            it.forEach { it.validate() }
                        }
                        ?.let {
                            return Content(interleavedContentItems = it, _json = json)
                        }
                    tryDeserialize(node, jacksonTypeRef<Url>()) { it.validate() }
                        ?.let {
                            return Content(url = it, _json = json)
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
                        value.imageContentItem != null ->
                            generator.writeObject(value.imageContentItem)
                        value.textContentItem != null ->
                            generator.writeObject(value.textContentItem)
                        value.interleavedContentItems != null ->
                            generator.writeObject(value.interleavedContentItems)
                        value.url != null -> generator.writeObject(value.url)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Content")
                    }
                }
            }

            @NoAutoDetect
            class ImageContentItem
            @JsonCreator
            private constructor(
                @JsonProperty("type")
                @ExcludeMissing
                private val type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("data")
                @ExcludeMissing
                private val data: JsonField<String> = JsonMissing.of(),
                @JsonProperty("url")
                @ExcludeMissing
                private val url: JsonField<Url> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun type(): Type = type.getRequired("type")

                fun data(): String? = data.getNullable("data")

                fun url(): Url? = url.getNullable("url")

                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<String> = data

                @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<Url> = url

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): ImageContentItem = apply {
                    if (validated) {
                        return@apply
                    }

                    type()
                    data()
                    url()?.validate()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var type: JsonField<Type>? = null
                    private var data: JsonField<String> = JsonMissing.of()
                    private var url: JsonField<Url> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(imageContentItem: ImageContentItem) = apply {
                        type = imageContentItem.type
                        data = imageContentItem.data
                        url = imageContentItem.url
                        additionalProperties = imageContentItem.additionalProperties.toMutableMap()
                    }

                    fun type(type: Type) = type(JsonField.of(type))

                    fun type(type: JsonField<Type>) = apply { this.type = type }

                    fun data(data: String) = data(JsonField.of(data))

                    fun data(data: JsonField<String>) = apply { this.data = data }

                    fun url(url: Url) = url(JsonField.of(url))

                    fun url(url: JsonField<Url>) = apply { this.url = url }

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

                    fun build(): ImageContentItem =
                        ImageContentItem(
                            checkNotNull(type) { "`type` is required but was not set" },
                            data,
                            url,
                            additionalProperties.toImmutable(),
                        )
                }

                class Type
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val IMAGE = of("image")

                        fun of(value: String) = Type(JsonField.of(value))
                    }

                    enum class Known {
                        IMAGE,
                    }

                    enum class Value {
                        IMAGE,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            IMAGE -> Value.IMAGE
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            IMAGE -> Known.IMAGE
                            else ->
                                throw LlamaStackClientInvalidDataException("Unknown Type: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ImageContentItem && type == other.type && data == other.data && url == other.url && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(type, data, url, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ImageContentItem{type=$type, data=$data, url=$url, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class TextContentItem
            @JsonCreator
            private constructor(
                @JsonProperty("text")
                @ExcludeMissing
                private val text: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type")
                @ExcludeMissing
                private val type: JsonField<Type> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun text(): String = text.getRequired("text")

                fun type(): Type = type.getRequired("type")

                @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): TextContentItem = apply {
                    if (validated) {
                        return@apply
                    }

                    text()
                    type()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var text: JsonField<String>? = null
                    private var type: JsonField<Type>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(textContentItem: TextContentItem) = apply {
                        text = textContentItem.text
                        type = textContentItem.type
                        additionalProperties = textContentItem.additionalProperties.toMutableMap()
                    }

                    fun text(text: String) = text(JsonField.of(text))

                    fun text(text: JsonField<String>) = apply { this.text = text }

                    fun type(type: Type) = type(JsonField.of(type))

                    fun type(type: JsonField<Type>) = apply { this.type = type }

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

                    fun build(): TextContentItem =
                        TextContentItem(
                            checkNotNull(text) { "`text` is required but was not set" },
                            checkNotNull(type) { "`type` is required but was not set" },
                            additionalProperties.toImmutable(),
                        )
                }

                class Type
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val TEXT = of("text")

                        fun of(value: String) = Type(JsonField.of(value))
                    }

                    enum class Known {
                        TEXT,
                    }

                    enum class Value {
                        TEXT,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            TEXT -> Value.TEXT
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            TEXT -> Known.TEXT
                            else ->
                                throw LlamaStackClientInvalidDataException("Unknown Type: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is TextContentItem && text == other.text && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(text, type, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "TextContentItem{text=$text, type=$type, additionalProperties=$additionalProperties}"
            }
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

            class Builder {

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

        return /* spotless:off */ other is MemoryInsertParams && xLlamaStackClientVersion == other.xLlamaStackClientVersion && xLlamaStackProviderData == other.xLlamaStackProviderData && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(xLlamaStackClientVersion, xLlamaStackProviderData, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "MemoryInsertParams{xLlamaStackClientVersion=$xLlamaStackClientVersion, xLlamaStackProviderData=$xLlamaStackProviderData, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
