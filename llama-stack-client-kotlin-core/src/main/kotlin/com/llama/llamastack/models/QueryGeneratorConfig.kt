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

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            default != null -> visitor.visitDefault(default)
            llm != null -> visitor.visitLlm(llm)
            else -> visitor.unknown(_json)
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
                override fun visitDefault(default: Default) = default.validity()

                override fun visitLlm(llm: Llm) = llm.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

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

    /**
     * An interface that defines how to map each variant of [QueryGeneratorConfig] to a value of
     * type [T].
     */
    interface Visitor<out T> {

        fun visitDefault(default: Default): T

        fun visitLlm(llm: Llm): T

        /**
         * Maps an unknown variant of [QueryGeneratorConfig] to a value of type [T].
         *
         * An instance of [QueryGeneratorConfig] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws LlamaStackClientInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LlamaStackClientInvalidDataException("Unknown QueryGeneratorConfig: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<QueryGeneratorConfig>(QueryGeneratorConfig::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): QueryGeneratorConfig {
            val json = JsonValue.fromJsonNode(node)
            val type = json.asObject()?.get("type")?.asString()

            when (type) {
                "default" -> {
                    return tryDeserialize(node, jacksonTypeRef<Default>())?.let {
                        QueryGeneratorConfig(default = it, _json = json)
                    } ?: QueryGeneratorConfig(_json = json)
                }
                "llm" -> {
                    return tryDeserialize(node, jacksonTypeRef<Llm>())?.let {
                        QueryGeneratorConfig(llm = it, _json = json)
                    } ?: QueryGeneratorConfig(_json = json)
                }
            }

            return QueryGeneratorConfig(_json = json)
        }
    }

    internal class Serializer : BaseSerializer<QueryGeneratorConfig>(QueryGeneratorConfig::class) {

        override fun serialize(
            value: QueryGeneratorConfig,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.default != null -> generator.writeObject(value.default)
                value.llm != null -> generator.writeObject(value.llm)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid QueryGeneratorConfig")
            }
        }
    }

    class Default
    private constructor(
        private val separator: JsonField<String>,
        private val type: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("separator")
            @ExcludeMissing
            separator: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        ) : this(separator, type, mutableMapOf())

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun separator(): String = separator.getRequired("separator")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("default")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * Returns the raw JSON value of [separator].
         *
         * Unlike [separator], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("separator") @ExcludeMissing fun _separator(): JsonField<String> = separator

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
             * Returns a mutable builder for constructing an instance of [Default].
             *
             * The following fields are required:
             * ```kotlin
             * .separator()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Default]. */
        class Builder internal constructor() {

            private var separator: JsonField<String>? = null
            private var type: JsonValue = JsonValue.from("default")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(default: Default) = apply {
                separator = default.separator
                type = default.type
                additionalProperties = default.additionalProperties.toMutableMap()
            }

            fun separator(separator: String) = separator(JsonField.of(separator))

            /**
             * Sets [Builder.separator] to an arbitrary JSON value.
             *
             * You should usually call [Builder.separator] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun separator(separator: JsonField<String>) = apply { this.separator = separator }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("default")
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
             * Returns an immutable instance of [Default].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .separator()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Default =
                Default(
                    checkRequired("separator", separator),
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Default = apply {
            if (validated) {
                return@apply
            }

            separator()
            _type().let {
                if (it != JsonValue.from("default")) {
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
            (if (separator.asKnown() == null) 0 else 1) +
                type.let { if (it == JsonValue.from("default")) 1 else 0 }

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

    class Llm
    private constructor(
        private val model: JsonField<String>,
        private val template: JsonField<String>,
        private val type: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
            @JsonProperty("template")
            @ExcludeMissing
            template: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        ) : this(model, template, type, mutableMapOf())

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun model(): String = model.getRequired("model")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun template(): String = template.getRequired("template")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("llm")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

        /**
         * Returns the raw JSON value of [template].
         *
         * Unlike [template], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("template") @ExcludeMissing fun _template(): JsonField<String> = template

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
             * Returns a mutable builder for constructing an instance of [Llm].
             *
             * The following fields are required:
             * ```kotlin
             * .model()
             * .template()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Llm]. */
        class Builder internal constructor() {

            private var model: JsonField<String>? = null
            private var template: JsonField<String>? = null
            private var type: JsonValue = JsonValue.from("llm")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(llm: Llm) = apply {
                model = llm.model
                template = llm.template
                type = llm.type
                additionalProperties = llm.additionalProperties.toMutableMap()
            }

            fun model(model: String) = model(JsonField.of(model))

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun model(model: JsonField<String>) = apply { this.model = model }

            fun template(template: String) = template(JsonField.of(template))

            /**
             * Sets [Builder.template] to an arbitrary JSON value.
             *
             * You should usually call [Builder.template] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun template(template: JsonField<String>) = apply { this.template = template }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("llm")
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
             * Returns an immutable instance of [Llm].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .model()
             * .template()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Llm =
                Llm(
                    checkRequired("model", model),
                    checkRequired("template", template),
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Llm = apply {
            if (validated) {
                return@apply
            }

            model()
            template()
            _type().let {
                if (it != JsonValue.from("llm")) {
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
            (if (model.asKnown() == null) 0 else 1) +
                (if (template.asKnown() == null) 0 else 1) +
                type.let { if (it == JsonValue.from("llm")) 1 else 0 }

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
