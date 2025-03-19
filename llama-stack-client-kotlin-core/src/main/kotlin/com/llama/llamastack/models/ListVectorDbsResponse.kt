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
import com.llama.llamastack.core.checkKnown
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

@NoAutoDetect
class ListVectorDbsResponse
@JsonCreator
private constructor(
    @JsonProperty("data")
    @ExcludeMissing
    private val data: JsonField<List<Data>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): List<Data> = data.getRequired("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ListVectorDbsResponse = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ListVectorDbsResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .data()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ListVectorDbsResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(listVectorDbsResponse: ListVectorDbsResponse) = apply {
            data = listVectorDbsResponse.data.map { it.toMutableList() }
            additionalProperties = listVectorDbsResponse.additionalProperties.toMutableMap()
        }

        fun data(data: List<Data>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<Data>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<List<Data>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [Data] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: Data) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
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

        fun build(): ListVectorDbsResponse =
            ListVectorDbsResponse(
                checkRequired("data", data).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Data
    @JsonCreator
    private constructor(
        @JsonProperty("embedding_dimension")
        @ExcludeMissing
        private val embeddingDimension: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("embedding_model")
        @ExcludeMissing
        private val embeddingModel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("identifier")
        @ExcludeMissing
        private val identifier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("provider_id")
        @ExcludeMissing
        private val providerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("provider_resource_id")
        @ExcludeMissing
        private val providerResourceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonValue = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun embeddingDimension(): Long = embeddingDimension.getRequired("embedding_dimension")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun embeddingModel(): String = embeddingModel.getRequired("embedding_model")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun identifier(): String = identifier.getRequired("identifier")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun providerId(): String = providerId.getRequired("provider_id")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun providerResourceId(): String = providerResourceId.getRequired("provider_resource_id")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("vector_db")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

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
         * Returns the raw JSON value of [embeddingModel].
         *
         * Unlike [embeddingModel], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("embedding_model")
        @ExcludeMissing
        fun _embeddingModel(): JsonField<String> = embeddingModel

        /**
         * Returns the raw JSON value of [identifier].
         *
         * Unlike [identifier], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("identifier")
        @ExcludeMissing
        fun _identifier(): JsonField<String> = identifier

        /**
         * Returns the raw JSON value of [providerId].
         *
         * Unlike [providerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("provider_id")
        @ExcludeMissing
        fun _providerId(): JsonField<String> = providerId

        /**
         * Returns the raw JSON value of [providerResourceId].
         *
         * Unlike [providerResourceId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("provider_resource_id")
        @ExcludeMissing
        fun _providerResourceId(): JsonField<String> = providerResourceId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            embeddingDimension()
            embeddingModel()
            identifier()
            providerId()
            providerResourceId()
            _type().let {
                if (it != JsonValue.from("vector_db")) {
                    throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
                }
            }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```kotlin
             * .embeddingDimension()
             * .embeddingModel()
             * .identifier()
             * .providerId()
             * .providerResourceId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var embeddingDimension: JsonField<Long>? = null
            private var embeddingModel: JsonField<String>? = null
            private var identifier: JsonField<String>? = null
            private var providerId: JsonField<String>? = null
            private var providerResourceId: JsonField<String>? = null
            private var type: JsonValue = JsonValue.from("vector_db")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                embeddingDimension = data.embeddingDimension
                embeddingModel = data.embeddingModel
                identifier = data.identifier
                providerId = data.providerId
                providerResourceId = data.providerResourceId
                type = data.type
                additionalProperties = data.additionalProperties.toMutableMap()
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

            fun identifier(identifier: String) = identifier(JsonField.of(identifier))

            /**
             * Sets [Builder.identifier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.identifier] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun identifier(identifier: JsonField<String>) = apply { this.identifier = identifier }

            fun providerId(providerId: String) = providerId(JsonField.of(providerId))

            /**
             * Sets [Builder.providerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.providerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

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

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("vector_db")
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

            fun build(): Data =
                Data(
                    checkRequired("embeddingDimension", embeddingDimension),
                    checkRequired("embeddingModel", embeddingModel),
                    checkRequired("identifier", identifier),
                    checkRequired("providerId", providerId),
                    checkRequired("providerResourceId", providerResourceId),
                    type,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && embeddingDimension == other.embeddingDimension && embeddingModel == other.embeddingModel && identifier == other.identifier && providerId == other.providerId && providerResourceId == other.providerResourceId && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(embeddingDimension, embeddingModel, identifier, providerId, providerResourceId, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{embeddingDimension=$embeddingDimension, embeddingModel=$embeddingModel, identifier=$identifier, providerId=$providerId, providerResourceId=$providerResourceId, type=$type, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ListVectorDbsResponse && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ListVectorDbsResponse{data=$data, additionalProperties=$additionalProperties}"
}
