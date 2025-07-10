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
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Collections
import java.util.Objects

/** A model candidate for evaluation. */
@JsonDeserialize(using = EvalCandidate.Deserializer::class)
@JsonSerialize(using = EvalCandidate.Serializer::class)
class EvalCandidate
private constructor(
    private val model: Model? = null,
    private val agent: Agent? = null,
    private val _json: JsonValue? = null,
) {

    /** A model candidate for evaluation. */
    fun model(): Model? = model

    /** An agent candidate for evaluation. */
    fun agent(): Agent? = agent

    fun isModel(): Boolean = model != null

    fun isAgent(): Boolean = agent != null

    /** A model candidate for evaluation. */
    fun asModel(): Model = model.getOrThrow("model")

    /** An agent candidate for evaluation. */
    fun asAgent(): Agent = agent.getOrThrow("agent")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            model != null -> visitor.visitModel(model)
            agent != null -> visitor.visitAgent(agent)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): EvalCandidate = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitModel(model: Model) {
                    model.validate()
                }

                override fun visitAgent(agent: Agent) {
                    agent.validate()
                }
            }
        )
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LlamaStackClientInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitModel(model: Model) = model.validity()

                override fun visitAgent(agent: Agent) = agent.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EvalCandidate && model == other.model && agent == other.agent /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(model, agent) /* spotless:on */

    override fun toString(): String =
        when {
            model != null -> "EvalCandidate{model=$model}"
            agent != null -> "EvalCandidate{agent=$agent}"
            _json != null -> "EvalCandidate{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid EvalCandidate")
        }

    companion object {

        /** A model candidate for evaluation. */
        fun ofModel(model: Model) = EvalCandidate(model = model)

        /** An agent candidate for evaluation. */
        fun ofAgent(agent: Agent) = EvalCandidate(agent = agent)
    }

    /**
     * An interface that defines how to map each variant of [EvalCandidate] to a value of type [T].
     */
    interface Visitor<out T> {

        /** A model candidate for evaluation. */
        fun visitModel(model: Model): T

        /** An agent candidate for evaluation. */
        fun visitAgent(agent: Agent): T

        /**
         * Maps an unknown variant of [EvalCandidate] to a value of type [T].
         *
         * An instance of [EvalCandidate] can contain an unknown variant if it was deserialized from
         * data that doesn't match any known variant. For example, if the SDK is on an older version
         * than the API, then the API may respond with new variants that the SDK is unaware of.
         *
         * @throws LlamaStackClientInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LlamaStackClientInvalidDataException("Unknown EvalCandidate: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<EvalCandidate>(EvalCandidate::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): EvalCandidate {
            val json = JsonValue.fromJsonNode(node)
            val type = json.asObject()?.get("type")?.asString()

            when (type) {
                "model" -> {
                    return tryDeserialize(node, jacksonTypeRef<Model>())?.let {
                        EvalCandidate(model = it, _json = json)
                    } ?: EvalCandidate(_json = json)
                }
                "agent" -> {
                    return tryDeserialize(node, jacksonTypeRef<Agent>())?.let {
                        EvalCandidate(agent = it, _json = json)
                    } ?: EvalCandidate(_json = json)
                }
            }

            return EvalCandidate(_json = json)
        }
    }

    internal class Serializer : BaseSerializer<EvalCandidate>(EvalCandidate::class) {

        override fun serialize(
            value: EvalCandidate,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.model != null -> generator.writeObject(value.model)
                value.agent != null -> generator.writeObject(value.agent)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid EvalCandidate")
            }
        }
    }

    /** A model candidate for evaluation. */
    class Model
    private constructor(
        private val model: JsonField<String>,
        private val samplingParams: JsonField<SamplingParams>,
        private val type: JsonValue,
        private val systemMessage: JsonField<SystemMessage>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sampling_params")
            @ExcludeMissing
            samplingParams: JsonField<SamplingParams> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
            @JsonProperty("system_message")
            @ExcludeMissing
            systemMessage: JsonField<SystemMessage> = JsonMissing.of(),
        ) : this(model, samplingParams, type, systemMessage, mutableMapOf())

        /**
         * The model ID to evaluate.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun model(): String = model.getRequired("model")

        /**
         * The sampling parameters for the model.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun samplingParams(): SamplingParams = samplingParams.getRequired("sampling_params")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("model")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * (Optional) The system message providing instructions or context to the model.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun systemMessage(): SystemMessage? = systemMessage.getNullable("system_message")

        /**
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

        /**
         * Returns the raw JSON value of [samplingParams].
         *
         * Unlike [samplingParams], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sampling_params")
        @ExcludeMissing
        fun _samplingParams(): JsonField<SamplingParams> = samplingParams

        /**
         * Returns the raw JSON value of [systemMessage].
         *
         * Unlike [systemMessage], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("system_message")
        @ExcludeMissing
        fun _systemMessage(): JsonField<SystemMessage> = systemMessage

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Model].
             *
             * The following fields are required:
             * ```kotlin
             * .model()
             * .samplingParams()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Model]. */
        class Builder internal constructor() {

            private var model: JsonField<String>? = null
            private var samplingParams: JsonField<SamplingParams>? = null
            private var type: JsonValue = JsonValue.from("model")
            private var systemMessage: JsonField<SystemMessage> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(model: Model) = apply {
                this.model = model.model
                samplingParams = model.samplingParams
                type = model.type
                systemMessage = model.systemMessage
                additionalProperties = model.additionalProperties.toMutableMap()
            }

            /** The model ID to evaluate. */
            fun model(model: String) = model(JsonField.of(model))

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun model(model: JsonField<String>) = apply { this.model = model }

            /** The sampling parameters for the model. */
            fun samplingParams(samplingParams: SamplingParams) =
                samplingParams(JsonField.of(samplingParams))

            /**
             * Sets [Builder.samplingParams] to an arbitrary JSON value.
             *
             * You should usually call [Builder.samplingParams] with a well-typed [SamplingParams]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun samplingParams(samplingParams: JsonField<SamplingParams>) = apply {
                this.samplingParams = samplingParams
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("model")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonValue) = apply { this.type = type }

            /** (Optional) The system message providing instructions or context to the model. */
            fun systemMessage(systemMessage: SystemMessage) =
                systemMessage(JsonField.of(systemMessage))

            /**
             * Sets [Builder.systemMessage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.systemMessage] with a well-typed [SystemMessage]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun systemMessage(systemMessage: JsonField<SystemMessage>) = apply {
                this.systemMessage = systemMessage
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

            /**
             * Returns an immutable instance of [Model].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .model()
             * .samplingParams()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Model =
                Model(
                    checkRequired("model", model),
                    checkRequired("samplingParams", samplingParams),
                    type,
                    systemMessage,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Model = apply {
            if (validated) {
                return@apply
            }

            model()
            samplingParams().validate()
            _type().let {
                if (it != JsonValue.from("model")) {
                    throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
                }
            }
            systemMessage()?.validate()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaStackClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (model.asKnown() == null) 0 else 1) +
                (samplingParams.asKnown()?.validity() ?: 0) +
                type.let { if (it == JsonValue.from("model")) 1 else 0 } +
                (systemMessage.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Model && model == other.model && samplingParams == other.samplingParams && type == other.type && systemMessage == other.systemMessage && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(model, samplingParams, type, systemMessage, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Model{model=$model, samplingParams=$samplingParams, type=$type, systemMessage=$systemMessage, additionalProperties=$additionalProperties}"
    }

    /** An agent candidate for evaluation. */
    class Agent
    private constructor(
        private val config: JsonField<AgentConfig>,
        private val type: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("config")
            @ExcludeMissing
            config: JsonField<AgentConfig> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        ) : this(config, type, mutableMapOf())

        /**
         * The configuration for the agent candidate.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun config(): AgentConfig = config.getRequired("config")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("agent")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * Returns the raw JSON value of [config].
         *
         * Unlike [config], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("config") @ExcludeMissing fun _config(): JsonField<AgentConfig> = config

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Agent].
             *
             * The following fields are required:
             * ```kotlin
             * .config()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Agent]. */
        class Builder internal constructor() {

            private var config: JsonField<AgentConfig>? = null
            private var type: JsonValue = JsonValue.from("agent")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(agent: Agent) = apply {
                config = agent.config
                type = agent.type
                additionalProperties = agent.additionalProperties.toMutableMap()
            }

            /** The configuration for the agent candidate. */
            fun config(config: AgentConfig) = config(JsonField.of(config))

            /**
             * Sets [Builder.config] to an arbitrary JSON value.
             *
             * You should usually call [Builder.config] with a well-typed [AgentConfig] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun config(config: JsonField<AgentConfig>) = apply { this.config = config }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("agent")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonValue) = apply { this.type = type }

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

            /**
             * Returns an immutable instance of [Agent].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .config()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Agent =
                Agent(checkRequired("config", config), type, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Agent = apply {
            if (validated) {
                return@apply
            }

            config().validate()
            _type().let {
                if (it != JsonValue.from("agent")) {
                    throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
                }
            }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LlamaStackClientInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (config.asKnown()?.validity() ?: 0) +
                type.let { if (it == JsonValue.from("agent")) 1 else 0 }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Agent && config == other.config && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(config, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Agent{config=$config, type=$type, additionalProperties=$additionalProperties}"
    }
}
