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
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

class ScoringFunctionRegisterParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = body.description()

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun returnType(): ReturnType = body.returnType()

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun scoringFnId(): String = body.scoringFnId()

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun params(): ScoringFnParams? = body.params()

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun providerId(): String? = body.providerId()

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun providerScoringFnId(): String? = body.providerScoringFnId()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [returnType].
     *
     * Unlike [returnType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _returnType(): JsonField<ReturnType> = body._returnType()

    /**
     * Returns the raw JSON value of [scoringFnId].
     *
     * Unlike [scoringFnId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _scoringFnId(): JsonField<String> = body._scoringFnId()

    /**
     * Returns the raw JSON value of [params].
     *
     * Unlike [params], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _params(): JsonField<ScoringFnParams> = body._params()

    /**
     * Returns the raw JSON value of [providerId].
     *
     * Unlike [providerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _providerId(): JsonField<String> = body._providerId()

    /**
     * Returns the raw JSON value of [providerScoringFnId].
     *
     * Unlike [providerScoringFnId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
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

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun description(): String = description.getRequired("description")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun returnType(): ReturnType = returnType.getRequired("return_type")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun scoringFnId(): String = scoringFnId.getRequired("scoring_fn_id")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun params(): ScoringFnParams? = params.getNullable("params")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun providerId(): String? = providerId.getNullable("provider_id")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun providerScoringFnId(): String? =
            providerScoringFnId.getNullable("provider_scoring_fn_id")

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [returnType].
         *
         * Unlike [returnType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("return_type")
        @ExcludeMissing
        fun _returnType(): JsonField<ReturnType> = returnType

        /**
         * Returns the raw JSON value of [scoringFnId].
         *
         * Unlike [scoringFnId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("scoring_fn_id")
        @ExcludeMissing
        fun _scoringFnId(): JsonField<String> = scoringFnId

        /**
         * Returns the raw JSON value of [params].
         *
         * Unlike [params], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("params") @ExcludeMissing fun _params(): JsonField<ScoringFnParams> = params

        /**
         * Returns the raw JSON value of [providerId].
         *
         * Unlike [providerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("provider_id")
        @ExcludeMissing
        fun _providerId(): JsonField<String> = providerId

        /**
         * Returns the raw JSON value of [providerScoringFnId].
         *
         * Unlike [providerScoringFnId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
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

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .description()
             * .returnType()
             * .scoringFnId()
             * ```
             */
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

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun returnType(returnType: ReturnType) = returnType(JsonField.of(returnType))

            /**
             * Sets [Builder.returnType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.returnType] with a well-typed [ReturnType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun returnType(returnType: JsonField<ReturnType>) = apply {
                this.returnType = returnType
            }

            fun scoringFnId(scoringFnId: String) = scoringFnId(JsonField.of(scoringFnId))

            /**
             * Sets [Builder.scoringFnId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scoringFnId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun scoringFnId(scoringFnId: JsonField<String>) = apply {
                this.scoringFnId = scoringFnId
            }

            fun params(params: ScoringFnParams) = params(JsonField.of(params))

            /**
             * Sets [Builder.params] to an arbitrary JSON value.
             *
             * You should usually call [Builder.params] with a well-typed [ScoringFnParams] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun params(params: JsonField<ScoringFnParams>) = apply { this.params = params }

            /** Alias for calling [params] with `ScoringFnParams.ofLlmAsJudge(llmAsJudge)`. */
            fun params(llmAsJudge: ScoringFnParams.LlmAsJudgeScoringFnParams) =
                params(ScoringFnParams.ofLlmAsJudge(llmAsJudge))

            /**
             * Alias for calling [params] with the following:
             * ```kotlin
             * ScoringFnParams.LlmAsJudgeScoringFnParams.builder()
             *     .judgeModel(judgeModel)
             *     .build()
             * ```
             */
            fun llmAsJudgeParams(judgeModel: String) =
                params(
                    ScoringFnParams.LlmAsJudgeScoringFnParams.builder()
                        .judgeModel(judgeModel)
                        .build()
                )

            /** Alias for calling [params] with `ScoringFnParams.ofRegexParser(regexParser)`. */
            fun params(regexParser: ScoringFnParams.RegexParserScoringFnParams) =
                params(ScoringFnParams.ofRegexParser(regexParser))

            /** Alias for calling [params] with `ScoringFnParams.ofBasic(basic)`. */
            fun params(basic: ScoringFnParams.BasicScoringFnParams) =
                params(ScoringFnParams.ofBasic(basic))

            fun providerId(providerId: String) = providerId(JsonField.of(providerId))

            /**
             * Sets [Builder.providerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.providerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

            fun providerScoringFnId(providerScoringFnId: String) =
                providerScoringFnId(JsonField.of(providerScoringFnId))

            /**
             * Sets [Builder.providerScoringFnId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.providerScoringFnId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
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

        /**
         * Returns a mutable builder for constructing an instance of
         * [ScoringFunctionRegisterParams].
         *
         * The following fields are required:
         * ```kotlin
         * .description()
         * .returnType()
         * .scoringFnId()
         * ```
         */
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

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        fun returnType(returnType: ReturnType) = apply { body.returnType(returnType) }

        /**
         * Sets [Builder.returnType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.returnType] with a well-typed [ReturnType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun returnType(returnType: JsonField<ReturnType>) = apply { body.returnType(returnType) }

        fun scoringFnId(scoringFnId: String) = apply { body.scoringFnId(scoringFnId) }

        /**
         * Sets [Builder.scoringFnId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scoringFnId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun scoringFnId(scoringFnId: JsonField<String>) = apply { body.scoringFnId(scoringFnId) }

        fun params(params: ScoringFnParams) = apply { body.params(params) }

        /**
         * Sets [Builder.params] to an arbitrary JSON value.
         *
         * You should usually call [Builder.params] with a well-typed [ScoringFnParams] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun params(params: JsonField<ScoringFnParams>) = apply { body.params(params) }

        /** Alias for calling [params] with `ScoringFnParams.ofLlmAsJudge(llmAsJudge)`. */
        fun params(llmAsJudge: ScoringFnParams.LlmAsJudgeScoringFnParams) = apply {
            body.params(llmAsJudge)
        }

        /**
         * Alias for calling [params] with the following:
         * ```kotlin
         * ScoringFnParams.LlmAsJudgeScoringFnParams.builder()
         *     .judgeModel(judgeModel)
         *     .build()
         * ```
         */
        fun llmAsJudgeParams(judgeModel: String) = apply { body.llmAsJudgeParams(judgeModel) }

        /** Alias for calling [params] with `ScoringFnParams.ofRegexParser(regexParser)`. */
        fun params(regexParser: ScoringFnParams.RegexParserScoringFnParams) = apply {
            body.params(regexParser)
        }

        /** Alias for calling [params] with `ScoringFnParams.ofBasic(basic)`. */
        fun params(basic: ScoringFnParams.BasicScoringFnParams) = apply { body.params(basic) }

        fun providerId(providerId: String) = apply { body.providerId(providerId) }

        /**
         * Sets [Builder.providerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.providerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun providerId(providerId: JsonField<String>) = apply { body.providerId(providerId) }

        fun providerScoringFnId(providerScoringFnId: String) = apply {
            body.providerScoringFnId(providerScoringFnId)
        }

        /**
         * Sets [Builder.providerScoringFnId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.providerScoringFnId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
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
