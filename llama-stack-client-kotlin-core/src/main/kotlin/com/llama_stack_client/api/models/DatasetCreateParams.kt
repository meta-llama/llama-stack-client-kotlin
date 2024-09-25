// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.llama_stack_client.api.core.ExcludeMissing
import com.llama_stack_client.api.core.JsonValue
import com.llama_stack_client.api.core.NoAutoDetect
import com.llama_stack_client.api.core.toUnmodifiable
import com.llama_stack_client.api.models.*
import java.util.Objects

class DatasetCreateParams
constructor(
    private val dataset: TrainEvalDataset,
    private val uuid: String,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun dataset(): TrainEvalDataset = dataset

    fun uuid(): String = uuid

    internal fun getBody(): DatasetCreateBody {
        return DatasetCreateBody(
            dataset,
            uuid,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = DatasetCreateBody.Builder::class)
    @NoAutoDetect
    class DatasetCreateBody
    internal constructor(
        private val dataset: TrainEvalDataset?,
        private val uuid: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("dataset") fun dataset(): TrainEvalDataset? = dataset

        @JsonProperty("uuid") fun uuid(): String? = uuid

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DatasetCreateBody &&
                this.dataset == other.dataset &&
                this.uuid == other.uuid &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        dataset,
                        uuid,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "DatasetCreateBody{dataset=$dataset, uuid=$uuid, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var dataset: TrainEvalDataset? = null
            private var uuid: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(datasetCreateBody: DatasetCreateBody) = apply {
                this.dataset = datasetCreateBody.dataset
                this.uuid = datasetCreateBody.uuid
                additionalProperties(datasetCreateBody.additionalProperties)
            }

            @JsonProperty("dataset")
            fun dataset(dataset: TrainEvalDataset) = apply { this.dataset = dataset }

            @JsonProperty("uuid") fun uuid(uuid: String) = apply { this.uuid = uuid }

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

            fun build(): DatasetCreateBody =
                DatasetCreateBody(
                    checkNotNull(dataset) { "`dataset` is required but was not set" },
                    checkNotNull(uuid) { "`uuid` is required but was not set" },
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DatasetCreateParams &&
            this.dataset == other.dataset &&
            this.uuid == other.uuid &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            dataset,
            uuid,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "DatasetCreateParams{dataset=$dataset, uuid=$uuid, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var dataset: TrainEvalDataset? = null
        private var uuid: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(datasetCreateParams: DatasetCreateParams) = apply {
            this.dataset = datasetCreateParams.dataset
            this.uuid = datasetCreateParams.uuid
            additionalQueryParams(datasetCreateParams.additionalQueryParams)
            additionalHeaders(datasetCreateParams.additionalHeaders)
            additionalBodyProperties(datasetCreateParams.additionalBodyProperties)
        }

        fun dataset(dataset: TrainEvalDataset) = apply { this.dataset = dataset }

        fun uuid(uuid: String) = apply { this.uuid = uuid }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): DatasetCreateParams =
            DatasetCreateParams(
                checkNotNull(dataset) { "`dataset` is required but was not set" },
                checkNotNull(uuid) { "`uuid` is required but was not set" },
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
