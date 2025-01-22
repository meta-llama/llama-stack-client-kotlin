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
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import java.util.Objects

class EvalTaskRegisterParams
constructor(
    private val xLlamaStackClientVersion: String?,
    private val xLlamaStackProviderData: String?,
    private val body: EvalTaskRegisterBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun xLlamaStackClientVersion(): String? = xLlamaStackClientVersion

    fun xLlamaStackProviderData(): String? = xLlamaStackProviderData

    fun datasetId(): String = body.datasetId()

    fun evalTaskId(): String = body.evalTaskId()

    fun scoringFunctions(): List<String> = body.scoringFunctions()

    fun metadata(): Metadata? = body.metadata()

    fun providerEvalTaskId(): String? = body.providerEvalTaskId()

    fun providerId(): String? = body.providerId()

    fun _datasetId(): JsonField<String> = body._datasetId()

    fun _evalTaskId(): JsonField<String> = body._evalTaskId()

    fun _scoringFunctions(): JsonField<List<String>> = body._scoringFunctions()

    fun _metadata(): JsonField<Metadata> = body._metadata()

    fun _providerEvalTaskId(): JsonField<String> = body._providerEvalTaskId()

    fun _providerId(): JsonField<String> = body._providerId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getBody(): EvalTaskRegisterBody = body

    internal fun getHeaders(): Headers {
        val headers = Headers.builder()
        this.xLlamaStackClientVersion?.let {
            headers.put("X-LlamaStack-Client-Version", listOf(it.toString()))
        }
        this.xLlamaStackProviderData?.let {
            headers.put("X-LlamaStack-Provider-Data", listOf(it.toString()))
        }
        headers.putAll(additionalHeaders)
        return headers.build()
    }

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class EvalTaskRegisterBody
    @JsonCreator
    internal constructor(
        @JsonProperty("dataset_id")
        @ExcludeMissing
        private val datasetId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("eval_task_id")
        @ExcludeMissing
        private val evalTaskId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("scoring_functions")
        @ExcludeMissing
        private val scoringFunctions: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("provider_eval_task_id")
        @ExcludeMissing
        private val providerEvalTaskId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("provider_id")
        @ExcludeMissing
        private val providerId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun datasetId(): String = datasetId.getRequired("dataset_id")

        fun evalTaskId(): String = evalTaskId.getRequired("eval_task_id")

        fun scoringFunctions(): List<String> = scoringFunctions.getRequired("scoring_functions")

        fun metadata(): Metadata? = metadata.getNullable("metadata")

        fun providerEvalTaskId(): String? = providerEvalTaskId.getNullable("provider_eval_task_id")

        fun providerId(): String? = providerId.getNullable("provider_id")

        @JsonProperty("dataset_id") @ExcludeMissing fun _datasetId(): JsonField<String> = datasetId

        @JsonProperty("eval_task_id")
        @ExcludeMissing
        fun _evalTaskId(): JsonField<String> = evalTaskId

        @JsonProperty("scoring_functions")
        @ExcludeMissing
        fun _scoringFunctions(): JsonField<List<String>> = scoringFunctions

        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        @JsonProperty("provider_eval_task_id")
        @ExcludeMissing
        fun _providerEvalTaskId(): JsonField<String> = providerEvalTaskId

        @JsonProperty("provider_id")
        @ExcludeMissing
        fun _providerId(): JsonField<String> = providerId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): EvalTaskRegisterBody = apply {
            if (validated) {
                return@apply
            }

            datasetId()
            evalTaskId()
            scoringFunctions()
            metadata()?.validate()
            providerEvalTaskId()
            providerId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var datasetId: JsonField<String>? = null
            private var evalTaskId: JsonField<String>? = null
            private var scoringFunctions: JsonField<MutableList<String>>? = null
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var providerEvalTaskId: JsonField<String> = JsonMissing.of()
            private var providerId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(evalTaskRegisterBody: EvalTaskRegisterBody) = apply {
                datasetId = evalTaskRegisterBody.datasetId
                evalTaskId = evalTaskRegisterBody.evalTaskId
                scoringFunctions = evalTaskRegisterBody.scoringFunctions.map { it.toMutableList() }
                metadata = evalTaskRegisterBody.metadata
                providerEvalTaskId = evalTaskRegisterBody.providerEvalTaskId
                providerId = evalTaskRegisterBody.providerId
                additionalProperties = evalTaskRegisterBody.additionalProperties.toMutableMap()
            }

            fun datasetId(datasetId: String) = datasetId(JsonField.of(datasetId))

            fun datasetId(datasetId: JsonField<String>) = apply { this.datasetId = datasetId }

            fun evalTaskId(evalTaskId: String) = evalTaskId(JsonField.of(evalTaskId))

            fun evalTaskId(evalTaskId: JsonField<String>) = apply { this.evalTaskId = evalTaskId }

            fun scoringFunctions(scoringFunctions: List<String>) =
                scoringFunctions(JsonField.of(scoringFunctions))

            fun scoringFunctions(scoringFunctions: JsonField<List<String>>) = apply {
                this.scoringFunctions = scoringFunctions.map { it.toMutableList() }
            }

            fun addScoringFunction(scoringFunction: String) = apply {
                scoringFunctions =
                    (scoringFunctions ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(scoringFunction)
                    }
            }

            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            fun providerEvalTaskId(providerEvalTaskId: String) =
                providerEvalTaskId(JsonField.of(providerEvalTaskId))

            fun providerEvalTaskId(providerEvalTaskId: JsonField<String>) = apply {
                this.providerEvalTaskId = providerEvalTaskId
            }

            fun providerId(providerId: String) = providerId(JsonField.of(providerId))

            fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

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

            fun build(): EvalTaskRegisterBody =
                EvalTaskRegisterBody(
                    checkRequired("datasetId", datasetId),
                    checkRequired("evalTaskId", evalTaskId),
                    checkRequired("scoringFunctions", scoringFunctions).map { it.toImmutable() },
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

        private var xLlamaStackClientVersion: String? = null
        private var xLlamaStackProviderData: String? = null
        private var body: EvalTaskRegisterBody.Builder = EvalTaskRegisterBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(evalTaskRegisterParams: EvalTaskRegisterParams) = apply {
            xLlamaStackClientVersion = evalTaskRegisterParams.xLlamaStackClientVersion
            xLlamaStackProviderData = evalTaskRegisterParams.xLlamaStackProviderData
            body = evalTaskRegisterParams.body.toBuilder()
            additionalHeaders = evalTaskRegisterParams.additionalHeaders.toBuilder()
            additionalQueryParams = evalTaskRegisterParams.additionalQueryParams.toBuilder()
        }

        fun xLlamaStackClientVersion(xLlamaStackClientVersion: String?) = apply {
            this.xLlamaStackClientVersion = xLlamaStackClientVersion
        }

        fun xLlamaStackProviderData(xLlamaStackProviderData: String?) = apply {
            this.xLlamaStackProviderData = xLlamaStackProviderData
        }

        fun datasetId(datasetId: String) = apply { body.datasetId(datasetId) }

        fun datasetId(datasetId: JsonField<String>) = apply { body.datasetId(datasetId) }

        fun evalTaskId(evalTaskId: String) = apply { body.evalTaskId(evalTaskId) }

        fun evalTaskId(evalTaskId: JsonField<String>) = apply { body.evalTaskId(evalTaskId) }

        fun scoringFunctions(scoringFunctions: List<String>) = apply {
            body.scoringFunctions(scoringFunctions)
        }

        fun scoringFunctions(scoringFunctions: JsonField<List<String>>) = apply {
            body.scoringFunctions(scoringFunctions)
        }

        fun addScoringFunction(scoringFunction: String) = apply {
            body.addScoringFunction(scoringFunction)
        }

        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        fun providerEvalTaskId(providerEvalTaskId: String) = apply {
            body.providerEvalTaskId(providerEvalTaskId)
        }

        fun providerEvalTaskId(providerEvalTaskId: JsonField<String>) = apply {
            body.providerEvalTaskId(providerEvalTaskId)
        }

        fun providerId(providerId: String) = apply { body.providerId(providerId) }

        fun providerId(providerId: JsonField<String>) = apply { body.providerId(providerId) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
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

        fun build(): EvalTaskRegisterParams =
            EvalTaskRegisterParams(
                xLlamaStackClientVersion,
                xLlamaStackProviderData,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class Metadata
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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

        return /* spotless:off */ other is EvalTaskRegisterParams && xLlamaStackClientVersion == other.xLlamaStackClientVersion && xLlamaStackProviderData == other.xLlamaStackProviderData && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(xLlamaStackClientVersion, xLlamaStackProviderData, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "EvalTaskRegisterParams{xLlamaStackClientVersion=$xLlamaStackClientVersion, xLlamaStackProviderData=$xLlamaStackProviderData, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
