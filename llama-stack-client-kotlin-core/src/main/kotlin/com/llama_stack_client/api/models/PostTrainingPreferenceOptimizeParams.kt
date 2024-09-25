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

class PostTrainingPreferenceOptimizeParams
constructor(
    private val algorithm: Algorithm,
    private val algorithmConfig: AlgorithmConfig,
    private val dataset: TrainEvalDataset,
    private val finetunedModel: String,
    private val hyperparamSearchConfig: HyperparamSearchConfig,
    private val jobUuid: String,
    private val loggerConfig: LoggerConfig,
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

    fun finetunedModel(): String = finetunedModel

    fun hyperparamSearchConfig(): HyperparamSearchConfig = hyperparamSearchConfig

    fun jobUuid(): String = jobUuid

    fun loggerConfig(): LoggerConfig = loggerConfig

    fun optimizerConfig(): OptimizerConfig = optimizerConfig

    fun trainingConfig(): TrainingConfig = trainingConfig

    fun validationDataset(): TrainEvalDataset = validationDataset

    internal fun getBody(): PostTrainingPreferenceOptimizeBody {
        return PostTrainingPreferenceOptimizeBody(
            algorithm,
            algorithmConfig,
            dataset,
            finetunedModel,
            hyperparamSearchConfig,
            jobUuid,
            loggerConfig,
            optimizerConfig,
            trainingConfig,
            validationDataset,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = PostTrainingPreferenceOptimizeBody.Builder::class)
    @NoAutoDetect
    class PostTrainingPreferenceOptimizeBody
    internal constructor(
        private val algorithm: Algorithm?,
        private val algorithmConfig: AlgorithmConfig?,
        private val dataset: TrainEvalDataset?,
        private val finetunedModel: String?,
        private val hyperparamSearchConfig: HyperparamSearchConfig?,
        private val jobUuid: String?,
        private val loggerConfig: LoggerConfig?,
        private val optimizerConfig: OptimizerConfig?,
        private val trainingConfig: TrainingConfig?,
        private val validationDataset: TrainEvalDataset?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("algorithm") fun algorithm(): Algorithm? = algorithm

        @JsonProperty("algorithm_config") fun algorithmConfig(): AlgorithmConfig? = algorithmConfig

        @JsonProperty("dataset") fun dataset(): TrainEvalDataset? = dataset

        @JsonProperty("finetuned_model") fun finetunedModel(): String? = finetunedModel

        @JsonProperty("hyperparam_search_config")
        fun hyperparamSearchConfig(): HyperparamSearchConfig? = hyperparamSearchConfig

        @JsonProperty("job_uuid") fun jobUuid(): String? = jobUuid

        @JsonProperty("logger_config") fun loggerConfig(): LoggerConfig? = loggerConfig

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

            return other is PostTrainingPreferenceOptimizeBody &&
                this.algorithm == other.algorithm &&
                this.algorithmConfig == other.algorithmConfig &&
                this.dataset == other.dataset &&
                this.finetunedModel == other.finetunedModel &&
                this.hyperparamSearchConfig == other.hyperparamSearchConfig &&
                this.jobUuid == other.jobUuid &&
                this.loggerConfig == other.loggerConfig &&
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
                        finetunedModel,
                        hyperparamSearchConfig,
                        jobUuid,
                        loggerConfig,
                        optimizerConfig,
                        trainingConfig,
                        validationDataset,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "PostTrainingPreferenceOptimizeBody{algorithm=$algorithm, algorithmConfig=$algorithmConfig, dataset=$dataset, finetunedModel=$finetunedModel, hyperparamSearchConfig=$hyperparamSearchConfig, jobUuid=$jobUuid, loggerConfig=$loggerConfig, optimizerConfig=$optimizerConfig, trainingConfig=$trainingConfig, validationDataset=$validationDataset, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var algorithm: Algorithm? = null
            private var algorithmConfig: AlgorithmConfig? = null
            private var dataset: TrainEvalDataset? = null
            private var finetunedModel: String? = null
            private var hyperparamSearchConfig: HyperparamSearchConfig? = null
            private var jobUuid: String? = null
            private var loggerConfig: LoggerConfig? = null
            private var optimizerConfig: OptimizerConfig? = null
            private var trainingConfig: TrainingConfig? = null
            private var validationDataset: TrainEvalDataset? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                postTrainingPreferenceOptimizeBody: PostTrainingPreferenceOptimizeBody
            ) = apply {
                this.algorithm = postTrainingPreferenceOptimizeBody.algorithm
                this.algorithmConfig = postTrainingPreferenceOptimizeBody.algorithmConfig
                this.dataset = postTrainingPreferenceOptimizeBody.dataset
                this.finetunedModel = postTrainingPreferenceOptimizeBody.finetunedModel
                this.hyperparamSearchConfig =
                    postTrainingPreferenceOptimizeBody.hyperparamSearchConfig
                this.jobUuid = postTrainingPreferenceOptimizeBody.jobUuid
                this.loggerConfig = postTrainingPreferenceOptimizeBody.loggerConfig
                this.optimizerConfig = postTrainingPreferenceOptimizeBody.optimizerConfig
                this.trainingConfig = postTrainingPreferenceOptimizeBody.trainingConfig
                this.validationDataset = postTrainingPreferenceOptimizeBody.validationDataset
                additionalProperties(postTrainingPreferenceOptimizeBody.additionalProperties)
            }

            @JsonProperty("algorithm")
            fun algorithm(algorithm: Algorithm) = apply { this.algorithm = algorithm }

            @JsonProperty("algorithm_config")
            fun algorithmConfig(algorithmConfig: AlgorithmConfig) = apply {
                this.algorithmConfig = algorithmConfig
            }

            @JsonProperty("dataset")
            fun dataset(dataset: TrainEvalDataset) = apply { this.dataset = dataset }

            @JsonProperty("finetuned_model")
            fun finetunedModel(finetunedModel: String) = apply {
                this.finetunedModel = finetunedModel
            }

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

            fun build(): PostTrainingPreferenceOptimizeBody =
                PostTrainingPreferenceOptimizeBody(
                    checkNotNull(algorithm) { "`algorithm` is required but was not set" },
                    checkNotNull(algorithmConfig) {
                        "`algorithmConfig` is required but was not set"
                    },
                    checkNotNull(dataset) { "`dataset` is required but was not set" },
                    checkNotNull(finetunedModel) { "`finetunedModel` is required but was not set" },
                    checkNotNull(hyperparamSearchConfig) {
                        "`hyperparamSearchConfig` is required but was not set"
                    },
                    checkNotNull(jobUuid) { "`jobUuid` is required but was not set" },
                    checkNotNull(loggerConfig) { "`loggerConfig` is required but was not set" },
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

        return other is PostTrainingPreferenceOptimizeParams &&
            this.algorithm == other.algorithm &&
            this.algorithmConfig == other.algorithmConfig &&
            this.dataset == other.dataset &&
            this.finetunedModel == other.finetunedModel &&
            this.hyperparamSearchConfig == other.hyperparamSearchConfig &&
            this.jobUuid == other.jobUuid &&
            this.loggerConfig == other.loggerConfig &&
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
            finetunedModel,
            hyperparamSearchConfig,
            jobUuid,
            loggerConfig,
            optimizerConfig,
            trainingConfig,
            validationDataset,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "PostTrainingPreferenceOptimizeParams{algorithm=$algorithm, algorithmConfig=$algorithmConfig, dataset=$dataset, finetunedModel=$finetunedModel, hyperparamSearchConfig=$hyperparamSearchConfig, jobUuid=$jobUuid, loggerConfig=$loggerConfig, optimizerConfig=$optimizerConfig, trainingConfig=$trainingConfig, validationDataset=$validationDataset, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var algorithm: Algorithm? = null
        private var algorithmConfig: AlgorithmConfig? = null
        private var dataset: TrainEvalDataset? = null
        private var finetunedModel: String? = null
        private var hyperparamSearchConfig: HyperparamSearchConfig? = null
        private var jobUuid: String? = null
        private var loggerConfig: LoggerConfig? = null
        private var optimizerConfig: OptimizerConfig? = null
        private var trainingConfig: TrainingConfig? = null
        private var validationDataset: TrainEvalDataset? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            postTrainingPreferenceOptimizeParams: PostTrainingPreferenceOptimizeParams
        ) = apply {
            this.algorithm = postTrainingPreferenceOptimizeParams.algorithm
            this.algorithmConfig = postTrainingPreferenceOptimizeParams.algorithmConfig
            this.dataset = postTrainingPreferenceOptimizeParams.dataset
            this.finetunedModel = postTrainingPreferenceOptimizeParams.finetunedModel
            this.hyperparamSearchConfig =
                postTrainingPreferenceOptimizeParams.hyperparamSearchConfig
            this.jobUuid = postTrainingPreferenceOptimizeParams.jobUuid
            this.loggerConfig = postTrainingPreferenceOptimizeParams.loggerConfig
            this.optimizerConfig = postTrainingPreferenceOptimizeParams.optimizerConfig
            this.trainingConfig = postTrainingPreferenceOptimizeParams.trainingConfig
            this.validationDataset = postTrainingPreferenceOptimizeParams.validationDataset
            additionalQueryParams(postTrainingPreferenceOptimizeParams.additionalQueryParams)
            additionalHeaders(postTrainingPreferenceOptimizeParams.additionalHeaders)
            additionalBodyProperties(postTrainingPreferenceOptimizeParams.additionalBodyProperties)
        }

        fun algorithm(algorithm: Algorithm) = apply { this.algorithm = algorithm }

        fun algorithmConfig(algorithmConfig: AlgorithmConfig) = apply {
            this.algorithmConfig = algorithmConfig
        }

        fun dataset(dataset: TrainEvalDataset) = apply { this.dataset = dataset }

        fun finetunedModel(finetunedModel: String) = apply { this.finetunedModel = finetunedModel }

        fun hyperparamSearchConfig(hyperparamSearchConfig: HyperparamSearchConfig) = apply {
            this.hyperparamSearchConfig = hyperparamSearchConfig
        }

        fun jobUuid(jobUuid: String) = apply { this.jobUuid = jobUuid }

        fun loggerConfig(loggerConfig: LoggerConfig) = apply { this.loggerConfig = loggerConfig }

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

        fun build(): PostTrainingPreferenceOptimizeParams =
            PostTrainingPreferenceOptimizeParams(
                checkNotNull(algorithm) { "`algorithm` is required but was not set" },
                checkNotNull(algorithmConfig) { "`algorithmConfig` is required but was not set" },
                checkNotNull(dataset) { "`dataset` is required but was not set" },
                checkNotNull(finetunedModel) { "`finetunedModel` is required but was not set" },
                checkNotNull(hyperparamSearchConfig) {
                    "`hyperparamSearchConfig` is required but was not set"
                },
                checkNotNull(jobUuid) { "`jobUuid` is required but was not set" },
                checkNotNull(loggerConfig) { "`loggerConfig` is required but was not set" },
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

            val DPO = Algorithm(JsonField.of("dpo"))

            fun of(value: String) = Algorithm(JsonField.of(value))
        }

        enum class Known {
            DPO,
        }

        enum class Value {
            DPO,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DPO -> Value.DPO
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DPO -> Known.DPO
                else -> throw LlamaStackClientInvalidDataException("Unknown Algorithm: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    @JsonDeserialize(builder = AlgorithmConfig.Builder::class)
    @NoAutoDetect
    class AlgorithmConfig
    private constructor(
        private val epsilon: Double?,
        private val gamma: Double?,
        private val rewardClip: Double?,
        private val rewardScale: Double?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("epsilon") fun epsilon(): Double? = epsilon

        @JsonProperty("gamma") fun gamma(): Double? = gamma

        @JsonProperty("reward_clip") fun rewardClip(): Double? = rewardClip

        @JsonProperty("reward_scale") fun rewardScale(): Double? = rewardScale

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AlgorithmConfig &&
                this.epsilon == other.epsilon &&
                this.gamma == other.gamma &&
                this.rewardClip == other.rewardClip &&
                this.rewardScale == other.rewardScale &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        epsilon,
                        gamma,
                        rewardClip,
                        rewardScale,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "AlgorithmConfig{epsilon=$epsilon, gamma=$gamma, rewardClip=$rewardClip, rewardScale=$rewardScale, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var epsilon: Double? = null
            private var gamma: Double? = null
            private var rewardClip: Double? = null
            private var rewardScale: Double? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(algorithmConfig: AlgorithmConfig) = apply {
                this.epsilon = algorithmConfig.epsilon
                this.gamma = algorithmConfig.gamma
                this.rewardClip = algorithmConfig.rewardClip
                this.rewardScale = algorithmConfig.rewardScale
                additionalProperties(algorithmConfig.additionalProperties)
            }

            @JsonProperty("epsilon") fun epsilon(epsilon: Double) = apply { this.epsilon = epsilon }

            @JsonProperty("gamma") fun gamma(gamma: Double) = apply { this.gamma = gamma }

            @JsonProperty("reward_clip")
            fun rewardClip(rewardClip: Double) = apply { this.rewardClip = rewardClip }

            @JsonProperty("reward_scale")
            fun rewardScale(rewardScale: Double) = apply { this.rewardScale = rewardScale }

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

            fun build(): AlgorithmConfig =
                AlgorithmConfig(
                    checkNotNull(epsilon) { "`epsilon` is required but was not set" },
                    checkNotNull(gamma) { "`gamma` is required but was not set" },
                    checkNotNull(rewardClip) { "`rewardClip` is required but was not set" },
                    checkNotNull(rewardScale) { "`rewardScale` is required but was not set" },
                    additionalProperties.toUnmodifiable(),
                )
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
