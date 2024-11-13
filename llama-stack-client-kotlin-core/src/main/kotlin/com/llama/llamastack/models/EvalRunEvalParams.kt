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
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import com.llama.llamastack.models.*
import java.util.Objects

class EvalRunEvalParams
constructor(
    private val taskConfig: TaskConfig,
    private val taskId: String,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun taskConfig(): TaskConfig = taskConfig

    fun taskId(): String = taskId

    internal fun getBody(): EvalRunEvalBody {
        return EvalRunEvalBody(
            taskConfig,
            taskId,
            additionalBodyProperties,
        )
    }

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = EvalRunEvalBody.Builder::class)
    @NoAutoDetect
    class EvalRunEvalBody
    internal constructor(
        private val taskConfig: TaskConfig?,
        private val taskId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("task_config") fun taskConfig(): TaskConfig? = taskConfig

        @JsonProperty("task_id") fun taskId(): String? = taskId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var taskConfig: TaskConfig? = null
            private var taskId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(evalRunEvalBody: EvalRunEvalBody) = apply {
                this.taskConfig = evalRunEvalBody.taskConfig
                this.taskId = evalRunEvalBody.taskId
                additionalProperties(evalRunEvalBody.additionalProperties)
            }

            @JsonProperty("task_config")
            fun taskConfig(taskConfig: TaskConfig) = apply { this.taskConfig = taskConfig }

            @JsonProperty("task_id") fun taskId(taskId: String) = apply { this.taskId = taskId }

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

            fun build(): EvalRunEvalBody =
                EvalRunEvalBody(
                    checkNotNull(taskConfig) { "`taskConfig` is required but was not set" },
                    checkNotNull(taskId) { "`taskId` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is EvalRunEvalBody && this.taskConfig == other.taskConfig && this.taskId == other.taskId && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(taskConfig, taskId, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "EvalRunEvalBody{taskConfig=$taskConfig, taskId=$taskId, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EvalRunEvalParams && this.taskConfig == other.taskConfig && this.taskId == other.taskId && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(taskConfig, taskId, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "EvalRunEvalParams{taskConfig=$taskConfig, taskId=$taskId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var taskConfig: TaskConfig? = null
        private var taskId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(evalRunEvalParams: EvalRunEvalParams) = apply {
            this.taskConfig = evalRunEvalParams.taskConfig
            this.taskId = evalRunEvalParams.taskId
            additionalHeaders(evalRunEvalParams.additionalHeaders)
            additionalQueryParams(evalRunEvalParams.additionalQueryParams)
            additionalBodyProperties(evalRunEvalParams.additionalBodyProperties)
        }

        fun taskConfig(taskConfig: TaskConfig) = apply { this.taskConfig = taskConfig }

        fun taskConfig(benchmarkEvalTaskConfig: TaskConfig.BenchmarkEvalTaskConfig) = apply {
            this.taskConfig = TaskConfig.ofBenchmarkEvalTaskConfig(benchmarkEvalTaskConfig)
        }

        fun taskConfig(appEvalTaskConfig: TaskConfig.AppEvalTaskConfig) = apply {
            this.taskConfig = TaskConfig.ofAppEvalTaskConfig(appEvalTaskConfig)
        }

        fun taskId(taskId: String) = apply { this.taskId = taskId }

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): EvalRunEvalParams =
            EvalRunEvalParams(
                checkNotNull(taskConfig) { "`taskConfig` is required but was not set" },
                checkNotNull(taskId) { "`taskId` is required but was not set" },
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    @JsonDeserialize(using = TaskConfig.Deserializer::class)
    @JsonSerialize(using = TaskConfig.Serializer::class)
    class TaskConfig
    private constructor(
        private val benchmarkEvalTaskConfig: BenchmarkEvalTaskConfig? = null,
        private val appEvalTaskConfig: AppEvalTaskConfig? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun benchmarkEvalTaskConfig(): BenchmarkEvalTaskConfig? = benchmarkEvalTaskConfig

        fun appEvalTaskConfig(): AppEvalTaskConfig? = appEvalTaskConfig

        fun isBenchmarkEvalTaskConfig(): Boolean = benchmarkEvalTaskConfig != null

        fun isAppEvalTaskConfig(): Boolean = appEvalTaskConfig != null

        fun asBenchmarkEvalTaskConfig(): BenchmarkEvalTaskConfig =
            benchmarkEvalTaskConfig.getOrThrow("benchmarkEvalTaskConfig")

        fun asAppEvalTaskConfig(): AppEvalTaskConfig =
            appEvalTaskConfig.getOrThrow("appEvalTaskConfig")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                benchmarkEvalTaskConfig != null ->
                    visitor.visitBenchmarkEvalTaskConfig(benchmarkEvalTaskConfig)
                appEvalTaskConfig != null -> visitor.visitAppEvalTaskConfig(appEvalTaskConfig)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): TaskConfig = apply {
            if (!validated) {
                if (benchmarkEvalTaskConfig == null && appEvalTaskConfig == null) {
                    throw LlamaStackClientInvalidDataException("Unknown TaskConfig: $_json")
                }
                benchmarkEvalTaskConfig?.validate()
                appEvalTaskConfig?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TaskConfig && this.benchmarkEvalTaskConfig == other.benchmarkEvalTaskConfig && this.appEvalTaskConfig == other.appEvalTaskConfig /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(benchmarkEvalTaskConfig, appEvalTaskConfig) /* spotless:on */
        }

        override fun toString(): String {
            return when {
                benchmarkEvalTaskConfig != null ->
                    "TaskConfig{benchmarkEvalTaskConfig=$benchmarkEvalTaskConfig}"
                appEvalTaskConfig != null -> "TaskConfig{appEvalTaskConfig=$appEvalTaskConfig}"
                _json != null -> "TaskConfig{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid TaskConfig")
            }
        }

        companion object {

            fun ofBenchmarkEvalTaskConfig(benchmarkEvalTaskConfig: BenchmarkEvalTaskConfig) =
                TaskConfig(benchmarkEvalTaskConfig = benchmarkEvalTaskConfig)

            fun ofAppEvalTaskConfig(appEvalTaskConfig: AppEvalTaskConfig) =
                TaskConfig(appEvalTaskConfig = appEvalTaskConfig)
        }

        interface Visitor<out T> {

            fun visitBenchmarkEvalTaskConfig(benchmarkEvalTaskConfig: BenchmarkEvalTaskConfig): T

            fun visitAppEvalTaskConfig(appEvalTaskConfig: AppEvalTaskConfig): T

            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown TaskConfig: $json")
            }
        }

        class Deserializer : BaseDeserializer<TaskConfig>(TaskConfig::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): TaskConfig {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<BenchmarkEvalTaskConfig>()) { it.validate() }
                    ?.let {
                        return TaskConfig(benchmarkEvalTaskConfig = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<AppEvalTaskConfig>()) { it.validate() }
                    ?.let {
                        return TaskConfig(appEvalTaskConfig = it, _json = json)
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
                    value.benchmarkEvalTaskConfig != null ->
                        generator.writeObject(value.benchmarkEvalTaskConfig)
                    value.appEvalTaskConfig != null ->
                        generator.writeObject(value.appEvalTaskConfig)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid TaskConfig")
                }
            }
        }

        @JsonDeserialize(builder = BenchmarkEvalTaskConfig.Builder::class)
        @NoAutoDetect
        class BenchmarkEvalTaskConfig
        private constructor(
            private val evalCandidate: JsonField<EvalCandidate>,
            private val numExamples: JsonField<Long>,
            private val type: JsonField<Type>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun evalCandidate(): EvalCandidate = evalCandidate.getRequired("eval_candidate")

            fun numExamples(): Long? = numExamples.getNullable("num_examples")

            fun type(): Type = type.getRequired("type")

            @JsonProperty("eval_candidate") @ExcludeMissing fun _evalCandidate() = evalCandidate

            @JsonProperty("num_examples") @ExcludeMissing fun _numExamples() = numExamples

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): BenchmarkEvalTaskConfig = apply {
                if (!validated) {
                    evalCandidate()
                    numExamples()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var evalCandidate: JsonField<EvalCandidate> = JsonMissing.of()
                private var numExamples: JsonField<Long> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(benchmarkEvalTaskConfig: BenchmarkEvalTaskConfig) = apply {
                    this.evalCandidate = benchmarkEvalTaskConfig.evalCandidate
                    this.numExamples = benchmarkEvalTaskConfig.numExamples
                    this.type = benchmarkEvalTaskConfig.type
                    additionalProperties(benchmarkEvalTaskConfig.additionalProperties)
                }

                fun evalCandidate(evalCandidate: EvalCandidate) =
                    evalCandidate(JsonField.of(evalCandidate))

                @JsonProperty("eval_candidate")
                @ExcludeMissing
                fun evalCandidate(evalCandidate: JsonField<EvalCandidate>) = apply {
                    this.evalCandidate = evalCandidate
                }

                fun numExamples(numExamples: Long) = numExamples(JsonField.of(numExamples))

                @JsonProperty("num_examples")
                @ExcludeMissing
                fun numExamples(numExamples: JsonField<Long>) = apply {
                    this.numExamples = numExamples
                }

                fun type(type: Type) = type(JsonField.of(type))

                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BenchmarkEvalTaskConfig =
                    BenchmarkEvalTaskConfig(
                        evalCandidate,
                        numExamples,
                        type,
                        additionalProperties.toImmutable(),
                    )
            }

            @JsonDeserialize(using = EvalCandidate.Deserializer::class)
            @JsonSerialize(using = EvalCandidate.Serializer::class)
            class EvalCandidate
            private constructor(
                private val modelCandidate: ModelCandidate? = null,
                private val agentCandidate: AgentCandidate? = null,
                private val _json: JsonValue? = null,
            ) {

                private var validated: Boolean = false

                fun modelCandidate(): ModelCandidate? = modelCandidate

                fun agentCandidate(): AgentCandidate? = agentCandidate

                fun isModelCandidate(): Boolean = modelCandidate != null

                fun isAgentCandidate(): Boolean = agentCandidate != null

                fun asModelCandidate(): ModelCandidate = modelCandidate.getOrThrow("modelCandidate")

                fun asAgentCandidate(): AgentCandidate = agentCandidate.getOrThrow("agentCandidate")

                fun _json(): JsonValue? = _json

                fun <T> accept(visitor: Visitor<T>): T {
                    return when {
                        modelCandidate != null -> visitor.visitModelCandidate(modelCandidate)
                        agentCandidate != null -> visitor.visitAgentCandidate(agentCandidate)
                        else -> visitor.unknown(_json)
                    }
                }

                fun validate(): EvalCandidate = apply {
                    if (!validated) {
                        if (modelCandidate == null && agentCandidate == null) {
                            throw LlamaStackClientInvalidDataException(
                                "Unknown EvalCandidate: $_json"
                            )
                        }
                        modelCandidate?.validate()
                        agentCandidate?.validate()
                        validated = true
                    }
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is EvalCandidate && this.modelCandidate == other.modelCandidate && this.agentCandidate == other.agentCandidate /* spotless:on */
                }

                override fun hashCode(): Int {
                    return /* spotless:off */ Objects.hash(modelCandidate, agentCandidate) /* spotless:on */
                }

                override fun toString(): String {
                    return when {
                        modelCandidate != null -> "EvalCandidate{modelCandidate=$modelCandidate}"
                        agentCandidate != null -> "EvalCandidate{agentCandidate=$agentCandidate}"
                        _json != null -> "EvalCandidate{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid EvalCandidate")
                    }
                }

                companion object {

                    fun ofModelCandidate(modelCandidate: ModelCandidate) =
                        EvalCandidate(modelCandidate = modelCandidate)

                    fun ofAgentCandidate(agentCandidate: AgentCandidate) =
                        EvalCandidate(agentCandidate = agentCandidate)
                }

                interface Visitor<out T> {

                    fun visitModelCandidate(modelCandidate: ModelCandidate): T

                    fun visitAgentCandidate(agentCandidate: AgentCandidate): T

                    fun unknown(json: JsonValue?): T {
                        throw LlamaStackClientInvalidDataException("Unknown EvalCandidate: $json")
                    }
                }

                class Deserializer : BaseDeserializer<EvalCandidate>(EvalCandidate::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): EvalCandidate {
                        val json = JsonValue.fromJsonNode(node)

                        tryDeserialize(node, jacksonTypeRef<ModelCandidate>()) { it.validate() }
                            ?.let {
                                return EvalCandidate(modelCandidate = it, _json = json)
                            }
                        tryDeserialize(node, jacksonTypeRef<AgentCandidate>()) { it.validate() }
                            ?.let {
                                return EvalCandidate(agentCandidate = it, _json = json)
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
                            value.modelCandidate != null ->
                                generator.writeObject(value.modelCandidate)
                            value.agentCandidate != null ->
                                generator.writeObject(value.agentCandidate)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid EvalCandidate")
                        }
                    }
                }

                @JsonDeserialize(builder = ModelCandidate.Builder::class)
                @NoAutoDetect
                class ModelCandidate
                private constructor(
                    private val model: JsonField<String>,
                    private val samplingParams: JsonField<SamplingParams>,
                    private val systemMessage: JsonField<SystemMessage>,
                    private val type: JsonField<Type>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    fun model(): String = model.getRequired("model")

                    fun samplingParams(): SamplingParams =
                        samplingParams.getRequired("sampling_params")

                    fun systemMessage(): SystemMessage? =
                        systemMessage.getNullable("system_message")

                    fun type(): Type = type.getRequired("type")

                    @JsonProperty("model") @ExcludeMissing fun _model() = model

                    @JsonProperty("sampling_params")
                    @ExcludeMissing
                    fun _samplingParams() = samplingParams

                    @JsonProperty("system_message")
                    @ExcludeMissing
                    fun _systemMessage() = systemMessage

                    @JsonProperty("type") @ExcludeMissing fun _type() = type

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): ModelCandidate = apply {
                        if (!validated) {
                            model()
                            samplingParams().validate()
                            systemMessage()?.validate()
                            type()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var model: JsonField<String> = JsonMissing.of()
                        private var samplingParams: JsonField<SamplingParams> = JsonMissing.of()
                        private var systemMessage: JsonField<SystemMessage> = JsonMissing.of()
                        private var type: JsonField<Type> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(modelCandidate: ModelCandidate) = apply {
                            this.model = modelCandidate.model
                            this.samplingParams = modelCandidate.samplingParams
                            this.systemMessage = modelCandidate.systemMessage
                            this.type = modelCandidate.type
                            additionalProperties(modelCandidate.additionalProperties)
                        }

                        fun model(model: String) = model(JsonField.of(model))

                        @JsonProperty("model")
                        @ExcludeMissing
                        fun model(model: JsonField<String>) = apply { this.model = model }

                        fun samplingParams(samplingParams: SamplingParams) =
                            samplingParams(JsonField.of(samplingParams))

                        @JsonProperty("sampling_params")
                        @ExcludeMissing
                        fun samplingParams(samplingParams: JsonField<SamplingParams>) = apply {
                            this.samplingParams = samplingParams
                        }

                        fun systemMessage(systemMessage: SystemMessage) =
                            systemMessage(JsonField.of(systemMessage))

                        @JsonProperty("system_message")
                        @ExcludeMissing
                        fun systemMessage(systemMessage: JsonField<SystemMessage>) = apply {
                            this.systemMessage = systemMessage
                        }

                        fun type(type: Type) = type(JsonField.of(type))

                        @JsonProperty("type")
                        @ExcludeMissing
                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): ModelCandidate =
                            ModelCandidate(
                                model,
                                samplingParams,
                                systemMessage,
                                type,
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

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val MODEL = Type(JsonField.of("model"))

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
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is ModelCandidate && this.model == other.model && this.samplingParams == other.samplingParams && this.systemMessage == other.systemMessage && this.type == other.type && this.additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    private var hashCode: Int = 0

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = /* spotless:off */ Objects.hash(model, samplingParams, systemMessage, type, additionalProperties) /* spotless:on */
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "ModelCandidate{model=$model, samplingParams=$samplingParams, systemMessage=$systemMessage, type=$type, additionalProperties=$additionalProperties}"
                }

                @JsonDeserialize(builder = AgentCandidate.Builder::class)
                @NoAutoDetect
                class AgentCandidate
                private constructor(
                    private val config: JsonField<AgentConfig>,
                    private val type: JsonField<Type>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    fun config(): AgentConfig = config.getRequired("config")

                    fun type(): Type = type.getRequired("type")

                    @JsonProperty("config") @ExcludeMissing fun _config() = config

                    @JsonProperty("type") @ExcludeMissing fun _type() = type

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): AgentCandidate = apply {
                        if (!validated) {
                            config().validate()
                            type()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var config: JsonField<AgentConfig> = JsonMissing.of()
                        private var type: JsonField<Type> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(agentCandidate: AgentCandidate) = apply {
                            this.config = agentCandidate.config
                            this.type = agentCandidate.type
                            additionalProperties(agentCandidate.additionalProperties)
                        }

                        fun config(config: AgentConfig) = config(JsonField.of(config))

                        @JsonProperty("config")
                        @ExcludeMissing
                        fun config(config: JsonField<AgentConfig>) = apply { this.config = config }

                        fun type(type: Type) = type(JsonField.of(type))

                        @JsonProperty("type")
                        @ExcludeMissing
                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): AgentCandidate =
                            AgentCandidate(
                                config,
                                type,
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

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val AGENT = Type(JsonField.of("agent"))

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
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AgentCandidate && this.config == other.config && this.type == other.type && this.additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    private var hashCode: Int = 0

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = /* spotless:off */ Objects.hash(config, type, additionalProperties) /* spotless:on */
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "AgentCandidate{config=$config, type=$type, additionalProperties=$additionalProperties}"
                }
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val BENCHMARK = Type(JsonField.of("benchmark"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BenchmarkEvalTaskConfig && this.evalCandidate == other.evalCandidate && this.numExamples == other.numExamples && this.type == other.type && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(evalCandidate, numExamples, type, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "BenchmarkEvalTaskConfig{evalCandidate=$evalCandidate, numExamples=$numExamples, type=$type, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = AppEvalTaskConfig.Builder::class)
        @NoAutoDetect
        class AppEvalTaskConfig
        private constructor(
            private val evalCandidate: JsonField<EvalCandidate>,
            private val numExamples: JsonField<Long>,
            private val scoringParams: JsonField<ScoringParams>,
            private val type: JsonField<Type>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun evalCandidate(): EvalCandidate = evalCandidate.getRequired("eval_candidate")

            fun numExamples(): Long? = numExamples.getNullable("num_examples")

            fun scoringParams(): ScoringParams = scoringParams.getRequired("scoring_params")

            fun type(): Type = type.getRequired("type")

            @JsonProperty("eval_candidate") @ExcludeMissing fun _evalCandidate() = evalCandidate

            @JsonProperty("num_examples") @ExcludeMissing fun _numExamples() = numExamples

            @JsonProperty("scoring_params") @ExcludeMissing fun _scoringParams() = scoringParams

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): AppEvalTaskConfig = apply {
                if (!validated) {
                    evalCandidate()
                    numExamples()
                    scoringParams().validate()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var evalCandidate: JsonField<EvalCandidate> = JsonMissing.of()
                private var numExamples: JsonField<Long> = JsonMissing.of()
                private var scoringParams: JsonField<ScoringParams> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(appEvalTaskConfig: AppEvalTaskConfig) = apply {
                    this.evalCandidate = appEvalTaskConfig.evalCandidate
                    this.numExamples = appEvalTaskConfig.numExamples
                    this.scoringParams = appEvalTaskConfig.scoringParams
                    this.type = appEvalTaskConfig.type
                    additionalProperties(appEvalTaskConfig.additionalProperties)
                }

                fun evalCandidate(evalCandidate: EvalCandidate) =
                    evalCandidate(JsonField.of(evalCandidate))

                @JsonProperty("eval_candidate")
                @ExcludeMissing
                fun evalCandidate(evalCandidate: JsonField<EvalCandidate>) = apply {
                    this.evalCandidate = evalCandidate
                }

                fun numExamples(numExamples: Long) = numExamples(JsonField.of(numExamples))

                @JsonProperty("num_examples")
                @ExcludeMissing
                fun numExamples(numExamples: JsonField<Long>) = apply {
                    this.numExamples = numExamples
                }

                fun scoringParams(scoringParams: ScoringParams) =
                    scoringParams(JsonField.of(scoringParams))

                @JsonProperty("scoring_params")
                @ExcludeMissing
                fun scoringParams(scoringParams: JsonField<ScoringParams>) = apply {
                    this.scoringParams = scoringParams
                }

                fun type(type: Type) = type(JsonField.of(type))

                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): AppEvalTaskConfig =
                    AppEvalTaskConfig(
                        evalCandidate,
                        numExamples,
                        scoringParams,
                        type,
                        additionalProperties.toImmutable(),
                    )
            }

            @JsonDeserialize(using = EvalCandidate.Deserializer::class)
            @JsonSerialize(using = EvalCandidate.Serializer::class)
            class EvalCandidate
            private constructor(
                private val modelCandidate: ModelCandidate? = null,
                private val agentCandidate: AgentCandidate? = null,
                private val _json: JsonValue? = null,
            ) {

                private var validated: Boolean = false

                fun modelCandidate(): ModelCandidate? = modelCandidate

                fun agentCandidate(): AgentCandidate? = agentCandidate

                fun isModelCandidate(): Boolean = modelCandidate != null

                fun isAgentCandidate(): Boolean = agentCandidate != null

                fun asModelCandidate(): ModelCandidate = modelCandidate.getOrThrow("modelCandidate")

                fun asAgentCandidate(): AgentCandidate = agentCandidate.getOrThrow("agentCandidate")

                fun _json(): JsonValue? = _json

                fun <T> accept(visitor: Visitor<T>): T {
                    return when {
                        modelCandidate != null -> visitor.visitModelCandidate(modelCandidate)
                        agentCandidate != null -> visitor.visitAgentCandidate(agentCandidate)
                        else -> visitor.unknown(_json)
                    }
                }

                fun validate(): EvalCandidate = apply {
                    if (!validated) {
                        if (modelCandidate == null && agentCandidate == null) {
                            throw LlamaStackClientInvalidDataException(
                                "Unknown EvalCandidate: $_json"
                            )
                        }
                        modelCandidate?.validate()
                        agentCandidate?.validate()
                        validated = true
                    }
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is EvalCandidate && this.modelCandidate == other.modelCandidate && this.agentCandidate == other.agentCandidate /* spotless:on */
                }

                override fun hashCode(): Int {
                    return /* spotless:off */ Objects.hash(modelCandidate, agentCandidate) /* spotless:on */
                }

                override fun toString(): String {
                    return when {
                        modelCandidate != null -> "EvalCandidate{modelCandidate=$modelCandidate}"
                        agentCandidate != null -> "EvalCandidate{agentCandidate=$agentCandidate}"
                        _json != null -> "EvalCandidate{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid EvalCandidate")
                    }
                }

                companion object {

                    fun ofModelCandidate(modelCandidate: ModelCandidate) =
                        EvalCandidate(modelCandidate = modelCandidate)

                    fun ofAgentCandidate(agentCandidate: AgentCandidate) =
                        EvalCandidate(agentCandidate = agentCandidate)
                }

                interface Visitor<out T> {

                    fun visitModelCandidate(modelCandidate: ModelCandidate): T

                    fun visitAgentCandidate(agentCandidate: AgentCandidate): T

                    fun unknown(json: JsonValue?): T {
                        throw LlamaStackClientInvalidDataException("Unknown EvalCandidate: $json")
                    }
                }

                class Deserializer : BaseDeserializer<EvalCandidate>(EvalCandidate::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): EvalCandidate {
                        val json = JsonValue.fromJsonNode(node)

                        tryDeserialize(node, jacksonTypeRef<ModelCandidate>()) { it.validate() }
                            ?.let {
                                return EvalCandidate(modelCandidate = it, _json = json)
                            }
                        tryDeserialize(node, jacksonTypeRef<AgentCandidate>()) { it.validate() }
                            ?.let {
                                return EvalCandidate(agentCandidate = it, _json = json)
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
                            value.modelCandidate != null ->
                                generator.writeObject(value.modelCandidate)
                            value.agentCandidate != null ->
                                generator.writeObject(value.agentCandidate)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid EvalCandidate")
                        }
                    }
                }

                @JsonDeserialize(builder = ModelCandidate.Builder::class)
                @NoAutoDetect
                class ModelCandidate
                private constructor(
                    private val model: JsonField<String>,
                    private val samplingParams: JsonField<SamplingParams>,
                    private val systemMessage: JsonField<SystemMessage>,
                    private val type: JsonField<Type>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    fun model(): String = model.getRequired("model")

                    fun samplingParams(): SamplingParams =
                        samplingParams.getRequired("sampling_params")

                    fun systemMessage(): SystemMessage? =
                        systemMessage.getNullable("system_message")

                    fun type(): Type = type.getRequired("type")

                    @JsonProperty("model") @ExcludeMissing fun _model() = model

                    @JsonProperty("sampling_params")
                    @ExcludeMissing
                    fun _samplingParams() = samplingParams

                    @JsonProperty("system_message")
                    @ExcludeMissing
                    fun _systemMessage() = systemMessage

                    @JsonProperty("type") @ExcludeMissing fun _type() = type

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): ModelCandidate = apply {
                        if (!validated) {
                            model()
                            samplingParams().validate()
                            systemMessage()?.validate()
                            type()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var model: JsonField<String> = JsonMissing.of()
                        private var samplingParams: JsonField<SamplingParams> = JsonMissing.of()
                        private var systemMessage: JsonField<SystemMessage> = JsonMissing.of()
                        private var type: JsonField<Type> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(modelCandidate: ModelCandidate) = apply {
                            this.model = modelCandidate.model
                            this.samplingParams = modelCandidate.samplingParams
                            this.systemMessage = modelCandidate.systemMessage
                            this.type = modelCandidate.type
                            additionalProperties(modelCandidate.additionalProperties)
                        }

                        fun model(model: String) = model(JsonField.of(model))

                        @JsonProperty("model")
                        @ExcludeMissing
                        fun model(model: JsonField<String>) = apply { this.model = model }

                        fun samplingParams(samplingParams: SamplingParams) =
                            samplingParams(JsonField.of(samplingParams))

                        @JsonProperty("sampling_params")
                        @ExcludeMissing
                        fun samplingParams(samplingParams: JsonField<SamplingParams>) = apply {
                            this.samplingParams = samplingParams
                        }

                        fun systemMessage(systemMessage: SystemMessage) =
                            systemMessage(JsonField.of(systemMessage))

                        @JsonProperty("system_message")
                        @ExcludeMissing
                        fun systemMessage(systemMessage: JsonField<SystemMessage>) = apply {
                            this.systemMessage = systemMessage
                        }

                        fun type(type: Type) = type(JsonField.of(type))

                        @JsonProperty("type")
                        @ExcludeMissing
                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): ModelCandidate =
                            ModelCandidate(
                                model,
                                samplingParams,
                                systemMessage,
                                type,
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

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val MODEL = Type(JsonField.of("model"))

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
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is ModelCandidate && this.model == other.model && this.samplingParams == other.samplingParams && this.systemMessage == other.systemMessage && this.type == other.type && this.additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    private var hashCode: Int = 0

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = /* spotless:off */ Objects.hash(model, samplingParams, systemMessage, type, additionalProperties) /* spotless:on */
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "ModelCandidate{model=$model, samplingParams=$samplingParams, systemMessage=$systemMessage, type=$type, additionalProperties=$additionalProperties}"
                }

                @JsonDeserialize(builder = AgentCandidate.Builder::class)
                @NoAutoDetect
                class AgentCandidate
                private constructor(
                    private val config: JsonField<AgentConfig>,
                    private val type: JsonField<Type>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    fun config(): AgentConfig = config.getRequired("config")

                    fun type(): Type = type.getRequired("type")

                    @JsonProperty("config") @ExcludeMissing fun _config() = config

                    @JsonProperty("type") @ExcludeMissing fun _type() = type

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): AgentCandidate = apply {
                        if (!validated) {
                            config().validate()
                            type()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var config: JsonField<AgentConfig> = JsonMissing.of()
                        private var type: JsonField<Type> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(agentCandidate: AgentCandidate) = apply {
                            this.config = agentCandidate.config
                            this.type = agentCandidate.type
                            additionalProperties(agentCandidate.additionalProperties)
                        }

                        fun config(config: AgentConfig) = config(JsonField.of(config))

                        @JsonProperty("config")
                        @ExcludeMissing
                        fun config(config: JsonField<AgentConfig>) = apply { this.config = config }

                        fun type(type: Type) = type(JsonField.of(type))

                        @JsonProperty("type")
                        @ExcludeMissing
                        fun type(type: JsonField<Type>) = apply { this.type = type }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): AgentCandidate =
                            AgentCandidate(
                                config,
                                type,
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

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val AGENT = Type(JsonField.of("agent"))

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
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AgentCandidate && this.config == other.config && this.type == other.type && this.additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    private var hashCode: Int = 0

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = /* spotless:off */ Objects.hash(config, type, additionalProperties) /* spotless:on */
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "AgentCandidate{config=$config, type=$type, additionalProperties=$additionalProperties}"
                }
            }

            @JsonDeserialize(builder = ScoringParams.Builder::class)
            @NoAutoDetect
            class ScoringParams
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): ScoringParams = apply {
                    if (!validated) {
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(scoringParams: ScoringParams) = apply {
                        additionalProperties(scoringParams.additionalProperties)
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): ScoringParams = ScoringParams(additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ScoringParams && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "ScoringParams{additionalProperties=$additionalProperties}"
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val APP = Type(JsonField.of("app"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AppEvalTaskConfig && this.evalCandidate == other.evalCandidate && this.numExamples == other.numExamples && this.scoringParams == other.scoringParams && this.type == other.type && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(evalCandidate, numExamples, scoringParams, type, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "AppEvalTaskConfig{evalCandidate=$evalCandidate, numExamples=$numExamples, scoringParams=$scoringParams, type=$type, additionalProperties=$additionalProperties}"
        }
    }
}
