// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
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
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Objects

@JsonDeserialize(builder = ToolParamDefinition.Builder::class)
@NoAutoDetect
class ToolParamDefinition
private constructor(
    private val default: JsonField<Default>,
    private val description: JsonField<String>,
    private val paramType: JsonField<String>,
    private val required: JsonField<Boolean>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun default(): Default? = default.getNullable("default")

    fun description(): String? = description.getNullable("description")

    fun paramType(): String = paramType.getRequired("param_type")

    fun required(): Boolean? = required.getNullable("required")

    @JsonProperty("default") @ExcludeMissing fun _default() = default

    @JsonProperty("description") @ExcludeMissing fun _description() = description

    @JsonProperty("param_type") @ExcludeMissing fun _paramType() = paramType

    @JsonProperty("required") @ExcludeMissing fun _required() = required

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ToolParamDefinition = apply {
        if (!validated) {
            default()
            description()
            paramType()
            required()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var default: JsonField<Default> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var paramType: JsonField<String> = JsonMissing.of()
        private var required: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(toolParamDefinition: ToolParamDefinition) = apply {
            this.default = toolParamDefinition.default
            this.description = toolParamDefinition.description
            this.paramType = toolParamDefinition.paramType
            this.required = toolParamDefinition.required
            additionalProperties(toolParamDefinition.additionalProperties)
        }

        fun default(default: Default) = default(JsonField.of(default))

        @JsonProperty("default")
        @ExcludeMissing
        fun default(default: JsonField<Default>) = apply { this.default = default }

        fun description(description: String) = description(JsonField.of(description))

        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun paramType(paramType: String) = paramType(JsonField.of(paramType))

        @JsonProperty("param_type")
        @ExcludeMissing
        fun paramType(paramType: JsonField<String>) = apply { this.paramType = paramType }

        fun required(required: Boolean) = required(JsonField.of(required))

        @JsonProperty("required")
        @ExcludeMissing
        fun required(required: JsonField<Boolean>) = apply { this.required = required }

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

        fun build(): ToolParamDefinition =
            ToolParamDefinition(
                default,
                description,
                paramType,
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

        private var validated: Boolean = false

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

        fun validate(): Default = apply {
            if (!validated) {
                if (
                    boolean == null &&
                        double == null &&
                        string == null &&
                        jsonValues == null &&
                        jsonValue == null
                ) {
                    throw LlamaStackClientInvalidDataException("Unknown Default: $_json")
                }
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Default && this.boolean == other.boolean && this.double == other.double && this.string == other.string && this.jsonValues == other.jsonValues && this.jsonValue == other.jsonValue /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(boolean, double, string, jsonValues, jsonValue) /* spotless:on */
        }

        override fun toString(): String {
            return when {
                boolean != null -> "Default{boolean=$boolean}"
                double != null -> "Default{double=$double}"
                string != null -> "Default{string=$string}"
                jsonValues != null -> "Default{jsonValues=$jsonValues}"
                jsonValue != null -> "Default{jsonValue=$jsonValue}"
                _json != null -> "Default{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Default")
            }
        }

        companion object {

            fun ofBoolean(boolean: Boolean) = Default(boolean = boolean)

            fun ofDouble(double: Double) = Default(double = double)

            fun ofString(string: String) = Default(string = string)

            fun ofJsonValues(jsonValues: List<JsonValue>) = Default(jsonValues = jsonValues)

            fun ofJsonValue(jsonValue: JsonValue) = Default(jsonValue = jsonValue)
        }

        interface Visitor<out T> {

            fun visitBoolean(boolean: Boolean): T

            fun visitDouble(double: Double): T

            fun visitString(string: String): T

            fun visitJsonValues(jsonValues: List<JsonValue>): T

            fun visitJsonValue(jsonValue: JsonValue): T

            fun unknown(json: JsonValue?): T {
                throw LlamaStackClientInvalidDataException("Unknown Default: $json")
            }
        }

        class Deserializer : BaseDeserializer<Default>(Default::class) {

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

        class Serializer : BaseSerializer<Default>(Default::class) {

            override fun serialize(
                value: Default,
                generator: JsonGenerator,
                provider: SerializerProvider
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

        return /* spotless:off */ other is ToolParamDefinition && this.default == other.default && this.description == other.description && this.paramType == other.paramType && this.required == other.required && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(default, description, paramType, required, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "ToolParamDefinition{default=$default, description=$description, paramType=$paramType, required=$required, additionalProperties=$additionalProperties}"
}
