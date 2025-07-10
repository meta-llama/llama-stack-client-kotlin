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
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Collections
import java.util.Objects

class VectorDbRetrieveResponse
private constructor(
    private val embeddingDimension: JsonField<Long>,
    private val embeddingModel: JsonField<String>,
    private val identifier: JsonField<String>,
    private val providerId: JsonField<String>,
    private val type: JsonValue,
    private val providerResourceId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("embedding_dimension")
        @ExcludeMissing
        embeddingDimension: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("embedding_model")
        @ExcludeMissing
        embeddingModel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("identifier")
        @ExcludeMissing
        identifier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("provider_id")
        @ExcludeMissing
        providerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        @JsonProperty("provider_resource_id")
        @ExcludeMissing
        providerResourceId: JsonField<String> = JsonMissing.of(),
    ) : this(
        embeddingDimension,
        embeddingModel,
        identifier,
        providerId,
        type,
        providerResourceId,
        mutableMapOf(),
    )

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun embeddingDimension(): Long = embeddingDimension.getRequired("embedding_dimension")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun embeddingModel(): String = embeddingModel.getRequired("embedding_model")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun identifier(): String = identifier.getRequired("identifier")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun providerId(): String = providerId.getRequired("provider_id")

    /**
     * Expected to always return the following:
     * ```kotlin
     * JsonValue.from("vector_db")
     * ```
     *
     * However, this method can be useful for debugging and logging (e.g. if the server responded
     * with an unexpected value).
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun providerResourceId(): String? = providerResourceId.getNullable("provider_resource_id")

    /**
     * Returns the raw JSON value of [embeddingDimension].
     *
     * Unlike [embeddingDimension], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("embedding_dimension")
    @ExcludeMissing
    fun _embeddingDimension(): JsonField<Long> = embeddingDimension

    /**
     * Returns the raw JSON value of [embeddingModel].
     *
     * Unlike [embeddingModel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("embedding_model")
    @ExcludeMissing
    fun _embeddingModel(): JsonField<String> = embeddingModel

    /**
     * Returns the raw JSON value of [identifier].
     *
     * Unlike [identifier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("identifier") @ExcludeMissing fun _identifier(): JsonField<String> = identifier

    /**
     * Returns the raw JSON value of [providerId].
     *
     * Unlike [providerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("provider_id") @ExcludeMissing fun _providerId(): JsonField<String> = providerId

    /**
     * Returns the raw JSON value of [providerResourceId].
     *
     * Unlike [providerResourceId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("provider_resource_id")
    @ExcludeMissing
    fun _providerResourceId(): JsonField<String> = providerResourceId

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
         * Returns a mutable builder for constructing an instance of [VectorDbRetrieveResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .embeddingDimension()
         * .embeddingModel()
         * .identifier()
         * .providerId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [VectorDbRetrieveResponse]. */
    class Builder internal constructor() {

        private var embeddingDimension: JsonField<Long>? = null
        private var embeddingModel: JsonField<String>? = null
        private var identifier: JsonField<String>? = null
        private var providerId: JsonField<String>? = null
        private var type: JsonValue = JsonValue.from("vector_db")
        private var providerResourceId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(vectorDbRetrieveResponse: VectorDbRetrieveResponse) = apply {
            embeddingDimension = vectorDbRetrieveResponse.embeddingDimension
            embeddingModel = vectorDbRetrieveResponse.embeddingModel
            identifier = vectorDbRetrieveResponse.identifier
            providerId = vectorDbRetrieveResponse.providerId
            type = vectorDbRetrieveResponse.type
            providerResourceId = vectorDbRetrieveResponse.providerResourceId
            additionalProperties = vectorDbRetrieveResponse.additionalProperties.toMutableMap()
        }

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

        fun embeddingModel(embeddingModel: String) = embeddingModel(JsonField.of(embeddingModel))

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

        fun identifier(identifier: String) = identifier(JsonField.of(identifier))

        /**
         * Sets [Builder.identifier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.identifier] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun identifier(identifier: JsonField<String>) = apply { this.identifier = identifier }

        fun providerId(providerId: String) = providerId(JsonField.of(providerId))

        /**
         * Sets [Builder.providerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.providerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

        /**
         * Sets the field to an arbitrary JSON value.
         *
         * It is usually unnecessary to call this method because the field defaults to the
         * following:
         * ```kotlin
         * JsonValue.from("vector_db")
         * ```
         *
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun type(type: JsonValue) = apply { this.type = type }

        fun providerResourceId(providerResourceId: String) =
            providerResourceId(JsonField.of(providerResourceId))

        /**
         * Sets [Builder.providerResourceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.providerResourceId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun providerResourceId(providerResourceId: JsonField<String>) = apply {
            this.providerResourceId = providerResourceId
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
         * Returns an immutable instance of [VectorDbRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .embeddingDimension()
         * .embeddingModel()
         * .identifier()
         * .providerId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VectorDbRetrieveResponse =
            VectorDbRetrieveResponse(
                checkRequired("embeddingDimension", embeddingDimension),
                checkRequired("embeddingModel", embeddingModel),
                checkRequired("identifier", identifier),
                checkRequired("providerId", providerId),
                type,
                providerResourceId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): VectorDbRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        embeddingDimension()
        embeddingModel()
        identifier()
        providerId()
        _type().let {
            if (it != JsonValue.from("vector_db")) {
                throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
            }
        }
        providerResourceId()
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
        (if (embeddingDimension.asKnown() == null) 0 else 1) +
            (if (embeddingModel.asKnown() == null) 0 else 1) +
            (if (identifier.asKnown() == null) 0 else 1) +
            (if (providerId.asKnown() == null) 0 else 1) +
            type.let { if (it == JsonValue.from("vector_db")) 1 else 0 } +
            (if (providerResourceId.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is VectorDbRetrieveResponse && embeddingDimension == other.embeddingDimension && embeddingModel == other.embeddingModel && identifier == other.identifier && providerId == other.providerId && type == other.type && providerResourceId == other.providerResourceId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(embeddingDimension, embeddingModel, identifier, providerId, type, providerResourceId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VectorDbRetrieveResponse{embeddingDimension=$embeddingDimension, embeddingModel=$embeddingModel, identifier=$identifier, providerId=$providerId, type=$type, providerResourceId=$providerResourceId, additionalProperties=$additionalProperties}"
}
