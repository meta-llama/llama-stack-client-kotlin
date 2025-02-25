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
class Tool
@JsonCreator
private constructor(
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("identifier")
    @ExcludeMissing
    private val identifier: JsonField<String> = JsonMissing.of(),
    @JsonProperty("parameters")
    @ExcludeMissing
    private val parameters: JsonField<List<Parameter>> = JsonMissing.of(),
    @JsonProperty("provider_id")
    @ExcludeMissing
    private val providerId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("provider_resource_id")
    @ExcludeMissing
    private val providerResourceId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("tool_host")
    @ExcludeMissing
    private val toolHost: JsonField<ToolHost> = JsonMissing.of(),
    @JsonProperty("toolgroup_id")
    @ExcludeMissing
    private val toolgroupId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonValue = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun description(): String = description.getRequired("description")

    fun identifier(): String = identifier.getRequired("identifier")

    fun parameters(): List<Parameter> = parameters.getRequired("parameters")

    fun providerId(): String = providerId.getRequired("provider_id")

    fun providerResourceId(): String = providerResourceId.getRequired("provider_resource_id")

    fun toolHost(): ToolHost = toolHost.getRequired("tool_host")

    fun toolgroupId(): String = toolgroupId.getRequired("toolgroup_id")

    @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

    fun metadata(): Metadata? = metadata.getNullable("metadata")

    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    @JsonProperty("identifier") @ExcludeMissing fun _identifier(): JsonField<String> = identifier

    @JsonProperty("parameters")
    @ExcludeMissing
    fun _parameters(): JsonField<List<Parameter>> = parameters

    @JsonProperty("provider_id") @ExcludeMissing fun _providerId(): JsonField<String> = providerId

    @JsonProperty("provider_resource_id")
    @ExcludeMissing
    fun _providerResourceId(): JsonField<String> = providerResourceId

    @JsonProperty("tool_host") @ExcludeMissing fun _toolHost(): JsonField<ToolHost> = toolHost

    @JsonProperty("toolgroup_id")
    @ExcludeMissing
    fun _toolgroupId(): JsonField<String> = toolgroupId

    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Tool = apply {
        if (validated) {
            return@apply
        }

        description()
        identifier()
        parameters().forEach { it.validate() }
        providerId()
        providerResourceId()
        toolHost()
        toolgroupId()
        _type().let {
            if (it != JsonValue.from("tool")) {
                throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
            }
        }
        metadata()?.validate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [Tool]. */
    class Builder internal constructor() {

        private var description: JsonField<String>? = null
        private var identifier: JsonField<String>? = null
        private var parameters: JsonField<MutableList<Parameter>>? = null
        private var providerId: JsonField<String>? = null
        private var providerResourceId: JsonField<String>? = null
        private var toolHost: JsonField<ToolHost>? = null
        private var toolgroupId: JsonField<String>? = null
        private var type: JsonValue = JsonValue.from("tool")
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(tool: Tool) = apply {
            description = tool.description
            identifier = tool.identifier
            parameters = tool.parameters.map { it.toMutableList() }
            providerId = tool.providerId
            providerResourceId = tool.providerResourceId
            toolHost = tool.toolHost
            toolgroupId = tool.toolgroupId
            type = tool.type
            metadata = tool.metadata
            additionalProperties = tool.additionalProperties.toMutableMap()
        }

        fun description(description: String) = description(JsonField.of(description))

        fun description(description: JsonField<String>) = apply { this.description = description }

        fun identifier(identifier: String) = identifier(JsonField.of(identifier))

        fun identifier(identifier: JsonField<String>) = apply { this.identifier = identifier }

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

        fun providerId(providerId: String) = providerId(JsonField.of(providerId))

        fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

        fun providerResourceId(providerResourceId: String) =
            providerResourceId(JsonField.of(providerResourceId))

        fun providerResourceId(providerResourceId: JsonField<String>) = apply {
            this.providerResourceId = providerResourceId
        }

        fun toolHost(toolHost: ToolHost) = toolHost(JsonField.of(toolHost))

        fun toolHost(toolHost: JsonField<ToolHost>) = apply { this.toolHost = toolHost }

        fun toolgroupId(toolgroupId: String) = toolgroupId(JsonField.of(toolgroupId))

        fun toolgroupId(toolgroupId: JsonField<String>) = apply { this.toolgroupId = toolgroupId }

        fun type(type: JsonValue) = apply { this.type = type }

        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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

        fun build(): Tool =
            Tool(
                checkRequired("description", description),
                checkRequired("identifier", identifier),
                checkRequired("parameters", parameters).map { it.toImmutable() },
                checkRequired("providerId", providerId),
                checkRequired("providerResourceId", providerResourceId),
                checkRequired("toolHost", toolHost),
                checkRequired("toolgroupId", toolgroupId),
                type,
                metadata,
                additionalProperties.toImmutable(),
            )
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

    class ToolHost @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val DISTRIBUTION = of("distribution")

            val CLIENT = of("client")

            val MODEL_CONTEXT_PROTOCOL = of("model_context_protocol")

            fun of(value: String) = ToolHost(JsonField.of(value))
        }

        /** An enum containing [ToolHost]'s known values. */
        enum class Known {
            DISTRIBUTION,
            CLIENT,
            MODEL_CONTEXT_PROTOCOL,
        }

        /**
         * An enum containing [ToolHost]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ToolHost] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DISTRIBUTION,
            CLIENT,
            MODEL_CONTEXT_PROTOCOL,
            /** An enum member indicating that [ToolHost] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                DISTRIBUTION -> Value.DISTRIBUTION
                CLIENT -> Value.CLIENT
                MODEL_CONTEXT_PROTOCOL -> Value.MODEL_CONTEXT_PROTOCOL
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LlamaStackClientInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                DISTRIBUTION -> Known.DISTRIBUTION
                CLIENT -> Known.CLIENT
                MODEL_CONTEXT_PROTOCOL -> Known.MODEL_CONTEXT_PROTOCOL
                else -> throw LlamaStackClientInvalidDataException("Unknown ToolHost: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LlamaStackClientInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString()
                ?: throw LlamaStackClientInvalidDataException("Value is not a String")

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ToolHost && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Tool && description == other.description && identifier == other.identifier && parameters == other.parameters && providerId == other.providerId && providerResourceId == other.providerResourceId && toolHost == other.toolHost && toolgroupId == other.toolgroupId && type == other.type && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(description, identifier, parameters, providerId, providerResourceId, toolHost, toolgroupId, type, metadata, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Tool{description=$description, identifier=$identifier, parameters=$parameters, providerId=$providerId, providerResourceId=$providerResourceId, toolHost=$toolHost, toolgroupId=$toolgroupId, type=$type, metadata=$metadata, additionalProperties=$additionalProperties}"
}
