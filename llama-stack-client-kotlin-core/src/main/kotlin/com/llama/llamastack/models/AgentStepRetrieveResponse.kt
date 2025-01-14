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
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

@NoAutoDetect
class AgentStepRetrieveResponse
@JsonCreator
private constructor(
    @JsonProperty("step") @ExcludeMissing private val step: JsonField<Step> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun step(): Step = step.getRequired("step")

    @JsonProperty("step") @ExcludeMissing fun _step(): JsonField<Step> = step

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AgentStepRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        step().validate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var step: JsonField<Step>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(agentStepRetrieveResponse: AgentStepRetrieveResponse) = apply {
            step = agentStepRetrieveResponse.step
            additionalProperties = agentStepRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun step(step: Step) = step(JsonField.of(step))

        fun step(step: JsonField<Step>) = apply { this.step = step }

        fun step(inferenceStep: InferenceStep) = step(Step.ofInferenceStep(inferenceStep))

        fun step(toolExecutionStep: ToolExecutionStep) =
            step(Step.ofToolExecutionStep(toolExecutionStep))

        fun step(shieldCallStep: ShieldCallStep) = step(Step.ofShieldCallStep(shieldCallStep))

        fun step(memoryRetrievalStep: MemoryRetrievalStep) =
            step(Step.ofMemoryRetrievalStep(memoryRetrievalStep))

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

        fun build(): AgentStepRetrieveResponse =
            AgentStepRetrieveResponse(
                checkNotNull(step) { "`step` is required but was not set" },
                additionalProperties.toImmutable()
            )
    }

    @JsonDeserialize(using = Step.Deserializer::class)
    @JsonSerialize(using = Step.Serializer::class)
    class Step
    private constructor(
        private val inferenceStep: InferenceStep? = null,
        private val toolExecutionStep: ToolExecutionStep? = null,
        private val shieldCallStep: ShieldCallStep? = null,
        private val memoryRetrievalStep: MemoryRetrievalStep? = null,
        private val _json: JsonValue? = null,
    ) {

        fun inferenceStep(): InferenceStep? = inferenceStep

        fun toolExecutionStep(): ToolExecutionStep? = toolExecutionStep

        fun shieldCallStep(): ShieldCallStep? = shieldCallStep

        fun memoryRetrievalStep(): MemoryRetrievalStep? = memoryRetrievalStep

        fun isInferenceStep(): Boolean = inferenceStep != null

        fun isToolExecutionStep(): Boolean = toolExecutionStep != null

        fun isShieldCallStep(): Boolean = shieldCallStep != null

        fun isMemoryRetrievalStep(): Boolean = memoryRetrievalStep != null

        fun asInferenceStep(): InferenceStep = inferenceStep.getOrThrow("inferenceStep")

        fun asToolExecutionStep(): ToolExecutionStep =
            toolExecutionStep.getOrThrow("toolExecutionStep")

        fun asShieldCallStep(): ShieldCallStep = shieldCallStep.getOrThrow("shieldCallStep")

        fun asMemoryRetrievalStep(): MemoryRetrievalStep =
            memoryRetrievalStep.getOrThrow("memoryRetrievalStep")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                inferenceStep != null -> visitor.visitInferenceStep(inferenceStep)
                toolExecutionStep != null -> visitor.visitToolExecutionStep(toolExecutionStep)
                shieldCallStep != null -> visitor.visitShieldCallStep(shieldCallStep)
                memoryRetrievalStep != null -> visitor.visitMemoryRetrievalStep(memoryRetrievalStep)
                else -> visitor.unknown(_json)
            }
        }

        private var validated: Boolean = false

        fun validate(): Step = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitInferenceStep(inferenceStep: InferenceStep) {
                        inferenceStep.validate()
                    }

                    override fun visitToolExecutionStep(toolExecutionStep: ToolExecutionStep) {
                        toolExecutionStep.validate()
                    }

                    override fun visitShieldCallStep(shieldCallStep: ShieldCallStep) {
                        shieldCallStep.validate()
                    }

                    override fun visitMemoryRetrievalStep(
                        memoryRetrievalStep: MemoryRetrievalStep
                    ) {
                        memoryRetrievalStep.validate()
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Step && inferenceStep == other.inferenceStep && toolExecutionStep == other.toolExecutionStep && shieldCallStep == other.shieldCallStep && memoryRetrievalStep == other.memoryRetrievalStep /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(inferenceStep, toolExecutionStep, shieldCallStep, memoryRetrievalStep) /* spotless:on */

        override fun toString(): String =
            when {
                inferenceStep != null -> "Step{inferenceStep=$inferenceStep}"
                toolExecutionStep != null -> "Step{toolExecutionStep=$toolExecutionStep}"
                shieldCallStep != null -> "Step{shieldCallStep=$shieldCallStep}"
                memoryRetrievalStep != null -> "Step{memoryRetrievalStep=$memoryRetrievalStep}"
                _json != null -> "Step{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Step")
            }

        companion object {

            fun ofInferenceStep(inferenceStep: InferenceStep) = Step(inferenceStep = inferenceStep)

            fun ofToolExecutionStep(toolExecutionStep: ToolExecutionStep) =
                Step(toolExecutionStep = toolExecutionStep)

            fun ofShieldCallStep(shieldCallStep: ShieldCallStep) =
                Step(shieldCallStep = shieldCallStep)

            fun ofMemoryRetrievalStep(memoryRetrievalStep: MemoryRetrievalStep) =
                Step(memoryRetrievalStep = memoryRetrievalStep)
        }

        interface Visitor<out T> {

            fun visitInferenceStep(inferenceStep: InferenceStep): T

            fun visitToolExecutionStep(toolExecutionStep: ToolExecutionStep): T

            fun visitShieldCallStep(shieldCallStep: ShieldCallStep): T

            fun visitMemoryRetrievalStep(memoryRetrievalStep: MemoryRetrievalStep): T

            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown Step: $json")
            }
        }

        class Deserializer : BaseDeserializer<Step>(Step::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Step {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<InferenceStep>()) { it.validate() }
                    ?.let {
                        return Step(inferenceStep = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<ToolExecutionStep>()) { it.validate() }
                    ?.let {
                        return Step(toolExecutionStep = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<ShieldCallStep>()) { it.validate() }
                    ?.let {
                        return Step(shieldCallStep = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<MemoryRetrievalStep>()) { it.validate() }
                    ?.let {
                        return Step(memoryRetrievalStep = it, _json = json)
                    }

                return Step(_json = json)
            }
        }

        class Serializer : BaseSerializer<Step>(Step::class) {

            override fun serialize(
                value: Step,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.inferenceStep != null -> generator.writeObject(value.inferenceStep)
                    value.toolExecutionStep != null ->
                        generator.writeObject(value.toolExecutionStep)
                    value.shieldCallStep != null -> generator.writeObject(value.shieldCallStep)
                    value.memoryRetrievalStep != null ->
                        generator.writeObject(value.memoryRetrievalStep)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Step")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AgentStepRetrieveResponse && step == other.step && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(step, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgentStepRetrieveResponse{step=$step, additionalProperties=$additionalProperties}"
}
