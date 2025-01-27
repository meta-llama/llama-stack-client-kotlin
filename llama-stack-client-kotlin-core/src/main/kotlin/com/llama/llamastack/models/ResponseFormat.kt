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
import com.llama.llamastack.core.NoAutoDetect
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.immutableEmptyMap
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

@JsonDeserialize(using = ResponseFormat.Deserializer::class)
@JsonSerialize(using = ResponseFormat.Serializer::class)
class ResponseFormat
private constructor(
    private val jsonSchema: JsonSchemaResponseFormat? = null,
    private val grammar: GrammarResponseFormat? = null,
    private val _json: JsonValue? = null,
) {

    fun jsonSchema(): JsonSchemaResponseFormat? = jsonSchema

    fun grammar(): GrammarResponseFormat? = grammar

    fun isJsonSchema(): Boolean = jsonSchema != null

    fun isGrammar(): Boolean = grammar != null

    fun asJsonSchema(): JsonSchemaResponseFormat = jsonSchema.getOrThrow("jsonSchema")

    fun asGrammar(): GrammarResponseFormat = grammar.getOrThrow("grammar")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            jsonSchema != null -> visitor.visitJsonSchema(jsonSchema)
            grammar != null -> visitor.visitGrammar(grammar)
            else -> visitor.unknown(_json)
        }
    }

    private var validated: Boolean = false

    fun validate(): ResponseFormat = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitJsonSchema(jsonSchema: JsonSchemaResponseFormat) {
                    jsonSchema.validate()
                }

                override fun visitGrammar(grammar: GrammarResponseFormat) {
                    grammar.validate()
                }
            }
        )
        validated = true
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ResponseFormat && jsonSchema == other.jsonSchema && grammar == other.grammar /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(jsonSchema, grammar) /* spotless:on */

    override fun toString(): String =
        when {
            jsonSchema != null -> "ResponseFormat{jsonSchema=$jsonSchema}"
            grammar != null -> "ResponseFormat{grammar=$grammar}"
            _json != null -> "ResponseFormat{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid ResponseFormat")
        }

    companion object {

        fun ofJsonSchema(jsonSchema: JsonSchemaResponseFormat) =
            ResponseFormat(jsonSchema = jsonSchema)

        fun ofGrammar(grammar: GrammarResponseFormat) = ResponseFormat(grammar = grammar)
    }

    interface Visitor<out T> {

        fun visitJsonSchema(jsonSchema: JsonSchemaResponseFormat): T

        fun visitGrammar(grammar: GrammarResponseFormat): T

        fun unknown(json: JsonValue?): T {
            throw LlamaStackClientInvalidDataException("Unknown ResponseFormat: $json")
        }
    }

    class Deserializer : BaseDeserializer<ResponseFormat>(ResponseFormat::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): ResponseFormat {
            val json = JsonValue.fromJsonNode(node)
            val type = json.asObject()?.get("type")?.asString()

            when (type) {
                "json_schema" -> {
                    tryDeserialize(node, jacksonTypeRef<JsonSchemaResponseFormat>()) {
                            it.validate()
                        }
                        ?.let {
                            return ResponseFormat(jsonSchema = it, _json = json)
                        }
                }
                "grammar" -> {
                    tryDeserialize(node, jacksonTypeRef<GrammarResponseFormat>()) { it.validate() }
                        ?.let {
                            return ResponseFormat(grammar = it, _json = json)
                        }
                }
            }

            return ResponseFormat(_json = json)
        }
    }

    class Serializer : BaseSerializer<ResponseFormat>(ResponseFormat::class) {

        override fun serialize(
            value: ResponseFormat,
            generator: JsonGenerator,
            provider: SerializerProvider
        ) {
            when {
                value.jsonSchema != null -> generator.writeObject(value.jsonSchema)
                value.grammar != null -> generator.writeObject(value.grammar)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid ResponseFormat")
            }
        }
    }

    @NoAutoDetect
    class JsonSchemaResponseFormat
    @JsonCreator
    private constructor(
        @JsonProperty("json_schema")
        @ExcludeMissing
        private val jsonSchema: JsonField<JsonSchema> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonValue = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun jsonSchema(): JsonSchema = jsonSchema.getRequired("json_schema")

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        @JsonProperty("json_schema")
        @ExcludeMissing
        fun _jsonSchema(): JsonField<JsonSchema> = jsonSchema

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): JsonSchemaResponseFormat = apply {
            if (validated) {
                return@apply
            }

            jsonSchema().validate()
            _type().let {
                if (it != JsonValue.from("json_schema")) {
                    throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
                }
            }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var jsonSchema: JsonField<JsonSchema>? = null
            private var type: JsonValue = JsonValue.from("json_schema")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(jsonSchemaResponseFormat: JsonSchemaResponseFormat) = apply {
                jsonSchema = jsonSchemaResponseFormat.jsonSchema
                type = jsonSchemaResponseFormat.type
                additionalProperties = jsonSchemaResponseFormat.additionalProperties.toMutableMap()
            }

            fun jsonSchema(jsonSchema: JsonSchema) = jsonSchema(JsonField.of(jsonSchema))

            fun jsonSchema(jsonSchema: JsonField<JsonSchema>) = apply {
                this.jsonSchema = jsonSchema
            }

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

            fun build(): JsonSchemaResponseFormat =
                JsonSchemaResponseFormat(
                    checkRequired("jsonSchema", jsonSchema),
                    type,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class JsonSchema
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): JsonSchema = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(jsonSchema: JsonSchema) = apply {
                    additionalProperties = jsonSchema.additionalProperties.toMutableMap()
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

                fun build(): JsonSchema = JsonSchema(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is JsonSchema && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "JsonSchema{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is JsonSchemaResponseFormat && jsonSchema == other.jsonSchema && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(jsonSchema, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "JsonSchemaResponseFormat{jsonSchema=$jsonSchema, type=$type, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class GrammarResponseFormat
    @JsonCreator
    private constructor(
        @JsonProperty("bnf") @ExcludeMissing private val bnf: JsonField<Bnf> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonValue = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun bnf(): Bnf = bnf.getRequired("bnf")

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        @JsonProperty("bnf") @ExcludeMissing fun _bnf(): JsonField<Bnf> = bnf

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): GrammarResponseFormat = apply {
            if (validated) {
                return@apply
            }

            bnf().validate()
            _type().let {
                if (it != JsonValue.from("grammar")) {
                    throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
                }
            }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var bnf: JsonField<Bnf>? = null
            private var type: JsonValue = JsonValue.from("grammar")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(grammarResponseFormat: GrammarResponseFormat) = apply {
                bnf = grammarResponseFormat.bnf
                type = grammarResponseFormat.type
                additionalProperties = grammarResponseFormat.additionalProperties.toMutableMap()
            }

            fun bnf(bnf: Bnf) = bnf(JsonField.of(bnf))

            fun bnf(bnf: JsonField<Bnf>) = apply { this.bnf = bnf }

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

            fun build(): GrammarResponseFormat =
                GrammarResponseFormat(
                    checkRequired("bnf", bnf),
                    type,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class Bnf
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Bnf = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(bnf: Bnf) = apply {
                    additionalProperties = bnf.additionalProperties.toMutableMap()
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

                fun build(): Bnf = Bnf(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Bnf && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Bnf{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is GrammarResponseFormat && bnf == other.bnf && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(bnf, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "GrammarResponseFormat{bnf=$bnf, type=$type, additionalProperties=$additionalProperties}"
    }
}
