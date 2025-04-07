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
import com.llama.llamastack.core.allMaxBy
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Collections
import java.util.Objects

class ToolParamDefinition
private constructor(
    private val paramType: JsonField<String>,
    private val default: JsonField<Default>,
    private val description: JsonField<String>,
    private val required: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("param_type") @ExcludeMissing paramType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("default") @ExcludeMissing default: JsonField<Default> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("required") @ExcludeMissing required: JsonField<Boolean> = JsonMissing.of(),
    ) : this(paramType, default, description, required, mutableMapOf())

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paramType(): String = paramType.getRequired("param_type")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun default(): Default? = default.getNullable("default")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun description(): String? = description.getNullable("description")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun required(): Boolean? = required.getNullable("required")

    /**
     * Returns the raw JSON value of [paramType].
     *
     * Unlike [paramType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("param_type") @ExcludeMissing fun _paramType(): JsonField<String> = paramType

    /**
     * Returns the raw JSON value of [default].
     *
     * Unlike [default], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("default") @ExcludeMissing fun _default(): JsonField<Default> = default

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [required].
     *
     * Unlike [required], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("required") @ExcludeMissing fun _required(): JsonField<Boolean> = required

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
         * Returns a mutable builder for constructing an instance of [ToolParamDefinition].
         *
         * The following fields are required:
         * ```kotlin
         * .paramType()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ToolParamDefinition]. */
    class Builder internal constructor() {

        private var paramType: JsonField<String>? = null
        private var default: JsonField<Default> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var required: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(toolParamDefinition: ToolParamDefinition) = apply {
            paramType = toolParamDefinition.paramType
            default = toolParamDefinition.default
            description = toolParamDefinition.description
            required = toolParamDefinition.required
            additionalProperties = toolParamDefinition.additionalProperties.toMutableMap()
        }

        fun paramType(paramType: String) = paramType(JsonField.of(paramType))

        /**
         * Sets [Builder.paramType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paramType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun paramType(paramType: JsonField<String>) = apply { this.paramType = paramType }

        fun default(default: Default?) = default(JsonField.ofNullable(default))

        /**
         * Sets [Builder.default] to an arbitrary JSON value.
         *
         * You should usually call [Builder.default] with a well-typed [Default] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun default(default: JsonField<Default>) = apply { this.default = default }

        /** Alias for calling [default] with `Default.ofBoolean(boolean)`. */
        fun default(boolean: Boolean) = default(Default.ofBoolean(boolean))

        /** Alias for calling [default] with `Default.ofDouble(double)`. */
        fun default(double: Double) = default(Default.ofDouble(double))

        /** Alias for calling [default] with `Default.ofString(string)`. */
        fun default(string: String) = default(Default.ofString(string))

        /** Alias for calling [default] with `Default.ofJsonValues(jsonValues)`. */
        fun defaultOfJsonValues(jsonValues: List<JsonValue>) =
            default(Default.ofJsonValues(jsonValues))

        /** Alias for calling [default] with `Default.ofJsonValue(jsonValue)`. */
        fun default(jsonValue: JsonValue) = default(Default.ofJsonValue(jsonValue))

        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun required(required: Boolean) = required(JsonField.of(required))

        /**
         * Sets [Builder.required] to an arbitrary JSON value.
         *
         * You should usually call [Builder.required] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun required(required: JsonField<Boolean>) = apply { this.required = required }

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
         * Returns an immutable instance of [ToolParamDefinition].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .paramType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ToolParamDefinition =
            ToolParamDefinition(
                checkRequired("paramType", paramType),
                default,
                description,
                required,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ToolParamDefinition = apply {
        if (validated) {
            return@apply
        }

        paramType()
        default()?.validate()
        description()
        required()
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
        (if (paramType.asKnown() == null) 0 else 1) +
            (default.asKnown()?.validity() ?: 0) +
            (if (description.asKnown() == null) 0 else 1) +
            (if (required.asKnown() == null) 0 else 1)

    @JsonDeserialize(using = Default.Deserializer::class)
    @JsonSerialize(using = Default.Serializer::class)
    class Default
    private constructor(
        private val boolean: Boolean? = null,
        private val double: Double? = null,
        private val string: String? = null,
        private val jsonValues: List<JsonValue>? = null,
        private val jsonValue: JsonValue? = null,
        private val _json: JsonValue? = null,
    ) {

        fun boolean(): Boolean? = boolean

        fun double(): Double? = double

        fun string(): String? = string

        fun jsonValues(): List<JsonValue>? = jsonValues

        fun jsonValue(): JsonValue? = jsonValue

        fun isBoolean(): Boolean = boolean != null

        fun isDouble(): Boolean = double != null

        fun isString(): Boolean = string != null

        fun isJsonValues(): Boolean = jsonValues != null

        fun isJsonValue(): Boolean = jsonValue != null

        fun asBoolean(): Boolean = boolean.getOrThrow("boolean")

        fun asDouble(): Double = double.getOrThrow("double")

        fun asString(): String = string.getOrThrow("string")

        fun asJsonValues(): List<JsonValue> = jsonValues.getOrThrow("jsonValues")

        fun asJsonValue(): JsonValue = jsonValue.getOrThrow("jsonValue")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                boolean != null -> visitor.visitBoolean(boolean)
                double != null -> visitor.visitDouble(double)
                string != null -> visitor.visitString(string)
                jsonValues != null -> visitor.visitJsonValues(jsonValues)
                jsonValue != null -> visitor.visitJsonValue(jsonValue)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Default = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitBoolean(boolean: Boolean) {}

                    override fun visitDouble(double: Double) {}

                    override fun visitString(string: String) {}

                    override fun visitJsonValues(jsonValues: List<JsonValue>) {}

                    override fun visitJsonValue(jsonValue: JsonValue) {}
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitBoolean(boolean: Boolean) = 1

                    override fun visitDouble(double: Double) = 1

                    override fun visitString(string: String) = 1

                    override fun visitJsonValues(jsonValues: List<JsonValue>) = jsonValues.size

                    override fun visitJsonValue(jsonValue: JsonValue) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Default && boolean == other.boolean && double == other.double && string == other.string && jsonValues == other.jsonValues && jsonValue == other.jsonValue /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(boolean, double, string, jsonValues, jsonValue) /* spotless:on */

        override fun toString(): String =
            when {
                boolean != null -> "Default{boolean=$boolean}"
                double != null -> "Default{double=$double}"
                string != null -> "Default{string=$string}"
                jsonValues != null -> "Default{jsonValues=$jsonValues}"
                jsonValue != null -> "Default{jsonValue=$jsonValue}"
                _json != null -> "Default{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Default")
            }

        companion object {

            fun ofBoolean(boolean: Boolean) = Default(boolean = boolean)

            fun ofDouble(double: Double) = Default(double = double)

            fun ofString(string: String) = Default(string = string)

            fun ofJsonValues(jsonValues: List<JsonValue>) = Default(jsonValues = jsonValues)

            fun ofJsonValue(jsonValue: JsonValue) = Default(jsonValue = jsonValue)
        }

        /**
         * An interface that defines how to map each variant of [Default] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitBoolean(boolean: Boolean): T

            fun visitDouble(double: Double): T

            fun visitString(string: String): T

            fun visitJsonValues(jsonValues: List<JsonValue>): T

            fun visitJsonValue(jsonValue: JsonValue): T

            /**
             * Maps an unknown variant of [Default] to a value of type [T].
             *
             * An instance of [Default] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws LlamaStackClientInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown Default: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Default>(Default::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Default {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<Boolean>())?.let {
                                Default(boolean = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                Default(double = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                Default(string = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<List<JsonValue>>())?.let {
                                Default(jsonValues = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<JsonValue>())?.let {
                                Default(jsonValue = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants.
                    0 -> Default(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Default>(Default::class) {

            override fun serialize(
                value: Default,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.boolean != null -> generator.writeObject(value.boolean)
                    value.double != null -> generator.writeObject(value.double)
                    value.string != null -> generator.writeObject(value.string)
                    value.jsonValues != null -> generator.writeObject(value.jsonValues)
                    value.jsonValue != null -> generator.writeObject(value.jsonValue)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Default")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ToolParamDefinition && paramType == other.paramType && default == other.default && description == other.description && required == other.required && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(paramType, default, description, required, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ToolParamDefinition{paramType=$paramType, default=$default, description=$description, required=$required, additionalProperties=$additionalProperties}"
}
