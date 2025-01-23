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
    private val textDelta: TextDelta? = null,
    private val imageDelta: ImageDelta? = null,
    private val toolCallDelta: ToolCallDelta? = null,
    private val _json: JsonValue? = null,
) {

    fun textDelta(): TextDelta? = textDelta

    fun imageDelta(): ImageDelta? = imageDelta

    fun toolCallDelta(): ToolCallDelta? = toolCallDelta

    fun isTextDelta(): Boolean = textDelta != null

    fun isImageDelta(): Boolean = imageDelta != null

    fun isToolCallDelta(): Boolean = toolCallDelta != null

    fun asTextDelta(): TextDelta = textDelta.getOrThrow("textDelta")

    fun asImageDelta(): ImageDelta = imageDelta.getOrThrow("imageDelta")

    fun asToolCallDelta(): ToolCallDelta = toolCallDelta.getOrThrow("toolCallDelta")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            textDelta != null -> visitor.visitTextDelta(textDelta)
            imageDelta != null -> visitor.visitImageDelta(imageDelta)
            toolCallDelta != null -> visitor.visitToolCallDelta(toolCallDelta)
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
                override fun visitTextDelta(textDelta: TextDelta) {
                    textDelta.validate()
                }

                override fun visitImageDelta(imageDelta: ImageDelta) {
                    imageDelta.validate()
                }

                override fun visitToolCallDelta(toolCallDelta: ToolCallDelta) {
                    toolCallDelta.validate()
                }
            }
        )
        validated = true
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContentDelta && textDelta == other.textDelta && imageDelta == other.imageDelta && toolCallDelta == other.toolCallDelta /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(textDelta, imageDelta, toolCallDelta) /* spotless:on */

    override fun toString(): String =
        when {
            textDelta != null -> "ContentDelta{textDelta=$textDelta}"
            imageDelta != null -> "ContentDelta{imageDelta=$imageDelta}"
            toolCallDelta != null -> "ContentDelta{toolCallDelta=$toolCallDelta}"
            _json != null -> "ContentDelta{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid ContentDelta")
        }

    companion object {

        fun ofTextDelta(textDelta: TextDelta) = ContentDelta(textDelta = textDelta)

        fun ofImageDelta(imageDelta: ImageDelta) = ContentDelta(imageDelta = imageDelta)

        fun ofToolCallDelta(toolCallDelta: ToolCallDelta) =
            ContentDelta(toolCallDelta = toolCallDelta)
    }

    interface Visitor<out T> {

        fun visitTextDelta(textDelta: TextDelta): T

        fun visitImageDelta(imageDelta: ImageDelta): T

        fun visitToolCallDelta(toolCallDelta: ToolCallDelta): T

        fun unknown(json: JsonValue?): T {
            throw LlamaStackClientInvalidDataException("Unknown ContentDelta: $json")
        }
    }

    class Deserializer : BaseDeserializer<ContentDelta>(ContentDelta::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): ContentDelta {
            val json = JsonValue.fromJsonNode(node)

            tryDeserialize(node, jacksonTypeRef<TextDelta>()) { it.validate() }
                ?.let {
                    return ContentDelta(textDelta = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<ImageDelta>()) { it.validate() }
                ?.let {
                    return ContentDelta(imageDelta = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<ToolCallDelta>()) { it.validate() }
                ?.let {
                    return ContentDelta(toolCallDelta = it, _json = json)
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
                value.textDelta != null -> generator.writeObject(value.textDelta)
                value.imageDelta != null -> generator.writeObject(value.imageDelta)
                value.toolCallDelta != null -> generator.writeObject(value.toolCallDelta)
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

        fun validate(): TextDelta = apply {
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

            internal fun from(textDelta: TextDelta) = apply {
                text = textDelta.text
                type = textDelta.type
                additionalProperties = textDelta.additionalProperties.toMutableMap()
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

            fun build(): TextDelta =
                TextDelta(
                    checkRequired("text", text),
                    checkRequired("type", type),
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
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun image(): String = image.getRequired("image")

        fun type(): Type = type.getRequired("type")

        @JsonProperty("image") @ExcludeMissing fun _image(): JsonField<String> = image

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ImageDelta = apply {
            if (validated) {
                return@apply
            }

            image()
            type()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var image: JsonField<String>? = null
            private var type: JsonField<Type>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(imageDelta: ImageDelta) = apply {
                image = imageDelta.image
                type = imageDelta.type
                additionalProperties = imageDelta.additionalProperties.toMutableMap()
            }

            fun image(image: String) = image(JsonField.of(image))

            fun image(image: JsonField<String>) = apply { this.image = image }

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

            fun build(): ImageDelta =
                ImageDelta(
                    checkRequired("image", image),
                    checkRequired("type", type),
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
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun parseStatus(): ParseStatus = parseStatus.getRequired("parse_status")

        fun toolCall(): ToolCall = toolCall.getRequired("tool_call")

        fun type(): Type = type.getRequired("type")

        @JsonProperty("parse_status")
        @ExcludeMissing
        fun _parseStatus(): JsonField<ParseStatus> = parseStatus

        @JsonProperty("tool_call") @ExcludeMissing fun _toolCall(): JsonField<ToolCall> = toolCall

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
            type()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var parseStatus: JsonField<ParseStatus>? = null
            private var toolCall: JsonField<ToolCall>? = null
            private var type: JsonField<Type>? = null
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
            // MANUAL PATCH
            fun toolCall(toolCall: ToolCall) = toolCall(JsonField.of(toolCall))

            fun toolCall(toolCall: JsonField<ToolCall>) = apply { this.toolCall = toolCall }

            //            fun toolCall(string: String) = ToolCall(string)

            // MANUAL PATCH
            //            fun toolCall(toolCall: ToolCall) = toolCall(ToolCall.ofToolCall(toolCall))

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

            fun build(): ToolCallDelta =
                ToolCallDelta(
                    checkRequired("parseStatus", parseStatus),
                    checkRequired("toolCall", toolCall),
                    checkRequired("type", type),
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

        //        @JsonDeserialize(using = ToolCall.Deserializer::class)
        //        @JsonSerialize(using = ToolCall.Serializer::class)
        //        class ToolCall
        //        private constructor(
        //            private val string: String? = null,
        //            private val toolCall: ToolCall? = null,
        //            private val _json: JsonValue? = null,
        //        ) {
        //
        //            fun string(): String? = string
        //
        //            fun toolCall(): ToolCall? = toolCall
        //
        //            fun isString(): Boolean = string != null
        //
        //            fun isToolCall(): Boolean = toolCall != null
        //
        //            fun asString(): String = string.getOrThrow("string")
        //
        //            fun asToolCall(): ToolCall = toolCall.getOrThrow("toolCall")
        //
        //            fun _json(): JsonValue? = _json
        //
        //            fun <T> accept(visitor: Visitor<T>): T {
        //                return when {
        //                    string != null -> visitor.visitString(string)
        //                    toolCall != null -> visitor.visitToolCall(toolCall)
        //                    else -> visitor.unknown(_json)
        //                }
        //            }
        //
        //            private var validated: Boolean = false
        //
        //            fun validate(): ToolCall = apply {
        //                if (validated) {
        //                    return@apply
        //                }
        //
        //                accept(
        //                    object : Visitor<Unit> {
        //                        override fun visitString(string: String) {}
        //
        //                        override fun visitToolCall(toolCall: ToolCall) {
        //                            toolCall.validate()
        //                        }
        //                    }
        //                )
        //                validated = true
        //            }
        //
        //            override fun equals(other: Any?): Boolean {
        //                if (this === other) {
        //                    return true
        //                }
        //
        //                return /* spotless:off */ other is ToolCall && string == other.string && toolCall == other.toolCall /* spotless:on */
        //            }
        //
        //            override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, toolCall) /* spotless:on */
        //
        //            override fun toString(): String =
        //                when {
        //                    string != null -> "ToolCall{string=$string}"
        //                    toolCall != null -> "ToolCall{toolCall=$toolCall}"
        //                    _json != null -> "ToolCall{_unknown=$_json}"
        //                    else -> throw IllegalStateException("Invalid ToolCall")
        //                }
        //
        //            companion object {
        //
        //                fun ofString(string: String) = ToolCall(string = string)
        //
        //                fun ofToolCall(toolCall: ToolCall) = ToolCall(toolCall = toolCall)
        //            }
        //
        //            interface Visitor<out T> {
        //
        //                fun visitString(string: String): T
        //
        //                fun visitToolCall(toolCall: ToolCall): T
        //
        //                fun unknown(json: JsonValue?): T {
        //                    throw LlamaStackClientInvalidDataException("Unknown ToolCall: $json")
        //                }
        //            }
        //
        //            class Deserializer : BaseDeserializer<ToolCall>(ToolCall::class) {
        //
        //                override fun ObjectCodec.deserialize(node: JsonNode): ToolCall {
        //                    val json = JsonValue.fromJsonNode(node)
        //
        //                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
        //                        return ToolCall(string = it, _json = json)
        //                    }
        //                    tryDeserialize(node, jacksonTypeRef<ToolCall>()) { it.validate() }
        //                        ?.let {
        //                            return ToolCall(toolCall = it, _json = json)
        //                        }
        //
        //                    return ToolCall(_json = json)
        //                }
        //            }
        //
        //            class Serializer : BaseSerializer<ToolCall>(ToolCall::class) {
        //
        //                override fun serialize(
        //                    value: ToolCall,
        //                    generator: JsonGenerator,
        //                    provider: SerializerProvider
        //                ) {
        //                    when {
        //                        value.string != null -> generator.writeObject(value.string)
        //                        value.toolCall != null -> generator.writeObject(value.toolCall)
        //                        value._json != null -> generator.writeObject(value._json)
        //                        else -> throw IllegalStateException("Invalid ToolCall")
        //                    }
        //                }
        //            }
        //        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val TOOL_CALL = of("tool_call")

                fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                TOOL_CALL,
            }

            enum class Value {
                TOOL_CALL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    TOOL_CALL -> Value.TOOL_CALL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    TOOL_CALL -> Known.TOOL_CALL
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
