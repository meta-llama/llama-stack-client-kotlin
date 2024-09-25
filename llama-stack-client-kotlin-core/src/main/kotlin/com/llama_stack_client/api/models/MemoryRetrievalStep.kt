// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama_stack_client.api.core.BaseDeserializer
import com.llama_stack_client.api.core.BaseSerializer
import com.llama_stack_client.api.core.Enum
import com.llama_stack_client.api.core.ExcludeMissing
import com.llama_stack_client.api.core.JsonField
import com.llama_stack_client.api.core.JsonMissing
import com.llama_stack_client.api.core.JsonValue
import com.llama_stack_client.api.core.NoAutoDetect
import com.llama_stack_client.api.core.getOrThrow
import com.llama_stack_client.api.core.toUnmodifiable
import com.llama_stack_client.api.errors.LlamaStackClientInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = MemoryRetrievalStep.Builder::class)
@NoAutoDetect
class MemoryRetrievalStep
private constructor(
    private val completedAt: JsonField<OffsetDateTime>,
    private val insertedContext: JsonField<InsertedContext>,
    private val memoryBankIds: JsonField<List<String>>,
    private val startedAt: JsonField<OffsetDateTime>,
    private val stepId: JsonField<String>,
    private val stepType: JsonField<StepType>,
    private val turnId: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun completedAt(): OffsetDateTime? = completedAt.getNullable("completed_at")

    fun insertedContext(): InsertedContext = insertedContext.getRequired("inserted_context")

    fun memoryBankIds(): List<String> = memoryBankIds.getRequired("memory_bank_ids")

    fun startedAt(): OffsetDateTime? = startedAt.getNullable("started_at")

    fun stepId(): String = stepId.getRequired("step_id")

    fun stepType(): StepType = stepType.getRequired("step_type")

    fun turnId(): String = turnId.getRequired("turn_id")

    @JsonProperty("completed_at") @ExcludeMissing fun _completedAt() = completedAt

    @JsonProperty("inserted_context") @ExcludeMissing fun _insertedContext() = insertedContext

    @JsonProperty("memory_bank_ids") @ExcludeMissing fun _memoryBankIds() = memoryBankIds

    @JsonProperty("started_at") @ExcludeMissing fun _startedAt() = startedAt

    @JsonProperty("step_id") @ExcludeMissing fun _stepId() = stepId

    @JsonProperty("step_type") @ExcludeMissing fun _stepType() = stepType

    @JsonProperty("turn_id") @ExcludeMissing fun _turnId() = turnId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): MemoryRetrievalStep = apply {
        if (!validated) {
            completedAt()
            insertedContext()
            memoryBankIds()
            startedAt()
            stepId()
            stepType()
            turnId()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MemoryRetrievalStep &&
            this.completedAt == other.completedAt &&
            this.insertedContext == other.insertedContext &&
            this.memoryBankIds == other.memoryBankIds &&
            this.startedAt == other.startedAt &&
            this.stepId == other.stepId &&
            this.stepType == other.stepType &&
            this.turnId == other.turnId &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    completedAt,
                    insertedContext,
                    memoryBankIds,
                    startedAt,
                    stepId,
                    stepType,
                    turnId,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "MemoryRetrievalStep{completedAt=$completedAt, insertedContext=$insertedContext, memoryBankIds=$memoryBankIds, startedAt=$startedAt, stepId=$stepId, stepType=$stepType, turnId=$turnId, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var completedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var insertedContext: JsonField<InsertedContext> = JsonMissing.of()
        private var memoryBankIds: JsonField<List<String>> = JsonMissing.of()
        private var startedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var stepId: JsonField<String> = JsonMissing.of()
        private var stepType: JsonField<StepType> = JsonMissing.of()
        private var turnId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(memoryRetrievalStep: MemoryRetrievalStep) = apply {
            this.completedAt = memoryRetrievalStep.completedAt
            this.insertedContext = memoryRetrievalStep.insertedContext
            this.memoryBankIds = memoryRetrievalStep.memoryBankIds
            this.startedAt = memoryRetrievalStep.startedAt
            this.stepId = memoryRetrievalStep.stepId
            this.stepType = memoryRetrievalStep.stepType
            this.turnId = memoryRetrievalStep.turnId
            additionalProperties(memoryRetrievalStep.additionalProperties)
        }

        fun completedAt(completedAt: OffsetDateTime) = completedAt(JsonField.of(completedAt))

        @JsonProperty("completed_at")
        @ExcludeMissing
        fun completedAt(completedAt: JsonField<OffsetDateTime>) = apply {
            this.completedAt = completedAt
        }

        fun insertedContext(insertedContext: InsertedContext) =
            insertedContext(JsonField.of(insertedContext))

        @JsonProperty("inserted_context")
        @ExcludeMissing
        fun insertedContext(insertedContext: JsonField<InsertedContext>) = apply {
            this.insertedContext = insertedContext
        }

        fun memoryBankIds(memoryBankIds: List<String>) = memoryBankIds(JsonField.of(memoryBankIds))

        @JsonProperty("memory_bank_ids")
        @ExcludeMissing
        fun memoryBankIds(memoryBankIds: JsonField<List<String>>) = apply {
            this.memoryBankIds = memoryBankIds
        }

        fun startedAt(startedAt: OffsetDateTime) = startedAt(JsonField.of(startedAt))

        @JsonProperty("started_at")
        @ExcludeMissing
        fun startedAt(startedAt: JsonField<OffsetDateTime>) = apply { this.startedAt = startedAt }

        fun stepId(stepId: String) = stepId(JsonField.of(stepId))

        @JsonProperty("step_id")
        @ExcludeMissing
        fun stepId(stepId: JsonField<String>) = apply { this.stepId = stepId }

        fun stepType(stepType: StepType) = stepType(JsonField.of(stepType))

        @JsonProperty("step_type")
        @ExcludeMissing
        fun stepType(stepType: JsonField<StepType>) = apply { this.stepType = stepType }

        fun turnId(turnId: String) = turnId(JsonField.of(turnId))

        @JsonProperty("turn_id")
        @ExcludeMissing
        fun turnId(turnId: JsonField<String>) = apply { this.turnId = turnId }

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

        fun build(): MemoryRetrievalStep =
            MemoryRetrievalStep(
                completedAt,
                insertedContext,
                memoryBankIds.map { it.toUnmodifiable() },
                startedAt,
                stepId,
                stepType,
                turnId,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(using = InsertedContext.Deserializer::class)
    @JsonSerialize(using = InsertedContext.Serializer::class)
    class InsertedContext
    private constructor(
        private val string: String? = null,
        private val strings: List<String>? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun string(): String? = string

        fun strings(): List<String>? = strings

        fun isString(): Boolean = string != null

        fun isStrings(): Boolean = strings != null

        fun asString(): String = string.getOrThrow("string")

        fun asStrings(): List<String> = strings.getOrThrow("strings")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                string != null -> visitor.visitString(string)
                strings != null -> visitor.visitStrings(strings)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): InsertedContext = apply {
            if (!validated) {
                if (string == null && strings == null) {
                    throw LlamaStackClientInvalidDataException("Unknown InsertedContext: $_json")
                }
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is InsertedContext &&
                this.string == other.string &&
                this.strings == other.strings
        }

        override fun hashCode(): Int {
            return Objects.hash(string, strings)
        }

        override fun toString(): String {
            return when {
                string != null -> "InsertedContext{string=$string}"
                strings != null -> "InsertedContext{strings=$strings}"
                _json != null -> "InsertedContext{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid InsertedContext")
            }
        }

        companion object {

            fun ofString(string: String) = InsertedContext(string = string)

            fun ofStrings(strings: List<String>) = InsertedContext(strings = strings)
        }

        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitStrings(strings: List<String>): T

            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown InsertedContext: $json")
            }
        }

        class Deserializer : BaseDeserializer<InsertedContext>(InsertedContext::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): InsertedContext {
                val json = JsonValue.fromJsonNode(node)
                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                    return InsertedContext(string = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                    return InsertedContext(strings = it, _json = json)
                }

                return InsertedContext(_json = json)
            }
        }

        class Serializer : BaseSerializer<InsertedContext>(InsertedContext::class) {

            override fun serialize(
                value: InsertedContext,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.strings != null -> generator.writeObject(value.strings)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid InsertedContext")
                }
            }
        }
    }

    class StepType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is StepType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val MEMORY_RETRIEVAL = StepType(JsonField.of("memory_retrieval"))

            fun of(value: String) = StepType(JsonField.of(value))
        }

        enum class Known {
            MEMORY_RETRIEVAL,
        }

        enum class Value {
            MEMORY_RETRIEVAL,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                MEMORY_RETRIEVAL -> Value.MEMORY_RETRIEVAL
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                MEMORY_RETRIEVAL -> Known.MEMORY_RETRIEVAL
                else -> throw LlamaStackClientInvalidDataException("Unknown StepType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
