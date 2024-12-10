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
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import com.llama.llamastack.models.*
import java.util.Objects

class ScoringFunctionRegisterParams
constructor(
    private val description: String,
    private val returnType: ReturnType,
    private val scoringFnId: String,
    private val params: Params?,
    private val providerId: String?,
    private val providerScoringFnId: String?,
    private val xLlamaStackProviderData: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun description(): String = description

    fun returnType(): ReturnType = returnType

    fun scoringFnId(): String = scoringFnId

    fun params(): Params? = params

    fun providerId(): String? = providerId

    fun providerScoringFnId(): String? = providerScoringFnId

    fun xLlamaStackProviderData(): String? = xLlamaStackProviderData

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    internal fun getBody(): ScoringFunctionRegisterBody {
        return ScoringFunctionRegisterBody(
            description,
            returnType,
            scoringFnId,
            params,
            providerId,
            providerScoringFnId,
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

    @JsonDeserialize(builder = ScoringFunctionRegisterBody.Builder::class)
    @NoAutoDetect
    class ScoringFunctionRegisterBody
    internal constructor(
        private val description: String?,
        private val returnType: ReturnType?,
        private val scoringFnId: String?,
        private val params: Params?,
        private val providerId: String?,
        private val providerScoringFnId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("description") fun description(): String? = description

        @JsonProperty("return_type") fun returnType(): ReturnType? = returnType

        @JsonProperty("scoring_fn_id") fun scoringFnId(): String? = scoringFnId

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
                this.description = scoringFunctionRegisterBody.description
                this.returnType = scoringFunctionRegisterBody.returnType
                this.scoringFnId = scoringFunctionRegisterBody.scoringFnId
                this.params = scoringFunctionRegisterBody.params
                this.providerId = scoringFunctionRegisterBody.providerId
                this.providerScoringFnId = scoringFunctionRegisterBody.providerScoringFnId
                additionalProperties(scoringFunctionRegisterBody.additionalProperties)
            }

            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            @JsonProperty("return_type")
            fun returnType(returnType: ReturnType) = apply { this.returnType = returnType }

            @JsonProperty("scoring_fn_id")
            fun scoringFnId(scoringFnId: String) = apply { this.scoringFnId = scoringFnId }

            @JsonProperty("params") fun params(params: Params) = apply { this.params = params }

            @JsonProperty("provider_id")
            fun providerId(providerId: String) = apply { this.providerId = providerId }

            @JsonProperty("provider_scoring_fn_id")
            fun providerScoringFnId(providerScoringFnId: String) = apply {
                this.providerScoringFnId = providerScoringFnId
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

        private var description: String? = null
        private var returnType: ReturnType? = null
        private var scoringFnId: String? = null
        private var params: Params? = null
        private var providerId: String? = null
        private var providerScoringFnId: String? = null
        private var xLlamaStackProviderData: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(scoringFunctionRegisterParams: ScoringFunctionRegisterParams) = apply {
            description = scoringFunctionRegisterParams.description
            returnType = scoringFunctionRegisterParams.returnType
            scoringFnId = scoringFunctionRegisterParams.scoringFnId
            params = scoringFunctionRegisterParams.params
            providerId = scoringFunctionRegisterParams.providerId
            providerScoringFnId = scoringFunctionRegisterParams.providerScoringFnId
            xLlamaStackProviderData = scoringFunctionRegisterParams.xLlamaStackProviderData
            additionalHeaders = scoringFunctionRegisterParams.additionalHeaders.toBuilder()
            additionalQueryParams = scoringFunctionRegisterParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                scoringFunctionRegisterParams.additionalBodyProperties.toMutableMap()
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

        fun providerId(providerId: String) = apply { this.providerId = providerId }

        fun providerScoringFnId(providerScoringFnId: String) = apply {
            this.providerScoringFnId = providerScoringFnId
        }

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

        fun build(): ScoringFunctionRegisterParams =
            ScoringFunctionRegisterParams(
                checkNotNull(description) { "`description` is required but was not set" },
                checkNotNull(returnType) { "`returnType` is required but was not set" },
                checkNotNull(scoringFnId) { "`scoringFnId` is required but was not set" },
                params,
                providerId,
                providerScoringFnId,
                xLlamaStackProviderData,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
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

        fun isType(): Boolean = type != null

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
            val type: JsonField<Type>,
            val additionalProperties: Map<String, JsonValue>,
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

                return /* spotless:off */ other is Type /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Type{type=$type, additionalProperties=$additionalProperties}"
        }
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

        return /* spotless:off */ other is ScoringFunctionRegisterParams && description == other.description && returnType == other.returnType && scoringFnId == other.scoringFnId && params == other.params && providerId == other.providerId && providerScoringFnId == other.providerScoringFnId && xLlamaStackProviderData == other.xLlamaStackProviderData && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(description, returnType, scoringFnId, params, providerId, providerScoringFnId, xLlamaStackProviderData, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "ScoringFunctionRegisterParams{description=$description, returnType=$returnType, scoringFnId=$scoringFnId, params=$params, providerId=$providerId, providerScoringFnId=$providerScoringFnId, xLlamaStackProviderData=$xLlamaStackProviderData, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
