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
import com.llama.llamastack.core.checkKnown
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

/** Status of a finetuning job. */
@NoAutoDetect
class PostTrainingJobStatusResponse
@JsonCreator
private constructor(
    @JsonProperty("checkpoints")
    @ExcludeMissing
    private val checkpoints: JsonField<List<JsonValue>> = JsonMissing.of(),
    @JsonProperty("job_uuid")
    @ExcludeMissing
    private val jobUuid: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("completed_at")
    @ExcludeMissing
    private val completedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("resources_allocated")
    @ExcludeMissing
    private val resourcesAllocated: JsonField<ResourcesAllocated> = JsonMissing.of(),
    @JsonProperty("scheduled_at")
    @ExcludeMissing
    private val scheduledAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("started_at")
    @ExcludeMissing
    private val startedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun checkpoints(): List<JsonValue> = checkpoints.getRequired("checkpoints")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun jobUuid(): String = jobUuid.getRequired("job_uuid")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun completedAt(): OffsetDateTime? = completedAt.getNullable("completed_at")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun resourcesAllocated(): ResourcesAllocated? =
        resourcesAllocated.getNullable("resources_allocated")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun scheduledAt(): OffsetDateTime? = scheduledAt.getNullable("scheduled_at")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun startedAt(): OffsetDateTime? = startedAt.getNullable("started_at")

    /**
     * Returns the raw JSON value of [checkpoints].
     *
     * Unlike [checkpoints], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("checkpoints")
    @ExcludeMissing
    fun _checkpoints(): JsonField<List<JsonValue>> = checkpoints

    /**
     * Returns the raw JSON value of [jobUuid].
     *
     * Unlike [jobUuid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("job_uuid") @ExcludeMissing fun _jobUuid(): JsonField<String> = jobUuid

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [completedAt].
     *
     * Unlike [completedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("completed_at")
    @ExcludeMissing
    fun _completedAt(): JsonField<OffsetDateTime> = completedAt

    /**
     * Returns the raw JSON value of [resourcesAllocated].
     *
     * Unlike [resourcesAllocated], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("resources_allocated")
    @ExcludeMissing
    fun _resourcesAllocated(): JsonField<ResourcesAllocated> = resourcesAllocated

    /**
     * Returns the raw JSON value of [scheduledAt].
     *
     * Unlike [scheduledAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scheduled_at")
    @ExcludeMissing
    fun _scheduledAt(): JsonField<OffsetDateTime> = scheduledAt

    /**
     * Returns the raw JSON value of [startedAt].
     *
     * Unlike [startedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("started_at")
    @ExcludeMissing
    fun _startedAt(): JsonField<OffsetDateTime> = startedAt

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PostTrainingJobStatusResponse = apply {
        if (validated) {
            return@apply
        }

        checkpoints()
        jobUuid()
        status()
        completedAt()
        resourcesAllocated()?.validate()
        scheduledAt()
        startedAt()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PostTrainingJobStatusResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .checkpoints()
         * .jobUuid()
         * .status()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PostTrainingJobStatusResponse]. */
    class Builder internal constructor() {

        private var checkpoints: JsonField<MutableList<JsonValue>>? = null
        private var jobUuid: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var completedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var resourcesAllocated: JsonField<ResourcesAllocated> = JsonMissing.of()
        private var scheduledAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var startedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(postTrainingJobStatusResponse: PostTrainingJobStatusResponse) = apply {
            checkpoints = postTrainingJobStatusResponse.checkpoints.map { it.toMutableList() }
            jobUuid = postTrainingJobStatusResponse.jobUuid
            status = postTrainingJobStatusResponse.status
            completedAt = postTrainingJobStatusResponse.completedAt
            resourcesAllocated = postTrainingJobStatusResponse.resourcesAllocated
            scheduledAt = postTrainingJobStatusResponse.scheduledAt
            startedAt = postTrainingJobStatusResponse.startedAt
            additionalProperties = postTrainingJobStatusResponse.additionalProperties.toMutableMap()
        }

        fun checkpoints(checkpoints: List<JsonValue>) = checkpoints(JsonField.of(checkpoints))

        /**
         * Sets [Builder.checkpoints] to an arbitrary JSON value.
         *
         * You should usually call [Builder.checkpoints] with a well-typed `List<JsonValue>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun checkpoints(checkpoints: JsonField<List<JsonValue>>) = apply {
            this.checkpoints = checkpoints.map { it.toMutableList() }
        }

        /**
         * Adds a single [JsonValue] to [checkpoints].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCheckpoint(checkpoint: JsonValue) = apply {
            checkpoints =
                (checkpoints ?: JsonField.of(mutableListOf())).also {
                    checkKnown("checkpoints", it).add(checkpoint)
                }
        }

        fun jobUuid(jobUuid: String) = jobUuid(JsonField.of(jobUuid))

        /**
         * Sets [Builder.jobUuid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jobUuid] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun jobUuid(jobUuid: JsonField<String>) = apply { this.jobUuid = jobUuid }

        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun completedAt(completedAt: OffsetDateTime) = completedAt(JsonField.of(completedAt))

        /**
         * Sets [Builder.completedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.completedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun completedAt(completedAt: JsonField<OffsetDateTime>) = apply {
            this.completedAt = completedAt
        }

        fun resourcesAllocated(resourcesAllocated: ResourcesAllocated) =
            resourcesAllocated(JsonField.of(resourcesAllocated))

        /**
         * Sets [Builder.resourcesAllocated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resourcesAllocated] with a well-typed
         * [ResourcesAllocated] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun resourcesAllocated(resourcesAllocated: JsonField<ResourcesAllocated>) = apply {
            this.resourcesAllocated = resourcesAllocated
        }

        fun scheduledAt(scheduledAt: OffsetDateTime) = scheduledAt(JsonField.of(scheduledAt))

        /**
         * Sets [Builder.scheduledAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scheduledAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun scheduledAt(scheduledAt: JsonField<OffsetDateTime>) = apply {
            this.scheduledAt = scheduledAt
        }

        fun startedAt(startedAt: OffsetDateTime) = startedAt(JsonField.of(startedAt))

        /**
         * Sets [Builder.startedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startedAt(startedAt: JsonField<OffsetDateTime>) = apply { this.startedAt = startedAt }

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
                checkRequired("checkpoints", checkpoints).map { it.toImmutable() },
                checkRequired("jobUuid", jobUuid),
                checkRequired("status", status),
                completedAt,
                resourcesAllocated,
                scheduledAt,
                startedAt,
                additionalProperties.toImmutable(),
            )
    }

    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val COMPLETED = of("completed")

            val IN_PROGRESS = of("in_progress")

            val FAILED = of("failed")

            val SCHEDULED = of("scheduled")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            COMPLETED,
            IN_PROGRESS,
            FAILED,
            SCHEDULED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            COMPLETED,
            IN_PROGRESS,
            FAILED,
            SCHEDULED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                COMPLETED -> Value.COMPLETED
                IN_PROGRESS -> Value.IN_PROGRESS
                FAILED -> Value.FAILED
                SCHEDULED -> Value.SCHEDULED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LlamaStackClientInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                COMPLETED -> Known.COMPLETED
                IN_PROGRESS -> Known.IN_PROGRESS
                FAILED -> Known.FAILED
                SCHEDULED -> Known.SCHEDULED
                else -> throw LlamaStackClientInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LlamaStackClientInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString()
                ?: throw LlamaStackClientInvalidDataException("Value is not a String")

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
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ResourcesAllocated = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [ResourcesAllocated]. */
            fun builder() = Builder()
        }

        /** A builder for [ResourcesAllocated]. */
        class Builder internal constructor() {

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

        return /* spotless:off */ other is PostTrainingJobStatusResponse && checkpoints == other.checkpoints && jobUuid == other.jobUuid && status == other.status && completedAt == other.completedAt && resourcesAllocated == other.resourcesAllocated && scheduledAt == other.scheduledAt && startedAt == other.startedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(checkpoints, jobUuid, status, completedAt, resourcesAllocated, scheduledAt, startedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PostTrainingJobStatusResponse{checkpoints=$checkpoints, jobUuid=$jobUuid, status=$status, completedAt=$completedAt, resourcesAllocated=$resourcesAllocated, scheduledAt=$scheduledAt, startedAt=$startedAt, additionalProperties=$additionalProperties}"
}
