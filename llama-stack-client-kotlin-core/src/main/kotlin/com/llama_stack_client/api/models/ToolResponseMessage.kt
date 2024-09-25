// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

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
import com.llama_stack_client.api.core.BaseDeserializer
import com.llama_stack_client.api.core.BaseSerializer
import com.llama_stack_client.api.core.Enum
import com.llama_stack_client.api.core.ExcludeMissing
import com.llama_stack_client.api.core.JsonField
import com.llama_stack_client.api.core.JsonMissing
import com.llama_stack_client.api.core.JsonValue
import com.llama_stack_client.api.core.NoAutoDetect
import com.llama_stack_client.api.core.getOrThrow
import com.llama_stack_client.api.core.toUnmodifiable
import com.llama_stack_client.api.errors.LlamaStackClientInvalidDataException
import java.util.Objects

@JsonDeserialize(builder = ToolResponseMessage.Builder::class)
@NoAutoDetect
class ToolResponseMessage
private constructor(
    private val callId: JsonField<String>,
    private val content: JsonField<Content>,
    private val role: JsonField<Role>,
    private val toolName: JsonField<ToolName>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun callId(): String = callId.getRequired("call_id")

    fun content(): Content = content.getRequired("content")

    fun role(): Role = role.getRequired("role")

    fun toolName(): ToolName = toolName.getRequired("tool_name")

    @JsonProperty("call_id") @ExcludeMissing fun _callId() = callId

    @JsonProperty("content") @ExcludeMissing fun _content() = content

    @JsonProperty("role") @ExcludeMissing fun _role() = role

    @JsonProperty("tool_name") @ExcludeMissing fun _toolName() = toolName

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ToolResponseMessage = apply {
        if (!validated) {
            callId()
            content()
            role()
            toolName()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ToolResponseMessage &&
            this.callId == other.callId &&
            this.content == other.content &&
            this.role == other.role &&
            this.toolName == other.toolName &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    callId,
                    content,
                    role,
                    toolName,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "ToolResponseMessage{callId=$callId, content=$content, role=$role, toolName=$toolName, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var callId: JsonField<String> = JsonMissing.of()
        private var content: JsonField<Content> = JsonMissing.of()
        private var role: JsonField<Role> = JsonMissing.of()
        private var toolName: JsonField<ToolName> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(toolResponseMessage: ToolResponseMessage) = apply {
            this.callId = toolResponseMessage.callId
            this.content = toolResponseMessage.content
            this.role = toolResponseMessage.role
            this.toolName = toolResponseMessage.toolName
            additionalProperties(toolResponseMessage.additionalProperties)
        }

        fun callId(callId: String) = callId(JsonField.of(callId))

        @JsonProperty("call_id")
        @ExcludeMissing
        fun callId(callId: JsonField<String>) = apply { this.callId = callId }

        fun content(content: Content) = content(JsonField.of(content))

        @JsonProperty("content")
        @ExcludeMissing
        fun content(content: JsonField<Content>) = apply { this.content = content }

        fun role(role: Role) = role(JsonField.of(role))

        @JsonProperty("role")
        @ExcludeMissing
        fun role(role: JsonField<Role>) = apply { this.role = role }

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

        fun build(): ToolResponseMessage =
            ToolResponseMessage(
                callId,
                content,
                role,
                toolName,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(using = Content.Deserializer::class)
    @JsonSerialize(using = Content.Serializer::class)
    class Content
    private constructor(
        private val string: String? = null,
        private val strings: List<String>? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun string(): String? = string

        fun strings(): List<String>? = strings

        fun isString(): Boolean = string != null

        fun isStrings(): Boolean = strings != null

        fun asString(): String = string.getOrThrow("string")

        fun asStrings(): List<String> = strings.getOrThrow("strings")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                string != null -> visitor.visitString(string)
                strings != null -> visitor.visitStrings(strings)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): Content = apply {
            if (!validated) {
                if (string == null && strings == null) {
                    throw LlamaStackClientInvalidDataException("Unknown Content: $_json")
                }
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Content && this.string == other.string && this.strings == other.strings
        }

        override fun hashCode(): Int {
            return Objects.hash(string, strings)
        }

        override fun toString(): String {
            return when {
                string != null -> "Content{string=$string}"
                strings != null -> "Content{strings=$strings}"
                _json != null -> "Content{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Content")
            }
        }

        companion object {

            fun ofString(string: String) = Content(string = string)

            fun ofStrings(strings: List<String>) = Content(strings = strings)
        }

        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitStrings(strings: List<String>): T

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
                tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                    return Content(strings = it, _json = json)
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
                    value.strings != null -> generator.writeObject(value.strings)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Content")
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

            return other is Role && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val IPYTHON = Role(JsonField.of("ipython"))

            fun of(value: String) = Role(JsonField.of(value))
        }

        enum class Known {
            IPYTHON,
        }

        enum class Value {
            IPYTHON,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                IPYTHON -> Value.IPYTHON
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                IPYTHON -> Known.IPYTHON
                else -> throw LlamaStackClientInvalidDataException("Unknown Role: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    @JsonDeserialize(using = ToolName.Deserializer::class)
    @JsonSerialize(using = ToolName.Serializer::class)
    class ToolName
    private constructor(
        private val builtinTool: BuiltinTool? = null,
        private val string: String? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun builtinTool(): BuiltinTool? = builtinTool

        fun string(): String? = string

        fun isBuiltinTool(): Boolean = builtinTool != null

        fun isString(): Boolean = string != null

        fun asBuiltinTool(): BuiltinTool = builtinTool.getOrThrow("builtinTool")

        fun asString(): String = string.getOrThrow("string")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                builtinTool != null -> visitor.visitBuiltinTool(builtinTool)
                string != null -> visitor.visitString(string)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): ToolName = apply {
            if (!validated) {
                if (builtinTool == null && string == null) {
                    throw LlamaStackClientInvalidDataException("Unknown ToolName: $_json")
                }
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ToolName &&
                this.builtinTool == other.builtinTool &&
                this.string == other.string
        }

        override fun hashCode(): Int {
            return Objects.hash(builtinTool, string)
        }

        override fun toString(): String {
            return when {
                builtinTool != null -> "ToolName{builtinTool=$builtinTool}"
                string != null -> "ToolName{string=$string}"
                _json != null -> "ToolName{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid ToolName")
            }
        }

        companion object {

            fun ofBuiltinTool(builtinTool: BuiltinTool) = ToolName(builtinTool = builtinTool)

            fun ofString(string: String) = ToolName(string = string)
        }

        interface Visitor<out T> {

            fun visitBuiltinTool(builtinTool: BuiltinTool): T

            fun visitString(string: String): T

            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown ToolName: $json")
            }
        }

        class Deserializer : BaseDeserializer<ToolName>(ToolName::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): ToolName {
                val json = JsonValue.fromJsonNode(node)
                tryDeserialize(node, jacksonTypeRef<BuiltinTool>())?.let {
                    return ToolName(builtinTool = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                    return ToolName(string = it, _json = json)
                }

                return ToolName(_json = json)
            }
        }

        class Serializer : BaseSerializer<ToolName>(ToolName::class) {

            override fun serialize(
                value: ToolName,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.builtinTool != null -> generator.writeObject(value.builtinTool)
                    value.string != null -> generator.writeObject(value.string)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid ToolName")
                }
            }
        }

        class BuiltinTool
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BuiltinTool && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val BRAVE_SEARCH = BuiltinTool(JsonField.of("brave_search"))

                val WOLFRAM_ALPHA = BuiltinTool(JsonField.of("wolfram_alpha"))

                val PHOTOGEN = BuiltinTool(JsonField.of("photogen"))

                val CODE_INTERPRETER = BuiltinTool(JsonField.of("code_interpreter"))

                fun of(value: String) = BuiltinTool(JsonField.of(value))
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
                    else ->
                        throw LlamaStackClientInvalidDataException("Unknown BuiltinTool: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }
}
