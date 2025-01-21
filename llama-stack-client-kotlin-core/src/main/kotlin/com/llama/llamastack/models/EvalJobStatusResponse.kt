// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.llama.llamastack.core.Enum
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException

class EvalJobStatusResponse
@JsonCreator
private constructor(
    private val value: JsonField<String>,
) : Enum {

    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        val COMPLETED = of("completed")

        val IN_PROGRESS = of("in_progress")

        val FAILED = of("failed")

        val SCHEDULED = of("scheduled")

        fun of(value: String) = EvalJobStatusResponse(JsonField.of(value))
    }

    enum class Known {
        COMPLETED,
        IN_PROGRESS,
        FAILED,
        SCHEDULED,
    }

    enum class Value {
        COMPLETED,
        IN_PROGRESS,
        FAILED,
        SCHEDULED,
        _UNKNOWN,
    }

    fun value(): Value =
        when (this) {
            COMPLETED -> Value.COMPLETED
            IN_PROGRESS -> Value.IN_PROGRESS
            FAILED -> Value.FAILED
            SCHEDULED -> Value.SCHEDULED
            else -> Value._UNKNOWN
        }

    fun known(): Known =
        when (this) {
            COMPLETED -> Known.COMPLETED
            IN_PROGRESS -> Known.IN_PROGRESS
            FAILED -> Known.FAILED
            SCHEDULED -> Known.SCHEDULED
            else ->
                throw LlamaStackClientInvalidDataException("Unknown EvalJobStatusResponse: $value")
        }

    fun asString(): String = _value().asStringOrThrow()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EvalJobStatusResponse && value == other.value /* spotless:on */
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
