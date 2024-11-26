// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.llama.llamastack.core.Enum
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException

class EvalJobStatusResponse
@JsonCreator
private constructor(
    private val value: JsonField<String>,
) : Enum {

    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EvalJobStatusResponse && value == other.value /* spotless:on */
    }

    fun validate(): Boolean {
        return true
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()

    companion object {

        val COMPLETED = EvalJobStatusResponse(JsonField.of("completed"))

        val IN_PROGRESS = EvalJobStatusResponse(JsonField.of("in_progress"))

        fun of(value: String) = EvalJobStatusResponse(JsonField.of(value))
    }

    enum class Known {
        COMPLETED,
        IN_PROGRESS,
    }

    enum class Value {
        COMPLETED,
        IN_PROGRESS,
        _UNKNOWN,
    }

    fun value(): Value =
        when (this) {
            COMPLETED -> Value.COMPLETED
            IN_PROGRESS -> Value.IN_PROGRESS
            else -> Value._UNKNOWN
        }

    fun known(): Known =
        when (this) {
            COMPLETED -> Known.COMPLETED
            IN_PROGRESS -> Known.IN_PROGRESS
            else ->
                throw LlamaStackClientInvalidDataException("Unknown EvalJobStatusResponse: $value")
        }

    fun asString(): String = _value().asStringOrThrow()
}
