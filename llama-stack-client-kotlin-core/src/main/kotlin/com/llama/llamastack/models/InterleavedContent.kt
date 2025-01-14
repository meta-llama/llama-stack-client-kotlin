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

@JsonDeserialize(using = InterleavedContent.Deserializer::class)
@JsonSerialize(using = InterleavedContent.Serializer::class)
class InterleavedContent
private constructor(
    private val string: String? = null,
    private val imageContentItem: ImageContentItem? = null,
    private val textContentItem: TextContentItem? = null,
    private val interleavedContentItems: List<InterleavedContentItem>? = null,
    private val _json: JsonValue? = null,
) {

    fun string(): String? = string

    fun imageContentItem(): ImageContentItem? = imageContentItem

    fun textContentItem(): TextContentItem? = textContentItem

    fun interleavedContentItems(): List<InterleavedContentItem>? = interleavedContentItems

    fun isString(): Boolean = string != null

    fun isImageContentItem(): Boolean = imageContentItem != null

    fun isTextContentItem(): Boolean = textContentItem != null

    fun isInterleavedContentItems(): Boolean = interleavedContentItems != null

    fun asString(): String = string.getOrThrow("string")

    fun asImageContentItem(): ImageContentItem = imageContentItem.getOrThrow("imageContentItem")

    fun asTextContentItem(): TextContentItem = textContentItem.getOrThrow("textContentItem")

    fun asInterleavedContentItems(): List<InterleavedContentItem> =
        interleavedContentItems.getOrThrow("interleavedContentItems")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            string != null -> visitor.visitString(string)
            imageContentItem != null -> visitor.visitImageContentItem(imageContentItem)
            textContentItem != null -> visitor.visitTextContentItem(textContentItem)
            interleavedContentItems != null ->
                visitor.visitInterleavedContentItems(interleavedContentItems)
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

                override fun visitInterleavedContentItems(
                    interleavedContentItems: List<InterleavedContentItem>
                ) {
                    interleavedContentItems.forEach { it.validate() }
                }
            }
        )
        validated = true
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InterleavedContent && string == other.string && imageContentItem == other.imageContentItem && textContentItem == other.textContentItem && interleavedContentItems == other.interleavedContentItems /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, imageContentItem, textContentItem, interleavedContentItems) /* spotless:on */

    override fun toString(): String =
        when {
            string != null -> "InterleavedContent{string=$string}"
            imageContentItem != null -> "InterleavedContent{imageContentItem=$imageContentItem}"
            textContentItem != null -> "InterleavedContent{textContentItem=$textContentItem}"
            interleavedContentItems != null ->
                "InterleavedContent{interleavedContentItems=$interleavedContentItems}"
            _json != null -> "InterleavedContent{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid InterleavedContent")
        }

    companion object {

        fun ofString(string: String) = InterleavedContent(string = string)

        fun ofImageContentItem(imageContentItem: ImageContentItem) =
            InterleavedContent(imageContentItem = imageContentItem)

        fun ofTextContentItem(textContentItem: TextContentItem) =
            InterleavedContent(textContentItem = textContentItem)

        fun ofInterleavedContentItems(interleavedContentItems: List<InterleavedContentItem>) =
            InterleavedContent(interleavedContentItems = interleavedContentItems)
    }

    interface Visitor<out T> {

        fun visitString(string: String): T

        fun visitImageContentItem(imageContentItem: ImageContentItem): T

        fun visitTextContentItem(textContentItem: TextContentItem): T

        fun visitInterleavedContentItems(interleavedContentItems: List<InterleavedContentItem>): T

        fun unknown(json: JsonValue?): T {
            throw LlamaStackClientInvalidDataException("Unknown InterleavedContent: $json")
        }
    }

    class Deserializer : BaseDeserializer<InterleavedContent>(InterleavedContent::class) {

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
                    return InterleavedContent(interleavedContentItems = it, _json = json)
                }

            return InterleavedContent(_json = json)
        }
    }

    class Serializer : BaseSerializer<InterleavedContent>(InterleavedContent::class) {

        override fun serialize(
            value: InterleavedContent,
            generator: JsonGenerator,
            provider: SerializerProvider
        ) {
            when {
                value.string != null -> generator.writeObject(value.string)
                value.imageContentItem != null -> generator.writeObject(value.imageContentItem)
                value.textContentItem != null -> generator.writeObject(value.textContentItem)
                value.interleavedContentItems != null ->
                    generator.writeObject(value.interleavedContentItems)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid InterleavedContent")
            }
        }
    }

    @NoAutoDetect
    class ImageContentItem
    @JsonCreator
    private constructor(
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("data")
        @ExcludeMissing
        private val data: JsonField<String> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing private val url: JsonField<Url> = JsonMissing.of(),
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

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
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

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
