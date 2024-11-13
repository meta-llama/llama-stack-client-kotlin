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
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

@JsonDeserialize(builder = UserMessage.Builder::class)
@NoAutoDetect
class UserMessage
private constructor(
    private val content: JsonField<Content>,
    private val context: JsonField<Context>,
    private val role: JsonField<Role>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun content(): Content = content.getRequired("content")

    fun context(): Context? = context.getNullable("context")

    fun role(): Role = role.getRequired("role")

    @JsonProperty("content") @ExcludeMissing fun _content() = content

    @JsonProperty("context") @ExcludeMissing fun _context() = context

    @JsonProperty("role") @ExcludeMissing fun _role() = role

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): UserMessage = apply {
        if (!validated) {
            content()
            context()
            role()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var content: JsonField<Content> = JsonMissing.of()
        private var context: JsonField<Context> = JsonMissing.of()
        private var role: JsonField<Role> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(userMessage: UserMessage) = apply {
            this.content = userMessage.content
            this.context = userMessage.context
            this.role = userMessage.role
            additionalProperties(userMessage.additionalProperties)
        }

        fun content(content: Content) = content(JsonField.of(content))

        @JsonProperty("content")
        @ExcludeMissing
        fun content(content: JsonField<Content>) = apply { this.content = content }

        fun context(context: Context) = context(JsonField.of(context))

        @JsonProperty("context")
        @ExcludeMissing
        fun context(context: JsonField<Context>) = apply { this.context = context }

        fun role(role: Role) = role(JsonField.of(role))

        @JsonProperty("role")
        @ExcludeMissing
        fun role(role: JsonField<Role>) = apply { this.role = role }

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

        fun build(): UserMessage =
            UserMessage(
                content,
                context,
                role,
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

    class Role
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Role && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val USER = Role(JsonField.of("user"))

            fun of(value: String) = Role(JsonField.of(value))
        }

        enum class Known {
            USER,
        }

        enum class Value {
            USER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                USER -> Value.USER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                USER -> Known.USER
                else -> throw LlamaStackClientInvalidDataException("Unknown Role: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    @JsonDeserialize(using = Context.Deserializer::class)
    @JsonSerialize(using = Context.Serializer::class)
    class Context
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

        fun validate(): Context = apply {
            if (!validated) {
                if (string == null && imageMedia == null && imageMediaArray == null) {
                    throw LlamaStackClientInvalidDataException("Unknown Context: $_json")
                }
                imageMedia?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Context && this.string == other.string && this.imageMedia == other.imageMedia && this.imageMediaArray == other.imageMediaArray /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(string, imageMedia, imageMediaArray) /* spotless:on */
        }

        override fun toString(): String {
            return when {
                string != null -> "Context{string=$string}"
                imageMedia != null -> "Context{imageMedia=$imageMedia}"
                imageMediaArray != null -> "Context{imageMediaArray=$imageMediaArray}"
                _json != null -> "Context{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Context")
            }
        }

        companion object {

            fun ofString(string: String) = Context(string = string)

            fun ofImageMedia(imageMedia: ImageMedia) = Context(imageMedia = imageMedia)

            fun ofImageMediaArray(imageMediaArray: List<StringOrImageMediaUnion>) =
                Context(imageMediaArray = imageMediaArray)
        }

        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitImageMedia(imageMedia: ImageMedia): T

            fun visitImageMediaArray(imageMediaArray: List<StringOrImageMediaUnion>): T

            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown Context: $json")
            }
        }

        class Deserializer : BaseDeserializer<Context>(Context::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Context {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                    return Context(string = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<ImageMedia>()) { it.validate() }
                    ?.let {
                        return Context(imageMedia = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<List<StringOrImageMediaUnion>>())?.let {
                    return Context(imageMediaArray = it, _json = json)
                }

                return Context(_json = json)
            }
        }

        class Serializer : BaseSerializer<Context>(Context::class) {

            override fun serialize(
                value: Context,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.imageMedia != null -> generator.writeObject(value.imageMedia)
                    value.imageMediaArray != null -> generator.writeObject(value.imageMediaArray)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Context")
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is UserMessage && this.content == other.content && this.context == other.context && this.role == other.role && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(content, context, role, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "UserMessage{content=$content, context=$context, role=$role, additionalProperties=$additionalProperties}"
}
