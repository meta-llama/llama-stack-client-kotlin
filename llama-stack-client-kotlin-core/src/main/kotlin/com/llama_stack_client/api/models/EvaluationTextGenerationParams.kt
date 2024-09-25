// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.llama_stack_client.api.core.Enum
import com.llama_stack_client.api.core.ExcludeMissing
import com.llama_stack_client.api.core.JsonField
import com.llama_stack_client.api.core.JsonValue
import com.llama_stack_client.api.core.NoAutoDetect
import com.llama_stack_client.api.core.toUnmodifiable
import com.llama_stack_client.api.errors.LlamaStackClientInvalidDataException
import com.llama_stack_client.api.models.*
import java.util.Objects

class EvaluationTextGenerationParams
constructor(
    private val metrics: List<Metric>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun metrics(): List<Metric> = metrics

    internal fun getBody(): EvaluationTextGenerationBody {
        return EvaluationTextGenerationBody(metrics, additionalBodyProperties)
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = EvaluationTextGenerationBody.Builder::class)
    @NoAutoDetect
    class EvaluationTextGenerationBody
    internal constructor(
        private val metrics: List<Metric>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("metrics") fun metrics(): List<Metric>? = metrics

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EvaluationTextGenerationBody &&
                this.metrics == other.metrics &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(metrics, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "EvaluationTextGenerationBody{metrics=$metrics, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var metrics: List<Metric>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(evaluationTextGenerationBody: EvaluationTextGenerationBody) = apply {
                this.metrics = evaluationTextGenerationBody.metrics
                additionalProperties(evaluationTextGenerationBody.additionalProperties)
            }

            @JsonProperty("metrics")
            fun metrics(metrics: List<Metric>) = apply { this.metrics = metrics }

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

            fun build(): EvaluationTextGenerationBody =
                EvaluationTextGenerationBody(
                    checkNotNull(metrics) { "`metrics` is required but was not set" }
                        .toUnmodifiable(),
                    additionalProperties.toUnmodifiable()
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EvaluationTextGenerationParams &&
            this.metrics == other.metrics &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            metrics,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "EvaluationTextGenerationParams{metrics=$metrics, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var metrics: MutableList<Metric> = mutableListOf()
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(evaluationTextGenerationParams: EvaluationTextGenerationParams) = apply {
            this.metrics(evaluationTextGenerationParams.metrics)
            additionalQueryParams(evaluationTextGenerationParams.additionalQueryParams)
            additionalHeaders(evaluationTextGenerationParams.additionalHeaders)
            additionalBodyProperties(evaluationTextGenerationParams.additionalBodyProperties)
        }

        fun metrics(metrics: List<Metric>) = apply {
            this.metrics.clear()
            this.metrics.addAll(metrics)
        }

        fun addMetric(metric: Metric) = apply { this.metrics.add(metric) }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): EvaluationTextGenerationParams =
            EvaluationTextGenerationParams(
                checkNotNull(metrics) { "`metrics` is required but was not set" }.toUnmodifiable(),
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class Metric
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metric && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val PERPLEXITY = Metric(JsonField.of("perplexity"))

            val ROUGE = Metric(JsonField.of("rouge"))

            val BLEU = Metric(JsonField.of("bleu"))

            fun of(value: String) = Metric(JsonField.of(value))
        }

        enum class Known {
            PERPLEXITY,
            ROUGE,
            BLEU,
        }

        enum class Value {
            PERPLEXITY,
            ROUGE,
            BLEU,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PERPLEXITY -> Value.PERPLEXITY
                ROUGE -> Value.ROUGE
                BLEU -> Value.BLEU
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PERPLEXITY -> Known.PERPLEXITY
                ROUGE -> Known.ROUGE
                BLEU -> Known.BLEU
                else -> throw LlamaStackClientInvalidDataException("Unknown Metric: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
