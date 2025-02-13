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
import com.llama.llamastack.core.Params
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import java.util.Objects

class EvalRunEvalParams
private constructor(
    private val taskId: String,
    private val body: EvalRunEvalBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun taskId(): String = taskId

    fun taskConfig(): EvalTaskConfig = body.taskConfig()

    fun _taskConfig(): JsonField<EvalTaskConfig> = body._taskConfig()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): EvalRunEvalBody = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

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
        private val taskConfig: JsonField<EvalTaskConfig> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun taskConfig(): EvalTaskConfig = taskConfig.getRequired("task_config")

        @JsonProperty("task_config")
        @ExcludeMissing
        fun _taskConfig(): JsonField<EvalTaskConfig> = taskConfig

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

        /** A builder for [EvalRunEvalBody]. */
        class Builder internal constructor() {

            private var taskConfig: JsonField<EvalTaskConfig>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(evalRunEvalBody: EvalRunEvalBody) = apply {
                taskConfig = evalRunEvalBody.taskConfig
                additionalProperties = evalRunEvalBody.additionalProperties.toMutableMap()
            }

            fun taskConfig(taskConfig: EvalTaskConfig) = taskConfig(JsonField.of(taskConfig))

            fun taskConfig(taskConfig: JsonField<EvalTaskConfig>) = apply {
                this.taskConfig = taskConfig
            }

            fun taskConfig(benchmark: EvalTaskConfig.BenchmarkEvalTaskConfig) =
                taskConfig(EvalTaskConfig.ofBenchmark(benchmark))

            fun benchmarkTaskConfig(evalCandidate: EvalCandidate) =
                taskConfig(
                    EvalTaskConfig.BenchmarkEvalTaskConfig.builder()
                        .evalCandidate(evalCandidate)
                        .build()
                )

            fun benchmarkTaskConfig(model: EvalCandidate.ModelCandidate) =
                benchmarkTaskConfig(EvalCandidate.ofModel(model))

            fun benchmarkTaskConfig(agent: EvalCandidate.AgentCandidate) =
                benchmarkTaskConfig(EvalCandidate.ofAgent(agent))

            fun agentBenchmarkTaskConfig(config: AgentConfig) =
                benchmarkTaskConfig(EvalCandidate.AgentCandidate.builder().config(config).build())

            fun taskConfig(app: EvalTaskConfig.AppEvalTaskConfig) =
                taskConfig(EvalTaskConfig.ofApp(app))

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

    /** A builder for [EvalRunEvalParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var taskId: String? = null
        private var body: EvalRunEvalBody.Builder = EvalRunEvalBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(evalRunEvalParams: EvalRunEvalParams) = apply {
            taskId = evalRunEvalParams.taskId
            body = evalRunEvalParams.body.toBuilder()
            additionalHeaders = evalRunEvalParams.additionalHeaders.toBuilder()
            additionalQueryParams = evalRunEvalParams.additionalQueryParams.toBuilder()
        }

        fun taskId(taskId: String) = apply { this.taskId = taskId }

        fun taskConfig(taskConfig: EvalTaskConfig) = apply { body.taskConfig(taskConfig) }

        fun taskConfig(taskConfig: JsonField<EvalTaskConfig>) = apply {
            body.taskConfig(taskConfig)
        }

        fun taskConfig(benchmark: EvalTaskConfig.BenchmarkEvalTaskConfig) = apply {
            body.taskConfig(benchmark)
        }

        fun benchmarkTaskConfig(evalCandidate: EvalCandidate) = apply {
            body.benchmarkTaskConfig(evalCandidate)
        }

        fun benchmarkTaskConfig(model: EvalCandidate.ModelCandidate) = apply {
            body.benchmarkTaskConfig(model)
        }

        fun benchmarkTaskConfig(agent: EvalCandidate.AgentCandidate) = apply {
            body.benchmarkTaskConfig(agent)
        }

        fun agentBenchmarkTaskConfig(config: AgentConfig) = apply {
            body.agentBenchmarkTaskConfig(config)
        }

        fun taskConfig(app: EvalTaskConfig.AppEvalTaskConfig) = apply { body.taskConfig(app) }

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
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EvalRunEvalParams && taskId == other.taskId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(taskId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "EvalRunEvalParams{taskId=$taskId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
