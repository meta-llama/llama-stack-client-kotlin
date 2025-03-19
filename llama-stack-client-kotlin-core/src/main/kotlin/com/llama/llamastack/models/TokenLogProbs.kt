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
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

/** Log probabilities for generated tokens. */
@NoAutoDetect
class TokenLogProbs
@JsonCreator
private constructor(
    @JsonProperty("logprobs_by_token")
    @ExcludeMissing
    private val logprobsByToken: JsonField<LogprobsByToken> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * Dictionary mapping tokens to their log probabilities
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun logprobsByToken(): LogprobsByToken = logprobsByToken.getRequired("logprobs_by_token")

    /**
     * Returns the raw JSON value of [logprobsByToken].
     *
     * Unlike [logprobsByToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("logprobs_by_token")
    @ExcludeMissing
    fun _logprobsByToken(): JsonField<LogprobsByToken> = logprobsByToken

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): TokenLogProbs = apply {
        if (validated) {
            return@apply
        }

        logprobsByToken().validate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TokenLogProbs].
         *
         * The following fields are required:
         * ```kotlin
         * .logprobsByToken()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [TokenLogProbs]. */
    class Builder internal constructor() {

        private var logprobsByToken: JsonField<LogprobsByToken>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(tokenLogProbs: TokenLogProbs) = apply {
            logprobsByToken = tokenLogProbs.logprobsByToken
            additionalProperties = tokenLogProbs.additionalProperties.toMutableMap()
        }

        /** Dictionary mapping tokens to their log probabilities */
        fun logprobsByToken(logprobsByToken: LogprobsByToken) =
            logprobsByToken(JsonField.of(logprobsByToken))

        /**
         * Sets [Builder.logprobsByToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logprobsByToken] with a well-typed [LogprobsByToken]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun logprobsByToken(logprobsByToken: JsonField<LogprobsByToken>) = apply {
            this.logprobsByToken = logprobsByToken
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

        fun build(): TokenLogProbs =
            TokenLogProbs(
                checkRequired("logprobsByToken", logprobsByToken),
                additionalProperties.toImmutable(),
            )
    }

    /** Dictionary mapping tokens to their log probabilities */
    @NoAutoDetect
    class LogprobsByToken
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): LogprobsByToken = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [LogprobsByToken]. */
            fun builder() = Builder()
        }

        /** A builder for [LogprobsByToken]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(logprobsByToken: LogprobsByToken) = apply {
                additionalProperties = logprobsByToken.additionalProperties.toMutableMap()
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

            fun build(): LogprobsByToken = LogprobsByToken(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LogprobsByToken && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "LogprobsByToken{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TokenLogProbs && logprobsByToken == other.logprobsByToken && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(logprobsByToken, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TokenLogProbs{logprobsByToken=$logprobsByToken, additionalProperties=$additionalProperties}"
}
