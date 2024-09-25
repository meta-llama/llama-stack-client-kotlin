// File generated from our OpenAPI spec by Stainless.

package com.llama_stack_client.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.llama_stack_client.api.core.ExcludeMissing
import com.llama_stack_client.api.core.JsonField
import com.llama_stack_client.api.core.JsonMissing
import com.llama_stack_client.api.core.JsonValue
import com.llama_stack_client.api.core.NoAutoDetect
import com.llama_stack_client.api.core.toUnmodifiable
import java.util.Objects

@JsonDeserialize(builder = ModelServingSpec.Builder::class)
@NoAutoDetect
class ModelServingSpec
private constructor(
    private val llamaModel: JsonValue,
    private val providerConfig: JsonField<ProviderConfig>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun providerConfig(): ProviderConfig = providerConfig.getRequired("provider_config")

    /**
     * The model family and SKU of the model along with other parameters corresponding to the model.
     */
    @JsonProperty("llama_model") @ExcludeMissing fun _llamaModel() = llamaModel

    @JsonProperty("provider_config") @ExcludeMissing fun _providerConfig() = providerConfig

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ModelServingSpec = apply {
        if (!validated) {
            providerConfig().validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ModelServingSpec &&
            this.llamaModel == other.llamaModel &&
            this.providerConfig == other.providerConfig &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    llamaModel,
                    providerConfig,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "ModelServingSpec{llamaModel=$llamaModel, providerConfig=$providerConfig, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var llamaModel: JsonValue = JsonMissing.of()
        private var providerConfig: JsonField<ProviderConfig> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(modelServingSpec: ModelServingSpec) = apply {
            this.llamaModel = modelServingSpec.llamaModel
            this.providerConfig = modelServingSpec.providerConfig
            additionalProperties(modelServingSpec.additionalProperties)
        }

        /**
         * The model family and SKU of the model along with other parameters corresponding to the
         * model.
         */
        @JsonProperty("llama_model")
        @ExcludeMissing
        fun llamaModel(llamaModel: JsonValue) = apply { this.llamaModel = llamaModel }

        fun providerConfig(providerConfig: ProviderConfig) =
            providerConfig(JsonField.of(providerConfig))

        @JsonProperty("provider_config")
        @ExcludeMissing
        fun providerConfig(providerConfig: JsonField<ProviderConfig>) = apply {
            this.providerConfig = providerConfig
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

        fun build(): ModelServingSpec =
            ModelServingSpec(
                llamaModel,
                providerConfig,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = ProviderConfig.Builder::class)
    @NoAutoDetect
    class ProviderConfig
    private constructor(
        private val config: JsonField<Config>,
        private val providerId: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun config(): Config = config.getRequired("config")

        fun providerId(): String = providerId.getRequired("provider_id")

        @JsonProperty("config") @ExcludeMissing fun _config() = config

        @JsonProperty("provider_id") @ExcludeMissing fun _providerId() = providerId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): ProviderConfig = apply {
            if (!validated) {
                config().validate()
                providerId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ProviderConfig &&
                this.config == other.config &&
                this.providerId == other.providerId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        config,
                        providerId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "ProviderConfig{config=$config, providerId=$providerId, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var config: JsonField<Config> = JsonMissing.of()
            private var providerId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(providerConfig: ProviderConfig) = apply {
                this.config = providerConfig.config
                this.providerId = providerConfig.providerId
                additionalProperties(providerConfig.additionalProperties)
            }

            fun config(config: Config) = config(JsonField.of(config))

            @JsonProperty("config")
            @ExcludeMissing
            fun config(config: JsonField<Config>) = apply { this.config = config }

            fun providerId(providerId: String) = providerId(JsonField.of(providerId))

            @JsonProperty("provider_id")
            @ExcludeMissing
            fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

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

            fun build(): ProviderConfig =
                ProviderConfig(
                    config,
                    providerId,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = Config.Builder::class)
        @NoAutoDetect
        class Config
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Config = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Config && this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(additionalProperties)
                }
                return hashCode
            }

            override fun toString() = "Config{additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(config: Config) = apply {
                    additionalProperties(config.additionalProperties)
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

                fun build(): Config = Config(additionalProperties.toUnmodifiable())
            }
        }
    }
}
