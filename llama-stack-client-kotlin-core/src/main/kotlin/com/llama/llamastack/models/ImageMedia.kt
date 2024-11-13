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

@JsonDeserialize(builder = ImageMedia.Builder::class)
@NoAutoDetect
class ImageMedia
private constructor(
    private val image: JsonField<Image>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun image(): Image = image.getRequired("image")

    @JsonProperty("image") @ExcludeMissing fun _image() = image

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ImageMedia = apply {
        if (!validated) {
            image()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var image: JsonField<Image> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(imageMedia: ImageMedia) = apply {
            this.image = imageMedia.image
            additionalProperties(imageMedia.additionalProperties)
        }

        fun image(image: Image) = image(JsonField.of(image))

        @JsonProperty("image")
        @ExcludeMissing
        fun image(image: JsonField<Image>) = apply { this.image = image }

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

        fun build(): ImageMedia = ImageMedia(image, additionalProperties.toImmutable())
    }

    @JsonDeserialize(using = Image.Deserializer::class)
    @JsonSerialize(using = Image.Serializer::class)
    class Image
    private constructor(
        private val thisClassRepresentsAnImageObjectToCreate:
            ThisClassRepresentsAnImageObjectToCreate? =
            null,
        private val url: String? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun thisClassRepresentsAnImageObjectToCreate(): ThisClassRepresentsAnImageObjectToCreate? =
            thisClassRepresentsAnImageObjectToCreate

        fun url(): String? = url

        fun isThisClassRepresentsAnImageObjectToCreate(): Boolean =
            thisClassRepresentsAnImageObjectToCreate != null

        fun isUrl(): Boolean = url != null

        fun asThisClassRepresentsAnImageObjectToCreate(): ThisClassRepresentsAnImageObjectToCreate =
            thisClassRepresentsAnImageObjectToCreate.getOrThrow(
                "thisClassRepresentsAnImageObjectToCreate"
            )

        fun asUrl(): String = url.getOrThrow("url")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                thisClassRepresentsAnImageObjectToCreate != null ->
                    visitor.visitThisClassRepresentsAnImageObjectToCreate(
                        thisClassRepresentsAnImageObjectToCreate
                    )
                url != null -> visitor.visitUrl(url)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): Image = apply {
            if (!validated) {
                if (thisClassRepresentsAnImageObjectToCreate == null && url == null) {
                    throw LlamaStackClientInvalidDataException("Unknown Image: $_json")
                }
                thisClassRepresentsAnImageObjectToCreate?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Image && this.thisClassRepresentsAnImageObjectToCreate == other.thisClassRepresentsAnImageObjectToCreate && this.url == other.url /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(thisClassRepresentsAnImageObjectToCreate, url) /* spotless:on */
        }

        override fun toString(): String {
            return when {
                thisClassRepresentsAnImageObjectToCreate != null ->
                    "Image{thisClassRepresentsAnImageObjectToCreate=$thisClassRepresentsAnImageObjectToCreate}"
                url != null -> "Image{url=$url}"
                _json != null -> "Image{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Image")
            }
        }

        companion object {

            fun ofThisClassRepresentsAnImageObjectToCreate(
                thisClassRepresentsAnImageObjectToCreate: ThisClassRepresentsAnImageObjectToCreate
            ) =
                Image(
                    thisClassRepresentsAnImageObjectToCreate =
                        thisClassRepresentsAnImageObjectToCreate
                )

            fun ofUrl(url: String) = Image(url = url)
        }

        interface Visitor<out T> {

            fun visitThisClassRepresentsAnImageObjectToCreate(
                thisClassRepresentsAnImageObjectToCreate: ThisClassRepresentsAnImageObjectToCreate
            ): T

            fun visitUrl(url: String): T

            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown Image: $json")
            }
        }

        class Deserializer : BaseDeserializer<Image>(Image::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Image {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<ThisClassRepresentsAnImageObjectToCreate>()) {
                        it.validate()
                    }
                    ?.let {
                        return Image(thisClassRepresentsAnImageObjectToCreate = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                    return Image(url = it, _json = json)
                }

                return Image(_json = json)
            }
        }

        class Serializer : BaseSerializer<Image>(Image::class) {

            override fun serialize(
                value: Image,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.thisClassRepresentsAnImageObjectToCreate != null ->
                        generator.writeObject(value.thisClassRepresentsAnImageObjectToCreate)
                    value.url != null -> generator.writeObject(value.url)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Image")
                }
            }
        }

        @JsonDeserialize(builder = ThisClassRepresentsAnImageObjectToCreate.Builder::class)
        @NoAutoDetect
        class ThisClassRepresentsAnImageObjectToCreate
        private constructor(
            private val format: JsonField<String>,
            private val formatDescription: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun format(): String? = format.getNullable("format")

            fun formatDescription(): String? = formatDescription.getNullable("format_description")

            @JsonProperty("format") @ExcludeMissing fun _format() = format

            @JsonProperty("format_description")
            @ExcludeMissing
            fun _formatDescription() = formatDescription

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): ThisClassRepresentsAnImageObjectToCreate = apply {
                if (!validated) {
                    format()
                    formatDescription()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var format: JsonField<String> = JsonMissing.of()
                private var formatDescription: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    thisClassRepresentsAnImageObjectToCreate:
                        ThisClassRepresentsAnImageObjectToCreate
                ) = apply {
                    this.format = thisClassRepresentsAnImageObjectToCreate.format
                    this.formatDescription =
                        thisClassRepresentsAnImageObjectToCreate.formatDescription
                    additionalProperties(
                        thisClassRepresentsAnImageObjectToCreate.additionalProperties
                    )
                }

                fun format(format: String) = format(JsonField.of(format))

                @JsonProperty("format")
                @ExcludeMissing
                fun format(format: JsonField<String>) = apply { this.format = format }

                fun formatDescription(formatDescription: String) =
                    formatDescription(JsonField.of(formatDescription))

                @JsonProperty("format_description")
                @ExcludeMissing
                fun formatDescription(formatDescription: JsonField<String>) = apply {
                    this.formatDescription = formatDescription
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

                fun build(): ThisClassRepresentsAnImageObjectToCreate =
                    ThisClassRepresentsAnImageObjectToCreate(
                        format,
                        formatDescription,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ThisClassRepresentsAnImageObjectToCreate && this.format == other.format && this.formatDescription == other.formatDescription && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(format, formatDescription, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "ThisClassRepresentsAnImageObjectToCreate{format=$format, formatDescription=$formatDescription, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ImageMedia && this.image == other.image && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(image, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() = "ImageMedia{image=$image, additionalProperties=$additionalProperties}"
}
