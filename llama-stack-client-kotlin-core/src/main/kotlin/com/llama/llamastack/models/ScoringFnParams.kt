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
import com.llama.llamastack.core.checkKnown
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Collections
import java.util.Objects

@JsonDeserialize(using = ScoringFnParams.Deserializer::class)
@JsonSerialize(using = ScoringFnParams.Serializer::class)
class ScoringFnParams
private constructor(
    private val llmAsJudge: LlmAsJudge? = null,
    private val regexParser: RegexParser? = null,
    private val basic: Basic? = null,
    private val _json: JsonValue? = null,
) {

    fun llmAsJudge(): LlmAsJudge? = llmAsJudge

    fun regexParser(): RegexParser? = regexParser

    fun basic(): Basic? = basic

    fun isLlmAsJudge(): Boolean = llmAsJudge != null

    fun isRegexParser(): Boolean = regexParser != null

    fun isBasic(): Boolean = basic != null

    fun asLlmAsJudge(): LlmAsJudge = llmAsJudge.getOrThrow("llmAsJudge")

    fun asRegexParser(): RegexParser = regexParser.getOrThrow("regexParser")

    fun asBasic(): Basic = basic.getOrThrow("basic")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            llmAsJudge != null -> visitor.visitLlmAsJudge(llmAsJudge)
            regexParser != null -> visitor.visitRegexParser(regexParser)
            basic != null -> visitor.visitBasic(basic)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): ScoringFnParams = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitLlmAsJudge(llmAsJudge: LlmAsJudge) {
                    llmAsJudge.validate()
                }

                override fun visitRegexParser(regexParser: RegexParser) {
                    regexParser.validate()
                }

                override fun visitBasic(basic: Basic) {
                    basic.validate()
                }
            }
        )
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LlamaStackClientInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitLlmAsJudge(llmAsJudge: LlmAsJudge) = llmAsJudge.validity()

                override fun visitRegexParser(regexParser: RegexParser) = regexParser.validity()

                override fun visitBasic(basic: Basic) = basic.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

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

        fun ofLlmAsJudge(llmAsJudge: LlmAsJudge) = ScoringFnParams(llmAsJudge = llmAsJudge)

        fun ofRegexParser(regexParser: RegexParser) = ScoringFnParams(regexParser = regexParser)

        fun ofBasic(basic: Basic) = ScoringFnParams(basic = basic)
    }

    /**
     * An interface that defines how to map each variant of [ScoringFnParams] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        fun visitLlmAsJudge(llmAsJudge: LlmAsJudge): T

        fun visitRegexParser(regexParser: RegexParser): T

        fun visitBasic(basic: Basic): T

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
                    return tryDeserialize(node, jacksonTypeRef<LlmAsJudge>())?.let {
                        ScoringFnParams(llmAsJudge = it, _json = json)
                    } ?: ScoringFnParams(_json = json)
                }
                "regex_parser" -> {
                    return tryDeserialize(node, jacksonTypeRef<RegexParser>())?.let {
                        ScoringFnParams(regexParser = it, _json = json)
                    } ?: ScoringFnParams(_json = json)
                }
                "basic" -> {
                    return tryDeserialize(node, jacksonTypeRef<Basic>())?.let {
                        ScoringFnParams(basic = it, _json = json)
                    } ?: ScoringFnParams(_json = json)
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

    class LlmAsJudge
    private constructor(
        private val aggregationFunctions: JsonField<List<AggregationFunction>>,
        private val judgeModel: JsonField<String>,
        private val judgeScoreRegexes: JsonField<List<String>>,
        private val type: JsonValue,
        private val promptTemplate: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("aggregation_functions")
            @ExcludeMissing
            aggregationFunctions: JsonField<List<AggregationFunction>> = JsonMissing.of(),
            @JsonProperty("judge_model")
            @ExcludeMissing
            judgeModel: JsonField<String> = JsonMissing.of(),
            @JsonProperty("judge_score_regexes")
            @ExcludeMissing
            judgeScoreRegexes: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
            @JsonProperty("prompt_template")
            @ExcludeMissing
            promptTemplate: JsonField<String> = JsonMissing.of(),
        ) : this(
            aggregationFunctions,
            judgeModel,
            judgeScoreRegexes,
            type,
            promptTemplate,
            mutableMapOf(),
        )

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun aggregationFunctions(): List<AggregationFunction> =
            aggregationFunctions.getRequired("aggregation_functions")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun judgeModel(): String = judgeModel.getRequired("judge_model")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun judgeScoreRegexes(): List<String> = judgeScoreRegexes.getRequired("judge_score_regexes")

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
        fun promptTemplate(): String? = promptTemplate.getNullable("prompt_template")

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
         * Returns the raw JSON value of [judgeModel].
         *
         * Unlike [judgeModel], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("judge_model")
        @ExcludeMissing
        fun _judgeModel(): JsonField<String> = judgeModel

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

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [LlmAsJudge].
             *
             * The following fields are required:
             * ```kotlin
             * .aggregationFunctions()
             * .judgeModel()
             * .judgeScoreRegexes()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [LlmAsJudge]. */
        class Builder internal constructor() {

            private var aggregationFunctions: JsonField<MutableList<AggregationFunction>>? = null
            private var judgeModel: JsonField<String>? = null
            private var judgeScoreRegexes: JsonField<MutableList<String>>? = null
            private var type: JsonValue = JsonValue.from("llm_as_judge")
            private var promptTemplate: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(llmAsJudge: LlmAsJudge) = apply {
                aggregationFunctions = llmAsJudge.aggregationFunctions.map { it.toMutableList() }
                judgeModel = llmAsJudge.judgeModel
                judgeScoreRegexes = llmAsJudge.judgeScoreRegexes.map { it.toMutableList() }
                type = llmAsJudge.type
                promptTemplate = llmAsJudge.promptTemplate
                additionalProperties = llmAsJudge.additionalProperties.toMutableMap()
            }

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

            fun judgeModel(judgeModel: String) = judgeModel(JsonField.of(judgeModel))

            /**
             * Sets [Builder.judgeModel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.judgeModel] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun judgeModel(judgeModel: JsonField<String>) = apply { this.judgeModel = judgeModel }

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

            /**
             * Returns an immutable instance of [LlmAsJudge].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .aggregationFunctions()
             * .judgeModel()
             * .judgeScoreRegexes()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): LlmAsJudge =
                LlmAsJudge(
                    checkRequired("aggregationFunctions", aggregationFunctions).map {
                        it.toImmutable()
                    },
                    checkRequired("judgeModel", judgeModel),
                    checkRequired("judgeScoreRegexes", judgeScoreRegexes).map { it.toImmutable() },
                    type,
                    promptTemplate,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): LlmAsJudge = apply {
            if (validated) {
                return@apply
            }

            aggregationFunctions().forEach { it.validate() }
            judgeModel()
            judgeScoreRegexes()
            _type().let {
                if (it != JsonValue.from("llm_as_judge")) {
                    throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
                }
            }
            promptTemplate()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaStackClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (aggregationFunctions.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (judgeModel.asKnown() == null) 0 else 1) +
                (judgeScoreRegexes.asKnown()?.size ?: 0) +
                type.let { if (it == JsonValue.from("llm_as_judge")) 1 else 0 } +
                (if (promptTemplate.asKnown() == null) 0 else 1)

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

                val WEIGHTED_AVERAGE = of("weighted_average")

                val MEDIAN = of("median")

                val CATEGORICAL_COUNT = of("categorical_count")

                val ACCURACY = of("accuracy")

                fun of(value: String) = AggregationFunction(JsonField.of(value))
            }

            /** An enum containing [AggregationFunction]'s known values. */
            enum class Known {
                AVERAGE,
                WEIGHTED_AVERAGE,
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
                WEIGHTED_AVERAGE,
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
                    WEIGHTED_AVERAGE -> Value.WEIGHTED_AVERAGE
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
                    WEIGHTED_AVERAGE -> Known.WEIGHTED_AVERAGE
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

            private var validated: Boolean = false

            fun validate(): AggregationFunction = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LlamaStackClientInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

            return /* spotless:off */ other is LlmAsJudge && aggregationFunctions == other.aggregationFunctions && judgeModel == other.judgeModel && judgeScoreRegexes == other.judgeScoreRegexes && type == other.type && promptTemplate == other.promptTemplate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(aggregationFunctions, judgeModel, judgeScoreRegexes, type, promptTemplate, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LlmAsJudge{aggregationFunctions=$aggregationFunctions, judgeModel=$judgeModel, judgeScoreRegexes=$judgeScoreRegexes, type=$type, promptTemplate=$promptTemplate, additionalProperties=$additionalProperties}"
    }

    class RegexParser
    private constructor(
        private val aggregationFunctions: JsonField<List<AggregationFunction>>,
        private val parsingRegexes: JsonField<List<String>>,
        private val type: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("aggregation_functions")
            @ExcludeMissing
            aggregationFunctions: JsonField<List<AggregationFunction>> = JsonMissing.of(),
            @JsonProperty("parsing_regexes")
            @ExcludeMissing
            parsingRegexes: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        ) : this(aggregationFunctions, parsingRegexes, type, mutableMapOf())

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun aggregationFunctions(): List<AggregationFunction> =
            aggregationFunctions.getRequired("aggregation_functions")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun parsingRegexes(): List<String> = parsingRegexes.getRequired("parsing_regexes")

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

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [RegexParser].
             *
             * The following fields are required:
             * ```kotlin
             * .aggregationFunctions()
             * .parsingRegexes()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [RegexParser]. */
        class Builder internal constructor() {

            private var aggregationFunctions: JsonField<MutableList<AggregationFunction>>? = null
            private var parsingRegexes: JsonField<MutableList<String>>? = null
            private var type: JsonValue = JsonValue.from("regex_parser")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(regexParser: RegexParser) = apply {
                aggregationFunctions = regexParser.aggregationFunctions.map { it.toMutableList() }
                parsingRegexes = regexParser.parsingRegexes.map { it.toMutableList() }
                type = regexParser.type
                additionalProperties = regexParser.additionalProperties.toMutableMap()
            }

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

            /**
             * Returns an immutable instance of [RegexParser].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .aggregationFunctions()
             * .parsingRegexes()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): RegexParser =
                RegexParser(
                    checkRequired("aggregationFunctions", aggregationFunctions).map {
                        it.toImmutable()
                    },
                    checkRequired("parsingRegexes", parsingRegexes).map { it.toImmutable() },
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): RegexParser = apply {
            if (validated) {
                return@apply
            }

            aggregationFunctions().forEach { it.validate() }
            parsingRegexes()
            _type().let {
                if (it != JsonValue.from("regex_parser")) {
                    throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
                }
            }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaStackClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (aggregationFunctions.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (parsingRegexes.asKnown()?.size ?: 0) +
                type.let { if (it == JsonValue.from("regex_parser")) 1 else 0 }

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

                val WEIGHTED_AVERAGE = of("weighted_average")

                val MEDIAN = of("median")

                val CATEGORICAL_COUNT = of("categorical_count")

                val ACCURACY = of("accuracy")

                fun of(value: String) = AggregationFunction(JsonField.of(value))
            }

            /** An enum containing [AggregationFunction]'s known values. */
            enum class Known {
                AVERAGE,
                WEIGHTED_AVERAGE,
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
                WEIGHTED_AVERAGE,
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
                    WEIGHTED_AVERAGE -> Value.WEIGHTED_AVERAGE
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
                    WEIGHTED_AVERAGE -> Known.WEIGHTED_AVERAGE
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

            private var validated: Boolean = false

            fun validate(): AggregationFunction = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LlamaStackClientInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

            return /* spotless:off */ other is RegexParser && aggregationFunctions == other.aggregationFunctions && parsingRegexes == other.parsingRegexes && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(aggregationFunctions, parsingRegexes, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RegexParser{aggregationFunctions=$aggregationFunctions, parsingRegexes=$parsingRegexes, type=$type, additionalProperties=$additionalProperties}"
    }

    class Basic
    private constructor(
        private val aggregationFunctions: JsonField<List<AggregationFunction>>,
        private val type: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("aggregation_functions")
            @ExcludeMissing
            aggregationFunctions: JsonField<List<AggregationFunction>> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        ) : this(aggregationFunctions, type, mutableMapOf())

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun aggregationFunctions(): List<AggregationFunction> =
            aggregationFunctions.getRequired("aggregation_functions")

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
         * Returns the raw JSON value of [aggregationFunctions].
         *
         * Unlike [aggregationFunctions], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("aggregation_functions")
        @ExcludeMissing
        fun _aggregationFunctions(): JsonField<List<AggregationFunction>> = aggregationFunctions

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Basic].
             *
             * The following fields are required:
             * ```kotlin
             * .aggregationFunctions()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Basic]. */
        class Builder internal constructor() {

            private var aggregationFunctions: JsonField<MutableList<AggregationFunction>>? = null
            private var type: JsonValue = JsonValue.from("basic")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(basic: Basic) = apply {
                aggregationFunctions = basic.aggregationFunctions.map { it.toMutableList() }
                type = basic.type
                additionalProperties = basic.additionalProperties.toMutableMap()
            }

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

            /**
             * Returns an immutable instance of [Basic].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .aggregationFunctions()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Basic =
                Basic(
                    checkRequired("aggregationFunctions", aggregationFunctions).map {
                        it.toImmutable()
                    },
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Basic = apply {
            if (validated) {
                return@apply
            }

            aggregationFunctions().forEach { it.validate() }
            _type().let {
                if (it != JsonValue.from("basic")) {
                    throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
                }
            }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaStackClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (aggregationFunctions.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                type.let { if (it == JsonValue.from("basic")) 1 else 0 }

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

                val WEIGHTED_AVERAGE = of("weighted_average")

                val MEDIAN = of("median")

                val CATEGORICAL_COUNT = of("categorical_count")

                val ACCURACY = of("accuracy")

                fun of(value: String) = AggregationFunction(JsonField.of(value))
            }

            /** An enum containing [AggregationFunction]'s known values. */
            enum class Known {
                AVERAGE,
                WEIGHTED_AVERAGE,
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
                WEIGHTED_AVERAGE,
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
                    WEIGHTED_AVERAGE -> Value.WEIGHTED_AVERAGE
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
                    WEIGHTED_AVERAGE -> Known.WEIGHTED_AVERAGE
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

            private var validated: Boolean = false

            fun validate(): AggregationFunction = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LlamaStackClientInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

            return /* spotless:off */ other is Basic && aggregationFunctions == other.aggregationFunctions && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(aggregationFunctions, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Basic{aggregationFunctions=$aggregationFunctions, type=$type, additionalProperties=$additionalProperties}"
    }
}
