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

class InferenceEmbeddingsParams
constructor(
    private val contents: List<Content>,
    private val model: String,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun contents(): List<Content> = contents

    fun model(): String = model

    internal fun getBody(): InferenceEmbeddingsBody {
        return InferenceEmbeddingsBody(
            contents,
            model,
            additionalBodyProperties,
        )
    }

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = InferenceEmbeddingsBody.Builder::class)
    @NoAutoDetect
    class InferenceEmbeddingsBody
    internal constructor(
        private val contents: List<Content>?,
        private val model: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("contents") fun contents(): List<Content>? = contents

        @JsonProperty("model") fun model(): String? = model

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var contents: List<Content>? = null
            private var model: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(inferenceEmbeddingsBody: InferenceEmbeddingsBody) = apply {
                this.contents = inferenceEmbeddingsBody.contents
                this.model = inferenceEmbeddingsBody.model
                additionalProperties(inferenceEmbeddingsBody.additionalProperties)
            }

            @JsonProperty("contents")
            fun contents(contents: List<Content>) = apply { this.contents = contents }

            @JsonProperty("model") fun model(model: String) = apply { this.model = model }

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

            fun build(): InferenceEmbeddingsBody =
                InferenceEmbeddingsBody(
                    checkNotNull(contents) { "`contents` is required but was not set" }
                        .toImmutable(),
                    checkNotNull(model) { "`model` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InferenceEmbeddingsBody && this.contents == other.contents && this.model == other.model && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(contents, model, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "InferenceEmbeddingsBody{contents=$contents, model=$model, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InferenceEmbeddingsParams && this.contents == other.contents && this.model == other.model && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(contents, model, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "InferenceEmbeddingsParams{contents=$contents, model=$model, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var contents: MutableList<Content> = mutableListOf()
        private var model: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(inferenceEmbeddingsParams: InferenceEmbeddingsParams) = apply {
            this.contents(inferenceEmbeddingsParams.contents)
            this.model = inferenceEmbeddingsParams.model
            additionalHeaders(inferenceEmbeddingsParams.additionalHeaders)
            additionalQueryParams(inferenceEmbeddingsParams.additionalQueryParams)
            additionalBodyProperties(inferenceEmbeddingsParams.additionalBodyProperties)
        }

        fun contents(contents: List<Content>) = apply {
            this.contents.clear()
            this.contents.addAll(contents)
        }

        fun addContent(content: Content) = apply { this.contents.add(content) }

        fun model(model: String) = apply { this.model = model }

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

        fun build(): InferenceEmbeddingsParams =
            InferenceEmbeddingsParams(
                checkNotNull(contents) { "`contents` is required but was not set" }.toImmutable(),
                checkNotNull(model) { "`model` is required but was not set" },
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
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

            return /* spotless:off */ other is Content && this.string == other.string && this.imageMedia == other.imageMedia && this.imageMediaArray == other.imageMediaArray /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(string, imageMedia, imageMediaArray) /* spotless:on */
        }

        override fun toString(): String {
            return when {
                string != null -> "Content{string=$string}"
                imageMedia != null -> "Content{imageMedia=$imageMedia}"
                imageMediaArray != null -> "Content{imageMediaArray=$imageMediaArray}"
                _json != null -> "Content{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Content")
            }
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
                    value.imageMediaArray != null -> generator.writeObject(value.imageMediaArray)
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

                return /* spotless:off */ other is StringOrImageMediaUnion && this.string == other.string && this.imageMedia == other.imageMedia /* spotless:on */
            }

            override fun hashCode(): Int {
                return /* spotless:off */ Objects.hash(string, imageMedia) /* spotless:on */
            }

            override fun toString(): String {
                return when {
                    string != null -> "StringOrImageMediaUnion{string=$string}"
                    imageMedia != null -> "StringOrImageMediaUnion{imageMedia=$imageMedia}"
                    _json != null -> "StringOrImageMediaUnion{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid StringOrImageMediaUnion")
                }
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
}
