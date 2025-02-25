// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.llama.llamastack.core.Enum
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException

class EvalJobStatusResponse @JsonCreator private constructor(private val value: JsonField<String>) :
    Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        val COMPLETED = of("completed")

        val IN_PROGRESS = of("in_progress")

        val FAILED = of("failed")

        val SCHEDULED = of("scheduled")

        fun of(value: String) = EvalJobStatusResponse(JsonField.of(value))
    }

    /** An enum containing [EvalJobStatusResponse]'s known values. */
    enum class Known {
        COMPLETED,
        IN_PROGRESS,
        FAILED,
        SCHEDULED,
    }

    /**
     * An enum containing [EvalJobStatusResponse]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [EvalJobStatusResponse] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        COMPLETED,
        IN_PROGRESS,
        FAILED,
        SCHEDULED,
        /**
         * An enum member indicating that [EvalJobStatusResponse] was instantiated with an unknown
         * value.
         */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
     */
    fun value(): Value =
        when (this) {
            COMPLETED -> Value.COMPLETED
            IN_PROGRESS -> Value.IN_PROGRESS
            FAILED -> Value.FAILED
            SCHEDULED -> Value.SCHEDULED
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws LlamaStackClientInvalidDataException if this class instance's value is a not a known
     *   member.
     */
    fun known(): Known =
        when (this) {
            COMPLETED -> Known.COMPLETED
            IN_PROGRESS -> Known.IN_PROGRESS
            FAILED -> Known.FAILED
            SCHEDULED -> Known.SCHEDULED
            else ->
                throw LlamaStackClientInvalidDataException("Unknown EvalJobStatusResponse: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws LlamaStackClientInvalidDataException if this class instance's value does not have the
     *   expected primitive type.
     */
    fun asString(): String =
        _value().asString() ?: throw LlamaStackClientInvalidDataException("Value is not a String")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EvalJobStatusResponse && value == other.value /* spotless:on */
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
