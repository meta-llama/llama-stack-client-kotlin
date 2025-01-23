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
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

class EvalRunEvalParams
constructor(
    private val taskId: String,
    private val xLlamaStackClientVersion: String?,
    private val xLlamaStackProviderData: String?,
    private val body: EvalRunEvalBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun taskId(): String = taskId

    fun xLlamaStackClientVersion(): String? = xLlamaStackClientVersion

    fun xLlamaStackProviderData(): String? = xLlamaStackProviderData

    fun taskConfig(): TaskConfig = body.taskConfig()

    fun _taskConfig(): JsonField<TaskConfig> = body._taskConfig()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getBody(): EvalRunEvalBody = body

    internal fun getHeaders(): Headers {
        val headers = Headers.builder()
        this.xLlamaStackClientVersion?.let {
            headers.put("X-LlamaStack-Client-Version", listOf(it.toString()))
        }
        this.xLlamaStackProviderData?.let {
            headers.put("X-LlamaStack-Provider-Data", listOf(it.toString()))
        }
        headers.putAll(additionalHeaders)
        return headers.build()
    }

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> taskId
            else -> ""
        }
    }

    @NoAutoDetect
    class EvalRunEvalBody
    @JsonCreator
    internal constructor(
        @JsonProperty("task_config")
        @ExcludeMissing
        private val taskConfig: JsonField<TaskConfig> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun taskConfig(): TaskConfig = taskConfig.getRequired("task_config")

        @JsonProperty("task_config")
        @ExcludeMissing
        fun _taskConfig(): JsonField<TaskConfig> = taskConfig

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): EvalRunEvalBody = apply {
            if (validated) {
                return@apply
            }

            taskConfig().validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var taskConfig: JsonField<TaskConfig>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(evalRunEvalBody: EvalRunEvalBody) = apply {
                taskConfig = evalRunEvalBody.taskConfig
                additionalProperties = evalRunEvalBody.additionalProperties.toMutableMap()
            }

            fun taskConfig(taskConfig: TaskConfig) = taskConfig(JsonField.of(taskConfig))

            fun taskConfig(taskConfig: JsonField<TaskConfig>) = apply {
                this.taskConfig = taskConfig
            }

            fun taskConfig(benchmark: TaskConfig.Benchmark) =
                taskConfig(TaskConfig.ofBenchmark(benchmark))

            fun taskConfig(app: TaskConfig.App) = taskConfig(TaskConfig.ofApp(app))

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

            fun build(): EvalRunEvalBody =
                EvalRunEvalBody(
                    checkRequired("taskConfig", taskConfig),
                    additionalProperties.toImmutable()
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is EvalRunEvalBody && taskConfig == other.taskConfig && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(taskConfig, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "EvalRunEvalBody{taskConfig=$taskConfig, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var taskId: String? = null
        private var xLlamaStackClientVersion: String? = null
        private var xLlamaStackProviderData: String? = null
        private var body: EvalRunEvalBody.Builder = EvalRunEvalBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(evalRunEvalParams: EvalRunEvalParams) = apply {
            taskId = evalRunEvalParams.taskId
            xLlamaStackClientVersion = evalRunEvalParams.xLlamaStackClientVersion
            xLlamaStackProviderData = evalRunEvalParams.xLlamaStackProviderData
            body = evalRunEvalParams.body.toBuilder()
            additionalHeaders = evalRunEvalParams.additionalHeaders.toBuilder()
            additionalQueryParams = evalRunEvalParams.additionalQueryParams.toBuilder()
        }

        fun taskId(taskId: String) = apply { this.taskId = taskId }

        fun xLlamaStackClientVersion(xLlamaStackClientVersion: String?) = apply {
            this.xLlamaStackClientVersion = xLlamaStackClientVersion
        }

        fun xLlamaStackProviderData(xLlamaStackProviderData: String?) = apply {
            this.xLlamaStackProviderData = xLlamaStackProviderData
        }

        fun taskConfig(taskConfig: TaskConfig) = apply { body.taskConfig(taskConfig) }

        fun taskConfig(taskConfig: JsonField<TaskConfig>) = apply { body.taskConfig(taskConfig) }

        fun taskConfig(benchmark: TaskConfig.Benchmark) = apply { body.taskConfig(benchmark) }

        fun taskConfig(app: TaskConfig.App) = apply { body.taskConfig(app) }

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

        fun build(): EvalRunEvalParams =
            EvalRunEvalParams(
                checkRequired("taskId", taskId),
                xLlamaStackClientVersion,
                xLlamaStackProviderData,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @JsonDeserialize(using = TaskConfig.Deserializer::class)
    @JsonSerialize(using = TaskConfig.Serializer::class)
    class TaskConfig
    private constructor(
        private val benchmark: Benchmark? = null,
        private val app: App? = null,
        private val _json: JsonValue? = null,
    ) {

        fun benchmark(): Benchmark? = benchmark

        fun app(): App? = app

        fun isBenchmark(): Boolean = benchmark != null

        fun isApp(): Boolean = app != null

        fun asBenchmark(): Benchmark = benchmark.getOrThrow("benchmark")

        fun asApp(): App = app.getOrThrow("app")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                benchmark != null -> visitor.visitBenchmark(benchmark)
                app != null -> visitor.visitApp(app)
                else -> visitor.unknown(_json)
            }
        }

        private var validated: Boolean = false

        fun validate(): TaskConfig = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitBenchmark(benchmark: Benchmark) {
                        benchmark.validate()
                    }

                    override fun visitApp(app: App) {
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

            return /* spotless:off */ other is TaskConfig && benchmark == other.benchmark && app == other.app /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(benchmark, app) /* spotless:on */

        override fun toString(): String =
            when {
                benchmark != null -> "TaskConfig{benchmark=$benchmark}"
                app != null -> "TaskConfig{app=$app}"
                _json != null -> "TaskConfig{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid TaskConfig")
            }

        companion object {

            fun ofBenchmark(benchmark: Benchmark) = TaskConfig(benchmark = benchmark)

            fun ofApp(app: App) = TaskConfig(app = app)
        }

        interface Visitor<out T> {

            fun visitBenchmark(benchmark: Benchmark): T

            fun visitApp(app: App): T

            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown TaskConfig: $json")
            }
        }

        class Deserializer : BaseDeserializer<TaskConfig>(TaskConfig::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): TaskConfig {
                val json = JsonValue.fromJsonNode(node)
                val type = json.asObject()?.get("type")?.asString()

                when (type) {
                    "benchmark" -> {
                        tryDeserialize(node, jacksonTypeRef<Benchmark>()) { it.validate() }
                            ?.let {
                                return TaskConfig(benchmark = it, _json = json)
                            }
                    }
                    "app" -> {
                        tryDeserialize(node, jacksonTypeRef<App>()) { it.validate() }
                            ?.let {
                                return TaskConfig(app = it, _json = json)
                            }
                    }
                }

                return TaskConfig(_json = json)
            }
        }

        class Serializer : BaseSerializer<TaskConfig>(TaskConfig::class) {

            override fun serialize(
                value: TaskConfig,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.benchmark != null -> generator.writeObject(value.benchmark)
                    value.app != null -> generator.writeObject(value.app)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid TaskConfig")
                }
            }
        }

        @NoAutoDetect
        class Benchmark
        @JsonCreator
        private constructor(
            @JsonProperty("eval_candidate")
            @ExcludeMissing
            private val evalCandidate: JsonField<EvalCandidate> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("num_examples")
            @ExcludeMissing
            private val numExamples: JsonField<Long> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun evalCandidate(): EvalCandidate = evalCandidate.getRequired("eval_candidate")

            fun type(): Type = type.getRequired("type")

            fun numExamples(): Long? = numExamples.getNullable("num_examples")

            @JsonProperty("eval_candidate")
            @ExcludeMissing
            fun _evalCandidate(): JsonField<EvalCandidate> = evalCandidate

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonProperty("num_examples")
            @ExcludeMissing
            fun _numExamples(): JsonField<Long> = numExamples

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Benchmark = apply {
                if (validated) {
                    return@apply
                }

                evalCandidate().validate()
                type()
                numExamples()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var evalCandidate: JsonField<EvalCandidate>? = null
                private var type: JsonField<Type>? = null
                private var numExamples: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(benchmark: Benchmark) = apply {
                    evalCandidate = benchmark.evalCandidate
                    type = benchmark.type
                    numExamples = benchmark.numExamples
                    additionalProperties = benchmark.additionalProperties.toMutableMap()
                }

                fun evalCandidate(evalCandidate: EvalCandidate) =
                    evalCandidate(JsonField.of(evalCandidate))

                fun evalCandidate(evalCandidate: JsonField<EvalCandidate>) = apply {
                    this.evalCandidate = evalCandidate
                }

                fun evalCandidate(model: EvalCandidate.Model) =
                    evalCandidate(EvalCandidate.ofModel(model))

                fun evalCandidate(agent: EvalCandidate.Agent) =
                    evalCandidate(EvalCandidate.ofAgent(agent))

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun numExamples(numExamples: Long) = numExamples(JsonField.of(numExamples))

                fun numExamples(numExamples: JsonField<Long>) = apply {
                    this.numExamples = numExamples
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

                fun build(): Benchmark =
                    Benchmark(
                        checkRequired("evalCandidate", evalCandidate),
                        checkRequired("type", type),
                        numExamples,
                        additionalProperties.toImmutable(),
                    )
            }

            @JsonDeserialize(using = EvalCandidate.Deserializer::class)
            @JsonSerialize(using = EvalCandidate.Serializer::class)
            class EvalCandidate
            private constructor(
                private val model: Model? = null,
                private val agent: Agent? = null,
                private val _json: JsonValue? = null,
            ) {

                fun model(): Model? = model

                fun agent(): Agent? = agent

                fun isModel(): Boolean = model != null

                fun isAgent(): Boolean = agent != null

                fun asModel(): Model = model.getOrThrow("model")

                fun asAgent(): Agent = agent.getOrThrow("agent")

                fun _json(): JsonValue? = _json

                fun <T> accept(visitor: Visitor<T>): T {
                    return when {
                        model != null -> visitor.visitModel(model)
                        agent != null -> visitor.visitAgent(agent)
                        else -> visitor.unknown(_json)
                    }
                }

                private var validated: Boolean = false

                fun validate(): EvalCandidate = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitModel(model: Model) {
                                model.validate()
                            }

                            override fun visitAgent(agent: Agent) {
                                agent.validate()
                            }
                        }
                    )
                    validated = true
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is EvalCandidate && model == other.model && agent == other.agent /* spotless:on */
                }

                override fun hashCode(): Int = /* spotless:off */ Objects.hash(model, agent) /* spotless:on */

                override fun toString(): String =
                    when {
                        model != null -> "EvalCandidate{model=$model}"
                        agent != null -> "EvalCandidate{agent=$agent}"
                        _json != null -> "EvalCandidate{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid EvalCandidate")
                    }

                companion object {

                    fun ofModel(model: Model) = EvalCandidate(model = model)

                    fun ofAgent(agent: Agent) = EvalCandidate(agent = agent)
                }

                interface Visitor<out T> {

                    fun visitModel(model: Model): T

                    fun visitAgent(agent: Agent): T

                    fun unknown(json: JsonValue?): T {
                        throw LlamaStackClientInvalidDataException("Unknown EvalCandidate: $json")
                    }
                }

                class Deserializer : BaseDeserializer<EvalCandidate>(EvalCandidate::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): EvalCandidate {
                        val json = JsonValue.fromJsonNode(node)
                        val type = json.asObject()?.get("type")?.asString()

                        when (type) {
                            "model" -> {
                                tryDeserialize(node, jacksonTypeRef<Model>()) { it.validate() }
                                    ?.let {
                                        return EvalCandidate(model = it, _json = json)
                                    }
                            }
                            "agent" -> {
                                tryDeserialize(node, jacksonTypeRef<Agent>()) { it.validate() }
                                    ?.let {
                                        return EvalCandidate(agent = it, _json = json)
                                    }
                            }
                        }

                        return EvalCandidate(_json = json)
                    }
                }

                class Serializer : BaseSerializer<EvalCandidate>(EvalCandidate::class) {

                    override fun serialize(
                        value: EvalCandidate,
                        generator: JsonGenerator,
                        provider: SerializerProvider
                    ) {
                        when {
                            value.model != null -> generator.writeObject(value.model)
                            value.agent != null -> generator.writeObject(value.agent)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid EvalCandidate")
                        }
                    }
                }

                @NoAutoDetect
                class Model
                @JsonCreator
                private constructor(
                    @JsonProperty("model")
                    @ExcludeMissing
                    private val model: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("sampling_params")
                    @ExcludeMissing
                    private val samplingParams: JsonField<SamplingParams> = JsonMissing.of(),
                    @JsonProperty("type")
                    @ExcludeMissing
                    private val type: JsonField<Type> = JsonMissing.of(),
                    @JsonProperty("system_message")
                    @ExcludeMissing
                    private val systemMessage: JsonField<SystemMessage> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun model(): String = model.getRequired("model")

                    fun samplingParams(): SamplingParams =
                        samplingParams.getRequired("sampling_params")

                    fun type(): Type = type.getRequired("type")

                    fun systemMessage(): SystemMessage? =
                        systemMessage.getNullable("system_message")

                    @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

                    @JsonProperty("sampling_params")
                    @ExcludeMissing
                    fun _samplingParams(): JsonField<SamplingParams> = samplingParams

                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                    @JsonProperty("system_message")
                    @ExcludeMissing
                    fun _systemMessage(): JsonField<SystemMessage> = systemMessage

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Model = apply {
                        if (validated) {
                            return@apply
                        }

                        model()
                        samplingParams().validate()
                        type()
                        systemMessage()?.validate()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var model: JsonField<String>? = null
                        private var samplingParams: JsonField<SamplingParams>? = null
                        private var type: JsonField<Type>? = null
                        private var systemMessage: JsonField<SystemMessage> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(model: Model) = apply {
                            this.model = model.model
                            samplingParams = model.samplingParams
                            type = model.type
                            systemMessage = model.systemMessage
                            additionalProperties = model.additionalProperties.toMutableMap()
                        }

                        fun model(model: String) = model(JsonField.of(model))

                        fun model(model: JsonField<String>) = apply { this.model = model }

                        fun samplingParams(samplingParams: SamplingParams) =
                            samplingParams(JsonField.of(samplingParams))

                        fun samplingParams(samplingParams: JsonField<SamplingParams>) = apply {
                            this.samplingParams = samplingParams
                        }

                        fun type(type: Type) = type(JsonField.of(type))

                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        fun systemMessage(systemMessage: SystemMessage) =
                            systemMessage(JsonField.of(systemMessage))

                        fun systemMessage(systemMessage: JsonField<SystemMessage>) = apply {
                            this.systemMessage = systemMessage
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): Model =
                            Model(
                                checkRequired("model", model),
                                checkRequired("samplingParams", samplingParams),
                                checkRequired("type", type),
                                systemMessage,
                                additionalProperties.toImmutable(),
                            )
                    }

                    class Type
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            val MODEL = of("model")

                            fun of(value: String) = Type(JsonField.of(value))
                        }

                        enum class Known {
                            MODEL,
                        }

                        enum class Value {
                            MODEL,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                MODEL -> Value.MODEL
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                MODEL -> Known.MODEL
                                else ->
                                    throw LlamaStackClientInvalidDataException(
                                        "Unknown Type: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Model && model == other.model && samplingParams == other.samplingParams && type == other.type && systemMessage == other.systemMessage && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(model, samplingParams, type, systemMessage, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Model{model=$model, samplingParams=$samplingParams, type=$type, systemMessage=$systemMessage, additionalProperties=$additionalProperties}"
                }

                @NoAutoDetect
                class Agent
                @JsonCreator
                private constructor(
                    @JsonProperty("config")
                    @ExcludeMissing
                    private val config: JsonField<AgentConfig> = JsonMissing.of(),
                    @JsonProperty("type")
                    @ExcludeMissing
                    private val type: JsonField<Type> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun config(): AgentConfig = config.getRequired("config")

                    fun type(): Type = type.getRequired("type")

                    @JsonProperty("config")
                    @ExcludeMissing
                    fun _config(): JsonField<AgentConfig> = config

                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Agent = apply {
                        if (validated) {
                            return@apply
                        }

                        config().validate()
                        type()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var config: JsonField<AgentConfig>? = null
                        private var type: JsonField<Type>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(agent: Agent) = apply {
                            config = agent.config
                            type = agent.type
                            additionalProperties = agent.additionalProperties.toMutableMap()
                        }

                        fun config(config: AgentConfig) = config(JsonField.of(config))

                        fun config(config: JsonField<AgentConfig>) = apply { this.config = config }

                        fun type(type: Type) = type(JsonField.of(type))

                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): Agent =
                            Agent(
                                checkRequired("config", config),
                                checkRequired("type", type),
                                additionalProperties.toImmutable(),
                            )
                    }

                    class Type
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            val AGENT = of("agent")

                            fun of(value: String) = Type(JsonField.of(value))
                        }

                        enum class Known {
                            AGENT,
                        }

                        enum class Value {
                            AGENT,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                AGENT -> Value.AGENT
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                AGENT -> Known.AGENT
                                else ->
                                    throw LlamaStackClientInvalidDataException(
                                        "Unknown Type: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Agent && config == other.config && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(config, type, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Agent{config=$config, type=$type, additionalProperties=$additionalProperties}"
                }
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val BENCHMARK = of("benchmark")

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    BENCHMARK,
                }

                enum class Value {
                    BENCHMARK,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        BENCHMARK -> Value.BENCHMARK
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        BENCHMARK -> Known.BENCHMARK
                        else -> throw LlamaStackClientInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Benchmark && evalCandidate == other.evalCandidate && type == other.type && numExamples == other.numExamples && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(evalCandidate, type, numExamples, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Benchmark{evalCandidate=$evalCandidate, type=$type, numExamples=$numExamples, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class App
        @JsonCreator
        private constructor(
            @JsonProperty("eval_candidate")
            @ExcludeMissing
            private val evalCandidate: JsonField<EvalCandidate> = JsonMissing.of(),
            @JsonProperty("scoring_params")
            @ExcludeMissing
            private val scoringParams: JsonField<ScoringParams> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("num_examples")
            @ExcludeMissing
            private val numExamples: JsonField<Long> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun evalCandidate(): EvalCandidate = evalCandidate.getRequired("eval_candidate")

            fun scoringParams(): ScoringParams = scoringParams.getRequired("scoring_params")

            fun type(): Type = type.getRequired("type")

            fun numExamples(): Long? = numExamples.getNullable("num_examples")

            @JsonProperty("eval_candidate")
            @ExcludeMissing
            fun _evalCandidate(): JsonField<EvalCandidate> = evalCandidate

            @JsonProperty("scoring_params")
            @ExcludeMissing
            fun _scoringParams(): JsonField<ScoringParams> = scoringParams

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonProperty("num_examples")
            @ExcludeMissing
            fun _numExamples(): JsonField<Long> = numExamples

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): App = apply {
                if (validated) {
                    return@apply
                }

                evalCandidate().validate()
                scoringParams().validate()
                type()
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
                private var type: JsonField<Type>? = null
                private var numExamples: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(app: App) = apply {
                    evalCandidate = app.evalCandidate
                    scoringParams = app.scoringParams
                    type = app.type
                    numExamples = app.numExamples
                    additionalProperties = app.additionalProperties.toMutableMap()
                }

                fun evalCandidate(evalCandidate: EvalCandidate) =
                    evalCandidate(JsonField.of(evalCandidate))

                fun evalCandidate(evalCandidate: JsonField<EvalCandidate>) = apply {
                    this.evalCandidate = evalCandidate
                }

                fun evalCandidate(model: EvalCandidate.Model) =
                    evalCandidate(EvalCandidate.ofModel(model))

                fun evalCandidate(agent: EvalCandidate.Agent) =
                    evalCandidate(EvalCandidate.ofAgent(agent))

                fun scoringParams(scoringParams: ScoringParams) =
                    scoringParams(JsonField.of(scoringParams))

                fun scoringParams(scoringParams: JsonField<ScoringParams>) = apply {
                    this.scoringParams = scoringParams
                }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun numExamples(numExamples: Long) = numExamples(JsonField.of(numExamples))

                fun numExamples(numExamples: JsonField<Long>) = apply {
                    this.numExamples = numExamples
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

                fun build(): App =
                    App(
                        checkRequired("evalCandidate", evalCandidate),
                        checkRequired("scoringParams", scoringParams),
                        checkRequired("type", type),
                        numExamples,
                        additionalProperties.toImmutable(),
                    )
            }

            @JsonDeserialize(using = EvalCandidate.Deserializer::class)
            @JsonSerialize(using = EvalCandidate.Serializer::class)
            class EvalCandidate
            private constructor(
                private val model: Model? = null,
                private val agent: Agent? = null,
                private val _json: JsonValue? = null,
            ) {

                fun model(): Model? = model

                fun agent(): Agent? = agent

                fun isModel(): Boolean = model != null

                fun isAgent(): Boolean = agent != null

                fun asModel(): Model = model.getOrThrow("model")

                fun asAgent(): Agent = agent.getOrThrow("agent")

                fun _json(): JsonValue? = _json

                fun <T> accept(visitor: Visitor<T>): T {
                    return when {
                        model != null -> visitor.visitModel(model)
                        agent != null -> visitor.visitAgent(agent)
                        else -> visitor.unknown(_json)
                    }
                }

                private var validated: Boolean = false

                fun validate(): EvalCandidate = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitModel(model: Model) {
                                model.validate()
                            }

                            override fun visitAgent(agent: Agent) {
                                agent.validate()
                            }
                        }
                    )
                    validated = true
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is EvalCandidate && model == other.model && agent == other.agent /* spotless:on */
                }

                override fun hashCode(): Int = /* spotless:off */ Objects.hash(model, agent) /* spotless:on */

                override fun toString(): String =
                    when {
                        model != null -> "EvalCandidate{model=$model}"
                        agent != null -> "EvalCandidate{agent=$agent}"
                        _json != null -> "EvalCandidate{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid EvalCandidate")
                    }

                companion object {

                    fun ofModel(model: Model) = EvalCandidate(model = model)

                    fun ofAgent(agent: Agent) = EvalCandidate(agent = agent)
                }

                interface Visitor<out T> {

                    fun visitModel(model: Model): T

                    fun visitAgent(agent: Agent): T

                    fun unknown(json: JsonValue?): T {
                        throw LlamaStackClientInvalidDataException("Unknown EvalCandidate: $json")
                    }
                }

                class Deserializer : BaseDeserializer<EvalCandidate>(EvalCandidate::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): EvalCandidate {
                        val json = JsonValue.fromJsonNode(node)
                        val type = json.asObject()?.get("type")?.asString()

                        when (type) {
                            "model" -> {
                                tryDeserialize(node, jacksonTypeRef<Model>()) { it.validate() }
                                    ?.let {
                                        return EvalCandidate(model = it, _json = json)
                                    }
                            }
                            "agent" -> {
                                tryDeserialize(node, jacksonTypeRef<Agent>()) { it.validate() }
                                    ?.let {
                                        return EvalCandidate(agent = it, _json = json)
                                    }
                            }
                        }

                        return EvalCandidate(_json = json)
                    }
                }

                class Serializer : BaseSerializer<EvalCandidate>(EvalCandidate::class) {

                    override fun serialize(
                        value: EvalCandidate,
                        generator: JsonGenerator,
                        provider: SerializerProvider
                    ) {
                        when {
                            value.model != null -> generator.writeObject(value.model)
                            value.agent != null -> generator.writeObject(value.agent)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid EvalCandidate")
                        }
                    }
                }

                @NoAutoDetect
                class Model
                @JsonCreator
                private constructor(
                    @JsonProperty("model")
                    @ExcludeMissing
                    private val model: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("sampling_params")
                    @ExcludeMissing
                    private val samplingParams: JsonField<SamplingParams> = JsonMissing.of(),
                    @JsonProperty("type")
                    @ExcludeMissing
                    private val type: JsonField<Type> = JsonMissing.of(),
                    @JsonProperty("system_message")
                    @ExcludeMissing
                    private val systemMessage: JsonField<SystemMessage> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun model(): String = model.getRequired("model")

                    fun samplingParams(): SamplingParams =
                        samplingParams.getRequired("sampling_params")

                    fun type(): Type = type.getRequired("type")

                    fun systemMessage(): SystemMessage? =
                        systemMessage.getNullable("system_message")

                    @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

                    @JsonProperty("sampling_params")
                    @ExcludeMissing
                    fun _samplingParams(): JsonField<SamplingParams> = samplingParams

                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                    @JsonProperty("system_message")
                    @ExcludeMissing
                    fun _systemMessage(): JsonField<SystemMessage> = systemMessage

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Model = apply {
                        if (validated) {
                            return@apply
                        }

                        model()
                        samplingParams().validate()
                        type()
                        systemMessage()?.validate()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var model: JsonField<String>? = null
                        private var samplingParams: JsonField<SamplingParams>? = null
                        private var type: JsonField<Type>? = null
                        private var systemMessage: JsonField<SystemMessage> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(model: Model) = apply {
                            this.model = model.model
                            samplingParams = model.samplingParams
                            type = model.type
                            systemMessage = model.systemMessage
                            additionalProperties = model.additionalProperties.toMutableMap()
                        }

                        fun model(model: String) = model(JsonField.of(model))

                        fun model(model: JsonField<String>) = apply { this.model = model }

                        fun samplingParams(samplingParams: SamplingParams) =
                            samplingParams(JsonField.of(samplingParams))

                        fun samplingParams(samplingParams: JsonField<SamplingParams>) = apply {
                            this.samplingParams = samplingParams
                        }

                        fun type(type: Type) = type(JsonField.of(type))

                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        fun systemMessage(systemMessage: SystemMessage) =
                            systemMessage(JsonField.of(systemMessage))

                        fun systemMessage(systemMessage: JsonField<SystemMessage>) = apply {
                            this.systemMessage = systemMessage
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): Model =
                            Model(
                                checkRequired("model", model),
                                checkRequired("samplingParams", samplingParams),
                                checkRequired("type", type),
                                systemMessage,
                                additionalProperties.toImmutable(),
                            )
                    }

                    class Type
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            val MODEL = of("model")

                            fun of(value: String) = Type(JsonField.of(value))
                        }

                        enum class Known {
                            MODEL,
                        }

                        enum class Value {
                            MODEL,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                MODEL -> Value.MODEL
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                MODEL -> Known.MODEL
                                else ->
                                    throw LlamaStackClientInvalidDataException(
                                        "Unknown Type: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Model && model == other.model && samplingParams == other.samplingParams && type == other.type && systemMessage == other.systemMessage && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(model, samplingParams, type, systemMessage, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Model{model=$model, samplingParams=$samplingParams, type=$type, systemMessage=$systemMessage, additionalProperties=$additionalProperties}"
                }

                @NoAutoDetect
                class Agent
                @JsonCreator
                private constructor(
                    @JsonProperty("config")
                    @ExcludeMissing
                    private val config: JsonField<AgentConfig> = JsonMissing.of(),
                    @JsonProperty("type")
                    @ExcludeMissing
                    private val type: JsonField<Type> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun config(): AgentConfig = config.getRequired("config")

                    fun type(): Type = type.getRequired("type")

                    @JsonProperty("config")
                    @ExcludeMissing
                    fun _config(): JsonField<AgentConfig> = config

                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Agent = apply {
                        if (validated) {
                            return@apply
                        }

                        config().validate()
                        type()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var config: JsonField<AgentConfig>? = null
                        private var type: JsonField<Type>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(agent: Agent) = apply {
                            config = agent.config
                            type = agent.type
                            additionalProperties = agent.additionalProperties.toMutableMap()
                        }

                        fun config(config: AgentConfig) = config(JsonField.of(config))

                        fun config(config: JsonField<AgentConfig>) = apply { this.config = config }

                        fun type(type: Type) = type(JsonField.of(type))

                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): Agent =
                            Agent(
                                checkRequired("config", config),
                                checkRequired("type", type),
                                additionalProperties.toImmutable(),
                            )
                    }

                    class Type
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            val AGENT = of("agent")

                            fun of(value: String) = Type(JsonField.of(value))
                        }

                        enum class Known {
                            AGENT,
                        }

                        enum class Value {
                            AGENT,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                AGENT -> Value.AGENT
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                AGENT -> Known.AGENT
                                else ->
                                    throw LlamaStackClientInvalidDataException(
                                        "Unknown Type: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Agent && config == other.config && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(config, type, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Agent{config=$config, type=$type, additionalProperties=$additionalProperties}"
                }
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

                override fun toString() =
                    "ScoringParams{additionalProperties=$additionalProperties}"
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val APP = of("app")

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    APP,
                }

                enum class Value {
                    APP,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        APP -> Value.APP
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        APP -> Known.APP
                        else -> throw LlamaStackClientInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is App && evalCandidate == other.evalCandidate && scoringParams == other.scoringParams && type == other.type && numExamples == other.numExamples && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(evalCandidate, scoringParams, type, numExamples, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "App{evalCandidate=$evalCandidate, scoringParams=$scoringParams, type=$type, numExamples=$numExamples, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EvalRunEvalParams && taskId == other.taskId && xLlamaStackClientVersion == other.xLlamaStackClientVersion && xLlamaStackProviderData == other.xLlamaStackProviderData && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(taskId, xLlamaStackClientVersion, xLlamaStackProviderData, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "EvalRunEvalParams{taskId=$taskId, xLlamaStackClientVersion=$xLlamaStackClientVersion, xLlamaStackProviderData=$xLlamaStackProviderData, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
