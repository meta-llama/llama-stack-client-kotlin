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
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

@NoAutoDetect
class QueryConfig
@JsonCreator
private constructor(
    @JsonProperty("max_chunks")
    @ExcludeMissing
    private val maxChunks: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("max_tokens_in_context")
    @ExcludeMissing
    private val maxTokensInContext: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("query_generator_config")
    @ExcludeMissing
    private val queryGeneratorConfig: JsonField<QueryGeneratorConfig> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun maxChunks(): Long = maxChunks.getRequired("max_chunks")

    fun maxTokensInContext(): Long = maxTokensInContext.getRequired("max_tokens_in_context")

    fun queryGeneratorConfig(): QueryGeneratorConfig =
        queryGeneratorConfig.getRequired("query_generator_config")

    @JsonProperty("max_chunks") @ExcludeMissing fun _maxChunks(): JsonField<Long> = maxChunks

    @JsonProperty("max_tokens_in_context")
    @ExcludeMissing
    fun _maxTokensInContext(): JsonField<Long> = maxTokensInContext

    @JsonProperty("query_generator_config")
    @ExcludeMissing
    fun _queryGeneratorConfig(): JsonField<QueryGeneratorConfig> = queryGeneratorConfig

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): QueryConfig = apply {
        if (validated) {
            return@apply
        }

        maxChunks()
        maxTokensInContext()
        queryGeneratorConfig().validate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var maxChunks: JsonField<Long>? = null
        private var maxTokensInContext: JsonField<Long>? = null
        private var queryGeneratorConfig: JsonField<QueryGeneratorConfig>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(queryConfig: QueryConfig) = apply {
            maxChunks = queryConfig.maxChunks
            maxTokensInContext = queryConfig.maxTokensInContext
            queryGeneratorConfig = queryConfig.queryGeneratorConfig
            additionalProperties = queryConfig.additionalProperties.toMutableMap()
        }

        fun maxChunks(maxChunks: Long) = maxChunks(JsonField.of(maxChunks))

        fun maxChunks(maxChunks: JsonField<Long>) = apply { this.maxChunks = maxChunks }

        fun maxTokensInContext(maxTokensInContext: Long) =
            maxTokensInContext(JsonField.of(maxTokensInContext))

        fun maxTokensInContext(maxTokensInContext: JsonField<Long>) = apply {
            this.maxTokensInContext = maxTokensInContext
        }

        fun queryGeneratorConfig(queryGeneratorConfig: QueryGeneratorConfig) =
            queryGeneratorConfig(JsonField.of(queryGeneratorConfig))

        fun queryGeneratorConfig(queryGeneratorConfig: JsonField<QueryGeneratorConfig>) = apply {
            this.queryGeneratorConfig = queryGeneratorConfig
        }

        fun queryGeneratorConfig(default: QueryGeneratorConfig.Default) =
            queryGeneratorConfig(QueryGeneratorConfig.ofDefault(default))

        fun queryGeneratorConfig(llm: QueryGeneratorConfig.Llm) =
            queryGeneratorConfig(QueryGeneratorConfig.ofLlm(llm))

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

        fun build(): QueryConfig =
            QueryConfig(
                checkRequired("maxChunks", maxChunks),
                checkRequired("maxTokensInContext", maxTokensInContext),
                checkRequired("queryGeneratorConfig", queryGeneratorConfig),
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(using = QueryGeneratorConfig.Deserializer::class)
    @JsonSerialize(using = QueryGeneratorConfig.Serializer::class)
    class QueryGeneratorConfig
    private constructor(
        private val default: Default? = null,
        private val llm: Llm? = null,
        private val _json: JsonValue? = null,
    ) {

        fun default(): Default? = default

        fun llm(): Llm? = llm

        fun isDefault(): Boolean = default != null

        fun isLlm(): Boolean = llm != null

        fun asDefault(): Default = default.getOrThrow("default")

        fun asLlm(): Llm = llm.getOrThrow("llm")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                default != null -> visitor.visitDefault(default)
                llm != null -> visitor.visitLlm(llm)
                else -> visitor.unknown(_json)
            }
        }

        private var validated: Boolean = false

        fun validate(): QueryGeneratorConfig = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitDefault(default: Default) {
                        default.validate()
                    }

                    override fun visitLlm(llm: Llm) {
                        llm.validate()
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is QueryGeneratorConfig && default == other.default && llm == other.llm /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(default, llm) /* spotless:on */

        override fun toString(): String =
            when {
                default != null -> "QueryGeneratorConfig{default=$default}"
                llm != null -> "QueryGeneratorConfig{llm=$llm}"
                _json != null -> "QueryGeneratorConfig{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid QueryGeneratorConfig")
            }

        companion object {

            fun ofDefault(default: Default) = QueryGeneratorConfig(default = default)

            fun ofLlm(llm: Llm) = QueryGeneratorConfig(llm = llm)
        }

        interface Visitor<out T> {

            fun visitDefault(default: Default): T

            fun visitLlm(llm: Llm): T

            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown QueryGeneratorConfig: $json")
            }
        }

        class Deserializer : BaseDeserializer<QueryGeneratorConfig>(QueryGeneratorConfig::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): QueryGeneratorConfig {
                val json = JsonValue.fromJsonNode(node)
                val type = json.asObject()?.get("type")?.asString()

                when (type) {
                    "default" -> {
                        tryDeserialize(node, jacksonTypeRef<Default>()) { it.validate() }
                            ?.let {
                                return QueryGeneratorConfig(default = it, _json = json)
                            }
                    }
                    "llm" -> {
                        tryDeserialize(node, jacksonTypeRef<Llm>()) { it.validate() }
                            ?.let {
                                return QueryGeneratorConfig(llm = it, _json = json)
                            }
                    }
                }

                return QueryGeneratorConfig(_json = json)
            }
        }

        class Serializer : BaseSerializer<QueryGeneratorConfig>(QueryGeneratorConfig::class) {

            override fun serialize(
                value: QueryGeneratorConfig,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.default != null -> generator.writeObject(value.default)
                    value.llm != null -> generator.writeObject(value.llm)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid QueryGeneratorConfig")
                }
            }
        }

        @NoAutoDetect
        class Default
        @JsonCreator
        private constructor(
            @JsonProperty("separator")
            @ExcludeMissing
            private val separator: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun separator(): String = separator.getRequired("separator")

            fun type(): Type = type.getRequired("type")

            @JsonProperty("separator")
            @ExcludeMissing
            fun _separator(): JsonField<String> = separator

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Default = apply {
                if (validated) {
                    return@apply
                }

                separator()
                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var separator: JsonField<String>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(default: Default) = apply {
                    separator = default.separator
                    type = default.type
                    additionalProperties = default.additionalProperties.toMutableMap()
                }

                fun separator(separator: String) = separator(JsonField.of(separator))

                fun separator(separator: JsonField<String>) = apply { this.separator = separator }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                fun build(): Default =
                    Default(
                        checkRequired("separator", separator),
                        checkRequired("type", type),
                        additionalProperties.toImmutable(),
                    )
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DEFAULT = of("default")

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    DEFAULT,
                }

                enum class Value {
                    DEFAULT,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DEFAULT -> Value.DEFAULT
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DEFAULT -> Known.DEFAULT
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

                return /* spotless:off */ other is Default && separator == other.separator && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(separator, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Default{separator=$separator, type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class Llm
        @JsonCreator
        private constructor(
            @JsonProperty("model")
            @ExcludeMissing
            private val model: JsonField<String> = JsonMissing.of(),
            @JsonProperty("template")
            @ExcludeMissing
            private val template: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun model(): String = model.getRequired("model")

            fun template(): String = template.getRequired("template")

            fun type(): Type = type.getRequired("type")

            @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

            @JsonProperty("template") @ExcludeMissing fun _template(): JsonField<String> = template

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Llm = apply {
                if (validated) {
                    return@apply
                }

                model()
                template()
                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var model: JsonField<String>? = null
                private var template: JsonField<String>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(llm: Llm) = apply {
                    model = llm.model
                    template = llm.template
                    type = llm.type
                    additionalProperties = llm.additionalProperties.toMutableMap()
                }

                fun model(model: String) = model(JsonField.of(model))

                fun model(model: JsonField<String>) = apply { this.model = model }

                fun template(template: String) = template(JsonField.of(template))

                fun template(template: JsonField<String>) = apply { this.template = template }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                fun build(): Llm =
                    Llm(
                        checkRequired("model", model),
                        checkRequired("template", template),
                        checkRequired("type", type),
                        additionalProperties.toImmutable(),
                    )
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val LLM = of("llm")

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    LLM,
                }

                enum class Value {
                    LLM,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        LLM -> Value.LLM
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        LLM -> Known.LLM
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

                return /* spotless:off */ other is Llm && model == other.model && template == other.template && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(model, template, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Llm{model=$model, template=$template, type=$type, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is QueryConfig && maxChunks == other.maxChunks && maxTokensInContext == other.maxTokensInContext && queryGeneratorConfig == other.queryGeneratorConfig && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(maxChunks, maxTokensInContext, queryGeneratorConfig, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "QueryConfig{maxChunks=$maxChunks, maxTokensInContext=$maxTokensInContext, queryGeneratorConfig=$queryGeneratorConfig, additionalProperties=$additionalProperties}"
}
