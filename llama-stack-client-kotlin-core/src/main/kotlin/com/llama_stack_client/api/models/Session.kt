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
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = Session.Builder::class)
@NoAutoDetect
class Session
private constructor(
    private val memoryBank: JsonValue,
    private val sessionId: JsonField<String>,
    private val sessionName: JsonField<String>,
    private val startedAt: JsonField<OffsetDateTime>,
    private val turns: JsonField<List<Turn>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun sessionId(): String = sessionId.getRequired("session_id")

    fun sessionName(): String = sessionName.getRequired("session_name")

    fun startedAt(): OffsetDateTime = startedAt.getRequired("started_at")

    fun turns(): List<Turn> = turns.getRequired("turns")

    @JsonProperty("memory_bank") @ExcludeMissing fun _memoryBank() = memoryBank

    @JsonProperty("session_id") @ExcludeMissing fun _sessionId() = sessionId

    @JsonProperty("session_name") @ExcludeMissing fun _sessionName() = sessionName

    @JsonProperty("started_at") @ExcludeMissing fun _startedAt() = startedAt

    @JsonProperty("turns") @ExcludeMissing fun _turns() = turns

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Session = apply {
        if (!validated) {
            sessionId()
            sessionName()
            startedAt()
            turns().forEach { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Session &&
            this.memoryBank == other.memoryBank &&
            this.sessionId == other.sessionId &&
            this.sessionName == other.sessionName &&
            this.startedAt == other.startedAt &&
            this.turns == other.turns &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    memoryBank,
                    sessionId,
                    sessionName,
                    startedAt,
                    turns,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Session{memoryBank=$memoryBank, sessionId=$sessionId, sessionName=$sessionName, startedAt=$startedAt, turns=$turns, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var memoryBank: JsonValue = JsonMissing.of()
        private var sessionId: JsonField<String> = JsonMissing.of()
        private var sessionName: JsonField<String> = JsonMissing.of()
        private var startedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var turns: JsonField<List<Turn>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(session: Session) = apply {
            this.memoryBank = session.memoryBank
            this.sessionId = session.sessionId
            this.sessionName = session.sessionName
            this.startedAt = session.startedAt
            this.turns = session.turns
            additionalProperties(session.additionalProperties)
        }

        @JsonProperty("memory_bank")
        @ExcludeMissing
        fun memoryBank(memoryBank: JsonValue) = apply { this.memoryBank = memoryBank }

        fun sessionId(sessionId: String) = sessionId(JsonField.of(sessionId))

        @JsonProperty("session_id")
        @ExcludeMissing
        fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

        fun sessionName(sessionName: String) = sessionName(JsonField.of(sessionName))

        @JsonProperty("session_name")
        @ExcludeMissing
        fun sessionName(sessionName: JsonField<String>) = apply { this.sessionName = sessionName }

        fun startedAt(startedAt: OffsetDateTime) = startedAt(JsonField.of(startedAt))

        @JsonProperty("started_at")
        @ExcludeMissing
        fun startedAt(startedAt: JsonField<OffsetDateTime>) = apply { this.startedAt = startedAt }

        fun turns(turns: List<Turn>) = turns(JsonField.of(turns))

        @JsonProperty("turns")
        @ExcludeMissing
        fun turns(turns: JsonField<List<Turn>>) = apply { this.turns = turns }

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

        fun build(): Session =
            Session(
                memoryBank,
                sessionId,
                sessionName,
                startedAt,
                turns.map { it.toUnmodifiable() },
                additionalProperties.toUnmodifiable(),
            )
    }
}
