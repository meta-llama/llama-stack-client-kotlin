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

        fun ofToolCall(toolCall: ToolCallDelta) = ContentDelta(toolCall = toolCall)
    }

    /**
     * An interface that defines how to map each variant of [ContentDelta] to a value of type [T].
     */
    interface Visitor<out T> {

        fun visitText(text: TextDelta): T

        fun visitImage(image: ImageDelta): T

        fun visitToolCall(toolCall: ToolCallDelta): T

        /**
         * Maps an unknown variant of [ContentDelta] to a value of type [T].
         *
         * An instance of [ContentDelta] can contain an unknown variant if it was deserialized from
         * data that doesn't match any known variant. For example, if the SDK is on an older version
         * than the API, then the API may respond with new variants that the SDK is unaware of.
         *
         * @throws LlamaStackClientInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LlamaStackClientInvalidDataException("Unknown ContentDelta: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<ContentDelta>(ContentDelta::class) {

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

    internal class Serializer : BaseSerializer<ContentDelta>(ContentDelta::class) {

        override fun serialize(
            value: ContentDelta,
            generator: JsonGenerator,
            provider: SerializerProvider,
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

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun text(): String = text.getRequired("text")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("text")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * Returns the raw JSON value of [text].
         *
         * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
         */
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

            /**
             * Returns a mutable builder for constructing an instance of [TextDelta].
             *
             * The following fields are required:
             * ```kotlin
             * .text()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [TextDelta]. */
        class Builder internal constructor() {

            private var text: JsonField<String>? = null
            private var type: JsonValue = JsonValue.from("text")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(textDelta: TextDelta) = apply {
                text = textDelta.text
                type = textDelta.type
                additionalProperties = textDelta.additionalProperties.toMutableMap()
            }

            fun text(text: String) = text(JsonField.of(text))

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<String>) = apply { this.text = text }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("text")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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
                TextDelta(checkRequired("text", text), type, additionalProperties.toImmutable())
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

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun image(): String = image.getRequired("image")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("image")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * Returns the raw JSON value of [image].
         *
         * Unlike [image], this method doesn't throw if the JSON field has an unexpected type.
         */
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

            /**
             * Returns a mutable builder for constructing an instance of [ImageDelta].
             *
             * The following fields are required:
             * ```kotlin
             * .image()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ImageDelta]. */
        class Builder internal constructor() {

            private var image: JsonField<String>? = null
            private var type: JsonValue = JsonValue.from("image")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(imageDelta: ImageDelta) = apply {
                image = imageDelta.image
                type = imageDelta.type
                additionalProperties = imageDelta.additionalProperties.toMutableMap()
            }

            fun image(image: String) = image(JsonField.of(image))

            /**
             * Sets [Builder.image] to an arbitrary JSON value.
             *
             * You should usually call [Builder.image] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun image(image: JsonField<String>) = apply { this.image = image }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("image")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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
                ImageDelta(checkRequired("image", image), type, additionalProperties.toImmutable())
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
        private val toolCall: JsonField<ToolCallOrString> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonValue = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun parseStatus(): ParseStatus = parseStatus.getRequired("parse_status")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun toolCall(): ToolCallOrString = toolCall.getRequired("tool_call")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("tool_call")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * Returns the raw JSON value of [parseStatus].
         *
         * Unlike [parseStatus], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("parse_status")
        @ExcludeMissing
        fun _parseStatus(): JsonField<ParseStatus> = parseStatus

        /**
         * Returns the raw JSON value of [toolCall].
         *
         * Unlike [toolCall], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tool_call")
        @ExcludeMissing
        fun _toolCall(): JsonField<ToolCallOrString> = toolCall

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

            /**
             * Returns a mutable builder for constructing an instance of [ToolCallDelta].
             *
             * The following fields are required:
             * ```kotlin
             * .parseStatus()
             * .toolCall()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ToolCallDelta]. */
        class Builder internal constructor() {

            private var parseStatus: JsonField<ParseStatus>? = null
            private var toolCall: JsonField<ToolCallOrString>? = null
            private var type: JsonValue = JsonValue.from("tool_call")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(toolCallDelta: ToolCallDelta) = apply {
                parseStatus = toolCallDelta.parseStatus
                toolCall = toolCallDelta.toolCall
                type = toolCallDelta.type
                additionalProperties = toolCallDelta.additionalProperties.toMutableMap()
            }

            fun parseStatus(parseStatus: ParseStatus) = parseStatus(JsonField.of(parseStatus))

            /**
             * Sets [Builder.parseStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parseStatus] with a well-typed [ParseStatus] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun parseStatus(parseStatus: JsonField<ParseStatus>) = apply {
                this.parseStatus = parseStatus
            }

            fun toolCall(toolCall: ToolCallOrString) = toolCall(JsonField.of(toolCall))

            /**
             * Sets [Builder.toolCall] to an arbitrary JSON value.
             *
             * You should usually call [Builder.toolCall] with a well-typed [ToolCallOrString] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun toolCall(toolCall: JsonField<ToolCallOrString>) = apply { this.toolCall = toolCall }

            /** Alias for calling [toolCall] with `ToolCallOrString.ofString(string)`. */
            fun toolCall(string: String) = toolCall(ToolCallOrString.ofString(string))

            /**
             * Alias for calling [Builder.toolCall] with `ToolCallOrString.ofToolCall(toolCall)`.
             */
            fun toolCall(toolCall: ToolCall) = toolCall(ToolCallOrString.ofToolCall(toolCall))

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("tool_call")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

        class ParseStatus @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val STARTED = of("started")

                val IN_PROGRESS = of("in_progress")

                val FAILED = of("failed")

                val SUCCEEDED = of("succeeded")

                fun of(value: String) = ParseStatus(JsonField.of(value))
            }

            /** An enum containing [ParseStatus]'s known values. */
            enum class Known {
                STARTED,
                IN_PROGRESS,
                FAILED,
                SUCCEEDED,
            }

            /**
             * An enum containing [ParseStatus]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ParseStatus] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                STARTED,
                IN_PROGRESS,
                FAILED,
                SUCCEEDED,
                /**
                 * An enum member indicating that [ParseStatus] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    STARTED -> Value.STARTED
                    IN_PROGRESS -> Value.IN_PROGRESS
                    FAILED -> Value.FAILED
                    SUCCEEDED -> Value.SUCCEEDED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LlamaStackClientInvalidDataException if this class instance's value is a not
             *   a known member.
             */
            fun known(): Known =
                when (this) {
                    STARTED -> Known.STARTED
                    IN_PROGRESS -> Known.IN_PROGRESS
                    FAILED -> Known.FAILED
                    SUCCEEDED -> Known.SUCCEEDED
                    else ->
                        throw LlamaStackClientInvalidDataException("Unknown ParseStatus: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LlamaStackClientInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString()
                    ?: throw LlamaStackClientInvalidDataException("Value is not a String")

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ParseStatus && value == other.value /* spotless:on */
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
