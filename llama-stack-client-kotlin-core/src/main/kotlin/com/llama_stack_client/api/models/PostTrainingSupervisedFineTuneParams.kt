// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

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
import com.llama_stack_client.api.core.BaseDeserializer
import com.llama_stack_client.api.core.BaseSerializer
import com.llama_stack_client.api.core.Enum
import com.llama_stack_client.api.core.ExcludeMissing
import com.llama_stack_client.api.core.JsonField
import com.llama_stack_client.api.core.JsonMissing
import com.llama_stack_client.api.core.JsonValue
import com.llama_stack_client.api.core.NoAutoDetect
import com.llama_stack_client.api.core.getOrThrow
import com.llama_stack_client.api.core.toUnmodifiable
import com.llama_stack_client.api.errors.LlamaStackClientInvalidDataException
import com.llama_stack_client.api.models.*
import java.util.Objects

class PostTrainingSupervisedFineTuneParams
constructor(
    private val algorithm: Algorithm,
    private val algorithmConfig: AlgorithmConfig,
    private val dataset: TrainEvalDataset,
    private val hyperparamSearchConfig: HyperparamSearchConfig,
    private val jobUuid: String,
    private val loggerConfig: LoggerConfig,
    private val model: String,
    private val optimizerConfig: OptimizerConfig,
    private val trainingConfig: TrainingConfig,
    private val validationDataset: TrainEvalDataset,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun algorithm(): Algorithm = algorithm

    fun algorithmConfig(): AlgorithmConfig = algorithmConfig

    fun dataset(): TrainEvalDataset = dataset

    fun hyperparamSearchConfig(): HyperparamSearchConfig = hyperparamSearchConfig

    fun jobUuid(): String = jobUuid

    fun loggerConfig(): LoggerConfig = loggerConfig

    fun model(): String = model

    fun optimizerConfig(): OptimizerConfig = optimizerConfig

    fun trainingConfig(): TrainingConfig = trainingConfig

    fun validationDataset(): TrainEvalDataset = validationDataset

    internal fun getBody(): PostTrainingSupervisedFineTuneBody {
        return PostTrainingSupervisedFineTuneBody(
            algorithm,
            algorithmConfig,
            dataset,
            hyperparamSearchConfig,
            jobUuid,
            loggerConfig,
            model,
            optimizerConfig,
            trainingConfig,
            validationDataset,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = PostTrainingSupervisedFineTuneBody.Builder::class)
    @NoAutoDetect
    class PostTrainingSupervisedFineTuneBody
    internal constructor(
        private val algorithm: Algorithm?,
        private val algorithmConfig: AlgorithmConfig?,
        private val dataset: TrainEvalDataset?,
        private val hyperparamSearchConfig: HyperparamSearchConfig?,
        private val jobUuid: String?,
        private val loggerConfig: LoggerConfig?,
        private val model: String?,
        private val optimizerConfig: OptimizerConfig?,
        private val trainingConfig: TrainingConfig?,
        private val validationDataset: TrainEvalDataset?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("algorithm") fun algorithm(): Algorithm? = algorithm

        @JsonProperty("algorithm_config") fun algorithmConfig(): AlgorithmConfig? = algorithmConfig

        @JsonProperty("dataset") fun dataset(): TrainEvalDataset? = dataset

        @JsonProperty("hyperparam_search_config")
        fun hyperparamSearchConfig(): HyperparamSearchConfig? = hyperparamSearchConfig

        @JsonProperty("job_uuid") fun jobUuid(): String? = jobUuid

        @JsonProperty("logger_config") fun loggerConfig(): LoggerConfig? = loggerConfig

        @JsonProperty("model") fun model(): String? = model

        @JsonProperty("optimizer_config") fun optimizerConfig(): OptimizerConfig? = optimizerConfig

        @JsonProperty("training_config") fun trainingConfig(): TrainingConfig? = trainingConfig

        @JsonProperty("validation_dataset")
        fun validationDataset(): TrainEvalDataset? = validationDataset

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PostTrainingSupervisedFineTuneBody &&
                this.algorithm == other.algorithm &&
                this.algorithmConfig == other.algorithmConfig &&
                this.dataset == other.dataset &&
                this.hyperparamSearchConfig == other.hyperparamSearchConfig &&
                this.jobUuid == other.jobUuid &&
                this.loggerConfig == other.loggerConfig &&
                this.model == other.model &&
                this.optimizerConfig == other.optimizerConfig &&
                this.trainingConfig == other.trainingConfig &&
                this.validationDataset == other.validationDataset &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        algorithm,
                        algorithmConfig,
                        dataset,
                        hyperparamSearchConfig,
                        jobUuid,
                        loggerConfig,
                        model,
                        optimizerConfig,
                        trainingConfig,
                        validationDataset,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "PostTrainingSupervisedFineTuneBody{algorithm=$algorithm, algorithmConfig=$algorithmConfig, dataset=$dataset, hyperparamSearchConfig=$hyperparamSearchConfig, jobUuid=$jobUuid, loggerConfig=$loggerConfig, model=$model, optimizerConfig=$optimizerConfig, trainingConfig=$trainingConfig, validationDataset=$validationDataset, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var algorithm: Algorithm? = null
            private var algorithmConfig: AlgorithmConfig? = null
            private var dataset: TrainEvalDataset? = null
            private var hyperparamSearchConfig: HyperparamSearchConfig? = null
            private var jobUuid: String? = null
            private var loggerConfig: LoggerConfig? = null
            private var model: String? = null
            private var optimizerConfig: OptimizerConfig? = null
            private var trainingConfig: TrainingConfig? = null
            private var validationDataset: TrainEvalDataset? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                postTrainingSupervisedFineTuneBody: PostTrainingSupervisedFineTuneBody
            ) = apply {
                this.algorithm = postTrainingSupervisedFineTuneBody.algorithm
                this.algorithmConfig = postTrainingSupervisedFineTuneBody.algorithmConfig
                this.dataset = postTrainingSupervisedFineTuneBody.dataset
                this.hyperparamSearchConfig =
                    postTrainingSupervisedFineTuneBody.hyperparamSearchConfig
                this.jobUuid = postTrainingSupervisedFineTuneBody.jobUuid
                this.loggerConfig = postTrainingSupervisedFineTuneBody.loggerConfig
                this.model = postTrainingSupervisedFineTuneBody.model
                this.optimizerConfig = postTrainingSupervisedFineTuneBody.optimizerConfig
                this.trainingConfig = postTrainingSupervisedFineTuneBody.trainingConfig
                this.validationDataset = postTrainingSupervisedFineTuneBody.validationDataset
                additionalProperties(postTrainingSupervisedFineTuneBody.additionalProperties)
            }

            @JsonProperty("algorithm")
            fun algorithm(algorithm: Algorithm) = apply { this.algorithm = algorithm }

            @JsonProperty("algorithm_config")
            fun algorithmConfig(algorithmConfig: AlgorithmConfig) = apply {
                this.algorithmConfig = algorithmConfig
            }

            @JsonProperty("dataset")
            fun dataset(dataset: TrainEvalDataset) = apply { this.dataset = dataset }

            @JsonProperty("hyperparam_search_config")
            fun hyperparamSearchConfig(hyperparamSearchConfig: HyperparamSearchConfig) = apply {
                this.hyperparamSearchConfig = hyperparamSearchConfig
            }

            @JsonProperty("job_uuid")
            fun jobUuid(jobUuid: String) = apply { this.jobUuid = jobUuid }

            @JsonProperty("logger_config")
            fun loggerConfig(loggerConfig: LoggerConfig) = apply {
                this.loggerConfig = loggerConfig
            }

            @JsonProperty("model") fun model(model: String) = apply { this.model = model }

            @JsonProperty("optimizer_config")
            fun optimizerConfig(optimizerConfig: OptimizerConfig) = apply {
                this.optimizerConfig = optimizerConfig
            }

            @JsonProperty("training_config")
            fun trainingConfig(trainingConfig: TrainingConfig) = apply {
                this.trainingConfig = trainingConfig
            }

            @JsonProperty("validation_dataset")
            fun validationDataset(validationDataset: TrainEvalDataset) = apply {
                this.validationDataset = validationDataset
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

            fun build(): PostTrainingSupervisedFineTuneBody =
                PostTrainingSupervisedFineTuneBody(
                    checkNotNull(algorithm) { "`algorithm` is required but was not set" },
                    checkNotNull(algorithmConfig) {
                        "`algorithmConfig` is required but was not set"
                    },
                    checkNotNull(dataset) { "`dataset` is required but was not set" },
                    checkNotNull(hyperparamSearchConfig) {
                        "`hyperparamSearchConfig` is required but was not set"
                    },
                    checkNotNull(jobUuid) { "`jobUuid` is required but was not set" },
                    checkNotNull(loggerConfig) { "`loggerConfig` is required but was not set" },
                    checkNotNull(model) { "`model` is required but was not set" },
                    checkNotNull(optimizerConfig) {
                        "`optimizerConfig` is required but was not set"
                    },
                    checkNotNull(trainingConfig) { "`trainingConfig` is required but was not set" },
                    checkNotNull(validationDataset) {
                        "`validationDataset` is required but was not set"
                    },
                    additionalProperties.toUnmodifiable(),
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

        return other is PostTrainingSupervisedFineTuneParams &&
            this.algorithm == other.algorithm &&
            this.algorithmConfig == other.algorithmConfig &&
            this.dataset == other.dataset &&
            this.hyperparamSearchConfig == other.hyperparamSearchConfig &&
            this.jobUuid == other.jobUuid &&
            this.loggerConfig == other.loggerConfig &&
            this.model == other.model &&
            this.optimizerConfig == other.optimizerConfig &&
            this.trainingConfig == other.trainingConfig &&
            this.validationDataset == other.validationDataset &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            algorithm,
            algorithmConfig,
            dataset,
            hyperparamSearchConfig,
            jobUuid,
            loggerConfig,
            model,
            optimizerConfig,
            trainingConfig,
            validationDataset,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "PostTrainingSupervisedFineTuneParams{algorithm=$algorithm, algorithmConfig=$algorithmConfig, dataset=$dataset, hyperparamSearchConfig=$hyperparamSearchConfig, jobUuid=$jobUuid, loggerConfig=$loggerConfig, model=$model, optimizerConfig=$optimizerConfig, trainingConfig=$trainingConfig, validationDataset=$validationDataset, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var algorithm: Algorithm? = null
        private var algorithmConfig: AlgorithmConfig? = null
        private var dataset: TrainEvalDataset? = null
        private var hyperparamSearchConfig: HyperparamSearchConfig? = null
        private var jobUuid: String? = null
        private var loggerConfig: LoggerConfig? = null
        private var model: String? = null
        private var optimizerConfig: OptimizerConfig? = null
        private var trainingConfig: TrainingConfig? = null
        private var validationDataset: TrainEvalDataset? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            postTrainingSupervisedFineTuneParams: PostTrainingSupervisedFineTuneParams
        ) = apply {
            this.algorithm = postTrainingSupervisedFineTuneParams.algorithm
            this.algorithmConfig = postTrainingSupervisedFineTuneParams.algorithmConfig
            this.dataset = postTrainingSupervisedFineTuneParams.dataset
            this.hyperparamSearchConfig =
                postTrainingSupervisedFineTuneParams.hyperparamSearchConfig
            this.jobUuid = postTrainingSupervisedFineTuneParams.jobUuid
            this.loggerConfig = postTrainingSupervisedFineTuneParams.loggerConfig
            this.model = postTrainingSupervisedFineTuneParams.model
            this.optimizerConfig = postTrainingSupervisedFineTuneParams.optimizerConfig
            this.trainingConfig = postTrainingSupervisedFineTuneParams.trainingConfig
            this.validationDataset = postTrainingSupervisedFineTuneParams.validationDataset
            additionalQueryParams(postTrainingSupervisedFineTuneParams.additionalQueryParams)
            additionalHeaders(postTrainingSupervisedFineTuneParams.additionalHeaders)
            additionalBodyProperties(postTrainingSupervisedFineTuneParams.additionalBodyProperties)
        }

        fun algorithm(algorithm: Algorithm) = apply { this.algorithm = algorithm }

        fun algorithmConfig(algorithmConfig: AlgorithmConfig) = apply {
            this.algorithmConfig = algorithmConfig
        }

        fun algorithmConfig(loraFinetuningConfig: AlgorithmConfig.LoraFinetuningConfig) = apply {
            this.algorithmConfig = AlgorithmConfig.ofLoraFinetuningConfig(loraFinetuningConfig)
        }

        fun algorithmConfig(qLoraFinetuningConfig: AlgorithmConfig.QLoraFinetuningConfig) = apply {
            this.algorithmConfig = AlgorithmConfig.ofQLoraFinetuningConfig(qLoraFinetuningConfig)
        }

        fun algorithmConfig(doraFinetuningConfig: AlgorithmConfig.DoraFinetuningConfig) = apply {
            this.algorithmConfig = AlgorithmConfig.ofDoraFinetuningConfig(doraFinetuningConfig)
        }

        fun dataset(dataset: TrainEvalDataset) = apply { this.dataset = dataset }

        fun hyperparamSearchConfig(hyperparamSearchConfig: HyperparamSearchConfig) = apply {
            this.hyperparamSearchConfig = hyperparamSearchConfig
        }

        fun jobUuid(jobUuid: String) = apply { this.jobUuid = jobUuid }

        fun loggerConfig(loggerConfig: LoggerConfig) = apply { this.loggerConfig = loggerConfig }

        fun model(model: String) = apply { this.model = model }

        fun optimizerConfig(optimizerConfig: OptimizerConfig) = apply {
            this.optimizerConfig = optimizerConfig
        }

        fun trainingConfig(trainingConfig: TrainingConfig) = apply {
            this.trainingConfig = trainingConfig
        }

        fun validationDataset(validationDataset: TrainEvalDataset) = apply {
            this.validationDataset = validationDataset
        }

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

        fun build(): PostTrainingSupervisedFineTuneParams =
            PostTrainingSupervisedFineTuneParams(
                checkNotNull(algorithm) { "`algorithm` is required but was not set" },
                checkNotNull(algorithmConfig) { "`algorithmConfig` is required but was not set" },
                checkNotNull(dataset) { "`dataset` is required but was not set" },
                checkNotNull(hyperparamSearchConfig) {
                    "`hyperparamSearchConfig` is required but was not set"
                },
                checkNotNull(jobUuid) { "`jobUuid` is required but was not set" },
                checkNotNull(loggerConfig) { "`loggerConfig` is required but was not set" },
                checkNotNull(model) { "`model` is required but was not set" },
                checkNotNull(optimizerConfig) { "`optimizerConfig` is required but was not set" },
                checkNotNull(trainingConfig) { "`trainingConfig` is required but was not set" },
                checkNotNull(validationDataset) {
                    "`validationDataset` is required but was not set"
                },
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class Algorithm
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Algorithm && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val FULL = Algorithm(JsonField.of("full"))

            val LORA = Algorithm(JsonField.of("lora"))

            val QLORA = Algorithm(JsonField.of("qlora"))

            val DORA = Algorithm(JsonField.of("dora"))

            fun of(value: String) = Algorithm(JsonField.of(value))
        }

        enum class Known {
            FULL,
            LORA,
            QLORA,
            DORA,
        }

        enum class Value {
            FULL,
            LORA,
            QLORA,
            DORA,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                FULL -> Value.FULL
                LORA -> Value.LORA
                QLORA -> Value.QLORA
                DORA -> Value.DORA
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                FULL -> Known.FULL
                LORA -> Known.LORA
                QLORA -> Known.QLORA
                DORA -> Known.DORA
                else -> throw LlamaStackClientInvalidDataException("Unknown Algorithm: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    @JsonDeserialize(using = AlgorithmConfig.Deserializer::class)
    @JsonSerialize(using = AlgorithmConfig.Serializer::class)
    class AlgorithmConfig
    private constructor(
        private val loraFinetuningConfig: LoraFinetuningConfig? = null,
        private val qLoraFinetuningConfig: QLoraFinetuningConfig? = null,
        private val doraFinetuningConfig: DoraFinetuningConfig? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun loraFinetuningConfig(): LoraFinetuningConfig? = loraFinetuningConfig

        fun qLoraFinetuningConfig(): QLoraFinetuningConfig? = qLoraFinetuningConfig

        fun doraFinetuningConfig(): DoraFinetuningConfig? = doraFinetuningConfig

        fun isLoraFinetuningConfig(): Boolean = loraFinetuningConfig != null

        fun isQLoraFinetuningConfig(): Boolean = qLoraFinetuningConfig != null

        fun isDoraFinetuningConfig(): Boolean = doraFinetuningConfig != null

        fun asLoraFinetuningConfig(): LoraFinetuningConfig =
            loraFinetuningConfig.getOrThrow("loraFinetuningConfig")

        fun asQLoraFinetuningConfig(): QLoraFinetuningConfig =
            qLoraFinetuningConfig.getOrThrow("qLoraFinetuningConfig")

        fun asDoraFinetuningConfig(): DoraFinetuningConfig =
            doraFinetuningConfig.getOrThrow("doraFinetuningConfig")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                loraFinetuningConfig != null ->
                    visitor.visitLoraFinetuningConfig(loraFinetuningConfig)
                qLoraFinetuningConfig != null ->
                    visitor.visitQLoraFinetuningConfig(qLoraFinetuningConfig)
                doraFinetuningConfig != null ->
                    visitor.visitDoraFinetuningConfig(doraFinetuningConfig)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): AlgorithmConfig = apply {
            if (!validated) {
                if (
                    loraFinetuningConfig == null &&
                        qLoraFinetuningConfig == null &&
                        doraFinetuningConfig == null
                ) {
                    throw LlamaStackClientInvalidDataException("Unknown AlgorithmConfig: $_json")
                }
                loraFinetuningConfig?.validate()
                qLoraFinetuningConfig?.validate()
                doraFinetuningConfig?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AlgorithmConfig &&
                this.loraFinetuningConfig == other.loraFinetuningConfig &&
                this.qLoraFinetuningConfig == other.qLoraFinetuningConfig &&
                this.doraFinetuningConfig == other.doraFinetuningConfig
        }

        override fun hashCode(): Int {
            return Objects.hash(
                loraFinetuningConfig,
                qLoraFinetuningConfig,
                doraFinetuningConfig,
            )
        }

        override fun toString(): String {
            return when {
                loraFinetuningConfig != null ->
                    "AlgorithmConfig{loraFinetuningConfig=$loraFinetuningConfig}"
                qLoraFinetuningConfig != null ->
                    "AlgorithmConfig{qLoraFinetuningConfig=$qLoraFinetuningConfig}"
                doraFinetuningConfig != null ->
                    "AlgorithmConfig{doraFinetuningConfig=$doraFinetuningConfig}"
                _json != null -> "AlgorithmConfig{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid AlgorithmConfig")
            }
        }

        companion object {

            fun ofLoraFinetuningConfig(loraFinetuningConfig: LoraFinetuningConfig) =
                AlgorithmConfig(loraFinetuningConfig = loraFinetuningConfig)

            fun ofQLoraFinetuningConfig(qLoraFinetuningConfig: QLoraFinetuningConfig) =
                AlgorithmConfig(qLoraFinetuningConfig = qLoraFinetuningConfig)

            fun ofDoraFinetuningConfig(doraFinetuningConfig: DoraFinetuningConfig) =
                AlgorithmConfig(doraFinetuningConfig = doraFinetuningConfig)
        }

        interface Visitor<out T> {

            fun visitLoraFinetuningConfig(loraFinetuningConfig: LoraFinetuningConfig): T

            fun visitQLoraFinetuningConfig(qLoraFinetuningConfig: QLoraFinetuningConfig): T

            fun visitDoraFinetuningConfig(doraFinetuningConfig: DoraFinetuningConfig): T

            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown AlgorithmConfig: $json")
            }
        }

        class Deserializer : BaseDeserializer<AlgorithmConfig>(AlgorithmConfig::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): AlgorithmConfig {
                val json = JsonValue.fromJsonNode(node)
                tryDeserialize(node, jacksonTypeRef<LoraFinetuningConfig>()) { it.validate() }
                    ?.let {
                        return AlgorithmConfig(loraFinetuningConfig = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<QLoraFinetuningConfig>()) { it.validate() }
                    ?.let {
                        return AlgorithmConfig(qLoraFinetuningConfig = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<DoraFinetuningConfig>()) { it.validate() }
                    ?.let {
                        return AlgorithmConfig(doraFinetuningConfig = it, _json = json)
                    }

                return AlgorithmConfig(_json = json)
            }
        }

        class Serializer : BaseSerializer<AlgorithmConfig>(AlgorithmConfig::class) {

            override fun serialize(
                value: AlgorithmConfig,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.loraFinetuningConfig != null ->
                        generator.writeObject(value.loraFinetuningConfig)
                    value.qLoraFinetuningConfig != null ->
                        generator.writeObject(value.qLoraFinetuningConfig)
                    value.doraFinetuningConfig != null ->
                        generator.writeObject(value.doraFinetuningConfig)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid AlgorithmConfig")
                }
            }
        }

        @JsonDeserialize(builder = LoraFinetuningConfig.Builder::class)
        @NoAutoDetect
        class LoraFinetuningConfig
        private constructor(
            private val alpha: JsonField<Long>,
            private val applyLoraToMlp: JsonField<Boolean>,
            private val applyLoraToOutput: JsonField<Boolean>,
            private val loraAttnModules: JsonField<List<String>>,
            private val rank: JsonField<Long>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun alpha(): Long = alpha.getRequired("alpha")

            fun applyLoraToMlp(): Boolean = applyLoraToMlp.getRequired("apply_lora_to_mlp")

            fun applyLoraToOutput(): Boolean = applyLoraToOutput.getRequired("apply_lora_to_output")

            fun loraAttnModules(): List<String> = loraAttnModules.getRequired("lora_attn_modules")

            fun rank(): Long = rank.getRequired("rank")

            @JsonProperty("alpha") @ExcludeMissing fun _alpha() = alpha

            @JsonProperty("apply_lora_to_mlp")
            @ExcludeMissing
            fun _applyLoraToMlp() = applyLoraToMlp

            @JsonProperty("apply_lora_to_output")
            @ExcludeMissing
            fun _applyLoraToOutput() = applyLoraToOutput

            @JsonProperty("lora_attn_modules")
            @ExcludeMissing
            fun _loraAttnModules() = loraAttnModules

            @JsonProperty("rank") @ExcludeMissing fun _rank() = rank

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): LoraFinetuningConfig = apply {
                if (!validated) {
                    alpha()
                    applyLoraToMlp()
                    applyLoraToOutput()
                    loraAttnModules()
                    rank()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is LoraFinetuningConfig &&
                    this.alpha == other.alpha &&
                    this.applyLoraToMlp == other.applyLoraToMlp &&
                    this.applyLoraToOutput == other.applyLoraToOutput &&
                    this.loraAttnModules == other.loraAttnModules &&
                    this.rank == other.rank &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            alpha,
                            applyLoraToMlp,
                            applyLoraToOutput,
                            loraAttnModules,
                            rank,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "LoraFinetuningConfig{alpha=$alpha, applyLoraToMlp=$applyLoraToMlp, applyLoraToOutput=$applyLoraToOutput, loraAttnModules=$loraAttnModules, rank=$rank, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var alpha: JsonField<Long> = JsonMissing.of()
                private var applyLoraToMlp: JsonField<Boolean> = JsonMissing.of()
                private var applyLoraToOutput: JsonField<Boolean> = JsonMissing.of()
                private var loraAttnModules: JsonField<List<String>> = JsonMissing.of()
                private var rank: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(loraFinetuningConfig: LoraFinetuningConfig) = apply {
                    this.alpha = loraFinetuningConfig.alpha
                    this.applyLoraToMlp = loraFinetuningConfig.applyLoraToMlp
                    this.applyLoraToOutput = loraFinetuningConfig.applyLoraToOutput
                    this.loraAttnModules = loraFinetuningConfig.loraAttnModules
                    this.rank = loraFinetuningConfig.rank
                    additionalProperties(loraFinetuningConfig.additionalProperties)
                }

                fun alpha(alpha: Long) = alpha(JsonField.of(alpha))

                @JsonProperty("alpha")
                @ExcludeMissing
                fun alpha(alpha: JsonField<Long>) = apply { this.alpha = alpha }

                fun applyLoraToMlp(applyLoraToMlp: Boolean) =
                    applyLoraToMlp(JsonField.of(applyLoraToMlp))

                @JsonProperty("apply_lora_to_mlp")
                @ExcludeMissing
                fun applyLoraToMlp(applyLoraToMlp: JsonField<Boolean>) = apply {
                    this.applyLoraToMlp = applyLoraToMlp
                }

                fun applyLoraToOutput(applyLoraToOutput: Boolean) =
                    applyLoraToOutput(JsonField.of(applyLoraToOutput))

                @JsonProperty("apply_lora_to_output")
                @ExcludeMissing
                fun applyLoraToOutput(applyLoraToOutput: JsonField<Boolean>) = apply {
                    this.applyLoraToOutput = applyLoraToOutput
                }

                fun loraAttnModules(loraAttnModules: List<String>) =
                    loraAttnModules(JsonField.of(loraAttnModules))

                @JsonProperty("lora_attn_modules")
                @ExcludeMissing
                fun loraAttnModules(loraAttnModules: JsonField<List<String>>) = apply {
                    this.loraAttnModules = loraAttnModules
                }

                fun rank(rank: Long) = rank(JsonField.of(rank))

                @JsonProperty("rank")
                @ExcludeMissing
                fun rank(rank: JsonField<Long>) = apply { this.rank = rank }

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

                fun build(): LoraFinetuningConfig =
                    LoraFinetuningConfig(
                        alpha,
                        applyLoraToMlp,
                        applyLoraToOutput,
                        loraAttnModules.map { it.toUnmodifiable() },
                        rank,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = QLoraFinetuningConfig.Builder::class)
        @NoAutoDetect
        class QLoraFinetuningConfig
        private constructor(
            private val alpha: JsonField<Long>,
            private val applyLoraToMlp: JsonField<Boolean>,
            private val applyLoraToOutput: JsonField<Boolean>,
            private val loraAttnModules: JsonField<List<String>>,
            private val rank: JsonField<Long>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun alpha(): Long = alpha.getRequired("alpha")

            fun applyLoraToMlp(): Boolean = applyLoraToMlp.getRequired("apply_lora_to_mlp")

            fun applyLoraToOutput(): Boolean = applyLoraToOutput.getRequired("apply_lora_to_output")

            fun loraAttnModules(): List<String> = loraAttnModules.getRequired("lora_attn_modules")

            fun rank(): Long = rank.getRequired("rank")

            @JsonProperty("alpha") @ExcludeMissing fun _alpha() = alpha

            @JsonProperty("apply_lora_to_mlp")
            @ExcludeMissing
            fun _applyLoraToMlp() = applyLoraToMlp

            @JsonProperty("apply_lora_to_output")
            @ExcludeMissing
            fun _applyLoraToOutput() = applyLoraToOutput

            @JsonProperty("lora_attn_modules")
            @ExcludeMissing
            fun _loraAttnModules() = loraAttnModules

            @JsonProperty("rank") @ExcludeMissing fun _rank() = rank

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): QLoraFinetuningConfig = apply {
                if (!validated) {
                    alpha()
                    applyLoraToMlp()
                    applyLoraToOutput()
                    loraAttnModules()
                    rank()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is QLoraFinetuningConfig &&
                    this.alpha == other.alpha &&
                    this.applyLoraToMlp == other.applyLoraToMlp &&
                    this.applyLoraToOutput == other.applyLoraToOutput &&
                    this.loraAttnModules == other.loraAttnModules &&
                    this.rank == other.rank &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            alpha,
                            applyLoraToMlp,
                            applyLoraToOutput,
                            loraAttnModules,
                            rank,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "QLoraFinetuningConfig{alpha=$alpha, applyLoraToMlp=$applyLoraToMlp, applyLoraToOutput=$applyLoraToOutput, loraAttnModules=$loraAttnModules, rank=$rank, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var alpha: JsonField<Long> = JsonMissing.of()
                private var applyLoraToMlp: JsonField<Boolean> = JsonMissing.of()
                private var applyLoraToOutput: JsonField<Boolean> = JsonMissing.of()
                private var loraAttnModules: JsonField<List<String>> = JsonMissing.of()
                private var rank: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(qLoraFinetuningConfig: QLoraFinetuningConfig) = apply {
                    this.alpha = qLoraFinetuningConfig.alpha
                    this.applyLoraToMlp = qLoraFinetuningConfig.applyLoraToMlp
                    this.applyLoraToOutput = qLoraFinetuningConfig.applyLoraToOutput
                    this.loraAttnModules = qLoraFinetuningConfig.loraAttnModules
                    this.rank = qLoraFinetuningConfig.rank
                    additionalProperties(qLoraFinetuningConfig.additionalProperties)
                }

                fun alpha(alpha: Long) = alpha(JsonField.of(alpha))

                @JsonProperty("alpha")
                @ExcludeMissing
                fun alpha(alpha: JsonField<Long>) = apply { this.alpha = alpha }

                fun applyLoraToMlp(applyLoraToMlp: Boolean) =
                    applyLoraToMlp(JsonField.of(applyLoraToMlp))

                @JsonProperty("apply_lora_to_mlp")
                @ExcludeMissing
                fun applyLoraToMlp(applyLoraToMlp: JsonField<Boolean>) = apply {
                    this.applyLoraToMlp = applyLoraToMlp
                }

                fun applyLoraToOutput(applyLoraToOutput: Boolean) =
                    applyLoraToOutput(JsonField.of(applyLoraToOutput))

                @JsonProperty("apply_lora_to_output")
                @ExcludeMissing
                fun applyLoraToOutput(applyLoraToOutput: JsonField<Boolean>) = apply {
                    this.applyLoraToOutput = applyLoraToOutput
                }

                fun loraAttnModules(loraAttnModules: List<String>) =
                    loraAttnModules(JsonField.of(loraAttnModules))

                @JsonProperty("lora_attn_modules")
                @ExcludeMissing
                fun loraAttnModules(loraAttnModules: JsonField<List<String>>) = apply {
                    this.loraAttnModules = loraAttnModules
                }

                fun rank(rank: Long) = rank(JsonField.of(rank))

                @JsonProperty("rank")
                @ExcludeMissing
                fun rank(rank: JsonField<Long>) = apply { this.rank = rank }

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

                fun build(): QLoraFinetuningConfig =
                    QLoraFinetuningConfig(
                        alpha,
                        applyLoraToMlp,
                        applyLoraToOutput,
                        loraAttnModules.map { it.toUnmodifiable() },
                        rank,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        @JsonDeserialize(builder = DoraFinetuningConfig.Builder::class)
        @NoAutoDetect
        class DoraFinetuningConfig
        private constructor(
            private val alpha: JsonField<Long>,
            private val applyLoraToMlp: JsonField<Boolean>,
            private val applyLoraToOutput: JsonField<Boolean>,
            private val loraAttnModules: JsonField<List<String>>,
            private val rank: JsonField<Long>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun alpha(): Long = alpha.getRequired("alpha")

            fun applyLoraToMlp(): Boolean = applyLoraToMlp.getRequired("apply_lora_to_mlp")

            fun applyLoraToOutput(): Boolean = applyLoraToOutput.getRequired("apply_lora_to_output")

            fun loraAttnModules(): List<String> = loraAttnModules.getRequired("lora_attn_modules")

            fun rank(): Long = rank.getRequired("rank")

            @JsonProperty("alpha") @ExcludeMissing fun _alpha() = alpha

            @JsonProperty("apply_lora_to_mlp")
            @ExcludeMissing
            fun _applyLoraToMlp() = applyLoraToMlp

            @JsonProperty("apply_lora_to_output")
            @ExcludeMissing
            fun _applyLoraToOutput() = applyLoraToOutput

            @JsonProperty("lora_attn_modules")
            @ExcludeMissing
            fun _loraAttnModules() = loraAttnModules

            @JsonProperty("rank") @ExcludeMissing fun _rank() = rank

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): DoraFinetuningConfig = apply {
                if (!validated) {
                    alpha()
                    applyLoraToMlp()
                    applyLoraToOutput()
                    loraAttnModules()
                    rank()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DoraFinetuningConfig &&
                    this.alpha == other.alpha &&
                    this.applyLoraToMlp == other.applyLoraToMlp &&
                    this.applyLoraToOutput == other.applyLoraToOutput &&
                    this.loraAttnModules == other.loraAttnModules &&
                    this.rank == other.rank &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            alpha,
                            applyLoraToMlp,
                            applyLoraToOutput,
                            loraAttnModules,
                            rank,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "DoraFinetuningConfig{alpha=$alpha, applyLoraToMlp=$applyLoraToMlp, applyLoraToOutput=$applyLoraToOutput, loraAttnModules=$loraAttnModules, rank=$rank, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var alpha: JsonField<Long> = JsonMissing.of()
                private var applyLoraToMlp: JsonField<Boolean> = JsonMissing.of()
                private var applyLoraToOutput: JsonField<Boolean> = JsonMissing.of()
                private var loraAttnModules: JsonField<List<String>> = JsonMissing.of()
                private var rank: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(doraFinetuningConfig: DoraFinetuningConfig) = apply {
                    this.alpha = doraFinetuningConfig.alpha
                    this.applyLoraToMlp = doraFinetuningConfig.applyLoraToMlp
                    this.applyLoraToOutput = doraFinetuningConfig.applyLoraToOutput
                    this.loraAttnModules = doraFinetuningConfig.loraAttnModules
                    this.rank = doraFinetuningConfig.rank
                    additionalProperties(doraFinetuningConfig.additionalProperties)
                }

                fun alpha(alpha: Long) = alpha(JsonField.of(alpha))

                @JsonProperty("alpha")
                @ExcludeMissing
                fun alpha(alpha: JsonField<Long>) = apply { this.alpha = alpha }

                fun applyLoraToMlp(applyLoraToMlp: Boolean) =
                    applyLoraToMlp(JsonField.of(applyLoraToMlp))

                @JsonProperty("apply_lora_to_mlp")
                @ExcludeMissing
                fun applyLoraToMlp(applyLoraToMlp: JsonField<Boolean>) = apply {
                    this.applyLoraToMlp = applyLoraToMlp
                }

                fun applyLoraToOutput(applyLoraToOutput: Boolean) =
                    applyLoraToOutput(JsonField.of(applyLoraToOutput))

                @JsonProperty("apply_lora_to_output")
                @ExcludeMissing
                fun applyLoraToOutput(applyLoraToOutput: JsonField<Boolean>) = apply {
                    this.applyLoraToOutput = applyLoraToOutput
                }

                fun loraAttnModules(loraAttnModules: List<String>) =
                    loraAttnModules(JsonField.of(loraAttnModules))

                @JsonProperty("lora_attn_modules")
                @ExcludeMissing
                fun loraAttnModules(loraAttnModules: JsonField<List<String>>) = apply {
                    this.loraAttnModules = loraAttnModules
                }

                fun rank(rank: Long) = rank(JsonField.of(rank))

                @JsonProperty("rank")
                @ExcludeMissing
                fun rank(rank: JsonField<Long>) = apply { this.rank = rank }

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

                fun build(): DoraFinetuningConfig =
                    DoraFinetuningConfig(
                        alpha,
                        applyLoraToMlp,
                        applyLoraToOutput,
                        loraAttnModules.map { it.toUnmodifiable() },
                        rank,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }
    }

    @JsonDeserialize(builder = HyperparamSearchConfig.Builder::class)
    @NoAutoDetect
    class HyperparamSearchConfig
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is HyperparamSearchConfig &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "HyperparamSearchConfig{additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(hyperparamSearchConfig: HyperparamSearchConfig) = apply {
                additionalProperties(hyperparamSearchConfig.additionalProperties)
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

            fun build(): HyperparamSearchConfig =
                HyperparamSearchConfig(additionalProperties.toUnmodifiable())
        }
    }

    @JsonDeserialize(builder = LoggerConfig.Builder::class)
    @NoAutoDetect
    class LoggerConfig
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LoggerConfig && this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "LoggerConfig{additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(loggerConfig: LoggerConfig) = apply {
                additionalProperties(loggerConfig.additionalProperties)
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

            fun build(): LoggerConfig = LoggerConfig(additionalProperties.toUnmodifiable())
        }
    }

    @JsonDeserialize(builder = OptimizerConfig.Builder::class)
    @NoAutoDetect
    class OptimizerConfig
    private constructor(
        private val lr: Double?,
        private val lrMin: Double?,
        private val optimizerType: OptimizerType?,
        private val weightDecay: Double?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("lr") fun lr(): Double? = lr

        @JsonProperty("lr_min") fun lrMin(): Double? = lrMin

        @JsonProperty("optimizer_type") fun optimizerType(): OptimizerType? = optimizerType

        @JsonProperty("weight_decay") fun weightDecay(): Double? = weightDecay

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is OptimizerConfig &&
                this.lr == other.lr &&
                this.lrMin == other.lrMin &&
                this.optimizerType == other.optimizerType &&
                this.weightDecay == other.weightDecay &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        lr,
                        lrMin,
                        optimizerType,
                        weightDecay,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "OptimizerConfig{lr=$lr, lrMin=$lrMin, optimizerType=$optimizerType, weightDecay=$weightDecay, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var lr: Double? = null
            private var lrMin: Double? = null
            private var optimizerType: OptimizerType? = null
            private var weightDecay: Double? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(optimizerConfig: OptimizerConfig) = apply {
                this.lr = optimizerConfig.lr
                this.lrMin = optimizerConfig.lrMin
                this.optimizerType = optimizerConfig.optimizerType
                this.weightDecay = optimizerConfig.weightDecay
                additionalProperties(optimizerConfig.additionalProperties)
            }

            @JsonProperty("lr") fun lr(lr: Double) = apply { this.lr = lr }

            @JsonProperty("lr_min") fun lrMin(lrMin: Double) = apply { this.lrMin = lrMin }

            @JsonProperty("optimizer_type")
            fun optimizerType(optimizerType: OptimizerType) = apply {
                this.optimizerType = optimizerType
            }

            @JsonProperty("weight_decay")
            fun weightDecay(weightDecay: Double) = apply { this.weightDecay = weightDecay }

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

            fun build(): OptimizerConfig =
                OptimizerConfig(
                    checkNotNull(lr) { "`lr` is required but was not set" },
                    checkNotNull(lrMin) { "`lrMin` is required but was not set" },
                    checkNotNull(optimizerType) { "`optimizerType` is required but was not set" },
                    checkNotNull(weightDecay) { "`weightDecay` is required but was not set" },
                    additionalProperties.toUnmodifiable(),
                )
        }

        class OptimizerType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is OptimizerType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ADAM = OptimizerType(JsonField.of("adam"))

                val ADAMW = OptimizerType(JsonField.of("adamw"))

                val SGD = OptimizerType(JsonField.of("sgd"))

                fun of(value: String) = OptimizerType(JsonField.of(value))
            }

            enum class Known {
                ADAM,
                ADAMW,
                SGD,
            }

            enum class Value {
                ADAM,
                ADAMW,
                SGD,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ADAM -> Value.ADAM
                    ADAMW -> Value.ADAMW
                    SGD -> Value.SGD
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ADAM -> Known.ADAM
                    ADAMW -> Known.ADAMW
                    SGD -> Known.SGD
                    else ->
                        throw LlamaStackClientInvalidDataException("Unknown OptimizerType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    @JsonDeserialize(builder = TrainingConfig.Builder::class)
    @NoAutoDetect
    class TrainingConfig
    private constructor(
        private val batchSize: Long?,
        private val enableActivationCheckpointing: Boolean?,
        private val fsdpCpuOffload: Boolean?,
        private val memoryEfficientFsdpWrap: Boolean?,
        private val nEpochs: Long?,
        private val nIters: Long?,
        private val shuffle: Boolean?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("batch_size") fun batchSize(): Long? = batchSize

        @JsonProperty("enable_activation_checkpointing")
        fun enableActivationCheckpointing(): Boolean? = enableActivationCheckpointing

        @JsonProperty("fsdp_cpu_offload") fun fsdpCpuOffload(): Boolean? = fsdpCpuOffload

        @JsonProperty("memory_efficient_fsdp_wrap")
        fun memoryEfficientFsdpWrap(): Boolean? = memoryEfficientFsdpWrap

        @JsonProperty("n_epochs") fun nEpochs(): Long? = nEpochs

        @JsonProperty("n_iters") fun nIters(): Long? = nIters

        @JsonProperty("shuffle") fun shuffle(): Boolean? = shuffle

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TrainingConfig &&
                this.batchSize == other.batchSize &&
                this.enableActivationCheckpointing == other.enableActivationCheckpointing &&
                this.fsdpCpuOffload == other.fsdpCpuOffload &&
                this.memoryEfficientFsdpWrap == other.memoryEfficientFsdpWrap &&
                this.nEpochs == other.nEpochs &&
                this.nIters == other.nIters &&
                this.shuffle == other.shuffle &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        batchSize,
                        enableActivationCheckpointing,
                        fsdpCpuOffload,
                        memoryEfficientFsdpWrap,
                        nEpochs,
                        nIters,
                        shuffle,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "TrainingConfig{batchSize=$batchSize, enableActivationCheckpointing=$enableActivationCheckpointing, fsdpCpuOffload=$fsdpCpuOffload, memoryEfficientFsdpWrap=$memoryEfficientFsdpWrap, nEpochs=$nEpochs, nIters=$nIters, shuffle=$shuffle, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var batchSize: Long? = null
            private var enableActivationCheckpointing: Boolean? = null
            private var fsdpCpuOffload: Boolean? = null
            private var memoryEfficientFsdpWrap: Boolean? = null
            private var nEpochs: Long? = null
            private var nIters: Long? = null
            private var shuffle: Boolean? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(trainingConfig: TrainingConfig) = apply {
                this.batchSize = trainingConfig.batchSize
                this.enableActivationCheckpointing = trainingConfig.enableActivationCheckpointing
                this.fsdpCpuOffload = trainingConfig.fsdpCpuOffload
                this.memoryEfficientFsdpWrap = trainingConfig.memoryEfficientFsdpWrap
                this.nEpochs = trainingConfig.nEpochs
                this.nIters = trainingConfig.nIters
                this.shuffle = trainingConfig.shuffle
                additionalProperties(trainingConfig.additionalProperties)
            }

            @JsonProperty("batch_size")
            fun batchSize(batchSize: Long) = apply { this.batchSize = batchSize }

            @JsonProperty("enable_activation_checkpointing")
            fun enableActivationCheckpointing(enableActivationCheckpointing: Boolean) = apply {
                this.enableActivationCheckpointing = enableActivationCheckpointing
            }

            @JsonProperty("fsdp_cpu_offload")
            fun fsdpCpuOffload(fsdpCpuOffload: Boolean) = apply {
                this.fsdpCpuOffload = fsdpCpuOffload
            }

            @JsonProperty("memory_efficient_fsdp_wrap")
            fun memoryEfficientFsdpWrap(memoryEfficientFsdpWrap: Boolean) = apply {
                this.memoryEfficientFsdpWrap = memoryEfficientFsdpWrap
            }

            @JsonProperty("n_epochs") fun nEpochs(nEpochs: Long) = apply { this.nEpochs = nEpochs }

            @JsonProperty("n_iters") fun nIters(nIters: Long) = apply { this.nIters = nIters }

            @JsonProperty("shuffle")
            fun shuffle(shuffle: Boolean) = apply { this.shuffle = shuffle }

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

            fun build(): TrainingConfig =
                TrainingConfig(
                    checkNotNull(batchSize) { "`batchSize` is required but was not set" },
                    checkNotNull(enableActivationCheckpointing) {
                        "`enableActivationCheckpointing` is required but was not set"
                    },
                    checkNotNull(fsdpCpuOffload) { "`fsdpCpuOffload` is required but was not set" },
                    checkNotNull(memoryEfficientFsdpWrap) {
                        "`memoryEfficientFsdpWrap` is required but was not set"
                    },
                    checkNotNull(nEpochs) { "`nEpochs` is required but was not set" },
                    checkNotNull(nIters) { "`nIters` is required but was not set" },
                    checkNotNull(shuffle) { "`shuffle` is required but was not set" },
                    additionalProperties.toUnmodifiable(),
                )
        }
    }
}
