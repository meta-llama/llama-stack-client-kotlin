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
class ToolExecutionStep
@JsonCreator
private constructor(
    @JsonProperty("step_id")
    @ExcludeMissing
    private val stepId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("step_type") @ExcludeMissing private val stepType: JsonValue = JsonMissing.of(),
    @JsonProperty("tool_calls")
    @ExcludeMissing
    private val toolCalls: JsonField<List<ToolCall>> = JsonMissing.of(),
    @JsonProperty("tool_responses")
    @ExcludeMissing
    private val toolResponses: JsonField<List<ToolResponse>> = JsonMissing.of(),
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

    fun stepId(): String = stepId.getRequired("step_id")

    @JsonProperty("step_type") @ExcludeMissing fun _stepType(): JsonValue = stepType

    fun toolCalls(): List<ToolCall> = toolCalls.getRequired("tool_calls")

    fun toolResponses(): List<ToolResponse> = toolResponses.getRequired("tool_responses")

    fun turnId(): String = turnId.getRequired("turn_id")

    fun completedAt(): OffsetDateTime? = completedAt.getNullable("completed_at")

    fun startedAt(): OffsetDateTime? = startedAt.getNullable("started_at")

    @JsonProperty("step_id") @ExcludeMissing fun _stepId(): JsonField<String> = stepId

    @JsonProperty("tool_calls")
    @ExcludeMissing
    fun _toolCalls(): JsonField<List<ToolCall>> = toolCalls

    @JsonProperty("tool_responses")
    @ExcludeMissing
    fun _toolResponses(): JsonField<List<ToolResponse>> = toolResponses

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

    fun validate(): ToolExecutionStep = apply {
        if (validated) {
            return@apply
        }

        stepId()
        _stepType().let {
            if (it != JsonValue.from("tool_execution")) {
                throw LlamaStackClientInvalidDataException("'stepType' is invalid, received $it")
            }
        }
        toolCalls().forEach { it.validate() }
        toolResponses().forEach { it.validate() }
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

        private var stepId: JsonField<String>? = null
        private var stepType: JsonValue = JsonValue.from("tool_execution")
        private var toolCalls: JsonField<MutableList<ToolCall>>? = null
        private var toolResponses: JsonField<MutableList<ToolResponse>>? = null
        private var turnId: JsonField<String>? = null
        private var completedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var startedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(toolExecutionStep: ToolExecutionStep) = apply {
            stepId = toolExecutionStep.stepId
            stepType = toolExecutionStep.stepType
            toolCalls = toolExecutionStep.toolCalls.map { it.toMutableList() }
            toolResponses = toolExecutionStep.toolResponses.map { it.toMutableList() }
            turnId = toolExecutionStep.turnId
            completedAt = toolExecutionStep.completedAt
            startedAt = toolExecutionStep.startedAt
            additionalProperties = toolExecutionStep.additionalProperties.toMutableMap()
        }

        fun stepId(stepId: String) = stepId(JsonField.of(stepId))

        fun stepId(stepId: JsonField<String>) = apply { this.stepId = stepId }

        fun stepType(stepType: JsonValue) = apply { this.stepType = stepType }

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

        fun toolResponses(toolResponses: List<ToolResponse>) =
            toolResponses(JsonField.of(toolResponses))

        fun toolResponses(toolResponses: JsonField<List<ToolResponse>>) = apply {
            this.toolResponses = toolResponses.map { it.toMutableList() }
        }

        fun addToolResponse(toolResponse: ToolResponse) = apply {
            toolResponses =
                (toolResponses ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(toolResponse)
                }
        }

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

        fun build(): ToolExecutionStep =
            ToolExecutionStep(
                checkRequired("stepId", stepId),
                stepType,
                checkRequired("toolCalls", toolCalls).map { it.toImmutable() },
                checkRequired("toolResponses", toolResponses).map { it.toImmutable() },
                checkRequired("turnId", turnId),
                completedAt,
                startedAt,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class ToolCall
    @JsonCreator
    private constructor(
        @JsonProperty("arguments")
        @ExcludeMissing
        private val arguments: JsonField<Arguments> = JsonMissing.of(),
        @JsonProperty("call_id")
        @ExcludeMissing
        private val callId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tool_name")
        @ExcludeMissing
        private val toolName: JsonField<ToolName> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun arguments(): Arguments = arguments.getRequired("arguments")

        fun callId(): String = callId.getRequired("call_id")

        fun toolName(): ToolName = toolName.getRequired("tool_name")

        @JsonProperty("arguments")
        @ExcludeMissing
        fun _arguments(): JsonField<Arguments> = arguments

        @JsonProperty("call_id") @ExcludeMissing fun _callId(): JsonField<String> = callId

        @JsonProperty("tool_name") @ExcludeMissing fun _toolName(): JsonField<ToolName> = toolName

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ToolCall = apply {
            if (validated) {
                return@apply
            }

            arguments().validate()
            callId()
            toolName()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var arguments: JsonField<Arguments>? = null
            private var callId: JsonField<String>? = null
            private var toolName: JsonField<ToolName>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(toolCall: ToolCall) = apply {
                arguments = toolCall.arguments
                callId = toolCall.callId
                toolName = toolCall.toolName
                additionalProperties = toolCall.additionalProperties.toMutableMap()
            }

            fun arguments(arguments: Arguments) = arguments(JsonField.of(arguments))

            fun arguments(arguments: JsonField<Arguments>) = apply { this.arguments = arguments }

            fun callId(callId: String) = callId(JsonField.of(callId))

            fun callId(callId: JsonField<String>) = apply { this.callId = callId }

            fun toolName(toolName: ToolName) = toolName(JsonField.of(toolName))

            fun toolName(toolName: JsonField<ToolName>) = apply { this.toolName = toolName }

            fun toolName(value: String) = apply { toolName(ToolName.of(value)) }

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

            fun build(): ToolCall =
                ToolCall(
                    checkRequired("arguments", arguments),
                    checkRequired("callId", callId),
                    checkRequired("toolName", toolName),
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class Arguments
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Arguments = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(arguments: Arguments) = apply {
                    additionalProperties = arguments.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): Arguments = Arguments(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Arguments && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Arguments{additionalProperties=$additionalProperties}"
        }

        class ToolName
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val BRAVE_SEARCH = of("brave_search")

                val WOLFRAM_ALPHA = of("wolfram_alpha")

                val PHOTOGEN = of("photogen")

                val CODE_INTERPRETER = of("code_interpreter")

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ToolName && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ToolCall && arguments == other.arguments && callId == other.callId && toolName == other.toolName && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(arguments, callId, toolName, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ToolCall{arguments=$arguments, callId=$callId, toolName=$toolName, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ToolExecutionStep && stepId == other.stepId && stepType == other.stepType && toolCalls == other.toolCalls && toolResponses == other.toolResponses && turnId == other.turnId && completedAt == other.completedAt && startedAt == other.startedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(stepId, stepType, toolCalls, toolResponses, turnId, completedAt, startedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ToolExecutionStep{stepId=$stepId, stepType=$stepType, toolCalls=$toolCalls, toolResponses=$toolResponses, turnId=$turnId, completedAt=$completedAt, startedAt=$startedAt, additionalProperties=$additionalProperties}"
}
