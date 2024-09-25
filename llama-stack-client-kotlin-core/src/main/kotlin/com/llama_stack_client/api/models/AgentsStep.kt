// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
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
import com.llama_stack_client.api.core.ExcludeMissing
import com.llama_stack_client.api.core.JsonField
import com.llama_stack_client.api.core.JsonMissing
import com.llama_stack_client.api.core.JsonValue
import com.llama_stack_client.api.core.NoAutoDetect
import com.llama_stack_client.api.core.getOrThrow
import com.llama_stack_client.api.core.toUnmodifiable
import com.llama_stack_client.api.errors.LlamaStackClientInvalidDataException
import java.util.Objects

@JsonDeserialize(builder = AgentsStep.Builder::class)
@NoAutoDetect
class AgentsStep
private constructor(
    private val step: JsonField<Step>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun step(): Step = step.getRequired("step")

    @JsonProperty("step") @ExcludeMissing fun _step() = step

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): AgentsStep = apply {
        if (!validated) {
            step()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentsStep &&
            this.step == other.step &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = Objects.hash(step, additionalProperties)
        }
        return hashCode
    }

    override fun toString() = "AgentsStep{step=$step, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var step: JsonField<Step> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(agentsStep: AgentsStep) = apply {
            this.step = agentsStep.step
            additionalProperties(agentsStep.additionalProperties)
        }

        fun step(step: Step) = step(JsonField.of(step))

        @JsonProperty("step")
        @ExcludeMissing
        fun step(step: JsonField<Step>) = apply { this.step = step }

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

        fun build(): AgentsStep = AgentsStep(step, additionalProperties.toUnmodifiable())
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

        private var validated: Boolean = false

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

        fun validate(): Step = apply {
            if (!validated) {
                if (
                    inferenceStep == null &&
                        toolExecutionStep == null &&
                        shieldCallStep == null &&
                        memoryRetrievalStep == null
                ) {
                    throw LlamaStackClientInvalidDataException("Unknown Step: $_json")
                }
                inferenceStep?.validate()
                toolExecutionStep?.validate()
                shieldCallStep?.validate()
                memoryRetrievalStep?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Step &&
                this.inferenceStep == other.inferenceStep &&
                this.toolExecutionStep == other.toolExecutionStep &&
                this.shieldCallStep == other.shieldCallStep &&
                this.memoryRetrievalStep == other.memoryRetrievalStep
        }

        override fun hashCode(): Int {
            return Objects.hash(
                inferenceStep,
                toolExecutionStep,
                shieldCallStep,
                memoryRetrievalStep,
            )
        }

        override fun toString(): String {
            return when {
                inferenceStep != null -> "Step{inferenceStep=$inferenceStep}"
                toolExecutionStep != null -> "Step{toolExecutionStep=$toolExecutionStep}"
                shieldCallStep != null -> "Step{shieldCallStep=$shieldCallStep}"
                memoryRetrievalStep != null -> "Step{memoryRetrievalStep=$memoryRetrievalStep}"
                _json != null -> "Step{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Step")
            }
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
}
