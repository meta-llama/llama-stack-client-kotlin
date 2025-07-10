// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.llama.llamastack.core.ExcludeMissing
import com.llama.llamastack.core.JsonField
import com.llama.llamastack.core.JsonMissing
import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Collections
import java.util.Objects

class ToolGroup
private constructor(
    private val identifier: JsonField<String>,
    private val providerId: JsonField<String>,
    private val type: JsonValue,
    private val args: JsonField<Args>,
    private val mcpEndpoint: JsonField<McpEndpoint>,
    private val providerResourceId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("identifier")
        @ExcludeMissing
        identifier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("provider_id")
        @ExcludeMissing
        providerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        @JsonProperty("args") @ExcludeMissing args: JsonField<Args> = JsonMissing.of(),
        @JsonProperty("mcp_endpoint")
        @ExcludeMissing
        mcpEndpoint: JsonField<McpEndpoint> = JsonMissing.of(),
        @JsonProperty("provider_resource_id")
        @ExcludeMissing
        providerResourceId: JsonField<String> = JsonMissing.of(),
    ) : this(identifier, providerId, type, args, mcpEndpoint, providerResourceId, mutableMapOf())

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun identifier(): String = identifier.getRequired("identifier")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun providerId(): String = providerId.getRequired("provider_id")

    /**
     * Expected to always return the following:
     * ```kotlin
     * JsonValue.from("tool_group")
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
    fun args(): Args? = args.getNullable("args")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun mcpEndpoint(): McpEndpoint? = mcpEndpoint.getNullable("mcp_endpoint")

    /**
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun providerResourceId(): String? = providerResourceId.getNullable("provider_resource_id")

    /**
     * Returns the raw JSON value of [identifier].
     *
     * Unlike [identifier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("identifier") @ExcludeMissing fun _identifier(): JsonField<String> = identifier

    /**
     * Returns the raw JSON value of [providerId].
     *
     * Unlike [providerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("provider_id") @ExcludeMissing fun _providerId(): JsonField<String> = providerId

    /**
     * Returns the raw JSON value of [args].
     *
     * Unlike [args], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("args") @ExcludeMissing fun _args(): JsonField<Args> = args

    /**
     * Returns the raw JSON value of [mcpEndpoint].
     *
     * Unlike [mcpEndpoint], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mcp_endpoint")
    @ExcludeMissing
    fun _mcpEndpoint(): JsonField<McpEndpoint> = mcpEndpoint

    /**
     * Returns the raw JSON value of [providerResourceId].
     *
     * Unlike [providerResourceId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("provider_resource_id")
    @ExcludeMissing
    fun _providerResourceId(): JsonField<String> = providerResourceId

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
         * Returns a mutable builder for constructing an instance of [ToolGroup].
         *
         * The following fields are required:
         * ```kotlin
         * .identifier()
         * .providerId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ToolGroup]. */
    class Builder internal constructor() {

        private var identifier: JsonField<String>? = null
        private var providerId: JsonField<String>? = null
        private var type: JsonValue = JsonValue.from("tool_group")
        private var args: JsonField<Args> = JsonMissing.of()
        private var mcpEndpoint: JsonField<McpEndpoint> = JsonMissing.of()
        private var providerResourceId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(toolGroup: ToolGroup) = apply {
            identifier = toolGroup.identifier
            providerId = toolGroup.providerId
            type = toolGroup.type
            args = toolGroup.args
            mcpEndpoint = toolGroup.mcpEndpoint
            providerResourceId = toolGroup.providerResourceId
            additionalProperties = toolGroup.additionalProperties.toMutableMap()
        }

        fun identifier(identifier: String) = identifier(JsonField.of(identifier))

        /**
         * Sets [Builder.identifier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.identifier] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun identifier(identifier: JsonField<String>) = apply { this.identifier = identifier }

        fun providerId(providerId: String) = providerId(JsonField.of(providerId))

        /**
         * Sets [Builder.providerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.providerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

        /**
         * Sets the field to an arbitrary JSON value.
         *
         * It is usually unnecessary to call this method because the field defaults to the
         * following:
         * ```kotlin
         * JsonValue.from("tool_group")
         * ```
         *
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun type(type: JsonValue) = apply { this.type = type }

        fun args(args: Args) = args(JsonField.of(args))

        /**
         * Sets [Builder.args] to an arbitrary JSON value.
         *
         * You should usually call [Builder.args] with a well-typed [Args] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun args(args: JsonField<Args>) = apply { this.args = args }

        fun mcpEndpoint(mcpEndpoint: McpEndpoint) = mcpEndpoint(JsonField.of(mcpEndpoint))

        /**
         * Sets [Builder.mcpEndpoint] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mcpEndpoint] with a well-typed [McpEndpoint] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun mcpEndpoint(mcpEndpoint: JsonField<McpEndpoint>) = apply {
            this.mcpEndpoint = mcpEndpoint
        }

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
         * Returns an immutable instance of [ToolGroup].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .identifier()
         * .providerId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ToolGroup =
            ToolGroup(
                checkRequired("identifier", identifier),
                checkRequired("providerId", providerId),
                type,
                args,
                mcpEndpoint,
                providerResourceId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ToolGroup = apply {
        if (validated) {
            return@apply
        }

        identifier()
        providerId()
        _type().let {
            if (it != JsonValue.from("tool_group")) {
                throw LlamaStackClientInvalidDataException("'type' is invalid, received $it")
            }
        }
        args()?.validate()
        mcpEndpoint()?.validate()
        providerResourceId()
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
        (if (identifier.asKnown() == null) 0 else 1) +
            (if (providerId.asKnown() == null) 0 else 1) +
            type.let { if (it == JsonValue.from("tool_group")) 1 else 0 } +
            (args.asKnown()?.validity() ?: 0) +
            (mcpEndpoint.asKnown()?.validity() ?: 0) +
            (if (providerResourceId.asKnown() == null) 0 else 1)

    class Args
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

            /** Returns a mutable builder for constructing an instance of [Args]. */
            fun builder() = Builder()
        }

        /** A builder for [Args]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(args: Args) = apply {
                additionalProperties = args.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Args].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Args = Args(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Args = apply {
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

            return /* spotless:off */ other is Args && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Args{additionalProperties=$additionalProperties}"
    }

    class McpEndpoint
    private constructor(
        private val uri: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("uri") @ExcludeMissing uri: JsonField<String> = JsonMissing.of()
        ) : this(uri, mutableMapOf())

        /**
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun uri(): String = uri.getRequired("uri")

        /**
         * Returns the raw JSON value of [uri].
         *
         * Unlike [uri], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("uri") @ExcludeMissing fun _uri(): JsonField<String> = uri

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
             * Returns a mutable builder for constructing an instance of [McpEndpoint].
             *
             * The following fields are required:
             * ```kotlin
             * .uri()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [McpEndpoint]. */
        class Builder internal constructor() {

            private var uri: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(mcpEndpoint: McpEndpoint) = apply {
                uri = mcpEndpoint.uri
                additionalProperties = mcpEndpoint.additionalProperties.toMutableMap()
            }

            fun uri(uri: String) = uri(JsonField.of(uri))

            /**
             * Sets [Builder.uri] to an arbitrary JSON value.
             *
             * You should usually call [Builder.uri] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun uri(uri: JsonField<String>) = apply { this.uri = uri }

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
             * Returns an immutable instance of [McpEndpoint].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .uri()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): McpEndpoint =
                McpEndpoint(checkRequired("uri", uri), additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): McpEndpoint = apply {
            if (validated) {
                return@apply
            }

            uri()
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
        internal fun validity(): Int = (if (uri.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is McpEndpoint && uri == other.uri && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(uri, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "McpEndpoint{uri=$uri, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ToolGroup && identifier == other.identifier && providerId == other.providerId && type == other.type && args == other.args && mcpEndpoint == other.mcpEndpoint && providerResourceId == other.providerResourceId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(identifier, providerId, type, args, mcpEndpoint, providerResourceId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ToolGroup{identifier=$identifier, providerId=$providerId, type=$type, args=$args, mcpEndpoint=$mcpEndpoint, providerResourceId=$providerResourceId, additionalProperties=$additionalProperties}"
}
