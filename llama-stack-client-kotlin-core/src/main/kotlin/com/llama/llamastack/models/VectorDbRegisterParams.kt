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
import com.llama.llamastack.core.Params
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Collections
import java.util.Objects

/** Register a vector database. */
class VectorDbRegisterParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The embedding model to use.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun embeddingModel(): String = body.embeddingModel()

    /**
     * The identifier of the vector database to register.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun vectorDbId(): String = body.vectorDbId()

    /**
     * The dimension of the embedding model.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun embeddingDimension(): Long? = body.embeddingDimension()

    /**
     * The identifier of the provider.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun providerId(): String? = body.providerId()

    /**
     * The identifier of the vector database in the provider.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun providerVectorDbId(): String? = body.providerVectorDbId()

    /**
     * Returns the raw JSON value of [embeddingModel].
     *
     * Unlike [embeddingModel], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _embeddingModel(): JsonField<String> = body._embeddingModel()

    /**
     * Returns the raw JSON value of [vectorDbId].
     *
     * Unlike [vectorDbId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _vectorDbId(): JsonField<String> = body._vectorDbId()

    /**
     * Returns the raw JSON value of [embeddingDimension].
     *
     * Unlike [embeddingDimension], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _embeddingDimension(): JsonField<Long> = body._embeddingDimension()

    /**
     * Returns the raw JSON value of [providerId].
     *
     * Unlike [providerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _providerId(): JsonField<String> = body._providerId()

    /**
     * Returns the raw JSON value of [providerVectorDbId].
     *
     * Unlike [providerVectorDbId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _providerVectorDbId(): JsonField<String> = body._providerVectorDbId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [VectorDbRegisterParams].
         *
         * The following fields are required:
         * ```kotlin
         * .embeddingModel()
         * .vectorDbId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [VectorDbRegisterParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(vectorDbRegisterParams: VectorDbRegisterParams) = apply {
            body = vectorDbRegisterParams.body.toBuilder()
            additionalHeaders = vectorDbRegisterParams.additionalHeaders.toBuilder()
            additionalQueryParams = vectorDbRegisterParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [embeddingModel]
         * - [vectorDbId]
         * - [embeddingDimension]
         * - [providerId]
         * - [providerVectorDbId]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The embedding model to use. */
        fun embeddingModel(embeddingModel: String) = apply { body.embeddingModel(embeddingModel) }

        /**
         * Sets [Builder.embeddingModel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.embeddingModel] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun embeddingModel(embeddingModel: JsonField<String>) = apply {
            body.embeddingModel(embeddingModel)
        }

        /** The identifier of the vector database to register. */
        fun vectorDbId(vectorDbId: String) = apply { body.vectorDbId(vectorDbId) }

        /**
         * Sets [Builder.vectorDbId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vectorDbId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun vectorDbId(vectorDbId: JsonField<String>) = apply { body.vectorDbId(vectorDbId) }

        /** The dimension of the embedding model. */
        fun embeddingDimension(embeddingDimension: Long) = apply {
            body.embeddingDimension(embeddingDimension)
        }

        /**
         * Sets [Builder.embeddingDimension] to an arbitrary JSON value.
         *
         * You should usually call [Builder.embeddingDimension] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun embeddingDimension(embeddingDimension: JsonField<Long>) = apply {
            body.embeddingDimension(embeddingDimension)
        }

        /** The identifier of the provider. */
        fun providerId(providerId: String) = apply { body.providerId(providerId) }

        /**
         * Sets [Builder.providerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.providerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun providerId(providerId: JsonField<String>) = apply { body.providerId(providerId) }

        /** The identifier of the vector database in the provider. */
        fun providerVectorDbId(providerVectorDbId: String) = apply {
            body.providerVectorDbId(providerVectorDbId)
        }

        /**
         * Sets [Builder.providerVectorDbId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.providerVectorDbId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun providerVectorDbId(providerVectorDbId: JsonField<String>) = apply {
            body.providerVectorDbId(providerVectorDbId)
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

        /**
         * Returns an immutable instance of [VectorDbRegisterParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .embeddingModel()
         * .vectorDbId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VectorDbRegisterParams =
            VectorDbRegisterParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val embeddingModel: JsonField<String>,
        private val vectorDbId: JsonField<String>,
        private val embeddingDimension: JsonField<Long>,
        private val providerId: JsonField<String>,
        private val providerVectorDbId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("embedding_model")
            @ExcludeMissing
            embeddingModel: JsonField<String> = JsonMissing.of(),
            @JsonProperty("vector_db_id")
            @ExcludeMissing
            vectorDbId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("embedding_dimension")
            @ExcludeMissing
            embeddingDimension: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("provider_id")
            @ExcludeMissing
            providerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("provider_vector_db_id")
            @ExcludeMissing
            providerVectorDbId: JsonField<String> = JsonMissing.of(),
        ) : this(
            embeddingModel,
            vectorDbId,
            embeddingDimension,
            providerId,
            providerVectorDbId,
            mutableMapOf(),
        )

        /**
         * The embedding model to use.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun embeddingModel(): String = embeddingModel.getRequired("embedding_model")

        /**
         * The identifier of the vector database to register.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun vectorDbId(): String = vectorDbId.getRequired("vector_db_id")

        /**
         * The dimension of the embedding model.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun embeddingDimension(): Long? = embeddingDimension.getNullable("embedding_dimension")

        /**
         * The identifier of the provider.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun providerId(): String? = providerId.getNullable("provider_id")

        /**
         * The identifier of the vector database in the provider.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun providerVectorDbId(): String? = providerVectorDbId.getNullable("provider_vector_db_id")

        /**
         * Returns the raw JSON value of [embeddingModel].
         *
         * Unlike [embeddingModel], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("embedding_model")
        @ExcludeMissing
        fun _embeddingModel(): JsonField<String> = embeddingModel

        /**
         * Returns the raw JSON value of [vectorDbId].
         *
         * Unlike [vectorDbId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("vector_db_id")
        @ExcludeMissing
        fun _vectorDbId(): JsonField<String> = vectorDbId

        /**
         * Returns the raw JSON value of [embeddingDimension].
         *
         * Unlike [embeddingDimension], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("embedding_dimension")
        @ExcludeMissing
        fun _embeddingDimension(): JsonField<Long> = embeddingDimension

        /**
         * Returns the raw JSON value of [providerId].
         *
         * Unlike [providerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("provider_id")
        @ExcludeMissing
        fun _providerId(): JsonField<String> = providerId

        /**
         * Returns the raw JSON value of [providerVectorDbId].
         *
         * Unlike [providerVectorDbId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("provider_vector_db_id")
        @ExcludeMissing
        fun _providerVectorDbId(): JsonField<String> = providerVectorDbId

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .embeddingModel()
             * .vectorDbId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var embeddingModel: JsonField<String>? = null
            private var vectorDbId: JsonField<String>? = null
            private var embeddingDimension: JsonField<Long> = JsonMissing.of()
            private var providerId: JsonField<String> = JsonMissing.of()
            private var providerVectorDbId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                embeddingModel = body.embeddingModel
                vectorDbId = body.vectorDbId
                embeddingDimension = body.embeddingDimension
                providerId = body.providerId
                providerVectorDbId = body.providerVectorDbId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The embedding model to use. */
            fun embeddingModel(embeddingModel: String) =
                embeddingModel(JsonField.of(embeddingModel))

            /**
             * Sets [Builder.embeddingModel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.embeddingModel] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun embeddingModel(embeddingModel: JsonField<String>) = apply {
                this.embeddingModel = embeddingModel
            }

            /** The identifier of the vector database to register. */
            fun vectorDbId(vectorDbId: String) = vectorDbId(JsonField.of(vectorDbId))

            /**
             * Sets [Builder.vectorDbId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vectorDbId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vectorDbId(vectorDbId: JsonField<String>) = apply { this.vectorDbId = vectorDbId }

            /** The dimension of the embedding model. */
            fun embeddingDimension(embeddingDimension: Long) =
                embeddingDimension(JsonField.of(embeddingDimension))

            /**
             * Sets [Builder.embeddingDimension] to an arbitrary JSON value.
             *
             * You should usually call [Builder.embeddingDimension] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun embeddingDimension(embeddingDimension: JsonField<Long>) = apply {
                this.embeddingDimension = embeddingDimension
            }

            /** The identifier of the provider. */
            fun providerId(providerId: String) = providerId(JsonField.of(providerId))

            /**
             * Sets [Builder.providerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.providerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

            /** The identifier of the vector database in the provider. */
            fun providerVectorDbId(providerVectorDbId: String) =
                providerVectorDbId(JsonField.of(providerVectorDbId))

            /**
             * Sets [Builder.providerVectorDbId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.providerVectorDbId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun providerVectorDbId(providerVectorDbId: JsonField<String>) = apply {
                this.providerVectorDbId = providerVectorDbId
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .embeddingModel()
             * .vectorDbId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("embeddingModel", embeddingModel),
                    checkRequired("vectorDbId", vectorDbId),
                    embeddingDimension,
                    providerId,
                    providerVectorDbId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            embeddingModel()
            vectorDbId()
            embeddingDimension()
            providerId()
            providerVectorDbId()
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
            (if (embeddingModel.asKnown() == null) 0 else 1) +
                (if (vectorDbId.asKnown() == null) 0 else 1) +
                (if (embeddingDimension.asKnown() == null) 0 else 1) +
                (if (providerId.asKnown() == null) 0 else 1) +
                (if (providerVectorDbId.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && embeddingModel == other.embeddingModel && vectorDbId == other.vectorDbId && embeddingDimension == other.embeddingDimension && providerId == other.providerId && providerVectorDbId == other.providerVectorDbId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(embeddingModel, vectorDbId, embeddingDimension, providerId, providerVectorDbId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{embeddingModel=$embeddingModel, vectorDbId=$vectorDbId, embeddingDimension=$embeddingDimension, providerId=$providerId, providerVectorDbId=$providerVectorDbId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is VectorDbRegisterParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "VectorDbRegisterParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
