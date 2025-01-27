// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.llama.llamastack.core.Enum
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

@NoAutoDetect
class SafetyViolation
@JsonCreator
private constructor(
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("violation_level")
    @ExcludeMissing
    private val violationLevel: JsonField<ViolationLevel> = JsonMissing.of(),
    @JsonProperty("user_message")
    @ExcludeMissing
    private val userMessage: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun metadata(): Metadata = metadata.getRequired("metadata")

    fun violationLevel(): ViolationLevel = violationLevel.getRequired("violation_level")

    fun userMessage(): String? = userMessage.getNullable("user_message")

    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    @JsonProperty("violation_level")
    @ExcludeMissing
    fun _violationLevel(): JsonField<ViolationLevel> = violationLevel

    @JsonProperty("user_message")
    @ExcludeMissing
    fun _userMessage(): JsonField<String> = userMessage

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): SafetyViolation = apply {
        if (validated) {
            return@apply
        }

        metadata().validate()
        violationLevel()
        userMessage()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var metadata: JsonField<Metadata>? = null
        private var violationLevel: JsonField<ViolationLevel>? = null
        private var userMessage: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(safetyViolation: SafetyViolation) = apply {
            metadata = safetyViolation.metadata
            violationLevel = safetyViolation.violationLevel
            userMessage = safetyViolation.userMessage
            additionalProperties = safetyViolation.additionalProperties.toMutableMap()
        }

        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        fun violationLevel(violationLevel: ViolationLevel) =
            violationLevel(JsonField.of(violationLevel))

        fun violationLevel(violationLevel: JsonField<ViolationLevel>) = apply {
            this.violationLevel = violationLevel
        }

        fun userMessage(userMessage: String) = userMessage(JsonField.of(userMessage))

        fun userMessage(userMessage: JsonField<String>) = apply { this.userMessage = userMessage }

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

        fun build(): SafetyViolation =
            SafetyViolation(
                checkRequired("metadata", metadata),
                checkRequired("violationLevel", violationLevel),
                userMessage,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Metadata
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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

            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    class ViolationLevel
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val INFO = of("info")

            val WARN = of("warn")

            val ERROR = of("error")

            fun of(value: String) = ViolationLevel(JsonField.of(value))
        }

        enum class Known {
            INFO,
            WARN,
            ERROR,
        }

        enum class Value {
            INFO,
            WARN,
            ERROR,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                INFO -> Value.INFO
                WARN -> Value.WARN
                ERROR -> Value.ERROR
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                INFO -> Known.INFO
                WARN -> Known.WARN
                ERROR -> Known.ERROR
                else -> throw LlamaStackClientInvalidDataException("Unknown ViolationLevel: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ViolationLevel && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SafetyViolation && metadata == other.metadata && violationLevel == other.violationLevel && userMessage == other.userMessage && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(metadata, violationLevel, userMessage, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SafetyViolation{metadata=$metadata, violationLevel=$violationLevel, userMessage=$userMessage, additionalProperties=$additionalProperties}"
}
