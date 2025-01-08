// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.BaseDeserializer
import com.llama.llamastack.core.BaseSerializer
import com.llama.llamastack.core.Enum
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

class ScoringFunctionRegisterParams
constructor(
    private val xLlamaStackProviderData: String?,
    private val body: ScoringFunctionRegisterBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun xLlamaStackProviderData(): String? = xLlamaStackProviderData

    fun description(): String = body.description()

    fun returnType(): ReturnType = body.returnType()

    fun scoringFnId(): String = body.scoringFnId()

    fun params(): Params? = body.params()

    fun providerId(): String? = body.providerId()

    fun providerScoringFnId(): String? = body.providerScoringFnId()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    internal fun getBody(): ScoringFunctionRegisterBody = body

    internal fun getHeaders(): Headers {
        val headers = Headers.builder()
        this.xLlamaStackProviderData?.let {
            headers.put("X-LlamaStack-ProviderData", listOf(it.toString()))
        }
        headers.putAll(additionalHeaders)
        return headers.build()
    }

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class ScoringFunctionRegisterBody
    @JsonCreator
    internal constructor(
        @JsonProperty("description") private val description: String,
        @JsonProperty("return_type") private val returnType: ReturnType,
        @JsonProperty("scoring_fn_id") private val scoringFnId: String,
        @JsonProperty("params") private val params: Params?,
        @JsonProperty("provider_id") private val providerId: String?,
        @JsonProperty("provider_scoring_fn_id") private val providerScoringFnId: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("description") fun description(): String = description

        @JsonProperty("return_type") fun returnType(): ReturnType = returnType

        @JsonProperty("scoring_fn_id") fun scoringFnId(): String = scoringFnId

        @JsonProperty("params") fun params(): Params? = params

        @JsonProperty("provider_id") fun providerId(): String? = providerId

        @JsonProperty("provider_scoring_fn_id")
        fun providerScoringFnId(): String? = providerScoringFnId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var description: String? = null
            private var returnType: ReturnType? = null
            private var scoringFnId: String? = null
            private var params: Params? = null
            private var providerId: String? = null
            private var providerScoringFnId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(scoringFunctionRegisterBody: ScoringFunctionRegisterBody) = apply {
                description = scoringFunctionRegisterBody.description
                returnType = scoringFunctionRegisterBody.returnType
                scoringFnId = scoringFunctionRegisterBody.scoringFnId
                params = scoringFunctionRegisterBody.params
                providerId = scoringFunctionRegisterBody.providerId
                providerScoringFnId = scoringFunctionRegisterBody.providerScoringFnId
                additionalProperties =
                    scoringFunctionRegisterBody.additionalProperties.toMutableMap()
            }

            fun description(description: String) = apply { this.description = description }

            fun returnType(returnType: ReturnType) = apply { this.returnType = returnType }

            fun scoringFnId(scoringFnId: String) = apply { this.scoringFnId = scoringFnId }

            fun params(params: Params) = apply { this.params = params }

            fun params(llmAsJudgeScoringFnParams: Params.LlmAsJudgeScoringFnParams) = apply {
                this.params = Params.ofLlmAsJudgeScoringFnParams(llmAsJudgeScoringFnParams)
            }

            fun params(regexParserScoringFnParams: Params.RegexParserScoringFnParams) = apply {
                this.params = Params.ofRegexParserScoringFnParams(regexParserScoringFnParams)
            }

            fun params(basicScoringFnParams: Params.BasicScoringFnParams) = apply {
                this.params = Params.ofBasicScoringFnParams(basicScoringFnParams)
            }

            fun providerId(providerId: String) = apply { this.providerId = providerId }

            fun providerScoringFnId(providerScoringFnId: String) = apply {
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

            fun build(): ScoringFunctionRegisterBody =
                ScoringFunctionRegisterBody(
                    checkNotNull(description) { "`description` is required but was not set" },
                    checkNotNull(returnType) { "`returnType` is required but was not set" },
                    checkNotNull(scoringFnId) { "`scoringFnId` is required but was not set" },
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

            return /* spotless:off */ other is ScoringFunctionRegisterBody && description == other.description && returnType == other.returnType && scoringFnId == other.scoringFnId && params == other.params && providerId == other.providerId && providerScoringFnId == other.providerScoringFnId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(description, returnType, scoringFnId, params, providerId, providerScoringFnId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ScoringFunctionRegisterBody{description=$description, returnType=$returnType, scoringFnId=$scoringFnId, params=$params, providerId=$providerId, providerScoringFnId=$providerScoringFnId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var xLlamaStackProviderData: String? = null
        private var body: ScoringFunctionRegisterBody.Builder =
            ScoringFunctionRegisterBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(scoringFunctionRegisterParams: ScoringFunctionRegisterParams) = apply {
            xLlamaStackProviderData = scoringFunctionRegisterParams.xLlamaStackProviderData
            body = scoringFunctionRegisterParams.body.toBuilder()
            additionalHeaders = scoringFunctionRegisterParams.additionalHeaders.toBuilder()
            additionalQueryParams = scoringFunctionRegisterParams.additionalQueryParams.toBuilder()
        }

        fun xLlamaStackProviderData(xLlamaStackProviderData: String) = apply {
            this.xLlamaStackProviderData = xLlamaStackProviderData
        }

        fun description(description: String) = apply { body.description(description) }

        fun returnType(returnType: ReturnType) = apply { body.returnType(returnType) }

        fun scoringFnId(scoringFnId: String) = apply { body.scoringFnId(scoringFnId) }

        fun params(params: Params) = apply { body.params(params) }

        fun params(llmAsJudgeScoringFnParams: Params.LlmAsJudgeScoringFnParams) = apply {
            body.params(llmAsJudgeScoringFnParams)
        }

        fun params(regexParserScoringFnParams: Params.RegexParserScoringFnParams) = apply {
            body.params(regexParserScoringFnParams)
        }

        fun params(basicScoringFnParams: Params.BasicScoringFnParams) = apply {
            body.params(basicScoringFnParams)
        }

        fun providerId(providerId: String) = apply { body.providerId(providerId) }

        fun providerScoringFnId(providerScoringFnId: String) = apply {
            body.providerScoringFnId(providerScoringFnId)
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

        fun build(): ScoringFunctionRegisterParams =
            ScoringFunctionRegisterParams(
                xLlamaStackProviderData,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @JsonDeserialize(using = Params.Deserializer::class)
    @JsonSerialize(using = Params.Serializer::class)
    class Params
    private constructor(
        private val llmAsJudgeScoringFnParams: LlmAsJudgeScoringFnParams? = null,
        private val regexParserScoringFnParams: RegexParserScoringFnParams? = null,
        private val basicScoringFnParams: BasicScoringFnParams? = null,
        private val _json: JsonValue? = null,
    ) {

        fun llmAsJudgeScoringFnParams(): LlmAsJudgeScoringFnParams? = llmAsJudgeScoringFnParams

        fun regexParserScoringFnParams(): RegexParserScoringFnParams? = regexParserScoringFnParams

        fun basicScoringFnParams(): BasicScoringFnParams? = basicScoringFnParams

        fun isLlmAsJudgeScoringFnParams(): Boolean = llmAsJudgeScoringFnParams != null

        fun isRegexParserScoringFnParams(): Boolean = regexParserScoringFnParams != null

        fun isBasicScoringFnParams(): Boolean = basicScoringFnParams != null

        fun asLlmAsJudgeScoringFnParams(): LlmAsJudgeScoringFnParams =
            llmAsJudgeScoringFnParams.getOrThrow("llmAsJudgeScoringFnParams")

        fun asRegexParserScoringFnParams(): RegexParserScoringFnParams =
            regexParserScoringFnParams.getOrThrow("regexParserScoringFnParams")

        fun asBasicScoringFnParams(): BasicScoringFnParams =
            basicScoringFnParams.getOrThrow("basicScoringFnParams")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                llmAsJudgeScoringFnParams != null ->
                    visitor.visitLlmAsJudgeScoringFnParams(llmAsJudgeScoringFnParams)
                regexParserScoringFnParams != null ->
                    visitor.visitRegexParserScoringFnParams(regexParserScoringFnParams)
                basicScoringFnParams != null ->
                    visitor.visitBasicScoringFnParams(basicScoringFnParams)
                else -> visitor.unknown(_json)
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Params && llmAsJudgeScoringFnParams == other.llmAsJudgeScoringFnParams && regexParserScoringFnParams == other.regexParserScoringFnParams && basicScoringFnParams == other.basicScoringFnParams /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(llmAsJudgeScoringFnParams, regexParserScoringFnParams, basicScoringFnParams) /* spotless:on */

        override fun toString(): String =
            when {
                llmAsJudgeScoringFnParams != null ->
                    "Params{llmAsJudgeScoringFnParams=$llmAsJudgeScoringFnParams}"
                regexParserScoringFnParams != null ->
                    "Params{regexParserScoringFnParams=$regexParserScoringFnParams}"
                basicScoringFnParams != null -> "Params{basicScoringFnParams=$basicScoringFnParams}"
                _json != null -> "Params{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Params")
            }

        companion object {

            fun ofLlmAsJudgeScoringFnParams(llmAsJudgeScoringFnParams: LlmAsJudgeScoringFnParams) =
                Params(llmAsJudgeScoringFnParams = llmAsJudgeScoringFnParams)

            fun ofRegexParserScoringFnParams(
                regexParserScoringFnParams: RegexParserScoringFnParams
            ) = Params(regexParserScoringFnParams = regexParserScoringFnParams)

            fun ofBasicScoringFnParams(basicScoringFnParams: BasicScoringFnParams) =
                Params(basicScoringFnParams = basicScoringFnParams)
        }

        interface Visitor<out T> {

            fun visitLlmAsJudgeScoringFnParams(
                llmAsJudgeScoringFnParams: LlmAsJudgeScoringFnParams
            ): T

            fun visitRegexParserScoringFnParams(
                regexParserScoringFnParams: RegexParserScoringFnParams
            ): T

            fun visitBasicScoringFnParams(basicScoringFnParams: BasicScoringFnParams): T

            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown Params: $json")
            }
        }

        class Deserializer : BaseDeserializer<Params>(Params::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Params {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<LlmAsJudgeScoringFnParams>())?.let {
                    return Params(llmAsJudgeScoringFnParams = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<RegexParserScoringFnParams>())?.let {
                    return Params(regexParserScoringFnParams = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<BasicScoringFnParams>())?.let {
                    return Params(basicScoringFnParams = it, _json = json)
                }

                return Params(_json = json)
            }
        }

        class Serializer : BaseSerializer<Params>(Params::class) {

            override fun serialize(
                value: Params,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.llmAsJudgeScoringFnParams != null ->
                        generator.writeObject(value.llmAsJudgeScoringFnParams)
                    value.regexParserScoringFnParams != null ->
                        generator.writeObject(value.regexParserScoringFnParams)
                    value.basicScoringFnParams != null ->
                        generator.writeObject(value.basicScoringFnParams)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Params")
                }
            }
        }

        @NoAutoDetect
        class LlmAsJudgeScoringFnParams
        @JsonCreator
        private constructor(
            @JsonProperty("aggregation_functions")
            private val aggregationFunctions: List<AggregationFunction>?,
            @JsonProperty("judge_model") private val judgeModel: String,
            @JsonProperty("judge_score_regexes") private val judgeScoreRegexes: List<String>?,
            @JsonProperty("prompt_template") private val promptTemplate: String?,
            @JsonProperty("type") private val type: Type,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonProperty("aggregation_functions")
            fun aggregationFunctions(): List<AggregationFunction>? = aggregationFunctions

            @JsonProperty("judge_model") fun judgeModel(): String = judgeModel

            @JsonProperty("judge_score_regexes")
            fun judgeScoreRegexes(): List<String>? = judgeScoreRegexes

            @JsonProperty("prompt_template") fun promptTemplate(): String? = promptTemplate

            @JsonProperty("type") fun type(): Type = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var aggregationFunctions: MutableList<AggregationFunction>? = null
                private var judgeModel: String? = null
                private var judgeScoreRegexes: MutableList<String>? = null
                private var promptTemplate: String? = null
                private var type: Type? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(llmAsJudgeScoringFnParams: LlmAsJudgeScoringFnParams) = apply {
                    aggregationFunctions =
                        llmAsJudgeScoringFnParams.aggregationFunctions?.toMutableList()
                    judgeModel = llmAsJudgeScoringFnParams.judgeModel
                    judgeScoreRegexes = llmAsJudgeScoringFnParams.judgeScoreRegexes?.toMutableList()
                    promptTemplate = llmAsJudgeScoringFnParams.promptTemplate
                    type = llmAsJudgeScoringFnParams.type
                    additionalProperties =
                        llmAsJudgeScoringFnParams.additionalProperties.toMutableMap()
                }

                fun aggregationFunctions(aggregationFunctions: List<AggregationFunction>) = apply {
                    this.aggregationFunctions = aggregationFunctions.toMutableList()
                }

                fun addAggregationFunction(aggregationFunction: AggregationFunction) = apply {
                    aggregationFunctions =
                        (aggregationFunctions ?: mutableListOf()).apply { add(aggregationFunction) }
                }

                fun judgeModel(judgeModel: String) = apply { this.judgeModel = judgeModel }

                fun judgeScoreRegexes(judgeScoreRegexes: List<String>) = apply {
                    this.judgeScoreRegexes = judgeScoreRegexes.toMutableList()
                }

                fun addJudgeScoreRegex(judgeScoreRegex: String) = apply {
                    judgeScoreRegexes =
                        (judgeScoreRegexes ?: mutableListOf()).apply { add(judgeScoreRegex) }
                }

                fun promptTemplate(promptTemplate: String) = apply {
                    this.promptTemplate = promptTemplate
                }

                fun type(type: Type) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): LlmAsJudgeScoringFnParams =
                    LlmAsJudgeScoringFnParams(
                        aggregationFunctions?.toImmutable(),
                        checkNotNull(judgeModel) { "`judgeModel` is required but was not set" },
                        judgeScoreRegexes?.toImmutable(),
                        promptTemplate,
                        checkNotNull(type) { "`type` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val LLM_AS_JUDGE = of("llm_as_judge")

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    LLM_AS_JUDGE,
                }

                enum class Value {
                    LLM_AS_JUDGE,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        LLM_AS_JUDGE -> Value.LLM_AS_JUDGE
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        LLM_AS_JUDGE -> Known.LLM_AS_JUDGE
                        else -> throw LlamaStackClientInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class AggregationFunction
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val AVERAGE = of("average")

                    val MEDIAN = of("median")

                    val CATEGORICAL_COUNT = of("categorical_count")

                    val ACCURACY = of("accuracy")

                    fun of(value: String) = AggregationFunction(JsonField.of(value))
                }

                enum class Known {
                    AVERAGE,
                    MEDIAN,
                    CATEGORICAL_COUNT,
                    ACCURACY,
                }

                enum class Value {
                    AVERAGE,
                    MEDIAN,
                    CATEGORICAL_COUNT,
                    ACCURACY,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        AVERAGE -> Value.AVERAGE
                        MEDIAN -> Value.MEDIAN
                        CATEGORICAL_COUNT -> Value.CATEGORICAL_COUNT
                        ACCURACY -> Value.ACCURACY
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        AVERAGE -> Known.AVERAGE
                        MEDIAN -> Known.MEDIAN
                        CATEGORICAL_COUNT -> Known.CATEGORICAL_COUNT
                        ACCURACY -> Known.ACCURACY
                        else ->
                            throw LlamaStackClientInvalidDataException(
                                "Unknown AggregationFunction: $value"
                            )
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is AggregationFunction && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is LlmAsJudgeScoringFnParams && aggregationFunctions == other.aggregationFunctions && judgeModel == other.judgeModel && judgeScoreRegexes == other.judgeScoreRegexes && promptTemplate == other.promptTemplate && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(aggregationFunctions, judgeModel, judgeScoreRegexes, promptTemplate, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LlmAsJudgeScoringFnParams{aggregationFunctions=$aggregationFunctions, judgeModel=$judgeModel, judgeScoreRegexes=$judgeScoreRegexes, promptTemplate=$promptTemplate, type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class RegexParserScoringFnParams
        @JsonCreator
        private constructor(
            @JsonProperty("aggregation_functions")
            private val aggregationFunctions: List<AggregationFunction>?,
            @JsonProperty("parsing_regexes") private val parsingRegexes: List<String>?,
            @JsonProperty("type") private val type: Type,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonProperty("aggregation_functions")
            fun aggregationFunctions(): List<AggregationFunction>? = aggregationFunctions

            @JsonProperty("parsing_regexes") fun parsingRegexes(): List<String>? = parsingRegexes

            @JsonProperty("type") fun type(): Type = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var aggregationFunctions: MutableList<AggregationFunction>? = null
                private var parsingRegexes: MutableList<String>? = null
                private var type: Type? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(regexParserScoringFnParams: RegexParserScoringFnParams) = apply {
                    aggregationFunctions =
                        regexParserScoringFnParams.aggregationFunctions?.toMutableList()
                    parsingRegexes = regexParserScoringFnParams.parsingRegexes?.toMutableList()
                    type = regexParserScoringFnParams.type
                    additionalProperties =
                        regexParserScoringFnParams.additionalProperties.toMutableMap()
                }

                fun aggregationFunctions(aggregationFunctions: List<AggregationFunction>) = apply {
                    this.aggregationFunctions = aggregationFunctions.toMutableList()
                }

                fun addAggregationFunction(aggregationFunction: AggregationFunction) = apply {
                    aggregationFunctions =
                        (aggregationFunctions ?: mutableListOf()).apply { add(aggregationFunction) }
                }

                fun parsingRegexes(parsingRegexes: List<String>) = apply {
                    this.parsingRegexes = parsingRegexes.toMutableList()
                }

                fun addParsingRegex(parsingRegex: String) = apply {
                    parsingRegexes = (parsingRegexes ?: mutableListOf()).apply { add(parsingRegex) }
                }

                fun type(type: Type) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): RegexParserScoringFnParams =
                    RegexParserScoringFnParams(
                        aggregationFunctions?.toImmutable(),
                        parsingRegexes?.toImmutable(),
                        checkNotNull(type) { "`type` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val REGEX_PARSER = of("regex_parser")

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    REGEX_PARSER,
                }

                enum class Value {
                    REGEX_PARSER,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        REGEX_PARSER -> Value.REGEX_PARSER
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        REGEX_PARSER -> Known.REGEX_PARSER
                        else -> throw LlamaStackClientInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class AggregationFunction
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val AVERAGE = of("average")

                    val MEDIAN = of("median")

                    val CATEGORICAL_COUNT = of("categorical_count")

                    val ACCURACY = of("accuracy")

                    fun of(value: String) = AggregationFunction(JsonField.of(value))
                }

                enum class Known {
                    AVERAGE,
                    MEDIAN,
                    CATEGORICAL_COUNT,
                    ACCURACY,
                }

                enum class Value {
                    AVERAGE,
                    MEDIAN,
                    CATEGORICAL_COUNT,
                    ACCURACY,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        AVERAGE -> Value.AVERAGE
                        MEDIAN -> Value.MEDIAN
                        CATEGORICAL_COUNT -> Value.CATEGORICAL_COUNT
                        ACCURACY -> Value.ACCURACY
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        AVERAGE -> Known.AVERAGE
                        MEDIAN -> Known.MEDIAN
                        CATEGORICAL_COUNT -> Known.CATEGORICAL_COUNT
                        ACCURACY -> Known.ACCURACY
                        else ->
                            throw LlamaStackClientInvalidDataException(
                                "Unknown AggregationFunction: $value"
                            )
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is AggregationFunction && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RegexParserScoringFnParams && aggregationFunctions == other.aggregationFunctions && parsingRegexes == other.parsingRegexes && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(aggregationFunctions, parsingRegexes, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RegexParserScoringFnParams{aggregationFunctions=$aggregationFunctions, parsingRegexes=$parsingRegexes, type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class BasicScoringFnParams
        @JsonCreator
        private constructor(
            @JsonProperty("aggregation_functions")
            private val aggregationFunctions: List<AggregationFunction>?,
            @JsonProperty("type") private val type: Type,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonProperty("aggregation_functions")
            fun aggregationFunctions(): List<AggregationFunction>? = aggregationFunctions

            @JsonProperty("type") fun type(): Type = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var aggregationFunctions: MutableList<AggregationFunction>? = null
                private var type: Type? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(basicScoringFnParams: BasicScoringFnParams) = apply {
                    aggregationFunctions =
                        basicScoringFnParams.aggregationFunctions?.toMutableList()
                    type = basicScoringFnParams.type
                    additionalProperties = basicScoringFnParams.additionalProperties.toMutableMap()
                }

                fun aggregationFunctions(aggregationFunctions: List<AggregationFunction>) = apply {
                    this.aggregationFunctions = aggregationFunctions.toMutableList()
                }

                fun addAggregationFunction(aggregationFunction: AggregationFunction) = apply {
                    aggregationFunctions =
                        (aggregationFunctions ?: mutableListOf()).apply { add(aggregationFunction) }
                }

                fun type(type: Type) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): BasicScoringFnParams =
                    BasicScoringFnParams(
                        aggregationFunctions?.toImmutable(),
                        checkNotNull(type) { "`type` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val BASIC = of("basic")

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    BASIC,
                }

                enum class Value {
                    BASIC,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        BASIC -> Value.BASIC
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        BASIC -> Known.BASIC
                        else -> throw LlamaStackClientInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class AggregationFunction
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val AVERAGE = of("average")

                    val MEDIAN = of("median")

                    val CATEGORICAL_COUNT = of("categorical_count")

                    val ACCURACY = of("accuracy")

                    fun of(value: String) = AggregationFunction(JsonField.of(value))
                }

                enum class Known {
                    AVERAGE,
                    MEDIAN,
                    CATEGORICAL_COUNT,
                    ACCURACY,
                }

                enum class Value {
                    AVERAGE,
                    MEDIAN,
                    CATEGORICAL_COUNT,
                    ACCURACY,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        AVERAGE -> Value.AVERAGE
                        MEDIAN -> Value.MEDIAN
                        CATEGORICAL_COUNT -> Value.CATEGORICAL_COUNT
                        ACCURACY -> Value.ACCURACY
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        AVERAGE -> Known.AVERAGE
                        MEDIAN -> Known.MEDIAN
                        CATEGORICAL_COUNT -> Known.CATEGORICAL_COUNT
                        ACCURACY -> Known.ACCURACY
                        else ->
                            throw LlamaStackClientInvalidDataException(
                                "Unknown AggregationFunction: $value"
                            )
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is AggregationFunction && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BasicScoringFnParams && aggregationFunctions == other.aggregationFunctions && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(aggregationFunctions, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BasicScoringFnParams{aggregationFunctions=$aggregationFunctions, type=$type, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ScoringFunctionRegisterParams && xLlamaStackProviderData == other.xLlamaStackProviderData && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(xLlamaStackProviderData, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ScoringFunctionRegisterParams{xLlamaStackProviderData=$xLlamaStackProviderData, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
