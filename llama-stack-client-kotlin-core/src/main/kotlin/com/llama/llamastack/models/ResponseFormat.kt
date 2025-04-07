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
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Collections
import java.util.Objects

/** Configuration for JSON schema-guided response generation. */
@JsonDeserialize(using = ResponseFormat.Deserializer::class)
@JsonSerialize(using = ResponseFormat.Serializer::class)
class ResponseFormat
private constructor(
    private val jsonSchema: JsonSchemaResponseFormat? = null,
    private val grammar: GrammarResponseFormat? = null,
    private val _json: JsonValue? = null,
) {

    /** Configuration for JSON schema-guided response generation. */
    fun jsonSchema(): JsonSchemaResponseFormat? = jsonSchema

    /** Configuration for grammar-guided response generation. */
    fun grammar(): GrammarResponseFormat? = grammar

    fun isJsonSchema(): Boolean = jsonSchema != null

    fun isGrammar(): Boolean = grammar != null

    /** Configuration for JSON schema-guided response generation. */
    fun asJsonSchema(): JsonSchemaResponseFormat = jsonSchema.getOrThrow("jsonSchema")

    /** Configuration for grammar-guided response generation. */
    fun asGrammar(): GrammarResponseFormat = grammar.getOrThrow("grammar")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            jsonSchema != null -> visitor.visitJsonSchema(jsonSchema)
            grammar != null -> visitor.visitGrammar(grammar)
            else -> visitor.unknown(_json)
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
                override fun visitJsonSchema(jsonSchema: JsonSchemaResponseFormat) =
                    jsonSchema.validity()

                override fun visitGrammar(grammar: GrammarResponseFormat) = grammar.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

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

        /** Configuration for JSON schema-guided response generation. */
        fun ofJsonSchema(jsonSchema: JsonSchemaResponseFormat) =
            ResponseFormat(jsonSchema = jsonSchema)

        /** Configuration for grammar-guided response generation. */
        fun ofGrammar(grammar: GrammarResponseFormat) = ResponseFormat(grammar = grammar)
    }

    /**
     * An interface that defines how to map each variant of [ResponseFormat] to a value of type [T].
     */
    interface Visitor<out T> {

        /** Configuration for JSON schema-guided response generation. */
        fun visitJsonSchema(jsonSchema: JsonSchemaResponseFormat): T

        /** Configuration for grammar-guided response generation. */
        fun visitGrammar(grammar: GrammarResponseFormat): T

        /**
         * Maps an unknown variant of [ResponseFormat] to a value of type [T].
         *
         * An instance of [ResponseFormat] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws LlamaStackClientInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LlamaStackClientInvalidDataException("Unknown ResponseFormat: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<ResponseFormat>(ResponseFormat::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): ResponseFormat {
            val json = JsonValue.fromJsonNode(node)
            val type = json.asObject()?.get("type")?.asString()

            when (type) {
                "json_schema" -> {
                    return tryDeserialize(node, jacksonTypeRef<JsonSchemaResponseFormat>())?.let {
                        ResponseFormat(jsonSchema = it, _json = json)
                    } ?: ResponseFormat(_json = json)
                }
                "grammar" -> {
                    return tryDeserialize(node, jacksonTypeRef<GrammarResponseFormat>())?.let {
                        ResponseFormat(grammar = it, _json = json)
                    } ?: ResponseFormat(_json = json)
                }
            }

            return ResponseFormat(_json = json)
        }
    }

    internal class Serializer : BaseSerializer<ResponseFormat>(ResponseFormat::class) {

        override fun serialize(
            value: ResponseFormat,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.jsonSchema != null -> generator.writeObject(value.jsonSchema)
                value.grammar != null -> generator.writeObject(value.grammar)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid ResponseFormat")
            }
        }
    }

    /** Configuration for JSON schema-guided response generation. */
    class JsonSchemaResponseFormat
    private constructor(
        private val jsonSchema: JsonField<JsonSchema>,
        private val type: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("json_schema")
            @ExcludeMissing
            jsonSchema: JsonField<JsonSchema> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        ) : this(jsonSchema, type, mutableMapOf())

        /**
         * The JSON schema the response should conform to. In a Python SDK, this is often a
         * `pydantic` model.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun jsonSchema(): JsonSchema = jsonSchema.getRequired("json_schema")

        /**
         * Must be "json_schema" to identify this format type
         *
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("json_schema")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * Returns the raw JSON value of [jsonSchema].
         *
         * Unlike [jsonSchema], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("json_schema")
        @ExcludeMissing
        fun _jsonSchema(): JsonField<JsonSchema> = jsonSchema

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
             * Returns a mutable builder for constructing an instance of [JsonSchemaResponseFormat].
             *
             * The following fields are required:
             * ```kotlin
             * .jsonSchema()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [JsonSchemaResponseFormat]. */
        class Builder internal constructor() {

            private var jsonSchema: JsonField<JsonSchema>? = null
            private var type: JsonValue = JsonValue.from("json_schema")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(jsonSchemaResponseFormat: JsonSchemaResponseFormat) = apply {
                jsonSchema = jsonSchemaResponseFormat.jsonSchema
                type = jsonSchemaResponseFormat.type
                additionalProperties = jsonSchemaResponseFormat.additionalProperties.toMutableMap()
            }

            /**
             * The JSON schema the response should conform to. In a Python SDK, this is often a
             * `pydantic` model.
             */
            fun jsonSchema(jsonSchema: JsonSchema) = jsonSchema(JsonField.of(jsonSchema))

            /**
             * Sets [Builder.jsonSchema] to an arbitrary JSON value.
             *
             * You should usually call [Builder.jsonSchema] with a well-typed [JsonSchema] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun jsonSchema(jsonSchema: JsonField<JsonSchema>) = apply {
                this.jsonSchema = jsonSchema
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("json_schema")
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
             * Returns an immutable instance of [JsonSchemaResponseFormat].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .jsonSchema()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): JsonSchemaResponseFormat =
                JsonSchemaResponseFormat(
                    checkRequired("jsonSchema", jsonSchema),
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

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
            (jsonSchema.asKnown()?.validity() ?: 0) +
                type.let { if (it == JsonValue.from("json_schema")) 1 else 0 }

        /**
         * The JSON schema the response should conform to. In a Python SDK, this is often a
         * `pydantic` model.
         */
        class JsonSchema
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [JsonSchema]. */
                fun builder() = Builder()
            }

            /** A builder for [JsonSchema]. */
            class Builder internal constructor() {

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

                /**
                 * Returns an immutable instance of [JsonSchema].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): JsonSchema = JsonSchema(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): JsonSchema = apply {
                if (validated) {
                    return@apply
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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

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

    /** Configuration for grammar-guided response generation. */
    class GrammarResponseFormat
    private constructor(
        private val bnf: JsonField<Bnf>,
        private val type: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("bnf") @ExcludeMissing bnf: JsonField<Bnf> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        ) : this(bnf, type, mutableMapOf())

        /**
         * The BNF grammar specification the response should conform to
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun bnf(): Bnf = bnf.getRequired("bnf")

        /**
         * Must be "grammar" to identify this format type
         *
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("grammar")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * Returns the raw JSON value of [bnf].
         *
         * Unlike [bnf], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bnf") @ExcludeMissing fun _bnf(): JsonField<Bnf> = bnf

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
             * Returns a mutable builder for constructing an instance of [GrammarResponseFormat].
             *
             * The following fields are required:
             * ```kotlin
             * .bnf()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [GrammarResponseFormat]. */
        class Builder internal constructor() {

            private var bnf: JsonField<Bnf>? = null
            private var type: JsonValue = JsonValue.from("grammar")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(grammarResponseFormat: GrammarResponseFormat) = apply {
                bnf = grammarResponseFormat.bnf
                type = grammarResponseFormat.type
                additionalProperties = grammarResponseFormat.additionalProperties.toMutableMap()
            }

            /** The BNF grammar specification the response should conform to */
            fun bnf(bnf: Bnf) = bnf(JsonField.of(bnf))

            /**
             * Sets [Builder.bnf] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bnf] with a well-typed [Bnf] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun bnf(bnf: JsonField<Bnf>) = apply { this.bnf = bnf }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("grammar")
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
             * Returns an immutable instance of [GrammarResponseFormat].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .bnf()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): GrammarResponseFormat =
                GrammarResponseFormat(
                    checkRequired("bnf", bnf),
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

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
            (bnf.asKnown()?.validity() ?: 0) +
                type.let { if (it == JsonValue.from("grammar")) 1 else 0 }

        /** The BNF grammar specification the response should conform to */
        class Bnf
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Bnf]. */
                fun builder() = Builder()
            }

            /** A builder for [Bnf]. */
            class Builder internal constructor() {

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

                /**
                 * Returns an immutable instance of [Bnf].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Bnf = Bnf(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Bnf = apply {
                if (validated) {
                    return@apply
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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

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
