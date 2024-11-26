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
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

@JsonDeserialize(builder = ScoringFn.Builder::class)
@NoAutoDetect
class ScoringFn
private constructor(
    private val description: JsonField<String>,
    private val identifier: JsonField<String>,
    private val metadata: JsonField<Metadata>,
    private val params: JsonField<Params>,
    private val providerId: JsonField<String>,
    private val providerResourceId: JsonField<String>,
    private val returnType: JsonField<ReturnType>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun description(): String? = description.getNullable("description")

    fun identifier(): String = identifier.getRequired("identifier")

    fun metadata(): Metadata = metadata.getRequired("metadata")

    fun params(): Params? = params.getNullable("params")

    fun providerId(): String = providerId.getRequired("provider_id")

    fun providerResourceId(): String = providerResourceId.getRequired("provider_resource_id")

    fun returnType(): ReturnType = returnType.getRequired("return_type")

    fun type(): Type = type.getRequired("type")

    @JsonProperty("description") @ExcludeMissing fun _description() = description

    @JsonProperty("identifier") @ExcludeMissing fun _identifier() = identifier

    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

    @JsonProperty("params") @ExcludeMissing fun _params() = params

    @JsonProperty("provider_id") @ExcludeMissing fun _providerId() = providerId

    @JsonProperty("provider_resource_id")
    @ExcludeMissing
    fun _providerResourceId() = providerResourceId

    @JsonProperty("return_type") @ExcludeMissing fun _returnType() = returnType

    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ScoringFn = apply {
        if (!validated) {
            description()
            identifier()
            metadata().validate()
            params()
            providerId()
            providerResourceId()
            returnType()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var description: JsonField<String> = JsonMissing.of()
        private var identifier: JsonField<String> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var params: JsonField<Params> = JsonMissing.of()
        private var providerId: JsonField<String> = JsonMissing.of()
        private var providerResourceId: JsonField<String> = JsonMissing.of()
        private var returnType: JsonField<ReturnType> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(scoringFn: ScoringFn) = apply {
            this.description = scoringFn.description
            this.identifier = scoringFn.identifier
            this.metadata = scoringFn.metadata
            this.params = scoringFn.params
            this.providerId = scoringFn.providerId
            this.providerResourceId = scoringFn.providerResourceId
            this.returnType = scoringFn.returnType
            this.type = scoringFn.type
            additionalProperties(scoringFn.additionalProperties)
        }

        fun description(description: String) = description(JsonField.of(description))

        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun identifier(identifier: String) = identifier(JsonField.of(identifier))

        @JsonProperty("identifier")
        @ExcludeMissing
        fun identifier(identifier: JsonField<String>) = apply { this.identifier = identifier }

        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        @JsonProperty("metadata")
        @ExcludeMissing
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        fun params(params: Params) = params(JsonField.of(params))

        @JsonProperty("params")
        @ExcludeMissing
        fun params(params: JsonField<Params>) = apply { this.params = params }

        fun providerId(providerId: String) = providerId(JsonField.of(providerId))

        @JsonProperty("provider_id")
        @ExcludeMissing
        fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

        fun providerResourceId(providerResourceId: String) =
            providerResourceId(JsonField.of(providerResourceId))

        @JsonProperty("provider_resource_id")
        @ExcludeMissing
        fun providerResourceId(providerResourceId: JsonField<String>) = apply {
            this.providerResourceId = providerResourceId
        }

        fun returnType(returnType: ReturnType) = returnType(JsonField.of(returnType))

        @JsonProperty("return_type")
        @ExcludeMissing
        fun returnType(returnType: JsonField<ReturnType>) = apply { this.returnType = returnType }

        fun type(type: Type) = type(JsonField.of(type))

        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

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

        fun build(): ScoringFn =
            ScoringFn(
                description,
                identifier,
                metadata,
                params,
                providerId,
                providerResourceId,
                returnType,
                type,
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Metadata = apply {
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

    @JsonDeserialize(using = ReturnType.Deserializer::class)
    @JsonSerialize(using = ReturnType.Serializer::class)
    class ReturnType
    private constructor(
        private val type: Type? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun type(): Type? = type

        fun asType(): Type = type.getOrThrow("type")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                type != null -> visitor.visitType(type)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): ReturnType = apply {
            if (!validated) {
                if (type == null) {
                    throw LlamaStackClientInvalidDataException("Unknown ReturnType: $_json")
                }
                type.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ReturnType && type == other.type && type == other.type && type == other.type && type == other.type && type == other.type && type == other.type && type == other.type && type == other.type && type == other.type && type == other.type /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(type, type, type, type, type, type, type, type, type, type) /* spotless:on */

        override fun toString(): String =
            when {
                type != null -> "ReturnType{type=$type}"
                _json != null -> "ReturnType{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid ReturnType")
            }

        companion object {

            fun ofType(type: Type) = ReturnType(type = type)
        }

        interface Visitor<out T> {

            fun visitType(type: Type): T

            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown ReturnType: $json")
            }
        }

        class Deserializer : BaseDeserializer<ReturnType>(ReturnType::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): ReturnType {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<Type>()) { it.validate() }
                    ?.let {
                        return ReturnType(type = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<Type>()) { it.validate() }
                    ?.let {
                        return ReturnType(type = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<Type>()) { it.validate() }
                    ?.let {
                        return ReturnType(type = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<Type>()) { it.validate() }
                    ?.let {
                        return ReturnType(type = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<Type>()) { it.validate() }
                    ?.let {
                        return ReturnType(type = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<Type>()) { it.validate() }
                    ?.let {
                        return ReturnType(type = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<Type>()) { it.validate() }
                    ?.let {
                        return ReturnType(type = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<Type>()) { it.validate() }
                    ?.let {
                        return ReturnType(type = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<Type>()) { it.validate() }
                    ?.let {
                        return ReturnType(type = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<Type>()) { it.validate() }
                    ?.let {
                        return ReturnType(type = it, _json = json)
                    }

                return ReturnType(_json = json)
            }
        }

        class Serializer : BaseSerializer<ReturnType>(ReturnType::class) {

            override fun serialize(
                value: ReturnType,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.type != null -> generator.writeObject(value.type)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid ReturnType")
                }
            }
        }

        @JsonDeserialize(builder = Type.Builder::class)
        @NoAutoDetect
        class Type
        private constructor(
            private val type: JsonField<Type>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun type(): Type = type.getRequired("type")

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): ReturnType.Type = apply {
                if (!validated) {
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(type: ReturnType.Type) = apply {
                    this.type = type.type
                    additionalProperties(type.additionalProperties)
                }

                fun type(type: Type) = type(JsonField.of(type))

                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): ReturnType.Type = Type(type, additionalProperties.toImmutable())
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val STRING = Type(JsonField.of("string"))

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    STRING,
                }

                enum class Value {
                    STRING,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        STRING -> Value.STRING
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        STRING -> Known.STRING
                        else -> throw LlamaStackClientInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Type && type == other && this.additionalProperties == additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Type{type=$type, additionalProperties=$additionalProperties}"
        }
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val SCORING_FUNCTION = Type(JsonField.of("scoring_function"))

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
    }

    @JsonDeserialize(using = Params.Deserializer::class)
    @JsonSerialize(using = Params.Serializer::class)
    class Params
    private constructor(
        private val llmAsJudgeScoringFnParams: LlmAsJudgeScoringFnParams? = null,
        private val regexParserScoringFnParams: RegexParserScoringFnParams? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun llmAsJudgeScoringFnParams(): LlmAsJudgeScoringFnParams? = llmAsJudgeScoringFnParams

        fun regexParserScoringFnParams(): RegexParserScoringFnParams? = regexParserScoringFnParams

        fun isLlmAsJudgeScoringFnParams(): Boolean = llmAsJudgeScoringFnParams != null

        fun isRegexParserScoringFnParams(): Boolean = regexParserScoringFnParams != null

        fun asLlmAsJudgeScoringFnParams(): LlmAsJudgeScoringFnParams =
            llmAsJudgeScoringFnParams.getOrThrow("llmAsJudgeScoringFnParams")

        fun asRegexParserScoringFnParams(): RegexParserScoringFnParams =
            regexParserScoringFnParams.getOrThrow("regexParserScoringFnParams")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                llmAsJudgeScoringFnParams != null ->
                    visitor.visitLlmAsJudgeScoringFnParams(llmAsJudgeScoringFnParams)
                regexParserScoringFnParams != null ->
                    visitor.visitRegexParserScoringFnParams(regexParserScoringFnParams)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): Params = apply {
            if (!validated) {
                if (llmAsJudgeScoringFnParams == null && regexParserScoringFnParams == null) {
                    throw LlamaStackClientInvalidDataException("Unknown Params: $_json")
                }
                llmAsJudgeScoringFnParams?.validate()
                regexParserScoringFnParams?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Params && llmAsJudgeScoringFnParams == other.llmAsJudgeScoringFnParams && regexParserScoringFnParams == other.regexParserScoringFnParams /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(llmAsJudgeScoringFnParams, regexParserScoringFnParams) /* spotless:on */

        override fun toString(): String =
            when {
                llmAsJudgeScoringFnParams != null ->
                    "Params{llmAsJudgeScoringFnParams=$llmAsJudgeScoringFnParams}"
                regexParserScoringFnParams != null ->
                    "Params{regexParserScoringFnParams=$regexParserScoringFnParams}"
                _json != null -> "Params{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Params")
            }

        companion object {

            fun ofLlmAsJudgeScoringFnParams(llmAsJudgeScoringFnParams: LlmAsJudgeScoringFnParams) =
                Params(llmAsJudgeScoringFnParams = llmAsJudgeScoringFnParams)

            fun ofRegexParserScoringFnParams(
                regexParserScoringFnParams: RegexParserScoringFnParams
            ) = Params(regexParserScoringFnParams = regexParserScoringFnParams)
        }

        interface Visitor<out T> {

            fun visitLlmAsJudgeScoringFnParams(
                llmAsJudgeScoringFnParams: LlmAsJudgeScoringFnParams
            ): T

            fun visitRegexParserScoringFnParams(
                regexParserScoringFnParams: RegexParserScoringFnParams
            ): T

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
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Params")
                }
            }
        }

        @JsonDeserialize(builder = LlmAsJudgeScoringFnParams.Builder::class)
        @NoAutoDetect
        class LlmAsJudgeScoringFnParams
        private constructor(
            private val judgeModel: JsonField<String>,
            private val judgeScoreRegexes: JsonField<List<String>>,
            private val promptTemplate: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun judgeModel(): String = judgeModel.getRequired("judge_model")

            fun judgeScoreRegexes(): List<String>? =
                judgeScoreRegexes.getNullable("judge_score_regexes")

            fun promptTemplate(): String? = promptTemplate.getNullable("prompt_template")

            fun type(): Type = type.getRequired("type")

            @JsonProperty("judge_model") @ExcludeMissing fun _judgeModel() = judgeModel

            @JsonProperty("judge_score_regexes")
            @ExcludeMissing
            fun _judgeScoreRegexes() = judgeScoreRegexes

            @JsonProperty("prompt_template") @ExcludeMissing fun _promptTemplate() = promptTemplate

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): LlmAsJudgeScoringFnParams = apply {
                if (!validated) {
                    judgeModel()
                    judgeScoreRegexes()
                    promptTemplate()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var judgeModel: JsonField<String> = JsonMissing.of()
                private var judgeScoreRegexes: JsonField<List<String>> = JsonMissing.of()
                private var promptTemplate: JsonField<String> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(llmAsJudgeScoringFnParams: LlmAsJudgeScoringFnParams) = apply {
                    this.judgeModel = llmAsJudgeScoringFnParams.judgeModel
                    this.judgeScoreRegexes = llmAsJudgeScoringFnParams.judgeScoreRegexes
                    this.promptTemplate = llmAsJudgeScoringFnParams.promptTemplate
                    this.type = llmAsJudgeScoringFnParams.type
                    additionalProperties(llmAsJudgeScoringFnParams.additionalProperties)
                }

                fun judgeModel(judgeModel: String) = judgeModel(JsonField.of(judgeModel))

                @JsonProperty("judge_model")
                @ExcludeMissing
                fun judgeModel(judgeModel: JsonField<String>) = apply {
                    this.judgeModel = judgeModel
                }

                fun judgeScoreRegexes(judgeScoreRegexes: List<String>) =
                    judgeScoreRegexes(JsonField.of(judgeScoreRegexes))

                @JsonProperty("judge_score_regexes")
                @ExcludeMissing
                fun judgeScoreRegexes(judgeScoreRegexes: JsonField<List<String>>) = apply {
                    this.judgeScoreRegexes = judgeScoreRegexes
                }

                fun promptTemplate(promptTemplate: String) =
                    promptTemplate(JsonField.of(promptTemplate))

                @JsonProperty("prompt_template")
                @ExcludeMissing
                fun promptTemplate(promptTemplate: JsonField<String>) = apply {
                    this.promptTemplate = promptTemplate
                }

                fun type(type: Type) = type(JsonField.of(type))

                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): LlmAsJudgeScoringFnParams =
                    LlmAsJudgeScoringFnParams(
                        judgeModel,
                        judgeScoreRegexes.map { it.toImmutable() },
                        promptTemplate,
                        type,
                        additionalProperties.toImmutable(),
                    )
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val LLM_AS_JUDGE = Type(JsonField.of("llm_as_judge"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is LlmAsJudgeScoringFnParams && judgeModel == other.judgeModel && judgeScoreRegexes == other.judgeScoreRegexes && promptTemplate == other.promptTemplate && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(judgeModel, judgeScoreRegexes, promptTemplate, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LlmAsJudgeScoringFnParams{judgeModel=$judgeModel, judgeScoreRegexes=$judgeScoreRegexes, promptTemplate=$promptTemplate, type=$type, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = RegexParserScoringFnParams.Builder::class)
        @NoAutoDetect
        class RegexParserScoringFnParams
        private constructor(
            private val parsingRegexes: JsonField<List<String>>,
            private val type: JsonField<Type>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun parsingRegexes(): List<String>? = parsingRegexes.getNullable("parsing_regexes")

            fun type(): Type = type.getRequired("type")

            @JsonProperty("parsing_regexes") @ExcludeMissing fun _parsingRegexes() = parsingRegexes

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): RegexParserScoringFnParams = apply {
                if (!validated) {
                    parsingRegexes()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var parsingRegexes: JsonField<List<String>> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(regexParserScoringFnParams: RegexParserScoringFnParams) = apply {
                    this.parsingRegexes = regexParserScoringFnParams.parsingRegexes
                    this.type = regexParserScoringFnParams.type
                    additionalProperties(regexParserScoringFnParams.additionalProperties)
                }

                fun parsingRegexes(parsingRegexes: List<String>) =
                    parsingRegexes(JsonField.of(parsingRegexes))

                @JsonProperty("parsing_regexes")
                @ExcludeMissing
                fun parsingRegexes(parsingRegexes: JsonField<List<String>>) = apply {
                    this.parsingRegexes = parsingRegexes
                }

                fun type(type: Type) = type(JsonField.of(type))

                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): RegexParserScoringFnParams =
                    RegexParserScoringFnParams(
                        parsingRegexes.map { it.toImmutable() },
                        type,
                        additionalProperties.toImmutable(),
                    )
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val REGEX_PARSER = Type(JsonField.of("regex_parser"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RegexParserScoringFnParams && parsingRegexes == other.parsingRegexes && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(parsingRegexes, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RegexParserScoringFnParams{parsingRegexes=$parsingRegexes, type=$type, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ScoringFn && description == other.description && identifier == other.identifier && metadata == other.metadata && params == other.params && providerId == other.providerId && providerResourceId == other.providerResourceId && returnType == other.returnType && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(description, identifier, metadata, params, providerId, providerResourceId, returnType, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ScoringFn{description=$description, identifier=$identifier, metadata=$metadata, params=$params, providerId=$providerId, providerResourceId=$providerResourceId, returnType=$returnType, type=$type, additionalProperties=$additionalProperties}"
}
