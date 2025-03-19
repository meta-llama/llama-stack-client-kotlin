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
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

@NoAutoDetect
class RunShieldResponse
@JsonCreator
private constructor(
    @JsonProperty("violation")
    @ExcludeMissing
    private val violation: JsonField<SafetyViolation> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun violation(): SafetyViolation? = violation.getNullable("violation")

    /**
     * Returns the raw JSON value of [violation].
     *
     * Unlike [violation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("violation")
    @ExcludeMissing
    fun _violation(): JsonField<SafetyViolation> = violation

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): RunShieldResponse = apply {
        if (validated) {
            return@apply
        }

        violation()?.validate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [RunShieldResponse]. */
        fun builder() = Builder()
    }

    /** A builder for [RunShieldResponse]. */
    class Builder internal constructor() {

        private var violation: JsonField<SafetyViolation> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(runShieldResponse: RunShieldResponse) = apply {
            violation = runShieldResponse.violation
            additionalProperties = runShieldResponse.additionalProperties.toMutableMap()
        }

        fun violation(violation: SafetyViolation) = violation(JsonField.of(violation))

        /**
         * Sets [Builder.violation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.violation] with a well-typed [SafetyViolation] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun violation(violation: JsonField<SafetyViolation>) = apply { this.violation = violation }

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

        fun build(): RunShieldResponse =
            RunShieldResponse(violation, additionalProperties.toImmutable())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RunShieldResponse && violation == other.violation && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(violation, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RunShieldResponse{violation=$violation, additionalProperties=$additionalProperties}"
}
