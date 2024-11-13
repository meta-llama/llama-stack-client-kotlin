// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.toImmutable
import java.util.Objects

@JsonDeserialize(builder = AgentCreateResponse.Builder::class)
@NoAutoDetect
class AgentCreateResponse
private constructor(
    private val agentId: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun agentId(): String = agentId.getRequired("agent_id")

    @JsonProperty("agent_id") @ExcludeMissing fun _agentId() = agentId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): AgentCreateResponse = apply {
        if (!validated) {
            agentId()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var agentId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(agentCreateResponse: AgentCreateResponse) = apply {
            this.agentId = agentCreateResponse.agentId
            additionalProperties(agentCreateResponse.additionalProperties)
        }

        fun agentId(agentId: String) = agentId(JsonField.of(agentId))

        @JsonProperty("agent_id")
        @ExcludeMissing
        fun agentId(agentId: JsonField<String>) = apply { this.agentId = agentId }

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

        fun build(): AgentCreateResponse =
            AgentCreateResponse(agentId, additionalProperties.toImmutable())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AgentCreateResponse && this.agentId == other.agentId && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(agentId, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "AgentCreateResponse{agentId=$agentId, additionalProperties=$additionalProperties}"
}
