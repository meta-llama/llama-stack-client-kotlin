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
import com.llama.llamastack.core.allMaxBy
import com.llama.llamastack.core.checkKnown
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.getOrThrow
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Collections
import java.util.Objects

class Tool
private constructor(
    private val description: JsonField<String>,
    private val identifier: JsonField<String>,
    private val parameters: JsonField<List<Parameter>>,
    private val providerId: JsonField<String>,
    private val providerResourceId: JsonField<String>,
    private val toolHost: JsonField<ToolHost>,
    private val toolgroupId: JsonField<String>,
    private val type: JsonValue,
    private val metadata: JsonField<Metadata>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("identifier")
        @ExcludeMissing
        identifier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("parameters")
        @ExcludeMissing
        parameters: JsonField<List<Parameter>> = JsonMissing.of(),
        @JsonProperty("provider_id")
        @ExcludeMissing
        providerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("provider_resource_id")
        @ExcludeMissing
        providerResourceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tool_host") @ExcludeMissing toolHost: JsonField<ToolHost> = JsonMissing.of(),
        @JsonProperty("toolgroup_id")
        @ExcludeMissing
        toolgroupId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
    ) : this(
        description,
        identifier,
        parameters,
        providerId,
        providerResourceId,
        toolHost,
        toolgroupId,
        type,
        metadata,
        mutableMapOf(),
    )

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = description.getRequired("description")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun identifier(): String = identifier.getRequired("identifier")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun parameters(): List<Parameter> = parameters.getRequired("parameters")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun providerId(): String = providerId.getRequired("provider_id")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun providerResourceId(): String = providerResourceId.getRequired("provider_resource_id")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun toolHost(): ToolHost = toolHost.getRequired("tool_host")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun toolgroupId(): String = toolgroupId.getRequired("toolgroup_id")

    /**
     * Expected to always return the following:
     * ```kotlin
     * JsonValue.from("tool")
     * ```
     *
     * However, this method can be useful for debugging and logging (e.g. if the server responded
     * with an unexpected value).
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun metadata(): Metadata? = metadata.getNullable("metadata")

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [identifier].
     *
     * Unlike [identifier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("identifier") @ExcludeMissing fun _identifier(): JsonField<String> = identifier

    /**
     * Returns the raw JSON value of [parameters].
     *
     * Unlike [parameters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parameters")
    @ExcludeMissing
    fun _parameters(): JsonField<List<Parameter>> = parameters

    /**
     * Returns the raw JSON value of [providerId].
     *
     * Unlike [providerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("provider_id") @ExcludeMissing fun _providerId(): JsonField<String> = providerId

    /**
     * Returns the raw JSON value of [providerResourceId].
     *
     * Unlike [providerResourceId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("provider_resource_id")
    @ExcludeMissing
    fun _providerResourceId(): JsonField<String> = providerResourceId

    /**
     * Returns the raw JSON value of [toolHost].
     *
     * Unlike [toolHost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tool_host") @ExcludeMissing fun _toolHost(): JsonField<ToolHost> = toolHost

    /**
     * Returns the raw JSON value of [toolgroupId].
     *
     * Unlike [toolgroupId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("toolgroup_id")
    @ExcludeMissing
    fun _toolgroupId(): JsonField<String> = toolgroupId

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

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
         * Returns a mutable builder for constructing an instance of [Tool].
         *
         * The following fields are required:
         * ```kotlin
         * .description()
         * .identifier()
         * .parameters()
         * .providerId()
         * .providerResourceId()
         * .toolHost()
         * .toolgroupId()
         * ```
         */
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

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun identifier(identifier: String) = identifier(JsonField.of(identifier))

        /**
         * Sets [Builder.identifier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.identifier] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun identifier(identifier: JsonField<String>) = apply { this.identifier = identifier }

        fun parameters(parameters: List<Parameter>) = parameters(JsonField.of(parameters))

        /**
         * Sets [Builder.parameters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parameters] with a well-typed `List<Parameter>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun parameters(parameters: JsonField<List<Parameter>>) = apply {
            this.parameters = parameters.map { it.toMutableList() }
        }

        /**
         * Adds a single [Parameter] to [parameters].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addParameter(parameter: Parameter) = apply {
            parameters =
                (parameters ?: JsonField.of(mutableListOf())).also {
                    checkKnown("parameters", it).add(parameter)
                }
        }

        fun providerId(providerId: String) = providerId(JsonField.of(providerId))

        /**
         * Sets [Builder.providerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.providerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

        fun providerResourceId(providerResourceId: String) =
            providerResourceId(JsonField.of(providerResourceId))

        /**
         * Sets [Builder.providerResourceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.providerResourceId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun providerResourceId(providerResourceId: JsonField<String>) = apply {
            this.providerResourceId = providerResourceId
        }

        fun toolHost(toolHost: ToolHost) = toolHost(JsonField.of(toolHost))

        /**
         * Sets [Builder.toolHost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolHost] with a well-typed [ToolHost] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun toolHost(toolHost: JsonField<ToolHost>) = apply { this.toolHost = toolHost }

        fun toolgroupId(toolgroupId: String) = toolgroupId(JsonField.of(toolgroupId))

        /**
         * Sets [Builder.toolgroupId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolgroupId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun toolgroupId(toolgroupId: JsonField<String>) = apply { this.toolgroupId = toolgroupId }

        /**
         * Sets the field to an arbitrary JSON value.
         *
         * It is usually unnecessary to call this method because the field defaults to the
         * following:
         * ```kotlin
         * JsonValue.from("tool")
         * ```
         *
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun type(type: JsonValue) = apply { this.type = type }

        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
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

        /**
         * Returns an immutable instance of [Tool].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .description()
         * .identifier()
         * .parameters()
         * .providerId()
         * .providerResourceId()
         * .toolHost()
         * .toolgroupId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
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
                additionalProperties.toMutableMap(),
            )
    }

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
        toolHost().validate()
        toolgroupId()
        _type().let {
            if (it != JsonValue.from("tool")) {
                throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
            }
        }
        metadata()?.validate()
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
        (if (description.asKnown() == null) 0 else 1) +
            (if (identifier.asKnown() == null) 0 else 1) +
            (parameters.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (providerId.asKnown() == null) 0 else 1) +
            (if (providerResourceId.asKnown() == null) 0 else 1) +
            (toolHost.asKnown()?.validity() ?: 0) +
            (if (toolgroupId.asKnown() == null) 0 else 1) +
            type.let { if (it == JsonValue.from("tool")) 1 else 0 } +
            (metadata.asKnown()?.validity() ?: 0)

    class Parameter
    private constructor(
        private val description: JsonField<String>,
        private val name: JsonField<String>,
        private val parameterType: JsonField<String>,
        private val required: JsonField<Boolean>,
        private val default: JsonField<Default>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("parameter_type")
            @ExcludeMissing
            parameterType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("required")
            @ExcludeMissing
            required: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("default") @ExcludeMissing default: JsonField<Default> = JsonMissing.of(),
        ) : this(description, name, parameterType, required, default, mutableMapOf())

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun description(): String = description.getRequired("description")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun parameterType(): String = parameterType.getRequired("parameter_type")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun required(): Boolean = required.getRequired("required")

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun default(): Default? = default.getNullable("default")

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [parameterType].
         *
         * Unlike [parameterType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("parameter_type")
        @ExcludeMissing
        fun _parameterType(): JsonField<String> = parameterType

        /**
         * Returns the raw JSON value of [required].
         *
         * Unlike [required], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("required") @ExcludeMissing fun _required(): JsonField<Boolean> = required

        /**
         * Returns the raw JSON value of [default].
         *
         * Unlike [default], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("default") @ExcludeMissing fun _default(): JsonField<Default> = default

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
             * Returns a mutable builder for constructing an instance of [Parameter].
             *
             * The following fields are required:
             * ```kotlin
             * .description()
             * .name()
             * .parameterType()
             * .required()
             * ```
             */
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

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun parameterType(parameterType: String) = parameterType(JsonField.of(parameterType))

            /**
             * Sets [Builder.parameterType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parameterType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun parameterType(parameterType: JsonField<String>) = apply {
                this.parameterType = parameterType
            }

            fun required(required: Boolean) = required(JsonField.of(required))

            /**
             * Sets [Builder.required] to an arbitrary JSON value.
             *
             * You should usually call [Builder.required] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun required(required: JsonField<Boolean>) = apply { this.required = required }

            fun default(default: Default?) = default(JsonField.ofNullable(default))

            /**
             * Sets [Builder.default] to an arbitrary JSON value.
             *
             * You should usually call [Builder.default] with a well-typed [Default] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Parameter].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .description()
             * .name()
             * .parameterType()
             * .required()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Parameter =
                Parameter(
                    checkRequired("description", description),
                    checkRequired("name", name),
                    checkRequired("parameterType", parameterType),
                    checkRequired("required", required),
                    default,
                    additionalProperties.toMutableMap(),
                )
        }

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
            (if (description.asKnown() == null) 0 else 1) +
                (if (name.asKnown() == null) 0 else 1) +
                (if (parameterType.asKnown() == null) 0 else 1) +
                (if (required.asKnown() == null) 0 else 1) +
                (default.asKnown()?.validity() ?: 0)

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
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants.
                        0 -> Default(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
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

        private var validated: Boolean = false

        fun validate(): ToolHost = apply {
            if (validated) {
                return@apply
            }

            known()
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
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ToolHost && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Metadata
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

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
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

            /**
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
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
