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

@JsonDeserialize(builder = ToolCall.Builder::class)
@NoAutoDetect
class ToolCall
private constructor(
    private val arguments: JsonField<Arguments>,
    private val callId: JsonField<String>,
    private val toolName: JsonField<ToolName>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun arguments(): Arguments = arguments.getRequired("arguments")

    fun callId(): String = callId.getRequired("call_id")

    fun toolName(): ToolName = toolName.getRequired("tool_name")

    @JsonProperty("arguments") @ExcludeMissing fun _arguments() = arguments

    @JsonProperty("call_id") @ExcludeMissing fun _callId() = callId

    @JsonProperty("tool_name") @ExcludeMissing fun _toolName() = toolName

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ToolCall = apply {
        if (!validated) {
            arguments().validate()
            callId()
            toolName()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ToolCall &&
            this.arguments == other.arguments &&
            this.callId == other.callId &&
            this.toolName == other.toolName &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    arguments,
                    callId,
                    toolName,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "ToolCall{arguments=$arguments, callId=$callId, toolName=$toolName, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var arguments: JsonField<Arguments> = JsonMissing.of()
        private var callId: JsonField<String> = JsonMissing.of()
        private var toolName: JsonField<ToolName> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(toolCall: ToolCall) = apply {
            this.arguments = toolCall.arguments
            this.callId = toolCall.callId
            this.toolName = toolCall.toolName
            additionalProperties(toolCall.additionalProperties)
        }

        fun arguments(arguments: Arguments) = arguments(JsonField.of(arguments))

        @JsonProperty("arguments")
        @ExcludeMissing
        fun arguments(arguments: JsonField<Arguments>) = apply { this.arguments = arguments }

        fun callId(callId: String) = callId(JsonField.of(callId))

        @JsonProperty("call_id")
        @ExcludeMissing
        fun callId(callId: JsonField<String>) = apply { this.callId = callId }

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

        fun build(): ToolCall =
            ToolCall(
                arguments,
                callId,
                toolName,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Arguments.Builder::class)
    @NoAutoDetect
    class Arguments
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Arguments = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Arguments && this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "Arguments{additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(arguments: Arguments) = apply {
                additionalProperties(arguments.additionalProperties)
            }

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

            fun build(): Arguments = Arguments(additionalProperties.toUnmodifiable())
        }
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
