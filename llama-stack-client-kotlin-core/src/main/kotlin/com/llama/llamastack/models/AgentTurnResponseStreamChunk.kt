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
import java.util.Objects

/** streamed agent turn completion response. */
@NoAutoDetect
class AgentTurnResponseStreamChunk
@JsonCreator
private constructor(
    @JsonProperty("event")
    @ExcludeMissing
    private val event: JsonField<TurnResponseEvent> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun event(): TurnResponseEvent = event.getRequired("event")

    @JsonProperty("event") @ExcludeMissing fun _event(): JsonField<TurnResponseEvent> = event

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AgentTurnResponseStreamChunk = apply {
        if (validated) {
            return@apply
        }

        event().validate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [AgentTurnResponseStreamChunk]. */
    class Builder internal constructor() {

        private var event: JsonField<TurnResponseEvent>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(agentTurnResponseStreamChunk: AgentTurnResponseStreamChunk) = apply {
            event = agentTurnResponseStreamChunk.event
            additionalProperties = agentTurnResponseStreamChunk.additionalProperties.toMutableMap()
        }

        fun event(event: TurnResponseEvent) = event(JsonField.of(event))

        fun event(event: JsonField<TurnResponseEvent>) = apply { this.event = event }

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

        fun build(): AgentTurnResponseStreamChunk =
            AgentTurnResponseStreamChunk(
                checkRequired("event", event),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AgentTurnResponseStreamChunk && event == other.event && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(event, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgentTurnResponseStreamChunk{event=$event, additionalProperties=$additionalProperties}"
}
