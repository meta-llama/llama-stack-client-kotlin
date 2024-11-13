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

@JsonDeserialize(builder = PostTrainingJobLogsResponse.Builder::class)
@NoAutoDetect
class PostTrainingJobLogsResponse
private constructor(
    private val jobUuid: JsonField<String>,
    private val logLines: JsonField<List<String>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun jobUuid(): String = jobUuid.getRequired("job_uuid")

    fun logLines(): List<String> = logLines.getRequired("log_lines")

    @JsonProperty("job_uuid") @ExcludeMissing fun _jobUuid() = jobUuid

    @JsonProperty("log_lines") @ExcludeMissing fun _logLines() = logLines

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): PostTrainingJobLogsResponse = apply {
        if (!validated) {
            jobUuid()
            logLines()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var jobUuid: JsonField<String> = JsonMissing.of()
        private var logLines: JsonField<List<String>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(postTrainingJobLogsResponse: PostTrainingJobLogsResponse) = apply {
            this.jobUuid = postTrainingJobLogsResponse.jobUuid
            this.logLines = postTrainingJobLogsResponse.logLines
            additionalProperties(postTrainingJobLogsResponse.additionalProperties)
        }

        fun jobUuid(jobUuid: String) = jobUuid(JsonField.of(jobUuid))

        @JsonProperty("job_uuid")
        @ExcludeMissing
        fun jobUuid(jobUuid: JsonField<String>) = apply { this.jobUuid = jobUuid }

        fun logLines(logLines: List<String>) = logLines(JsonField.of(logLines))

        @JsonProperty("log_lines")
        @ExcludeMissing
        fun logLines(logLines: JsonField<List<String>>) = apply { this.logLines = logLines }

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

        fun build(): PostTrainingJobLogsResponse =
            PostTrainingJobLogsResponse(
                jobUuid,
                logLines.map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PostTrainingJobLogsResponse && this.jobUuid == other.jobUuid && this.logLines == other.logLines && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(jobUuid, logLines, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "PostTrainingJobLogsResponse{jobUuid=$jobUuid, logLines=$logLines, additionalProperties=$additionalProperties}"
}
