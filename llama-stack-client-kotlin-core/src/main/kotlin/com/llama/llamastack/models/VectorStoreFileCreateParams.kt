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
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.Params
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Collections
import java.util.Objects

/** Attach a file to a vector store. */
class VectorStoreFileCreateParams
private constructor(
    private val vectorStoreId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun vectorStoreId(): String? = vectorStoreId

    /**
     * The ID of the file to attach to the vector store.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fileId(): String = body.fileId()

    /**
     * The key-value attributes stored with the file, which can be used for filtering.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun attributes(): Attributes? = body.attributes()

    /**
     * The chunking strategy to use for the file.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun chunkingStrategy(): ChunkingStrategy? = body.chunkingStrategy()

    /**
     * Returns the raw JSON value of [fileId].
     *
     * Unlike [fileId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _fileId(): JsonField<String> = body._fileId()

    /**
     * Returns the raw JSON value of [attributes].
     *
     * Unlike [attributes], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _attributes(): JsonField<Attributes> = body._attributes()

    /**
     * Returns the raw JSON value of [chunkingStrategy].
     *
     * Unlike [chunkingStrategy], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _chunkingStrategy(): JsonField<ChunkingStrategy> = body._chunkingStrategy()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [VectorStoreFileCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .fileId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [VectorStoreFileCreateParams]. */
    class Builder internal constructor() {

        private var vectorStoreId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(vectorStoreFileCreateParams: VectorStoreFileCreateParams) = apply {
            vectorStoreId = vectorStoreFileCreateParams.vectorStoreId
            body = vectorStoreFileCreateParams.body.toBuilder()
            additionalHeaders = vectorStoreFileCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = vectorStoreFileCreateParams.additionalQueryParams.toBuilder()
        }

        fun vectorStoreId(vectorStoreId: String?) = apply { this.vectorStoreId = vectorStoreId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [fileId]
         * - [attributes]
         * - [chunkingStrategy]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The ID of the file to attach to the vector store. */
        fun fileId(fileId: String) = apply { body.fileId(fileId) }

        /**
         * Sets [Builder.fileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fileId(fileId: JsonField<String>) = apply { body.fileId(fileId) }

        /** The key-value attributes stored with the file, which can be used for filtering. */
        fun attributes(attributes: Attributes) = apply { body.attributes(attributes) }

        /**
         * Sets [Builder.attributes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attributes] with a well-typed [Attributes] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun attributes(attributes: JsonField<Attributes>) = apply { body.attributes(attributes) }

        /** The chunking strategy to use for the file. */
        fun chunkingStrategy(chunkingStrategy: ChunkingStrategy) = apply {
            body.chunkingStrategy(chunkingStrategy)
        }

        /**
         * Sets [Builder.chunkingStrategy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chunkingStrategy] with a well-typed [ChunkingStrategy]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun chunkingStrategy(chunkingStrategy: JsonField<ChunkingStrategy>) = apply {
            body.chunkingStrategy(chunkingStrategy)
        }

        /** Alias for calling [chunkingStrategy] with `ChunkingStrategy.ofAuto()`. */
        fun chunkingStrategyAuto() = apply { body.chunkingStrategyAuto() }

        /** Alias for calling [chunkingStrategy] with `ChunkingStrategy.ofStatic(static)`. */
        fun chunkingStrategy(static: ChunkingStrategy.Static) = apply {
            body.chunkingStrategy(static)
        }

        /**
         * Alias for calling [chunkingStrategy] with the following:
         * ```kotlin
         * ChunkingStrategy.Static.builder()
         *     .static(static)
         *     .build()
         * ```
         */
        fun staticChunkingStrategy(static: ChunkingStrategy.Static.InnerStatic) = apply {
            body.staticChunkingStrategy(static)
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
         * Returns an immutable instance of [VectorStoreFileCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .fileId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VectorStoreFileCreateParams =
            VectorStoreFileCreateParams(
                vectorStoreId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> vectorStoreId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val fileId: JsonField<String>,
        private val attributes: JsonField<Attributes>,
        private val chunkingStrategy: JsonField<ChunkingStrategy>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("file_id") @ExcludeMissing fileId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("attributes")
            @ExcludeMissing
            attributes: JsonField<Attributes> = JsonMissing.of(),
            @JsonProperty("chunking_strategy")
            @ExcludeMissing
            chunkingStrategy: JsonField<ChunkingStrategy> = JsonMissing.of(),
        ) : this(fileId, attributes, chunkingStrategy, mutableMapOf())

        /**
         * The ID of the file to attach to the vector store.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun fileId(): String = fileId.getRequired("file_id")

        /**
         * The key-value attributes stored with the file, which can be used for filtering.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun attributes(): Attributes? = attributes.getNullable("attributes")

        /**
         * The chunking strategy to use for the file.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun chunkingStrategy(): ChunkingStrategy? =
            chunkingStrategy.getNullable("chunking_strategy")

        /**
         * Returns the raw JSON value of [fileId].
         *
         * Unlike [fileId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("file_id") @ExcludeMissing fun _fileId(): JsonField<String> = fileId

        /**
         * Returns the raw JSON value of [attributes].
         *
         * Unlike [attributes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("attributes")
        @ExcludeMissing
        fun _attributes(): JsonField<Attributes> = attributes

        /**
         * Returns the raw JSON value of [chunkingStrategy].
         *
         * Unlike [chunkingStrategy], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("chunking_strategy")
        @ExcludeMissing
        fun _chunkingStrategy(): JsonField<ChunkingStrategy> = chunkingStrategy

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
             * .fileId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var fileId: JsonField<String>? = null
            private var attributes: JsonField<Attributes> = JsonMissing.of()
            private var chunkingStrategy: JsonField<ChunkingStrategy> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                fileId = body.fileId
                attributes = body.attributes
                chunkingStrategy = body.chunkingStrategy
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The ID of the file to attach to the vector store. */
            fun fileId(fileId: String) = fileId(JsonField.of(fileId))

            /**
             * Sets [Builder.fileId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fileId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

            /** The key-value attributes stored with the file, which can be used for filtering. */
            fun attributes(attributes: Attributes) = attributes(JsonField.of(attributes))

            /**
             * Sets [Builder.attributes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.attributes] with a well-typed [Attributes] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun attributes(attributes: JsonField<Attributes>) = apply {
                this.attributes = attributes
            }

            /** The chunking strategy to use for the file. */
            fun chunkingStrategy(chunkingStrategy: ChunkingStrategy) =
                chunkingStrategy(JsonField.of(chunkingStrategy))

            /**
             * Sets [Builder.chunkingStrategy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.chunkingStrategy] with a well-typed
             * [ChunkingStrategy] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun chunkingStrategy(chunkingStrategy: JsonField<ChunkingStrategy>) = apply {
                this.chunkingStrategy = chunkingStrategy
            }

            /** Alias for calling [chunkingStrategy] with `ChunkingStrategy.ofAuto()`. */
            fun chunkingStrategyAuto() = chunkingStrategy(ChunkingStrategy.ofAuto())

            /** Alias for calling [chunkingStrategy] with `ChunkingStrategy.ofStatic(static)`. */
            fun chunkingStrategy(static: ChunkingStrategy.Static) =
                chunkingStrategy(ChunkingStrategy.ofStatic(static))

            /**
             * Alias for calling [chunkingStrategy] with the following:
             * ```kotlin
             * ChunkingStrategy.Static.builder()
             *     .static(static)
             *     .build()
             * ```
             */
            fun staticChunkingStrategy(static: ChunkingStrategy.Static.InnerStatic) =
                chunkingStrategy(ChunkingStrategy.Static.builder().static(static).build())

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
             * .fileId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("fileId", fileId),
                    attributes,
                    chunkingStrategy,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            fileId()
            attributes()?.validate()
            chunkingStrategy()?.validate()
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
            (if (fileId.asKnown() == null) 0 else 1) +
                (attributes.asKnown()?.validity() ?: 0) +
                (chunkingStrategy.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && fileId == other.fileId && attributes == other.attributes && chunkingStrategy == other.chunkingStrategy && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(fileId, attributes, chunkingStrategy, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{fileId=$fileId, attributes=$attributes, chunkingStrategy=$chunkingStrategy, additionalProperties=$additionalProperties}"
    }

    /** The key-value attributes stored with the file, which can be used for filtering. */
    class Attributes
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Attributes]. */
            fun builder() = Builder()
        }

        /** A builder for [Attributes]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(attributes: Attributes) = apply {
                additionalProperties = attributes.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Attributes].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Attributes = Attributes(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Attributes = apply {
            if (validated) {
                return@apply
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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Attributes && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Attributes{additionalProperties=$additionalProperties}"
    }

    /** The chunking strategy to use for the file. */
    @JsonDeserialize(using = ChunkingStrategy.Deserializer::class)
    @JsonSerialize(using = ChunkingStrategy.Serializer::class)
    class ChunkingStrategy
    private constructor(
        private val auto: JsonValue? = null,
        private val static: Static? = null,
        private val _json: JsonValue? = null,
    ) {

        fun auto(): JsonValue? = auto

        fun static(): Static? = static

        fun isAuto(): Boolean = auto != null

        fun isStatic(): Boolean = static != null

        fun asAuto(): JsonValue = auto.getOrThrow("auto")

        fun asStatic(): Static = static.getOrThrow("static")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                auto != null -> visitor.visitAuto(auto)
                static != null -> visitor.visitStatic(static)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): ChunkingStrategy = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitAuto(auto: JsonValue) {
                        auto.let {
                            if (it != JsonValue.from(mapOf("type" to "auto"))) {
                                throw LlamaStackClientInvalidDataException(
                                    "'auto' is invalid, received $it"
                                )
                            }
                        }
                    }

                    override fun visitStatic(static: Static) {
                        static.validate()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitAuto(auto: JsonValue) =
                        auto.let { if (it == JsonValue.from(mapOf("type" to "auto"))) 1 else 0 }

                    override fun visitStatic(static: Static) = static.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ChunkingStrategy && auto == other.auto && static == other.static /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(auto, static) /* spotless:on */

        override fun toString(): String =
            when {
                auto != null -> "ChunkingStrategy{auto=$auto}"
                static != null -> "ChunkingStrategy{static=$static}"
                _json != null -> "ChunkingStrategy{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid ChunkingStrategy")
            }

        companion object {

            fun ofAuto() = ChunkingStrategy(auto = JsonValue.from(mapOf("type" to "auto")))

            fun ofStatic(static: Static) = ChunkingStrategy(static = static)
        }

        /**
         * An interface that defines how to map each variant of [ChunkingStrategy] to a value of
         * type [T].
         */
        interface Visitor<out T> {

            fun visitAuto(auto: JsonValue): T

            fun visitStatic(static: Static): T

            /**
             * Maps an unknown variant of [ChunkingStrategy] to a value of type [T].
             *
             * An instance of [ChunkingStrategy] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws LlamaStackClientInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown ChunkingStrategy: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<ChunkingStrategy>(ChunkingStrategy::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): ChunkingStrategy {
                val json = JsonValue.fromJsonNode(node)
                val type = json.asObject()?.get("type")?.asString()

                when (type) {
                    "auto" -> {
                        return tryDeserialize(node, jacksonTypeRef<JsonValue>())
                            ?.let { ChunkingStrategy(auto = it, _json = json) }
                            ?.takeIf { it.isValid() } ?: ChunkingStrategy(_json = json)
                    }
                    "static" -> {
                        return tryDeserialize(node, jacksonTypeRef<Static>())?.let {
                            ChunkingStrategy(static = it, _json = json)
                        } ?: ChunkingStrategy(_json = json)
                    }
                }

                return ChunkingStrategy(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<ChunkingStrategy>(ChunkingStrategy::class) {

            override fun serialize(
                value: ChunkingStrategy,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.auto != null -> generator.writeObject(value.auto)
                    value.static != null -> generator.writeObject(value.static)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid ChunkingStrategy")
                }
            }
        }

        class Static
        private constructor(
            private val static: JsonField<InnerStatic>,
            private val type: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("static")
                @ExcludeMissing
                static: JsonField<InnerStatic> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
            ) : this(static, type, mutableMapOf())

            /**
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun static(): InnerStatic = static.getRequired("static")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("static")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * Returns the raw JSON value of [static].
             *
             * Unlike [static], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("static") @ExcludeMissing fun _static(): JsonField<InnerStatic> = static

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
                 * Returns a mutable builder for constructing an instance of [Static].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .static()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Static]. */
            class Builder internal constructor() {

                private var static: JsonField<InnerStatic>? = null
                private var type: JsonValue = JsonValue.from("static")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(static: Static) = apply {
                    this.static = static.static
                    type = static.type
                    additionalProperties = static.additionalProperties.toMutableMap()
                }

                fun static(static: InnerStatic) = static(JsonField.of(static))

                /**
                 * Sets [Builder.static] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.static] with a well-typed [InnerStatic] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun static(static: JsonField<InnerStatic>) = apply { this.static = static }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("static")
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

                /**
                 * Returns an immutable instance of [Static].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .static()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Static =
                    Static(
                        checkRequired("static", static),
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Static = apply {
                if (validated) {
                    return@apply
                }

                static().validate()
                _type().let {
                    if (it != JsonValue.from("static")) {
                        throw LlamaStackClientInvalidDataException(
                            "'type' is invalid, received $it"
                        )
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
                (static.asKnown()?.validity() ?: 0) +
                    type.let { if (it == JsonValue.from("static")) 1 else 0 }

            class InnerStatic
            private constructor(
                private val chunkOverlapTokens: JsonField<Long>,
                private val maxChunkSizeTokens: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("chunk_overlap_tokens")
                    @ExcludeMissing
                    chunkOverlapTokens: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("max_chunk_size_tokens")
                    @ExcludeMissing
                    maxChunkSizeTokens: JsonField<Long> = JsonMissing.of(),
                ) : this(chunkOverlapTokens, maxChunkSizeTokens, mutableMapOf())

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun chunkOverlapTokens(): Long =
                    chunkOverlapTokens.getRequired("chunk_overlap_tokens")

                /**
                 * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun maxChunkSizeTokens(): Long =
                    maxChunkSizeTokens.getRequired("max_chunk_size_tokens")

                /**
                 * Returns the raw JSON value of [chunkOverlapTokens].
                 *
                 * Unlike [chunkOverlapTokens], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("chunk_overlap_tokens")
                @ExcludeMissing
                fun _chunkOverlapTokens(): JsonField<Long> = chunkOverlapTokens

                /**
                 * Returns the raw JSON value of [maxChunkSizeTokens].
                 *
                 * Unlike [maxChunkSizeTokens], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("max_chunk_size_tokens")
                @ExcludeMissing
                fun _maxChunkSizeTokens(): JsonField<Long> = maxChunkSizeTokens

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
                     * Returns a mutable builder for constructing an instance of [InnerStatic].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .chunkOverlapTokens()
                     * .maxChunkSizeTokens()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [InnerStatic]. */
                class Builder internal constructor() {

                    private var chunkOverlapTokens: JsonField<Long>? = null
                    private var maxChunkSizeTokens: JsonField<Long>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(innerStatic: InnerStatic) = apply {
                        chunkOverlapTokens = innerStatic.chunkOverlapTokens
                        maxChunkSizeTokens = innerStatic.maxChunkSizeTokens
                        additionalProperties = innerStatic.additionalProperties.toMutableMap()
                    }

                    fun chunkOverlapTokens(chunkOverlapTokens: Long) =
                        chunkOverlapTokens(JsonField.of(chunkOverlapTokens))

                    /**
                     * Sets [Builder.chunkOverlapTokens] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.chunkOverlapTokens] with a well-typed [Long]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun chunkOverlapTokens(chunkOverlapTokens: JsonField<Long>) = apply {
                        this.chunkOverlapTokens = chunkOverlapTokens
                    }

                    fun maxChunkSizeTokens(maxChunkSizeTokens: Long) =
                        maxChunkSizeTokens(JsonField.of(maxChunkSizeTokens))

                    /**
                     * Sets [Builder.maxChunkSizeTokens] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.maxChunkSizeTokens] with a well-typed [Long]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun maxChunkSizeTokens(maxChunkSizeTokens: JsonField<Long>) = apply {
                        this.maxChunkSizeTokens = maxChunkSizeTokens
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

                    /**
                     * Returns an immutable instance of [InnerStatic].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .chunkOverlapTokens()
                     * .maxChunkSizeTokens()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): InnerStatic =
                        InnerStatic(
                            checkRequired("chunkOverlapTokens", chunkOverlapTokens),
                            checkRequired("maxChunkSizeTokens", maxChunkSizeTokens),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): InnerStatic = apply {
                    if (validated) {
                        return@apply
                    }

                    chunkOverlapTokens()
                    maxChunkSizeTokens()
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
                    (if (chunkOverlapTokens.asKnown() == null) 0 else 1) +
                        (if (maxChunkSizeTokens.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is InnerStatic && chunkOverlapTokens == other.chunkOverlapTokens && maxChunkSizeTokens == other.maxChunkSizeTokens && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(chunkOverlapTokens, maxChunkSizeTokens, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "InnerStatic{chunkOverlapTokens=$chunkOverlapTokens, maxChunkSizeTokens=$maxChunkSizeTokens, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Static && static == other.static && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(static, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Static{static=$static, type=$type, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is VectorStoreFileCreateParams && vectorStoreId == other.vectorStoreId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(vectorStoreId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "VectorStoreFileCreateParams{vectorStoreId=$vectorStoreId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
