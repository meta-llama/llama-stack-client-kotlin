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
import com.llama.llamastack.core.Params
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import java.util.Objects

class ScoringFunctionRegisterParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun description(): String = body.description()

    fun returnType(): ReturnType = body.returnType()

    fun scoringFnId(): String = body.scoringFnId()

    fun params(): ScoringFnParams? = body.params()

    fun providerId(): String? = body.providerId()

    fun providerScoringFnId(): String? = body.providerScoringFnId()

    fun _description(): JsonField<String> = body._description()

    fun _returnType(): JsonField<ReturnType> = body._returnType()

    fun _scoringFnId(): JsonField<String> = body._scoringFnId()

    fun _params(): JsonField<ScoringFnParams> = body._params()

    fun _providerId(): JsonField<String> = body._providerId()

    fun _providerScoringFnId(): JsonField<String> = body._providerScoringFnId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("return_type")
        @ExcludeMissing
        private val returnType: JsonField<ReturnType> = JsonMissing.of(),
        @JsonProperty("scoring_fn_id")
        @ExcludeMissing
        private val scoringFnId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("params")
        @ExcludeMissing
        private val params: JsonField<ScoringFnParams> = JsonMissing.of(),
        @JsonProperty("provider_id")
        @ExcludeMissing
        private val providerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("provider_scoring_fn_id")
        @ExcludeMissing
        private val providerScoringFnId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun description(): String = description.getRequired("description")

        fun returnType(): ReturnType = returnType.getRequired("return_type")

        fun scoringFnId(): String = scoringFnId.getRequired("scoring_fn_id")

        fun params(): ScoringFnParams? = params.getNullable("params")

        fun providerId(): String? = providerId.getNullable("provider_id")

        fun providerScoringFnId(): String? =
            providerScoringFnId.getNullable("provider_scoring_fn_id")

        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        @JsonProperty("return_type")
        @ExcludeMissing
        fun _returnType(): JsonField<ReturnType> = returnType

        @JsonProperty("scoring_fn_id")
        @ExcludeMissing
        fun _scoringFnId(): JsonField<String> = scoringFnId

        @JsonProperty("params") @ExcludeMissing fun _params(): JsonField<ScoringFnParams> = params

        @JsonProperty("provider_id")
        @ExcludeMissing
        fun _providerId(): JsonField<String> = providerId

        @JsonProperty("provider_scoring_fn_id")
        @ExcludeMissing
        fun _providerScoringFnId(): JsonField<String> = providerScoringFnId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            description()
            returnType().validate()
            scoringFnId()
            params()?.validate()
            providerId()
            providerScoringFnId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var description: JsonField<String>? = null
            private var returnType: JsonField<ReturnType>? = null
            private var scoringFnId: JsonField<String>? = null
            private var params: JsonField<ScoringFnParams> = JsonMissing.of()
            private var providerId: JsonField<String> = JsonMissing.of()
            private var providerScoringFnId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                description = body.description
                returnType = body.returnType
                scoringFnId = body.scoringFnId
                params = body.params
                providerId = body.providerId
                providerScoringFnId = body.providerScoringFnId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun description(description: String) = description(JsonField.of(description))

            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun returnType(returnType: ReturnType) = returnType(JsonField.of(returnType))

            fun returnType(returnType: JsonField<ReturnType>) = apply {
                this.returnType = returnType
            }

            fun scoringFnId(scoringFnId: String) = scoringFnId(JsonField.of(scoringFnId))

            fun scoringFnId(scoringFnId: JsonField<String>) = apply {
                this.scoringFnId = scoringFnId
            }

            fun params(params: ScoringFnParams) = params(JsonField.of(params))

            fun params(params: JsonField<ScoringFnParams>) = apply { this.params = params }

            fun params(llmAsJudge: ScoringFnParams.LlmAsJudgeScoringFnParams) =
                params(ScoringFnParams.ofLlmAsJudge(llmAsJudge))

            fun llmAsJudgeParams(judgeModel: String) =
                params(
                    ScoringFnParams.LlmAsJudgeScoringFnParams.builder()
                        .judgeModel(judgeModel)
                        .build()
                )

            fun params(regexParser: ScoringFnParams.RegexParserScoringFnParams) =
                params(ScoringFnParams.ofRegexParser(regexParser))

            fun params(basic: ScoringFnParams.BasicScoringFnParams) =
                params(ScoringFnParams.ofBasic(basic))

            fun providerId(providerId: String) = providerId(JsonField.of(providerId))

            fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

            fun providerScoringFnId(providerScoringFnId: String) =
                providerScoringFnId(JsonField.of(providerScoringFnId))

            fun providerScoringFnId(providerScoringFnId: JsonField<String>) = apply {
                this.providerScoringFnId = providerScoringFnId
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

            fun build(): Body =
                Body(
                    checkRequired("description", description),
                    checkRequired("returnType", returnType),
                    checkRequired("scoringFnId", scoringFnId),
                    params,
                    providerId,
                    providerScoringFnId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && description == other.description && returnType == other.returnType && scoringFnId == other.scoringFnId && params == other.params && providerId == other.providerId && providerScoringFnId == other.providerScoringFnId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(description, returnType, scoringFnId, params, providerId, providerScoringFnId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{description=$description, returnType=$returnType, scoringFnId=$scoringFnId, params=$params, providerId=$providerId, providerScoringFnId=$providerScoringFnId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [ScoringFunctionRegisterParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(scoringFunctionRegisterParams: ScoringFunctionRegisterParams) = apply {
            body = scoringFunctionRegisterParams.body.toBuilder()
            additionalHeaders = scoringFunctionRegisterParams.additionalHeaders.toBuilder()
            additionalQueryParams = scoringFunctionRegisterParams.additionalQueryParams.toBuilder()
        }

        fun description(description: String) = apply { body.description(description) }

        fun description(description: JsonField<String>) = apply { body.description(description) }

        fun returnType(returnType: ReturnType) = apply { body.returnType(returnType) }

        fun returnType(returnType: JsonField<ReturnType>) = apply { body.returnType(returnType) }

        fun scoringFnId(scoringFnId: String) = apply { body.scoringFnId(scoringFnId) }

        fun scoringFnId(scoringFnId: JsonField<String>) = apply { body.scoringFnId(scoringFnId) }

        fun params(params: ScoringFnParams) = apply { body.params(params) }

        fun params(params: JsonField<ScoringFnParams>) = apply { body.params(params) }

        fun params(llmAsJudge: ScoringFnParams.LlmAsJudgeScoringFnParams) = apply {
            body.params(llmAsJudge)
        }

        fun llmAsJudgeParams(judgeModel: String) = apply { body.llmAsJudgeParams(judgeModel) }

        fun params(regexParser: ScoringFnParams.RegexParserScoringFnParams) = apply {
            body.params(regexParser)
        }

        fun params(basic: ScoringFnParams.BasicScoringFnParams) = apply { body.params(basic) }

        fun providerId(providerId: String) = apply { body.providerId(providerId) }

        fun providerId(providerId: JsonField<String>) = apply { body.providerId(providerId) }

        fun providerScoringFnId(providerScoringFnId: String) = apply {
            body.providerScoringFnId(providerScoringFnId)
        }

        fun providerScoringFnId(providerScoringFnId: JsonField<String>) = apply {
            body.providerScoringFnId(providerScoringFnId)
        }

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

        fun build(): ScoringFunctionRegisterParams =
            ScoringFunctionRegisterParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ScoringFunctionRegisterParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ScoringFunctionRegisterParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
