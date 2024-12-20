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

@JsonDeserialize(builder = AgentSessionCreateResponse.Builder::class)
@NoAutoDetect
class AgentSessionCreateResponse
private constructor(
    private val sessionId: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun sessionId(): String = sessionId.getRequired("session_id")

    @JsonProperty("session_id") @ExcludeMissing fun _sessionId() = sessionId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): AgentSessionCreateResponse = apply {
        if (!validated) {
            sessionId()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var sessionId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(agentSessionCreateResponse: AgentSessionCreateResponse) = apply {
            this.sessionId = agentSessionCreateResponse.sessionId
            additionalProperties(agentSessionCreateResponse.additionalProperties)
        }

        fun sessionId(sessionId: String) = sessionId(JsonField.of(sessionId))

        @JsonProperty("session_id")
        @ExcludeMissing
        fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

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

        fun build(): AgentSessionCreateResponse =
            AgentSessionCreateResponse(sessionId, additionalProperties.toImmutable())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AgentSessionCreateResponse && sessionId == other.sessionId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(sessionId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgentSessionCreateResponse{sessionId=$sessionId, additionalProperties=$additionalProperties}"
}
