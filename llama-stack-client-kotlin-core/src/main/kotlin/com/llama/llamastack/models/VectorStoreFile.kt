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
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Collections
import java.util.Objects

/** OpenAI Vector Store File object. */
class VectorStoreFile
private constructor(
    private val id: JsonField<String>,
    private val attributes: JsonField<Attributes>,
    private val chunkingStrategy: JsonField<ChunkingStrategy>,
    private val createdAt: JsonField<Long>,
    private val object_: JsonField<String>,
    private val status: JsonField<Status>,
    private val usageBytes: JsonField<Long>,
    private val vectorStoreId: JsonField<String>,
    private val lastError: JsonField<LastError>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("attributes")
        @ExcludeMissing
        attributes: JsonField<Attributes> = JsonMissing.of(),
        @JsonProperty("chunking_strategy")
        @ExcludeMissing
        chunkingStrategy: JsonField<ChunkingStrategy> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("object") @ExcludeMissing object_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("usage_bytes") @ExcludeMissing usageBytes: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("vector_store_id")
        @ExcludeMissing
        vectorStoreId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("last_error")
        @ExcludeMissing
        lastError: JsonField<LastError> = JsonMissing.of(),
    ) : this(
        id,
        attributes,
        chunkingStrategy,
        createdAt,
        object_,
        status,
        usageBytes,
        vectorStoreId,
        lastError,
        mutableMapOf(),
    )

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun attributes(): Attributes = attributes.getRequired("attributes")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun chunkingStrategy(): ChunkingStrategy = chunkingStrategy.getRequired("chunking_strategy")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): Long = createdAt.getRequired("created_at")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun object_(): String = object_.getRequired("object")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun usageBytes(): Long = usageBytes.getRequired("usage_bytes")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun vectorStoreId(): String = vectorStoreId.getRequired("vector_store_id")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lastError(): LastError? = lastError.getNullable("last_error")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<Long> = createdAt

    /**
     * Returns the raw JSON value of [object_].
     *
     * Unlike [object_], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [usageBytes].
     *
     * Unlike [usageBytes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("usage_bytes") @ExcludeMissing fun _usageBytes(): JsonField<Long> = usageBytes

    /**
     * Returns the raw JSON value of [vectorStoreId].
     *
     * Unlike [vectorStoreId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vector_store_id")
    @ExcludeMissing
    fun _vectorStoreId(): JsonField<String> = vectorStoreId

    /**
     * Returns the raw JSON value of [lastError].
     *
     * Unlike [lastError], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_error") @ExcludeMissing fun _lastError(): JsonField<LastError> = lastError

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
         * Returns a mutable builder for constructing an instance of [VectorStoreFile].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .attributes()
         * .chunkingStrategy()
         * .createdAt()
         * .object_()
         * .status()
         * .usageBytes()
         * .vectorStoreId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [VectorStoreFile]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var attributes: JsonField<Attributes>? = null
        private var chunkingStrategy: JsonField<ChunkingStrategy>? = null
        private var createdAt: JsonField<Long>? = null
        private var object_: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var usageBytes: JsonField<Long>? = null
        private var vectorStoreId: JsonField<String>? = null
        private var lastError: JsonField<LastError> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(vectorStoreFile: VectorStoreFile) = apply {
            id = vectorStoreFile.id
            attributes = vectorStoreFile.attributes
            chunkingStrategy = vectorStoreFile.chunkingStrategy
            createdAt = vectorStoreFile.createdAt
            object_ = vectorStoreFile.object_
            status = vectorStoreFile.status
            usageBytes = vectorStoreFile.usageBytes
            vectorStoreId = vectorStoreFile.vectorStoreId
            lastError = vectorStoreFile.lastError
            additionalProperties = vectorStoreFile.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun attributes(attributes: Attributes) = attributes(JsonField.of(attributes))

        /**
         * Sets [Builder.attributes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attributes] with a well-typed [Attributes] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun attributes(attributes: JsonField<Attributes>) = apply { this.attributes = attributes }

        fun chunkingStrategy(chunkingStrategy: ChunkingStrategy) =
            chunkingStrategy(JsonField.of(chunkingStrategy))

        /**
         * Sets [Builder.chunkingStrategy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chunkingStrategy] with a well-typed [ChunkingStrategy]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
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

        fun createdAt(createdAt: Long) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun createdAt(createdAt: JsonField<Long>) = apply { this.createdAt = createdAt }

        fun object_(object_: String) = object_(JsonField.of(object_))

        /**
         * Sets [Builder.object_] to an arbitrary JSON value.
         *
         * You should usually call [Builder.object_] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun usageBytes(usageBytes: Long) = usageBytes(JsonField.of(usageBytes))

        /**
         * Sets [Builder.usageBytes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usageBytes] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun usageBytes(usageBytes: JsonField<Long>) = apply { this.usageBytes = usageBytes }

        fun vectorStoreId(vectorStoreId: String) = vectorStoreId(JsonField.of(vectorStoreId))

        /**
         * Sets [Builder.vectorStoreId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vectorStoreId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun vectorStoreId(vectorStoreId: JsonField<String>) = apply {
            this.vectorStoreId = vectorStoreId
        }

        fun lastError(lastError: LastError) = lastError(JsonField.of(lastError))

        /**
         * Sets [Builder.lastError] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastError] with a well-typed [LastError] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lastError(lastError: JsonField<LastError>) = apply { this.lastError = lastError }

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
         * Returns an immutable instance of [VectorStoreFile].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .attributes()
         * .chunkingStrategy()
         * .createdAt()
         * .object_()
         * .status()
         * .usageBytes()
         * .vectorStoreId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VectorStoreFile =
            VectorStoreFile(
                checkRequired("id", id),
                checkRequired("attributes", attributes),
                checkRequired("chunkingStrategy", chunkingStrategy),
                checkRequired("createdAt", createdAt),
                checkRequired("object_", object_),
                checkRequired("status", status),
                checkRequired("usageBytes", usageBytes),
                checkRequired("vectorStoreId", vectorStoreId),
                lastError,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): VectorStoreFile = apply {
        if (validated) {
            return@apply
        }

        id()
        attributes().validate()
        chunkingStrategy().validate()
        createdAt()
        object_()
        status().validate()
        usageBytes()
        vectorStoreId()
        lastError()?.validate()
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
        (if (id.asKnown() == null) 0 else 1) +
            (attributes.asKnown()?.validity() ?: 0) +
            (chunkingStrategy.asKnown()?.validity() ?: 0) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (object_.asKnown() == null) 0 else 1) +
            (status.asKnown()?.validity() ?: 0) +
            (if (usageBytes.asKnown() == null) 0 else 1) +
            (if (vectorStoreId.asKnown() == null) 0 else 1) +
            (lastError.asKnown()?.validity() ?: 0)

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

    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val COMPLETED = of("completed")

            val IN_PROGRESS = of("in_progress")

            val CANCELLED = of("cancelled")

            val FAILED = of("failed")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            COMPLETED,
            IN_PROGRESS,
            CANCELLED,
            FAILED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            COMPLETED,
            IN_PROGRESS,
            CANCELLED,
            FAILED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                COMPLETED -> Value.COMPLETED
                IN_PROGRESS -> Value.IN_PROGRESS
                CANCELLED -> Value.CANCELLED
                FAILED -> Value.FAILED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LlamaStackClientInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                COMPLETED -> Known.COMPLETED
                IN_PROGRESS -> Known.IN_PROGRESS
                CANCELLED -> Known.CANCELLED
                FAILED -> Known.FAILED
                else -> throw LlamaStackClientInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LlamaStackClientInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString()
                ?: throw LlamaStackClientInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        fun validate(): Status = apply {
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

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class LastError
    private constructor(
        private val code: JsonField<Code>,
        private val message: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("code") @ExcludeMissing code: JsonField<Code> = JsonMissing.of(),
            @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        ) : this(code, message, mutableMapOf())

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun code(): Code = code.getRequired("code")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun message(): String = message.getRequired("message")

        /**
         * Returns the raw JSON value of [code].
         *
         * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<Code> = code

        /**
         * Returns the raw JSON value of [message].
         *
         * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

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
             * Returns a mutable builder for constructing an instance of [LastError].
             *
             * The following fields are required:
             * ```kotlin
             * .code()
             * .message()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [LastError]. */
        class Builder internal constructor() {

            private var code: JsonField<Code>? = null
            private var message: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(lastError: LastError) = apply {
                code = lastError.code
                message = lastError.message
                additionalProperties = lastError.additionalProperties.toMutableMap()
            }

            fun code(code: Code) = code(JsonField.of(code))

            /**
             * Sets [Builder.code] to an arbitrary JSON value.
             *
             * You should usually call [Builder.code] with a well-typed [Code] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun code(code: JsonField<Code>) = apply { this.code = code }

            fun message(message: String) = message(JsonField.of(message))

            /**
             * Sets [Builder.message] to an arbitrary JSON value.
             *
             * You should usually call [Builder.message] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun message(message: JsonField<String>) = apply { this.message = message }

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
             * Returns an immutable instance of [LastError].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .code()
             * .message()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): LastError =
                LastError(
                    checkRequired("code", code),
                    checkRequired("message", message),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): LastError = apply {
            if (validated) {
                return@apply
            }

            code().validate()
            message()
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
            (code.asKnown()?.validity() ?: 0) + (if (message.asKnown() == null) 0 else 1)

        class Code @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                val SERVER_ERROR = of("server_error")

                val RATE_LIMIT_EXCEEDED = of("rate_limit_exceeded")

                fun of(value: String) = Code(JsonField.of(value))
            }

            /** An enum containing [Code]'s known values. */
            enum class Known {
                SERVER_ERROR,
                RATE_LIMIT_EXCEEDED,
            }

            /**
             * An enum containing [Code]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Code] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                SERVER_ERROR,
                RATE_LIMIT_EXCEEDED,
                /** An enum member indicating that [Code] was instantiated with an unknown value. */
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
                    SERVER_ERROR -> Value.SERVER_ERROR
                    RATE_LIMIT_EXCEEDED -> Value.RATE_LIMIT_EXCEEDED
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
                    SERVER_ERROR -> Known.SERVER_ERROR
                    RATE_LIMIT_EXCEEDED -> Known.RATE_LIMIT_EXCEEDED
                    else -> throw LlamaStackClientInvalidDataException("Unknown Code: $value")
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

            fun validate(): Code = apply {
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

                return /* spotless:off */ other is Code && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LastError && code == other.code && message == other.message && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(code, message, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LastError{code=$code, message=$message, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is VectorStoreFile && id == other.id && attributes == other.attributes && chunkingStrategy == other.chunkingStrategy && createdAt == other.createdAt && object_ == other.object_ && status == other.status && usageBytes == other.usageBytes && vectorStoreId == other.vectorStoreId && lastError == other.lastError && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, attributes, chunkingStrategy, createdAt, object_, status, usageBytes, vectorStoreId, lastError, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VectorStoreFile{id=$id, attributes=$attributes, chunkingStrategy=$chunkingStrategy, createdAt=$createdAt, object_=$object_, status=$status, usageBytes=$usageBytes, vectorStoreId=$vectorStoreId, lastError=$lastError, additionalProperties=$additionalProperties}"
}
