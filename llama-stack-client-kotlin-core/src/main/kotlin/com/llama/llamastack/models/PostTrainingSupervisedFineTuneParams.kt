// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.llama.llamastack.core.Enum
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
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

class PostTrainingSupervisedFineTuneParams
private constructor(
    private val body: PostTrainingSupervisedFineTuneBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun hyperparamSearchConfig(): HyperparamSearchConfig = body.hyperparamSearchConfig()

    fun jobUuid(): String = body.jobUuid()

    fun loggerConfig(): LoggerConfig = body.loggerConfig()

    fun model(): String = body.model()

    fun trainingConfig(): TrainingConfig = body.trainingConfig()

    fun algorithmConfig(): AlgorithmConfig? = body.algorithmConfig()

    fun checkpointDir(): String? = body.checkpointDir()

    fun _hyperparamSearchConfig(): JsonField<HyperparamSearchConfig> =
        body._hyperparamSearchConfig()

    fun _jobUuid(): JsonField<String> = body._jobUuid()

    fun _loggerConfig(): JsonField<LoggerConfig> = body._loggerConfig()

    fun _model(): JsonField<String> = body._model()

    fun _trainingConfig(): JsonField<TrainingConfig> = body._trainingConfig()

    fun _algorithmConfig(): JsonField<AlgorithmConfig> = body._algorithmConfig()

    fun _checkpointDir(): JsonField<String> = body._checkpointDir()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): PostTrainingSupervisedFineTuneBody = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class PostTrainingSupervisedFineTuneBody
    @JsonCreator
    internal constructor(
        @JsonProperty("hyperparam_search_config")
        @ExcludeMissing
        private val hyperparamSearchConfig: JsonField<HyperparamSearchConfig> = JsonMissing.of(),
        @JsonProperty("job_uuid")
        @ExcludeMissing
        private val jobUuid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("logger_config")
        @ExcludeMissing
        private val loggerConfig: JsonField<LoggerConfig> = JsonMissing.of(),
        @JsonProperty("model")
        @ExcludeMissing
        private val model: JsonField<String> = JsonMissing.of(),
        @JsonProperty("training_config")
        @ExcludeMissing
        private val trainingConfig: JsonField<TrainingConfig> = JsonMissing.of(),
        @JsonProperty("algorithm_config")
        @ExcludeMissing
        private val algorithmConfig: JsonField<AlgorithmConfig> = JsonMissing.of(),
        @JsonProperty("checkpoint_dir")
        @ExcludeMissing
        private val checkpointDir: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun hyperparamSearchConfig(): HyperparamSearchConfig =
            hyperparamSearchConfig.getRequired("hyperparam_search_config")

        fun jobUuid(): String = jobUuid.getRequired("job_uuid")

        fun loggerConfig(): LoggerConfig = loggerConfig.getRequired("logger_config")

        fun model(): String = model.getRequired("model")

        fun trainingConfig(): TrainingConfig = trainingConfig.getRequired("training_config")

        fun algorithmConfig(): AlgorithmConfig? = algorithmConfig.getNullable("algorithm_config")

        fun checkpointDir(): String? = checkpointDir.getNullable("checkpoint_dir")

        @JsonProperty("hyperparam_search_config")
        @ExcludeMissing
        fun _hyperparamSearchConfig(): JsonField<HyperparamSearchConfig> = hyperparamSearchConfig

        @JsonProperty("job_uuid") @ExcludeMissing fun _jobUuid(): JsonField<String> = jobUuid

        @JsonProperty("logger_config")
        @ExcludeMissing
        fun _loggerConfig(): JsonField<LoggerConfig> = loggerConfig

        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

        @JsonProperty("training_config")
        @ExcludeMissing
        fun _trainingConfig(): JsonField<TrainingConfig> = trainingConfig

        @JsonProperty("algorithm_config")
        @ExcludeMissing
        fun _algorithmConfig(): JsonField<AlgorithmConfig> = algorithmConfig

        @JsonProperty("checkpoint_dir")
        @ExcludeMissing
        fun _checkpointDir(): JsonField<String> = checkpointDir

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PostTrainingSupervisedFineTuneBody = apply {
            if (validated) {
                return@apply
            }

            hyperparamSearchConfig().validate()
            jobUuid()
            loggerConfig().validate()
            model()
            trainingConfig().validate()
            algorithmConfig()?.validate()
            checkpointDir()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [PostTrainingSupervisedFineTuneBody]. */
        class Builder internal constructor() {

            private var hyperparamSearchConfig: JsonField<HyperparamSearchConfig>? = null
            private var jobUuid: JsonField<String>? = null
            private var loggerConfig: JsonField<LoggerConfig>? = null
            private var model: JsonField<String>? = null
            private var trainingConfig: JsonField<TrainingConfig>? = null
            private var algorithmConfig: JsonField<AlgorithmConfig> = JsonMissing.of()
            private var checkpointDir: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                postTrainingSupervisedFineTuneBody: PostTrainingSupervisedFineTuneBody
            ) = apply {
                hyperparamSearchConfig = postTrainingSupervisedFineTuneBody.hyperparamSearchConfig
                jobUuid = postTrainingSupervisedFineTuneBody.jobUuid
                loggerConfig = postTrainingSupervisedFineTuneBody.loggerConfig
                model = postTrainingSupervisedFineTuneBody.model
                trainingConfig = postTrainingSupervisedFineTuneBody.trainingConfig
                algorithmConfig = postTrainingSupervisedFineTuneBody.algorithmConfig
                checkpointDir = postTrainingSupervisedFineTuneBody.checkpointDir
                additionalProperties =
                    postTrainingSupervisedFineTuneBody.additionalProperties.toMutableMap()
            }

            fun hyperparamSearchConfig(hyperparamSearchConfig: HyperparamSearchConfig) =
                hyperparamSearchConfig(JsonField.of(hyperparamSearchConfig))

            fun hyperparamSearchConfig(hyperparamSearchConfig: JsonField<HyperparamSearchConfig>) =
                apply {
                    this.hyperparamSearchConfig = hyperparamSearchConfig
                }

            fun jobUuid(jobUuid: String) = jobUuid(JsonField.of(jobUuid))

            fun jobUuid(jobUuid: JsonField<String>) = apply { this.jobUuid = jobUuid }

            fun loggerConfig(loggerConfig: LoggerConfig) = loggerConfig(JsonField.of(loggerConfig))

            fun loggerConfig(loggerConfig: JsonField<LoggerConfig>) = apply {
                this.loggerConfig = loggerConfig
            }

            fun model(model: String) = model(JsonField.of(model))

            fun model(model: JsonField<String>) = apply { this.model = model }

            fun trainingConfig(trainingConfig: TrainingConfig) =
                trainingConfig(JsonField.of(trainingConfig))

            fun trainingConfig(trainingConfig: JsonField<TrainingConfig>) = apply {
                this.trainingConfig = trainingConfig
            }

            fun algorithmConfig(algorithmConfig: AlgorithmConfig) =
                algorithmConfig(JsonField.of(algorithmConfig))

            fun algorithmConfig(algorithmConfig: JsonField<AlgorithmConfig>) = apply {
                this.algorithmConfig = algorithmConfig
            }

            fun algorithmConfig(loraFinetuning: AlgorithmConfig.LoraFinetuningConfig) =
                algorithmConfig(AlgorithmConfig.ofLoraFinetuning(loraFinetuning))

            fun algorithmConfig(qatFinetuning: AlgorithmConfig.QatFinetuningConfig) =
                algorithmConfig(AlgorithmConfig.ofQatFinetuning(qatFinetuning))

            fun checkpointDir(checkpointDir: String) = checkpointDir(JsonField.of(checkpointDir))

            fun checkpointDir(checkpointDir: JsonField<String>) = apply {
                this.checkpointDir = checkpointDir
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

            fun build(): PostTrainingSupervisedFineTuneBody =
                PostTrainingSupervisedFineTuneBody(
                    checkRequired("hyperparamSearchConfig", hyperparamSearchConfig),
                    checkRequired("jobUuid", jobUuid),
                    checkRequired("loggerConfig", loggerConfig),
                    checkRequired("model", model),
                    checkRequired("trainingConfig", trainingConfig),
                    algorithmConfig,
                    checkpointDir,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PostTrainingSupervisedFineTuneBody && hyperparamSearchConfig == other.hyperparamSearchConfig && jobUuid == other.jobUuid && loggerConfig == other.loggerConfig && model == other.model && trainingConfig == other.trainingConfig && algorithmConfig == other.algorithmConfig && checkpointDir == other.checkpointDir && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(hyperparamSearchConfig, jobUuid, loggerConfig, model, trainingConfig, algorithmConfig, checkpointDir, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PostTrainingSupervisedFineTuneBody{hyperparamSearchConfig=$hyperparamSearchConfig, jobUuid=$jobUuid, loggerConfig=$loggerConfig, model=$model, trainingConfig=$trainingConfig, algorithmConfig=$algorithmConfig, checkpointDir=$checkpointDir, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [PostTrainingSupervisedFineTuneParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: PostTrainingSupervisedFineTuneBody.Builder =
            PostTrainingSupervisedFineTuneBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(
            postTrainingSupervisedFineTuneParams: PostTrainingSupervisedFineTuneParams
        ) = apply {
            body = postTrainingSupervisedFineTuneParams.body.toBuilder()
            additionalHeaders = postTrainingSupervisedFineTuneParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                postTrainingSupervisedFineTuneParams.additionalQueryParams.toBuilder()
        }

        fun hyperparamSearchConfig(hyperparamSearchConfig: HyperparamSearchConfig) = apply {
            body.hyperparamSearchConfig(hyperparamSearchConfig)
        }

        fun hyperparamSearchConfig(hyperparamSearchConfig: JsonField<HyperparamSearchConfig>) =
            apply {
                body.hyperparamSearchConfig(hyperparamSearchConfig)
            }

        fun jobUuid(jobUuid: String) = apply { body.jobUuid(jobUuid) }

        fun jobUuid(jobUuid: JsonField<String>) = apply { body.jobUuid(jobUuid) }

        fun loggerConfig(loggerConfig: LoggerConfig) = apply { body.loggerConfig(loggerConfig) }

        fun loggerConfig(loggerConfig: JsonField<LoggerConfig>) = apply {
            body.loggerConfig(loggerConfig)
        }

        fun model(model: String) = apply { body.model(model) }

        fun model(model: JsonField<String>) = apply { body.model(model) }

        fun trainingConfig(trainingConfig: TrainingConfig) = apply {
            body.trainingConfig(trainingConfig)
        }

        fun trainingConfig(trainingConfig: JsonField<TrainingConfig>) = apply {
            body.trainingConfig(trainingConfig)
        }

        fun algorithmConfig(algorithmConfig: AlgorithmConfig) = apply {
            body.algorithmConfig(algorithmConfig)
        }

        fun algorithmConfig(algorithmConfig: JsonField<AlgorithmConfig>) = apply {
            body.algorithmConfig(algorithmConfig)
        }

        fun algorithmConfig(loraFinetuning: AlgorithmConfig.LoraFinetuningConfig) = apply {
            body.algorithmConfig(loraFinetuning)
        }

        fun algorithmConfig(qatFinetuning: AlgorithmConfig.QatFinetuningConfig) = apply {
            body.algorithmConfig(qatFinetuning)
        }

        fun checkpointDir(checkpointDir: String) = apply { body.checkpointDir(checkpointDir) }

        fun checkpointDir(checkpointDir: JsonField<String>) = apply {
            body.checkpointDir(checkpointDir)
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

        fun build(): PostTrainingSupervisedFineTuneParams =
            PostTrainingSupervisedFineTuneParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class HyperparamSearchConfig
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): HyperparamSearchConfig = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [HyperparamSearchConfig]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(hyperparamSearchConfig: HyperparamSearchConfig) = apply {
                additionalProperties = hyperparamSearchConfig.additionalProperties.toMutableMap()
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

            fun build(): HyperparamSearchConfig =
                HyperparamSearchConfig(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is HyperparamSearchConfig && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "HyperparamSearchConfig{additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class LoggerConfig
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): LoggerConfig = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [LoggerConfig]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(loggerConfig: LoggerConfig) = apply {
                additionalProperties = loggerConfig.additionalProperties.toMutableMap()
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

            fun build(): LoggerConfig = LoggerConfig(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LoggerConfig && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "LoggerConfig{additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class TrainingConfig
    @JsonCreator
    private constructor(
        @JsonProperty("data_config")
        @ExcludeMissing
        private val dataConfig: JsonField<DataConfig> = JsonMissing.of(),
        @JsonProperty("gradient_accumulation_steps")
        @ExcludeMissing
        private val gradientAccumulationSteps: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("max_steps_per_epoch")
        @ExcludeMissing
        private val maxStepsPerEpoch: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("max_validation_steps")
        @ExcludeMissing
        private val maxValidationSteps: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("n_epochs")
        @ExcludeMissing
        private val nEpochs: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("optimizer_config")
        @ExcludeMissing
        private val optimizerConfig: JsonField<OptimizerConfig> = JsonMissing.of(),
        @JsonProperty("dtype")
        @ExcludeMissing
        private val dtype: JsonField<String> = JsonMissing.of(),
        @JsonProperty("efficiency_config")
        @ExcludeMissing
        private val efficiencyConfig: JsonField<EfficiencyConfig> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun dataConfig(): DataConfig = dataConfig.getRequired("data_config")

        fun gradientAccumulationSteps(): Long =
            gradientAccumulationSteps.getRequired("gradient_accumulation_steps")

        fun maxStepsPerEpoch(): Long = maxStepsPerEpoch.getRequired("max_steps_per_epoch")

        fun maxValidationSteps(): Long = maxValidationSteps.getRequired("max_validation_steps")

        fun nEpochs(): Long = nEpochs.getRequired("n_epochs")

        fun optimizerConfig(): OptimizerConfig = optimizerConfig.getRequired("optimizer_config")

        fun dtype(): String? = dtype.getNullable("dtype")

        fun efficiencyConfig(): EfficiencyConfig? =
            efficiencyConfig.getNullable("efficiency_config")

        @JsonProperty("data_config")
        @ExcludeMissing
        fun _dataConfig(): JsonField<DataConfig> = dataConfig

        @JsonProperty("gradient_accumulation_steps")
        @ExcludeMissing
        fun _gradientAccumulationSteps(): JsonField<Long> = gradientAccumulationSteps

        @JsonProperty("max_steps_per_epoch")
        @ExcludeMissing
        fun _maxStepsPerEpoch(): JsonField<Long> = maxStepsPerEpoch

        @JsonProperty("max_validation_steps")
        @ExcludeMissing
        fun _maxValidationSteps(): JsonField<Long> = maxValidationSteps

        @JsonProperty("n_epochs") @ExcludeMissing fun _nEpochs(): JsonField<Long> = nEpochs

        @JsonProperty("optimizer_config")
        @ExcludeMissing
        fun _optimizerConfig(): JsonField<OptimizerConfig> = optimizerConfig

        @JsonProperty("dtype") @ExcludeMissing fun _dtype(): JsonField<String> = dtype

        @JsonProperty("efficiency_config")
        @ExcludeMissing
        fun _efficiencyConfig(): JsonField<EfficiencyConfig> = efficiencyConfig

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): TrainingConfig = apply {
            if (validated) {
                return@apply
            }

            dataConfig().validate()
            gradientAccumulationSteps()
            maxStepsPerEpoch()
            maxValidationSteps()
            nEpochs()
            optimizerConfig().validate()
            dtype()
            efficiencyConfig()?.validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [TrainingConfig]. */
        class Builder internal constructor() {

            private var dataConfig: JsonField<DataConfig>? = null
            private var gradientAccumulationSteps: JsonField<Long>? = null
            private var maxStepsPerEpoch: JsonField<Long>? = null
            private var maxValidationSteps: JsonField<Long>? = null
            private var nEpochs: JsonField<Long>? = null
            private var optimizerConfig: JsonField<OptimizerConfig>? = null
            private var dtype: JsonField<String> = JsonMissing.of()
            private var efficiencyConfig: JsonField<EfficiencyConfig> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(trainingConfig: TrainingConfig) = apply {
                dataConfig = trainingConfig.dataConfig
                gradientAccumulationSteps = trainingConfig.gradientAccumulationSteps
                maxStepsPerEpoch = trainingConfig.maxStepsPerEpoch
                maxValidationSteps = trainingConfig.maxValidationSteps
                nEpochs = trainingConfig.nEpochs
                optimizerConfig = trainingConfig.optimizerConfig
                dtype = trainingConfig.dtype
                efficiencyConfig = trainingConfig.efficiencyConfig
                additionalProperties = trainingConfig.additionalProperties.toMutableMap()
            }

            fun dataConfig(dataConfig: DataConfig) = dataConfig(JsonField.of(dataConfig))

            fun dataConfig(dataConfig: JsonField<DataConfig>) = apply {
                this.dataConfig = dataConfig
            }

            fun gradientAccumulationSteps(gradientAccumulationSteps: Long) =
                gradientAccumulationSteps(JsonField.of(gradientAccumulationSteps))

            fun gradientAccumulationSteps(gradientAccumulationSteps: JsonField<Long>) = apply {
                this.gradientAccumulationSteps = gradientAccumulationSteps
            }

            fun maxStepsPerEpoch(maxStepsPerEpoch: Long) =
                maxStepsPerEpoch(JsonField.of(maxStepsPerEpoch))

            fun maxStepsPerEpoch(maxStepsPerEpoch: JsonField<Long>) = apply {
                this.maxStepsPerEpoch = maxStepsPerEpoch
            }

            fun maxValidationSteps(maxValidationSteps: Long) =
                maxValidationSteps(JsonField.of(maxValidationSteps))

            fun maxValidationSteps(maxValidationSteps: JsonField<Long>) = apply {
                this.maxValidationSteps = maxValidationSteps
            }

            fun nEpochs(nEpochs: Long) = nEpochs(JsonField.of(nEpochs))

            fun nEpochs(nEpochs: JsonField<Long>) = apply { this.nEpochs = nEpochs }

            fun optimizerConfig(optimizerConfig: OptimizerConfig) =
                optimizerConfig(JsonField.of(optimizerConfig))

            fun optimizerConfig(optimizerConfig: JsonField<OptimizerConfig>) = apply {
                this.optimizerConfig = optimizerConfig
            }

            fun dtype(dtype: String) = dtype(JsonField.of(dtype))

            fun dtype(dtype: JsonField<String>) = apply { this.dtype = dtype }

            fun efficiencyConfig(efficiencyConfig: EfficiencyConfig) =
                efficiencyConfig(JsonField.of(efficiencyConfig))

            fun efficiencyConfig(efficiencyConfig: JsonField<EfficiencyConfig>) = apply {
                this.efficiencyConfig = efficiencyConfig
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

            fun build(): TrainingConfig =
                TrainingConfig(
                    checkRequired("dataConfig", dataConfig),
                    checkRequired("gradientAccumulationSteps", gradientAccumulationSteps),
                    checkRequired("maxStepsPerEpoch", maxStepsPerEpoch),
                    checkRequired("maxValidationSteps", maxValidationSteps),
                    checkRequired("nEpochs", nEpochs),
                    checkRequired("optimizerConfig", optimizerConfig),
                    dtype,
                    efficiencyConfig,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class DataConfig
        @JsonCreator
        private constructor(
            @JsonProperty("batch_size")
            @ExcludeMissing
            private val batchSize: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("data_format")
            @ExcludeMissing
            private val dataFormat: JsonField<DataFormat> = JsonMissing.of(),
            @JsonProperty("dataset_id")
            @ExcludeMissing
            private val datasetId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("shuffle")
            @ExcludeMissing
            private val shuffle: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("packed")
            @ExcludeMissing
            private val packed: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("train_on_input")
            @ExcludeMissing
            private val trainOnInput: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("validation_dataset_id")
            @ExcludeMissing
            private val validationDatasetId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun batchSize(): Long = batchSize.getRequired("batch_size")

            fun dataFormat(): DataFormat = dataFormat.getRequired("data_format")

            fun datasetId(): String = datasetId.getRequired("dataset_id")

            fun shuffle(): Boolean = shuffle.getRequired("shuffle")

            fun packed(): Boolean? = packed.getNullable("packed")

            fun trainOnInput(): Boolean? = trainOnInput.getNullable("train_on_input")

            fun validationDatasetId(): String? =
                validationDatasetId.getNullable("validation_dataset_id")

            @JsonProperty("batch_size")
            @ExcludeMissing
            fun _batchSize(): JsonField<Long> = batchSize

            @JsonProperty("data_format")
            @ExcludeMissing
            fun _dataFormat(): JsonField<DataFormat> = dataFormat

            @JsonProperty("dataset_id")
            @ExcludeMissing
            fun _datasetId(): JsonField<String> = datasetId

            @JsonProperty("shuffle") @ExcludeMissing fun _shuffle(): JsonField<Boolean> = shuffle

            @JsonProperty("packed") @ExcludeMissing fun _packed(): JsonField<Boolean> = packed

            @JsonProperty("train_on_input")
            @ExcludeMissing
            fun _trainOnInput(): JsonField<Boolean> = trainOnInput

            @JsonProperty("validation_dataset_id")
            @ExcludeMissing
            fun _validationDatasetId(): JsonField<String> = validationDatasetId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): DataConfig = apply {
                if (validated) {
                    return@apply
                }

                batchSize()
                dataFormat()
                datasetId()
                shuffle()
                packed()
                trainOnInput()
                validationDatasetId()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            /** A builder for [DataConfig]. */
            class Builder internal constructor() {

                private var batchSize: JsonField<Long>? = null
                private var dataFormat: JsonField<DataFormat>? = null
                private var datasetId: JsonField<String>? = null
                private var shuffle: JsonField<Boolean>? = null
                private var packed: JsonField<Boolean> = JsonMissing.of()
                private var trainOnInput: JsonField<Boolean> = JsonMissing.of()
                private var validationDatasetId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(dataConfig: DataConfig) = apply {
                    batchSize = dataConfig.batchSize
                    dataFormat = dataConfig.dataFormat
                    datasetId = dataConfig.datasetId
                    shuffle = dataConfig.shuffle
                    packed = dataConfig.packed
                    trainOnInput = dataConfig.trainOnInput
                    validationDatasetId = dataConfig.validationDatasetId
                    additionalProperties = dataConfig.additionalProperties.toMutableMap()
                }

                fun batchSize(batchSize: Long) = batchSize(JsonField.of(batchSize))

                fun batchSize(batchSize: JsonField<Long>) = apply { this.batchSize = batchSize }

                fun dataFormat(dataFormat: DataFormat) = dataFormat(JsonField.of(dataFormat))

                fun dataFormat(dataFormat: JsonField<DataFormat>) = apply {
                    this.dataFormat = dataFormat
                }

                fun datasetId(datasetId: String) = datasetId(JsonField.of(datasetId))

                fun datasetId(datasetId: JsonField<String>) = apply { this.datasetId = datasetId }

                fun shuffle(shuffle: Boolean) = shuffle(JsonField.of(shuffle))

                fun shuffle(shuffle: JsonField<Boolean>) = apply { this.shuffle = shuffle }

                fun packed(packed: Boolean) = packed(JsonField.of(packed))

                fun packed(packed: JsonField<Boolean>) = apply { this.packed = packed }

                fun trainOnInput(trainOnInput: Boolean) = trainOnInput(JsonField.of(trainOnInput))

                fun trainOnInput(trainOnInput: JsonField<Boolean>) = apply {
                    this.trainOnInput = trainOnInput
                }

                fun validationDatasetId(validationDatasetId: String) =
                    validationDatasetId(JsonField.of(validationDatasetId))

                fun validationDatasetId(validationDatasetId: JsonField<String>) = apply {
                    this.validationDatasetId = validationDatasetId
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

                fun build(): DataConfig =
                    DataConfig(
                        checkRequired("batchSize", batchSize),
                        checkRequired("dataFormat", dataFormat),
                        checkRequired("datasetId", datasetId),
                        checkRequired("shuffle", shuffle),
                        packed,
                        trainOnInput,
                        validationDatasetId,
                        additionalProperties.toImmutable(),
                    )
            }

            class DataFormat
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val INSTRUCT = of("instruct")

                    val DIALOG = of("dialog")

                    fun of(value: String) = DataFormat(JsonField.of(value))
                }

                /** An enum containing [DataFormat]'s known values. */
                enum class Known {
                    INSTRUCT,
                    DIALOG,
                }

                /**
                 * An enum containing [DataFormat]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [DataFormat] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    INSTRUCT,
                    DIALOG,
                    /**
                     * An enum member indicating that [DataFormat] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        INSTRUCT -> Value.INSTRUCT
                        DIALOG -> Value.DIALOG
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LlamaStackClientInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        INSTRUCT -> Known.INSTRUCT
                        DIALOG -> Known.DIALOG
                        else ->
                            throw LlamaStackClientInvalidDataException("Unknown DataFormat: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DataFormat && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DataConfig && batchSize == other.batchSize && dataFormat == other.dataFormat && datasetId == other.datasetId && shuffle == other.shuffle && packed == other.packed && trainOnInput == other.trainOnInput && validationDatasetId == other.validationDatasetId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(batchSize, dataFormat, datasetId, shuffle, packed, trainOnInput, validationDatasetId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DataConfig{batchSize=$batchSize, dataFormat=$dataFormat, datasetId=$datasetId, shuffle=$shuffle, packed=$packed, trainOnInput=$trainOnInput, validationDatasetId=$validationDatasetId, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class OptimizerConfig
        @JsonCreator
        private constructor(
            @JsonProperty("lr")
            @ExcludeMissing
            private val lr: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("num_warmup_steps")
            @ExcludeMissing
            private val numWarmupSteps: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("optimizer_type")
            @ExcludeMissing
            private val optimizerType: JsonField<OptimizerType> = JsonMissing.of(),
            @JsonProperty("weight_decay")
            @ExcludeMissing
            private val weightDecay: JsonField<Double> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun lr(): Double = lr.getRequired("lr")

            fun numWarmupSteps(): Long = numWarmupSteps.getRequired("num_warmup_steps")

            fun optimizerType(): OptimizerType = optimizerType.getRequired("optimizer_type")

            fun weightDecay(): Double = weightDecay.getRequired("weight_decay")

            @JsonProperty("lr") @ExcludeMissing fun _lr(): JsonField<Double> = lr

            @JsonProperty("num_warmup_steps")
            @ExcludeMissing
            fun _numWarmupSteps(): JsonField<Long> = numWarmupSteps

            @JsonProperty("optimizer_type")
            @ExcludeMissing
            fun _optimizerType(): JsonField<OptimizerType> = optimizerType

            @JsonProperty("weight_decay")
            @ExcludeMissing
            fun _weightDecay(): JsonField<Double> = weightDecay

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): OptimizerConfig = apply {
                if (validated) {
                    return@apply
                }

                lr()
                numWarmupSteps()
                optimizerType()
                weightDecay()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            /** A builder for [OptimizerConfig]. */
            class Builder internal constructor() {

                private var lr: JsonField<Double>? = null
                private var numWarmupSteps: JsonField<Long>? = null
                private var optimizerType: JsonField<OptimizerType>? = null
                private var weightDecay: JsonField<Double>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(optimizerConfig: OptimizerConfig) = apply {
                    lr = optimizerConfig.lr
                    numWarmupSteps = optimizerConfig.numWarmupSteps
                    optimizerType = optimizerConfig.optimizerType
                    weightDecay = optimizerConfig.weightDecay
                    additionalProperties = optimizerConfig.additionalProperties.toMutableMap()
                }

                fun lr(lr: Double) = lr(JsonField.of(lr))

                fun lr(lr: JsonField<Double>) = apply { this.lr = lr }

                fun numWarmupSteps(numWarmupSteps: Long) =
                    numWarmupSteps(JsonField.of(numWarmupSteps))

                fun numWarmupSteps(numWarmupSteps: JsonField<Long>) = apply {
                    this.numWarmupSteps = numWarmupSteps
                }

                fun optimizerType(optimizerType: OptimizerType) =
                    optimizerType(JsonField.of(optimizerType))

                fun optimizerType(optimizerType: JsonField<OptimizerType>) = apply {
                    this.optimizerType = optimizerType
                }

                fun weightDecay(weightDecay: Double) = weightDecay(JsonField.of(weightDecay))

                fun weightDecay(weightDecay: JsonField<Double>) = apply {
                    this.weightDecay = weightDecay
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

                fun build(): OptimizerConfig =
                    OptimizerConfig(
                        checkRequired("lr", lr),
                        checkRequired("numWarmupSteps", numWarmupSteps),
                        checkRequired("optimizerType", optimizerType),
                        checkRequired("weightDecay", weightDecay),
                        additionalProperties.toImmutable(),
                    )
            }

            class OptimizerType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val ADAM = of("adam")

                    val ADAMW = of("adamw")

                    val SGD = of("sgd")

                    fun of(value: String) = OptimizerType(JsonField.of(value))
                }

                /** An enum containing [OptimizerType]'s known values. */
                enum class Known {
                    ADAM,
                    ADAMW,
                    SGD,
                }

                /**
                 * An enum containing [OptimizerType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [OptimizerType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ADAM,
                    ADAMW,
                    SGD,
                    /**
                     * An enum member indicating that [OptimizerType] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ADAM -> Value.ADAM
                        ADAMW -> Value.ADAMW
                        SGD -> Value.SGD
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LlamaStackClientInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        ADAM -> Known.ADAM
                        ADAMW -> Known.ADAMW
                        SGD -> Known.SGD
                        else ->
                            throw LlamaStackClientInvalidDataException(
                                "Unknown OptimizerType: $value"
                            )
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is OptimizerType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is OptimizerConfig && lr == other.lr && numWarmupSteps == other.numWarmupSteps && optimizerType == other.optimizerType && weightDecay == other.weightDecay && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(lr, numWarmupSteps, optimizerType, weightDecay, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "OptimizerConfig{lr=$lr, numWarmupSteps=$numWarmupSteps, optimizerType=$optimizerType, weightDecay=$weightDecay, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class EfficiencyConfig
        @JsonCreator
        private constructor(
            @JsonProperty("enable_activation_checkpointing")
            @ExcludeMissing
            private val enableActivationCheckpointing: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("enable_activation_offloading")
            @ExcludeMissing
            private val enableActivationOffloading: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("fsdp_cpu_offload")
            @ExcludeMissing
            private val fsdpCpuOffload: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("memory_efficient_fsdp_wrap")
            @ExcludeMissing
            private val memoryEfficientFsdpWrap: JsonField<Boolean> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun enableActivationCheckpointing(): Boolean? =
                enableActivationCheckpointing.getNullable("enable_activation_checkpointing")

            fun enableActivationOffloading(): Boolean? =
                enableActivationOffloading.getNullable("enable_activation_offloading")

            fun fsdpCpuOffload(): Boolean? = fsdpCpuOffload.getNullable("fsdp_cpu_offload")

            fun memoryEfficientFsdpWrap(): Boolean? =
                memoryEfficientFsdpWrap.getNullable("memory_efficient_fsdp_wrap")

            @JsonProperty("enable_activation_checkpointing")
            @ExcludeMissing
            fun _enableActivationCheckpointing(): JsonField<Boolean> = enableActivationCheckpointing

            @JsonProperty("enable_activation_offloading")
            @ExcludeMissing
            fun _enableActivationOffloading(): JsonField<Boolean> = enableActivationOffloading

            @JsonProperty("fsdp_cpu_offload")
            @ExcludeMissing
            fun _fsdpCpuOffload(): JsonField<Boolean> = fsdpCpuOffload

            @JsonProperty("memory_efficient_fsdp_wrap")
            @ExcludeMissing
            fun _memoryEfficientFsdpWrap(): JsonField<Boolean> = memoryEfficientFsdpWrap

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): EfficiencyConfig = apply {
                if (validated) {
                    return@apply
                }

                enableActivationCheckpointing()
                enableActivationOffloading()
                fsdpCpuOffload()
                memoryEfficientFsdpWrap()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            /** A builder for [EfficiencyConfig]. */
            class Builder internal constructor() {

                private var enableActivationCheckpointing: JsonField<Boolean> = JsonMissing.of()
                private var enableActivationOffloading: JsonField<Boolean> = JsonMissing.of()
                private var fsdpCpuOffload: JsonField<Boolean> = JsonMissing.of()
                private var memoryEfficientFsdpWrap: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(efficiencyConfig: EfficiencyConfig) = apply {
                    enableActivationCheckpointing = efficiencyConfig.enableActivationCheckpointing
                    enableActivationOffloading = efficiencyConfig.enableActivationOffloading
                    fsdpCpuOffload = efficiencyConfig.fsdpCpuOffload
                    memoryEfficientFsdpWrap = efficiencyConfig.memoryEfficientFsdpWrap
                    additionalProperties = efficiencyConfig.additionalProperties.toMutableMap()
                }

                fun enableActivationCheckpointing(enableActivationCheckpointing: Boolean) =
                    enableActivationCheckpointing(JsonField.of(enableActivationCheckpointing))

                fun enableActivationCheckpointing(
                    enableActivationCheckpointing: JsonField<Boolean>
                ) = apply { this.enableActivationCheckpointing = enableActivationCheckpointing }

                fun enableActivationOffloading(enableActivationOffloading: Boolean) =
                    enableActivationOffloading(JsonField.of(enableActivationOffloading))

                fun enableActivationOffloading(enableActivationOffloading: JsonField<Boolean>) =
                    apply {
                        this.enableActivationOffloading = enableActivationOffloading
                    }

                fun fsdpCpuOffload(fsdpCpuOffload: Boolean) =
                    fsdpCpuOffload(JsonField.of(fsdpCpuOffload))

                fun fsdpCpuOffload(fsdpCpuOffload: JsonField<Boolean>) = apply {
                    this.fsdpCpuOffload = fsdpCpuOffload
                }

                fun memoryEfficientFsdpWrap(memoryEfficientFsdpWrap: Boolean) =
                    memoryEfficientFsdpWrap(JsonField.of(memoryEfficientFsdpWrap))

                fun memoryEfficientFsdpWrap(memoryEfficientFsdpWrap: JsonField<Boolean>) = apply {
                    this.memoryEfficientFsdpWrap = memoryEfficientFsdpWrap
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

                fun build(): EfficiencyConfig =
                    EfficiencyConfig(
                        enableActivationCheckpointing,
                        enableActivationOffloading,
                        fsdpCpuOffload,
                        memoryEfficientFsdpWrap,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is EfficiencyConfig && enableActivationCheckpointing == other.enableActivationCheckpointing && enableActivationOffloading == other.enableActivationOffloading && fsdpCpuOffload == other.fsdpCpuOffload && memoryEfficientFsdpWrap == other.memoryEfficientFsdpWrap && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(enableActivationCheckpointing, enableActivationOffloading, fsdpCpuOffload, memoryEfficientFsdpWrap, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "EfficiencyConfig{enableActivationCheckpointing=$enableActivationCheckpointing, enableActivationOffloading=$enableActivationOffloading, fsdpCpuOffload=$fsdpCpuOffload, memoryEfficientFsdpWrap=$memoryEfficientFsdpWrap, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TrainingConfig && dataConfig == other.dataConfig && gradientAccumulationSteps == other.gradientAccumulationSteps && maxStepsPerEpoch == other.maxStepsPerEpoch && maxValidationSteps == other.maxValidationSteps && nEpochs == other.nEpochs && optimizerConfig == other.optimizerConfig && dtype == other.dtype && efficiencyConfig == other.efficiencyConfig && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(dataConfig, gradientAccumulationSteps, maxStepsPerEpoch, maxValidationSteps, nEpochs, optimizerConfig, dtype, efficiencyConfig, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TrainingConfig{dataConfig=$dataConfig, gradientAccumulationSteps=$gradientAccumulationSteps, maxStepsPerEpoch=$maxStepsPerEpoch, maxValidationSteps=$maxValidationSteps, nEpochs=$nEpochs, optimizerConfig=$optimizerConfig, dtype=$dtype, efficiencyConfig=$efficiencyConfig, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PostTrainingSupervisedFineTuneParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "PostTrainingSupervisedFineTuneParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
