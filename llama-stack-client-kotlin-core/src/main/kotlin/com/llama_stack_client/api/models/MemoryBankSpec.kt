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
import com.llama_stack_client.api.core.JsonMissing
import com.llama_stack_client.api.core.JsonValue
import com.llama_stack_client.api.core.NoAutoDetect
import com.llama_stack_client.api.core.toUnmodifiable
import com.llama_stack_client.api.errors.LlamaStackClientInvalidDataException
import java.util.Objects

@JsonDeserialize(builder = MemoryBankSpec.Builder::class)
@NoAutoDetect
class MemoryBankSpec
private constructor(
    private val bankType: JsonField<BankType>,
    private val providerConfig: JsonField<ProviderConfig>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun bankType(): BankType = bankType.getRequired("bank_type")

    fun providerConfig(): ProviderConfig = providerConfig.getRequired("provider_config")

    @JsonProperty("bank_type") @ExcludeMissing fun _bankType() = bankType

    @JsonProperty("provider_config") @ExcludeMissing fun _providerConfig() = providerConfig

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): MemoryBankSpec = apply {
        if (!validated) {
            bankType()
            providerConfig().validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MemoryBankSpec &&
            this.bankType == other.bankType &&
            this.providerConfig == other.providerConfig &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    bankType,
                    providerConfig,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "MemoryBankSpec{bankType=$bankType, providerConfig=$providerConfig, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var bankType: JsonField<BankType> = JsonMissing.of()
        private var providerConfig: JsonField<ProviderConfig> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(memoryBankSpec: MemoryBankSpec) = apply {
            this.bankType = memoryBankSpec.bankType
            this.providerConfig = memoryBankSpec.providerConfig
            additionalProperties(memoryBankSpec.additionalProperties)
        }

        fun bankType(bankType: BankType) = bankType(JsonField.of(bankType))

        @JsonProperty("bank_type")
        @ExcludeMissing
        fun bankType(bankType: JsonField<BankType>) = apply { this.bankType = bankType }

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

        fun build(): MemoryBankSpec =
            MemoryBankSpec(
                bankType,
                providerConfig,
                additionalProperties.toUnmodifiable(),
            )
    }

    class BankType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BankType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val VECTOR = BankType(JsonField.of("vector"))

            val KEYVALUE = BankType(JsonField.of("keyvalue"))

            val KEYWORD = BankType(JsonField.of("keyword"))

            val GRAPH = BankType(JsonField.of("graph"))

            fun of(value: String) = BankType(JsonField.of(value))
        }

        enum class Known {
            VECTOR,
            KEYVALUE,
            KEYWORD,
            GRAPH,
        }

        enum class Value {
            VECTOR,
            KEYVALUE,
            KEYWORD,
            GRAPH,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                VECTOR -> Value.VECTOR
                KEYVALUE -> Value.KEYVALUE
                KEYWORD -> Value.KEYWORD
                GRAPH -> Value.GRAPH
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                VECTOR -> Known.VECTOR
                KEYVALUE -> Known.KEYVALUE
                KEYWORD -> Known.KEYWORD
                GRAPH -> Known.GRAPH
                else -> throw LlamaStackClientInvalidDataException("Unknown BankType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
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
