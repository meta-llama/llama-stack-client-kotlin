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
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = ToolExecutionStep.Builder::class)
@NoAutoDetect
class ToolExecutionStep
private constructor(
    private val completedAt: JsonField<OffsetDateTime>,
    private val startedAt: JsonField<OffsetDateTime>,
    private val stepId: JsonField<String>,
    private val stepType: JsonField<StepType>,
    private val toolCalls: JsonField<List<ToolCall>>,
    private val toolResponses: JsonField<List<ToolResponse>>,
    private val turnId: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun completedAt(): OffsetDateTime? = completedAt.getNullable("completed_at")

    fun startedAt(): OffsetDateTime? = startedAt.getNullable("started_at")

    fun stepId(): String = stepId.getRequired("step_id")

    fun stepType(): StepType = stepType.getRequired("step_type")

    fun toolCalls(): List<ToolCall> = toolCalls.getRequired("tool_calls")

    fun toolResponses(): List<ToolResponse> = toolResponses.getRequired("tool_responses")

    fun turnId(): String = turnId.getRequired("turn_id")

    @JsonProperty("completed_at") @ExcludeMissing fun _completedAt() = completedAt

    @JsonProperty("started_at") @ExcludeMissing fun _startedAt() = startedAt

    @JsonProperty("step_id") @ExcludeMissing fun _stepId() = stepId

    @JsonProperty("step_type") @ExcludeMissing fun _stepType() = stepType

    @JsonProperty("tool_calls") @ExcludeMissing fun _toolCalls() = toolCalls

    @JsonProperty("tool_responses") @ExcludeMissing fun _toolResponses() = toolResponses

    @JsonProperty("turn_id") @ExcludeMissing fun _turnId() = turnId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ToolExecutionStep = apply {
        if (!validated) {
            completedAt()
            startedAt()
            stepId()
            stepType()
            toolCalls().forEach { it.validate() }
            toolResponses().forEach { it.validate() }
            turnId()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ToolExecutionStep &&
            this.completedAt == other.completedAt &&
            this.startedAt == other.startedAt &&
            this.stepId == other.stepId &&
            this.stepType == other.stepType &&
            this.toolCalls == other.toolCalls &&
            this.toolResponses == other.toolResponses &&
            this.turnId == other.turnId &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    completedAt,
                    startedAt,
                    stepId,
                    stepType,
                    toolCalls,
                    toolResponses,
                    turnId,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "ToolExecutionStep{completedAt=$completedAt, startedAt=$startedAt, stepId=$stepId, stepType=$stepType, toolCalls=$toolCalls, toolResponses=$toolResponses, turnId=$turnId, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var completedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var startedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var stepId: JsonField<String> = JsonMissing.of()
        private var stepType: JsonField<StepType> = JsonMissing.of()
        private var toolCalls: JsonField<List<ToolCall>> = JsonMissing.of()
        private var toolResponses: JsonField<List<ToolResponse>> = JsonMissing.of()
        private var turnId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(toolExecutionStep: ToolExecutionStep) = apply {
            this.completedAt = toolExecutionStep.completedAt
            this.startedAt = toolExecutionStep.startedAt
            this.stepId = toolExecutionStep.stepId
            this.stepType = toolExecutionStep.stepType
            this.toolCalls = toolExecutionStep.toolCalls
            this.toolResponses = toolExecutionStep.toolResponses
            this.turnId = toolExecutionStep.turnId
            additionalProperties(toolExecutionStep.additionalProperties)
        }

        fun completedAt(completedAt: OffsetDateTime) = completedAt(JsonField.of(completedAt))

        @JsonProperty("completed_at")
        @ExcludeMissing
        fun completedAt(completedAt: JsonField<OffsetDateTime>) = apply {
            this.completedAt = completedAt
        }

        fun startedAt(startedAt: OffsetDateTime) = startedAt(JsonField.of(startedAt))

        @JsonProperty("started_at")
        @ExcludeMissing
        fun startedAt(startedAt: JsonField<OffsetDateTime>) = apply { this.startedAt = startedAt }

        fun stepId(stepId: String) = stepId(JsonField.of(stepId))

        @JsonProperty("step_id")
        @ExcludeMissing
        fun stepId(stepId: JsonField<String>) = apply { this.stepId = stepId }

        fun stepType(stepType: StepType) = stepType(JsonField.of(stepType))

        @JsonProperty("step_type")
        @ExcludeMissing
        fun stepType(stepType: JsonField<StepType>) = apply { this.stepType = stepType }

        fun toolCalls(toolCalls: List<ToolCall>) = toolCalls(JsonField.of(toolCalls))

        @JsonProperty("tool_calls")
        @ExcludeMissing
        fun toolCalls(toolCalls: JsonField<List<ToolCall>>) = apply { this.toolCalls = toolCalls }

        fun toolResponses(toolResponses: List<ToolResponse>) =
            toolResponses(JsonField.of(toolResponses))

        @JsonProperty("tool_responses")
        @ExcludeMissing
        fun toolResponses(toolResponses: JsonField<List<ToolResponse>>) = apply {
            this.toolResponses = toolResponses
        }

        fun turnId(turnId: String) = turnId(JsonField.of(turnId))

        @JsonProperty("turn_id")
        @ExcludeMissing
        fun turnId(turnId: JsonField<String>) = apply { this.turnId = turnId }

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

        fun build(): ToolExecutionStep =
            ToolExecutionStep(
                completedAt,
                startedAt,
                stepId,
                stepType,
                toolCalls.map { it.toUnmodifiable() },
                toolResponses.map { it.toUnmodifiable() },
                turnId,
                additionalProperties.toUnmodifiable(),
            )
    }

    class StepType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is StepType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val TOOL_EXECUTION = StepType(JsonField.of("tool_execution"))

            fun of(value: String) = StepType(JsonField.of(value))
        }

        enum class Known {
            TOOL_EXECUTION,
        }

        enum class Value {
            TOOL_EXECUTION,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                TOOL_EXECUTION -> Value.TOOL_EXECUTION
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                TOOL_EXECUTION -> Known.TOOL_EXECUTION
                else -> throw LlamaStackClientInvalidDataException("Unknown StepType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

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

        private var hashCode: Int = 0

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ToolResponse &&
                this.callId == other.callId &&
                this.content == other.content &&
                this.toolName == other.toolName &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        callId,
                        content,
                        toolName,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "ToolResponse{callId=$callId, content=$content, toolName=$toolName, additionalProperties=$additionalProperties}"

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

                return other is Content &&
                    this.string == other.string &&
                    this.strings == other.strings
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
                            throw LlamaStackClientInvalidDataException(
                                "Unknown BuiltinTool: $value"
                            )
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }
    }
}
