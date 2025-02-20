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
import com.llama.llamastack.core.checkRequired
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

    /** A builder for [AgentStepRetrieveResponse]. */
    class Builder internal constructor() {

        private var step: JsonField<Step>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(agentStepRetrieveResponse: AgentStepRetrieveResponse) = apply {
            step = agentStepRetrieveResponse.step
            additionalProperties = agentStepRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun step(step: Step) = step(JsonField.of(step))

        fun step(step: JsonField<Step>) = apply { this.step = step }

        fun step(inference: InferenceStep) = step(Step.ofInference(inference))

        fun step(toolExecution: ToolExecutionStep) = step(Step.ofToolExecution(toolExecution))

        fun step(shieldCall: ShieldCallStep) = step(Step.ofShieldCall(shieldCall))

        fun step(memoryRetrieval: MemoryRetrievalStep) =
            step(Step.ofMemoryRetrieval(memoryRetrieval))

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
                checkRequired("step", step),
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(using = Step.Deserializer::class)
    @JsonSerialize(using = Step.Serializer::class)
    class Step
    private constructor(
        private val inference: InferenceStep? = null,
        private val toolExecution: ToolExecutionStep? = null,
        private val shieldCall: ShieldCallStep? = null,
        private val memoryRetrieval: MemoryRetrievalStep? = null,
        private val _json: JsonValue? = null,
    ) {

        fun inference(): InferenceStep? = inference

        fun toolExecution(): ToolExecutionStep? = toolExecution

        fun shieldCall(): ShieldCallStep? = shieldCall

        fun memoryRetrieval(): MemoryRetrievalStep? = memoryRetrieval

        fun isInference(): Boolean = inference != null

        fun isToolExecution(): Boolean = toolExecution != null

        fun isShieldCall(): Boolean = shieldCall != null

        fun isMemoryRetrieval(): Boolean = memoryRetrieval != null

        fun asInference(): InferenceStep = inference.getOrThrow("inference")

        fun asToolExecution(): ToolExecutionStep = toolExecution.getOrThrow("toolExecution")

        fun asShieldCall(): ShieldCallStep = shieldCall.getOrThrow("shieldCall")

        fun asMemoryRetrieval(): MemoryRetrievalStep = memoryRetrieval.getOrThrow("memoryRetrieval")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                inference != null -> visitor.visitInference(inference)
                toolExecution != null -> visitor.visitToolExecution(toolExecution)
                shieldCall != null -> visitor.visitShieldCall(shieldCall)
                memoryRetrieval != null -> visitor.visitMemoryRetrieval(memoryRetrieval)
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
                    override fun visitInference(inference: InferenceStep) {
                        inference.validate()
                    }

                    override fun visitToolExecution(toolExecution: ToolExecutionStep) {
                        toolExecution.validate()
                    }

                    override fun visitShieldCall(shieldCall: ShieldCallStep) {
                        shieldCall.validate()
                    }

                    override fun visitMemoryRetrieval(memoryRetrieval: MemoryRetrievalStep) {
                        memoryRetrieval.validate()
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Step && inference == other.inference && toolExecution == other.toolExecution && shieldCall == other.shieldCall && memoryRetrieval == other.memoryRetrieval /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(inference, toolExecution, shieldCall, memoryRetrieval) /* spotless:on */

        override fun toString(): String =
            when {
                inference != null -> "Step{inference=$inference}"
                toolExecution != null -> "Step{toolExecution=$toolExecution}"
                shieldCall != null -> "Step{shieldCall=$shieldCall}"
                memoryRetrieval != null -> "Step{memoryRetrieval=$memoryRetrieval}"
                _json != null -> "Step{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Step")
            }

        companion object {

            fun ofInference(inference: InferenceStep) = Step(inference = inference)

            fun ofToolExecution(toolExecution: ToolExecutionStep) =
                Step(toolExecution = toolExecution)

            fun ofShieldCall(shieldCall: ShieldCallStep) = Step(shieldCall = shieldCall)

            fun ofMemoryRetrieval(memoryRetrieval: MemoryRetrievalStep) =
                Step(memoryRetrieval = memoryRetrieval)
        }

        /** An interface that defines how to map each variant of [Step] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitInference(inference: InferenceStep): T

            fun visitToolExecution(toolExecution: ToolExecutionStep): T

            fun visitShieldCall(shieldCall: ShieldCallStep): T

            fun visitMemoryRetrieval(memoryRetrieval: MemoryRetrievalStep): T

            /**
             * Maps an unknown variant of [Step] to a value of type [T].
             *
             * An instance of [Step] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws LlamaStackClientInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown Step: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Step>(Step::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Step {
                val json = JsonValue.fromJsonNode(node)
                val stepType = json.asObject()?.get("step_type")?.asString()

                when (stepType) {
                    "inference" -> {
                        tryDeserialize(node, jacksonTypeRef<InferenceStep>()) { it.validate() }
                            ?.let {
                                return Step(inference = it, _json = json)
                            }
                    }
                    "tool_execution" -> {
                        tryDeserialize(node, jacksonTypeRef<ToolExecutionStep>()) { it.validate() }
                            ?.let {
                                return Step(toolExecution = it, _json = json)
                            }
                    }
                    "shield_call" -> {
                        tryDeserialize(node, jacksonTypeRef<ShieldCallStep>()) { it.validate() }
                            ?.let {
                                return Step(shieldCall = it, _json = json)
                            }
                    }
                    "memory_retrieval" -> {
                        tryDeserialize(node, jacksonTypeRef<MemoryRetrievalStep>()) {
                                it.validate()
                            }
                            ?.let {
                                return Step(memoryRetrieval = it, _json = json)
                            }
                    }
                }

                return Step(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Step>(Step::class) {

            override fun serialize(
                value: Step,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.inference != null -> generator.writeObject(value.inference)
                    value.toolExecution != null -> generator.writeObject(value.toolExecution)
                    value.shieldCall != null -> generator.writeObject(value.shieldCall)
                    value.memoryRetrieval != null -> generator.writeObject(value.memoryRetrieval)
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
