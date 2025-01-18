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
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

class EvalEvaluateRowsParams
constructor(
    private val taskId: String,
    private val xLlamaStackClientVersion: String?,
    private val xLlamaStackProviderData: String?,
    private val body: EvalEvaluateRowsBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun taskId(): String = taskId

    fun xLlamaStackClientVersion(): String? = xLlamaStackClientVersion

    fun xLlamaStackProviderData(): String? = xLlamaStackProviderData

    fun inputRows(): List<InputRow> = body.inputRows()

    fun scoringFunctions(): List<String> = body.scoringFunctions()

    fun taskConfig(): TaskConfig = body.taskConfig()

    fun _inputRows(): JsonField<List<InputRow>> = body._inputRows()

    fun _scoringFunctions(): JsonField<List<String>> = body._scoringFunctions()

    fun _taskConfig(): JsonField<TaskConfig> = body._taskConfig()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getBody(): EvalEvaluateRowsBody = body

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
    class EvalEvaluateRowsBody
    @JsonCreator
    internal constructor(
        @JsonProperty("input_rows")
        @ExcludeMissing
        private val inputRows: JsonField<List<InputRow>> = JsonMissing.of(),
        @JsonProperty("scoring_functions")
        @ExcludeMissing
        private val scoringFunctions: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("task_config")
        @ExcludeMissing
        private val taskConfig: JsonField<TaskConfig> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun inputRows(): List<InputRow> = inputRows.getRequired("input_rows")

        fun scoringFunctions(): List<String> = scoringFunctions.getRequired("scoring_functions")

        fun taskConfig(): TaskConfig = taskConfig.getRequired("task_config")

        @JsonProperty("input_rows")
        @ExcludeMissing
        fun _inputRows(): JsonField<List<InputRow>> = inputRows

        @JsonProperty("scoring_functions")
        @ExcludeMissing
        fun _scoringFunctions(): JsonField<List<String>> = scoringFunctions

        @JsonProperty("task_config")
        @ExcludeMissing
        fun _taskConfig(): JsonField<TaskConfig> = taskConfig

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): EvalEvaluateRowsBody = apply {
            if (validated) {
                return@apply
            }

            inputRows().forEach { it.validate() }
            scoringFunctions()
            taskConfig().validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var inputRows: JsonField<MutableList<InputRow>>? = null
            private var scoringFunctions: JsonField<MutableList<String>>? = null
            private var taskConfig: JsonField<TaskConfig>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(evalEvaluateRowsBody: EvalEvaluateRowsBody) = apply {
                inputRows = evalEvaluateRowsBody.inputRows.map { it.toMutableList() }
                scoringFunctions = evalEvaluateRowsBody.scoringFunctions.map { it.toMutableList() }
                taskConfig = evalEvaluateRowsBody.taskConfig
                additionalProperties = evalEvaluateRowsBody.additionalProperties.toMutableMap()
            }

            fun inputRows(inputRows: List<InputRow>) = inputRows(JsonField.of(inputRows))

            fun inputRows(inputRows: JsonField<List<InputRow>>) = apply {
                this.inputRows = inputRows.map { it.toMutableList() }
            }

            fun addInputRow(inputRow: InputRow) = apply {
                inputRows =
                    (inputRows ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(inputRow)
                    }
            }

            fun scoringFunctions(scoringFunctions: List<String>) =
                scoringFunctions(JsonField.of(scoringFunctions))

            fun scoringFunctions(scoringFunctions: JsonField<List<String>>) = apply {
                this.scoringFunctions = scoringFunctions.map { it.toMutableList() }
            }

            fun addScoringFunction(scoringFunction: String) = apply {
                scoringFunctions =
                    (scoringFunctions ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(scoringFunction)
                    }
            }

            fun taskConfig(taskConfig: TaskConfig) = taskConfig(JsonField.of(taskConfig))

            fun taskConfig(taskConfig: JsonField<TaskConfig>) = apply {
                this.taskConfig = taskConfig
            }

            fun taskConfig(benchmarkEvalTaskConfig: TaskConfig.BenchmarkEvalTaskConfig) =
                taskConfig(TaskConfig.ofBenchmarkEvalTaskConfig(benchmarkEvalTaskConfig))

            fun taskConfig(appEvalTaskConfig: TaskConfig.AppEvalTaskConfig) =
                taskConfig(TaskConfig.ofAppEvalTaskConfig(appEvalTaskConfig))

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

            fun build(): EvalEvaluateRowsBody =
                EvalEvaluateRowsBody(
                    checkNotNull(inputRows) { "`inputRows` is required but was not set" }
                        .map { it.toImmutable() },
                    checkNotNull(scoringFunctions) {
                            "`scoringFunctions` is required but was not set"
                        }
                        .map { it.toImmutable() },
                    checkNotNull(taskConfig) { "`taskConfig` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is EvalEvaluateRowsBody && inputRows == other.inputRows && scoringFunctions == other.scoringFunctions && taskConfig == other.taskConfig && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(inputRows, scoringFunctions, taskConfig, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "EvalEvaluateRowsBody{inputRows=$inputRows, scoringFunctions=$scoringFunctions, taskConfig=$taskConfig, additionalProperties=$additionalProperties}"
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
        private var body: EvalEvaluateRowsBody.Builder = EvalEvaluateRowsBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(evalEvaluateRowsParams: EvalEvaluateRowsParams) = apply {
            taskId = evalEvaluateRowsParams.taskId
            xLlamaStackClientVersion = evalEvaluateRowsParams.xLlamaStackClientVersion
            xLlamaStackProviderData = evalEvaluateRowsParams.xLlamaStackProviderData
            body = evalEvaluateRowsParams.body.toBuilder()
            additionalHeaders = evalEvaluateRowsParams.additionalHeaders.toBuilder()
            additionalQueryParams = evalEvaluateRowsParams.additionalQueryParams.toBuilder()
        }

        fun taskId(taskId: String) = apply { this.taskId = taskId }

        fun xLlamaStackClientVersion(xLlamaStackClientVersion: String?) = apply {
            this.xLlamaStackClientVersion = xLlamaStackClientVersion
        }

        fun xLlamaStackProviderData(xLlamaStackProviderData: String?) = apply {
            this.xLlamaStackProviderData = xLlamaStackProviderData
        }

        fun inputRows(inputRows: List<InputRow>) = apply { body.inputRows(inputRows) }

        fun inputRows(inputRows: JsonField<List<InputRow>>) = apply { body.inputRows(inputRows) }

        fun addInputRow(inputRow: InputRow) = apply { body.addInputRow(inputRow) }

        fun scoringFunctions(scoringFunctions: List<String>) = apply {
            body.scoringFunctions(scoringFunctions)
        }

        fun scoringFunctions(scoringFunctions: JsonField<List<String>>) = apply {
            body.scoringFunctions(scoringFunctions)
        }

        fun addScoringFunction(scoringFunction: String) = apply {
            body.addScoringFunction(scoringFunction)
        }

        fun taskConfig(taskConfig: TaskConfig) = apply { body.taskConfig(taskConfig) }

        fun taskConfig(taskConfig: JsonField<TaskConfig>) = apply { body.taskConfig(taskConfig) }

        fun taskConfig(benchmarkEvalTaskConfig: TaskConfig.BenchmarkEvalTaskConfig) = apply {
            body.taskConfig(benchmarkEvalTaskConfig)
        }

        fun taskConfig(appEvalTaskConfig: TaskConfig.AppEvalTaskConfig) = apply {
            body.taskConfig(appEvalTaskConfig)
        }

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

        fun build(): EvalEvaluateRowsParams =
            EvalEvaluateRowsParams(
                checkNotNull(taskId) { "`taskId` is required but was not set" },
                xLlamaStackClientVersion,
                xLlamaStackProviderData,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class InputRow
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): InputRow = apply {
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

            internal fun from(inputRow: InputRow) = apply {
                additionalProperties = inputRow.additionalProperties.toMutableMap()
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

            fun build(): InputRow = InputRow(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InputRow && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "InputRow{additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = TaskConfig.Deserializer::class)
    @JsonSerialize(using = TaskConfig.Serializer::class)
    class TaskConfig
    private constructor(
        private val benchmarkEvalTaskConfig: BenchmarkEvalTaskConfig? = null,
        private val appEvalTaskConfig: AppEvalTaskConfig? = null,
        private val _json: JsonValue? = null,
    ) {

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

        private var validated: Boolean = false

        fun validate(): TaskConfig = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitBenchmarkEvalTaskConfig(
                        benchmarkEvalTaskConfig: BenchmarkEvalTaskConfig
                    ) {
                        benchmarkEvalTaskConfig.validate()
                    }

                    override fun visitAppEvalTaskConfig(appEvalTaskConfig: AppEvalTaskConfig) {
                        appEvalTaskConfig.validate()
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TaskConfig && benchmarkEvalTaskConfig == other.benchmarkEvalTaskConfig && appEvalTaskConfig == other.appEvalTaskConfig /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(benchmarkEvalTaskConfig, appEvalTaskConfig) /* spotless:on */

        override fun toString(): String =
            when {
                benchmarkEvalTaskConfig != null ->
                    "TaskConfig{benchmarkEvalTaskConfig=$benchmarkEvalTaskConfig}"
                appEvalTaskConfig != null -> "TaskConfig{appEvalTaskConfig=$appEvalTaskConfig}"
                _json != null -> "TaskConfig{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid TaskConfig")
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

        @NoAutoDetect
        class BenchmarkEvalTaskConfig
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

            fun validate(): BenchmarkEvalTaskConfig = apply {
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

                internal fun from(benchmarkEvalTaskConfig: BenchmarkEvalTaskConfig) = apply {
                    evalCandidate = benchmarkEvalTaskConfig.evalCandidate
                    type = benchmarkEvalTaskConfig.type
                    numExamples = benchmarkEvalTaskConfig.numExamples
                    additionalProperties =
                        benchmarkEvalTaskConfig.additionalProperties.toMutableMap()
                }

                fun evalCandidate(evalCandidate: EvalCandidate) =
                    evalCandidate(JsonField.of(evalCandidate))

                fun evalCandidate(evalCandidate: JsonField<EvalCandidate>) = apply {
                    this.evalCandidate = evalCandidate
                }

                fun evalCandidate(modelCandidate: EvalCandidate.ModelCandidate) =
                    evalCandidate(EvalCandidate.ofModelCandidate(modelCandidate))

                fun evalCandidate(agentCandidate: EvalCandidate.AgentCandidate) =
                    evalCandidate(EvalCandidate.ofAgentCandidate(agentCandidate))

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

                fun build(): BenchmarkEvalTaskConfig =
                    BenchmarkEvalTaskConfig(
                        checkNotNull(evalCandidate) {
                            "`evalCandidate` is required but was not set"
                        },
                        checkNotNull(type) { "`type` is required but was not set" },
                        numExamples,
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

                private var validated: Boolean = false

                fun validate(): EvalCandidate = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitModelCandidate(modelCandidate: ModelCandidate) {
                                modelCandidate.validate()
                            }

                            override fun visitAgentCandidate(agentCandidate: AgentCandidate) {
                                agentCandidate.validate()
                            }
                        }
                    )
                    validated = true
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is EvalCandidate && modelCandidate == other.modelCandidate && agentCandidate == other.agentCandidate /* spotless:on */
                }

                override fun hashCode(): Int = /* spotless:off */ Objects.hash(modelCandidate, agentCandidate) /* spotless:on */

                override fun toString(): String =
                    when {
                        modelCandidate != null -> "EvalCandidate{modelCandidate=$modelCandidate}"
                        agentCandidate != null -> "EvalCandidate{agentCandidate=$agentCandidate}"
                        _json != null -> "EvalCandidate{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid EvalCandidate")
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

                @NoAutoDetect
                class ModelCandidate
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

                    fun validate(): ModelCandidate = apply {
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

                        internal fun from(modelCandidate: ModelCandidate) = apply {
                            model = modelCandidate.model
                            samplingParams = modelCandidate.samplingParams
                            type = modelCandidate.type
                            systemMessage = modelCandidate.systemMessage
                            additionalProperties =
                                modelCandidate.additionalProperties.toMutableMap()
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

                        fun build(): ModelCandidate =
                            ModelCandidate(
                                checkNotNull(model) { "`model` is required but was not set" },
                                checkNotNull(samplingParams) {
                                    "`samplingParams` is required but was not set"
                                },
                                checkNotNull(type) { "`type` is required but was not set" },
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

                        return /* spotless:off */ other is ModelCandidate && model == other.model && samplingParams == other.samplingParams && type == other.type && systemMessage == other.systemMessage && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(model, samplingParams, type, systemMessage, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "ModelCandidate{model=$model, samplingParams=$samplingParams, type=$type, systemMessage=$systemMessage, additionalProperties=$additionalProperties}"
                }

                @NoAutoDetect
                class AgentCandidate
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

                    fun validate(): AgentCandidate = apply {
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

                        internal fun from(agentCandidate: AgentCandidate) = apply {
                            config = agentCandidate.config
                            type = agentCandidate.type
                            additionalProperties =
                                agentCandidate.additionalProperties.toMutableMap()
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

                        fun build(): AgentCandidate =
                            AgentCandidate(
                                checkNotNull(config) { "`config` is required but was not set" },
                                checkNotNull(type) { "`type` is required but was not set" },
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

                        return /* spotless:off */ other is AgentCandidate && config == other.config && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(config, type, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

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

            fun validate(): AppEvalTaskConfig = apply {
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

                fun evalCandidate(modelCandidate: EvalCandidate.ModelCandidate) =
                    evalCandidate(EvalCandidate.ofModelCandidate(modelCandidate))

                fun evalCandidate(agentCandidate: EvalCandidate.AgentCandidate) =
                    evalCandidate(EvalCandidate.ofAgentCandidate(agentCandidate))

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

                fun build(): AppEvalTaskConfig =
                    AppEvalTaskConfig(
                        checkNotNull(evalCandidate) {
                            "`evalCandidate` is required but was not set"
                        },
                        checkNotNull(scoringParams) {
                            "`scoringParams` is required but was not set"
                        },
                        checkNotNull(type) { "`type` is required but was not set" },
                        numExamples,
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

                private var validated: Boolean = false

                fun validate(): EvalCandidate = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitModelCandidate(modelCandidate: ModelCandidate) {
                                modelCandidate.validate()
                            }

                            override fun visitAgentCandidate(agentCandidate: AgentCandidate) {
                                agentCandidate.validate()
                            }
                        }
                    )
                    validated = true
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is EvalCandidate && modelCandidate == other.modelCandidate && agentCandidate == other.agentCandidate /* spotless:on */
                }

                override fun hashCode(): Int = /* spotless:off */ Objects.hash(modelCandidate, agentCandidate) /* spotless:on */

                override fun toString(): String =
                    when {
                        modelCandidate != null -> "EvalCandidate{modelCandidate=$modelCandidate}"
                        agentCandidate != null -> "EvalCandidate{agentCandidate=$agentCandidate}"
                        _json != null -> "EvalCandidate{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid EvalCandidate")
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

                @NoAutoDetect
                class ModelCandidate
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

                    fun validate(): ModelCandidate = apply {
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

                        internal fun from(modelCandidate: ModelCandidate) = apply {
                            model = modelCandidate.model
                            samplingParams = modelCandidate.samplingParams
                            type = modelCandidate.type
                            systemMessage = modelCandidate.systemMessage
                            additionalProperties =
                                modelCandidate.additionalProperties.toMutableMap()
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

                        fun build(): ModelCandidate =
                            ModelCandidate(
                                checkNotNull(model) { "`model` is required but was not set" },
                                checkNotNull(samplingParams) {
                                    "`samplingParams` is required but was not set"
                                },
                                checkNotNull(type) { "`type` is required but was not set" },
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

                        return /* spotless:off */ other is ModelCandidate && model == other.model && samplingParams == other.samplingParams && type == other.type && systemMessage == other.systemMessage && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(model, samplingParams, type, systemMessage, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "ModelCandidate{model=$model, samplingParams=$samplingParams, type=$type, systemMessage=$systemMessage, additionalProperties=$additionalProperties}"
                }

                @NoAutoDetect
                class AgentCandidate
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

                    fun validate(): AgentCandidate = apply {
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

                        internal fun from(agentCandidate: AgentCandidate) = apply {
                            config = agentCandidate.config
                            type = agentCandidate.type
                            additionalProperties =
                                agentCandidate.additionalProperties.toMutableMap()
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

                        fun build(): AgentCandidate =
                            AgentCandidate(
                                checkNotNull(config) { "`config` is required but was not set" },
                                checkNotNull(type) { "`type` is required but was not set" },
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

                        return /* spotless:off */ other is AgentCandidate && config == other.config && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(config, type, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "AgentCandidate{config=$config, type=$type, additionalProperties=$additionalProperties}"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EvalEvaluateRowsParams && taskId == other.taskId && xLlamaStackClientVersion == other.xLlamaStackClientVersion && xLlamaStackProviderData == other.xLlamaStackProviderData && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(taskId, xLlamaStackClientVersion, xLlamaStackProviderData, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "EvalEvaluateRowsParams{taskId=$taskId, xLlamaStackClientVersion=$xLlamaStackClientVersion, xLlamaStackProviderData=$xLlamaStackProviderData, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
