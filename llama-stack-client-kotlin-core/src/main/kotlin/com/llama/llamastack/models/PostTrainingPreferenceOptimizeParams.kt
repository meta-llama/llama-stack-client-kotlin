// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.llama.llamastack.core.Enum
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import com.llama.llamastack.models.*
import java.util.Objects

class PostTrainingPreferenceOptimizeParams
constructor(
    private val algorithm: Algorithm,
    private val algorithmConfig: AlgorithmConfig,
    private val datasetId: String,
    private val finetunedModel: String,
    private val hyperparamSearchConfig: HyperparamSearchConfig,
    private val jobUuid: String,
    private val loggerConfig: LoggerConfig,
    private val optimizerConfig: OptimizerConfig,
    private val trainingConfig: TrainingConfig,
    private val validationDatasetId: String,
    private val xLlamaStackProviderData: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun algorithm(): Algorithm = algorithm

    fun algorithmConfig(): AlgorithmConfig = algorithmConfig

    fun datasetId(): String = datasetId

    fun finetunedModel(): String = finetunedModel

    fun hyperparamSearchConfig(): HyperparamSearchConfig = hyperparamSearchConfig

    fun jobUuid(): String = jobUuid

    fun loggerConfig(): LoggerConfig = loggerConfig

    fun optimizerConfig(): OptimizerConfig = optimizerConfig

    fun trainingConfig(): TrainingConfig = trainingConfig

    fun validationDatasetId(): String = validationDatasetId

    fun xLlamaStackProviderData(): String? = xLlamaStackProviderData

    internal fun getBody(): PostTrainingPreferenceOptimizeBody {
        return PostTrainingPreferenceOptimizeBody(
            algorithm,
            algorithmConfig,
            datasetId,
            finetunedModel,
            hyperparamSearchConfig,
            jobUuid,
            loggerConfig,
            optimizerConfig,
            trainingConfig,
            validationDatasetId,
            additionalBodyProperties,
        )
    }

    internal fun getHeaders(): Headers {
        val headers = Headers.builder()
        this.xLlamaStackProviderData?.let {
            headers.put("X-LlamaStack-ProviderData", listOf(it.toString()))
        }
        headers.putAll(additionalHeaders)
        return headers.build()
    }

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = PostTrainingPreferenceOptimizeBody.Builder::class)
    @NoAutoDetect
    class PostTrainingPreferenceOptimizeBody
    internal constructor(
        private val algorithm: Algorithm?,
        private val algorithmConfig: AlgorithmConfig?,
        private val datasetId: String?,
        private val finetunedModel: String?,
        private val hyperparamSearchConfig: HyperparamSearchConfig?,
        private val jobUuid: String?,
        private val loggerConfig: LoggerConfig?,
        private val optimizerConfig: OptimizerConfig?,
        private val trainingConfig: TrainingConfig?,
        private val validationDatasetId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("algorithm") fun algorithm(): Algorithm? = algorithm

        @JsonProperty("algorithm_config") fun algorithmConfig(): AlgorithmConfig? = algorithmConfig

        @JsonProperty("dataset_id") fun datasetId(): String? = datasetId

        @JsonProperty("finetuned_model") fun finetunedModel(): String? = finetunedModel

        @JsonProperty("hyperparam_search_config")
        fun hyperparamSearchConfig(): HyperparamSearchConfig? = hyperparamSearchConfig

        @JsonProperty("job_uuid") fun jobUuid(): String? = jobUuid

        @JsonProperty("logger_config") fun loggerConfig(): LoggerConfig? = loggerConfig

        @JsonProperty("optimizer_config") fun optimizerConfig(): OptimizerConfig? = optimizerConfig

        @JsonProperty("training_config") fun trainingConfig(): TrainingConfig? = trainingConfig

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

            private var algorithm: Algorithm? = null
            private var algorithmConfig: AlgorithmConfig? = null
            private var datasetId: String? = null
            private var finetunedModel: String? = null
            private var hyperparamSearchConfig: HyperparamSearchConfig? = null
            private var jobUuid: String? = null
            private var loggerConfig: LoggerConfig? = null
            private var optimizerConfig: OptimizerConfig? = null
            private var trainingConfig: TrainingConfig? = null
            private var validationDatasetId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                postTrainingPreferenceOptimizeBody: PostTrainingPreferenceOptimizeBody
            ) = apply {
                this.algorithm = postTrainingPreferenceOptimizeBody.algorithm
                this.algorithmConfig = postTrainingPreferenceOptimizeBody.algorithmConfig
                this.datasetId = postTrainingPreferenceOptimizeBody.datasetId
                this.finetunedModel = postTrainingPreferenceOptimizeBody.finetunedModel
                this.hyperparamSearchConfig =
                    postTrainingPreferenceOptimizeBody.hyperparamSearchConfig
                this.jobUuid = postTrainingPreferenceOptimizeBody.jobUuid
                this.loggerConfig = postTrainingPreferenceOptimizeBody.loggerConfig
                this.optimizerConfig = postTrainingPreferenceOptimizeBody.optimizerConfig
                this.trainingConfig = postTrainingPreferenceOptimizeBody.trainingConfig
                this.validationDatasetId = postTrainingPreferenceOptimizeBody.validationDatasetId
                additionalProperties(postTrainingPreferenceOptimizeBody.additionalProperties)
            }

            @JsonProperty("algorithm")
            fun algorithm(algorithm: Algorithm) = apply { this.algorithm = algorithm }

            @JsonProperty("algorithm_config")
            fun algorithmConfig(algorithmConfig: AlgorithmConfig) = apply {
                this.algorithmConfig = algorithmConfig
            }

            @JsonProperty("dataset_id")
            fun datasetId(datasetId: String) = apply { this.datasetId = datasetId }

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

            @JsonProperty("validation_dataset_id")
            fun validationDatasetId(validationDatasetId: String) = apply {
                this.validationDatasetId = validationDatasetId
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
                    checkNotNull(datasetId) { "`datasetId` is required but was not set" },
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
                    checkNotNull(validationDatasetId) {
                        "`validationDatasetId` is required but was not set"
                    },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PostTrainingPreferenceOptimizeBody && algorithm == other.algorithm && algorithmConfig == other.algorithmConfig && datasetId == other.datasetId && finetunedModel == other.finetunedModel && hyperparamSearchConfig == other.hyperparamSearchConfig && jobUuid == other.jobUuid && loggerConfig == other.loggerConfig && optimizerConfig == other.optimizerConfig && trainingConfig == other.trainingConfig && validationDatasetId == other.validationDatasetId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(algorithm, algorithmConfig, datasetId, finetunedModel, hyperparamSearchConfig, jobUuid, loggerConfig, optimizerConfig, trainingConfig, validationDatasetId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PostTrainingPreferenceOptimizeBody{algorithm=$algorithm, algorithmConfig=$algorithmConfig, datasetId=$datasetId, finetunedModel=$finetunedModel, hyperparamSearchConfig=$hyperparamSearchConfig, jobUuid=$jobUuid, loggerConfig=$loggerConfig, optimizerConfig=$optimizerConfig, trainingConfig=$trainingConfig, validationDatasetId=$validationDatasetId, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PostTrainingPreferenceOptimizeParams && algorithm == other.algorithm && algorithmConfig == other.algorithmConfig && datasetId == other.datasetId && finetunedModel == other.finetunedModel && hyperparamSearchConfig == other.hyperparamSearchConfig && jobUuid == other.jobUuid && loggerConfig == other.loggerConfig && optimizerConfig == other.optimizerConfig && trainingConfig == other.trainingConfig && validationDatasetId == other.validationDatasetId && xLlamaStackProviderData == other.xLlamaStackProviderData && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(algorithm, algorithmConfig, datasetId, finetunedModel, hyperparamSearchConfig, jobUuid, loggerConfig, optimizerConfig, trainingConfig, validationDatasetId, xLlamaStackProviderData, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "PostTrainingPreferenceOptimizeParams{algorithm=$algorithm, algorithmConfig=$algorithmConfig, datasetId=$datasetId, finetunedModel=$finetunedModel, hyperparamSearchConfig=$hyperparamSearchConfig, jobUuid=$jobUuid, loggerConfig=$loggerConfig, optimizerConfig=$optimizerConfig, trainingConfig=$trainingConfig, validationDatasetId=$validationDatasetId, xLlamaStackProviderData=$xLlamaStackProviderData, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var algorithm: Algorithm? = null
        private var algorithmConfig: AlgorithmConfig? = null
        private var datasetId: String? = null
        private var finetunedModel: String? = null
        private var hyperparamSearchConfig: HyperparamSearchConfig? = null
        private var jobUuid: String? = null
        private var loggerConfig: LoggerConfig? = null
        private var optimizerConfig: OptimizerConfig? = null
        private var trainingConfig: TrainingConfig? = null
        private var validationDatasetId: String? = null
        private var xLlamaStackProviderData: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            postTrainingPreferenceOptimizeParams: PostTrainingPreferenceOptimizeParams
        ) = apply {
            this.algorithm = postTrainingPreferenceOptimizeParams.algorithm
            this.algorithmConfig = postTrainingPreferenceOptimizeParams.algorithmConfig
            this.datasetId = postTrainingPreferenceOptimizeParams.datasetId
            this.finetunedModel = postTrainingPreferenceOptimizeParams.finetunedModel
            this.hyperparamSearchConfig =
                postTrainingPreferenceOptimizeParams.hyperparamSearchConfig
            this.jobUuid = postTrainingPreferenceOptimizeParams.jobUuid
            this.loggerConfig = postTrainingPreferenceOptimizeParams.loggerConfig
            this.optimizerConfig = postTrainingPreferenceOptimizeParams.optimizerConfig
            this.trainingConfig = postTrainingPreferenceOptimizeParams.trainingConfig
            this.validationDatasetId = postTrainingPreferenceOptimizeParams.validationDatasetId
            this.xLlamaStackProviderData =
                postTrainingPreferenceOptimizeParams.xLlamaStackProviderData
            additionalHeaders(postTrainingPreferenceOptimizeParams.additionalHeaders)
            additionalQueryParams(postTrainingPreferenceOptimizeParams.additionalQueryParams)
            additionalBodyProperties(postTrainingPreferenceOptimizeParams.additionalBodyProperties)
        }

        fun algorithm(algorithm: Algorithm) = apply { this.algorithm = algorithm }

        fun algorithmConfig(algorithmConfig: AlgorithmConfig) = apply {
            this.algorithmConfig = algorithmConfig
        }

        fun datasetId(datasetId: String) = apply { this.datasetId = datasetId }

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

        fun validationDatasetId(validationDatasetId: String) = apply {
            this.validationDatasetId = validationDatasetId
        }

        fun xLlamaStackProviderData(xLlamaStackProviderData: String) = apply {
            this.xLlamaStackProviderData = xLlamaStackProviderData
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

        fun build(): PostTrainingPreferenceOptimizeParams =
            PostTrainingPreferenceOptimizeParams(
                checkNotNull(algorithm) { "`algorithm` is required but was not set" },
                checkNotNull(algorithmConfig) { "`algorithmConfig` is required but was not set" },
                checkNotNull(datasetId) { "`datasetId` is required but was not set" },
                checkNotNull(finetunedModel) { "`finetunedModel` is required but was not set" },
                checkNotNull(hyperparamSearchConfig) {
                    "`hyperparamSearchConfig` is required but was not set"
                },
                checkNotNull(jobUuid) { "`jobUuid` is required but was not set" },
                checkNotNull(loggerConfig) { "`loggerConfig` is required but was not set" },
                checkNotNull(optimizerConfig) { "`optimizerConfig` is required but was not set" },
                checkNotNull(trainingConfig) { "`trainingConfig` is required but was not set" },
                checkNotNull(validationDatasetId) {
                    "`validationDatasetId` is required but was not set"
                },
                xLlamaStackProviderData,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
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

            return /* spotless:off */ other is Algorithm && value == other.value /* spotless:on */
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

        @JsonProperty("epsilon") fun epsilon(): Double? = epsilon

        @JsonProperty("gamma") fun gamma(): Double? = gamma

        @JsonProperty("reward_clip") fun rewardClip(): Double? = rewardClip

        @JsonProperty("reward_scale") fun rewardScale(): Double? = rewardScale

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

    @JsonDeserialize(builder = HyperparamSearchConfig.Builder::class)
    @NoAutoDetect
    class HyperparamSearchConfig
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
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

    @JsonDeserialize(builder = LoggerConfig.Builder::class)
    @NoAutoDetect
    class LoggerConfig
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
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

        @JsonProperty("lr") fun lr(): Double? = lr

        @JsonProperty("lr_min") fun lrMin(): Double? = lrMin

        @JsonProperty("optimizer_type") fun optimizerType(): OptimizerType? = optimizerType

        @JsonProperty("weight_decay") fun weightDecay(): Double? = weightDecay

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

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
                    additionalProperties.toImmutable(),
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

                return /* spotless:off */ other is OptimizerType && value == other.value /* spotless:on */
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is OptimizerConfig && lr == other.lr && lrMin == other.lrMin && optimizerType == other.optimizerType && weightDecay == other.weightDecay && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(lr, lrMin, optimizerType, weightDecay, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "OptimizerConfig{lr=$lr, lrMin=$lrMin, optimizerType=$optimizerType, weightDecay=$weightDecay, additionalProperties=$additionalProperties}"
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
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TrainingConfig && batchSize == other.batchSize && enableActivationCheckpointing == other.enableActivationCheckpointing && fsdpCpuOffload == other.fsdpCpuOffload && memoryEfficientFsdpWrap == other.memoryEfficientFsdpWrap && nEpochs == other.nEpochs && nIters == other.nIters && shuffle == other.shuffle && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(batchSize, enableActivationCheckpointing, fsdpCpuOffload, memoryEfficientFsdpWrap, nEpochs, nIters, shuffle, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TrainingConfig{batchSize=$batchSize, enableActivationCheckpointing=$enableActivationCheckpointing, fsdpCpuOffload=$fsdpCpuOffload, memoryEfficientFsdpWrap=$memoryEfficientFsdpWrap, nEpochs=$nEpochs, nIters=$nIters, shuffle=$shuffle, additionalProperties=$additionalProperties}"
    }
}
