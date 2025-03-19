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
import com.llama.llamastack.core.checkKnown
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

/** Artifacts of a finetuning job. */
@NoAutoDetect
class PostTrainingJobArtifactsResponse
@JsonCreator
private constructor(
    @JsonProperty("checkpoints")
    @ExcludeMissing
    private val checkpoints: JsonField<List<JsonValue>> = JsonMissing.of(),
    @JsonProperty("job_uuid")
    @ExcludeMissing
    private val jobUuid: JsonField<String> = JsonMissing.of(),
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

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PostTrainingJobArtifactsResponse = apply {
        if (validated) {
            return@apply
        }

        checkpoints()
        jobUuid()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PostTrainingJobArtifactsResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .checkpoints()
         * .jobUuid()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PostTrainingJobArtifactsResponse]. */
    class Builder internal constructor() {

        private var checkpoints: JsonField<MutableList<JsonValue>>? = null
        private var jobUuid: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(postTrainingJobArtifactsResponse: PostTrainingJobArtifactsResponse) =
            apply {
                checkpoints =
                    postTrainingJobArtifactsResponse.checkpoints.map { it.toMutableList() }
                jobUuid = postTrainingJobArtifactsResponse.jobUuid
                additionalProperties =
                    postTrainingJobArtifactsResponse.additionalProperties.toMutableMap()
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

        fun build(): PostTrainingJobArtifactsResponse =
            PostTrainingJobArtifactsResponse(
                checkRequired("checkpoints", checkpoints).map { it.toImmutable() },
                checkRequired("jobUuid", jobUuid),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PostTrainingJobArtifactsResponse && checkpoints == other.checkpoints && jobUuid == other.jobUuid && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(checkpoints, jobUuid, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PostTrainingJobArtifactsResponse{checkpoints=$checkpoints, jobUuid=$jobUuid, additionalProperties=$additionalProperties}"
}
