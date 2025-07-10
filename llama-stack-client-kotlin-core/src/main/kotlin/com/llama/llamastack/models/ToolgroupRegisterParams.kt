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
import com.llama.llamastack.core.Params
import com.llama.llamastack.core.checkRequired
import com.llama.llamastack.core.http.Headers
import com.llama.llamastack.core.http.QueryParams
import com.llama.llamastack.core.toImmutable
import com.llama.llamastack.errors.LlamaStackClientInvalidDataException
import java.util.Collections
import java.util.Objects

/** Register a tool group. */
class ToolgroupRegisterParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The ID of the provider to use for the tool group.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun providerId(): String = body.providerId()

    /**
     * The ID of the tool group to register.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun toolgroupId(): String = body.toolgroupId()

    /**
     * A dictionary of arguments to pass to the tool group.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun args(): Args? = body.args()

    /**
     * The MCP endpoint to use for the tool group.
     *
     * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun mcpEndpoint(): McpEndpoint? = body.mcpEndpoint()

    /**
     * Returns the raw JSON value of [providerId].
     *
     * Unlike [providerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _providerId(): JsonField<String> = body._providerId()

    /**
     * Returns the raw JSON value of [toolgroupId].
     *
     * Unlike [toolgroupId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _toolgroupId(): JsonField<String> = body._toolgroupId()

    /**
     * Returns the raw JSON value of [args].
     *
     * Unlike [args], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _args(): JsonField<Args> = body._args()

    /**
     * Returns the raw JSON value of [mcpEndpoint].
     *
     * Unlike [mcpEndpoint], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _mcpEndpoint(): JsonField<McpEndpoint> = body._mcpEndpoint()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ToolgroupRegisterParams].
         *
         * The following fields are required:
         * ```kotlin
         * .providerId()
         * .toolgroupId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ToolgroupRegisterParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(toolgroupRegisterParams: ToolgroupRegisterParams) = apply {
            body = toolgroupRegisterParams.body.toBuilder()
            additionalHeaders = toolgroupRegisterParams.additionalHeaders.toBuilder()
            additionalQueryParams = toolgroupRegisterParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [providerId]
         * - [toolgroupId]
         * - [args]
         * - [mcpEndpoint]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The ID of the provider to use for the tool group. */
        fun providerId(providerId: String) = apply { body.providerId(providerId) }

        /**
         * Sets [Builder.providerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.providerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun providerId(providerId: JsonField<String>) = apply { body.providerId(providerId) }

        /** The ID of the tool group to register. */
        fun toolgroupId(toolgroupId: String) = apply { body.toolgroupId(toolgroupId) }

        /**
         * Sets [Builder.toolgroupId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toolgroupId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun toolgroupId(toolgroupId: JsonField<String>) = apply { body.toolgroupId(toolgroupId) }

        /** A dictionary of arguments to pass to the tool group. */
        fun args(args: Args) = apply { body.args(args) }

        /**
         * Sets [Builder.args] to an arbitrary JSON value.
         *
         * You should usually call [Builder.args] with a well-typed [Args] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun args(args: JsonField<Args>) = apply { body.args(args) }

        /** The MCP endpoint to use for the tool group. */
        fun mcpEndpoint(mcpEndpoint: McpEndpoint) = apply { body.mcpEndpoint(mcpEndpoint) }

        /**
         * Sets [Builder.mcpEndpoint] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mcpEndpoint] with a well-typed [McpEndpoint] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun mcpEndpoint(mcpEndpoint: JsonField<McpEndpoint>) = apply {
            body.mcpEndpoint(mcpEndpoint)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [ToolgroupRegisterParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .providerId()
         * .toolgroupId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ToolgroupRegisterParams =
            ToolgroupRegisterParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val providerId: JsonField<String>,
        private val toolgroupId: JsonField<String>,
        private val args: JsonField<Args>,
        private val mcpEndpoint: JsonField<McpEndpoint>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("provider_id")
            @ExcludeMissing
            providerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("toolgroup_id")
            @ExcludeMissing
            toolgroupId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("args") @ExcludeMissing args: JsonField<Args> = JsonMissing.of(),
            @JsonProperty("mcp_endpoint")
            @ExcludeMissing
            mcpEndpoint: JsonField<McpEndpoint> = JsonMissing.of(),
        ) : this(providerId, toolgroupId, args, mcpEndpoint, mutableMapOf())

        /**
         * The ID of the provider to use for the tool group.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun providerId(): String = providerId.getRequired("provider_id")

        /**
         * The ID of the tool group to register.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun toolgroupId(): String = toolgroupId.getRequired("toolgroup_id")

        /**
         * A dictionary of arguments to pass to the tool group.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun args(): Args? = args.getNullable("args")

        /**
         * The MCP endpoint to use for the tool group.
         *
         * @throws LlamaStackClientInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun mcpEndpoint(): McpEndpoint? = mcpEndpoint.getNullable("mcp_endpoint")

        /**
         * Returns the raw JSON value of [providerId].
         *
         * Unlike [providerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("provider_id")
        @ExcludeMissing
        fun _providerId(): JsonField<String> = providerId

        /**
         * Returns the raw JSON value of [toolgroupId].
         *
         * Unlike [toolgroupId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("toolgroup_id")
        @ExcludeMissing
        fun _toolgroupId(): JsonField<String> = toolgroupId

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .providerId()
             * .toolgroupId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var providerId: JsonField<String>? = null
            private var toolgroupId: JsonField<String>? = null
            private var args: JsonField<Args> = JsonMissing.of()
            private var mcpEndpoint: JsonField<McpEndpoint> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                providerId = body.providerId
                toolgroupId = body.toolgroupId
                args = body.args
                mcpEndpoint = body.mcpEndpoint
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The ID of the provider to use for the tool group. */
            fun providerId(providerId: String) = providerId(JsonField.of(providerId))

            /**
             * Sets [Builder.providerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.providerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

            /** The ID of the tool group to register. */
            fun toolgroupId(toolgroupId: String) = toolgroupId(JsonField.of(toolgroupId))

            /**
             * Sets [Builder.toolgroupId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.toolgroupId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun toolgroupId(toolgroupId: JsonField<String>) = apply {
                this.toolgroupId = toolgroupId
            }

            /** A dictionary of arguments to pass to the tool group. */
            fun args(args: Args) = args(JsonField.of(args))

            /**
             * Sets [Builder.args] to an arbitrary JSON value.
             *
             * You should usually call [Builder.args] with a well-typed [Args] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun args(args: JsonField<Args>) = apply { this.args = args }

            /** The MCP endpoint to use for the tool group. */
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .providerId()
             * .toolgroupId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("providerId", providerId),
                    checkRequired("toolgroupId", toolgroupId),
                    args,
                    mcpEndpoint,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            providerId()
            toolgroupId()
            args()?.validate()
            mcpEndpoint()?.validate()
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
            (if (providerId.asKnown() == null) 0 else 1) +
                (if (toolgroupId.asKnown() == null) 0 else 1) +
                (args.asKnown()?.validity() ?: 0) +
                (mcpEndpoint.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && providerId == other.providerId && toolgroupId == other.toolgroupId && args == other.args && mcpEndpoint == other.mcpEndpoint && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(providerId, toolgroupId, args, mcpEndpoint, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{providerId=$providerId, toolgroupId=$toolgroupId, args=$args, mcpEndpoint=$mcpEndpoint, additionalProperties=$additionalProperties}"
    }

    /** A dictionary of arguments to pass to the tool group. */
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

    /** The MCP endpoint to use for the tool group. */
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

        return /* spotless:off */ other is ToolgroupRegisterParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ToolgroupRegisterParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
