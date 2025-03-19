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
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

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
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * A image content item
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun content(): Content = content.getRequired("content")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun documentId(): String = documentId.getRequired("document_id")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun mimeType(): String? = mimeType.getNullable("mime_type")

    /**
     * Returns the raw JSON value of [content].
     *
     * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<Content> = content

    /**
     * Returns the raw JSON value of [documentId].
     *
     * Unlike [documentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("document_id") @ExcludeMissing fun _documentId(): JsonField<String> = documentId

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [mimeType].
     *
     * Unlike [mimeType], this method doesn't throw if the JSON field has an unexpected type.
     */
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

        /**
         * Returns a mutable builder for constructing an instance of [Document].
         *
         * The following fields are required:
         * ```kotlin
         * .content()
         * .documentId()
         * .metadata()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Document]. */
    class Builder internal constructor() {

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

        /** A image content item */
        fun content(content: Content) = content(JsonField.of(content))

        /**
         * Sets [Builder.content] to an arbitrary JSON value.
         *
         * You should usually call [Builder.content] with a well-typed [Content] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun content(content: JsonField<Content>) = apply { this.content = content }

        /** Alias for calling [content] with `Content.ofString(string)`. */
        fun content(string: String) = content(Content.ofString(string))

        /** Alias for calling [content] with `Content.ofImageContentItem(imageContentItem)`. */
        fun content(imageContentItem: Content.ImageContentItem) =
            content(Content.ofImageContentItem(imageContentItem))

        /** Alias for calling [content] with `Content.ofTextContentItem(textContentItem)`. */
        fun content(textContentItem: Content.TextContentItem) =
            content(Content.ofTextContentItem(textContentItem))

        /**
         * Alias for calling [content] with
         * `Content.ofInterleavedContentItems(interleavedContentItems)`.
         */
        fun contentOfInterleavedContentItems(
            interleavedContentItems: List<InterleavedContentItem>
        ) = content(Content.ofInterleavedContentItems(interleavedContentItems))

        /** Alias for calling [content] with `Content.ofUrl(url)`. */
        fun content(url: Content.Url) = content(Content.ofUrl(url))

        fun documentId(documentId: String) = documentId(JsonField.of(documentId))

        /**
         * Sets [Builder.documentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun documentId(documentId: JsonField<String>) = apply { this.documentId = documentId }

        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        fun mimeType(mimeType: String) = mimeType(JsonField.of(mimeType))

        /**
         * Sets [Builder.mimeType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mimeType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
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
                checkRequired("content", content),
                checkRequired("documentId", documentId),
                checkRequired("metadata", metadata),
                mimeType,
                additionalProperties.toImmutable(),
            )
    }

    /** A image content item */
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

        /** A image content item */
        fun imageContentItem(): ImageContentItem? = imageContentItem

        /** A text content item */
        fun textContentItem(): TextContentItem? = textContentItem

        fun interleavedContentItems(): List<InterleavedContentItem>? = interleavedContentItems

        fun url(): Url? = url

        fun isString(): Boolean = string != null

        fun isImageContentItem(): Boolean = imageContentItem != null

        fun isTextContentItem(): Boolean = textContentItem != null

        fun isInterleavedContentItems(): Boolean = interleavedContentItems != null

        fun isUrl(): Boolean = url != null

        fun asString(): String = string.getOrThrow("string")

        /** A image content item */
        fun asImageContentItem(): ImageContentItem = imageContentItem.getOrThrow("imageContentItem")

        /** A text content item */
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

            /** A image content item */
            fun ofImageContentItem(imageContentItem: ImageContentItem) =
                Content(imageContentItem = imageContentItem)

            /** A text content item */
            fun ofTextContentItem(textContentItem: TextContentItem) =
                Content(textContentItem = textContentItem)

            fun ofInterleavedContentItems(interleavedContentItems: List<InterleavedContentItem>) =
                Content(interleavedContentItems = interleavedContentItems)

            fun ofUrl(url: Url) = Content(url = url)
        }

        /**
         * An interface that defines how to map each variant of [Content] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitString(string: String): T

            /** A image content item */
            fun visitImageContentItem(imageContentItem: ImageContentItem): T

            /** A text content item */
            fun visitTextContentItem(textContentItem: TextContentItem): T

            fun visitInterleavedContentItems(
                interleavedContentItems: List<InterleavedContentItem>
            ): T

            fun visitUrl(url: Url): T

            /**
             * Maps an unknown variant of [Content] to a value of type [T].
             *
             * An instance of [Content] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws LlamaStackClientInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown Content: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Content>(Content::class) {

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

        internal class Serializer : BaseSerializer<Content>(Content::class) {

            override fun serialize(
                value: Content,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.imageContentItem != null -> generator.writeObject(value.imageContentItem)
                    value.textContentItem != null -> generator.writeObject(value.textContentItem)
                    value.interleavedContentItems != null ->
                        generator.writeObject(value.interleavedContentItems)
                    value.url != null -> generator.writeObject(value.url)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Content")
                }
            }
        }

        /** A image content item */
        @NoAutoDetect
        class ImageContentItem
        @JsonCreator
        private constructor(
            @JsonProperty("image")
            @ExcludeMissing
            private val image: JsonField<Image> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing private val type: JsonValue = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * Image as a base64 encoded string or an URL
             *
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun image(): Image = image.getRequired("image")

            /**
             * Discriminator type of the content item. Always "image"
             *
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("image")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * Returns the raw JSON value of [image].
             *
             * Unlike [image], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("image") @ExcludeMissing fun _image(): JsonField<Image> = image

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): ImageContentItem = apply {
                if (validated) {
                    return@apply
                }

                image().validate()
                _type().let {
                    if (it != JsonValue.from("image")) {
                        throw LlamaStackClientInvalidDataException(
                            "'type' is invalid, received $it"
                        )
                    }
                }
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [ImageContentItem].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .image()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [ImageContentItem]. */
            class Builder internal constructor() {

                private var image: JsonField<Image>? = null
                private var type: JsonValue = JsonValue.from("image")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(imageContentItem: ImageContentItem) = apply {
                    image = imageContentItem.image
                    type = imageContentItem.type
                    additionalProperties = imageContentItem.additionalProperties.toMutableMap()
                }

                /** Image as a base64 encoded string or an URL */
                fun image(image: Image) = image(JsonField.of(image))

                /**
                 * Sets [Builder.image] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.image] with a well-typed [Image] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun image(image: JsonField<Image>) = apply { this.image = image }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("image")
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

                fun build(): ImageContentItem =
                    ImageContentItem(
                        checkRequired("image", image),
                        type,
                        additionalProperties.toImmutable(),
                    )
            }

            /** Image as a base64 encoded string or an URL */
            @NoAutoDetect
            class Image
            @JsonCreator
            private constructor(
                @JsonProperty("data")
                @ExcludeMissing
                private val data: JsonField<String> = JsonMissing.of(),
                @JsonProperty("url")
                @ExcludeMissing
                private val url: JsonField<Url> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /**
                 * base64 encoded image data as string
                 *
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun data(): String? = data.getNullable("data")

                /**
                 * A URL of the image or data URL in the format of data:image/{type};base64,{data}.
                 * Note that URL could have length limits.
                 *
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun url(): Url? = url.getNullable("url")

                /**
                 * Returns the raw JSON value of [data].
                 *
                 * Unlike [data], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<String> = data

                /**
                 * Returns the raw JSON value of [url].
                 *
                 * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<Url> = url

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Image = apply {
                    if (validated) {
                        return@apply
                    }

                    data()
                    url()?.validate()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Image]. */
                    fun builder() = Builder()
                }

                /** A builder for [Image]. */
                class Builder internal constructor() {

                    private var data: JsonField<String> = JsonMissing.of()
                    private var url: JsonField<Url> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(image: Image) = apply {
                        data = image.data
                        url = image.url
                        additionalProperties = image.additionalProperties.toMutableMap()
                    }

                    /** base64 encoded image data as string */
                    fun data(data: String) = data(JsonField.of(data))

                    /**
                     * Sets [Builder.data] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.data] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun data(data: JsonField<String>) = apply { this.data = data }

                    /**
                     * A URL of the image or data URL in the format of
                     * data:image/{type};base64,{data}. Note that URL could have length limits.
                     */
                    fun url(url: Url) = url(JsonField.of(url))

                    /**
                     * Sets [Builder.url] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.url] with a well-typed [Url] value instead.
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
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

                    fun build(): Image = Image(data, url, additionalProperties.toImmutable())
                }

                /**
                 * A URL of the image or data URL in the format of data:image/{type};base64,{data}.
                 * Note that URL could have length limits.
                 */
                @NoAutoDetect
                class Url
                @JsonCreator
                private constructor(
                    @JsonProperty("uri")
                    @ExcludeMissing
                    private val uri: JsonField<String> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /**
                     * @throws LlamaStackClientInvalidDataException if the JSON field has an
                     *   unexpected type or is unexpectedly missing or null (e.g. if the server
                     *   responded with an unexpected value).
                     */
                    fun uri(): String = uri.getRequired("uri")

                    /**
                     * Returns the raw JSON value of [uri].
                     *
                     * Unlike [uri], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("uri") @ExcludeMissing fun _uri(): JsonField<String> = uri

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Url = apply {
                        if (validated) {
                            return@apply
                        }

                        uri()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of [Url].
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .uri()
                         * ```
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [Url]. */
                    class Builder internal constructor() {

                        private var uri: JsonField<String>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(url: Url) = apply {
                            uri = url.uri
                            additionalProperties = url.additionalProperties.toMutableMap()
                        }

                        fun uri(uri: String) = uri(JsonField.of(uri))

                        /**
                         * Sets [Builder.uri] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.uri] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun uri(uri: JsonField<String>) = apply { this.uri = uri }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): Url =
                            Url(checkRequired("uri", uri), additionalProperties.toImmutable())
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Url && uri == other.uri && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(uri, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Url{uri=$uri, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Image && data == other.data && url == other.url && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(data, url, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Image{data=$data, url=$url, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ImageContentItem && image == other.image && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(image, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ImageContentItem{image=$image, type=$type, additionalProperties=$additionalProperties}"
        }

        /** A text content item */
        @NoAutoDetect
        class TextContentItem
        @JsonCreator
        private constructor(
            @JsonProperty("text")
            @ExcludeMissing
            private val text: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing private val type: JsonValue = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * Text content
             *
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun text(): String = text.getRequired("text")

            /**
             * Discriminator type of the content item. Always "text"
             *
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("text")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * Returns the raw JSON value of [text].
             *
             * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): TextContentItem = apply {
                if (validated) {
                    return@apply
                }

                text()
                _type().let {
                    if (it != JsonValue.from("text")) {
                        throw LlamaStackClientInvalidDataException(
                            "'type' is invalid, received $it"
                        )
                    }
                }
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [TextContentItem].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .text()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [TextContentItem]. */
            class Builder internal constructor() {

                private var text: JsonField<String>? = null
                private var type: JsonValue = JsonValue.from("text")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(textContentItem: TextContentItem) = apply {
                    text = textContentItem.text
                    type = textContentItem.type
                    additionalProperties = textContentItem.additionalProperties.toMutableMap()
                }

                /** Text content */
                fun text(text: String) = text(JsonField.of(text))

                /**
                 * Sets [Builder.text] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.text] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun text(text: JsonField<String>) = apply { this.text = text }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("text")
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

                fun build(): TextContentItem =
                    TextContentItem(
                        checkRequired("text", text),
                        type,
                        additionalProperties.toImmutable(),
                    )
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

        @NoAutoDetect
        class Url
        @JsonCreator
        private constructor(
            @JsonProperty("uri")
            @ExcludeMissing
            private val uri: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
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

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Url = apply {
                if (validated) {
                    return@apply
                }

                uri()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Url].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .uri()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Url]. */
            class Builder internal constructor() {

                private var uri: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(url: Url) = apply {
                    uri = url.uri
                    additionalProperties = url.additionalProperties.toMutableMap()
                }

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

                fun build(): Url =
                    Url(checkRequired("uri", uri), additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Url && uri == other.uri && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(uri, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Url{uri=$uri, additionalProperties=$additionalProperties}"
        }
    }

    @NoAutoDetect
    class Metadata
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
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
