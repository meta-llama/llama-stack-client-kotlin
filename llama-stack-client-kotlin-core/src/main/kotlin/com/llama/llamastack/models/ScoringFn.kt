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
import com.llama.llamastack.core.JsonMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

@NoAutoDetect
class ScoringFn
@JsonCreator
private constructor(
    @JsonProperty("identifier")
    @ExcludeMissing
    private val identifier: JsonField<String> = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("provider_id")
    @ExcludeMissing
    private val providerId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("provider_resource_id")
    @ExcludeMissing
    private val providerResourceId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("return_type")
    @ExcludeMissing
    private val returnType: JsonField<ReturnType> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("params")
    @ExcludeMissing
    private val params: JsonField<Params> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun identifier(): String = identifier.getRequired("identifier")

    fun metadata(): Metadata = metadata.getRequired("metadata")

    fun providerId(): String = providerId.getRequired("provider_id")

    fun providerResourceId(): String = providerResourceId.getRequired("provider_resource_id")

    fun returnType(): ReturnType = returnType.getRequired("return_type")

    fun type(): Type = type.getRequired("type")

    fun description(): String? = description.getNullable("description")

    fun params(): Params? = params.getNullable("params")

    @JsonProperty("identifier") @ExcludeMissing fun _identifier(): JsonField<String> = identifier

    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    @JsonProperty("provider_id") @ExcludeMissing fun _providerId(): JsonField<String> = providerId

    @JsonProperty("provider_resource_id")
    @ExcludeMissing
    fun _providerResourceId(): JsonField<String> = providerResourceId

    @JsonProperty("return_type")
    @ExcludeMissing
    fun _returnType(): JsonField<ReturnType> = returnType

    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    @JsonProperty("params") @ExcludeMissing fun _params(): JsonField<Params> = params

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ScoringFn = apply {
        if (validated) {
            return@apply
        }

        identifier()
        metadata().validate()
        providerId()
        providerResourceId()
        returnType().validate()
        type()
        description()
        params()?.validate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var identifier: JsonField<String>? = null
        private var metadata: JsonField<Metadata>? = null
        private var providerId: JsonField<String>? = null
        private var providerResourceId: JsonField<String>? = null
        private var returnType: JsonField<ReturnType>? = null
        private var type: JsonField<Type>? = null
        private var description: JsonField<String> = JsonMissing.of()
        private var params: JsonField<Params> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(scoringFn: ScoringFn) = apply {
            identifier = scoringFn.identifier
            metadata = scoringFn.metadata
            providerId = scoringFn.providerId
            providerResourceId = scoringFn.providerResourceId
            returnType = scoringFn.returnType
            type = scoringFn.type
            description = scoringFn.description
            params = scoringFn.params
            additionalProperties = scoringFn.additionalProperties.toMutableMap()
        }

        fun identifier(identifier: String) = identifier(JsonField.of(identifier))

        fun identifier(identifier: JsonField<String>) = apply { this.identifier = identifier }

        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        fun providerId(providerId: String) = providerId(JsonField.of(providerId))

        fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

        fun providerResourceId(providerResourceId: String) =
            providerResourceId(JsonField.of(providerResourceId))

        fun providerResourceId(providerResourceId: JsonField<String>) = apply {
            this.providerResourceId = providerResourceId
        }

        fun returnType(returnType: ReturnType) = returnType(JsonField.of(returnType))

        fun returnType(returnType: JsonField<ReturnType>) = apply { this.returnType = returnType }

        fun type(type: Type) = type(JsonField.of(type))

        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun description(description: String) = description(JsonField.of(description))

        fun description(description: JsonField<String>) = apply { this.description = description }

        fun params(params: Params) = params(JsonField.of(params))

        fun params(params: JsonField<Params>) = apply { this.params = params }

        fun params(llmAsJudgeScoringFnParams: Params.LlmAsJudgeScoringFnParams) =
            params(Params.ofLlmAsJudgeScoringFnParams(llmAsJudgeScoringFnParams))

        fun params(regexParserScoringFnParams: Params.RegexParserScoringFnParams) =
            params(Params.ofRegexParserScoringFnParams(regexParserScoringFnParams))

        fun params(basicScoringFnParams: Params.BasicScoringFnParams) =
            params(Params.ofBasicScoringFnParams(basicScoringFnParams))

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

        fun build(): ScoringFn =
            ScoringFn(
                checkRequired("identifier", identifier),
                checkRequired("metadata", metadata),
                checkRequired("providerId", providerId),
                checkRequired("providerResourceId", providerResourceId),
                checkRequired("returnType", returnType),
                checkRequired("type", type),
                description,
                params,
                additionalProperties.toImmutable(),
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

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val SCORING_FUNCTION = of("scoring_function")

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            SCORING_FUNCTION,
        }

        enum class Value {
            SCORING_FUNCTION,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                SCORING_FUNCTION -> Value.SCORING_FUNCTION
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                SCORING_FUNCTION -> Known.SCORING_FUNCTION
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

        private var validated: Boolean = false

        fun validate(): Params = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitLlmAsJudgeScoringFnParams(
                        llmAsJudgeScoringFnParams: LlmAsJudgeScoringFnParams
                    ) {
                        llmAsJudgeScoringFnParams.validate()
                    }

                    override fun visitRegexParserScoringFnParams(
                        regexParserScoringFnParams: RegexParserScoringFnParams
                    ) {
                        regexParserScoringFnParams.validate()
                    }

                    override fun visitBasicScoringFnParams(
                        basicScoringFnParams: BasicScoringFnParams
                    ) {
                        basicScoringFnParams.validate()
                    }
                }
            )
            validated = true
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

                tryDeserialize(node, jacksonTypeRef<LlmAsJudgeScoringFnParams>()) { it.validate() }
                    ?.let {
                        return Params(llmAsJudgeScoringFnParams = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<RegexParserScoringFnParams>()) { it.validate() }
                    ?.let {
                        return Params(regexParserScoringFnParams = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<BasicScoringFnParams>()) { it.validate() }
                    ?.let {
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
            @JsonProperty("judge_model")
            @ExcludeMissing
            private val judgeModel: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("aggregation_functions")
            @ExcludeMissing
            private val aggregationFunctions: JsonField<List<AggregationFunction>> =
                JsonMissing.of(),
            @JsonProperty("judge_score_regexes")
            @ExcludeMissing
            private val judgeScoreRegexes: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("prompt_template")
            @ExcludeMissing
            private val promptTemplate: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun judgeModel(): String = judgeModel.getRequired("judge_model")

            fun type(): Type = type.getRequired("type")

            fun aggregationFunctions(): List<AggregationFunction>? =
                aggregationFunctions.getNullable("aggregation_functions")

            fun judgeScoreRegexes(): List<String>? =
                judgeScoreRegexes.getNullable("judge_score_regexes")

            fun promptTemplate(): String? = promptTemplate.getNullable("prompt_template")

            @JsonProperty("judge_model")
            @ExcludeMissing
            fun _judgeModel(): JsonField<String> = judgeModel

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonProperty("aggregation_functions")
            @ExcludeMissing
            fun _aggregationFunctions(): JsonField<List<AggregationFunction>> = aggregationFunctions

            @JsonProperty("judge_score_regexes")
            @ExcludeMissing
            fun _judgeScoreRegexes(): JsonField<List<String>> = judgeScoreRegexes

            @JsonProperty("prompt_template")
            @ExcludeMissing
            fun _promptTemplate(): JsonField<String> = promptTemplate

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): LlmAsJudgeScoringFnParams = apply {
                if (validated) {
                    return@apply
                }

                judgeModel()
                type()
                aggregationFunctions()
                judgeScoreRegexes()
                promptTemplate()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var judgeModel: JsonField<String>? = null
                private var type: JsonField<Type>? = null
                private var aggregationFunctions: JsonField<MutableList<AggregationFunction>>? =
                    null
                private var judgeScoreRegexes: JsonField<MutableList<String>>? = null
                private var promptTemplate: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(llmAsJudgeScoringFnParams: LlmAsJudgeScoringFnParams) = apply {
                    judgeModel = llmAsJudgeScoringFnParams.judgeModel
                    type = llmAsJudgeScoringFnParams.type
                    aggregationFunctions =
                        llmAsJudgeScoringFnParams.aggregationFunctions.map { it.toMutableList() }
                    judgeScoreRegexes =
                        llmAsJudgeScoringFnParams.judgeScoreRegexes.map { it.toMutableList() }
                    promptTemplate = llmAsJudgeScoringFnParams.promptTemplate
                    additionalProperties =
                        llmAsJudgeScoringFnParams.additionalProperties.toMutableMap()
                }

                fun judgeModel(judgeModel: String) = judgeModel(JsonField.of(judgeModel))

                fun judgeModel(judgeModel: JsonField<String>) = apply {
                    this.judgeModel = judgeModel
                }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun aggregationFunctions(aggregationFunctions: List<AggregationFunction>) =
                    aggregationFunctions(JsonField.of(aggregationFunctions))

                fun aggregationFunctions(
                    aggregationFunctions: JsonField<List<AggregationFunction>>
                ) = apply {
                    this.aggregationFunctions = aggregationFunctions.map { it.toMutableList() }
                }

                fun addAggregationFunction(aggregationFunction: AggregationFunction) = apply {
                    aggregationFunctions =
                        (aggregationFunctions ?: JsonField.of(mutableListOf())).apply {
                            (asKnown()
                                    ?: throw IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    ))
                                .add(aggregationFunction)
                        }
                }

                fun judgeScoreRegexes(judgeScoreRegexes: List<String>) =
                    judgeScoreRegexes(JsonField.of(judgeScoreRegexes))

                fun judgeScoreRegexes(judgeScoreRegexes: JsonField<List<String>>) = apply {
                    this.judgeScoreRegexes = judgeScoreRegexes.map { it.toMutableList() }
                }

                fun addJudgeScoreRegex(judgeScoreRegex: String) = apply {
                    judgeScoreRegexes =
                        (judgeScoreRegexes ?: JsonField.of(mutableListOf())).apply {
                            (asKnown()
                                    ?: throw IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    ))
                                .add(judgeScoreRegex)
                        }
                }

                fun promptTemplate(promptTemplate: String) =
                    promptTemplate(JsonField.of(promptTemplate))

                fun promptTemplate(promptTemplate: JsonField<String>) = apply {
                    this.promptTemplate = promptTemplate
                }

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
                        checkRequired("judgeModel", judgeModel),
                        checkRequired("type", type),
                        (aggregationFunctions ?: JsonMissing.of()).map { it.toImmutable() },
                        (judgeScoreRegexes ?: JsonMissing.of()).map { it.toImmutable() },
                        promptTemplate,
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

                return /* spotless:off */ other is LlmAsJudgeScoringFnParams && judgeModel == other.judgeModel && type == other.type && aggregationFunctions == other.aggregationFunctions && judgeScoreRegexes == other.judgeScoreRegexes && promptTemplate == other.promptTemplate && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(judgeModel, type, aggregationFunctions, judgeScoreRegexes, promptTemplate, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LlmAsJudgeScoringFnParams{judgeModel=$judgeModel, type=$type, aggregationFunctions=$aggregationFunctions, judgeScoreRegexes=$judgeScoreRegexes, promptTemplate=$promptTemplate, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class RegexParserScoringFnParams
        @JsonCreator
        private constructor(
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("aggregation_functions")
            @ExcludeMissing
            private val aggregationFunctions: JsonField<List<AggregationFunction>> =
                JsonMissing.of(),
            @JsonProperty("parsing_regexes")
            @ExcludeMissing
            private val parsingRegexes: JsonField<List<String>> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun type(): Type = type.getRequired("type")

            fun aggregationFunctions(): List<AggregationFunction>? =
                aggregationFunctions.getNullable("aggregation_functions")

            fun parsingRegexes(): List<String>? = parsingRegexes.getNullable("parsing_regexes")

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonProperty("aggregation_functions")
            @ExcludeMissing
            fun _aggregationFunctions(): JsonField<List<AggregationFunction>> = aggregationFunctions

            @JsonProperty("parsing_regexes")
            @ExcludeMissing
            fun _parsingRegexes(): JsonField<List<String>> = parsingRegexes

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): RegexParserScoringFnParams = apply {
                if (validated) {
                    return@apply
                }

                type()
                aggregationFunctions()
                parsingRegexes()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var type: JsonField<Type>? = null
                private var aggregationFunctions: JsonField<MutableList<AggregationFunction>>? =
                    null
                private var parsingRegexes: JsonField<MutableList<String>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(regexParserScoringFnParams: RegexParserScoringFnParams) = apply {
                    type = regexParserScoringFnParams.type
                    aggregationFunctions =
                        regexParserScoringFnParams.aggregationFunctions.map { it.toMutableList() }
                    parsingRegexes =
                        regexParserScoringFnParams.parsingRegexes.map { it.toMutableList() }
                    additionalProperties =
                        regexParserScoringFnParams.additionalProperties.toMutableMap()
                }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun aggregationFunctions(aggregationFunctions: List<AggregationFunction>) =
                    aggregationFunctions(JsonField.of(aggregationFunctions))

                fun aggregationFunctions(
                    aggregationFunctions: JsonField<List<AggregationFunction>>
                ) = apply {
                    this.aggregationFunctions = aggregationFunctions.map { it.toMutableList() }
                }

                fun addAggregationFunction(aggregationFunction: AggregationFunction) = apply {
                    aggregationFunctions =
                        (aggregationFunctions ?: JsonField.of(mutableListOf())).apply {
                            (asKnown()
                                    ?: throw IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    ))
                                .add(aggregationFunction)
                        }
                }

                fun parsingRegexes(parsingRegexes: List<String>) =
                    parsingRegexes(JsonField.of(parsingRegexes))

                fun parsingRegexes(parsingRegexes: JsonField<List<String>>) = apply {
                    this.parsingRegexes = parsingRegexes.map { it.toMutableList() }
                }

                fun addParsingRegex(parsingRegex: String) = apply {
                    parsingRegexes =
                        (parsingRegexes ?: JsonField.of(mutableListOf())).apply {
                            (asKnown()
                                    ?: throw IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    ))
                                .add(parsingRegex)
                        }
                }

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
                        checkRequired("type", type),
                        (aggregationFunctions ?: JsonMissing.of()).map { it.toImmutable() },
                        (parsingRegexes ?: JsonMissing.of()).map { it.toImmutable() },
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

                return /* spotless:off */ other is RegexParserScoringFnParams && type == other.type && aggregationFunctions == other.aggregationFunctions && parsingRegexes == other.parsingRegexes && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(type, aggregationFunctions, parsingRegexes, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RegexParserScoringFnParams{type=$type, aggregationFunctions=$aggregationFunctions, parsingRegexes=$parsingRegexes, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class BasicScoringFnParams
        @JsonCreator
        private constructor(
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("aggregation_functions")
            @ExcludeMissing
            private val aggregationFunctions: JsonField<List<AggregationFunction>> =
                JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun type(): Type = type.getRequired("type")

            fun aggregationFunctions(): List<AggregationFunction>? =
                aggregationFunctions.getNullable("aggregation_functions")

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonProperty("aggregation_functions")
            @ExcludeMissing
            fun _aggregationFunctions(): JsonField<List<AggregationFunction>> = aggregationFunctions

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): BasicScoringFnParams = apply {
                if (validated) {
                    return@apply
                }

                type()
                aggregationFunctions()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var type: JsonField<Type>? = null
                private var aggregationFunctions: JsonField<MutableList<AggregationFunction>>? =
                    null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(basicScoringFnParams: BasicScoringFnParams) = apply {
                    type = basicScoringFnParams.type
                    aggregationFunctions =
                        basicScoringFnParams.aggregationFunctions.map { it.toMutableList() }
                    additionalProperties = basicScoringFnParams.additionalProperties.toMutableMap()
                }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun aggregationFunctions(aggregationFunctions: List<AggregationFunction>) =
                    aggregationFunctions(JsonField.of(aggregationFunctions))

                fun aggregationFunctions(
                    aggregationFunctions: JsonField<List<AggregationFunction>>
                ) = apply {
                    this.aggregationFunctions = aggregationFunctions.map { it.toMutableList() }
                }

                fun addAggregationFunction(aggregationFunction: AggregationFunction) = apply {
                    aggregationFunctions =
                        (aggregationFunctions ?: JsonField.of(mutableListOf())).apply {
                            (asKnown()
                                    ?: throw IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    ))
                                .add(aggregationFunction)
                        }
                }

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
                        checkRequired("type", type),
                        (aggregationFunctions ?: JsonMissing.of()).map { it.toImmutable() },
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

                return /* spotless:off */ other is BasicScoringFnParams && type == other.type && aggregationFunctions == other.aggregationFunctions && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(type, aggregationFunctions, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BasicScoringFnParams{type=$type, aggregationFunctions=$aggregationFunctions, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ScoringFn && identifier == other.identifier && metadata == other.metadata && providerId == other.providerId && providerResourceId == other.providerResourceId && returnType == other.returnType && type == other.type && description == other.description && params == other.params && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(identifier, metadata, providerId, providerResourceId, returnType, type, description, params, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ScoringFn{identifier=$identifier, metadata=$metadata, providerId=$providerId, providerResourceId=$providerResourceId, returnType=$returnType, type=$type, description=$description, params=$params, additionalProperties=$additionalProperties}"
}
