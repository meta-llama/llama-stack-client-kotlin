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
@JsonDeserialize(using = InterleavedContentItem.Deserializer::class)
@JsonSerialize(using = InterleavedContentItem.Serializer::class)
class InterleavedContentItem
private constructor(
    private val image: ImageContentItem? = null,
    private val text: TextContentItem? = null,
    private val _json: JsonValue? = null,
) {

    /** A image content item */
    fun image(): ImageContentItem? = image

    /** A text content item */
    fun text(): TextContentItem? = text

    fun isImage(): Boolean = image != null

    fun isText(): Boolean = text != null

    /** A image content item */
    fun asImage(): ImageContentItem = image.getOrThrow("image")

    /** A text content item */
    fun asText(): TextContentItem = text.getOrThrow("text")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            image != null -> visitor.visitImage(image)
            text != null -> visitor.visitText(text)
            else -> visitor.unknown(_json)
        }
    }

    private var validated: Boolean = false

    fun validate(): InterleavedContentItem = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitImage(image: ImageContentItem) {
                    image.validate()
                }

                override fun visitText(text: TextContentItem) {
                    text.validate()
                }
            }
        )
        validated = true
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InterleavedContentItem && image == other.image && text == other.text /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(image, text) /* spotless:on */

    override fun toString(): String =
        when {
            image != null -> "InterleavedContentItem{image=$image}"
            text != null -> "InterleavedContentItem{text=$text}"
            _json != null -> "InterleavedContentItem{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid InterleavedContentItem")
        }

    companion object {

        /** A image content item */
        fun ofImage(image: ImageContentItem) = InterleavedContentItem(image = image)

        /** A text content item */
        fun ofText(text: TextContentItem) = InterleavedContentItem(text = text)
    }

    /**
     * An interface that defines how to map each variant of [InterleavedContentItem] to a value of
     * type [T].
     */
    interface Visitor<out T> {

        /** A image content item */
        fun visitImage(image: ImageContentItem): T

        /** A text content item */
        fun visitText(text: TextContentItem): T

        /**
         * Maps an unknown variant of [InterleavedContentItem] to a value of type [T].
         *
         * An instance of [InterleavedContentItem] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws LlamaStackClientInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LlamaStackClientInvalidDataException("Unknown InterleavedContentItem: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<InterleavedContentItem>(InterleavedContentItem::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): InterleavedContentItem {
            val json = JsonValue.fromJsonNode(node)
            val type = json.asObject()?.get("type")?.asString()

            when (type) {
                "image" -> {
                    tryDeserialize(node, jacksonTypeRef<ImageContentItem>()) { it.validate() }
                        ?.let {
                            return InterleavedContentItem(image = it, _json = json)
                        }
                }
                "text" -> {
                    tryDeserialize(node, jacksonTypeRef<TextContentItem>()) { it.validate() }
                        ?.let {
                            return InterleavedContentItem(text = it, _json = json)
                        }
                }
            }

            return InterleavedContentItem(_json = json)
        }
    }

    internal class Serializer :
        BaseSerializer<InterleavedContentItem>(InterleavedContentItem::class) {

        override fun serialize(
            value: InterleavedContentItem,
            generator: JsonGenerator,
            provider: SerializerProvider
        ) {
            when {
                value.image != null -> generator.writeObject(value.image)
                value.text != null -> generator.writeObject(value.text)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid InterleavedContentItem")
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

                fun build(): Image =
                    Image(
                        data,
                        url,
                        additionalProperties.toImmutable(),
                    )
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
