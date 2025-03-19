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
import com.llama.llamastack.core.checkKnown
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

@JsonDeserialize(using = ScoringFnParams.Deserializer::class)
@JsonSerialize(using = ScoringFnParams.Serializer::class)
class ScoringFnParams
private constructor(
    private val llmAsJudge: LlmAsJudgeScoringFnParams? = null,
    private val regexParser: RegexParserScoringFnParams? = null,
    private val basic: BasicScoringFnParams? = null,
    private val _json: JsonValue? = null,
) {

    fun llmAsJudge(): LlmAsJudgeScoringFnParams? = llmAsJudge

    fun regexParser(): RegexParserScoringFnParams? = regexParser

    fun basic(): BasicScoringFnParams? = basic

    fun isLlmAsJudge(): Boolean = llmAsJudge != null

    fun isRegexParser(): Boolean = regexParser != null

    fun isBasic(): Boolean = basic != null

    fun asLlmAsJudge(): LlmAsJudgeScoringFnParams = llmAsJudge.getOrThrow("llmAsJudge")

    fun asRegexParser(): RegexParserScoringFnParams = regexParser.getOrThrow("regexParser")

    fun asBasic(): BasicScoringFnParams = basic.getOrThrow("basic")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            llmAsJudge != null -> visitor.visitLlmAsJudge(llmAsJudge)
            regexParser != null -> visitor.visitRegexParser(regexParser)
            basic != null -> visitor.visitBasic(basic)
            else -> visitor.unknown(_json)
        }
    }

    private var validated: Boolean = false

    fun validate(): ScoringFnParams = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitLlmAsJudge(llmAsJudge: LlmAsJudgeScoringFnParams) {
                    llmAsJudge.validate()
                }

                override fun visitRegexParser(regexParser: RegexParserScoringFnParams) {
                    regexParser.validate()
                }

                override fun visitBasic(basic: BasicScoringFnParams) {
                    basic.validate()
                }
            }
        )
        validated = true
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ScoringFnParams && llmAsJudge == other.llmAsJudge && regexParser == other.regexParser && basic == other.basic /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(llmAsJudge, regexParser, basic) /* spotless:on */

    override fun toString(): String =
        when {
            llmAsJudge != null -> "ScoringFnParams{llmAsJudge=$llmAsJudge}"
            regexParser != null -> "ScoringFnParams{regexParser=$regexParser}"
            basic != null -> "ScoringFnParams{basic=$basic}"
            _json != null -> "ScoringFnParams{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid ScoringFnParams")
        }

    companion object {

        fun ofLlmAsJudge(llmAsJudge: LlmAsJudgeScoringFnParams) =
            ScoringFnParams(llmAsJudge = llmAsJudge)

        fun ofRegexParser(regexParser: RegexParserScoringFnParams) =
            ScoringFnParams(regexParser = regexParser)

        fun ofBasic(basic: BasicScoringFnParams) = ScoringFnParams(basic = basic)
    }

    /**
     * An interface that defines how to map each variant of [ScoringFnParams] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        fun visitLlmAsJudge(llmAsJudge: LlmAsJudgeScoringFnParams): T

        fun visitRegexParser(regexParser: RegexParserScoringFnParams): T

        fun visitBasic(basic: BasicScoringFnParams): T

        /**
         * Maps an unknown variant of [ScoringFnParams] to a value of type [T].
         *
         * An instance of [ScoringFnParams] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws LlamaStackClientInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LlamaStackClientInvalidDataException("Unknown ScoringFnParams: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<ScoringFnParams>(ScoringFnParams::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): ScoringFnParams {
            val json = JsonValue.fromJsonNode(node)
            val type = json.asObject()?.get("type")?.asString()

            when (type) {
                "llm_as_judge" -> {
                    tryDeserialize(node, jacksonTypeRef<LlmAsJudgeScoringFnParams>()) {
                            it.validate()
                        }
                        ?.let {
                            return ScoringFnParams(llmAsJudge = it, _json = json)
                        }
                }
                "regex_parser" -> {
                    tryDeserialize(node, jacksonTypeRef<RegexParserScoringFnParams>()) {
                            it.validate()
                        }
                        ?.let {
                            return ScoringFnParams(regexParser = it, _json = json)
                        }
                }
                "basic" -> {
                    tryDeserialize(node, jacksonTypeRef<BasicScoringFnParams>()) { it.validate() }
                        ?.let {
                            return ScoringFnParams(basic = it, _json = json)
                        }
                }
            }

            return ScoringFnParams(_json = json)
        }
    }

    internal class Serializer : BaseSerializer<ScoringFnParams>(ScoringFnParams::class) {

        override fun serialize(
            value: ScoringFnParams,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.llmAsJudge != null -> generator.writeObject(value.llmAsJudge)
                value.regexParser != null -> generator.writeObject(value.regexParser)
                value.basic != null -> generator.writeObject(value.basic)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid ScoringFnParams")
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
        @JsonProperty("type") @ExcludeMissing private val type: JsonValue = JsonMissing.of(),
        @JsonProperty("aggregation_functions")
        @ExcludeMissing
        private val aggregationFunctions: JsonField<List<AggregationFunction>> = JsonMissing.of(),
        @JsonProperty("judge_score_regexes")
        @ExcludeMissing
        private val judgeScoreRegexes: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("prompt_template")
        @ExcludeMissing
        private val promptTemplate: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun judgeModel(): String = judgeModel.getRequired("judge_model")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("llm_as_judge")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun aggregationFunctions(): List<AggregationFunction>? =
            aggregationFunctions.getNullable("aggregation_functions")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun judgeScoreRegexes(): List<String>? =
            judgeScoreRegexes.getNullable("judge_score_regexes")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun promptTemplate(): String? = promptTemplate.getNullable("prompt_template")

        /**
         * Returns the raw JSON value of [judgeModel].
         *
         * Unlike [judgeModel], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("judge_model")
        @ExcludeMissing
        fun _judgeModel(): JsonField<String> = judgeModel

        /**
         * Returns the raw JSON value of [aggregationFunctions].
         *
         * Unlike [aggregationFunctions], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("aggregation_functions")
        @ExcludeMissing
        fun _aggregationFunctions(): JsonField<List<AggregationFunction>> = aggregationFunctions

        /**
         * Returns the raw JSON value of [judgeScoreRegexes].
         *
         * Unlike [judgeScoreRegexes], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("judge_score_regexes")
        @ExcludeMissing
        fun _judgeScoreRegexes(): JsonField<List<String>> = judgeScoreRegexes

        /**
         * Returns the raw JSON value of [promptTemplate].
         *
         * Unlike [promptTemplate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
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
            _type().let {
                if (it != JsonValue.from("llm_as_judge")) {
                    throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
                }
            }
            aggregationFunctions()
            judgeScoreRegexes()
            promptTemplate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [LlmAsJudgeScoringFnParams].
             *
             * The following fields are required:
             * ```kotlin
             * .judgeModel()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [LlmAsJudgeScoringFnParams]. */
        class Builder internal constructor() {

            private var judgeModel: JsonField<String>? = null
            private var type: JsonValue = JsonValue.from("llm_as_judge")
            private var aggregationFunctions: JsonField<MutableList<AggregationFunction>>? = null
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
                additionalProperties = llmAsJudgeScoringFnParams.additionalProperties.toMutableMap()
            }

            fun judgeModel(judgeModel: String) = judgeModel(JsonField.of(judgeModel))

            /**
             * Sets [Builder.judgeModel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.judgeModel] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun judgeModel(judgeModel: JsonField<String>) = apply { this.judgeModel = judgeModel }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("llm_as_judge")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonValue) = apply { this.type = type }

            fun aggregationFunctions(aggregationFunctions: List<AggregationFunction>) =
                aggregationFunctions(JsonField.of(aggregationFunctions))

            /**
             * Sets [Builder.aggregationFunctions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.aggregationFunctions] with a well-typed
             * `List<AggregationFunction>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun aggregationFunctions(aggregationFunctions: JsonField<List<AggregationFunction>>) =
                apply {
                    this.aggregationFunctions = aggregationFunctions.map { it.toMutableList() }
                }

            /**
             * Adds a single [AggregationFunction] to [aggregationFunctions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAggregationFunction(aggregationFunction: AggregationFunction) = apply {
                aggregationFunctions =
                    (aggregationFunctions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("aggregationFunctions", it).add(aggregationFunction)
                    }
            }

            fun judgeScoreRegexes(judgeScoreRegexes: List<String>) =
                judgeScoreRegexes(JsonField.of(judgeScoreRegexes))

            /**
             * Sets [Builder.judgeScoreRegexes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.judgeScoreRegexes] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun judgeScoreRegexes(judgeScoreRegexes: JsonField<List<String>>) = apply {
                this.judgeScoreRegexes = judgeScoreRegexes.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [judgeScoreRegexes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addJudgeScoreRegex(judgeScoreRegex: String) = apply {
                judgeScoreRegexes =
                    (judgeScoreRegexes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("judgeScoreRegexes", it).add(judgeScoreRegex)
                    }
            }

            fun promptTemplate(promptTemplate: String) =
                promptTemplate(JsonField.of(promptTemplate))

            /**
             * Sets [Builder.promptTemplate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.promptTemplate] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): LlmAsJudgeScoringFnParams =
                LlmAsJudgeScoringFnParams(
                    checkRequired("judgeModel", judgeModel),
                    type,
                    (aggregationFunctions ?: JsonMissing.of()).map { it.toImmutable() },
                    (judgeScoreRegexes ?: JsonMissing.of()).map { it.toImmutable() },
                    promptTemplate,
                    additionalProperties.toImmutable(),
                )
        }

        class AggregationFunction
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val AVERAGE = of("average")

                val MEDIAN = of("median")

                val CATEGORICAL_COUNT = of("categorical_count")

                val ACCURACY = of("accuracy")

                fun of(value: String) = AggregationFunction(JsonField.of(value))
            }

            /** An enum containing [AggregationFunction]'s known values. */
            enum class Known {
                AVERAGE,
                MEDIAN,
                CATEGORICAL_COUNT,
                ACCURACY,
            }

            /**
             * An enum containing [AggregationFunction]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [AggregationFunction] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AVERAGE,
                MEDIAN,
                CATEGORICAL_COUNT,
                ACCURACY,
                /**
                 * An enum member indicating that [AggregationFunction] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    AVERAGE -> Value.AVERAGE
                    MEDIAN -> Value.MEDIAN
                    CATEGORICAL_COUNT -> Value.CATEGORICAL_COUNT
                    ACCURACY -> Value.ACCURACY
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LlamaStackClientInvalidDataException if this class instance's value is a not
             *   a known member.
             */
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

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LlamaStackClientInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString()
                    ?: throw LlamaStackClientInvalidDataException("Value is not a String")

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
        @JsonProperty("type") @ExcludeMissing private val type: JsonValue = JsonMissing.of(),
        @JsonProperty("aggregation_functions")
        @ExcludeMissing
        private val aggregationFunctions: JsonField<List<AggregationFunction>> = JsonMissing.of(),
        @JsonProperty("parsing_regexes")
        @ExcludeMissing
        private val parsingRegexes: JsonField<List<String>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("regex_parser")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun aggregationFunctions(): List<AggregationFunction>? =
            aggregationFunctions.getNullable("aggregation_functions")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun parsingRegexes(): List<String>? = parsingRegexes.getNullable("parsing_regexes")

        /**
         * Returns the raw JSON value of [aggregationFunctions].
         *
         * Unlike [aggregationFunctions], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("aggregation_functions")
        @ExcludeMissing
        fun _aggregationFunctions(): JsonField<List<AggregationFunction>> = aggregationFunctions

        /**
         * Returns the raw JSON value of [parsingRegexes].
         *
         * Unlike [parsingRegexes], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
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

            _type().let {
                if (it != JsonValue.from("regex_parser")) {
                    throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
                }
            }
            aggregationFunctions()
            parsingRegexes()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [RegexParserScoringFnParams].
             */
            fun builder() = Builder()
        }

        /** A builder for [RegexParserScoringFnParams]. */
        class Builder internal constructor() {

            private var type: JsonValue = JsonValue.from("regex_parser")
            private var aggregationFunctions: JsonField<MutableList<AggregationFunction>>? = null
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

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("regex_parser")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonValue) = apply { this.type = type }

            fun aggregationFunctions(aggregationFunctions: List<AggregationFunction>) =
                aggregationFunctions(JsonField.of(aggregationFunctions))

            /**
             * Sets [Builder.aggregationFunctions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.aggregationFunctions] with a well-typed
             * `List<AggregationFunction>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun aggregationFunctions(aggregationFunctions: JsonField<List<AggregationFunction>>) =
                apply {
                    this.aggregationFunctions = aggregationFunctions.map { it.toMutableList() }
                }

            /**
             * Adds a single [AggregationFunction] to [aggregationFunctions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAggregationFunction(aggregationFunction: AggregationFunction) = apply {
                aggregationFunctions =
                    (aggregationFunctions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("aggregationFunctions", it).add(aggregationFunction)
                    }
            }

            fun parsingRegexes(parsingRegexes: List<String>) =
                parsingRegexes(JsonField.of(parsingRegexes))

            /**
             * Sets [Builder.parsingRegexes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parsingRegexes] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun parsingRegexes(parsingRegexes: JsonField<List<String>>) = apply {
                this.parsingRegexes = parsingRegexes.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [parsingRegexes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addParsingRegex(parsingRegex: String) = apply {
                parsingRegexes =
                    (parsingRegexes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("parsingRegexes", it).add(parsingRegex)
                    }
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

            fun build(): RegexParserScoringFnParams =
                RegexParserScoringFnParams(
                    type,
                    (aggregationFunctions ?: JsonMissing.of()).map { it.toImmutable() },
                    (parsingRegexes ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        class AggregationFunction
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val AVERAGE = of("average")

                val MEDIAN = of("median")

                val CATEGORICAL_COUNT = of("categorical_count")

                val ACCURACY = of("accuracy")

                fun of(value: String) = AggregationFunction(JsonField.of(value))
            }

            /** An enum containing [AggregationFunction]'s known values. */
            enum class Known {
                AVERAGE,
                MEDIAN,
                CATEGORICAL_COUNT,
                ACCURACY,
            }

            /**
             * An enum containing [AggregationFunction]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [AggregationFunction] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AVERAGE,
                MEDIAN,
                CATEGORICAL_COUNT,
                ACCURACY,
                /**
                 * An enum member indicating that [AggregationFunction] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    AVERAGE -> Value.AVERAGE
                    MEDIAN -> Value.MEDIAN
                    CATEGORICAL_COUNT -> Value.CATEGORICAL_COUNT
                    ACCURACY -> Value.ACCURACY
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LlamaStackClientInvalidDataException if this class instance's value is a not
             *   a known member.
             */
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

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LlamaStackClientInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString()
                    ?: throw LlamaStackClientInvalidDataException("Value is not a String")

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
        @JsonProperty("type") @ExcludeMissing private val type: JsonValue = JsonMissing.of(),
        @JsonProperty("aggregation_functions")
        @ExcludeMissing
        private val aggregationFunctions: JsonField<List<AggregationFunction>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("basic")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun aggregationFunctions(): List<AggregationFunction>? =
            aggregationFunctions.getNullable("aggregation_functions")

        /**
         * Returns the raw JSON value of [aggregationFunctions].
         *
         * Unlike [aggregationFunctions], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
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

            _type().let {
                if (it != JsonValue.from("basic")) {
                    throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
                }
            }
            aggregationFunctions()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [BasicScoringFnParams]. */
            fun builder() = Builder()
        }

        /** A builder for [BasicScoringFnParams]. */
        class Builder internal constructor() {

            private var type: JsonValue = JsonValue.from("basic")
            private var aggregationFunctions: JsonField<MutableList<AggregationFunction>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(basicScoringFnParams: BasicScoringFnParams) = apply {
                type = basicScoringFnParams.type
                aggregationFunctions =
                    basicScoringFnParams.aggregationFunctions.map { it.toMutableList() }
                additionalProperties = basicScoringFnParams.additionalProperties.toMutableMap()
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("basic")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonValue) = apply { this.type = type }

            fun aggregationFunctions(aggregationFunctions: List<AggregationFunction>) =
                aggregationFunctions(JsonField.of(aggregationFunctions))

            /**
             * Sets [Builder.aggregationFunctions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.aggregationFunctions] with a well-typed
             * `List<AggregationFunction>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun aggregationFunctions(aggregationFunctions: JsonField<List<AggregationFunction>>) =
                apply {
                    this.aggregationFunctions = aggregationFunctions.map { it.toMutableList() }
                }

            /**
             * Adds a single [AggregationFunction] to [aggregationFunctions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAggregationFunction(aggregationFunction: AggregationFunction) = apply {
                aggregationFunctions =
                    (aggregationFunctions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("aggregationFunctions", it).add(aggregationFunction)
                    }
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

            fun build(): BasicScoringFnParams =
                BasicScoringFnParams(
                    type,
                    (aggregationFunctions ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        class AggregationFunction
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val AVERAGE = of("average")

                val MEDIAN = of("median")

                val CATEGORICAL_COUNT = of("categorical_count")

                val ACCURACY = of("accuracy")

                fun of(value: String) = AggregationFunction(JsonField.of(value))
            }

            /** An enum containing [AggregationFunction]'s known values. */
            enum class Known {
                AVERAGE,
                MEDIAN,
                CATEGORICAL_COUNT,
                ACCURACY,
            }

            /**
             * An enum containing [AggregationFunction]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [AggregationFunction] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AVERAGE,
                MEDIAN,
                CATEGORICAL_COUNT,
                ACCURACY,
                /**
                 * An enum member indicating that [AggregationFunction] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    AVERAGE -> Value.AVERAGE
                    MEDIAN -> Value.MEDIAN
                    CATEGORICAL_COUNT -> Value.CATEGORICAL_COUNT
                    ACCURACY -> Value.ACCURACY
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LlamaStackClientInvalidDataException if this class instance's value is a not
             *   a known member.
             */
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

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LlamaStackClientInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString()
                    ?: throw LlamaStackClientInvalidDataException("Value is not a String")

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
