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

/** Response from a chat completion request. */
@NoAutoDetect
class ChatCompletionResponse
@JsonCreator
private constructor(
    @JsonProperty("completion_message")
    @ExcludeMissing
    private val completionMessage: JsonField<CompletionMessage> = JsonMissing.of(),
    @JsonProperty("logprobs")
    @ExcludeMissing
    private val logprobs: JsonField<List<TokenLogProbs>> = JsonMissing.of(),
    @JsonProperty("metrics")
    @ExcludeMissing
    private val metrics: JsonField<List<Metric>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * The complete response message
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun completionMessage(): CompletionMessage = completionMessage.getRequired("completion_message")

    /**
     * Optional log probabilities for generated tokens
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun logprobs(): List<TokenLogProbs>? = logprobs.getNullable("logprobs")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun metrics(): List<Metric>? = metrics.getNullable("metrics")

    /**
     * Returns the raw JSON value of [completionMessage].
     *
     * Unlike [completionMessage], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("completion_message")
    @ExcludeMissing
    fun _completionMessage(): JsonField<CompletionMessage> = completionMessage

    /**
     * Returns the raw JSON value of [logprobs].
     *
     * Unlike [logprobs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("logprobs")
    @ExcludeMissing
    fun _logprobs(): JsonField<List<TokenLogProbs>> = logprobs

    /**
     * Returns the raw JSON value of [metrics].
     *
     * Unlike [metrics], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metrics") @ExcludeMissing fun _metrics(): JsonField<List<Metric>> = metrics

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ChatCompletionResponse = apply {
        if (validated) {
            return@apply
        }

        completionMessage().validate()
        logprobs()?.forEach { it.validate() }
        metrics()?.forEach { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ChatCompletionResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .completionMessage()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ChatCompletionResponse]. */
    class Builder internal constructor() {

        private var completionMessage: JsonField<CompletionMessage>? = null
        private var logprobs: JsonField<MutableList<TokenLogProbs>>? = null
        private var metrics: JsonField<MutableList<Metric>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(chatCompletionResponse: ChatCompletionResponse) = apply {
            completionMessage = chatCompletionResponse.completionMessage
            logprobs = chatCompletionResponse.logprobs.map { it.toMutableList() }
            metrics = chatCompletionResponse.metrics.map { it.toMutableList() }
            additionalProperties = chatCompletionResponse.additionalProperties.toMutableMap()
        }

        /** The complete response message */
        fun completionMessage(completionMessage: CompletionMessage) =
            completionMessage(JsonField.of(completionMessage))

        /**
         * Sets [Builder.completionMessage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.completionMessage] with a well-typed [CompletionMessage]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun completionMessage(completionMessage: JsonField<CompletionMessage>) = apply {
            this.completionMessage = completionMessage
        }

        /** Optional log probabilities for generated tokens */
        fun logprobs(logprobs: List<TokenLogProbs>) = logprobs(JsonField.of(logprobs))

        /**
         * Sets [Builder.logprobs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logprobs] with a well-typed `List<TokenLogProbs>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun logprobs(logprobs: JsonField<List<TokenLogProbs>>) = apply {
            this.logprobs = logprobs.map { it.toMutableList() }
        }

        /**
         * Adds a single [TokenLogProbs] to [logprobs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLogprob(logprob: TokenLogProbs) = apply {
            logprobs =
                (logprobs ?: JsonField.of(mutableListOf())).also {
                    checkKnown("logprobs", it).add(logprob)
                }
        }

        fun metrics(metrics: List<Metric>) = metrics(JsonField.of(metrics))

        /**
         * Sets [Builder.metrics] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metrics] with a well-typed `List<Metric>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metrics(metrics: JsonField<List<Metric>>) = apply {
            this.metrics = metrics.map { it.toMutableList() }
        }

        /**
         * Adds a single [Metric] to [metrics].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMetric(metric: Metric) = apply {
            metrics =
                (metrics ?: JsonField.of(mutableListOf())).also {
                    checkKnown("metrics", it).add(metric)
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

        fun build(): ChatCompletionResponse =
            ChatCompletionResponse(
                checkRequired("completionMessage", completionMessage),
                (logprobs ?: JsonMissing.of()).map { it.toImmutable() },
                (metrics ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Metric
    @JsonCreator
    private constructor(
        @JsonProperty("metric")
        @ExcludeMissing
        private val metric: JsonField<String> = JsonMissing.of(),
        @JsonProperty("value")
        @ExcludeMissing
        private val value: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("unit")
        @ExcludeMissing
        private val unit: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun metric(): String = metric.getRequired("metric")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun value(): Double = value.getRequired("value")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun unit(): String? = unit.getNullable("unit")

        /**
         * Returns the raw JSON value of [metric].
         *
         * Unlike [metric], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metric") @ExcludeMissing fun _metric(): JsonField<String> = metric

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

        /**
         * Returns the raw JSON value of [unit].
         *
         * Unlike [unit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<String> = unit

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Metric = apply {
            if (validated) {
                return@apply
            }

            metric()
            value()
            unit()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Metric].
             *
             * The following fields are required:
             * ```kotlin
             * .metric()
             * .value()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Metric]. */
        class Builder internal constructor() {

            private var metric: JsonField<String>? = null
            private var value: JsonField<Double>? = null
            private var unit: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(metric: Metric) = apply {
                this.metric = metric.metric
                value = metric.value
                unit = metric.unit
                additionalProperties = metric.additionalProperties.toMutableMap()
            }

            fun metric(metric: String) = metric(JsonField.of(metric))

            /**
             * Sets [Builder.metric] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metric] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metric(metric: JsonField<String>) = apply { this.metric = metric }

            fun value(value: Double) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun value(value: JsonField<Double>) = apply { this.value = value }

            fun unit(unit: String) = unit(JsonField.of(unit))

            /**
             * Sets [Builder.unit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unit] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun unit(unit: JsonField<String>) = apply { this.unit = unit }

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

            fun build(): Metric =
                Metric(
                    checkRequired("metric", metric),
                    checkRequired("value", value),
                    unit,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metric && metric == other.metric && value == other.value && unit == other.unit && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(metric, value, unit, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Metric{metric=$metric, value=$value, unit=$unit, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ChatCompletionResponse && completionMessage == other.completionMessage && logprobs == other.logprobs && metrics == other.metrics && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(completionMessage, logprobs, metrics, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ChatCompletionResponse{completionMessage=$completionMessage, logprobs=$logprobs, metrics=$metrics, additionalProperties=$additionalProperties}"
}
