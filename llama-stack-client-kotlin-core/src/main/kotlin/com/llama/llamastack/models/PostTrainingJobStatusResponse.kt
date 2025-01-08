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
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class PostTrainingJobStatusResponse
@JsonCreator
private constructor(
    @JsonProperty("checkpoints")
    @ExcludeMissing
    private val checkpoints: JsonField<List<JsonValue>> = JsonMissing.of(),
    @JsonProperty("completed_at")
    @ExcludeMissing
    private val completedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("job_uuid")
    @ExcludeMissing
    private val jobUuid: JsonField<String> = JsonMissing.of(),
    @JsonProperty("resources_allocated")
    @ExcludeMissing
    private val resourcesAllocated: JsonField<ResourcesAllocated> = JsonMissing.of(),
    @JsonProperty("scheduled_at")
    @ExcludeMissing
    private val scheduledAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("started_at")
    @ExcludeMissing
    private val startedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun checkpoints(): List<JsonValue> = checkpoints.getRequired("checkpoints")

    fun completedAt(): OffsetDateTime? = completedAt.getNullable("completed_at")

    fun jobUuid(): String = jobUuid.getRequired("job_uuid")

    fun resourcesAllocated(): ResourcesAllocated? =
        resourcesAllocated.getNullable("resources_allocated")

    fun scheduledAt(): OffsetDateTime? = scheduledAt.getNullable("scheduled_at")

    fun startedAt(): OffsetDateTime? = startedAt.getNullable("started_at")

    fun status(): Status = status.getRequired("status")

    @JsonProperty("checkpoints") @ExcludeMissing fun _checkpoints() = checkpoints

    @JsonProperty("completed_at") @ExcludeMissing fun _completedAt() = completedAt

    @JsonProperty("job_uuid") @ExcludeMissing fun _jobUuid() = jobUuid

    @JsonProperty("resources_allocated")
    @ExcludeMissing
    fun _resourcesAllocated() = resourcesAllocated

    @JsonProperty("scheduled_at") @ExcludeMissing fun _scheduledAt() = scheduledAt

    @JsonProperty("started_at") @ExcludeMissing fun _startedAt() = startedAt

    @JsonProperty("status") @ExcludeMissing fun _status() = status

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PostTrainingJobStatusResponse = apply {
        if (!validated) {
            checkpoints()
            completedAt()
            jobUuid()
            resourcesAllocated()?.validate()
            scheduledAt()
            startedAt()
            status()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var checkpoints: JsonField<List<JsonValue>> = JsonMissing.of()
        private var completedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var jobUuid: JsonField<String> = JsonMissing.of()
        private var resourcesAllocated: JsonField<ResourcesAllocated> = JsonMissing.of()
        private var scheduledAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var startedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(postTrainingJobStatusResponse: PostTrainingJobStatusResponse) = apply {
            checkpoints = postTrainingJobStatusResponse.checkpoints
            completedAt = postTrainingJobStatusResponse.completedAt
            jobUuid = postTrainingJobStatusResponse.jobUuid
            resourcesAllocated = postTrainingJobStatusResponse.resourcesAllocated
            scheduledAt = postTrainingJobStatusResponse.scheduledAt
            startedAt = postTrainingJobStatusResponse.startedAt
            status = postTrainingJobStatusResponse.status
            additionalProperties = postTrainingJobStatusResponse.additionalProperties.toMutableMap()
        }

        fun checkpoints(checkpoints: List<JsonValue>) = checkpoints(JsonField.of(checkpoints))

        fun checkpoints(checkpoints: JsonField<List<JsonValue>>) = apply {
            this.checkpoints = checkpoints
        }

        fun completedAt(completedAt: OffsetDateTime) = completedAt(JsonField.of(completedAt))

        fun completedAt(completedAt: JsonField<OffsetDateTime>) = apply {
            this.completedAt = completedAt
        }

        fun jobUuid(jobUuid: String) = jobUuid(JsonField.of(jobUuid))

        fun jobUuid(jobUuid: JsonField<String>) = apply { this.jobUuid = jobUuid }

        fun resourcesAllocated(resourcesAllocated: ResourcesAllocated) =
            resourcesAllocated(JsonField.of(resourcesAllocated))

        fun resourcesAllocated(resourcesAllocated: JsonField<ResourcesAllocated>) = apply {
            this.resourcesAllocated = resourcesAllocated
        }

        fun scheduledAt(scheduledAt: OffsetDateTime) = scheduledAt(JsonField.of(scheduledAt))

        fun scheduledAt(scheduledAt: JsonField<OffsetDateTime>) = apply {
            this.scheduledAt = scheduledAt
        }

        fun startedAt(startedAt: OffsetDateTime) = startedAt(JsonField.of(startedAt))

        fun startedAt(startedAt: JsonField<OffsetDateTime>) = apply { this.startedAt = startedAt }

        fun status(status: Status) = status(JsonField.of(status))

        fun status(status: JsonField<Status>) = apply { this.status = status }

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

        fun build(): PostTrainingJobStatusResponse =
            PostTrainingJobStatusResponse(
                checkpoints.map { it.toImmutable() },
                completedAt,
                jobUuid,
                resourcesAllocated,
                scheduledAt,
                startedAt,
                status,
                additionalProperties.toImmutable(),
            )
    }

    class Status
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

            fun of(value: String) = Status(JsonField.of(value))
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
                else -> throw LlamaStackClientInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class ResourcesAllocated
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ResourcesAllocated = apply {
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

            internal fun from(resourcesAllocated: ResourcesAllocated) = apply {
                additionalProperties = resourcesAllocated.additionalProperties.toMutableMap()
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

            fun build(): ResourcesAllocated = ResourcesAllocated(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ResourcesAllocated && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "ResourcesAllocated{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PostTrainingJobStatusResponse && checkpoints == other.checkpoints && completedAt == other.completedAt && jobUuid == other.jobUuid && resourcesAllocated == other.resourcesAllocated && scheduledAt == other.scheduledAt && startedAt == other.startedAt && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(checkpoints, completedAt, jobUuid, resourcesAllocated, scheduledAt, startedAt, status, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PostTrainingJobStatusResponse{checkpoints=$checkpoints, completedAt=$completedAt, jobUuid=$jobUuid, resourcesAllocated=$resourcesAllocated, scheduledAt=$scheduledAt, startedAt=$startedAt, status=$status, additionalProperties=$additionalProperties}"
}
