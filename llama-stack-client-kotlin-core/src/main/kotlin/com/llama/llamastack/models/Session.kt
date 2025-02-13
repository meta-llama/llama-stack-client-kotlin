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
import java.time.OffsetDateTime
import java.util.Objects

/** A single session of an interaction with an Agentic System. */
@NoAutoDetect
class Session
@JsonCreator
private constructor(
    @JsonProperty("session_id")
    @ExcludeMissing
    private val sessionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("session_name")
    @ExcludeMissing
    private val sessionName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("started_at")
    @ExcludeMissing
    private val startedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("turns")
    @ExcludeMissing
    private val turns: JsonField<List<Turn>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun sessionId(): String = sessionId.getRequired("session_id")

    fun sessionName(): String = sessionName.getRequired("session_name")

    fun startedAt(): OffsetDateTime = startedAt.getRequired("started_at")

    fun turns(): List<Turn> = turns.getRequired("turns")

    @JsonProperty("session_id") @ExcludeMissing fun _sessionId(): JsonField<String> = sessionId

    @JsonProperty("session_name")
    @ExcludeMissing
    fun _sessionName(): JsonField<String> = sessionName

    @JsonProperty("started_at")
    @ExcludeMissing
    fun _startedAt(): JsonField<OffsetDateTime> = startedAt

    @JsonProperty("turns") @ExcludeMissing fun _turns(): JsonField<List<Turn>> = turns

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Session = apply {
        if (validated) {
            return@apply
        }

        sessionId()
        sessionName()
        startedAt()
        turns().forEach { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [Session]. */
    class Builder internal constructor() {

        private var sessionId: JsonField<String>? = null
        private var sessionName: JsonField<String>? = null
        private var startedAt: JsonField<OffsetDateTime>? = null
        private var turns: JsonField<MutableList<Turn>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(session: Session) = apply {
            sessionId = session.sessionId
            sessionName = session.sessionName
            startedAt = session.startedAt
            turns = session.turns.map { it.toMutableList() }
            additionalProperties = session.additionalProperties.toMutableMap()
        }

        fun sessionId(sessionId: String) = sessionId(JsonField.of(sessionId))

        fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

        fun sessionName(sessionName: String) = sessionName(JsonField.of(sessionName))

        fun sessionName(sessionName: JsonField<String>) = apply { this.sessionName = sessionName }

        fun startedAt(startedAt: OffsetDateTime) = startedAt(JsonField.of(startedAt))

        fun startedAt(startedAt: JsonField<OffsetDateTime>) = apply { this.startedAt = startedAt }

        fun turns(turns: List<Turn>) = turns(JsonField.of(turns))

        fun turns(turns: JsonField<List<Turn>>) = apply {
            this.turns = turns.map { it.toMutableList() }
        }

        fun addTurn(turn: Turn) = apply {
            turns =
                (turns ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(turn)
                }
        }

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

        fun build(): Session =
            Session(
                checkRequired("sessionId", sessionId),
                checkRequired("sessionName", sessionName),
                checkRequired("startedAt", startedAt),
                checkRequired("turns", turns).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Session && sessionId == other.sessionId && sessionName == other.sessionName && startedAt == other.startedAt && turns == other.turns && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(sessionId, sessionName, startedAt, turns, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Session{sessionId=$sessionId, sessionName=$sessionName, startedAt=$startedAt, turns=$turns, additionalProperties=$additionalProperties}"
}
