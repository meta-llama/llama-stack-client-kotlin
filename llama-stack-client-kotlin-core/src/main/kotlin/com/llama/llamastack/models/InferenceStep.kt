// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.llama.llamastack.core.Enum
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class InferenceStep
@JsonCreator
private constructor(
    @JsonProperty("model_response")
    @ExcludeMissing
    private val modelResponse: JsonField<ModelResponse> = JsonMissing.of(),
    @JsonProperty("step_id")
    @ExcludeMissing
    private val stepId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("step_type")
    @ExcludeMissing
    private val stepType: JsonField<StepType> = JsonMissing.of(),
    @JsonProperty("turn_id")
    @ExcludeMissing
    private val turnId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("completed_at")
    @ExcludeMissing
    private val completedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("started_at")
    @ExcludeMissing
    private val startedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun modelResponse(): ModelResponse = modelResponse.getRequired("model_response")

    fun stepId(): String = stepId.getRequired("step_id")

    fun stepType(): StepType = stepType.getRequired("step_type")

    fun turnId(): String = turnId.getRequired("turn_id")

    fun completedAt(): OffsetDateTime? = completedAt.getNullable("completed_at")

    fun startedAt(): OffsetDateTime? = startedAt.getNullable("started_at")

    @JsonProperty("model_response")
    @ExcludeMissing
    fun _modelResponse(): JsonField<ModelResponse> = modelResponse

    @JsonProperty("step_id") @ExcludeMissing fun _stepId(): JsonField<String> = stepId

    @JsonProperty("step_type") @ExcludeMissing fun _stepType(): JsonField<StepType> = stepType

    @JsonProperty("turn_id") @ExcludeMissing fun _turnId(): JsonField<String> = turnId

    @JsonProperty("completed_at")
    @ExcludeMissing
    fun _completedAt(): JsonField<OffsetDateTime> = completedAt

    @JsonProperty("started_at")
    @ExcludeMissing
    fun _startedAt(): JsonField<OffsetDateTime> = startedAt

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): InferenceStep = apply {
        if (validated) {
            return@apply
        }

        modelResponse().validate()
        stepId()
        stepType()
        turnId()
        completedAt()
        startedAt()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var modelResponse: JsonField<ModelResponse>? = null
        private var stepId: JsonField<String>? = null
        private var stepType: JsonField<StepType>? = null
        private var turnId: JsonField<String>? = null
        private var completedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var startedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(inferenceStep: InferenceStep) = apply {
            modelResponse = inferenceStep.modelResponse
            stepId = inferenceStep.stepId
            stepType = inferenceStep.stepType
            turnId = inferenceStep.turnId
            completedAt = inferenceStep.completedAt
            startedAt = inferenceStep.startedAt
            additionalProperties = inferenceStep.additionalProperties.toMutableMap()
        }

        fun modelResponse(modelResponse: ModelResponse) = modelResponse(JsonField.of(modelResponse))

        fun modelResponse(modelResponse: JsonField<ModelResponse>) = apply {
            this.modelResponse = modelResponse
        }

        fun stepId(stepId: String) = stepId(JsonField.of(stepId))

        fun stepId(stepId: JsonField<String>) = apply { this.stepId = stepId }

        fun stepType(stepType: StepType) = stepType(JsonField.of(stepType))

        fun stepType(stepType: JsonField<StepType>) = apply { this.stepType = stepType }

        fun turnId(turnId: String) = turnId(JsonField.of(turnId))

        fun turnId(turnId: JsonField<String>) = apply { this.turnId = turnId }

        fun completedAt(completedAt: OffsetDateTime) = completedAt(JsonField.of(completedAt))

        fun completedAt(completedAt: JsonField<OffsetDateTime>) = apply {
            this.completedAt = completedAt
        }

        fun startedAt(startedAt: OffsetDateTime) = startedAt(JsonField.of(startedAt))

        fun startedAt(startedAt: JsonField<OffsetDateTime>) = apply { this.startedAt = startedAt }

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

        fun build(): InferenceStep =
            InferenceStep(
                checkRequired("modelResponse", modelResponse),
                checkRequired("stepId", stepId),
                checkRequired("stepType", stepType),
                checkRequired("turnId", turnId),
                completedAt,
                startedAt,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class ModelResponse
    @JsonCreator
    private constructor(
        @JsonProperty("content")
        @ExcludeMissing
        private val content: JsonField<InterleavedContent> = JsonMissing.of(),
        @JsonProperty("role") @ExcludeMissing private val role: JsonField<Role> = JsonMissing.of(),
        @JsonProperty("stop_reason")
        @ExcludeMissing
        private val stopReason: JsonField<StopReason> = JsonMissing.of(),
        @JsonProperty("tool_calls")
        @ExcludeMissing
        private val toolCalls: JsonField<List<ToolCall>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun content(): InterleavedContent = content.getRequired("content")

        fun role(): Role = role.getRequired("role")

        fun stopReason(): StopReason = stopReason.getRequired("stop_reason")

        fun toolCalls(): List<ToolCall> = toolCalls.getRequired("tool_calls")

        @JsonProperty("content")
        @ExcludeMissing
        fun _content(): JsonField<InterleavedContent> = content

        @JsonProperty("role") @ExcludeMissing fun _role(): JsonField<Role> = role

        @JsonProperty("stop_reason")
        @ExcludeMissing
        fun _stopReason(): JsonField<StopReason> = stopReason

        @JsonProperty("tool_calls")
        @ExcludeMissing
        fun _toolCalls(): JsonField<List<ToolCall>> = toolCalls

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ModelResponse = apply {
            if (validated) {
                return@apply
            }

            content().validate()
            role()
            stopReason()
            toolCalls().forEach { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var content: JsonField<InterleavedContent>? = null
            private var role: JsonField<Role>? = null
            private var stopReason: JsonField<StopReason>? = null
            private var toolCalls: JsonField<MutableList<ToolCall>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(modelResponse: ModelResponse) = apply {
                content = modelResponse.content
                role = modelResponse.role
                stopReason = modelResponse.stopReason
                toolCalls = modelResponse.toolCalls.map { it.toMutableList() }
                additionalProperties = modelResponse.additionalProperties.toMutableMap()
            }

            fun content(content: InterleavedContent) = content(JsonField.of(content))

            fun content(content: JsonField<InterleavedContent>) = apply { this.content = content }

            fun content(string: String) = content(InterleavedContent.ofString(string))

            fun content(imageContentItem: InterleavedContent.ImageContentItem) =
                content(InterleavedContent.ofImageContentItem(imageContentItem))

            fun content(textContentItem: InterleavedContent.TextContentItem) =
                content(InterleavedContent.ofTextContentItem(textContentItem))

            fun contentOfInterleavedContentItems(
                interleavedContentItems: List<InterleavedContentItem>
            ) = content(InterleavedContent.ofInterleavedContentItems(interleavedContentItems))

            fun role(role: Role) = role(JsonField.of(role))

            fun role(role: JsonField<Role>) = apply { this.role = role }

            fun stopReason(stopReason: StopReason) = stopReason(JsonField.of(stopReason))

            fun stopReason(stopReason: JsonField<StopReason>) = apply {
                this.stopReason = stopReason
            }

            fun toolCalls(toolCalls: List<ToolCall>) = toolCalls(JsonField.of(toolCalls))

            fun toolCalls(toolCalls: JsonField<List<ToolCall>>) = apply {
                this.toolCalls = toolCalls.map { it.toMutableList() }
            }

            fun addToolCall(toolCall: ToolCall) = apply {
                toolCalls =
                    (toolCalls ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(toolCall)
                    }
            }

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

            fun build(): ModelResponse =
                ModelResponse(
                    checkRequired("content", content),
                    checkRequired("role", role),
                    checkRequired("stopReason", stopReason),
                    checkRequired("toolCalls", toolCalls).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        class Role
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ASSISTANT = of("assistant")

                fun of(value: String) = Role(JsonField.of(value))
            }

            enum class Known {
                ASSISTANT,
            }

            enum class Value {
                ASSISTANT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ASSISTANT -> Value.ASSISTANT
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ASSISTANT -> Known.ASSISTANT
                    else -> throw LlamaStackClientInvalidDataException("Unknown Role: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Role && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class StopReason
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val END_OF_TURN = of("end_of_turn")

                val END_OF_MESSAGE = of("end_of_message")

                val OUT_OF_TOKENS = of("out_of_tokens")

                fun of(value: String) = StopReason(JsonField.of(value))
            }

            enum class Known {
                END_OF_TURN,
                END_OF_MESSAGE,
                OUT_OF_TOKENS,
            }

            enum class Value {
                END_OF_TURN,
                END_OF_MESSAGE,
                OUT_OF_TOKENS,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    END_OF_TURN -> Value.END_OF_TURN
                    END_OF_MESSAGE -> Value.END_OF_MESSAGE
                    OUT_OF_TOKENS -> Value.OUT_OF_TOKENS
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    END_OF_TURN -> Known.END_OF_TURN
                    END_OF_MESSAGE -> Known.END_OF_MESSAGE
                    OUT_OF_TOKENS -> Known.OUT_OF_TOKENS
                    else -> throw LlamaStackClientInvalidDataException("Unknown StopReason: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is StopReason && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ModelResponse && content == other.content && role == other.role && stopReason == other.stopReason && toolCalls == other.toolCalls && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(content, role, stopReason, toolCalls, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ModelResponse{content=$content, role=$role, stopReason=$stopReason, toolCalls=$toolCalls, additionalProperties=$additionalProperties}"
    }

    class StepType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val INFERENCE = of("inference")

            fun of(value: String) = StepType(JsonField.of(value))
        }

        enum class Known {
            INFERENCE,
        }

        enum class Value {
            INFERENCE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                INFERENCE -> Value.INFERENCE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                INFERENCE -> Known.INFERENCE
                else -> throw LlamaStackClientInvalidDataException("Unknown StepType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is StepType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InferenceStep && modelResponse == other.modelResponse && stepId == other.stepId && stepType == other.stepType && turnId == other.turnId && completedAt == other.completedAt && startedAt == other.startedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(modelResponse, stepId, stepType, turnId, completedAt, startedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InferenceStep{modelResponse=$modelResponse, stepId=$stepId, stepType=$stepType, turnId=$turnId, completedAt=$completedAt, startedAt=$startedAt, additionalProperties=$additionalProperties}"
}
