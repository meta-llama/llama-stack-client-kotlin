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

@JsonDeserialize(builder = EvalTask.Builder::class)
@NoAutoDetect
class EvalTask
private constructor(
    private val datasetId: JsonField<String>,
    private val identifier: JsonField<String>,
    private val metadata: JsonField<Metadata>,
    private val providerId: JsonField<String>,
    private val providerResourceId: JsonField<String>,
    private val scoringFunctions: JsonField<List<String>>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun datasetId(): String = datasetId.getRequired("dataset_id")

    fun identifier(): String = identifier.getRequired("identifier")

    fun metadata(): Metadata = metadata.getRequired("metadata")

    fun providerId(): String = providerId.getRequired("provider_id")

    fun providerResourceId(): String = providerResourceId.getRequired("provider_resource_id")

    fun scoringFunctions(): List<String> = scoringFunctions.getRequired("scoring_functions")

    fun type(): Type = type.getRequired("type")

    @JsonProperty("dataset_id") @ExcludeMissing fun _datasetId() = datasetId

    @JsonProperty("identifier") @ExcludeMissing fun _identifier() = identifier

    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

    @JsonProperty("provider_id") @ExcludeMissing fun _providerId() = providerId

    @JsonProperty("provider_resource_id")
    @ExcludeMissing
    fun _providerResourceId() = providerResourceId

    @JsonProperty("scoring_functions") @ExcludeMissing fun _scoringFunctions() = scoringFunctions

    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): EvalTask = apply {
        if (!validated) {
            datasetId()
            identifier()
            metadata().validate()
            providerId()
            providerResourceId()
            scoringFunctions()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var datasetId: JsonField<String> = JsonMissing.of()
        private var identifier: JsonField<String> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var providerId: JsonField<String> = JsonMissing.of()
        private var providerResourceId: JsonField<String> = JsonMissing.of()
        private var scoringFunctions: JsonField<List<String>> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(evalTask: EvalTask) = apply {
            this.datasetId = evalTask.datasetId
            this.identifier = evalTask.identifier
            this.metadata = evalTask.metadata
            this.providerId = evalTask.providerId
            this.providerResourceId = evalTask.providerResourceId
            this.scoringFunctions = evalTask.scoringFunctions
            this.type = evalTask.type
            additionalProperties(evalTask.additionalProperties)
        }

        fun datasetId(datasetId: String) = datasetId(JsonField.of(datasetId))

        @JsonProperty("dataset_id")
        @ExcludeMissing
        fun datasetId(datasetId: JsonField<String>) = apply { this.datasetId = datasetId }

        fun identifier(identifier: String) = identifier(JsonField.of(identifier))

        @JsonProperty("identifier")
        @ExcludeMissing
        fun identifier(identifier: JsonField<String>) = apply { this.identifier = identifier }

        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        @JsonProperty("metadata")
        @ExcludeMissing
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        fun providerId(providerId: String) = providerId(JsonField.of(providerId))

        @JsonProperty("provider_id")
        @ExcludeMissing
        fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

        fun providerResourceId(providerResourceId: String) =
            providerResourceId(JsonField.of(providerResourceId))

        @JsonProperty("provider_resource_id")
        @ExcludeMissing
        fun providerResourceId(providerResourceId: JsonField<String>) = apply {
            this.providerResourceId = providerResourceId
        }

        fun scoringFunctions(scoringFunctions: List<String>) =
            scoringFunctions(JsonField.of(scoringFunctions))

        @JsonProperty("scoring_functions")
        @ExcludeMissing
        fun scoringFunctions(scoringFunctions: JsonField<List<String>>) = apply {
            this.scoringFunctions = scoringFunctions
        }

        fun type(type: Type) = type(JsonField.of(type))

        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

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

        fun build(): EvalTask =
            EvalTask(
                datasetId,
                identifier,
                metadata,
                providerId,
                providerResourceId,
                scoringFunctions.map { it.toImmutable() },
                type,
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

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val EVAL_TASK = Type(JsonField.of("eval_task"))

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            EVAL_TASK,
        }

        enum class Value {
            EVAL_TASK,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                EVAL_TASK -> Value.EVAL_TASK
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                EVAL_TASK -> Known.EVAL_TASK
                else -> throw LlamaStackClientInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EvalTask && this.datasetId == other.datasetId && this.identifier == other.identifier && this.metadata == other.metadata && this.providerId == other.providerId && this.providerResourceId == other.providerResourceId && this.scoringFunctions == other.scoringFunctions && this.type == other.type && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(datasetId, identifier, metadata, providerId, providerResourceId, scoringFunctions, type, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "EvalTask{datasetId=$datasetId, identifier=$identifier, metadata=$metadata, providerId=$providerId, providerResourceId=$providerResourceId, scoringFunctions=$scoringFunctions, type=$type, additionalProperties=$additionalProperties}"
}
