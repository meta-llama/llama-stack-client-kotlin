// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.llama_stack_client.api.core.ExcludeMissing
import com.llama_stack_client.api.core.JsonField
import com.llama_stack_client.api.core.JsonMissing
import com.llama_stack_client.api.core.JsonValue
import com.llama_stack_client.api.core.NoAutoDetect
import com.llama_stack_client.api.core.toUnmodifiable
import java.util.Objects

@JsonDeserialize(builder = AgentsTurnStreamChunk.Builder::class)
@NoAutoDetect
class AgentsTurnStreamChunk
private constructor(
    private val event: JsonField<TurnStreamEvent>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun event(): TurnStreamEvent = event.getRequired("event")

    @JsonProperty("event") @ExcludeMissing fun _event() = event

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): AgentsTurnStreamChunk = apply {
        if (!validated) {
            event().validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentsTurnStreamChunk &&
            this.event == other.event &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = Objects.hash(event, additionalProperties)
        }
        return hashCode
    }

    override fun toString() =
        "AgentsTurnStreamChunk{event=$event, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var event: JsonField<TurnStreamEvent> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(agentsTurnStreamChunk: AgentsTurnStreamChunk) = apply {
            this.event = agentsTurnStreamChunk.event
            additionalProperties(agentsTurnStreamChunk.additionalProperties)
        }

        fun event(event: TurnStreamEvent) = event(JsonField.of(event))

        @JsonProperty("event")
        @ExcludeMissing
        fun event(event: JsonField<TurnStreamEvent>) = apply { this.event = event }

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

        fun build(): AgentsTurnStreamChunk =
            AgentsTurnStreamChunk(event, additionalProperties.toUnmodifiable())
    }
}
