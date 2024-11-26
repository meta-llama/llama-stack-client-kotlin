// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

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
import com.llama.llamastack.core.BaseDeserializer
import com.llama.llamastack.core.BaseSerializer
import com.llama.llamastack.core.Enum
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
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
                memoryBankIds.map { it.toImmutable() },
                startedAt,
                stepId,
                stepType,
                turnId,
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(using = InsertedContext.Deserializer::class)
    @JsonSerialize(using = InsertedContext.Serializer::class)
    class InsertedContext
    private constructor(
        private val string: String? = null,
        private val imageMedia: ImageMedia? = null,
        private val imageMediaArray: List<StringOrImageMediaUnion>? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun string(): String? = string

        fun imageMedia(): ImageMedia? = imageMedia

        fun imageMediaArray(): List<StringOrImageMediaUnion>? = imageMediaArray

        fun isString(): Boolean = string != null

        fun isImageMedia(): Boolean = imageMedia != null

        fun isImageMediaArray(): Boolean = imageMediaArray != null

        fun asString(): String = string.getOrThrow("string")

        fun asImageMedia(): ImageMedia = imageMedia.getOrThrow("imageMedia")

        fun asImageMediaArray(): List<StringOrImageMediaUnion> =
            imageMediaArray.getOrThrow("imageMediaArray")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                string != null -> visitor.visitString(string)
                imageMedia != null -> visitor.visitImageMedia(imageMedia)
                imageMediaArray != null -> visitor.visitImageMediaArray(imageMediaArray)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): InsertedContext = apply {
            if (!validated) {
                if (string == null && imageMedia == null && imageMediaArray == null) {
                    throw LlamaStackClientInvalidDataException("Unknown InsertedContext: $_json")
                }
                imageMedia?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InsertedContext && string == other.string && imageMedia == other.imageMedia && imageMediaArray == other.imageMediaArray /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, imageMedia, imageMediaArray) /* spotless:on */

        override fun toString(): String =
            when {
                string != null -> "InsertedContext{string=$string}"
                imageMedia != null -> "InsertedContext{imageMedia=$imageMedia}"
                imageMediaArray != null -> "InsertedContext{imageMediaArray=$imageMediaArray}"
                _json != null -> "InsertedContext{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid InsertedContext")
            }

        companion object {

            fun ofString(string: String) = InsertedContext(string = string)

            fun ofImageMedia(imageMedia: ImageMedia) = InsertedContext(imageMedia = imageMedia)

            fun ofImageMediaArray(imageMediaArray: List<StringOrImageMediaUnion>) =
                InsertedContext(imageMediaArray = imageMediaArray)
        }

        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitImageMedia(imageMedia: ImageMedia): T

            fun visitImageMediaArray(imageMediaArray: List<StringOrImageMediaUnion>): T

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
                tryDeserialize(node, jacksonTypeRef<ImageMedia>()) { it.validate() }
                    ?.let {
                        return InsertedContext(imageMedia = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<List<StringOrImageMediaUnion>>())?.let {
                    return InsertedContext(imageMediaArray = it, _json = json)
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
                    value.imageMedia != null -> generator.writeObject(value.imageMedia)
                    value.imageMediaArray != null -> generator.writeObject(value.imageMediaArray)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid InsertedContext")
                }
            }
        }

        @JsonDeserialize(using = StringOrImageMediaUnion.Deserializer::class)
        @JsonSerialize(using = StringOrImageMediaUnion.Serializer::class)
        class StringOrImageMediaUnion
        private constructor(
            private val string: String? = null,
            private val imageMedia: ImageMedia? = null,
            private val _json: JsonValue? = null,
        ) {

            private var validated: Boolean = false

            fun string(): String? = string

            fun imageMedia(): ImageMedia? = imageMedia

            fun isString(): Boolean = string != null

            fun isImageMedia(): Boolean = imageMedia != null

            fun asString(): String = string.getOrThrow("string")

            fun asImageMedia(): ImageMedia = imageMedia.getOrThrow("imageMedia")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    string != null -> visitor.visitString(string)
                    imageMedia != null -> visitor.visitImageMedia(imageMedia)
                    else -> visitor.unknown(_json)
                }
            }

            fun validate(): StringOrImageMediaUnion = apply {
                if (!validated) {
                    if (string == null && imageMedia == null) {
                        throw LlamaStackClientInvalidDataException(
                            "Unknown StringOrImageMediaUnion: $_json"
                        )
                    }
                    imageMedia?.validate()
                    validated = true
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is StringOrImageMediaUnion && string == other.string && imageMedia == other.imageMedia /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, imageMedia) /* spotless:on */

            override fun toString(): String =
                when {
                    string != null -> "StringOrImageMediaUnion{string=$string}"
                    imageMedia != null -> "StringOrImageMediaUnion{imageMedia=$imageMedia}"
                    _json != null -> "StringOrImageMediaUnion{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid StringOrImageMediaUnion")
                }

            companion object {

                fun ofString(string: String) = StringOrImageMediaUnion(string = string)

                fun ofImageMedia(imageMedia: ImageMedia) =
                    StringOrImageMediaUnion(imageMedia = imageMedia)
            }

            interface Visitor<out T> {

                fun visitString(string: String): T

                fun visitImageMedia(imageMedia: ImageMedia): T

                fun unknown(json: JsonValue?): T {
                    throw LlamaStackClientInvalidDataException(
                        "Unknown StringOrImageMediaUnion: $json"
                    )
                }
            }

            class Deserializer :
                BaseDeserializer<StringOrImageMediaUnion>(StringOrImageMediaUnion::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): StringOrImageMediaUnion {
                    val json = JsonValue.fromJsonNode(node)

                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                        return StringOrImageMediaUnion(string = it, _json = json)
                    }
                    tryDeserialize(node, jacksonTypeRef<ImageMedia>()) { it.validate() }
                        ?.let {
                            return StringOrImageMediaUnion(imageMedia = it, _json = json)
                        }

                    return StringOrImageMediaUnion(_json = json)
                }
            }

            class Serializer :
                BaseSerializer<StringOrImageMediaUnion>(StringOrImageMediaUnion::class) {

                override fun serialize(
                    value: StringOrImageMediaUnion,
                    generator: JsonGenerator,
                    provider: SerializerProvider
                ) {
                    when {
                        value.string != null -> generator.writeObject(value.string)
                        value.imageMedia != null -> generator.writeObject(value.imageMedia)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid StringOrImageMediaUnion")
                    }
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

            return /* spotless:off */ other is StepType && value == other.value /* spotless:on */
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is MemoryRetrievalStep && completedAt == other.completedAt && insertedContext == other.insertedContext && memoryBankIds == other.memoryBankIds && startedAt == other.startedAt && stepId == other.stepId && stepType == other.stepType && turnId == other.turnId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(completedAt, insertedContext, memoryBankIds, startedAt, stepId, stepType, turnId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MemoryRetrievalStep{completedAt=$completedAt, insertedContext=$insertedContext, memoryBankIds=$memoryBankIds, startedAt=$startedAt, stepId=$stepId, stepType=$stepType, turnId=$turnId, additionalProperties=$additionalProperties}"
}
