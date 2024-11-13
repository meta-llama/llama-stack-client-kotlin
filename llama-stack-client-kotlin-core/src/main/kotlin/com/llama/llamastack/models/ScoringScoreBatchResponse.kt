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

@JsonDeserialize(builder = ScoringScoreBatchResponse.Builder::class)
@NoAutoDetect
class ScoringScoreBatchResponse
private constructor(
    private val datasetId: JsonField<String>,
    private val results: JsonField<Results>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun datasetId(): String? = datasetId.getNullable("dataset_id")

    fun results(): Results = results.getRequired("results")

    @JsonProperty("dataset_id") @ExcludeMissing fun _datasetId() = datasetId

    @JsonProperty("results") @ExcludeMissing fun _results() = results

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ScoringScoreBatchResponse = apply {
        if (!validated) {
            datasetId()
            results().validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var datasetId: JsonField<String> = JsonMissing.of()
        private var results: JsonField<Results> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(scoringScoreBatchResponse: ScoringScoreBatchResponse) = apply {
            this.datasetId = scoringScoreBatchResponse.datasetId
            this.results = scoringScoreBatchResponse.results
            additionalProperties(scoringScoreBatchResponse.additionalProperties)
        }

        fun datasetId(datasetId: String) = datasetId(JsonField.of(datasetId))

        @JsonProperty("dataset_id")
        @ExcludeMissing
        fun datasetId(datasetId: JsonField<String>) = apply { this.datasetId = datasetId }

        fun results(results: Results) = results(JsonField.of(results))

        @JsonProperty("results")
        @ExcludeMissing
        fun results(results: JsonField<Results>) = apply { this.results = results }

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

        fun build(): ScoringScoreBatchResponse =
            ScoringScoreBatchResponse(
                datasetId,
                results,
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = Results.Builder::class)
    @NoAutoDetect
    class Results
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Results = apply {
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

            internal fun from(results: Results) = apply {
                additionalProperties(results.additionalProperties)
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

            fun build(): Results = Results(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Results && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "Results{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ScoringScoreBatchResponse && this.datasetId == other.datasetId && this.results == other.results && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(datasetId, results, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "ScoringScoreBatchResponse{datasetId=$datasetId, results=$results, additionalProperties=$additionalProperties}"
}
