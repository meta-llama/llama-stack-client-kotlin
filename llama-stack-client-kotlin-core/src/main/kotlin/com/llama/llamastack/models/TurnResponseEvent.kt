// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

@NoAutoDetect
class TurnResponseEvent
@JsonCreator
private constructor(
    @JsonProperty("payload")
    @ExcludeMissing
    private val payload: JsonField<TurnResponseEventPayload> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun payload(): TurnResponseEventPayload = payload.getRequired("payload")

    /**
     * Returns the raw JSON value of [payload].
     *
     * Unlike [payload], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payload")
    @ExcludeMissing
    fun _payload(): JsonField<TurnResponseEventPayload> = payload

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): TurnResponseEvent = apply {
        if (validated) {
            return@apply
        }

        payload().validate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TurnResponseEvent].
         *
         * The following fields are required:
         * ```kotlin
         * .payload()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [TurnResponseEvent]. */
    class Builder internal constructor() {

        private var payload: JsonField<TurnResponseEventPayload>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(turnResponseEvent: TurnResponseEvent) = apply {
            payload = turnResponseEvent.payload
            additionalProperties = turnResponseEvent.additionalProperties.toMutableMap()
        }

        fun payload(payload: TurnResponseEventPayload) = payload(JsonField.of(payload))

        /**
         * Sets [Builder.payload] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payload] with a well-typed [TurnResponseEventPayload]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun payload(payload: JsonField<TurnResponseEventPayload>) = apply { this.payload = payload }

        /**
         * Alias for calling [payload] with
         * `TurnResponseEventPayload.ofAgentTurnResponseStepStart(agentTurnResponseStepStart)`.
         */
        fun payload(
            agentTurnResponseStepStart: TurnResponseEventPayload.AgentTurnResponseStepStartPayload
        ) =
            payload(
                TurnResponseEventPayload.ofAgentTurnResponseStepStart(agentTurnResponseStepStart)
            )

        /**
         * Alias for calling [payload] with
         * `TurnResponseEventPayload.ofAgentTurnResponseStepProgress(agentTurnResponseStepProgress)`.
         */
        fun payload(
            agentTurnResponseStepProgress:
                TurnResponseEventPayload.AgentTurnResponseStepProgressPayload
        ) =
            payload(
                TurnResponseEventPayload.ofAgentTurnResponseStepProgress(
                    agentTurnResponseStepProgress
                )
            )

        /**
         * Alias for calling [payload] with
         * `TurnResponseEventPayload.ofAgentTurnResponseStepComplete(agentTurnResponseStepComplete)`.
         */
        fun payload(
            agentTurnResponseStepComplete:
                TurnResponseEventPayload.AgentTurnResponseStepCompletePayload
        ) =
            payload(
                TurnResponseEventPayload.ofAgentTurnResponseStepComplete(
                    agentTurnResponseStepComplete
                )
            )

        /**
         * Alias for calling [payload] with
         * `TurnResponseEventPayload.ofAgentTurnResponseTurnStart(agentTurnResponseTurnStart)`.
         */
        fun payload(
            agentTurnResponseTurnStart: TurnResponseEventPayload.AgentTurnResponseTurnStartPayload
        ) =
            payload(
                TurnResponseEventPayload.ofAgentTurnResponseTurnStart(agentTurnResponseTurnStart)
            )

        /**
         * Alias for calling [payload] with the following:
         * ```kotlin
         * TurnResponseEventPayload.AgentTurnResponseTurnStartPayload.builder()
         *     .turnId(turnId)
         *     .build()
         * ```
         */
        fun agentTurnResponseTurnStartPayload(turnId: String) =
            payload(
                TurnResponseEventPayload.AgentTurnResponseTurnStartPayload.builder()
                    .turnId(turnId)
                    .build()
            )

        /**
         * Alias for calling [payload] with
         * `TurnResponseEventPayload.ofAgentTurnResponseTurnComplete(agentTurnResponseTurnComplete)`.
         */
        fun payload(
            agentTurnResponseTurnComplete:
                TurnResponseEventPayload.AgentTurnResponseTurnCompletePayload
        ) =
            payload(
                TurnResponseEventPayload.ofAgentTurnResponseTurnComplete(
                    agentTurnResponseTurnComplete
                )
            )

        /**
         * Alias for calling [payload] with the following:
         * ```kotlin
         * TurnResponseEventPayload.AgentTurnResponseTurnCompletePayload.builder()
         *     .turn(turn)
         *     .build()
         * ```
         */
        fun agentTurnResponseTurnCompletePayload(turn: Turn) =
            payload(
                TurnResponseEventPayload.AgentTurnResponseTurnCompletePayload.builder()
                    .turn(turn)
                    .build()
            )

        /**
         * Alias for calling [payload] with
         * `TurnResponseEventPayload.ofAgentTurnResponseTurnAwaitingInput(agentTurnResponseTurnAwaitingInput)`.
         */
        fun payload(
            agentTurnResponseTurnAwaitingInput:
                TurnResponseEventPayload.AgentTurnResponseTurnAwaitingInputPayload
        ) =
            payload(
                TurnResponseEventPayload.ofAgentTurnResponseTurnAwaitingInput(
                    agentTurnResponseTurnAwaitingInput
                )
            )

        /**
         * Alias for calling [payload] with the following:
         * ```kotlin
         * TurnResponseEventPayload.AgentTurnResponseTurnAwaitingInputPayload.builder()
         *     .turn(turn)
         *     .build()
         * ```
         */
        fun agentTurnResponseTurnAwaitingInputPayload(turn: Turn) =
            payload(
                TurnResponseEventPayload.AgentTurnResponseTurnAwaitingInputPayload.builder()
                    .turn(turn)
                    .build()
            )

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

        fun build(): TurnResponseEvent =
            TurnResponseEvent(checkRequired("payload", payload), additionalProperties.toImmutable())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TurnResponseEvent && payload == other.payload && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(payload, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TurnResponseEvent{payload=$payload, additionalProperties=$additionalProperties}"
}
