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
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

@NoAutoDetect
class PostTrainingJob
@JsonCreator
private constructor(
    @JsonProperty("job_uuid")
    @ExcludeMissing
    private val jobUuid: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun jobUuid(): String = jobUuid.getRequired("job_uuid")

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

    fun validate(): PostTrainingJob = apply {
        if (validated) {
            return@apply
        }

        jobUuid()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PostTrainingJob].
         *
         * The following fields are required:
         * ```kotlin
         * .jobUuid()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PostTrainingJob]. */
    class Builder internal constructor() {

        private var jobUuid: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(postTrainingJob: PostTrainingJob) = apply {
            jobUuid = postTrainingJob.jobUuid
            additionalProperties = postTrainingJob.additionalProperties.toMutableMap()
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

        fun build(): PostTrainingJob =
            PostTrainingJob(checkRequired("jobUuid", jobUuid), additionalProperties.toImmutable())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PostTrainingJob && jobUuid == other.jobUuid && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(jobUuid, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PostTrainingJob{jobUuid=$jobUuid, additionalProperties=$additionalProperties}"
}
