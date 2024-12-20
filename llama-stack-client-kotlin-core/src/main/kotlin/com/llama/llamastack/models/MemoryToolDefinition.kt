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
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

@JsonDeserialize(builder = MemoryToolDefinition.Builder::class)
@NoAutoDetect
class MemoryToolDefinition
private constructor(
    private val inputShields: JsonField<List<String>>,
    private val maxChunks: JsonField<Long>,
    private val maxTokensInContext: JsonField<Long>,
    private val memoryBankConfigs: JsonField<List<MemoryBankConfig>>,
    private val outputShields: JsonField<List<String>>,
    private val queryGeneratorConfig: JsonField<QueryGeneratorConfig>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun inputShields(): List<String>? = inputShields.getNullable("input_shields")

    fun maxChunks(): Long = maxChunks.getRequired("max_chunks")

    fun maxTokensInContext(): Long = maxTokensInContext.getRequired("max_tokens_in_context")

    fun memoryBankConfigs(): List<MemoryBankConfig> =
        memoryBankConfigs.getRequired("memory_bank_configs")

    fun outputShields(): List<String>? = outputShields.getNullable("output_shields")

    fun queryGeneratorConfig(): QueryGeneratorConfig =
        queryGeneratorConfig.getRequired("query_generator_config")

    fun type(): Type = type.getRequired("type")

    @JsonProperty("input_shields") @ExcludeMissing fun _inputShields() = inputShields

    @JsonProperty("max_chunks") @ExcludeMissing fun _maxChunks() = maxChunks

    @JsonProperty("max_tokens_in_context")
    @ExcludeMissing
    fun _maxTokensInContext() = maxTokensInContext

    @JsonProperty("memory_bank_configs")
    @ExcludeMissing
    fun _memoryBankConfigs() = memoryBankConfigs

    @JsonProperty("output_shields") @ExcludeMissing fun _outputShields() = outputShields

    @JsonProperty("query_generator_config")
    @ExcludeMissing
    fun _queryGeneratorConfig() = queryGeneratorConfig

    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): MemoryToolDefinition = apply {
        if (!validated) {
            inputShields()
            maxChunks()
            maxTokensInContext()
            memoryBankConfigs()
            outputShields()
            queryGeneratorConfig()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var inputShields: JsonField<List<String>> = JsonMissing.of()
        private var maxChunks: JsonField<Long> = JsonMissing.of()
        private var maxTokensInContext: JsonField<Long> = JsonMissing.of()
        private var memoryBankConfigs: JsonField<List<MemoryBankConfig>> = JsonMissing.of()
        private var outputShields: JsonField<List<String>> = JsonMissing.of()
        private var queryGeneratorConfig: JsonField<QueryGeneratorConfig> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(memoryToolDefinition: MemoryToolDefinition) = apply {
            this.inputShields = memoryToolDefinition.inputShields
            this.maxChunks = memoryToolDefinition.maxChunks
            this.maxTokensInContext = memoryToolDefinition.maxTokensInContext
            this.memoryBankConfigs = memoryToolDefinition.memoryBankConfigs
            this.outputShields = memoryToolDefinition.outputShields
            this.queryGeneratorConfig = memoryToolDefinition.queryGeneratorConfig
            this.type = memoryToolDefinition.type
            additionalProperties(memoryToolDefinition.additionalProperties)
        }

        fun inputShields(inputShields: List<String>) = inputShields(JsonField.of(inputShields))

        @JsonProperty("input_shields")
        @ExcludeMissing
        fun inputShields(inputShields: JsonField<List<String>>) = apply {
            this.inputShields = inputShields
        }

        fun maxChunks(maxChunks: Long) = maxChunks(JsonField.of(maxChunks))

        @JsonProperty("max_chunks")
        @ExcludeMissing
        fun maxChunks(maxChunks: JsonField<Long>) = apply { this.maxChunks = maxChunks }

        fun maxTokensInContext(maxTokensInContext: Long) =
            maxTokensInContext(JsonField.of(maxTokensInContext))

        @JsonProperty("max_tokens_in_context")
        @ExcludeMissing
        fun maxTokensInContext(maxTokensInContext: JsonField<Long>) = apply {
            this.maxTokensInContext = maxTokensInContext
        }

        fun memoryBankConfigs(memoryBankConfigs: List<MemoryBankConfig>) =
            memoryBankConfigs(JsonField.of(memoryBankConfigs))

        @JsonProperty("memory_bank_configs")
        @ExcludeMissing
        fun memoryBankConfigs(memoryBankConfigs: JsonField<List<MemoryBankConfig>>) = apply {
            this.memoryBankConfigs = memoryBankConfigs
        }

        fun outputShields(outputShields: List<String>) = outputShields(JsonField.of(outputShields))

        @JsonProperty("output_shields")
        @ExcludeMissing
        fun outputShields(outputShields: JsonField<List<String>>) = apply {
            this.outputShields = outputShields
        }

        fun queryGeneratorConfig(queryGeneratorConfig: QueryGeneratorConfig) =
            queryGeneratorConfig(JsonField.of(queryGeneratorConfig))

        @JsonProperty("query_generator_config")
        @ExcludeMissing
        fun queryGeneratorConfig(queryGeneratorConfig: JsonField<QueryGeneratorConfig>) = apply {
            this.queryGeneratorConfig = queryGeneratorConfig
        }

        fun type(type: Type) = type(JsonField.of(type))

        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

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

        fun build(): MemoryToolDefinition =
            MemoryToolDefinition(
                inputShields.map { it.toImmutable() },
                maxChunks,
                maxTokensInContext,
                memoryBankConfigs.map { it.toImmutable() },
                outputShields.map { it.toImmutable() },
                queryGeneratorConfig,
                type,
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(using = MemoryBankConfig.Deserializer::class)
    @JsonSerialize(using = MemoryBankConfig.Serializer::class)
    class MemoryBankConfig
    private constructor(
        private val vector: Vector? = null,
        private val keyValue: KeyValue? = null,
        private val keyword: Keyword? = null,
        private val graph: Graph? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun vector(): Vector? = vector

        fun keyValue(): KeyValue? = keyValue

        fun keyword(): Keyword? = keyword

        fun graph(): Graph? = graph

        fun isVector(): Boolean = vector != null

        fun isKeyValue(): Boolean = keyValue != null

        fun isKeyword(): Boolean = keyword != null

        fun isGraph(): Boolean = graph != null

        fun asVector(): Vector = vector.getOrThrow("vector")

        fun asKeyValue(): KeyValue = keyValue.getOrThrow("keyValue")

        fun asKeyword(): Keyword = keyword.getOrThrow("keyword")

        fun asGraph(): Graph = graph.getOrThrow("graph")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                vector != null -> visitor.visitVector(vector)
                keyValue != null -> visitor.visitKeyValue(keyValue)
                keyword != null -> visitor.visitKeyword(keyword)
                graph != null -> visitor.visitGraph(graph)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): MemoryBankConfig = apply {
            if (!validated) {
                if (vector == null && keyValue == null && keyword == null && graph == null) {
                    throw LlamaStackClientInvalidDataException("Unknown MemoryBankConfig: $_json")
                }
                vector?.validate()
                keyValue?.validate()
                keyword?.validate()
                graph?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is MemoryBankConfig && vector == other.vector && keyValue == other.keyValue && keyword == other.keyword && graph == other.graph /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(vector, keyValue, keyword, graph) /* spotless:on */

        override fun toString(): String =
            when {
                vector != null -> "MemoryBankConfig{vector=$vector}"
                keyValue != null -> "MemoryBankConfig{keyValue=$keyValue}"
                keyword != null -> "MemoryBankConfig{keyword=$keyword}"
                graph != null -> "MemoryBankConfig{graph=$graph}"
                _json != null -> "MemoryBankConfig{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid MemoryBankConfig")
            }

        companion object {

            fun ofVector(vector: Vector) = MemoryBankConfig(vector = vector)

            fun ofKeyValue(keyValue: KeyValue) = MemoryBankConfig(keyValue = keyValue)

            fun ofKeyword(keyword: Keyword) = MemoryBankConfig(keyword = keyword)

            fun ofGraph(graph: Graph) = MemoryBankConfig(graph = graph)
        }

        interface Visitor<out T> {

            fun visitVector(vector: Vector): T

            fun visitKeyValue(keyValue: KeyValue): T

            fun visitKeyword(keyword: Keyword): T

            fun visitGraph(graph: Graph): T

            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown MemoryBankConfig: $json")
            }
        }

        class Deserializer : BaseDeserializer<MemoryBankConfig>(MemoryBankConfig::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): MemoryBankConfig {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<Vector>()) { it.validate() }
                    ?.let {
                        return MemoryBankConfig(vector = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<KeyValue>()) { it.validate() }
                    ?.let {
                        return MemoryBankConfig(keyValue = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<Keyword>()) { it.validate() }
                    ?.let {
                        return MemoryBankConfig(keyword = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<Graph>()) { it.validate() }
                    ?.let {
                        return MemoryBankConfig(graph = it, _json = json)
                    }

                return MemoryBankConfig(_json = json)
            }
        }

        class Serializer : BaseSerializer<MemoryBankConfig>(MemoryBankConfig::class) {

            override fun serialize(
                value: MemoryBankConfig,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.vector != null -> generator.writeObject(value.vector)
                    value.keyValue != null -> generator.writeObject(value.keyValue)
                    value.keyword != null -> generator.writeObject(value.keyword)
                    value.graph != null -> generator.writeObject(value.graph)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid MemoryBankConfig")
                }
            }
        }

        @JsonDeserialize(builder = Vector.Builder::class)
        @NoAutoDetect
        class Vector
        private constructor(
            private val bankId: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun bankId(): String = bankId.getRequired("bank_id")

            fun type(): Type = type.getRequired("type")

            @JsonProperty("bank_id") @ExcludeMissing fun _bankId() = bankId

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Vector = apply {
                if (!validated) {
                    bankId()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var bankId: JsonField<String> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(vector: Vector) = apply {
                    this.bankId = vector.bankId
                    this.type = vector.type
                    additionalProperties(vector.additionalProperties)
                }

                fun bankId(bankId: String) = bankId(JsonField.of(bankId))

                @JsonProperty("bank_id")
                @ExcludeMissing
                fun bankId(bankId: JsonField<String>) = apply { this.bankId = bankId }

                fun type(type: Type) = type(JsonField.of(type))

                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                fun build(): Vector =
                    Vector(
                        bankId,
                        type,
                        additionalProperties.toImmutable(),
                    )
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val VECTOR = Type(JsonField.of("vector"))

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    VECTOR,
                }

                enum class Value {
                    VECTOR,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        VECTOR -> Value.VECTOR
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        VECTOR -> Known.VECTOR
                        else -> throw LlamaStackClientInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Vector && bankId == other.bankId && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(bankId, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Vector{bankId=$bankId, type=$type, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = KeyValue.Builder::class)
        @NoAutoDetect
        class KeyValue
        private constructor(
            private val bankId: JsonField<String>,
            private val keys: JsonField<List<String>>,
            private val type: JsonField<Type>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun bankId(): String = bankId.getRequired("bank_id")

            fun keys(): List<String> = keys.getRequired("keys")

            fun type(): Type = type.getRequired("type")

            @JsonProperty("bank_id") @ExcludeMissing fun _bankId() = bankId

            @JsonProperty("keys") @ExcludeMissing fun _keys() = keys

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): KeyValue = apply {
                if (!validated) {
                    bankId()
                    keys()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var bankId: JsonField<String> = JsonMissing.of()
                private var keys: JsonField<List<String>> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(keyValue: KeyValue) = apply {
                    this.bankId = keyValue.bankId
                    this.keys = keyValue.keys
                    this.type = keyValue.type
                    additionalProperties(keyValue.additionalProperties)
                }

                fun bankId(bankId: String) = bankId(JsonField.of(bankId))

                @JsonProperty("bank_id")
                @ExcludeMissing
                fun bankId(bankId: JsonField<String>) = apply { this.bankId = bankId }

                fun keys(keys: List<String>) = keys(JsonField.of(keys))

                @JsonProperty("keys")
                @ExcludeMissing
                fun keys(keys: JsonField<List<String>>) = apply { this.keys = keys }

                fun type(type: Type) = type(JsonField.of(type))

                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                fun build(): KeyValue =
                    KeyValue(
                        bankId,
                        keys.map { it.toImmutable() },
                        type,
                        additionalProperties.toImmutable(),
                    )
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val KEYVALUE = Type(JsonField.of("keyvalue"))

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    KEYVALUE,
                }

                enum class Value {
                    KEYVALUE,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        KEYVALUE -> Value.KEYVALUE
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        KEYVALUE -> Known.KEYVALUE
                        else -> throw LlamaStackClientInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is KeyValue && bankId == other.bankId && keys == other.keys && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(bankId, keys, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "KeyValue{bankId=$bankId, keys=$keys, type=$type, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = Keyword.Builder::class)
        @NoAutoDetect
        class Keyword
        private constructor(
            private val bankId: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun bankId(): String = bankId.getRequired("bank_id")

            fun type(): Type = type.getRequired("type")

            @JsonProperty("bank_id") @ExcludeMissing fun _bankId() = bankId

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Keyword = apply {
                if (!validated) {
                    bankId()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var bankId: JsonField<String> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(keyword: Keyword) = apply {
                    this.bankId = keyword.bankId
                    this.type = keyword.type
                    additionalProperties(keyword.additionalProperties)
                }

                fun bankId(bankId: String) = bankId(JsonField.of(bankId))

                @JsonProperty("bank_id")
                @ExcludeMissing
                fun bankId(bankId: JsonField<String>) = apply { this.bankId = bankId }

                fun type(type: Type) = type(JsonField.of(type))

                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                fun build(): Keyword =
                    Keyword(
                        bankId,
                        type,
                        additionalProperties.toImmutable(),
                    )
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val KEYWORD = Type(JsonField.of("keyword"))

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    KEYWORD,
                }

                enum class Value {
                    KEYWORD,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        KEYWORD -> Value.KEYWORD
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        KEYWORD -> Known.KEYWORD
                        else -> throw LlamaStackClientInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Keyword && bankId == other.bankId && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(bankId, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Keyword{bankId=$bankId, type=$type, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = Graph.Builder::class)
        @NoAutoDetect
        class Graph
        private constructor(
            private val bankId: JsonField<String>,
            private val entities: JsonField<List<String>>,
            private val type: JsonField<Type>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun bankId(): String = bankId.getRequired("bank_id")

            fun entities(): List<String> = entities.getRequired("entities")

            fun type(): Type = type.getRequired("type")

            @JsonProperty("bank_id") @ExcludeMissing fun _bankId() = bankId

            @JsonProperty("entities") @ExcludeMissing fun _entities() = entities

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Graph = apply {
                if (!validated) {
                    bankId()
                    entities()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var bankId: JsonField<String> = JsonMissing.of()
                private var entities: JsonField<List<String>> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(graph: Graph) = apply {
                    this.bankId = graph.bankId
                    this.entities = graph.entities
                    this.type = graph.type
                    additionalProperties(graph.additionalProperties)
                }

                fun bankId(bankId: String) = bankId(JsonField.of(bankId))

                @JsonProperty("bank_id")
                @ExcludeMissing
                fun bankId(bankId: JsonField<String>) = apply { this.bankId = bankId }

                fun entities(entities: List<String>) = entities(JsonField.of(entities))

                @JsonProperty("entities")
                @ExcludeMissing
                fun entities(entities: JsonField<List<String>>) = apply { this.entities = entities }

                fun type(type: Type) = type(JsonField.of(type))

                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                fun build(): Graph =
                    Graph(
                        bankId,
                        entities.map { it.toImmutable() },
                        type,
                        additionalProperties.toImmutable(),
                    )
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val GRAPH = Type(JsonField.of("graph"))

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    GRAPH,
                }

                enum class Value {
                    GRAPH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        GRAPH -> Value.GRAPH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        GRAPH -> Known.GRAPH
                        else -> throw LlamaStackClientInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Graph && bankId == other.bankId && entities == other.entities && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(bankId, entities, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Graph{bankId=$bankId, entities=$entities, type=$type, additionalProperties=$additionalProperties}"
        }
    }

    @JsonDeserialize(using = QueryGeneratorConfig.Deserializer::class)
    @JsonSerialize(using = QueryGeneratorConfig.Serializer::class)
    class QueryGeneratorConfig
    private constructor(
        private val default: Default? = null,
        private val llm: Llm? = null,
        private val custom: Custom? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun default(): Default? = default

        fun llm(): Llm? = llm

        fun custom(): Custom? = custom

        fun isDefault(): Boolean = default != null

        fun isLlm(): Boolean = llm != null

        fun isCustom(): Boolean = custom != null

        fun asDefault(): Default = default.getOrThrow("default")

        fun asLlm(): Llm = llm.getOrThrow("llm")

        fun asCustom(): Custom = custom.getOrThrow("custom")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                default != null -> visitor.visitDefault(default)
                llm != null -> visitor.visitLlm(llm)
                custom != null -> visitor.visitCustom(custom)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): QueryGeneratorConfig = apply {
            if (!validated) {
                if (default == null && llm == null && custom == null) {
                    throw LlamaStackClientInvalidDataException(
                        "Unknown QueryGeneratorConfig: $_json"
                    )
                }
                default?.validate()
                llm?.validate()
                custom?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is QueryGeneratorConfig && default == other.default && llm == other.llm && custom == other.custom /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(default, llm, custom) /* spotless:on */

        override fun toString(): String =
            when {
                default != null -> "QueryGeneratorConfig{default=$default}"
                llm != null -> "QueryGeneratorConfig{llm=$llm}"
                custom != null -> "QueryGeneratorConfig{custom=$custom}"
                _json != null -> "QueryGeneratorConfig{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid QueryGeneratorConfig")
            }

        companion object {

            fun ofDefault(default: Default) = QueryGeneratorConfig(default = default)

            fun ofLlm(llm: Llm) = QueryGeneratorConfig(llm = llm)

            fun ofCustom(custom: Custom) = QueryGeneratorConfig(custom = custom)
        }

        interface Visitor<out T> {

            fun visitDefault(default: Default): T

            fun visitLlm(llm: Llm): T

            fun visitCustom(custom: Custom): T

            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown QueryGeneratorConfig: $json")
            }
        }

        class Deserializer : BaseDeserializer<QueryGeneratorConfig>(QueryGeneratorConfig::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): QueryGeneratorConfig {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<Default>()) { it.validate() }
                    ?.let {
                        return QueryGeneratorConfig(default = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<Llm>()) { it.validate() }
                    ?.let {
                        return QueryGeneratorConfig(llm = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<Custom>()) { it.validate() }
                    ?.let {
                        return QueryGeneratorConfig(custom = it, _json = json)
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
                    value.custom != null -> generator.writeObject(value.custom)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid QueryGeneratorConfig")
                }
            }
        }

        @JsonDeserialize(builder = Default.Builder::class)
        @NoAutoDetect
        class Default
        private constructor(
            private val sep: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun sep(): String = sep.getRequired("sep")

            fun type(): Type = type.getRequired("type")

            @JsonProperty("sep") @ExcludeMissing fun _sep() = sep

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Default = apply {
                if (!validated) {
                    sep()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var sep: JsonField<String> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(default: Default) = apply {
                    this.sep = default.sep
                    this.type = default.type
                    additionalProperties(default.additionalProperties)
                }

                fun sep(sep: String) = sep(JsonField.of(sep))

                @JsonProperty("sep")
                @ExcludeMissing
                fun sep(sep: JsonField<String>) = apply { this.sep = sep }

                fun type(type: Type) = type(JsonField.of(type))

                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                fun build(): Default =
                    Default(
                        sep,
                        type,
                        additionalProperties.toImmutable(),
                    )
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DEFAULT = Type(JsonField.of("default"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Default && sep == other.sep && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(sep, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Default{sep=$sep, type=$type, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = Llm.Builder::class)
        @NoAutoDetect
        class Llm
        private constructor(
            private val model: JsonField<String>,
            private val template: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun model(): String = model.getRequired("model")

            fun template(): String = template.getRequired("template")

            fun type(): Type = type.getRequired("type")

            @JsonProperty("model") @ExcludeMissing fun _model() = model

            @JsonProperty("template") @ExcludeMissing fun _template() = template

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Llm = apply {
                if (!validated) {
                    model()
                    template()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var model: JsonField<String> = JsonMissing.of()
                private var template: JsonField<String> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(llm: Llm) = apply {
                    this.model = llm.model
                    this.template = llm.template
                    this.type = llm.type
                    additionalProperties(llm.additionalProperties)
                }

                fun model(model: String) = model(JsonField.of(model))

                @JsonProperty("model")
                @ExcludeMissing
                fun model(model: JsonField<String>) = apply { this.model = model }

                fun template(template: String) = template(JsonField.of(template))

                @JsonProperty("template")
                @ExcludeMissing
                fun template(template: JsonField<String>) = apply { this.template = template }

                fun type(type: Type) = type(JsonField.of(type))

                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                fun build(): Llm =
                    Llm(
                        model,
                        template,
                        type,
                        additionalProperties.toImmutable(),
                    )
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val LLM = Type(JsonField.of("llm"))

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

        @JsonDeserialize(builder = Custom.Builder::class)
        @NoAutoDetect
        class Custom
        private constructor(
            private val type: JsonField<Type>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun type(): Type = type.getRequired("type")

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Custom = apply {
                if (!validated) {
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(custom: Custom) = apply {
                    this.type = custom.type
                    additionalProperties(custom.additionalProperties)
                }

                fun type(type: Type) = type(JsonField.of(type))

                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                fun build(): Custom = Custom(type, additionalProperties.toImmutable())
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val CUSTOM = Type(JsonField.of("custom"))

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    CUSTOM,
                }

                enum class Value {
                    CUSTOM,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CUSTOM -> Value.CUSTOM
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CUSTOM -> Known.CUSTOM
                        else -> throw LlamaStackClientInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Custom && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Custom{type=$type, additionalProperties=$additionalProperties}"
        }
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val MEMORY = Type(JsonField.of("memory"))

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            MEMORY,
        }

        enum class Value {
            MEMORY,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                MEMORY -> Value.MEMORY
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                MEMORY -> Known.MEMORY
                else -> throw LlamaStackClientInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is MemoryToolDefinition && inputShields == other.inputShields && maxChunks == other.maxChunks && maxTokensInContext == other.maxTokensInContext && memoryBankConfigs == other.memoryBankConfigs && outputShields == other.outputShields && queryGeneratorConfig == other.queryGeneratorConfig && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(inputShields, maxChunks, maxTokensInContext, memoryBankConfigs, outputShields, queryGeneratorConfig, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MemoryToolDefinition{inputShields=$inputShields, maxChunks=$maxChunks, maxTokensInContext=$maxTokensInContext, memoryBankConfigs=$memoryBankConfigs, outputShields=$outputShields, queryGeneratorConfig=$queryGeneratorConfig, type=$type, additionalProperties=$additionalProperties}"
}
