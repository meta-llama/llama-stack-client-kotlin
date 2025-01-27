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
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

@JsonDeserialize(using = ContentDelta.Deserializer::class)
@JsonSerialize(using = ContentDelta.Serializer::class)
class ContentDelta
private constructor(
    private val text: TextDelta? = null,
    private val image: ImageDelta? = null,
    private val toolCall: ToolCallDelta? = null,
    private val _json: JsonValue? = null,
) {

    fun text(): TextDelta? = text

    fun image(): ImageDelta? = image

    fun toolCall(): ToolCallDelta? = toolCall

    fun isText(): Boolean = text != null

    fun isImage(): Boolean = image != null

    fun isToolCall(): Boolean = toolCall != null

    fun asText(): TextDelta = text.getOrThrow("text")

    fun asImage(): ImageDelta = image.getOrThrow("image")

    fun asToolCall(): ToolCallDelta = toolCall.getOrThrow("toolCall")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            text != null -> visitor.visitText(text)
            image != null -> visitor.visitImage(image)
            toolCall != null -> visitor.visitToolCall(toolCall)
            else -> visitor.unknown(_json)
        }
    }

    private var validated: Boolean = false

    fun validate(): ContentDelta = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitText(text: TextDelta) {
                    text.validate()
                }

                override fun visitImage(image: ImageDelta) {
                    image.validate()
                }

                override fun visitToolCall(toolCall: ToolCallDelta) {
                    toolCall.validate()
                }
            }
        )
        validated = true
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContentDelta && text == other.text && image == other.image && toolCall == other.toolCall /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(text, image, toolCall) /* spotless:on */

    override fun toString(): String =
        when {
            text != null -> "ContentDelta{text=$text}"
            image != null -> "ContentDelta{image=$image}"
            toolCall != null -> "ContentDelta{toolCall=$toolCall}"
            _json != null -> "ContentDelta{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid ContentDelta")
        }

    companion object {

        fun ofText(text: TextDelta) = ContentDelta(text = text)

        fun ofImage(image: ImageDelta) = ContentDelta(image = image)

        fun ofToolCall(toolCall: ToolCall) = ContentDelta(toolCall = toolCall)
    }

    interface Visitor<out T> {

        fun visitText(text: TextDelta): T

        fun visitImage(image: ImageDelta): T

        fun visitToolCall(toolCall: ToolCallDelta): T

        fun unknown(json: JsonValue?): T {
            throw LlamaStackClientInvalidDataException("Unknown ContentDelta: $json")
        }
    }

    class Deserializer : BaseDeserializer<ContentDelta>(ContentDelta::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): ContentDelta {
            val json = JsonValue.fromJsonNode(node)
            val type = json.asObject()?.get("type")?.asString()

            when (type) {
                "text" -> {
                    tryDeserialize(node, jacksonTypeRef<TextDelta>()) { it.validate() }
                        ?.let {
                            return ContentDelta(text = it, _json = json)
                        }
                }
                "image" -> {
                    tryDeserialize(node, jacksonTypeRef<ImageDelta>()) { it.validate() }
                        ?.let {
                            return ContentDelta(image = it, _json = json)
                        }
                }
                "tool_call" -> {
                    tryDeserialize(node, jacksonTypeRef<ToolCallDelta>()) { it.validate() }
                        ?.let {
                            return ContentDelta(toolCall = it, _json = json)
                        }
                }
            }

            return ContentDelta(_json = json)
        }
    }

    class Serializer : BaseSerializer<ContentDelta>(ContentDelta::class) {

        override fun serialize(
            value: ContentDelta,
            generator: JsonGenerator,
            provider: SerializerProvider
        ) {
            when {
                value.text != null -> generator.writeObject(value.text)
                value.image != null -> generator.writeObject(value.image)
                value.toolCall != null -> generator.writeObject(value.toolCall)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid ContentDelta")
            }
        }
    }

    @NoAutoDetect
    class TextDelta
    @JsonCreator
    private constructor(
        @JsonProperty("text")
        @ExcludeMissing
        private val text: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonValue = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun text(): String = text.getRequired("text")

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): TextDelta = apply {
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

        class Builder {

            private var text: JsonField<String>? = null
            private var type: JsonValue = JsonValue.from("text")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(textDelta: TextDelta) = apply {
                text = textDelta.text
                type = textDelta.type
                additionalProperties = textDelta.additionalProperties.toMutableMap()
            }

            fun text(text: String) = text(JsonField.of(text))

            fun text(text: JsonField<String>) = apply { this.text = text }

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

            fun build(): TextDelta =
                TextDelta(
                    checkRequired("text", text),
                    type,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TextDelta && text == other.text && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(text, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TextDelta{text=$text, type=$type, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class ImageDelta
    @JsonCreator
    private constructor(
        @JsonProperty("image")
        @ExcludeMissing
        private val image: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonValue = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun image(): String = image.getRequired("image")

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        @JsonProperty("image") @ExcludeMissing fun _image(): JsonField<String> = image

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ImageDelta = apply {
            if (validated) {
                return@apply
            }

            image()
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

        class Builder {

            private var image: JsonField<String>? = null
            private var type: JsonValue = JsonValue.from("image")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(imageDelta: ImageDelta) = apply {
                image = imageDelta.image
                type = imageDelta.type
                additionalProperties = imageDelta.additionalProperties.toMutableMap()
            }

            fun image(image: String) = image(JsonField.of(image))

            fun image(image: JsonField<String>) = apply { this.image = image }

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

            fun build(): ImageDelta =
                ImageDelta(
                    checkRequired("image", image),
                    type,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ImageDelta && image == other.image && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(image, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ImageDelta{image=$image, type=$type, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class ToolCallDelta
    @JsonCreator
    private constructor(
        @JsonProperty("parse_status")
        @ExcludeMissing
        private val parseStatus: JsonField<ParseStatus> = JsonMissing.of(),
        @JsonProperty("tool_call")
        @ExcludeMissing
        private val toolCall: JsonField<ToolCall> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonValue = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun parseStatus(): ParseStatus = parseStatus.getRequired("parse_status")

        fun toolCall(): ToolCall = toolCall.getRequired("tool_call")

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        @JsonProperty("parse_status")
        @ExcludeMissing
        fun _parseStatus(): JsonField<ParseStatus> = parseStatus

        @JsonProperty("tool_call") @ExcludeMissing fun _toolCall(): JsonField<ToolCall> = toolCall

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ToolCallDelta = apply {
            if (validated) {
                return@apply
            }

            parseStatus()
            toolCall().validate()
            _type().let {
                if (it != JsonValue.from("tool_call")) {
                    throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
                }
            }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var parseStatus: JsonField<ParseStatus>? = null
            private var toolCall: JsonField<ToolCall>? = null
            private var type: JsonValue = JsonValue.from("tool_call")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(toolCallDelta: ToolCallDelta) = apply {
                parseStatus = toolCallDelta.parseStatus
                toolCall = toolCallDelta.toolCall
                type = toolCallDelta.type
                additionalProperties = toolCallDelta.additionalProperties.toMutableMap()
            }

            fun parseStatus(parseStatus: ParseStatus) = parseStatus(JsonField.of(parseStatus))

            fun parseStatus(parseStatus: JsonField<ParseStatus>) = apply {
                this.parseStatus = parseStatus
            }

            fun toolCall(toolCall: ToolCall) = toolCall(JsonField.of(toolCall))

            fun toolCall(toolCall: JsonField<ToolCall>) = apply { this.toolCall = toolCall }

            fun toolCall(string: String) = toolCall(ToolCall.ofString(string))

            fun toolCall(toolCall: ToolCall) = toolCall(ToolCall.ofToolCall(toolCall))

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

            fun build(): ToolCallDelta =
                ToolCallDelta(
                    checkRequired("parseStatus", parseStatus),
                    checkRequired("toolCall", toolCall),
                    type,
                    additionalProperties.toImmutable(),
                )
        }

        class ParseStatus
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val STARTED = of("started")

                val IN_PROGRESS = of("in_progress")

                val FAILED = of("failed")

                val SUCCEEDED = of("succeeded")

                fun of(value: String) = ParseStatus(JsonField.of(value))
            }

            enum class Known {
                STARTED,
                IN_PROGRESS,
                FAILED,
                SUCCEEDED,
            }

            enum class Value {
                STARTED,
                IN_PROGRESS,
                FAILED,
                SUCCEEDED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    STARTED -> Value.STARTED
                    IN_PROGRESS -> Value.IN_PROGRESS
                    FAILED -> Value.FAILED
                    SUCCEEDED -> Value.SUCCEEDED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    STARTED -> Known.STARTED
                    IN_PROGRESS -> Known.IN_PROGRESS
                    FAILED -> Known.FAILED
                    SUCCEEDED -> Known.SUCCEEDED
                    else ->
                        throw LlamaStackClientInvalidDataException("Unknown ParseStatus: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ParseStatus && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @JsonDeserialize(using = ToolCall.Deserializer::class)
        @JsonSerialize(using = ToolCall.Serializer::class)
        class ToolCall
        private constructor(
            private val string: String? = null,
            private val toolCall: ToolCall? = null,
            private val _json: JsonValue? = null,
        ) {

            fun string(): String? = string

            fun toolCall(): ToolCall? = toolCall

            fun isString(): Boolean = string != null

            fun isToolCall(): Boolean = toolCall != null

            fun asString(): String = string.getOrThrow("string")

            fun asToolCall(): ToolCall = toolCall.getOrThrow("toolCall")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    string != null -> visitor.visitString(string)
                    toolCall != null -> visitor.visitToolCall(toolCall)
                    else -> visitor.unknown(_json)
                }
            }

            private var validated: Boolean = false

            fun validate(): ToolCall = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitString(string: String) {}

                        override fun visitToolCall(toolCall: ToolCall) {
                            toolCall.validate()
                        }
                    }
                )
                validated = true
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ToolCall && string == other.string && toolCall == other.toolCall /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, toolCall) /* spotless:on */

            override fun toString(): String =
                when {
                    string != null -> "ToolCall{string=$string}"
                    toolCall != null -> "ToolCall{toolCall=$toolCall}"
                    _json != null -> "ToolCall{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid ToolCall")
                }

            companion object {

                fun ofString(string: String) = ToolCall(string = string)

                fun ofToolCall(toolCall: ToolCall) = ToolCall(toolCall = toolCall)
            }

            interface Visitor<out T> {

                fun visitString(string: String): T

                fun visitToolCall(toolCall: ToolCall): T

                fun unknown(json: JsonValue?): T {
                    throw LlamaStackClientInvalidDataException("Unknown ToolCall: $json")
                }
            }

            class Deserializer : BaseDeserializer<ToolCall>(ToolCall::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): ToolCall {
                    val json = JsonValue.fromJsonNode(node)

                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                        return ToolCall(string = it, _json = json)
                    }
                    tryDeserialize(node, jacksonTypeRef<ToolCall>()) { it.validate() }
                        ?.let {
                            return ToolCall(toolCall = it, _json = json)
                        }

                    return ToolCall(_json = json)
                }
            }

            class Serializer : BaseSerializer<ToolCall>(ToolCall::class) {

                override fun serialize(
                    value: ToolCall,
                    generator: JsonGenerator,
                    provider: SerializerProvider
                ) {
                    when {
                        value.string != null -> generator.writeObject(value.string)
                        value.toolCall != null -> generator.writeObject(value.toolCall)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid ToolCall")
                    }
                }
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ToolCallDelta && parseStatus == other.parseStatus && toolCall == other.toolCall && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(parseStatus, toolCall, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ToolCallDelta{parseStatus=$parseStatus, toolCall=$toolCall, type=$type, additionalProperties=$additionalProperties}"
    }
}
