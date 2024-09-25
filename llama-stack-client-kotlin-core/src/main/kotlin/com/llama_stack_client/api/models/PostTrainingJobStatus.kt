// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.llama_stack_client.api.core.Enum
import com.llama_stack_client.api.core.ExcludeMissing
import com.llama_stack_client.api.core.JsonField
import com.llama_stack_client.api.core.JsonMissing
import com.llama_stack_client.api.core.JsonValue
import com.llama_stack_client.api.core.NoAutoDetect
import com.llama_stack_client.api.core.toUnmodifiable
import com.llama_stack_client.api.errors.LlamaStackClientInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = PostTrainingJobStatus.Builder::class)
@NoAutoDetect
class PostTrainingJobStatus
private constructor(
    private val checkpoints: JsonField<List<JsonValue>>,
    private val completedAt: JsonField<OffsetDateTime>,
    private val jobUuid: JsonField<String>,
    private val resourcesAllocated: JsonField<ResourcesAllocated>,
    private val scheduledAt: JsonField<OffsetDateTime>,
    private val startedAt: JsonField<OffsetDateTime>,
    private val status: JsonField<Status>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

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

    fun validate(): PostTrainingJobStatus = apply {
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PostTrainingJobStatus &&
            this.checkpoints == other.checkpoints &&
            this.completedAt == other.completedAt &&
            this.jobUuid == other.jobUuid &&
            this.resourcesAllocated == other.resourcesAllocated &&
            this.scheduledAt == other.scheduledAt &&
            this.startedAt == other.startedAt &&
            this.status == other.status &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    checkpoints,
                    completedAt,
                    jobUuid,
                    resourcesAllocated,
                    scheduledAt,
                    startedAt,
                    status,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "PostTrainingJobStatus{checkpoints=$checkpoints, completedAt=$completedAt, jobUuid=$jobUuid, resourcesAllocated=$resourcesAllocated, scheduledAt=$scheduledAt, startedAt=$startedAt, status=$status, additionalProperties=$additionalProperties}"

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

        internal fun from(postTrainingJobStatus: PostTrainingJobStatus) = apply {
            this.checkpoints = postTrainingJobStatus.checkpoints
            this.completedAt = postTrainingJobStatus.completedAt
            this.jobUuid = postTrainingJobStatus.jobUuid
            this.resourcesAllocated = postTrainingJobStatus.resourcesAllocated
            this.scheduledAt = postTrainingJobStatus.scheduledAt
            this.startedAt = postTrainingJobStatus.startedAt
            this.status = postTrainingJobStatus.status
            additionalProperties(postTrainingJobStatus.additionalProperties)
        }

        fun checkpoints(checkpoints: List<JsonValue>) = checkpoints(JsonField.of(checkpoints))

        @JsonProperty("checkpoints")
        @ExcludeMissing
        fun checkpoints(checkpoints: JsonField<List<JsonValue>>) = apply {
            this.checkpoints = checkpoints
        }

        fun completedAt(completedAt: OffsetDateTime) = completedAt(JsonField.of(completedAt))

        @JsonProperty("completed_at")
        @ExcludeMissing
        fun completedAt(completedAt: JsonField<OffsetDateTime>) = apply {
            this.completedAt = completedAt
        }

        fun jobUuid(jobUuid: String) = jobUuid(JsonField.of(jobUuid))

        @JsonProperty("job_uuid")
        @ExcludeMissing
        fun jobUuid(jobUuid: JsonField<String>) = apply { this.jobUuid = jobUuid }

        fun resourcesAllocated(resourcesAllocated: ResourcesAllocated) =
            resourcesAllocated(JsonField.of(resourcesAllocated))

        @JsonProperty("resources_allocated")
        @ExcludeMissing
        fun resourcesAllocated(resourcesAllocated: JsonField<ResourcesAllocated>) = apply {
            this.resourcesAllocated = resourcesAllocated
        }

        fun scheduledAt(scheduledAt: OffsetDateTime) = scheduledAt(JsonField.of(scheduledAt))

        @JsonProperty("scheduled_at")
        @ExcludeMissing
        fun scheduledAt(scheduledAt: JsonField<OffsetDateTime>) = apply {
            this.scheduledAt = scheduledAt
        }

        fun startedAt(startedAt: OffsetDateTime) = startedAt(JsonField.of(startedAt))

        @JsonProperty("started_at")
        @ExcludeMissing
        fun startedAt(startedAt: JsonField<OffsetDateTime>) = apply { this.startedAt = startedAt }

        fun status(status: Status) = status(JsonField.of(status))

        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

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

        fun build(): PostTrainingJobStatus =
            PostTrainingJobStatus(
                checkpoints.map { it.toUnmodifiable() },
                completedAt,
                jobUuid,
                resourcesAllocated,
                scheduledAt,
                startedAt,
                status,
                additionalProperties.toUnmodifiable(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val RUNNING = Status(JsonField.of("running"))

            val COMPLETED = Status(JsonField.of("completed"))

            val FAILED = Status(JsonField.of("failed"))

            val SCHEDULED = Status(JsonField.of("scheduled"))

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            RUNNING,
            COMPLETED,
            FAILED,
            SCHEDULED,
        }

        enum class Value {
            RUNNING,
            COMPLETED,
            FAILED,
            SCHEDULED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                RUNNING -> Value.RUNNING
                COMPLETED -> Value.COMPLETED
                FAILED -> Value.FAILED
                SCHEDULED -> Value.SCHEDULED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                RUNNING -> Known.RUNNING
                COMPLETED -> Known.COMPLETED
                FAILED -> Known.FAILED
                SCHEDULED -> Known.SCHEDULED
                else -> throw LlamaStackClientInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    @JsonDeserialize(builder = ResourcesAllocated.Builder::class)
    @NoAutoDetect
    class ResourcesAllocated
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): ResourcesAllocated = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ResourcesAllocated &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "ResourcesAllocated{additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(resourcesAllocated: ResourcesAllocated) = apply {
                additionalProperties(resourcesAllocated.additionalProperties)
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

            fun build(): ResourcesAllocated =
                ResourcesAllocated(additionalProperties.toUnmodifiable())
        }
    }
}
