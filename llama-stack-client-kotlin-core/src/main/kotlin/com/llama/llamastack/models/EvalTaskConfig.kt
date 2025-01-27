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
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

@JsonDeserialize(using = EvalTaskConfig.Deserializer::class)
@JsonSerialize(using = EvalTaskConfig.Serializer::class)
class EvalTaskConfig
private constructor(
    private val benchmark: BenchmarkEvalTaskConfig? = null,
    private val app: AppEvalTaskConfig? = null,
    private val _json: JsonValue? = null,
) {

    fun benchmark(): BenchmarkEvalTaskConfig? = benchmark

    fun app(): AppEvalTaskConfig? = app

    fun isBenchmark(): Boolean = benchmark != null

    fun isApp(): Boolean = app != null

    fun asBenchmark(): BenchmarkEvalTaskConfig = benchmark.getOrThrow("benchmark")

    fun asApp(): AppEvalTaskConfig = app.getOrThrow("app")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            benchmark != null -> visitor.visitBenchmark(benchmark)
            app != null -> visitor.visitApp(app)
            else -> visitor.unknown(_json)
        }
    }

    private var validated: Boolean = false

    fun validate(): EvalTaskConfig = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitBenchmark(benchmark: BenchmarkEvalTaskConfig) {
                    benchmark.validate()
                }

                override fun visitApp(app: AppEvalTaskConfig) {
                    app.validate()
                }
            }
        )
        validated = true
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EvalTaskConfig && benchmark == other.benchmark && app == other.app /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(benchmark, app) /* spotless:on */

    override fun toString(): String =
        when {
            benchmark != null -> "EvalTaskConfig{benchmark=$benchmark}"
            app != null -> "EvalTaskConfig{app=$app}"
            _json != null -> "EvalTaskConfig{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid EvalTaskConfig")
        }

    companion object {

        fun ofBenchmark(benchmark: BenchmarkEvalTaskConfig) = EvalTaskConfig(benchmark = benchmark)

        fun ofApp(app: AppEvalTaskConfig) = EvalTaskConfig(app = app)
    }

    interface Visitor<out T> {

        fun visitBenchmark(benchmark: BenchmarkEvalTaskConfig): T

        fun visitApp(app: AppEvalTaskConfig): T

        fun unknown(json: JsonValue?): T {
            throw LlamaStackClientInvalidDataException("Unknown EvalTaskConfig: $json")
        }
    }

    class Deserializer : BaseDeserializer<EvalTaskConfig>(EvalTaskConfig::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): EvalTaskConfig {
            val json = JsonValue.fromJsonNode(node)
            val type = json.asObject()?.get("type")?.asString()

            when (type) {
                "benchmark" -> {
                    tryDeserialize(node, jacksonTypeRef<BenchmarkEvalTaskConfig>()) {
                            it.validate()
                        }
                        ?.let {
                            return EvalTaskConfig(benchmark = it, _json = json)
                        }
                }
                "app" -> {
                    tryDeserialize(node, jacksonTypeRef<AppEvalTaskConfig>()) { it.validate() }
                        ?.let {
                            return EvalTaskConfig(app = it, _json = json)
                        }
                }
            }

            return EvalTaskConfig(_json = json)
        }
    }

    class Serializer : BaseSerializer<EvalTaskConfig>(EvalTaskConfig::class) {

        override fun serialize(
            value: EvalTaskConfig,
            generator: JsonGenerator,
            provider: SerializerProvider
        ) {
            when {
                value.benchmark != null -> generator.writeObject(value.benchmark)
                value.app != null -> generator.writeObject(value.app)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid EvalTaskConfig")
            }
        }
    }

    @NoAutoDetect
    class BenchmarkEvalTaskConfig
    @JsonCreator
    private constructor(
        @JsonProperty("eval_candidate")
        @ExcludeMissing
        private val evalCandidate: JsonField<EvalCandidate> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonValue = JsonMissing.of(),
        @JsonProperty("num_examples")
        @ExcludeMissing
        private val numExamples: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun evalCandidate(): EvalCandidate = evalCandidate.getRequired("eval_candidate")

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        fun numExamples(): Long? = numExamples.getNullable("num_examples")

        @JsonProperty("eval_candidate")
        @ExcludeMissing
        fun _evalCandidate(): JsonField<EvalCandidate> = evalCandidate

        @JsonProperty("num_examples")
        @ExcludeMissing
        fun _numExamples(): JsonField<Long> = numExamples

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): BenchmarkEvalTaskConfig = apply {
            if (validated) {
                return@apply
            }

            evalCandidate().validate()
            _type().let {
                if (it != JsonValue.from("benchmark")) {
                    throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
                }
            }
            numExamples()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var evalCandidate: JsonField<EvalCandidate>? = null
            private var type: JsonValue = JsonValue.from("benchmark")
            private var numExamples: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(benchmarkEvalTaskConfig: BenchmarkEvalTaskConfig) = apply {
                evalCandidate = benchmarkEvalTaskConfig.evalCandidate
                type = benchmarkEvalTaskConfig.type
                numExamples = benchmarkEvalTaskConfig.numExamples
                additionalProperties = benchmarkEvalTaskConfig.additionalProperties.toMutableMap()
            }

            fun evalCandidate(evalCandidate: EvalCandidate) =
                evalCandidate(JsonField.of(evalCandidate))

            fun evalCandidate(evalCandidate: JsonField<EvalCandidate>) = apply {
                this.evalCandidate = evalCandidate
            }

            fun evalCandidate(model: EvalCandidate.ModelCandidate) =
                evalCandidate(EvalCandidate.ofModel(model))

            fun evalCandidate(agent: EvalCandidate.AgentCandidate) =
                evalCandidate(EvalCandidate.ofAgent(agent))

            fun type(type: JsonValue) = apply { this.type = type }

            fun numExamples(numExamples: Long) = numExamples(JsonField.of(numExamples))

            fun numExamples(numExamples: JsonField<Long>) = apply { this.numExamples = numExamples }

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

            fun build(): BenchmarkEvalTaskConfig =
                BenchmarkEvalTaskConfig(
                    checkRequired("evalCandidate", evalCandidate),
                    type,
                    numExamples,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BenchmarkEvalTaskConfig && evalCandidate == other.evalCandidate && type == other.type && numExamples == other.numExamples && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(evalCandidate, type, numExamples, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BenchmarkEvalTaskConfig{evalCandidate=$evalCandidate, type=$type, numExamples=$numExamples, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class AppEvalTaskConfig
    @JsonCreator
    private constructor(
        @JsonProperty("eval_candidate")
        @ExcludeMissing
        private val evalCandidate: JsonField<EvalCandidate> = JsonMissing.of(),
        @JsonProperty("scoring_params")
        @ExcludeMissing
        private val scoringParams: JsonField<ScoringParams> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonValue = JsonMissing.of(),
        @JsonProperty("num_examples")
        @ExcludeMissing
        private val numExamples: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun evalCandidate(): EvalCandidate = evalCandidate.getRequired("eval_candidate")

        fun scoringParams(): ScoringParams = scoringParams.getRequired("scoring_params")

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        fun numExamples(): Long? = numExamples.getNullable("num_examples")

        @JsonProperty("eval_candidate")
        @ExcludeMissing
        fun _evalCandidate(): JsonField<EvalCandidate> = evalCandidate

        @JsonProperty("scoring_params")
        @ExcludeMissing
        fun _scoringParams(): JsonField<ScoringParams> = scoringParams

        @JsonProperty("num_examples")
        @ExcludeMissing
        fun _numExamples(): JsonField<Long> = numExamples

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AppEvalTaskConfig = apply {
            if (validated) {
                return@apply
            }

            evalCandidate().validate()
            scoringParams().validate()
            _type().let {
                if (it != JsonValue.from("app")) {
                    throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
                }
            }
            numExamples()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var evalCandidate: JsonField<EvalCandidate>? = null
            private var scoringParams: JsonField<ScoringParams>? = null
            private var type: JsonValue = JsonValue.from("app")
            private var numExamples: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(appEvalTaskConfig: AppEvalTaskConfig) = apply {
                evalCandidate = appEvalTaskConfig.evalCandidate
                scoringParams = appEvalTaskConfig.scoringParams
                type = appEvalTaskConfig.type
                numExamples = appEvalTaskConfig.numExamples
                additionalProperties = appEvalTaskConfig.additionalProperties.toMutableMap()
            }

            fun evalCandidate(evalCandidate: EvalCandidate) =
                evalCandidate(JsonField.of(evalCandidate))

            fun evalCandidate(evalCandidate: JsonField<EvalCandidate>) = apply {
                this.evalCandidate = evalCandidate
            }

            fun evalCandidate(model: EvalCandidate.ModelCandidate) =
                evalCandidate(EvalCandidate.ofModel(model))

            fun evalCandidate(agent: EvalCandidate.AgentCandidate) =
                evalCandidate(EvalCandidate.ofAgent(agent))

            fun scoringParams(scoringParams: ScoringParams) =
                scoringParams(JsonField.of(scoringParams))

            fun scoringParams(scoringParams: JsonField<ScoringParams>) = apply {
                this.scoringParams = scoringParams
            }

            fun type(type: JsonValue) = apply { this.type = type }

            fun numExamples(numExamples: Long) = numExamples(JsonField.of(numExamples))

            fun numExamples(numExamples: JsonField<Long>) = apply { this.numExamples = numExamples }

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

            fun build(): AppEvalTaskConfig =
                AppEvalTaskConfig(
                    checkRequired("evalCandidate", evalCandidate),
                    checkRequired("scoringParams", scoringParams),
                    type,
                    numExamples,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class ScoringParams
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): ScoringParams = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(scoringParams: ScoringParams) = apply {
                    additionalProperties = scoringParams.additionalProperties.toMutableMap()
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

                fun build(): ScoringParams = ScoringParams(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ScoringParams && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "ScoringParams{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AppEvalTaskConfig && evalCandidate == other.evalCandidate && scoringParams == other.scoringParams && type == other.type && numExamples == other.numExamples && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(evalCandidate, scoringParams, type, numExamples, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AppEvalTaskConfig{evalCandidate=$evalCandidate, scoringParams=$scoringParams, type=$type, numExamples=$numExamples, additionalProperties=$additionalProperties}"
    }
}
