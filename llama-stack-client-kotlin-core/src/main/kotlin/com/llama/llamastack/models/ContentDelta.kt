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
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Collections
import java.util.Objects

@JsonDeserialize(using = ContentDelta.Deserializer::class)
@JsonSerialize(using = ContentDelta.Serializer::class)
class ContentDelta
private constructor(
    private val text: Text? = null,
    private val image: Image? = null,
    private val toolCall: ToolCall? = null,
    private val _json: JsonValue? = null,
) {

    fun text(): Text? = text

    fun image(): Image? = image

    fun toolCall(): ToolCall? = toolCall

    fun isText(): Boolean = text != null

    fun isImage(): Boolean = image != null

    fun isToolCall(): Boolean = toolCall != null

    fun asText(): Text = text.getOrThrow("text")

    fun asImage(): Image = image.getOrThrow("image")

    fun asToolCall(): ToolCall = toolCall.getOrThrow("toolCall")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            text != null -> visitor.visitText(text)
            image != null -> visitor.visitImage(image)
            toolCall != null -> visitor.visitToolCall(toolCall)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): ContentDelta = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitText(text: Text) {
                    text.validate()
                }

                override fun visitImage(image: Image) {
                    image.validate()
                }

                override fun visitToolCall(toolCall: ToolCall) {
                    toolCall.validate()
                }
            }
        )
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LlamaStackClientInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitText(text: Text) = text.validity()

                override fun visitImage(image: Image) = image.validity()

                override fun visitToolCall(toolCall: ToolCall) = toolCall.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

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

        fun ofText(text: Text) = ContentDelta(text = text)

        fun ofImage(image: Image) = ContentDelta(image = image)

        fun ofToolCall(toolCall: ToolCall) = ContentDelta(toolCall = toolCall)
    }

    /**
     * An interface that defines how to map each variant of [ContentDelta] to a value of type [T].
     */
    interface Visitor<out T> {

        fun visitText(text: Text): T

        fun visitImage(image: Image): T

        fun visitToolCall(toolCall: ToolCall): T

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
                    return tryDeserialize(node, jacksonTypeRef<Text>())?.let {
                        ContentDelta(text = it, _json = json)
                    } ?: ContentDelta(_json = json)
                }
                "image" -> {
                    return tryDeserialize(node, jacksonTypeRef<Image>())?.let {
                        ContentDelta(image = it, _json = json)
                    } ?: ContentDelta(_json = json)
                }
                "tool_call" -> {
                    return tryDeserialize(node, jacksonTypeRef<ToolCall>())?.let {
                        ContentDelta(toolCall = it, _json = json)
                    } ?: ContentDelta(_json = json)
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

    class Text
    private constructor(
        private val text: JsonField<String>,
        private val type: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        ) : this(text, type, mutableMapOf())

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

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Text].
             *
             * The following fields are required:
             * ```kotlin
             * .text()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Text]. */
        class Builder internal constructor() {

            private var text: JsonField<String>? = null
            private var type: JsonValue = JsonValue.from("text")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(text: Text) = apply {
                this.text = text.text
                type = text.type
                additionalProperties = text.additionalProperties.toMutableMap()
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

            /**
             * Returns an immutable instance of [Text].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .text()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Text =
                Text(checkRequired("text", text), type, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Text = apply {
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

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaStackClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (text.asKnown() == null) 0 else 1) +
                type.let { if (it == JsonValue.from("text")) 1 else 0 }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Text && text == other.text && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(text, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Text{text=$text, type=$type, additionalProperties=$additionalProperties}"
    }

    class Image
    private constructor(
        private val image: JsonField<String>,
        private val type: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("image") @ExcludeMissing image: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        ) : this(image, type, mutableMapOf())

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

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Image].
             *
             * The following fields are required:
             * ```kotlin
             * .image()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Image]. */
        class Builder internal constructor() {

            private var image: JsonField<String>? = null
            private var type: JsonValue = JsonValue.from("image")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(image: Image) = apply {
                this.image = image.image
                type = image.type
                additionalProperties = image.additionalProperties.toMutableMap()
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

            /**
             * Returns an immutable instance of [Image].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .image()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Image =
                Image(checkRequired("image", image), type, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Image = apply {
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

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaStackClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (image.asKnown() == null) 0 else 1) +
                type.let { if (it == JsonValue.from("image")) 1 else 0 }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Image && image == other.image && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(image, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Image{image=$image, type=$type, additionalProperties=$additionalProperties}"
    }

    class ToolCall
    private constructor(
        private val parseStatus: JsonField<ParseStatus>,
        private val toolCall: JsonField<ToolCallOrString>,
        private val type: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("parse_status")
            @ExcludeMissing
            parseStatus: JsonField<ParseStatus> = JsonMissing.of(),
            @JsonProperty("tool_call")
            @ExcludeMissing
            toolCall: JsonField<ToolCallOrString> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        ) : this(parseStatus, toolCall, type, mutableMapOf())

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

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [ToolCall].
             *
             * The following fields are required:
             * ```kotlin
             * .parseStatus()
             * .toolCall()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ToolCall]. */
        class Builder internal constructor() {

            private var parseStatus: JsonField<ParseStatus>? = null
            private var toolCall: JsonField<ToolCallOrString>? = null
            private var type: JsonValue = JsonValue.from("tool_call")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(toolCall: ToolCall) = apply {
                parseStatus = toolCall.parseStatus
                this.toolCall = toolCall.toolCall
                type = toolCall.type
                additionalProperties = toolCall.additionalProperties.toMutableMap()
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
            //            fun toolCall(toolCall: ToolCall) =
            // toolCall(ToolCallOrString.ofToolCall(com.llama.llamastack.models.ToolCall.builder().
            // toolCall))

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

            /**
             * Returns an immutable instance of [ToolCall].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .parseStatus()
             * .toolCall()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ToolCall =
                ToolCall(
                    checkRequired("parseStatus", parseStatus),
                    checkRequired("toolCall", toolCall),
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ToolCall = apply {
            if (validated) {
                return@apply
            }

            parseStatus().validate()
            toolCall().validate()
            _type().let {
                if (it != JsonValue.from("tool_call")) {
                    throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
                }
            }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaStackClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (parseStatus.asKnown()?.validity() ?: 0) +
                (toolCall.asKnown()?.validity() ?: 0) +
                type.let { if (it == JsonValue.from("tool_call")) 1 else 0 }

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

            private var validated: Boolean = false

            fun validate(): ParseStatus = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LlamaStackClientInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

            return /* spotless:off */ other is ToolCall && parseStatus == other.parseStatus && toolCall == other.toolCall && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(parseStatus, toolCall, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ToolCall{parseStatus=$parseStatus, toolCall=$toolCall, type=$type, additionalProperties=$additionalProperties}"
    }
}
