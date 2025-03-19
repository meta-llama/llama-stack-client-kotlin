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
import com.llama.llamastack.core.checkKnown
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
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

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sessionId(): String = sessionId.getRequired("session_id")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sessionName(): String = sessionName.getRequired("session_name")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startedAt(): OffsetDateTime = startedAt.getRequired("started_at")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun turns(): List<Turn> = turns.getRequired("turns")

    /**
     * Returns the raw JSON value of [sessionId].
     *
     * Unlike [sessionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("session_id") @ExcludeMissing fun _sessionId(): JsonField<String> = sessionId

    /**
     * Returns the raw JSON value of [sessionName].
     *
     * Unlike [sessionName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("session_name")
    @ExcludeMissing
    fun _sessionName(): JsonField<String> = sessionName

    /**
     * Returns the raw JSON value of [startedAt].
     *
     * Unlike [startedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("started_at")
    @ExcludeMissing
    fun _startedAt(): JsonField<OffsetDateTime> = startedAt

    /**
     * Returns the raw JSON value of [turns].
     *
     * Unlike [turns], this method doesn't throw if the JSON field has an unexpected type.
     */
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

        /**
         * Returns a mutable builder for constructing an instance of [Session].
         *
         * The following fields are required:
         * ```kotlin
         * .sessionId()
         * .sessionName()
         * .startedAt()
         * .turns()
         * ```
         */
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

        /**
         * Sets [Builder.sessionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sessionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

        fun sessionName(sessionName: String) = sessionName(JsonField.of(sessionName))

        /**
         * Sets [Builder.sessionName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sessionName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sessionName(sessionName: JsonField<String>) = apply { this.sessionName = sessionName }

        fun startedAt(startedAt: OffsetDateTime) = startedAt(JsonField.of(startedAt))

        /**
         * Sets [Builder.startedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startedAt(startedAt: JsonField<OffsetDateTime>) = apply { this.startedAt = startedAt }

        fun turns(turns: List<Turn>) = turns(JsonField.of(turns))

        /**
         * Sets [Builder.turns] to an arbitrary JSON value.
         *
         * You should usually call [Builder.turns] with a well-typed `List<Turn>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun turns(turns: JsonField<List<Turn>>) = apply {
            this.turns = turns.map { it.toMutableList() }
        }

        /**
         * Adds a single [Turn] to [turns].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTurn(turn: Turn) = apply {
            turns =
                (turns ?: JsonField.of(mutableListOf())).also { checkKnown("turns", it).add(turn) }
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
