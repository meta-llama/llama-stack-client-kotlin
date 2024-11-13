// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.llama.llamastack.core.Enum
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

@JsonDeserialize(builder = SafetyViolation.Builder::class)
@NoAutoDetect
class SafetyViolation
private constructor(
    private val metadata: JsonField<Metadata>,
    private val userMessage: JsonField<String>,
    private val violationLevel: JsonField<ViolationLevel>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun metadata(): Metadata = metadata.getRequired("metadata")

    fun userMessage(): String? = userMessage.getNullable("user_message")

    fun violationLevel(): ViolationLevel = violationLevel.getRequired("violation_level")

    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

    @JsonProperty("user_message") @ExcludeMissing fun _userMessage() = userMessage

    @JsonProperty("violation_level") @ExcludeMissing fun _violationLevel() = violationLevel

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): SafetyViolation = apply {
        if (!validated) {
            metadata().validate()
            userMessage()
            violationLevel()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var userMessage: JsonField<String> = JsonMissing.of()
        private var violationLevel: JsonField<ViolationLevel> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(safetyViolation: SafetyViolation) = apply {
            this.metadata = safetyViolation.metadata
            this.userMessage = safetyViolation.userMessage
            this.violationLevel = safetyViolation.violationLevel
            additionalProperties(safetyViolation.additionalProperties)
        }

        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        @JsonProperty("metadata")
        @ExcludeMissing
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        fun userMessage(userMessage: String) = userMessage(JsonField.of(userMessage))

        @JsonProperty("user_message")
        @ExcludeMissing
        fun userMessage(userMessage: JsonField<String>) = apply { this.userMessage = userMessage }

        fun violationLevel(violationLevel: ViolationLevel) =
            violationLevel(JsonField.of(violationLevel))

        @JsonProperty("violation_level")
        @ExcludeMissing
        fun violationLevel(violationLevel: JsonField<ViolationLevel>) = apply {
            this.violationLevel = violationLevel
        }

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

        fun build(): SafetyViolation =
            SafetyViolation(
                metadata,
                userMessage,
                violationLevel,
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Metadata = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(metadata: Metadata) = apply {
                additionalProperties(metadata.additionalProperties)
            }

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

            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    class ViolationLevel
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ViolationLevel && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val INFO = ViolationLevel(JsonField.of("info"))

            val WARN = ViolationLevel(JsonField.of("warn"))

            val ERROR = ViolationLevel(JsonField.of("error"))

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
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SafetyViolation && this.metadata == other.metadata && this.userMessage == other.userMessage && this.violationLevel == other.violationLevel && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(metadata, userMessage, violationLevel, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "SafetyViolation{metadata=$metadata, userMessage=$userMessage, violationLevel=$violationLevel, additionalProperties=$additionalProperties}"
}
