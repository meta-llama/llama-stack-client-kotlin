// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.llama_stack_client.api.core.ExcludeMissing
import com.llama_stack_client.api.core.JsonField
import com.llama_stack_client.api.core.JsonMissing
import com.llama_stack_client.api.core.JsonValue
import com.llama_stack_client.api.core.NoAutoDetect
import com.llama_stack_client.api.core.toUnmodifiable
import java.util.Objects

@JsonDeserialize(builder = TokenLogProbs.Builder::class)
@NoAutoDetect
class TokenLogProbs
private constructor(
    private val logprobsByToken: JsonField<LogprobsByToken>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun logprobsByToken(): LogprobsByToken = logprobsByToken.getRequired("logprobs_by_token")

    @JsonProperty("logprobs_by_token") @ExcludeMissing fun _logprobsByToken() = logprobsByToken

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): TokenLogProbs = apply {
        if (!validated) {
            logprobsByToken().validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TokenLogProbs &&
            this.logprobsByToken == other.logprobsByToken &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = Objects.hash(logprobsByToken, additionalProperties)
        }
        return hashCode
    }

    override fun toString() =
        "TokenLogProbs{logprobsByToken=$logprobsByToken, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var logprobsByToken: JsonField<LogprobsByToken> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(tokenLogProbs: TokenLogProbs) = apply {
            this.logprobsByToken = tokenLogProbs.logprobsByToken
            additionalProperties(tokenLogProbs.additionalProperties)
        }

        fun logprobsByToken(logprobsByToken: LogprobsByToken) =
            logprobsByToken(JsonField.of(logprobsByToken))

        @JsonProperty("logprobs_by_token")
        @ExcludeMissing
        fun logprobsByToken(logprobsByToken: JsonField<LogprobsByToken>) = apply {
            this.logprobsByToken = logprobsByToken
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

        fun build(): TokenLogProbs =
            TokenLogProbs(logprobsByToken, additionalProperties.toUnmodifiable())
    }

    @JsonDeserialize(builder = LogprobsByToken.Builder::class)
    @NoAutoDetect
    class LogprobsByToken
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): LogprobsByToken = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LogprobsByToken &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "LogprobsByToken{additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(logprobsByToken: LogprobsByToken) = apply {
                additionalProperties(logprobsByToken.additionalProperties)
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

            fun build(): LogprobsByToken = LogprobsByToken(additionalProperties.toUnmodifiable())
        }
    }
}
