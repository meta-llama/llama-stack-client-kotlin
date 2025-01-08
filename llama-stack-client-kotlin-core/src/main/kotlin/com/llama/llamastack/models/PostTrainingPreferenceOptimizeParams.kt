// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.llama.llamastack.core.Enum
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

class PostTrainingPreferenceOptimizeParams
constructor(
    private val xLlamaStackProviderData: String?,
    private val body: PostTrainingPreferenceOptimizeBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun xLlamaStackProviderData(): String? = xLlamaStackProviderData

    fun algorithmConfig(): AlgorithmConfig = body.algorithmConfig()

    fun finetunedModel(): String = body.finetunedModel()

    fun hyperparamSearchConfig(): HyperparamSearchConfig = body.hyperparamSearchConfig()

    fun jobUuid(): String = body.jobUuid()

    fun loggerConfig(): LoggerConfig = body.loggerConfig()

    fun trainingConfig(): TrainingConfig = body.trainingConfig()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    internal fun getBody(): PostTrainingPreferenceOptimizeBody = body

    internal fun getHeaders(): Headers {
        val headers = Headers.builder()
        this.xLlamaStackProviderData?.let {
            headers.put("X-LlamaStack-ProviderData", listOf(it.toString()))
        }
        headers.putAll(additionalHeaders)
        return headers.build()
    }

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class PostTrainingPreferenceOptimizeBody
    @JsonCreator
    internal constructor(
        @JsonProperty("algorithm_config") private val algorithmConfig: AlgorithmConfig,
        @JsonProperty("finetuned_model") private val finetunedModel: String,
        @JsonProperty("hyperparam_search_config")
        private val hyperparamSearchConfig: HyperparamSearchConfig,
        @JsonProperty("job_uuid") private val jobUuid: String,
        @JsonProperty("logger_config") private val loggerConfig: LoggerConfig,
        @JsonProperty("training_config") private val trainingConfig: TrainingConfig,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("algorithm_config") fun algorithmConfig(): AlgorithmConfig = algorithmConfig

        @JsonProperty("finetuned_model") fun finetunedModel(): String = finetunedModel

        @JsonProperty("hyperparam_search_config")
        fun hyperparamSearchConfig(): HyperparamSearchConfig = hyperparamSearchConfig

        @JsonProperty("job_uuid") fun jobUuid(): String = jobUuid

        @JsonProperty("logger_config") fun loggerConfig(): LoggerConfig = loggerConfig

        @JsonProperty("training_config") fun trainingConfig(): TrainingConfig = trainingConfig

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var algorithmConfig: AlgorithmConfig? = null
            private var finetunedModel: String? = null
            private var hyperparamSearchConfig: HyperparamSearchConfig? = null
            private var jobUuid: String? = null
            private var loggerConfig: LoggerConfig? = null
            private var trainingConfig: TrainingConfig? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                postTrainingPreferenceOptimizeBody: PostTrainingPreferenceOptimizeBody
            ) = apply {
                algorithmConfig = postTrainingPreferenceOptimizeBody.algorithmConfig
                finetunedModel = postTrainingPreferenceOptimizeBody.finetunedModel
                hyperparamSearchConfig = postTrainingPreferenceOptimizeBody.hyperparamSearchConfig
                jobUuid = postTrainingPreferenceOptimizeBody.jobUuid
                loggerConfig = postTrainingPreferenceOptimizeBody.loggerConfig
                trainingConfig = postTrainingPreferenceOptimizeBody.trainingConfig
                additionalProperties =
                    postTrainingPreferenceOptimizeBody.additionalProperties.toMutableMap()
            }

            fun algorithmConfig(algorithmConfig: AlgorithmConfig) = apply {
                this.algorithmConfig = algorithmConfig
            }

            fun finetunedModel(finetunedModel: String) = apply {
                this.finetunedModel = finetunedModel
            }

            fun hyperparamSearchConfig(hyperparamSearchConfig: HyperparamSearchConfig) = apply {
                this.hyperparamSearchConfig = hyperparamSearchConfig
            }

            fun jobUuid(jobUuid: String) = apply { this.jobUuid = jobUuid }

            fun loggerConfig(loggerConfig: LoggerConfig) = apply {
                this.loggerConfig = loggerConfig
            }

            fun trainingConfig(trainingConfig: TrainingConfig) = apply {
                this.trainingConfig = trainingConfig
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

            fun build(): PostTrainingPreferenceOptimizeBody =
                PostTrainingPreferenceOptimizeBody(
                    checkNotNull(algorithmConfig) {
                        "`algorithmConfig` is required but was not set"
                    },
                    checkNotNull(finetunedModel) { "`finetunedModel` is required but was not set" },
                    checkNotNull(hyperparamSearchConfig) {
                        "`hyperparamSearchConfig` is required but was not set"
                    },
                    checkNotNull(jobUuid) { "`jobUuid` is required but was not set" },
                    checkNotNull(loggerConfig) { "`loggerConfig` is required but was not set" },
                    checkNotNull(trainingConfig) { "`trainingConfig` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PostTrainingPreferenceOptimizeBody && algorithmConfig == other.algorithmConfig && finetunedModel == other.finetunedModel && hyperparamSearchConfig == other.hyperparamSearchConfig && jobUuid == other.jobUuid && loggerConfig == other.loggerConfig && trainingConfig == other.trainingConfig && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(algorithmConfig, finetunedModel, hyperparamSearchConfig, jobUuid, loggerConfig, trainingConfig, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PostTrainingPreferenceOptimizeBody{algorithmConfig=$algorithmConfig, finetunedModel=$finetunedModel, hyperparamSearchConfig=$hyperparamSearchConfig, jobUuid=$jobUuid, loggerConfig=$loggerConfig, trainingConfig=$trainingConfig, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var xLlamaStackProviderData: String? = null
        private var body: PostTrainingPreferenceOptimizeBody.Builder =
            PostTrainingPreferenceOptimizeBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(
            postTrainingPreferenceOptimizeParams: PostTrainingPreferenceOptimizeParams
        ) = apply {
            xLlamaStackProviderData = postTrainingPreferenceOptimizeParams.xLlamaStackProviderData
            body = postTrainingPreferenceOptimizeParams.body.toBuilder()
            additionalHeaders = postTrainingPreferenceOptimizeParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                postTrainingPreferenceOptimizeParams.additionalQueryParams.toBuilder()
        }

        fun xLlamaStackProviderData(xLlamaStackProviderData: String) = apply {
            this.xLlamaStackProviderData = xLlamaStackProviderData
        }

        fun algorithmConfig(algorithmConfig: AlgorithmConfig) = apply {
            body.algorithmConfig(algorithmConfig)
        }

        fun finetunedModel(finetunedModel: String) = apply { body.finetunedModel(finetunedModel) }

        fun hyperparamSearchConfig(hyperparamSearchConfig: HyperparamSearchConfig) = apply {
            body.hyperparamSearchConfig(hyperparamSearchConfig)
        }

        fun jobUuid(jobUuid: String) = apply { body.jobUuid(jobUuid) }

        fun loggerConfig(loggerConfig: LoggerConfig) = apply { body.loggerConfig(loggerConfig) }

        fun trainingConfig(trainingConfig: TrainingConfig) = apply {
            body.trainingConfig(trainingConfig)
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

        fun build(): PostTrainingPreferenceOptimizeParams =
            PostTrainingPreferenceOptimizeParams(
                xLlamaStackProviderData,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class AlgorithmConfig
    @JsonCreator
    private constructor(
        @JsonProperty("epsilon") private val epsilon: Double,
        @JsonProperty("gamma") private val gamma: Double,
        @JsonProperty("reward_clip") private val rewardClip: Double,
        @JsonProperty("reward_scale") private val rewardScale: Double,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("epsilon") fun epsilon(): Double = epsilon

        @JsonProperty("gamma") fun gamma(): Double = gamma

        @JsonProperty("reward_clip") fun rewardClip(): Double = rewardClip

        @JsonProperty("reward_scale") fun rewardScale(): Double = rewardScale

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

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
                epsilon = algorithmConfig.epsilon
                gamma = algorithmConfig.gamma
                rewardClip = algorithmConfig.rewardClip
                rewardScale = algorithmConfig.rewardScale
                additionalProperties = algorithmConfig.additionalProperties.toMutableMap()
            }

            fun epsilon(epsilon: Double) = apply { this.epsilon = epsilon }

            fun gamma(gamma: Double) = apply { this.gamma = gamma }

            fun rewardClip(rewardClip: Double) = apply { this.rewardClip = rewardClip }

            fun rewardScale(rewardScale: Double) = apply { this.rewardScale = rewardScale }

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

            fun build(): AlgorithmConfig =
                AlgorithmConfig(
                    checkNotNull(epsilon) { "`epsilon` is required but was not set" },
                    checkNotNull(gamma) { "`gamma` is required but was not set" },
                    checkNotNull(rewardClip) { "`rewardClip` is required but was not set" },
                    checkNotNull(rewardScale) { "`rewardScale` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AlgorithmConfig && epsilon == other.epsilon && gamma == other.gamma && rewardClip == other.rewardClip && rewardScale == other.rewardScale && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(epsilon, gamma, rewardClip, rewardScale, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AlgorithmConfig{epsilon=$epsilon, gamma=$gamma, rewardClip=$rewardClip, rewardScale=$rewardScale, additionalProperties=$additionalProperties}"
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

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

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

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

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
        @JsonProperty("data_config") private val dataConfig: DataConfig,
        @JsonProperty("dtype") private val dtype: String?,
        @JsonProperty("efficiency_config") private val efficiencyConfig: EfficiencyConfig?,
        @JsonProperty("gradient_accumulation_steps") private val gradientAccumulationSteps: Long,
        @JsonProperty("max_steps_per_epoch") private val maxStepsPerEpoch: Long,
        @JsonProperty("n_epochs") private val nEpochs: Long,
        @JsonProperty("optimizer_config") private val optimizerConfig: OptimizerConfig,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("data_config") fun dataConfig(): DataConfig = dataConfig

        @JsonProperty("dtype") fun dtype(): String? = dtype

        @JsonProperty("efficiency_config")
        fun efficiencyConfig(): EfficiencyConfig? = efficiencyConfig

        @JsonProperty("gradient_accumulation_steps")
        fun gradientAccumulationSteps(): Long = gradientAccumulationSteps

        @JsonProperty("max_steps_per_epoch") fun maxStepsPerEpoch(): Long = maxStepsPerEpoch

        @JsonProperty("n_epochs") fun nEpochs(): Long = nEpochs

        @JsonProperty("optimizer_config") fun optimizerConfig(): OptimizerConfig = optimizerConfig

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var dataConfig: DataConfig? = null
            private var dtype: String? = null
            private var efficiencyConfig: EfficiencyConfig? = null
            private var gradientAccumulationSteps: Long? = null
            private var maxStepsPerEpoch: Long? = null
            private var nEpochs: Long? = null
            private var optimizerConfig: OptimizerConfig? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(trainingConfig: TrainingConfig) = apply {
                dataConfig = trainingConfig.dataConfig
                dtype = trainingConfig.dtype
                efficiencyConfig = trainingConfig.efficiencyConfig
                gradientAccumulationSteps = trainingConfig.gradientAccumulationSteps
                maxStepsPerEpoch = trainingConfig.maxStepsPerEpoch
                nEpochs = trainingConfig.nEpochs
                optimizerConfig = trainingConfig.optimizerConfig
                additionalProperties = trainingConfig.additionalProperties.toMutableMap()
            }

            fun dataConfig(dataConfig: DataConfig) = apply { this.dataConfig = dataConfig }

            fun dtype(dtype: String) = apply { this.dtype = dtype }

            fun efficiencyConfig(efficiencyConfig: EfficiencyConfig) = apply {
                this.efficiencyConfig = efficiencyConfig
            }

            fun gradientAccumulationSteps(gradientAccumulationSteps: Long) = apply {
                this.gradientAccumulationSteps = gradientAccumulationSteps
            }

            fun maxStepsPerEpoch(maxStepsPerEpoch: Long) = apply {
                this.maxStepsPerEpoch = maxStepsPerEpoch
            }

            fun nEpochs(nEpochs: Long) = apply { this.nEpochs = nEpochs }

            fun optimizerConfig(optimizerConfig: OptimizerConfig) = apply {
                this.optimizerConfig = optimizerConfig
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
                    checkNotNull(dataConfig) { "`dataConfig` is required but was not set" },
                    dtype,
                    efficiencyConfig,
                    checkNotNull(gradientAccumulationSteps) {
                        "`gradientAccumulationSteps` is required but was not set"
                    },
                    checkNotNull(maxStepsPerEpoch) {
                        "`maxStepsPerEpoch` is required but was not set"
                    },
                    checkNotNull(nEpochs) { "`nEpochs` is required but was not set" },
                    checkNotNull(optimizerConfig) {
                        "`optimizerConfig` is required but was not set"
                    },
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class DataConfig
        @JsonCreator
        private constructor(
            @JsonProperty("batch_size") private val batchSize: Long,
            @JsonProperty("dataset_id") private val datasetId: String,
            @JsonProperty("packed") private val packed: Boolean?,
            @JsonProperty("shuffle") private val shuffle: Boolean,
            @JsonProperty("train_on_input") private val trainOnInput: Boolean?,
            @JsonProperty("validation_dataset_id") private val validationDatasetId: String?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonProperty("batch_size") fun batchSize(): Long = batchSize

            @JsonProperty("dataset_id") fun datasetId(): String = datasetId

            @JsonProperty("packed") fun packed(): Boolean? = packed

            @JsonProperty("shuffle") fun shuffle(): Boolean = shuffle

            @JsonProperty("train_on_input") fun trainOnInput(): Boolean? = trainOnInput

            @JsonProperty("validation_dataset_id")
            fun validationDatasetId(): String? = validationDatasetId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var batchSize: Long? = null
                private var datasetId: String? = null
                private var packed: Boolean? = null
                private var shuffle: Boolean? = null
                private var trainOnInput: Boolean? = null
                private var validationDatasetId: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(dataConfig: DataConfig) = apply {
                    batchSize = dataConfig.batchSize
                    datasetId = dataConfig.datasetId
                    packed = dataConfig.packed
                    shuffle = dataConfig.shuffle
                    trainOnInput = dataConfig.trainOnInput
                    validationDatasetId = dataConfig.validationDatasetId
                    additionalProperties = dataConfig.additionalProperties.toMutableMap()
                }

                fun batchSize(batchSize: Long) = apply { this.batchSize = batchSize }

                fun datasetId(datasetId: String) = apply { this.datasetId = datasetId }

                fun packed(packed: Boolean) = apply { this.packed = packed }

                fun shuffle(shuffle: Boolean) = apply { this.shuffle = shuffle }

                fun trainOnInput(trainOnInput: Boolean) = apply { this.trainOnInput = trainOnInput }

                fun validationDatasetId(validationDatasetId: String) = apply {
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
                        checkNotNull(batchSize) { "`batchSize` is required but was not set" },
                        checkNotNull(datasetId) { "`datasetId` is required but was not set" },
                        packed,
                        checkNotNull(shuffle) { "`shuffle` is required but was not set" },
                        trainOnInput,
                        validationDatasetId,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DataConfig && batchSize == other.batchSize && datasetId == other.datasetId && packed == other.packed && shuffle == other.shuffle && trainOnInput == other.trainOnInput && validationDatasetId == other.validationDatasetId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(batchSize, datasetId, packed, shuffle, trainOnInput, validationDatasetId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DataConfig{batchSize=$batchSize, datasetId=$datasetId, packed=$packed, shuffle=$shuffle, trainOnInput=$trainOnInput, validationDatasetId=$validationDatasetId, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class OptimizerConfig
        @JsonCreator
        private constructor(
            @JsonProperty("lr") private val lr: Double,
            @JsonProperty("num_warmup_steps") private val numWarmupSteps: Long,
            @JsonProperty("optimizer_type") private val optimizerType: OptimizerType,
            @JsonProperty("weight_decay") private val weightDecay: Double,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonProperty("lr") fun lr(): Double = lr

            @JsonProperty("num_warmup_steps") fun numWarmupSteps(): Long = numWarmupSteps

            @JsonProperty("optimizer_type") fun optimizerType(): OptimizerType = optimizerType

            @JsonProperty("weight_decay") fun weightDecay(): Double = weightDecay

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var lr: Double? = null
                private var numWarmupSteps: Long? = null
                private var optimizerType: OptimizerType? = null
                private var weightDecay: Double? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(optimizerConfig: OptimizerConfig) = apply {
                    lr = optimizerConfig.lr
                    numWarmupSteps = optimizerConfig.numWarmupSteps
                    optimizerType = optimizerConfig.optimizerType
                    weightDecay = optimizerConfig.weightDecay
                    additionalProperties = optimizerConfig.additionalProperties.toMutableMap()
                }

                fun lr(lr: Double) = apply { this.lr = lr }

                fun numWarmupSteps(numWarmupSteps: Long) = apply {
                    this.numWarmupSteps = numWarmupSteps
                }

                fun optimizerType(optimizerType: OptimizerType) = apply {
                    this.optimizerType = optimizerType
                }

                fun weightDecay(weightDecay: Double) = apply { this.weightDecay = weightDecay }

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
                        checkNotNull(lr) { "`lr` is required but was not set" },
                        checkNotNull(numWarmupSteps) {
                            "`numWarmupSteps` is required but was not set"
                        },
                        checkNotNull(optimizerType) {
                            "`optimizerType` is required but was not set"
                        },
                        checkNotNull(weightDecay) { "`weightDecay` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class OptimizerType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val ADAM = of("adam")

                    val ADAMW = of("adamw")

                    val SGD = of("sgd")

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
            private val enableActivationCheckpointing: Boolean?,
            @JsonProperty("enable_activation_offloading")
            private val enableActivationOffloading: Boolean?,
            @JsonProperty("fsdp_cpu_offload") private val fsdpCpuOffload: Boolean?,
            @JsonProperty("memory_efficient_fsdp_wrap")
            private val memoryEfficientFsdpWrap: Boolean?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonProperty("enable_activation_checkpointing")
            fun enableActivationCheckpointing(): Boolean? = enableActivationCheckpointing

            @JsonProperty("enable_activation_offloading")
            fun enableActivationOffloading(): Boolean? = enableActivationOffloading

            @JsonProperty("fsdp_cpu_offload") fun fsdpCpuOffload(): Boolean? = fsdpCpuOffload

            @JsonProperty("memory_efficient_fsdp_wrap")
            fun memoryEfficientFsdpWrap(): Boolean? = memoryEfficientFsdpWrap

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var enableActivationCheckpointing: Boolean? = null
                private var enableActivationOffloading: Boolean? = null
                private var fsdpCpuOffload: Boolean? = null
                private var memoryEfficientFsdpWrap: Boolean? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(efficiencyConfig: EfficiencyConfig) = apply {
                    enableActivationCheckpointing = efficiencyConfig.enableActivationCheckpointing
                    enableActivationOffloading = efficiencyConfig.enableActivationOffloading
                    fsdpCpuOffload = efficiencyConfig.fsdpCpuOffload
                    memoryEfficientFsdpWrap = efficiencyConfig.memoryEfficientFsdpWrap
                    additionalProperties = efficiencyConfig.additionalProperties.toMutableMap()
                }

                fun enableActivationCheckpointing(enableActivationCheckpointing: Boolean) = apply {
                    this.enableActivationCheckpointing = enableActivationCheckpointing
                }

                fun enableActivationOffloading(enableActivationOffloading: Boolean) = apply {
                    this.enableActivationOffloading = enableActivationOffloading
                }

                fun fsdpCpuOffload(fsdpCpuOffload: Boolean) = apply {
                    this.fsdpCpuOffload = fsdpCpuOffload
                }

                fun memoryEfficientFsdpWrap(memoryEfficientFsdpWrap: Boolean) = apply {
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

            return /* spotless:off */ other is TrainingConfig && dataConfig == other.dataConfig && dtype == other.dtype && efficiencyConfig == other.efficiencyConfig && gradientAccumulationSteps == other.gradientAccumulationSteps && maxStepsPerEpoch == other.maxStepsPerEpoch && nEpochs == other.nEpochs && optimizerConfig == other.optimizerConfig && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(dataConfig, dtype, efficiencyConfig, gradientAccumulationSteps, maxStepsPerEpoch, nEpochs, optimizerConfig, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TrainingConfig{dataConfig=$dataConfig, dtype=$dtype, efficiencyConfig=$efficiencyConfig, gradientAccumulationSteps=$gradientAccumulationSteps, maxStepsPerEpoch=$maxStepsPerEpoch, nEpochs=$nEpochs, optimizerConfig=$optimizerConfig, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PostTrainingPreferenceOptimizeParams && xLlamaStackProviderData == other.xLlamaStackProviderData && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(xLlamaStackProviderData, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "PostTrainingPreferenceOptimizeParams{xLlamaStackProviderData=$xLlamaStackProviderData, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
