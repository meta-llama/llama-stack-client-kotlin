// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.toImmutable
import java.util.Objects

@JsonDeserialize(builder = PostTrainingJobArtifactsResponse.Builder::class)
@NoAutoDetect
class PostTrainingJobArtifactsResponse
private constructor(
    private val checkpoints: JsonField<List<JsonValue>>,
    private val jobUuid: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun checkpoints(): List<JsonValue> = checkpoints.getRequired("checkpoints")

    fun jobUuid(): String = jobUuid.getRequired("job_uuid")

    @JsonProperty("checkpoints") @ExcludeMissing fun _checkpoints() = checkpoints

    @JsonProperty("job_uuid") @ExcludeMissing fun _jobUuid() = jobUuid

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): PostTrainingJobArtifactsResponse = apply {
        if (!validated) {
            checkpoints()
            jobUuid()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var checkpoints: JsonField<List<JsonValue>> = JsonMissing.of()
        private var jobUuid: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(postTrainingJobArtifactsResponse: PostTrainingJobArtifactsResponse) =
            apply {
                this.checkpoints = postTrainingJobArtifactsResponse.checkpoints
                this.jobUuid = postTrainingJobArtifactsResponse.jobUuid
                additionalProperties(postTrainingJobArtifactsResponse.additionalProperties)
            }

        fun checkpoints(checkpoints: List<JsonValue>) = checkpoints(JsonField.of(checkpoints))

        @JsonProperty("checkpoints")
        @ExcludeMissing
        fun checkpoints(checkpoints: JsonField<List<JsonValue>>) = apply {
            this.checkpoints = checkpoints
        }

        fun jobUuid(jobUuid: String) = jobUuid(JsonField.of(jobUuid))

        @JsonProperty("job_uuid")
        @ExcludeMissing
        fun jobUuid(jobUuid: JsonField<String>) = apply { this.jobUuid = jobUuid }

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

        fun build(): PostTrainingJobArtifactsResponse =
            PostTrainingJobArtifactsResponse(
                checkpoints.map { it.toImmutable() },
                jobUuid,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PostTrainingJobArtifactsResponse && this.checkpoints == other.checkpoints && this.jobUuid == other.jobUuid && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(checkpoints, jobUuid, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "PostTrainingJobArtifactsResponse{checkpoints=$checkpoints, jobUuid=$jobUuid, additionalProperties=$additionalProperties}"
}
