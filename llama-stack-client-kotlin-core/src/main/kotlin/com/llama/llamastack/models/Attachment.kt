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
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

@NoAutoDetect
class Attachment
@JsonCreator
private constructor(
    @JsonProperty("content")
    @ExcludeMissing
    private val content: JsonField<Content> = JsonMissing.of(),
    @JsonProperty("mime_type")
    @ExcludeMissing
    private val mimeType: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun content(): Content = content.getRequired("content")

    fun mimeType(): String = mimeType.getRequired("mime_type")

    @JsonProperty("content") @ExcludeMissing fun _content() = content

    @JsonProperty("mime_type") @ExcludeMissing fun _mimeType() = mimeType

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Attachment = apply {
        if (!validated) {
            content()
            mimeType()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var content: JsonField<Content> = JsonMissing.of()
        private var mimeType: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(attachment: Attachment) = apply {
            content = attachment.content
            mimeType = attachment.mimeType
            additionalProperties = attachment.additionalProperties.toMutableMap()
        }

        fun content(content: Content) = content(JsonField.of(content))

        fun content(content: JsonField<Content>) = apply { this.content = content }

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

        fun build(): Attachment =
            Attachment(
                content,
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
        private val contentArray: List<InterleavedContentItem>? = null,
        private val url: Url? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun string(): String? = string

        fun imageContentItem(): ImageContentItem? = imageContentItem

        fun textContentItem(): TextContentItem? = textContentItem

        fun contentArray(): List<InterleavedContentItem>? = contentArray

        fun url(): Url? = url

        fun isString(): Boolean = string != null

        fun isImageContentItem(): Boolean = imageContentItem != null

        fun isTextContentItem(): Boolean = textContentItem != null

        fun isContentArray(): Boolean = contentArray != null

        fun isUrl(): Boolean = url != null

        fun asString(): String = string.getOrThrow("string")

        fun asImageContentItem(): ImageContentItem = imageContentItem.getOrThrow("imageContentItem")

        fun asTextContentItem(): TextContentItem = textContentItem.getOrThrow("textContentItem")

        fun asContentArray(): List<InterleavedContentItem> = contentArray.getOrThrow("contentArray")

        fun asUrl(): Url = url.getOrThrow("url")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                string != null -> visitor.visitString(string)
                imageContentItem != null -> visitor.visitImageContentItem(imageContentItem)
                textContentItem != null -> visitor.visitTextContentItem(textContentItem)
                contentArray != null -> visitor.visitContentArray(contentArray)
                url != null -> visitor.visitUrl(url)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): Content = apply {
            if (!validated) {
                if (
                    string == null &&
                        imageContentItem == null &&
                        textContentItem == null &&
                        contentArray == null &&
                        url == null
                ) {
                    throw LlamaStackClientInvalidDataException("Unknown Content: $_json")
                }
                imageContentItem?.validate()
                textContentItem?.validate()
                url?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Content && string == other.string && imageContentItem == other.imageContentItem && textContentItem == other.textContentItem && contentArray == other.contentArray && url == other.url /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, imageContentItem, textContentItem, contentArray, url) /* spotless:on */

        override fun toString(): String =
            when {
                string != null -> "Content{string=$string}"
                imageContentItem != null -> "Content{imageContentItem=$imageContentItem}"
                textContentItem != null -> "Content{textContentItem=$textContentItem}"
                contentArray != null -> "Content{contentArray=$contentArray}"
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

            fun ofContentArray(contentArray: List<InterleavedContentItem>) =
                Content(contentArray = contentArray)

            fun ofUrl(url: Url) = Content(url = url)
        }

        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitImageContentItem(imageContentItem: ImageContentItem): T

            fun visitTextContentItem(textContentItem: TextContentItem): T

            fun visitContentArray(contentArray: List<InterleavedContentItem>): T

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
                tryDeserialize(node, jacksonTypeRef<List<InterleavedContentItem>>())?.let {
                    return Content(contentArray = it, _json = json)
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
                    value.imageContentItem != null -> generator.writeObject(value.imageContentItem)
                    value.textContentItem != null -> generator.writeObject(value.textContentItem)
                    value.contentArray != null -> generator.writeObject(value.contentArray)
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
            @JsonProperty("data")
            @ExcludeMissing
            private val data: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("url") @ExcludeMissing private val url: JsonField<Url> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun data(): String? = data.getNullable("data")

            fun type(): Type = type.getRequired("type")

            fun url(): Url? = url.getNullable("url")

            @JsonProperty("data") @ExcludeMissing fun _data() = data

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonProperty("url") @ExcludeMissing fun _url() = url

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): ImageContentItem = apply {
                if (!validated) {
                    data()
                    type()
                    url()?.validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var data: JsonField<String> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var url: JsonField<Url> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(imageContentItem: ImageContentItem) = apply {
                    data = imageContentItem.data
                    type = imageContentItem.type
                    url = imageContentItem.url
                    additionalProperties = imageContentItem.additionalProperties.toMutableMap()
                }

                fun data(data: String) = data(JsonField.of(data))

                fun data(data: JsonField<String>) = apply { this.data = data }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

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
                        data,
                        type,
                        url,
                        additionalProperties.toImmutable(),
                    )
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

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
                        else -> throw LlamaStackClientInvalidDataException("Unknown Type: $value")
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

                return /* spotless:off */ other is ImageContentItem && data == other.data && type == other.type && url == other.url && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(data, type, url, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ImageContentItem{data=$data, type=$type, url=$url, additionalProperties=$additionalProperties}"
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

            @JsonProperty("text") @ExcludeMissing fun _text() = text

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): TextContentItem = apply {
                if (!validated) {
                    text()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var text: JsonField<String> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
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
                        text,
                        type,
                        additionalProperties.toImmutable(),
                    )
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

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
                        else -> throw LlamaStackClientInvalidDataException("Unknown Type: $value")
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Attachment && content == other.content && mimeType == other.mimeType && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(content, mimeType, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Attachment{content=$content, mimeType=$mimeType, additionalProperties=$additionalProperties}"
}
