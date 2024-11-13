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

@JsonDeserialize(builder = ToolResponse.Builder::class)
@NoAutoDetect
class ToolResponse
private constructor(
    private val callId: JsonField<String>,
    private val content: JsonField<Content>,
    private val toolName: JsonField<ToolName>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun callId(): String = callId.getRequired("call_id")

    fun content(): Content = content.getRequired("content")

    fun toolName(): ToolName = toolName.getRequired("tool_name")

    @JsonProperty("call_id") @ExcludeMissing fun _callId() = callId

    @JsonProperty("content") @ExcludeMissing fun _content() = content

    @JsonProperty("tool_name") @ExcludeMissing fun _toolName() = toolName

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ToolResponse = apply {
        if (!validated) {
            callId()
            content()
            toolName()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var callId: JsonField<String> = JsonMissing.of()
        private var content: JsonField<Content> = JsonMissing.of()
        private var toolName: JsonField<ToolName> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(toolResponse: ToolResponse) = apply {
            this.callId = toolResponse.callId
            this.content = toolResponse.content
            this.toolName = toolResponse.toolName
            additionalProperties(toolResponse.additionalProperties)
        }

        fun callId(callId: String) = callId(JsonField.of(callId))

        @JsonProperty("call_id")
        @ExcludeMissing
        fun callId(callId: JsonField<String>) = apply { this.callId = callId }

        fun content(content: Content) = content(JsonField.of(content))

        @JsonProperty("content")
        @ExcludeMissing
        fun content(content: JsonField<Content>) = apply { this.content = content }

        fun toolName(toolName: ToolName) = toolName(JsonField.of(toolName))

        @JsonProperty("tool_name")
        @ExcludeMissing
        fun toolName(toolName: JsonField<ToolName>) = apply { this.toolName = toolName }

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

        fun build(): ToolResponse =
            ToolResponse(
                callId,
                content,
                toolName,
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

    class ToolName
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ToolName && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val BRAVE_SEARCH = ToolName(JsonField.of("brave_search"))

            val WOLFRAM_ALPHA = ToolName(JsonField.of("wolfram_alpha"))

            val PHOTOGEN = ToolName(JsonField.of("photogen"))

            val CODE_INTERPRETER = ToolName(JsonField.of("code_interpreter"))

            fun of(value: String) = ToolName(JsonField.of(value))
        }

        enum class Known {
            BRAVE_SEARCH,
            WOLFRAM_ALPHA,
            PHOTOGEN,
            CODE_INTERPRETER,
        }

        enum class Value {
            BRAVE_SEARCH,
            WOLFRAM_ALPHA,
            PHOTOGEN,
            CODE_INTERPRETER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                BRAVE_SEARCH -> Value.BRAVE_SEARCH
                WOLFRAM_ALPHA -> Value.WOLFRAM_ALPHA
                PHOTOGEN -> Value.PHOTOGEN
                CODE_INTERPRETER -> Value.CODE_INTERPRETER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                BRAVE_SEARCH -> Known.BRAVE_SEARCH
                WOLFRAM_ALPHA -> Known.WOLFRAM_ALPHA
                PHOTOGEN -> Known.PHOTOGEN
                CODE_INTERPRETER -> Known.CODE_INTERPRETER
                else -> throw LlamaStackClientInvalidDataException("Unknown ToolName: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ToolResponse && this.callId == other.callId && this.content == other.content && this.toolName == other.toolName && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(callId, content, toolName, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "ToolResponse{callId=$callId, content=$content, toolName=$toolName, additionalProperties=$additionalProperties}"
}
