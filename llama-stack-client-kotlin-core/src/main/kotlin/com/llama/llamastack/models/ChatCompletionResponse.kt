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
import java.time.OffsetDateTime
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

    /** The complete response message */
    fun completionMessage(): CompletionMessage = completionMessage.getRequired("completion_message")

    /** Optional log probabilities for generated tokens */
    fun logprobs(): List<TokenLogProbs>? = logprobs.getNullable("logprobs")

    fun metrics(): List<Metric>? = metrics.getNullable("metrics")

    /** The complete response message */
    @JsonProperty("completion_message")
    @ExcludeMissing
    fun _completionMessage(): JsonField<CompletionMessage> = completionMessage

    /** Optional log probabilities for generated tokens */
    @JsonProperty("logprobs")
    @ExcludeMissing
    fun _logprobs(): JsonField<List<TokenLogProbs>> = logprobs

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

        /** The complete response message */
        fun completionMessage(completionMessage: JsonField<CompletionMessage>) = apply {
            this.completionMessage = completionMessage
        }

        /** Optional log probabilities for generated tokens */
        fun logprobs(logprobs: List<TokenLogProbs>) = logprobs(JsonField.of(logprobs))

        /** Optional log probabilities for generated tokens */
        fun logprobs(logprobs: JsonField<List<TokenLogProbs>>) = apply {
            this.logprobs = logprobs.map { it.toMutableList() }
        }

        /** Optional log probabilities for generated tokens */
        fun addLogprob(logprob: TokenLogProbs) = apply {
            logprobs =
                (logprobs ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(logprob)
                }
        }

        fun metrics(metrics: List<Metric>) = metrics(JsonField.of(metrics))

        fun metrics(metrics: JsonField<List<Metric>>) = apply {
            this.metrics = metrics.map { it.toMutableList() }
        }

        fun addMetric(metric: Metric) = apply {
            metrics =
                (metrics ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(metric)
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
        @JsonProperty("span_id")
        @ExcludeMissing
        private val spanId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timestamp")
        @ExcludeMissing
        private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("trace_id")
        @ExcludeMissing
        private val traceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonValue = JsonMissing.of(),
        @JsonProperty("unit")
        @ExcludeMissing
        private val unit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("value")
        @ExcludeMissing
        private val value: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("attributes")
        @ExcludeMissing
        private val attributes: JsonField<Attributes> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun metric(): String = metric.getRequired("metric")

        fun spanId(): String = spanId.getRequired("span_id")

        fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

        fun traceId(): String = traceId.getRequired("trace_id")

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        fun unit(): String = unit.getRequired("unit")

        fun value(): Double = value.getRequired("value")

        fun attributes(): Attributes? = attributes.getNullable("attributes")

        @JsonProperty("metric") @ExcludeMissing fun _metric(): JsonField<String> = metric

        @JsonProperty("span_id") @ExcludeMissing fun _spanId(): JsonField<String> = spanId

        @JsonProperty("timestamp")
        @ExcludeMissing
        fun _timestamp(): JsonField<OffsetDateTime> = timestamp

        @JsonProperty("trace_id") @ExcludeMissing fun _traceId(): JsonField<String> = traceId

        @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<String> = unit

        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

        @JsonProperty("attributes")
        @ExcludeMissing
        fun _attributes(): JsonField<Attributes> = attributes

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Metric = apply {
            if (validated) {
                return@apply
            }

            metric()
            spanId()
            timestamp()
            traceId()
            _type().let {
                if (it != JsonValue.from("metric")) {
                    throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
                }
            }
            unit()
            value()
            attributes()?.validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [Metric]. */
        class Builder internal constructor() {

            private var metric: JsonField<String>? = null
            private var spanId: JsonField<String>? = null
            private var timestamp: JsonField<OffsetDateTime>? = null
            private var traceId: JsonField<String>? = null
            private var type: JsonValue = JsonValue.from("metric")
            private var unit: JsonField<String>? = null
            private var value: JsonField<Double>? = null
            private var attributes: JsonField<Attributes> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(metric: Metric) = apply {
                this.metric = metric.metric
                spanId = metric.spanId
                timestamp = metric.timestamp
                traceId = metric.traceId
                type = metric.type
                unit = metric.unit
                value = metric.value
                attributes = metric.attributes
                additionalProperties = metric.additionalProperties.toMutableMap()
            }

            fun metric(metric: String) = metric(JsonField.of(metric))

            fun metric(metric: JsonField<String>) = apply { this.metric = metric }

            fun spanId(spanId: String) = spanId(JsonField.of(spanId))

            fun spanId(spanId: JsonField<String>) = apply { this.spanId = spanId }

            fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

            fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                this.timestamp = timestamp
            }

            fun traceId(traceId: String) = traceId(JsonField.of(traceId))

            fun traceId(traceId: JsonField<String>) = apply { this.traceId = traceId }

            fun type(type: JsonValue) = apply { this.type = type }

            fun unit(unit: String) = unit(JsonField.of(unit))

            fun unit(unit: JsonField<String>) = apply { this.unit = unit }

            fun value(value: Double) = value(JsonField.of(value))

            fun value(value: JsonField<Double>) = apply { this.value = value }

            fun attributes(attributes: Attributes) = attributes(JsonField.of(attributes))

            fun attributes(attributes: JsonField<Attributes>) = apply {
                this.attributes = attributes
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

            fun build(): Metric =
                Metric(
                    checkRequired("metric", metric),
                    checkRequired("spanId", spanId),
                    checkRequired("timestamp", timestamp),
                    checkRequired("traceId", traceId),
                    type,
                    checkRequired("unit", unit),
                    checkRequired("value", value),
                    attributes,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class Attributes
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Attributes = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun build(): Attributes = Attributes(additionalProperties.toImmutable())
            }

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metric && metric == other.metric && spanId == other.spanId && timestamp == other.timestamp && traceId == other.traceId && type == other.type && unit == other.unit && value == other.value && attributes == other.attributes && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(metric, spanId, timestamp, traceId, type, unit, value, attributes, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Metric{metric=$metric, spanId=$spanId, timestamp=$timestamp, traceId=$traceId, type=$type, unit=$unit, value=$value, attributes=$attributes, additionalProperties=$additionalProperties}"
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
