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

class QueryConfig
private constructor(
    private val maxChunks: JsonField<Long>,
    private val maxTokensInContext: JsonField<Long>,
    private val queryGeneratorConfig: JsonField<QueryGeneratorConfig>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("max_chunks") @ExcludeMissing maxChunks: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("max_tokens_in_context")
        @ExcludeMissing
        maxTokensInContext: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("query_generator_config")
        @ExcludeMissing
        queryGeneratorConfig: JsonField<QueryGeneratorConfig> = JsonMissing.of(),
    ) : this(maxChunks, maxTokensInContext, queryGeneratorConfig, mutableMapOf())

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun maxChunks(): Long = maxChunks.getRequired("max_chunks")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun maxTokensInContext(): Long = maxTokensInContext.getRequired("max_tokens_in_context")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun queryGeneratorConfig(): QueryGeneratorConfig =
        queryGeneratorConfig.getRequired("query_generator_config")

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
         * .maxChunks()
         * .maxTokensInContext()
         * .queryGeneratorConfig()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [QueryConfig]. */
    class Builder internal constructor() {

        private var maxChunks: JsonField<Long>? = null
        private var maxTokensInContext: JsonField<Long>? = null
        private var queryGeneratorConfig: JsonField<QueryGeneratorConfig>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(queryConfig: QueryConfig) = apply {
            maxChunks = queryConfig.maxChunks
            maxTokensInContext = queryConfig.maxTokensInContext
            queryGeneratorConfig = queryConfig.queryGeneratorConfig
            additionalProperties = queryConfig.additionalProperties.toMutableMap()
        }

        fun maxChunks(maxChunks: Long) = maxChunks(JsonField.of(maxChunks))

        /**
         * Sets [Builder.maxChunks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxChunks] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxChunks(maxChunks: JsonField<Long>) = apply { this.maxChunks = maxChunks }

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
         * Alias for calling [queryGeneratorConfig] with
         * `QueryGeneratorConfig.ofDefaultRag(defaultRag)`.
         */
        fun queryGeneratorConfig(defaultRag: QueryGeneratorConfig.DefaultRagQueryGeneratorConfig) =
            queryGeneratorConfig(QueryGeneratorConfig.ofDefaultRag(defaultRag))

        /**
         * Alias for calling [queryGeneratorConfig] with the following:
         * ```kotlin
         * QueryGeneratorConfig.DefaultRagQueryGeneratorConfig.builder()
         *     .separator(separator)
         *     .build()
         * ```
         */
        fun defaultRagQueryGeneratorConfig(separator: String) =
            queryGeneratorConfig(
                QueryGeneratorConfig.DefaultRagQueryGeneratorConfig.builder()
                    .separator(separator)
                    .build()
            )

        /**
         * Alias for calling [queryGeneratorConfig] with `QueryGeneratorConfig.ofLlmrag(llmrag)`.
         */
        fun queryGeneratorConfig(llmrag: QueryGeneratorConfig.LlmragQueryGeneratorConfig) =
            queryGeneratorConfig(QueryGeneratorConfig.ofLlmrag(llmrag))

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
         * .maxChunks()
         * .maxTokensInContext()
         * .queryGeneratorConfig()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): QueryConfig =
            QueryConfig(
                checkRequired("maxChunks", maxChunks),
                checkRequired("maxTokensInContext", maxTokensInContext),
                checkRequired("queryGeneratorConfig", queryGeneratorConfig),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): QueryConfig = apply {
        if (validated) {
            return@apply
        }

        maxChunks()
        maxTokensInContext()
        queryGeneratorConfig().validate()
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
        (if (maxChunks.asKnown() == null) 0 else 1) +
            (if (maxTokensInContext.asKnown() == null) 0 else 1) +
            (queryGeneratorConfig.asKnown()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is QueryConfig && maxChunks == other.maxChunks && maxTokensInContext == other.maxTokensInContext && queryGeneratorConfig == other.queryGeneratorConfig && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(maxChunks, maxTokensInContext, queryGeneratorConfig, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "QueryConfig{maxChunks=$maxChunks, maxTokensInContext=$maxTokensInContext, queryGeneratorConfig=$queryGeneratorConfig, additionalProperties=$additionalProperties}"
}
