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
class ToolDef
@JsonCreator
private constructor(
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("parameters")
    @ExcludeMissing
    private val parameters: JsonField<List<Parameter>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun name(): String = name.getRequired("name")

    fun description(): String? = description.getNullable("description")

    fun metadata(): Metadata? = metadata.getNullable("metadata")

    fun parameters(): List<Parameter>? = parameters.getNullable("parameters")

    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    @JsonProperty("parameters")
    @ExcludeMissing
    fun _parameters(): JsonField<List<Parameter>> = parameters

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ToolDef = apply {
        if (validated) {
            return@apply
        }

        name()
        description()
        metadata()?.validate()
        parameters()?.forEach { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [ToolDef]. */
    class Builder internal constructor() {

        private var name: JsonField<String>? = null
        private var description: JsonField<String> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var parameters: JsonField<MutableList<Parameter>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(toolDef: ToolDef) = apply {
            name = toolDef.name
            description = toolDef.description
            metadata = toolDef.metadata
            parameters = toolDef.parameters.map { it.toMutableList() }
            additionalProperties = toolDef.additionalProperties.toMutableMap()
        }

        fun name(name: String) = name(JsonField.of(name))

        fun name(name: JsonField<String>) = apply { this.name = name }

        fun description(description: String) = description(JsonField.of(description))

        fun description(description: JsonField<String>) = apply { this.description = description }

        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        fun parameters(parameters: List<Parameter>) = parameters(JsonField.of(parameters))

        fun parameters(parameters: JsonField<List<Parameter>>) = apply {
            this.parameters = parameters.map { it.toMutableList() }
        }

        fun addParameter(parameter: Parameter) = apply {
            parameters =
                (parameters ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(parameter)
                }
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

        fun build(): ToolDef =
            ToolDef(
                checkRequired("name", name),
                description,
                metadata,
                (parameters ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Metadata
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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

            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Parameter
    @JsonCreator
    private constructor(
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("parameter_type")
        @ExcludeMissing
        private val parameterType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("required")
        @ExcludeMissing
        private val required: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("default")
        @ExcludeMissing
        private val default: JsonField<Default> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun description(): String = description.getRequired("description")

        fun name(): String = name.getRequired("name")

        fun parameterType(): String = parameterType.getRequired("parameter_type")

        fun required(): Boolean = required.getRequired("required")

        fun default(): Default? = default.getNullable("default")

        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonProperty("parameter_type")
        @ExcludeMissing
        fun _parameterType(): JsonField<String> = parameterType

        @JsonProperty("required") @ExcludeMissing fun _required(): JsonField<Boolean> = required

        @JsonProperty("default") @ExcludeMissing fun _default(): JsonField<Default> = default

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Parameter = apply {
            if (validated) {
                return@apply
            }

            description()
            name()
            parameterType()
            required()
            default()?.validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [Parameter]. */
        class Builder internal constructor() {

            private var description: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var parameterType: JsonField<String>? = null
            private var required: JsonField<Boolean>? = null
            private var default: JsonField<Default> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(parameter: Parameter) = apply {
                description = parameter.description
                name = parameter.name
                parameterType = parameter.parameterType
                required = parameter.required
                default = parameter.default
                additionalProperties = parameter.additionalProperties.toMutableMap()
            }

            fun description(description: String) = description(JsonField.of(description))

            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun name(name: String) = name(JsonField.of(name))

            fun name(name: JsonField<String>) = apply { this.name = name }

            fun parameterType(parameterType: String) = parameterType(JsonField.of(parameterType))

            fun parameterType(parameterType: JsonField<String>) = apply {
                this.parameterType = parameterType
            }

            fun required(required: Boolean) = required(JsonField.of(required))

            fun required(required: JsonField<Boolean>) = apply { this.required = required }

            fun default(default: Default?) = default(JsonField.ofNullable(default))

            fun default(default: JsonField<Default>) = apply { this.default = default }

            fun default(boolean: Boolean) = default(Default.ofBoolean(boolean))

            fun default(double: Double) = default(Default.ofDouble(double))

            fun default(string: String) = default(Default.ofString(string))

            fun defaultOfJsonValues(jsonValues: List<JsonValue>) =
                default(Default.ofJsonValues(jsonValues))

            fun default(jsonValue: JsonValue) = default(Default.ofJsonValue(jsonValue))

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

            fun build(): Parameter =
                Parameter(
                    checkRequired("description", description),
                    checkRequired("name", name),
                    checkRequired("parameterType", parameterType),
                    checkRequired("required", required),
                    default,
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
             * An interface that defines how to map each variant of [Default] to a value of type
             * [T].
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
                 * An instance of [Default] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
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

            return /* spotless:off */ other is Parameter && description == other.description && name == other.name && parameterType == other.parameterType && required == other.required && default == other.default && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(description, name, parameterType, required, default, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Parameter{description=$description, name=$name, parameterType=$parameterType, required=$required, default=$default, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ToolDef && name == other.name && description == other.description && metadata == other.metadata && parameters == other.parameters && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(name, description, metadata, parameters, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ToolDef{name=$name, description=$description, metadata=$metadata, parameters=$parameters, additionalProperties=$additionalProperties}"
}
