// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.models.*
import java.util.Objects

class EvalTaskRegisterParams
constructor(
    private val datasetId: String,
    private val evalTaskId: String,
    private val scoringFunctions: List<String>,
    private val metadata: Metadata?,
    private val providerEvalTaskId: String?,
    private val providerId: String?,
    private val xLlamaStackProviderData: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun datasetId(): String = datasetId

    fun evalTaskId(): String = evalTaskId

    fun scoringFunctions(): List<String> = scoringFunctions

    fun metadata(): Metadata? = metadata

    fun providerEvalTaskId(): String? = providerEvalTaskId

    fun providerId(): String? = providerId

    fun xLlamaStackProviderData(): String? = xLlamaStackProviderData

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    internal fun getBody(): EvalTaskRegisterBody {
        return EvalTaskRegisterBody(
            datasetId,
            evalTaskId,
            scoringFunctions,
            metadata,
            providerEvalTaskId,
            providerId,
            additionalBodyProperties,
        )
    }

    internal fun getHeaders(): Headers {
        val headers = Headers.builder()
        this.xLlamaStackProviderData?.let {
            headers.put("X-LlamaStack-ProviderData", listOf(it.toString()))
        }
        headers.putAll(additionalHeaders)
        return headers.build()
    }

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = EvalTaskRegisterBody.Builder::class)
    @NoAutoDetect
    class EvalTaskRegisterBody
    internal constructor(
        private val datasetId: String?,
        private val evalTaskId: String?,
        private val scoringFunctions: List<String>?,
        private val metadata: Metadata?,
        private val providerEvalTaskId: String?,
        private val providerId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("dataset_id") fun datasetId(): String? = datasetId

        @JsonProperty("eval_task_id") fun evalTaskId(): String? = evalTaskId

        @JsonProperty("scoring_functions") fun scoringFunctions(): List<String>? = scoringFunctions

        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        @JsonProperty("provider_eval_task_id")
        fun providerEvalTaskId(): String? = providerEvalTaskId

        @JsonProperty("provider_id") fun providerId(): String? = providerId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var datasetId: String? = null
            private var evalTaskId: String? = null
            private var scoringFunctions: List<String>? = null
            private var metadata: Metadata? = null
            private var providerEvalTaskId: String? = null
            private var providerId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(evalTaskRegisterBody: EvalTaskRegisterBody) = apply {
                this.datasetId = evalTaskRegisterBody.datasetId
                this.evalTaskId = evalTaskRegisterBody.evalTaskId
                this.scoringFunctions = evalTaskRegisterBody.scoringFunctions
                this.metadata = evalTaskRegisterBody.metadata
                this.providerEvalTaskId = evalTaskRegisterBody.providerEvalTaskId
                this.providerId = evalTaskRegisterBody.providerId
                additionalProperties(evalTaskRegisterBody.additionalProperties)
            }

            @JsonProperty("dataset_id")
            fun datasetId(datasetId: String) = apply { this.datasetId = datasetId }

            @JsonProperty("eval_task_id")
            fun evalTaskId(evalTaskId: String) = apply { this.evalTaskId = evalTaskId }

            @JsonProperty("scoring_functions")
            fun scoringFunctions(scoringFunctions: List<String>) = apply {
                this.scoringFunctions = scoringFunctions
            }

            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            @JsonProperty("provider_eval_task_id")
            fun providerEvalTaskId(providerEvalTaskId: String) = apply {
                this.providerEvalTaskId = providerEvalTaskId
            }

            @JsonProperty("provider_id")
            fun providerId(providerId: String) = apply { this.providerId = providerId }

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

            fun build(): EvalTaskRegisterBody =
                EvalTaskRegisterBody(
                    checkNotNull(datasetId) { "`datasetId` is required but was not set" },
                    checkNotNull(evalTaskId) { "`evalTaskId` is required but was not set" },
                    checkNotNull(scoringFunctions) {
                            "`scoringFunctions` is required but was not set"
                        }
                        .toImmutable(),
                    metadata,
                    providerEvalTaskId,
                    providerId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is EvalTaskRegisterBody && datasetId == other.datasetId && evalTaskId == other.evalTaskId && scoringFunctions == other.scoringFunctions && metadata == other.metadata && providerEvalTaskId == other.providerEvalTaskId && providerId == other.providerId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(datasetId, evalTaskId, scoringFunctions, metadata, providerEvalTaskId, providerId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "EvalTaskRegisterBody{datasetId=$datasetId, evalTaskId=$evalTaskId, scoringFunctions=$scoringFunctions, metadata=$metadata, providerEvalTaskId=$providerEvalTaskId, providerId=$providerId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var datasetId: String? = null
        private var evalTaskId: String? = null
        private var scoringFunctions: MutableList<String> = mutableListOf()
        private var metadata: Metadata? = null
        private var providerEvalTaskId: String? = null
        private var providerId: String? = null
        private var xLlamaStackProviderData: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(evalTaskRegisterParams: EvalTaskRegisterParams) = apply {
            datasetId = evalTaskRegisterParams.datasetId
            evalTaskId = evalTaskRegisterParams.evalTaskId
            scoringFunctions = evalTaskRegisterParams.scoringFunctions.toMutableList()
            metadata = evalTaskRegisterParams.metadata
            providerEvalTaskId = evalTaskRegisterParams.providerEvalTaskId
            providerId = evalTaskRegisterParams.providerId
            xLlamaStackProviderData = evalTaskRegisterParams.xLlamaStackProviderData
            additionalHeaders = evalTaskRegisterParams.additionalHeaders.toBuilder()
            additionalQueryParams = evalTaskRegisterParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                evalTaskRegisterParams.additionalBodyProperties.toMutableMap()
        }

        fun datasetId(datasetId: String) = apply { this.datasetId = datasetId }

        fun evalTaskId(evalTaskId: String) = apply { this.evalTaskId = evalTaskId }

        fun scoringFunctions(scoringFunctions: List<String>) = apply {
            this.scoringFunctions.clear()
            this.scoringFunctions.addAll(scoringFunctions)
        }

        fun addScoringFunction(scoringFunction: String) = apply {
            this.scoringFunctions.add(scoringFunction)
        }

        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        fun providerEvalTaskId(providerEvalTaskId: String) = apply {
            this.providerEvalTaskId = providerEvalTaskId
        }

        fun providerId(providerId: String) = apply { this.providerId = providerId }

        fun xLlamaStackProviderData(xLlamaStackProviderData: String) = apply {
            this.xLlamaStackProviderData = xLlamaStackProviderData
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): EvalTaskRegisterParams =
            EvalTaskRegisterParams(
                checkNotNull(datasetId) { "`datasetId` is required but was not set" },
                checkNotNull(evalTaskId) { "`evalTaskId` is required but was not set" },
                scoringFunctions.toImmutable(),
                metadata,
                providerEvalTaskId,
                providerId,
                xLlamaStackProviderData,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EvalTaskRegisterParams && datasetId == other.datasetId && evalTaskId == other.evalTaskId && scoringFunctions == other.scoringFunctions && metadata == other.metadata && providerEvalTaskId == other.providerEvalTaskId && providerId == other.providerId && xLlamaStackProviderData == other.xLlamaStackProviderData && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(datasetId, evalTaskId, scoringFunctions, metadata, providerEvalTaskId, providerId, xLlamaStackProviderData, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "EvalTaskRegisterParams{datasetId=$datasetId, evalTaskId=$evalTaskId, scoringFunctions=$scoringFunctions, metadata=$metadata, providerEvalTaskId=$providerEvalTaskId, providerId=$providerId, xLlamaStackProviderData=$xLlamaStackProviderData, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
