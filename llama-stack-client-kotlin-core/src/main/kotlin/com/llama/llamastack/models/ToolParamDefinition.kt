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

@NoAutoDetect
class ToolParamDefinition
@JsonCreator
private constructor(
    @JsonProperty("param_type")
    @ExcludeMissing
    private val paramType: JsonField<String> = JsonMissing.of(),
    @JsonProperty("default")
    @ExcludeMissing
    private val default: JsonField<Default> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("required")
    @ExcludeMissing
    private val required: JsonField<Boolean> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun paramType(): String = paramType.getRequired("param_type")

    fun default(): Default? = default.getNullable("default")

    fun description(): String? = description.getNullable("description")

    fun required(): Boolean? = required.getNullable("required")

    @JsonProperty("param_type") @ExcludeMissing fun _paramType(): JsonField<String> = paramType

    @JsonProperty("default") @ExcludeMissing fun _default(): JsonField<Default> = default

    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    @JsonProperty("required") @ExcludeMissing fun _required(): JsonField<Boolean> = required

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

    fun toBuilder() = Builder().from(this)

    companion object {

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

        fun paramType(paramType: JsonField<String>) = apply { this.paramType = paramType }

        fun default(default: Default?) = default(JsonField.ofNullable(default))

        fun default(default: JsonField<Default>) = apply { this.default = default }

        fun default(boolean: Boolean) = default(Default.ofBoolean(boolean))

        fun default(double: Double) = default(Default.ofDouble(double))

        fun default(string: String) = default(Default.ofString(string))

        fun defaultOfJsonValues(jsonValues: List<JsonValue>) =
            default(Default.ofJsonValues(jsonValues))

        fun default(jsonValue: JsonValue) = default(Default.ofJsonValue(jsonValue))

        fun description(description: String) = description(JsonField.of(description))

        fun description(description: JsonField<String>) = apply { this.description = description }

        fun required(required: Boolean) = required(JsonField.of(required))

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

        fun build(): ToolParamDefinition =
            ToolParamDefinition(
                checkRequired("paramType", paramType),
                default,
                description,
                required,
                additionalProperties.toImmutable(),
            )
    }

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

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                boolean != null -> visitor.visitBoolean(boolean)
                double != null -> visitor.visitDouble(double)
                string != null -> visitor.visitString(string)
                jsonValues != null -> visitor.visitJsonValues(jsonValues)
                jsonValue != null -> visitor.visitJsonValue(jsonValue)
                else -> visitor.unknown(_json)
            }
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

                tryDeserialize(node, jacksonTypeRef<Boolean>())?.let {
                    return Default(boolean = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                    return Default(double = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                    return Default(string = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<List<JsonValue>>())?.let {
                    return Default(jsonValues = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<JsonValue>())?.let {
                    return Default(jsonValue = it, _json = json)
                }

                return Default(_json = json)
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
