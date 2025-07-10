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
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Collections
import java.util.Objects

/** Configuration for the RAG query generation. */
class QueryConfig
private constructor(
    private val chunkTemplate: JsonField<String>,
    private val maxChunks: JsonField<Long>,
    private val maxTokensInContext: JsonField<Long>,
    private val queryGeneratorConfig: JsonField<QueryGeneratorConfig>,
    private val mode: JsonField<String>,
    private val ranker: JsonField<Ranker>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("chunk_template")
        @ExcludeMissing
        chunkTemplate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("max_chunks") @ExcludeMissing maxChunks: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("max_tokens_in_context")
        @ExcludeMissing
        maxTokensInContext: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("query_generator_config")
        @ExcludeMissing
        queryGeneratorConfig: JsonField<QueryGeneratorConfig> = JsonMissing.of(),
        @JsonProperty("mode") @ExcludeMissing mode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ranker") @ExcludeMissing ranker: JsonField<Ranker> = JsonMissing.of(),
    ) : this(
        chunkTemplate,
        maxChunks,
        maxTokensInContext,
        queryGeneratorConfig,
        mode,
        ranker,
        mutableMapOf(),
    )

    /**
     * Template for formatting each retrieved chunk in the context. Available placeholders: {index}
     * (1-based chunk ordinal), {chunk.content} (chunk content string), {metadata} (chunk metadata
     * dict). Default: "Result {index}\nContent: {chunk.content}\nMetadata: {metadata}\n"
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun chunkTemplate(): String = chunkTemplate.getRequired("chunk_template")

    /**
     * Maximum number of chunks to retrieve.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun maxChunks(): Long = maxChunks.getRequired("max_chunks")

    /**
     * Maximum number of tokens in the context.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun maxTokensInContext(): Long = maxTokensInContext.getRequired("max_tokens_in_context")

    /**
     * Configuration for the query generator.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun queryGeneratorConfig(): QueryGeneratorConfig =
        queryGeneratorConfig.getRequired("query_generator_config")

    /**
     * Search mode for retrieval—either "vector", "keyword", or "hybrid". Default "vector".
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun mode(): String? = mode.getNullable("mode")

    /**
     * Configuration for the ranker to use in hybrid search. Defaults to RRF ranker.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ranker(): Ranker? = ranker.getNullable("ranker")

    /**
     * Returns the raw JSON value of [chunkTemplate].
     *
     * Unlike [chunkTemplate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("chunk_template")
    @ExcludeMissing
    fun _chunkTemplate(): JsonField<String> = chunkTemplate

    /**
     * Returns the raw JSON value of [maxChunks].
     *
     * Unlike [maxChunks], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("max_chunks") @ExcludeMissing fun _maxChunks(): JsonField<Long> = maxChunks

    /**
     * Returns the raw JSON value of [maxTokensInContext].
     *
     * Unlike [maxTokensInContext], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("max_tokens_in_context")
    @ExcludeMissing
    fun _maxTokensInContext(): JsonField<Long> = maxTokensInContext

    /**
     * Returns the raw JSON value of [queryGeneratorConfig].
     *
     * Unlike [queryGeneratorConfig], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("query_generator_config")
    @ExcludeMissing
    fun _queryGeneratorConfig(): JsonField<QueryGeneratorConfig> = queryGeneratorConfig

    /**
     * Returns the raw JSON value of [mode].
     *
     * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<String> = mode

    /**
     * Returns the raw JSON value of [ranker].
     *
     * Unlike [ranker], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ranker") @ExcludeMissing fun _ranker(): JsonField<Ranker> = ranker

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
         * Returns a mutable builder for constructing an instance of [QueryConfig].
         *
         * The following fields are required:
         * ```kotlin
         * .chunkTemplate()
         * .maxChunks()
         * .maxTokensInContext()
         * .queryGeneratorConfig()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [QueryConfig]. */
    class Builder internal constructor() {

        private var chunkTemplate: JsonField<String>? = null
        private var maxChunks: JsonField<Long>? = null
        private var maxTokensInContext: JsonField<Long>? = null
        private var queryGeneratorConfig: JsonField<QueryGeneratorConfig>? = null
        private var mode: JsonField<String> = JsonMissing.of()
        private var ranker: JsonField<Ranker> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(queryConfig: QueryConfig) = apply {
            chunkTemplate = queryConfig.chunkTemplate
            maxChunks = queryConfig.maxChunks
            maxTokensInContext = queryConfig.maxTokensInContext
            queryGeneratorConfig = queryConfig.queryGeneratorConfig
            mode = queryConfig.mode
            ranker = queryConfig.ranker
            additionalProperties = queryConfig.additionalProperties.toMutableMap()
        }

        /**
         * Template for formatting each retrieved chunk in the context. Available placeholders:
         * {index} (1-based chunk ordinal), {chunk.content} (chunk content string), {metadata}
         * (chunk metadata dict). Default: "Result {index}\nContent: {chunk.content}\nMetadata:
         * {metadata}\n"
         */
        fun chunkTemplate(chunkTemplate: String) = chunkTemplate(JsonField.of(chunkTemplate))

        /**
         * Sets [Builder.chunkTemplate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chunkTemplate] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun chunkTemplate(chunkTemplate: JsonField<String>) = apply {
            this.chunkTemplate = chunkTemplate
        }

        /** Maximum number of chunks to retrieve. */
        fun maxChunks(maxChunks: Long) = maxChunks(JsonField.of(maxChunks))

        /**
         * Sets [Builder.maxChunks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxChunks] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxChunks(maxChunks: JsonField<Long>) = apply { this.maxChunks = maxChunks }

        /** Maximum number of tokens in the context. */
        fun maxTokensInContext(maxTokensInContext: Long) =
            maxTokensInContext(JsonField.of(maxTokensInContext))

        /**
         * Sets [Builder.maxTokensInContext] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxTokensInContext] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxTokensInContext(maxTokensInContext: JsonField<Long>) = apply {
            this.maxTokensInContext = maxTokensInContext
        }

        /** Configuration for the query generator. */
        fun queryGeneratorConfig(queryGeneratorConfig: QueryGeneratorConfig) =
            queryGeneratorConfig(JsonField.of(queryGeneratorConfig))

        /**
         * Sets [Builder.queryGeneratorConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.queryGeneratorConfig] with a well-typed
         * [QueryGeneratorConfig] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun queryGeneratorConfig(queryGeneratorConfig: JsonField<QueryGeneratorConfig>) = apply {
            this.queryGeneratorConfig = queryGeneratorConfig
        }

        /**
         * Alias for calling [queryGeneratorConfig] with `QueryGeneratorConfig.ofDefault(default)`.
         */
        fun queryGeneratorConfig(default: QueryGeneratorConfig.Default) =
            queryGeneratorConfig(QueryGeneratorConfig.ofDefault(default))

        /**
         * Alias for calling [queryGeneratorConfig] with the following:
         * ```kotlin
         * QueryGeneratorConfig.Default.builder()
         *     .separator(separator)
         *     .build()
         * ```
         */
        fun defaultQueryGeneratorConfig(separator: String) =
            queryGeneratorConfig(
                QueryGeneratorConfig.Default.builder().separator(separator).build()
            )

        /** Alias for calling [queryGeneratorConfig] with `QueryGeneratorConfig.ofLlm(llm)`. */
        fun queryGeneratorConfig(llm: QueryGeneratorConfig.Llm) =
            queryGeneratorConfig(QueryGeneratorConfig.ofLlm(llm))

        /** Search mode for retrieval—either "vector", "keyword", or "hybrid". Default "vector". */
        fun mode(mode: String) = mode(JsonField.of(mode))

        /**
         * Sets [Builder.mode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mode] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mode(mode: JsonField<String>) = apply { this.mode = mode }

        /** Configuration for the ranker to use in hybrid search. Defaults to RRF ranker. */
        fun ranker(ranker: Ranker) = ranker(JsonField.of(ranker))

        /**
         * Sets [Builder.ranker] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ranker] with a well-typed [Ranker] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ranker(ranker: JsonField<Ranker>) = apply { this.ranker = ranker }

        /** Alias for calling [ranker] with `Ranker.ofRrf(rrf)`. */
        fun ranker(rrf: Ranker.Rrf) = ranker(Ranker.ofRrf(rrf))

        /**
         * Alias for calling [ranker] with the following:
         * ```kotlin
         * Ranker.Rrf.builder()
         *     .impactFactor(impactFactor)
         *     .build()
         * ```
         */
        fun rrfRanker(impactFactor: Double) =
            ranker(Ranker.Rrf.builder().impactFactor(impactFactor).build())

        /** Alias for calling [ranker] with `Ranker.ofWeighted(weighted)`. */
        fun ranker(weighted: Ranker.Weighted) = ranker(Ranker.ofWeighted(weighted))

        /**
         * Alias for calling [ranker] with the following:
         * ```kotlin
         * Ranker.Weighted.builder()
         *     .alpha(alpha)
         *     .build()
         * ```
         */
        fun weightedRanker(alpha: Double) = ranker(Ranker.Weighted.builder().alpha(alpha).build())

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
         * Returns an immutable instance of [QueryConfig].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .chunkTemplate()
         * .maxChunks()
         * .maxTokensInContext()
         * .queryGeneratorConfig()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): QueryConfig =
            QueryConfig(
                checkRequired("chunkTemplate", chunkTemplate),
                checkRequired("maxChunks", maxChunks),
                checkRequired("maxTokensInContext", maxTokensInContext),
                checkRequired("queryGeneratorConfig", queryGeneratorConfig),
                mode,
                ranker,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): QueryConfig = apply {
        if (validated) {
            return@apply
        }

        chunkTemplate()
        maxChunks()
        maxTokensInContext()
        queryGeneratorConfig().validate()
        mode()
        ranker()?.validate()
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
        (if (chunkTemplate.asKnown() == null) 0 else 1) +
            (if (maxChunks.asKnown() == null) 0 else 1) +
            (if (maxTokensInContext.asKnown() == null) 0 else 1) +
            (queryGeneratorConfig.asKnown()?.validity() ?: 0) +
            (if (mode.asKnown() == null) 0 else 1) +
            (ranker.asKnown()?.validity() ?: 0)

    /** Configuration for the ranker to use in hybrid search. Defaults to RRF ranker. */
    @JsonDeserialize(using = Ranker.Deserializer::class)
    @JsonSerialize(using = Ranker.Serializer::class)
    class Ranker
    private constructor(
        private val rrf: Rrf? = null,
        private val weighted: Weighted? = null,
        private val _json: JsonValue? = null,
    ) {

        /** Reciprocal Rank Fusion (RRF) ranker configuration. */
        fun rrf(): Rrf? = rrf

        /** Weighted ranker configuration that combines vector and keyword scores. */
        fun weighted(): Weighted? = weighted

        fun isRrf(): Boolean = rrf != null

        fun isWeighted(): Boolean = weighted != null

        /** Reciprocal Rank Fusion (RRF) ranker configuration. */
        fun asRrf(): Rrf = rrf.getOrThrow("rrf")

        /** Weighted ranker configuration that combines vector and keyword scores. */
        fun asWeighted(): Weighted = weighted.getOrThrow("weighted")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                rrf != null -> visitor.visitRrf(rrf)
                weighted != null -> visitor.visitWeighted(weighted)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Ranker = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitRrf(rrf: Rrf) {
                        rrf.validate()
                    }

                    override fun visitWeighted(weighted: Weighted) {
                        weighted.validate()
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
                    override fun visitRrf(rrf: Rrf) = rrf.validity()

                    override fun visitWeighted(weighted: Weighted) = weighted.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Ranker && rrf == other.rrf && weighted == other.weighted /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(rrf, weighted) /* spotless:on */

        override fun toString(): String =
            when {
                rrf != null -> "Ranker{rrf=$rrf}"
                weighted != null -> "Ranker{weighted=$weighted}"
                _json != null -> "Ranker{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Ranker")
            }

        companion object {

            /** Reciprocal Rank Fusion (RRF) ranker configuration. */
            fun ofRrf(rrf: Rrf) = Ranker(rrf = rrf)

            /** Weighted ranker configuration that combines vector and keyword scores. */
            fun ofWeighted(weighted: Weighted) = Ranker(weighted = weighted)
        }

        /** An interface that defines how to map each variant of [Ranker] to a value of type [T]. */
        interface Visitor<out T> {

            /** Reciprocal Rank Fusion (RRF) ranker configuration. */
            fun visitRrf(rrf: Rrf): T

            /** Weighted ranker configuration that combines vector and keyword scores. */
            fun visitWeighted(weighted: Weighted): T

            /**
             * Maps an unknown variant of [Ranker] to a value of type [T].
             *
             * An instance of [Ranker] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws LlamaStackClientInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown Ranker: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Ranker>(Ranker::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Ranker {
                val json = JsonValue.fromJsonNode(node)
                val type = json.asObject()?.get("type")?.asString()

                when (type) {
                    "rrf" -> {
                        return tryDeserialize(node, jacksonTypeRef<Rrf>())?.let {
                            Ranker(rrf = it, _json = json)
                        } ?: Ranker(_json = json)
                    }
                    "weighted" -> {
                        return tryDeserialize(node, jacksonTypeRef<Weighted>())?.let {
                            Ranker(weighted = it, _json = json)
                        } ?: Ranker(_json = json)
                    }
                }

                return Ranker(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Ranker>(Ranker::class) {

            override fun serialize(
                value: Ranker,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.rrf != null -> generator.writeObject(value.rrf)
                    value.weighted != null -> generator.writeObject(value.weighted)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Ranker")
                }
            }
        }

        /** Reciprocal Rank Fusion (RRF) ranker configuration. */
        class Rrf
        private constructor(
            private val impactFactor: JsonField<Double>,
            private val type: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("impact_factor")
                @ExcludeMissing
                impactFactor: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
            ) : this(impactFactor, type, mutableMapOf())

            /**
             * The impact factor for RRF scoring. Higher values give more weight to higher-ranked
             * results. Must be greater than 0. Default of 60 is from the original RRF paper
             * (Cormack et al., 2009).
             *
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun impactFactor(): Double = impactFactor.getRequired("impact_factor")

            /**
             * The type of ranker, always "rrf"
             *
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("rrf")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * Returns the raw JSON value of [impactFactor].
             *
             * Unlike [impactFactor], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("impact_factor")
            @ExcludeMissing
            fun _impactFactor(): JsonField<Double> = impactFactor

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
                 * Returns a mutable builder for constructing an instance of [Rrf].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .impactFactor()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Rrf]. */
            class Builder internal constructor() {

                private var impactFactor: JsonField<Double>? = null
                private var type: JsonValue = JsonValue.from("rrf")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(rrf: Rrf) = apply {
                    impactFactor = rrf.impactFactor
                    type = rrf.type
                    additionalProperties = rrf.additionalProperties.toMutableMap()
                }

                /**
                 * The impact factor for RRF scoring. Higher values give more weight to
                 * higher-ranked results. Must be greater than 0. Default of 60 is from the original
                 * RRF paper (Cormack et al., 2009).
                 */
                fun impactFactor(impactFactor: Double) = impactFactor(JsonField.of(impactFactor))

                /**
                 * Sets [Builder.impactFactor] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.impactFactor] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun impactFactor(impactFactor: JsonField<Double>) = apply {
                    this.impactFactor = impactFactor
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("rrf")
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
                 * Returns an immutable instance of [Rrf].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .impactFactor()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Rrf =
                    Rrf(
                        checkRequired("impactFactor", impactFactor),
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Rrf = apply {
                if (validated) {
                    return@apply
                }

                impactFactor()
                _type().let {
                    if (it != JsonValue.from("rrf")) {
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
                (if (impactFactor.asKnown() == null) 0 else 1) +
                    type.let { if (it == JsonValue.from("rrf")) 1 else 0 }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Rrf && impactFactor == other.impactFactor && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(impactFactor, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Rrf{impactFactor=$impactFactor, type=$type, additionalProperties=$additionalProperties}"
        }

        /** Weighted ranker configuration that combines vector and keyword scores. */
        class Weighted
        private constructor(
            private val alpha: JsonField<Double>,
            private val type: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("alpha") @ExcludeMissing alpha: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
            ) : this(alpha, type, mutableMapOf())

            /**
             * Weight factor between 0 and 1. 0 means only use keyword scores, 1 means only use
             * vector scores, values in between blend both scores.
             *
             * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun alpha(): Double = alpha.getRequired("alpha")

            /**
             * The type of ranker, always "weighted"
             *
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("weighted")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * Returns the raw JSON value of [alpha].
             *
             * Unlike [alpha], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("alpha") @ExcludeMissing fun _alpha(): JsonField<Double> = alpha

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
                 * Returns a mutable builder for constructing an instance of [Weighted].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .alpha()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Weighted]. */
            class Builder internal constructor() {

                private var alpha: JsonField<Double>? = null
                private var type: JsonValue = JsonValue.from("weighted")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(weighted: Weighted) = apply {
                    alpha = weighted.alpha
                    type = weighted.type
                    additionalProperties = weighted.additionalProperties.toMutableMap()
                }

                /**
                 * Weight factor between 0 and 1. 0 means only use keyword scores, 1 means only use
                 * vector scores, values in between blend both scores.
                 */
                fun alpha(alpha: Double) = alpha(JsonField.of(alpha))

                /**
                 * Sets [Builder.alpha] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.alpha] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun alpha(alpha: JsonField<Double>) = apply { this.alpha = alpha }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("weighted")
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
                 * Returns an immutable instance of [Weighted].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .alpha()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Weighted =
                    Weighted(
                        checkRequired("alpha", alpha),
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Weighted = apply {
                if (validated) {
                    return@apply
                }

                alpha()
                _type().let {
                    if (it != JsonValue.from("weighted")) {
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
                (if (alpha.asKnown() == null) 0 else 1) +
                    type.let { if (it == JsonValue.from("weighted")) 1 else 0 }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Weighted && alpha == other.alpha && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(alpha, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Weighted{alpha=$alpha, type=$type, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is QueryConfig && chunkTemplate == other.chunkTemplate && maxChunks == other.maxChunks && maxTokensInContext == other.maxTokensInContext && queryGeneratorConfig == other.queryGeneratorConfig && mode == other.mode && ranker == other.ranker && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(chunkTemplate, maxChunks, maxTokensInContext, queryGeneratorConfig, mode, ranker, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "QueryConfig{chunkTemplate=$chunkTemplate, maxChunks=$maxChunks, maxTokensInContext=$maxTokensInContext, queryGeneratorConfig=$queryGeneratorConfig, mode=$mode, ranker=$ranker, additionalProperties=$additionalProperties}"
}
