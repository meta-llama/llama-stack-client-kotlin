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

/** A image content item */
@JsonDeserialize(using = InterleavedContent.Deserializer::class)
@JsonSerialize(using = InterleavedContent.Serializer::class)
class InterleavedContent
private constructor(
    private val string: String? = null,
    private val imageContentItem: ImageContentItem? = null,
    private val textContentItem: TextContentItem? = null,
    private val items: List<InterleavedContentItem>? = null,
    private val _json: JsonValue? = null,
) {

    fun string(): String? = string

    /** A image content item */
    fun imageContentItem(): ImageContentItem? = imageContentItem

    /** A text content item */
    fun textContentItem(): TextContentItem? = textContentItem

    fun items(): List<InterleavedContentItem>? = items

    fun isString(): Boolean = string != null

    fun isImageContentItem(): Boolean = imageContentItem != null

    fun isTextContentItem(): Boolean = textContentItem != null

    fun isItems(): Boolean = items != null

    fun asString(): String = string.getOrThrow("string")

    /** A image content item */
    fun asImageContentItem(): ImageContentItem = imageContentItem.getOrThrow("imageContentItem")

    /** A text content item */
    fun asTextContentItem(): TextContentItem = textContentItem.getOrThrow("textContentItem")

    fun asItems(): List<InterleavedContentItem> = items.getOrThrow("items")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            string != null -> visitor.visitString(string)
            imageContentItem != null -> visitor.visitImageContentItem(imageContentItem)
            textContentItem != null -> visitor.visitTextContentItem(textContentItem)
            items != null -> visitor.visitItems(items)
            else -> visitor.unknown(_json)
        }
    }

    private var validated: Boolean = false

    fun validate(): InterleavedContent = apply {
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

                override fun visitItems(items: List<InterleavedContentItem>) {
                    items.forEach { it.validate() }
                }
            }
        )
        validated = true
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InterleavedContent && string == other.string && imageContentItem == other.imageContentItem && textContentItem == other.textContentItem && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, imageContentItem, textContentItem, items) /* spotless:on */

    override fun toString(): String =
        when {
            string != null -> "InterleavedContent{string=$string}"
            imageContentItem != null -> "InterleavedContent{imageContentItem=$imageContentItem}"
            textContentItem != null -> "InterleavedContent{textContentItem=$textContentItem}"
            items != null -> "InterleavedContent{items=$items}"
            _json != null -> "InterleavedContent{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid InterleavedContent")
        }

    companion object {

        fun ofString(string: String) = InterleavedContent(string = string)

        /** A image content item */
        fun ofImageContentItem(imageContentItem: ImageContentItem) =
            InterleavedContent(imageContentItem = imageContentItem)

        /** A text content item */
        fun ofTextContentItem(textContentItem: TextContentItem) =
            InterleavedContent(textContentItem = textContentItem)

        fun ofItems(items: List<InterleavedContentItem>) = InterleavedContent(items = items)
    }

    /**
     * An interface that defines how to map each variant of [InterleavedContent] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        fun visitString(string: String): T

        /** A image content item */
        fun visitImageContentItem(imageContentItem: ImageContentItem): T

        /** A text content item */
        fun visitTextContentItem(textContentItem: TextContentItem): T

        fun visitItems(items: List<InterleavedContentItem>): T

        /**
         * Maps an unknown variant of [InterleavedContent] to a value of type [T].
         *
         * An instance of [InterleavedContent] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws LlamaStackClientInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LlamaStackClientInvalidDataException("Unknown InterleavedContent: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<InterleavedContent>(InterleavedContent::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): InterleavedContent {
            val json = JsonValue.fromJsonNode(node)

            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                return InterleavedContent(string = it, _json = json)
            }
            tryDeserialize(node, jacksonTypeRef<ImageContentItem>()) { it.validate() }
                ?.let {
                    return InterleavedContent(imageContentItem = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<TextContentItem>()) { it.validate() }
                ?.let {
                    return InterleavedContent(textContentItem = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<List<InterleavedContentItem>>()) {
                    it.forEach { it.validate() }
                }
                ?.let {
                    return InterleavedContent(items = it, _json = json)
                }

            return InterleavedContent(_json = json)
        }
    }

    internal class Serializer : BaseSerializer<InterleavedContent>(InterleavedContent::class) {

        override fun serialize(
            value: InterleavedContent,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.string != null -> generator.writeObject(value.string)
                value.imageContentItem != null -> generator.writeObject(value.imageContentItem)
                value.textContentItem != null -> generator.writeObject(value.textContentItem)
                value.items != null -> generator.writeObject(value.items)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid InterleavedContent")
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

        /** Image as a base64 encoded string or an URL */
        fun image(): Image = image.getRequired("image")

        /** Discriminator type of the content item. Always "image" */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /** Image as a base64 encoded string or an URL */
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
                    throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
                }
            }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

            /** Image as a base64 encoded string or an URL */
            fun image(image: JsonField<Image>) = apply { this.image = image }

            /** Discriminator type of the content item. Always "image" */
            fun type(type: JsonValue) = apply { this.type = type }

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
            @JsonProperty("url") @ExcludeMissing private val url: JsonField<Url> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** base64 encoded image data as string */
            fun data(): String? = data.getNullable("data")

            /**
             * A URL of the image or data URL in the format of data:image/{type};base64,{data}. Note
             * that URL could have length limits.
             */
            fun url(): Url? = url.getNullable("url")

            /** base64 encoded image data as string */
            @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<String> = data

            /**
             * A URL of the image or data URL in the format of data:image/{type};base64,{data}. Note
             * that URL could have length limits.
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

                /** base64 encoded image data as string */
                fun data(data: JsonField<String>) = apply { this.data = data }

                /**
                 * A URL of the image or data URL in the format of data:image/{type};base64,{data}.
                 * Note that URL could have length limits.
                 */
                fun url(url: Url) = url(JsonField.of(url))

                /**
                 * A URL of the image or data URL in the format of data:image/{type};base64,{data}.
                 * Note that URL could have length limits.
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
             * A URL of the image or data URL in the format of data:image/{type};base64,{data}. Note
             * that URL could have length limits.
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

                fun uri(): String = uri.getRequired("uri")

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

        /** Text content */
        fun text(): String = text.getRequired("text")

        /** Discriminator type of the content item. Always "text" */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /** Text content */
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
                    throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
                }
            }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

            /** Text content */
            fun text(text: JsonField<String>) = apply { this.text = text }

            /** Discriminator type of the content item. Always "text" */
            fun type(type: JsonValue) = apply { this.type = type }

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
}
